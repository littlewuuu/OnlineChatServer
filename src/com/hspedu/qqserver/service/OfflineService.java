package com.hspedu.qqserver.service;

import com.hspedu.qqcommon.Message;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class OfflineService {
    public static void saveOfflineMessage(Message message){
        ConcurrentHashMap<String, ArrayList<Message>> offLineDb = QQServer.getOfflineDB();
        if(offLineDb.containsKey(message.getGetter())){
            offLineDb.get(message.getGetter()).add(message);
        } else {
            ArrayList<Message> messages = new ArrayList<>();
            messages.add(message);
            offLineDb.put(message.getGetter(), messages);
        }
    }

    public static ArrayList<Message> getOffLineMessages(String userId){
        ConcurrentHashMap<String, ArrayList<Message>> offLineDb = QQServer.getOfflineDB();
        if(offLineDb.containsKey(userId)){
            return offLineDb.get(userId);
        } else {
            return null;
        }
    }
}
