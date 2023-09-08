package bp1;

import a14.C53973z1;
import ak1.C54067f0;
import ak1.C54116w;
import cl1.C39970c;
import cl1.C54991o;
import cl1.C55001u;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.finder.live.infrastructure.livedata.LiveMutableData;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import d50.C58115i;
import di3.C7335d;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.CancellationException;
import org.json.JSONObject;
import pg1.C62283d;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sg1.C13677a;
import sk1.C63947a;
import te3.C64273c21;
import te3.C64390ga1;
import zc1.C66785b;

/* renamed from: bp1.d */
public final class C54519d extends C39970c<C45795b> {

    /* renamed from: A */
    public int f152839A;

    /* renamed from: B */
    public float f152840B;

    /* renamed from: C */
    public boolean f152841C;

    /* renamed from: D */
    public boolean f152842D;

    /* renamed from: E */
    public C53973z1 f152843E;

    /* renamed from: F */
    public final C13601g f152844F;

    /* renamed from: G */
    public long f152845G;

    /* renamed from: f */
    public boolean f152846f;

    /* renamed from: g */
    public long f152847g;

    /* renamed from: h */
    public LiveMutableData<Boolean> f152848h = new LiveMutableData<>();

    /* renamed from: i */
    public int f152849i;

    /* renamed from: j */
    public int f152850j;

    /* renamed from: n */
    public C58115i.C58119d f152851n = C58115i.C58119d.NORMAL_MODE;

    /* renamed from: o */
    public C58115i.C58117b f152852o;

    /* renamed from: p */
    public boolean f152853p;

    /* renamed from: q */
    public int f152854q;

    /* renamed from: r */
    public int f152855r;

    /* renamed from: s */
    public boolean f152856s;

    /* renamed from: t */
    public int f152857t;

    /* renamed from: u */
    public int f152858u;

    /* renamed from: v */
    public boolean f152859v;

    /* renamed from: w */
    public boolean f152860w;

    /* renamed from: x */
    public boolean f152861x;

    /* renamed from: y */
    public String f152862y;

    /* renamed from: z */
    public String f152863z;

    /* renamed from: bp1.d$a */
    public interface C54520a {
        /* renamed from: a */
        void mo75381a(boolean z);
    }

    /* renamed from: bp1.d$b */
    public static final class C54521b {

        /* renamed from: a */
        public String f152864a;

        /* renamed from: b */
        public String f152865b;

        /* renamed from: c */
        public String f152866c;

        public C54521b() {
            this((String) null, (String) null, (String) null, 7, (C8480h) null);
        }

