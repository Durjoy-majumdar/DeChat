package lo2;

import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdSnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import java.util.LinkedList;
import lo2.C34323y0;
import rq2.C101418d;
import te3.C49365f20;
import vr2.C102236a0;
import vr2.C102259p;
import vr2.C102260r;

/* renamed from: lo2.t */
public final class C99570t {
    /* renamed from: a */
    public static void m129966a(LinkedList<C49365f20> linkedList, int i, int i2) {
        String str;
        String str2;
        int i3;
        String str3;
        int i4;
        LinkedList<C49365f20> linkedList2 = linkedList;
        int i5 = i;
        String str4 = "handleAdPullDelete";
        SnsMethodCalculate.markStartTimeMs(str4, "com.tencent.mm.plugin.sns.ad.helper.AdPullDeleteHelper");
        if (i5 > 0) {
            Log.m105924i("AdPullDeleteHelper", "handleAdPullDelete, count=" + i5 + ", scene=" + i2);
            if (linkedList2 == null || linkedList.size() != i5) {
                str2 = str4;
                StringBuilder sb = new StringBuilder();
                sb.append("handleAdPullDelete, count=");
                sb.append(i);
                sb.append(", list.size=");
                sb.append(linkedList == null ? 0 : linkedList.size());
                Log.m105920e("AdPullDeleteHelper", sb.toString());
            } else {
                C34323y0.C34324a b = C34323y0.C34324a.m40328b();
                StringBuilder sb4 = new StringBuilder();
                int i6 = 0;
                while (i6 < i5) {
                    long j = linkedList2.get(i6).f133248d;
                    String q0 = C102236a0.m134765q0(j);
                    sb4.append(q0);
                    sb4.append("|");
                    if (j != 0) {
                        AdSnsInfo jo = C94866e1.zx0().mo139864jo(j);
                        if (jo == null) {
                            sb4.append(1);
                            sb4.append(", ");
                            b.mo59560a("", q0, 1, 1);
                            Log.m105924i("AdPullDeleteHelper", "handleAdPullDelete, adSnsInfo==null, snsId=" + q0);
                        } else {
                            SnsMethodCalculate.markStartTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.helper.AdPullDeleteHelper");
                            AdSnsInfo jo4 = C94866e1.zx0().mo139864jo(j);
                            String q05 = C102236a0.m134765q0(j);
                            if (jo4 == null) {
                                Log.m105928w("AdPullDeleteHelper", "deleteAd, adSnsInfo==null, snsId=" + q05);
                                SnsMethodCalculate.markEndTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.helper.AdPullDeleteHelper");
                                str3 = str4;
                                i3 = i6;
                                i4 = 1;
                            } else {
                                str3 = str4;
                                try {
                                    SnsObject snsObject = (SnsObject) new SnsObject().parseFrom(jo4.field_attrBuf);
                                    if (snsObject == null) {
                                        Log.m105928w("AdPullDeleteHelper", "deleteAd, snsObject==null, snsId=" + q05);
                                        SnsMethodCalculate.markEndTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.helper.AdPullDeleteHelper");
                                        i3 = i6;
                                        i4 = 4;
                                    } else {
                                        boolean H = C102260r.m134839H(snsObject, C75592q0.m90789s());
                                        boolean z = (jo4.field_localFlag & 128) > 0;
                                        StringBuilder sb5 = new StringBuilder();
                                        i3 = i6;
                                        try {
                                            sb5.append("deleteAd, hasCommentLike=");
                                            sb5.append(H);
                                            sb5.append(", isExposure=");
                                            sb5.append(z);
                                            sb5.append(", snsId=");
                                            sb5.append(q05);
                                            Log.m105924i("AdPullDeleteHelper", sb5.toString());
                                            if (H) {
                                                SnsMethodCalculate.markEndTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.helper.AdPullDeleteHelper");
                                                i4 = 2;
                                            } else {
                                                C101418d.m133073c(jo4);
                                                try {
                                                    try {
                                                        C102259p.m134829b(0, j, jo4.getAdInfo(), jo4.getAdXml());
                                                    } catch (Throwable th) {
                                                        th = th;
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    try {
                                                        Log.m105920e("AdPullDeleteHelper", "deleteAd, reportAdDel exp=" + th.toString());
                                                        SnsMethodCalculate.markEndTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.helper.AdPullDeleteHelper");
                                                        i4 = 0;
                                                    } catch (Exception e) {
                                                        e = e;
                                                        Log.m105920e("AdPullDeleteHelper", "deleteAD, snsId=" + C102236a0.m134765q0(j) + ", exp=" + e.toString());
                                                        SnsMethodCalculate.markEndTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.helper.AdPullDeleteHelper");
                                                        i4 = 4;
                                                        b.mo59560a(jo.getAdInfo().uxInfo, q0, 1, i4);
                                                        sb4.append(i4);
                                                        sb4.append(", ");
                                                        i6 = i3 + 1;
                                                        linkedList2 = linkedList;
                                                        i5 = i;
                                                        str4 = str3;
                                                    }
                                                    b.mo59560a(jo.getAdInfo().uxInfo, q0, 1, i4);
                                                    sb4.append(i4);
                                                    sb4.append(", ");
                                                    i6 = i3 + 1;
                                                    linkedList2 = linkedList;
                                                    i5 = i;
                                                    str4 = str3;
                                                }
                                                SnsMethodCalculate.markEndTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.helper.AdPullDeleteHelper");
                                                i4 = 0;
                                                b.mo59560a(jo.getAdInfo().uxInfo, q0, 1, i4);
                                                sb4.append(i4);
                                                sb4.append(", ");
                                                i6 = i3 + 1;
                                                linkedList2 = linkedList;
                                                i5 = i;
                                                str4 = str3;
                                            }
                                        } catch (Exception e2) {
                                            e = e2;
                                            Log.m105920e("AdPullDeleteHelper", "deleteAD, snsId=" + C102236a0.m134765q0(j) + ", exp=" + e.toString());
                                            SnsMethodCalculate.markEndTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.helper.AdPullDeleteHelper");
                                            i4 = 4;
                                            b.mo59560a(jo.getAdInfo().uxInfo, q0, 1, i4);
                                            sb4.append(i4);
                                            sb4.append(", ");
                                            i6 = i3 + 1;
                                            linkedList2 = linkedList;
                                            i5 = i;
                                            str4 = str3;
                                        }
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    i3 = i6;
                                    Log.m105920e("AdPullDeleteHelper", "deleteAD, snsId=" + C102236a0.m134765q0(j) + ", exp=" + e.toString());
                                    SnsMethodCalculate.markEndTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.helper.AdPullDeleteHelper");
                                    i4 = 4;
                                    b.mo59560a(jo.getAdInfo().uxInfo, q0, 1, i4);
                                    sb4.append(i4);
                                    sb4.append(", ");
                                    i6 = i3 + 1;
                                    linkedList2 = linkedList;
                                    i5 = i;
                                    str4 = str3;
                                }
                            }
                            b.mo59560a(jo.getAdInfo().uxInfo, q0, 1, i4);
                            sb4.append(i4);
                            sb4.append(", ");
                            i6 = i3 + 1;
                            linkedList2 = linkedList;
                            i5 = i;
                            str4 = str3;
                        }
                    }
                    str3 = str4;
                    i3 = i6;
                    i6 = i3 + 1;
                    linkedList2 = linkedList;
                    i5 = i;
                    str4 = str3;
                }
                str2 = str4;
                b.mo59561c();
                Log.m105924i("AdPullDeleteHelper", "handleAdPullDelete, ret=" + sb4.toString());
            }
            str = str2;
        } else {
            str = str4;
        }
        SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.helper.AdPullDeleteHelper");
    }
}
