package com.tencent.p014mm.sdk.storage;

import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39622i0;
import com.tencent.p014mm.sdk.observer.IMvvmObserverOwner;
import com.tencent.p014mm.sdk.p134kt.CommonKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.observer.IStorageObserver;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverOwner;
import gy3.C24560g0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0016\u0018\u0000 +*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0004:\u0001+B\u0007¢\u0006\u0004\b)\u0010*J\u0010\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007H\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0014J\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016J&\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016J\u001e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016J\u0016\u0010\u0012\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0016\u0010\u0016\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J\u001c\u0010\u0016\u001a\u00020\r2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0017H\u0016J\u0010\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0019H\u0016J\u0011\u0010\u001b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u000fH\u0016J\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u001eH\u0016R!\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078DX\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006,"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/ObservableStorage;", "Lcom/tencent/mm/sdk/storage/IAutoDBItem;", "T", "Landroidx/lifecycle/i0;", "Lcom/tencent/mm/sdk/observer/IMvvmObserverOwner;", "Lcom/tencent/mm/sdk/storage/observer/IStorageObserver;", "Lcom/tencent/mm/sdk/storage/observer/StorageObserverEvent;", "Lcom/tencent/mm/sdk/storage/observer/StorageObserverOwner;", "findOwner", "createObserverOwner", "Landroidx/lifecycle/s;", "lifecycleOwner", "observer", "Lrx3/b0;", "observe", "", "threadTag", "uiObserve", "removeObserver", "", "hasObserver", "event", "notify", "", "eventList", "Ljava/lang/Class;", "getAttachClazz", "getAttachClazzObj", "()Lcom/tencent/mm/sdk/storage/IAutoDBItem;", "getLogTag", "", "notifyAny", "owner$delegate", "Lrx3/g;", "getOwner", "()Lcom/tencent/mm/sdk/storage/observer/StorageObserverOwner;", "owner", "attachClazz", "Ljava/lang/Class;", "attachClazzObj", "Lcom/tencent/mm/sdk/storage/IAutoDBItem;", "<init>", "()V", "Companion", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.storage.ObservableStorage */
public class ObservableStorage<T extends IAutoDBItem> extends C39622i0 implements IMvvmObserverOwner<IStorageObserver<T>, StorageObserverEvent<T>> {
    public static final Companion Companion = new Companion((C8480h) null);
    public static final String TAG = "MicroMsg.Mvvm.ObservableStorage";
    private Class<T> attachClazz;
    private T attachClazzObj;
    private final C13601g owner$delegate = C36568h.m40985a(new ObservableStorage$owner$2(this));

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/ObservableStorage$Companion;", "", "()V", "TAG", "", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.ObservableStorage$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    private final StorageObserverOwner<T> findOwner() {
        IAutoDBItem attachClazzObj2 = getAttachClazzObj();
        StorageObserverOwner<? extends IAutoDBItem> observerOwner = attachClazzObj2 != null ? attachClazzObj2.getObserverOwner() : null;
        if (observerOwner instanceof StorageObserverOwner) {
            return observerOwner;
        }
        return null;
    }

    public StorageObserverOwner<T> createObserverOwner() {
        StorageObserverOwner<T> findOwner = findOwner();
        if (findOwner != null) {
            return findOwner;
        }
        Log.m105924i(getLogTag(), "create new storage observer owner");
        return new StorageObserverOwner<>();
    }

    public Class<T> getAttachClazz() {
        if (this.attachClazz == null) {
            long currentTimeMillis = System.currentTimeMillis();
            Class<?> parameterizedTypeClass = CommonKt.getParameterizedTypeClass(C24560g0.m30725a(getClass()));
            if (!(parameterizedTypeClass instanceof Class)) {
                parameterizedTypeClass = null;
            }
            this.attachClazz = parameterizedTypeClass;
            String logTag = getLogTag();
            Log.m105924i(logTag, "getAttachClazz cost: " + (System.currentTimeMillis() - currentTimeMillis));
        }
        return this.attachClazz;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r0.getDeclaredConstructor(new java.lang.Class[0]);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T getAttachClazzObj() {
        /*
            r3 = this;
            T r0 = r3.attachClazzObj
            if (r0 != 0) goto L_0x001f
            java.lang.Class r0 = r3.getAttachClazz()
            if (r0 == 0) goto L_0x001c
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)
            if (r0 == 0) goto L_0x001c
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r0 = r0.newInstance(r1)
            com.tencent.mm.sdk.storage.IAutoDBItem r0 = (com.tencent.p014mm.sdk.storage.IAutoDBItem) r0
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r3.attachClazzObj = r0
        L_0x001f:
            T r0 = r3.attachClazzObj
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.storage.ObservableStorage.getAttachClazzObj():com.tencent.mm.sdk.storage.IAutoDBItem");
    }

    public String getLogTag() {
        return TAG;
    }

    public final StorageObserverOwner<T> getOwner() {
        return (StorageObserverOwner) this.owner$delegate.getValue();
    }

    public boolean hasObserver() {
        return getOwner().hasObserver();
    }

    public void notifyAny(Object obj) {
        C87412m.m108594g(obj, "event");
        StorageObserverEvent storageObserverEvent = obj instanceof StorageObserverEvent ? (StorageObserverEvent) obj : null;
        if (storageObserverEvent != null) {
            getOwner().notify(storageObserverEvent);
        }
    }

    public void notify(StorageObserverEvent<T> storageObserverEvent) {
        C87412m.m108594g(storageObserverEvent, "event");
        getOwner().notify(storageObserverEvent);
    }

    public void removeObserver(IStorageObserver<T> iStorageObserver) {
        C87412m.m108594g(iStorageObserver, "observer");
        getOwner().removeObserver(iStorageObserver);
    }

    public void uiObserve(C0125s sVar, IStorageObserver<T> iStorageObserver) {
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(iStorageObserver, "observer");
        getOwner().uiObserve(sVar, iStorageObserver);
    }

    public void notify(List<? extends StorageObserverEvent<T>> list) {
        C87412m.m108594g(list, "eventList");
        getOwner().notify(list);
    }

    public void observe(C0125s sVar, IStorageObserver<T> iStorageObserver) {
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(iStorageObserver, "observer");
        getOwner().observe(sVar, iStorageObserver);
    }

    public void observe(C0125s sVar, String str, IStorageObserver<T> iStorageObserver) {
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(str, "threadTag");
        C87412m.m108594g(iStorageObserver, "observer");
        getOwner().observe(sVar, iStorageObserver);
    }
}
