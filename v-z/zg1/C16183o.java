package zg1;

import cj1.C54843w3;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import gy3.C87412m;
import java.util.LinkedList;
import pe3.C89349b;
import sx3.C110818d0;
import te3.C52013xs0;
import te3.C64295cs1;
import yg1.C16006g;

/* renamed from: zg1.o */
public final class C16183o extends C16006g {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16183o(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: d */
    public void mo14632d(LinkedList<C52013xs0> linkedList) {
        C87412m.m108594g(linkedList, "msgList");
        C52013xs0 xs02 = (C52013xs0) C110818d0.m150925W(linkedList);
        if (xs02 != null) {
            C54843w3 w3Var = C54843w3.f153747a;
            C45795b bVar = this.f43066a;
            C64295cs1 cs12 = new C64295cs1();
            C89349b bVar2 = xs02.f144906h;
            byte[] f = bVar2 != null ? bVar2.mo123703f() : null;
            if (f != null) {
                try {
                    cs12.parseFrom(f);
                } catch (Exception e) {
                    Log.printDebugStack("safeParser", "", e);
                }
                w3Var.mo75787b(bVar, cs12);
            }
            cs12 = null;
            w3Var.mo75787b(bVar, cs12);
        }
    }

    /* renamed from: g */
    public int[] mo14635g() {
        return new int[]{20040};
    }
}
