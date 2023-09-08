package ty0;

import com.tencent.p014mm.modelimage.C92808c;
import com.tencent.p014mm.modelimage.C92855q0;
import di3.C86312j;
import gy3.C87412m;
import p682rz.C101483l;
import p682rz.C101486p;
import pc0.C100760a0;
import sy0.C101709c;
import sy0.C101710e;
import sy0.C48504d;

/* renamed from: ty0.d */
public final class C101933d extends C101934e {

    /* renamed from: d */
    public final C101932a f300110d;

    public C101933d(C101932a aVar) {
        C87412m.m108594g(aVar, "sendMsgInterceptorsImpl");
        this.f300110d = aVar;
    }

    /* renamed from: B */
    public C100760a0.C100761a mo141430B(C100760a0.C100764f fVar) {
        C100760a0.C100761a aVar = new C100760a0.C100761a();
        if (fVar instanceof C92808c) {
            C92808c cVar = (C92808c) fVar;
            String str = cVar.f295187a;
            C101932a aVar2 = this.f300110d;
            C87412m.m108593f(str, "sessionId");
            String n0 = aVar2.mo126123n0(str);
            cVar.f295188b = this.f300110d.mo126122j0(str);
            int g0 = this.f300110d.mo126121g0();
            String str2 = cVar.f295188b;
            C87412m.m108593f(str2, "params.fromUser");
            aVar.f295177a = new C101709c(g0, str, str2, n0, cVar);
        }
        return aVar;
    }

    /* renamed from: D */
    public C100760a0.C100761a mo141431D(C100760a0.C100764f fVar) {
        C100760a0.C100761a aVar = new C100760a0.C100761a();
        C87412m.m108591d(fVar);
        String str = fVar.f295187a;
        C101932a aVar2 = this.f300110d;
        C87412m.m108593f(str, "sessionId");
        String n0 = aVar2.mo126123n0(str);
        fVar.f295188b = this.f300110d.mo126122j0(str);
        int g0 = this.f300110d.mo126121g0();
        String str2 = fVar.f295188b;
        C87412m.m108593f(str2, "params!!.fromUser");
        String str3 = fVar.f295189c;
        C87412m.m108593f(str3, "params!!.content");
        C48504d dVar = new C48504d(g0, str, str2, n0, str3, fVar.f295192f);
        aVar.f295178b = dVar.f129726p.getMsgId();
        aVar.f295177a = dVar;
        return aVar;
    }

    /* renamed from: O */
    public C100760a0.C100761a mo126118O(C100760a0.C100764f fVar) {
        return new C100760a0.C100761a();
    }

    /* renamed from: q */
    public C100760a0.C100761a mo141434q(C100760a0.C100764f fVar) {
        C100760a0.C100761a aVar = new C100760a0.C100761a();
        if (fVar instanceof C92855q0) {
            C92855q0 q0Var = (C92855q0) fVar;
            int i = q0Var.f295194h;
            if (i == 1) {
                return super.mo141434q(fVar);
            }
            if (i != 4) {
                return super.mo141434q(fVar);
            }
            if (!this.f300110d.mo126119S(fVar)) {
                return super.mo141434q(fVar);
            }
            String str = q0Var.f267462E.field_toUser;
            C87412m.m108593f(str, "videoParams.cdnResult.field_toUser");
            q0Var.f295187a = this.f300110d.mo126123n0(str);
            q0Var.f295188b = this.f300110d.mo126122j0(str);
            C101483l ET = ((C101486p) C86312j.m106911c(C101486p.class)).mo140792ET(q0Var.f267460C, q0Var.f267461D, q0Var.f267462E, q0Var.f267463F);
            int g0 = this.f300110d.mo126121g0();
            String str2 = q0Var.f295188b;
            C87412m.m108593f(str2, "params.fromUser");
            String str3 = q0Var.f295187a;
            C87412m.m108593f(str3, "params.toUser");
            C87412m.m108593f(ET, "netSceneUploadVideo");
            aVar.f295177a = new C101710e(g0, str, str2, str3, ET);
        }
        return aVar;
    }
}
