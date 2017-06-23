# 开源代码链接
https://github.com/youlookwhat/DesignPattern/tree/master/app/src/main/java/com/example/jingbin/designpattern/observer
# 代码任务
模拟微信3D彩票服务号和订阅者
# 开发者介绍
http://jingbin.me/about/<br>
Jingbin，湖北人，现坐标北京朝阳，Android开发工程师，爱电影，爱学习，爱技术，爱生活，爱开源。
# 开源项目
CloudReader：Netease cloud music Ui && Retrofit + RxJava + MVVM-databinding && GankIo、Douban Api.<br>
WebViewStudy：About WebView，JS、progress、sms、call、email、upload picture、textsize setting、Video full-screen playback.
# 模块
主题接口，观察者接口，3D服务号实现类，模拟使用者
# 模块关系
![微信服务号](https://github.com/duanyukun69/Observer/raw/master/images/1.jpg)<br>
![观察者模式](https://github.com/duanyukun69/Observer/raw/master/images/2.jpg)
# 符合观察者模式的代码
## 专题接口：Subject.java
```Java
	/**
   * 注册一个观察者
   */
  public void registerObserver(Observer observer);

  /**
   * 移除一个观察者
   */
  public void removeObserver(Observer observer);

  /**
   * 通知所有观察者
   */
  public void notifyObservers();
```
## 3D服务号的实现类：ObjectFor3D.java
```Java
 @Override
public void registerObserver(Observer observer) {
    observers.add(observer);
}
@Override
public void removeObserver(Observer observer) {
    int index = observers.indexOf(observer);
    if (index >= 0) {
        observers.remove(index);
    }
}
@Override
public void notifyObservers() {
    for (Observer observer : observers) {
        observer.update(msg);
    }
}
/**
 * 主题更新信息
 */
public void setMsg(String msg) {
    this.msg = msg;
    notifyObservers();
}
所有观察者需要实现此接口:Observer.java

public ObserverUser1(Subject subject) {
       subject.registerObserver(this);
   }
   @Override
   public void update(String msg) {
       Log.e("-----ObserverUser1 ", "得到 3D 号码:" + msg + ", 我要记下来。 ");
   }
```
## 最后测试：ObserverActivity.java
```Java
 // 创建服务号
 objectFor3D = new ObjectFor3D();
 // 创建两个订阅者
 observerUser1 = new ObserverUser1(objectFor3D);
 observerUser2 = new ObserverUser2(objectFor3D);
 // 两个观察者,发送两条信息
 objectFor3D.setMsg("201610121 的3D号为:127");
 objectFor3D.setMsg("20161022 的3D号为:000");
```
