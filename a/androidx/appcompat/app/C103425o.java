package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.C103448e;
import androidx.appcompat.view.menu.C103456i;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C103539i0;
import androidx.appcompat.widget.C103554o;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;
import p990k.C108791h;

/* renamed from: androidx.appcompat.app.o */
public class C103425o extends ActionBar {

    /* renamed from: a */
    public C103554o f305090a;

    /* renamed from: b */
    public boolean f305091b;

    /* renamed from: c */
    public Window.Callback f305092c;

    /* renamed from: d */
    public boolean f305093d;

    /* renamed from: e */
    public boolean f305094e;

    /* renamed from: f */
    public ArrayList<ActionBar.C67075a> f305095f = new ArrayList<>();

    /* renamed from: g */
    public final Runnable f305096g = new C103426a();

    /* renamed from: androidx.appcompat.app.o$a */
    public class C103426a implements Runnable {
        public C103426a() {
        }

        public void run() {
            C103425o oVar = C103425o.this;
            Menu N = oVar.mo143468N();
            C103448e eVar = N instanceof C103448e ? (C103448e) N : null;
            if (eVar != null) {
                eVar.mo143631z();
            }
            try {
                N.clear();
                if (!((C108791h) oVar.f305092c).onCreatePanelMenu(0, N) || !((C103430e) oVar.f305092c).onPreparePanel(0, (View) null, N)) {
                    N.clear();
                }
            } finally {
                if (eVar != null) {
                    eVar.mo143630y();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.app.o$b */
    public class C103427b implements Toolbar.C103515d {
        public C103427b() {
        }
    }

    /* renamed from: androidx.appcompat.app.o$c */
    public final class C103428c implements C103456i.C103457a {

        /* renamed from: d */
        public boolean f305099d;

        public C103428c() {
        }

        /* renamed from: a */
        public void mo143414a(C103448e eVar, boolean z) {
            if (!this.f305099d) {
                this.f305099d = true;
                ((C103539i0) C103425o.this.f305090a).mo144367m();
                Window.Callback callback = C103425o.this.f305092c;
                if (callback != null) {
                    ((C108791h) callback).onPanelClosed(108, eVar);
                }
                this.f305099d = false;
            }
        }

        /* renamed from: d */
        public boolean mo143415d(C103448e eVar) {
            Window.Callback callback = C103425o.this.f305092c;
            if (callback == null) {
                return false;
            }
            ((C108791h) callback).onMenuOpened(108, eVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.o$d */
    public final class C103429d implements C103448e.C103449a {
        public C103429d() {
        }

        /* renamed from: b */
        public boolean mo143384b(C103448e eVar, MenuItem menuItem) {
            return false;
        }

        /* renamed from: c */
        public void mo143385c(C103448e eVar) {
            C103425o oVar = C103425o.this;
            if (oVar.f305092c == null) {
                return;
            }
            if (((C103539i0) oVar.f305090a).mo144357f()) {
                ((C108791h) C103425o.this.f305092c).onPanelClosed(108, eVar);
            } else if (((C103430e) C103425o.this.f305092c).onPreparePanel(0, (View) null, eVar)) {
                ((C108791h) C103425o.this.f305092c).onMenuOpened(108, eVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.o$e */
    public class C103430e extends C108791h {
        public C103430e(Window.Callback callback) {
            super(callback);
        }

        public View onCreatePanelView(int i) {
            return i == 0 ? new View(((C103539i0) C103425o.this.f305090a).getContext()) : super.onCreatePanelView(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel) {
                C103425o oVar = C103425o.this;
                if (!oVar.f305091b) {
                    ((C103539i0) oVar.f305090a).f305759m = true;
                    oVar.f305091b = true;
                }
            }
            return onPreparePanel;
        }
    }

    public C103425o(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        C103427b bVar = new C103427b();
        this.f305090a = new C103539i0(toolbar, false);
        C103430e eVar = new C103430e(callback);
        this.f305092c = eVar;
        ((C103539i0) this.f305090a).f305758l = eVar;
        toolbar.setOnMenuItemClickListener(bVar);
        ((C103539i0) this.f305090a).setWindowTitle(charSequence);
    }

    /* renamed from: A */
    public void mo91083A(boolean z) {
    }

    /* renamed from: B */
    public void mo91084B(boolean z) {
        mo143469O(z ? 4 : 0, 4);
    }

    /* renamed from: C */
    public void mo91085C(int i) {
        mo143469O(i, -1);
    }

    /* renamed from: D */
    public void mo91086D(boolean z) {
        mo143469O(z ? 16 : 0, 16);
    }

    /* renamed from: E */
    public void mo91087E(boolean z) {
        mo143469O(z ? 2 : 0, 2);
    }

    /* renamed from: F */
    public void mo91088F(boolean z) {
        mo143469O(z ? 8 : 0, 8);
    }

    /* renamed from: G */
    public void mo91089G(float f) {
        Toolbar toolbar = ((C103539i0) this.f305090a).f305747a;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107213g.m145234s(toolbar, f);
    }

    /* renamed from: H */
    public void mo91090H(int i) {
        ((C103539i0) this.f305090a).setIcon(i);
    }

    /* renamed from: I */
    public void mo91091I(Drawable drawable) {
        ((C103539i0) this.f305090a).mo144358g(drawable);
    }

    /* renamed from: J */
    public void mo91092J(boolean z) {
    }

    /* renamed from: K */
    public void mo91093K(CharSequence charSequence) {
        ((C103539i0) this.f305090a).setWindowTitle(charSequence);
    }

    /* renamed from: L */
    public void mo91094L() {
        ((C103539i0) this.f305090a).setVisibility(0);
    }

    /* renamed from: N */
    public final Menu mo143468N() {
        if (!this.f305093d) {
            C103554o oVar = this.f305090a;
            C103428c cVar = new C103428c();
            C103429d dVar = new C103429d();
            Toolbar toolbar = ((C103539i0) oVar).f305747a;
            toolbar.f305652S = cVar;
            toolbar.f305653T = dVar;
            ActionMenuView actionMenuView = toolbar.f305656d;
            if (actionMenuView != null) {
                actionMenuView.f305404A = cVar;
                actionMenuView.f305405B = dVar;
            }
            this.f305093d = true;
        }
        return ((C103539i0) this.f305090a).f305747a.getMenu();
    }

    /* renamed from: O */
    public void mo143469O(int i, int i2) {
        C103554o oVar = this.f305090a;
        int i3 = ((C103539i0) oVar).f305748b;
        ((C103539i0) oVar).mo144363i((i & i2) | ((~i2) & i3));
    }

    /* renamed from: g */
    public boolean mo91096g() {
        return ((C103539i0) this.f305090a).mo144351a();
    }

    /* renamed from: h */
    public boolean mo91097h() {
        if (!((C103539i0) this.f305090a).mo144372r()) {
            return false;
        }
        ((C103539i0) this.f305090a).collapseActionView();
        return true;
    }

    /* renamed from: i */
    public void mo91098i(boolean z) {
        if (z != this.f305094e) {
            this.f305094e = z;
            int size = this.f305095f.size();
            for (int i = 0; i < size; i++) {
                this.f305095f.get(i).mo91116a(z);
            }
        }
    }

    /* renamed from: j */
    public View mo91099j() {
        return ((C103539i0) this.f305090a).f305750d;
    }

    /* renamed from: k */
    public int mo91100k() {
        return ((C103539i0) this.f305090a).f305748b;
    }

    /* renamed from: l */
    public int mo91101l() {
        return ((C103539i0) this.f305090a).f305747a.getHeight();
    }

    /* renamed from: m */
    public Context mo91102m() {
        return ((C103539i0) this.f305090a).getContext();
    }

    /* renamed from: n */
    public CharSequence mo91103n() {
        return ((C103539i0) this.f305090a).getTitle();
    }

    /* renamed from: o */
    public void mo91104o() {
        ((C103539i0) this.f305090a).setVisibility(8);
    }

    /* renamed from: p */
    public boolean mo91105p() {
        ((C103539i0) this.f305090a).f305747a.removeCallbacks(this.f305096g);
        Toolbar toolbar = ((C103539i0) this.f305090a).f305747a;
        Runnable runnable = this.f305096g;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107208b.m145185m(toolbar, runnable);
        return true;
    }

    /* renamed from: q */
    public boolean mo91106q() {
        return ((C103539i0) this.f305090a).getVisibility() == 0;
    }

    /* renamed from: r */
    public void mo91107r(Configuration configuration) {
    }

    /* renamed from: s */
    public void mo91108s() {
        ((C103539i0) this.f305090a).f305747a.removeCallbacks(this.f305096g);
    }

    /* renamed from: t */
    public boolean mo91109t(int i, KeyEvent keyEvent) {
        Menu N = mo143468N();
        if (N == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        N.setQwertyMode(z);
        return N.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: u */
    public boolean mo91110u(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo91111v();
        }
        return true;
    }

    /* renamed from: v */
    public boolean mo91111v() {
        return ((C103539i0) this.f305090a).mo144356e();
    }

    /* renamed from: w */
    public void mo91112w(Drawable drawable) {
        Toolbar toolbar = ((C103539i0) this.f305090a).f305747a;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107208b.m145189q(toolbar, drawable);
    }

    /* renamed from: x */
    public void mo91113x(int i) {
        mo91114y(LayoutInflater.from(((C103539i0) this.f305090a).getContext()).inflate(i, ((C103539i0) this.f305090a).f305747a, false));
    }

    /* renamed from: y */
    public void mo91114y(View view) {
        mo91115z(view, new ActionBar.LayoutParams(-2, -2));
    }

    /* renamed from: z */
    public void mo91115z(View view, ActionBar.LayoutParams layoutParams) {
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
        ((C103539i0) this.f305090a).mo144379t(view);
    }
}
