package module.ObservePattern;

import java.util.Observer;

/**
 * 主题对象
 */
public interface Subject {
    public void registerObserver(module.ObservePattern.Observer o);
    public void removeObserver(module.ObservePattern.Observer o);
    public void notifyObservers();
}
