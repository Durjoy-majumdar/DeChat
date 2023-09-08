package er1;

import c30.C104289g;
import com.tencent.p014mm.autogen.mmdata.rpt.LiveAudienceCommodityLogStruct;
import gy3.C87412m;
import z04.C112551y;
import zc1.C66785b;

/* renamed from: er1.c1 */
public final class C7788c1 {

    /* renamed from: a */
    public static final C7788c1 f26289a = new C7788c1();

    /* renamed from: a */
    public final void mo8898a(String str, String str2, boolean z) {
        C87412m.m108594g(str, "coupon_id");
        C87412m.m108594g(str2, "noticeid");
        C104289g gVar = new C104289g();
        gVar.put("finderuin", C66785b.f191882e.mo90662O5());
        gVar.put("coupon_id", str);
        gVar.put("noticeid", str2);
        gVar.mo145953n("ui_position", z ? 2 : 1);
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "paramsJson.toString()");
        LiveAudienceCommodityLogStruct liveAudienceCommodityLogStruct = new LiveAudienceCommodityLogStruct();
        liveAudienceCommodityLogStruct.mo76270s("click_get_coupon_btn_after_reserve_of_profile");
        liveAudienceCommodityLogStruct.mo76271t(C112551y.m153814n(gVar2, ",", ";", false));
        liveAudienceCommodityLogStruct.mo86054n();
    }

    /* renamed from: b */
    public final void mo8899b(String str, String str2, boolean z) {
        C87412m.m108594g(str, "coupon_id");
        C87412m.m108594g(str2, "noticeid");
        C104289g gVar = new C104289g();
        gVar.put("finderuin", C66785b.f191882e.mo90662O5());
        gVar.put("coupon_id", str);
        gVar.put("noticeid", str2);
        gVar.mo145953n("ui_position", z ? 2 : 1);
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "paramsJson.toString()");
        LiveAudienceCommodityLogStruct liveAudienceCommodityLogStruct = new LiveAudienceCommodityLogStruct();
        liveAudienceCommodityLogStruct.mo76270s("expose_get_coupon_btn_after_reserve_of_profile");
        liveAudienceCommodityLogStruct.mo76271t(C112551y.m153814n(gVar2, ",", ";", false));
        liveAudienceCommodityLogStruct.mo86054n();
    }
}
