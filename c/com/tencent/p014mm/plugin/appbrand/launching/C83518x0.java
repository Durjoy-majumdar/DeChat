package com.tencent.p014mm.plugin.appbrand.launching;

import android.util.Pair;
import com.tencent.luggage.sdk.launching.C80247h;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.C81662k;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandPrepareTask;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import h81.C32735h;
import ii0.C87732a;
import java.util.Locale;
import ki0.C33909b;
import lu3.C88656g;
import xm0.C91291c;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.x0 */
public final class C83518x0 {

    /* renamed from: a */
    public final String f244000a;

    /* renamed from: b */
    public final String f244001b;

    /* renamed from: c */
    public final boolean f244002c;

    /* renamed from: d */
    public final int f244003d;

    /* renamed from: e */
    public final String f244004e;

    /* renamed from: f */
    public final String f244005f;

    /* renamed from: g */
    public final WxaAttributes.WxaVersionInfo f244006g;

    /* renamed from: h */
    public final C83520b f244007h;

    /* renamed from: i */
    public final QualitySession f244008i;

    /* renamed from: j */
    public final C80247h f244009j;

    /* renamed from: k */
    public final ICommLibReader f244010k;

    /* renamed from: l */
    public final boolean f244011l;

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.x0$a */
    public class C83519a implements C88656g {

        /* renamed from: d */
        public final /* synthetic */ String f244012d;

        public C83519a(String str) {
            this.f244012d = str;
        }

        public String getKey() {
            return this.f244012d;
        }

        public void run() {
            C83518x0 x0Var = C83518x0.this;
            x0Var.getClass();
            String str = x0Var.f244000a;
            int i = x0Var.f244006g.f239452d;
            Pair<Boolean, Integer> jo = ((C33909b) C81161g2.Bx0(C33909b.class)).mo59361jo("username", str, 1, x0Var.f244003d);
            if (((Boolean) jo.first).booleanValue()) {
                Log.m105925i("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", "sync blocked with username(%s) scene(%d)", str, Integer.valueOf(x0Var.f244003d));
                C87732a.INSTANCE.mo122144a(((Integer) jo.second).intValue(), 164);
                return;
            }
            Log.m105925i("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", "[appversion] start() username %s, scene %d", str, Integer.valueOf(x0Var.f244003d));
            long nowMilliSecond = Util.nowMilliSecond();
            C81662k.m100192k(x0Var.f244000a, true, new C83287a1(x0Var, str, i, nowMilliSecond), new C83523y0(x0Var));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.x0$b */
    public interface C83520b {
    }

    public C83518x0(AppBrandPrepareTask.PrepareParams prepareParams, C83520b bVar) {
        this.f244000a = prepareParams.f243171j;
        this.f244001b = prepareParams.f243170i;
        this.f244002c = prepareParams.f243176r;
        this.f244003d = prepareParams.f243167f;
        this.f244004e = prepareParams.f243168g;
        this.f244005f = prepareParams.f243169h;
        this.f244006g = prepareParams.f243175q;
        this.f244007h = bVar;
        this.f244008i = prepareParams.f243179u;
        this.f244009j = prepareParams.f243184z;
        this.f244010k = prepareParams.f243180v;
        this.f244011l = false;
    }

    /* renamed from: a */
    public void mo115811a() {
        if (this.f244006g == null) {
            Log.m105921e("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", "start with NULL WxaVersionInfo, notify NO_UPDATE with username(%s) appId(%s)", this.f244000a, this.f244001b);
            ((IPCUpdateStateNotifier) this.f244007h).mo115556a(C91291c.NO_UPDATE, 0, (String) null, (String) null, (String) null);
            return;
        }
        String format = String.format(Locale.ENGLISH, "ContactSilentSyncProcess|%s|%s", new Object[]{this.f244000a, this.f244001b});
        ((C119157j) C119157j.f356862d).mo183876g(new C83519a(format), format);
    }

    public C83518x0(AppBrandInitConfigWC appBrandInitConfigWC, int i, ICommLibReader iCommLibReader, C83520b bVar) {
        this.f244000a = appBrandInitConfigWC.f234839s;
        this.f244001b = appBrandInitConfigWC.f239362d;
        this.f244002c = appBrandInitConfigWC.mo111300k();
        this.f244003d = i;
        this.f244004e = appBrandInitConfigWC.f239367i;
        this.f244005f = appBrandInitConfigWC.f234840t;
        this.f244006g = appBrandInitConfigWC.f234804H;
        this.f244007h = bVar;
        this.f244008i = appBrandInitConfigWC.f239379j1;
        this.f244009j = appBrandInitConfigWC.f234829Y0;
        this.f244010k = iCommLibReader;
        this.f244011l = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_appbrand_skip_event_on_warm_attrsync_freq_limit, 0) > 0;
    }
}
