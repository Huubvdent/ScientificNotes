package com.huub.mapApp.dao;

import com.huub.mapApp.model.Document;

import java.util.List;

public interface DataDao {
    public Document getDoc(String name);
    public List<Document> getAll();
    public boolean addDoc(Document doc);
}
