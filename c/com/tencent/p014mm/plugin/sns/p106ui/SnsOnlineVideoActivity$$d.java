package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96892t1;
import com.tencent.p014mm.sdk.platformtools.Log;
import da0.C58247e;
import di3.C86312j;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import k21.C60960c;
import te3.e94;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$$d */
public final /* synthetic */ class SnsOnlineVideoActivity$$d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsOnlineVideoActivity f278420d;

    /* renamed from: e */
    public final /* synthetic */ byte[] f278421e;

    /* renamed from: f */
    public final /* synthetic */ e94 f278422f;

    public /* synthetic */ SnsOnlineVideoActivity$$d(SnsOnlineVideoActivity snsOnlineVideoActivity, byte[] bArr, e94 e94) {
        this.f278420d = snsOnlineVideoActivity;
        this.f278421e = bArr;
        this.f278422f = e94;
    }

    public final void onClick(View view) {
        SnsOnlineVideoActivity snsOnlineVideoActivity = this.f278420d;
        byte[] bArr = this.f278421e;
        e94 e94 = this.f278422f;
        int i = SnsOnlineVideoActivity.f278370y0;
        snsOnlineVideoActivity.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(bArr);
        arrayList.add(e94);
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", snsOnlineVideoActivity, array);
        SnsMethodCalculate.markStartTimeMs("lambda$dealCutSameJumpClick$3", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        int i2 = snsOnlineVideoActivity.f278400h;
        if (i2 == 0) {
            C60960c.f173618a.mo85926j("SnsPublishProcess", "fromPage", 1);
        } else if (i2 == 1) {
            C60960c.f173618a.mo85926j("SnsPublishProcess", "fromPage", 4);
        }
        snsOnlineVideoActivity.f278412v = true;
        Intent intent = new Intent();
        intent.putExtra("album_template_info", bArr);
        intent.putExtra("key_sns_publish_template", true);
        intent.putExtra("key_filter_hdr_video", true);
        ((C58247e) C86312j.m106911c(C58247e.class)).mo82988cy(e94.f182943e, false);
        SnsReportHelper.f275506m0.mo131373f(snsOnlineVideoActivity.f278387R, 2, e94.f182943e, e94.f182944f);
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_sns_publish_template_media_num, 20);
        Log.m105924i("MicroMsg.SnsTemplateExptConfig", "getPublishTemplateMediaNum: " + Qe);
        C96892t1.m124463c(snsOnlineVideoActivity, 4098, Qe, 4, 3, SnsTimeLineUI.m122313w8(), intent);
        SnsMethodCalculate.markEndTimeMs("lambda$dealCutSameJumpClick$3", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        C117292a.m165361g(snsOnlineVideoActivity, "com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
