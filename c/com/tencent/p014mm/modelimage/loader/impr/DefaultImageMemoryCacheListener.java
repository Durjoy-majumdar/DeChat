package com.tencent.p014mm.modelimage.loader.impr;

import android.graphics.Bitmap;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MMTrimMemoryEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ic0.C21074o;
import java.lang.ref.WeakReference;
import java.util.Map;
import o90.C100301b;
import oa1.C117731d;
import p823sg.C101611g;
import q90.C101062d;

/* renamed from: com.tencent.mm.modelimage.loader.impr.DefaultImageMemoryCacheListener */
public class DefaultImageMemoryCacheListener implements C21074o {

    /* renamed from: a */
    public final C101611g<String, Bitmap> f267408a;

    /* renamed from: b */
    public final C101611g<String, Bitmap> f267409b;

    /* renamed from: com.tencent.mm.modelimage.loader.impr.DefaultImageMemoryCacheListener$MMTrimMemoryEventListener */
    public static class MMTrimMemoryEventListener extends IListener<MMTrimMemoryEvent> {

        /* renamed from: d */
        public final WeakReference<DefaultImageMemoryCacheListener> f267410d;

        public MMTrimMemoryEventListener(DefaultImageMemoryCacheListener defaultImageMemoryCacheListener) {
            super(C40008f.f107254d);
            this.f267410d = new WeakReference<>(defaultImageMemoryCacheListener);
            this.__eventId = 708811463;
        }

        public boolean callback(IEvent iEvent) {
            MMTrimMemoryEvent mMTrimMemoryEvent = (MMTrimMemoryEvent) iEvent;
            DefaultImageMemoryCacheListener defaultImageMemoryCacheListener = this.f267410d.get();
            if (defaultImageMemoryCacheListener == null) {
                Log.m105924i("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: DefaultImageMemoryCacheListener was gone");
                dead();
            } else if (C117731d.m166007c().mo182445g("clicfg_matrix_trim_memory_defaultimagememorycachelistener_v2", true, false)) {
                Log.m105920e("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: DefaultImageMemoryCacheListener");
                C101611g<String, Bitmap> gVar = defaultImageMemoryCacheListener.f267408a;
                if (gVar != null) {
                    Log.m105921e("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: clear [defaultImageMemoryCache][%s]", Integer.valueOf(((C101062d) gVar).size()));
                    ((C101062d) defaultImageMemoryCacheListener.f267408a).clear();
                }
                C101611g<String, Bitmap> gVar2 = defaultImageMemoryCacheListener.f267409b;
                if (gVar2 != null) {
                    Log.m105921e("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "received MMTrimMemoryEvent: clear [bigImageMemoryCache][%s]", Integer.valueOf(((C101062d) gVar2).size()));
                    ((C101062d) defaultImageMemoryCacheListener.f267409b).clear();
                }
            }
            return false;
        }
    }

    public DefaultImageMemoryCacheListener() {
        Class<DefaultImageMemoryCacheListener> cls = DefaultImageMemoryCacheListener.class;
        this.f267408a = new C100301b(50, cls);
        this.f267409b = new C100301b(10, cls);
        new MMTrimMemoryEventListener(this).alive();
    }

    /* renamed from: a */
    public void mo32795a(String str, Bitmap bitmap) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "[cpan] put failed. key is null.");
        } else if (bitmap == null) {
            Log.m105928w("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "[cpan] put failed.value is null.");
        } else {
            long byteCount = (long) bitmap.getByteCount();
            Log.m105919d("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "[cpan] put key:%s,bitmap size:%d B newsize:%s", str, Long.valueOf(byteCount), Util.getSizeKB(byteCount));
            if (byteCount > 524288) {
                ((C100301b) this.f267409b).put(str, bitmap);
            } else {
                ((C100301b) this.f267408a).put(str, bitmap);
            }
        }
    }

    public void clear() {
        synchronized (this) {
            C101611g<String, Bitmap> gVar = this.f267408a;
            if (gVar != null) {
                Map snapshot = ((C100301b) gVar).snapshot();
                if (!snapshot.isEmpty() && snapshot.size() > 0) {
                    for (Map.Entry value : snapshot.entrySet()) {
                        Bitmap bitmap = (Bitmap) value.getValue();
                        if (bitmap != null && !bitmap.isRecycled()) {
                            Log.m105925i("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "recycle bitmap:%s, not need", bitmap.toString());
                        }
                    }
                }
                ((C101062d) this.f267408a).clear();
            }
            C101611g<String, Bitmap> gVar2 = this.f267409b;
            if (gVar2 != null) {
                Map snapshot2 = ((C100301b) gVar2).snapshot();
                if (!snapshot2.isEmpty() && snapshot2.size() > 0) {
                    for (Map.Entry value2 : snapshot2.entrySet()) {
                        Bitmap bitmap2 = (Bitmap) value2.getValue();
                        if (bitmap2 != null && !bitmap2.isRecycled()) {
                            Log.m105925i("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "recycle bitmap:%s. not need", bitmap2.toString());
                        }
                    }
                }
                ((C101062d) this.f267409b).clear();
            }
        }
    }

    public Bitmap get(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        return (Bitmap) ((C100301b) (((C100301b) this.f267408a).get(str) == null ? this.f267409b : this.f267408a)).get(str);
    }

    public void remove(String str) {
        ((C100301b) this.f267408a).remove(str);
        ((C100301b) this.f267409b).remove(str);
    }
}
