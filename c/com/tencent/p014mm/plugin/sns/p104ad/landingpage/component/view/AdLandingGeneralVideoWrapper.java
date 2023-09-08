package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import bp2.C92278a;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94651l;
import com.tencent.p014mm.plugin.sns.p104ad.widget.advideo.AdLandingVideoPlayerToolBar;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95094h;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95098h0;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95107i;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.thumbplayer.api.ITPPlayer;
import di3.C86312j;
import eb0.C97621e;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C9556a;
import kg3.C76577a;
import kp2.C99157a;
import sn0.C90259e;
import vq2.C102233a;
import vq2.C102234b;
import xn2.C102693c;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper */
public class AdLandingGeneralVideoWrapper extends RelativeLayout implements C96814a.C96815a, C96814a.C96816c, C96814a.C57541b, C96814a.C57542d, C102693c, View.OnTouchListener, View.OnClickListener, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, C97621e.C97622a {

    /* renamed from: Q */
    public static final /* synthetic */ int f274015Q = 0;

    /* renamed from: A */
    public float f274016A;

    /* renamed from: B */
    public float f274017B;

    /* renamed from: C */
    public float f274018C;

    /* renamed from: D */
    public float f274019D;

    /* renamed from: E */
    public float f274020E;

    /* renamed from: F */
    public float f274021F;

    /* renamed from: G */
    public float f274022G;

    /* renamed from: H */
    public float f274023H;

    /* renamed from: I */
    public boolean f274024I;

    /* renamed from: J */
    public C95094h f274025J;

    /* renamed from: K */
    public long f274026K;

    /* renamed from: L */
    public int f274027L;

    /* renamed from: M */
    public int f274028M;

    /* renamed from: N */
    public long f274029N;

    /* renamed from: P */
    public int f274030P;

    /* renamed from: d */
    public AdLandingGeneralVideoView f274031d;

    /* renamed from: e */
    public AdLandingVideoPlayerToolBar f274032e;

    /* renamed from: f */
    public ViewGroup f274033f;

    /* renamed from: g */
    public int f274034g;

    /* renamed from: h */
    public String f274035h;

    /* renamed from: i */
    public GestureDetector f274036i;

    /* renamed from: j */
    public C97621e f274037j;

    /* renamed from: n */
    public C94690b f274038n;

    /* renamed from: o */
    public boolean f274039o;

    /* renamed from: p */
    public boolean f274040p;

    /* renamed from: q */
    public RelativeLayout.LayoutParams f274041q;

    /* renamed from: r */
    public int f274042r;

    /* renamed from: s */
    public int f274043s;

    /* renamed from: t */
    public RelativeLayout.LayoutParams f274044t;

    /* renamed from: u */
    public int f274045u;

    /* renamed from: v */
    public float f274046v;

    /* renamed from: w */
    public float f274047w;

    /* renamed from: x */
    public float f274048x;

    /* renamed from: y */
    public float f274049y;

    /* renamed from: z */
    public float f274050z;

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper$a */
    public class C94689a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f274051d;

        /* renamed from: e */
        public final /* synthetic */ boolean f274052e;

