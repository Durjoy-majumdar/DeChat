package w42;

import android.app.Activity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import e42.C31415g;
import e42.C7594e;
import e42.C7596h;
import e42.C86430i;
import gy3.C87412m;
import wc3.C15130a;
import wc3.C15140v;
import wd3.C15152t0;
import wd3.C78545b;
import wd3.C78574s0;

/* renamed from: w42.a */
public final class C15037a<T extends C7594e> extends C86430i<T> {

    /* renamed from: w42.a$a */
    public static final class C15038a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C15152t0 f41174d;

        public C15038a(C15152t0 t0Var) {
            this.f41174d = t0Var;
        }

        public final void run() {
            ((C78545b) this.f41174d).mo108519f();
        }
    }

    /* renamed from: w42.a$b */
    public static final class C15039b implements C78574s0 {

        /* renamed from: a */
        public final /* synthetic */ C15037a<T> f41175a;

        public C15039b(C15037a<T> aVar) {
            this.f41175a = aVar;
        }

        /* renamed from: a */
        public final void mo708a(int i) {
            if (i == -2) {
                this.f41175a.mo120840p().invoke(this.f41175a.mo120842g(3, "added"));
            } else if (i == 0) {
                this.f41175a.mo120840p().invoke(this.f41175a.mo120843h(C31415g.C7595b.f25863b));
            } else if (i != 1) {
                this.f41175a.mo120840p().invoke(this.f41175a.mo120842g(2, "fail"));
            } else {
                this.f41175a.mo120840p().invoke(this.f41175a.mo120844i());
            }
        }
    }

    /* renamed from: e */
    public String mo16e() {
        return "addContact";
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        Activity e0;
        C87412m.m108594g(hVar, "data");
        int optInt = hVar.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        String optString = hVar.optString("username");
        if (Util.isNullOrNil(optString)) {
            Log.m105924i("MicroMsg.MBJsApiAddContact", "username nil");
            mo120840p().invoke(mo120843h(C31415g.C7595b.f25865d));
            return;
        }
        C15130a aVar = new C15130a();
        aVar.f41261f = true;
        C15140v vVar = (C15140v) C86312j.m106911c(C15140v.class);
        T t = this.f251227a;
        C15152t0 jU = vVar.mo14098jU(t != null ? t.mo8720e0() : null, optString, optInt, new C15039b(this), aVar);
        T t2 = this.f251227a;
        if (t2 != null && (e0 = t2.mo8720e0()) != null) {
            e0.runOnUiThread(new C15038a(jU));
        }
    }
}
