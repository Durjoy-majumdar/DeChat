package fp0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C40469j0;
import com.tencent.p014mm.plugin.appbrand.p026ui.MaxHeightRecyclerView;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import gt0.C87330d0;
import gt0.C87350h;
import gt0.C87381r0;
import gy3.C87412m;
import in3.C87763b;
import in3.C87771d;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import k20.C60958c;
import k20.C9556a;
import lb0.C88394b;
import lb0.C88431k;
import p385u2.C111105a;
import p849e3.C107168a0;
import p849e3.C107207u;
import wq0.C91072j;
import yq0.C91566l;
import zp3.C79406f;

/* renamed from: fp0.c */
public final class C87032c extends C87763b implements C91566l {

    /* renamed from: y0 */
    public static final /* synthetic */ int f252550y0 = 0;

    /* renamed from: A */
    public C87350h f252551A;

    /* renamed from: B */
    public C91566l.C91570c f252552B;

    /* renamed from: C */
    public MotionEvent f252553C;

    /* renamed from: D */
    public TextView f252554D;

    /* renamed from: E */
    public String f252555E;

    /* renamed from: F */
    public TextView f252556F;

    /* renamed from: G */
    public String f252557G;

    /* renamed from: H */
    public TextView f252558H;

    /* renamed from: I */
    public String f252559I;

    /* renamed from: J */
    public TextView f252560J;

    /* renamed from: K */
    public String f252561K;

    /* renamed from: L */
    public ImageView f252562L;

    /* renamed from: M */
    public String f252563M;

    /* renamed from: N */
    public String f252564N;

    /* renamed from: P */
    public LinearLayout f252565P;

    /* renamed from: Q */
    public final List<C87330d0.C87331a> f252566Q;

    /* renamed from: R */
    public C87330d0 f252567R;

    /* renamed from: S */
    public View f252568S;

    /* renamed from: T */
    public C87330d0.C87332b f252569T;

    /* renamed from: U */
    public ImageView f252570U;

    /* renamed from: V */
    public TextView f252571V;

    /* renamed from: W */
    public Button f252572W;

    /* renamed from: p0 */
    public Button f252573p0;

    /* renamed from: w */
    public final int f252574w;

    /* renamed from: x */
    public MaxHeightRecyclerView f252575x;

    /* renamed from: x0 */
    public C81879g f252576x0;

    /* renamed from: y */
    public RelativeLayout f252577y;

    /* renamed from: z */
    public LinearLayout f252578z;

    /* renamed from: fp0.c$a */
    public static final class C87033a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C87032c f252579d;

        public C87033a(C87032c cVar) {
            this.f252579d = cVar;
        }

