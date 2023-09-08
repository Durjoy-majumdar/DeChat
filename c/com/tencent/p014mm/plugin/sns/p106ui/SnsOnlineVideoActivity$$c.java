package com.tencent.p014mm.plugin.sns.p106ui;

import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import da0.C58247e;
import di3.C86312j;
import java.io.IOException;
import kg3.C76577a;
import te3.e94;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$$c */
public final /* synthetic */ class SnsOnlineVideoActivity$$c implements SnsOnlineVideoActivity$$j {

    /* renamed from: a */
    public final /* synthetic */ SnsOnlineVideoActivity f278418a;

    /* renamed from: b */
    public final /* synthetic */ String f278419b;

    public /* synthetic */ SnsOnlineVideoActivity$$c(SnsOnlineVideoActivity snsOnlineVideoActivity, String str) {
        this.f278418a = snsOnlineVideoActivity;
        this.f278419b = str;
    }

    /* renamed from: a */
    public final void mo132876a() {
        SnsOnlineVideoActivity snsOnlineVideoActivity = this.f278418a;
        String str = this.f278419b;
        int i = SnsOnlineVideoActivity.f278370y0;
        snsOnlineVideoActivity.getClass();
        SnsMethodCalculate.markStartTimeMs("lambda$initSeekBar$0", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        SnsMethodCalculate.markStartTimeMs("dealThirdJumperLocation", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        str.getClass();
        if (str.equals("APP_TYPE_SECOND_CUP")) {
            snsOnlineVideoActivity.mo132870R7((String) null);
        }
        SnsMethodCalculate.markEndTimeMs("dealThirdJumperLocation", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        SnsMethodCalculate.markStartTimeMs("initCutSame", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        SnsInfo snsInfo = snsOnlineVideoActivity.f278403n;
        if (snsInfo == null) {
            Log.m105924i("MicroMsg.SnsOnlineVideoActivity", "snsInfo is null, return");
            SnsMethodCalculate.markEndTimeMs("initCutSame", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        } else {
            TimeLineObject timeLine = snsInfo.getTimeLine();
            e94 e94 = timeLine.videoTemplate;
            if (e94 == null || TextUtils.isEmpty(e94.f182943e)) {
                Log.m105924i("MicroMsg.SnsOnlineVideoActivity", "no template info");
                SnsMethodCalculate.markEndTimeMs("initCutSame", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            } else {
                String str2 = timeLine.videoTemplate.f182942d;
                if (str2 == null || !str2.equals("miaojian")) {
                    Log.m105924i("MicroMsg.SnsOnlineVideoActivity", "not miaojian video");
                    SnsMethodCalculate.markEndTimeMs("initCutSame", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                } else if (!((C58247e) C86312j.m106911c(C58247e.class)).ni0().mo72160b(timeLine.videoTemplate.f182945g)) {
                    Log.m105924i("MicroMsg.SnsOnlineVideoActivity", "do not match condition");
                    SnsMethodCalculate.markEndTimeMs("initCutSame", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                } else {
                    Log.m105924i("MicroMsg.SnsOnlineVideoActivity", "init template info");
                    snsOnlineVideoActivity.f278408r.mo132355r(C76577a.m92151b(snsOnlineVideoActivity.getContext(), 56), false);
                    SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
                    String str3 = snsOnlineVideoActivity.f278387R;
                    e94 e942 = timeLine.videoTemplate;
                    snsReportHelper.mo131373f(str3, 1, e942.f182943e, e942.f182944f);
                    snsOnlineVideoActivity.mo132870R7(snsOnlineVideoActivity.getString(C0966R.string.f361387m14));
                    e94 e943 = timeLine.videoTemplate;
                    SnsMethodCalculate.markStartTimeMs("dealCutSameJumpClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                    if (e943 == null) {
                        Log.m105920e("MicroMsg.SnsOnlineVideoActivity", "video template info is null");
                        SnsMethodCalculate.markEndTimeMs("dealCutSameJumpClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                    } else {
                        try {
                            snsOnlineVideoActivity.f278386Q.setOnClickListener(new SnsOnlineVideoActivity$$d(snsOnlineVideoActivity, e943.toByteArray(), e943));
                            SnsMethodCalculate.markEndTimeMs("dealCutSameJumpClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                        } catch (IOException e) {
                            Log.printErrStackTrace("MicroMsg.SnsOnlineVideoActivity", e, "to byte array error", new Object[0]);
                            SnsMethodCalculate.markEndTimeMs("dealCutSameJumpClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("initCutSame", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("lambda$initSeekBar$0", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
    }
}
