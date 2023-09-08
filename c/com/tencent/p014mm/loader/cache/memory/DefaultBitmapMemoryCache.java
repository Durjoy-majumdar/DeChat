package com.tencent.p014mm.loader.cache.memory;

import android.graphics.Bitmap;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MMTrimMemoryEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import o90.C100301b;
import oa1.C117731d;
import s60.C101535a;
import w60.C65941g;
import x60.C102564a;

/* renamed from: com.tencent.mm.loader.cache.memory.DefaultBitmapMemoryCache */
public class DefaultBitmapMemoryCache<T> extends C92699b<T, Bitmap> {

    /* renamed from: a */
    public final C100301b<Bitmap> f266793a = new C100301b<>(50, DefaultBitmapMemoryCache.class);

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/loader/cache/memory/DefaultBitmapMemoryCache$MMTrimMemoryEventListener;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/MMTrimMemoryEvent;", "Ljava/lang/ref/WeakReference;", "Lcom/tencent/mm/loader/cache/memory/DefaultBitmapMemoryCache;", "weakTarget", "<init>", "(Ljava/lang/ref/WeakReference;)V", "libimageloader_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.loader.cache.memory.DefaultBitmapMemoryCache$MMTrimMemoryEventListener */
    public static final class MMTrimMemoryEventListener extends IListener<MMTrimMemoryEvent> {

        /* renamed from: d */
        public WeakReference<DefaultBitmapMemoryCache<?>> f266794d;

        public MMTrimMemoryEventListener(WeakReference<DefaultBitmapMemoryCache<?>> weakReference) {
            super(C40008f.f107254d);
            this.f266794d = weakReference;
        }

        public boolean callback(IEvent iEvent) {
            C87412m.m108594g((MMTrimMemoryEvent) iEvent, "event");
            WeakReference<DefaultBitmapMemoryCache<?>> weakReference = this.f266794d;
            DefaultBitmapMemoryCache defaultBitmapMemoryCache = weakReference != null ? weakReference.get() : null;
            if (defaultBitmapMemoryCache == null) {
                Log.m105924i("MicroMsg.Loader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: DefaultBitmapMemoryCache was gone");
                dead();
            } else if (C117731d.m166007c().mo182445g("clicfg_matrix_trim_memory_defaultbitmapmemorycache_v2", true, false)) {
                Log.m105920e("MicroMsg.Loader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: DefaultBitmapMemoryCache");
                Log.m105921e("MicroMsg.Loader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: clear [defaultImageMemoryCache][%s]", Integer.valueOf(defaultBitmapMemoryCache.f266793a.size()));
                defaultBitmapMemoryCache.f266793a.clear();
            }
            return false;
        }
    }

    public DefaultBitmapMemoryCache() {
        new MMTrimMemoryEventListener(new WeakReference(this)).alive();
    }

    /* renamed from: a */
    public C65941g<Bitmap> mo126884a(C102564a<T> aVar, C101535a<Bitmap> aVar2) {
        C87412m.m108594g(aVar, "url");
        Bitmap l = this.f266793a.get(mo126887b(aVar, aVar2));
        if (l != null) {
            return new C65941g<>(l);
        }
        return null;
    }

    /* renamed from: c */
    public void mo126885c(C102564a aVar, C101535a aVar2, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(bitmap, "value");
        this.f266793a.put(mo126887b(aVar, aVar2), bitmap);
    }

    /* renamed from: d */
    public void mo126886d(C102564a<T> aVar, C101535a<Bitmap> aVar2) {
        C87412m.m108594g(aVar, "url");
        this.f266793a.remove(mo126887b(aVar, aVar2));
    }
}
