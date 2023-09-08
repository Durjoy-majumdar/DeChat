package ot2;

import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import p166hy.C98566n0;

@C86522b
/* renamed from: ot2.n */
public final class C100454n extends C86301e implements C98566n0 {

    /* renamed from: d */
    public final String f294281d = "MicroMsg.SnsFakeVideoResultApi";

    public void Yf0(int i, String str, String str2, byte[] bArr, int i2) {
        C100435d b;
        SnsMethodCalculate.markStartTimeMs("notifyPublishRemuxWorkResult", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoResultApi");
        C87412m.m108594g(str, "videoPath");
        C87412m.m108594g(str2, "thumbPath");
        C87412m.m108594g(bArr, "extInfo");
        String str3 = this.f294281d;
        Log.m105924i(str3, "notifyPublishRemuxWorkResult >> snsLocalId: " + i + ", workType: " + i2 + ", videoPath: " + str + ", extInfoSize: " + bArr.length);
        if (i2 == 4007 && C86013q1.m106450k(str)) {
            if (!(bArr.length == 0)) {
                Log.m105924i(this.f294281d, "notifyPublishRemuxWorkResult >> go to commit");
                C100435d d = new C100435d().mo139924d(i, bArr);
                if (!(d == null || (b = d.mo139922b(str, str2)) == null)) {
                    b.mo139923c();
                }
                SnsMethodCalculate.markEndTimeMs("notifyPublishRemuxWorkResult", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoResultApi");
            }
        }
        String str4 = this.f294281d;
        Log.m105924i(str4, "remux is error, " + i);
        SnsMethodCalculate.markStartTimeMs("updateFakeVideoFeedToDie", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
        Log.m105924i("MicroMsg.SnsTimeLineFakeViewHandler", "updateFakeVideoFeedToDie >> localId " + i);
        C94866e1.gy0().mo131200k(C94866e1.Yx0().mo139800LL(i), -1, 7, "sns BackVideo is remux error");
        SnsMethodCalculate.markEndTimeMs("updateFakeVideoFeedToDie", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
        SnsMethodCalculate.markEndTimeMs("notifyPublishRemuxWorkResult", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoResultApi");
    }
}
