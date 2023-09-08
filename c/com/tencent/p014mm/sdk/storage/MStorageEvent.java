package com.tencent.p014mm.sdk.storage;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import mu3.C109639a;

/* renamed from: com.tencent.mm.sdk.storage.MStorageEvent */
public abstract class MStorageEvent<T, E> {
    private static final MMHandler sMainHandler = new MMHandler(Looper.getMainLooper());
    private final HashSet<E> events = new HashSet<>();
    private final Hashtable<T, Object> listeners = new Hashtable<>();
    private int locks = 0;

    private synchronized Vector<T> cloneAll() {
        Vector<T> vector;
        vector = new Vector<>();
        vector.addAll(this.listeners.keySet());
        return vector;
    }

    private void handleListeners() {
        ArrayList arrayList;
        Vector cloneAll = cloneAll();
        if (cloneAll.size() > 0 || needNotifyExtension()) {
            synchronized (this.events) {
                arrayList = new ArrayList(this.events);
                this.events.clear();
            }
            handleNotify(arrayList);
            HashMap hashMap = new HashMap();
            Iterator it = cloneAll.iterator();
            while (it.hasNext()) {
                final Object next = it.next();
                Object obj = this.listeners.get(next);
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    final Object next2 = it4.next();
                    if (!(next2 == null || obj == null)) {
                        if (obj instanceof EventHandler) {
                            EventHandler eventHandler = (EventHandler) obj;
                            C857661 r8 = new Runnable() {
                                public void run() {
                                    MStorageEvent.this.processEvent(next, next2);
                                }
                            };
                            C109639a aVar = eventHandler.serial;
                            if (aVar != null) {
                                MMHandler mMHandler = (MMHandler) hashMap.get(aVar);
                                if (mMHandler == null) {
                                    mMHandler = new MMHandler(eventHandler.serial);
                                    hashMap.put(eventHandler.serial, mMHandler);
                                }
                                mMHandler.post(r8);
                            } else {
                                Looper looper = eventHandler.looper;
                                if (looper != null) {
                                    MMHandler mMHandler2 = (MMHandler) hashMap.get(looper);
                                    if (mMHandler2 == null) {
                                        mMHandler2 = new MMHandler(eventHandler.looper);
                                        hashMap.put(eventHandler.looper, mMHandler2);
                                    }
                                    mMHandler2.post(r8);
                                } else {
                                    sMainHandler.post(r8);
                                }
                            }
                        } else {
                            processEvent(next, next2);
                        }
                    }
                }
            }
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                processEventForExtensionOnDemand(it5.next());
            }
            return;
        }
        this.events.clear();
    }

    public synchronized void add(T t, Looper looper) {
        if (!this.listeners.containsKey(t)) {
            if (looper != null) {
                this.listeners.put(t, new EventHandler(looper));
            } else {
                this.listeners.put(t, new Object());
            }
        }
    }

    public void doNotify() {
        if (!isLocked()) {
            handleListeners();
        }
    }

    public boolean event(E e) {
        boolean add;
        synchronized (this.events) {
            add = this.events.add(e);
        }
        return add;
    }

    public void handleNotify(List<E> list) {
    }

    public boolean isLocked() {
        return this.locks > 0;
    }

    public void lock() {
        this.locks++;
    }

    public int lockCount() {
        return this.locks;
    }

    public boolean needNotifyExtension() {
        return false;
    }

    public abstract void processEvent(T t, E e);

    public void processEventForExtensionOnDemand(E e) {
    }

    public synchronized void remove(T t) {
        this.listeners.remove(t);
    }

    public synchronized void removeAll() {
        this.listeners.clear();
    }

    public void unlock() {
        int i = this.locks - 1;
        this.locks = i;
        if (i <= 0) {
            this.locks = 0;
            handleListeners();
        }
    }

    /* renamed from: com.tencent.mm.sdk.storage.MStorageEvent$EventHandler */
    public static class EventHandler {
        public Looper looper;
        public C109639a serial;

        public EventHandler(C109639a aVar) {
            this.serial = aVar;
        }

        public EventHandler(Looper looper2) {
            this.looper = looper2;
        }

        public EventHandler() {
        }
    }

    public synchronized void add(T t, C109639a aVar) {
        if (!this.listeners.containsKey(t)) {
            if (aVar != null) {
                this.listeners.put(t, new EventHandler(aVar));
            } else {
                this.listeners.put(t, new Object());
            }
        }
    }
}
