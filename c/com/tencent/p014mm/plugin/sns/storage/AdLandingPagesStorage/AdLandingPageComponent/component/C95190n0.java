package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0;
import com.tencent.p014mm.sdk.platformtools.Log;
import lo2.C99552l;
import nj3.C76879j;
import vr2.C102239c;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.n0 */
public class C95190n0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f276243d;

    /* renamed from: e */
    public final /* synthetic */ C95144m0.C95148d f276244e;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.n0$a */
    public class C95191a implements DialogInterface.OnClickListener {
        public C95191a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$1$1");
            C95190n0.this.f276244e.sendMessage(12);
            C95190n0 n0Var = C95190n0.this;
            C95144m0.C95148d.m121095o(n0Var.f276244e, n0Var.f276243d, 1);
            C99552l.m129931g(new C102239c(C95144m0.m121071R(C95144m0.this), C95144m0.m121073V(C95144m0.this), C95144m0.m121074W(C95144m0.this), C95144m0.m121072U(C95144m0.this), C95144m0.m121075X(C95144m0.this), C95144m0.m121076Y(C95144m0.this), C95144m0.m121077b0(C95144m0.this), C95144m0.m121067N(C95144m0.this), 103));
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$1$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.n0$b */
    public class C95192b implements DialogInterface.OnClickListener {
        public C95192b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$1$2");
            C95190n0 n0Var = C95190n0.this;
            if (n0Var.f276243d == 0) {
                C95144m0.m121068O(C95144m0.this, 2);
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$1$2");
        }
    }

    public C95190n0(C95144m0.C95148d dVar, int i) {
        this.f276244e = dVar;
        this.f276243d = i;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$1");
        try {
            String l = C95144m0.C95148d.m121094l(this.f276244e, this.f276243d, (double) ((((float) C95144m0.m121066M(C95144m0.this).f296526e0) / 1024.0f) / 1024.0f));
            C95144m0.C95148d.m121095o(this.f276244e, this.f276243d, 0);
            C99552l.m129932h(new C102239c(C95144m0.m121071R(C95144m0.this), C95144m0.m121073V(C95144m0.this), C95144m0.m121074W(C95144m0.this), C95144m0.m121072U(C95144m0.this), C95144m0.m121075X(C95144m0.this), C95144m0.m121076Y(C95144m0.this), C95144m0.m121077b0(C95144m0.this), C95144m0.m121067N(C95144m0.this), 103));
            C76879j.m92750u(C95144m0.this.f276579d, l, "", new C95191a(), new C95192b());
        } catch (Exception e) {
            Log.m105920e("MicroMsg.AdLandingPageDownloadApkBtnComp.GroceryDownload", "showGroceryDownload exp=" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$1");
    }
}
