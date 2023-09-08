package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.lifecycle.C0124r;
import com.eclipsesource.mmv8.Platform;
import com.tencent.p014mm.p136ui.C85924r4;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84967l0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kg3.C76577a;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.r1 */
public class C84978r1 {

    /* renamed from: a */
    public C84977q1 f247642a;

    /* renamed from: b */
    public View f247643b;

    /* renamed from: c */
    public Rect f247644c = new Rect();

    /* renamed from: d */
    public Rect f247645d = new Rect();

    /* renamed from: e */
    public View f247646e;

    /* renamed from: f */
    public Activity f247647f;

    /* renamed from: g */
    public C0124r f247648g;

    /* renamed from: h */
    public ViewTreeObserver.OnGlobalLayoutListener f247649h;

    /* renamed from: i */
    public ViewTreeObserver.OnGlobalLayoutListener f247650i;

    /* renamed from: j */
    public boolean f247651j = false;

    /* renamed from: k */
    public boolean f247652k = true;

    /* renamed from: l */
    public int f247653l;

    /* renamed from: m */
    public int f247654m;

    /* renamed from: n */
    public int f247655n;

    /* renamed from: o */
    public int f247656o;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.r1$a */
    public class C84979a implements ViewTreeObserver.OnGlobalLayoutListener {
        public C84979a() {
        }

