package com.tencent.p014mm.sdk.storage.observer;

import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;

/* renamed from: com.tencent.mm.sdk.storage.observer.IStorageObserver */
public interface IStorageObserver<T extends IAutoDBItem> extends IMvvmObserver<StorageObserverEvent<T>> {
}
