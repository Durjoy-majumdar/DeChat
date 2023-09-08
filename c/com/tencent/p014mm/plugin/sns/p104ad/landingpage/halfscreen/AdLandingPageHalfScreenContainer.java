package com.tencent.p014mm.plugin.sns.p104ad.landingpage.halfscreen;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.halfscreen.C94696a;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import qs2.C101271i0;
import vo2.C65833d;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer */
public class AdLandingPageHalfScreenContainer extends RoundedCornerFrameLayout {

    /* renamed from: x */
    public static final /* synthetic */ int f274054x = 0;

    /* renamed from: g */
    public int f274055g;

    /* renamed from: h */
    public int f274056h;

    /* renamed from: i */
    public float f274057i;

    /* renamed from: j */
    public float f274058j;

    /* renamed from: n */
    public int f274059n;

    /* renamed from: o */
    public int f274060o;

    /* renamed from: p */
    public boolean f274061p = false;

    /* renamed from: q */
    public boolean f274062q = false;

    /* renamed from: r */
    public boolean f274063r = false;

    /* renamed from: s */
    public boolean f274064s = true;

    /* renamed from: t */
    public Context f274065t;

    /* renamed from: u */
    public boolean f274066u = true;

    /* renamed from: v */
    public boolean f274067v = false;

    /* renamed from: w */
    public C94695e f274068w;

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer$a */
    public class C94691a implements ValueAnimator.AnimatorUpdateListener {
        public C94691a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer$1");
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            AdLandingPageHalfScreenContainer adLandingPageHalfScreenContainer = AdLandingPageHalfScreenContainer.this;
            int i = AdLandingPageHalfScreenContainer.f274054x;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
            adLandingPageHalfScreenContainer.mo130335i(intValue);
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer$b */
    public class C94692b implements Animator.AnimatorListener {
        public C94692b() {
        }

        public void onAnimationCancel(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer$2");
            SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer$2");
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer$2");
            StringBuilder sb = new StringBuilder();
            sb.append("arend onAnimationEnd mIsStayTop = ");
            AdLandingPageHalfScreenContainer adLandingPageHalfScreenContainer = AdLandingPageHalfScreenContainer.this;
            int i = AdLandingPageHalfScreenContainer.f274054x;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
            boolean z = adLandingPageHalfScreenContainer.f274061p;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
            sb.append(z);
            Log.m105924i("LandingPageHalfScreenContainer", sb.toString());
            AdLandingPageHalfScreenContainer adLandingPageHalfScreenContainer2 = AdLandingPageHalfScreenContainer.this;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
            boolean z2 = adLandingPageHalfScreenContainer2.f274061p;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
            if (!z2 && AdLandingPageHalfScreenContainer.m119880c(AdLandingPageHalfScreenContainer.this) != null) {
                AdLandingPageHalfScreenContainer adLandingPageHalfScreenContainer3 = AdLandingPageHalfScreenContainer.this;
                SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
                adLandingPageHalfScreenContainer3.f274061p = true;
                SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
                ((C94696a.C94698b) AdLandingPageHalfScreenContainer.m119880c(AdLandingPageHalfScreenContainer.this)).mo130353a();
            }
            AdLandingPageHalfScreenContainer adLandingPageHalfScreenContainer4 = AdLandingPageHalfScreenContainer.this;
            SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
            adLandingPageHalfScreenContainer4.f274061p = true;
            SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer$2");
        }

        public void onAnimationRepeat(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer$2");
            SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer$2");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer$2");
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer$c */
    public class C94693c implements ValueAnimator.AnimatorUpdateListener {
        public C94693c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer$3");
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            AdLandingPageHalfScreenContainer adLandingPageHalfScreenContainer = AdLandingPageHalfScreenContainer.this;
            int i = AdLandingPageHalfScreenContainer.f274054x;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
            adLandingPageHalfScreenContainer.mo130335i(intValue);
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
            AdLandingPageHalfScreenContainer adLandingPageHalfScreenContainer2 = AdLandingPageHalfScreenContainer.this;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
            adLandingPageHalfScreenContainer2.mo130333g(intValue);
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer$d */
    public class C94694d implements Animator.AnimatorListener {
        public C94694d() {
        }