        public void onGlobalLayout() {
            C84978r1 r1Var = C84978r1.this;
            if (r1Var.f247643b != null) {
                C84978r1.m104771a(r1Var);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.r1$b */
    public class C84980b implements ViewTreeObserver.OnGlobalLayoutListener {
        public C84980b() {
        }

        public void onGlobalLayout() {
            C84978r1 r1Var = C84978r1.this;
            if (r1Var.f247643b != null) {
                Rect rect = r1Var.f247645d;
                int i = rect.bottom;
                r1Var.f247646e.getWindowVisibleDisplayFrame(rect);
                if (C84978r1.this.f247645d.bottom != i) {
                    Log.m105925i("MicroMsg.KeyboardHeightProvider", "onGlobalLayout: %s, %s", Integer.valueOf(i), C84978r1.this.f247645d.toShortString());
                    C84978r1.m104771a(C84978r1.this);
                }
            }
        }
    }

    public C84978r1(Activity activity) {
        this.f247647f = activity;
        mo117857c();
        this.f247646e = activity.findViewById(16908290);
        this.f247649h = new C84979a();
        this.f247650i = new C84980b();
        int identifier = Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", Platform.ANDROID);
        if (identifier > 0) {
            this.f247655n = Resources.getSystem().getDimensionPixelSize(identifier);
        }
        this.f247656o = C76577a.m92151b(activity, 96);
    }

    /* renamed from: a */
    public static void m104771a(C84978r1 r1Var) {
        int i;
        DisplayCutout displayCutout;
        int safeInsetBottom;
        WindowInsets b = C85924r4.m106237b(r1Var.f247647f);
        if (b != null) {
            r1Var.f247655n = b.getStableInsetBottom();
        }
        r1Var.f247643b.getWindowVisibleDisplayFrame(r1Var.f247644c);
        r1Var.f247646e.getWindowVisibleDisplayFrame(r1Var.f247645d);
        int i2 = r1Var.f247644c.bottom;
        if (i2 > r1Var.f247653l) {
            r1Var.f247653l = i2;
        }
        int i3 = r1Var.f247645d.bottom;
        if (i3 > r1Var.f247654m) {
            r1Var.f247654m = i3;
        }
        int i4 = r1Var.f247654m;
        int i5 = r1Var.f247653l;
        int i6 = i4 - i5;
        boolean z = true;
        if (r1Var.f247652k) {
            i = i3 - i2;
            if (C11171e.m11046c(28) && r1Var.f247646e.getRootWindowInsets() != null && (displayCutout = r1Var.f247646e.getRootWindowInsets().getDisplayCutout()) != null && (safeInsetBottom = displayCutout.getSafeInsetBottom()) == i) {
                Log.m105925i("MicroMsg.KeyboardHeightProvider", "handleOnGlobalLayout: has cutout bottom, %s", Integer.valueOf(safeInsetBottom));
                i -= safeInsetBottom;
            }
            int i7 = r1Var.f247655n;
            if (i == i7 && i7 != 0) {
                Log.m105925i("MicroMsg.KeyboardHeightProvider", "handleOnGlobalLayout: navigationHeight %d, %d, %d", Integer.valueOf(r1Var.f247653l), Integer.valueOf(r1Var.f247654m), Integer.valueOf(r1Var.f247655n));
                i -= r1Var.f247655n;
            }
            if (i == i6 && i6 > 0 && i6 < r1Var.f247656o) {
                Log.m105925i("MicroMsg.KeyboardHeightProvider", "handleOnGlobalLayout: max bottom diff %d, %d, %d", Integer.valueOf(r1Var.f247653l), Integer.valueOf(r1Var.f247654m), Integer.valueOf(i6));
                i -= i6;
            }
            if (i == 0 && r1Var.f247654m - r1Var.f247645d.bottom > r1Var.f247656o) {
                Log.m105928w("MicroMsg.KeyboardHeightProvider", "handleOnGlobalLayout: adjust nothing not work!");
                i = r1Var.f247654m - r1Var.f247645d.bottom;
            }
        } else {
            i = i5 - i2;
        }
        Log.m105925i("MicroMsg.KeyboardHeightProvider", "handleOnGlobalLayout: %s, %s", r1Var.f247644c.toShortString(), r1Var.f247645d.toShortString());
        C84977q1 q1Var = r1Var.f247642a;
        if (q1Var != null) {
            C84966k0 k0Var = (C84966k0) q1Var;
            C84967l0 l0Var = k0Var.f247622a;
            if (l0Var.f247624a == 2) {
                if (i > 0) {
                    View view = l0Var.f247630g;
                    boolean f = C84967l0.m104751f(view == null ? MMApplicationContext.getContext() : view.getContext(), i);
                    k0Var.f247622a.mo117849h(new C84962i0(k0Var, i));
                    C84967l0.C84969b bVar = k0Var.f247622a.f247631h;
                    if (bVar != null && (f || bVar.getHeight() != i)) {
                        k0Var.f247622a.f247631h.mo117851e(i);
                    }
                }
                boolean z2 = i > 0;
                C84967l0 l0Var2 = k0Var.f247622a;
                if (l0Var2.f247629f == z2) {
                    z = false;
                }
                if (z) {
                    C84967l0.C84969b bVar2 = l0Var2.f247631h;
                    if (bVar2 != null) {
                        bVar2.mo117850d(z2);
                    }
                    k0Var.f247622a.mo117849h(new C84965j0(k0Var, z2));
                }
                k0Var.f247622a.f247629f = z2;
            }
        }
    }

    /* renamed from: b */
    public void mo117856b() {
        View view;
        Log.m105924i("MicroMsg.KeyboardHeightProvider", "close: ");
        this.f247646e.getViewTreeObserver().removeOnGlobalLayoutListener(this.f247650i);
        if (this.f247651j && (view = this.f247643b) != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f247649h);
            try {
                this.f247647f.getWindowManager().removeView(this.f247643b);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.KeyboardHeightProvider", e, "", new Object[0]);
            }
            this.f247643b = null;
        }
        this.f247651j = false;
    }

    /* renamed from: c */
    public final void mo117857c() {
        if ((this.f247647f.getWindow().getAttributes().softInputMode & 240) != 48) {
            Log.m105928w("MicroMsg.KeyboardHeightProvider", "activity soft input should be adjust nothing");
            this.f247652k = false;
            return;
        }
        this.f247652k = true;
    }

    /* renamed from: d */
    public void mo117858d() {
        mo117857c();
        if (this.f247646e != null) {
            Log.m105925i("MicroMsg.KeyboardHeightProvider", "start: %s, %s", Boolean.valueOf(this.f247651j), this.f247646e.getWindowToken());
            if (!this.f247651j && this.f247646e.getWindowToken() != null && !this.f247647f.isFinishing()) {
                this.f247651j = true;
                LinearLayout linearLayout = new LinearLayout(this.f247647f);
                this.f247643b = linearLayout;
                linearLayout.setBackgroundColor(0);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(1003, 131096, 1);
                layoutParams.width = 0;
                layoutParams.height = -1;
                layoutParams.gravity = 8388659;
                layoutParams.softInputMode = 16;
                layoutParams.setTitle("KeyboardWindow@" + hashCode());
                try {
                    this.f247647f.getWindowManager().addView(this.f247643b, layoutParams);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.KeyboardHeightProvider", e, "", new Object[0]);
                    this.f247651j = false;
                    this.f247643b = null;
                }
                if (this.f247651j) {
                    this.f247643b.getViewTreeObserver().addOnGlobalLayoutListener(this.f247649h);
                    this.f247646e.getViewTreeObserver().addOnGlobalLayoutListener(this.f247650i);
                }
                this.f247653l = 0;
                this.f247654m = 0;
                if ((this.f247647f.getWindow().getAttributes().softInputMode & 240) != 48) {
                    Log.m105928w("MicroMsg.KeyboardHeightProvider", "start: activity soft input should be adjust nothing");
                    this.f247652k = false;
                    return;
                }
                this.f247652k = true;
            }
        }
    }
}
