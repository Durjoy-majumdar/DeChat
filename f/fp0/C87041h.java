package fp0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyEvent;
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
import androidx.recyclerview.widget.RecyclerView;
import br0.C79774c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C40469j0;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84967l0;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import fy3.C32224a;
import fy3.C32226l;
import gt0.C87350h;
import gt0.C87381r0;
import gy3.C87412m;
import gy3.C87413o;
import ik0.C87744a;
import in3.C87763b;
import in3.C87771d;
import j20.C117292a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k20.C60958c;
import k20.C9556a;
import lb0.C88394b;
import lb0.C88431k;
import p385u2.C111105a;
import p849e3.C107168a0;
import p849e3.C107207u;
import rx3.C13598b0;
import wq0.C91070i;
import wq0.C91072j;
import zp3.C79406f;
import zq0.C79426u;
import zq0.C91861e1;
import zq0.C91875g0;
import zq0.C91891k0;
import zq0.C91894m;
import zq0.C91910r;

/* renamed from: fp0.h */
public class C87041h extends C87763b implements C87744a {

    /* renamed from: x0 */
    public static final /* synthetic */ int f252589x0 = 0;

    /* renamed from: A */
    public Button f252590A;

    /* renamed from: B */
    public Button f252591B;

    /* renamed from: C */
    public TextView f252592C;

    /* renamed from: D */
    public TextView f252593D;

    /* renamed from: E */
    public TextView f252594E;

    /* renamed from: F */
    public LinearLayout f252595F;

    /* renamed from: G */
    public RecyclerView f252596G;

    /* renamed from: H */
    public TextView f252597H;

    /* renamed from: I */
    public View f252598I;

    /* renamed from: J */
    public LinearLayout f252599J;

    /* renamed from: K */
    public C79426u f252600K;

    /* renamed from: L */
    public C87350h f252601L;

    /* renamed from: M */
    public String f252602M;

    /* renamed from: N */
    public String f252603N;

    /* renamed from: P */
    public ArrayList<PhoneItem> f252604P;

    /* renamed from: Q */
    public C32226l<? super Boolean, C13598b0> f252605Q;

    /* renamed from: R */
    public C32224a<C13598b0> f252606R;

    /* renamed from: S */
    public C32224a<C13598b0> f252607S;

    /* renamed from: T */
    public C32224a<C13598b0> f252608T;

    /* renamed from: U */
    public C32224a<C13598b0> f252609U;

    /* renamed from: V */
    public C32224a<C13598b0> f252610V;

    /* renamed from: W */
    public C32226l<? super PhoneItem, C13598b0> f252611W;

    /* renamed from: p0 */
    public final int f252612p0;

    /* renamed from: w */
    public final C81879g f252613w;

    /* renamed from: x */
    public RelativeLayout f252614x;

    /* renamed from: y */
    public ImageView f252615y;

    /* renamed from: z */
    public TextView f252616z;

    /* renamed from: fp0.h$a */
    public static final class C87042a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C87041h f252617d;

        public C87042a(C87041h hVar) {
            this.f252617d = hVar;
        }

