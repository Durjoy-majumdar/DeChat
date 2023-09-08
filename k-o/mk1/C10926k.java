package mk1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32229r;
import gy3.C87413o;
import mk1.C10906h;
import ob0.C117747y;
import qg1.C12223h0;
import te3.C50375ma1;

/* renamed from: mk1.k */
public final class C10926k extends C87413o implements C32229r<Integer, Integer, String, C117747y, C10906h.C10908b> {

    /* renamed from: d */
    public final /* synthetic */ C12223h0 f32575d;

    /* renamed from: e */
    public final /* synthetic */ C10906h f32576e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10926k(C12223h0 h0Var, C10906h hVar) {
        super(4);
        this.f32575d = h0Var;
        this.f32576e = hVar;
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        String str = (String) obj3;
        C117747y yVar = (C117747y) obj4;
        if ((intValue != 0 || intValue2 != 0) && intValue2 != -200008) {
            return new C10906h.C10908b.C10909a(intValue2);
        }
        C50375ma1 l1 = this.f32575d.mo11955l1();
        String str2 = this.f32576e.f32537d;
        Log.m105924i(str2, "prepareLive,is verify:" + l1.f137923d);
        return !l1.f137923d ? new C10906h.C10908b.C10910b(l1) : new C10906h.C10908b.C10911c();
    }
}
