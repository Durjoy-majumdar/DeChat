package com.tencent.p014mm.loader.cache.memory;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MMTrimMemoryEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import oa1.C117731d;
import p823sg.C101611g;
import q90.C101062d;
import s60.C101535a;
import w60.C102354f;
import w60.C65941g;
import x60.C102564a;

/* renamed from: com.tencent.mm.loader.cache.memory.DefaultMemoryCache */
public final class DefaultMemoryCache<T, R> extends C92699b<T, R> {

    /* renamed from: a */
    public final C102354f<String, R> f266799a = new C102354f<>(50);

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/loader/cache/memory/DefaultMemoryCache$MMTrimMemoryEventListener;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/MMTrimMemoryEvent;", "Ljava/lang/ref/WeakReference;", "Lcom/tencent/mm/loader/cache/memory/DefaultMemoryCache;", "weakTarget", "<init>", "(Ljava/lang/ref/WeakReference;)V", "libimageloader_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.loader.cache.memory.DefaultMemoryCache$MMTrimMemoryEventListener */
    public static final class MMTrimMemoryEventListener extends IListener<MMTrimMemoryEvent> {

        /* renamed from: d */
        public WeakReference<DefaultMemoryCache<?, ?>> f266800d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MMTrimMemoryEventListener(WeakReference<DefaultMemoryCache<?, ?>> weakReference) {
            super(C40008f.f107254d);
            C87412m.m108594g(weakReference, "weakTarget");
            this.f266800d = weakReference;
        }

        public boolean callback(IEvent iEvent) {
            int size;
            C87412m.m108594g((MMTrimMemoryEvent) iEvent, "event");
            DefaultMemoryCache defaultMemoryCache = this.f266800d.get();
            if (defaultMemoryCache == null) {
                Log.m105924i("MicroMsg.Loader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: DefaultMemoryCache was gone");
                dead();
            } else if (C117731d.m166007c().mo182445g("clicfg_matrix_trim_memory_defaultmemorycache_v2", true, false)) {
                Log.m105920e("MicroMsg.Loader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: DefaultMemoryCache");
                Object[] objArr = new Object[1];
                C102354f<String, R> fVar = defaultMemoryCache.f266799a;
                synchronized (fVar) {
                    C101611g<K, V> gVar = fVar.f301454a;
                    if (gVar != null) {
                        size = ((C101062d) gVar).size();
                    } else {
                        throw new NullPointerException("mData == null");
                    }
                }
                objArr[0] = Integer.valueOf(size);
                Log.m105921e("MicroMsg.Loader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: clear [defaultImageMemoryCache][%s]", objArr);
                C101611g<K, V> gVar2 = defaultMemoryCache.f266799a.f301454a;
                if (gVar2 != null) {
                    ((C101062d) gVar2).trimToSize(-1);
                } else {
                    throw new NullPointerException("mData == null");
                }
            }
            return false;
        }
    }

    public DefaultMemoryCache() {
        new MMTrimMemoryEventListener(new WeakReference(this)).alive();
    }

    /* renamed from: a */
    public C65941g<R> mo126884a(C102564a<T> aVar, C101535a<R> aVar2) {
        C87412m.m108594g(aVar, "url");
        String b = mo126887b(aVar, aVar2);
        C101611g<K, V> gVar = this.f266799a.f301454a;
        if (gVar != null) {
            Object obj = ((C101062d) gVar).get(b);
            if (obj != null) {
                return new C65941g<>(obj);
            }
            return null;
        }
        throw new NullPointerException("mData == null");
    }

    /* renamed from: c */
    public void mo126885c(C102564a<T> aVar, C101535a<R> aVar2, R r) {
        C87412m.m108594g(aVar, "url");
        this.f266799a.mo141921a(mo126887b(aVar, aVar2), r);
    }

    /* renamed from: d */
    public void mo126886d(C102564a<T> aVar, C101535a<R> aVar2) {
        C87412m.m108594g(aVar, "url");
        C102354f<String, R> fVar = this.f266799a;
        String b = mo126887b(aVar, aVar2);
        C101611g<K, V> gVar = fVar.f301454a;
        if (gVar != null) {
            ((C101062d) gVar).remove(b);
            return;
        }
        throw new NullPointerException("mData == null");
    }
}
