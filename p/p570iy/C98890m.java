package p570iy;

import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94928p2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import di3.C86312j;
import gy3.C87412m;
import ks2.C99205z;
import ms2.C47100l;
import os2.C100422y;
import p606mm.C99933h;
import u73.C101980n;
import vr2.C102236a0;

/* renamed from: iy.m */
public class C98890m implements C94928p2.C94934f {
    public void onPostEnd(int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onPostEnd", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener");
        SnsMethodCalculate.markStartTimeMs("reportTagSearchOnSnsPostEnd", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener");
        if (!z) {
            SnsMethodCalculate.markEndTimeMs("reportTagSearchOnSnsPostEnd", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener");
        } else if (!((C101980n) C86312j.m106911c(C101980n.class)).mo134684EO()) {
            SnsMethodCalculate.markEndTimeMs("reportTagSearchOnSnsPostEnd", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener");
        } else if (i <= 0) {
            SnsMethodCalculate.markEndTimeMs("reportTagSearchOnSnsPostEnd", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener");
        } else {
            ((C99933h) C86312j.m106911c(C99933h.class)).at0(2, "SnsPostEnd_" + i, C47100l.class, new C98889l(this, i));
            SnsMethodCalculate.markEndTimeMs("reportTagSearchOnSnsPostEnd", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener");
        }
        SnsMethodCalculate.markStartTimeMs("reportTextSubmitOnPostEnd", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener");
        C99205z a = C99205z.f290902j.mo138557a();
        if (a != null) {
            SnsInfo LL = C94866e1.Yx0().mo139800LL(i);
            if (LL != null) {
                long j = LL.field_snsId;
                if (j != 0) {
                    String q0 = C102236a0.m134765q0(j);
                    SnsMethodCalculate.markStartTimeMs("setPublishFeedId", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
                    C87412m.m108594g(q0, "<set-?>");
                    a.f290905b = q0;
                    SnsMethodCalculate.markEndTimeMs("setPublishFeedId", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
                }
            }
            SnsMethodCalculate.markStartTimeMs("setOpResult", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
            a.f290912i = 1;
            SnsMethodCalculate.markEndTimeMs("setOpResult", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
            a.mo138554b();
        }
        SnsMethodCalculate.markEndTimeMs("reportTextSubmitOnPostEnd", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener");
        SnsMethodCalculate.markEndTimeMs("onPostEnd", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener");
    }

    public void updateBackView(C100422y yVar) {
        SnsMethodCalculate.markStartTimeMs("updateBackView", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener");
        SnsMethodCalculate.markEndTimeMs("updateBackView", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener");
    }
}
