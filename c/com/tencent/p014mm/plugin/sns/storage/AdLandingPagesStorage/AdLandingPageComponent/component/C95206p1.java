package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import a14.C0000n0;
import a14.C53930o0;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.SnsAdQRBtnDownloadEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import ps2.C100880k;
import ps2.C100891r;
import qo3.C89779i0;
import qs2.C101259c0;
import uo2.C90717a;
import vr2.C102251n;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.p1 */
public class C95206p1 extends C95108i0 {

    /* renamed from: B */
    public C102251n f276274B;

    /* renamed from: C */
    public C101259c0 f276275C;

    /* renamed from: D */
    public String f276276D = "";

    /* renamed from: E */
    public C89779i0 f276277E = null;

    /* renamed from: F */
    public IListener<SnsAdQRBtnDownloadEvent> f276278F;

    /* renamed from: G */
    public C95116i2 f276279G;

    /* renamed from: H */
    public C102251n.C102257c f276280H = new C95207a();

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.p1$a */
    public class C95207a implements C102251n.C102257c {
        public C95207a() {
        }

        /* renamed from: a */
        public void mo131644a(String str, boolean z, String str2, Bundle bundle) {
            SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp$1");
            Log.m105924i("SnsAd.AdLandingPageQRCodeBtnComp", "onFinish, isSucc=" + z + ", errMsg=" + str2 + ", url=" + str);
            C95206p1 p1Var = C95206p1.this;
            p1Var.getClass();
            SnsMethodCalculate.markStartTimeMs("removeQRCodeTip", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
            ((C119157j) C119157j.f356862d).mo183895z(new C95211q1(p1Var));
            SnsMethodCalculate.markEndTimeMs("removeQRCodeTip", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
            SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.p1$b */
    public static class C95208b implements C100880k.C100881a {

        /* renamed from: a */
        public WeakReference<C95206p1> f276282a;

        public C95208b(C95206p1 p1Var, boolean z) {
            this.f276282a = new WeakReference<>(p1Var);
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp$DownloadSmallFileTaskCallBack");
            Log.m105920e("SnsAd.AdLandingPageQRCodeBtnComp", "there is something error happening when downloading qr image.");
            C95206p1 p1Var = this.f276282a.get();
            if (p1Var != null) {
                SnsMethodCalculate.markStartTimeMs("removeQRCodeTip", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
                ((C119157j) C119157j.f356862d).mo183895z(new C95211q1(p1Var));
                SnsMethodCalculate.markEndTimeMs("removeQRCodeTip", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
            }
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp$DownloadSmallFileTaskCallBack");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp$DownloadSmallFileTaskCallBack");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp$DownloadSmallFileTaskCallBack");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp$DownloadSmallFileTaskCallBack");
            C95206p1 p1Var = this.f276282a.get();
            if (p1Var != null) {
                Log.m105918d("SnsAd.AdLandingPageQRCodeBtnComp", "download qr image completed, the path " + str + "; cId " + p1Var.mo131857r());
                p1Var.f276276D = str;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
                C101259c0 c0Var = p1Var.f276275C;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
                if (c0Var != null) {
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
                    C101259c0 c0Var2 = p1Var.f276275C;
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
                    String str2 = c0Var2.f296554Z;
                    SnsMethodCalculate.markStartTimeMs("publishDownloadEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
                    SnsAdQRBtnDownloadEvent snsAdQRBtnDownloadEvent = new SnsAdQRBtnDownloadEvent();
                    snsAdQRBtnDownloadEvent.f265127d.f265128a = p1Var.mo131857r();
                    SnsAdQRBtnDownloadEvent.C92572a aVar = snsAdQRBtnDownloadEvent.f265127d;
                    aVar.f265129b = str2;
                    aVar.f265130c = str;
                    aVar.f265131d = 0;
                    snsAdQRBtnDownloadEvent.publish();
                    SnsMethodCalculate.markEndTimeMs("publishDownloadEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
                }
            } else {
                Log.m105928w("SnsAd.AdLandingPageQRCodeBtnComp", "qrCodeBtnComp is null in weak ref");
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp$DownloadSmallFileTaskCallBack");
        }
    }

    public C95206p1(Context context, C101259c0 c0Var, ViewGroup viewGroup) {
        super(context, c0Var, viewGroup);
        this.f276275C = c0Var;
    }

    /* renamed from: C */
    public void mo67235C() {
        SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
        super.mo67235C();
        SnsMethodCalculate.markStartTimeMs("uninstallDownloadEventListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
        IListener<SnsAdQRBtnDownloadEvent> iListener = this.f276278F;
        if (iListener != null) {
            iListener.dead();
            this.f276278F = null;
        }
        SnsMethodCalculate.markEndTimeMs("uninstallDownloadEventListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
        C95116i2 i2Var = this.f276279G;
        if (i2Var != null) {
            i2Var.getClass();
            SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate");
            C0000n0 n0Var = i2Var.f276052c;
            if (n0Var != null) {
                C53930o0.m60556c(n0Var, (CancellationException) null);
            }
            i2Var.f276052c = null;
            SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate");
        }
        try {
            C89779i0 i0Var = this.f276277E;
            if (i0Var != null && i0Var.isShowing()) {
                this.f276277E.dismiss();
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
    }

    /* renamed from: P */
    public void mo130182P() {
        SnsMethodCalculate.markStartTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
        mo131709b0();
        if (this.f276275C.f296556b0 == 1) {
            try {
                Log.m105924i("SnsAd.AdLandingPageQRCodeBtnComp", "qrScanDirectJump=" + this.f276275C.f296557c0);
                this.f276010t.mo90728b("qrScanDirectJump", (long) this.f276275C.f296557c0);
                C95116i2 i2Var = this.f276279G;
                if (i2Var != null) {
                    i2Var.mo131642c(this.f276579d, mo131854m(), mo131857r(), this.f276274B);
                }
            } catch (Throwable th) {
                Log.m105920e("SnsAd.AdLandingPageQRCodeBtnComp", th.toString());
            }
        } else {
            if (this.f276277E == null) {
                Context context = this.f276579d;
                if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
                    this.f276277E = C90717a.m113753f(this.f276579d, C0966R.string.j_t, (DialogInterface.OnCancelListener) null);
                }
            }
            C89779i0 i0Var = this.f276277E;
            if (i0Var != null && !i0Var.isShowing()) {
                this.f276277E.show();
            }
            if (!TextUtils.isEmpty(this.f276276D)) {
                try {
                    this.f276010t.mo90729c("qrUrl", this.f276275C.f296554Z);
                    this.f276010t.mo90728b("qrScanDirectJump", (long) this.f276275C.f296557c0);
                    C101259c0 c0Var = this.f276275C;
                    if (c0Var.f296557c0 == 1) {
                        this.f276274B.mo141816j(this.f276276D, c0Var.f296554Z, this.f276280H);
                    } else {
                        this.f276274B.mo141817k(this.f276276D, c0Var.f296554Z, this.f276280H);
                    }
                } catch (Throwable th4) {
                    Log.m105920e("SnsAd.AdLandingPageQRCodeBtnComp", "the ad qr helper has something wrong. exception: " + th4);
                }
            }
            mo131613G();
        }
        SnsMethodCalculate.markEndTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
    }

    /* renamed from: b0 */
    public final void mo131709b0() {
        SnsMethodCalculate.markStartTimeMs("ensureAdQRHelper", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
        if (this.f276274B == null) {
            Bundle bundle = new Bundle();
            C101259c0 c0Var = this.f276275C;
            bundle.putString("qrExtInfo", c0Var != null ? c0Var.f296555a0 : "");
            bundle.putInt("qrIsDirectJump", c0Var != null ? c0Var.f296557c0 : 0);
            this.f276274B = new C102251n(this.f276579d, mo131854m(), 3, bundle);
        }
        SnsMethodCalculate.markEndTimeMs("ensureAdQRHelper", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
    }

    /* renamed from: c0 */
    public void mo131710c0(SnsAdQRBtnDownloadEvent snsAdQRBtnDownloadEvent) {
        SnsAdQRBtnDownloadEvent.C92572a aVar;
        SnsMethodCalculate.markStartTimeMs("onDownloadEventFromOthers", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
        if (snsAdQRBtnDownloadEvent == null || (aVar = snsAdQRBtnDownloadEvent.f265127d) == null || this.f276275C == null) {
            SnsMethodCalculate.markEndTimeMs("onDownloadEventFromOthers", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
            return;
        }
        String str = aVar.f265128a;
        String str2 = aVar.f265129b;
        int i = aVar.f265131d;
        String r = mo131857r();
        Log.m105918d("SnsAd.AdLandingPageQRCodeBtnComp", "onDownloadEventFromOthers is called, from " + str + "; self is " + r + "; type is " + i);
        if (!Util.isEqual(str, r) && !TextUtils.isEmpty(snsAdQRBtnDownloadEvent.f265127d.f265130c)) {
            String str3 = snsAdQRBtnDownloadEvent.f265127d.f265130c;
            Log.m105918d("SnsAd.AdLandingPageQRCodeBtnComp", "onDownloadEventFromOthers is called, the path is " + str3);
            if (i == 0 && Util.isEqual(str2, this.f276275C.f296554Z) && TextUtils.isEmpty(this.f276276D)) {
                this.f276276D = str3;
            }
        }
        SnsMethodCalculate.markEndTimeMs("onDownloadEventFromOthers", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
    }

    /* renamed from: e */
    public void mo67238e() {
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
        super.mo67238e();
        mo131709b0();
        SnsMethodCalculate.markStartTimeMs("installDownloadEventListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
        if (this.f276278F == null) {
            AdLandingPageQRCodeBtnComp$3 adLandingPageQRCodeBtnComp$3 = new AdLandingPageQRCodeBtnComp$3(this, C40008f.f107254d);
            this.f276278F = adLandingPageQRCodeBtnComp$3;
            adLandingPageQRCodeBtnComp$3.alive();
        }
        SnsMethodCalculate.markEndTimeMs("installDownloadEventListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
        SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
        super.mo67240g();
        if (this.f276279G == null) {
            this.f276279G = new C95116i2(this, this.f276275C);
            SnsMethodCalculate.markStartTimeMs("onFillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate");
            SnsMethodCalculate.markEndTimeMs("onFillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate");
        }
        C101259c0 c0Var = this.f276275C;
        if (c0Var != null) {
            String str = c0Var.f296554Z;
            Log.m105918d("SnsAd.AdLandingPageQRCodeBtnComp", "the qr code img url: " + str);
            C100891r.m132208c(str, false, mo131626O().f296496b, 0, new C95208b(this, false));
        }
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
    }
}
