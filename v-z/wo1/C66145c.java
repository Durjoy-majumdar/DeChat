package wo1;

import android.content.Context;
import android.view.View;
import cl1.C54991o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fj1.C45795b;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import p006bk.C0306f;
import p006bk.C54478a;
import p006bk.C54479b;
import p006bk.C54486i;
import p850ek.C58612c;
import p850ek.C58614e;
import p871zj.C66838e;
import p871zj.C66846j;
import sk1.C63947a;
import te3.C51343t41;
import up1.C37521f;

/* renamed from: wo1.c */
public class C66145c implements C66154f {

    /* renamed from: a */
    public final View f190121a;

    /* renamed from: b */
    public final C45795b f190122b;

    /* renamed from: c */
    public final C66155g f190123c;

    /* renamed from: d */
    public C66846j f190124d;

    /* renamed from: e */
    public long f190125e = -1;

    /* renamed from: f */
    public float f190126f = 1.0f;

    /* renamed from: g */
    public boolean f190127g;

    /* renamed from: h */
    public C66846j.C66848b f190128h;

    public C66145c(View view, C45795b bVar, C66155g gVar) {
        C87412m.m108594g(view, "bullet");
        C87412m.m108594g(bVar, "business");
        C87412m.m108594g(gVar, "config");
        this.f190121a = view;
        this.f190122b = bVar;
        this.f190123c = gVar;
        C54486i c = C54479b.m61196c();
        c.f152756c = gVar.f190143a;
        c.f152761h = true;
        c.f152754a = gVar.f190145c;
        c.f152755b = C58612c.m68061a((float) 0);
        c.f152767n = (float) C58612c.m68061a(0.0f);
        c.f152768o = (float) C58612c.m68061a(0.0f);
        c.f152757d = C58612c.m68061a(6.0f);
        c.f152758e = C58612c.m68061a((float) 24);
        c.mo75310a(true);
        C54479b.C54480a aVar = new C54479b.C54480a((C54478a) null);
        aVar.f152748a = new C66143a(this);
        aVar.f152751d = gVar.f190149g;
        C0306f fVar = gVar.f190150h;
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        ((ArrayList) aVar.f152750c).add(fVar.mo357a(context));
        aVar.f152749b = C66144b.f190120a;
        boolean z = BuildInfo.DEBUG;
        aVar.f152752e = gVar.f190151i;
        this.f190124d = new C66846j(view, new C54479b(aVar, (C54478a) null));
    }

    /* renamed from: a */
    public boolean mo90194a() {
        return this.f190127g;
    }

    /* renamed from: b */
    public void mo90195b(List<? extends C51343t41> list) {
        String l = mo90204l();
        StringBuilder sb = new StringBuilder();
        sb.append("onAttach: ");
        FinderObject finderObject = ((C54991o) this.f190122b.mo71262a(C54991o.class)).f154341n;
        sb.append(finderObject != null ? C63947a.f181274a.mo88735u(finderObject, -1) : null);
        sb.append("， this=");
        sb.append(hashCode());
        Log.m105924i(l, sb.toString());
        onDetach();
        C58614e.f167820a = new C15569h(mo90204l());
        boolean z = true;
        mo90205m(true);
        C66846j.C66848b bVar = this.f190128h;
        if (bVar != null) {
            mo90203k().f192019d.f191979H = bVar;
        }
        mo90203k().f192019d.f191999t = false;
        if (list != null && !list.isEmpty()) {
            z = false;
        }
        if (!z) {
            mo90203k().mo90843b();
            mo90200h(list, "onAttach");
        }
        this.f190126f = 1.0f;
    }

    /* renamed from: c */
    public void mo90196c(float f, boolean z) {
    }

    /* renamed from: d */
    public void mo90197d(long j, long j2) {
    }

    /* renamed from: f */
    public C66846j mo90198f() {
        return mo90203k();
    }

