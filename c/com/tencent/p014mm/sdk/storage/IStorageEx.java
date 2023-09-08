package com.tencent.p014mm.sdk.storage;

import android.os.Looper;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import mu3.C109639a;

/* renamed from: com.tencent.mm.sdk.storage.IStorageEx */
public interface IStorageEx {
    void add(MStorageEx.IOnStorageChange iOnStorageChange);

    void add(MStorageEx.IOnStorageChange iOnStorageChange, Looper looper);

    void add(MStorageEx.IOnStorageChange iOnStorageChange, C109639a aVar);

    void doNotify(int i, MStorageEx mStorageEx, Object obj);

    void remove(MStorageEx.IOnStorageChange iOnStorageChange);
}
