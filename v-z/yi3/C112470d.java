package yi3;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
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
import androidx.appcompat.widget.Toolbar;
import com.tencent.p014mm.C0966R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p206nj.C76860a;
import p433g.C107593a;
import p849e3.C107168a0;
import p849e3.C107173b0;
import p849e3.C107175c0;
import p849e3.C107176d0;
import p849e3.C107207u;
import p990k.C108781a;
import p990k.C108787f;
import p990k.C108789g;

/* renamed from: yi3.d */
public class C112470d extends ActionBar implements ActionBarOverlayLayout.C103468d {

    /* renamed from: A */
    public static final boolean f336746A = true;

    /* renamed from: y */
    public static final Interpolator f336747y = new AccelerateInterpolator();

    /* renamed from: z */
    public static final Interpolator f336748z = new DecelerateInterpolator();

    /* renamed from: a */
    public Context f336749a;

    /* renamed from: b */
    public Context f336750b;

    /* renamed from: c */
    public Activity f336751c;

    /* renamed from: d */
    public ActionBarContainer f336752d;

    /* renamed from: e */
    public C103554o f336753e;

    /* renamed from: f */
    public ActionBarContextView f336754f;

    /* renamed from: g */
    public View f336755g;

    /* renamed from: h */
    public boolean f336756h;

    /* renamed from: i */
    public C112474d f336757i;

    /* renamed from: j */
    public C108781a f336758j;

    /* renamed from: k */
    public C108781a.C108782a f336759k;

    /* renamed from: l */
    public boolean f336760l;

    /* renamed from: m */
    public ArrayList<ActionBar.C67075a> f336761m = new ArrayList<>();

    /* renamed from: n */
    public int f336762n = 0;

    /* renamed from: o */
    public boolean f336763o;

    /* renamed from: p */
    public boolean f336764p;

    /* renamed from: q */
    public boolean f336765q;

    /* renamed from: r */
    public boolean f336766r;

    /* renamed from: s */
    public boolean f336767s;

    /* renamed from: t */
    public C108789g f336768t;

    /* renamed from: u */
    public boolean f336769u;

    /* renamed from: v */
    public final C107173b0 f336770v;

    /* renamed from: w */
    public final C107173b0 f336771w;

    /* renamed from: x */
    public final C107176d0 f336772x;

    /* renamed from: yi3.d$a */
    public class C112471a extends C107175c0 {
        public C112471a() {
        }

        /* renamed from: a */
        public void mo143420a(View view) {
            View view2;
            C112470d dVar = C112470d.this;
            if (dVar.f336763o && (view2 = dVar.f336755g) != null) {
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                view2.setTranslationY(0.0f);
                C112470d.this.f336752d.setTranslationY(0.0f);
            }
            C112470d.this.f336752d.setVisibility(8);
            C112470d.this.f336752d.setTransitioning(false);
            C112470d dVar2 = C112470d.this;
            dVar2.f336768t = null;
            C108781a.C108782a aVar = dVar2.f336759k;
            if (aVar != null) {
                aVar.mo143419d(dVar2.f336758j);
                dVar2.f336758j = null;
                dVar2.f336759k = null;
            }
        }
    }

    /* renamed from: yi3.d$b */
    public class C112472b extends C107175c0 {
        public C112472b() {
        }

        /* renamed from: a */
        public void mo143420a(View view) {
            C112470d dVar = C112470d.this;
            dVar.f336768t = null;
            dVar.f336752d.requestLayout();
        }
    }

    /* renamed from: yi3.d$c */
    public class C112473c implements C107176d0 {
        public C112473c() {
        }

        /* renamed from: a */
        public void mo143483a(View view) {
            ((View) C112470d.this.f336752d.getParent()).invalidate();
        }
    }

    /* renamed from: yi3.d$d */
    public class C112474d extends C108781a implements C103448e.C103449a {

        /* renamed from: f */
        public final Context f336776f;

        /* renamed from: g */
        public final C103448e f336777g;

        /* renamed from: h */
        public C108781a.C108782a f336778h;

        /* renamed from: i */
        public WeakReference<View> f336779i;

