package zg1;

import cl1.C54979h1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import er1.C58739j4;
import fj1.C45795b;
import gy3.C87412m;
import java.util.LinkedList;
import nj3.C76912y0;
import o40.C61937h;
import pe3.C89349b;
import sx3.C110818d0;
import te3.C51298su0;
import te3.C52013xs0;
import yg1.C16006g;

/* renamed from: zg1.e0 */
public final class C16171e0 extends C16006g {

    /* renamed from: c */
    public final String f43361c = "LivePromoteStatusInterceptor";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16171e0(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: d */
    public void mo14632d(LinkedList<C52013xs0> linkedList) {
        C87412m.m108594g(linkedList, "msgList");
        C52013xs0 xs02 = (C52013xs0) C110818d0.m150925W(linkedList);
        C51298su0 su02 = new C51298su0();
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
                su02.parseFrom(bArr);
            }
        }
        Log.m105924i(this.f43361c, "recive promote msg: " + C61937h.m72709h(su02));
        if (C58739j4.f168176a.mo83692U()) {
            C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) "收到留资dimiss通知", 0).show();
        }
        ((C54979h1) this.f43066a.mo71262a(C54979h1.class)).f154115G.postValue(su02);
    }

    /* renamed from: g */
    public int[] mo14635g() {
        return new int[]{20085};
    }
}
