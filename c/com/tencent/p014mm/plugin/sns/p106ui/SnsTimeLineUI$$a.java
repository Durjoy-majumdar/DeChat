package com.tencent.p014mm.plugin.sns.p106ui;

import android.app.Activity;
import android.content.DialogInterface;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import hi2.C46072b;
import hi2.C46075u;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$a */
public final /* synthetic */ class SnsTimeLineUI$$a implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ boolean f116634d;

    /* renamed from: e */
    public final /* synthetic */ Activity f116635e;

    public /* synthetic */ SnsTimeLineUI$$a(boolean z, Activity activity) {
        this.f116634d = z;
        this.f116635e = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean z = this.f116634d;
        Activity activity = this.f116635e;
        Boolean bool = SnsTimeLineUI.f278611T1;
        Class cls = C32735h.class;
        SnsMethodCalculate.markStartTimeMs("lambda$onClickSecondCut$1", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        SnsTimeLineUI.m122280B8(z, 4, true);
        if (z) {
            C46075u uVar = C46075u.f124225a;
            int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_phoneix_video_duration, 30);
            Log.m105924i("MicroMsg.SecondCutConfig", "ShareVideoDuration: " + Qe);
            uVar.mo71515c(activity, uVar.mo71514b("moments", Qe, ""));
        } else {
            C46072b bVar = C46072b.f124220a;
            StringBuilder sb = new StringBuilder();
            String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_phoneix_download_url, "https://miaojian.weixin.qq.com/download/apps?channel=");
            Log.m105924i("MicroMsg.SecondCutConfig", "SecondCutDownloadUrl: " + Y60);
            C87412m.m108593f(Y60, "url");
            sb.append(Y60);
            sb.append("1101");
            bVar.mo71509c(activity, sb.toString());
        }
        SnsMethodCalculate.markEndTimeMs("lambda$onClickSecondCut$1", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }
}
