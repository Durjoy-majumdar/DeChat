package com.tencent.p014mm.plugin.sns.p106ui;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.model.C94945s2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import pt2.C62497i;
import te3.e94;
import te3.pr4;
import te3.yq4;

/* renamed from: com.tencent.mm.plugin.sns.ui.NewSightWidget$$a */
public final /* synthetic */ class NewSightWidget$$a implements C32226l {

    /* renamed from: d */
    public final /* synthetic */ NewSightWidget f164370d;

    public /* synthetic */ NewSightWidget$$a(NewSightWidget newSightWidget) {
        this.f164370d = newSightWidget;
    }

    public final Object invoke(Object obj) {
        NewSightWidget newSightWidget = this.f164370d;
        pr4 pr4 = (pr4) obj;
        newSightWidget.getClass();
        SnsMethodCalculate.markStartTimeMs("lambda$checkMiaojianInfo$5", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        if (pr4 != null && !TextUtils.isEmpty(pr4.f139919d)) {
            Log.m105925i("MicroMsg.SightWidget", "get template info success %s", pr4.f139919d);
            e94 e94 = new e94();
            e94.f182942d = "miaojian";
            e94.f182943e = pr4.f139919d;
            C62497i.C62498a aVar = newSightWidget.f277030T;
            aVar.getClass();
            SnsMethodCalculate.markStartTimeMs("getMusicId", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$MiaoJianCutSameInfo");
            String str = aVar.f177538b;
            SnsMethodCalculate.markEndTimeMs("getMusicId", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$MiaoJianCutSameInfo");
            e94.f182944f = str;
            yq4 yq4 = pr4.f139929q;
            if (yq4 != null) {
                e94.f182946h = (long) yq4.f145471d;
                e94.f182945g = (long) yq4.f145473f;
            }
            C94945s2 s2Var = newSightWidget.f277032V;
            s2Var.getClass();
            SnsMethodCalculate.markStartTimeMs("setVideoTemplateInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            s2Var.f275199f.videoTemplate = e94;
            SnsMethodCalculate.markEndTimeMs("setVideoTemplateInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            C94945s2 s2Var2 = newSightWidget.f277032V;
            s2Var2.getClass();
            SnsMethodCalculate.markStartTimeMs("clearMessageExt", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            s2Var2.f275203j.f298580j.f298273f = "";
            SnsMethodCalculate.markEndTimeMs("clearMessageExt", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        }
        SnsMethodCalculate.markEndTimeMs("lambda$checkMiaojianInfo$5", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        return null;
    }
}
