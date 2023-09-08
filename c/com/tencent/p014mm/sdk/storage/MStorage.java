package com.tencent.p014mm.sdk.storage;

import android.os.Looper;
import mu3.C109639a;

/* renamed from: com.tencent.mm.sdk.storage.MStorage */
public abstract class MStorage implements IStorage {
    private final MStorageEvent<IOnStorageChange, MStorageEventData> defaults = new MStorageEvent<IOnStorageChange, MStorageEventData>() {
        public void processEvent(IOnStorageChange iOnStorageChange, MStorageEventData mStorageEventData) {
            MStorage.this.processEvent(iOnStorageChange, mStorageEventData);
        }
    };
    private final MStorageEvent<IOnStorageLoaded, String> loadedListener = new MStorageEvent<IOnStorageLoaded, String>() {
        public void processEvent(IOnStorageLoaded iOnStorageLoaded, String str) {
            MStorage.this.processLoaded(iOnStorageLoaded, str);
        }
    };

    /* renamed from: com.tencent.mm.sdk.storage.MStorage$IOnStorageChange */
    public interface IOnStorageChange {
        void onNotifyChange(String str, MStorageEventData mStorageEventData);
    }

    /* renamed from: com.tencent.mm.sdk.storage.MStorage$IOnStorageLoaded */
    public interface IOnStorageLoaded {
        void onNotifyLoaded();
    }

    /* access modifiers changed from: private */
    public void processEvent(IOnStorageChange iOnStorageChange, MStorageEventData mStorageEventData) {
        iOnStorageChange.onNotifyChange(mStorageEventData.event, mStorageEventData);
    }

    /* access modifiers changed from: private */
    public void processLoaded(IOnStorageLoaded iOnStorageLoaded, String str) {
        iOnStorageLoaded.onNotifyLoaded();
    }

    public void add(IOnStorageChange iOnStorageChange) {
        this.defaults.add(iOnStorageChange, Looper.getMainLooper());
    }

    public void addLoadedListener(IOnStorageLoaded iOnStorageLoaded) {
        this.loadedListener.add(iOnStorageLoaded, Looper.getMainLooper());
    }

    public void doNotify() {
        MStorageEventData mStorageEventData = new MStorageEventData("*");
        this.defaults.event(mStorageEventData);
        this.defaults.doNotify();
        extraStepsAfterNotifying(mStorageEventData);
    }

    public void extraStepsAfterNotifying(MStorageEventData mStorageEventData) {
    }

    public void lock() {
        this.defaults.lock();
    }

    public int lockCount() {
        return this.defaults.lockCount();
    }

    public void remove(IOnStorageChange iOnStorageChange) {
        this.defaults.remove(iOnStorageChange);
    }

    public void removeLoadedListener(IOnStorageLoaded iOnStorageLoaded) {
        this.loadedListener.remove(iOnStorageLoaded);
    }

    public void unlock() {
        this.defaults.unlock();
    }

    public void add(IOnStorageChange iOnStorageChange, Looper looper) {
        this.defaults.add(iOnStorageChange, looper);
    }

    public void add(C109639a aVar, IOnStorageChange iOnStorageChange) {
        this.defaults.add(iOnStorageChange, aVar);
    }

    public void add(String str, IOnStorageChange iOnStorageChange) {
        this.defaults.add(iOnStorageChange, C109639a.m148950a(str));
    }

    public void doNotify(String str) {
        MStorageEventData mStorageEventData = new MStorageEventData(str);
        this.defaults.event(mStorageEventData);
        this.defaults.doNotify();
        extraStepsAfterNotifying(mStorageEventData);
    }

    public void doNotify(String str, int i, Object obj) {
        MStorageEventData mStorageEventData = new MStorageEventData();
        mStorageEventData.event = str;
        mStorageEventData.eventId = i;
        mStorageEventData.obj = obj;
        mStorageEventData.stg = this;
        this.defaults.event(mStorageEventData);
        this.defaults.doNotify();
        extraStepsAfterNotifying(mStorageEventData);
    }
}
