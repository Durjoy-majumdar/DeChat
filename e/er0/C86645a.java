package er0;

import android.content.res.Configuration;
import android.util.DisplayMetrics;
import br0.C79774c;
import br0.C79778e;
import com.tencent.p014mm.plugin.appbrand.utils.C2039g2;
import com.tencent.p014mm.sdk.platformtools.Log;
import cr0.C86097c;
import gy3.C87412m;
import sx3.C110823p;
import zt3.C119157j;

/* renamed from: er0.a */
public final class C86645a implements C86097c {

    /* renamed from: b */
    public static final /* synthetic */ int f251605b = 0;

    /* renamed from: a */
    public final C79774c f251606a;

    /* renamed from: er0.a$a */
    public static final class C86646a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C79778e.C79780b f251607d;

        /* renamed from: e */
        public final /* synthetic */ C86645a f251608e;

        /* renamed from: f */
        public final /* synthetic */ C79778e.C79779a f251609f;

        public C86646a(C79778e.C79780b bVar, C86645a aVar, C79778e.C79779a aVar2) {
            this.f251607d = bVar;
            this.f251608e = aVar;
            this.f251609f = aVar2;
        }

        public final void run() {
            C79778e.C79780b bVar = this.f251607d;
            boolean z = false;
            if (bVar == C79778e.C79780b.PORTRAIT) {
                this.f251608e.f251606a.setSoftOrientation("portrait");
                C79778e.C79779a aVar = this.f251609f;
                if (aVar != null) {
                    C79778e.C79780b a = this.f251608e.mo109917a();
                    if (this.f251608e.mo109917a() == this.f251607d) {
                        z = true;
                    }
                    aVar.mo109919g(a, z);
                    return;
                }
                return;
            }
            int i = C86645a.f251605b;
            C79778e.C79780b[] bVarArr = C79778e.C79780b.f233803n;
            if (C110823p.m151009y(bVarArr, bVar)) {
                this.f251608e.f251606a.setSoftOrientation("landscape");
                C79778e.C79779a aVar2 = this.f251609f;
                if (aVar2 != null) {
                    aVar2.mo109919g(this.f251608e.mo109917a(), C110823p.m151009y(bVarArr, this.f251608e.mo109917a()));
                }
            } else if (bVar == C79778e.C79780b.UNSPECIFIED) {
                this.f251608e.f251606a.setSoftOrientation("auto");
                C79778e.C79779a aVar3 = this.f251609f;
                if (aVar3 != null) {
                    aVar3.mo109919g(this.f251608e.mo109917a(), true);
                }
            } else {
                this.f251608e.f251606a.setSoftOrientation("portrait");
                C79778e.C79779a aVar4 = this.f251609f;
                if (aVar4 != null) {
                    C79778e.C79780b a2 = this.f251608e.mo109917a();
                    if (this.f251608e.mo109917a() == this.f251607d) {
                        z = true;
                    }
                    aVar4.mo109919g(a2, z);
                }
            }
        }
    }

    public C86645a(C79774c cVar) {
        C87412m.m108594g(cVar, "window");
        this.f251606a = cVar;
    }

    /* renamed from: a */
    public C79778e.C79780b mo109917a() {
        DisplayMetrics vDisplayMetrics = this.f251606a.getVDisplayMetrics();
        if (vDisplayMetrics.heightPixels >= vDisplayMetrics.widthPixels) {
            Log.m105924i("MicroMsg.CenterInsideWindowOrientationHandler", "getCurrentOrientation: portrait");
            return C79778e.C79780b.PORTRAIT;
        }
        Log.m105924i("MicroMsg.CenterInsideWindowOrientationHandler", "getCurrentOrientation: landscape");
        return C79778e.C79780b.LANDSCAPE_SENSOR;
    }

    /* renamed from: b */
    public void mo109918b(C79778e.C79780b bVar, C79778e.C79779a aVar) {
        if (bVar != null) {
            Log.m105924i("MicroMsg.CenterInsideWindowOrientationHandler", "requestDeviceOrientation: " + bVar.f233805d + ',' + bVar.name());
            C86646a aVar2 = new C86646a(bVar, this, aVar);
            if (C2039g2.m1987a()) {
                aVar2.run();
            } else {
                ((C119157j) C119157j.f356862d).mo183895z(aVar2);
            }
        } else if (aVar != null) {
            aVar.mo109919g((C79778e.C79780b) null, false);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void release() {
    }
}
