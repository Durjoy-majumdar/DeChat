package wo1;

import android.os.SystemClock;
import android.view.View;
import cj1.C0581o5;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import fj1.C45795b;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import p001ak.C54053a;
import p871zj.C66843h;
import sk1.C63947a;
import sx3.C36907w;
import te3.C51343t41;

/* renamed from: wo1.i */
public final class C66156i extends C66145c {

    /* renamed from: i */
    public final View f190152i;

    /* renamed from: j */
    public final C66155g f190153j;

    /* renamed from: k */
    public final String f190154k = "LiveDanmakuManager";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66156i(View view, C45795b bVar, C66155g gVar) {
        super(view, bVar, gVar);
        C87412m.m108594g(view, "bulletView");
        C87412m.m108594g(bVar, "buContext");
        C87412m.m108594g(gVar, "danmakuConfig");
        this.f190152i = view;
        this.f190153j = gVar;
    }

    /* renamed from: b */
    public void mo90195b(List<? extends C51343t41> list) {
        super.mo90195b(list);
        mo90203k().mo90852k(0);
    }

    /* renamed from: e */
    public void mo90213e(List<? extends C51343t41> list, long j, boolean z) {
    }

    /* renamed from: g */
    public void mo90199g(boolean z) {
        String str = this.f190154k;
        Log.m105924i(str, "onConfigurationChange: isLandscape=" + z);
        super.mo90199g(z);
    }

    /* renamed from: j */
    public long mo90202j() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: l */
    public String mo90204l() {
        return this.f190154k;
    }

    /* renamed from: n */
    public void mo90206n(long j) {
    }

    /* renamed from: o */
    public void mo90217o(List<? extends C0581o5> list, String str) {
        C87412m.m108594g(list, "list");
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        try {
            synchronized (list) {
                String str2 = this.f190154k;
                StringBuilder sb = new StringBuilder();
                sb.append("addLiveDanmaku, size:");
                C66843h hVar = mo90203k().f192019d.f191990h;
                sb.append(hVar != null ? hVar.f192013b.f166944d : 0);
                sb.append("; add size = ");
                sb.append(list.size());
                sb.append(", source = ");
                sb.append(str);
                sb.append(' ');
                sb.append(C58739j4.f168176a.mo83692U() ? C63947a.f181274a.mo88720e(list) : "");
                sb.append('!');
                Log.m105924i(str2, sb.toString());
                ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
                for (C0581o5 c : list) {
                    C54053a c2 = mo90203k().mo90844c(0, c);
                    c2.f151358o = this.f190153j.f190148f;
                    c2.f151348e = SystemClock.uptimeMillis();
                    arrayList.add(c2);
                }
                mo90203k().mo90842a(arrayList, false);
            }
        } catch (ConcurrentModificationException e) {
            C58739j4.f168176a.mo83712h0(e, "addLiveDanmaku");
        } catch (Throwable th) {
            throw th;
        }
    }

    public void onDetach() {
        super.onDetach();
    }
}
