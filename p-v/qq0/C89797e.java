package qq0;

import ak0.C79584a;
import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import br0.C39836d;
import br0.C79773b;
import bt0.b$$j;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83817h4;
import com.tencent.p014mm.plugin.appbrand.page.capsulebar.AppBrandCapsuleBarPlaceHolderView;
import gy3.C87412m;
import li0.C88509c;

/* renamed from: qq0.e */
public final class C89797e {

    /* renamed from: a */
    public final AppBrandRuntime f258186a;

    /* renamed from: b */
    public C89795c f258187b;

    /* renamed from: c */
    public C89796d f258188c;

    /* renamed from: d */
    public C89811p f258189d;

    /* renamed from: e */
    public int f258190e;

    /* renamed from: f */
    public C89814s f258191f;

    /* renamed from: g */
    public C89790a f258192g;

    /* renamed from: h */
    public final C89800b f258193h = new C89800b();

    /* renamed from: i */
    public C83780d1 f258194i;

    /* renamed from: qq0.e$a */
    public final class C89798a extends C79773b implements b$$j, View.OnLayoutChangeListener {

        /* renamed from: d */
        public final C83780d1 f258195d;

        /* renamed from: e */
        public int f258196e = -1;

        /* renamed from: f */
        public View.OnClickListener f258197f;

        /* renamed from: g */
        public View.OnClickListener f258198g;

        /* renamed from: h */
        public boolean f258199h;

        /* renamed from: i */
        public final /* synthetic */ C89797e f258200i;

        /* renamed from: qq0.e$a$a */
        public static final class C89799a implements C82531i.C82534c {

            /* renamed from: d */
            public final /* synthetic */ C89797e f258201d;

            /* renamed from: e */
            public final /* synthetic */ C89798a f258202e;

            public C89799a(C89797e eVar, C89798a aVar) {
                this.f258201d = eVar;
                this.f258202e = aVar;
            }

            public final void onDestroy() {
                C89797e eVar = this.f258201d;
                C83780d1 d1Var = this.f258202e.f258195d;
                C89798a aVar = null;
                if (C87412m.m108589b(d1Var, eVar.f258194i)) {
                    eVar.f258194i = null;
                }
                C89800b bVar = eVar.f258193h;
                bVar.getClass();
                C87412m.m108594g(d1Var, "page");
                int indexOfKey = bVar.f258203a.indexOfKey(d1Var.hashCode());
                if (indexOfKey >= 0) {
                    aVar = bVar.f258203a.valueAt(indexOfKey);
                    bVar.f258203a.removeAt(indexOfKey);
                }
                if (aVar != null) {
                    aVar.mo124094h();
                }
            }
        }

        public C89798a(C89797e eVar, C83780d1 d1Var) {
            C87412m.m108594g(d1Var, "page");
            this.f258200i = eVar;
            this.f258195d = d1Var;
            d1Var.mo114865m(new C89799a(eVar, this));
            d1Var.f244554F.setCapsuleBarInteractionDelegate(this);
        }

        /* renamed from: a */
        public void mo109609a(int i) {
            this.f258196e = i;
            if (this.f258199h) {
                C89796d dVar = this.f258200i.f258188c;
                if (dVar != null) {
                    dVar.setStyleColor(i);
                } else {
                    C87412m.m108603p("capsuleBarView");
                    throw null;
                }
            }
        }

        /* renamed from: b */
        public void mo109610b(View.OnClickListener onClickListener) {
            this.f258197f = onClickListener;
            if (this.f258199h) {
                C89796d dVar = this.f258200i.f258188c;
                if (dVar != null) {
                    dVar.setHomeButtonOnClickListener(onClickListener);
                } else {
                    C87412m.m108603p("capsuleBarView");
                    throw null;
                }
            }
        }

        /* renamed from: c */
        public void mo109611c(View.OnClickListener onClickListener) {
            this.f258198g = onClickListener;
            if (this.f258199h) {
                C89796d dVar = this.f258200i.f258188c;
                if (dVar != null) {
                    dVar.setOptionButtonOnClickListener(onClickListener);
                } else {
                    C87412m.m108603p("capsuleBarView");
                    throw null;
                }
            }
        }

        /* renamed from: d */
        public void mo109612d(int i) {
            mo124093g();
        }

        /* renamed from: e */
        public void mo109900e() {
            C89797e eVar = this.f258200i;
            C89814s sVar = eVar.f258191f;
            if (sVar != null) {
                Animator animator = sVar.f258218e;
                if (animator != null) {
                    animator.pause();
                }
                eVar.mo124089b().setVisibility(4);
                return;
            }
            C87412m.m108603p("blinkWrapper");
            throw null;
        }

        /* renamed from: f */
        public void mo109901f() {
            C89797e eVar = this.f258200i;
            C89814s sVar = eVar.f258191f;
            if (sVar != null) {
                Animator animator = sVar.f258218e;
                if (animator != null) {
                    animator.resume();
                }
                eVar.mo124089b().setVisibility(0);
                return;
            }
            C87412m.m108603p("blinkWrapper");
            throw null;
        }

