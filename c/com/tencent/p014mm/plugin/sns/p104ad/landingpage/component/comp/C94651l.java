package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.OpenSnsAdFloatPageEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.view.AdLandingGeneralVideoView;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.view.AdLandingGeneralVideoWrapper;
import com.tencent.p014mm.plugin.sns.p104ad.widget.advideo.AdLandingVideoPlayerSeekBar;
import com.tencent.p014mm.plugin.sns.p104ad.widget.advideo.AdLandingVideoPlayerToolBar;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95195n2;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95300z1;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.thumbplayer.api.TPOptionalID;
import di3.C86312j;
import eb0.C97621e;
import h81.C32735h;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kp2.C99157a;
import lo2.C99572w;
import org.json.JSONException;
import org.json.JSONObject;
import p1208q3.C118144a;
import p749xh.C102646h;
import qs2.C101264f;
import qs2.C101271i0;
import to2.C101910a;
import vr2.C37817q;
import wo2.C102466d;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.l */
public class C94651l extends C95300z1 implements AdLandingGeneralVideoWrapper.C94690b {

    /* renamed from: A */
    public AdLandingGeneralVideoWrapper f273883A;

    /* renamed from: B */
    public View f273884B;

    /* renamed from: C */
    public ImageView f273885C;

    /* renamed from: D */
    public AdLandingVideoPlayerToolBar f273886D;

    /* renamed from: E */
    public AdLandingVideoPlayerSeekBar f273887E;

    /* renamed from: F */
    public boolean f273888F = false;

    /* renamed from: G */
    public boolean f273889G = false;

    /* renamed from: H */
    public boolean f273890H = false;

    /* renamed from: I */
    public boolean f273891I = true;

    /* renamed from: J */
    public boolean f273892J = false;

    /* renamed from: K */
    public boolean f273893K = true;

    /* renamed from: L */
    public boolean f273894L;

    /* renamed from: M */
    public boolean f273895M = false;

    /* renamed from: N */
    public boolean f273896N = true;

    /* renamed from: P */
    public int f273897P = 0;

    /* renamed from: Q */
    public int f273898Q = 0;

    /* renamed from: Q0 */
    public final View.OnLayoutChangeListener f273899Q0;

    /* renamed from: R */
    public int f273900R = 0;

    /* renamed from: S */
    public int f273901S = 0;

    /* renamed from: T */
    public int f273902T = 0;

    /* renamed from: U */
    public int f273903U = 0;

    /* renamed from: V */
    public int f273904V = 0;

    /* renamed from: W */
    public C95195n2 f273905W = null;

    /* renamed from: X */
    public View.OnClickListener f273906X;

    /* renamed from: Y */
    public View.OnClickListener f273907Y;

    /* renamed from: Z */
    public C94655d f273908Z;

    /* renamed from: p0 */
    public View.OnClickListener f273909p0;

    /* renamed from: x */
    public Context f273910x;

    /* renamed from: x0 */
    public View.OnClickListener f273911x0;

    /* renamed from: y */
    public int f273912y = 0;

    /* renamed from: y0 */
    public Runnable f273913y0;

    /* renamed from: z */
    public View f273914z;

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.l$a */
    public class C94652a implements Runnable {
        public C94652a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$1");
            C94651l.this.mo130244c0(false);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.l$b */
    public class C94653b implements View.OnLayoutChangeListener {
        public C94653b() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SnsMethodCalculate.markStartTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$2");
            if (C94651l.this.f273883A == null || view == null) {
                SnsMethodCalculate.markEndTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$2");
                return;
            }
            int height = view.getHeight();
            int width = view.getWidth();
            if (width <= 1 || height <= 1) {
                SnsMethodCalculate.markEndTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$2");
                return;
            }
            ImageView thumbView = C94651l.this.f273883A.getThumbView();
            if (thumbView != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width, height);
                layoutParams.addRule(13);
                thumbView.setLayoutParams(layoutParams);
                thumbView.removeOnLayoutChangeListener(this);
                Log.m105924i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "thumb onLayout change, videoW is " + width + ", videoH is " + height);
            }
            SnsMethodCalculate.markEndTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.l$c */
    public class C94654c implements C95195n2 {
        public C94654c() {
        }