        public void onAnimationCancel(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer$4");
            SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer$4");
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer$4");
            if (AdLandingPageHalfScreenContainer.m119880c(AdLandingPageHalfScreenContainer.this) != null) {
                C94696a.C94698b bVar = (C94696a.C94698b) AdLandingPageHalfScreenContainer.m119880c(AdLandingPageHalfScreenContainer.this);
                bVar.getClass();
                SnsMethodCalculate.markStartTimeMs("onHalfScreenHide", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$2");
                C94696a.m119887a(C94696a.this).finish();
                C94696a.m119887a(C94696a.this).overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
                SnsMethodCalculate.markEndTimeMs("onHalfScreenHide", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$2");
            }
            if (C65833d.m77546a()) {
                AdLandingPageHalfScreenContainer adLandingPageHalfScreenContainer = AdLandingPageHalfScreenContainer.this;
                SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
                boolean f = adLandingPageHalfScreenContainer.mo130332f();
                SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
                if (!f) {
                    AdLandingPagesProxy.getInstance().onHalfScreenHeightChange(1.0f);
                    AdLandingPagesProxy.getInstance().onHalfScreenAnimationChange(false, false);
                }
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer$4");
        }

        public void onAnimationRepeat(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer$4");
            SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer$4");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer$4");
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer$4");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer$e */
    public interface C94695e {
    }

    public AdLandingPageHalfScreenContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        this.f274065t = context;
        this.f274060o = ViewConfiguration.getTouchSlop();
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
    }

    /* renamed from: c */
    public static /* synthetic */ C94695e m119880c(AdLandingPageHalfScreenContainer adLandingPageHalfScreenContainer) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        C94695e eVar = adLandingPageHalfScreenContainer.f274068w;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        return eVar;
    }

    private int getCurrentPosition() {
        SnsMethodCalculate.markStartTimeMs("getCurrentPosition", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        int translationY = (int) getTranslationY();
        SnsMethodCalculate.markEndTimeMs("getCurrentPosition", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        return translationY;
    }

    private ViewGroup.LayoutParams getModifyLayoutParams() {
        SnsMethodCalculate.markStartTimeMs("getModifyLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        SnsMethodCalculate.markEndTimeMs("getModifyLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        return layoutParams;
    }

    /* renamed from: d */
    public void mo130329d() {
        SnsMethodCalculate.markStartTimeMs("doSlideToBottomAnim", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{getCurrentPosition(), getHeight()});
        ofInt.setDuration(250);
        ofInt.addUpdateListener(new C94693c());
        ofInt.addListener(new C94694d());
        if (C65833d.m77546a() && !mo130332f()) {
            AdLandingPagesProxy.getInstance().onHalfScreenAnimationChange(false, true);
        }
        ofInt.start();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0f, 0.5f});
        ofFloat.setDuration(250);
        ofFloat.start();
        SnsMethodCalculate.markEndTimeMs("doSlideToBottomAnim", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r3 != 3) goto L_0x01ad;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r15) {
        /*
            r14 = this;
            java.lang.String r0 = "dispatchTouchEvent"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r14.f274067v
            if (r2 == 0) goto L_0x01b0
            java.lang.String r2 = "handleTouchEvent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            int r3 = r15.getAction()
            float r4 = r15.getRawX()
            float r5 = r15.getRawY()
            java.lang.String r6 = "LandingPageHalfScreenContainer"
            r7 = 1
            r8 = 0
            if (r3 == 0) goto L_0x0174
            r9 = 2
            if (r3 == r7) goto L_0x0135
            if (r3 == r9) goto L_0x002c
            r4 = 3
            if (r3 == r4) goto L_0x0135
            goto L_0x01ad
        L_0x002c:
            float r3 = r14.f274057i
            float r4 = r4 - r3
            float r3 = r14.f274058j
            float r5 = r5 - r3
            boolean r3 = r14.f274063r
            r9 = 0
            if (r3 != 0) goto L_0x00c4
            float r3 = java.lang.Math.abs(r4)
            int r10 = r14.f274060o
            float r10 = (float) r10
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 > 0) goto L_0x004d
            float r3 = java.lang.Math.abs(r5)
            int r10 = r14.f274060o
            float r10 = (float) r10
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x00c4
        L_0x004d:
            float r3 = java.lang.Math.abs(r4)
            float r4 = java.lang.Math.abs(r5)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x005e
            r14.f274063r = r7
            r14.f274062q = r8
            goto L_0x00c4
        L_0x005e:
            boolean r3 = r14.f274061p
            if (r3 == 0) goto L_0x00c0
            int r3 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x00bb
            java.lang.String r3 = "isChildCanScrollDown"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r1)
            com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer$e r4 = r14.f274068w
            if (r4 == 0) goto L_0x00af
            com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.a$b r4 = (com.tencent.p014mm.plugin.sns.p104ad.landingpage.halfscreen.C94696a.C94698b) r4
            java.lang.String r10 = "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r10)
            com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.a r4 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.halfscreen.C94696a.this
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r4 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.halfscreen.C94696a.m119887a(r4)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment r4 = r4.mo132540m8()
            if (r4 != 0) goto L_0x0088
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r10)
            r4 = 0
            goto L_0x00ab
        L_0x0088:
            java.lang.String r11 = "canScrollDown"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r12)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$g r13 = r4.f276483C     // Catch:{ Exception -> 0x00a4 }
            androidx.recyclerview.widget.RecyclerView r13 = r13.f276527g     // Catch:{ Exception -> 0x00a4 }
            int r13 = r13.computeVerticalScrollOffset()     // Catch:{ Exception -> 0x00a4 }
            boolean r4 = r4.f276502n     // Catch:{ Exception -> 0x00a4 }
            if (r4 == 0) goto L_0x00a4
            if (r13 <= r7) goto L_0x009f
            r4 = 1
            goto L_0x00a0
        L_0x009f:
            r4 = 0
        L_0x00a0:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
            goto L_0x00a8
        L_0x00a4:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
            r4 = 1
        L_0x00a8:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r10)
        L_0x00ab:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r1)
            goto L_0x00b3
        L_0x00af:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r1)
            r4 = 0
        L_0x00b3:
            if (r4 != 0) goto L_0x00b8
            r14.f274062q = r7
            goto L_0x00bd
        L_0x00b8:
            r14.f274062q = r8
            goto L_0x00bd
        L_0x00bb:
            r14.f274062q = r8
        L_0x00bd:
            r14.f274063r = r7
            goto L_0x00c4
        L_0x00c0:
            r14.f274062q = r7
            r14.f274063r = r7
        L_0x00c4:
            boolean r3 = r14.f274062q
            if (r3 == 0) goto L_0x00d8
            r14.f274064s = r7
            int r3 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x00d3
            int r3 = r14.f274060o
            float r3 = (float) r3
            float r5 = r5 - r3
            goto L_0x00da
        L_0x00d3:
            int r3 = r14.f274060o
            float r3 = (float) r3
            float r5 = r5 + r3
            goto L_0x00da
        L_0x00d8:
            r14.f274064s = r8
        L_0x00da:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "mIsJudged="
            r3.append(r4)
            boolean r4 = r14.f274063r
            r3.append(r4)
            java.lang.String r4 = ", sIntercept="
            r3.append(r4)
            boolean r4 = r14.f274062q
            r3.append(r4)
            java.lang.String r4 = ", mIsStayMinTop="
            r3.append(r4)
            boolean r4 = r14.f274061p
            r3.append(r4)
            java.lang.String r4 = ", needLayout="
            r3.append(r4)
            boolean r4 = r14.f274064s
            r3.append(r4)
            java.lang.String r4 = ", disY="
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            boolean r3 = r14.f274064s
            if (r3 == 0) goto L_0x01ad
            int r3 = r14.f274059n
            int r4 = (int) r5
            int r3 = r3 + r4
            int r4 = r14.f274056h
            if (r3 >= r4) goto L_0x0124
            r3 = r4
        L_0x0124:
            boolean r4 = r14.f274066u
            if (r4 != 0) goto L_0x012d
            int r4 = r14.f274055g
            if (r3 >= r4) goto L_0x012d
            r3 = r4
        L_0x012d:
            r14.mo130335i(r3)
            r14.mo130333g(r3)
            goto L_0x01ad
        L_0x0135:
            java.lang.String r3 = "onTouchUpEnd"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r1)
            int r4 = r14.getCurrentPosition()
            boolean r5 = r14.f274061p
            java.lang.String r6 = "onSlideToTop"
            if (r5 == 0) goto L_0x015b
            int r5 = r14.f274055g
            int r5 = r5 / r9
            if (r4 >= r5) goto L_0x0155
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r1)
            r14.mo130331e()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r1)
            goto L_0x016e
        L_0x0155:
            if (r4 <= r5) goto L_0x016e
            r14.mo130334h()
            goto L_0x016e
        L_0x015b:
            int r5 = r14.f274055g
            if (r4 >= r5) goto L_0x0169
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r1)
            r14.mo130331e()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r1)
            goto L_0x016e
        L_0x0169:
            if (r4 <= r5) goto L_0x016e
            r14.mo130334h()
        L_0x016e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r1)
            r14.f274062q = r8
            goto L_0x01ad
        L_0x0174:
            r14.f274057i = r4
            r14.f274058j = r5
            int r3 = r14.getCurrentPosition()
            r14.f274059n = r3
            int r4 = r14.f274056h
            if (r3 != r4) goto L_0x01a9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "arend ACTION_DOWN mIsStayTop = "
            r3.append(r4)
            boolean r4 = r14.f274061p
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            boolean r3 = r14.f274061p
            if (r3 != 0) goto L_0x01a7
            com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer$e r3 = r14.f274068w
            if (r3 == 0) goto L_0x01a7
            r14.f274061p = r7
            com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.a$b r3 = (com.tencent.p014mm.plugin.sns.p104ad.landingpage.halfscreen.C94696a.C94698b) r3
            r3.mo130353a()
        L_0x01a7:
            r14.f274061p = r7
        L_0x01a9:
            r14.f274063r = r8
            r14.f274064s = r7
        L_0x01ad:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
        L_0x01b0:
            boolean r15 = super.dispatchTouchEvent(r15)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p104ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: e */
    public void mo130331e() {
        C94695e eVar;
        SnsMethodCalculate.markStartTimeMs("doSlideToTopAnim", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        if (!this.f274066u) {
            SnsMethodCalculate.markEndTimeMs("doSlideToTopAnim", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
            return;
        }
        int currentPosition = getCurrentPosition();
        int i = this.f274056h;
        if (currentPosition == i) {
            Log.m105924i("LandingPageHalfScreenContainer", "arend doSlideToTopAnim mIsStayTop = " + this.f274061p);
            if (!this.f274061p && (eVar = this.f274068w) != null) {
                this.f274061p = true;
                ((C94696a.C94698b) eVar).mo130353a();
            }
            this.f274061p = true;
            SnsMethodCalculate.markEndTimeMs("doSlideToTopAnim", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{currentPosition, i});
        ofInt.setDuration(150);
        ofInt.addUpdateListener(new C94691a());
        ofInt.addListener(new C94692b());
        ofInt.start();
        SnsMethodCalculate.markEndTimeMs("doSlideToTopAnim", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
    }

    /* renamed from: f */
    public final boolean mo130332f() {
        SnsMethodCalculate.markStartTimeMs("isOpenFromHalfScreenMode", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        Context context = this.f274065t;
        if (context instanceof SnsAdNativeLandingPagesUI) {
            C101271i0 n8 = ((SnsAdNativeLandingPagesUI) context).mo132541n8();
            n8.getClass();
            SnsMethodCalculate.markStartTimeMs("isOpenFromHalfScreenMode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
            boolean z = n8.f296638w;
            SnsMethodCalculate.markEndTimeMs("isOpenFromHalfScreenMode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
            SnsMethodCalculate.markEndTimeMs("isOpenFromHalfScreenMode", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
            return z;
        }
        SnsMethodCalculate.markEndTimeMs("isOpenFromHalfScreenMode", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        return false;
    }

    /* renamed from: g */
    public final void mo130333g(int i) {
        SnsMethodCalculate.markStartTimeMs("notifyHalfScreenPercent", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        try {
            if (C65833d.m77546a()) {
                if (!mo130332f()) {
                    int i2 = this.f274055g;
                    if (i < i2) {
                        i = i2;
                    }
                    AdLandingPagesProxy.getInstance().onHalfScreenHeightChange(1.0f - (((float) (getHeight() - i)) / ((float) (getHeight() - this.f274055g))));
                    SnsMethodCalculate.markEndTimeMs("notifyHalfScreenPercent", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
                    return;
                }
            }
            SnsMethodCalculate.markEndTimeMs("notifyHalfScreenPercent", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        } catch (Throwable th) {
            Log.m105920e("LandingPageHalfScreenContainer", "notifyHalfScreenPercent, exp=" + th.toString());
        }
    }

    /* renamed from: h */
    public final void mo130334h() {
        SnsMethodCalculate.markStartTimeMs("onSlideToBottom", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        C94695e eVar = this.f274068w;
        if (eVar != null) {
            C94696a.C94698b bVar = (C94696a.C94698b) eVar;
            bVar.getClass();
            SnsMethodCalculate.markStartTimeMs("onStartSlideToBottom", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$2");
            C94696a.m119887a(C94696a.this).mo132509R8();
            SnsMethodCalculate.markEndTimeMs("onStartSlideToBottom", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$2");
        } else {
            mo130329d();
        }
        SnsMethodCalculate.markEndTimeMs("onSlideToBottom", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
    }

    /* renamed from: i */
    public final void mo130335i(int i) {
        SnsMethodCalculate.markStartTimeMs("updatePosition", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        setTranslationY((float) i);
        C94695e eVar = this.f274068w;
        if (eVar != null) {
            C94696a.C94698b bVar = (C94696a.C94698b) eVar;
            bVar.getClass();
            SnsMethodCalculate.markStartTimeMs("onTransYChange", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$2");
            SnsAdNativeLandingPagesUI a = C94696a.m119887a(C94696a.this);
            a.getClass();
            SnsMethodCalculate.markStartTimeMs("getFixedBottomContainer", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            FrameLayout frameLayout = a.f277577f2;
            SnsMethodCalculate.markEndTimeMs("getFixedBottomContainer", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            if (frameLayout != null && frameLayout.getVisibility() == 0) {
                frameLayout.setTranslationY((float) (-i));
            }
            SnsMethodCalculate.markEndTimeMs("onTransYChange", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$2");
        }
        SnsMethodCalculate.markEndTimeMs("updatePosition", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        if (!this.f274067v) {
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
            return onInterceptTouchEvent;
        }
        boolean z = this.f274062q;
        SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        return z;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        if (!this.f274067v) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
            return onTouchEvent;
        }
        SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        return true;
    }

    public void setEnableSlideToTop(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setEnableSlideToTop", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        Log.m105924i("LandingPageHalfScreenContainer", "setEnableSlideToTop, enable=" + z);
        this.f274066u = z;
        SnsMethodCalculate.markEndTimeMs("setEnableSlideToTop", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
    }

    public void setHalfScreenListener(C94695e eVar) {
        SnsMethodCalculate.markStartTimeMs("setHalfScreenListener", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        this.f274068w = eVar;
        SnsMethodCalculate.markEndTimeMs("setHalfScreenListener", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
    }

    public void setHalfScreenModeEnable(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setHalfScreenModeEnable", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        this.f274067v = z;
        SnsMethodCalculate.markEndTimeMs("setHalfScreenModeEnable", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
    }

    public AdLandingPageHalfScreenContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        this.f274065t = context;
        this.f274060o = ViewConfiguration.getTouchSlop();
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
    }
}
