package ue1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C31922b1;
import f62.C75700k0;
import gy3.C87412m;
import java.util.Map;
import ob0.C35136m;
import sf0.C48374j0;
import te3.C51771w2;
import te3.C77949j3;

/* renamed from: ue1.d0 */
public final class C37427d0 implements C31922b1 {
    /* renamed from: X5 */
    public C35136m.C35139b mo10269X5(String str, Map<String, String> map, C35136m.C35137a aVar) {
        C87412m.m108594g(map, "values");
        C87412m.m108594g(aVar, "addMsgInfo");
        Object obj = aVar.f94248g;
        if ((obj instanceof C51771w2) && aVar.f94249h == 1) {
            C77949j3 j3Var = aVar.f94242a;
            C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AddBypMsg");
            String str2 = ((C51771w2) obj).f143819e;
            Log.m105924i("FinderPrivateSysMsgConsumer", String.valueOf(str));
            if (Util.isNullOrNil(C48374j0.m53718g(j3Var != null ? j3Var.f227631h : null))) {
                Log.m105928w("FinderPrivateSysMsgConsumer", "msg content is null");
                return null;
            }
            String g = C48374j0.m53718g(j3Var != null ? j3Var.f227628e : null);
            long j = 0;
            C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).h30(g, j3Var != null ? j3Var.f227638r : 0);
            h302.mo108745Y2(j3Var != null ? j3Var.f227638r : 0);
            if (j3Var != null) {
                j = (long) j3Var.f227635o;
            }
            h302.mo108733M2(C75604z3.m90841m(g, j));
            h302.setType(10000);
            h302.mo108732L2(map.get(".sysmsg.SysMsgContent"));
            h302.mo108740T2(0);
            h302.mo108749c3(str2);
            h302.mo101012p4(j3Var != null ? j3Var.f227636p : null);
            h302.mo108743W2(h302.f230723F & -129);
            C75604z3.m90852x(h302);
        }
        return null;
    }
}
