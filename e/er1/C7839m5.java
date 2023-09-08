package er1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import pe3.C89349b;
import te3.C49352ez;
import te3.C51398th3;

/* renamed from: er1.m5 */
public final class C7839m5 {
    /* renamed from: a */
    public static final C49352ez m7985a(C51398th3 th32) {
        C87412m.m108594g(th32, "<this>");
        if (th32.f142231q == 1) {
            try {
                C49352ez ezVar = new C49352ez();
                C89349b bVar = th32.f142232r;
                ezVar.parseFrom(bVar != null ? bVar.mo123703f() : null);
                return ezVar;
            } catch (Exception e) {
                Log.m105920e("ProductFuncObject", "getFirstCouponInfoInJumpInfo " + e);
            }
        }
        return null;
    }
}
