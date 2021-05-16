package com.huub.mapApp.service;

import com.huub.mapApp.dao.DataDao;
import com.huub.mapApp.model.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TextService {

    private transient final DataDao dataDao;

    @Autowired
    public TextService(@Qualifier("FakeDocDao") DataDao dataDao) {
        this.dataDao = dataDao;
    }

    public boolean addDoc(Document doc){
        return dataDao.addDoc(doc);
    }

    public List<Document> getAll(){
        return dataDao.getAll();
    }

    public Document getDoc(String title){
        return dataDao.getDoc(title);
    }
}
