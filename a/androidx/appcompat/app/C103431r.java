package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.C103448e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.C103554o;
import androidx.appcompat.widget.C103569y;
import androidx.appcompat.widget.Toolbar;
import com.tencent.p014mm.C0966R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p433g.C107593a;
import p849e3.C107168a0;
import p849e3.C107173b0;
import p849e3.C107175c0;
import p849e3.C107176d0;
import p849e3.C107207u;
import p990k.C108781a;
import p990k.C108787f;
import p990k.C108789g;

/* renamed from: androidx.appcompat.app.r */
public class C103431r extends ActionBar implements ActionBarOverlayLayout.C103468d {

    /* renamed from: B */
    public static final Interpolator f305103B = new AccelerateInterpolator();

    /* renamed from: C */
    public static final Interpolator f305104C = new DecelerateInterpolator();

    /* renamed from: A */
    public final C107176d0 f305105A = new C103434c();

    /* renamed from: a */
    public Context f305106a;

    /* renamed from: b */
    public Context f305107b;

    /* renamed from: c */
    public Activity f305108c;

    /* renamed from: d */
    public ActionBarOverlayLayout f305109d;

    /* renamed from: e */
    public ActionBarContainer f305110e;

    /* renamed from: f */
    public C103554o f305111f;

    /* renamed from: g */
    public ActionBarContextView f305112g;

    /* renamed from: h */
    public View f305113h;

    /* renamed from: i */
    public boolean f305114i;

    /* renamed from: j */
    public C103435d f305115j;

    /* renamed from: k */
    public C108781a f305116k;

    /* renamed from: l */
    public C108781a.C108782a f305117l;

    /* renamed from: m */
    public boolean f305118m;

    /* renamed from: n */
    public ArrayList<ActionBar.C67075a> f305119n = new ArrayList<>();

    /* renamed from: o */
    public boolean f305120o;

    /* renamed from: p */
    public int f305121p = 0;

    /* renamed from: q */
    public boolean f305122q = true;

    /* renamed from: r */
    public boolean f305123r;

    /* renamed from: s */
    public boolean f305124s;

    /* renamed from: t */
    public boolean f305125t;

    /* renamed from: u */
    public boolean f305126u = true;

    /* renamed from: v */
    public C108789g f305127v;

    /* renamed from: w */
    public boolean f305128w;

    /* renamed from: x */
    public boolean f305129x;

    /* renamed from: y */
    public final C107173b0 f305130y = new C103432a();

    /* renamed from: z */
    public final C107173b0 f305131z = new C103433b();

    /* renamed from: androidx.appcompat.app.r$a */
    public class C103432a extends C107175c0 {
        public C103432a() {
        }

