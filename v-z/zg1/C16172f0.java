package zg1;

import cl1.C54994o1;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import gy3.C87412m;
import java.util.LinkedList;
import pe3.C89349b;
import sx3.C110818d0;
import te3.C52013xs0;
import te3.C52308zu0;
import yg1.C16006g;

/* renamed from: zg1.f0 */
public final class C16172f0 extends C16006g {

    /* renamed from: c */
    public final String f43362c = "LiveSingSongMsgInterceptor";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16172f0(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: d */
    public void mo14632d(LinkedList<C52013xs0> linkedList) {
        Class cls = C54994o1.class;
        C87412m.m108594g(linkedList, "msgList");
        C52013xs0 xs02 = (C52013xs0) C110818d0.m150925W(linkedList);
        C52308zu0 zu02 = new C52308zu0();
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
                zu02.parseFrom(bArr);
            }
        }
        Log.m105924i(this.f43362c, "from msg SingingSongName: " + zu02.f146225d);
        ((C54994o1) this.f43066a.mo71262a(cls)).f154403j = zu02.f146226e;
        ((C54994o1) this.f43066a.mo71262a(cls)).f154400g.postValue(zu02.f146225d);
    }

    /* renamed from: g */
    public int[] mo14635g() {
        return new int[]{20066};
    }
}