        public C54521b(String str, String str2, String str3, int i, C8480h hVar) {
            str = (i & 1) != 0 ? "" : str;
            str2 = (i & 2) != 0 ? "" : str2;
            str3 = (i & 4) != 0 ? "" : str3;
            C87412m.m108594g(str, "session");
            C87412m.m108594g(str2, "productId");
            C87412m.m108594g(str3, FirebaseAnalytics.C113379b.SOURCE);
            this.f152864a = str;
            this.f152865b = str2;
            this.f152866c = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C54521b)) {
                return false;
            }
            C54521b bVar = (C54521b) obj;
            return C87412m.m108589b(this.f152864a, bVar.f152864a) && C87412m.m108589b(this.f152865b, bVar.f152865b) && C87412m.m108589b(this.f152866c, bVar.f152866c);
        }

        public int hashCode() {
            return (((this.f152864a.hashCode() * 31) + this.f152865b.hashCode()) * 31) + this.f152866c.hashCode();
        }

        public String toString() {
            return "session:" + this.f152864a + ",productId:" + this.f152865b + ",source:" + this.f152866c;
        }
    }

    /* renamed from: bp1.d$c */
    public static final class C54522c extends C87413o implements C32224a<C54521b> {

        /* renamed from: d */
        public static final C54522c f152867d = new C54522c();

        public C54522c() {
            super(0);
        }

        public Object invoke() {
            return new C54521b((String) null, (String) null, (String) null, 7, (C8480h) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54519d(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
        new C64273c21();
        this.f152852o = C58115i.C58117b.NORMAL_MODE;
        this.f152858u = -1;
        this.f152862y = "";
        this.f152863z = "";
        this.f152840B = 1.0f;
        this.f152844F = C36568h.m40985a(C54522c.f152867d);
    }

    /* renamed from: k3 */
    public static int m61244k3(C54519d dVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        dVar.getClass();
        C13677a aVar = C13677a.f38723a;
        C64390ga1 ga12 = dVar.mo75372e3().f182362H;
        if (((Boolean) ((C36570n) C13677a.f38724b).getValue()).booleanValue()) {
            return 180;
        }
        return C63947a.f181274a.mo88723i(ga12, i);
    }

    /* renamed from: F3 */
    public final void mo75361F3(int i) {
        Log.m105924i("MMFinder.LiveReplaySlice", "play offset:" + i);
        String valueOf = String.valueOf(i);
        C87412m.m108594g(valueOf, "<set-?>");
        ((C62283d) business(C62283d.class)).f177050g = valueOf;
        this.f152854q = i;
    }

    /* renamed from: G3 */
    public final void mo75362G3(int i) {
        if (i != this.f152857t) {
            Log.m105924i("MMFinder.LiveReplaySlice", "orgi_duration:" + i);
        }
        this.f152857t = i;
    }

    /* renamed from: I3 */
    public final void mo75363I3(int i, Boolean bool) {
        if (bool != null) {
            this.f152856s = bool.booleanValue();
        }
        if (i != this.f152857t) {
            Log.m105924i("MMFinder.LiveReplaySlice", "setOrigDura from:" + this.f152857t + " to " + i + ",fromServer:" + bool);
        }
        mo75362G3(i);
    }

    /* renamed from: J3 */
    public final void mo75364J3(boolean z) {
        Log.m105924i("MMFinder.LiveReplaySlice", "playTransition:" + this.f152846f + " -> " + z + '!');
        this.f152846f = z;
    }

    /* renamed from: K3 */
    public final void mo75365K3(int i) {
        if (i != this.f152849i) {
            Log.m105924i("MMFinder.LiveReplaySlice", "replayStartOffset from:" + this.f152849i + " to " + i);
            this.f152849i = i;
        }
    }

    /* renamed from: L3 */
    public final void mo75366L3(int i) {
        if (i != this.f152850j) {
            Log.m105924i("MMFinder.LiveReplaySlice", "replayStatus from:" + this.f152850j + " to " + i);
            this.f152850j = i;
        }
    }

    /* renamed from: M3 */
    public final void mo75367M3(int i) {
        if (i != this.f152855r) {
            Log.m105924i("MMFinder.LiveReplaySlice", "play total:" + i);
        }
        this.f152855r = i;
    }

    /* renamed from: N3 */
    public final void mo75368N3(C58115i.C58119d dVar) {
        C87412m.m108594g(dVar, "value");
        if (dVar != this.f152851n) {
            Log.m105924i("MMFinder.LiveReplaySlice", "uiStatus from:" + this.f152851n + " to " + dVar);
            this.f152851n = dVar;
        }
    }

    /* renamed from: O3 */
    public final void mo75369O3(C58115i.C58117b bVar) {
        C87412m.m108594g(bVar, "value");
        if (this.f152852o == bVar) {
            Log.m105924i("MMFinder.LiveReplaySlice", "set liveMode:" + this.f152852o + '!');
        }
        this.f152852o = bVar;
    }

    /* renamed from: c3 */
    public final String mo75370c3() {
        FinderObject finderObject = ((C54991o) business(C54991o.class)).f154341n;
        String str = finderObject != null ? finderObject.username : null;
        return str == null ? "" : str;
    }

    /* renamed from: d3 */
    public final long mo75371d3() {
        return mo75372e3().f182392d;
    }

    /* renamed from: e3 */
    public final C64273c21 mo75372e3() {
        return ((C55001u) business(C55001u.class)).f154420q;
    }

    /* renamed from: f3 */
    public final long mo75373f3() {
        FinderObject finderObject = ((C54991o) business(C54991o.class)).f154341n;
        if (finderObject != null) {
            return finderObject.f164794id;
        }
        return 0;
    }

    /* renamed from: g3 */
    public final C54521b mo75374g3() {
        return (C54521b) ((C36570n) this.f152844F).getValue();
    }

    /* renamed from: i3 */
    public final int mo75375i3() {
        int i = this.f152855r;
        return i > 0 ? i : this.f152857t;
    }

    /* renamed from: j3 */
    public final boolean mo75376j3() {
        return (mo75370c3().length() > 0) && C87412m.m108589b(mo75370c3(), C66785b.f191882e.mo90662O5());
    }

    /* renamed from: l3 */
    public final void mo75377l3(int i) {
        C54067f0.C54076o0 o0Var = C54067f0.C54076o0.REPLAY_TRANSITION;
        Class cls = C54116w.class;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", i);
        if (i == 1) {
            this.f152845G = System.currentTimeMillis();
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w.Ex0((C54116w) c, o0Var, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
        } else if (i == 2 && this.f152845G != 0) {
            jSONObject.put("pad_duration", System.currentTimeMillis() - this.f152845G);
            this.f152845G = 0;
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w.Ex0((C54116w) c2, o0Var, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
        }
    }

    /* renamed from: m3 */
    public final void mo75378m3(int i) {
        if (i != this.f152858u) {
            Log.m105924i("MMFinder.LiveReplaySlice", "cacheReplayStatus from " + this.f152858u + " to " + i);
        }
        this.f152858u = i;
    }

    /* renamed from: n3 */
    public final void mo75379n3(boolean z) {
        Log.m105924i("MMFinder.LiveReplaySlice", "manualClose:" + z);
        this.f152859v = z;
    }

    /* renamed from: o3 */
    public final void mo75380o3(boolean z) {
        Log.m105924i("MMFinder.LiveReplaySlice", "manualMinimum:" + z);
        this.f152860w = z;
    }

    public void onCleared() {
        super.onCleared();
        Log.m105924i("MMFinder.LiveReplaySlice", "onCleared");
        mo75361F3(0);
        mo75367M3(0);
        this.f152856s = false;
        mo75362G3(0);
        this.f152847g = 0;
        mo75365K3(0);
        mo75379n3(false);
        mo75380o3(false);
        mo75369O3(C58115i.C58117b.NORMAL_MODE);
        C53973z1 z1Var = this.f152843E;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f152841C = false;
        this.f152842D = false;
        mo75364J3(false);
        this.f152861x = false;
        this.f152840B = 1.0f;
    }
}
