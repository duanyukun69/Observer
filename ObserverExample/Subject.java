package com.zhy.pattern.observer;  
  
/** 
 * ����ӿڣ����е��������ʵ�ִ˽ӿ� 
 *  
 * @author zhy 
 *  
 */  
public interface Subject  
{  
    /** 
     * ע��һ���۲��� 
     *  
     * @param observer 
     */  
    public void registerObserver(Observer observer);  
  
    /** 
     * �Ƴ�һ���۲��� 
     *  
     * @param observer 
     */  
    public void removeObserver(Observer observer);  
  
    /** 
     * ֪ͨ���еĹ۲��� 
     */  
    public void notifyObservers();  
  
}  

/** 
 * @author zhy ���еĹ۲�����Ҫʵ�ִ˽ӿ� 
 */  
public interface Observer  
{  
    public void update(String msg);  
  
}  