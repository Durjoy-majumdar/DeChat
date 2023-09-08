package com.tencent.p014mm.plugin.gallery.model;

import android.os.SystemClock;
import com.tencent.p014mm.plugin.gallery.model.C93947c;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.gallery.model.g */
public class C93959g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C93947c.C93950c f271167d;

    /* renamed from: e */
    public final /* synthetic */ String f271168e;

    /* renamed from: f */
    public final /* synthetic */ C93963i f271169f;

    /* renamed from: com.tencent.mm.plugin.gallery.model.g$a */
    public class C93960a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f271170d;

        public C93960a(boolean z) {
            this.f271170d = z;
        }

        public void run() {
            C93947c.C93950c cVar = C93959g.this.f271167d;
            boolean z = this.f271170d;
            Log.m105919d("MicroMsg.CacheService", "do on post execute, filePath[%s], mDecodeTaskKey[%s], success[%s], cancel[%s].", cVar.f271129d, cVar.f271137o, Boolean.valueOf(z), Boolean.valueOf(cVar.f271138p));
            if (!cVar.f271138p) {
                C93947c.this.f271116d.remove(cVar.f271137o);
            }
            Log.m105919d("MicroMsg.CacheService", "remove job from waitingDecodeTask, after size:[%d].", Integer.valueOf(C93947c.this.f271116d.size()));
            C93947c cVar2 = C93947c.this;
            cVar2.f271114b++;
            cVar2.mo128879g();
            if (z) {
                C93947c.this.f271113a.mo128886d(cVar.f271129d, cVar.f271139q, cVar.f271133h, cVar.f271134i, cVar.f271138p, cVar.f271135j, cVar.f271136n);
                cVar.f271139q = null;
            }
        }
    }

    public C93959g(C93963i iVar, C93947c.C93950c cVar, String str) {
        this.f271169f = iVar;
        this.f271167d = cVar;
        this.f271168e = str;
    }

    public void run() {
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean doInBackground = this.f271167d.doInBackground();
        long currentThreadTimeMillis2 = SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis;
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        Log.m105919d("MicroMsg.GalleryHandlerThread", "background time: %s, %s, %s, %s.", this.f271168e, Long.valueOf(currentThreadTimeMillis2), Long.valueOf(uptimeMillis2), Float.valueOf((((float) currentThreadTimeMillis2) * 1.0f) / ((float) uptimeMillis2)));
        this.f271169f.mo128893a().post(new C93960a(doInBackground));
    }
}
