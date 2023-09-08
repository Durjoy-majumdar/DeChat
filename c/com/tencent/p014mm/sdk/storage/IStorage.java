package com.tencent.p014mm.sdk.storage;

import android.os.Looper;
import com.tencent.p014mm.sdk.storage.MStorage;
import mu3.C109639a;

/* renamed from: com.tencent.mm.sdk.storage.IStorage */
public interface IStorage {
    void add(MStorage.IOnStorageChange iOnStorageChange);

    void add(MStorage.IOnStorageChange iOnStorageChange, Looper looper);

    void add(String str, MStorage.IOnStorageChange iOnStorageChange);

    void add(C109639a aVar, MStorage.IOnStorageChange iOnStorageChange);

    void addLoadedListener(MStorage.IOnStorageLoaded iOnStorageLoaded);

    void doNotify();

    void doNotify(String str);

    void doNotify(String str, int i, Object obj);

    void lock();

    int lockCount();

    void remove(MStorage.IOnStorageChange iOnStorageChange);

    void removeLoadedListener(MStorage.IOnStorageLoaded iOnStorageLoaded);

    void unlock();
}