        public C112474d(Context context, C108781a.C108782a aVar) {
            this.f336776f = context;
            this.f336778h = aVar;
            C103448e eVar = new C103448e(context);
            eVar.f305246r = 1;
            this.f336777g = eVar;
            eVar.mo143628w(this);
        }

        /* renamed from: a */
        public void mo143484a() {
            C112470d dVar = C112470d.this;
            if (dVar.f336757i == this) {
                boolean z = dVar.f336764p;
                boolean z2 = dVar.f336765q;
                boolean z3 = true;
                if (z || z2) {
                    z3 = false;
                }
                if (!z3) {
                    dVar.f336758j = this;
                    dVar.f336759k = this.f336778h;
                } else {
                    this.f336778h.mo143419d(this);
                }
                this.f336778h = null;
                C112470d.this.mo164190N(false);
                ActionBarContextView actionBarContextView = C112470d.this.f336754f;
                if (actionBarContextView.f305337q == null) {
                    actionBarContextView.removeAllViews();
                    actionBarContextView.f305338r = null;
                    actionBarContextView.f305686f = null;
                }
                C112470d.this.f336753e.mo144370p().sendAccessibilityEvent(32);
                C112470d.this.f336757i = null;
            }
        }

        /* renamed from: b */
        public boolean mo143384b(C103448e eVar, MenuItem menuItem) {
            C108781a.C108782a aVar = this.f336778h;
            if (aVar != null) {
                return aVar.mo143416a(this, menuItem);
            }
            return false;
        }

        /* renamed from: c */
        public void mo143385c(C103448e eVar) {
            if (this.f336778h != null) {
                mo143490i();
                ActionMenuPresenter actionMenuPresenter = C112470d.this.f336754f.f305687g;
                if (actionMenuPresenter != null) {
                    actionMenuPresenter.mo143809o();
                }
            }
        }

        /* renamed from: d */
        public View mo143485d() {
            WeakReference<View> weakReference = this.f336779i;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        /* renamed from: e */
        public Menu mo143486e() {
            return this.f336777g;
        }

        /* renamed from: f */
        public MenuInflater mo143487f() {
            return new C108787f(this.f336776f);
        }

        /* renamed from: g */
        public CharSequence mo143488g() {
            return C112470d.this.f336754f.getSubtitle();
        }

        /* renamed from: h */
        public CharSequence mo143489h() {
            return C112470d.this.f336754f.getTitle();
        }

        /* renamed from: i */
        public void mo143490i() {
            if (C112470d.this.f336757i == this) {
                this.f336777g.mo143631z();
                try {
                    this.f336778h.mo143418c(this, this.f336777g);
                } finally {
                    this.f336777g.mo143630y();
                }
            }
        }

        /* renamed from: j */
        public boolean mo143491j() {
            return C112470d.this.f336754f.f305344x;
        }

        /* renamed from: k */
        public void mo143492k(View view) {
            C112470d.this.f336754f.setCustomView(view);
            this.f336779i = new WeakReference<>(view);
        }

        /* renamed from: l */
        public void mo143493l(int i) {
            mo143494m(C112470d.this.f336749a.getResources().getString(i));
        }

        /* renamed from: m */
        public void mo143494m(CharSequence charSequence) {
            C112470d.this.f336754f.setSubtitle(charSequence);
        }

        /* renamed from: n */
        public void mo143495n(int i) {
            mo143496o(C112470d.this.f336749a.getResources().getString(i));
        }

        /* renamed from: o */
        public void mo143496o(CharSequence charSequence) {
            C112470d.this.f336754f.setTitle(charSequence);
        }

        /* renamed from: p */
        public void mo143497p(boolean z) {
            this.f325720e = z;
            C112470d.this.f336754f.setTitleOptional(z);
        }
    }

