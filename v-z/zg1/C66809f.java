package zg1;

import cl1.C55001u;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import gy3.C87412m;
import java.util.LinkedList;
import pe3.C89349b;
import sk1.C63947a;
import sx3.C110818d0;
import te3.C52013xs0;
import te3.C64273c21;
import te3.C64338e71;
import te3.C64759uu0;
import yg1.C16006g;

/* renamed from: zg1.f */
public final class C66809f extends C16006g {

    /* renamed from: c */
    public final String f191934c = "LiveAppMsgReplayTransitionInterceptor";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66809f(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: d */
    public void mo14632d(LinkedList<C52013xs0> linkedList) {
        Class cls = C55001u.class;
        C87412m.m108594g(linkedList, "msgList");
        C52013xs0 xs02 = (C52013xs0) C110818d0.m150916N(linkedList);
        C64759uu0 uu02 = new C64759uu0();
        if (xs02 != null) {
            byte[] bArr = null;
            if (!(xs02.f144906h != null)) {
                xs02 = null;
            }
            if (xs02 != null) {
                C89349b bVar = xs02.f144906h;
                if (bVar != null) {
                    bArr = bVar.mo123703f();
                }
                uu02.parseFrom(bArr);
            }
        }
        String str = this.f191934c;
        StringBuilder sb = new StringBuilder();
        sb.append("receive replay transition info = ");
        C63947a aVar = C63947a.f181274a;
        sb.append(aVar.mo88727m(uu02.f185793d));
        sb.append(',');
        sb.append(aVar.mo88728n(uu02.f185794e));
        Log.m105924i(str, sb.toString());
        C64273c21 c212 = ((C55001u) this.f43066a.mo71262a(cls)).f154420q;
        C64338e71 e712 = ((C55001u) this.f43066a.mo71262a(cls)).f154420q.f182388Z;
        if (e712 == null) {
            e712 = new C64338e71();
        }
        c212.f182388Z = e712;
        C64338e71 e713 = ((C55001u) this.f43066a.mo71262a(cls)).f154420q.f182388Z;
        if (e713 != null) {
            e713.f182933i = uu02.f185793d;
            e713.f182934j = uu02.f185794e;
        }
        ((C55001u) this.f43066a.mo71262a(cls)).mo76033c3();
    }

    /* renamed from: g */
    public int[] mo14635g() {
        return new int[]{20079};
    }
}
