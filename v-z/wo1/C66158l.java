package wo1;

import android.view.View;
import cl1.C54991o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import p001ak.C54053a;
import p006bk.C54479b;
import p871zj.C66843h;
import p871zj.C66846j;
import sk1.C63947a;
import sx3.C36907w;
import te3.C51343t41;
import te3.C64674r41;

/* renamed from: wo1.l */
public final class C66158l extends C66145c {

    /* renamed from: i */
    public final View f190155i;

    /* renamed from: j */
    public final C45795b f190156j;

    /* renamed from: k */
    public final C66155g f190157k;

    /* renamed from: l */
    public final String f190158l = "ReplayBulletManager";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66158l(View view, C45795b bVar, C66155g gVar) {
        super(view, bVar, gVar);
        C87412m.m108594g(view, "bulletView");
        C87412m.m108594g(bVar, "buContext");
        C87412m.m108594g(gVar, "danmakuConfig");
        this.f190155i = view;
        this.f190156j = bVar;
        this.f190157k = gVar;
    }

    /* renamed from: b */
    public void mo90195b(List<? extends C51343t41> list) {
        super.mo90195b(list);
        if (this.f190125e >= 0) {
            mo90203k().mo90852k(0);
        }
    }

    /* renamed from: c */
    public void mo90196c(float f, boolean z) {
        this.f190126f = f;
        int i = mo90201i(!z, f);
        C54479b.m61196c().f152754a = i;
        String str = this.f190158l;
        Log.m105924i(str, "changeSpeed: duration=" + i + ", ratio=" + f + ", isLandscape=" + z);
        mo90203k().mo90847f();
    }

    /* renamed from: d */
    public void mo90197d(long j, long j2) {
        if (this.f190127g) {
            String str = this.f190158l;
            StringBuilder sb = new StringBuilder();
            sb.append("setProgress: currentTime = ");
            sb.append(this.f190125e);
            sb.append(", times = ");
            sb.append(j);
            sb.append(", ");
            FinderObject finderObject = ((C54991o) this.f190156j.mo71262a(C54991o.class)).f154341n;
            sb.append(finderObject != null ? C63947a.f181274a.mo88735u(finderObject, -1) : null);
            Log.m105926v(str, sb.toString());
            if (this.f190125e == -1) {
                mo90203k().mo90852k(j);
            }
            mo90206n(j);
        }
    }

    /* renamed from: e */
    public void mo90213e(List<? extends C51343t41> list, long j, boolean z) {
        if (this.f190127g && !mo90203k().mo90846e()) {
            String str = this.f190158l;
            StringBuilder sb = new StringBuilder();
            sb.append("restart: timeStamp = ");
            sb.append(j);
            sb.append(", ");
            FinderObject finderObject = ((C54991o) this.f190156j.mo71262a(C54991o.class)).f154341n;
            sb.append(finderObject != null ? C63947a.f181274a.mo88735u(finderObject, -1) : null);
            Log.m105924i(str, sb.toString());
            if (list != null) {
                mo90200h(list, "restart");
            }
            mo90203k().mo90852k(j);
            if (z) {
                mo90203k().mo90848g(false);
            }
        }
    }

    /* renamed from: f */
    public C66846j mo90198f() {
        return mo90203k();
    }

    /* renamed from: g */
    public void mo90199g(boolean z) {
        String str = this.f190158l;
        Log.m105924i(str, "onConfigurationChange: isLandscape=" + z);
        super.mo90199g(z);
    }

    /* renamed from: h */
    public void mo90200h(List<? extends C51343t41> list, String str) {
        C87412m.m108594g(list, "list");
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        String str2 = this.f190158l;
        StringBuilder sb = new StringBuilder();
        sb.append("before addReplayDanmaku, size:");
        C66843h hVar = mo90203k().f192019d.f191990h;
        sb.append(hVar != null ? hVar.f192013b.f166944d : 0);
        sb.append("; add size = ");
        sb.append(list.size());
        sb.append(", source = ");
        sb.append(str);
        sb.append('!');
        Log.m105924i(str2, sb.toString());
        C66846j k = mo90203k();
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (C51343t41 t412 : list) {
            C54053a c = mo90203k().mo90844c(0, t412);
            c.f151358o = this.f190157k.f190148f;
            C64674r41 r412 = t412.f141953d;
            c.f151348e = ((long) (r412 != null ? r412.f185138u : 0)) * 1000;
            arrayList.add(c);
        }
        k.mo90842a(arrayList, false);
    }

    /* renamed from: l */
    public String mo90204l() {
        return this.f190158l;
    }

    public void onDetach() {
        super.onDetach();
    }

    public void seek(int i) {
        long j = ((long) i) * 1000;
        if (!this.f190127g) {
            String str = this.f190158l;
            Log.m105924i(str, "no attach seek seek: timeStamp = " + i);
            mo90206n(j);
            return;
        }
        String str2 = this.f190158l;
        StringBuilder sb = new StringBuilder();
        sb.append("seek: timeStamp = ");
        sb.append(i);
        sb.append(",currentTime:");
        sb.append(this.f190125e);
        sb.append(", ");
        FinderObject finderObject = ((C54991o) this.f190156j.mo71262a(C54991o.class)).f154341n;
        sb.append(finderObject != null ? C63947a.f181274a.mo88735u(finderObject, -1) : null);
        Log.m105924i(str2, sb.toString());
        mo90203k().mo90851j(j);
        mo90206n(j);
        C66843h hVar = mo90203k().f192019d.f191990h;
        if (hVar != null) {
            hVar.mo90839b();
        }
    }
}
