package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C103456i;
import java.util.WeakHashMap;
import p1130l.C109066f;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: androidx.appcompat.view.menu.h */
public class C103454h {

    /* renamed from: a */
    public final Context f305288a;

    /* renamed from: b */
    public final C103448e f305289b;

    /* renamed from: c */
    public final boolean f305290c;

    /* renamed from: d */
    public final int f305291d;

    /* renamed from: e */
    public final int f305292e;

    /* renamed from: f */
    public View f305293f;

    /* renamed from: g */
    public int f305294g;

    /* renamed from: h */
    public boolean f305295h;

    /* renamed from: i */
    public C103456i.C103457a f305296i;

    /* renamed from: j */
    public C109066f f305297j;

    /* renamed from: k */
    public PopupWindow.OnDismissListener f305298k;

    /* renamed from: l */
    public final PopupWindow.OnDismissListener f305299l;

    /* renamed from: androidx.appcompat.view.menu.h$a */
    public class C103455a implements PopupWindow.OnDismissListener {
        public C103455a() {
        }

        public void onDismiss() {
            C103454h.this.mo143698c();
        }
    }

    public C103454h(Context context, C103448e eVar, View view, boolean z, int i) {
        this(context, eVar, view, z, i, 0);
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [androidx.appcompat.view.menu.i, l.f] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.k] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p1130l.C109066f mo143696a() {
        /*
            r14 = this;
            l.f r0 = r14.f305297j
            if (r0 != 0) goto L_0x0079
            android.content.Context r0 = r14.f305288a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            r0.getRealSize(r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f305288a
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165730(0x7f070222, float:1.7945685E38)
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            if (r0 == 0) goto L_0x0047
            androidx.appcompat.view.menu.b r0 = new androidx.appcompat.view.menu.b
            android.content.Context r2 = r14.f305288a
            android.view.View r3 = r14.f305293f
            int r4 = r14.f305291d
            int r5 = r14.f305292e
            boolean r6 = r14.f305290c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0059
        L_0x0047:
            androidx.appcompat.view.menu.k r0 = new androidx.appcompat.view.menu.k
            android.content.Context r8 = r14.f305288a
            androidx.appcompat.view.menu.e r9 = r14.f305289b
            android.view.View r10 = r14.f305293f
            int r11 = r14.f305291d
            int r12 = r14.f305292e
            boolean r13 = r14.f305290c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0059:
            androidx.appcompat.view.menu.e r1 = r14.f305289b
            r0.mo143546k(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f305299l
            r0.mo143553q(r1)
            android.view.View r1 = r14.f305293f
            r0.mo143547m(r1)
            androidx.appcompat.view.menu.i$a r1 = r14.f305296i
            r0.mo143536i(r1)
            boolean r1 = r14.f305295h
            r0.mo143548n(r1)
            int r1 = r14.f305294g
            r0.mo143549o(r1)
            r14.f305297j = r0
        L_0x0079:
            l.f r0 = r14.f305297j
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C103454h.mo143696a():l.f");
    }

    /* renamed from: b */
    public boolean mo143697b() {
        C109066f fVar = this.f305297j;
        return fVar != null && fVar.isShowing();
    }

    /* renamed from: c */
    public void mo143698c() {
        this.f305297j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f305298k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: d */
    public final void mo143699d(int i, int i2, boolean z, boolean z2) {
        C109066f a = mo143696a();
        a.mo143554r(z2);
        if (z) {
            int i3 = this.f305294g;
            View view = this.f305293f;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if ((Gravity.getAbsoluteGravity(i3, C107207u.C107209c.m145195d(view)) & 7) == 5) {
                i -= this.f305293f.getWidth();
            }
            a.mo143552p(i);
            a.mo143555s(i2);
            int i4 = (int) ((this.f305288a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a.f326632d = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        a.show();
    }

    public C103454h(Context context, C103448e eVar, View view, boolean z, int i, int i2) {
        this.f305294g = 8388611;
        this.f305299l = new C103455a();
        this.f305288a = context;
        this.f305289b = eVar;
        this.f305293f = view;
        this.f305290c = z;
        this.f305291d = i;
        this.f305292e = i2;
    }
}