    /* renamed from: g */
    public void mo90199g(boolean z) {
        C66155g gVar = this.f190123c;
        C87412m.m108594g(gVar, "config");
        int i = z ? gVar.f190144b : gVar.f190143a;
        boolean z2 = !z;
        C54486i c = C54479b.m61196c();
        c.f152756c = i;
        c.mo75310a(z2);
        c.f152754a = mo90201i(z2, this.f190126f);
        Log.m105924i(mo90204l(), "setDanmakuRow: rowCount=" + c.f152756c + ", isVertical=" + z2 + ", duration=" + c.f152754a + ", playSpeedRatio=" + this.f190126f);
        mo90203k().mo90847f();
    }

    /* renamed from: h */
    public void mo90200h(List<? extends C51343t41> list, String str) {
        C87412m.m108594g(list, "list");
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
    }

    /* renamed from: i */
    public final int mo90201i(boolean z, float f) {
        int i = z ? this.f190123c.f190145c : this.f190123c.f190146d;
        C37521f.f99374d.getClass();
        return (int) ((((float) i) * C37521f.f99467n6.mo60266n().floatValue()) / f);
    }

    /* renamed from: j */
    public long mo90202j() {
        return this.f190125e;
    }

    /* renamed from: k */
    public final C66846j mo90203k() {
        C66846j jVar = this.f190124d;
        if (jVar != null) {
            return jVar;
        }
        C87412m.m108603p("danmakuManager");
        throw null;
    }

    /* renamed from: l */
    public String mo90204l() {
        throw null;
    }

    /* renamed from: m */
    public final void mo90205m(boolean z) {
        if (z != this.f190127g) {
            String l = mo90204l();
            Log.m105924i(l, hashCode() + " isAttached from " + this.f190127g + " to " + z);
        }
        this.f190127g = z;
    }

    /* renamed from: n */
    public void mo90206n(long j) {
        if (j >= 0) {
            j += (long) this.f190123c.f190147e;
        }
        this.f190125e = j;
    }

    public void onDetach() {
        if (this.f190127g) {
            mo90205m(false);
            mo90206n(-1);
            String l = mo90204l();
            StringBuilder sb = new StringBuilder();
            sb.append("onDetach: ");
            FinderObject finderObject = ((C54991o) this.f190122b.mo71262a(C54991o.class)).f154341n;
            sb.append(finderObject != null ? C63947a.f181274a.mo88735u(finderObject, -1) : null);
            sb.append("， this=");
            sb.append(hashCode());
            Log.m105924i(l, sb.toString());
            mo90203k().mo90849h();
        }
    }

    public void pause() {
        if (this.f190127g) {
            String l = mo90204l();
            StringBuilder sb = new StringBuilder();
            sb.append("pause: ");
            FinderObject finderObject = ((C54991o) this.f190122b.mo71262a(C54991o.class)).f154341n;
            sb.append(finderObject != null ? C63947a.f181274a.mo88735u(finderObject, -1) : null);
            Log.m105924i(l, sb.toString());
            if (mo90203k().mo90846e()) {
                mo90203k().mo90848g(false);
            }
        }
    }

    public void resume() {
        if (this.f190127g) {
            String l = mo90204l();
            StringBuilder sb = new StringBuilder();
            sb.append("resume: ");
            FinderObject finderObject = ((C54991o) this.f190122b.mo71262a(C54991o.class)).f154341n;
            sb.append(finderObject != null ? C63947a.f181274a.mo88735u(finderObject, -1) : null);
            Log.m105924i(l, sb.toString());
            if (!mo90203k().mo90846e()) {
                mo90203k().mo90850i();
            }
        }
    }

    public void seek(int i) {
    }

    public void stop() {
        if (this.f190127g) {
            String l = mo90204l();
            StringBuilder sb = new StringBuilder();
            sb.append("stop: ");
            FinderObject finderObject = ((C54991o) this.f190122b.mo71262a(C54991o.class)).f154341n;
            sb.append(finderObject != null ? C63947a.f181274a.mo88735u(finderObject, -1) : null);
            Log.m105924i(l, sb.toString());
            C66838e eVar = mo90203k().f192019d;
            eVar.getClass();
            C58614e.m68067d("DanmakuManager", "clearDrawingCache()");
            eVar.f191981J.mo90858a(11);
            mo90203k().mo90843b();
            mo90203k().f192019d.mo90827n();
        }
    }
}
