package p1034se;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.openglleak.detector.OpenglIndexDetectorService;
import com.tencent.matrix.openglleak.hook.OpenGLHook;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import p1053ve.C90767a;
import p1053ve.C90770d;
import p1060we.C90970b;
import p1060we.C90971c;
import p723vf.C118672d;

/* renamed from: se.a */
public class C90173a extends C90970b {

    /* renamed from: i */
    public static C90177c f258891i;

    /* renamed from: h */
    public Context f258892h;

    /* renamed from: se.a$a */
    public class C90174a implements Runnable {
        public C90174a() {
        }

        public void run() {
            boolean z;
            C90173a aVar = C90173a.this;
            aVar.getClass();
            try {
                z = aVar.f258892h.bindService(new Intent(aVar.f258892h, OpenglIndexDetectorService.class), new C90175b(aVar), 1);
            } catch (Exception e) {
                C118672d.m167351a("matrix.OpenglLeakPlugin", "bindService error = " + e.getCause(), new Object[0]);
                z = false;
            }
            C118672d.m167351a("matrix.OpenglLeakPlugin", "bindService result = " + z, new Object[0]);
            if (z) {
                if (C90173a.f258891i != null) {
                    C115669n.INSTANCE.mo175913w(1403, 36, 1);
                    Log.m105920e("OpenglLeakPlugin.TAG", "onExpProcessSuccess call & report");
                }
            } else if (C90173a.f258891i != null) {
                C115669n.INSTANCE.mo175913w(1403, 37, 1);
                Log.m105920e("OpenglLeakPlugin.TAG", "onExpProcessFail call & report");
            }
        }
    }

    public C90173a(Context context) {
        this.f258892h = context;
    }

    /* renamed from: b */
    public String mo112098b() {
        return "OpenglLeak";
    }

    /* renamed from: c */
    public void mo112099c(Application application, C90971c cVar) {
        super.mo112099c(application, cVar);
        C90767a aVar = C90767a.f260660e;
        Activity a = C90767a.m113828a();
        if (a != null) {
            aVar.f260661d = new C90767a.C90768a(a.hashCode(), a.getLocalClassName());
            OpenGLHook.getInstance().updateCurrActivity(aVar.f260661d.toString());
        }
        application.registerActivityLifecycleCallbacks(aVar);
        C90770d.f260665d.start();
    }

    /* renamed from: d */
    public void mo112100d() {
        super.mo112100d();
        new Thread(new C90174a()).start();
    }
}