        public final void run() {
            C8180a.m8260a(this.f252579d);
        }
    }

    /* renamed from: fp0.c$b */
    public static final class C87034b implements View.OnLayoutChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C87032c f252580d;

        public C87034b(C87032c cVar) {
            this.f252580d = cVar;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C87412m.m108594g(view, "view");
            view.removeOnLayoutChangeListener(this);
            C87032c cVar = this.f252580d;
            RelativeLayout relativeLayout = cVar.f252577y;
            if (relativeLayout != null) {
                relativeLayout.getViewTreeObserver().addOnPreDrawListener(new C87031b(relativeLayout, cVar));
            } else {
                C87412m.m108603p("requestContainer");
                throw null;
            }
        }
    }

    /* renamed from: fp0.c$c */
    public static final class C87035c implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: d */
        public final /* synthetic */ View f252581d;

        /* renamed from: e */
        public final /* synthetic */ C81879g f252582e;

        public C87035c(View view, C81879g gVar) {
            this.f252581d = view;
            this.f252582e = gVar;
        }

        public boolean onPreDraw() {
            this.f252581d.getViewTreeObserver().removeOnPreDrawListener(this);
            View view = this.f252581d;
            view.setTranslationY((float) view.getMeasuredHeight());
            ViewPropertyAnimator duration = view.animate().setInterpolator(new AccelerateDecelerateInterpolator()).translationY(0.0f).setDuration(300);
            duration.setListener(new C87036d(this.f252582e));
            duration.start();
            return true;
        }
    }

    /* renamed from: fp0.c$d */
    public static final class C87036d extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C81879g f252583d;

        public C87036d(C81879g gVar) {
            this.f252583d = gVar;
        }

        public void onAnimationEnd(Animator animator) {
            Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(this.f252583d.getContext());
            if (castActivityOrNull != null) {
                C87771d.m109203b(castActivityOrNull).mo122181e();
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C87032c(com.tencent.p014mm.plugin.appbrand.C81879g r6, yq0.C91566l.C91570c r7) {
        /*
            r5 = this;
            java.lang.String r0 = "component"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = "listener"
            gy3.C87412m.m108594g(r7, r0)
            android.content.Context r6 = r6.getContext()
            if (r6 != 0) goto L_0x0014
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
        L_0x0014:
            r5.<init>(r6)
            android.content.Context r6 = r5.getContext()
            r0 = 2131101833(0x7f060889, float:1.7816087E38)
            int r6 = p385u2.C111105a.m151500b(r6, r0)
            r5.f252574w = r6
            r5.f252552B = r7
            java.lang.String r6 = ""
            r5.f252564N = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.f252566Q = r6
            android.content.Context r7 = r5.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r0 = 2131493070(0x7f0c00ce, float:1.860961E38)
            r1 = 1
            r7.inflate(r0, r5, r1)
            gt0.h r7 = new gt0.h
            android.content.Context r0 = r5.getContext()
            java.lang.String r1 = "context"
            gy3.C87412m.m108593f(r0, r1)
            r1 = 2131316005(0x7f094d25, float:1.825048E38)
            android.view.View r1 = r5.findViewById(r1)
            java.lang.String r2 = "findViewById(com.tencent…id.user_agreement_layout)"
            gy3.C87412m.m108593f(r1, r2)
            r7.<init>(r0, r1)
            r5.f252551A = r7
            r7 = 2131298557(0x7f0908fd, float:1.821509E38)
            android.view.View r0 = r5.findViewById(r7)
            java.lang.String r1 = "findViewById<View>(R.id.button_group)"
            gy3.C87412m.m108593f(r0, r1)
            fp0.C8180a.m8260a(r0)
            r0 = 2131312362(0x7f093eea, float:1.824309E38)
            android.view.View r0 = r5.findViewById(r0)
            java.lang.String r1 = "findViewById(R.id.request_right_icon)"
            gy3.C87412m.m108593f(r0, r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r5.f252570U = r0
            r0 = 2131312353(0x7f093ee1, float:1.8243072E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            android.content.Context r1 = r5.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r2 = 2131493069(0x7f0c00cd, float:1.8609608E38)
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r0, r3)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            java.lang.String r3 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams"
            gy3.C87412m.m108592e(r2, r3)
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            r3 = 3
            r4 = 2131312354(0x7f093ee2, float:1.8243074E38)
            r2.addRule(r3, r4)
            r3 = 12
            r2.addRule(r3)
            r0.addView(r1)
            r5.f252577y = r0
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            fp0.b r2 = new fp0.b
            r2.<init>(r0, r5)
            r1.addOnPreDrawListener(r2)
            r0 = 2131305321(0x7f092369, float:1.822881E38)
            android.view.View r0 = r5.findViewById(r0)
            fp0.d r1 = new fp0.d
            r1.<init>(r5)
            r0.setOnClickListener(r1)
            r0 = 2131312359(0x7f093ee7, float:1.8243084E38)
            android.view.View r0 = r5.findViewById(r0)
            java.lang.String r1 = "findViewById(R.id.request_name)"
            gy3.C87412m.m108593f(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.f252554D = r0
            r0 = 2131312355(0x7f093ee3, float:1.8243076E38)
            android.view.View r0 = r5.findViewById(r0)
            java.lang.String r1 = "findViewById(com.tencent…ll_sdk.R.id.request_desc)"
            gy3.C87412m.m108593f(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.f252556F = r0
            r0 = 2131313584(0x7f0943b0, float:1.8245569E38)
            android.view.View r0 = r5.findViewById(r0)
            java.lang.String r1 = "findViewById(com.tencent….R.id.simple_detail_desc)"
            gy3.C87412m.m108593f(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.f252558H = r0
            r0 = 2131312351(0x7f093edf, float:1.8243068E38)
            android.view.View r0 = r5.findViewById(r0)
            java.lang.String r1 = "findViewById(R.id.request_apply_wording)"
            gy3.C87412m.m108593f(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.f252560J = r0
            r0 = 2131312357(0x7f093ee5, float:1.824308E38)
            android.view.View r0 = r5.findViewById(r0)
            java.lang.String r1 = "findViewById(R.id.request_icon)"
            gy3.C87412m.m108593f(r0, r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r5.f252562L = r0
            android.view.View r0 = r5.findViewById(r4)
            java.lang.String r1 = "findViewById(com.tencent…sdk.R.id.request_content)"
            gy3.C87412m.m108593f(r0, r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r5.f252565P = r0
            r0 = 2131312361(0x7f093ee9, float:1.8243088E38)
            android.view.View r0 = r5.findViewById(r0)
            java.lang.String r1 = "findViewById(R.id.request_recyclerview)"
            gy3.C87412m.m108593f(r0, r1)
            com.tencent.mm.plugin.appbrand.ui.MaxHeightRecyclerView r0 = (com.tencent.p014mm.plugin.appbrand.p026ui.MaxHeightRecyclerView) r0
            r5.f252575x = r0
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r5.getContext()
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            gt0.d0 r0 = new gt0.d0
            r0.<init>(r6)
            r5.f252567R = r0
            com.tencent.mm.plugin.appbrand.ui.MaxHeightRecyclerView r6 = r5.f252575x
            java.lang.String r1 = "recyclerView"
            r2 = 0
            if (r6 == 0) goto L_0x01c8
            r6.setAdapter(r0)
            com.tencent.mm.plugin.appbrand.ui.MaxHeightRecyclerView r6 = r5.f252575x
            if (r6 == 0) goto L_0x01c4
            r6.setItemAnimator(r2)
            r6 = 2131312358(0x7f093ee6, float:1.8243082E38)
            android.view.View r6 = r5.findViewById(r6)
            java.lang.String r0 = "findViewById(com.tencent…sdk.R.id.request_loading)"
            gy3.C87412m.m108593f(r6, r0)
            r5.f252568S = r6
            r6 = 2131312356(0x7f093ee4, float:1.8243078E38)
            android.view.View r6 = r5.findViewById(r6)
            java.lang.String r0 = "findViewById(R.id.request_function)"
            gy3.C87412m.m108593f(r6, r0)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5.f252571V = r6
            r6 = 2131312352(0x7f093ee0, float:1.824307E38)
            android.view.View r6 = r5.findViewById(r6)
            r0 = r6
            android.widget.Button r0 = (android.widget.Button) r0
            fp0.e r1 = new fp0.e
            r1.<init>(r5)
            r0.setOnClickListener(r1)
            java.lang.String r0 = "findViewById<Button>(R.i…)\n            }\n        }"
            gy3.C87412m.m108593f(r6, r0)
            android.widget.Button r6 = (android.widget.Button) r6
            r5.f252572W = r6
            r6 = 2131312360(0x7f093ee8, float:1.8243086E38)
            android.view.View r6 = r5.findViewById(r6)
            r1 = r6
            android.widget.Button r1 = (android.widget.Button) r1
            fp0.f r2 = new fp0.f
            r2.<init>(r5)
            r1.setOnClickListener(r2)
            gy3.C87412m.m108593f(r6, r0)
            android.widget.Button r6 = (android.widget.Button) r6
            r5.f252573p0 = r6
            android.text.TextPaint r6 = r6.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106191k0(r6)
            android.view.View r6 = r5.findViewById(r7)
            java.lang.String r7 = "findViewById(R.id.button_group)"
            gy3.C87412m.m108593f(r6, r7)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r5.f252578z = r6
            return
        L_0x01c4:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x01c8:
            gy3.C87412m.m108603p(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: fp0.C87032c.<init>(com.tencent.mm.plugin.appbrand.g, yq0.l$c):void");
    }

    /* renamed from: S */
    public static final ArrayList m108057S(C87032c cVar, boolean z) {
        String str;
        String str2;
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(cVar.f252564N)) {
            arrayList.add(cVar.f252564N);
        } else {
            C87330d0 d0Var = cVar.f252567R;
            if (d0Var != null) {
                List<C87330d0.C87331a> list = d0Var.f253099d;
                if (list.size() == 1) {
                    C87330d0.C87331a aVar = list.get(0);
                    if (!(aVar == null || (str2 = aVar.f253105d) == null)) {
                        arrayList.add(str2);
                    }
                } else {
                    for (C87330d0.C87331a aVar2 : list) {
                        if ((aVar2 != null && aVar2.f253107f == z) && (str = aVar2.f253105d) != null) {
                            arrayList.add(str);
                        }
                    }
                }
            } else {
                C87412m.m108603p("mAdapter");
                throw null;
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final C87330d0.C87331a getSelectedItem() {
        C87330d0 d0Var = this.f252567R;
        if (d0Var != null) {
            for (C87330d0.C87331a next : d0Var.f253099d) {
                boolean z = true;
                if (next == null || !next.f253107f) {
                    z = false;
                    continue;
                }
                if (z) {
                    return next;
                }
            }
            return null;
        }
        C87412m.m108603p("mAdapter");
        throw null;
    }

    /* renamed from: U */
    public final void mo121438U() {
        C91566l.C91570c cVar = this.f252552B;
        if (cVar != null) {
            C91566l.C91570c.C91571a.m114908a(cVar, 3, new ArrayList(), 0, false, 12, (Object) null);
        }
        C81879g gVar = this.f252576x0;
        if (gVar != null) {
            mo121452s(gVar);
        } else {
            C87412m.m108603p("component");
            throw null;
        }
    }

    public void dispatchConfigurationChanged(Configuration configuration) {
        super.dispatchConfigurationChanged(configuration);
        RelativeLayout relativeLayout = this.f252577y;
        if (relativeLayout != null) {
            relativeLayout.addOnLayoutChangeListener(new C87034b(this));
        } else {
            C87412m.m108603p("requestContainer");
            throw null;
        }
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (C107207u.C107211e.m145207b(this)) {
            boolean z = false;
            if (keyEvent != null && 4 == keyEvent.getKeyCode()) {
                z = true;
            }
            if (z && (keyDispatcherState = getKeyDispatcherState()) != null) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    keyDispatcherState.startTracking(keyEvent, this);
                    return true;
                } else if (1 == keyEvent.getAction() && !keyEvent.isCanceled() && keyDispatcherState.isTracking(keyEvent)) {
                    mo121438U();
                    return true;
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.f252553C = MotionEvent.obtain(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public String getAppBrandName() {
        return this.f252555E;
    }

    public String getApplyWording() {
        return this.f252561K;
    }

    public String getIconUrl() {
        return this.f252563M;
    }

    public C87330d0.C87332b getItemCheckedListener() {
        return this.f252569T;
    }

    public MotionEvent getLastPointerDownTouchEvent() {
        return this.f252553C;
    }

    public final C91566l.C91570c getListener() {
        return this.f252552B;
    }

    public String getRequestDesc() {
        return this.f252557G;
    }

    public String getSimpleDetailDesc() {
        return this.f252559I;
    }

    /* renamed from: n */
    public C91072j mo121450n(C81879g gVar, String str, C40469j0 j0Var) {
        C87412m.m108594g(gVar, "component");
        Context context = gVar.getContext();
        C87412m.m108593f(context, "component.context");
        C87060l lVar = new C87060l(context);
        lVar.setExplainContent(str);
        return lVar;
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo121451o(com.tencent.p014mm.plugin.appbrand.C81879g r6) {
        /*
            r5 = this;
            java.lang.String r0 = "component"
            gy3.C87412m.m108594g(r6, r0)
            r5.f252576x0 = r6
            android.content.Context r1 = r6.getContext()
            boolean r2 = r1 instanceof android.app.Activity
            r3 = 0
            if (r2 == 0) goto L_0x0013
            android.app.Activity r1 = (android.app.Activity) r1
            goto L_0x0014
        L_0x0013:
            r1 = r3
        L_0x0014:
            if (r1 == 0) goto L_0x002a
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r1.findViewById(r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L_0x002a
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r4 = -1
            r2.<init>(r4, r4)
            r1.addView(r5, r2)
        L_0x002a:
            r5.bringToFront()
            r1 = 1
            r5.setFocusable(r1)
            r5.setFocusableInTouchMode(r1)
            r5.requestFocus()
            android.view.ViewTreeObserver r2 = r5.getViewTreeObserver()
            fp0.c$c r4 = new fp0.c$c
            r4.<init>(r5, r6)
            r2.addOnPreDrawListener(r4)
            int r6 = r5.f252574w
            boolean r2 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            r2 = r2 ^ r1
            r5.mo122168R(r6, r2, r1)
            int r6 = r5.f252574w
            r5.setBackgroundColor(r6)
            com.tencent.mm.plugin.appbrand.g r6 = r5.f252576x0
            if (r6 == 0) goto L_0x0069
            android.content.Context r6 = r6.getContext()
            boolean r0 = r6 instanceof com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI
            if (r0 == 0) goto L_0x0061
            r3 = r6
            com.tencent.mm.plugin.appbrand.ui.AppBrandUI r3 = (com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI) r3
        L_0x0061:
            if (r3 == 0) goto L_0x0068
            int r6 = r5.f252574w
            com.tencent.p014mm.plugin.appbrand.p026ui.wxa_container.AppBrandContainerFragmentActivity.m104355N7(r3, r6)
        L_0x0068:
            return
        L_0x0069:
            gy3.C87412m.m108603p(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: fp0.C87032c.mo121451o(com.tencent.mm.plugin.appbrand.g):void");
    }

    /* renamed from: s */
    public void mo121452s(C81879g gVar) {
        C87412m.m108594g(gVar, "component");
        animate().cancel();
        animate().translationY((float) getMeasuredHeight()).setDuration(300).withEndAction(new C87033a(this)).start();
    }

    public void setAppBrandName(String str) {
        this.f252555E = str;
        TextView textView = this.f252554D;
        if (textView != null) {
            textView.setText(str);
        } else {
            C87412m.m108603p("mNameTv");
            throw null;
        }
    }

    public void setApplyWording(String str) {
        this.f252561K = str;
        TextView textView = this.f252560J;
        if (textView != null) {
            textView.setText(str);
        } else {
            C87412m.m108603p("mApplyWordingTv");
            throw null;
        }
    }

    public void setExplainOnClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f252570U;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        } else {
            C87412m.m108603p("mExplainIv");
            throw null;
        }
    }

    public void setFunctionButtonOnClickListener(View.OnClickListener onClickListener) {
        TextView textView = this.f252571V;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        } else {
            C87412m.m108603p("funcTv");
            throw null;
        }
    }

    public void setFunctionButtonText(String str) {
        if (TextUtils.isEmpty(str)) {
            TextView textView = this.f252571V;
            if (textView != null) {
                textView.setText("");
                TextView textView2 = this.f252571V;
                if (textView2 != null) {
                    textView2.setVisibility(4);
                } else {
                    C87412m.m108603p("funcTv");
                    throw null;
                }
            } else {
                C87412m.m108603p("funcTv");
                throw null;
            }
        } else {
            TextView textView3 = this.f252571V;
            if (textView3 != null) {
                textView3.setText(str);
                TextView textView4 = this.f252571V;
                if (textView4 != null) {
                    textView4.setVisibility(0);
                } else {
                    C87412m.m108603p("funcTv");
                    throw null;
                }
            } else {
                C87412m.m108603p("funcTv");
                throw null;
            }
        }
    }

    public void setFunctionButtonTextColor(int i) {
        TextView textView = this.f252571V;
        if (textView != null) {
            textView.setTextColor(i);
        } else {
            C87412m.m108603p("funcTv");
            throw null;
        }
    }

    public void setFunctionButtonVisibility(int i) {
        TextView textView = this.f252571V;
        if (textView != null) {
            textView.setVisibility(i);
        } else {
            C87412m.m108603p("funcTv");
            throw null;
        }
    }

    public void setIExternalToolsHelper(C40469j0 j0Var) {
        C87350h hVar = this.f252551A;
        if (hVar != null) {
            hVar.f253171j = j0Var;
        } else {
            C87412m.m108603p("userAgreementComponent");
            throw null;
        }
    }

    public void setIconUrl(String str) {
        this.f252563M = str;
        String str2 = C88394b.f255384g;
        C88394b bVar = C88394b.C88418q.f255427a;
        ImageView imageView = this.f252562L;
        if (imageView != null) {
            bVar.mo122785a(imageView, getIconUrl(), C0966R.C0969drawable.c8n, C88431k.f255437d);
        } else {
            C87412m.m108603p("mIconIv");
            throw null;
        }
    }

    public void setItemCheckedListener(C87330d0.C87332b bVar) {
        this.f252569T = bVar;
        C87330d0 d0Var = this.f252567R;
        if (d0Var != null) {
            d0Var.f253100e = bVar;
        } else {
            C87412m.m108603p("mAdapter");
            throw null;
        }
    }

    public final void setListener(C91566l.C91570c cVar) {
        this.f252552B = cVar;
    }

    public void setNegativeButtonText(String str) {
        if (!(str == null || str.length() == 0)) {
            Button button = this.f252572W;
            if (button != null) {
                button.setText(str);
            } else {
                C87412m.m108603p("mBtnReject");
                throw null;
            }
        }
    }

    public void setOnListItemLongClickListener(C87330d0.C87333c cVar) {
        C87412m.m108594g(cVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C87330d0 d0Var = this.f252567R;
        if (d0Var != null) {
            d0Var.f253101f = cVar;
        } else {
            C87412m.m108603p("mAdapter");
            throw null;
        }
    }

    public void setPositiveButtonText(String str) {
        if (!(str == null || str.length() == 0)) {
            Button button = this.f252573p0;
            if (button != null) {
                button.setText(str);
            } else {
                C87412m.m108603p("mBtnAccept");
                throw null;
            }
        }
    }

    public void setRequestDesc(String str) {
        this.f252557G = str;
        TextView textView = this.f252556F;
        if (textView != null) {
            textView.setText(str);
        } else {
            C87412m.m108603p("mDescTv");
            throw null;
        }
    }

    public void setScope(String str) {
        C87412m.m108594g(str, "scope");
        this.f252564N = str;
    }

    public void setSelectListItem(List<C87330d0.C87331a> list) {
        if (list != null && !list.isEmpty()) {
            ((ArrayList) this.f252566Q).clear();
            ((ArrayList) this.f252566Q).addAll(list);
            C87330d0 d0Var = this.f252567R;
            if (d0Var != null) {
                d0Var.notifyDataSetChanged();
                LinearLayout linearLayout = this.f252565P;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                    String simpleDetailDesc = getSimpleDetailDesc();
                    if (simpleDetailDesc == null || simpleDetailDesc.length() == 0) {
                        TextView textView = this.f252558H;
                        if (textView != null) {
                            textView.setVisibility(8);
                        } else {
                            C87412m.m108603p("mSimpleDetailDescTv");
                            throw null;
                        }
                    }
                    View view = this.f252568S;
                    if (view != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPageJsAuthorizePresenterUIView", "setSelectListItem", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPageJsAuthorizePresenterUIView", "setSelectListItem", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return;
                    }
                    C87412m.m108603p("loadingView");
                    throw null;
                }
                C87412m.m108603p("mSelectListLayout");
                throw null;
            }
            C87412m.m108603p("mAdapter");
            throw null;
        }
    }

    public void setSimpleDetailDesc(String str) {
        this.f252559I = str;
        if (!(str == null || str.length() == 0)) {
            TextView textView = this.f252558H;
            if (textView != null) {
                textView.setText(str);
                TextView textView2 = this.f252558H;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                } else {
                    C87412m.m108603p("mSimpleDetailDescTv");
                    throw null;
                }
            } else {
                C87412m.m108603p("mSimpleDetailDescTv");
                throw null;
            }
        }
    }

    public void setUserAgreementCheckBoxWording(String str) {
        C87412m.m108594g(str, "wording");
        C87350h hVar = this.f252551A;
        if (hVar != null) {
            hVar.setUserAgreementCheckBoxWording(str);
            LinearLayout linearLayout = this.f252578z;
            if (linearLayout != null) {
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.bottomMargin = C79406f.m96347a(getContext(), 24.0f);
                layoutParams2.removeRule(12);
                return;
            }
            C87412m.m108603p("buttonGroup");
            throw null;
        }
        C87412m.m108603p("userAgreementComponent");
        throw null;
    }

    public void setUserAgreementCheckedAlertListener(C87381r0 r0Var) {
        C87350h hVar = this.f252551A;
        if (hVar != null) {
            hVar.f253173o = r0Var;
        } else {
            C87412m.m108603p("userAgreementComponent");
            throw null;
        }
    }

    /* renamed from: t */
    public void mo121473t(boolean z) {
        ImageView imageView = this.f252570U;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
            ImageView imageView2 = this.f252570U;
            if (imageView2 != null) {
                imageView2.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icon_info, C111105a.m151500b(getContext(), C0966R.color.BW_0_Alpha_0_3)));
            } else {
                C87412m.m108603p("mExplainIv");
                throw null;
            }
        } else {
            C87412m.m108603p("mExplainIv");
            throw null;
        }
    }
}
