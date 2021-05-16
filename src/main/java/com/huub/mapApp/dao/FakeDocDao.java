package com.huub.mapApp.dao;

import com.huub.mapApp.model.Document;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("FakeDocDao")
public class FakeDocDao implements DataDao{
    private static transient List<Document> docs;

    public FakeDocDao(){
        this.docs = new ArrayList<>();
        docs.add(new Document("horses", "horses are hooved animals."));
        docs.add(new Document("cats", "cats are felines"));
    }

    @Override
    public Document getDoc(String name) {
        for(Document d: docs){
            if(d.getTitle().equals(name)){
                return d;
            }
        }

        return null;
    }

    @Override
    public List<Document> getAll() {
        return docs;
    }

    @Override
    public boolean addDoc(Document doc) {
        docs.add(doc);
        return true;
    }
}