        public final void run() {
            C8180a.m8260a(this.f252617d);
        }
    }

    /* renamed from: fp0.h$b */
    public static final class C87043b implements View.OnLayoutChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C87041h f252618d;

        public C87043b(C87041h hVar) {
            this.f252618d = hVar;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C87412m.m108594g(view, "view");
            view.removeOnLayoutChangeListener(this);
            C87041h hVar = this.f252618d;
            RelativeLayout relativeLayout = hVar.f252614x;
            if (relativeLayout != null) {
                relativeLayout.getViewTreeObserver().addOnPreDrawListener(new C87040g(relativeLayout, hVar));
            } else {
                C87412m.m108603p("mRootView");
                throw null;
            }
        }
    }

    /* renamed from: fp0.h$c */
    public static final class C87044c extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public static final C87044c f252619d = new C87044c();

        public C87044c() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fp0.h$d */
    public static final class C87045d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C87045d f252620d = new C87045d();

        public C87045d() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fp0.h$e */
    public static final class C87046e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C87046e f252621d = new C87046e();

        public C87046e() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fp0.h$f */
    public static final class C87047f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C87047f f252622d = new C87047f();

        public C87047f() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fp0.h$g */
    public static final class C87048g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C87048g f252623d = new C87048g();

        public C87048g() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fp0.h$h */
    public static final class C87049h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C87049h f252624d = new C87049h();

        public C87049h() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fp0.h$i */
    public static final class C87050i extends C87413o implements C32226l<PhoneItem, C13598b0> {

        /* renamed from: d */
        public static final C87050i f252625d = new C87050i();

        public C87050i() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((PhoneItem) obj, "<anonymous parameter 0>");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fp0.h$j */
    public static final class C87051j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C87041h f252626d;

        /* renamed from: fp0.h$j$a */
        public static final class C87052a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C87041h f252627d;

            public C87052a(C87041h hVar) {
                this.f252627d = hVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$phoneItems$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                this.f252627d.getOnAddPhoneNumber().invoke();
                C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$phoneItems$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: fp0.h$j$b */
        public static final class C87053b implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C87041h f252628d;

            public C87053b(C87041h hVar) {
                this.f252628d = hVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$phoneItems$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                this.f252628d.getOnManagePhoneNumber().invoke();
                C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$phoneItems$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C87051j(C87041h hVar) {
            this.f252626d = hVar;
        }

        public final void run() {
            C87041h hVar = this.f252626d;
            String appId = hVar.f252613w.getAppId();
            C87412m.m108593f(appId, "component.appId");
            Context context = this.f252626d.getContext();
            C87412m.m108593f(context, "context");
            hVar.f252600K = new C79426u(appId, context, this.f252626d.getPhoneItems());
            C87041h hVar2 = this.f252626d;
            RecyclerView recyclerView = hVar2.f252596G;
            if (recyclerView != null) {
                C79426u uVar = hVar2.f252600K;
                if (uVar != null) {
                    recyclerView.setAdapter(uVar);
                    LinearLayout linearLayout = this.f252626d.f252595F;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                        if (this.f252626d.getPhoneItems().size() == 0) {
                            View view = this.f252626d.f252598I;
                            if (view != null) {
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(0);
                                View view2 = view;
                                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                RecyclerView recyclerView2 = this.f252626d.f252596G;
                                if (recyclerView2 != null) {
                                    recyclerView2.setVisibility(8);
                                    TextView textView = this.f252626d.f252597H;
                                    if (textView != null) {
                                        textView.setVisibility(8);
                                    } else {
                                        C87412m.m108603p("mFuncTv");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("mRecyclerView");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("mLoadingView");
                                throw null;
                            }
                        } else if (this.f252626d.getPhoneItems().size() == 1) {
                            View view3 = this.f252626d.f252598I;
                            if (view3 != null) {
                                C9556a aVar2 = new C9556a();
                                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                aVar2.mo10233c(8);
                                View view4 = view3;
                                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                C117292a.m165359e(view4, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                RecyclerView recyclerView3 = this.f252626d.f252596G;
                                if (recyclerView3 != null) {
                                    recyclerView3.setVisibility(0);
                                    RecyclerView recyclerView4 = this.f252626d.f252596G;
                                    if (recyclerView4 != null) {
                                        RecyclerView.C16613e adapter = recyclerView4.getAdapter();
                                        if (adapter != null) {
                                            adapter.notifyDataSetChanged();
                                        }
                                        TextView textView2 = this.f252626d.f252597H;
                                        if (textView2 != null) {
                                            textView2.setVisibility(0);
                                            C87041h hVar3 = this.f252626d;
                                            TextView textView3 = hVar3.f252597H;
                                            if (textView3 != null) {
                                                textView3.setText(hVar3.getContext().getString(C0966R.string.a85));
                                                C87041h hVar4 = this.f252626d;
                                                TextView textView4 = hVar4.f252597H;
                                                if (textView4 != null) {
                                                    textView4.setOnClickListener(new C87052a(hVar4));
                                                    C91910r rVar = C91875g0.f263042b;
                                                    if (rVar == null) {
                                                        rVar = new C91894m();
                                                    }
                                                    if (!rVar.mo125728i()) {
                                                        TextView textView5 = this.f252626d.f252597H;
                                                        if (textView5 != null) {
                                                            textView5.setVisibility(8);
                                                        } else {
                                                            C87412m.m108603p("mFuncTv");
                                                            throw null;
                                                        }
                                                    }
                                                } else {
                                                    C87412m.m108603p("mFuncTv");
                                                    throw null;
                                                }
                                            } else {
                                                C87412m.m108603p("mFuncTv");
                                                throw null;
                                            }
                                        } else {
                                            C87412m.m108603p("mFuncTv");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("mRecyclerView");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("mRecyclerView");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("mLoadingView");
                                throw null;
                            }
                        } else {
                            View view5 = this.f252626d.f252598I;
                            if (view5 != null) {
                                C9556a aVar3 = new C9556a();
                                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                                aVar3.mo10233c(8);
                                View view6 = view5;
                                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                C117292a.m165359e(view6, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                RecyclerView recyclerView5 = this.f252626d.f252596G;
                                if (recyclerView5 != null) {
                                    recyclerView5.setVisibility(0);
                                    TextView textView6 = this.f252626d.f252597H;
                                    if (textView6 != null) {
                                        textView6.setVisibility(0);
                                        RecyclerView recyclerView6 = this.f252626d.f252596G;
                                        if (recyclerView6 != null) {
                                            RecyclerView.C16613e adapter2 = recyclerView6.getAdapter();
                                            if (adapter2 != null) {
                                                adapter2.notifyDataSetChanged();
                                            }
                                            C87041h hVar5 = this.f252626d;
                                            TextView textView7 = hVar5.f252597H;
                                            if (textView7 != null) {
                                                textView7.setText(hVar5.getContext().getString(C0966R.string.f360122a83));
                                                C87041h hVar6 = this.f252626d;
                                                TextView textView8 = hVar6.f252597H;
                                                if (textView8 != null) {
                                                    textView8.setOnClickListener(new C87053b(hVar6));
                                                    C91910r rVar2 = C91875g0.f263042b;
                                                    if (rVar2 == null) {
                                                        rVar2 = new C91894m();
                                                    }
                                                    if (!rVar2.mo125728i()) {
                                                        TextView textView9 = this.f252626d.f252597H;
                                                        if (textView9 != null) {
                                                            textView9.setVisibility(8);
                                                        } else {
                                                            C87412m.m108603p("mFuncTv");
                                                            throw null;
                                                        }
                                                    }
                                                } else {
                                                    C87412m.m108603p("mFuncTv");
                                                    throw null;
                                                }
                                            } else {
                                                C87412m.m108603p("mFuncTv");
                                                throw null;
                                            }
                                        } else {
                                            C87412m.m108603p("mRecyclerView");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("mFuncTv");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("mRecyclerView");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("mLoadingView");
                                throw null;
                            }
                        }
                    } else {
                        C87412m.m108603p("mContentLayout");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mItemAdapter");
                    throw null;
                }
            } else {
                C87412m.m108603p("mRecyclerView");
                throw null;
            }
        }
    }

    /* renamed from: fp0.h$k */
    public static final class C87054k implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: d */
        public final /* synthetic */ View f252629d;

        /* renamed from: e */
        public final /* synthetic */ C81879g f252630e;

        public C87054k(View view, C81879g gVar) {
            this.f252629d = view;
            this.f252630e = gVar;
        }

        public boolean onPreDraw() {
            this.f252629d.getViewTreeObserver().removeOnPreDrawListener(this);
            View view = this.f252629d;
            view.setTranslationY((float) view.getMeasuredHeight());
            ViewPropertyAnimator duration = view.animate().setInterpolator(new AccelerateDecelerateInterpolator()).translationY(0.0f).setDuration(300);
            duration.setListener(new C87055l(this.f252630e));
            duration.start();
            return true;
        }
    }

    /* renamed from: fp0.h$l */
    public static final class C87055l extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C81879g f252631d;

        public C87055l(C81879g gVar) {
            this.f252631d = gVar;
        }

        public void onAnimationEnd(Animator animator) {
            Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(this.f252631d.getContext());
            if (castActivityOrNull != null) {
                C87771d.m109203b(castActivityOrNull).mo122181e();
            }
        }
    }

    /* renamed from: fp0.h$m */
    public static final class C87056m implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C87041h f252632d;

        public C87056m(C87041h hVar) {
            this.f252632d = hVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$showPrivacyExplainEntry$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f252632d.getOnExplain().invoke();
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$showPrivacyExplainEntry$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C87041h(com.tencent.p014mm.plugin.appbrand.C81879g r8) {
        /*
            r7 = this;
            java.lang.String r0 = "component"
            gy3.C87412m.m108594g(r8, r0)
            android.content.Context r0 = r8.getContext()
            if (r0 != 0) goto L_0x000f
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
        L_0x000f:
            r7.<init>(r0)
            r7.f252613w = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r7.f252604P = r8
            fp0.h$c r8 = fp0.C87041h.C87044c.f252619d
            r7.f252605Q = r8
            fp0.h$f r8 = fp0.C87041h.C87047f.f252622d
            r7.f252606R = r8
            fp0.h$e r8 = fp0.C87041h.C87046e.f252621d
            r7.f252607S = r8
            fp0.h$g r8 = fp0.C87041h.C87048g.f252623d
            r7.f252608T = r8
            fp0.h$d r8 = fp0.C87041h.C87045d.f252620d
            r7.f252609U = r8
            fp0.h$h r8 = fp0.C87041h.C87049h.f252624d
            r7.f252610V = r8
            fp0.h$i r8 = fp0.C87041h.C87050i.f252625d
            r7.f252611W = r8
            android.content.Context r8 = r7.getContext()
            r0 = 2131101833(0x7f060889, float:1.7816087E38)
            int r8 = p385u2.C111105a.m151500b(r8, r0)
            r7.f252612p0 = r8
            android.content.Context r8 = r7.getContext()
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r8)
            r0 = 2131493070(0x7f0c00ce, float:1.860961E38)
            r1 = 1
            r8.inflate(r0, r7, r1)
            r8 = 2131298557(0x7f0908fd, float:1.821509E38)
            android.view.View r0 = r7.findViewById(r8)
            java.lang.String r1 = "findViewById<View>(R.id.button_group)"
            gy3.C87412m.m108593f(r0, r1)
            fp0.C8180a.m8260a(r0)
            r0 = 2131312353(0x7f093ee1, float:1.8243072E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            android.content.Context r1 = r7.getContext()
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
            r7.f252614x = r0
            gt0.h r0 = new gt0.h
            android.content.Context r1 = r7.getContext()
            java.lang.String r2 = "context"
            gy3.C87412m.m108593f(r1, r2)
            android.widget.RelativeLayout r2 = r7.f252614x
            java.lang.String r3 = "mRootView"
            r5 = 0
            if (r2 == 0) goto L_0x0232
            r6 = 2131316005(0x7f094d25, float:1.825048E38)
            android.view.View r2 = r2.findViewById(r6)
            java.lang.String r6 = "mRootView.findViewById(\n…id.user_agreement_layout)"
            gy3.C87412m.m108593f(r2, r6)
            r0.<init>(r1, r2)
            r7.f252601L = r0
            android.widget.RelativeLayout r0 = r7.f252614x
            if (r0 == 0) goto L_0x022e
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            fp0.g r2 = new fp0.g
            r2.<init>(r0, r7)
            r1.addOnPreDrawListener(r2)
            r0 = 2131305321(0x7f092369, float:1.822881E38)
            android.view.View r0 = r7.findViewById(r0)
            fp0.i r1 = new fp0.i
            r1.<init>(r7)
            r0.setOnClickListener(r1)
            android.widget.RelativeLayout r0 = r7.f252614x
            if (r0 == 0) goto L_0x022a
            r1 = 2131312357(0x7f093ee5, float:1.824308E38)
            android.view.View r0 = r0.findViewById(r1)
            java.lang.String r1 = "mRootView.findViewById(R.id.request_icon)"
            gy3.C87412m.m108593f(r0, r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7.f252615y = r0
            android.widget.RelativeLayout r0 = r7.f252614x
            if (r0 == 0) goto L_0x0226
            r1 = 2131312359(0x7f093ee7, float:1.8243084E38)
            android.view.View r0 = r0.findViewById(r1)
            java.lang.String r1 = "mRootView.findViewById(R.id.request_name)"
            gy3.C87412m.m108593f(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.f252616z = r0
            android.widget.RelativeLayout r0 = r7.f252614x
            if (r0 == 0) goto L_0x0222
            r1 = 2131312352(0x7f093ee0, float:1.824307E38)
            android.view.View r0 = r0.findViewById(r1)
            java.lang.String r1 = "mRootView.findViewById(R.id.request_cancel)"
            gy3.C87412m.m108593f(r0, r1)
            android.widget.Button r0 = (android.widget.Button) r0
            r7.f252591B = r0
            android.widget.RelativeLayout r0 = r7.f252614x
            if (r0 == 0) goto L_0x021e
            r1 = 2131312360(0x7f093ee8, float:1.8243086E38)
            android.view.View r0 = r0.findViewById(r1)
            java.lang.String r1 = "mRootView.findViewById(R.id.request_ok)"
            gy3.C87412m.m108593f(r0, r1)
            android.widget.Button r0 = (android.widget.Button) r0
            r7.f252590A = r0
            android.text.TextPaint r0 = r0.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106191k0(r0)
            android.widget.RelativeLayout r0 = r7.f252614x
            if (r0 == 0) goto L_0x021a
            r1 = 2131312355(0x7f093ee3, float:1.8243076E38)
            android.view.View r0 = r0.findViewById(r1)
            java.lang.String r1 = "mRootView.findViewById(c…ll_sdk.R.id.request_desc)"
            gy3.C87412m.m108593f(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.f252592C = r0
            android.widget.RelativeLayout r0 = r7.f252614x
            if (r0 == 0) goto L_0x0216
            r1 = 2131313584(0x7f0943b0, float:1.8245569E38)
            android.view.View r0 = r0.findViewById(r1)
            java.lang.String r1 = "mRootView.findViewById(c….R.id.simple_detail_desc)"
            gy3.C87412m.m108593f(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.f252593D = r0
            android.widget.RelativeLayout r0 = r7.f252614x
            if (r0 == 0) goto L_0x0212
            android.view.View r0 = r0.findViewById(r4)
            java.lang.String r1 = "mRootView.findViewById(c…sdk.R.id.request_content)"
            gy3.C87412m.m108593f(r0, r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r7.f252595F = r0
            android.widget.RelativeLayout r0 = r7.f252614x
            if (r0 == 0) goto L_0x020e
            r1 = 2131312351(0x7f093edf, float:1.8243068E38)
            android.view.View r0 = r0.findViewById(r1)
            java.lang.String r1 = "mRootView.findViewById(R.id.request_apply_wording)"
            gy3.C87412m.m108593f(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.f252594E = r0
            android.widget.RelativeLayout r0 = r7.f252614x
            if (r0 == 0) goto L_0x020a
            r1 = 2131312361(0x7f093ee9, float:1.8243088E38)
            android.view.View r0 = r0.findViewById(r1)
            java.lang.String r1 = "mRootView.findViewById(R.id.request_recyclerview)"
            gy3.C87412m.m108593f(r0, r1)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r7.f252596G = r0
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r7.getContext()
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            android.widget.RelativeLayout r0 = r7.f252614x
            if (r0 == 0) goto L_0x0206
            r1 = 2131312358(0x7f093ee6, float:1.8243082E38)
            android.view.View r0 = r0.findViewById(r1)
            java.lang.String r1 = "mRootView.findViewById(c…sdk.R.id.request_loading)"
            gy3.C87412m.m108593f(r0, r1)
            r7.f252598I = r0
            android.widget.RelativeLayout r0 = r7.f252614x
            if (r0 == 0) goto L_0x0202
            r1 = 2131312356(0x7f093ee4, float:1.8243078E38)
            android.view.View r0 = r0.findViewById(r1)
            java.lang.String r1 = "mRootView.findViewById(R.id.request_function)"
            gy3.C87412m.m108593f(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.f252597H = r0
            android.widget.Button r0 = r7.f252590A
            if (r0 == 0) goto L_0x01fc
            fp0.j r1 = new fp0.j
            r1.<init>(r7)
            r0.setOnClickListener(r1)
            android.widget.Button r0 = r7.f252591B
            if (r0 == 0) goto L_0x01f6
            fp0.k r1 = new fp0.k
            r1.<init>(r7)
            r0.setOnClickListener(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r7.f252596G
            if (r0 == 0) goto L_0x01f0
            r0.setItemAnimator(r5)
            android.view.View r8 = r7.findViewById(r8)
            java.lang.String r0 = "findViewById(R.id.button_group)"
            gy3.C87412m.m108593f(r8, r0)
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r7.f252599J = r8
            return
        L_0x01f0:
            java.lang.String r8 = "mRecyclerView"
            gy3.C87412m.m108603p(r8)
            throw r5
        L_0x01f6:
            java.lang.String r8 = "mBtnReject"
            gy3.C87412m.m108603p(r8)
            throw r5
        L_0x01fc:
            java.lang.String r8 = "mBtnAccept"
            gy3.C87412m.m108603p(r8)
            throw r5
        L_0x0202:
            gy3.C87412m.m108603p(r3)
            throw r5
        L_0x0206:
            gy3.C87412m.m108603p(r3)
            throw r5
        L_0x020a:
            gy3.C87412m.m108603p(r3)
            throw r5
        L_0x020e:
            gy3.C87412m.m108603p(r3)
            throw r5
        L_0x0212:
            gy3.C87412m.m108603p(r3)
            throw r5
        L_0x0216:
            gy3.C87412m.m108603p(r3)
            throw r5
        L_0x021a:
            gy3.C87412m.m108603p(r3)
            throw r5
        L_0x021e:
            gy3.C87412m.m108603p(r3)
            throw r5
        L_0x0222:
            gy3.C87412m.m108603p(r3)
            throw r5
        L_0x0226:
            gy3.C87412m.m108603p(r3)
            throw r5
        L_0x022a:
            gy3.C87412m.m108603p(r3)
            throw r5
        L_0x022e:
            gy3.C87412m.m108603p(r3)
            throw r5
        L_0x0232:
            gy3.C87412m.m108603p(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fp0.C87041h.<init>(com.tencent.mm.plugin.appbrand.g):void");
    }

    /* renamed from: E */
    public void mo121482E(boolean z) {
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.iq8);
        imageView.setVisibility(z ? 0 : 8);
        if (z) {
            imageView.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icon_info, C111105a.m151500b(getContext(), C0966R.color.BW_0_Alpha_0_3)));
            imageView.setOnClickListener(new C87056m(this));
            return;
        }
        imageView.setOnClickListener((View.OnClickListener) null);
    }

    public void dispatchConfigurationChanged(Configuration configuration) {
        super.dispatchConfigurationChanged(configuration);
        RelativeLayout relativeLayout = this.f252614x;
        if (relativeLayout != null) {
            relativeLayout.addOnLayoutChangeListener(new C87043b(this));
        } else {
            C87412m.m108603p("mRootView");
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
                    getOnCancel().invoke();
                    mo121452s(this.f252613w);
                    return true;
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    public String getAppBrandName() {
        return this.f252602M;
    }

    public String getIconUrl() {
        return this.f252603N;
    }

    public C32226l<Boolean, C13598b0> getOnAccept() {
        return this.f252605Q;
    }

    public C32224a<C13598b0> getOnAddPhoneNumber() {
        return this.f252609U;
    }

    public C32224a<C13598b0> getOnCancel() {
        return this.f252607S;
    }

    public C32224a<C13598b0> getOnDeny() {
        return this.f252606R;
    }

    public C32224a<C13598b0> getOnExplain() {
        return this.f252608T;
    }

    public C32224a<C13598b0> getOnManagePhoneNumber() {
        return this.f252610V;
    }

    public C32226l<PhoneItem, C13598b0> getOnPhoneItemSelect() {
        return this.f252611W;
    }

    public ArrayList<PhoneItem> getPhoneItems() {
        return this.f252604P;
    }

    /* renamed from: l */
    public C91070i mo121495l(C81879g gVar, String str, C91891k0 k0Var, PhoneItem phoneItem, C91910r.C91911a aVar) {
        C79774c cVar;
        C87412m.m108594g(gVar, "component");
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(phoneItem, "phoneItem");
        AppBrandRuntime runtime = gVar.getRuntime();
        if (runtime == null || (cVar = runtime.mo113054f0()) == null) {
            cVar = gVar.mo114271f0();
            C87412m.m108591d(cVar);
        }
        C79774c cVar2 = cVar;
        Context context = getContext();
        C87412m.m108593f(context, "this.context");
        return new C91861e1(context, C84967l0.m104750c(getContext()) + C74942w4.m89784a(getContext(), 250), cVar2, str, k0Var, phoneItem, aVar);
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

    /* JADX WARNING: type inference failed for: r5v4, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo121451o(com.tencent.p014mm.plugin.appbrand.C81879g r5) {
        /*
            r4 = this;
            java.lang.String r0 = "component"
            gy3.C87412m.m108594g(r5, r0)
            android.content.Context r0 = r5.getContext()
            boolean r1 = r0 instanceof android.app.Activity
            r2 = 0
            if (r1 == 0) goto L_0x0011
            android.app.Activity r0 = (android.app.Activity) r0
            goto L_0x0012
        L_0x0011:
            r0 = r2
        L_0x0012:
            if (r0 == 0) goto L_0x0028
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L_0x0028
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r3 = -1
            r1.<init>(r3, r3)
            r0.addView(r4, r1)
        L_0x0028:
            r4.bringToFront()
            r0 = 1
            r4.setFocusable(r0)
            r4.setFocusableInTouchMode(r0)
            r4.requestFocus()
            android.view.ViewTreeObserver r1 = r4.getViewTreeObserver()
            fp0.h$k r3 = new fp0.h$k
            r3.<init>(r4, r5)
            r1.addOnPreDrawListener(r3)
            int r5 = r4.f252612p0
            boolean r1 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            r1 = r1 ^ r0
            r4.mo122168R(r5, r1, r0)
            int r5 = r4.f252612p0
            r4.setBackgroundColor(r5)
            com.tencent.mm.plugin.appbrand.g r5 = r4.f252613w
            android.content.Context r5 = r5.getContext()
            boolean r0 = r5 instanceof com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI
            if (r0 == 0) goto L_0x005d
            r2 = r5
            com.tencent.mm.plugin.appbrand.ui.AppBrandUI r2 = (com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI) r2
        L_0x005d:
            if (r2 == 0) goto L_0x0064
            int r5 = r4.f252612p0
            com.tencent.p014mm.plugin.appbrand.p026ui.wxa_container.AppBrandContainerFragmentActivity.m104355N7(r2, r5)
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fp0.C87041h.mo121451o(com.tencent.mm.plugin.appbrand.g):void");
    }

    /* renamed from: s */
    public void mo121452s(C81879g gVar) {
        C87412m.m108594g(gVar, "component");
        animate().cancel();
        animate().translationY((float) getMeasuredHeight()).setDuration(300).withEndAction(new C87042a(this)).start();
    }

    public void setAppBrandName(String str) {
        this.f252602M = str;
        TextView textView = this.f252616z;
        if (textView != null) {
            if (str == null) {
                str = "";
            }
            textView.setText(str);
            return;
        }
        C87412m.m108603p("mNameTv");
        throw null;
    }

    public void setDialogApplyWording(String str) {
        C87412m.m108594g(str, "wording");
        TextView textView = this.f252594E;
        if (textView != null) {
            int i = 0;
            if (!(str.length() > 0)) {
                i = 8;
            }
            textView.setVisibility(i);
            TextView textView2 = this.f252594E;
            if (textView2 != null) {
                textView2.setText(str);
            } else {
                C87412m.m108603p("mApplyWordingTv");
                throw null;
            }
        } else {
            C87412m.m108603p("mApplyWordingTv");
            throw null;
        }
    }

    public void setDialogRequestDesc(String str) {
        C87412m.m108594g(str, "wording");
        if (str.length() > 0) {
            TextView textView = this.f252592C;
            if (textView != null) {
                textView.setText(str);
                TextView textView2 = this.f252592C;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                } else {
                    C87412m.m108603p("mRequestDescTv");
                    throw null;
                }
            } else {
                C87412m.m108603p("mRequestDescTv");
                throw null;
            }
        }
    }

    public void setDialogSubDesc(String str) {
        C87412m.m108594g(str, "desc");
        if (str.length() > 0) {
            TextView textView = this.f252593D;
            if (textView != null) {
                textView.setText(str);
                TextView textView2 = this.f252593D;
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

    public void setIExternalToolsHelper(C40469j0 j0Var) {
        C87350h hVar = this.f252601L;
        if (hVar != null) {
            hVar.f253171j = j0Var;
        } else {
            C87412m.m108603p("userAgreementComponent");
            throw null;
        }
    }

    public void setIconUrl(String str) {
        this.f252603N = str;
        String str2 = C88394b.f255384g;
        C88394b bVar = C88394b.C88418q.f255427a;
        ImageView imageView = this.f252615y;
        if (imageView != null) {
            bVar.mo122785a(imageView, getIconUrl(), C0966R.C0969drawable.c8n, C88431k.f255437d);
        } else {
            C87412m.m108603p("mIconIv");
            throw null;
        }
    }

    public void setOnAccept(C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(lVar, "value");
        this.f252605Q = lVar;
        Button button = this.f252590A;
        if (button != null) {
            CharSequence text = button.getText();
            if (text == null || text.length() == 0) {
                Button button2 = this.f252590A;
                if (button2 != null) {
                    button2.setText(getContext().getResources().getString(C0966R.string.a8h));
                } else {
                    C87412m.m108603p("mBtnAccept");
                    throw null;
                }
            }
        } else {
            C87412m.m108603p("mBtnAccept");
            throw null;
        }
    }

    public void setOnAddPhoneNumber(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f252609U = aVar;
    }

    public void setOnCancel(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f252607S = aVar;
    }

    public void setOnDeny(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "value");
        this.f252606R = aVar;
        Button button = this.f252591B;
        if (button != null) {
            CharSequence text = button.getText();
            if (text == null || text.length() == 0) {
                Button button2 = this.f252591B;
                if (button2 != null) {
                    button2.setText(getContext().getResources().getString(C0966R.string.a8i));
                } else {
                    C87412m.m108603p("mBtnReject");
                    throw null;
                }
            }
        } else {
            C87412m.m108603p("mBtnReject");
            throw null;
        }
    }

    public void setOnExplain(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f252608T = aVar;
    }

    public void setOnManagePhoneNumber(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f252610V = aVar;
    }

    public void setOnPhoneItemSelect(C32226l<? super PhoneItem, C13598b0> lVar) {
        C87412m.m108594g(lVar, "value");
        this.f252611W = lVar;
        Button button = this.f252590A;
        if (button != null) {
            CharSequence text = button.getText();
            if (text == null || text.length() == 0) {
                Button button2 = this.f252590A;
                if (button2 != null) {
                    button2.setText(getContext().getResources().getString(C0966R.string.a8h));
                } else {
                    C87412m.m108603p("mBtnAccept");
                    throw null;
                }
            }
        } else {
            C87412m.m108603p("mBtnAccept");
            throw null;
        }
    }

    public void setPhoneItems(ArrayList<PhoneItem> arrayList) {
        C87412m.m108594g(arrayList, "value");
        this.f252604P = arrayList;
        this.f252613w.mo109673t(new C87051j(this));
    }

    public void setUserAgreementCheckBoxWording(String str) {
        C87412m.m108594g(str, "wording");
        C87350h hVar = this.f252601L;
        if (hVar != null) {
            hVar.setUserAgreementCheckBoxWording(str);
            LinearLayout linearLayout = this.f252599J;
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
        C87350h hVar = this.f252601L;
        if (hVar != null) {
            hVar.f253173o = r0Var;
        } else {
            C87412m.m108603p("userAgreementComponent");
            throw null;
        }
    }
}
