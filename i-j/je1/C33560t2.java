package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import it1.C60628i;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C47350c;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C26236u;
import te3.C49276ef0;
import te3.C49551gf0;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C49966ja;

/* renamed from: je1.t2 */
public final class C33560t2 extends C60628i {

    /* renamed from: g */
    public final List<Integer> f90858g;

    /* renamed from: h */
    public final String f90859h = "Finder.NetSceneFinderAdFeedback";

    /* renamed from: i */
    public C47350c f90860i;

    /* renamed from: j */
    public C11385n f90861j;

    /* renamed from: je1.t2$a */
    public static final class C33561a extends C87413o implements C32226l<Integer, CharSequence> {

        /* renamed from: d */
        public static final C33561a f90862d = new C33561a();

        public C33561a() {
            super(1);
        }

        public Object invoke(Object obj) {
            return String.valueOf(((Number) obj).intValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33560t2(boolean z, List<Integer> list, long j, int i, String str, String str2) {
        super((C49712hj1) null, 1, (C8480h) null);
        boolean z2 = z;
        String str3 = str;
        String str4 = str2;
        C87412m.m108594g(list, "reasonIdList");
        C87412m.m108594g(str3, "reportExtraData");
        C87412m.m108594g(str4, "bypassData");
        int i2 = 1;
        this.f90858g = list;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 8432;
        C49551gf0 gf02 = new C49551gf0();
        gf02.f134009e = new LinkedList<>(list);
        gf02.f134010f = str3;
        gf02.f134011g = str4;
        C46523h2 h2Var = C46523h2.f125330a;
        C49842ig0 a = h2Var.mo71859a(8432);
        gf02.f134008d = a;
        gf02.f134012h = !z2 ? 2 : i2;
        h2Var.mo71865g(a, C26236u.m33719b(new C13604l(Integer.valueOf(i), Long.valueOf(j))), (C49712hj1) null);
        bVar.f127066a = gf02;
        C49276ef0 ef02 = new C49276ef0();
        ef02.setBaseResponse(new C49966ja());
        bVar.f127067b = ef02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderadfeedback";
        this.f90860i = bVar.mo72403a();
        Log.m105924i("Finder.NetSceneFinderAdFeedback", "NetSceneFinderAdFeedback isPositive=" + z + ", reasonList=[" + C110818d0.m150921S(list, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C33561a.f90862d, 31, (Object) null) + ']');
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f90861j = nVar;
        Log.m105924i(this.f90859h, "NetSceneFinderAdFeedback doScene");
        return dispatch(gVar, this.f90860i, this);
    }

    public int getType() {
        return 8432;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2 = this.f90859h;
        Log.m105924i(str2, "NetSceneFinderAdFeedback onGYNetEnd " + i2 + ' ' + i3 + ' ' + str + ' ');
        C11385n nVar = this.f90861j;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