        /* renamed from: a */
        public void mo143420a(View view) {
            View view2;
            C103431r rVar = C103431r.this;
            if (rVar.f305122q && (view2 = rVar.f305113h) != null) {
                view2.setTranslationY(0.0f);
                C103431r.this.f305110e.setTranslationY(0.0f);
            }
            C103431r.this.f305110e.setVisibility(8);
            C103431r.this.f305110e.setTransitioning(false);
            C103431r rVar2 = C103431r.this;
            rVar2.f305127v = null;
            C108781a.C108782a aVar = rVar2.f305117l;
            if (aVar != null) {
                aVar.mo143419d(rVar2.f305116k);
                rVar2.f305116k = null;
                rVar2.f305117l = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = C103431r.this.f305109d;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107212f.m145215c(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.r$b */
    public class C103433b extends C107175c0 {
        public C103433b() {
        }

        /* renamed from: a */
        public void mo143420a(View view) {
            C103431r rVar = C103431r.this;
            rVar.f305127v = null;
            rVar.f305110e.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.r$c */
    public class C103434c implements C107176d0 {
        public C103434c() {
        }

        /* renamed from: a */
        public void mo143483a(View view) {
            ((View) C103431r.this.f305110e.getParent()).invalidate();
        }
    }

    /* renamed from: androidx.appcompat.app.r$d */
    public class C103435d extends C108781a implements C103448e.C103449a {

        /* renamed from: f */
        public final Context f305135f;

        /* renamed from: g */
        public final C103448e f305136g;

        /* renamed from: h */
        public C108781a.C108782a f305137h;

        /* renamed from: i */
        public WeakReference<View> f305138i;

        public C103435d(Context context, C108781a.C108782a aVar) {
            this.f305135f = context;
            this.f305137h = aVar;
            C103448e eVar = new C103448e(context);
            eVar.f305246r = 1;
            this.f305136g = eVar;
            eVar.mo143628w(this);
        }

        /* renamed from: a */
        public void mo143484a() {
            C103431r rVar = C103431r.this;
            if (rVar.f305115j == this) {
                boolean z = rVar.f305123r;
                boolean z2 = rVar.f305124s;
                boolean z3 = true;
                if (z || z2) {
                    z3 = false;
                }
                if (!z3) {
                    rVar.f305116k = this;
                    rVar.f305117l = this.f305137h;
                } else {
                    this.f305137h.mo143419d(this);
                }
                this.f305137h = null;
                C103431r.this.mo143472N(false);
                ActionBarContextView actionBarContextView = C103431r.this.f305112g;
                if (actionBarContextView.f305337q == null) {
                    actionBarContextView.removeAllViews();
                    actionBarContextView.f305338r = null;
                    actionBarContextView.f305686f = null;
                }
                C103431r.this.f305111f.mo144370p().sendAccessibilityEvent(32);
                C103431r rVar2 = C103431r.this;
                rVar2.f305109d.setHideOnContentScrollEnabled(rVar2.f305129x);
                C103431r.this.f305115j = null;
            }
        }

        /* renamed from: b */
        public boolean mo143384b(C103448e eVar, MenuItem menuItem) {
            C108781a.C108782a aVar = this.f305137h;
            if (aVar != null) {
                return aVar.mo143416a(this, menuItem);
            }
            return false;
        }

        /* renamed from: c */
        public void mo143385c(C103448e eVar) {
            if (this.f305137h != null) {
                mo143490i();
                ActionMenuPresenter actionMenuPresenter = C103431r.this.f305112g.f305687g;
                if (actionMenuPresenter != null) {
                    actionMenuPresenter.mo143809o();
                }
            }
        }

        /* renamed from: d */
        public View mo143485d() {
            WeakReference<View> weakReference = this.f305138i;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        /* renamed from: e */
        public Menu mo143486e() {
            return this.f305136g;
        }

        /* renamed from: f */
        public MenuInflater mo143487f() {
            return new C108787f(this.f305135f);
        }

        /* renamed from: g */
        public CharSequence mo143488g() {
            return C103431r.this.f305112g.getSubtitle();
        }

        /* renamed from: h */
        public CharSequence mo143489h() {
            return C103431r.this.f305112g.getTitle();
        }

        /* renamed from: i */
        public void mo143490i() {
            if (C103431r.this.f305115j == this) {
                this.f305136g.mo143631z();
                try {
                    this.f305137h.mo143418c(this, this.f305136g);
                } finally {
                    this.f305136g.mo143630y();
                }
            }
        }

        /* renamed from: j */
        public boolean mo143491j() {
            return C103431r.this.f305112g.f305344x;
        }

        /* renamed from: k */
        public void mo143492k(View view) {
            C103431r.this.f305112g.setCustomView(view);
            this.f305138i = new WeakReference<>(view);
        }

        /* renamed from: l */
        public void mo143493l(int i) {
            mo143494m(C103431r.this.f305106a.getResources().getString(i));
        }

        /* renamed from: m */
        public void mo143494m(CharSequence charSequence) {
            C103431r.this.f305112g.setSubtitle(charSequence);
        }

        /* renamed from: n */
        public void mo143495n(int i) {
            mo143496o(C103431r.this.f305106a.getResources().getString(i));
        }

        /* renamed from: o */
        public void mo143496o(CharSequence charSequence) {
            C103431r.this.f305112g.setTitle(charSequence);
        }

        /* renamed from: p */
        public void mo143497p(boolean z) {
            this.f325720e = z;
            C103431r.this.f305112g.setTitleOptional(z);
        }
    }

    public C103431r(Activity activity, boolean z) {
        new ArrayList();
        this.f305108c = activity;
        View decorView = activity.getWindow().getDecorView();
        mo143473O(decorView);
        if (!z) {
            this.f305113h = decorView.findViewById(16908290);
        }
    }

    /* renamed from: A */
    public void mo91083A(boolean z) {
        if (!this.f305114i) {
            mo91084B(z);
        }
    }

    /* renamed from: B */
    public void mo91084B(boolean z) {
        mo143474P(z ? 4 : 0, 4);
    }

    /* renamed from: C */
    public void mo91085C(int i) {
        if ((i & 4) != 0) {
            this.f305114i = true;
        }
        this.f305111f.mo144363i(i);
    }

    /* renamed from: D */
    public void mo91086D(boolean z) {
        mo143474P(z ? 16 : 0, 16);
    }

    /* renamed from: E */
    public void mo91087E(boolean z) {
        mo143474P(z ? 2 : 0, 2);
    }

    /* renamed from: F */
    public void mo91088F(boolean z) {
        mo143474P(z ? 8 : 0, 8);
    }

    /* renamed from: G */
    public void mo91089G(float f) {
        ActionBarContainer actionBarContainer = this.f305110e;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107213g.m145234s(actionBarContainer, f);
    }

    /* renamed from: H */
    public void mo91090H(int i) {
        this.f305111f.setIcon(i);
    }

    /* renamed from: I */
    public void mo91091I(Drawable drawable) {
        this.f305111f.mo144358g(drawable);
    }

    /* renamed from: J */
    public void mo91092J(boolean z) {
        C108789g gVar;
        this.f305128w = z;
        if (!z && (gVar = this.f305127v) != null) {
            gVar.mo159837a();
        }
    }

    /* renamed from: K */
    public void mo91093K(CharSequence charSequence) {
        this.f305111f.setWindowTitle(charSequence);
    }

    /* renamed from: L */
    public void mo91094L() {
        if (this.f305123r) {
            this.f305123r = false;
            mo143476R(false);
        }
    }

    /* renamed from: M */
    public C108781a mo91095M(C108781a.C108782a aVar) {
        C103435d dVar = this.f305115j;
        if (dVar != null) {
            dVar.mo143484a();
        }
        this.f305109d.setHideOnContentScrollEnabled(false);
        ActionBarContextView actionBarContextView = this.f305112g;
        actionBarContextView.removeAllViews();
        actionBarContextView.f305338r = null;
        actionBarContextView.f305686f = null;
        C103435d dVar2 = new C103435d(this.f305112g.getContext(), aVar);
        dVar2.f305136g.mo143631z();
        try {
            if (!dVar2.f305137h.mo143417b(dVar2, dVar2.f305136g)) {
                return null;
            }
            this.f305115j = dVar2;
            dVar2.mo143490i();
            this.f305112g.mo143733f(dVar2);
            mo143472N(true);
            this.f305112g.sendAccessibilityEvent(32);
            return dVar2;
        } finally {
            dVar2.f305136g.mo143630y();
        }
    }

    /* renamed from: N */
    public void mo143472N(boolean z) {
        C107168a0 a0Var;
        C107168a0 a0Var2;
        if (z) {
            if (!this.f305125t) {
                this.f305125t = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f305109d;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                mo143476R(false);
            }
        } else if (this.f305125t) {
            this.f305125t = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f305109d;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            mo143476R(false);
        }
        ActionBarContainer actionBarContainer = this.f305110e;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (C107207u.C107211e.m145208c(actionBarContainer)) {
            if (z) {
                a0Var = this.f305111f.mo144369o(4, 100);
                a0Var2 = this.f305112g.mo144300e(0, 200);
            } else {
                a0Var2 = this.f305111f.mo144369o(0, 200);
                a0Var = this.f305112g.mo144300e(8, 100);
            }
            C108789g gVar = new C108789g();
            gVar.mo159839c(a0Var, a0Var2);
            gVar.mo159840d();
        } else if (z) {
            this.f305111f.setVisibility(4);
            this.f305112g.setVisibility(0);
        } else {
            this.f305111f.setVisibility(0);
            this.f305112g.setVisibility(8);
        }
    }

    /* renamed from: O */
    public final void mo143473O(View view) {
        C103554o oVar;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C0966R.C0970id.bzq);
        this.f305109d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(C0966R.C0970id.f5380dl);
        if (findViewById instanceof C103554o) {
            oVar = (C103554o) findViewById;
        } else if (findViewById instanceof Toolbar) {
            oVar = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't make a decor toolbar out of ");
            sb.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(sb.toString());
        }
        this.f305111f = oVar;
        this.f305112g = (ActionBarContextView) view.findViewById(C0966R.C0970id.f5400e4);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C0966R.C0970id.f5383do);
        this.f305110e = actionBarContainer;
        C103554o oVar2 = this.f305111f;
        if (oVar2 == null || this.f305112g == null || actionBarContainer == null) {
            throw new IllegalStateException(C103431r.class.getSimpleName() + " can only be used " + "with a compatible window decor layout");
        }
        this.f305106a = oVar2.getContext();
        boolean z = (this.f305111f.mo144368n() & 4) != 0;
        if (z) {
            this.f305114i = true;
        }
        Context context = this.f305106a;
        this.f305111f.mo144371q((context.getApplicationInfo().targetSdkVersion < 14) || z);
        mo143475Q(context.getResources().getBoolean(C0966R.bool.f2921a));
        TypedArray obtainStyledAttributes = this.f305106a.obtainStyledAttributes((AttributeSet) null, C107593a.f321901a, C0966R.attr.f2627a2, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f305109d;
            if (actionBarOverlayLayout2.f305362n) {
                this.f305129x = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            mo91089G((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: P */
    public void mo143474P(int i, int i2) {
        int n = this.f305111f.mo144368n();
        if ((i2 & 4) != 0) {
            this.f305114i = true;
        }
        this.f305111f.mo144363i((i & i2) | ((~i2) & n));
    }

    /* renamed from: Q */
    public final void mo143475Q(boolean z) {
        this.f305120o = z;
        if (!z) {
            this.f305111f.mo144381v((C103569y) null);
            this.f305110e.setTabContainer((C103569y) null);
        } else {
            this.f305110e.setTabContainer((C103569y) null);
            this.f305111f.mo144381v((C103569y) null);
        }
        boolean z2 = true;
        boolean z3 = this.f305111f.mo144364j() == 2;
        this.f305111f.mo144366l(!this.f305120o && z3);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f305109d;
        if (this.f305120o || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: R */
    public final void mo143476R(boolean z) {
        View view;
        View view2;
        View view3;
        if (this.f305125t || (!this.f305123r && !this.f305124s)) {
            if (!this.f305126u) {
                this.f305126u = true;
                C108789g gVar = this.f305127v;
                if (gVar != null) {
                    gVar.mo159837a();
                }
                this.f305110e.setVisibility(0);
                if (this.f305121p != 0 || (!this.f305128w && !z)) {
                    this.f305110e.setAlpha(1.0f);
                    this.f305110e.setTranslationY(0.0f);
                    if (this.f305122q && (view2 = this.f305113h) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    ((C103433b) this.f305131z).mo143420a((View) null);
                } else {
                    this.f305110e.setTranslationY(0.0f);
                    float f = (float) (-this.f305110e.getHeight());
                    if (z) {
                        int[] iArr = {0, 0};
                        this.f305110e.getLocationInWindow(iArr);
                        f -= (float) iArr[1];
                    }
                    this.f305110e.setTranslationY(f);
                    C108789g gVar2 = new C108789g();
                    C107168a0 a = C107207u.m145160a(this.f305110e);
                    a.mo157611g(0.0f);
                    a.mo157609e(this.f305105A);
                    gVar2.mo159838b(a);
                    if (this.f305122q && (view3 = this.f305113h) != null) {
                        view3.setTranslationY(f);
                        C107168a0 a2 = C107207u.m145160a(this.f305113h);
                        a2.mo157611g(0.0f);
                        gVar2.mo159838b(a2);
                    }
                    Interpolator interpolator = f305104C;
                    boolean z2 = gVar2.f325774e;
                    if (!z2) {
                        gVar2.f325772c = interpolator;
                    }
                    if (!z2) {
                        gVar2.f325771b = 250;
                    }
                    C107173b0 b0Var = this.f305131z;
                    if (!z2) {
                        gVar2.f325773d = b0Var;
                    }
                    this.f305127v = gVar2;
                    gVar2.mo159840d();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f305109d;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                    C107207u.C107212f.m145215c(actionBarOverlayLayout);
                }
            }
        } else if (this.f305126u) {
            this.f305126u = false;
            C108789g gVar3 = this.f305127v;
            if (gVar3 != null) {
                gVar3.mo159837a();
            }
            if (this.f305121p != 0 || (!this.f305128w && !z)) {
                ((C103432a) this.f305130y).mo143420a((View) null);
                return;
            }
            this.f305110e.setAlpha(1.0f);
            this.f305110e.setTransitioning(true);
            C108789g gVar4 = new C108789g();
            float f2 = (float) (-this.f305110e.getHeight());
            if (z) {
                int[] iArr2 = {0, 0};
                this.f305110e.getLocationInWindow(iArr2);
                f2 -= (float) iArr2[1];
            }
            C107168a0 a3 = C107207u.m145160a(this.f305110e);
            a3.mo157611g(f2);
            a3.mo157609e(this.f305105A);
            gVar4.mo159838b(a3);
            if (this.f305122q && (view = this.f305113h) != null) {
                C107168a0 a4 = C107207u.m145160a(view);
                a4.mo157611g(f2);
                gVar4.mo159838b(a4);
            }
            Interpolator interpolator2 = f305103B;
            boolean z3 = gVar4.f325774e;
            if (!z3) {
                gVar4.f325772c = interpolator2;
            }
            if (!z3) {
                gVar4.f325771b = 250;
            }
            C107173b0 b0Var2 = this.f305130y;
            if (!z3) {
                gVar4.f325773d = b0Var2;
            }
            this.f305127v = gVar4;
            gVar4.mo159840d();
        }
    }

    /* renamed from: a */
    public void mo143477a() {
        C108789g gVar = this.f305127v;
        if (gVar != null) {
            gVar.mo159837a();
            this.f305127v = null;
        }
    }

    /* renamed from: b */
    public void mo143478b(int i) {
        this.f305121p = i;
    }

    /* renamed from: c */
    public void mo143479c(boolean z) {
        this.f305122q = z;
    }

    /* renamed from: d */
    public void mo143480d() {
        if (this.f305124s) {
            this.f305124s = false;
            mo143476R(true);
        }
    }

    /* renamed from: e */
    public void mo143481e() {
    }

    /* renamed from: f */
    public void mo143482f() {
        if (!this.f305124s) {
            this.f305124s = true;
            mo143476R(true);
        }
    }

    /* renamed from: h */
    public boolean mo91097h() {
        C103554o oVar = this.f305111f;
        if (oVar == null || !oVar.mo144372r()) {
            return false;
        }
        this.f305111f.collapseActionView();
        return true;
    }

    /* renamed from: i */
    public void mo91098i(boolean z) {
        if (z != this.f305118m) {
            this.f305118m = z;
            int size = this.f305119n.size();
            for (int i = 0; i < size; i++) {
                this.f305119n.get(i).mo91116a(z);
            }
        }
    }

    /* renamed from: j */
    public View mo91099j() {
        return this.f305111f.mo144373s();
    }

    /* renamed from: k */
    public int mo91100k() {
        return this.f305111f.mo144368n();
    }

    /* renamed from: l */
    public int mo91101l() {
        return this.f305110e.getHeight();
    }

    /* renamed from: m */
    public Context mo91102m() {
        if (this.f305107b == null) {
            TypedValue typedValue = new TypedValue();
            this.f305106a.getTheme().resolveAttribute(C0966R.attr.f2632a7, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f305107b = new ContextThemeWrapper(this.f305106a, i);
            } else {
                this.f305107b = this.f305106a;
            }
        }
        return this.f305107b;
    }

    /* renamed from: n */
    public CharSequence mo91103n() {
        return this.f305111f.getTitle();
    }

    /* renamed from: o */
    public void mo91104o() {
        if (!this.f305123r) {
            this.f305123r = true;
            mo143476R(false);
        }
    }

    /* renamed from: q */
    public boolean mo91106q() {
        int l = mo91101l();
        return this.f305126u && (l == 0 || this.f305109d.getActionBarHideOffset() < l);
    }

    /* renamed from: r */
    public void mo91107r(Configuration configuration) {
        mo143475Q(this.f305106a.getResources().getBoolean(C0966R.bool.f2921a));
    }

    /* renamed from: t */
    public boolean mo91109t(int i, KeyEvent keyEvent) {
        C103448e eVar;
        C103435d dVar = this.f305115j;
        if (dVar == null || (eVar = dVar.f305136g) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        eVar.setQwertyMode(z);
        return eVar.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: w */
    public void mo91112w(Drawable drawable) {
        this.f305110e.setPrimaryBackground(drawable);
    }

    /* renamed from: x */
    public void mo91113x(int i) {
        mo91114y(LayoutInflater.from(mo91102m()).inflate(i, this.f305111f.mo144370p(), false));
    }

    /* renamed from: y */
    public void mo91114y(View view) {
        this.f305111f.mo144379t(view);
    }

    /* renamed from: z */
    public void mo91115z(View view, ActionBar.LayoutParams layoutParams) {
        view.setLayoutParams(layoutParams);
        this.f305111f.mo144379t(view);
    }

    public C103431r(Dialog dialog) {
        new ArrayList();
        mo143473O(dialog.getWindow().getDecorView());
    }
}
