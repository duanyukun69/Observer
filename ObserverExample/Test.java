package com.zhy.pattern.observer.test;  
  
import com.zhy.pattern.observer.ObjectFor3D;  
import com.zhy.pattern.observer.Observer;  
import com.zhy.pattern.observer.Observer1;  
import com.zhy.pattern.observer.Observer2;  
import com.zhy.pattern.observer.Subject;  
  
public class Test  
{  
    public static void main(String[] args)  
    {  
        //ģ��һ��3D�ķ����  
        ObjectFor3D subjectFor3d = new ObjectFor3D();  
        //�ͻ�1  
        Observer observer1 = new Observer1(subjectFor3d);  
        Observer observer2 = new Observer2(subjectFor3d);  
  
        subjectFor3d.setMsg("20140420��3D�����ǣ�127" );  
        subjectFor3d.setMsg("20140421��3D�����ǣ�333" );  
          
    }  
}  