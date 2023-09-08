package cl1;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C58052j1;
import d14.C58056k1;
import d14.C58087u0;
import er1.C58739j4;
import fj1.C45795b;
import gy3.C87412m;
import pe3.C89349b;
import te3.C64337e61;
import te3.C64390ga1;

/* renamed from: cl1.l */
public final class C0668l extends C39970c<C45795b> {

    /* renamed from: f */
    public int f1573f;

    /* renamed from: g */
    public C89349b f1574g;

    /* renamed from: h */
    public C0669a f1575h;

    /* renamed from: i */
    public C58087u0<Boolean> f1576i = C58056k1.m67214a(Boolean.FALSE);

    /* renamed from: j */
    public C64390ga1 f1577j;

    /* renamed from: n */
    public int f1578n;

    /* renamed from: cl1.l$a */
    public interface C0669a {
        /* renamed from: a */
        void mo635a(boolean z, C64390ga1 ga12);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0668l(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: e3 */
    public static boolean m589e3(C0668l lVar, C64337e61 e612, int i, Object obj) {
        if ((i & 1) != 0) {
            e612 = lVar.mo630d3();
        }
        lVar.getClass();
        if (e612 != null && e612.f182920d == 2) {
            return true;
        }
        if (e612 != null && e612.f182920d == 8) {
            return true;
        }
        return e612 != null && e612.f182920d == 16;
    }

    /* renamed from: f3 */
    public static boolean m590f3(C0668l lVar, C64337e61 e612, int i, Object obj) {
        if ((i & 1) != 0) {
            e612 = lVar.mo630d3();
        }
        lVar.getClass();
        return e612 != null && e612.f182920d == 8;
    }

    /* renamed from: c3 */
    public final int mo629c3(int i) {
        Class cls = C55001u.class;
        if (i == 1) {
            C64390ga1 ga12 = this.f1577j;
            if (ga12 != null) {
                return ga12.f183296e;
            }
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("anchorPreviewDuration type:");
        sb.append(i);
        sb.append(",startTime:");
        sb.append(((C55001u) business(cls)).f154420q.f182396h);
        sb.append(",end_time:");
        C64390ga1 ga13 = this.f1577j;
        sb.append(ga13 != null ? Integer.valueOf(ga13.f183298g) : null);
        Log.m105924i("LiveChargeSlice", sb.toString());
        C64390ga1 ga14 = this.f1577j;
        int i2 = (ga14 != null ? ga14.f183298g : 0) - ((C55001u) business(cls)).f154420q.f182396h;
        if (i2 < 0) {
            return 0;
        }
        return i2;
    }

    /* renamed from: d3 */
    public final C64337e61 mo630d3() {
        return ((C55001u) business(C55001u.class)).f154420q.f182363I;
    }

    /* renamed from: g3 */
    public final boolean mo631g3() {
        if (m589e3(this, (C64337e61) null, 1, (Object) null)) {
            C64337e61 d3 = mo630d3();
            if (!(d3 != null && d3.f182921e)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i3 */
    public final boolean mo632i3() {
        if (((C54991o) business(C54991o.class)).mo76004h4()) {
            C0668l lVar = (C0668l) business(C0668l.class);
            if (C58739j4.f168176a.mo83692U()) {
                Log.m105924i("LiveChargeSlice", "freeTimeWatchChargeLive " + lVar.f1578n);
            }
            return lVar.f1578n > 0;
        }
    }

    /* renamed from: j3 */
    public final void mo633j3(int i) {
        if (i != this.f1573f) {
            Log.m105924i("LiveChargeSlice", "cacheLiveMode " + i);
        }
        this.f1573f = i;
    }

    /* renamed from: k3 */
    public final void mo634k3(String str, C64390ga1 ga12) {
        int i;
        int i2;
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        C64390ga1 ga13 = this.f1577j;
        boolean z = false;
        if (!(ga13 == null || ga12 == null || (((i = ga13.f183296e) <= 0 || ga12.f183296e <= i) && ((i2 = ga13.f183298g) <= 0 || ga12.f183298g <= i2)))) {
            z = true;
        }
        if (ga12 != null) {
            this.f1577j = ga12;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" update trialInfo to:");
            sb.append("FinderLiveUrlOption:[" + ga12.f183296e + ',' + ga12.f183298g + ']');
            sb.append(",increaseChargeFreeTimeDuration:");
            sb.append(((Boolean) ((C58052j1) this.f1576i).getValue()).booleanValue());
            sb.append(",notify:");
            sb.append(z);
            sb.append('!');
            Log.m105924i("LiveChargeSlice", sb.toString());
        }
        C0669a aVar = this.f1575h;
        if (aVar != null) {
            aVar.mo635a(z, this.f1577j);
        }
        ((C58052j1) this.f1576i).setValue(Boolean.valueOf(z));
    }

    public void onCleared() {
        this.f1578n = 0;
        this.f1575h = null;
    }
}
