package com.tencent.p014mm.sdk.storage.mvvm;

import fy3.C32224a;
import gy3.C87413o;
import kotlin.Metadata;
import p823sg.C101614i;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/IAutoDBItem;", "T", "Lsg/i;", "", "invoke", "()Lsg/i;", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.storage.mvvm.MvvmLRUCacheStorage$cacheMap$2 */
public final class MvvmLRUCacheStorage$cacheMap$2 extends C87413o implements C32224a<C101614i<String, T>> {
    public final /* synthetic */ MvvmLRUCacheStorage<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MvvmLRUCacheStorage$cacheMap$2(MvvmLRUCacheStorage<T> mvvmLRUCacheStorage) {
        super(0);
        this.this$0 = mvvmLRUCacheStorage;
    }

    public final C101614i<String, T> invoke() {
        C101614i<String, T> iVar = new C101614i<>(this.this$0.getInitMapSize());
        this.this$0.initCacheMap(iVar);
        return iVar;
    }
}