    public C112470d(Activity activity, ViewGroup viewGroup, View view) {
        C103554o oVar;
        boolean z = true;
        this.f336763o = true;
        this.f336767s = true;
        this.f336770v = new C112471a();
        this.f336771w = new C112472b();
        this.f336772x = new C112473c();
        this.f336751c = activity;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.f5380dl);
        if (findViewById instanceof C103554o) {
            oVar = (C103554o) findViewById;
        } else if (findViewById instanceof Toolbar) {
            oVar = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't make a decor toolbar out of ");
            sb.append(findViewById);
            throw new IllegalStateException(sb.toString() != null ? findViewById.getClass().getSimpleName() : "null");
        }
        this.f336753e = oVar;
        this.f336754f = (ActionBarContextView) viewGroup.findViewById(C0966R.C0970id.f5400e4);
        ActionBarContainer actionBarContainer = (ActionBarContainer) viewGroup.findViewById(C0966R.C0970id.f5383do);
        this.f336752d = actionBarContainer;
        C103554o oVar2 = this.f336753e;
        if (oVar2 == null || this.f336754f == null || actionBarContainer == null) {
            throw new IllegalStateException(C112470d.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f336749a = oVar2.getContext();
        boolean z2 = (this.f336753e.mo144368n() & 4) != 0;
        if (z2) {
            this.f336756h = true;
        }
        if (!(this.f336749a.getApplicationInfo().targetSdkVersion < 14) && !z2) {
            z = false;
        }
        this.f336753e.mo144371q(z);
        TypedArray obtainStyledAttributes = this.f336749a.obtainStyledAttributes((AttributeSet) null, C107593a.f321901a, C0966R.attr.f2627a2, 0);
        obtainStyledAttributes.getBoolean(14, false);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            mo91089G((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
        this.f336755g = view;
    }

    /* renamed from: A */
    public void mo91083A(boolean z) {
        if (!this.f336756h) {
            mo91084B(z);
        }
    }

    /* renamed from: B */
    public void mo91084B(boolean z) {
        mo164191O(z ? 4 : 0, 4);
    }

    /* renamed from: C */
    public void mo91085C(int i) {
        if ((i & 4) != 0) {
            this.f336756h = true;
        }
        this.f336753e.mo144363i(i);
    }

    /* renamed from: D */
    public void mo91086D(boolean z) {
        mo164191O(z ? 16 : 0, 16);
    }

    /* renamed from: E */
    public void mo91087E(boolean z) {
        mo164191O(z ? 2 : 0, 2);
    }

    /* renamed from: F */
    public void mo91088F(boolean z) {
        mo164191O(z ? 8 : 0, 8);
    }

    /* renamed from: G */
    public void mo91089G(float f) {
        ActionBarContainer actionBarContainer = this.f336752d;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107213g.m145234s(actionBarContainer, f);
    }

    /* renamed from: H */
    public void mo91090H(int i) {
        this.f336753e.setIcon(i);
    }

    /* renamed from: I */
    public void mo91091I(Drawable drawable) {
        this.f336753e.mo144358g(drawable);
    }

    /* renamed from: J */
    public void mo91092J(boolean z) {
        C108789g gVar;
        this.f336769u = z;
        if (!z && (gVar = this.f336768t) != null) {
            gVar.mo159837a();
        }
    }

    /* renamed from: K */
    public void mo91093K(CharSequence charSequence) {
        this.f336753e.setWindowTitle(charSequence);
    }

    /* renamed from: L */
    public void mo91094L() {
        if (this.f336764p) {
            this.f336764p = false;
            mo164192P(false);
        }
    }

    /* renamed from: M */
    public C108781a mo91095M(C108781a.C108782a aVar) {
        C112474d dVar = this.f336757i;
        if (dVar != null) {
            dVar.mo143484a();
        }
        ActionBarContextView actionBarContextView = this.f336754f;
        actionBarContextView.removeAllViews();
        actionBarContextView.f305338r = null;
        actionBarContextView.f305686f = null;
        C112474d dVar2 = new C112474d(this.f336754f.getContext(), aVar);
        dVar2.f336777g.mo143631z();
        try {
            if (!dVar2.f336778h.mo143417b(dVar2, dVar2.f336777g)) {
                return null;
            }
            dVar2.mo143490i();
            this.f336754f.mo143733f(dVar2);
            mo164190N(true);
            this.f336754f.sendAccessibilityEvent(32);
            this.f336757i = dVar2;
            return dVar2;
        } finally {
            dVar2.f336777g.mo143630y();
        }
    }

    /* renamed from: N */
    public void mo164190N(boolean z) {
        C107168a0 a0Var;
        C107168a0 a0Var2;
        if (z) {
            if (!this.f336766r) {
                this.f336766r = true;
                mo164192P(false);
            }
        } else if (this.f336766r) {
            this.f336766r = false;
            mo164192P(false);
        }
        if (z) {
            a0Var = this.f336753e.mo144369o(8, 100);
            a0Var2 = this.f336754f.mo144300e(0, 200);
        } else {
            a0Var2 = this.f336753e.mo144369o(0, 200);
            a0Var = this.f336754f.mo144300e(8, 100);
        }
        C108789g gVar = new C108789g();
        gVar.mo159839c(a0Var, a0Var2);
        gVar.mo159840d();
    }

    /* renamed from: O */
    public void mo164191O(int i, int i2) {
        int n = this.f336753e.mo144368n();
        if ((i2 & 4) != 0) {
            this.f336756h = true;
        }
        this.f336753e.mo144363i((i & i2) | ((~i2) & n));
    }

    /* renamed from: P */
    public final void mo164192P(boolean z) {
        View view;
        View view2;
        View view3;
        if (this.f336766r || (!this.f336764p && !this.f336765q)) {
            if (!this.f336767s) {
                this.f336767s = true;
                C108789g gVar = this.f336768t;
                if (gVar != null) {
                    gVar.mo159837a();
                }
                this.f336752d.setVisibility(0);
                if (this.f336762n != 0 || !f336746A || (!this.f336769u && !z)) {
                    C107207u.m145169j(this.f336752d, 1.0f);
                    this.f336752d.setTranslationY(0.0f);
                    if (this.f336763o && (view2 = this.f336755g) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    ((C112472b) this.f336771w).mo143420a((View) null);
                    return;
                }
                ActionBarContainer actionBarContainer = this.f336752d;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                actionBarContainer.setTranslationY(0.0f);
                float f = (float) (-this.f336752d.getHeight());
                if (z) {
                    int[] iArr = {0, 0};
                    this.f336752d.getLocationInWindow(iArr);
                    f -= (float) iArr[1];
                }
                this.f336752d.setTranslationY(f);
                C108789g gVar2 = new C108789g();
                C107168a0 a = C107207u.m145160a(this.f336752d);
                a.mo157611g(0.0f);
                a.mo157609e(this.f336772x);
                gVar2.mo159838b(a);
                if (this.f336763o && (view3 = this.f336755g) != null) {
                    view3.setTranslationY(f);
                    C107168a0 a2 = C107207u.m145160a(this.f336755g);
                    a2.mo157611g(0.0f);
                    gVar2.mo159838b(a2);
                }
                Interpolator interpolator = f336748z;
                boolean z2 = gVar2.f325774e;
                if (!z2) {
                    gVar2.f325772c = interpolator;
                }
                if (!z2) {
                    gVar2.f325771b = 250;
                }
                C107173b0 b0Var = this.f336771w;
                if (!z2) {
                    gVar2.f325773d = b0Var;
                }
                this.f336768t = gVar2;
                gVar2.mo159840d();
            }
        } else if (this.f336767s) {
            this.f336767s = false;
            C108789g gVar3 = this.f336768t;
            if (gVar3 != null) {
                gVar3.mo159837a();
            }
            if (this.f336762n != 0 || !f336746A || (!this.f336769u && !z)) {
                ((C112471a) this.f336770v).mo143420a((View) null);
                return;
            }
            C107207u.m145169j(this.f336752d, 1.0f);
            this.f336752d.setTransitioning(true);
            C108789g gVar4 = new C108789g();
            float f2 = (float) (-this.f336752d.getHeight());
            if (z) {
                int[] iArr2 = {0, 0};
                this.f336752d.getLocationInWindow(iArr2);
                f2 -= (float) iArr2[1];
            }
            C107168a0 a3 = C107207u.m145160a(this.f336752d);
            a3.mo157611g(f2);
            a3.mo157609e(this.f336772x);
            gVar4.mo159838b(a3);
            if (this.f336763o && (view = this.f336755g) != null) {
                C107168a0 a4 = C107207u.m145160a(view);
                a4.mo157611g(f2);
                gVar4.mo159838b(a4);
            }
            Interpolator interpolator2 = f336747y;
            boolean z3 = gVar4.f325774e;
            if (!z3) {
                gVar4.f325772c = interpolator2;
            }
            if (!z3) {
                gVar4.f325771b = 250;
            }
            C107173b0 b0Var2 = this.f336770v;
            if (!z3) {
                gVar4.f325773d = b0Var2;
            }
            this.f336768t = gVar4;
            gVar4.mo159840d();
        }
    }

    /* renamed from: a */
    public void mo143477a() {
        C108789g gVar = this.f336768t;
        if (gVar != null) {
            gVar.mo159837a();
            this.f336768t = null;
        }
    }

    /* renamed from: b */
    public void mo143478b(int i) {
        this.f336762n = i;
    }

    /* renamed from: c */
    public void mo143479c(boolean z) {
        this.f336763o = z;
    }

    /* renamed from: d */
    public void mo143480d() {
        if (this.f336765q) {
            this.f336765q = false;
            mo164192P(true);
        }
    }

    /* renamed from: e */
    public void mo143481e() {
    }

    /* renamed from: f */
    public void mo143482f() {
        if (!this.f336765q) {
            this.f336765q = true;
            mo164192P(true);
        }
    }

    /* renamed from: h */
    public boolean mo91097h() {
        C103554o oVar = this.f336753e;
        if (oVar == null || !oVar.mo144372r()) {
            return false;
        }
        this.f336753e.collapseActionView();
        return true;
    }

    /* renamed from: i */
    public void mo91098i(boolean z) {
        if (z != this.f336760l) {
            this.f336760l = z;
            int size = this.f336761m.size();
            for (int i = 0; i < size; i++) {
                this.f336761m.get(i).mo91116a(z);
            }
        }
    }

    /* renamed from: j */
    public View mo91099j() {
        return this.f336753e.mo144373s();
    }

    /* renamed from: k */
    public int mo91100k() {
        return this.f336753e.mo144368n();
    }

    /* renamed from: l */
    public int mo91101l() {
        return this.f336752d.getHeight();
    }

    /* renamed from: m */
    public Context mo91102m() {
        if (this.f336750b == null) {
            TypedValue typedValue = new TypedValue();
            this.f336749a.getTheme().resolveAttribute(C0966R.attr.f2632a7, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f336750b = new ContextThemeWrapper(this.f336749a, i);
            } else {
                this.f336750b = this.f336749a;
            }
        }
        return this.f336750b;
    }

    /* renamed from: n */
    public CharSequence mo91103n() {
        return this.f336753e.getTitle();
    }

    /* renamed from: o */
    public void mo91104o() {
        if (!this.f336764p) {
            this.f336764p = true;
            mo164192P(false);
        }
    }

    /* renamed from: q */
    public boolean mo91106q() {
        int l = mo91101l();
        return this.f336767s && (l == 0 || l > 0);
    }

    /* renamed from: r */
    public void mo91107r(Configuration configuration) {
        ViewGroup.LayoutParams layoutParams = this.f336753e.mo144370p().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = C76860a.m92657c(this.f336751c);
        }
        this.f336753e.mo144370p().setLayoutParams(layoutParams);
    }

    /* renamed from: w */
    public void mo91112w(Drawable drawable) {
        this.f336752d.setPrimaryBackground(drawable);
    }

    /* renamed from: x */
    public void mo91113x(int i) {
        mo91114y(LayoutInflater.from(mo91102m()).inflate(i, this.f336753e.mo144370p(), false));
    }

    /* renamed from: y */
    public void mo91114y(View view) {
        this.f336753e.mo144379t(view);
    }

    /* renamed from: z */
    public void mo91115z(View view, ActionBar.LayoutParams layoutParams) {
        view.setLayoutParams(layoutParams);
        this.f336753e.mo144379t(view);
    }
}
