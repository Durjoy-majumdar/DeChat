package com.tencent.p014mm.view.refreshLayout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;
import kotlin.Metadata;
import lq3.C21456a;
import mq3.C21524b;
import mq3.C21525d;
import mq3.C47093a;
import mq3.C61566c;
import oq3.C110058f;
import oq3.C110059h;
import oq3.C11723d;
import oq3.C21802a;
import oq3.C21803b;
import oq3.C21804c;
import oq3.C21805g;
import oq3.C62151e;
import p849e3.C107199k;
import p849e3.C107200l;
import p849e3.C107203p;
import p849e3.C58524o;
import pq3.C118126a;
import qq3.C63318b;
import qq3.C63319c;
import rq3.C22243b;
import rq3.C63508a;
import rq3.C63509c;
import sq3.C22386a;
import sq3.C22387b;
import sq3.C22392d;
import sq3.C22394f;
import t40.C77853a;
import wq3.C111847h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u001d\b\u0016\u0012\b\u0010k\u001a\u0004\u0018\u00010j\u0012\b\u0010m\u001a\u0004\u0018\u00010l¢\u0006\u0004\bn\u0010oB#\b\u0016\u0012\b\u0010k\u001a\u0004\u0018\u00010j\u0012\u0006\u0010m\u001a\u00020l\u0012\u0006\u0010p\u001a\u00020\u0006¢\u0006\u0004\bn\u0010qJ\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\bJ\u0010\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\bJ\b\u0010\u0016\u001a\u00020\u0001H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dR$\u0010%\u001a\u0004\u0018\u00010\u001d8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010-\u001a\u0004\u0018\u00010&8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00101\u001a\u0004\u0018\u00010&8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b.\u0010(\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R\"\u00109\u001a\u0002028\u0006@\u0006X.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010Q\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010Y\u001a\u0004\u0018\u00010R8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010a\u001a\u0004\u0018\u00010Z8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R$\u0010i\u001a\u0004\u0018\u00010b8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010h¨\u0006r"}, mo182094d2 = {"Lcom/tencent/mm/view/refreshLayout/WxRefreshLayout;", "Landroid/view/ViewGroup;", "Loq3/f;", "Le3/o;", "Le3/k;", "", "", "getNestedScrollAxes", "", "enabled", "Lrx3/b0;", "setNestedScrollingEnabled", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "getMainHandler", "Landroid/view/animation/Interpolator;", "getInterpolator", "Lsq3/b;", "getAnimHelper", "triggerLoadMoreEvent", "setDirectLoadingState", "isAutoRefresh", "setRefreshingState", "getLayout", "Lrq3/b;", "getState", "Loq3/d;", "getRefreshHeader", "Loq3/c;", "getLoadMoreFooter", "Loq3/b;", "getContentView", "d", "Loq3/b;", "getContentPlugin", "()Loq3/b;", "setContentPlugin", "(Loq3/b;)V", "contentPlugin", "Loq3/g;", "e", "Loq3/g;", "getHeaderPlugin", "()Loq3/g;", "setHeaderPlugin", "(Loq3/g;)V", "headerPlugin", "f", "getFooterPlugin", "setFooterPlugin", "footerPlugin", "Lmq3/a;", "i", "Lmq3/a;", "getCommonConfig", "()Lmq3/a;", "setCommonConfig", "(Lmq3/a;)V", "commonConfig", "Lmq3/d;", "j", "Lmq3/d;", "getHeaderConfig", "()Lmq3/d;", "setHeaderConfig", "(Lmq3/d;)V", "headerConfig", "Lmq3/c;", "n", "Lmq3/c;", "getFooterConfig", "()Lmq3/c;", "setFooterConfig", "(Lmq3/c;)V", "footerConfig", "Lqq3/b;", "p", "Lqq3/b;", "getOnSimpleAction", "()Lqq3/b;", "setOnSimpleAction", "(Lqq3/b;)V", "onSimpleAction", "Lqq3/c;", "q", "Lqq3/c;", "getOnMultiAction", "()Lqq3/c;", "setOnMultiAction", "(Lqq3/c;)V", "onMultiAction", "Loq3/a;", "r", "Loq3/a;", "getOverScrollCallback", "()Loq3/a;", "setOverScrollCallback", "(Loq3/a;)V", "overScrollCallback", "Loq3/h;", "s", "Loq3/h;", "getScrollBoundaryDecider", "()Loq3/h;", "setScrollBoundaryDecider", "(Loq3/h;)V", "scrollBoundaryDecider", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.refreshLayout.WxRefreshLayout */
public class WxRefreshLayout extends ViewGroup implements C110058f, C58524o, C107199k, C111847h {

    /* renamed from: G */
    public static final /* synthetic */ int f56656G = 0;

    /* renamed from: A */
    public final C22387b f56657A;

    /* renamed from: B */
    public int f56658B;

    /* renamed from: C */
    public boolean f56659C;

    /* renamed from: D */
    public int[] f56660D;

    /* renamed from: E */
    public C107200l f56661E;

    /* renamed from: F */
    public C107203p f56662F;

    /* renamed from: d */
    public C21803b f56663d;

    /* renamed from: e */
    public C21805g f56664e;

    /* renamed from: f */
    public C21805g f56665f;

    /* renamed from: g */
    public final C62151e f56666g = new C22392d(this);

    /* renamed from: h */
    public final C22386a f56667h;

    /* renamed from: i */
    public C47093a f56668i;

    /* renamed from: j */
    public C21525d f56669j;

    /* renamed from: n */
    public C61566c f56670n;

    /* renamed from: o */
    public C21524b f56671o;

    /* renamed from: p */
    public C63318b f56672p;

    /* renamed from: q */
    public C63319c f56673q;

    /* renamed from: r */
    public C21802a f56674r;

    /* renamed from: s */
    public C110059h f56675s;

    /* renamed from: t */
    public Scroller f56676t;

    /* renamed from: u */
    public VelocityTracker f56677u;

    /* renamed from: v */
    public Interpolator f56678v;

    /* renamed from: w */
    public final MMHandler f56679w;

    /* renamed from: x */
    public final ViewGroup.MarginLayoutParams f56680x;

    /* renamed from: y */
    public MotionEvent f56681y;

    /* renamed from: z */
    public final C22394f f56682z;

    /* renamed from: com.tencent.mm.view.refreshLayout.WxRefreshLayout$a */
    public static final class C19883a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WxRefreshLayout f56683d;

        /* renamed from: e */
        public final /* synthetic */ float f56684e;

        /* renamed from: f */
        public final /* synthetic */ int f56685f;

        /* renamed from: g */
        public final /* synthetic */ boolean f56686g;

        /* renamed from: com.tencent.mm.view.refreshLayout.WxRefreshLayout$a$a */
        public static final class C19884a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: d */
            public final /* synthetic */ WxRefreshLayout f56687d;

            /* renamed from: e */
            public final /* synthetic */ boolean f56688e;

