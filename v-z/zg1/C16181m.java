package zg1;

import cj1.C0556j5;
import cj1.C54843w3;
import cl1.C0702z0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import gy3.C87412m;
import java.util.LinkedList;
import pe3.C89349b;
import sx3.C110818d0;
import te3.C51595ut0;
import te3.C52013xs0;
import te3.C64674r41;
import yg1.C16006g;

/* renamed from: zg1.m */
public final class C16181m extends C16006g {

    /* renamed from: c */
    public final String f43373c = "LiveCommonSysMsgInterceptor";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16181m(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: d */
    public void mo14632d(LinkedList<C52013xs0> linkedList) {
        C87412m.m108594g(linkedList, "msgList");
        C52013xs0 xs02 = (C52013xs0) C110818d0.m150925W(linkedList);
        C51595ut0 ut02 = new C51595ut0();
        boolean z = true;
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
                ut02.parseFrom(bArr);
            }
        }
        Log.m105924i(this.f43373c, "from msg commonSysMsg content: " + ut02.f143114d);
        String str = ut02.f143114d;
        if (!(str == null || str.length() == 0)) {
            z = false;
        }
        if (!z) {
            C54843w3 w3Var = C54843w3.f153747a;
            C45795b bVar2 = this.f43066a;
            String str2 = ut02.f143114d;
            if (bVar2 != null) {
                C64674r41 r412 = new C64674r41();
                r412.f185127g = 10001;
                r412.f185126f = str2;
                ((C0702z0) bVar2.mo71262a(C0702z0.class)).f1672f.add(new C0556j5(r412));
            }
        }
    }

    /* renamed from: g */
    public int[] mo14635g() {
        return new int[]{20072};
    }
}