        /* JADX WARNING: type inference failed for: r2v7, types: [android.view.ViewGroup$LayoutParams] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo124093g() {
            /*
                r6 = this;
                qq0.e r0 = r6.f258200i
                qq0.d r0 = r0.f258188c
                r1 = 0
                if (r0 == 0) goto L_0x00c2
                android.view.View r2 = r0.getCapsuleContentAreaView()
                boolean r2 = r2.isLaidOut()
                if (r2 == 0) goto L_0x0026
                com.tencent.mm.plugin.appbrand.page.d1 r2 = r6.f258195d
                bt0.b r2 = r2.f244554F
                com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandCapsuleBarPlaceHolderView r2 = r2.getCapsuleView()
                if (r2 == 0) goto L_0x0026
                android.view.View r3 = r0.getCapsuleContentAreaView()
                int r3 = r3.getMeasuredWidth()
                r2.setFixedWidth(r3)
            L_0x0026:
                com.tencent.mm.plugin.appbrand.page.d1 r2 = r6.f258195d
                bt0.b r2 = r2.f244554F
                com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandCapsuleBarPlaceHolderView r2 = r2.getCapsuleView()
                if (r2 == 0) goto L_0x005a
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                if (r2 == 0) goto L_0x005a
                qq0.e r3 = r6.f258200i
                android.view.View r4 = r0.getCapsuleContentAreaView()
                r5 = 21
                r3.getClass()
                boolean r3 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
                if (r3 == 0) goto L_0x004d
                android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
                android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
                r3.<init>(r2)
                goto L_0x0052
            L_0x004d:
                android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
                r3.<init>(r2)
            L_0x0052:
                r3.gravity = r5
                r2 = -2
                r3.width = r2
                r4.setLayoutParams(r3)
            L_0x005a:
                com.tencent.mm.plugin.appbrand.page.d1 r2 = r6.f258195d
                bt0.b r2 = r2.f244554F
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                boolean r3 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
                if (r3 == 0) goto L_0x0069
                r1 = r2
                android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            L_0x0069:
                if (r1 == 0) goto L_0x006e
                int r1 = r1.topMargin
                goto L_0x006f
            L_0x006e:
                r1 = 0
            L_0x006f:
                android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
                java.lang.String r3 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
                gy3.C87412m.m108592e(r2, r3)
                android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
                r2.topMargin = r1
                r1 = 5
                r2.gravity = r1
                android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
                if (r1 == 0) goto L_0x00a7
                int r2 = r1.height
                com.tencent.mm.plugin.appbrand.page.d1 r3 = r6.f258195d
                bt0.b r3 = r3.f244554F
                int r3 = r3.getMeasuredHeight()
                if (r2 == r3) goto L_0x00a7
                com.tencent.mm.plugin.appbrand.page.d1 r2 = r6.f258195d
                bt0.b r2 = r2.f244554F
                java.util.WeakHashMap<android.view.View, e3.a0> r3 = p849e3.C107207u.f320808a
                boolean r2 = p849e3.C107207u.C107211e.m145208c(r2)
                if (r2 == 0) goto L_0x00a7
                com.tencent.mm.plugin.appbrand.page.d1 r2 = r6.f258195d
                bt0.b r2 = r2.f244554F
                int r2 = r2.getMeasuredHeight()
                r1.height = r2
            L_0x00a7:
                r0.requestLayout()
                com.tencent.mm.plugin.appbrand.page.d1 r1 = r6.f258195d
                bt0.b r1 = r1.f244554F
                com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandCapsuleBarPlaceHolderView r1 = r1.getCapsuleView()
                if (r1 == 0) goto L_0x00c1
                int r1 = r1.getVisibility()
                int r2 = r0.getVisibility()
                if (r2 == r1) goto L_0x00c1
                r0.setVisibility(r1)
            L_0x00c1:
                return
            L_0x00c2:
                java.lang.String r0 = "capsuleBarView"
                gy3.C87412m.m108603p(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: qq0.C89797e.C89798a.mo124093g():void");
        }

        /* renamed from: h */
        public final void mo124094h() {
            this.f258199h = false;
            C39836d F0 = this.f258195d.mo116151F0();
            if (F0 != null) {
                F0.mo62478f(this);
            }
            C89796d dVar = this.f258200i.f258188c;
            View view = null;
            if (dVar != null) {
                dVar.removeOnLayoutChangeListener(this);
                AppBrandCapsuleBarPlaceHolderView capsuleView = this.f258195d.f244554F.getCapsuleView();
                ViewParent parent = capsuleView != null ? capsuleView.getParent() : null;
                if (parent instanceof View) {
                    view = (View) parent;
                }
                if (view != null) {
                    view.removeOnLayoutChangeListener(this);
                }
                this.f258195d.f244554F.removeOnLayoutChangeListener(this);
                return;
            }
            C87412m.m108603p("capsuleBarView");
            throw null;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (!this.f258199h) {
                return;
            }
            if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
                mo124093g();
            }
        }
    }

    /* renamed from: qq0.e$b */
    public final class C89800b {

        /* renamed from: a */
        public final SparseArray<C89798a> f258203a = new SparseArray<>();

        public C89800b() {
        }
    }

    public C89797e(AppBrandRuntime appBrandRuntime) {
        C87412m.m108594g(appBrandRuntime, "runtime");
        this.f258186a = appBrandRuntime;
    }

    /* renamed from: a */
    public final C89790a mo124088a() {
        AppBrandRuntimeWC a;
        C88509c cVar;
        C89811p pVar = this.f258189d;
        if (pVar != null) {
            C89790a aVar = this.f258192g;
            if (aVar != null) {
                AppBrandRuntimeWC.C8109126 r0 = (AppBrandRuntimeWC.C8109126) pVar;
                AppBrandRuntimeWC appBrandRuntimeWC = AppBrandRuntimeWC.this;
                C79584a.C79585a aVar2 = C79584a.f233382a;
                if (!aVar2.mo109699b(appBrandRuntimeWC) || (a = aVar2.mo109698a(AppBrandRuntimeWC.this)) == null) {
                    return aVar;
                }
                C89805k kVar = r0.f238299a;
                if (kVar == null || kVar.f258210e != a.f238159x.mo124088a()) {
                    C89805k kVar2 = r0.f238299a;
                    if (!(kVar2 == null || (cVar = kVar2.f258209d.f238113K) == null)) {
                        cVar.mo122982e(kVar2.f258211f);
                    }
                    r0.f238299a = new C89805k(AppBrandRuntimeWC.this, a.f238159x.mo124088a());
                }
                return r0.f238299a;
            }
            C87412m.m108603p("blinkHelperExport");
            throw null;
        }
        C89790a aVar3 = this.f258192g;
        if (aVar3 != null) {
            return aVar3;
        }
        C87412m.m108603p("blinkHelperExport");
        throw null;
    }

    /* renamed from: b */
    public final C89795c mo124089b() {
        C89795c cVar = this.f258187b;
        if (cVar != null) {
            return cVar;
        }
        C87412m.m108603p("capsuleBarContainerLayout");
        throw null;
    }

    /* renamed from: c */
    public final void mo124090c(C83780d1 d1Var, C83817h4 h4Var) {
        C87412m.m108594g(d1Var, "page");
        C87412m.m108594g(h4Var, "type");
        C83780d1 d1Var2 = this.f258194i;
        View view = null;
        if (d1Var2 != null) {
            C89800b bVar = this.f258193h;
            bVar.getClass();
            C89798a aVar = bVar.f258203a.get(d1Var2.hashCode(), (Object) null);
            if (aVar != null) {
                aVar.mo124094h();
            }
        }
        this.f258194i = d1Var;
        C89800b bVar2 = this.f258193h;
        bVar2.getClass();
        C89798a aVar2 = bVar2.f258203a.get(d1Var.hashCode(), (Object) null);
        if (aVar2 == null) {
            aVar2 = new C89798a(C89797e.this, d1Var);
            bVar2.f258203a.put(d1Var.hashCode(), aVar2);
        }
        boolean z = true;
        aVar2.f258199h = true;
        C39836d F0 = aVar2.f258195d.mo116151F0();
        if (F0 == null || !F0.mo62479g()) {
            z = false;
        }
        if (z) {
            aVar2.mo109900e();
        } else {
            aVar2.mo109901f();
        }
        C39836d F02 = aVar2.f258195d.mo116151F0();
        if (F02 != null) {
            F02.mo62473a(aVar2);
        }
        C89796d dVar = aVar2.f258200i.f258188c;
        if (dVar != null) {
            dVar.addOnLayoutChangeListener(aVar2);
            AppBrandCapsuleBarPlaceHolderView capsuleView = aVar2.f258195d.f244554F.getCapsuleView();
            ViewParent parent = capsuleView != null ? capsuleView.getParent() : null;
            if (parent instanceof View) {
                view = (View) parent;
            }
            if (view != null) {
                view.addOnLayoutChangeListener(aVar2);
            }
            aVar2.f258195d.f244554F.addOnLayoutChangeListener(aVar2);
            aVar2.mo109610b(aVar2.f258197f);
            aVar2.mo109611c(aVar2.f258198g);
            aVar2.mo109609a(aVar2.f258196e);
            aVar2.mo124093g();
            return;
        }
        C87412m.m108603p("capsuleBarView");
        throw null;
    }

    /* renamed from: d */
    public final void mo124091d(int i) {
        View view;
        int childCount = mo124089b().getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                view = null;
                break;
            }
            view = mo124089b().getChildAt(i2);
            if (view.getId() == i) {
                break;
            }
            i2++;
        }
        mo124089b().removeView(view);
    }

    /* renamed from: e */
    public final void mo124092e(Context context) {
        C87412m.m108594g(context, "newBase");
        C89795c b = mo124089b();
        if (b.getContext() instanceof MutableContextWrapper) {
            if (b.f258180w > 0) {
                b.setLayoutFrozen(!(context instanceof Activity));
            } else {
                b.setLayoutFrozen(false);
            }
            ((MutableContextWrapper) b.getContext()).setBaseContext(context);
        }
    }
}
