package com.tencent.p014mm.plugin.sns.p104ad.widget.adsocial;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.C94724k;
import com.tencent.p014mm.plugin.sns.p104ad.widget.adsocial.AdSocialAttitudeView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAvatarImageView;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import nq2.C100151a;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;
import rq2.C63505q;
import uq2.C102071b;
import vr2.C102236a0;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView */
public class AdAttitudeAttractView extends FrameLayout implements AdSocialAttitudeView.C94752h, C0124r, C111847h {

    /* renamed from: G */
    public static final /* synthetic */ int f274230G = 0;

    /* renamed from: A */
    public boolean f274231A;

    /* renamed from: B */
    public String f274232B;

    /* renamed from: C */
    public boolean f274233C;

    /* renamed from: D */
    public boolean f274234D;

    /* renamed from: E */
    public PAGView.PAGViewListener f274235E;

    /* renamed from: F */
    public final ViewTreeObserver.OnPreDrawListener f274236F;

    /* renamed from: d */
    public SnsInfo f274237d;

    /* renamed from: e */
    public C100151a.C100155d f274238e;

    /* renamed from: f */
    public Context f274239f;

    /* renamed from: g */
    public PAGView f274240g;

    /* renamed from: h */
    public boolean f274241h;

    /* renamed from: i */
    public String f274242i;

    /* renamed from: j */
    public View f274243j;

    /* renamed from: n */
    public int f274244n;

    /* renamed from: o */
    public int f274245o;

    /* renamed from: p */
    public int f274246p;

    /* renamed from: q */
    public int f274247q;

    /* renamed from: r */
    public int f274248r;

    /* renamed from: s */
    public int f274249s;

    /* renamed from: t */
    public int f274250t;

    /* renamed from: u */
    public int f274251u;

    /* renamed from: v */
    public int f274252v;

    /* renamed from: w */
    public float f274253w;

    /* renamed from: x */
    public int f274254x;

    /* renamed from: y */
    public int f274255y;

    /* renamed from: z */
    public int f274256z;

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$a */
    public class C94736a extends SimplePAGViewUpdateListener {
        public C94736a() {
        }

        public void onAnimationCancel(PAGView pAGView) {
            SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$1");
            SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$1");
        }

        public void onAnimationEnd(PAGView pAGView) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$1");
            try {
                AdAttitudeAttractView.this.setVisibility(8);
                if (!(AdAttitudeAttractView.m119952b(AdAttitudeAttractView.this) == null || AdAttitudeAttractView.m119952b(AdAttitudeAttractView.this).f293348D == null || !AdAttitudeAttractView.m119952b(AdAttitudeAttractView.this).f293348D.mo130474m())) {
                    AdAttitudeAttractView.m119952b(AdAttitudeAttractView.this).f293348D.mo130480q();
                    Log.m105924i("AdAttitudeAttractView", "attract animation end, start play icon attract animation");
                }
                AdAttitudeAttractView adAttitudeAttractView = AdAttitudeAttractView.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                adAttitudeAttractView.mo130447h();
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$1");
        }

        public void onAnimationRepeat(PAGView pAGView) {
            SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$1");
            SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$1");
        }

        public void onAnimationStart(PAGView pAGView) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$1");
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$b */
    public class C94737b implements Runnable {
        public C94737b() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$2");
            AdAttitudeAttractView.m119953c(AdAttitudeAttractView.this).play();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$c */
    public class C94738c implements Runnable {
        public C94738c() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$3");
            AdAttitudeAttractView.m119953c(AdAttitudeAttractView.this).stop();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$d */
    public class C94739d implements ViewTreeObserver.OnPreDrawListener {
        public C94739d() {
        }

