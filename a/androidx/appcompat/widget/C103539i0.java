package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.view.menu.C103448e;
import androidx.appcompat.view.menu.C103452g;
import androidx.appcompat.view.menu.C103456i;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.Toolbar;
import com.tencent.p014mm.C0966R;
import p1115h.C107922a;
import p433g.C107593a;
import p849e3.C107168a0;
import p849e3.C107175c0;
import p849e3.C107207u;

/* renamed from: androidx.appcompat.widget.i0 */
public class C103539i0 implements C103554o {

    /* renamed from: a */
    public Toolbar f305747a;

    /* renamed from: b */
    public int f305748b;

    /* renamed from: c */
    public View f305749c;

    /* renamed from: d */
    public View f305750d;

    /* renamed from: e */
    public Drawable f305751e;

    /* renamed from: f */
    public Drawable f305752f;

    /* renamed from: g */
    public Drawable f305753g;

    /* renamed from: h */
    public boolean f305754h;

    /* renamed from: i */
    public CharSequence f305755i;

    /* renamed from: j */
    public CharSequence f305756j;

    /* renamed from: k */
    public CharSequence f305757k;

    /* renamed from: l */
    public Window.Callback f305758l;

    /* renamed from: m */
    public boolean f305759m;

    /* renamed from: n */
    public ActionMenuPresenter f305760n;

    /* renamed from: o */
    public int f305761o = 0;

    /* renamed from: p */
    public Drawable f305762p;

    /* renamed from: androidx.appcompat.widget.i0$a */
    public class C103540a extends C107175c0 {

        /* renamed from: a */
        public boolean f305763a = false;

        /* renamed from: b */
        public final /* synthetic */ int f305764b;

        public C103540a(int i) {
            this.f305764b = i;
        }

        /* renamed from: a */
        public void mo143420a(View view) {
            if (!this.f305763a) {
                C103539i0.this.f305747a.setVisibility(this.f305764b);
            }
        }

        /* renamed from: b */
        public void mo143457b(View view) {
            C103539i0.this.f305747a.setVisibility(0);
        }

        /* renamed from: c */
        public void mo144304c(View view) {
            this.f305763a = true;
        }
    }

