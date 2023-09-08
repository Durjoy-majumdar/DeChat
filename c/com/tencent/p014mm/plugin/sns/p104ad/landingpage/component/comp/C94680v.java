package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMProcessBar;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.finder.webview.C41647w;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95295z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60194q2;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONArray;
import org.json.JSONObject;
import qs2.C101271i0;
import rq2.C101419f;
import so2.C101679m;
import sq2.C13774c;
import vr2.C102260r;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.v */
public final class C94680v extends C95295z {

    /* renamed from: A */
    public FrameLayout f273980A;

    /* renamed from: B */
    public ImageView f273981B;

    /* renamed from: C */
    public C95295z f273982C;

    /* renamed from: D */
    public C95295z f273983D;

    /* renamed from: E */
    public C95295z f273984E;

    /* renamed from: F */
    public MMProcessBar f273985F;

    /* renamed from: G */
    public View f273986G;

    /* renamed from: H */
    public C41647w f273987H;

    /* renamed from: I */
    public C94681a f273988I;

    /* renamed from: J */
    public float f273989J = 1.0f;

    /* renamed from: K */
    public String f273990K = "";

    /* renamed from: L */
    public final Handler f273991L = new Handler(Looper.getMainLooper());

    /* renamed from: M */
    public boolean f273992M;

    /* renamed from: N */
    public boolean f273993N;

    /* renamed from: P */
    public Runnable f273994P = new C94682b(this);

    /* renamed from: s */
    public final C101679m f273995s;

    /* renamed from: t */
    public FrameLayout f273996t;

    /* renamed from: u */
    public ImageView f273997u;

    /* renamed from: v */
    public TextView f273998v;

    /* renamed from: w */
    public TextView f273999w;

    /* renamed from: x */
    public TextView f274000x;

    /* renamed from: y */
    public FrameLayout f274001y;

    /* renamed from: z */
    public FrameLayout f274002z;

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.v$a */
    public interface C94681a {
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.v$b */
    public static final class C94682b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C94680v f274003d;

        public C94682b(C94680v vVar) {
            this.f274003d = vVar;
        }