        public boolean onPreDraw() {
            SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$4");
            AdAttitudeAttractView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            AdAttitudeAttractView.m119954d(AdAttitudeAttractView.this);
            SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$4");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$e */
    public class C94740e implements Animator.AnimatorListener {

        /* renamed from: com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$e$a */
        public class C94741a implements Runnable {
            public C94741a() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$5$1");
                AdAttitudeAttractView.m119953c(AdAttitudeAttractView.this).stop();
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$5$1");
            }
        }

        public C94740e() {
        }

        public void onAnimationCancel(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$5");
            SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$5");
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$5");
            AdAttitudeAttractView.this.setVisibility(8);
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$5");
        }

        public void onAnimationRepeat(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$5");
            SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$5");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$5");
            try {
                AdAttitudeAttractView adAttitudeAttractView = AdAttitudeAttractView.this;
                int i = AdAttitudeAttractView.f274230G;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                adAttitudeAttractView.mo130447h();
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                AdAttitudeAttractView.m119953c(AdAttitudeAttractView.this).post(new C94741a());
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$5");
        }
    }

    public AdAttitudeAttractView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    public static /* synthetic */ C100151a.C100155d m119952b(AdAttitudeAttractView adAttitudeAttractView) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        C100151a.C100155d dVar = adAttitudeAttractView.f274238e;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        return dVar;
    }

    /* renamed from: c */
    public static /* synthetic */ PAGView m119953c(AdAttitudeAttractView adAttitudeAttractView) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        PAGView pAGView = adAttitudeAttractView.f274240g;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        return pAGView;
    }

