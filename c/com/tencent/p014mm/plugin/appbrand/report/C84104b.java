package com.tencent.p014mm.plugin.appbrand.report;

import android.media.AudioManager;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.appcache.IPkgInfo;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.p014mm.plugin.appbrand.report.C84108d;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import mj0.a$$i;
import p224ra.C12964b;
import p224ra.C89909e;
import p870za.C66775a;
import p870za.C66776c;
import p870za.C91625b;
import p963fc.C86812g;
import rx3.C13598b0;
import te3.C64362fd2;
import te3.C64393gd2;
import te3.x55;
import te3.y55;
import te3.z55;
import zp0.C16377l;
import zp0.C91829i;

/* renamed from: com.tencent.mm.plugin.appbrand.report.b */
public class C84104b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntime f245558d;

    /* renamed from: e */
    public final /* synthetic */ C84108d.C84109a f245559e;

    /* renamed from: f */
    public final /* synthetic */ C84108d f245560f;

    /* renamed from: com.tencent.mm.plugin.appbrand.report.b$a */
    public class C84105a implements C32227p<Boolean, C91829i, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66776c f245561d;

        public C84105a(C66776c cVar) {
            this.f245561d = cVar;
        }

        public Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            C91829i iVar = (C91829i) obj2;
            Log.m105925i("MicroMsg.AppBrandGameExtraConfigMgr", "hy: on get wxa game config resp: success?:%s, exception?:%s", bool, iVar);
            if (bool.booleanValue()) {
                C64393gd2 gd22 = this.f245561d.f191876b;
                if (gd22 != null) {
                    C84108d dVar = C84104b.this.f245560f;
                    dVar.f245571c = gd22.f183304d;
                    dVar.f245572d = gd22.f183305e;
                    dVar.f245573e = gd22.f183306f;
                    dVar.f245574f = gd22.f183307g;
                } else {
                    C87412m.m108603p("response");
                    throw null;
                }
            }
            C84108d.C84109a aVar = C84104b.this.f245559e;
            if (aVar != null) {
                ((a$$i) aVar).mo123171a(bool.booleanValue(), iVar);
            }
            return C13598b0.f38549a;
        }
    }

    public C84104b(C84108d dVar, AppBrandRuntime appBrandRuntime, C84108d.C84109a aVar) {
        this.f245560f = dVar;
        this.f245558d = appBrandRuntime;
        this.f245559e = aVar;
    }

    public void run() {
        AppBrandRuntime appBrandRuntime = this.f245558d;
        boolean z = false;
        if (appBrandRuntime == null || appBrandRuntime.mo113047b0() == null) {
            Log.m105928w("MicroMsg.AppBrandGameExtraConfigMgr", "hy: runtime is null!");
            C84108d.C84109a aVar = this.f245559e;
            if (aVar != null) {
                ((a$$i) aVar).mo123171a(false, (C91829i) null);
                return;
            }
            return;
        }
        Log.m105924i("MicroMsg.AppBrandGameExtraConfigMgr", "hy: trigger wxa game config update");
        C84108d dVar = this.f245560f;
        dVar.f245571c = null;
        dVar.f245572d = null;
        dVar.f245573e = null;
        dVar.f245574f = null;
        AppBrandRuntime appBrandRuntime2 = this.f245558d;
        dVar.getClass();
        C66776c cVar = new C66776c();
        if (!(appBrandRuntime2.mo113047b0().mo114272k() == null || appBrandRuntime2.mo113047b0().mo114272k().mo113379c() == null)) {
            IPkgInfo c = appBrandRuntime2.mo113047b0().mo114272k().mo113379c();
            y55 y55 = new y55();
            dVar.f245569a = y55;
            y55.f186450d = c.pkgVersion();
            dVar.f245569a.f186451e = c.lastModified();
            dVar.f245569a.f186452f = 0;
        }
        if (!(appBrandRuntime2.mo113051d0() == null || appBrandRuntime2.mo113051d0().f261072r == null)) {
            WxaPkgWrappingInfo wxaPkgWrappingInfo = appBrandRuntime2.mo113051d0().f261072r;
            x55 x55 = new x55();
            dVar.f245570b = x55;
            x55.f186268d = wxaPkgWrappingInfo.f238585d;
            x55.f186269e = wxaPkgWrappingInfo.pkgVersion;
            AppBrandStatObject n1 = ((C86812g) appBrandRuntime2).mo121253n1();
            if (n1 != null) {
                x55 x552 = dVar.f245570b;
                x552.f186270f = n1.f245533f;
                x552.f186272h = n1.f245531d;
                x552.f186271g = 0;
            }
        }
        int streamVolume = ((AudioManager) appBrandRuntime2.f238141d.getSystemService("audio")).getStreamVolume(3);
        z55 z55 = new z55();
        if (streamVolume == 0) {
            z = true;
        }
        z55.f186627d = z;
        C64362fd2 fd22 = cVar.f191875a;
        fd22.f183107d = appBrandRuntime2.f238147j;
        fd22.f183109f = dVar.f245569a;
        fd22.f183108e = dVar.f245570b;
        fd22.f183110g = z55;
        C84105a aVar2 = new C84105a(cVar);
        C12964b a = C89909e.m112436a(C16377l.class);
        C87412m.m108591d(a);
        ((C16377l) a).mo14840YQ("/cgi-bin/mmgame-bin/getwxagameconfig", (String) null, cVar.f191875a, C64393gd2.class).mo114038a(new C66775a(cVar, aVar2)).mo123065b(new C91625b(aVar2));
    }
}