        public final void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$mVideoPlayTask$1");
            C94680v vVar = this.f274003d;
            SnsMethodCalculate.markStartTimeMs("access$getMVideoComp$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            C95295z zVar = vVar.f273982C;
            SnsMethodCalculate.markEndTimeMs("access$getMVideoComp$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            C94651l lVar = zVar instanceof C94651l ? (C94651l) zVar : null;
            if (lVar != null) {
                lVar.mo124360B();
                lVar.mo130145A();
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$mVideoPlayTask$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.v$c */
    public static final class C94683c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C94680v f274004d;

        /* renamed from: e */
        public final /* synthetic */ boolean f274005e;

        public C94683c(C94680v vVar, boolean z) {
            this.f274004d = vVar;
            this.f274005e = z;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$showCardContent$anim$1$1");
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            C94680v vVar = this.f274004d;
            SnsMethodCalculate.markStartTimeMs("access$getMTopTitleView$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            TextView textView = vVar.f273998v;
            SnsMethodCalculate.markEndTimeMs("access$getMTopTitleView$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            if (textView != null) {
                textView.setAlpha(floatValue);
                C94680v vVar2 = this.f274004d;
                SnsMethodCalculate.markStartTimeMs("access$getMTitleView$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                TextView textView2 = vVar2.f273999w;
                SnsMethodCalculate.markEndTimeMs("access$getMTitleView$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                if (textView2 != null) {
                    textView2.setAlpha(floatValue);
                    C94680v vVar3 = this.f274004d;
                    SnsMethodCalculate.markStartTimeMs("access$getMDescView$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                    TextView textView3 = vVar3.f274000x;
                    SnsMethodCalculate.markEndTimeMs("access$getMDescView$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                    if (textView3 != null) {
                        textView3.setAlpha(floatValue);
                        C94680v vVar4 = this.f274004d;
                        SnsMethodCalculate.markStartTimeMs("access$getMBtnCompContainer$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                        FrameLayout frameLayout = vVar4.f273980A;
                        SnsMethodCalculate.markEndTimeMs("access$getMBtnCompContainer$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                        if (frameLayout != null) {
                            frameLayout.setAlpha(floatValue);
                            C94680v vVar5 = this.f274004d;
                            SnsMethodCalculate.markStartTimeMs("access$getMCenterCompContainer$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                            FrameLayout frameLayout2 = vVar5.f274002z;
                            SnsMethodCalculate.markEndTimeMs("access$getMCenterCompContainer$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                            if (frameLayout2 != null) {
                                frameLayout2.setAlpha(floatValue);
                                if (this.f274005e) {
                                    C94680v vVar6 = this.f274004d;
                                    SnsMethodCalculate.markStartTimeMs("access$getMBgView$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                                    ImageView imageView = vVar6.f273997u;
                                    SnsMethodCalculate.markEndTimeMs("access$getMBgView$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                                    if (imageView != null) {
                                        imageView.setAlpha(floatValue);
                                    } else {
                                        C87412m.m108603p("mBgView");
                                        throw null;
                                    }
                                }
                                SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$showCardContent$anim$1$1");
                                return;
                            }
                            C87412m.m108603p("mCenterCompContainer");
                            throw null;
                        }
                        C87412m.m108603p("mBtnCompContainer");
                        throw null;
                    }
                    C87412m.m108603p("mDescView");
                    throw null;
                }
                C87412m.m108603p("mTitleView");
                throw null;
            }
            C87412m.m108603p("mTopTitleView");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.v$d */
    public static final class C94684d extends C13774c {

        /* renamed from: d */
        public final /* synthetic */ C94680v f274006d;

        public C94684d(C94680v vVar) {
            this.f274006d = vVar;
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$showCardContent$anim$1$2");
            C94680v vVar = this.f274006d;
            SnsMethodCalculate.markStartTimeMs("access$getMUIHandler$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            Handler handler = vVar.f273991L;
            SnsMethodCalculate.markEndTimeMs("access$getMUIHandler$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            C94680v vVar2 = this.f274006d;
            SnsMethodCalculate.markStartTimeMs("access$getMVideoPlayTask$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            Runnable runnable = vVar2.f273994P;
            SnsMethodCalculate.markEndTimeMs("access$getMVideoPlayTask$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            handler.postDelayed(runnable, 30);
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$showCardContent$anim$1$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.v$e */
    public static final class C94685e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C94680v f274007d;

        public C94685e(C94680v vVar) {
            this.f274007d = vVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$showH5Content$anim$1$1");
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            C94680v vVar = this.f274007d;
            SnsMethodCalculate.markStartTimeMs("access$getMWebView$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            View view = vVar.f273986G;
            SnsMethodCalculate.markEndTimeMs("access$getMWebView$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(floatValue));
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHalfEggCardComponent$showH5Content$anim$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHalfEggCardComponent$showH5Content$anim$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            C94680v vVar2 = this.f274007d;
            SnsMethodCalculate.markStartTimeMs("access$getMBgView$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            ImageView imageView = vVar2.f273997u;
            SnsMethodCalculate.markEndTimeMs("access$getMBgView$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            if (imageView != null) {
                imageView.setAlpha(((float) 1) - floatValue);
                SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$showH5Content$anim$1$1");
                return;
            }
            C87412m.m108603p("mBgView");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94680v(Context context, C101679m mVar, ViewGroup viewGroup) {
        super(context, mVar, viewGroup);
        C87412m.m108594g(mVar, "mCompInfo");
        this.f273995s = mVar;
    }

    /* renamed from: E */
    public static final String m119821E(C94680v vVar) {
        String str;
        SnsMethodCalculate.markStartTimeMs("access$getDefaultCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        vVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getDefaultCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        Iterator it = ((ArrayList) vVar.f273995s.mo141128c()).iterator();
        while (true) {
            if (it.hasNext()) {
                C101679m.C101680a aVar = (C101679m.C101680a) it.next();
                aVar.getClass();
                SnsMethodCalculate.markStartTimeMs("isDefaultCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                boolean z = aVar.f297664e;
                SnsMethodCalculate.markEndTimeMs("isDefaultCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                if (z) {
                    str = aVar.mo141129a();
                    Log.m105924i("AdLandingHalfEggCardComponent", "getDefaultCardId, findXmlDetault=" + str);
                    SnsMethodCalculate.markEndTimeMs("getDefaultCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                    break;
                }
            } else if (((ArrayList) vVar.f273995s.mo141128c()).size() > 0) {
                str = ((C101679m.C101680a) ((ArrayList) vVar.f273995s.mo141128c()).get(0)).mo141129a();
                Log.m105924i("AdLandingHalfEggCardComponent", "getDefaultCardId, findFirstCard=" + str);
                SnsMethodCalculate.markEndTimeMs("getDefaultCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            } else {
                Log.m105920e("AdLandingHalfEggCardComponent", "getDefaultCardId, empty");
                SnsMethodCalculate.markEndTimeMs("getDefaultCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                str = "";
            }
        }
        SnsMethodCalculate.markEndTimeMs("access$getDefaultCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        return str;
    }

    /* renamed from: A */
    public void mo130145A() {
        SnsMethodCalculate.markStartTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        super.mo130145A();
        C95295z zVar = this.f273984E;
        if (zVar != null) {
            zVar.mo130145A();
        }
        C95295z zVar2 = this.f273982C;
        if (zVar2 != null) {
            zVar2.mo130145A();
        }
        C95295z zVar3 = this.f273983D;
        if (zVar3 != null) {
            zVar3.mo130145A();
        }
        SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
    }

    /* renamed from: B */
    public void mo124360B() {
        SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        super.mo124360B();
        C95295z zVar = this.f273984E;
        if (zVar != null) {
            zVar.mo124360B();
        }
        C95295z zVar2 = this.f273982C;
        if (zVar2 != null) {
            zVar2.mo124360B();
        }
        C95295z zVar3 = this.f273983D;
        if (zVar3 != null) {
            zVar3.mo124360B();
        }
        SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
    }

    /* renamed from: C */
    public void mo67235C() {
        SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        super.mo67235C();
        Log.m105924i("AdLandingHalfEggCardComponent", "viewWillDestroy");
        this.f273991L.removeCallbacksAndMessages((Object) null);
        C95295z zVar = this.f273984E;
        if (zVar != null) {
            zVar.mo67235C();
        }
        C95295z zVar2 = this.f273982C;
        if (zVar2 != null) {
            zVar2.mo67235C();
        }
        C95295z zVar3 = this.f273983D;
        if (zVar3 != null) {
            zVar3.mo67235C();
        }
        C41647w wVar = this.f273987H;
        if (wVar != null) {
            wVar.release();
        }
        SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
    }

    /* renamed from: D */
    public void mo124361D() {
        SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        super.mo124361D();
        C95295z zVar = this.f273984E;
        if (zVar != null) {
            zVar.mo124361D();
        }
        C95295z zVar2 = this.f273982C;
        if (zVar2 != null) {
            zVar2.mo124361D();
        }
        C95295z zVar3 = this.f273983D;
        if (zVar3 != null) {
            zVar3.mo124361D();
        }
        SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
    }

    /* renamed from: G */
    public final TextView mo130269G(String str, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("createTextView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        int n = C102260r.m134874n(24);
        TextView textView = new TextView(this.f276579d);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = C102260r.m134874n(i2);
        layoutParams.leftMargin = n;
        layoutParams.rightMargin = n;
        textView.setLayoutParams(layoutParams);
        C102260r.m134855X(textView, i);
        textView.setTextColor(Color.parseColor(str));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        SnsMethodCalculate.markEndTimeMs("createTextView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        return textView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b0  */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo130270H(so2.C101679m.C101680a r17) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            java.lang.String r3 = "doSetCardContentInfo"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            android.widget.FrameLayout r0 = r1.f274002z
            r5 = 0
            java.lang.String r6 = "mCenterCompContainer"
            if (r0 == 0) goto L_0x0385
            r0.removeAllViews()
            java.lang.String r0 = r17.mo141129a()
            r1.f273990K = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "doSetCardContentInfo, id="
            r0.append(r7)
            java.lang.String r7 = r1.f273990K
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r7 = "AdLandingHalfEggCardComponent"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            java.lang.String r0 = "getImgCompInfo"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r8)
            qs2.a0 r9 = r2.f297665f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r8)
            java.lang.String r0 = "mCenterContainer"
            r10 = 0
            r11 = 0
            r12 = 1058013184(0x3f100000, float:0.5625)
            if (r9 == 0) goto L_0x00b4
            float r13 = r9.f296507m
            int r14 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r14 <= 0) goto L_0x0057
            float r14 = r9.f296508n
            int r15 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r15 <= 0) goto L_0x0057
            float r13 = r13 / r14
            goto L_0x0059
        L_0x0057:
            r13 = 1058013184(0x3f100000, float:0.5625)
        L_0x0059:
            android.widget.FrameLayout r14 = r1.f274001y
            if (r14 == 0) goto L_0x00b0
            android.widget.FrameLayout r15 = r1.f274002z
            if (r15 == 0) goto L_0x00ac
            r1.mo130271I(r14, r15, r13)
            android.widget.FrameLayout r13 = r1.f274002z
            if (r13 == 0) goto L_0x00a8
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            int r13 = r13.width
            float r13 = (float) r13
            r9.f296507m = r13
            android.widget.FrameLayout r13 = r1.f274002z
            if (r13 == 0) goto L_0x00a4
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            int r13 = r13.height
            float r13 = (float) r13
            r9.f296508n = r13
            android.content.Context r13 = r1.f276579d
            android.widget.FrameLayout r14 = r1.f274002z
            if (r14 == 0) goto L_0x00a0
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z r9 = com.tencent.p014mm.plugin.sns.p106ui.C96328z2.m123559a(r13, r9, r14, r11)
            android.widget.FrameLayout r13 = r1.f274002z
            if (r13 == 0) goto L_0x009c
            android.view.View r14 = r9.mo131855p()
            r13.addView(r14)
            r9.mo124360B()
            r9.mo130145A()
            r1.f273983D = r9
            goto L_0x00b4
        L_0x009c:
            gy3.C87412m.m108603p(r6)
            throw r5
        L_0x00a0:
            gy3.C87412m.m108603p(r6)
            throw r5
        L_0x00a4:
            gy3.C87412m.m108603p(r6)
            throw r5
        L_0x00a8:
            gy3.C87412m.m108603p(r6)
            throw r5
        L_0x00ac:
            gy3.C87412m.m108603p(r6)
            throw r5
        L_0x00b0:
            gy3.C87412m.m108603p(r0)
            throw r5
        L_0x00b4:
            java.lang.String r9 = "getVideoCompInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r8)
            qs2.a0 r13 = r2.f297666g
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
            if (r13 == 0) goto L_0x014a
            float r9 = r13.f296507m
            int r14 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r14 <= 0) goto L_0x00ce
            float r14 = r13.f296508n
            int r15 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r15 <= 0) goto L_0x00ce
            float r12 = r9 / r14
        L_0x00ce:
            android.widget.FrameLayout r9 = r1.f274001y
            if (r9 == 0) goto L_0x0146
            android.widget.FrameLayout r0 = r1.f274002z
            if (r0 == 0) goto L_0x0142
            r1.mo130271I(r9, r0, r12)
            android.widget.FrameLayout r0 = r1.f274002z
            if (r0 == 0) goto L_0x013e
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r0 = r0.width
            float r0 = (float) r0
            r13.f296507m = r0
            android.widget.FrameLayout r0 = r1.f274002z
            if (r0 == 0) goto L_0x013a
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r0 = r0.height
            float r0 = (float) r0
            r13.f296508n = r0
            android.content.Context r0 = r1.f276579d
            android.widget.FrameLayout r9 = r1.f274002z
            if (r9 == 0) goto L_0x0136
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z r0 = com.tencent.p014mm.plugin.sns.p106ui.C96328z2.m123559a(r0, r13, r9, r11)
            android.widget.FrameLayout r9 = r1.f274002z
            if (r9 == 0) goto L_0x0132
            r9.removeAllViews()
            android.widget.FrameLayout r9 = r1.f274002z
            if (r9 == 0) goto L_0x012e
            android.view.View r6 = r0.mo131855p()
            r9.addView(r6)
            boolean r6 = r0 instanceof com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94651l
            if (r6 == 0) goto L_0x0117
            r6 = r0
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.l r6 = (com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94651l) r6
            goto L_0x0118
        L_0x0117:
            r6 = r5
        L_0x0118:
            if (r6 == 0) goto L_0x012b
            java.lang.String r9 = "delRootBackground"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r12)
            android.view.View r6 = r6.f273914z
            if (r6 == 0) goto L_0x0128
            r6.setBackground(r5)
        L_0x0128:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r12)
        L_0x012b:
            r1.f273982C = r0
            goto L_0x014a
        L_0x012e:
            gy3.C87412m.m108603p(r6)
            throw r5
        L_0x0132:
            gy3.C87412m.m108603p(r6)
            throw r5
        L_0x0136:
            gy3.C87412m.m108603p(r6)
            throw r5
        L_0x013a:
            gy3.C87412m.m108603p(r6)
            throw r5
        L_0x013e:
            gy3.C87412m.m108603p(r6)
            throw r5
        L_0x0142:
            gy3.C87412m.m108603p(r6)
            throw r5
        L_0x0146:
            gy3.C87412m.m108603p(r0)
            throw r5
        L_0x014a:
            java.lang.String r0 = "getBtnCompInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r8)
            qs2.a0 r6 = r2.f297667h
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r8)
            if (r6 == 0) goto L_0x0336
            boolean r0 = r6 instanceof qs2.C101287r
            if (r0 == 0) goto L_0x015e
            r0 = r6
            qs2.r r0 = (qs2.C101287r) r0
            goto L_0x015f
        L_0x015e:
            r0 = r5
        L_0x015f:
            if (r0 == 0) goto L_0x02e6
            r9 = 1099431936(0x41880000, float:17.0)
            int r9 = r1.mo130273K(r9)
            float r9 = (float) r9
            r0.f296692D = r9
            r9 = 1
            r0.f296694F = r9
            r12 = 1111490560(0x42400000, float:48.0)
            int r12 = r1.mo130273K(r12)
            float r12 = (float) r12
            r0.f296502h = r12
            r0.f296508n = r10
            r0.f296507m = r10
            r10 = 1090519040(0x41000000, float:8.0)
            int r10 = r1.mo130273K(r10)
            float r10 = (float) r10
            r0.f296706R = r10
            java.lang.String r10 = r0.f296714z
            if (r10 == 0) goto L_0x01ae
            int r10 = r10.length()
            r12 = 9
            if (r10 >= r12) goto L_0x0190
            goto L_0x01ae
        L_0x0190:
            java.lang.String r10 = r0.f296714z
            int r10 = r10.length()
            r12 = 10
            if (r10 >= r12) goto L_0x01a4
            r10 = 1128857600(0x43490000, float:201.0)
            int r10 = r1.mo130273K(r10)
            float r10 = (float) r10
            r0.f296501g = r10
            goto L_0x01b7
        L_0x01a4:
            r10 = 1130037248(0x435b0000, float:219.0)
            int r10 = r1.mo130273K(r10)
            float r10 = (float) r10
            r0.f296501g = r10
            goto L_0x01b7
        L_0x01ae:
            r10 = 1127677952(0x43370000, float:183.0)
            int r10 = r1.mo130273K(r10)
            float r10 = (float) r10
            r0.f296501g = r10
        L_0x01b7:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "btnInfo, subType="
            r10.append(r12)
            int r12 = r0.f296504j
            r10.append(r12)
            java.lang.String r12 = ", handleUrl="
            r10.append(r12)
            java.lang.String r12 = r0.f296689A
            r10.append(r12)
            java.lang.String r12 = ", autoJump="
            r10.append(r12)
            boolean r12 = r0.f296713Y
            r10.append(r12)
            java.lang.String r12 = ", isJumpInHalfScreenStyle="
            r10.append(r12)
            boolean r12 = r0.f296712X
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r10)
            int r10 = r0.f296504j
            if (r10 != 0) goto L_0x02e6
            java.lang.String r10 = r0.f296689A
            if (r10 == 0) goto L_0x01fc
            int r10 = r10.length()
            if (r10 != 0) goto L_0x01fa
            goto L_0x01fc
        L_0x01fa:
            r10 = 0
            goto L_0x01fd
        L_0x01fc:
            r10 = 1
        L_0x01fd:
            if (r10 != 0) goto L_0x02e6
            boolean r10 = r0.f296712X
            if (r10 == 0) goto L_0x02e6
            boolean r10 = r0.f296713Y
            if (r10 == 0) goto L_0x02e6
            java.lang.String r10 = r0.f296689A
            qs2.i0 r0 = r16.mo131854m()
            java.lang.String r12 = "AdLandingPageH5Jumper"
            java.lang.String r13 = "appendUrlParam"
            java.lang.String r14 = "com.tencent.mm.plugin.sns.ad.utils.AdLandingPageH5Jumper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r14)
            boolean r15 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Exception -> 0x02a4 }
            if (r15 != 0) goto L_0x02a0
            if (r0 != 0) goto L_0x0220
            goto L_0x02a0
        L_0x0220:
            java.lang.String r15 = r0.mo140743j()     // Catch:{ Exception -> 0x02a4 }
            boolean r15 = android.text.TextUtils.isEmpty(r15)     // Catch:{ Exception -> 0x02a4 }
            if (r15 != 0) goto L_0x025f
            java.lang.String r15 = r0.mo140735b()     // Catch:{ Exception -> 0x02a4 }
            boolean r15 = android.text.TextUtils.isEmpty(r15)     // Catch:{ Exception -> 0x02a4 }
            if (r15 != 0) goto L_0x025f
            java.lang.String[] r15 = new java.lang.String[r9]     // Catch:{ Exception -> 0x02a4 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a4 }
            r9.<init>()     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r5 = "traceid="
            r9.append(r5)     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r5 = r0.mo140743j()     // Catch:{ Exception -> 0x02a4 }
            r9.append(r5)     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r5 = "&aid="
            r9.append(r5)     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r5 = r0.mo140735b()     // Catch:{ Exception -> 0x02a4 }
            r9.append(r5)     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r5 = r9.toString()     // Catch:{ Exception -> 0x02a4 }
            r15[r11] = r5     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r5 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95198o2.m121129a(r10, r15)     // Catch:{ Exception -> 0x02a4 }
            r10 = r5
        L_0x025f:
            java.lang.String r5 = r0.mo140744k()     // Catch:{ Exception -> 0x02a4 }
            boolean r9 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x02a4 }
            if (r9 == 0) goto L_0x0282
            java.lang.String r5 = r0.mo140745l()     // Catch:{ Exception -> 0x02a4 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a4 }
            r0.<init>()     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r9 = "appendUrlParam, use orig_UxInfo:"
            r0.append(r9)     // Catch:{ Exception -> 0x02a4 }
            r0.append(r5)     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02a4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)     // Catch:{ Exception -> 0x02a4 }
            goto L_0x0296
        L_0x0282:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a4 }
            r0.<init>()     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r9 = "appendUrlParam, use updated_UxInfo:"
            r0.append(r9)     // Catch:{ Exception -> 0x02a4 }
            r0.append(r5)     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02a4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)     // Catch:{ Exception -> 0x02a4 }
        L_0x0296:
            java.lang.String r10 = vr2.C102236a0.m134734b(r10, r5)     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r0 = ko2.C46734a.m52032e(r10)     // Catch:{ Exception -> 0x02a4 }
            r10 = r0
            goto L_0x02bd
        L_0x02a0:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
            goto L_0x02c0
        L_0x02a4:
            r0 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "appendUrlParam, exp="
            r5.append(r9)
            java.lang.String r0 = r0.toString()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
        L_0x02bd:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
        L_0x02c0:
            com.tencent.mm.plugin.finder.webview.w r0 = r1.f273987H
            if (r0 == 0) goto L_0x02cf
            java.lang.String r5 = "loadUrl"
            gy3.C87412m.m108593f(r10, r5)
            r5 = 2
            r9 = 0
            com.tencent.p014mm.plugin.finder.webview.C41647w.C41648a.m44995a(r0, r10, r11, r5, r9)
        L_0x02cf:
            r5 = 1
            r1.f273993N = r5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "--startLoadUrl, loadUrl="
            r0.append(r5)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
        L_0x02e6:
            android.content.Context r0 = r1.f276579d
            android.widget.FrameLayout r5 = r1.f273980A
            java.lang.String r7 = "mBtnCompContainer"
            if (r5 == 0) goto L_0x0331
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z r0 = com.tencent.p014mm.plugin.sns.p106ui.C96328z2.m123559a(r0, r6, r5, r11)
            android.widget.FrameLayout r5 = r1.f273980A
            if (r5 == 0) goto L_0x032c
            r5.removeAllViews()
            android.widget.FrameLayout r5 = r1.f273980A
            if (r5 == 0) goto L_0x0327
            android.view.View r6 = r0.mo131855p()
            r5.addView(r6)
            boolean r5 = r0 instanceof com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95108i0
            if (r5 == 0) goto L_0x030d
            r5 = r0
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i0 r5 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95108i0) r5
            goto L_0x030e
        L_0x030d:
            r5 = 0
        L_0x030e:
            if (r5 == 0) goto L_0x031e
            android.widget.Button r5 = r5.mo131625N()
            if (r5 == 0) goto L_0x031e
            r5.setSingleLine()
            android.text.TextUtils$TruncateAt r6 = android.text.TextUtils.TruncateAt.END
            r5.setEllipsize(r6)
        L_0x031e:
            r0.mo124360B()
            r0.mo130145A()
            r1.f273984E = r0
            goto L_0x0336
        L_0x0327:
            gy3.C87412m.m108603p(r7)
            r2 = 0
            throw r2
        L_0x032c:
            r2 = 0
            gy3.C87412m.m108603p(r7)
            throw r2
        L_0x0331:
            r2 = 0
            gy3.C87412m.m108603p(r7)
            throw r2
        L_0x0336:
            android.widget.TextView r0 = r1.f273998v
            if (r0 == 0) goto L_0x037d
            java.lang.String r5 = "getTopTitle"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r8)
            java.lang.String r6 = r2.f297661b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r8)
            r0.setText(r6)
            android.widget.TextView r0 = r1.f273999w
            if (r0 == 0) goto L_0x0375
            java.lang.String r5 = "getTitle"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r8)
            java.lang.String r6 = r2.f297662c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r8)
            r0.setText(r6)
            android.widget.TextView r0 = r1.f274000x
            if (r0 == 0) goto L_0x036d
            java.lang.String r5 = "getDesc"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r8)
            java.lang.String r2 = r2.f297663d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r8)
            r0.setText(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return
        L_0x036d:
            java.lang.String r0 = "mDescView"
            gy3.C87412m.m108603p(r0)
            r2 = 0
            throw r2
        L_0x0375:
            r2 = 0
            java.lang.String r0 = "mTitleView"
            gy3.C87412m.m108603p(r0)
            throw r2
        L_0x037d:
            r2 = 0
            java.lang.String r0 = "mTopTitleView"
            gy3.C87412m.m108603p(r0)
            throw r2
        L_0x0385:
            r2 = r5
            gy3.C87412m.m108603p(r6)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94680v.mo130270H(so2.m$a):void");
    }

    /* renamed from: I */
    public final void mo130271I(FrameLayout frameLayout, View view, float f) {
        SnsMethodCalculate.markStartTimeMs("fitCenterChild", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        try {
            if (f < (((float) frameLayout.getLayoutParams().width) * 1.0f) / ((float) frameLayout.getLayoutParams().height)) {
                int i = (int) (f * ((float) frameLayout.getLayoutParams().height));
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.width = i;
                layoutParams2.height = frameLayout.getLayoutParams().height;
                layoutParams2.leftMargin = (frameLayout.getLayoutParams().width - i) / 2;
                layoutParams2.gravity = 3;
            } else {
                int i2 = (int) (((float) frameLayout.getLayoutParams().width) / f);
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                layoutParams4.width = frameLayout.getLayoutParams().width;
                layoutParams4.height = i2;
                layoutParams4.topMargin = (frameLayout.getLayoutParams().height - i2) / 2;
                layoutParams4.gravity = 48;
            }
        } catch (Throwable th) {
            Log.m105920e("AdLandingHalfEggCardComponent", "fitCenterChild, exp=" + th);
        }
        SnsMethodCalculate.markEndTimeMs("fitCenterChild", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
    }

    /* renamed from: J */
    public final Interpolator mo130272J() {
        SnsMethodCalculate.markStartTimeMs("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        PathInterpolator pathInterpolator = new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        SnsMethodCalculate.markEndTimeMs("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        return pathInterpolator;
    }

    /* renamed from: K */
    public final int mo130273K(float f) {
        SnsMethodCalculate.markStartTimeMs("getRelativeSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        int i = (int) (f * this.f273989J);
        SnsMethodCalculate.markEndTimeMs("getRelativeSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        return i;
    }

    /* renamed from: M */
    public final void mo130274M() {
        SnsMethodCalculate.markStartTimeMs("iniContentVisibility", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        Log.m105924i("AdLandingHalfEggCardComponent", "initCardViewVisibility");
        ImageView imageView = this.f273997u;
        if (imageView != null) {
            imageView.setVisibility(4);
            imageView.setAlpha(0.0f);
            TextView textView = this.f273998v;
            if (textView != null) {
                textView.setVisibility(4);
                textView.setAlpha(0.0f);
                TextView textView2 = this.f273999w;
                if (textView2 != null) {
                    textView2.setVisibility(4);
                    textView2.setAlpha(0.0f);
                    TextView textView3 = this.f274000x;
                    if (textView3 != null) {
                        textView3.setVisibility(4);
                        textView3.setAlpha(0.0f);
                        FrameLayout frameLayout = this.f274002z;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                            frameLayout.setAlpha(0.0f);
                            frameLayout.removeAllViews();
                            FrameLayout frameLayout2 = this.f273980A;
                            if (frameLayout2 != null) {
                                frameLayout2.setVisibility(4);
                                frameLayout2.setAlpha(0.0f);
                                frameLayout2.removeAllViews();
                                ImageView imageView2 = this.f273981B;
                                if (imageView2 != null) {
                                    imageView2.setVisibility(4);
                                    imageView2.setAlpha(0.0f);
                                    View view = this.f273986G;
                                    if (view != null) {
                                        C9556a aVar = new C9556a();
                                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                        aVar.mo10233c(4);
                                        View view2 = view;
                                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHalfEggCardComponent", "iniContentVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                        C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHalfEggCardComponent", "iniContentVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        C9556a aVar2 = new C9556a();
                                        aVar2.mo10233c(Float.valueOf(0.0f));
                                        View view3 = view;
                                        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHalfEggCardComponent", "iniContentVisibility", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                        view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                                        C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHalfEggCardComponent", "iniContentVisibility", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                    }
                                    SnsMethodCalculate.markEndTimeMs("iniContentVisibility", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                                    return;
                                }
                                C87412m.m108603p("mAnimView");
                                throw null;
                            }
                            C87412m.m108603p("mBtnCompContainer");
                            throw null;
                        }
                        C87412m.m108603p("mCenterCompContainer");
                        throw null;
                    }
                    C87412m.m108603p("mDescView");
                    throw null;
                }
                C87412m.m108603p("mTitleView");
                throw null;
            }
            C87412m.m108603p("mTopTitleView");
            throw null;
        }
        C87412m.m108603p("mBgView");
        throw null;
    }

    /* renamed from: N */
    public final void mo130275N(TextView textView, float f) {
        SnsMethodCalculate.markStartTimeMs("relativeFontSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        textView.setTextSize(0, (float) mo130273K(f));
        SnsMethodCalculate.markEndTimeMs("relativeFontSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
    }

    /* renamed from: O */
    public final void mo130276O(View view, float f) {
        SnsMethodCalculate.markStartTimeMs("relativeTopMargin", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        C87412m.m108594g(view, "<this>");
        int K = mo130273K(f);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = K;
        SnsMethodCalculate.markEndTimeMs("relativeTopMargin", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
    }

    /* renamed from: P */
    public final void mo130277P(C101271i0 i0Var, String str, int i) {
        SnsMethodCalculate.markStartTimeMs("reportAutoJumpH5", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        if (i0Var == null) {
            Log.m105920e("AdLandingHalfEggCardComponent", "reportAutoJumpH5, landingPageData==null");
            SnsMethodCalculate.markEndTimeMs("reportAutoJumpH5", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uxinfo", Util.nullAsNil(i0Var.mo140745l()));
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i0Var.mo140742i());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("canvasId", Util.nullAsNil(i0Var.mo140737d()));
            jSONObject2.put("pageId", Util.nullAsNil(i0Var.mo140739f()));
            jSONObject2.put("cardId", Util.nullAsNil(str));
            jSONObject2.put("cardIdType", i);
            jSONObject.put("extInfo", jSONObject2);
            String jSONObject3 = jSONObject.toString();
            C87412m.m108593f(jSONObject3, "reportJson.toString()");
            C102260r.m134858a("finder_cny_auto_jump_h5", jSONObject3);
            Log.m105924i("AdLandingHalfEggCardComponent", "reportAutoJumpH5, content=" + jSONObject3);
        } catch (Exception e) {
            Log.m105920e("AdLandingHalfEggCardComponent", "reportAutoJumpH5 exp:" + e);
        }
        SnsMethodCalculate.markEndTimeMs("reportAutoJumpH5", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
    }

    /* renamed from: Q */
    public final boolean mo130278Q(String str) {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("selectCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        if (((ArrayList) this.f273995s.mo141128c()).size() <= 0) {
            Log.m105920e("AdLandingHalfEggCardComponent", "selectCard, cardId=" + str + ", cardInfoList empty");
            SnsMethodCalculate.markEndTimeMs("selectCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            return false;
        }
        Iterator it = ((ArrayList) this.f273995s.mo141128c()).iterator();
        while (it.hasNext()) {
            C101679m.C101680a aVar = (C101679m.C101680a) it.next();
            String a = aVar.mo141129a();
            if (a == null || !a.equals(str)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                Log.m105924i("AdLandingHalfEggCardComponent", "selectCard, cardId=" + str + ", cardCount=" + ((ArrayList) this.f273995s.mo141128c()).size());
                mo130270H(aVar);
                SnsMethodCalculate.markEndTimeMs("selectCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                return true;
            }
        }
        Log.m105920e("AdLandingHalfEggCardComponent", "selectCard, cardId=" + str + ", by default, cardCount=" + ((ArrayList) this.f273995s.mo141128c()).size());
        mo130270H((C101679m.C101680a) ((ArrayList) this.f273995s.mo141128c()).get(0));
        C115669n.INSTANCE.mo175911u(1970, 7);
        SnsMethodCalculate.markEndTimeMs("selectCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        return true;
    }

    /* renamed from: R */
    public final void mo130279R(String str) {
        SnsMethodCalculate.markStartTimeMs("selectCardFromUI", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        Log.m105924i("AdLandingHalfEggCardComponent", "selectCardFromUI, isSelectedBefore=" + this.f273992M + ", cardId=" + str);
        if (!this.f273992M) {
            this.f273992M = mo130278Q(str);
        }
        SnsMethodCalculate.markEndTimeMs("selectCardFromUI", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
    }

    /* renamed from: U */
    public final void mo130280U(boolean z) {
        SnsMethodCalculate.markStartTimeMs("showCardContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        Log.m105924i("AdLandingHalfEggCardComponent", "showCardContent, directShow=" + z);
        TextView textView = this.f273998v;
        if (textView != null) {
            textView.setVisibility(0);
            TextView textView2 = this.f273999w;
            if (textView2 != null) {
                textView2.setVisibility(0);
                TextView textView3 = this.f274000x;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                    FrameLayout frameLayout = this.f273980A;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(0);
                        FrameLayout frameLayout2 = this.f274002z;
                        if (frameLayout2 != null) {
                            frameLayout2.setVisibility(0);
                            if (z) {
                                ImageView imageView = this.f273981B;
                                if (imageView != null) {
                                    imageView.setVisibility(4);
                                    ImageView imageView2 = this.f273981B;
                                    if (imageView2 != null) {
                                        imageView2.setAlpha(0.0f);
                                        ImageView imageView3 = this.f273997u;
                                        if (imageView3 != null) {
                                            imageView3.setVisibility(0);
                                        } else {
                                            C87412m.m108603p("mBgView");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("mAnimView");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("mAnimView");
                                    throw null;
                                }
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                            ofFloat.setDuration(z ? 200 : 500);
                            SnsMethodCalculate.markStartTimeMs("getEaseInInterpolator", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                            PathInterpolator pathInterpolator = new PathInterpolator(0.42f, 0.0f, 1.0f, 1.0f);
                            SnsMethodCalculate.markEndTimeMs("getEaseInInterpolator", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                            ofFloat.setInterpolator(pathInterpolator);
                            ofFloat.addUpdateListener(new C94683c(this, z));
                            ofFloat.addListener(new C94684d(this));
                            ofFloat.start();
                            SnsMethodCalculate.markEndTimeMs("showCardContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                            return;
                        }
                        C87412m.m108603p("mCenterCompContainer");
                        throw null;
                    }
                    C87412m.m108603p("mBtnCompContainer");
                    throw null;
                }
                C87412m.m108603p("mDescView");
                throw null;
            }
            C87412m.m108603p("mTitleView");
            throw null;
        }
        C87412m.m108603p("mTopTitleView");
        throw null;
    }

    /* renamed from: V */
    public final void mo130281V(boolean z) {
        SnsMethodCalculate.markStartTimeMs("showH5Content", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        Log.m105924i("AdLandingHalfEggCardComponent", "showH5Content, directShow=" + z);
        View view = this.f273986G;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHalfEggCardComponent", "showH5Content", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHalfEggCardComponent", "showH5Content", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        MMProcessBar mMProcessBar = this.f273985F;
        if (mMProcessBar != null) {
            mMProcessBar.setVisibility(0);
        }
        MMProcessBar mMProcessBar2 = this.f273985F;
        if (mMProcessBar2 != null) {
            mMProcessBar2.mo82303c();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(200);
        SnsMethodCalculate.markStartTimeMs("getEaseInInterpolator", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        PathInterpolator pathInterpolator = new PathInterpolator(0.42f, 0.0f, 1.0f, 1.0f);
        SnsMethodCalculate.markEndTimeMs("getEaseInInterpolator", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        ofFloat.setInterpolator(pathInterpolator);
        ofFloat.addUpdateListener(new C94685e(this));
        ofFloat.start();
        if (z) {
            C115669n.INSTANCE.mo175911u(1970, 5);
        } else {
            C115669n.INSTANCE.mo175911u(1970, 6);
        }
        SnsMethodCalculate.markEndTimeMs("showH5Content", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
    }

    /* renamed from: d */
    public void mo124363d() {
        SnsMethodCalculate.markStartTimeMs("applyLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        SnsMethodCalculate.markEndTimeMs("applyLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
    }

    /* renamed from: e */
    public void mo67238e() {
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        mo130274M();
        C101679m.C101682b b = this.f273995s.mo141127b();
        b.getClass();
        SnsMethodCalculate.markStartTimeMs("getAnimImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
        String str = b.f297668a;
        SnsMethodCalculate.markEndTimeMs("getAnimImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
        boolean z = false;
        if (str != null) {
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str != null) {
                ImageView imageView = this.f273981B;
                if (imageView != null) {
                    C101419f.m133083f(str, imageView);
                } else {
                    C87412m.m108603p("mAnimView");
                    throw null;
                }
            }
        }
        ImageView imageView2 = this.f273997u;
        if (imageView2 != null) {
            imageView2.setImageDrawable((Drawable) null);
            C101679m mVar = this.f273995s;
            mVar.getClass();
            SnsMethodCalculate.markStartTimeMs("getBackgroundImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
            String str2 = mVar.f297655B;
            SnsMethodCalculate.markEndTimeMs("getBackgroundImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
            if (str2 == null || str2.length() == 0) {
                z = true;
            }
            if (!z) {
                C101679m mVar2 = this.f273995s;
                mVar2.getClass();
                SnsMethodCalculate.markStartTimeMs("getBackgroundImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
                String str3 = mVar2.f297655B;
                SnsMethodCalculate.markEndTimeMs("getBackgroundImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
                C101419f.m133083f(str3, imageView2);
            }
            SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            return;
        }
        C87412m.m108603p("mBgView");
        throw null;
    }

    /* renamed from: f */
    public View mo67239f() {
        MMWebView mMWebView;
        SnsMethodCalculate.markStartTimeMs("customLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        SnsMethodCalculate.markStartTimeMs("doCustomLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        Log.m105924i("AdLandingHalfEggCardComponent", "doCustomLayout");
        FrameLayout frameLayout = new FrameLayout(this.f276579d);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(this.f276588p, this.f276589q));
        this.f273996t = frameLayout;
        ImageView imageView = new ImageView(this.f276579d);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f273997u = imageView;
        LinearLayout linearLayout = new LinearLayout(this.f276579d);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = C102260r.m134874n(36);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(1);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        long currentTimeMillis = System.currentTimeMillis();
        Context context = this.f276579d;
        C87412m.m108593f(context, "context");
        C41647w G30 = ((C60194q2) C86312j.m106911c(C60194q2.class)).G30(context, "", 89);
        this.f273987H = G30;
        if (G30 != null) {
            G30.addWebViewStateListener(new C43026w(this));
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        C41647w wVar = this.f273987H;
        if (wVar == null || (mMWebView = wVar.getWithInitWebView()) == null) {
            mMWebView = null;
        } else {
            mMWebView.setVisibility(4);
            mMWebView.setAlpha(0.0f);
            mMWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        this.f273986G = mMWebView;
        long currentTimeMillis3 = System.currentTimeMillis();
        Log.m105924i("AdLandingHalfEggCardComponent", "--createWebView, t1=" + (currentTimeMillis2 - currentTimeMillis) + ", t2=" + (currentTimeMillis3 - currentTimeMillis2));
        MMProcessBar mMProcessBar = new MMProcessBar(this.f276579d);
        int n = C102260r.m134874n(20);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(n, n);
        layoutParams2.gravity = 17;
        mMProcessBar.setLayoutParams(layoutParams2);
        mMProcessBar.setBackgroundResource(C0966R.C0969drawable.an4);
        mMProcessBar.setVisibility(4);
        this.f273985F = mMProcessBar;
        FrameLayout frameLayout2 = this.f273996t;
        if (frameLayout2 != null) {
            ImageView imageView2 = this.f273997u;
            if (imageView2 != null) {
                frameLayout2.addView(imageView2);
                View view = this.f273986G;
                if (view != null) {
                    FrameLayout frameLayout3 = this.f273996t;
                    if (frameLayout3 != null) {
                        frameLayout3.addView(view);
                        FrameLayout frameLayout4 = this.f273996t;
                        if (frameLayout4 != null) {
                            frameLayout4.addView(this.f273985F);
                        } else {
                            C87412m.m108603p("mRoot");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("mRoot");
                        throw null;
                    }
                }
                FrameLayout frameLayout5 = this.f273996t;
                if (frameLayout5 != null) {
                    frameLayout5.addView(linearLayout);
                    this.f273998v = mo130269G("#EFB600", C0966R.dimen.ano, 16);
                    this.f273999w = mo130269G("#000000", C0966R.dimen.anq, 20);
                    this.f274000x = mo130269G("#80000000", C0966R.dimen.a_d, 10);
                    FrameLayout frameLayout6 = new FrameLayout(this.f276579d);
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(C102260r.m134874n(180), C102260r.m134874n(240));
                    layoutParams3.topMargin = C102260r.m134874n(25);
                    frameLayout6.setLayoutParams(layoutParams3);
                    this.f274001y = frameLayout6;
                    FrameLayout frameLayout7 = new FrameLayout(this.f276579d);
                    frameLayout7.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                    this.f274002z = frameLayout7;
                    ImageView imageView3 = new ImageView(this.f276579d);
                    imageView3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    imageView3.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    C101679m.C101682b b = this.f273995s.mo141127b();
                    b.getClass();
                    SnsMethodCalculate.markStartTimeMs("getBgColor", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
                    String str = b.f297669b;
                    SnsMethodCalculate.markEndTimeMs("getBgColor", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
                    if (str != null) {
                        if (!(str.length() > 0)) {
                            str = null;
                        }
                        if (str != null) {
                            try {
                                imageView3.setImageDrawable(new ColorDrawable(Color.parseColor(str)));
                            } catch (Exception unused) {
                                Log.m105924i("AdLandingHalfEggCardComponent", "parseColor exp=" + str);
                            }
                        }
                    }
                    this.f273981B = imageView3;
                    FrameLayout frameLayout8 = this.f274001y;
                    if (frameLayout8 != null) {
                        FrameLayout frameLayout9 = this.f274002z;
                        if (frameLayout9 != null) {
                            frameLayout8.addView(frameLayout9);
                            FrameLayout frameLayout10 = this.f274001y;
                            if (frameLayout10 != null) {
                                ImageView imageView4 = this.f273981B;
                                if (imageView4 != null) {
                                    frameLayout10.addView(imageView4);
                                    FrameLayout frameLayout11 = new FrameLayout(this.f276579d);
                                    LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                                    layoutParams4.topMargin = C102260r.m134874n(40);
                                    frameLayout11.setLayoutParams(layoutParams4);
                                    this.f273980A = frameLayout11;
                                    TextView textView = this.f273998v;
                                    if (textView != null) {
                                        linearLayout.addView(textView);
                                        TextView textView2 = this.f273999w;
                                        if (textView2 != null) {
                                            linearLayout.addView(textView2);
                                            TextView textView3 = this.f274000x;
                                            if (textView3 != null) {
                                                linearLayout.addView(textView3);
                                                FrameLayout frameLayout12 = this.f274001y;
                                                if (frameLayout12 != null) {
                                                    linearLayout.addView(frameLayout12);
                                                    FrameLayout frameLayout13 = this.f273980A;
                                                    if (frameLayout13 != null) {
                                                        linearLayout.addView(frameLayout13);
                                                        FrameLayout frameLayout14 = this.f273996t;
                                                        if (frameLayout14 != null) {
                                                            SnsMethodCalculate.markEndTimeMs("doCustomLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                                                            SnsMethodCalculate.markEndTimeMs("customLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                                                            return frameLayout14;
                                                        }
                                                        C87412m.m108603p("mRoot");
                                                        throw null;
                                                    }
                                                    C87412m.m108603p("mBtnCompContainer");
                                                    throw null;
                                                }
                                                C87412m.m108603p("mCenterContainer");
                                                throw null;
                                            }
                                            C87412m.m108603p("mDescView");
                                            throw null;
                                        }
                                        C87412m.m108603p("mTitleView");
                                        throw null;
                                    }
                                    C87412m.m108603p("mTopTitleView");
                                    throw null;
                                }
                                C87412m.m108603p("mAnimView");
                                throw null;
                            }
                            C87412m.m108603p("mCenterContainer");
                            throw null;
                        }
                        C87412m.m108603p("mCenterCompContainer");
                        throw null;
                    }
                    C87412m.m108603p("mCenterContainer");
                    throw null;
                }
                C87412m.m108603p("mRoot");
                throw null;
            }
            C87412m.m108603p("mBgView");
            throw null;
        }
        C87412m.m108603p("mRoot");
        throw null;
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        super.mo67240g();
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
    }

    /* renamed from: u */
    public boolean mo124366u(JSONArray jSONArray) {
        SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        JSONObject jSONObject = new JSONObject();
        if (mo118822v(jSONObject)) {
            jSONObject.put("cardId", Util.nullAsNil(this.f273990K));
            if (jSONArray != null) {
                jSONArray.put(jSONObject);
            }
        }
        C95295z zVar = this.f273984E;
        if (zVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            if (zVar.mo118822v(jSONObject2) && jSONArray != null) {
                jSONArray.put(jSONObject2);
            }
        }
        C95295z zVar2 = this.f273983D;
        if (zVar2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            if (zVar2.mo118822v(jSONObject3) && jSONArray != null) {
                jSONArray.put(jSONObject3);
            }
        }
        C95295z zVar3 = this.f273982C;
        if (zVar3 != null) {
            JSONObject jSONObject4 = new JSONObject();
            if (zVar3.mo118822v(jSONObject4) && jSONArray != null) {
                jSONArray.put(jSONObject4);
            }
        }
        SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        return true;
    }

    /* renamed from: y */
    public void mo118814y() {
        SnsMethodCalculate.markStartTimeMs("setPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        SnsMethodCalculate.markEndTimeMs("setPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
    }
}
