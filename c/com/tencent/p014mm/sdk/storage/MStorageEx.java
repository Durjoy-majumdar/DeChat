package com.tencent.p014mm.sdk.storage;

import android.os.Looper;
import mu3.C109639a;

/* renamed from: com.tencent.mm.sdk.storage.MStorageEx */
public abstract class MStorageEx implements IStorageEx {
    public static final int EVENT_CREATE = 1;
    public static final int EVENT_DELETE = 5;
    public static final int EVENT_DROP = 6;
    public static final int EVENT_INSERT = 2;
    public static final int EVENT_QUERY = 7;
    public static final int EVENT_REPLACE = 4;
    public static final int EVENT_UPDATE = 3;
    public static final int EVENT_UPDATE_WITHOUT_DELAY = 8;
    private final MStorageEvent<IOnStorageChange, Event> defaults = new MStorageEvent<IOnStorageChange, Event>() {
        public boolean needNotifyExtension() {
            return MStorageEx.this.needNotifyExtension();
        }

        public void processEvent(IOnStorageChange iOnStorageChange, Event event) {
            if (MStorageEx.this.shouldProcessEvent()) {
                MStorageEx.this.processEvent(iOnStorageChange, event);
            }
        }

        public void processEventForExtensionOnDemand(Event event) {
            MStorageEx.this.processEventForExtensionOnDemand(event);
        }
    };

    /* renamed from: com.tencent.mm.sdk.storage.MStorageEx$Event */
    public class Event {
        public int event;
        public Object extraObj;
        public MStorageEx mstorage;
        public Object obj;

        public Event(int i, MStorageEx mStorageEx, Object obj2, Object obj3) {
            this.event = i;
            this.obj = obj2;
            this.mstorage = mStorageEx;
            this.extraObj = obj3;
        }
    }

    /* renamed from: com.tencent.mm.sdk.storage.MStorageEx$IOnStorageChange */
    public interface IOnStorageChange {
        void onNotifyChange(int i, MStorageEx mStorageEx, Object obj);
    }

    /* access modifiers changed from: private */
    public void processEvent(IOnStorageChange iOnStorageChange, Event event) {
        iOnStorageChange.onNotifyChange(event.event, event.mstorage, event.obj);
    }

    public void add(IOnStorageChange iOnStorageChange) {
        if (iOnStorageChange != null) {
            this.defaults.add(iOnStorageChange, Looper.getMainLooper());
        }
    }

    public void doNotify(int i, MStorageEx mStorageEx, Object obj) {
        this.defaults.event(new Event(i, mStorageEx, obj, (Object) null));
        this.defaults.doNotify();
    }

    public boolean needNotifyExtension() {
        return false;
    }

    public void processEventForExtensionOnDemand(Event event) {
    }

    public void remove(IOnStorageChange iOnStorageChange) {
        if (iOnStorageChange != null) {
            this.defaults.remove(iOnStorageChange);
        }
    }

    public abstract boolean shouldProcessEvent();

    public void add(IOnStorageChange iOnStorageChange, Looper looper) {
        if (iOnStorageChange != null) {
            this.defaults.add(iOnStorageChange, looper);
        }
    }

    public void add(IOnStorageChange iOnStorageChange, C109639a aVar) {
        if (iOnStorageChange != null) {
            this.defaults.add(iOnStorageChange, aVar);
        }
    }

    public void doNotify(int i, MStorageEx mStorageEx, Object obj, Object obj2) {
        this.defaults.event(new Event(i, mStorageEx, obj, obj2));
        this.defaults.doNotify();
    }

    public void doNotify(Event event) {
        this.defaults.event(event);
        this.defaults.doNotify();
    }
}
