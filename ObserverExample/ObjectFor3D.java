package com.zhy.pattern.observer;  
  
import java.util.ArrayList;  
import java.util.List;  
  
public class ObjectFor3D implements Subject  
{  
    private List<Observer> observers = new ArrayList<Observer>();  
    /** 
     * 3D��Ʊ�ĺ��� 
     */  
    private String msg;  
  
    @Override  
    public void registerObserver(Observer observer)  
    {  
        observers.add(observer);  
    }  
  
    @Override  
    public void removeObserver(Observer observer)  
    {  
        int index = observers.indexOf(observer);  
        if (index >= 0)  
        {  
            observers.remove(index);  
        }  
    }  
  
    @Override  
    public void notifyObservers()  
    {  
        for (Observer observer : observers)  
        {  
            observer.update(msg);  
        }  
    }  
  
    /** 
     * ���������Ϣ 
     *  
     * @param msg 
     */  
    public void setMsg(String msg)  
    {  
        this.msg = msg;  
          
        notifyObservers();  
    }  
  
}  