package r50;

import android.graphics.Point;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import p646pn.C110234e;
import p646pn.C110235f;
import xv0.C66445c;

/* renamed from: r50.c */
public final class C63363c {

    /* renamed from: a */
    public final C66445c f179732a;

    /* renamed from: b */
    public long f179733b;

    /* renamed from: r50.c$a */
    public static final class C63364a {

        /* renamed from: a */
        public static final C63364a f179734a = new C63364a();

        /* renamed from: b */
        public static C63363c f179735b = new C63363c((C66445c) null, 1, (C8480h) null);
    }

    public C63363c(C66445c cVar, int i, C8480h hVar) {
        if ((i & 1) != 0) {
            cVar = ((C110235f) C86312j.m106911c(C110235f.class)).Kd0();
            C87412m.m108593f(cVar, "getService(IFloatBallHel…).createFloatBallHelper()");
        }
        this.f179732a = cVar;
        cVar.mo35648A(21, "LiveFloatBall");
        cVar.getReportInfo().f311717f = 15;
        cVar.mo90539l();
    }

    /* renamed from: a */
    public final void mo88267a(Point point) {
        C87412m.m108594g(point, "newSize");
        Point point2 = this.f179732a.mo90534J().f311690h;
        boolean z = true;
        if (point2 != null && point2.x == point.x) {
            Point point3 = this.f179732a.mo90534J().f311690h;
            if (point3 == null || point3.y != point.y) {
                z = false;
            }
            if (z) {
                Log.m105924i("MicroMsg.LiveFloatBallHelper", "adjustFloatBallSize same donothing");
                return;
            }
        }
        mo88269c(point);
        this.f179732a.mo68414O();
        Log.m105924i("MicroMsg.LiveFloatBallHelper", "adjustFloatBallSize width:" + point.x + ", height:" + point.y);
    }

    /* renamed from: b */
    public final void mo88268b() {
        Log.m105918d("MicroMsg.LiveFloatBallHelper", "clickFloatBall");
        this.f179732a.mo90534J().f311683H.f311721j = 3;
        ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY().mo149142r(this.f179732a.mo90534J());
    }

    /* renamed from: c */
    public final void mo88269c(Point point) {
        this.f179732a.mo90534J().f311690h = new Point();
        int c = C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.f3766df);
        this.f179732a.mo90534J().f311690h.x = point.x;
        this.f179732a.mo90534J().f311690h.y = point.y;
        Log.m105927v("MicroMsg.LiveFloatBallHelper", "setLiveViewSize %s, margin: %d", this.f179732a.mo90534J().f311690h, Integer.valueOf(c));
    }

    /* renamed from: d */
    public final void mo88270d(C63374m mVar) {
        this.f179732a.mo90534J().f311683H.f311717f = mVar.f179772d;
        this.f179732a.mo90534J().f311683H.f311718g = String.valueOf(mVar.f179769a);
        this.f179732a.mo90534J().f311683H.f311719h = mVar.f179770b ? "1" : "2";
        this.f179732a.mo90534J().f311683H.f311715d = mVar.f179771c;
        this.f179732a.mo90534J().f311683H.f311721j = mVar.f179773e;
        Log.m105927v("MicroMsg.LiveFloatBallHelper", "addVoipView updateReportInfo bizScene: %d, bizId: %s, bizSubId: %s, generateType: %s", Integer.valueOf(this.f179732a.mo90534J().f311683H.f311717f), this.f179732a.mo90534J().f311683H.f311718g, this.f179732a.mo90534J().f311683H.f311719h, Integer.valueOf(this.f179732a.mo90534J().f311683H.f311715d));
    }
}
