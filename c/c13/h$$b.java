package c13;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final /* synthetic */ class h$$b implements Runnable {
    public final void run() {
        long currentTimeMillis = System.currentTimeMillis();
        for (Map.Entry entry : ((ConcurrentHashMap) C113234h.f338835d).entrySet()) {
            if (currentTimeMillis - ((h$$c) entry.getValue()).f338837b > C113234h.f338834c) {
                ((ConcurrentHashMap) C113234h.f338835d).remove(entry.getKey());
            }
        }
    }
}
