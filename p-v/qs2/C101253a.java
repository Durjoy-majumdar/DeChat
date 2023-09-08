package qs2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.ViewGroup;
import bp2.C92278a;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95295z;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import p1208q3.C118144a;

/* renamed from: qs2.a */
public abstract class C101253a extends C95295z {

    /* renamed from: s */
    public boolean f296489s;

    /* renamed from: t */
    public boolean f296490t = true;

    /* renamed from: u */
    public C92278a f296491u;

    /* renamed from: v */
    public boolean f296492v;

    /* renamed from: w */
    public BroadcastReceiver f296493w = new C101254a();

    /* renamed from: qs2.a$a */
    public class C101254a extends BroadcastReceiver {
        public C101254a() {
        }

        public void onReceive(Context context, Intent intent) {
            SnsMethodCalculate.markStartTimeMs("onReceive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp$1");
            if (intent == null) {
                SnsMethodCalculate.markEndTimeMs("onReceive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp$1");
                return;
            }
            try {
                if ("com.tencent.mm.adlanding.close_exposure_voice".equals(intent.getAction())) {
                    if (!C101253a.this.mo131850h().f296495a.equals(intent.getStringExtra("para_id"))) {
                        C101253a aVar = C101253a.this;
                        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
                        aVar.getClass();
                        SnsMethodCalculate.markStartTimeMs("closeVoiceIfExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
                        if (aVar.f296492v) {
                            aVar.mo130232G();
                        }
                        SnsMethodCalculate.markEndTimeMs("closeVoiceIfExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
                        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
                    }
                } else if ("com.tencent.mm.adlanding.video.action.PAUSE_OR_RESUME".equals(intent.getAction())) {
                    C101253a aVar2 = C101253a.this;
                    aVar2.getClass();
                    SnsMethodCalculate.markStartTimeMs("onProcessPauseOrResume", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
                    int intExtra = IntentUtil.getIntExtra(intent, "TRY_PAUSE_OR_RESUME", 0);
                    if (intExtra == 1) {
                        if (aVar2.mo130233K()) {
                            aVar2.mo130235N();
                        }
                    } else if (intExtra == 2 && !aVar2.mo130233K()) {
                        aVar2.mo130236O();
                    }
                    SnsMethodCalculate.markEndTimeMs("onProcessPauseOrResume", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
                }
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("onReceive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp$1");
        }
    }

    public C101253a(Context context, C101255a0 a0Var, ViewGroup viewGroup) {
        super(context, a0Var, viewGroup);
        C92278a aVar;
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        try {
            SnsMethodCalculate.markStartTimeMs("newInstance", "com.tencent.mm.plugin.sns.ad.landingpage.helper.video.VideoCompletionMessageHelper");
            aVar = new C92278a(this);
            SnsMethodCalculate.markEndTimeMs("newInstance", "com.tencent.mm.plugin.sns.ad.landingpage.helper.video.VideoCompletionMessageHelper");
        } catch (Throwable unused) {
        }
        this.f296491u = aVar;
        C118144a a = C118144a.m166672a(this.f276579d);
        IntentFilter intentFilter = new IntentFilter("com.tencent.mm.adlanding.close_exposure_voice");
        intentFilter.addAction("com.tencent.mm.adlanding.video.action.PAUSE_OR_RESUME");
        a.mo182943b(this.f296493w, intentFilter);
        Log.m105926v("AbsVideoPlayComp", "register receiver " + this.f296493w);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
    }

    /* renamed from: A */
    public void mo130145A() {
        SnsMethodCalculate.markStartTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        super.mo130145A();
        if (this.f296490t) {
            boolean z = false;
            this.f296490t = false;
            SnsMethodCalculate.markStartTimeMs("initVoiceStatus", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
            C101271i0 m = mo131854m();
            m.getClass();
            SnsMethodCalculate.markStartTimeMs("isNativeAd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
            boolean z2 = m.f296618c;
            SnsMethodCalculate.markEndTimeMs("isNativeAd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
            if (z2 && !mo140730J()) {
                z = true;
            }
            if (!z) {
                mo130232G();
            } else {
                mo130234M();
            }
            SnsMethodCalculate.markEndTimeMs("initVoiceStatus", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        }
        SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
    }

    /* renamed from: B */
    public void mo124360B() {
        SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        super.mo124360B();
        this.f296492v = true;
        SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
    }

    /* renamed from: C */
    public void mo67235C() {
        SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        super.mo67235C();
        C118144a.m166672a(this.f276579d).mo182945d(this.f296493w);
        this.f296492v = true;
        Log.m105926v("AbsVideoPlayComp", "unregister receiver " + this.f296493w);
        SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
    }

    /* renamed from: D */
    public void mo124361D() {
        SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        super.mo124361D();
        this.f296492v = false;
        SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
    }

    /* renamed from: E */
    public void mo140727E() {
        SnsMethodCalculate.markStartTimeMs("closeOtherExposureVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        Intent intent = new Intent("com.tencent.mm.adlanding.close_exposure_voice");
        intent.putExtra("para_id", mo131850h().f296495a);
        C118144a.m166672a(this.f276579d).mo182944c(intent);
        SnsMethodCalculate.markEndTimeMs("closeOtherExposureVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
    }

    /* renamed from: G */
    public void mo130232G() {
        SnsMethodCalculate.markStartTimeMs("closeVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        this.f296489s = false;
        SnsMethodCalculate.markEndTimeMs("closeVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
    }

    /* renamed from: H */
    public int mo140728H() {
        SnsMethodCalculate.markStartTimeMs("getContextHashCode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        Context context = this.f276579d;
        if (context != null) {
            int hashCode = context.hashCode();
            SnsMethodCalculate.markEndTimeMs("getContextHashCode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
            return hashCode;
        }
        SnsMethodCalculate.markEndTimeMs("getContextHashCode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        return 0;
    }

    /* renamed from: I */
    public boolean mo140729I() {
        SnsMethodCalculate.markStartTimeMs("isForceHideFullScreenIcon", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        boolean n = mo131854m().mo140747n();
        SnsMethodCalculate.markEndTimeMs("isForceHideFullScreenIcon", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        return n;
    }

    /* renamed from: J */
    public boolean mo140730J() {
        SnsMethodCalculate.markStartTimeMs("isForceHideVoiceIcon", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        boolean n = mo131854m().mo140747n();
        SnsMethodCalculate.markEndTimeMs("isForceHideVoiceIcon", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        return n;
    }

    /* renamed from: K */
    public abstract boolean mo130233K();

    /* renamed from: M */
    public void mo130234M() {
        SnsMethodCalculate.markStartTimeMs("openVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        this.f296489s = true;
        SnsMethodCalculate.markEndTimeMs("openVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
    }

    /* renamed from: N */
    public void mo130235N() {
        SnsMethodCalculate.markStartTimeMs("pauseVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        SnsMethodCalculate.markEndTimeMs("pauseVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
    }

    /* renamed from: O */
    public void mo130236O() {
        SnsMethodCalculate.markStartTimeMs("resumeVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        SnsMethodCalculate.markEndTimeMs("resumeVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
    }

    /* renamed from: P */
    public void mo130237P(int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("videoSeekTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        SnsMethodCalculate.markEndTimeMs("videoSeekTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
    }

    /* renamed from: e */
    public void mo67238e() {
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
        super.mo67238e();
        SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AbsVideoPlayComp");
    }
}