        public C94689a(int i, boolean z) {
            this.f274051d = i;
            this.f274052e = z;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper$1");
            AdLandingGeneralVideoView adLandingGeneralVideoView = AdLandingGeneralVideoWrapper.this.f274031d;
            if (adLandingGeneralVideoView != null) {
                adLandingGeneralVideoView.mo79629i0(this.f274051d, this.f274052e);
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper$b */
    public interface C94690b {
    }

    public AdLandingGeneralVideoWrapper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: k */
    public static boolean m119853k() {
        SnsMethodCalculate.markStartTimeMs("isShowThumb", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        boolean z = false;
        try {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_general_comp_exit_native_page_show_thumb, 1);
            Log.m105924i("MicroMsg.Sns.AdLandingGeneralVideoWrapper", "isShowThumb is " + Qe);
            if (Qe == 1) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isShowThumb", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return z;
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.Sns.AdLandingGeneralVideoWrapper", "isShowThumb, exp is " + th);
            SnsMethodCalculate.markEndTimeMs("isShowThumb", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return false;
        }
    }

    /* renamed from: F */
    public void mo22955F(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onVideoWaitingEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        mo130305h();
        Log.m105924i("MicroMsg.Sns.AdLandingGeneralVideoWrapper", "mediaId = " + str2 + ", end loading");
        SnsMethodCalculate.markEndTimeMs("onVideoWaitingEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: I1 */
    public void mo22956I1(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onVideoFirstFrameDraw", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        SnsMethodCalculate.markEndTimeMs("onVideoFirstFrameDraw", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: I2 */
    public void mo23179I2() {
        SnsMethodCalculate.markStartTimeMs("gain", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        SnsMethodCalculate.markEndTimeMs("gain", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: I3 */
    public void mo22957I3(String str, String str2, Boolean bool) {
        SnsMethodCalculate.markStartTimeMs("onVideoWaiting", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        this.f274029N = System.currentTimeMillis();
        Log.m105924i("MicroMsg.Sns.AdLandingGeneralVideoWrapper", "mediaId = " + str2 + ", start loading");
        SnsMethodCalculate.markEndTimeMs("onVideoWaiting", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: L */
    public void mo22958L(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onVideoEnded", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        SnsMethodCalculate.markEndTimeMs("onVideoEnded", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: N3 */
    public void mo23180N3() {
        SnsMethodCalculate.markStartTimeMs("lossTransient", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        SnsMethodCalculate.markEndTimeMs("lossTransient", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: R0 */
    public void mo23181R0() {
        SnsMethodCalculate.markStartTimeMs("lossTransientCanDuck", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        SnsMethodCalculate.markEndTimeMs("lossTransientCanDuck", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: T */
    public void mo22960T(String str, String str2, String str3, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        this.f274039o = true;
        C115669n.INSTANCE.mo175911u(1579, 10);
        Log.m105921e("MicroMsg.Sns.AdLandingGeneralVideoWrapper", "player callback error, %s, %s", str2, str3);
        SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: Z */
    public void mo22962Z(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        this.f274039o = false;
        Log.m105925i("MicroMsg.Sns.AdLandingGeneralVideoWrapper", "player callback onPrepared, %s", str2);
        SnsMethodCalculate.markEndTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: a */
    public void mo4335a(int i) {
        SnsMethodCalculate.markStartTimeMs("onSeekTo", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        C94690b bVar = this.f274038n;
        if (bVar != null) {
            C94651l lVar = (C94651l) bVar;
            lVar.getClass();
            SnsMethodCalculate.markStartTimeMs("onSeekTo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            lVar.f273896N = true;
            lVar.mo130243b0(i, true);
            Log.m105924i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "player callback onSeekTo time " + i);
            SnsMethodCalculate.markEndTimeMs("onSeekTo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        }
        SnsMethodCalculate.markEndTimeMs("onSeekTo", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: a0 */
    public void mo22963a0(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        C94690b bVar = this.f274038n;
        if (bVar != null) {
            SnsMethodCalculate.markStartTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper = ((C94651l) bVar).f273883A;
            adLandingGeneralVideoWrapper.getClass();
            SnsMethodCalculate.markStartTimeMs("abandonAudioFocus", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            C97621e eVar = adLandingGeneralVideoWrapper.f274037j;
            if (eVar != null) {
                eVar.mo136890b(false);
                SnsMethodCalculate.markEndTimeMs("abandonAudioFocus", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            } else {
                SnsMethodCalculate.markEndTimeMs("abandonAudioFocus", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            }
            Log.m105925i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "player callback onVideoPause, %s", str2);
            SnsMethodCalculate.markEndTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        }
        SnsMethodCalculate.markEndTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: b */
    public void mo81284b() {
        AdLandingVideoPlayerToolBar adLandingVideoPlayerToolBar;
        SnsMethodCalculate.markStartTimeMs("onLoopCompletion", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        C94690b bVar = this.f274038n;
        if (bVar != null) {
            C94651l lVar = (C94651l) bVar;
            SnsMethodCalculate.markStartTimeMs("onLoopCompletion", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            lVar.f273897P++;
            C92278a aVar = lVar.f296491u;
            if (aVar != null) {
                SnsMethodCalculate.markStartTimeMs("recordVideoCompletion", "com.tencent.mm.plugin.sns.ad.landingpage.helper.video.VideoCompletionMessageHelper");
                aVar.f264111a = true;
                SnsMethodCalculate.markEndTimeMs("recordVideoCompletion", "com.tencent.mm.plugin.sns.ad.landingpage.helper.video.VideoCompletionMessageHelper");
            }
            if (!(lVar.mo130240W().f296586M == null || lVar.f273894L || (adLandingVideoPlayerToolBar = lVar.f273886D) == null)) {
                SnsMethodCalculate.markStartTimeMs("isFullScreen", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
                boolean z = adLandingVideoPlayerToolBar.f274352h;
                SnsMethodCalculate.markEndTimeMs("isFullScreen", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
                if (!z) {
                    int videoDurationSec = lVar.f273883A.getVideoDurationSec() * 1000;
                    int i = lVar.mo130240W().f296586M.f296648b;
                    Log.m105924i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "OpenSnsAdFloatPageEvent, onLoopCompletion totalMs = " + videoDurationSec + ", floatStartTime = " + i + ", hasShowFloat = " + lVar.f273894L);
                    lVar.mo130246e0(videoDurationSec, i);
                }
            }
            Log.m105924i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "player callback onLoopCompletion");
            SnsMethodCalculate.markEndTimeMs("onLoopCompletion", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        }
        SnsMethodCalculate.markEndTimeMs("onLoopCompletion", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: c */
    public void mo4336c(int i) {
        SnsMethodCalculate.markStartTimeMs("onSeeking", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        SnsMethodCalculate.markEndTimeMs("onSeeking", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: d */
    public void mo130290d(boolean z) {
        SnsMethodCalculate.markStartTimeMs("adjustVideoViewLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        AdLandingGeneralVideoView adLandingGeneralVideoView = this.f274031d;
        if (adLandingGeneralVideoView == null) {
            SnsMethodCalculate.markEndTimeMs("adjustVideoViewLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return;
        }
        if (z) {
            RelativeLayout.LayoutParams layoutParams = this.f274044t;
            if (layoutParams != null) {
                adLandingGeneralVideoView.setLayoutParams(layoutParams);
            }
        } else {
            RelativeLayout.LayoutParams layoutParams2 = this.f274041q;
            if (layoutParams2 != null) {
                adLandingGeneralVideoView.setLayoutParams(layoutParams2);
            }
        }
        SnsMethodCalculate.markEndTimeMs("adjustVideoViewLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: e */
    public final void mo130291e(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f15) {
        SnsMethodCalculate.markStartTimeMs("animationLogic", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        AnimatorSet animatorSet = new AnimatorSet();
        LinkedList linkedList = new LinkedList();
        AdLandingGeneralVideoView adLandingGeneralVideoView = this.f274031d;
        adLandingGeneralVideoView.getClass();
        SnsMethodCalculate.markStartTimeMs("createAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        LinkedList linkedList2 = new LinkedList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(adLandingGeneralVideoView, "rotation", new float[]{f, f2});
        SnsMethodCalculate.markStartTimeMs("scaleAnimator", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(adLandingGeneralVideoView, "scaleX", new float[]{f3, f4});
        SnsMethodCalculate.markEndTimeMs("scaleAnimator", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        SnsMethodCalculate.markStartTimeMs("scaleAnimator", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(adLandingGeneralVideoView, "scaleY", new float[]{f3, f4});
        SnsMethodCalculate.markEndTimeMs("scaleAnimator", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        linkedList2.add(ofFloat);
        linkedList2.add(ofFloat2);
        linkedList2.add(ofFloat3);
        SnsMethodCalculate.markEndTimeMs("createAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        linkedList.addAll(linkedList2);
        this.f274032e.setPivotX(this.f274017B);
        this.f274032e.setPivotY(this.f274018C);
        AdLandingVideoPlayerToolBar adLandingVideoPlayerToolBar = this.f274032e;
        adLandingVideoPlayerToolBar.getClass();
        SnsMethodCalculate.markStartTimeMs("createAnimation", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        LinkedList linkedList3 = new LinkedList();
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(adLandingVideoPlayerToolBar, "rotation", new float[]{f, f2});
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(adLandingVideoPlayerToolBar, "translationX", new float[]{f5, f6});
        String str = "animationLogic";
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(adLandingVideoPlayerToolBar, "translationY", new float[]{f7, f8});
        String str2 = "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper";
        ValueAnimator ofFloat7 = ValueAnimator.ofFloat(new float[]{f9, f15});
        ofFloat7.addUpdateListener(new C102233a(adLandingVideoPlayerToolBar));
        ofFloat7.addListener(new C102234b(adLandingVideoPlayerToolBar));
        linkedList3.add(ofFloat4);
        linkedList3.add(ofFloat5);
        linkedList3.add(ofFloat6);
        linkedList3.add(ofFloat7);
        SnsMethodCalculate.markEndTimeMs("createAnimation", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        linkedList.addAll(linkedList3);
        C95094h hVar = this.f274025J;
        if (!(hVar == null || hVar.mo131609i() == null)) {
            View i = this.f274025J.mo131609i();
            i.setPivotX(this.f274019D);
            i.setPivotY(this.f274020E);
            C95094h hVar2 = this.f274025J;
            hVar2.getClass();
            SnsMethodCalculate.markStartTimeMs("createAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
            LinkedList linkedList4 = new LinkedList();
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(hVar2.f276000u, "rotation", new float[]{f, f2});
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(hVar2.f276000u, "translationX", new float[]{f5, f6});
            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(hVar2.f276000u, "translationY", new float[]{f7, f8});
            ValueAnimator ofFloat11 = ValueAnimator.ofFloat(new float[]{f9, f15});
            ofFloat11.addUpdateListener(new C95107i(hVar2));
            linkedList4.add(ofFloat8);
            linkedList4.add(ofFloat9);
            linkedList4.add(ofFloat10);
            linkedList4.add(ofFloat11);
            SnsMethodCalculate.markEndTimeMs("createAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
            linkedList.addAll(linkedList4);
        }
        animatorSet.playTogether(linkedList);
        if (this.f274024I) {
            animatorSet.setDuration(0);
        } else {
            animatorSet.setDuration(500);
        }
        animatorSet.start();
        SnsMethodCalculate.markEndTimeMs(str, str2);
    }

    /* renamed from: f */
    public final void mo130292f(float f, float f2) {
        SnsMethodCalculate.markStartTimeMs("calcPortraitLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        float f3 = this.f274022G;
        float f4 = this.f274023H;
        if (f / f3 > f2 / f4) {
            int i = (int) f3;
            this.f274042r = i;
            this.f274043s = ((int) ((((float) i) * f2) / f)) + 1;
        } else {
            int i2 = (int) f4;
            this.f274043s = i2;
            this.f274042r = ((int) ((((float) i2) * f) / f2)) + 1;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f274042r, this.f274043s);
        this.f274044t = layoutParams;
        int i3 = (((int) this.f274022G) - this.f274042r) / 2;
        layoutParams.leftMargin = i3;
        layoutParams.rightMargin = i3;
        int i4 = (((int) this.f274023H) - this.f274043s) / 2;
        layoutParams.topMargin = i4;
        layoutParams.bottomMargin = i4;
        SnsMethodCalculate.markEndTimeMs("calcPortraitLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: f2 */
    public void mo23185f2() {
        SnsMethodCalculate.markStartTimeMs("loss", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        SnsMethodCalculate.markEndTimeMs("loss", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: g */
    public void mo130293g(float f, float f2, float f3, float f4) {
        SnsMethodCalculate.markStartTimeMs("calcVideoFullScreenParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        try {
            this.f274022G = f3;
            this.f274023H = f4;
            this.f274041q = (RelativeLayout.LayoutParams) this.f274031d.getLayoutParams();
            mo130292f(f, f2);
            SnsMethodCalculate.markStartTimeMs("calcLandScapeScale", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            float f5 = this.f274023H;
            float f6 = this.f274022G;
            float f7 = (float) this.f274042r;
            float f8 = (float) this.f274043s;
            if (f5 / f6 > f7 / f8) {
                this.f274049y = f6 / f8;
            } else {
                this.f274049y = f5 / f7;
            }
            SnsMethodCalculate.markEndTimeMs("calcLandScapeScale", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            this.f274050z = (f4 - f3) / 2.0f;
            this.f274017B = f3 / 2.0f;
            AdLandingVideoPlayerToolBar adLandingVideoPlayerToolBar = this.f274032e;
            if (adLandingVideoPlayerToolBar == null || adLandingVideoPlayerToolBar.getHeight() <= 0) {
                this.f274018C = ((-f4) / 2.0f) + ((float) C76577a.m92151b(getContext(), 64));
            } else {
                this.f274018C = ((-f4) / 2.0f) + ((float) this.f274032e.getHeight());
            }
            this.f274019D = this.f274017B;
            this.f274020E = ((-f4) / 2.0f) + ((float) C76577a.m92151b(getContext(), 96));
            float b = (float) C76577a.m92151b(getContext(), 64);
            this.f274016A = b;
            this.f274021F = f4 - ((float) ((int) (b * 2.0f)));
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.Sns.AdLandingGeneralVideoWrapper", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("calcVideoFullScreenParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    public C99157a getAdLandingVideoFullScreenFloatBarReportInfo() {
        SnsMethodCalculate.markStartTimeMs("getAdLandingVideoFullScreenFloatBarReportInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        C95094h hVar = this.f274025J;
        C99157a aVar = null;
        if (hVar != null) {
            SnsMethodCalculate.markStartTimeMs("getAdLandingVideoFullScreenFloatBarReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
            SnsMethodCalculate.markStartTimeMs("getBtnComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
            C95098h0 h0Var = hVar.f276004y;
            SnsMethodCalculate.markEndTimeMs("getBtnComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
            if (h0Var != null) {
                aVar = new C99157a();
                hVar.mo131603E();
                aVar.f290735d = h0Var.mo131857r();
                aVar.f290736e = h0Var.mo131851j();
                aVar.f290737f = h0Var.mo131555o();
                aVar.f290738g = h0Var.mo131614H();
                aVar.f290732a = hVar.mo131851j();
                aVar.f290733b = hVar.mo131555o();
                aVar.f290734c = hVar.f275994A;
                SnsMethodCalculate.markEndTimeMs("getAdLandingVideoFullScreenFloatBarReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
            } else {
                SnsMethodCalculate.markEndTimeMs("getAdLandingVideoFullScreenFloatBarReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
            }
            SnsMethodCalculate.markEndTimeMs("getAdLandingVideoFullScreenFloatBarReportInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return aVar;
        }
        SnsMethodCalculate.markEndTimeMs("getAdLandingVideoFullScreenFloatBarReportInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return null;
    }

    public int getCurrPosMs() {
        SnsMethodCalculate.markStartTimeMs("getCurrPosMs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        AdLandingGeneralVideoView adLandingGeneralVideoView = this.f274031d;
        if (adLandingGeneralVideoView != null) {
            int currPosMs = adLandingGeneralVideoView.getCurrPosMs();
            SnsMethodCalculate.markEndTimeMs("getCurrPosMs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return currPosMs;
        }
        SnsMethodCalculate.markEndTimeMs("getCurrPosMs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return 0;
    }

    public int getCurrPosSec() {
        SnsMethodCalculate.markStartTimeMs("getCurrPosSec", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        AdLandingGeneralVideoView adLandingGeneralVideoView = this.f274031d;
        if (adLandingGeneralVideoView != null) {
            int currPosSec = adLandingGeneralVideoView.getCurrPosSec();
            SnsMethodCalculate.markEndTimeMs("getCurrPosSec", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return currPosSec;
        }
        SnsMethodCalculate.markEndTimeMs("getCurrPosSec", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return 0;
    }

    public View getInnerVideoView() {
        SnsMethodCalculate.markStartTimeMs("getInnerVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        AdLandingGeneralVideoView adLandingGeneralVideoView = this.f274031d;
        if (adLandingGeneralVideoView != null) {
            View innerVideoView = adLandingGeneralVideoView.getInnerVideoView();
            SnsMethodCalculate.markEndTimeMs("getInnerVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return innerVideoView;
        }
        SnsMethodCalculate.markEndTimeMs("getInnerVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return null;
    }

    public int getPlayCount() {
        SnsMethodCalculate.markStartTimeMs("getPlayCount", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        int i = this.f274028M;
        SnsMethodCalculate.markEndTimeMs("getPlayCount", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return i;
    }

    public int getPlayTimeInterval() {
        SnsMethodCalculate.markStartTimeMs("getPlayTimeInterval", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        int i = this.f274027L;
        SnsMethodCalculate.markEndTimeMs("getPlayTimeInterval", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return i;
    }

    public ImageView getThumbView() {
        SnsMethodCalculate.markStartTimeMs("getThumbView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        AdLandingGeneralVideoView adLandingGeneralVideoView = this.f274031d;
        if (adLandingGeneralVideoView != null) {
            ImageView thumbView = adLandingGeneralVideoView.getThumbView();
            SnsMethodCalculate.markEndTimeMs("getThumbView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return thumbView;
        }
        SnsMethodCalculate.markEndTimeMs("getThumbView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return null;
    }

    public AdLandingVideoPlayerToolBar getToolBar() {
        SnsMethodCalculate.markStartTimeMs("getToolBar", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        AdLandingVideoPlayerToolBar adLandingVideoPlayerToolBar = this.f274032e;
        SnsMethodCalculate.markEndTimeMs("getToolBar", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return adLandingVideoPlayerToolBar;
    }

    public ViewGroup getVideoCompContainer() {
        SnsMethodCalculate.markStartTimeMs("getVideoCompContainer", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        ViewGroup viewGroup = this.f274033f;
        SnsMethodCalculate.markEndTimeMs("getVideoCompContainer", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return viewGroup;
    }

    public int getVideoDurationSec() {
        SnsMethodCalculate.markStartTimeMs("getVideoDurationSec", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        AdLandingGeneralVideoView adLandingGeneralVideoView = this.f274031d;
        if (adLandingGeneralVideoView != null) {
            int videoDurationSec = adLandingGeneralVideoView.getVideoDurationSec();
            SnsMethodCalculate.markEndTimeMs("getVideoDurationSec", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return videoDurationSec;
        }
        int i = this.f274034g;
        SnsMethodCalculate.markEndTimeMs("getVideoDurationSec", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return i;
    }

    public AdLandingGeneralVideoView getVideoView() {
        SnsMethodCalculate.markStartTimeMs("getVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        AdLandingGeneralVideoView adLandingGeneralVideoView = this.f274031d;
        SnsMethodCalculate.markEndTimeMs("getVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return adLandingGeneralVideoView;
    }

    /* renamed from: h */
    public final void mo130305h() {
        SnsMethodCalculate.markStartTimeMs("calcVideoLoadingTime", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        if (this.f274029N != 0) {
            this.f274030P = (int) (((long) this.f274030P) + (System.currentTimeMillis() - this.f274029N));
            this.f274029N = 0;
        }
        SnsMethodCalculate.markEndTimeMs("calcVideoLoadingTime", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: i */
    public boolean mo130306i() {
        SnsMethodCalculate.markStartTimeMs("checkFullScreenFloatBarShowing", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        C95094h hVar = this.f274025J;
        boolean z = false;
        if (hVar != null) {
            hVar.getClass();
            SnsMethodCalculate.markStartTimeMs("isShowing", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
            if (hVar.f276000u.getVisibility() == 0) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isShowing", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
            SnsMethodCalculate.markEndTimeMs("checkFullScreenFloatBarShowing", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return z;
        }
        SnsMethodCalculate.markEndTimeMs("checkFullScreenFloatBarShowing", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return false;
    }

    public void idkeyStat(long j, long j2, long j3, boolean z) {
        SnsMethodCalculate.markStartTimeMs("idkeyStat", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        C115669n.INSTANCE.idkeyStat(j, j2, j3, z);
        SnsMethodCalculate.markEndTimeMs("idkeyStat", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: j */
    public void mo130307j(boolean z) {
        SnsMethodCalculate.markStartTimeMs("handleFullScreenFloatBarStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        if (!this.f274040p) {
            SnsMethodCalculate.markEndTimeMs("handleFullScreenFloatBarStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return;
        }
        C95094h hVar = this.f274025J;
        if (hVar == null) {
            SnsMethodCalculate.markEndTimeMs("handleFullScreenFloatBarStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return;
        }
        if (z) {
            hVar.mo131605H(true, 0);
        } else {
            hVar.mo131608K(true, 0);
        }
        SnsMethodCalculate.markEndTimeMs("handleFullScreenFloatBarStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    public void kvStat(int i, String str) {
        SnsMethodCalculate.markStartTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        C115669n.INSTANCE.kvStat(i, str);
        SnsMethodCalculate.markEndTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: l */
    public void mo130308l(int i) {
        int i2 = i;
        SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        if (i2 == -1 || i2 == 180) {
            SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return;
        }
        int i3 = this.f274045u;
        if (i3 == i2) {
            SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return;
        }
        if (i2 == 90) {
            this.f274047w = 90.0f;
            if (i3 == 0) {
                float f = this.f274046v;
                float f2 = this.f274048x;
                float f3 = this.f274049y;
                float f4 = this.f274050z;
                mo130291e(f, 90.0f, f2, f3, 0.0f, f4, 0.0f, this.f274016A + (-f4), this.f274022G, this.f274021F);
            } else {
                float f5 = this.f274046v;
                float f6 = this.f274049y;
                float f7 = this.f274050z;
                float f8 = -f7;
                float f9 = this.f274016A;
                float f15 = this.f274021F;
                mo130291e(f5, 90.0f, f6, f6, f8, f7, f7 - f9, f8 + f9, f15, f15);
            }
            this.f274046v = this.f274047w;
        } else if (i2 == -90) {
            this.f274047w = -90.0f;
            if (i3 == 0) {
                float f16 = this.f274046v;
                float f17 = this.f274048x;
                float f18 = this.f274049y;
                float f19 = this.f274050z;
                mo130291e(f16, -90.0f, f17, f18, 0.0f, -f19, 0.0f, f19 - this.f274016A, this.f274022G, this.f274021F);
            } else {
                float f25 = this.f274046v;
                float f26 = this.f274049y;
                float f27 = this.f274050z;
                float f28 = -f27;
                float f29 = this.f274016A;
                float f35 = this.f274021F;
                mo130291e(f25, -90.0f, f26, f26, f27, f28, f28 + f29, f27 - f29, f35, f35);
            }
            this.f274046v = this.f274047w;
        } else {
            this.f274047w = 0.0f;
            if (i3 == 90) {
                float f36 = this.f274046v;
                float f37 = this.f274049y;
                float f38 = this.f274048x;
                float f39 = this.f274050z;
                mo130291e(f36, 0.0f, f37, f38, f39, 0.0f, this.f274016A + (-f39), 0.0f, this.f274021F, this.f274022G);
            } else {
                float f44 = this.f274046v;
                float f45 = this.f274049y;
                float f46 = this.f274048x;
                float f47 = this.f274050z;
                mo130291e(f44, 0.0f, f45, f46, -f47, 0.0f, f47 - this.f274016A, 0.0f, this.f274021F, this.f274022G);
            }
            this.f274046v = this.f274047w;
        }
        C95094h hVar = this.f274025J;
        if (hVar != null) {
            SnsMethodCalculate.markStartTimeMs("setVideoOrientation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
            hVar.f275996C = i2;
            SnsMethodCalculate.markEndTimeMs("setVideoOrientation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        }
        this.f274045u = i2;
        SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: l0 */
    public void mo22964l0(String str, String str2, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        SnsMethodCalculate.markEndTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: m */
    public boolean mo130309m(int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("seekTo", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        MMHandlerThread.postToMainThread(new C94689a(i, z));
        SnsMethodCalculate.markEndTimeMs("seekTo", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return false;
    }

    /* renamed from: m0 */
    public void mo22965m0(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        C94690b bVar = this.f274038n;
        if (bVar != null) {
            C94651l lVar = (C94651l) bVar;
            lVar.getClass();
            SnsMethodCalculate.markStartTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            C92278a aVar = lVar.f296491u;
            if (aVar != null) {
                aVar.mo126267a();
            }
            AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper = lVar.f273883A;
            adLandingGeneralVideoWrapper.getClass();
            SnsMethodCalculate.markStartTimeMs("requestAudioFocus", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            C97621e eVar = adLandingGeneralVideoWrapper.f274037j;
            if (eVar != null) {
                eVar.mo136891c(adLandingGeneralVideoWrapper);
                SnsMethodCalculate.markEndTimeMs("requestAudioFocus", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            } else {
                SnsMethodCalculate.markEndTimeMs("requestAudioFocus", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            }
            if (!lVar.f273896N) {
                lVar.mo130241X();
                Log.m105924i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "onVideoPlay, but is not appear, pausePlay");
                C115669n.INSTANCE.mo175911u(1910, 9);
            }
            Log.m105925i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "player callback onVideoPlay, %s", str2);
            SnsMethodCalculate.markEndTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        }
        SnsMethodCalculate.markEndTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: o */
    public void mo129208o(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onDownloadFinish", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        SnsMethodCalculate.markEndTimeMs("onDownloadFinish", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ad/landingpage/component/view/AdLandingGeneralVideoWrapper", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/landingpage/component/view/AdLandingGeneralVideoWrapper", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ad/landingpage/component/view/AdLandingGeneralVideoWrapper", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        SnsMethodCalculate.markStartTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        C94690b bVar = this.f274038n;
        if (bVar != null) {
            C94651l lVar = (C94651l) bVar;
            lVar.getClass();
            SnsMethodCalculate.markStartTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            if (lVar.mo130240W().f296580G) {
                SnsMethodCalculate.markEndTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            } else {
                lVar.mo130239V(lVar.f273913y0);
                lVar.f273901S++;
                if (lVar.mo130233K()) {
                    lVar.mo130241X();
                    lVar.f273912y = 4;
                } else {
                    lVar.f273896N = true;
                    lVar.mo130245d0(true);
                    lVar.f273912y = 3;
                }
                SnsMethodCalculate.markEndTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            }
            SnsMethodCalculate.markEndTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/sns/ad/landingpage/component/view/AdLandingGeneralVideoWrapper", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ad/landingpage/component/view/AdLandingGeneralVideoWrapper", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onDoubleTapEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        SnsMethodCalculate.markEndTimeMs("onDoubleTapEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onDown", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        SnsMethodCalculate.markEndTimeMs("onDown", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return false;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        SnsMethodCalculate.markStartTimeMs("onFling", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        SnsMethodCalculate.markEndTimeMs("onFling", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ad/landingpage/component/view/AdLandingGeneralVideoWrapper", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        SnsMethodCalculate.markStartTimeMs(C90259e.C90260a.NAME, "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        SnsMethodCalculate.markEndTimeMs(C90259e.C90260a.NAME, "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/landingpage/component/view/AdLandingGeneralVideoWrapper", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return false;
    }

    public void onSeekComplete(ITPPlayer iTPPlayer) {
        SnsMethodCalculate.markStartTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        SnsMethodCalculate.markEndTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    public void onSeekPre() {
        SnsMethodCalculate.markStartTimeMs("onSeekPre", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        C94690b bVar = this.f274038n;
        if (bVar != null) {
            C94651l lVar = (C94651l) bVar;
            lVar.getClass();
            SnsMethodCalculate.markStartTimeMs("onSeekPre", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            lVar.mo130239V(lVar.f273913y0);
            SnsMethodCalculate.markEndTimeMs("onSeekPre", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        }
        SnsMethodCalculate.markEndTimeMs("onSeekPre", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    public void onShowPress(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onShowPress", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        SnsMethodCalculate.markEndTimeMs("onShowPress", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        C94690b bVar = this.f274038n;
        boolean z = false;
        if (bVar != null) {
            C94651l lVar = (C94651l) bVar;
            lVar.getClass();
            SnsMethodCalculate.markStartTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            if (lVar.mo130240W().f296580G) {
                SnsMethodCalculate.markEndTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            } else {
                lVar.f273903U++;
                SnsMethodCalculate.markStartTimeMs("isProcessBarDisplay", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
                AdLandingVideoPlayerToolBar adLandingVideoPlayerToolBar = lVar.f273886D;
                if (adLandingVideoPlayerToolBar != null && adLandingVideoPlayerToolBar.getVisibility() == 0) {
                    z = true;
                }
                SnsMethodCalculate.markEndTimeMs("isProcessBarDisplay", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
                lVar.mo130244c0(!z);
                SnsMethodCalculate.markEndTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
            }
            SnsMethodCalculate.markEndTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return false;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ad/landingpage/component/view/AdLandingGeneralVideoWrapper", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        SnsMethodCalculate.markStartTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        SnsMethodCalculate.markEndTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ad/landingpage/component/view/AdLandingGeneralVideoWrapper", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ad/landingpage/component/view/AdLandingGeneralVideoWrapper", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        GestureDetector gestureDetector = this.f274036i;
        if (gestureDetector != null) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(motionEvent2);
            GestureDetector gestureDetector2 = gestureDetector;
            C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/view/AdLandingGeneralVideoWrapper", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
            C117292a.m165360f(gestureDetector2, onTouchEvent, "com/tencent/mm/plugin/sns/ad/landingpage/component/view/AdLandingGeneralVideoWrapper", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            C117292a.m165362h(onTouchEvent, this, "com/tencent/mm/plugin/sns/ad/landingpage/component/view/AdLandingGeneralVideoWrapper", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return onTouchEvent;
        }
        SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ad/landingpage/component/view/AdLandingGeneralVideoWrapper", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }

    public void setAnimImmediately(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setAnimImmediately", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        this.f274024I = z;
        SnsMethodCalculate.markEndTimeMs("setAnimImmediately", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    public void setCover(Bitmap bitmap) {
        SnsMethodCalculate.markStartTimeMs("setCover", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        AdLandingGeneralVideoView adLandingGeneralVideoView = this.f274031d;
        if (adLandingGeneralVideoView != null) {
            adLandingGeneralVideoView.setCover(bitmap);
        }
        SnsMethodCalculate.markEndTimeMs("setCover", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    public void setFullScreen(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setFullScreen", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        this.f274040p = z;
        SnsMethodCalculate.markEndTimeMs("setFullScreen", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    public void setMute(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setMute", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        AdLandingGeneralVideoView adLandingGeneralVideoView = this.f274031d;
        if (adLandingGeneralVideoView != null) {
            adLandingGeneralVideoView.setMute(z);
        }
        SnsMethodCalculate.markEndTimeMs("setMute", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    public void setPlayerMode(int i) {
        SnsMethodCalculate.markStartTimeMs("setPlayerMode", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        AdLandingGeneralVideoView adLandingGeneralVideoView = this.f274031d;
        if (adLandingGeneralVideoView != null) {
            adLandingGeneralVideoView.setVideoPlayerMode(i);
        }
        SnsMethodCalculate.markEndTimeMs("setPlayerMode", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    public void setVideoContainer(ViewGroup viewGroup) {
        SnsMethodCalculate.markStartTimeMs("setVideoContainer", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        this.f274033f = viewGroup;
        SnsMethodCalculate.markEndTimeMs("setVideoContainer", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    public void setVideoToolBar(AdLandingVideoPlayerToolBar adLandingVideoPlayerToolBar) {
        SnsMethodCalculate.markStartTimeMs("setVideoToolBar", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        this.f274032e = adLandingVideoPlayerToolBar;
        SnsMethodCalculate.markEndTimeMs("setVideoToolBar", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    public AdLandingGeneralVideoWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f274039o = false;
        this.f274045u = 0;
        this.f274046v = 0.0f;
        this.f274047w = 0.0f;
        this.f274048x = 1.0f;
        this.f274026K = 0;
        this.f274027L = 0;
        this.f274028M = 0;
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        this.f274031d = new AdLandingGeneralVideoView(context, (AttributeSet) null);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.f274031d, layoutParams);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        this.f274036i = new GestureDetector(this);
        this.f274037j = new C97621e();
    }
}
