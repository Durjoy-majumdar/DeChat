package com.tencent.p014mm.sdk.storage.mvvm;

import android.content.ContentValues;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import gy3.C87412m;
import kotlin.Metadata;
import ny3.C25235d;
import p823sg.C101614i;
import rx3.C13601g;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u001c\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J'\u0010\r\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\b\u0010\u001a\u001a\u00020\u0005H&J\b\u0010\u001b\u001a\u00020\u0016H&R'\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00048FX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/mvvm/MvvmLRUCacheStorage;", "Lcom/tencent/mm/sdk/storage/IAutoDBItem;", "T", "Lcom/tencent/mm/sdk/storage/mvvm/MvvmStorage;", "Lsg/i;", "", "cacheMap", "Lrx3/b0;", "initCacheMap", "Landroid/content/ContentValues;", "cv", "Lny3/d;", "clazz", "get", "(Landroid/content/ContentValues;Lny3/d;)Lcom/tencent/mm/sdk/storage/IAutoDBItem;", "item", "", "isNotify", "needLog", "noCatch", "insert", "(Lcom/tencent/mm/sdk/storage/IAutoDBItem;ZZZ)Z", "", "update", "(Lcom/tencent/mm/sdk/storage/IAutoDBItem;ZZ)I", "delete", "getCacheKeyField", "getInitMapSize", "cacheMap$delegate", "Lrx3/g;", "getCacheMap", "()Lsg/i;", "Lcom/tencent/mm/sdk/storage/mvvm/IMvvmDBProvider;", "dbProvider", "<init>", "(Lcom/tencent/mm/sdk/storage/mvvm/IMvvmDBProvider;)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.storage.mvvm.MvvmLRUCacheStorage */
public abstract class MvvmLRUCacheStorage<T extends IAutoDBItem> extends MvvmStorage<T> {
    private final C13601g cacheMap$delegate = C36568h.m40985a(new MvvmLRUCacheStorage$cacheMap$2(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MvvmLRUCacheStorage(IMvvmDBProvider iMvvmDBProvider) {
        super(iMvvmDBProvider);
        C87412m.m108594g(iMvvmDBProvider, "dbProvider");
    }

    public int delete(T t, boolean z, boolean z2) {
        Object obj;
        String obj2;
        C87412m.m108594g(t, "item");
        int delete = super.delete(t, z, z2);
        if (!(delete <= 0 || (obj = t.convertTo().get(getCacheKeyField())) == null || (obj2 = obj.toString()) == null)) {
            if (!(obj2.length() > 0)) {
                obj2 = null;
            }
            if (obj2 != null) {
                IAutoDBItem iAutoDBItem = (IAutoDBItem) getCacheMap().remove(obj2);
            }
        }
        return delete;
    }

    public T get(ContentValues contentValues, C25235d<T> dVar) {
        String obj;
        String obj2;
        T t;
        C87412m.m108594g(contentValues, "cv");
        C87412m.m108594g(dVar, "clazz");
        Object obj3 = contentValues.get(getCacheKeyField());
        if (obj3 != null && (obj2 = obj3.toString()) != null && (t = (IAutoDBItem) getCacheMap().get(obj2)) != null) {
            return t;
        }
        T t2 = super.get(contentValues, dVar);
        String str = null;
        if (t2 == null) {
            return null;
        }
        Object obj4 = t2.convertTo().get(getCacheKeyField());
        if (obj4 == null || (obj = obj4.toString()) == null) {
            return t2;
        }
        if (obj.length() > 0) {
            str = obj;
        }
        if (str == null) {
            return t2;
        }
        getCacheMap().put(str, t2);
        return t2;
    }

    public abstract String getCacheKeyField();

    public final C101614i<String, T> getCacheMap() {
        return (C101614i) this.cacheMap$delegate.getValue();
    }

    public abstract int getInitMapSize();

    public void initCacheMap(C101614i<String, T> iVar) {
        C87412m.m108594g(iVar, "cacheMap");
    }

    public boolean insert(T t, boolean z, boolean z2, boolean z3) {
        Object obj;
        String obj2;
        C87412m.m108594g(t, "item");
        boolean insert = super.insert(t, z, z2, z3);
        if (!(!insert || (obj = t.convertTo().get(getCacheKeyField())) == null || (obj2 = obj.toString()) == null)) {
            if (!(obj2.length() > 0)) {
                obj2 = null;
            }
            if (obj2 != null) {
                IAutoDBItem iAutoDBItem = (IAutoDBItem) getCacheMap().put(obj2, t);
            }
        }
        return insert;
    }

    public int update(T t, boolean z, boolean z2) {
        Object obj;
        String obj2;
        C87412m.m108594g(t, "item");
        int update = super.update(t, z, z2);
        if (!(update <= 0 || (obj = t.convertTo().get(getCacheKeyField())) == null || (obj2 = obj.toString()) == null)) {
            if (!(obj2.length() > 0)) {
                obj2 = null;
            }
            if (obj2 != null) {
                IAutoDBItem iAutoDBItem = (IAutoDBItem) getCacheMap().put(obj2, t);
            }
        }
        return update;
    }
}
