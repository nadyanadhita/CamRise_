 

import java.util.*;
public class CamRise implements Subject {
    private ArrayList<Observer> observers;
    private String fingerprint;
   

    public CamRise() {
        observers = new ArrayList<Observer>();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(fingerprint);
        }
    }

    public void fingerprintChanged() {
        notifyObservers();
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        fingerprintChanged();
    }

    public String getFingerprint() {
        return fingerprint;
    }

}
