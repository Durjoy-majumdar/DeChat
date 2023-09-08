package p990k;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C103448e;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionMenuPresenter;
import java.lang.ref.WeakReference;
import p990k.C108781a;

/* renamed from: k.d */
public class C108784d extends C108781a implements C103448e.C103449a {

    /* renamed from: f */
    public Context f325721f;

    /* renamed from: g */
    public ActionBarContextView f325722g;

    /* renamed from: h */
    public C108781a.C108782a f325723h;

    /* renamed from: i */
    public WeakReference<View> f325724i;

    /* renamed from: j */
    public boolean f325725j;

    /* renamed from: n */
    public C103448e f325726n;

    public C108784d(Context context, ActionBarContextView actionBarContextView, C108781a.C108782a aVar, boolean z) {
        this.f325721f = context;
        this.f325722g = actionBarContextView;
        this.f325723h = aVar;
        C103448e eVar = new C103448e(actionBarContextView.getContext());
        eVar.f305246r = 1;
        this.f325726n = eVar;
        eVar.mo143628w(this);
    }

    /* renamed from: a */
    public void mo143484a() {
        if (!this.f325725j) {
            this.f325725j = true;
            this.f325722g.sendAccessibilityEvent(32);
            this.f325723h.mo143419d(this);
        }
    }

    /* renamed from: b */
    public boolean mo143384b(C103448e eVar, MenuItem menuItem) {
        return this.f325723h.mo143416a(this, menuItem);
    }

    /* renamed from: c */
    public void mo143385c(C103448e eVar) {
        mo143490i();
        ActionMenuPresenter actionMenuPresenter = this.f325722g.f305687g;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo143809o();
        }
    }

    /* renamed from: d */
    public View mo143485d() {
        WeakReference<View> weakReference = this.f325724i;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: e */
    public Menu mo143486e() {
        return this.f325726n;
    }

    /* renamed from: f */
    public MenuInflater mo143487f() {
        return new C108787f(this.f325722g.getContext());
    }

    /* renamed from: g */
    public CharSequence mo143488g() {
        return this.f325722g.getSubtitle();
    }

    /* renamed from: h */
    public CharSequence mo143489h() {
        return this.f325722g.getTitle();
    }

    /* renamed from: i */
    public void mo143490i() {
        this.f325723h.mo143418c(this, this.f325726n);
    }

    /* renamed from: j */
    public boolean mo143491j() {
        return this.f325722g.f305344x;
    }

    /* renamed from: k */
    public void mo143492k(View view) {
        this.f325722g.setCustomView(view);
        this.f325724i = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: l */
    public void mo143493l(int i) {
        mo143494m(this.f325721f.getString(i));
    }

    /* renamed from: m */
    public void mo143494m(CharSequence charSequence) {
        this.f325722g.setSubtitle(charSequence);
    }

    /* renamed from: n */
    public void mo143495n(int i) {
        mo143496o(this.f325721f.getString(i));
    }

    /* renamed from: o */
    public void mo143496o(CharSequence charSequence) {
        this.f325722g.setTitle(charSequence);
    }

    /* renamed from: p */
    public void mo143497p(boolean z) {
        this.f325720e = z;
        this.f325722g.setTitleOptional(z);
    }
}
