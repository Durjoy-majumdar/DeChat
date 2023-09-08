package com.tencent.p014mm.plugin.sns.p104ad.widget.adsocial;

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
import kg3.C76577a;
import nq2.C100151a;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;
import uq2.C102070a;
import uq2.C102072c;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView */
public class AdAttitudePlayView extends FrameLayout implements AdSocialAttitudeView.C94752h, C0124r, C111847h {

    /* renamed from: F */
    public static final /* synthetic */ int f274263F = 0;

    /* renamed from: A */
    public int f274264A;

    /* renamed from: B */
    public int f274265B;

    /* renamed from: C */
    public int f274266C;

    /* renamed from: D */
    public int f274267D;

    /* renamed from: E */
    public final ViewTreeObserver.OnPreDrawListener f274268E;

    /* renamed from: d */
    public PAGView f274269d;

    /* renamed from: e */
    public boolean f274270e;

    /* renamed from: f */
    public Context f274271f;

    /* renamed from: g */
    public SnsInfo f274272g;

    /* renamed from: h */
    public C100151a.C100155d f274273h;

    /* renamed from: i */
    public String f274274i;

    /* renamed from: j */
    public int f274275j;

    /* renamed from: n */
    public C102072c f274276n;

    /* renamed from: o */
    public int f274277o;

    /* renamed from: p */
    public int f274278p;

    /* renamed from: q */
    public boolean f274279q;

    /* renamed from: r */
    public String f274280r;

    /* renamed from: s */
    public int f274281s;

    /* renamed from: t */
    public int f274282t;

    /* renamed from: u */
    public int f274283u;

    /* renamed from: v */
    public int f274284v;

    /* renamed from: w */
    public PAGView.PAGViewListener f274285w;

    /* renamed from: x */
    public int f274286x;

    /* renamed from: y */
    public int f274287y;

    /* renamed from: z */
    public int f274288z;

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView$a */
    public class C94742a extends SimplePAGViewUpdateListener {
        public C94742a() {
        }

        public void onAnimationCancel(PAGView pAGView) {
            SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView$1");
            SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView$1");
        }