    /* renamed from: d */
    public static void m119954d(AdAttitudeAttractView adAttitudeAttractView) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        adAttitudeAttractView.getClass();
        SnsMethodCalculate.markStartTimeMs("calcPagPlayViewParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        try {
            C100151a.C100155d dVar = adAttitudeAttractView.f274238e;
            View view = dVar.f293377v;
            SnsAvatarImageView snsAvatarImageView = dVar.f293380y;
            View view2 = dVar.f293379x;
            if (!(view == null || view2 == null)) {
                if (snsAvatarImageView != null) {
                    int width = view2.getWidth();
                    int height = view2.getHeight();
                    if (width > 0) {
                        if (height > 0) {
                            int[] iArr = new int[2];
                            view2.getLocationOnScreen(iArr);
                            adAttitudeAttractView.f274248r = iArr[1];
                            adAttitudeAttractView.f274249s = height;
                            adAttitudeAttractView.f274253w = ((float) height) * adAttitudeAttractView.f274237d.getAdXml().adSocialInfo.f294144d.f294160d;
                            int[] iArr2 = new int[2];
                            snsAvatarImageView.getLocationOnScreen(iArr2);
                            int i = iArr2[0];
                            adAttitudeAttractView.f274251u = i - adAttitudeAttractView.f274254x;
                            adAttitudeAttractView.f274252v = i + adAttitudeAttractView.f274255y + width + adAttitudeAttractView.f274256z;
                            WindowManager windowManager = (WindowManager) adAttitudeAttractView.getContext().getSystemService("window");
                            adAttitudeAttractView.f274246p = Math.min(windowManager.getDefaultDisplay().getWidth(), windowManager.getDefaultDisplay().getHeight());
                            int[] iArr3 = new int[2];
                            view.getLocationOnScreen(iArr3);
                            adAttitudeAttractView.f274250t = iArr3[1];
                            int[] iArr4 = new int[2];
                            adAttitudeAttractView.getLocationOnScreen(iArr4);
                            adAttitudeAttractView.setLeftMarginOff(iArr4[0]);
                            adAttitudeAttractView.setTopMarginOff(iArr4[1] - iArr3[1]);
                            if (adAttitudeAttractView.f274238e.f293355K.f293340a == 0) {
                                View view3 = adAttitudeAttractView.f274243j;
                                if (view3 == null) {
                                    adAttitudeAttractView.f274247q = view.getHeight();
                                } else {
                                    int[] iArr5 = new int[2];
                                    view3.getLocationOnScreen(iArr5);
                                    adAttitudeAttractView.f274247q = iArr5[1] - iArr3[1];
                                }
                            } else {
                                adAttitudeAttractView.f274247q = view.getHeight();
                            }
                            if (adAttitudeAttractView.f274238e.f293355K.f293340a == 0) {
                                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) adAttitudeAttractView.getLayoutParams();
                                layoutParams.width = adAttitudeAttractView.f274246p;
                                layoutParams.height = adAttitudeAttractView.f274247q;
                            } else {
                                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) adAttitudeAttractView.getLayoutParams();
                                layoutParams2.width = adAttitudeAttractView.f274246p;
                                layoutParams2.height = adAttitudeAttractView.f274247q;
                            }
                            Log.m105924i("AdAttitudeAttractView", "adAttitudeAttractView calcPagPlayViewParams width is " + adAttitudeAttractView.f274246p + ", height is " + adAttitudeAttractView.f274247q);
                            ViewParent parent = adAttitudeAttractView.getParent();
                            if (parent instanceof FrameLayout) {
                                FrameLayout frameLayout = (FrameLayout) parent;
                                frameLayout.setClipChildren(false);
                                frameLayout.setClipToPadding(false);
                                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
                                if (layoutParams3.width == 0) {
                                    layoutParams3.width = -1;
                                }
                                if (layoutParams3.height == 0) {
                                    layoutParams3.height = -1;
                                }
                            }
                            adAttitudeAttractView.mo130444e();
                            adAttitudeAttractView.requestLayout();
                            SnsMethodCalculate.markEndTimeMs("calcPagPlayViewParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("calcPagPlayViewParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                    SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                }
            }
            SnsMethodCalculate.markEndTimeMs("calcPagPlayViewParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        } catch (Throwable th) {
            Log.m105920e("AdAttitudeAttractView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
    }

    private void setLeftMarginOff(int i) {
        SnsMethodCalculate.markStartTimeMs("setLeftMarginOff", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        if (this.f274238e.f293355K.f293340a == 0) {
            ((RelativeLayout.LayoutParams) getLayoutParams()).leftMargin -= i;
        } else {
            ((FrameLayout.LayoutParams) getLayoutParams()).leftMargin -= i;
        }
        SnsMethodCalculate.markEndTimeMs("setLeftMarginOff", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
    }

    private void setTopMarginOff(int i) {
        SnsMethodCalculate.markStartTimeMs("setTopMarginOff", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        if (this.f274238e.f293355K.f293340a == 0) {
            ((RelativeLayout.LayoutParams) getLayoutParams()).topMargin -= i;
        } else {
            ((FrameLayout.LayoutParams) getLayoutParams()).topMargin -= i;
        }
        SnsMethodCalculate.markEndTimeMs("setTopMarginOff", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
    }

    /* renamed from: a */
    public void mo130443a() {
        SnsMethodCalculate.markStartTimeMs("onShowAttitude", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        try {
            if (!this.f274240g.isPlaying()) {
                Log.m105924i("AdAttitudeAttractView", "onShowAttitude but mAdAttractShowAnim is not playing so return");
                SnsMethodCalculate.markEndTimeMs("onShowAttitude", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                return;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0f, 0.0f});
            ofFloat.setDuration(300);
            ofFloat.addListener(new C94740e());
            ofFloat.start();
            SnsMethodCalculate.markEndTimeMs("onShowAttitude", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    public final void mo130444e() {
        SnsMethodCalculate.markStartTimeMs("calcPagViewDisplayParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        if (this.f274246p <= 0 || this.f274247q <= 0 || this.f274249s <= 0) {
            Log.m105920e("AdAttitudeAttractView", "start play pagView, but can not calcPagViewDisplayParams, mWidth or mHeight or mContentContainerHeight <= 0");
            SnsMethodCalculate.markEndTimeMs("calcPagViewDisplayParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f274240g.getLayoutParams();
        int i = this.f274246p;
        layoutParams.width = i;
        layoutParams.height = (i * this.f274245o) / this.f274244n;
        this.f274240g.setLayoutParams(layoutParams);
        float f = ((float) ((this.f274248r + (this.f274249s / 2)) - (this.f274250t + (layoutParams.height / 2)))) + this.f274253w;
        int i2 = ((this.f274252v + this.f274251u) - this.f274246p) / 2;
        Log.m105924i("AdAttitudeAttractView", "offsetX is " + i2 + ", offsetY is " + f + ", showAnimLayoutParams height is " + layoutParams.height + ", mSnsLinearContentRightX is " + this.f274252v + ", mSnsLinearContentLeftX is " + this.f274251u + ", mWidth is " + this.f274246p);
        this.f274240g.setTranslationX((float) i2);
        this.f274240g.setTranslationY(f);
        SnsMethodCalculate.markEndTimeMs("calcPagViewDisplayParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
    }

    /* renamed from: f */
    public final boolean mo130445f() {
        SnsMethodCalculate.markStartTimeMs("checkPAGFileDownload", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        SnsInfo snsInfo = this.f274237d;
        boolean z = false;
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("checkPAGFileDownload", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
            return false;
        } else if (!Util.nullAsNil(snsInfo.getAdXml().adSocialInfo.f294144d.f294158b).equals(this.f274232B) || !this.f274231A) {
            SnsMethodCalculate.markStartTimeMs("initPagAnimViewData", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
            SnsInfo snsInfo2 = this.f274237d;
            if (snsInfo2 == null) {
                SnsMethodCalculate.markEndTimeMs("initPagAnimViewData", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
            } else {
                String nullAsNil = Util.nullAsNil(snsInfo2.getAdXml().adSocialInfo.f294144d.f294158b);
                String b = C94724k.m119922b(nullAsNil, Util.nullAsNil(this.f274237d.getAdXml().adSocialInfo.f294144d.f294159c));
                this.f274232B = nullAsNil;
                this.f274231A = false;
                if (!TextUtils.isEmpty(b)) {
                    PAGFile Load = PAGFile.Load(C94724k.m119923c(b));
                    this.f274244n = Load.width();
                    this.f274245o = Load.height();
                    this.f274240g.setComposition(Load);
                    this.f274240g.setScaleMode(3);
                    this.f274240g.setRepeatCount(1);
                    this.f274231A = true;
                    Log.m105924i("AdAttitudeAttractView", "initPagAnimViewData, use server file");
                    SnsMethodCalculate.markEndTimeMs("initPagAnimViewData", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                    z = true;
                } else {
                    C94724k.m119921a(nullAsNil);
                    Log.m105924i("AdAttitudeAttractView", "initPagAnimViewData, start download pagFile");
                    C115669n.INSTANCE.mo175911u(1612, 101);
                    if (!this.f274234D) {
                        C102071b bVar = new C102071b();
                        bVar.mo141566c(C102236a0.m134728W(this.f274237d), this.f274237d.getAdInfo(this.f274238e.f293355K.f293340a).uxInfo, this.f274238e.f293355K.f293340a, 0, 1);
                        C63505q.m74843b(bVar);
                    }
                    this.f274234D = true;
                    SnsMethodCalculate.markEndTimeMs("initPagAnimViewData", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                }
            }
            SnsMethodCalculate.markEndTimeMs("checkPAGFileDownload", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
            return z;
        } else {
            Log.m105924i("AdAttitudeAttractView", "checkPAGFileDownload, return true directly");
            SnsMethodCalculate.markEndTimeMs("checkPAGFileDownload", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
            return true;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:18|19|20|(1:22)|23|24|26|28) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0082 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo130446g(com.tencent.p014mm.plugin.sns.storage.SnsInfo r11) {
        /*
            r10 = this;
            java.lang.String r0 = "startPAGAnimating"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            if (r11 != 0) goto L_0x000e
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x000e:
            nq2.a$d r2 = r10.f274238e     // Catch:{ all -> 0x00da }
            nq2.a$c r3 = r2.f293355K     // Catch:{ all -> 0x00da }
            int r3 = r3.f293340a     // Catch:{ all -> 0x00da }
            if (r3 != 0) goto L_0x0025
            android.view.View r3 = r10.f274243j     // Catch:{ all -> 0x00da }
            if (r3 != 0) goto L_0x0025
            android.view.View r2 = r2.f293377v     // Catch:{ all -> 0x00da }
            r3 = 2131296846(0x7f09024e, float:1.821162E38)
            android.view.View r2 = r2.findViewById(r3)     // Catch:{ all -> 0x00da }
            r10.f274243j = r2     // Catch:{ all -> 0x00da }
        L_0x0025:
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x00da }
            r3 = 1612(0x64c, float:2.259E-42)
            r4 = 100
            r2.mo175911u(r3, r4)     // Catch:{ all -> 0x00da }
            boolean r2 = r10.mo130445f()     // Catch:{ all -> 0x00da }
            java.lang.String r3 = "AdAttitudeAttractView"
            if (r2 == 0) goto L_0x00d5
            int r2 = r10.f274244n     // Catch:{ all -> 0x00da }
            if (r2 <= 0) goto L_0x00d5
            int r2 = r10.f274245o     // Catch:{ all -> 0x00da }
            if (r2 <= 0) goto L_0x00d5
            r2 = 1
            r10.f274241h = r2     // Catch:{ all -> 0x00da }
            org.libpag.PAGView r4 = r10.f274240g     // Catch:{ all -> 0x00da }
            r5 = 0
            r4.setProgress(r5)     // Catch:{ all -> 0x00da }
            r4 = 1065353216(0x3f800000, float:1.0)
            r10.setAlpha(r4)     // Catch:{ all -> 0x00da }
            r4 = 0
            r10.setVisibility(r4)     // Catch:{ all -> 0x00da }
            java.lang.String r4 = "resizePagViewUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r1)     // Catch:{ all -> 0x00da }
            android.view.ViewTreeObserver r5 = r10.getViewTreeObserver()     // Catch:{ all -> 0x00da }
            android.view.ViewTreeObserver$OnPreDrawListener r6 = r10.f274236F     // Catch:{ all -> 0x00da }
            r5.removeOnPreDrawListener(r6)     // Catch:{ all -> 0x00da }
            android.view.ViewTreeObserver r5 = r10.getViewTreeObserver()     // Catch:{ all -> 0x00da }
            android.view.ViewTreeObserver$OnPreDrawListener r6 = r10.f274236F     // Catch:{ all -> 0x00da }
            r5.addOnPreDrawListener(r6)     // Catch:{ all -> 0x00da }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)     // Catch:{ all -> 0x00da }
            java.lang.String r4 = "startListenPagView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r1)     // Catch:{ all -> 0x00da }
            boolean r5 = r10.f274233C     // Catch:{ all -> 0x0082 }
            if (r5 != 0) goto L_0x0082
            r10.f274233C = r2     // Catch:{ all -> 0x0082 }
            org.libpag.PAGView r2 = r10.f274240g     // Catch:{ all -> 0x0082 }
            org.libpag.PAGView$PAGViewListener r5 = r10.f274235E     // Catch:{ all -> 0x0082 }
            r2.addListener(r5)     // Catch:{ all -> 0x0082 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)     // Catch:{ all -> 0x0082 }
        L_0x0082:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)     // Catch:{ all -> 0x00da }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00da }
            r2.<init>()     // Catch:{ all -> 0x00da }
            java.lang.String r4 = "mPagFileWidth is "
            r2.append(r4)     // Catch:{ all -> 0x00da }
            int r4 = r10.f274244n     // Catch:{ all -> 0x00da }
            r2.append(r4)     // Catch:{ all -> 0x00da }
            java.lang.String r4 = ", mPagFileHeight is "
            r2.append(r4)     // Catch:{ all -> 0x00da }
            int r4 = r10.f274245o     // Catch:{ all -> 0x00da }
            r2.append(r4)     // Catch:{ all -> 0x00da }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00da }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)     // Catch:{ all -> 0x00da }
            org.libpag.PAGView r2 = r10.f274240g     // Catch:{ all -> 0x00da }
            com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$b r3 = new com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView$b     // Catch:{ all -> 0x00da }
            r3.<init>()     // Catch:{ all -> 0x00da }
            r2.post(r3)     // Catch:{ all -> 0x00da }
            uq2.b r2 = new uq2.b     // Catch:{ all -> 0x00da }
            r2.<init>()     // Catch:{ all -> 0x00da }
            java.lang.String r5 = vr2.C102236a0.m134728W(r11)     // Catch:{ all -> 0x00da }
            nq2.a$d r3 = r10.f274238e     // Catch:{ all -> 0x00da }
            nq2.a$c r3 = r3.f293355K     // Catch:{ all -> 0x00da }
            int r3 = r3.f293340a     // Catch:{ all -> 0x00da }
            com.tencent.mm.plugin.sns.storage.ADInfo r11 = r11.getAdInfo(r3)     // Catch:{ all -> 0x00da }
            java.lang.String r6 = r11.uxInfo     // Catch:{ all -> 0x00da }
            nq2.a$d r11 = r10.f274238e     // Catch:{ all -> 0x00da }
            nq2.a$c r11 = r11.f293355K     // Catch:{ all -> 0x00da }
            int r7 = r11.f293340a     // Catch:{ all -> 0x00da }
            r8 = 1
            r9 = 0
            r4 = r2
            r4.mo141566c(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00da }
            rq2.C63505q.m74843b(r2)     // Catch:{ all -> 0x00da }
            goto L_0x00da
        L_0x00d5:
            java.lang.String r11 = "attract pag file width or height <= 0 or may be download attract pag file"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r11)     // Catch:{ all -> 0x00da }
        L_0x00da:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p104ad.widget.adsocial.AdAttitudeAttractView.mo130446g(com.tencent.mm.plugin.sns.storage.SnsInfo):void");
    }

    /* renamed from: h */
    public final void mo130447h() {
        SnsMethodCalculate.markStartTimeMs("stopListenPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        try {
            if (this.f274233C) {
                this.f274233C = false;
                this.f274240g.removeListener(this.f274235E);
                Log.m105924i("AdAttitudeAttractView", "stopListenPagView");
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("stopListenPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
    }

    /* renamed from: i */
    public final void mo130448i() {
        SnsMethodCalculate.markStartTimeMs("stopPAGAnimating", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        try {
            mo130447h();
            setVisibility(8);
            this.f274240g.post(new C94738c());
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("stopPAGAnimating", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
    }

    public void onConfigurationChanged(Configuration configuration) {
        SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        super.onConfigurationChanged(configuration);
        Log.m105918d("AdAttitudeAttractView", "onConfigurationChanged: orientation = " + configuration.orientation);
        mo130448i();
        SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        try {
            super.onDetachedFromWindow();
            Log.m105924i("AdAttitudeAttractView", "onDetachedFromWindow");
            this.f274241h = false;
            this.f274234D = false;
            mo130448i();
            getViewTreeObserver().removeOnPreDrawListener(this.f274236F);
            C100151a.C100155d dVar = this.f274238e;
            if (dVar == null) {
                SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                return;
            }
            if (dVar.f293355K.f293340a == 0) {
                this.f274242i = "";
            }
            SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        } catch (Throwable unused) {
        }
    }

    public void onFinishInflate() {
        SnsMethodCalculate.markStartTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        try {
            super.onFinishInflate();
            this.f274240g = (PAGView) findViewById(C0966R.C0970id.o1v);
            Context context = this.f274239f;
            if (context instanceof C0125s) {
                ((C0125s) context).getLifecycle().addObserver(this);
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    public void onUIPause() {
        SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
        try {
            Log.m105924i("AdAttitudeAttractView", "onUIPause");
            mo130448i();
            getViewTreeObserver().removeOnPreDrawListener(this.f274236F);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
    }

    public AdAttitudeAttractView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdAttitudeAttractView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f274241h = false;
        this.f274233C = false;
        this.f274234D = false;
        this.f274235E = new C94736a();
        this.f274236F = new C94739d();
        this.f274239f = context;
    }
}
