package com.tencent.p014mm.plugin.appbrand.report.model;

import android.net.Uri;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C28947a;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import eb0.C31543z5;
import fy3.C32226l;
import gy3.C87412m;
import h81.C32735h;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import qo3.C77426q;
import sx3.C110823p;
import zo0.C91819j;

/* renamed from: com.tencent.mm.plugin.appbrand.report.model.f */
public final class C84142f {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0004\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo182094d2 = {"Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "Lcom/tencent/mm/ipcinvoker/g;", "<anonymous parameter 1>", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/ipcinvoker/type/IPCVoid;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.report.model.f$b */
    public static final class C40526b<InputType, ResultType> implements C1255d {

        /* renamed from: d */
        public static final C40526b<InputType, ResultType> f108853d = new C40526b<>();

        public void invoke(Object obj, C1256g gVar) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            C77426q qVar = new C77426q(MMApplicationContext.getContext());
            qVar.mo107595g(MMApplicationContext.getString(C0966R.string.a7j));
            qVar.mo107600l(C40527g.f108854a);
            qVar.mo107603o();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.model.f$a */
    public static final class C84143a {

        /* renamed from: a */
        public final String f245645a;

        /* renamed from: b */
        public final int f245646b;

        /* renamed from: c */
        public final ArrayList<IDKey> f245647c = new ArrayList<>(4);

        /* renamed from: d */
        public int f245648d;

        public C84143a(String str, int i) {
            C87412m.m108594g(str, "appId");
            this.f245645a = str;
            this.f245646b = i;
        }

        /* renamed from: a */
        public final void mo116814a() {
            C115669n.INSTANCE.mo160124a(this.f245647c, false);
            for (IDKey iDKey : this.f245647c) {
                Log.m105924i("MicroMsg.AppBrandUIInvalidIntentTraceReport", "flush report appId:" + this.f245645a + " versionType:" + this.f245646b + " idkey: " + iDKey.GetID() + ' ' + iDKey.GetKey());
                C84240s.m103844j(this.f245645a, 0, this.f245646b, iDKey.GetID(), iDKey.GetKey(), 1);
            }
        }

        /* renamed from: b */
        public final void mo116815b(long j) {
            int i;
            TimeUnit timeUnit = TimeUnit.HOURS;
            if (j > timeUnit.toMillis(24)) {
                i = 11;
            } else if (j > timeUnit.toMillis(12)) {
                i = 10;
            } else if (j > timeUnit.toMillis(6)) {
                i = 9;
            } else if (j > timeUnit.toMillis(2)) {
                i = 8;
            } else if (j > timeUnit.toMillis(1)) {
                i = 7;
            } else {
                TimeUnit timeUnit2 = TimeUnit.MINUTES;
                i = j > timeUnit2.toMillis(30) ? 6 : j > timeUnit2.toMillis(10) ? 5 : j > timeUnit2.toMillis(5) ? 4 : j > timeUnit2.toMillis(2) ? 3 : j > timeUnit2.toMillis(1) ? 2 : j > 30000 ? 1 : -1;
            }
            if (i > 0) {
                this.f245647c.add(new IDKey(1774, i + this.f245648d, 1));
            }
        }
    }

    /* renamed from: a */
    public static final void m103712a(AppBrandUI appBrandUI, AppBrandInitConfigWC appBrandInitConfigWC, String str) {
        C87412m.m108594g(appBrandUI, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(appBrandInitConfigWC, "config");
        C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        int i = C87412m.m108589b("onNewIntent", str) ? 100 : 0;
        String str2 = appBrandInitConfigWC.f239362d;
        C87412m.m108593f(str2, "config.appId");
        C84143a aVar = new C84143a(str2, appBrandInitConfigWC.f239365g);
        aVar.f245648d = i;
        aVar.f245647c.add(new IDKey(1774, aVar.f245648d + 0, 1));
        aVar.mo116815b(Util.nowMilliSecond() - appBrandInitConfigWC.f234800D);
        aVar.mo116814a();
        if (C110823p.m151008x(C91819j.f262917g, appBrandInitConfigWC.f234834c1.f245533f) || C110823p.m151008x(C91819j.f262918h, appBrandInitConfigWC.f234834c1.f245533f)) {
            try {
                String queryParameter = Uri.parse(appBrandInitConfigWC.f239367i).getQueryParameter("scancode_time");
                C87412m.m108591d(queryParameter);
                long parseLong = Long.parseLong(queryParameter) * 1000;
                long b = C31543z5.m39452b();
                if (parseLong > 0 && b > 0) {
                    Log.m105924i("MicroMsg.AppBrandUIInvalidIntentTraceReport", "reportOnRuntimeLoad, appId:" + appBrandInitConfigWC.f239362d + ", appScene:" + appBrandInitConfigWC.f234834c1.f245533f + ", uiScene:" + str + ", scanCodeTime:" + parseLong + ", serverSyncTime:" + b);
                    String str3 = appBrandInitConfigWC.f239362d;
                    C87412m.m108593f(str3, "config.appId");
                    C84143a aVar2 = new C84143a(str3, appBrandInitConfigWC.f239365g);
                    aVar2.f245648d = i + 20;
                    aVar2.f245647c.add(new IDKey(1774, aVar2.f245648d + 0, 1));
                    long j = b - parseLong;
                    aVar2.mo116815b(j);
                    aVar2.mo116814a();
                    long He = ((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_android_appbrand_ban_open_scancode_time_expired_span, 3600000);
                    if (He > 0 && j > He) {
                        throw new C84137a();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static final void m103713b() {
        String mainProcessName = MMApplicationContext.getMainProcessName();
        C87412m.m108593f(mainProcessName, "getMainProcessName()");
        C28947a.m38500a(mainProcessName, IPCVoid.f10316d, C40526b.f108853d, (C32226l) null);
    }
}