    public C103539i0(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.f305747a = toolbar;
        this.f305755i = toolbar.getTitle();
        this.f305756j = toolbar.getSubtitle();
        this.f305754h = this.f305755i != null;
        this.f305753g = toolbar.getNavigationIcon();
        String str = null;
        C103533f0 l = C103533f0.m137562l(toolbar.getContext(), (AttributeSet) null, C107593a.f321901a, C0966R.attr.f2627a2, 0);
        int i = 15;
        this.f305762p = l.mo144336e(15);
        if (z) {
            CharSequence j = l.mo144341j(27);
            if (!TextUtils.isEmpty(j)) {
                this.f305754h = true;
                this.f305755i = j;
                if ((this.f305748b & 8) != 0) {
                    this.f305747a.setTitle(j);
                }
            }
            CharSequence j2 = l.mo144341j(25);
            if (!TextUtils.isEmpty(j2)) {
                this.f305756j = j2;
                if ((this.f305748b & 8) != 0) {
                    this.f305747a.setSubtitle(j2);
                }
            }
            Drawable e = l.mo144336e(20);
            if (e != null) {
                mo144358g(e);
            }
            Drawable e2 = l.mo144336e(17);
            if (e2 != null) {
                setIcon(e2);
            }
            if (this.f305753g == null && (drawable = this.f305762p) != null) {
                this.f305753g = drawable;
                if ((this.f305748b & 4) != 0) {
                    this.f305747a.setNavigationIcon(drawable);
                } else {
                    this.f305747a.setNavigationIcon((Drawable) null);
                }
            }
            mo144363i(l.mo144339h(10, 0));
            int i2 = l.mo144340i(9, 0);
            if (i2 != 0) {
                mo144379t(LayoutInflater.from(this.f305747a.getContext()).inflate(i2, this.f305747a, false));
                mo144363i(this.f305748b | 16);
            }
            int layoutDimension = l.f305736b.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = this.f305747a.getLayoutParams();
                layoutParams.height = layoutDimension;
                this.f305747a.setLayoutParams(layoutParams);
            }
            int c = l.mo144334c(7, -1);
            int c2 = l.mo144334c(3, -1);
            if (c >= 0 || c2 >= 0) {
                Toolbar toolbar2 = this.f305747a;
                int max = Math.max(c, 0);
                int max2 = Math.max(c2, 0);
                if (toolbar2.f305675z == null) {
                    toolbar2.f305675z = new C103568x();
                }
                toolbar2.f305675z.mo144446a(max, max2);
            }
            int i3 = l.mo144340i(28, 0);
            if (i3 != 0) {
                Toolbar toolbar3 = this.f305747a;
                Context context = toolbar3.getContext();
                toolbar3.f305667r = i3;
                TextView textView = toolbar3.f305657e;
                if (textView != null) {
                    textView.setTextAppearance(context, i3);
                }
            }
            int i4 = l.mo144340i(26, 0);
            if (i4 != 0) {
                Toolbar toolbar4 = this.f305747a;
                Context context2 = toolbar4.getContext();
                toolbar4.f305668s = i4;
                TextView textView2 = toolbar4.f305658f;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, i4);
                }
            }
            int i5 = l.mo144340i(22, 0);
            if (i5 != 0) {
                this.f305747a.setPopupTheme(i5);
            }
        } else {
            if (this.f305747a.getNavigationIcon() != null) {
                this.f305762p = this.f305747a.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f305748b = i;
        }
        l.mo144343m();
        if (C0966R.string.f7326cv != this.f305761o) {
            this.f305761o = C0966R.string.f7326cv;
            if (TextUtils.isEmpty(this.f305747a.getNavigationContentDescription())) {
                int i6 = this.f305761o;
                this.f305757k = i6 != 0 ? getContext().getString(i6) : str;
                mo144383x();
            }
        }
        this.f305757k = this.f305747a.getNavigationContentDescription();
        this.f305747a.setNavigationOnClickListener(new C103537h0(this));
    }

    /* renamed from: a */
    public boolean mo144351a() {
        ActionMenuView actionMenuView = this.f305747a.f305656d;
        if (actionMenuView == null) {
            return false;
        }
        ActionMenuPresenter actionMenuPresenter = actionMenuView.f305415z;
        return actionMenuPresenter != null && actionMenuPresenter.mo143806l();
    }

    /* renamed from: b */
    public void mo144352b(Menu menu, C103456i.C103457a aVar) {
        if (this.f305760n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f305747a.getContext());
            this.f305760n = actionMenuPresenter;
            actionMenuPresenter.f305179o = C0966R.C0970id.f5415ei;
        }
        ActionMenuPresenter actionMenuPresenter2 = this.f305760n;
        actionMenuPresenter2.f305175h = aVar;
        Toolbar toolbar = this.f305747a;
        C103448e eVar = (C103448e) menu;
        if (eVar != null || toolbar.f305656d != null) {
            toolbar.mo144219d();
            C103448e eVar2 = toolbar.f305656d.f305411v;
            if (eVar2 != eVar) {
                if (eVar2 != null) {
                    eVar2.mo143615r(toolbar.f305650Q);
                    eVar2.mo143615r(toolbar.f305651R);
                }
                if (toolbar.f305651R == null) {
                    toolbar.f305651R = new Toolbar.C103514c();
                }
                actionMenuPresenter2.f305392x = true;
                if (eVar != null) {
                    eVar.mo143590b(actionMenuPresenter2, toolbar.f305665p);
                    eVar.mo143590b(toolbar.f305651R, toolbar.f305665p);
                } else {
                    actionMenuPresenter2.mo143564h(toolbar.f305665p, (C103448e) null);
                    toolbar.f305651R.mo143564h(toolbar.f305665p, (C103448e) null);
                    actionMenuPresenter2.mo143539c(true);
                    toolbar.f305651R.mo143539c(true);
                }
                toolbar.f305656d.setPopupTheme(toolbar.f305666q);
                toolbar.f305656d.setPresenter(actionMenuPresenter2);
                toolbar.f305650Q = actionMenuPresenter2;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0021 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo144353c() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f305747a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f305656d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0022
            androidx.appcompat.widget.ActionMenuPresenter r0 = r0.f305415z
            if (r0 == 0) goto L_0x001e
            androidx.appcompat.widget.ActionMenuPresenter$c r3 = r0.f305380C
            if (r3 != 0) goto L_0x0019
            boolean r0 = r0.mo143807m()
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = 0
            goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            if (r0 == 0) goto L_0x001e
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            if (r0 == 0) goto L_0x0022
            r1 = 1
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C103539i0.mo144353c():boolean");
    }

    public void collapseActionView() {
        Toolbar.C103514c cVar = this.f305747a.f305651R;
        C103452g gVar = cVar == null ? null : cVar.f305682e;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.f305656d;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo144355d() {
        /*
            r2 = this;
            androidx.appcompat.widget.Toolbar r0 = r2.f305747a
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r0.f305656d
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.f305414y
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C103539i0.mo144355d():boolean");
    }

    /* renamed from: e */
    public boolean mo144356e() {
        ActionMenuView actionMenuView = this.f305747a.f305656d;
        if (actionMenuView == null) {
            return false;
        }
        ActionMenuPresenter actionMenuPresenter = actionMenuView.f305415z;
        return actionMenuPresenter != null && actionMenuPresenter.mo143809o();
    }

    /* renamed from: f */
    public boolean mo144357f() {
        ActionMenuView actionMenuView = this.f305747a.f305656d;
        if (actionMenuView == null) {
            return false;
        }
        ActionMenuPresenter actionMenuPresenter = actionMenuView.f305415z;
        return actionMenuPresenter != null && actionMenuPresenter.mo143807m();
    }

    /* renamed from: g */
    public void mo144358g(Drawable drawable) {
        this.f305752f = drawable;
        mo144384y();
    }

    public Context getContext() {
        return this.f305747a.getContext();
    }

    public CharSequence getTitle() {
        return this.f305747a.getTitle();
    }

    public int getVisibility() {
        return this.f305747a.getVisibility();
    }

    /* renamed from: h */
    public void mo144362h() {
        this.f305759m = true;
    }

    /* renamed from: i */
    public void mo144363i(int i) {
        View view;
        int i2 = this.f305748b ^ i;
        this.f305748b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    mo144383x();
                }
                if ((this.f305748b & 4) != 0) {
                    Toolbar toolbar = this.f305747a;
                    Drawable drawable = this.f305753g;
                    if (drawable == null) {
                        drawable = this.f305762p;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    this.f305747a.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                mo144384y();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f305747a.setTitle(this.f305755i);
                    this.f305747a.setSubtitle(this.f305756j);
                } else {
                    this.f305747a.setTitle((CharSequence) null);
                    this.f305747a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.f305750d) != null) {
                if ((i & 16) != 0) {
                    this.f305747a.addView(view);
                } else {
                    this.f305747a.removeView(view);
                }
            }
        }
    }

    /* renamed from: j */
    public int mo144364j() {
        return 0;
    }

    /* renamed from: k */
    public void mo144365k() {
    }

    /* renamed from: l */
    public void mo144366l(boolean z) {
        this.f305747a.setCollapsible(z);
    }

    /* renamed from: m */
    public void mo144367m() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.f305747a.f305656d;
        if (actionMenuView != null && (actionMenuPresenter = actionMenuView.f305415z) != null) {
            actionMenuPresenter.mo143806l();
            ActionMenuPresenter.C103470a aVar = actionMenuPresenter.f305379B;
            if (aVar != null && aVar.mo143697b()) {
                aVar.f305297j.dismiss();
            }
        }
    }

    /* renamed from: n */
    public int mo144368n() {
        return this.f305748b;
    }

    /* renamed from: o */
    public C107168a0 mo144369o(int i, long j) {
        C107168a0 a = C107207u.m145160a(this.f305747a);
        a.mo157605a(i == 0 ? 1.0f : 0.0f);
        a.mo157607c(j);
        a.mo157608d(new C103540a(i));
        return a;
    }

    /* renamed from: p */
    public ViewGroup mo144370p() {
        return this.f305747a;
    }

    /* renamed from: q */
    public void mo144371q(boolean z) {
    }

    /* renamed from: r */
    public boolean mo144372r() {
        Toolbar.C103514c cVar = this.f305747a.f305651R;
        return (cVar == null || cVar.f305682e == null) ? false : true;
    }

    /* renamed from: s */
    public View mo144373s() {
        return this.f305750d;
    }

    public void setIcon(int i) {
        setIcon(i != 0 ? C107922a.m146228b(getContext(), i) : null);
    }

    public void setVisibility(int i) {
        this.f305747a.setVisibility(i);
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f305758l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f305754h) {
            this.f305755i = charSequence;
            if ((this.f305748b & 8) != 0) {
                this.f305747a.setTitle(charSequence);
            }
        }
    }

    /* renamed from: t */
    public void mo144379t(View view) {
        View view2 = this.f305750d;
        if (!(view2 == null || (this.f305748b & 16) == 0)) {
            this.f305747a.removeView(view2);
        }
        this.f305750d = view;
        if (view != null && (this.f305748b & 16) != 0) {
            this.f305747a.addView(view);
        }
    }

    /* renamed from: u */
    public void mo144380u() {
    }

    /* renamed from: v */
    public void mo144381v(C103569y yVar) {
        Toolbar toolbar;
        View view = this.f305749c;
        if (view != null && view.getParent() == (toolbar = this.f305747a)) {
            toolbar.removeView(this.f305749c);
        }
        this.f305749c = yVar;
    }

    /* renamed from: w */
    public void mo144382w(int i) {
        mo144358g(i != 0 ? C107922a.m146228b(getContext(), i) : null);
    }

    /* renamed from: x */
    public final void mo144383x() {
        if ((this.f305748b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f305757k)) {
            this.f305747a.setNavigationContentDescription(this.f305761o);
        } else {
            this.f305747a.setNavigationContentDescription(this.f305757k);
        }
    }

    /* renamed from: y */
    public final void mo144384y() {
        Drawable drawable;
        int i = this.f305748b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f305752f;
            if (drawable == null) {
                drawable = this.f305751e;
            }
        } else {
            drawable = this.f305751e;
        }
        this.f305747a.setLogo(drawable);
    }

    public void setIcon(Drawable drawable) {
        this.f305751e = drawable;
        mo144384y();
    }
}
