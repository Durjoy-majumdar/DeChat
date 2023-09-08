package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C103456i;
import androidx.appcompat.widget.C103565v;
import com.tencent.p014mm.C0966R;
import p1130l.C109066f;

/* renamed from: androidx.appcompat.view.menu.k */
public final class C103460k extends C109066f implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: A */
    public boolean f305301A;

    /* renamed from: e */
    public final Context f305302e;

    /* renamed from: f */
    public final C103448e f305303f;

    /* renamed from: g */
    public final C103447d f305304g;

    /* renamed from: h */
    public final boolean f305305h;

    /* renamed from: i */
    public final int f305306i;

    /* renamed from: j */
    public final int f305307j;

    /* renamed from: n */
    public final int f305308n;

    /* renamed from: o */
    public final C103565v f305309o;

    /* renamed from: p */
    public final ViewTreeObserver.OnGlobalLayoutListener f305310p = new C103461a();

    /* renamed from: q */
    public final View.OnAttachStateChangeListener f305311q = new C103462b();

    /* renamed from: r */
    public PopupWindow.OnDismissListener f305312r;

    /* renamed from: s */
    public View f305313s;

    /* renamed from: t */
    public View f305314t;

    /* renamed from: u */
    public C103456i.C103457a f305315u;

    /* renamed from: v */
    public ViewTreeObserver f305316v;

    /* renamed from: w */
    public boolean f305317w;

    /* renamed from: x */
    public boolean f305318x;

    /* renamed from: y */
    public int f305319y;

    /* renamed from: z */
    public int f305320z = 0;

    /* renamed from: androidx.appcompat.view.menu.k$a */
    public class C103461a implements ViewTreeObserver.OnGlobalLayoutListener {
        public C103461a() {
        }

        public void onGlobalLayout() {
            if (C103460k.this.isShowing()) {
                C103460k kVar = C103460k.this;
                if (!kVar.f305309o.f305513D) {
                    View view = kVar.f305314t;
                    if (view == null || !view.isShown()) {
                        C103460k.this.dismiss();
                    } else {
                        C103460k.this.f305309o.show();
                    }
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.k$b */
    public class C103462b implements View.OnAttachStateChangeListener {
        public C103462b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C103460k.this.f305316v;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C103460k.this.f305316v = view.getViewTreeObserver();
                }
                C103460k kVar = C103460k.this;
                kVar.f305316v.removeGlobalOnLayoutListener(kVar.f305310p);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public C103460k(Context context, C103448e eVar, View view, int i, int i2, boolean z) {
        this.f305302e = context;
        this.f305303f = eVar;
        this.f305305h = z;
        this.f305304g = new C103447d(eVar, LayoutInflater.from(context), z, C0966R.C0971layout.f6288aq);
        this.f305307j = i;
        this.f305308n = i2;
        Resources resources = context.getResources();
        this.f305306i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0966R.dimen.f4012nr));
        this.f305313s = view;
        this.f305309o = new C103565v(context, (AttributeSet) null, i, i2);
        eVar.mo143590b(this, context);
    }

    /* renamed from: a */
    public void mo143537a(C103448e eVar, boolean z) {
        if (eVar == this.f305303f) {
            dismiss();
            C103456i.C103457a aVar = this.f305315u;
            if (aVar != null) {
                aVar.mo143414a(eVar, z);
            }
        }
    }

    /* renamed from: b */
    public Parcelable mo143538b() {
        return null;
    }

    /* renamed from: c */
    public void mo143539c(boolean z) {
        this.f305318x = false;
        C103447d dVar = this.f305304g;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo143540d(androidx.appcompat.view.menu.C103463l r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L_0x007e
            androidx.appcompat.view.menu.h r0 = new androidx.appcompat.view.menu.h
            android.content.Context r3 = r9.f305302e
            android.view.View r5 = r9.f305314t
            boolean r6 = r9.f305305h
            int r7 = r9.f305307j
            int r8 = r9.f305308n
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.appcompat.view.menu.i$a r2 = r9.f305315u
            r0.f305296i = r2
            l.f r3 = r0.f305297j
            if (r3 == 0) goto L_0x0023
            r3.mo143536i(r2)
        L_0x0023:
            boolean r2 = p1130l.C109066f.m148068t(r10)
            r0.f305295h = r2
            l.f r3 = r0.f305297j
            if (r3 == 0) goto L_0x0030
            r3.mo143548n(r2)
        L_0x0030:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f305312r
            r0.f305298k = r2
            r2 = 0
            r9.f305312r = r2
            androidx.appcompat.view.menu.e r2 = r9.f305303f
            r2.mo143591c(r1)
            androidx.appcompat.widget.v r2 = r9.f305309o
            int r3 = r2.f305520i
            boolean r4 = r2.f305523o
            if (r4 != 0) goto L_0x0046
            r2 = 0
            goto L_0x0048
        L_0x0046:
            int r2 = r2.f305521j
        L_0x0048:
            int r4 = r9.f305320z
            android.view.View r5 = r9.f305313s
            java.util.WeakHashMap<android.view.View, e3.a0> r6 = p849e3.C107207u.f320808a
            int r5 = p849e3.C107207u.C107209c.m145195d(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L_0x0062
            android.view.View r4 = r9.f305313s
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L_0x0062:
            boolean r4 = r0.mo143697b()
            r5 = 1
            if (r4 == 0) goto L_0x006a
            goto L_0x0073
        L_0x006a:
            android.view.View r4 = r0.f305293f
            if (r4 != 0) goto L_0x0070
            r0 = 0
            goto L_0x0074
        L_0x0070:
            r0.mo143699d(r3, r2, r5, r5)
        L_0x0073:
            r0 = 1
        L_0x0074:
            if (r0 == 0) goto L_0x007e
            androidx.appcompat.view.menu.i$a r0 = r9.f305315u
            if (r0 == 0) goto L_0x007d
            r0.mo143415d(r10)
        L_0x007d:
            return r5
        L_0x007e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C103460k.mo143540d(androidx.appcompat.view.menu.l):boolean");
    }

    public void dismiss() {
        if (isShowing()) {
            this.f305309o.dismiss();
        }
    }

    /* renamed from: f */
    public boolean mo143542f() {
        return false;
    }

    public ListView getListView() {
        return this.f305309o.f305517f;
    }

    /* renamed from: i */
    public void mo143536i(C103456i.C103457a aVar) {
        this.f305315u = aVar;
    }

    public boolean isShowing() {
        return !this.f305317w && this.f305309o.isShowing();
    }

    /* renamed from: j */
    public void mo143545j(Parcelable parcelable) {
    }

    /* renamed from: k */
    public void mo143546k(C103448e eVar) {
    }

    /* renamed from: m */
    public void mo143547m(View view) {
        this.f305313s = view;
    }

    /* renamed from: n */
    public void mo143548n(boolean z) {
        this.f305304g.f305226f = z;
    }

    /* renamed from: o */
    public void mo143549o(int i) {
        this.f305320z = i;
    }

    public void onDismiss() {
        this.f305317w = true;
        this.f305303f.mo143591c(true);
        ViewTreeObserver viewTreeObserver = this.f305316v;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f305316v = this.f305314t.getViewTreeObserver();
            }
            this.f305316v.removeGlobalOnLayoutListener(this.f305310p);
            this.f305316v = null;
        }
        this.f305314t.removeOnAttachStateChangeListener(this.f305311q);
        PopupWindow.OnDismissListener onDismissListener = this.f305312r;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* renamed from: p */
    public void mo143552p(int i) {
        this.f305309o.f305520i = i;
    }

    /* renamed from: q */
    public void mo143553q(PopupWindow.OnDismissListener onDismissListener) {
        this.f305312r = onDismissListener;
    }

    /* renamed from: r */
    public void mo143554r(boolean z) {
        this.f305301A = z;
    }

    /* renamed from: s */
    public void mo143555s(int i) {
        C103565v vVar = this.f305309o;
        vVar.f305521j = i;
        vVar.f305523o = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void show() {
        /*
            r7 = this;
            boolean r0 = r7.isShowing()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000a
            goto L_0x00ba
        L_0x000a:
            boolean r0 = r7.f305317w
            if (r0 != 0) goto L_0x00bb
            android.view.View r0 = r7.f305313s
            if (r0 != 0) goto L_0x0014
            goto L_0x00bb
        L_0x0014:
            r7.f305314t = r0
            androidx.appcompat.widget.v r0 = r7.f305309o
            android.widget.PopupWindow r0 = r0.f305514E
            r0.setOnDismissListener(r7)
            androidx.appcompat.widget.v r0 = r7.f305309o
            r0.f305530v = r7
            r0.f305513D = r2
            android.widget.PopupWindow r0 = r0.f305514E
            r0.setFocusable(r2)
            android.view.View r0 = r7.f305314t
            android.view.ViewTreeObserver r3 = r7.f305316v
            if (r3 != 0) goto L_0x0030
            r3 = 1
            goto L_0x0031
        L_0x0030:
            r3 = 0
        L_0x0031:
            android.view.ViewTreeObserver r4 = r0.getViewTreeObserver()
            r7.f305316v = r4
            if (r3 == 0) goto L_0x003e
            android.view.ViewTreeObserver$OnGlobalLayoutListener r3 = r7.f305310p
            r4.addOnGlobalLayoutListener(r3)
        L_0x003e:
            android.view.View$OnAttachStateChangeListener r3 = r7.f305311q
            r0.addOnAttachStateChangeListener(r3)
            androidx.appcompat.widget.v r3 = r7.f305309o
            r3.f305529u = r0
            int r0 = r7.f305320z
            r3.f305526r = r0
            boolean r0 = r7.f305318x
            r3 = 0
            if (r0 != 0) goto L_0x005e
            androidx.appcompat.view.menu.d r0 = r7.f305304g
            android.content.Context r4 = r7.f305302e
            int r5 = r7.f305306i
            int r0 = p1130l.C109066f.m148067l(r0, r3, r4, r5)
            r7.f305319y = r0
            r7.f305318x = r2
        L_0x005e:
            androidx.appcompat.widget.v r0 = r7.f305309o
            int r4 = r7.f305319y
            r0.mo144091e(r4)
            androidx.appcompat.widget.v r0 = r7.f305309o
            r4 = 2
            android.widget.PopupWindow r0 = r0.f305514E
            r0.setInputMethodMode(r4)
            androidx.appcompat.widget.v r0 = r7.f305309o
            android.graphics.Rect r4 = r7.f326632d
            r0.f305512C = r4
            r0.show()
            androidx.appcompat.widget.v r0 = r7.f305309o
            androidx.appcompat.widget.q r0 = r0.f305517f
            r0.setOnKeyListener(r7)
            boolean r4 = r7.f305301A
            if (r4 == 0) goto L_0x00ae
            androidx.appcompat.view.menu.e r4 = r7.f305303f
            java.lang.CharSequence r4 = r4.f305247s
            if (r4 == 0) goto L_0x00ae
            android.content.Context r4 = r7.f305302e
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r5 = 2131492924(0x7f0c003c, float:1.8609314E38)
            android.view.View r4 = r4.inflate(r5, r0, r1)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x00a8
            androidx.appcompat.view.menu.e r6 = r7.f305303f
            java.lang.CharSequence r6 = r6.f305247s
            r5.setText(r6)
        L_0x00a8:
            r4.setEnabled(r1)
            r0.addHeaderView(r4, r3, r1)
        L_0x00ae:
            androidx.appcompat.widget.v r0 = r7.f305309o
            androidx.appcompat.view.menu.d r1 = r7.f305304g
            r0.mo144018d(r1)
            androidx.appcompat.widget.v r0 = r7.f305309o
            r0.show()
        L_0x00ba:
            r1 = 1
        L_0x00bb:
            if (r1 == 0) goto L_0x00be
            return
        L_0x00be:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "StandardMenuPopup cannot be used without an anchor"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C103460k.show():void");
    }
}
