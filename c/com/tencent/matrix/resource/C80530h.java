package com.tencent.matrix.resource;

import android.app.Application;
import java.io.File;
import p1060we.C90970b;
import p1060we.C90971c;
import p723vf.C118672d;
import p723vf.C90778c;
import p937cf.C80018a;
import p955df.C86265d;
import p955df.C86266e;
import p987jf.C87954a;
import p987jf.C87958b;

/* renamed from: com.tencent.matrix.resource.h */
public class C80530h extends C90970b {

    /* renamed from: h */
    public final C80018a f235548h;

    /* renamed from: i */
    public C87954a f235549i = null;

    /* renamed from: com.tencent.matrix.resource.h$a */
    public class C80531a implements Runnable {
        public C80531a(C80530h hVar) {
        }

        public void run() {
            File[] listFiles;
            C86266e eVar = C86266e.f250872e;
            eVar.getClass();
            try {
                long currentTimeMillis = System.currentTimeMillis();
                if (eVar.mo120673a().exists() && eVar.mo120673a().isDirectory() && (listFiles = eVar.mo120673a().listFiles(new C86265d(eVar, currentTimeMillis))) != null) {
                    for (File file : listFiles) {
                        if (file.exists()) {
                            C118672d.m167353c("Matrix.HprofFileManager", "expired: " + file.getAbsolutePath(), new Object[0]);
                            file.delete();
                        }
                    }
                }
            } catch (Throwable th) {
                C118672d.m167354d("Matrix.HprofFileManager", th, "", new Object[0]);
            }
        }
    }

    public C80530h(C80018a aVar) {
        this.f235548h = aVar;
    }

    /* renamed from: a */
    public void mo112097a(boolean z) {
        C87954a aVar;
        C118672d.m167351a("Matrix.ResourcePlugin", "onForeground: %s", Boolean.valueOf(z));
        if ((this.f261039g == 2) && (aVar = this.f235549i) != null) {
            if (z) {
                C118672d.m167353c("Matrix.ActivityRefWatcher", "we are in foreground, modify scan time[%sms].", Long.valueOf(aVar.f254530k));
                C87958b bVar = aVar.f254527h;
                bVar.f254541a.removeCallbacksAndMessages((Object) null);
                bVar.f254542b.removeCallbacksAndMessages((Object) null);
                C87958b bVar2 = aVar.f254527h;
                bVar2.f254543c = aVar.f254530k;
                bVar2.mo122418a(aVar.f254536q, 0);
                return;
            }
            C118672d.m167353c("Matrix.ActivityRefWatcher", "we are in background, modify scan time[%sms].", Long.valueOf(aVar.f254529j));
            aVar.f254527h.f254543c = aVar.f254529j;
        }
    }

    /* renamed from: b */
    public String mo112098b() {
        return "memory";
    }

    /* renamed from: c */
    public void mo112099c(Application application, C90971c cVar) {
        super.mo112099c(application, cVar);
        this.f235549i = new C87954a(application, this);
    }

    /* renamed from: d */
    public void mo112100d() {
        super.mo112100d();
        if (!this.f261038f) {
            C118672d.m167352b("Matrix.ResourcePlugin", "ResourcePlugin start, ResourcePlugin is not supported, just return", new Object[0]);
            return;
        }
        C87954a aVar = this.f235549i;
        Application application = aVar.f254526g.f261037e;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(aVar.f254535p);
            C87958b bVar = aVar.f254527h;
            bVar.f254541a.removeCallbacksAndMessages((Object) null);
            bVar.f254542b.removeCallbacksAndMessages((Object) null);
            aVar.f254532m.clear();
        }
        Application application2 = aVar.f254526g.f261037e;
        if (application2 != null) {
            application2.registerActivityLifecycleCallbacks(aVar.f254535p);
            aVar.f254527h.mo122418a(aVar.f254536q, 0);
            C118672d.m167353c("Matrix.ActivityRefWatcher", "watcher is started.", new Object[0]);
        }
        C90778c.m113843a().post(new C80531a(this));
    }
}
