package p160gy;

import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import h81.C32735h;
import p166hy.C98562i0;
import qr2.C36069a;

@C86522b
/* renamed from: gy.q0 */
public final class C32600q0 extends C86301e implements C98562i0 {
    public VideoTransPara Gv0() {
        SnsMethodCalculate.markStartTimeMs("getCoverVideoParam", "com.tencent.mm.feature.sns.SnsCoverConfigService");
        VideoTransPara a = C36069a.f96150a.mo60516a();
        SnsMethodCalculate.markEndTimeMs("getCoverVideoParam", "com.tencent.mm.feature.sns.SnsCoverConfigService");
        return a;
    }

    public boolean Sc0() {
        SnsMethodCalculate.markStartTimeMs("checkErrorType", "com.tencent.mm.feature.sns.SnsCoverConfigService");
        SnsMethodCalculate.markStartTimeMs("checkErrorType", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_cover_error_code_check, true);
        SnsMethodCalculate.markEndTimeMs("checkErrorType", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
        SnsMethodCalculate.markEndTimeMs("checkErrorType", "com.tencent.mm.feature.sns.SnsCoverConfigService");
        return wf;
    }

    /* renamed from: rB */
    public boolean mo58707rB(long j) {
        SnsMethodCalculate.markStartTimeMs("needCheckFinderValid", "com.tencent.mm.feature.sns.SnsCoverConfigService");
        SnsMethodCalculate.markStartTimeMs("needCheckFinderValid", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
        boolean z = true;
        if (C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SNS_COVER_FINDER_CHECK_INT_SYNC, -1) == 1) {
            SnsMethodCalculate.markEndTimeMs("needCheckFinderValid", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
        } else {
            if (System.currentTimeMillis() - j > ((long) (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_sns_cover_finder_check_interval, 3600) * 1000))) {
                SnsMethodCalculate.markEndTimeMs("needCheckFinderValid", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
            } else {
                z = false;
                SnsMethodCalculate.markEndTimeMs("needCheckFinderValid", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
            }
        }
        SnsMethodCalculate.markEndTimeMs("needCheckFinderValid", "com.tencent.mm.feature.sns.SnsCoverConfigService");
        return z;
    }
}
