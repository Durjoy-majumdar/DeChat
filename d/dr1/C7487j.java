package dr1;

import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import dp1.C58408t0;
import gy3.C87412m;
import p256vw.C15014e;
import p256vw.C15016h;

/* renamed from: dr1.j */
public final class C7487j implements C15014e {

    /* renamed from: a */
    public final /* synthetic */ C7483i f25715a;

    public C7487j(C7483i iVar) {
        this.f25715a = iVar;
    }

    /* renamed from: a */
    public final void mo5899a(String str) {
        FinderFeedReportObject finderFeedReportObject;
        C7483i iVar = this.f25715a;
        iVar.getClass();
        if (!(str == null || str.length() == 0)) {
            if (!C87412m.m108589b(str, iVar.f25703d) && (finderFeedReportObject = C58408t0.f167337b) != null) {
                finderFeedReportObject.is_change_product_title = 1;
            }
            FinderJumpInfo finderJumpInfo = iVar.f25702c;
            if (finderJumpInfo != null) {
                finderJumpInfo.wording = str;
            }
            C15016h hVar = iVar.f25704e;
            int i = -1;
            iVar.f25705f = hVar != null ? hVar.f41144f : -1;
            if (hVar != null) {
                i = hVar.f41145g;
            }
            iVar.f25706g = i;
            iVar.f25701b.mo4600c(str, true);
            iVar.mo8625h(str);
        }
    }
}
