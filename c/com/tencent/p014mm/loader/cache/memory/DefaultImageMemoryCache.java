package com.tencent.p014mm.loader.cache.memory;

import android.graphics.Bitmap;
import c70.C92359a;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MMTrimMemoryEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.ref.WeakReference;
import o90.C100301b;
import oa1.C117731d;
import p823sg.C101611g;
import q90.C101062d;
import s60.C101535a;
import x60.C102564a;

/* renamed from: com.tencent.mm.loader.cache.memory.DefaultImageMemoryCache */
public class DefaultImageMemoryCache extends C92699b<String, Bitmap> {

    /* renamed from: c */
    public static final int f266795c = 524288;

    /* renamed from: a */
    public C101611g<String, Bitmap> f266796a = C92698a.f266801a;

    /* renamed from: b */
    public C101611g<String, Bitmap> f266797b = C92698a.f266802b;

    /* renamed from: com.tencent.mm.loader.cache.memory.DefaultImageMemoryCache$MMTrimMemoryEventListener */
    public static class MMTrimMemoryEventListener extends IListener<MMTrimMemoryEvent> {

        /* renamed from: d */
        public final WeakReference<DefaultImageMemoryCache> f266798d;

        public MMTrimMemoryEventListener(DefaultImageMemoryCache defaultImageMemoryCache) {
            super(C40008f.f107254d);
            this.f266798d = new WeakReference<>(defaultImageMemoryCache);
            this.__eventId = 708811463;
        }

        public boolean callback(IEvent iEvent) {
            MMTrimMemoryEvent mMTrimMemoryEvent = (MMTrimMemoryEvent) iEvent;
            DefaultImageMemoryCache defaultImageMemoryCache = this.f266798d.get();
            if (defaultImageMemoryCache == null) {
                Log.m105924i("MicroMsg.Loader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: DefaultImageMemoryCache was gone");
                dead();
            } else if (C117731d.m166007c().mo182445g("clicfg_matrix_trim_memory_defaultimagememorycache_v2", true, false)) {
                Log.m105920e("MicroMsg.Loader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: DefaultImageMemoryCache");
                C101611g<String, Bitmap> gVar = defaultImageMemoryCache.f266796a;
                if (gVar != null) {
                    Log.m105921e("MicroMsg.Loader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: clear [defaultImageMemoryCache][%s]", Integer.valueOf(((C101062d) gVar).size()));
                    ((C101062d) defaultImageMemoryCache.f266796a).clear();
                }
            }
            return false;
        }
    }

    static {
        C100301b<Bitmap> bVar = C92698a.f266801a;
    }

    public DefaultImageMemoryCache() {
        C100301b<Bitmap> bVar = C92698a.f266801a;
        new MMTrimMemoryEventListener(this).alive();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w60.C65941g<android.graphics.Bitmap> mo126884a(x60.C102564a<java.lang.String> r2, s60.C101535a<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            T r0 = r2.f301995a
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x002d
            java.lang.String r2 = r1.mo126887b(r2, r3)
            sg.g<java.lang.String, android.graphics.Bitmap> r3 = r1.f266796a
            o90.b r3 = (o90.C100301b) r3
            java.lang.Object r3 = r3.get(r2)
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            if (r3 != 0) goto L_0x0025
            sg.g<java.lang.String, android.graphics.Bitmap> r3 = r1.f266797b
            o90.b r3 = (o90.C100301b) r3
            java.lang.Object r2 = r3.get(r2)
            r3 = r2
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
        L_0x0025:
            if (r3 == 0) goto L_0x002d
            w60.g r2 = new w60.g
            r2.<init>(r3)
            return r2
        L_0x002d:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.loader.cache.memory.DefaultImageMemoryCache.mo126884a(x60.a, s60.a):w60.g");
    }

    /* renamed from: c */
    public void mo126885c(C102564a aVar, C101535a aVar2, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (aVar != null) {
            if (Util.isNullOrNil((String) aVar.f301995a)) {
                Log.m105928w("MicroMsg.Loader.DefaultImageMemoryCacheListener", "[cpan] put failed. key is null.");
            } else if (bitmap == null) {
                Log.m105928w("MicroMsg.Loader.DefaultImageMemoryCacheListener", "[cpan] put failed.value is null.");
            } else {
                long a = C92359a.m116168a(bitmap);
                Log.m105919d("MicroMsg.Loader.DefaultImageMemoryCacheListener", "[cpan] put key:%s,bitmap size:%d B newsize:%s", aVar.f301995a, Long.valueOf(a), Util.getSizeKB(a));
                if (a > ((long) f266795c)) {
                    ((C100301b) this.f266797b).put(mo126887b(aVar, aVar2), bitmap);
                    return;
                }
                ((C100301b) this.f266796a).put(mo126887b(aVar, aVar2), bitmap);
            }
        }
    }

    /* renamed from: d */
    public void mo126886d(C102564a<String> aVar, C101535a<Bitmap> aVar2) {
        ((C100301b) this.f266796a).remove((String) aVar.f301995a);
        ((C100301b) this.f266797b).remove((String) aVar.f301995a);
    }
}
