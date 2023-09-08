package eb0;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import eb0.C20583z;
import gy3.C8477a0;
import gy3.C87412m;
import java.util.LinkedList;
import kotlin.Result;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import p248ug.C14184u0;
import pe3.C47465a;
import pe3.C89349b;
import te3.C22508lo3;
import te3.C64546m72;
import te3.C64614oo3;
import wx3.C15601d;

/* renamed from: eb0.y */
public final class C20582y implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ C8477a0 f57946d;

    /* renamed from: e */
    public final /* synthetic */ C15601d<C64546m72> f57947e;

    /* renamed from: f */
    public final /* synthetic */ C20583z.C20585c f57948f;

    public C20582y(C8477a0 a0Var, C15601d<? super C64546m72> dVar, C20583z.C20585c cVar) {
        this.f57946d = a0Var;
        this.f57947e = dVar;
        this.f57948f = cVar;
    }

    /* renamed from: a */
    public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        LinkedList<C22508lo3> linkedList;
        C87412m.m108594g(cVar, "rr");
        C87412m.m108594g(yVar, "<anonymous parameter 4>");
        Log.m105924i("Micromsg.BizTLRecFeedsDataUtil", "getRecommendFeeds callback " + i + ", " + i2);
        C8477a0 a0Var = this.f57946d;
        if (a0Var.f27482d) {
            C115669n.INSTANCE.idkeyStat(1590, 6, 1, false);
            return 0;
        }
        boolean z = true;
        a0Var.f27482d = true;
        String str2 = null;
        if (i == 0 && i2 == 0) {
            try {
                C115669n.INSTANCE.idkeyStat(1590, 2, 1, false);
                C47465a aVar = cVar.f127056b.f127083a;
                if (!(aVar instanceof C64546m72)) {
                    this.f57947e.resumeWith(Result.m168114constructorimpl((Object) null));
                    return 0;
                }
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetRecommendFeedsResp");
                C64546m72 m722 = (C64546m72) aVar;
                if (C14184u0.m13519a()) {
                    MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("brandService");
                    if (singleMMKV == null || singleMMKV.decodeInt("BizTimeLineRecFeedStatus", 1) != 0) {
                        z = false;
                    }
                    if (z && (linkedList = m722.f184214d) != null) {
                        linkedList.clear();
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("getRecommendFeeds card size=");
                LinkedList<C22508lo3> linkedList2 = m722.f184214d;
                sb.append(linkedList2 != null ? Integer.valueOf(linkedList2.size()) : null);
                sb.append(' ');
                C64614oo3 oo32 = m722.f184215e;
                if (oo32 != null) {
                    str2 = C20583z.f57949a.mo32232f(oo32);
                }
                sb.append(str2);
                Log.m105924i("Micromsg.BizTLRecFeedsDataUtil", sb.toString());
                C89349b bVar = m722.f184217g;
                if (bVar != null && bVar.f257327a.length > 0) {
                    C20583z.f57949a.mo32230c().encode("GetRecommendFeedsBuffer", m722.f184217g.mo123703f());
                }
                if (2 == this.f57948f.f57963d) {
                    C20583z.C20584b bVar2 = C20583z.f57949a;
                    bVar2.mo32230c().encode("RecommendFeedsWording", m722.f184216f);
                    MultiProcessMMKV c = bVar2.mo32230c();
                    C64614oo3 oo33 = m722.f184215e;
                    c.encode("ProtectionTime", oo33 != null ? oo33.f184683e : 1800);
                    MultiProcessMMKV c2 = bVar2.mo32230c();
                    C64614oo3 oo34 = m722.f184215e;
                    c2.encode("BizmsgContextCnt", oo34 != null ? oo34.f184686h : 10);
                }
                MultiProcessMMKV c3 = C20583z.f57949a.mo32230c();
                String str3 = "NextReqTime-" + this.f57948f.f57963d;
                C64614oo3 oo35 = m722.f184215e;
                c3.encode(str3, oo35 != null ? oo35.f184682d : 600);
                this.f57947e.resumeWith(Result.m168114constructorimpl(m722));
                return 0;
            } catch (Exception e) {
                C115669n.INSTANCE.idkeyStat(1590, 7, 1, false);
                Log.m105920e("Micromsg.BizTLRecFeedsDataUtil", "callback ex " + e.getMessage());
            }
        } else {
            C115669n.INSTANCE.idkeyStat(1590, 3, 1, false);
            this.f57947e.resumeWith(Result.m168114constructorimpl((Object) null));
            return 0;
        }
    }
}
