package com.tencent.p014mm.plugin.appbrand.report;

import android.app.Application;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83047v;
import com.tencent.p014mm.plugin.appbrand.utils.C84753j0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import jp3.C9486a;
import p963fc.C86812g;

/* renamed from: com.tencent.mm.plugin.appbrand.report.p */
public final class C84177p extends C84753j0 implements C9486a {

    /* renamed from: d */
    public C86812g f245829d;

    /* renamed from: e */
    public Application f245830e;

    public C84177p(C86812g gVar, C84176o oVar) {
        this.f245829d = gVar;
        gVar.keep(this);
        Application application = (Application) gVar.f238141d.getApplicationContext();
        this.f245830e = application;
        application.registerComponentCallbacks(this);
    }

    public void dead() {
        this.f245830e.unregisterComponentCallbacks(this);
        this.f245829d = null;
    }

    public void onTrimMemory(int i) {
        int i2 = i;
        C86812g gVar = this.f245829d;
        if (gVar != null) {
            if (i2 == 5 || i2 == 10 || i2 == 15) {
                if (gVar.mo113036W() != null) {
                    boolean k = this.f245829d.mo113036W().mo111300k();
                    if (i2 == 5) {
                        if (k) {
                            C115669n.INSTANCE.idkeyStat(386, 15, 1, false);
                        } else {
                            C115669n.INSTANCE.idkeyStat(386, 14, 1, false);
                        }
                        C115669n.INSTANCE.idkeyStat(386, 9, 1, false);
                    } else if (i2 == 10) {
                        if (k) {
                            C115669n.INSTANCE.idkeyStat(386, 13, 1, false);
                        } else {
                            C115669n.INSTANCE.idkeyStat(386, 12, 1, false);
                        }
                        C115669n.INSTANCE.idkeyStat(386, 8, 1, false);
                    } else if (i2 == 15) {
                        if (k) {
                            C115669n.INSTANCE.idkeyStat(386, 11, 1, false);
                        } else {
                            C115669n.INSTANCE.idkeyStat(386, 10, 1, false);
                        }
                        C115669n.INSTANCE.idkeyStat(386, 7, 1, false);
                    }
                }
                C86812g gVar2 = this.f245829d;
                Log.m105925i("MicroMsg.AppBrandOnMemoryWarningReceiveEvent", "memory warning receive event dispatch, appId:%s, initialized:%b, level:%d", gVar2.f238147j, Boolean.valueOf(gVar2.f238116N), Integer.valueOf(i));
                if (gVar2.f238116N) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(FirebaseAnalytics.C113379b.LEVEL, Integer.valueOf(i));
                    C83047v vVar = new C83047v();
                    vVar.mo115194p(gVar2.mo113047b0());
                    vVar.mo115165o(hashMap);
                    vVar.mo115158h();
                }
            }
        }
    }
}
