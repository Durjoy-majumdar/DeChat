package ne1;

import com.tencent.p014mm.sdk.platformtools.Log;
import ei3.C86522b;
import fe1.C58961d;
import fe1.C58969q;
import gy3.C87412m;
import ht1.C46109j3;
import ht1.C8794p5;
import pe3.C89349b;
import te3.C52098yc1;
import zc1.C66785b;

@C86522b
/* renamed from: ne1.d0 */
public final class C47231d0 extends C61685z0<C52098yc1> implements C46109j3 {
    /* renamed from: cc */
    public void mo71552cc(long j, int i, C8794p5<C52098yc1> p5Var) {
        C52098yc1 yc12 = new C52098yc1();
        yc12.f145228d = j;
        yc12.f145229e = i;
        C61685z0.Ax0(this, yc12, p5Var, false, false, 12, (Object) null);
    }

    public C89349b vx0(Object obj) {
        C52098yc1 yc12 = (C52098yc1) obj;
        C87412m.m108594g(yc12, "cmdBufItem");
        return C89349b.m111674a(yc12.toByteArray());
    }

    public int xx0() {
        return 19;
    }

    public String yx0() {
        return "Finder.FinderModMessageRedDot";
    }

    public void zx0(Object obj, int i) {
        C58961d.C58963b bVar;
        C58969q b;
        C52098yc1 yc12 = (C52098yc1) obj;
        C87412m.m108594g(yc12, "cmdBufItem");
        Log.m105924i("Finder.FinderModMessageRedDot", "handleUpdateResult cmdBufItem retCode:" + i + " status:" + yc12.f145228d + " switch:" + yc12.f145229e);
        if (i != -1 && (b = bVar.mo84155b(C66785b.f191882e.mo90662O5())) != null) {
            b.field_messageStatus = yc12.f145229e == 0 ? b.field_messageStatus & (~yc12.f145228d) : b.field_messageStatus | yc12.f145228d;
            Log.m105924i("Finder.FinderModMessageRedDot", "handleUpdateResult field_messageStatus" + b.field_messageStatus);
            (bVar = C58961d.f168673a).mo84166o(b);
        }
    }
}