        public void onAnimationEnd(PAGView pAGView) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView$1");
            Log.m105924i("AdAttitudePlayView", "onAnimationEnd");
            AdAttitudePlayView adAttitudePlayView = AdAttitudePlayView.this;
            int i = AdAttitudePlayView.f274263F;
            SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            adAttitudePlayView.f274275j = 3;
            SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            AdAttitudePlayView adAttitudePlayView2 = AdAttitudePlayView.this;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            PAGView pAGView2 = adAttitudePlayView2.f274269d;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            pAGView2.setProgress(0.0d);
            AdAttitudePlayView.this.setVisibility(8);
            if (AdAttitudePlayView.m119961b(AdAttitudePlayView.this) != null) {
                AdSocialAttitudeView adSocialAttitudeView = (AdSocialAttitudeView) AdAttitudePlayView.m119961b(AdAttitudePlayView.this);
                adSocialAttitudeView.getClass();
                SnsMethodCalculate.markStartTimeMs("onPAGAnimationGone", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                LinearLayout linearLayout = adSocialAttitudeView.f274325o;
                if (linearLayout != null) {
                    linearLayout.setEnabled(true);
                }
                SnsMethodCalculate.markEndTimeMs("onPAGAnimationGone", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView$1");
        }

        public void onAnimationRepeat(PAGView pAGView) {
            SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView$1");
            SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView$1");
        }

        public void onAnimationStart(PAGView pAGView) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView$1");
            Log.m105924i("AdAttitudePlayView", "onAnimationStart");
            AdAttitudePlayView adAttitudePlayView = AdAttitudePlayView.this;
            int i = AdAttitudePlayView.f274263F;
            SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            adAttitudePlayView.f274275j = 2;
            SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            if (AdAttitudePlayView.m119961b(AdAttitudePlayView.this) != null) {
                AdSocialAttitudeView adSocialAttitudeView = (AdSocialAttitudeView) AdAttitudePlayView.m119961b(AdAttitudePlayView.this);
                adSocialAttitudeView.getClass();
                SnsMethodCalculate.markStartTimeMs("onPAGAnimationExist", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                LinearLayout linearLayout = adSocialAttitudeView.f274325o;
                if (linearLayout != null) {
                    linearLayout.setEnabled(false);
                }
                SnsMethodCalculate.markEndTimeMs("onPAGAnimationExist", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView$b */
    public class C94743b implements Runnable {
        public C94743b() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView$3");
            AdAttitudePlayView adAttitudePlayView = AdAttitudePlayView.this;
            int i = AdAttitudePlayView.f274263F;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            PAGView pAGView = adAttitudePlayView.f274269d;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            pAGView.stop();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView$c */
    public class C94744c implements ViewTreeObserver.OnPreDrawListener {
        public C94744c() {
        }

        public boolean onPreDraw() {
            SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView$4");
            AdAttitudePlayView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            AdAttitudePlayView.this.mo130460c();
            SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView$4");
            return true;
        }
    }

    public AdAttitudePlayView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    public static /* synthetic */ C102072c m119961b(AdAttitudePlayView adAttitudePlayView) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        C102072c cVar = adAttitudePlayView.f274276n;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        return cVar;
    }

    private void setLeftMarginOff(int i) {
        SnsMethodCalculate.markStartTimeMs("setLeftMarginOff", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        if (this.f274273h.f293355K.f293340a == 0) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
            Log.m105918d("AdAttitudePlayView", "leftMargin is " + layoutParams.leftMargin + ", currentOffLeft is " + i);
            layoutParams.leftMargin = layoutParams.leftMargin - i;
        } else {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
            Log.m105918d("AdAttitudePlayView", "leftMargin is " + layoutParams2.leftMargin + ", currentOffLeft is " + i);
            layoutParams2.leftMargin = layoutParams2.leftMargin - i;
        }
        SnsMethodCalculate.markEndTimeMs("setLeftMarginOff", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    private void setTopMarginOff(int i) {
        SnsMethodCalculate.markStartTimeMs("setTopMarginOff", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        if (this.f274273h.f293355K.f293340a == 0) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
            Log.m105918d("AdAttitudePlayView", "topMargin is " + layoutParams.topMargin + ", currentOffTop is " + i);
            layoutParams.topMargin = layoutParams.topMargin - i;
        } else {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
            Log.m105918d("AdAttitudePlayView", "topMargin is " + layoutParams2.topMargin + ", currentOffTop is " + i);
            layoutParams2.topMargin = layoutParams2.topMargin - i;
        }
        SnsMethodCalculate.markEndTimeMs("setTopMarginOff", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    /* renamed from: a */
    public void mo130443a() {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("onShowAttitude", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        int i = this.f274275j;
        if (i == 1 || i == 2) {
            Log.m105918d("AdAttitudePlayView", "onShowAttitude but pag is animating");
            SnsMethodCalculate.markEndTimeMs("onShowAttitude", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            return;
        }
        Log.m105918d("AdAttitudePlayView", "onShowAttitude");
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175911u(1612, 76);
        SnsMethodCalculate.markStartTimeMs("startPAGAnimating", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        SnsMethodCalculate.markStartTimeMs("checkPAGFileDownload", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        SnsInfo snsInfo = this.f274272g;
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("checkPAGFileDownload", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            z = false;
        } else if (!Util.nullAsNil(snsInfo.getAdXml().adSocialInfo.f294154n).equals(this.f274280r) || !this.f274279q) {
            SnsMethodCalculate.markStartTimeMs("initPagAnimViewData", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            SnsInfo snsInfo2 = this.f274272g;
            if (snsInfo2 == null) {
                SnsMethodCalculate.markEndTimeMs("initPagAnimViewData", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            } else {
                String nullAsNil = Util.nullAsNil(snsInfo2.getAdXml().adSocialInfo.f294154n);
                String b = C94724k.m119922b(nullAsNil, Util.nullAsNil(this.f274272g.getAdXml().adSocialInfo.f294155o));
                this.f274280r = nullAsNil;
                this.f274279q = false;
                if (!TextUtils.isEmpty(b)) {
                    PAGFile Load = PAGFile.Load(C94724k.m119923c(b));
                    this.f274277o = Load.width();
                    this.f274278p = Load.height();
                    this.f274269d.setComposition(Load);
                    this.f274269d.setScaleMode(3);
                    this.f274269d.setRepeatCount(1);
                    this.f274279q = true;
                    Log.m105924i("AdAttitudePlayView", "initPagAnimViewData, use server file");
                    SnsMethodCalculate.markEndTimeMs("initPagAnimViewData", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
                    z = true;
                    SnsMethodCalculate.markEndTimeMs("checkPAGFileDownload", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
                } else {
                    C94724k.m119921a(nullAsNil);
                    Log.m105924i("AdAttitudePlayView", "initPagAnimViewData, start download pagFile");
                    nVar.mo175911u(1612, 77);
                    SnsMethodCalculate.markEndTimeMs("initPagAnimViewData", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
                }
            }
            z = false;
            SnsMethodCalculate.markEndTimeMs("checkPAGFileDownload", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        } else {
            Log.m105924i("AdAttitudePlayView", "checkPAGFileDownload, return true directly");
            SnsMethodCalculate.markEndTimeMs("checkPAGFileDownload", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            z = true;
        }
        if (!z || this.f274277o <= 0 || this.f274278p <= 0) {
            Log.m105928w("AdAttitudePlayView", "pag file width or height <= 0 or may be download pag file");
        } else {
            this.f274269d.setProgress(0.0d);
            setVisibility(0);
            SnsMethodCalculate.markStartTimeMs("resizePagViewUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            getViewTreeObserver().removeOnPreDrawListener(this.f274268E);
            getViewTreeObserver().addOnPreDrawListener(this.f274268E);
            SnsMethodCalculate.markEndTimeMs("resizePagViewUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            this.f274275j = 1;
            Log.m105924i("AdAttitudePlayView", "mPagFileWidth is " + this.f274277o + ", mPagFileHeight is " + this.f274278p);
            this.f274269d.post(new C102070a(this));
        }
        SnsMethodCalculate.markEndTimeMs("startPAGAnimating", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        SnsMethodCalculate.markEndTimeMs("onShowAttitude", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    /* renamed from: c */
    public void mo130460c() {
        SnsMethodCalculate.markStartTimeMs("calcPagPlayViewParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        try {
            C100151a.C100155d dVar = this.f274273h;
            if (dVar == null) {
                SnsMethodCalculate.markEndTimeMs("calcPagPlayViewParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
                return;
            }
            View view = dVar.f293377v;
            AdSocialAttitudeView adSocialAttitudeView = dVar.f293348D;
            View view2 = dVar.f293379x;
            SnsAvatarImageView snsAvatarImageView = dVar.f293380y;
            if (!(view == null || adSocialAttitudeView == null || view2 == null)) {
                if (snsAvatarImageView != null) {
                    int width = view2.getWidth();
                    int height = view2.getHeight();
                    if (width > 0) {
                        if (height > 0) {
                            int[] iArr = new int[2];
                            view2.getLocationOnScreen(iArr);
                            this.f274264A = iArr[1];
                            this.f274265B = height;
                            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
                            this.f274286x = Math.min(windowManager.getDefaultDisplay().getWidth(), windowManager.getDefaultDisplay().getHeight());
                            int[] iArr2 = new int[2];
                            snsAvatarImageView.getLocationOnScreen(iArr2);
                            int i = iArr2[0];
                            this.f274266C = i - this.f274282t;
                            this.f274267D = i + this.f274283u + width + this.f274284v;
                            int[] iArr3 = new int[2];
                            adSocialAttitudeView.getLocationOnScreen(iArr3);
                            int[] iArr4 = new int[2];
                            view.getLocationOnScreen(iArr4);
                            this.f274288z = iArr4[1];
                            int[] iArr5 = new int[2];
                            getLocationOnScreen(iArr5);
                            setLeftMarginOff(iArr5[0]);
                            setTopMarginOff(iArr5[1] - iArr4[1]);
                            this.f274287y = (iArr3[1] + adSocialAttitudeView.getHeight()) - iArr4[1];
                            if (this.f274273h.f293355K.f293340a == 0) {
                                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
                                layoutParams.width = this.f274286x;
                                layoutParams.height = this.f274287y;
                            } else {
                                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
                                layoutParams2.width = this.f274286x;
                                layoutParams2.height = this.f274287y;
                            }
                            ViewParent parent = getParent();
                            if (parent instanceof FrameLayout) {
                                ViewParent parent2 = parent.getParent();
                                if (parent2 instanceof RelativeLayout) {
                                    ((RelativeLayout) parent2).setClipChildren(false);
                                    ((RelativeLayout) parent2).setClipToPadding(false);
                                }
                                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) ((FrameLayout) parent).getLayoutParams();
                                if (layoutParams3.width == 0) {
                                    layoutParams3.width = -1;
                                }
                                if (layoutParams3.height == 0) {
                                    layoutParams3.height = -1;
                                }
                            }
                            mo130461d();
                            requestLayout();
                            SnsMethodCalculate.markEndTimeMs("calcPagPlayViewParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
                            return;
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("calcPagPlayViewParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
                    return;
                }
            }
            SnsMethodCalculate.markEndTimeMs("calcPagPlayViewParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        } catch (Throwable th) {
            Log.m105920e("AdAttitudePlayView", th.toString());
        }
    }

    /* renamed from: d */
    public final void mo130461d() {
        SnsMethodCalculate.markStartTimeMs("calcPagViewDisplayParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        if (this.f274286x <= 0 || this.f274287y <= 0 || this.f274265B <= 0) {
            Log.m105924i("AdAttitudePlayView", "start play pagView, but can not calcPagViewDisplayParams, mWidth or mHeight or mContentContainerHeight <= 0");
            SnsMethodCalculate.markEndTimeMs("calcPagViewDisplayParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f274269d.getLayoutParams();
        int i = this.f274286x;
        layoutParams.width = i;
        layoutParams.height = (i * this.f274278p) / this.f274277o;
        this.f274269d.setLayoutParams(layoutParams);
        int i2 = ((this.f274264A + (this.f274265B / 2)) - (this.f274288z + (layoutParams.height / 2))) + this.f274281s;
        int i3 = ((this.f274267D + this.f274266C) - this.f274286x) / 2;
        Log.m105924i("AdAttitudePlayView", "offsetX is " + i3 + ", offsetY is " + i2 + ", showAnimLayoutParams height is " + layoutParams.height + ", mSnsLinearContentRightX is " + this.f274267D + ", mSnsLinearContentLeftX is " + this.f274266C + ", mWidth is " + this.f274286x);
        this.f274269d.setTranslationX((float) i3);
        this.f274269d.setTranslationY((float) i2);
        SnsMethodCalculate.markEndTimeMs("calcPagViewDisplayParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    /* renamed from: e */
    public void mo130462e(C100151a.C100155d dVar, SnsInfo snsInfo) {
        C100151a.C100154c cVar;
        SnsMethodCalculate.markStartTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            return;
        }
        String snsId = snsInfo.getSnsId();
        if (Util.isNullOrNil(snsId)) {
            Log.m105920e("AdAttitudePlayView", "resetUI, snsId is null");
            SnsMethodCalculate.markEndTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        } else if (Util.isEqual(snsId, this.f274274i)) {
            SnsMethodCalculate.markEndTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        } else {
            this.f274274i = snsId;
            this.f274272g = snsInfo;
            this.f274273h = dVar;
            if (!(dVar == null || (cVar = dVar.f293355K) == null)) {
                int i = cVar.f293340a;
                SnsMethodCalculate.markStartTimeMs("calcParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
                if (i == 0) {
                    this.f274282t = C76577a.m92151b(getContext(), 14);
                    this.f274283u = C76577a.m92151b(getContext(), 56);
                    this.f274284v = getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3926j6);
                } else {
                    this.f274282t = this.f274271f.getResources().getDimensionPixelSize(C0966R.dimen.f3926j6);
                    this.f274283u = this.f274271f.getResources().getDimensionPixelSize(C0966R.dimen.ao_) + this.f274271f.getResources().getDimensionPixelSize(C0966R.dimen.f3703bv);
                    this.f274284v = this.f274282t;
                }
                SnsMethodCalculate.markEndTimeMs("calcParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            }
            mo130465h();
            mo130463f();
            SnsMethodCalculate.markEndTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        }
    }

    /* renamed from: f */
    public final void mo130463f() {
        SnsMethodCalculate.markStartTimeMs("startListenPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        try {
            if (!this.f274270e) {
                this.f274270e = true;
                this.f274269d.addListener(this.f274285w);
                Log.m105924i("AdAttitudePlayView", "startListenPagView");
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("startListenPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    /* renamed from: g */
    public final void mo130464g() {
        SnsMethodCalculate.markStartTimeMs("stopListenPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        try {
            if (this.f274270e) {
                this.f274270e = false;
                this.f274269d.removeListener(this.f274285w);
                Log.m105924i("AdAttitudePlayView", "stopListenPagView");
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("stopListenPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    /* renamed from: h */
    public final void mo130465h() {
        SnsMethodCalculate.markStartTimeMs("stopPAGAnimating", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        try {
            this.f274275j = 3;
            setVisibility(8);
            this.f274269d.post(new C94743b());
            C102072c cVar = this.f274276n;
            if (cVar != null) {
                SnsMethodCalculate.markStartTimeMs("onPAGAnimationGone", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                LinearLayout linearLayout = ((AdSocialAttitudeView) cVar).f274325o;
                if (linearLayout != null) {
                    linearLayout.setEnabled(true);
                }
                SnsMethodCalculate.markEndTimeMs("onPAGAnimationGone", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("stopPAGAnimating", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    public void onConfigurationChanged(Configuration configuration) {
        SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        super.onConfigurationChanged(configuration);
        Log.m105918d("AdAttitudePlayView", "onConfigurationChanged: orientation = " + configuration.orientation);
        int i = this.f274275j;
        if (i == 1 || i == 2) {
            mo130465h();
        }
        SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        try {
            super.onDetachedFromWindow();
            Log.m105924i("AdAttitudePlayView", "onDetachedFromWindow");
            C100151a.C100155d dVar = this.f274273h;
            if (dVar == null) {
                SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
                return;
            }
            if (dVar.f293355K.f293340a == 0) {
                this.f274274i = "";
                mo130464g();
            }
            mo130465h();
            getViewTreeObserver().removeOnPreDrawListener(this.f274268E);
            SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        } catch (Throwable unused) {
        }
    }

    public void onFinishInflate() {
        SnsMethodCalculate.markStartTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        try {
            super.onFinishInflate();
            this.f274269d = (PAGView) findViewById(C0966R.C0970id.lwd);
            Context context = this.f274271f;
            if (context instanceof C0125s) {
                ((C0125s) context).getLifecycle().addObserver(this);
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    public void onUIPause() {
        SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        try {
            Log.m105924i("AdAttitudePlayView", "onUIPause");
            mo130465h();
            mo130464g();
            getViewTreeObserver().removeOnPreDrawListener(this.f274268E);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    public void onUIResume() {
        SnsMethodCalculate.markStartTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        try {
            Log.m105924i("AdAttitudePlayView", "onUIResume");
            mo130463f();
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    public void setOnAnimationStatusListener(C102072c cVar) {
        SnsMethodCalculate.markStartTimeMs("setOnAnimationStatusListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        this.f274276n = cVar;
        SnsMethodCalculate.markEndTimeMs("setOnAnimationStatusListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    public AdAttitudePlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdAttitudePlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f274270e = false;
        this.f274275j = 0;
        this.f274285w = new C94742a();
        this.f274268E = new C94744c();
        this.f274271f = context;
        this.f274281s = C76577a.m92151b(getContext(), 13);
    }
}
