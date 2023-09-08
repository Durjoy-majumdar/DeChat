package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.List;
import nj3.C76912y0;
import qs2.C101255a0;
import te3.C51767w1;

/* renamed from: com.tencent.mm.plugin.sns.ui.b3 */
public class C43100b3 implements AdLandingPagesProxy.C94830p {

    /* renamed from: a */
    public final /* synthetic */ SnsAdNativeLandingPagesUI f116647a;

    /* renamed from: com.tencent.mm.plugin.sns.ui.b3$a */
    public class C43101a implements Runnable {
        public C43101a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$12$1");
            Context applicationContext = C43100b3.this.f116647a.getApplicationContext();
            if (applicationContext != null) {
                C76912y0.m92767f(applicationContext, "广告无效，已为你关闭");
            }
            C43100b3.this.f116647a.mo132509R8();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$12$1");
        }
    }

    public C43100b3(SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        this.f116647a = snsAdNativeLandingPagesUI;
    }

    /* renamed from: a */
    public void mo10855a(Object obj) {
        SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$12");
        SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$12");
    }

    /* renamed from: b */
    public void mo10856b(int i, int i2, Object obj) {
        SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$12");
        Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "doAdNativeAntiAbuseScene end, errType = " + i + ", errNo = " + i2 + ", canvasAuthFailed = " + obj);
        if (i == 0 && i2 == 0 && obj != null) {
            try {
                C51767w1 w1Var = new C51767w1();
                w1Var.parseFrom((byte[]) obj);
                Log.m105920e("MicroMsg.SnsAdNativeLandingPagesUI", "checkNativeLandingPageAbuse, canvasAuthFailed=" + w1Var.f143806d);
                if (w1Var.f143806d != 0) {
                    SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f116647a;
                    List<C101255a0> list = SnsAdNativeLandingPagesUI.f277498D2;
                    SnsMethodCalculate.markStartTimeMs("access$3402", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    snsAdNativeLandingPagesUI.f277571d2 = true;
                    SnsMethodCalculate.markEndTimeMs("access$3402", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    MMHandlerThread.postToMainThreadDelayed(new C43101a(), 500);
                    C115669n.INSTANCE.mo175911u(1612, 113);
                }
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.SnsAdNativeLandingPagesUI", th.toString());
            }
        }
        SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$12");
    }
}