            public C19884a(WxRefreshLayout wxRefreshLayout, boolean z) {
                this.f56687d = wxRefreshLayout;
                this.f56688e = z;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                WxRefreshLayout wxRefreshLayout = this.f56687d;
                if (wxRefreshLayout.f56657A.f63477e != null && wxRefreshLayout.getHeaderPlugin() != null) {
                    C22394f fVar = this.f56687d.f56682z;
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                    fVar.mo35542a(((Integer) animatedValue).intValue(), true, this.f56688e);
                }
            }
        }

        /* renamed from: com.tencent.mm.view.refreshLayout.WxRefreshLayout$a$b */
        public static final class C19885b extends AnimatorListenerAdapter {

            /* renamed from: d */
            public final /* synthetic */ WxRefreshLayout f56689d;

            /* renamed from: e */
            public final /* synthetic */ boolean f56690e;

            public C19885b(WxRefreshLayout wxRefreshLayout, boolean z) {
                this.f56689d = wxRefreshLayout;
                this.f56690e = z;
            }

            public void onAnimationEnd(Animator animator) {
                boolean z = true;
                if (!(animator != null && animator.getDuration() == 0)) {
                    WxRefreshLayout wxRefreshLayout = this.f56689d;
                    wxRefreshLayout.f56657A.f63477e = null;
                    if (wxRefreshLayout.getHeaderPlugin() != null) {
                        C22386a aVar = this.f56689d.f56667h;
                        C22243b bVar = aVar.f63470b;
                        C22243b bVar2 = C22243b.ReleaseToRefresh;
                        if (bVar != bVar2) {
                            z = false;
                        }
                        if (!z) {
                            aVar.mo35533e(bVar2);
                        }
                        this.f56689d.setRefreshingState(this.f56690e);
                        this.f56689d.mo26640x(this.f56690e);
                        return;
                    }
                    this.f56689d.f56667h.mo35533e(C22243b.None);
                }
            }
        }

        public C19883a(WxRefreshLayout wxRefreshLayout, float f, int i, boolean z) {
            this.f56683d = wxRefreshLayout;
            this.f56684e = f;
            this.f56685f = i;
            this.f56686g = z;
        }

        public final void run() {
            WxRefreshLayout wxRefreshLayout = this.f56683d;
            if (wxRefreshLayout.f56667h.f63471c == C22243b.Refreshing) {
                wxRefreshLayout.f56657A.mo35535b();
                WxRefreshLayout wxRefreshLayout2 = this.f56683d;
                C21524b bVar = wxRefreshLayout2.f56671o;
                if (bVar != null) {
                    bVar.f60968k = ((float) wxRefreshLayout2.getMeasuredWidth()) / 2.0f;
                    this.f56683d.f56667h.mo35533e(C22243b.PullDownToRefresh);
                    float f = this.f56683d.getHeaderConfig().f60981a == 0 ? this.f56683d.getHeaderConfig().f60984d : (float) this.f56683d.getHeaderConfig().f60981a;
                    float f2 = this.f56684e;
                    if (f2 < 10.0f) {
                        f2 *= f;
                    }
                    WxRefreshLayout wxRefreshLayout3 = this.f56683d;
                    C22387b bVar2 = wxRefreshLayout3.f56657A;
                    int[] iArr = new int[2];
                    C21524b bVar3 = wxRefreshLayout3.f56671o;
                    if (bVar3 != null) {
                        iArr[0] = bVar3.f60959b;
                        iArr[1] = (int) f2;
                        ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
                        int i = this.f56685f;
                        WxRefreshLayout wxRefreshLayout4 = this.f56683d;
                        boolean z = this.f56686g;
                        ofInt.setDuration((long) i);
                        ofInt.setInterpolator(new C118126a(0));
                        ofInt.addUpdateListener(new C19884a(wxRefreshLayout4, z));
                        ofInt.addListener(new C19885b(wxRefreshLayout4, z));
                        ofInt.start();
                        bVar2.f63477e = ofInt;
                        return;
                    }
                    C87412m.m108603p("cValues");
                    throw null;
                }
                C87412m.m108603p("cValues");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.view.refreshLayout.WxRefreshLayout$b */
    public static final class C19886b implements Runnable {

        /* renamed from: d */
        public int f56691d;

        /* renamed from: e */
        public final /* synthetic */ WxRefreshLayout f56692e;

        /* renamed from: f */
        public final /* synthetic */ int f56693f;

        /* renamed from: g */
        public final /* synthetic */ boolean f56694g;

        /* renamed from: h */
        public final /* synthetic */ boolean f56695h;

        public C19886b(WxRefreshLayout wxRefreshLayout, int i, boolean z, boolean z2) {
            this.f56692e = wxRefreshLayout;
            this.f56693f = i;
            this.f56694g = z;
            this.f56695h = z2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
            if ((r5 == rq3.C22243b.f63039v) != false) goto L_0x0041;
         */
        /* JADX WARNING: Removed duplicated region for block: B:109:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00a4  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r15 = this;
                int r0 = r15.f56691d
                r1 = 0
                r2 = 0
                java.lang.String r3 = "cValues"
                if (r0 != 0) goto L_0x00ab
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r0 = r15.f56692e
                sq3.a r4 = r0.f56667h
                rq3.b r5 = r4.f63470b
                rq3.b r6 = rq3.C22243b.None
                r7 = 1
                if (r5 != r6) goto L_0x0015
                r8 = 1
                goto L_0x0016
            L_0x0015:
                r8 = 0
            L_0x0016:
                if (r8 == 0) goto L_0x002a
                rq3.b r8 = r4.f63471c
                rq3.b r9 = rq3.C22243b.Refreshing
                if (r8 != r9) goto L_0x0020
                r8 = 1
                goto L_0x0021
            L_0x0020:
                r8 = 0
            L_0x0021:
                if (r8 == 0) goto L_0x002a
                r4.getClass()
                r4.f63471c = r6
                goto L_0x00a0
            L_0x002a:
                sq3.b r0 = r0.f56657A
                android.animation.ValueAnimator r8 = r0.f63477e
                if (r8 == 0) goto L_0x005e
                boolean r8 = r5.f63044d
                if (r8 == 0) goto L_0x005e
                boolean r8 = r5.f63046f
                if (r8 != 0) goto L_0x0041
                rq3.b r8 = rq3.C22243b.RefreshReleased
                if (r5 != r8) goto L_0x003e
                r5 = 1
                goto L_0x003f
            L_0x003e:
                r5 = 0
            L_0x003f:
                if (r5 == 0) goto L_0x005e
            L_0x0041:
                r0.mo35535b()
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r0 = r15.f56692e
                android.animation.ValueAnimator r0 = r0.mo26571c(r1)
                if (r0 != 0) goto L_0x0054
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r0 = r15.f56692e
                sq3.a r0 = r0.f56667h
                r0.mo35531c(r6)
                goto L_0x00a0
            L_0x0054:
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r0 = r15.f56692e
                sq3.a r0 = r0.f56667h
                rq3.b r1 = rq3.C22243b.PullDownCanceled
                r0.mo35531c(r1)
                goto L_0x00a0
            L_0x005e:
                boolean r0 = r4.mo35530b()
                if (r0 == 0) goto L_0x00a0
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r0 = r15.f56692e
                oq3.g r0 = r0.getHeaderPlugin()
                if (r0 == 0) goto L_0x00a0
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r0 = r15.f56692e
                oq3.b r0 = r0.getContentPlugin()
                if (r0 == 0) goto L_0x00a0
                int r0 = r15.f56691d
                int r0 = r0 + r7
                r15.f56691d = r0
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r0 = r15.f56692e
                com.tencent.mm.sdk.platformtools.MMHandler r0 = r0.f56679w
                int r4 = r15.f56693f
                long r4 = (long) r4
                r0.postDelayed(r15, r4)
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r0 = r15.f56692e
                sq3.a r0 = r0.f56667h
                rq3.b r4 = rq3.C22243b.RefreshFinish
                r0.mo35531c(r4)
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r0 = r15.f56692e
                mq3.b r4 = r0.f56671o
                if (r4 == 0) goto L_0x009c
                r4.f60976s = r1
                boolean r2 = r15.f56694g
                if (r2 != 0) goto L_0x00a0
                r0.mo26642z(r1)
                goto L_0x00a0
            L_0x009c:
                gy3.C87412m.m108603p(r3)
                throw r2
            L_0x00a0:
                boolean r0 = r15.f56694g
                if (r0 == 0) goto L_0x01ca
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r0 = r15.f56692e
                r0.mo26642z(r7)
                goto L_0x01ca
            L_0x00ab:
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r0 = r15.f56692e
                oq3.g r0 = r0.getHeaderPlugin()
                if (r0 == 0) goto L_0x00bc
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r4 = r15.f56692e
                boolean r5 = r15.f56695h
                int r0 = r0.mo34224b(r4, r5)
                goto L_0x00bd
            L_0x00bc:
                r0 = 0
            L_0x00bd:
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r4 = r15.f56692e
                r4.mo26639w()
                r4 = 2147483647(0x7fffffff, float:NaN)
                if (r0 >= r4) goto L_0x01ca
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r4 = r15.f56692e
                mq3.b r5 = r4.f56671o
                if (r5 == 0) goto L_0x01c6
                boolean r5 = r5.f60971n
                if (r5 != 0) goto L_0x00d5
                boolean r4 = r4.f56659C
                if (r4 == 0) goto L_0x0150
            L_0x00d5:
                long r13 = java.lang.System.currentTimeMillis()
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r4 = r15.f56692e
                mq3.b r5 = r4.f56671o
                if (r5 == 0) goto L_0x01c2
                boolean r6 = r5.f60971n
                if (r6 == 0) goto L_0x0122
                float r6 = r5.f60969l
                r5.f60967j = r6
                r5.f60965h = r1
                r5.f60971n = r1
                r9 = 0
                float r10 = r5.f60968k
                int r7 = r5.f60959b
                float r7 = (float) r7
                float r6 = r6 + r7
                int r5 = r5.f60960c
                int r5 = r5 * 2
                float r5 = (float) r5
                float r11 = r6 - r5
                r12 = 0
                r5 = r13
                r7 = r13
                android.view.MotionEvent r5 = android.view.MotionEvent.obtain(r5, r7, r9, r10, r11, r12)
                boolean unused = com.tencent.p014mm.view.refreshLayout.WxRefreshLayout.super.dispatchTouchEvent(r5)
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r4 = r15.f56692e
                r9 = 2
                mq3.b r5 = r4.f56671o
                if (r5 == 0) goto L_0x011e
                float r10 = r5.f60968k
                float r6 = r5.f60969l
                int r5 = r5.f60959b
                float r5 = (float) r5
                float r11 = r6 + r5
                r12 = 0
                r5 = r13
                r7 = r13
                android.view.MotionEvent r5 = android.view.MotionEvent.obtain(r5, r7, r9, r10, r11, r12)
                boolean unused = com.tencent.p014mm.view.refreshLayout.WxRefreshLayout.super.dispatchTouchEvent(r5)
                goto L_0x0122
            L_0x011e:
                gy3.C87412m.m108603p(r3)
                throw r2
            L_0x0122:
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r4 = r15.f56692e
                boolean r5 = r4.f56659C
                if (r5 == 0) goto L_0x0150
                r4.f56658B = r1
                r9 = 1
                mq3.b r5 = r4.f56671o
                if (r5 == 0) goto L_0x014c
                float r10 = r5.f60968k
                float r11 = r5.f60969l
                r12 = 0
                r5 = r13
                r7 = r13
                android.view.MotionEvent r5 = android.view.MotionEvent.obtain(r5, r7, r9, r10, r11, r12)
                boolean unused = com.tencent.p014mm.view.refreshLayout.WxRefreshLayout.super.dispatchTouchEvent(r5)
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r4 = r15.f56692e
                r4.f56659C = r1
                mq3.b r4 = r4.f56671o
                if (r4 == 0) goto L_0x0148
                r4.f60965h = r1
                goto L_0x0150
            L_0x0148:
                gy3.C87412m.m108603p(r3)
                throw r2
            L_0x014c:
                gy3.C87412m.m108603p(r3)
                throw r2
            L_0x0150:
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r4 = r15.f56692e
                mq3.b r5 = r4.f56671o
                if (r5 == 0) goto L_0x01be
                int r5 = r5.f60959b
                java.lang.String r6 = "reboundInterpolator"
                if (r5 <= 0) goto L_0x019b
                sq3.b r5 = r4.f56657A
                android.view.animation.Interpolator r7 = r4.f56678v
                if (r7 == 0) goto L_0x0197
                mq3.a r4 = r4.getCommonConfig()
                int r4 = r4.f126540b
                android.animation.ValueAnimator r0 = r5.mo35534a(r1, r0, r7, r4)
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r1 = r15.f56692e
                mq3.a r1 = r1.getCommonConfig()
                boolean r1 = r1.f126549k
                if (r1 == 0) goto L_0x018f
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r1 = r15.f56692e
                oq3.b r1 = r1.getContentPlugin()
                if (r1 == 0) goto L_0x018f
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r4 = r15.f56692e
                mq3.b r4 = r4.f56671o
                if (r4 == 0) goto L_0x018b
                int r2 = r4.f60959b
                android.animation.ValueAnimator$AnimatorUpdateListener r2 = r1.mo34214b(r2)
                goto L_0x018f
            L_0x018b:
                gy3.C87412m.m108603p(r3)
                throw r2
            L_0x018f:
                if (r0 == 0) goto L_0x01ca
                if (r2 == 0) goto L_0x01ca
                r0.addUpdateListener(r2)
                goto L_0x01ca
            L_0x0197:
                gy3.C87412m.m108603p(r6)
                throw r2
            L_0x019b:
                if (r5 >= 0) goto L_0x01b1
                sq3.b r3 = r4.f56657A
                android.view.animation.Interpolator r5 = r4.f56678v
                if (r5 == 0) goto L_0x01ad
                mq3.a r2 = r4.getCommonConfig()
                int r2 = r2.f126540b
                r3.mo35534a(r1, r0, r5, r2)
                goto L_0x01ca
            L_0x01ad:
                gy3.C87412m.m108603p(r6)
                throw r2
            L_0x01b1:
                r4.mo26622s(r1, r1)
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r0 = r15.f56692e
                sq3.a r0 = r0.f56667h
                rq3.b r1 = rq3.C22243b.None
                r0.mo35533e(r1)
                goto L_0x01ca
            L_0x01be:
                gy3.C87412m.m108603p(r3)
                throw r2
            L_0x01c2:
                gy3.C87412m.m108603p(r3)
                throw r2
            L_0x01c6:
                gy3.C87412m.m108603p(r3)
                throw r2
            L_0x01ca:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.view.refreshLayout.WxRefreshLayout.C19886b.run():void");
        }
    }

    /* renamed from: com.tencent.mm.view.refreshLayout.WxRefreshLayout$c */
    public static final class C19887c extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ WxRefreshLayout f56696d;

        /* renamed from: e */
        public final /* synthetic */ boolean f56697e;

        public C19887c(WxRefreshLayout wxRefreshLayout, boolean z) {
            this.f56696d = wxRefreshLayout;
            this.f56697e = z;
        }

        public void onAnimationEnd(Animator animator) {
            boolean z = false;
            if (animator != null && animator.getDuration() == 0) {
                z = true;
            }
            if (!z) {
                C21524b bVar = this.f56696d.f56671o;
                if (bVar != null) {
                    bVar.f60977t = System.currentTimeMillis();
                    this.f56696d.f56667h.mo35531c(C22243b.Refreshing);
                    Log.m105924i("WxRefreshLayout", "onRefresh " + this.f56697e);
                    C63318b onSimpleAction = this.f56696d.getOnSimpleAction();
                    if (onSimpleAction != null) {
                        onSimpleAction.mo3374a(this.f56697e);
                    }
                    C21805g headerPlugin = this.f56696d.getHeaderPlugin();
                    if (headerPlugin != null) {
                        WxRefreshLayout wxRefreshLayout = this.f56696d;
                        headerPlugin.mo34228g(wxRefreshLayout, wxRefreshLayout.getHeaderConfig().f60981a, (int) (wxRefreshLayout.getHeaderConfig().f60983c < 10.0f ? ((float) wxRefreshLayout.getHeaderConfig().f60981a) * wxRefreshLayout.getHeaderConfig().f60983c : wxRefreshLayout.getHeaderConfig().f60983c));
                        return;
                    }
                    return;
                }
                C87412m.m108603p("cValues");
                throw null;
            }
        }
    }

    public WxRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C22386a aVar = new C22386a(this);
        this.f56667h = aVar;
        this.f56679w = new MMHandler(Looper.getMainLooper());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        this.f56680x = marginLayoutParams;
        this.f56682z = new C22394f(this, aVar, marginLayoutParams);
        this.f56657A = new C22387b(this, aVar);
        this.f56660D = new int[2];
        this.f56661E = new C107200l(this);
        this.f56662F = new C107203p(this);
        mo26606o(attributeSet);
    }

    /* renamed from: A */
    public C110058f mo26568A(C11723d dVar) {
        C87412m.m108594g(dVar, "header");
        C21805g gVar = this.f56664e;
        if (gVar != null) {
            super.removeView(gVar.getView());
        }
        this.f56664e = dVar;
        getCommonConfig().f126541c = true;
        C21525d headerConfig = getHeaderConfig();
        C63508a aVar = C63508a.f180124c;
        headerConfig.getClass();
        headerConfig.f60982b = aVar;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        C21805g gVar2 = this.f56664e;
        if (gVar2 != null) {
            if (gVar2.getSpinnerStyle().f180137a) {
                super.addView(gVar2.getView(), getChildCount(), marginLayoutParams);
            } else {
                super.addView(gVar2.getView(), 0, marginLayoutParams);
            }
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0193, code lost:
        if (r8 <= r7.f63488h.f63473a.getHeaderConfig().f60981a) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01aa, code lost:
        if (r8 >= (-r7.f63488h.f63473a.getFooterConfig().f174983a)) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x01fc, code lost:
        if (r2.f60959b < 0) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0215, code lost:
        if (mo26618p(getCommonConfig().f126542d) != false) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0241, code lost:
        if (r1.f60959b <= 0) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0080, code lost:
        if (r7.f60979v != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00d8, code lost:
        if (r4.mo26618p(r4.getCommonConfig().f126542d) != false) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x010d, code lost:
        if (r4.mo26618p(r4.getCommonConfig().f126542d) != false) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0127, code lost:
        if (r4.f60959b >= (-r1.f63473a.getFooterConfig().f174983a)) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x013f, code lost:
        if (r4.f60959b > r1.f63473a.getHeaderConfig().f60981a) goto L_0x0146;
     */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0278  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo26569B(float r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = 0
            r2 = 1
            r3 = 0
            int r4 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            if (r4 != 0) goto L_0x000b
            r4 = 1
            goto L_0x000c
        L_0x000b:
            r4 = 0
        L_0x000c:
            java.lang.String r5 = "cValues"
            r6 = 0
            if (r4 == 0) goto L_0x001d
            mq3.b r4 = r0.f56671o
            if (r4 == 0) goto L_0x0019
            int r4 = r4.f60974q
            float r4 = (float) r4
            goto L_0x001f
        L_0x0019:
            gy3.C87412m.m108603p(r5)
            throw r6
        L_0x001d:
            r4 = r17
        L_0x001f:
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 27
            if (r7 <= r8) goto L_0x004a
            oq3.b r7 = r0.f56663d
            if (r7 == 0) goto L_0x004a
            float r8 = r16.getScaleY()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x0035
            r8 = 1
            goto L_0x0036
        L_0x0035:
            r8 = 0
        L_0x0036:
            if (r8 == 0) goto L_0x004a
            android.view.View r7 = r7.getView()
            float r7 = r7.getScaleY()
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x0046
            r7 = 1
            goto L_0x0047
        L_0x0046:
            r7 = 0
        L_0x0047:
            if (r7 == 0) goto L_0x004a
            float r4 = -r4
        L_0x004a:
            float r7 = java.lang.Math.abs(r4)
            mq3.b r8 = r0.f56671o
            if (r8 == 0) goto L_0x0281
            int r9 = r8.f60961d
            float r9 = (float) r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x0280
            if (r8 == 0) goto L_0x027c
            int r7 = r8.f60959b
            float r7 = (float) r7
            float r7 = r7 * r4
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 >= 0) goto L_0x01d2
            sq3.a r7 = r0.f56667h
            boolean r7 = r7.mo35530b()
            if (r7 != 0) goto L_0x0094
            sq3.a r7 = r0.f56667h
            boolean r7 = r7.mo35529a()
            if (r7 != 0) goto L_0x0094
            mq3.b r7 = r0.f56671o
            if (r7 == 0) goto L_0x0090
            int r8 = r7.f60959b
            if (r8 >= 0) goto L_0x0087
            if (r7 == 0) goto L_0x0083
            boolean r7 = r7.f60979v
            if (r7 == 0) goto L_0x0087
            goto L_0x0094
        L_0x0083:
            gy3.C87412m.m108603p(r5)
            throw r6
        L_0x0087:
            sq3.a r7 = r0.f56667h
            rq3.b r7 = r7.f63470b
            boolean r7 = r7.f63049i
            if (r7 == 0) goto L_0x01d2
            return r2
        L_0x0090:
            gy3.C87412m.m108603p(r5)
            throw r6
        L_0x0094:
            sq3.b r1 = r0.f56657A
            r1.getClass()
            sq3.b$b r7 = new sq3.b$b
            r7.<init>(r4)
            sq3.a r4 = r1.f63474b
            rq3.b r4 = r4.f63470b
            boolean r8 = r4.f63048h
            if (r8 == 0) goto L_0x00a8
            goto L_0x01cb
        L_0x00a8:
            mq3.b r8 = r1.f63475c
            if (r8 == 0) goto L_0x01ce
            int r9 = r8.f60959b
            r10 = 10
            if (r9 == 0) goto L_0x01b8
            boolean r4 = r4.f63047g
            if (r4 != 0) goto L_0x00df
            boolean r4 = r8.f60979v
            if (r4 == 0) goto L_0x0146
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r4 = r1.f63473a
            mq3.a r4 = r4.getCommonConfig()
            boolean r4 = r4.f126546h
            if (r4 == 0) goto L_0x0146
            mq3.b r4 = r1.f63475c
            if (r4 == 0) goto L_0x00db
            boolean r4 = r4.f60980w
            if (r4 == 0) goto L_0x0146
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r4 = r1.f63473a
            mq3.a r8 = r4.getCommonConfig()
            boolean r8 = r8.f126542d
            boolean r4 = r4.mo26618p(r8)
            if (r4 == 0) goto L_0x0146
            goto L_0x00df
        L_0x00db:
            gy3.C87412m.m108603p(r5)
            throw r6
        L_0x00df:
            sq3.a r4 = r1.f63474b
            boolean r4 = r4.mo35529a()
            if (r4 != 0) goto L_0x0118
            mq3.b r4 = r1.f63475c
            if (r4 == 0) goto L_0x0114
            boolean r4 = r4.f60979v
            if (r4 == 0) goto L_0x0129
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r4 = r1.f63473a
            mq3.a r4 = r4.getCommonConfig()
            boolean r4 = r4.f126546h
            if (r4 == 0) goto L_0x0129
            mq3.b r4 = r1.f63475c
            if (r4 == 0) goto L_0x0110
            boolean r4 = r4.f60980w
            if (r4 == 0) goto L_0x0129
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r4 = r1.f63473a
            mq3.a r8 = r4.getCommonConfig()
            boolean r8 = r8.f126542d
            boolean r4 = r4.mo26618p(r8)
            if (r4 == 0) goto L_0x0129
            goto L_0x0118
        L_0x0110:
            gy3.C87412m.m108603p(r5)
            throw r6
        L_0x0114:
            gy3.C87412m.m108603p(r5)
            throw r6
        L_0x0118:
            mq3.b r4 = r1.f63475c
            if (r4 == 0) goto L_0x01b4
            int r4 = r4.f60959b
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r8 = r1.f63473a
            mq3.c r8 = r8.getFooterConfig()
            int r8 = r8.f174983a
            int r8 = -r8
            if (r4 < r8) goto L_0x0146
        L_0x0129:
            sq3.a r4 = r1.f63474b
            boolean r4 = r4.mo35530b()
            if (r4 == 0) goto L_0x01b8
            mq3.b r4 = r1.f63475c
            if (r4 == 0) goto L_0x0142
            int r4 = r4.f60959b
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r8 = r1.f63473a
            mq3.d r8 = r8.getHeaderConfig()
            int r8 = r8.f60981a
            if (r4 <= r8) goto L_0x01b8
            goto L_0x0146
        L_0x0142:
            gy3.C87412m.m108603p(r5)
            throw r6
        L_0x0146:
            mq3.b r4 = r1.f63475c
            if (r4 == 0) goto L_0x01b0
            int r4 = r4.f60959b
            float r5 = r7.f63484d
            r8 = r4
        L_0x014f:
            int r9 = r4 * r8
            if (r9 <= 0) goto L_0x01b8
            r9 = 1065017672(0x3f7ae148, float:0.98)
            double r11 = (double) r9
            int r3 = r3 + r2
            int r9 = r3 * 10
            float r9 = (float) r9
            r13 = 1092616192(0x41200000, float:10.0)
            float r9 = r9 / r13
            double r13 = (double) r9
            double r11 = java.lang.Math.pow(r11, r13)
            float r9 = (float) r11
            float r5 = r5 * r9
            float r9 = (float) r10
            r11 = 1065353216(0x3f800000, float:1.0)
            float r9 = r9 * r11
            r12 = 1000(0x3e8, float:1.401E-42)
            float r12 = (float) r12
            float r9 = r9 / r12
            float r9 = r9 * r5
            float r12 = java.lang.Math.abs(r9)
            int r11 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x01ad
            sq3.b r3 = sq3.C22387b.this
            sq3.a r3 = r3.f63474b
            rq3.b r4 = r3.f63470b
            boolean r4 = r4.f63047g
            if (r4 == 0) goto L_0x01cb
            boolean r3 = r3.mo35530b()
            if (r3 == 0) goto L_0x0195
            sq3.b r3 = sq3.C22387b.this
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r3 = r3.f63473a
            mq3.d r3 = r3.getHeaderConfig()
            int r3 = r3.f60981a
            if (r8 > r3) goto L_0x01cb
        L_0x0195:
            sq3.b r3 = sq3.C22387b.this
            sq3.a r3 = r3.f63474b
            boolean r3 = r3.mo35530b()
            if (r3 != 0) goto L_0x01b8
            sq3.b r3 = sq3.C22387b.this
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r3 = r3.f63473a
            mq3.c r3 = r3.getFooterConfig()
            int r3 = r3.f174983a
            int r3 = -r3
            if (r8 >= r3) goto L_0x01b8
            goto L_0x01cb
        L_0x01ad:
            int r9 = (int) r9
            int r8 = r8 + r9
            goto L_0x014f
        L_0x01b0:
            gy3.C87412m.m108603p(r5)
            throw r6
        L_0x01b4:
            gy3.C87412m.m108603p(r5)
            throw r6
        L_0x01b8:
            long r3 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r7.f63486f = r3
            sq3.b r3 = sq3.C22387b.this
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r3 = r3.f63473a
            com.tencent.mm.sdk.platformtools.MMHandler r3 = r3.getMainHandler()
            long r4 = (long) r10
            r3.postDelayed(r7, r4)
            r6 = r7
        L_0x01cb:
            r1.f63476d = r6
            return r2
        L_0x01ce:
            gy3.C87412m.m108603p(r5)
            throw r6
        L_0x01d2:
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 >= 0) goto L_0x0217
            mq3.a r2 = r16.getCommonConfig()
            boolean r2 = r2.f126550l
            if (r2 == 0) goto L_0x01ee
            mq3.a r2 = r16.getCommonConfig()
            boolean r2 = r2.f126542d
            if (r2 != 0) goto L_0x0248
            mq3.a r2 = r16.getCommonConfig()
            boolean r2 = r2.f126551m
            if (r2 != 0) goto L_0x0248
        L_0x01ee:
            sq3.a r2 = r0.f56667h
            boolean r2 = r2.mo35529a()
            if (r2 == 0) goto L_0x0203
            mq3.b r2 = r0.f56671o
            if (r2 == 0) goto L_0x01ff
            int r2 = r2.f60959b
            if (r2 >= 0) goto L_0x0248
            goto L_0x0203
        L_0x01ff:
            gy3.C87412m.m108603p(r5)
            throw r6
        L_0x0203:
            mq3.a r2 = r16.getCommonConfig()
            boolean r2 = r2.f126543e
            if (r2 == 0) goto L_0x0217
            mq3.a r2 = r16.getCommonConfig()
            boolean r2 = r2.f126542d
            boolean r2 = r0.mo26618p(r2)
            if (r2 != 0) goto L_0x0248
        L_0x0217:
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0280
            mq3.a r1 = r16.getCommonConfig()
            boolean r1 = r1.f126550l
            if (r1 == 0) goto L_0x022b
            mq3.a r1 = r16.getCommonConfig()
            boolean r1 = r1.f126541c
            if (r1 != 0) goto L_0x0248
        L_0x022b:
            mq3.a r1 = r16.getCommonConfig()
            boolean r1 = r1.f126551m
            if (r1 != 0) goto L_0x0248
            sq3.a r1 = r0.f56667h
            boolean r1 = r1.mo35530b()
            if (r1 == 0) goto L_0x0280
            mq3.b r1 = r0.f56671o
            if (r1 == 0) goto L_0x0244
            int r1 = r1.f60959b
            if (r1 > 0) goto L_0x0280
            goto L_0x0248
        L_0x0244:
            gy3.C87412m.m108603p(r5)
            throw r6
        L_0x0248:
            mq3.b r1 = r0.f56671o
            if (r1 == 0) goto L_0x0278
            r1.f60975r = r3
            android.widget.Scroller r7 = r0.f56676t
            java.lang.String r1 = "scroller"
            if (r7 == 0) goto L_0x0274
            r8 = 0
            r9 = 0
            r10 = 0
            float r2 = -r4
            int r11 = (int) r2
            r12 = 0
            r13 = 0
            r14 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            r15 = 2147483647(0x7fffffff, float:NaN)
            r7.fling(r8, r9, r10, r11, r12, r13, r14, r15)
            android.widget.Scroller r2 = r0.f56676t
            if (r2 == 0) goto L_0x0270
            r2.computeScrollOffset()
            r16.invalidate()
            goto L_0x0280
        L_0x0270:
            gy3.C87412m.m108603p(r1)
            throw r6
        L_0x0274:
            gy3.C87412m.m108603p(r1)
            throw r6
        L_0x0278:
            gy3.C87412m.m108603p(r5)
            throw r6
        L_0x027c:
            gy3.C87412m.m108603p(r5)
            throw r6
        L_0x0280:
            return r3
        L_0x0281:
            gy3.C87412m.m108603p(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.view.refreshLayout.WxRefreshLayout.mo26569B(float):boolean");
    }

    /* renamed from: a */
    public C110058f mo26570a(boolean z) {
        setNestedScrollingEnabled(z);
        return this;
    }

    /* renamed from: c */
    public final ValueAnimator mo26571c(int i) {
        C22387b bVar = this.f56657A;
        Interpolator interpolator = this.f56678v;
        if (interpolator != null) {
            return bVar.mo35534a(i, 0, interpolator, getCommonConfig().f126540b);
        }
        C87412m.m108603p("reboundInterpolator");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00c8, code lost:
        if (r5.mo26618p(r5.getCommonConfig().f126542d) == false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00f5, code lost:
        if (r3.f63474b.mo35530b() == false) goto L_0x00fc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void computeScroll() {
        /*
            r9 = this;
            android.widget.Scroller r0 = r9.f56676t
            java.lang.String r1 = "scroller"
            r2 = 0
            if (r0 == 0) goto L_0x0152
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L_0x0151
            android.widget.Scroller r0 = r9.f56676t
            if (r0 == 0) goto L_0x014d
            int r0 = r0.getFinalY()
            oq3.b r3 = r9.f56663d
            r4 = 0
            if (r3 == 0) goto L_0x0020
            boolean r3 = r3.mo34216d()
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            oq3.b r5 = r9.f56663d
            if (r5 == 0) goto L_0x002a
            boolean r5 = r5.mo34222k()
            goto L_0x002b
        L_0x002a:
            r5 = 0
        L_0x002b:
            r6 = 1
            java.lang.String r7 = "cValues"
            if (r0 >= 0) goto L_0x0042
            mq3.a r8 = r9.getCommonConfig()
            boolean r8 = r8.f126541c
            if (r8 != 0) goto L_0x0040
            mq3.a r8 = r9.getCommonConfig()
            boolean r8 = r8.f126551m
            if (r8 == 0) goto L_0x0042
        L_0x0040:
            if (r3 != 0) goto L_0x0056
        L_0x0042:
            if (r0 <= 0) goto L_0x013f
            mq3.a r3 = r9.getCommonConfig()
            boolean r3 = r3.f126542d
            if (r3 != 0) goto L_0x0054
            mq3.a r3 = r9.getCommonConfig()
            boolean r3 = r3.f126551m
            if (r3 == 0) goto L_0x013f
        L_0x0054:
            if (r5 == 0) goto L_0x013f
        L_0x0056:
            mq3.b r3 = r9.f56671o
            if (r3 == 0) goto L_0x013b
            boolean r3 = r3.f60975r
            if (r3 == 0) goto L_0x012f
            if (r0 <= 0) goto L_0x006e
            android.widget.Scroller r0 = r9.f56676t
            if (r0 == 0) goto L_0x006a
            float r0 = r0.getCurrVelocity()
            float r0 = -r0
            goto L_0x0076
        L_0x006a:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x006e:
            android.widget.Scroller r0 = r9.f56676t
            if (r0 == 0) goto L_0x012b
            float r0 = r0.getCurrVelocity()
        L_0x0076:
            sq3.b r3 = r9.f56657A
            android.animation.ValueAnimator r5 = r3.f63477e
            if (r5 != 0) goto L_0x012f
            r5 = 0
            int r8 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x009a
            sq3.a r8 = r3.f63474b
            boolean r8 = r8.mo35530b()
            if (r8 == 0) goto L_0x009a
            sq3.b$a r4 = new sq3.b$a
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r5 = r3.f63473a
            mq3.d r5 = r5.getHeaderConfig()
            int r5 = r5.f60981a
            r4.<init>(r0, r5)
            r3.f63476d = r4
            goto L_0x012f
        L_0x009a:
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x010d
            sq3.a r5 = r3.f63474b
            boolean r5 = r5.mo35529a()
            if (r5 != 0) goto L_0x00fc
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r5 = r3.f63473a
            mq3.a r5 = r5.getCommonConfig()
            boolean r5 = r5.f126546h
            if (r5 == 0) goto L_0x00cf
            mq3.b r5 = r3.f63475c
            if (r5 == 0) goto L_0x00cb
            boolean r8 = r5.f60979v
            if (r8 == 0) goto L_0x00cf
            boolean r5 = r5.f60980w
            if (r5 == 0) goto L_0x00cf
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r5 = r3.f63473a
            mq3.a r8 = r5.getCommonConfig()
            boolean r8 = r8.f126542d
            boolean r5 = r5.mo26618p(r8)
            if (r5 != 0) goto L_0x00fc
            goto L_0x00cf
        L_0x00cb:
            gy3.C87412m.m108603p(r7)
            throw r2
        L_0x00cf:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r5 = r3.f63473a
            mq3.a r5 = r5.getCommonConfig()
            boolean r5 = r5.f126543e
            if (r5 == 0) goto L_0x010d
            mq3.b r5 = r3.f63475c
            if (r5 == 0) goto L_0x00f8
            boolean r5 = r5.f60979v
            if (r5 != 0) goto L_0x010d
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r5 = r3.f63473a
            mq3.a r8 = r5.getCommonConfig()
            boolean r8 = r8.f126542d
            boolean r5 = r5.mo26618p(r8)
            if (r5 == 0) goto L_0x010d
            sq3.a r5 = r3.f63474b
            boolean r5 = r5.mo35530b()
            if (r5 != 0) goto L_0x010d
            goto L_0x00fc
        L_0x00f8:
            gy3.C87412m.m108603p(r7)
            throw r2
        L_0x00fc:
            sq3.b$a r4 = new sq3.b$a
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r5 = r3.f63473a
            mq3.c r5 = r5.getFooterConfig()
            int r5 = r5.f174983a
            int r5 = -r5
            r4.<init>(r0, r5)
            r3.f63476d = r4
            goto L_0x012f
        L_0x010d:
            mq3.b r5 = r3.f63475c
            if (r5 == 0) goto L_0x0127
            int r5 = r5.f60959b
            if (r5 != 0) goto L_0x012f
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r5 = r3.f63473a
            mq3.a r5 = r5.getCommonConfig()
            boolean r5 = r5.f126550l
            if (r5 == 0) goto L_0x012f
            sq3.b$a r5 = new sq3.b$a
            r5.<init>(r0, r4)
            r3.f63476d = r5
            goto L_0x012f
        L_0x0127:
            gy3.C87412m.m108603p(r7)
            throw r2
        L_0x012b:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x012f:
            android.widget.Scroller r0 = r9.f56676t
            if (r0 == 0) goto L_0x0137
            r0.forceFinished(r6)
            goto L_0x0151
        L_0x0137:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x013b:
            gy3.C87412m.m108603p(r7)
            throw r2
        L_0x013f:
            mq3.b r0 = r9.f56671o
            if (r0 == 0) goto L_0x0149
            r0.f60975r = r6
            r9.invalidate()
            goto L_0x0151
        L_0x0149:
            gy3.C87412m.m108603p(r7)
            throw r2
        L_0x014d:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x0151:
            return
        L_0x0152:
            gy3.C87412m.m108603p(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.view.refreshLayout.WxRefreshLayout.computeScroll():void");
    }

    /* renamed from: d */
    public boolean mo26573d() {
        C21524b bVar = this.f56671o;
        if (bVar != null) {
            return mo26579e(bVar.f60978u ? 0 : 400, getCommonConfig().f126540b, (getHeaderConfig().f60983c + getHeaderConfig().f60984d) / ((float) 2), true);
        }
        C87412m.m108603p("cValues");
        throw null;
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f56661E.mo157664a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f56661E.mo157665b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f56661E.mo157666c(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f56661E.mo157668e(i, i2, i3, i4, iArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:220:0x029a, code lost:
        if (r3.f60963f == false) goto L_0x02a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x02a5, code lost:
        if (r2.mo34222k() != false) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0349, code lost:
        if (r3.f60964g >= 0) goto L_0x0350;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x035a, code lost:
        if (r3.f60964g > 0) goto L_0x0361;
     */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x0499  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            java.lang.String r2 = "event"
            gy3.C87412m.m108594g(r1, r2)
            int r7 = r26.getActionMasked()
            r2 = 6
            r11 = 0
            r12 = 1
            if (r7 != r2) goto L_0x0014
            r3 = 1
            goto L_0x0015
        L_0x0014:
            r3 = 0
        L_0x0015:
            if (r3 == 0) goto L_0x001c
            int r4 = r26.getActionIndex()
            goto L_0x001d
        L_0x001c:
            r4 = -1
        L_0x001d:
            int r5 = r26.getPointerCount()
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x0025:
            if (r8 >= r5) goto L_0x0036
            if (r4 == r8) goto L_0x0033
            float r13 = r1.getX(r8)
            float r9 = r9 + r13
            float r13 = r1.getY(r8)
            float r10 = r10 + r13
        L_0x0033:
            int r8 = r8 + 1
            goto L_0x0025
        L_0x0036:
            if (r3 == 0) goto L_0x003a
            int r5 = r5 + -1
        L_0x003a:
            float r3 = (float) r5
            float r9 = r9 / r3
            float r10 = r10 / r3
            java.lang.String r13 = "cValues"
            r14 = 0
            if (r7 == r2) goto L_0x0045
            r2 = 5
            if (r7 != r2) goto L_0x0063
        L_0x0045:
            mq3.b r2 = r0.f56671o
            if (r2 == 0) goto L_0x05f7
            boolean r3 = r2.f60971n
            if (r3 == 0) goto L_0x0063
            if (r2 == 0) goto L_0x005f
            float r3 = r2.f60967j
            if (r2 == 0) goto L_0x005b
            float r4 = r2.f60969l
            float r4 = r10 - r4
            float r3 = r3 + r4
            r2.f60967j = r3
            goto L_0x0063
        L_0x005b:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x005f:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x0063:
            mq3.b r2 = r0.f56671o
            if (r2 == 0) goto L_0x05f3
            r2.f60968k = r9
            if (r2 == 0) goto L_0x05ef
            r2.f60969l = r10
            boolean r2 = r0.f56659C
            r3 = 2
            if (r2 == 0) goto L_0x00ee
            int r2 = r0.f56658B
            boolean r1 = super.dispatchTouchEvent(r26)
            if (r7 != r3) goto L_0x00ed
            int r3 = r0.f56658B
            if (r2 != r3) goto L_0x00ed
            mq3.b r2 = r0.f56671o
            if (r2 == 0) goto L_0x00e9
            float r2 = r2.f60968k
            int r2 = (int) r2
            int r3 = r25.getWidth()
            mq3.b r4 = r0.f56671o
            if (r4 == 0) goto L_0x00e5
            float r4 = r4.f60968k
            if (r3 != 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r12 = r3
        L_0x0093:
            float r5 = (float) r12
            float r4 = r4 / r5
            mq3.a r5 = r25.getCommonConfig()
            boolean r5 = r5.f126541c
            boolean r5 = r0.mo26618p(r5)
            if (r5 == 0) goto L_0x00bd
            mq3.b r5 = r0.f56671o
            if (r5 == 0) goto L_0x00b9
            int r5 = r5.f60959b
            if (r5 <= 0) goto L_0x00bd
            oq3.g r5 = r0.f56664e
            if (r5 == 0) goto L_0x00ed
            boolean r6 = r5.mo34227f()
            if (r6 == 0) goto L_0x00b6
            r5.mo34226e(r4, r2, r3)
        L_0x00b6:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x00ed
        L_0x00b9:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x00bd:
            mq3.a r5 = r25.getCommonConfig()
            boolean r5 = r5.f126542d
            boolean r5 = r0.mo26618p(r5)
            if (r5 == 0) goto L_0x00ed
            mq3.b r5 = r0.f56671o
            if (r5 == 0) goto L_0x00e1
            int r5 = r5.f60959b
            if (r5 >= 0) goto L_0x00ed
            oq3.g r5 = r0.f56665f
            if (r5 == 0) goto L_0x00ed
            boolean r6 = r5.mo34227f()
            if (r6 == 0) goto L_0x00de
            r5.mo34226e(r4, r2, r3)
        L_0x00de:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x00ed
        L_0x00e1:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x00e5:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x00e9:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x00ed:
            return r1
        L_0x00ee:
            boolean r2 = r25.isEnabled()
            if (r2 == 0) goto L_0x05ea
            mq3.a r2 = r25.getCommonConfig()
            boolean r2 = r2.f126541c
            if (r2 != 0) goto L_0x010e
            mq3.a r2 = r25.getCommonConfig()
            boolean r2 = r2.f126542d
            if (r2 != 0) goto L_0x010e
            mq3.a r2 = r25.getCommonConfig()
            boolean r2 = r2.f126551m
            if (r2 != 0) goto L_0x010e
            goto L_0x05ea
        L_0x010e:
            sq3.b r2 = r0.f56657A
            boolean r2 = r2.mo35536c(r7)
            if (r2 != 0) goto L_0x05e9
            sq3.a r2 = r0.f56667h
            rq3.b r4 = r2.f63470b
            boolean r4 = r4.f63048h
            if (r4 != 0) goto L_0x05e9
            boolean r2 = r2.mo35529a()
            if (r2 == 0) goto L_0x012c
            mq3.a r2 = r25.getCommonConfig()
            boolean r2 = r2.f126555q
            if (r2 != 0) goto L_0x05e9
        L_0x012c:
            sq3.a r2 = r0.f56667h
            boolean r2 = r2.mo35530b()
            if (r2 == 0) goto L_0x013e
            mq3.a r2 = r25.getCommonConfig()
            boolean r2 = r2.f126554p
            if (r2 == 0) goto L_0x013e
            goto L_0x05e9
        L_0x013e:
            java.lang.String r2 = "velocityTracker"
            if (r7 == 0) goto L_0x0576
            if (r7 == r12) goto L_0x04e8
            r4 = 3
            if (r7 == r3) goto L_0x01a3
            if (r7 == r4) goto L_0x014c
            goto L_0x0555
        L_0x014c:
            android.view.VelocityTracker r3 = r0.f56677u
            if (r3 == 0) goto L_0x019f
            r3.clear()
            mq3.b r2 = r0.f56671o
            if (r2 == 0) goto L_0x019b
            r2.f60970m = r11
            android.view.MotionEvent r2 = r0.f56681y
            if (r2 == 0) goto L_0x0181
            r2.recycle()
            r0.f56681y = r14
            long r5 = r26.getEventTime()
            mq3.b r2 = r0.f56671o
            if (r2 == 0) goto L_0x017d
            float r8 = r2.f60966i
            r2 = 0
            r3 = r5
            r9 = r10
            r10 = r2
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            super.dispatchTouchEvent(r2)
            r2.recycle()
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0181
        L_0x017d:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x0181:
            sq3.f r2 = r0.f56682z
            r2.mo35543b()
            mq3.b r2 = r0.f56671o
            if (r2 == 0) goto L_0x0197
            boolean r3 = r2.f60971n
            if (r3 == 0) goto L_0x0555
            if (r2 == 0) goto L_0x0193
            r2.f60971n = r11
            return r12
        L_0x0193:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x0197:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x019b:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x019f:
            gy3.C87412m.m108603p(r2)
            throw r14
        L_0x01a3:
            mq3.b r5 = r0.f56671o
            if (r5 == 0) goto L_0x04e4
            float r7 = r5.f60966i
            float r9 = r9 - r7
            if (r5 == 0) goto L_0x04e0
            float r5 = r5.f60967j
            float r5 = r10 - r5
            android.view.VelocityTracker r7 = r0.f56677u
            if (r7 == 0) goto L_0x04dc
            r7.addMovement(r1)
            oq3.b r2 = r0.f56663d
            if (r2 == 0) goto L_0x0555
            mq3.b r7 = r0.f56671o
            if (r7 == 0) goto L_0x04d8
            boolean r8 = r7.f60971n
            if (r8 != 0) goto L_0x032d
            if (r7 == 0) goto L_0x0329
            boolean r8 = r7.f60973p
            if (r8 != 0) goto L_0x032d
            if (r7 == 0) goto L_0x0325
            int r8 = r7.f60970m
            if (r8 == r12) goto L_0x032d
            if (r7 == 0) goto L_0x0321
            if (r8 == r3) goto L_0x0228
            float r7 = java.lang.Math.abs(r5)
            mq3.b r8 = r0.f56671o
            if (r8 == 0) goto L_0x0224
            int r8 = r8.f60960c
            float r8 = (float) r8
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 < 0) goto L_0x01ef
            float r7 = java.lang.Math.abs(r9)
            float r8 = java.lang.Math.abs(r5)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x01ef
            goto L_0x0228
        L_0x01ef:
            float r7 = java.lang.Math.abs(r9)
            mq3.b r8 = r0.f56671o
            if (r8 == 0) goto L_0x0220
            int r8 = r8.f60960c
            float r8 = (float) r8
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 < 0) goto L_0x032d
            float r7 = java.lang.Math.abs(r9)
            float r8 = java.lang.Math.abs(r5)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x032d
            mq3.b r7 = r0.f56671o
            if (r7 == 0) goto L_0x021c
            int r8 = r7.f60970m
            if (r8 == r3) goto L_0x032d
            if (r7 == 0) goto L_0x0218
            r7.f60970m = r12
            goto L_0x032d
        L_0x0218:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x021c:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x0220:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x0224:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x0228:
            mq3.b r7 = r0.f56671o
            if (r7 == 0) goto L_0x031d
            r7.f60970m = r3
            int r3 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x0270
            if (r7 == 0) goto L_0x026c
            int r3 = r7.f60959b
            if (r3 < 0) goto L_0x024e
            mq3.a r3 = r25.getCommonConfig()
            boolean r3 = r3.f126551m
            if (r3 != 0) goto L_0x0248
            mq3.a r3 = r25.getCommonConfig()
            boolean r3 = r3.f126541c
            if (r3 == 0) goto L_0x0270
        L_0x0248:
            boolean r3 = r2.mo34216d()
            if (r3 == 0) goto L_0x0270
        L_0x024e:
            mq3.b r3 = r0.f56671o
            if (r3 == 0) goto L_0x0268
            r3.f60971n = r12
            if (r3 == 0) goto L_0x0264
            if (r3 == 0) goto L_0x0260
            int r7 = r3.f60960c
            float r7 = (float) r7
            float r7 = r10 - r7
            r3.f60967j = r7
            goto L_0x02c8
        L_0x0260:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x0264:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x0268:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x026c:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x0270:
            int r3 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x02c8
            mq3.b r3 = r0.f56671o
            if (r3 == 0) goto L_0x02c4
            int r3 = r3.f60959b
            if (r3 > 0) goto L_0x02a7
            mq3.a r3 = r25.getCommonConfig()
            boolean r3 = r3.f126551m
            if (r3 != 0) goto L_0x028c
            mq3.a r3 = r25.getCommonConfig()
            boolean r3 = r3.f126542d
            if (r3 == 0) goto L_0x02c8
        L_0x028c:
            sq3.a r3 = r0.f56667h
            boolean r3 = r3.mo35529a()
            if (r3 == 0) goto L_0x02a1
            mq3.b r3 = r0.f56671o
            if (r3 == 0) goto L_0x029d
            boolean r3 = r3.f60963f
            if (r3 != 0) goto L_0x02a7
            goto L_0x02a1
        L_0x029d:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x02a1:
            boolean r3 = r2.mo34222k()
            if (r3 == 0) goto L_0x02c8
        L_0x02a7:
            mq3.b r3 = r0.f56671o
            if (r3 == 0) goto L_0x02c0
            r3.f60971n = r12
            if (r3 == 0) goto L_0x02bc
            if (r3 == 0) goto L_0x02b8
            int r7 = r3.f60960c
            float r7 = (float) r7
            float r7 = r7 + r10
            r3.f60967j = r7
            goto L_0x02c8
        L_0x02b8:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x02bc:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x02c0:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x02c4:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x02c8:
            mq3.b r3 = r0.f56671o
            if (r3 == 0) goto L_0x0319
            boolean r7 = r3.f60971n
            if (r7 == 0) goto L_0x032d
            if (r3 == 0) goto L_0x0315
            float r5 = r3.f60967j
            float r5 = r10 - r5
            if (r3 == 0) goto L_0x0311
            boolean r3 = r3.f60972o
            if (r3 == 0) goto L_0x02e2
            r1.setAction(r4)
            super.dispatchTouchEvent(r26)
        L_0x02e2:
            sq3.a r3 = r0.f56667h
            mq3.b r7 = r0.f56671o
            if (r7 == 0) goto L_0x030d
            int r8 = r7.f60959b
            if (r8 > 0) goto L_0x02fc
            if (r7 == 0) goto L_0x02f8
            if (r8 != 0) goto L_0x02f5
            int r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x02f5
            goto L_0x02fc
        L_0x02f5:
            rq3.b r7 = rq3.C22243b.PullUpToLoad
            goto L_0x02fe
        L_0x02f8:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x02fc:
            rq3.b r7 = rq3.C22243b.PullDownToRefresh
        L_0x02fe:
            r3.mo35533e(r7)
            android.view.ViewParent r3 = r25.getParent()
            boolean r7 = r3 instanceof android.view.ViewGroup
            if (r7 == 0) goto L_0x032d
            r3.requestDisallowInterceptTouchEvent(r12)
            goto L_0x032d
        L_0x030d:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x0311:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x0315:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x0319:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x031d:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x0321:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x0325:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x0329:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x032d:
            mq3.b r3 = r0.f56671o
            if (r3 == 0) goto L_0x04d4
            boolean r7 = r3.f60971n
            if (r7 == 0) goto L_0x04a6
            int r7 = (int) r5
            if (r3 == 0) goto L_0x04a2
            int r8 = r3.f60965h
            int r7 = r7 + r8
            sq3.a r8 = r0.f56667h
            rq3.b r8 = r8.f63471c
            boolean r15 = r8.f63044d
            if (r15 == 0) goto L_0x0350
            if (r7 < 0) goto L_0x0361
            if (r3 == 0) goto L_0x034c
            int r15 = r3.f60964g
            if (r15 < 0) goto L_0x0361
            goto L_0x0350
        L_0x034c:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x0350:
            boolean r8 = r8.f63045e
            if (r8 == 0) goto L_0x049d
            if (r7 > 0) goto L_0x0361
            if (r3 == 0) goto L_0x035d
            int r8 = r3.f60964g
            if (r8 <= 0) goto L_0x049d
            goto L_0x0361
        L_0x035d:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x0361:
            if (r3 == 0) goto L_0x0499
            r3.f60964g = r7
            long r23 = r26.getEventTime()
            android.view.MotionEvent r1 = r0.f56681y
            if (r1 != 0) goto L_0x0395
            r19 = 0
            mq3.b r1 = r0.f56671o
            if (r1 == 0) goto L_0x0391
            float r3 = r1.f60966i
            float r20 = r3 + r9
            if (r1 == 0) goto L_0x038d
            float r1 = r1.f60967j
            r22 = 0
            r15 = r23
            r17 = r23
            r21 = r1
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r15, r17, r19, r20, r21, r22)
            r0.f56681y = r1
            super.dispatchTouchEvent(r1)
            goto L_0x0395
        L_0x038d:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x0391:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x0395:
            r19 = 2
            mq3.b r1 = r0.f56671o
            if (r1 == 0) goto L_0x0495
            float r3 = r1.f60966i
            float r20 = r3 + r9
            if (r1 == 0) goto L_0x0491
            float r1 = r1.f60967j
            float r3 = (float) r7
            float r21 = r1 + r3
            r22 = 0
            r15 = r23
            r17 = r23
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r15, r17, r19, r20, r21, r22)
            super.dispatchTouchEvent(r1)
            mq3.b r3 = r0.f56671o
            if (r3 == 0) goto L_0x048d
            boolean r8 = r3.f60963f
            if (r8 == 0) goto L_0x03db
            if (r3 == 0) goto L_0x03d7
            int r8 = r3.f60960c
            float r8 = (float) r8
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x03db
            if (r3 == 0) goto L_0x03d3
            int r5 = r3.f60959b
            if (r5 >= 0) goto L_0x03db
            if (r3 == 0) goto L_0x03cf
            r3.f60963f = r11
            goto L_0x03db
        L_0x03cf:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x03d3:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x03d7:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x03db:
            if (r7 <= 0) goto L_0x041b
            mq3.a r3 = r25.getCommonConfig()
            boolean r3 = r3.f126551m
            if (r3 != 0) goto L_0x03ed
            mq3.a r3 = r25.getCommonConfig()
            boolean r3 = r3.f126541c
            if (r3 == 0) goto L_0x041b
        L_0x03ed:
            boolean r3 = r2.mo34216d()
            if (r3 == 0) goto L_0x041b
            mq3.b r2 = r0.f56671o
            if (r2 == 0) goto L_0x0417
            r2.f60969l = r10
            if (r2 == 0) goto L_0x0413
            if (r2 == 0) goto L_0x040f
            r2.f60967j = r10
            if (r2 == 0) goto L_0x040b
            r2.f60965h = r11
            sq3.a r2 = r0.f56667h
            rq3.b r3 = rq3.C22243b.PullDownToRefresh
            r2.mo35533e(r3)
            goto L_0x045c
        L_0x040b:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x040f:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x0413:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x0417:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x041b:
            if (r7 >= 0) goto L_0x045b
            mq3.a r3 = r25.getCommonConfig()
            boolean r3 = r3.f126551m
            if (r3 != 0) goto L_0x042d
            mq3.a r3 = r25.getCommonConfig()
            boolean r3 = r3.f126542d
            if (r3 == 0) goto L_0x045b
        L_0x042d:
            boolean r2 = r2.mo34222k()
            if (r2 == 0) goto L_0x045b
            mq3.b r2 = r0.f56671o
            if (r2 == 0) goto L_0x0457
            r2.f60969l = r10
            if (r2 == 0) goto L_0x0453
            if (r2 == 0) goto L_0x044f
            r2.f60967j = r10
            if (r2 == 0) goto L_0x044b
            r2.f60965h = r11
            sq3.a r2 = r0.f56667h
            rq3.b r3 = rq3.C22243b.PullUpToLoad
            r2.mo35533e(r3)
            goto L_0x045c
        L_0x044b:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x044f:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x0453:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x0457:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x045b:
            r11 = r7
        L_0x045c:
            sq3.a r2 = r0.f56667h
            rq3.b r2 = r2.f63471c
            boolean r3 = r2.f63044d
            if (r3 == 0) goto L_0x0466
            if (r11 < 0) goto L_0x046c
        L_0x0466:
            boolean r2 = r2.f63045e
            if (r2 == 0) goto L_0x047c
            if (r11 <= 0) goto L_0x047c
        L_0x046c:
            mq3.b r1 = r0.f56671o
            if (r1 == 0) goto L_0x0478
            int r1 = r1.f60959b
            if (r1 == 0) goto L_0x0477
            r0.mo26638t(r6)
        L_0x0477:
            return r12
        L_0x0478:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x047c:
            android.view.MotionEvent r2 = r0.f56681y
            if (r2 == 0) goto L_0x0488
            r0.f56681y = r14
            r1.setAction(r4)
            super.dispatchTouchEvent(r1)
        L_0x0488:
            r1.recycle()
            r7 = r11
            goto L_0x049d
        L_0x048d:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x0491:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x0495:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x0499:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x049d:
            float r1 = (float) r7
            r0.mo26638t(r1)
            return r12
        L_0x04a2:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x04a6:
            if (r3 == 0) goto L_0x04d0
            boolean r2 = r3.f60963f
            if (r2 == 0) goto L_0x04cc
            if (r3 == 0) goto L_0x04c8
            int r2 = r3.f60960c
            float r2 = (float) r2
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x04cc
            if (r3 == 0) goto L_0x04c4
            int r2 = r3.f60959b
            if (r2 >= 0) goto L_0x04cc
            if (r3 == 0) goto L_0x04c0
            r3.f60963f = r11
            goto L_0x04cc
        L_0x04c0:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x04c4:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x04c8:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x04cc:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0555
        L_0x04d0:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x04d4:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x04d8:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x04dc:
            gy3.C87412m.m108603p(r2)
            throw r14
        L_0x04e0:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x04e4:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x04e8:
            android.view.VelocityTracker r3 = r0.f56677u
            if (r3 == 0) goto L_0x0572
            r3.addMovement(r1)
            android.view.VelocityTracker r3 = r0.f56677u
            if (r3 == 0) goto L_0x056e
            r4 = 1000(0x3e8, float:1.401E-42)
            mq3.b r5 = r0.f56671o
            if (r5 == 0) goto L_0x056a
            int r5 = r5.f60962e
            float r5 = (float) r5
            r3.computeCurrentVelocity(r4, r5)
            mq3.b r3 = r0.f56671o
            if (r3 == 0) goto L_0x0566
            android.view.VelocityTracker r4 = r0.f56677u
            if (r4 == 0) goto L_0x0562
            float r2 = r4.getYVelocity()
            int r2 = (int) r2
            r3.f60974q = r2
            r0.mo26569B(r6)
            mq3.b r2 = r0.f56671o
            if (r2 == 0) goto L_0x055e
            r2.f60970m = r11
            android.view.MotionEvent r2 = r0.f56681y
            if (r2 == 0) goto L_0x053f
            r2.recycle()
            r0.f56681y = r14
            long r5 = r26.getEventTime()
            mq3.b r2 = r0.f56671o
            if (r2 == 0) goto L_0x053b
            float r8 = r2.f60966i
            r2 = 0
            r3 = r5
            r9 = r10
            r10 = r2
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            super.dispatchTouchEvent(r2)
            r2.recycle()
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x053f
        L_0x053b:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x053f:
            sq3.f r2 = r0.f56682z
            r2.mo35543b()
            mq3.b r2 = r0.f56671o
            if (r2 == 0) goto L_0x055a
            boolean r3 = r2.f60971n
            if (r3 == 0) goto L_0x0555
            if (r2 == 0) goto L_0x0551
            r2.f60971n = r11
            return r12
        L_0x0551:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x0555:
            boolean r1 = super.dispatchTouchEvent(r26)
            return r1
        L_0x055a:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x055e:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x0562:
            gy3.C87412m.m108603p(r2)
            throw r14
        L_0x0566:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x056a:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x056e:
            gy3.C87412m.m108603p(r2)
            throw r14
        L_0x0572:
            gy3.C87412m.m108603p(r2)
            throw r14
        L_0x0576:
            mq3.b r3 = r0.f56671o
            if (r3 == 0) goto L_0x05e5
            r3.f60974q = r11
            android.view.VelocityTracker r3 = r0.f56677u
            if (r3 == 0) goto L_0x05e1
            r3.addMovement(r1)
            android.widget.Scroller r2 = r0.f56676t
            if (r2 == 0) goto L_0x05da
            r2.forceFinished(r12)
            mq3.b r2 = r0.f56671o
            if (r2 == 0) goto L_0x05d6
            r2.f60966i = r9
            if (r2 == 0) goto L_0x05d2
            r2.f60967j = r10
            if (r2 == 0) goto L_0x05ce
            r2.f60964g = r11
            if (r2 == 0) goto L_0x05ca
            if (r2 == 0) goto L_0x05c6
            int r3 = r2.f60959b
            r2.f60965h = r3
            if (r2 == 0) goto L_0x05c2
            r2.f60971n = r11
            if (r2 == 0) goto L_0x05be
            r2.f60973p = r11
            if (r2 == 0) goto L_0x05ba
            boolean r3 = super.dispatchTouchEvent(r26)
            r2.f60972o = r3
            oq3.b r2 = r0.f56663d
            if (r2 == 0) goto L_0x05b9
            r2.mo34213a(r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x05b9:
            return r12
        L_0x05ba:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x05be:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x05c2:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x05c6:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x05ca:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x05ce:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x05d2:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x05d6:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x05da:
            java.lang.String r1 = "scroller"
            gy3.C87412m.m108603p(r1)
            throw r14
        L_0x05e1:
            gy3.C87412m.m108603p(r2)
            throw r14
        L_0x05e5:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x05e9:
            return r11
        L_0x05ea:
            boolean r1 = super.dispatchTouchEvent(r26)
            return r1
        L_0x05ef:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x05f3:
            gy3.C87412m.m108603p(r13)
            throw r14
        L_0x05f7:
            gy3.C87412m.m108603p(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.view.refreshLayout.WxRefreshLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: e */
    public final boolean mo26579e(int i, int i2, float f, boolean z) {
        if (!(this.f56667h.f63470b == C22243b.None) || !mo26618p(getCommonConfig().f126541c)) {
            return false;
        }
        C19883a aVar = new C19883a(this, f, i2, z);
        this.f56667h.mo35532d(C22243b.Refreshing);
        if (i > 0) {
            this.f56679w.postDelayed(aVar, (long) i);
            return true;
        }
        aVar.run();
        return true;
    }

    /* renamed from: f */
    public C110058f mo26580f(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        C21524b bVar = this.f56671o;
        if (bVar != null) {
            int min = z ? Math.min(Math.max(0, 300 - ((int) (currentTimeMillis - bVar.f60977t))), 300) << 16 : 0;
            int i = min >> 16;
            int i2 = (min << 16) >> 16;
            C21456a aVar = new C21456a(this, i, false, z);
            if (i2 > 0) {
                this.f56679w.postDelayed(aVar, (long) i2);
            } else {
                aVar.run();
            }
            return this;
        }
        C87412m.m108603p("cValues");
        throw null;
    }

    public final C22387b getAnimHelper() {
        return this.f56657A;
    }

    public final C47093a getCommonConfig() {
        C47093a aVar = this.f56668i;
        if (aVar != null) {
            return aVar;
        }
        C87412m.m108603p("commonConfig");
        throw null;
    }

    public final C21803b getContentPlugin() {
        return this.f56663d;
    }

    public final C21803b getContentView() {
        return this.f56663d;
    }

    public final C61566c getFooterConfig() {
        C61566c cVar = this.f56670n;
        if (cVar != null) {
            return cVar;
        }
        C87412m.m108603p("footerConfig");
        throw null;
    }

    public final C21805g getFooterPlugin() {
        return this.f56665f;
    }

    public final C21525d getHeaderConfig() {
        C21525d dVar = this.f56669j;
        if (dVar != null) {
            return dVar;
        }
        C87412m.m108603p("headerConfig");
        throw null;
    }

    public final C21805g getHeaderPlugin() {
        return this.f56664e;
    }

    public final Interpolator getInterpolator() {
        Interpolator interpolator = this.f56678v;
        if (interpolator != null) {
            return interpolator;
        }
        C87412m.m108603p("reboundInterpolator");
        throw null;
    }

    public ViewGroup getLayout() {
        return this;
    }

    public C21804c getLoadMoreFooter() {
        C21805g gVar = this.f56665f;
        if (gVar instanceof C21804c) {
            return (C21804c) gVar;
        }
        return null;
    }

    public final MMHandler getMainHandler() {
        return this.f56679w;
    }

    public int getNestedScrollAxes() {
        C107203p pVar = this.f56662F;
        return pVar.f320806b | pVar.f320805a;
    }

    public final C63319c getOnMultiAction() {
        return this.f56673q;
    }

    public final C63318b getOnSimpleAction() {
        return this.f56672p;
    }

    public final C21802a getOverScrollCallback() {
        return this.f56674r;
    }

    public C11723d getRefreshHeader() {
        C21805g gVar = this.f56664e;
        if (gVar instanceof C11723d) {
            return (C11723d) gVar;
        }
        return null;
    }

    public final C110059h getScrollBoundaryDecider() {
        return this.f56675s;
    }

    public C22243b getState() {
        return this.f56667h.f63470b;
    }

    /* renamed from: h */
    public C110058f mo26600h() {
        long currentTimeMillis = System.currentTimeMillis();
        C21524b bVar = this.f56671o;
        if (bVar != null) {
            int min = Math.min(Math.max(0, 300 - ((int) (currentTimeMillis - bVar.f60977t))), 300) << 16;
            int i = min >> 16;
            int i2 = (min << 16) >> 16;
            C21456a aVar = new C21456a(this, i, true, true);
            if (i2 > 0) {
                this.f56679w.postDelayed(aVar, (long) i2);
            } else {
                aVar.run();
            }
            return this;
        }
        C87412m.m108603p("cValues");
        throw null;
    }

    public boolean hasNestedScrollingParent() {
        return this.f56661E.mo157671h(0);
    }

    public boolean isNestedScrollingEnabled() {
        return getCommonConfig().f126553o && (getCommonConfig().f126551m || getCommonConfig().f126541c || getCommonConfig().f126542d);
    }

    /* renamed from: k */
    public final C110058f mo26603k(int i, boolean z, boolean z2) {
        int i2 = i >> 16;
        int i3 = (i << 16) >> 16;
        C19886b bVar = new C19886b(this, i2, z2, z);
        if (i3 > 0) {
            this.f56679w.postDelayed(bVar, (long) i3);
        } else {
            bVar.run();
        }
        return this;
    }

    /* renamed from: l */
    public C110058f mo26604l(boolean z) {
        if (z) {
            long currentTimeMillis = System.currentTimeMillis();
            C21524b bVar = this.f56671o;
            if (bVar != null) {
                mo26603k(Math.min(Math.max(0, 300 - ((int) (currentTimeMillis - bVar.f60977t))), 300) << 16, true, false);
            } else {
                C87412m.m108603p("cValues");
                throw null;
            }
        } else {
            mo26603k(0, false, false);
        }
        return this;
    }

    /* renamed from: m */
    public C110058f mo26605m() {
        long currentTimeMillis = System.currentTimeMillis();
        C21524b bVar = this.f56671o;
        if (bVar != null) {
            mo26603k(Math.min(Math.max(0, 300 - ((int) (currentTimeMillis - bVar.f60977t))), 300) << 16, true, true);
            return this;
        }
        C87412m.m108603p("cValues");
        throw null;
    }

    /* renamed from: o */
    public final void mo26606o(AttributeSet attributeSet) {
        this.f56676t = new Scroller(getContext());
        VelocityTracker obtain = VelocityTracker.obtain();
        C87412m.m108593f(obtain, "obtain()");
        this.f56677u = obtain;
        this.f56678v = new C118126a(0);
        C21524b bVar = new C21524b();
        Context context = getContext();
        C87412m.m108593f(context, "context");
        bVar.f60958a = context.getResources().getDisplayMetrics().heightPixels;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        bVar.f60960c = viewConfiguration.getScaledTouchSlop();
        bVar.f60961d = viewConfiguration.getScaledMinimumFlingVelocity();
        bVar.f60962e = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f56671o = bVar;
        C22386a aVar = this.f56667h;
        aVar.getClass();
        aVar.f63472d = bVar;
        C22387b bVar2 = this.f56657A;
        C21524b bVar3 = this.f56671o;
        if (bVar3 != null) {
            bVar2.getClass();
            bVar2.f63475c = bVar3;
            C22394f fVar = this.f56682z;
            C21524b bVar4 = this.f56671o;
            if (bVar4 != null) {
                fVar.getClass();
                fVar.f63494c = bVar4;
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C77853a.f226851F);
                C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…tyleable.WxRefreshLayout)");
                if (!obtainStyledAttributes.hasValue(1)) {
                    super.setClipToPadding(false);
                }
                if (!obtainStyledAttributes.hasValue(0)) {
                    super.setClipChildren(false);
                }
                C47093a aVar2 = new C47093a();
                aVar2.f126539a = obtainStyledAttributes.getFloat(4, aVar2.f126539a);
                aVar2.f126541c = obtainStyledAttributes.getBoolean(15, aVar2.f126541c);
                aVar2.f126540b = obtainStyledAttributes.getInt(24, aVar2.f126540b);
                aVar2.f126542d = obtainStyledAttributes.getBoolean(9, aVar2.f126542d);
                aVar2.f126543e = obtainStyledAttributes.getBoolean(5, aVar2.f126543e);
                aVar2.f126544f = obtainStyledAttributes.getBoolean(8, aVar2.f126544f);
                aVar2.f126545g = obtainStyledAttributes.getBoolean(7, aVar2.f126545g);
                aVar2.f126546h = obtainStyledAttributes.getBoolean(6, aVar2.f126546h);
                aVar2.f126547i = obtainStyledAttributes.getBoolean(10, aVar2.f126547i);
                aVar2.f126548j = obtainStyledAttributes.getBoolean(16, aVar2.f126548j);
                aVar2.f126549k = obtainStyledAttributes.getBoolean(17, aVar2.f126549k);
                aVar2.f126550l = obtainStyledAttributes.getBoolean(12, aVar2.f126550l);
                aVar2.f126552n = obtainStyledAttributes.getBoolean(14, aVar2.f126552n);
                aVar2.f126551m = obtainStyledAttributes.getBoolean(13, aVar2.f126551m);
                aVar2.f126553o = obtainStyledAttributes.getBoolean(11, aVar2.f126553o);
                aVar2.f126554p = obtainStyledAttributes.getBoolean(3, aVar2.f126554p);
                aVar2.f126555q = obtainStyledAttributes.getBoolean(2, aVar2.f126555q);
                setCommonConfig(aVar2);
                C21525d dVar = new C21525d();
                dVar.f60981a = obtainStyledAttributes.getDimensionPixelOffset(21, dVar.f60981a);
                dVar.f60982b = obtainStyledAttributes.hasValue(21) ? C63508a.f180127f : dVar.f60982b;
                dVar.f60983c = obtainStyledAttributes.getFloat(22, dVar.f60983c);
                dVar.f60984d = obtainStyledAttributes.getFloat(23, dVar.f60984d);
                setHeaderConfig(dVar);
                C61566c cVar = new C61566c();
                cVar.f174983a = obtainStyledAttributes.getDimensionPixelOffset(18, cVar.f174983a);
                cVar.f174984b = obtainStyledAttributes.hasValue(18) ? C63508a.f180127f : cVar.f174984b;
                cVar.f174985c = obtainStyledAttributes.getFloat(19, cVar.f174985c);
                cVar.f174986d = obtainStyledAttributes.getFloat(20, cVar.f174986d);
                setFooterConfig(cVar);
                this.f56661E.mo157672i(getCommonConfig().f126553o);
                obtainStyledAttributes.recycle();
                return;
            }
            C87412m.m108603p("cValues");
            throw null;
        }
        C87412m.m108603p("cValues");
        throw null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.m105924i("WxRefreshLayout", "onAttachedToWindow");
        C21524b bVar = this.f56671o;
        if (bVar != null) {
            bVar.f60978u = true;
            if (!isInEditMode()) {
                if (this.f56664e == null && getCommonConfig().f126541c) {
                    getCommonConfig().f126541c = false;
                }
                if (this.f56665f == null && getCommonConfig().f126542d) {
                    getCommonConfig().f126542d = false;
                }
                C21803b bVar2 = this.f56663d;
                if (bVar2 == null) {
                    throw new RuntimeException("You should add a content view");
                } else if (bVar2 != null) {
                    bVar2.mo34217f(getCommonConfig().f126547i);
                    bVar2.mo34218g(this);
                    C21524b bVar3 = this.f56671o;
                    if (bVar3 == null) {
                        C87412m.m108603p("cValues");
                        throw null;
                    } else if (bVar3.f60959b != 0) {
                        this.f56667h.mo35531c(C22243b.None);
                        C21524b bVar4 = this.f56671o;
                        if (bVar4 != null) {
                            bVar2.mo34220h(bVar4.f60959b);
                        } else {
                            C87412m.m108603p("cValues");
                            throw null;
                        }
                    }
                }
            }
            C21803b bVar5 = this.f56663d;
            if (bVar5 != null) {
                bringChildToFront(bVar5.getView());
            }
            C21805g gVar = this.f56664e;
            if (gVar != null && gVar.getSpinnerStyle().f180137a) {
                bringChildToFront(gVar.getView());
            }
            C21805g gVar2 = this.f56665f;
            if (gVar2 != null && gVar2.getSpinnerStyle().f180137a) {
                bringChildToFront(gVar2.getView());
                return;
            }
            return;
        }
        C87412m.m108603p("cValues");
        throw null;
    }

    public void onDetachedFromWindow() {
        C21805g gVar;
        C21805g gVar2;
        super.onDetachedFromWindow();
        C21524b bVar = this.f56671o;
        if (bVar != null) {
            bVar.f60978u = false;
            C22387b bVar2 = this.f56657A;
            bVar2.f63476d = null;
            ValueAnimator valueAnimator = bVar2.f63477e;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.cancel();
            }
            bVar2.f63477e = null;
            if (this.f56667h.mo35530b() && (gVar2 = this.f56664e) != null) {
                gVar2.mo34224b(this, false);
            }
            if (this.f56667h.mo35529a() && (gVar = this.f56665f) != null) {
                gVar.mo34224b(this, false);
            }
            C21524b bVar3 = this.f56671o;
            if (bVar3 != null) {
                boolean z = true;
                if (bVar3.f60959b != 0) {
                    mo26622s(0, true);
                }
                C22386a aVar = this.f56667h;
                C22243b bVar4 = aVar.f63470b;
                C22243b bVar5 = C22243b.None;
                if (bVar4 != bVar5) {
                    z = false;
                }
                if (!z) {
                    aVar.mo35531c(bVar5);
                }
                this.f56679w.removeCallbacksAndMessages((Object) null);
                C21524b bVar6 = this.f56671o;
                if (bVar6 != null) {
                    bVar6.f60963f = false;
                } else {
                    C87412m.m108603p("cValues");
                    throw null;
                }
            } else {
                C87412m.m108603p("cValues");
                throw null;
            }
        } else {
            C87412m.m108603p("cValues");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        if ((r7 instanceof p849e3.C58524o) == false) goto L_0x0049;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x004d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFinishInflate() {
        /*
            r10 = this;
            super.onFinishInflate()
            java.lang.String r0 = "WxRefreshLayout"
            java.lang.String r1 = "onFinishInflate"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            int r0 = r10.getChildCount()
            r1 = 3
            if (r0 > r1) goto L_0x00a0
            r2 = 0
            r3 = -1
            r4 = 0
            r5 = -1
        L_0x0015:
            r6 = 1
            if (r4 >= r0) goto L_0x0050
            android.view.View r7 = r10.getChildAt(r4)
            boolean r8 = r7 instanceof oq3.C21805g
            if (r8 == 0) goto L_0x0021
            goto L_0x0049
        L_0x0021:
            boolean r8 = r7 instanceof oq3.C21805g
            if (r8 == 0) goto L_0x0026
            goto L_0x003b
        L_0x0026:
            boolean r8 = r7 instanceof android.widget.AbsListView
            if (r8 != 0) goto L_0x003d
            boolean r8 = r7 instanceof android.widget.ScrollView
            if (r8 != 0) goto L_0x003d
            boolean r8 = r7 instanceof p849e3.C107206t
            if (r8 != 0) goto L_0x003d
            boolean r8 = r7 instanceof android.webkit.WebView
            if (r8 != 0) goto L_0x003d
            boolean r8 = r7 instanceof p849e3.C107199k
            if (r8 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r8 = 0
            goto L_0x003e
        L_0x003d:
            r8 = 1
        L_0x003e:
            if (r8 != 0) goto L_0x004a
            boolean r8 = r7 instanceof androidx.viewpager.widget.ViewPager
            if (r8 != 0) goto L_0x004a
            boolean r7 = r7 instanceof p849e3.C58524o
            if (r7 == 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r6 = 0
        L_0x004a:
            if (r6 == 0) goto L_0x004d
            r5 = r4
        L_0x004d:
            int r4 = r4 + 1
            goto L_0x0015
        L_0x0050:
            r4 = 2
            if (r5 < 0) goto L_0x0070
            tq3.b r7 = new tq3.b
            android.view.View r8 = r10.getChildAt(r5)
            java.lang.String r9 = "getChildAt(indexContent)"
            gy3.C87412m.m108593f(r8, r9)
            r7.<init>(r8)
            r10.f56663d = r7
            if (r5 != r6) goto L_0x006c
            if (r0 != r1) goto L_0x006a
            r1 = 0
            r6 = 2
            goto L_0x0072
        L_0x006a:
            r1 = 0
            goto L_0x0071
        L_0x006c:
            if (r0 != r4) goto L_0x0070
            r1 = -1
            goto L_0x0072
        L_0x0070:
            r1 = -1
        L_0x0071:
            r6 = -1
        L_0x0072:
            if (r2 >= r0) goto L_0x009f
            android.view.View r4 = r10.getChildAt(r2)
            if (r2 == r1) goto L_0x0094
            if (r2 == r6) goto L_0x0083
            if (r1 != r3) goto L_0x0083
            oq3.g r5 = r10.f56664e
            if (r5 != 0) goto L_0x0083
            goto L_0x0094
        L_0x0083:
            if (r2 == r6) goto L_0x008b
            if (r6 != r3) goto L_0x009c
            oq3.g r5 = r10.f56665f
            if (r5 != 0) goto L_0x009c
        L_0x008b:
            boolean r5 = r4 instanceof oq3.C21804c
            if (r5 == 0) goto L_0x009c
            oq3.g r4 = (oq3.C21805g) r4
            r10.f56665f = r4
            goto L_0x009c
        L_0x0094:
            boolean r5 = r4 instanceof oq3.C11723d
            if (r5 == 0) goto L_0x009c
            oq3.g r4 = (oq3.C21805g) r4
            r10.f56664e = r4
        L_0x009c:
            int r2 = r2 + 1
            goto L_0x0072
        L_0x009f:
            return
        L_0x00a0:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Most only support three sub view"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.view.refreshLayout.WxRefreshLayout.onFinishInflate():void");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8 && !C87412m.m108589b("GONE", childAt.getTag(C0966R.C0970id.lu8))) {
                C21803b bVar = this.f56663d;
                if (bVar != null && bVar.getView() == childAt) {
                    View view = bVar.getView();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : this.f56680x;
                    int i6 = marginLayoutParams.leftMargin + paddingLeft;
                    int i7 = marginLayoutParams.topMargin + paddingTop;
                    view.layout(i6, i7, view.getMeasuredWidth() + i6, view.getMeasuredHeight() + i7);
                }
                C21805g gVar = this.f56664e;
                if (gVar != null && gVar.getView() == childAt) {
                    View view2 = gVar.getView();
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : this.f56680x;
                    int i8 = marginLayoutParams2.leftMargin;
                    int i9 = marginLayoutParams2.topMargin;
                    int measuredWidth = view2.getMeasuredWidth() + i8;
                    int measuredHeight = view2.getMeasuredHeight() + i9;
                    if (gVar.getSpinnerStyle() == C63509c.f180133b) {
                        i9 -= getHeaderConfig().f60981a;
                        measuredHeight -= getHeaderConfig().f60981a;
                    }
                    view2.layout(i8, i9, measuredWidth, measuredHeight);
                }
                C21805g gVar2 = this.f56665f;
                if (gVar2 != null && gVar2.getView() == childAt) {
                    View view3 = gVar2.getView();
                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : this.f56680x;
                    C63509c spinnerStyle = gVar2.getSpinnerStyle();
                    int i15 = marginLayoutParams3.leftMargin;
                    int measuredHeight2 = marginLayoutParams3.topMargin + getMeasuredHeight();
                    C21803b bVar2 = this.f56663d;
                    if (bVar2 != null) {
                        C21524b bVar3 = this.f56671o;
                        if (bVar3 == null) {
                            C87412m.m108603p("cValues");
                            throw null;
                        } else if (bVar3.f60979v) {
                            if (bVar3 == null) {
                                C87412m.m108603p("cValues");
                                throw null;
                            } else if (bVar3.f60980w && getCommonConfig().f126546h && gVar2.getSpinnerStyle() == C63509c.f180133b && mo26618p(getCommonConfig().f126542d)) {
                                View view4 = bVar2.getView();
                                ViewGroup.LayoutParams layoutParams4 = view4.getLayoutParams();
                                measuredHeight2 = paddingTop + paddingTop + (layoutParams4 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin : 0) + view4.getMeasuredHeight();
                            }
                        }
                    }
                    if (spinnerStyle == C63509c.f180136e) {
                        measuredHeight2 = marginLayoutParams3.topMargin;
                    } else if (spinnerStyle == C63509c.f180135d || spinnerStyle == C63509c.f180134c) {
                        measuredHeight2 -= getFooterConfig().f174983a;
                    } else {
                        spinnerStyle.getClass();
                    }
                    view3.layout(i15, measuredHeight2, view3.getMeasuredWidth() + i15, view3.getMeasuredHeight() + measuredHeight2);
                }
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = i;
        int i7 = i2;
        int childCount = getChildCount();
        int i8 = 0;
        int i9 = 0;
        int i15 = 0;
        while (i8 < childCount) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 8 || C87412m.m108589b("GONE", childAt.getTag(C0966R.C0970id.lu8))) {
                i3 = childCount;
            } else {
                C21805g gVar = this.f56664e;
                if (gVar == null || gVar.getView() != childAt) {
                    i3 = childCount;
                } else {
                    View view = gVar.getView();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : this.f56680x;
                    int childMeasureSpec = ViewGroup.getChildMeasureSpec(i6, marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, layoutParams.width);
                    int i16 = getHeaderConfig().f60981a;
                    i3 = childCount;
                    if (getHeaderConfig().f60982b.f180131a < 6) {
                        int i17 = layoutParams.height;
                        if (i17 > 0) {
                            int i18 = i17 + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                            C63508a aVar = getHeaderConfig().f60982b;
                            C63508a aVar2 = C63508a.f180126e;
                            if (aVar.mo88357a(aVar2)) {
                                i5 = i18;
                                getHeaderConfig().f60981a = layoutParams.height + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                                C21525d headerConfig = getHeaderConfig();
                                headerConfig.getClass();
                                headerConfig.f60982b = aVar2;
                            } else {
                                i5 = i18;
                            }
                            i16 = i5;
                        } else if (i17 == -2 && (gVar.getSpinnerStyle() != C63509c.f180136e || !getHeaderConfig().f60982b.f180132b)) {
                            int max = Math.max((View.MeasureSpec.getSize(i2) - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0);
                            view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE));
                            int measuredHeight = view.getMeasuredHeight();
                            if (measuredHeight > 0) {
                                if (measuredHeight != max) {
                                    C63508a aVar3 = getHeaderConfig().f60982b;
                                    C63508a aVar4 = C63508a.f180125d;
                                    if (aVar3.mo88357a(aVar4)) {
                                        getHeaderConfig().f60981a = measuredHeight + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                                        C21525d headerConfig2 = getHeaderConfig();
                                        headerConfig2.getClass();
                                        headerConfig2.f60982b = aVar4;
                                    }
                                }
                                i16 = -1;
                            }
                        }
                    }
                    if (gVar.getSpinnerStyle() == C63509c.f180136e) {
                        i16 = View.MeasureSpec.getSize(i2);
                    } else {
                        gVar.getSpinnerStyle().getClass();
                    }
                    if (i16 != -1) {
                        view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max((i16 - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0), 1073741824));
                    }
                    if (!getHeaderConfig().f60982b.f180132b) {
                        float f = getHeaderConfig().f60983c < 10.0f ? ((float) getHeaderConfig().f60981a) * getHeaderConfig().f60983c : getHeaderConfig().f60983c;
                        C21525d headerConfig3 = getHeaderConfig();
                        C63508a aVar5 = getHeaderConfig().f60982b;
                        if (!aVar5.f180132b) {
                            aVar5 = C63508a.f180130i[aVar5.f180131a + 1];
                        }
                        headerConfig3.getClass();
                        C87412m.m108594g(aVar5, "<set-?>");
                        headerConfig3.f60982b = aVar5;
                        gVar.mo34225c(this.f56666g, getHeaderConfig().f60981a, (int) f);
                    }
                }
                C21805g gVar2 = this.f56665f;
                if (gVar2 != null && gVar2.getView() == childAt) {
                    View view2 = gVar2.getView();
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : this.f56680x;
                    int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i6, marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin, layoutParams2.width);
                    int i19 = getFooterConfig().f174983a;
                    if (getFooterConfig().f174984b.f180131a < 6) {
                        int i25 = layoutParams2.height;
                        if (i25 > 0) {
                            int i26 = marginLayoutParams2.bottomMargin + i25 + marginLayoutParams2.topMargin;
                            C63508a aVar6 = getFooterConfig().f174984b;
                            C63508a aVar7 = C63508a.f180126e;
                            if (aVar6.mo88357a(aVar7)) {
                                i4 = i26;
                                getFooterConfig().f174983a = layoutParams2.height + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                                C61566c footerConfig = getFooterConfig();
                                footerConfig.getClass();
                                footerConfig.f174984b = aVar7;
                            } else {
                                i4 = i26;
                            }
                            i19 = i4;
                        } else if (i25 == -2 && (gVar2.getSpinnerStyle() != C63509c.f180136e || !getFooterConfig().f174984b.f180132b)) {
                            int max2 = Math.max((View.MeasureSpec.getSize(i2) - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, 0);
                            view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(max2, Integer.MIN_VALUE));
                            int measuredHeight2 = view2.getMeasuredHeight();
                            if (measuredHeight2 > 0) {
                                if (measuredHeight2 != max2) {
                                    C63508a aVar8 = getFooterConfig().f174984b;
                                    C63508a aVar9 = C63508a.f180125d;
                                    if (aVar8.mo88357a(aVar9)) {
                                        getFooterConfig().f174983a = measuredHeight2 + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                                        C61566c footerConfig2 = getFooterConfig();
                                        footerConfig2.getClass();
                                        footerConfig2.f174984b = aVar9;
                                    }
                                }
                                i19 = -1;
                            }
                        }
                    }
                    if (gVar2.getSpinnerStyle() == C63509c.f180136e) {
                        i19 = View.MeasureSpec.getSize(i2);
                    } else {
                        gVar2.getSpinnerStyle().getClass();
                    }
                    if (i19 != -1) {
                        view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max((i19 - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, 0), 1073741824));
                    }
                    if (!getFooterConfig().f174984b.f180132b) {
                        float f2 = getFooterConfig().f174985c < 10.0f ? ((float) getFooterConfig().f174983a) * getFooterConfig().f174985c : getFooterConfig().f174985c;
                        C61566c footerConfig3 = getFooterConfig();
                        C63508a aVar10 = getFooterConfig().f174984b;
                        if (!aVar10.f180132b) {
                            aVar10 = C63508a.f180130i[aVar10.f180131a + 1];
                        }
                        footerConfig3.getClass();
                        C87412m.m108594g(aVar10, "<set-?>");
                        footerConfig3.f174984b = aVar10;
                        gVar2.mo34225c(this.f56666g, getFooterConfig().f174983a, (int) f2);
                    }
                }
                C21803b bVar = this.f56663d;
                if (bVar != null && bVar.getView() == childAt) {
                    View view3 = bVar.getView();
                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : this.f56680x;
                    view3.measure(ViewGroup.getChildMeasureSpec(i6, getPaddingLeft() + getPaddingRight() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin, layoutParams3.width), ViewGroup.getChildMeasureSpec(i7, getPaddingTop() + getPaddingBottom() + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin, layoutParams3.height));
                    i9 += view3.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
                    i15 += view3.getMeasuredHeight() + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin;
                }
            }
            i8++;
            childCount = i3;
        }
        super.setMeasuredDimension(View.resolveSize(Math.max(i9 + getPaddingLeft() + getPaddingRight(), super.getSuggestedMinimumWidth()), i6), View.resolveSize(Math.max(i15 + getPaddingTop() + getPaddingBottom(), super.getSuggestedMinimumHeight()), i7));
        C21524b bVar2 = this.f56671o;
        if (bVar2 != null) {
            bVar2.f60968k = ((float) getMeasuredWidth()) / 2.0f;
        } else {
            C87412m.m108603p("cValues");
            throw null;
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        C87412m.m108594g(view, "target");
        return this.f56661E.mo157664a(f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        C87412m.m108594g(view, "target");
        C21524b bVar = this.f56671o;
        if (bVar != null) {
            return (bVar.f60963f && f2 > 0.0f) || mo26569B(-f2) || this.f56661E.mo157665b(f, f2);
        }
        C87412m.m108603p("cValues");
        throw null;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        C87412m.m108594g(view, "target");
        C87412m.m108594g(iArr, "consumed");
        int i3 = 0;
        int i4 = i - iArr[0];
        int i5 = i2 - iArr[1];
        int i6 = this.f56658B;
        if (i2 * i6 > 0) {
            if (Math.abs(i2) > Math.abs(this.f56658B)) {
                int i7 = this.f56658B;
                this.f56658B = 0;
                i3 = i7;
            } else {
                this.f56658B -= i2;
                i3 = i2;
            }
            mo26638t((float) this.f56658B);
        } else if (i2 > 0) {
            C21524b bVar = this.f56671o;
            if (bVar == null) {
                C87412m.m108603p("cValues");
                throw null;
            } else if (bVar.f60963f) {
                int i8 = i6 - i2;
                this.f56658B = i8;
                mo26638t((float) i8);
                i3 = i2;
            }
        }
        C21802a aVar = this.f56674r;
        if (aVar != null) {
            aVar.mo8478a(i4, i5);
        }
        this.f56661E.mo157666c(i, i2 - i3, iArr, (int[]) null);
        iArr[1] = iArr[1] + i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        if (r1 != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007a, code lost:
        if (r1 == false) goto L_0x00ab;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNestedScroll(android.view.View r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            java.lang.String r0 = "target"
            gy3.C87412m.m108594g(r8, r0)
            e3.l r1 = r7.f56661E
            int[] r6 = r7.f56660D
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            boolean r8 = r1.mo157668e(r2, r3, r4, r5, r6)
            int[] r9 = r7.f56660D
            r11 = 1
            r9 = r9[r11]
            int r12 = r12 + r9
            r9 = 0
            r0 = 0
            if (r12 >= 0) goto L_0x004b
            mq3.a r1 = r7.getCommonConfig()
            boolean r1 = r1.f126541c
            if (r1 != 0) goto L_0x002c
            mq3.a r1 = r7.getCommonConfig()
            boolean r1 = r1.f126551m
            if (r1 == 0) goto L_0x004b
        L_0x002c:
            int r1 = r7.f56658B
            if (r1 != 0) goto L_0x007c
            oq3.h r1 = r7.f56675s
            if (r1 == 0) goto L_0x007c
            if (r1 == 0) goto L_0x0048
            oq3.b r2 = r7.f56663d
            if (r2 == 0) goto L_0x003f
            android.view.View r2 = r2.getView()
            goto L_0x0040
        L_0x003f:
            r2 = r9
        L_0x0040:
            boolean r1 = r1.mo160997b(r2)
            if (r1 != r11) goto L_0x0048
            r1 = 1
            goto L_0x0049
        L_0x0048:
            r1 = 0
        L_0x0049:
            if (r1 != 0) goto L_0x007c
        L_0x004b:
            if (r12 <= 0) goto L_0x00ab
            mq3.a r1 = r7.getCommonConfig()
            boolean r1 = r1.f126542d
            if (r1 != 0) goto L_0x005d
            mq3.a r1 = r7.getCommonConfig()
            boolean r1 = r1.f126551m
            if (r1 == 0) goto L_0x00ab
        L_0x005d:
            int r1 = r7.f56658B
            if (r1 != 0) goto L_0x007c
            oq3.h r1 = r7.f56675s
            if (r1 == 0) goto L_0x007c
            if (r1 == 0) goto L_0x0079
            oq3.b r2 = r7.f56663d
            if (r2 == 0) goto L_0x0070
            android.view.View r2 = r2.getView()
            goto L_0x0071
        L_0x0070:
            r2 = r9
        L_0x0071:
            boolean r1 = r1.mo160996a(r2)
            if (r1 != r11) goto L_0x0079
            r1 = 1
            goto L_0x007a
        L_0x0079:
            r1 = 0
        L_0x007a:
            if (r1 == 0) goto L_0x00ab
        L_0x007c:
            sq3.a r1 = r7.f56667h
            rq3.b r2 = r1.f63471c
            rq3.b r3 = rq3.C22243b.None
            if (r2 != r3) goto L_0x0086
            r3 = 1
            goto L_0x0087
        L_0x0086:
            r3 = 0
        L_0x0087:
            if (r3 != 0) goto L_0x008d
            boolean r2 = r2.f63047g
            if (r2 == 0) goto L_0x00a2
        L_0x008d:
            if (r12 <= 0) goto L_0x0092
            rq3.b r2 = rq3.C22243b.PullUpToLoad
            goto L_0x0094
        L_0x0092:
            rq3.b r2 = rq3.C22243b.PullDownToRefresh
        L_0x0094:
            r1.mo35533e(r2)
            if (r8 != 0) goto L_0x00a2
            android.view.ViewParent r8 = r7.getParent()
            if (r8 == 0) goto L_0x00a2
            r8.requestDisallowInterceptTouchEvent(r11)
        L_0x00a2:
            int r8 = r7.f56658B
            int r8 = r8 - r12
            r7.f56658B = r8
            float r8 = (float) r8
            r7.mo26638t(r8)
        L_0x00ab:
            mq3.b r8 = r7.f56671o
            java.lang.String r11 = "cValues"
            if (r8 == 0) goto L_0x00c1
            boolean r12 = r8.f60963f
            if (r12 == 0) goto L_0x00c0
            if (r10 >= 0) goto L_0x00c0
            if (r8 == 0) goto L_0x00bc
            r8.f60963f = r0
            goto L_0x00c0
        L_0x00bc:
            gy3.C87412m.m108603p(r11)
            throw r9
        L_0x00c0:
            return
        L_0x00c1:
            gy3.C87412m.m108603p(r11)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.view.refreshLayout.WxRefreshLayout.onNestedScroll(android.view.View, int, int, int, int):void");
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        C87412m.m108594g(view, "child");
        C87412m.m108594g(view2, "target");
        this.f56662F.mo157675a(view, view2, i, 0);
        this.f56661E.mo157673j(i & 2, 0);
        C21524b bVar = this.f56671o;
        if (bVar != null) {
            this.f56658B = bVar.f60959b;
            this.f56659C = true;
            this.f56657A.mo35536c(0);
            return;
        }
        C87412m.m108603p("cValues");
        throw null;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        C87412m.m108594g(view, "child");
        C87412m.m108594g(view2, "target");
        return isEnabled() && isNestedScrollingEnabled() && (i & 2) != 0 && (getCommonConfig().f126551m || getCommonConfig().f126541c || getCommonConfig().f126542d);
    }

    public void onStopNestedScroll(View view) {
        C87412m.m108594g(view, "target");
        this.f56662F.mo157676b(view, 0);
        this.f56659C = false;
        this.f56658B = 0;
        this.f56682z.mo35543b();
        this.f56661E.mo157674k(0);
        C21802a aVar = this.f56674r;
        if (aVar != null) {
            aVar.mo8479b();
        }
    }

    /* renamed from: p */
    public final boolean mo26618p(boolean z) {
        return z && !getCommonConfig().f126552n;
    }

    /* renamed from: q */
    public final boolean mo26619q(boolean z, C21805g gVar) {
        return z || getCommonConfig().f126552n || gVar == null || gVar.getSpinnerStyle() == C63509c.f180134c;
    }

    /* renamed from: r */
    public final boolean mo26620r() {
        C21524b bVar = this.f56671o;
        if (bVar != null) {
            return mo26579e(bVar.f60978u ? 0 : 400, getCommonConfig().f126540b, (getHeaderConfig().f60983c + getHeaderConfig().f60984d) / ((float) 2), false);
        }
        C87412m.m108603p("cValues");
        throw null;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        C21524b bVar = this.f56671o;
        if (bVar != null) {
            bVar.f60973p = z;
            super.requestDisallowInterceptTouchEvent(z);
            return;
        }
        C87412m.m108603p("cValues");
        throw null;
    }

    /* renamed from: s */
    public final void mo26622s(int i, boolean z) {
        this.f56682z.mo35542a(i, z, false);
    }

    public final void setCommonConfig(C47093a aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f56668i = aVar;
    }

    public final void setContentPlugin(C21803b bVar) {
        this.f56663d = bVar;
    }

    public final void setDirectLoadingState(boolean z) {
        C63318b bVar;
        if (!this.f56667h.mo35529a()) {
            C21524b bVar2 = this.f56671o;
            if (bVar2 != null) {
                bVar2.f60977t = System.currentTimeMillis();
                C21524b bVar3 = this.f56671o;
                if (bVar3 != null) {
                    bVar3.f60963f = true;
                    this.f56667h.mo35531c(C22243b.Loading);
                    if (z && (bVar = this.f56672p) != null) {
                        bVar.onLoadMore();
                    }
                    C21805g gVar = this.f56665f;
                    if (gVar != null) {
                        gVar.mo34228g(this, getFooterConfig().f174983a, (int) (getFooterConfig().f174985c < 10.0f ? ((float) getFooterConfig().f174983a) * getFooterConfig().f174985c : getFooterConfig().f174985c));
                        return;
                    }
                    return;
                }
                C87412m.m108603p("cValues");
                throw null;
            }
            C87412m.m108603p("cValues");
            throw null;
        }
    }

    public final void setFooterConfig(C61566c cVar) {
        C87412m.m108594g(cVar, "<set-?>");
        this.f56670n = cVar;
    }

    public final void setFooterPlugin(C21805g gVar) {
        this.f56665f = gVar;
    }

    public final void setHeaderConfig(C21525d dVar) {
        C87412m.m108594g(dVar, "<set-?>");
        this.f56669j = dVar;
    }

    public final void setHeaderPlugin(C21805g gVar) {
        this.f56664e = gVar;
    }

    public void setNestedScrollingEnabled(boolean z) {
        getCommonConfig().f126553o = z;
        this.f56661E.mo157672i(z);
    }

    public final void setOnMultiAction(C63319c cVar) {
        this.f56673q = cVar;
    }

    public final void setOnSimpleAction(C63318b bVar) {
        this.f56672p = bVar;
    }

    public final void setOverScrollCallback(C21802a aVar) {
        this.f56674r = aVar;
    }

    public final void setRefreshingState(boolean z) {
        C19887c cVar = new C19887c(this, z);
        this.f56667h.mo35531c(C22243b.RefreshReleased);
        ValueAnimator c = mo26571c(getHeaderConfig().f60981a);
        if (c != null) {
            c.addListener(cVar);
        }
        C21805g gVar = this.f56664e;
        if (gVar != null) {
            gVar.mo34231h(this, getHeaderConfig().f60981a, (int) (getHeaderConfig().f60983c < 10.0f ? ((float) getHeaderConfig().f60981a) * getHeaderConfig().f60983c : getHeaderConfig().f60983c));
        }
        if (c == null) {
            cVar.onAnimationEnd((Animator) null);
        }
    }

    public final void setScrollBoundaryDecider(C110059h hVar) {
        this.f56675s = hVar;
    }

    public boolean startNestedScroll(int i) {
        return this.f56661E.mo157673j(i, 0);
    }

    public void stopNestedScroll() {
        this.f56661E.mo157674k(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0126, code lost:
        if (r2.mo26618p(r2.getCommonConfig().f126542d) == false) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x014c, code lost:
        if (r2.mo26618p(r2.getCommonConfig().f126542d) != false) goto L_0x0154;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:141:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f5  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26638t(float r21) {
        /*
            r20 = this;
            r0 = r20
            sq3.f r1 = r0.f56682z
            boolean r2 = r0.f56659C
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x002a
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r1.f63492a
            mq3.a r2 = r2.getCommonConfig()
            boolean r2 = r2.f126547i
            if (r2 != 0) goto L_0x002a
            int r2 = (r21 > r3 ? 1 : (r21 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x002a
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r1.f63492a
            oq3.b r2 = r2.getContentView()
            if (r2 == 0) goto L_0x0025
            boolean r2 = r2.mo34222k()
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            if (r2 != 0) goto L_0x002a
            r2 = 0
            goto L_0x002c
        L_0x002a:
            r2 = r21
        L_0x002c:
            sq3.a r5 = r1.f63493b
            boolean r5 = r5.mo35530b()
            r6 = 0
            r8 = 1092616192(0x41200000, float:10.0)
            java.lang.String r9 = "cValues"
            r15 = 1
            if (r5 == 0) goto L_0x00f5
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x00f5
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r5 = r1.f63492a
            mq3.d r5 = r5.getHeaderConfig()
            int r5 = r5.f60981a
            float r5 = (float) r5
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x0053
            int r5 = (int) r2
            r1.mo35542a(r5, r15, r4)
            r3 = r2
            goto L_0x016a
        L_0x0053:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r5 = r1.f63492a
            mq3.d r5 = r5.getHeaderConfig()
            float r5 = r5.f60983c
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x0073
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r5 = r1.f63492a
            mq3.d r5 = r5.getHeaderConfig()
            int r5 = r5.f60981a
            float r5 = (float) r5
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r8 = r1.f63492a
            mq3.d r8 = r8.getHeaderConfig()
            float r8 = r8.f60983c
            float r5 = r5 * r8
            goto L_0x007b
        L_0x0073:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r5 = r1.f63492a
            mq3.d r5 = r5.getHeaderConfig()
            float r5 = r5.f60983c
        L_0x007b:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r8 = r1.f63492a
            mq3.d r8 = r8.getHeaderConfig()
            int r8 = r8.f60981a
            float r8 = (float) r8
            float r5 = r5 - r8
            double r12 = (double) r5
            mq3.b r5 = r1.f63494c
            if (r5 == 0) goto L_0x00f0
            int r5 = r5.f60958a
            int r5 = r5 * 4
            int r5 = r5 / 3
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r8 = r1.f63492a
            int r8 = r8.getHeight()
            int r5 = java.lang.Math.max(r5, r8)
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r8 = r1.f63492a
            mq3.d r8 = r8.getHeaderConfig()
            int r8 = r8.f60981a
            int r5 = r5 - r8
            double r4 = (double) r5
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r8 = r1.f63492a
            mq3.d r8 = r8.getHeaderConfig()
            int r8 = r8.f60981a
            float r8 = (float) r8
            float r8 = r2 - r8
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r14 = r1.f63492a
            mq3.a r14 = r14.getCommonConfig()
            float r14 = r14.f126539a
            float r8 = r8 * r14
            float r8 = java.lang.Math.max(r3, r8)
            double r10 = (double) r8
            r18 = r2
            double r2 = (double) r15
            double r14 = -r10
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x00c8
            r6 = 1
            goto L_0x00c9
        L_0x00c8:
            r6 = 0
        L_0x00c9:
            if (r6 == 0) goto L_0x00ce
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x00d0
        L_0x00ce:
            r16 = r4
        L_0x00d0:
            double r14 = r14 / r16
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = java.lang.Math.pow(r4, r14)
            double r2 = r2 - r4
            double r12 = r12 * r2
            double r2 = java.lang.Math.min(r12, r10)
            int r2 = (int) r2
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r3 = r1.f63492a
            mq3.d r3 = r3.getHeaderConfig()
            int r3 = r3.f60981a
            int r2 = r2 + r3
            r3 = 0
            r4 = 1
            r1.mo35542a(r2, r4, r3)
            goto L_0x0308
        L_0x00f0:
            gy3.C87412m.m108603p(r9)
            r1 = 0
            throw r1
        L_0x00f5:
            r18 = r2
            r2 = 0
            int r3 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0216
            sq3.a r2 = r1.f63493b
            boolean r2 = r2.mo35529a()
            if (r2 != 0) goto L_0x0154
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r1.f63492a
            mq3.a r2 = r2.getCommonConfig()
            boolean r2 = r2.f126546h
            if (r2 == 0) goto L_0x012e
            mq3.b r2 = r1.f63494c
            if (r2 == 0) goto L_0x0129
            boolean r3 = r2.f60979v
            if (r3 == 0) goto L_0x012e
            boolean r2 = r2.f60980w
            if (r2 == 0) goto L_0x012e
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r1.f63492a
            mq3.a r3 = r2.getCommonConfig()
            boolean r3 = r3.f126542d
            boolean r2 = r2.mo26618p(r3)
            if (r2 != 0) goto L_0x0154
            goto L_0x012e
        L_0x0129:
            gy3.C87412m.m108603p(r9)
            r1 = 0
            throw r1
        L_0x012e:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r1.f63492a
            mq3.a r2 = r2.getCommonConfig()
            boolean r2 = r2.f126543e
            if (r2 == 0) goto L_0x0216
            mq3.b r2 = r1.f63494c
            if (r2 == 0) goto L_0x014f
            boolean r2 = r2.f60979v
            if (r2 != 0) goto L_0x0216
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r1.f63492a
            mq3.a r3 = r2.getCommonConfig()
            boolean r3 = r3.f126542d
            boolean r2 = r2.mo26618p(r3)
            if (r2 == 0) goto L_0x0216
            goto L_0x0154
        L_0x014f:
            gy3.C87412m.m108603p(r9)
            r1 = 0
            throw r1
        L_0x0154:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r1.f63492a
            mq3.c r2 = r2.getFooterConfig()
            int r2 = r2.f174983a
            int r2 = -r2
            float r2 = (float) r2
            int r2 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x016f
            r3 = r18
            int r2 = (int) r3
            r4 = 0
            r5 = 1
            r1.mo35542a(r2, r5, r4)
        L_0x016a:
            r18 = r3
            r4 = 1
            goto L_0x0308
        L_0x016f:
            r3 = r18
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r1.f63492a
            mq3.c r2 = r2.getFooterConfig()
            float r2 = r2.f174985c
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0191
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r1.f63492a
            mq3.c r2 = r2.getFooterConfig()
            int r2 = r2.f174983a
            float r2 = (float) r2
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r4 = r1.f63492a
            mq3.c r4 = r4.getFooterConfig()
            float r4 = r4.f174985c
            float r2 = r2 * r4
            goto L_0x0199
        L_0x0191:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r1.f63492a
            mq3.c r2 = r2.getFooterConfig()
            float r2 = r2.f174985c
        L_0x0199:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r4 = r1.f63492a
            mq3.c r4 = r4.getFooterConfig()
            int r4 = r4.f174983a
            float r4 = (float) r4
            float r2 = r2 - r4
            double r4 = (double) r2
            mq3.b r2 = r1.f63494c
            if (r2 == 0) goto L_0x0211
            int r2 = r2.f60958a
            int r2 = r2 * 4
            int r2 = r2 / 3
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r8 = r1.f63492a
            int r8 = r8.getHeight()
            int r2 = java.lang.Math.max(r2, r8)
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r8 = r1.f63492a
            mq3.c r8 = r8.getFooterConfig()
            int r8 = r8.f174983a
            int r2 = r2 - r8
            double r10 = (double) r2
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r1.f63492a
            mq3.c r2 = r2.getFooterConfig()
            int r2 = r2.f174983a
            float r2 = (float) r2
            float r2 = r2 + r3
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r8 = r1.f63492a
            mq3.a r8 = r8.getCommonConfig()
            float r8 = r8.f126539a
            float r2 = r2 * r8
            r8 = 0
            float r2 = java.lang.Math.min(r8, r2)
            double r12 = (double) r2
            double r12 = -r12
            r2 = 1
            double r14 = (double) r2
            r18 = r3
            double r2 = -r12
            int r8 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x01e8
            r6 = 1
            goto L_0x01e9
        L_0x01e8:
            r6 = 0
        L_0x01e9:
            if (r6 == 0) goto L_0x01ee
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x01f0
        L_0x01ee:
            r16 = r10
        L_0x01f0:
            double r2 = r2 / r16
            r6 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = java.lang.Math.pow(r6, r2)
            double r14 = r14 - r2
            double r4 = r4 * r14
            double r2 = java.lang.Math.min(r4, r12)
            double r2 = -r2
            int r2 = (int) r2
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r3 = r1.f63492a
            mq3.c r3 = r3.getFooterConfig()
            int r3 = r3.f174983a
            int r2 = r2 - r3
            r3 = 0
            r4 = 1
            r1.mo35542a(r2, r4, r3)
            goto L_0x0308
        L_0x0211:
            gy3.C87412m.m108603p(r9)
            r1 = 0
            throw r1
        L_0x0216:
            r2 = 0
            int r3 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            if (r3 < 0) goto L_0x0294
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r1.f63492a
            mq3.d r2 = r2.getHeaderConfig()
            float r2 = r2.f60983c
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x023b
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r1.f63492a
            mq3.d r2 = r2.getHeaderConfig()
            int r2 = r2.f60981a
            float r2 = (float) r2
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r3 = r1.f63492a
            mq3.d r3 = r3.getHeaderConfig()
            float r3 = r3.f60983c
            float r2 = r2 * r3
            goto L_0x0243
        L_0x023b:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r1.f63492a
            mq3.d r2 = r2.getHeaderConfig()
            float r2 = r2.f60983c
        L_0x0243:
            double r2 = (double) r2
            mq3.b r4 = r1.f63494c
            if (r4 == 0) goto L_0x028f
            int r4 = r4.f60958a
            int r4 = r4 / 2
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r5 = r1.f63492a
            int r5 = r5.getHeight()
            int r4 = java.lang.Math.max(r4, r5)
            double r4 = (double) r4
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r8 = r1.f63492a
            mq3.a r8 = r8.getCommonConfig()
            float r8 = r8.f126539a
            float r8 = r8 * r18
            r10 = 0
            float r8 = java.lang.Math.max(r10, r8)
            double r10 = (double) r8
            r8 = 1
            double r12 = (double) r8
            double r14 = -r10
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0270
            r6 = 1
            goto L_0x0271
        L_0x0270:
            r6 = 0
        L_0x0271:
            if (r6 == 0) goto L_0x0276
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x0278
        L_0x0276:
            r16 = r4
        L_0x0278:
            double r14 = r14 / r16
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = java.lang.Math.pow(r4, r14)
            double r12 = r12 - r4
            double r2 = r2 * r12
            double r2 = java.lang.Math.min(r2, r10)
            int r2 = (int) r2
            r3 = 0
            r4 = 1
            r1.mo35542a(r2, r4, r3)
            goto L_0x0308
        L_0x028f:
            gy3.C87412m.m108603p(r9)
            r1 = 0
            throw r1
        L_0x0294:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r1.f63492a
            mq3.c r2 = r2.getFooterConfig()
            float r2 = r2.f174985c
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x02b4
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r1.f63492a
            mq3.c r2 = r2.getFooterConfig()
            int r2 = r2.f174983a
            float r2 = (float) r2
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r3 = r1.f63492a
            mq3.c r3 = r3.getFooterConfig()
            float r3 = r3.f174985c
            float r2 = r2 * r3
            goto L_0x02bc
        L_0x02b4:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r1.f63492a
            mq3.c r2 = r2.getFooterConfig()
            float r2 = r2.f174985c
        L_0x02bc:
            double r2 = (double) r2
            mq3.b r4 = r1.f63494c
            if (r4 == 0) goto L_0x038d
            int r4 = r4.f60958a
            int r4 = r4 / 2
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r5 = r1.f63492a
            int r5 = r5.getHeight()
            int r4 = java.lang.Math.max(r4, r5)
            double r4 = (double) r4
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r8 = r1.f63492a
            mq3.a r8 = r8.getCommonConfig()
            float r8 = r8.f126539a
            float r8 = r8 * r18
            r10 = 0
            float r8 = java.lang.Math.min(r10, r8)
            double r10 = (double) r8
            double r10 = -r10
            r8 = 1
            double r12 = (double) r8
            double r14 = -r10
            int r19 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r19 != 0) goto L_0x02ea
            r6 = 1
            goto L_0x02eb
        L_0x02ea:
            r6 = 0
        L_0x02eb:
            if (r6 == 0) goto L_0x02f0
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x02f2
        L_0x02f0:
            r16 = r4
        L_0x02f2:
            double r14 = r14 / r16
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = java.lang.Math.pow(r4, r14)
            double r12 = r12 - r4
            double r2 = r2 * r12
            double r2 = java.lang.Math.min(r2, r10)
            double r2 = -r2
            int r2 = (int) r2
            r3 = 0
            r4 = 1
            r1.mo35542a(r2, r4, r3)
        L_0x0308:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r1.f63492a
            mq3.a r2 = r2.getCommonConfig()
            boolean r2 = r2.f126543e
            if (r2 == 0) goto L_0x038c
            mq3.b r2 = r1.f63494c
            if (r2 == 0) goto L_0x0387
            boolean r2 = r2.f60979v
            if (r2 != 0) goto L_0x038c
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r1.f63492a
            mq3.a r3 = r2.getCommonConfig()
            boolean r3 = r3.f126542d
            boolean r2 = r2.mo26618p(r3)
            if (r2 == 0) goto L_0x038c
            r2 = 0
            int r2 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x038c
            sq3.a r2 = r1.f63493b
            boolean r2 = r2.mo35530b()
            if (r2 != 0) goto L_0x038c
            sq3.a r2 = r1.f63493b
            boolean r2 = r2.mo35529a()
            if (r2 != 0) goto L_0x038c
            sq3.a r2 = r1.f63493b
            rq3.b r2 = r2.f63470b
            rq3.b r3 = rq3.C22243b.LoadFinish
            if (r2 != r3) goto L_0x0347
            r15 = 1
            goto L_0x0348
        L_0x0347:
            r15 = 0
        L_0x0348:
            if (r15 != 0) goto L_0x038c
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r1.f63492a
            mq3.a r2 = r2.getCommonConfig()
            boolean r2 = r2.f126555q
            if (r2 == 0) goto L_0x0369
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r1.f63492a
            sq3.b r2 = r2.getAnimHelper()
            r3 = 0
            r2.f63476d = r3
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r1.f63492a
            mq3.c r3 = r2.getFooterConfig()
            int r3 = r3.f174983a
            int r3 = -r3
            r2.mo26571c(r3)
        L_0x0369:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r1.f63492a
            r3 = 0
            r2.setDirectLoadingState(r3)
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r1.f63492a
            com.tencent.mm.sdk.platformtools.MMHandler r2 = r2.getMainHandler()
            sq3.e r3 = new sq3.e
            r3.<init>(r1)
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r1 = r1.f63492a
            mq3.a r1 = r1.getCommonConfig()
            int r1 = r1.f126540b
            long r4 = (long) r1
            r2.postDelayed(r3, r4)
            goto L_0x038c
        L_0x0387:
            gy3.C87412m.m108603p(r9)
            r1 = 0
            throw r1
        L_0x038c:
            return
        L_0x038d:
            r1 = 0
            gy3.C87412m.m108603p(r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.view.refreshLayout.WxRefreshLayout.mo26638t(float):void");
    }

    /* renamed from: w */
    public void mo26639w() {
    }

    /* renamed from: x */
    public void mo26640x(boolean z) {
    }

    /* renamed from: y */
    public C110058f mo26641y(C21804c cVar) {
        C87412m.m108594g(cVar, "footer");
        C21805g gVar = this.f56665f;
        if (gVar != null) {
            super.removeView(gVar.getView());
        }
        this.f56665f = cVar;
        C21524b bVar = this.f56671o;
        if (bVar != null) {
            bVar.f60963f = false;
            if (bVar != null) {
                bVar.f60980w = false;
                C61566c footerConfig = getFooterConfig();
                C63508a aVar = C63508a.f180124c;
                footerConfig.getClass();
                footerConfig.f174984b = aVar;
                getCommonConfig().f126542d = true;
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                C21805g gVar2 = this.f56665f;
                if (gVar2 != null) {
                    if (gVar2.getSpinnerStyle().f180137a) {
                        super.addView(gVar2.getView(), getChildCount(), marginLayoutParams);
                    } else {
                        super.addView(gVar2.getView(), 0, marginLayoutParams);
                    }
                }
                return this;
            }
            C87412m.m108603p("cValues");
            throw null;
        }
        C87412m.m108603p("cValues");
        throw null;
    }

    /* renamed from: z */
    public C110058f mo26642z(boolean z) {
        if (this.f56667h.mo35530b() && z) {
            mo26605m();
        } else if (!this.f56667h.mo35529a() || !z) {
            C21524b bVar = this.f56671o;
            if (bVar == null) {
                C87412m.m108603p("cValues");
                throw null;
            } else if (bVar.f60979v != z) {
                if (bVar != null) {
                    bVar.f60979v = z;
                    C21805g gVar = this.f56665f;
                    if (gVar instanceof C21804c) {
                        C87412m.m108592e(gVar, "null cannot be cast to non-null type com.tencent.mm.view.refreshLayout.interfaces.IRefreshFooter");
                        if (((C21804c) gVar).mo34223d(z)) {
                            C21524b bVar2 = this.f56671o;
                            if (bVar2 != null) {
                                bVar2.f60980w = true;
                                if (bVar2 == null) {
                                    C87412m.m108603p("cValues");
                                    throw null;
                                } else if (bVar2.f60979v && getCommonConfig().f126546h) {
                                    C21524b bVar3 = this.f56671o;
                                    if (bVar3 == null) {
                                        C87412m.m108603p("cValues");
                                        throw null;
                                    } else if (bVar3.f60959b > 0) {
                                        C21805g gVar2 = this.f56665f;
                                        if ((gVar2 != null ? gVar2.getSpinnerStyle() : null) == C63509c.f180133b && mo26618p(getCommonConfig().f126542d) && mo26619q(getCommonConfig().f126541c, this.f56664e)) {
                                            C21805g gVar3 = this.f56665f;
                                            View view = gVar3 != null ? gVar3.getView() : null;
                                            if (view != null) {
                                                C21524b bVar4 = this.f56671o;
                                                if (bVar4 != null) {
                                                    view.setTranslationY((float) bVar4.f60959b);
                                                } else {
                                                    C87412m.m108603p("cValues");
                                                    throw null;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                C87412m.m108603p("cValues");
                                throw null;
                            }
                        } else {
                            C21524b bVar5 = this.f56671o;
                            if (bVar5 != null) {
                                bVar5.f60980w = false;
                            } else {
                                C87412m.m108603p("cValues");
                                throw null;
                            }
                        }
                    }
                } else {
                    C87412m.m108603p("cValues");
                    throw null;
                }
            }
        } else {
            mo26600h();
        }
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WxRefreshLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(attributeSet, "attrs");
        C22386a aVar = new C22386a(this);
        this.f56667h = aVar;
        this.f56679w = new MMHandler(Looper.getMainLooper());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        this.f56680x = marginLayoutParams;
        this.f56682z = new C22394f(this, aVar, marginLayoutParams);
        this.f56657A = new C22387b(this, aVar);
        this.f56660D = new int[2];
        this.f56661E = new C107200l(this);
        this.f56662F = new C107203p(this);
        mo26606o(attributeSet);
    }
}