        /* renamed from: a */
        public void mo130250a(boolean z) {
            SnsMethodCalculate.markStartTimeMs("onProgressBarShowedStatusChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$3");
            Intent intent = new Intent("com.tencent.mm.adlanding.video_progressbar_change");
            intent.putExtra("show", z ? 1 : 0);
            C94651l lVar = C94651l.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            int H = lVar.mo140728H();
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            intent.putExtra("activity_code", H);
            C94651l lVar2 = C94651l.this;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            Context context = lVar2.f273910x;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            C118144a.m166672a(context).mo182944c(intent);
            SnsMethodCalculate.markEndTimeMs("onProgressBarShowedStatusChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.l$d */
    public interface C94655d {
    }

    public C94651l(Context context, C101264f fVar, ViewGroup viewGroup) {
        super(context, fVar, viewGroup);
        SnsMethodCalculate.markStartTimeMs("createSeekBarPlayBtnClickListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        C94660o oVar = new C94660o(this);
        SnsMethodCalculate.markEndTimeMs("createSeekBarPlayBtnClickListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        this.f273906X = oVar;
        SnsMethodCalculate.markStartTimeMs("createVoiceBtnClickListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        C94662p pVar = new C94662p(this);
        SnsMethodCalculate.markEndTimeMs("createVoiceBtnClickListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        this.f273907Y = pVar;
        SnsMethodCalculate.markStartTimeMs("createUpdateTimeListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        C94664q qVar = new C94664q(this);
        SnsMethodCalculate.markEndTimeMs("createUpdateTimeListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        this.f273908Z = qVar;
        SnsMethodCalculate.markStartTimeMs("createFullScreenClickListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        C94668r rVar = new C94668r(this);
        SnsMethodCalculate.markEndTimeMs("createFullScreenClickListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        this.f273909p0 = rVar;
        SnsMethodCalculate.markStartTimeMs("createAutoPlayStatusClickListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        C94649k kVar = new C94649k(this);
        SnsMethodCalculate.markEndTimeMs("createAutoPlayStatusClickListener", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        this.f273911x0 = kVar;
        this.f273913y0 = new C94652a();
        this.f273899Q0 = new C94653b();
        this.f273910x = context;
        C94654c cVar = new C94654c();
        SnsMethodCalculate.markStartTimeMs("setAdLandingPageStreamVideoComponentEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        this.f273905W = cVar;
        SnsMethodCalculate.markEndTimeMs("setAdLandingPageStreamVideoComponentEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        C115669n.INSTANCE.mo175911u(1720, 6);
    }

    /* renamed from: Q */
    public static /* synthetic */ C101264f m119777Q(C94651l lVar) {
        SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        C101264f W = lVar.mo130240W();
        SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        return W;
    }

    /* renamed from: R */
    public static void m119778R(C94651l lVar, boolean z) {
        SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        lVar.getClass();
        SnsMethodCalculate.markStartTimeMs("adjustEnterFullScreenView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        AdLandingGeneralVideoView videoView = lVar.f273883A.getVideoView();
        if (videoView == null) {
            SnsMethodCalculate.markEndTimeMs("adjustEnterFullScreenView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        } else {
            View innerVideoView = videoView.getInnerVideoView();
            if (innerVideoView instanceof VideoPlayerTextureView) {
                innerVideoView.removeOnLayoutChangeListener(lVar.f273899Q0);
                innerVideoView.addOnLayoutChangeListener(lVar.f273899Q0);
            }
            if (lVar.mo130240W().f296577D == 2) {
                ImageView thumbView = lVar.f273883A.getThumbView();
                if (thumbView == null) {
                    Log.m105920e("MicroMsg.Sns.AdLandingGeneralVideoComponent", "adjustEnterFullScreenView but videoView or thumb is null");
                    SnsMethodCalculate.markEndTimeMs("adjustEnterFullScreenView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
                } else if (z) {
                    videoView.setScaleType(C96814a.C96817e.CONTAIN);
                    thumbView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                } else {
                    videoView.setScaleType(C96814a.C96817e.COVER);
                    thumbView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                }
            }
            SnsMethodCalculate.markEndTimeMs("adjustEnterFullScreenView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        }
        SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    /* renamed from: A */
    public void mo130145A() {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        super.mo130145A();
        int l = mo131853l();
        int height = mo131855p().getHeight();
        float f = ((float) height) * 0.5f;
        int i = AdLandingGeneralVideoWrapper.f274015Q;
        SnsMethodCalculate.markStartTimeMs("isNewHalfHeight", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        try {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_general_comp_new_half_height, 1);
            Log.m105924i("MicroMsg.Sns.AdLandingGeneralVideoWrapper", "isNewHalfHeight is " + Qe);
            z = Qe == 1;
            SnsMethodCalculate.markEndTimeMs("isNewHalfHeight", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.Sns.AdLandingGeneralVideoWrapper", "isNewHalfHeight, exp is " + th);
            SnsMethodCalculate.markEndTimeMs("isNewHalfHeight", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            z = false;
        }
        if (z) {
            f = (float) Math.min(mo131855p().getHeight() >>> 1, this.f276589q >>> 1);
            Log.m105925i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "new halfHeight %f", Float.valueOf(f));
        }
        Log.m105925i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "inScreenHeight %d, height %d", Integer.valueOf(l), Integer.valueOf(height));
        if (l <= 0 || height == 0) {
            SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            return;
        }
        if (((float) l) < f) {
            Log.m105924i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "viewAppeared, inScreenHeight less 0.5 percent, before handleType = " + this.f273912y);
            this.f273891I = false;
            this.f273890H = false;
            mo130241X();
            this.f273896N = false;
            int i2 = this.f273912y;
            if (i2 == 1 || i2 == 3) {
                this.f273912y = 2;
            }
            Log.m105924i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "viewAppeared, inScreenHeight less 0.5 percent, after handleType = " + this.f273912y);
        } else if (!this.f273890H || this.f273891I) {
            this.f273890H = true;
            this.f273891I = false;
            Context context = this.f276579d;
            boolean z2 = (context instanceof SnsAdNativeLandingPagesUI) && ((SnsAdNativeLandingPagesUI) context).f277556X1 && !this.f273893K;
            Log.m105924i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "viewAppeared, inScreenHeight over 0.5 percent, before handleType = " + this.f273912y);
            this.f273896N = true;
            int i3 = this.f273912y;
            if (i3 == 0) {
                C101271i0 m = mo131854m();
                m.getClass();
                SnsMethodCalculate.markStartTimeMs("getAdSightVideoSeekTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                long j = m.f296632q;
                SnsMethodCalculate.markEndTimeMs("getAdSightVideoSeekTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                int i4 = ((int) j) / 1000;
                Context context2 = this.f276579d;
                if (context2 instanceof SnsAdNativeLandingPagesUI) {
                    ((SnsAdNativeLandingPagesUI) context2).mo132519W8();
                    Log.m105924i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "snsId = " + mo131854m().mo140741h() + ", cid = " + mo130240W().f296495a + ", isFirstSightVideoComp = " + this.f273895M);
                    if (this.f273895M && i4 > 0) {
                        this.f273912y = 1;
                        mo130243b0(i4, true);
                        this.f273892J = true;
                        SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
                        return;
                    }
                }
                SnsMethodCalculate.markStartTimeMs("needAutoPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
                boolean z3 = NetStatusUtil.isWifi(MMApplicationContext.getContext()) || !mo130240W().f296582I;
                SnsMethodCalculate.markEndTimeMs("needAutoPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
                if (!z3 || z2) {
                    this.f273885C.setVisibility(0);
                    this.f273892J = false;
                    SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
                    return;
                }
                mo130245d0(false);
                this.f273912y = 1;
                this.f273892J = true;
            } else if (i3 == 2 && !z2) {
                mo130245d0(false);
                this.f273912y = 1;
            }
            Log.m105924i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "viewAppeared, inScreenHeight over 0.5 percent, after handleType = " + this.f273912y);
        } else {
            SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            return;
        }
        SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    /* renamed from: B */
    public void mo124360B() {
        SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        super.mo124360B();
        SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    /* renamed from: C */
    public void mo67235C() {
        SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        super.mo67235C();
        MMHandlerThread.removeRunnable(this.f273913y0);
        AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper = this.f273883A;
        adLandingGeneralVideoWrapper.getClass();
        SnsMethodCalculate.markStartTimeMs("abandonAudioFocus", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        C97621e eVar = adLandingGeneralVideoWrapper.f274037j;
        if (eVar != null) {
            eVar.mo136890b(false);
            SnsMethodCalculate.markEndTimeMs("abandonAudioFocus", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        } else {
            SnsMethodCalculate.markEndTimeMs("abandonAudioFocus", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        }
        AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper2 = this.f273883A;
        adLandingGeneralVideoWrapper2.getClass();
        SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        AdLandingGeneralVideoView adLandingGeneralVideoView = adLandingGeneralVideoWrapper2.f274031d;
        if (adLandingGeneralVideoView != null) {
            adLandingGeneralVideoView.mo79616c();
        }
        adLandingGeneralVideoWrapper2.mo130305h();
        C37817q.m41545a("landing_page_video_comp_loading_time", String.valueOf(adLandingGeneralVideoWrapper2.f274030P), 0, 0, "");
        SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    /* renamed from: D */
    public void mo124361D() {
        SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        super.mo124361D();
        Log.m105924i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "viewWillDisappear, before handleType = " + this.f273912y);
        mo130241X();
        this.f273896N = false;
        if (this.f273890H || this.f273891I) {
            this.f273891I = false;
            this.f273890H = false;
            int i = this.f273912y;
            if (i == 1 || i == 3) {
                this.f273912y = 2;
            }
            Log.m105924i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "viewWillDisappear, after handleType = " + this.f273912y);
            SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            return;
        }
        SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    /* renamed from: G */
    public void mo130232G() {
        SnsMethodCalculate.markStartTimeMs("closeVoice", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        super.mo130232G();
        this.f273886D.mo130495d(false);
        this.f273883A.setMute(true);
        this.f273893K = true;
        SnsMethodCalculate.markEndTimeMs("closeVoice", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    /* renamed from: K */
    public boolean mo130233K() {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper = this.f273883A;
        boolean z2 = false;
        if (adLandingGeneralVideoWrapper != null) {
            SnsMethodCalculate.markStartTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            AdLandingGeneralVideoView adLandingGeneralVideoView = adLandingGeneralVideoWrapper.f274031d;
            if (adLandingGeneralVideoView != null) {
                z = adLandingGeneralVideoView.isPlaying();
                SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            } else {
                SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        return z2;
    }

    /* renamed from: M */
    public void mo130234M() {
        SnsMethodCalculate.markStartTimeMs("openVoice", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        if (mo140730J()) {
            SnsMethodCalculate.markEndTimeMs("openVoice", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            return;
        }
        super.mo130234M();
        this.f273886D.mo130495d(true);
        this.f273883A.setMute(false);
        this.f273893K = false;
        SnsMethodCalculate.markEndTimeMs("openVoice", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    /* renamed from: N */
    public void mo130235N() {
        SnsMethodCalculate.markStartTimeMs("pauseVideo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        mo130241X();
        this.f273912y = 4;
        SnsMethodCalculate.markEndTimeMs("pauseVideo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    /* renamed from: O */
    public void mo130236O() {
        SnsMethodCalculate.markStartTimeMs("resumeVideo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        this.f273896N = true;
        this.f273912y = 3;
        mo130245d0(false);
        SnsMethodCalculate.markEndTimeMs("resumeVideo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    /* renamed from: P */
    public void mo130237P(int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("videoSeekTo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        mo130243b0(i / 1000, z);
        SnsMethodCalculate.markEndTimeMs("videoSeekTo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    /* renamed from: U */
    public void mo130238U(boolean z) {
        SnsMethodCalculate.markStartTimeMs("addOrRemoveMaskView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        ViewGroup videoCompContainer = this.f273883A.getVideoCompContainer();
        if (videoCompContainer == null) {
            SnsMethodCalculate.markEndTimeMs("addOrRemoveMaskView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            return;
        }
        if (!z) {
            try {
                videoCompContainer.removeView(this.f273884B);
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.Sns.AdLandingGeneralVideoComponent", "addOrRemoveMaskView, exp is " + th);
            }
        } else {
            videoCompContainer.addView(this.f273884B);
        }
        SnsMethodCalculate.markEndTimeMs("addOrRemoveMaskView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    /* renamed from: V */
    public final void mo130239V(Runnable runnable) {
        SnsMethodCalculate.markStartTimeMs("after4sInvisibleComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        MMHandlerThread.removeRunnable(runnable);
        MMHandlerThread.postToMainThreadDelayed(runnable, 4000);
        SnsMethodCalculate.markEndTimeMs("after4sInvisibleComp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    /* renamed from: W */
    public final C101264f mo130240W() {
        SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        C101264f fVar = (C101264f) this.f276580e;
        SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        return fVar;
    }

    /* renamed from: X */
    public void mo130241X() {
        SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        Log.m105924i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "pause play");
        AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper = this.f273883A;
        adLandingGeneralVideoWrapper.getClass();
        SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        MMHandlerThread.postToMainThread(new C101910a(adLandingGeneralVideoWrapper));
        if (adLandingGeneralVideoWrapper.f274026K != 0) {
            adLandingGeneralVideoWrapper.f274027L = (int) (((long) adLandingGeneralVideoWrapper.f274027L) + (System.currentTimeMillis() - adLandingGeneralVideoWrapper.f274026K));
            adLandingGeneralVideoWrapper.f274026K = 0;
        }
        SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    /* renamed from: Y */
    public final void mo130242Y(long j, long j2) {
        SnsMethodCalculate.markStartTimeMs("reportThumbTimeCost", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        if (C102466d.m135253c()) {
            boolean z = this.f273888F;
            C37817q.m41546b("landing_page_comp_inner_cost", "" + mo131854m().mo140742i(), mo130240W().f296505k, mo130240W().f296504j, "snsId=" + mo131854m().mo140740g() + "|cid=" + mo130240W().f296495a + "|isThumbExist=" + (z ? 1 : 0) + "|decodeThumbCostTime=" + j + "|fileOpCostTime=" + j2);
        }
        SnsMethodCalculate.markEndTimeMs("reportThumbTimeCost", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    /* renamed from: b0 */
    public final void mo130243b0(int i, boolean z) {
        ImageView imageView;
        SnsMethodCalculate.markStartTimeMs("seekTo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        if (!(this.f273883A == null || (imageView = this.f273885C) == null)) {
            imageView.setVisibility(8);
            if (!mo130233K() && z) {
                AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper = this.f273883A;
                adLandingGeneralVideoWrapper.getClass();
                SnsMethodCalculate.markStartTimeMs("setStartPlayReportParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
                adLandingGeneralVideoWrapper.f274026K = System.currentTimeMillis();
                adLandingGeneralVideoWrapper.f274028M++;
                SnsMethodCalculate.markEndTimeMs("setStartPlayReportParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            }
            this.f273883A.mo130309m(i, z);
        }
        SnsMethodCalculate.markEndTimeMs("seekTo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    /* renamed from: c0 */
    public void mo130244c0(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setFocus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        if (z) {
            this.f273883A.mo130307j(z);
            this.f273886D.setVisibility(0);
            View view = this.f273884B;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingGeneralVideoComponent", "setFocus", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingGeneralVideoComponent", "setFocus", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C95195n2 n2Var = this.f273905W;
            if (n2Var != null) {
                n2Var.mo130250a(true);
            }
            mo130239V(this.f273913y0);
        } else {
            this.f273886D.setVisibility(4);
            View view3 = this.f273884B;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(4);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingGeneralVideoComponent", "setFocus", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingGeneralVideoComponent", "setFocus", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C95195n2 n2Var2 = this.f273905W;
            if (n2Var2 != null) {
                n2Var2.mo130250a(false);
            }
            this.f273883A.mo130307j(z);
            MMHandlerThread.removeRunnable(this.f273913y0);
        }
        SnsMethodCalculate.markEndTimeMs("setFocus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    /* renamed from: d0 */
    public final void mo130245d0(boolean z) {
        boolean z2;
        SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        if (this.f273893K) {
            mo130232G();
        } else {
            if (z) {
                mo140727E();
            }
            mo130234M();
        }
        this.f273885C.setVisibility(8);
        AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper = this.f273883A;
        adLandingGeneralVideoWrapper.getClass();
        SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        Log.m105924i("MicroMsg.Sns.AdLandingGeneralVideoWrapper", "start play, downloadFailed = " + adLandingGeneralVideoWrapper.f274039o);
        if (adLandingGeneralVideoWrapper.f274039o) {
            Log.m105920e("MicroMsg.Sns.AdLandingGeneralVideoWrapper", "last download fail, try again");
            adLandingGeneralVideoWrapper.f274031d.mo76636h(false, adLandingGeneralVideoWrapper.f274035h, 0);
            adLandingGeneralVideoWrapper.mo130309m(0, true);
            SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        } else {
            SnsMethodCalculate.markStartTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            AdLandingGeneralVideoView adLandingGeneralVideoView = adLandingGeneralVideoWrapper.f274031d;
            if (adLandingGeneralVideoView != null) {
                z2 = adLandingGeneralVideoView.isPlaying();
                SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            } else {
                SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
                z2 = false;
            }
            if (z2) {
                Log.m105924i("MicroMsg.Sns.AdLandingGeneralVideoWrapper", "startPlay but player is playing");
                SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            } else {
                int currPosSec = adLandingGeneralVideoWrapper.getCurrPosSec();
                if (currPosSec == adLandingGeneralVideoWrapper.getVideoDurationSec()) {
                    adLandingGeneralVideoWrapper.mo130309m(0, true);
                } else {
                    adLandingGeneralVideoWrapper.mo130309m(currPosSec, true);
                }
                SnsMethodCalculate.markStartTimeMs("setStartPlayReportParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
                adLandingGeneralVideoWrapper.f274026K = System.currentTimeMillis();
                adLandingGeneralVideoWrapper.f274028M++;
                SnsMethodCalculate.markEndTimeMs("setStartPlayReportParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
                SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            }
        }
        SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x051b  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x052b  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x054d  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x055e  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0574  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x05d7  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0602  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0619  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x046a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x04d9  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo67238e() {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r2 = "createView"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            android.view.View r0 = r1.f276586n
            r4 = 2131300410(0x7f09103a, float:1.8218849E38)
            android.view.View r0 = r0.findViewById(r4)
            r1.f273914z = r0
            r4 = 2131316244(0x7f094e14, float:1.8250964E38)
            android.view.View r0 = r0.findViewById(r4)
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper r0 = (com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.view.AdLandingGeneralVideoWrapper) r0
            r1.f273883A = r0
            android.view.View r0 = r1.f273914z
            r4 = 2131313868(0x7f0944cc, float:1.8246145E38)
            android.view.View r0 = r0.findViewById(r4)
            r1.f273884B = r0
            android.view.View r0 = r1.f273914z
            r4 = 2131314332(0x7f09469c, float:1.8247086E38)
            android.view.View r0 = r0.findViewById(r4)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.f273885C = r0
            java.lang.String r4 = "initVideoContainer"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            android.view.View r0 = r1.f273914z
            r5 = 1
            java.lang.String r7 = "MicroMsg.Sns.AdLandingGeneralVideoComponent"
            if (r0 == 0) goto L_0x036e
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper r0 = r1.f273883A
            if (r0 != 0) goto L_0x0049
            goto L_0x036e
        L_0x0049:
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView r8 = r0.getVideoView()
            if (r8 != 0) goto L_0x005a
            java.lang.String r0 = "videoView is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            goto L_0x0377
        L_0x005a:
            android.view.View r0 = r1.f273914z
            qs2.f r9 = r22.mo130240W()
            float r9 = r9.f296499e
            int r9 = (int) r9
            qs2.f r10 = r22.mo130240W()
            float r10 = r10.f296497c
            int r10 = (int) r10
            qs2.f r11 = r22.mo130240W()
            float r11 = r11.f296500f
            int r11 = (int) r11
            qs2.f r12 = r22.mo130240W()
            float r12 = r12.f296498d
            int r12 = (int) r12
            r0.setPadding(r9, r10, r11, r12)
            qs2.f r0 = r22.mo130240W()
            java.lang.String r0 = r0.f296575B
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r9 != 0) goto L_0x00a7
            android.view.View r9 = r1.f273914z     // Catch:{ all -> 0x0091 }
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ all -> 0x0091 }
            r9.setBackgroundColor(r0)     // Catch:{ all -> 0x0091 }
            goto L_0x00a7
        L_0x0091:
            r0 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "parseColor exp is "
            r9.append(r10)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
        L_0x00a7:
            qs2.f r0 = r22.mo130240W()
            int r0 = r0.f296577D
            java.lang.String r9 = ", padding = "
            java.lang.String r10 = ", containerH = "
            java.lang.String r11 = ", containerW = "
            java.lang.String r12 = "createView, displayType = "
            r14 = 3
            if (r0 == 0) goto L_0x0232
            qs2.f r0 = r22.mo130240W()
            int r0 = r0.f296577D
            if (r0 != r14) goto L_0x00c2
            goto L_0x0232
        L_0x00c2:
            qs2.f r0 = r22.mo130240W()
            int r0 = r0.f296577D
            if (r0 != r5) goto L_0x017a
            java.lang.String r0 = "calcFullScreenLayoutParams"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            qs2.f r6 = r22.mo130240W()
            float r6 = r6.f296507m
            int r14 = r1.f276588p
            float r14 = (float) r14
            float r6 = r6 / r14
            qs2.f r14 = r22.mo130240W()
            float r14 = r14.f296508n
            int r13 = r1.f276589q
            float r15 = (float) r13
            float r14 = r14 / r15
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 <= 0) goto L_0x00fc
            int r6 = r1.f276588p
            float r13 = (float) r6
            qs2.f r14 = r22.mo130240W()
            float r14 = r14.f296508n
            float r13 = r13 * r14
            qs2.f r14 = r22.mo130240W()
            float r14 = r14.f296507m
            float r13 = r13 / r14
            int r13 = (int) r13
            int r13 = r13 + r5
            goto L_0x010d
        L_0x00fc:
            qs2.f r6 = r22.mo130240W()
            float r6 = r6.f296507m
            float r15 = r15 * r6
            qs2.f r6 = r22.mo130240W()
            float r6 = r6.f296508n
            float r15 = r15 / r6
            int r6 = (int) r15
            int r6 = r6 + r5
        L_0x010d:
            android.widget.RelativeLayout$LayoutParams r14 = new android.widget.RelativeLayout$LayoutParams
            r14.<init>(r6, r13)
            int r15 = r1.f276588p
            int r15 = r15 - r6
            r18 = 2
            int r15 = r15 / 2
            r14.leftMargin = r15
            r14.rightMargin = r15
            int r15 = r1.f276589q
            int r15 = r15 - r13
            int r15 = r15 / 2
            r14.topMargin = r15
            r14.bottomMargin = r15
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r12)
            qs2.f r12 = r22.mo130240W()
            int r12 = r12.f296577D
            r15.append(r12)
            r15.append(r11)
            r15.append(r6)
            r15.append(r10)
            r15.append(r13)
            r15.append(r9)
            android.view.View r6 = r1.f273914z
            java.lang.String r6 = vr2.C102260r.m134832A(r6)
            r15.append(r6)
            java.lang.String r6 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            r8.setLayoutParams(r14)
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper r0 = r1.f273883A
            android.widget.RelativeLayout$LayoutParams r6 = new android.widget.RelativeLayout$LayoutParams
            int r8 = r1.f276588p
            int r9 = r1.f276589q
            r6.<init>(r8, r9)
            r0.setLayoutParams(r6)
            android.view.View r0 = r1.f273914z
            android.widget.RelativeLayout$LayoutParams r6 = new android.widget.RelativeLayout$LayoutParams
            int r8 = r1.f276588p
            int r9 = r1.f276589q
            r6.<init>(r8, r9)
            r0.setLayoutParams(r6)
            goto L_0x02c5
        L_0x017a:
            qs2.f r0 = r22.mo130240W()
            int r0 = r0.f296577D
            r6 = 2
            if (r0 != r6) goto L_0x02c5
            java.lang.String r0 = "calcFullScreenCenterCropLayoutParams"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            qs2.f r6 = r22.mo130240W()
            float r6 = r6.f296507m
            int r13 = r1.f276588p
            float r13 = (float) r13
            float r6 = r6 / r13
            qs2.f r13 = r22.mo130240W()
            float r13 = r13.f296508n
            int r14 = r1.f276589q
            float r15 = (float) r14
            float r13 = r13 / r15
            int r6 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r6 >= 0) goto L_0x01b6
            int r6 = r1.f276588p
            float r13 = (float) r6
            qs2.f r14 = r22.mo130240W()
            float r14 = r14.f296508n
            float r13 = r13 * r14
            qs2.f r14 = r22.mo130240W()
            float r14 = r14.f296507m
            float r13 = r13 / r14
            int r13 = (int) r13
            int r14 = r13 + 1
            goto L_0x01c7
        L_0x01b6:
            qs2.f r6 = r22.mo130240W()
            float r6 = r6.f296507m
            float r15 = r15 * r6
            qs2.f r6 = r22.mo130240W()
            float r6 = r6.f296508n
            float r15 = r15 / r6
            int r6 = (int) r15
            int r6 = r6 + r5
        L_0x01c7:
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper r13 = r1.f273883A
            android.widget.ImageView r13 = r13.getThumbView()
            if (r13 == 0) goto L_0x01d4
            android.widget.ImageView$ScaleType r15 = android.widget.ImageView.ScaleType.CENTER_CROP
            r13.setScaleType(r15)
        L_0x01d4:
            android.widget.RelativeLayout$LayoutParams r13 = new android.widget.RelativeLayout$LayoutParams
            r13.<init>(r6, r14)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r12)
            qs2.f r12 = r22.mo130240W()
            int r12 = r12.f296577D
            r15.append(r12)
            r15.append(r11)
            r15.append(r6)
            r15.append(r10)
            r15.append(r14)
            r15.append(r9)
            android.view.View r6 = r1.f273914z
            java.lang.String r6 = vr2.C102260r.m134832A(r6)
            r15.append(r6)
            java.lang.String r6 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            r8.setLayoutParams(r13)
            com.tencent.mm.pluginsdk.ui.a$e r0 = com.tencent.p014mm.pluginsdk.p133ui.C96814a.C96817e.COVER
            r8.setScaleType(r0)
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper r0 = r1.f273883A
            android.widget.RelativeLayout$LayoutParams r6 = new android.widget.RelativeLayout$LayoutParams
            int r8 = r1.f276588p
            int r9 = r1.f276589q
            r6.<init>(r8, r9)
            r0.setLayoutParams(r6)
            android.view.View r0 = r1.f273914z
            android.widget.RelativeLayout$LayoutParams r6 = new android.widget.RelativeLayout$LayoutParams
            int r8 = r1.f276588p
            int r9 = r1.f276589q
            r6.<init>(r8, r9)
            r0.setLayoutParams(r6)
            goto L_0x02c5
        L_0x0232:
            qs2.f r0 = r22.mo130240W()
            float r0 = r0.f296507m
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x029d
            qs2.f r0 = r22.mo130240W()
            float r0 = r0.f296508n
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x029d
            qs2.f r0 = r22.mo130240W()
            float r0 = r0.f296507m
            int r0 = (int) r0
            qs2.f r6 = r22.mo130240W()
            float r6 = r6.f296508n
            int r6 = (int) r6
            android.widget.RelativeLayout$LayoutParams r13 = new android.widget.RelativeLayout$LayoutParams
            r13.<init>(r0, r6)
            r14 = 13
            r13.addRule(r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r12)
            qs2.f r12 = r22.mo130240W()
            int r12 = r12.f296577D
            r14.append(r12)
            r14.append(r11)
            r14.append(r0)
            r14.append(r10)
            r14.append(r6)
            r14.append(r9)
            android.view.View r0 = r1.f273914z
            java.lang.String r0 = vr2.C102260r.m134832A(r0)
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r8.setLayoutParams(r13)
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper r0 = r1.f273883A
            r0.setLayoutParams(r13)
            android.view.View r0 = r1.f273914z
            r0.setLayoutParams(r13)
            goto L_0x02c5
        L_0x029d:
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            int r6 = r1.f276588p
            int r9 = r1.f276589q
            r0.<init>(r6, r9)
            r8.setLayoutParams(r0)
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper r0 = r1.f273883A
            android.widget.RelativeLayout$LayoutParams r6 = new android.widget.RelativeLayout$LayoutParams
            int r8 = r1.f276588p
            int r9 = r1.f276589q
            r6.<init>(r8, r9)
            r0.setLayoutParams(r6)
            android.view.View r0 = r1.f273914z
            android.widget.RelativeLayout$LayoutParams r6 = new android.widget.RelativeLayout$LayoutParams
            int r8 = r1.f276588p
            int r9 = r1.f276589q
            r6.<init>(r8, r9)
            r0.setLayoutParams(r6)
        L_0x02c5:
            qs2.f r0 = r22.mo130240W()
            int r0 = r0.f296577D
            r6 = 3
            if (r0 != r6) goto L_0x02e6
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper r0 = r1.f273883A
            qs2.f r6 = r22.mo130240W()
            float r6 = r6.f296578E
            qs2.f r8 = r22.mo130240W()
            float r8 = r8.f296579F
            int r9 = r1.f276588p
            float r9 = (float) r9
            int r10 = r1.f276589q
            float r10 = (float) r10
            r0.mo130293g(r6, r8, r9, r10)
            goto L_0x02fd
        L_0x02e6:
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper r0 = r1.f273883A
            qs2.f r6 = r22.mo130240W()
            float r6 = r6.f296507m
            qs2.f r8 = r22.mo130240W()
            float r8 = r8.f296508n
            int r9 = r1.f276588p
            float r9 = (float) r9
            int r10 = r1.f276589q
            float r10 = (float) r10
            r0.mo130293g(r6, r8, r9, r10)
        L_0x02fd:
            java.lang.String r0 = "fixVideoBlackline"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            java.lang.String r6 = "hasPadding"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r3)
            qs2.f r8 = r22.mo130240W()
            float r9 = r8.f296499e
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x0327
            float r9 = r8.f296497c
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x0327
            float r9 = r8.f296500f
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x0327
            float r8 = r8.f296498d
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0325
            goto L_0x0327
        L_0x0325:
            r8 = 0
            goto L_0x0328
        L_0x0327:
            r8 = 1
        L_0x0328:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)
            if (r8 == 0) goto L_0x0331
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            goto L_0x036a
        L_0x0331:
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper r6 = r1.f273883A
            android.view.View r6 = r6.getInnerVideoView()
            boolean r8 = r6 instanceof com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView
            if (r8 == 0) goto L_0x0344
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.m r8 = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.m
            r8.<init>(r1, r6)
            r6.addOnLayoutChangeListener(r8)
            goto L_0x0367
        L_0x0344:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "onLayoutChange, innerVideoView="
            r8.append(r9)
            r8.append(r6)
            java.lang.String r6 = ", displayType="
            r8.append(r6)
            qs2.f r6 = r22.mo130240W()
            int r6 = r6.f296577D
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r6)
        L_0x0367:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
        L_0x036a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            goto L_0x0377
        L_0x036e:
            java.lang.String r0 = "mVideoContainer or mVideoViewWrapper is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
        L_0x0377:
            java.lang.String r0 = "initVideoView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper r4 = r1.f273883A
            r4.getClass()
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r6)
            r4.f274038n = r1
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView r8 = r4.f274031d
            if (r8 == 0) goto L_0x03bf
            r8.setLoop(r5)
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView r8 = r4.f274031d
            r8.setReporter(r4)
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView r8 = r4.f274031d
            r8.setIMMVideoViewCallback(r4)
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView r8 = r4.f274031d
            r8.setIMMDownloadFinish(r4)
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView r8 = r4.f274031d
            r8.setLoopCompletionCallback(r4)
            r4.setOnTouchListener(r4)
            r4.setOnClickListener(r4)
            java.lang.String r8 = ps2.C100891r.m132212g()
            com.tencent.p014mm.sdk.platformtools.FilePathGenerator.checkMkdir(r8)
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView r9 = r4.f274031d
            r9.setRootPath(r8)
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView r4 = r4.f274031d
            dp2.a r8 = new dp2.a
            r8.<init>()
            r4.setIOnlineVideoProxy(r8)
        L_0x03bf:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r6)
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper r4 = r1.f273883A
            qs2.f r8 = r22.mo130240W()
            int r8 = r8.f296576C
            r4.setPlayerMode(r8)
            zo2.a r4 = zo2.C103049a.m136281a()
            qs2.f r8 = r22.mo130240W()
            java.lang.String r8 = r8.f296495a
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper r9 = r1.f273883A
            r4.getClass()
            java.lang.String r10 = "add"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r11)
            java.lang.String r12 = "ScreenSwitchManager"
            if (r9 == 0) goto L_0x0419
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r13 == 0) goto L_0x03ee
            goto L_0x0419
        L_0x03ee:
            java.lang.ref.WeakReference r13 = new java.lang.ref.WeakReference
            r13.<init>(r9)
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r14 = r4.f304038d
            java.util.HashMap r14 = (java.util.HashMap) r14
            r14.put(r8, r13)
            android.content.Context r8 = r9.getContext()
            if (r8 != 0) goto L_0x040a
            java.lang.String r4 = "view getContext is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            goto L_0x0421
        L_0x040a:
            i72.d r9 = r4.f304040f
            if (r9 != 0) goto L_0x0415
            i72.d r9 = new i72.d
            r9.<init>(r8)
            r4.f304040f = r9
        L_0x0415:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            goto L_0x0421
        L_0x0419:
            java.lang.String r4 = "componentId or view is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
        L_0x0421:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            java.lang.String r0 = "initToolBar"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar r4 = new com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar
            android.content.Context r8 = r1.f273910x
            r9 = 0
            r4.<init>(r8, r9)
            r1.f273886D = r4
            boolean r8 = r22.mo140730J()
            if (r8 != 0) goto L_0x044c
            java.lang.String r8 = "checkHideVoiceIcon"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r3)
            qs2.f r9 = r22.mo130240W()
            boolean r9 = r9.f296581H
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r3)
            if (r9 == 0) goto L_0x044a
            goto L_0x044c
        L_0x044a:
            r8 = 0
            goto L_0x044d
        L_0x044c:
            r8 = 1
        L_0x044d:
            r4.setForceHideVoiceIcon(r8)
            com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar r4 = r1.f273886D
            boolean r8 = r22.mo140729I()
            r4.setForceHideFullScreenIcon(r8)
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper r4 = r1.f273883A
            com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar r8 = r1.f273886D
            r4.getClass()
            java.lang.String r9 = "setVideoFooterView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r6)
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView r4 = r4.f274031d
            if (r4 == 0) goto L_0x048f
            java.lang.String r10 = "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            boolean r11 = r8 instanceof android.view.View
            if (r11 != 0) goto L_0x0487
            java.lang.String r8 = r4.f283586e
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.String r4 = r4.mo76634K()
            r12 = 0
            r11[r12] = r4
            java.lang.String r4 = "%s set video footer view but is not view"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r4, r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            goto L_0x048f
        L_0x0487:
            r4.mo135081w()
            r4.f283594p = r8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
        L_0x048f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r6)
            android.widget.RelativeLayout$LayoutParams r4 = new android.widget.RelativeLayout$LayoutParams
            r8 = -1
            r9 = -2
            r4.<init>(r8, r9)
            r8 = 12
            r4.addRule(r8)
            boolean r9 = r22.mo140730J()
            if (r9 == 0) goto L_0x04b2
            boolean r9 = r22.mo140729I()
            if (r9 == 0) goto L_0x04b2
            android.content.Context r9 = r1.f273910x
            int r8 = kg3.C76577a.m92151b(r9, r8)
            r4.rightMargin = r8
        L_0x04b2:
            android.view.View r8 = r1.f273914z
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar r9 = r1.f273886D
            r8.addView(r9, r4)
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper r4 = r1.f273883A
            com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar r8 = r1.f273886D
            r4.setVideoToolBar(r8)
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper r4 = r1.f273883A
            android.view.View r8 = r1.f273914z
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r4.setVideoContainer(r8)
            com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar r4 = r1.f273886D
            r8 = 4
            r4.setVisibility(r8)
            qs2.f r4 = r22.mo130240W()
            boolean r4 = r4.f296580G
            if (r4 == 0) goto L_0x04f5
            com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar r4 = r1.f273886D
            r4.getClass()
            java.lang.String r8 = "voiceVisibility"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
            android.widget.ImageView r10 = r4.f274351g
            if (r10 == 0) goto L_0x04f2
            boolean r4 = r4.f274353i
            if (r4 != 0) goto L_0x04f2
            r4 = 0
            r10.setVisibility(r4)
        L_0x04f2:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
        L_0x04f5:
            com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar r4 = r1.f273886D
            android.view.View$OnClickListener r8 = r1.f273907Y
            r4.setOnVoiceButtonClickListener(r8)
            com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar r4 = r1.f273886D
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.l$d r8 = r1.f273908Z
            r4.setUpdateTimeListener(r8)
            com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar r4 = r1.f273886D
            android.view.View$OnClickListener r8 = r1.f273909p0
            r4.setOnFullScreenClickListener(r8)
            android.widget.ImageView r4 = r1.f273885C
            android.view.View$OnClickListener r8 = r1.f273911x0
            r4.setOnClickListener(r8)
            com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar r4 = r1.f273886D
            com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerSeekBar r4 = r4.getSeekBar()
            r1.f273887E = r4
            if (r4 == 0) goto L_0x0527
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper r8 = r1.f273883A
            r4.setIplaySeekCallback(r8)
            com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerSeekBar r4 = r1.f273887E
            android.view.View$OnClickListener r8 = r1.f273906X
            r4.setOnPlayButtonClickListener(r8)
        L_0x0527:
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.n2 r4 = r1.f273905W
            if (r4 == 0) goto L_0x052f
            r8 = 0
            r4.mo130250a(r8)
        L_0x052f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            java.lang.String r0 = "initThumbResource"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            long r8 = java.lang.System.currentTimeMillis()
            qs2.f r4 = r22.mo130240W()
            java.lang.String r4 = r4.f296574A
            java.lang.String r10 = "adId"
            java.lang.String r4 = ps2.C100891r.m132217l(r10, r4)
            boolean r10 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r10 == 0) goto L_0x0555
            r1.f273888F = r5
            java.lang.String r10 = "thumb resource is exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r10)
        L_0x0555:
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 - r8
            boolean r8 = r1.f273888F
            if (r8 == 0) goto L_0x0574
            long r8 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper r12 = r1.f273883A
            android.graphics.Bitmap r4 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r4)
            r12.setCover(r4)
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 - r8
            r1.mo130242Y(r12, r10)
            goto L_0x058f
        L_0x0574:
            qs2.f r4 = r22.mo130240W()
            java.lang.String r4 = r4.f296574A
            r18 = 0
            r19 = 1000000001(0x3b9aca01, float:0.004723788)
            r20 = 0
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.n r8 = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.n
            r8.<init>(r1, r10)
            java.lang.String r16 = "adId"
            r17 = r4
            r21 = r8
            ps2.C100891r.m132207b(r16, r17, r18, r19, r20, r21)
        L_0x058f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            java.lang.String r0 = "initVideoResource"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            long r8 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = "isExptGeneralVideoAdEnableH265"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = ps2.C100891r.m132212g()
            r4.append(r10)
            java.lang.String r10 = "AdLandingGeneralVideo_"
            r4.append(r10)
            qs2.f r10 = r22.mo130240W()
            java.lang.String r10 = r10.f296588z
            java.lang.String r10 = lo2.C99556n.m129947j(r10, r5)
            int r10 = r10.hashCode()
            r4.append(r10)
            java.lang.String r10 = ".mp4"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r4 == 0) goto L_0x05e8
            r1.f273889G = r5
            java.lang.String r4 = "video resource is exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r4)
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 1720(0x6b8, float:2.41E-42)
            r7 = 8
            r4.mo175911u(r5, r7)
        L_0x05e8:
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper r4 = r1.f273883A
            qs2.f r5 = r22.mo130240W()
            java.lang.String r5 = r5.f296588z
            r4.getClass()
            java.lang.String r7 = "setVideoPath"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r6)
            r10 = 0
            r4.f274034g = r10
            r4.f274035h = r5
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView r4 = r4.f274031d
            if (r4 == 0) goto L_0x0605
            r4.mo76636h(r10, r5, r10)
        L_0x0605:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r6)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r8
            java.lang.String r6 = "reportVideoOpTimeCost"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r3)
            boolean r7 = wo2.C102466d.m135253c()
            if (r7 == 0) goto L_0x0681
            boolean r7 = r1.f273889G
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = ""
            r8.append(r9)
            qs2.i0 r9 = r22.mo131854m()
            int r9 = r9.mo140742i()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            qs2.f r9 = r22.mo130240W()
            int r9 = r9.f296505k
            qs2.f r10 = r22.mo130240W()
            int r10 = r10.f296504j
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "snsId="
            r11.append(r12)
            qs2.i0 r12 = r22.mo131854m()
            java.lang.String r12 = r12.mo140740g()
            r11.append(r12)
            java.lang.String r12 = "|cid="
            r11.append(r12)
            qs2.f r12 = r22.mo130240W()
            java.lang.String r12 = r12.f296495a
            r11.append(r12)
            java.lang.String r12 = "|isVideoExist="
            r11.append(r12)
            r11.append(r7)
            java.lang.String r7 = "|videoOpCostTime="
            r11.append(r7)
            r11.append(r4)
            java.lang.String r4 = r11.toString()
            java.lang.String r5 = "landing_page_comp_inner_cost"
            vr2.C37817q.m41546b(r5, r8, r9, r10, r4)
        L_0x0681:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94651l.mo67238e():void");
    }

    /* renamed from: e0 */
    public final void mo130246e0(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("toastBonusSceneFloat", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        if (i <= i2) {
            this.f273894L = true;
            OpenSnsAdFloatPageEvent openSnsAdFloatPageEvent = new OpenSnsAdFloatPageEvent();
            openSnsAdFloatPageEvent.f264978d.f264979a = mo130240W().f296586M.f296647a;
            openSnsAdFloatPageEvent.publish();
        }
        SnsMethodCalculate.markEndTimeMs("toastBonusSceneFloat", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    /* renamed from: n */
    public int mo118819n() {
        SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        return C0966R.C0971layout.c17;
    }

    /* renamed from: t */
    public void mo130247t() {
        SnsMethodCalculate.markStartTimeMs("restoreToOriginState", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        super.mo130247t();
        if (AdLandingGeneralVideoWrapper.m119853k()) {
            mo130241X();
            AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper = this.f273883A;
            adLandingGeneralVideoWrapper.getClass();
            SnsMethodCalculate.markStartTimeMs("showThumbView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            AdLandingGeneralVideoView adLandingGeneralVideoView = adLandingGeneralVideoWrapper.f274031d;
            if (adLandingGeneralVideoView != null) {
                SnsMethodCalculate.markStartTimeMs("showThumbView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
                RelativeLayout relativeLayout = adLandingGeneralVideoView.f283590i;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(8);
                }
                SnsMethodCalculate.markEndTimeMs("showThumbView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
            }
            SnsMethodCalculate.markEndTimeMs("showThumbView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        }
        SnsMethodCalculate.markEndTimeMs("restoreToOriginState", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
    }

    /* renamed from: v */
    public boolean mo118822v(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        if (!super.mo118822v(jSONObject)) {
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            return false;
        }
        try {
            int playTimeInterval = this.f273883A.getPlayTimeInterval();
            jSONObject.put("videoDuration", this.f273883A.getVideoDurationSec());
            jSONObject.put("playTimeInterval", playTimeInterval);
            jSONObject.put("playCount", this.f273883A.getPlayCount());
            jSONObject.put("playCompletedCount", this.f273897P);
            jSONObject.put("clickFullscreenBtnCount", this.f273902T);
            jSONObject.put("doubleClickCount", this.f273901S);
            jSONObject.put("clickPlayControlCount", this.f273898Q);
            jSONObject.put("clickVoiceControlCount", this.f273900R);
            jSONObject.put("clickSightCount", this.f273903U);
            jSONObject.put("clickSightIconCount", this.f273904V);
            jSONObject.put("isAutoPlay", this.f273892J ? "1" : "0");
            if (!this.f273888F) {
                String mD5String = MD5Util.getMD5String(mo130240W().f296574A);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("urlMd5", mD5String);
                jSONObject2.put("needDownload", 1);
                jSONObject.put("thumbUrlInfo", jSONObject2);
            }
            if (!this.f273889G) {
                String mD5String2 = MD5Util.getMD5String(mo130240W().f296588z);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("urlMd5", mD5String2);
                jSONObject3.put("needDownload", 1);
                jSONObject.put("videoUrlInfo", jSONObject3);
            }
            C99157a adLandingVideoFullScreenFloatBarReportInfo = this.f273883A.getAdLandingVideoFullScreenFloatBarReportInfo();
            if (adLandingVideoFullScreenFloatBarReportInfo != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("cid", adLandingVideoFullScreenFloatBarReportInfo.f290735d);
                jSONObject4.put(C102646h.COL_EXPOSURECOUNT, adLandingVideoFullScreenFloatBarReportInfo.f290736e);
                jSONObject4.put("stayTime", adLandingVideoFullScreenFloatBarReportInfo.f290737f);
                jSONObject4.put("clickCount", adLandingVideoFullScreenFloatBarReportInfo.f290738g);
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put(C102646h.COL_EXPOSURECOUNT, adLandingVideoFullScreenFloatBarReportInfo.f290732a);
                jSONObject5.put("stayTime", adLandingVideoFullScreenFloatBarReportInfo.f290733b);
                jSONObject5.put("clickCount", adLandingVideoFullScreenFloatBarReportInfo.f290734c);
                jSONObject5.put("btnInfo", jSONObject4);
                jSONObject.put("fullVideoFloatBarInfo", jSONObject5);
            }
            C99572w.m129967a(TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS, mo131854m(), mo131555o(), playTimeInterval, "MicroMsg.Sns.AdLandingGeneralVideoComponent");
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            return true;
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.Sns.AdLandingGeneralVideoComponent", e, "", new Object[0]);
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            return false;
        }
    }
}
