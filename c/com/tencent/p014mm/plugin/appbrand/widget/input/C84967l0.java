package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;
import st0.C90358a;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.l0 */
public final class C84967l0 implements C90358a {

    /* renamed from: j */
    public static Integer f247623j;

    /* renamed from: a */
    public int f247624a = 1;

    /* renamed from: b */
    public C84978r1 f247625b;

    /* renamed from: c */
    public int f247626c = 0;

    /* renamed from: d */
    public final int[] f247627d = new int[2];

    /* renamed from: e */
    public final Rect f247628e = new Rect();

    /* renamed from: f */
    public boolean f247629f = false;

    /* renamed from: g */
    public View f247630g;

    /* renamed from: h */
    public C84969b f247631h;

    /* renamed from: i */
    public final LinkedHashSet<C84970c> f247632i = new LinkedHashSet<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.l0$a */
    public interface C84968a {
        /* renamed from: a */
        void mo117843a(C84970c cVar);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.l0$b */
    public interface C84969b extends C84970c {
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.l0$c */
    public interface C84970c {
        /* renamed from: d */
        void mo117850d(boolean z);

        /* renamed from: e */
        void mo117851e(int i);

        int getHeight();
    }

    /* renamed from: c */
    public static int m104750c(Context context) {
        if (f247623j == null) {
            f247623j = Integer.valueOf(KeyBoardUtil.getValidPanelHeight(context));
        }
        return f247623j.intValue();
    }

    /* renamed from: f */
    public static boolean m104751f(Context context, int i) {
        if (i <= 0) {
            return false;
        }
        if (f247623j == null) {
            f247623j = Integer.valueOf(KeyBoardUtil.getValidPanelHeight(context));
        }
        if (f247623j.intValue() == i) {
            return false;
        }
        f247623j = Integer.valueOf(i);
        return true;
    }

    /* renamed from: a */
    public void mo117844a(C84970c cVar) {
        if (cVar != null && !this.f247632i.contains(cVar)) {
            this.f247632i.add(cVar);
        }
    }

    /* renamed from: b */
    public final int mo117845b() {
        int i;
        View view = this.f247630g;
        if ((view == null ? null : view.getRootView()) == null) {
            return 0;
        }
        Rect rect = this.f247628e;
        View view2 = this.f247630g;
        if (view2 != null) {
            view2.getWindowVisibleDisplayFrame(rect);
            this.f247630g.getLocationInWindow(this.f247627d);
            rect.top = this.f247627d[1];
        }
        View view3 = this.f247630g;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (C107207u.C107211e.m145208c(view3)) {
            i = this.f247630g.getMeasuredHeight();
        } else {
            View view4 = this.f247630g;
            i = (view4 == null ? MMApplicationContext.getContext() : view4.getContext()).getResources().getDisplayMetrics().heightPixels;
        }
        return i - rect.top;
    }

    /* renamed from: d */
    public void mo117846d(View view, boolean z, int i, int i2, int i3, int i4) {
        this.f247630g = view;
        boolean z2 = true;
        if (1 == this.f247624a) {
            Rect rect = this.f247628e;
            if (view != null) {
                view.getWindowVisibleDisplayFrame(rect);
                this.f247630g.getLocationInWindow(this.f247627d);
                rect.top = this.f247627d[1];
            }
            int height = rect.height();
            if (this.f247626c == 0) {
                this.f247626c = height;
            }
            int b = mo117845b() - height;
            if (b > 0) {
                View view2 = this.f247630g;
                boolean f = m104751f(view2 == null ? MMApplicationContext.getContext() : view2.getContext(), b);
                Iterator it = ((LinkedHashSet) this.f247632i.clone()).iterator();
                while (it.hasNext()) {
                    C84970c cVar = (C84970c) it.next();
                    if (cVar.getHeight() != b) {
                        cVar.mo117851e(b);
                    }
                }
                C84969b bVar = this.f247631h;
                if (bVar != null && (f || bVar.getHeight() != b)) {
                    this.f247631h.mo117851e(b);
                }
            }
            boolean z3 = mo117845b() > height;
            if (this.f247629f == z3) {
                z2 = false;
            }
            if (z2) {
                C84969b bVar2 = this.f247631h;
                if (bVar2 != null) {
                    bVar2.mo117850d(z3);
                }
                Iterator it4 = ((LinkedHashSet) this.f247632i.clone()).iterator();
                while (it4.hasNext()) {
                    ((C84970c) it4.next()).mo117850d(z3);
                }
            }
            this.f247629f = z3;
            this.f247626c = height;
            this.f247630g = null;
        }
    }

    /* renamed from: e */
    public void mo117847e(C84970c cVar) {
        if (cVar != null) {
            this.f247632i.remove(cVar);
        }
    }

    /* renamed from: g */
    public void mo117848g(int i) {
        this.f247624a = i;
        if (i == 1) {
            C84978r1 r1Var = this.f247625b;
            if (r1Var != null) {
                r1Var.mo117856b();
                C84978r1 r1Var2 = this.f247625b;
                if (r1Var2.f247648g != null) {
                    Activity activity = r1Var2.f247647f;
                    if (activity instanceof C0125s) {
                        ((C0125s) activity).getLifecycle().removeObserver(r1Var2.f247648g);
                    }
                }
            }
        } else if (i == 2) {
            C84978r1 r1Var3 = this.f247625b;
            if (r1Var3 == null) {
                this.f247624a = 1;
                return;
            }
            Activity activity2 = r1Var3.f247647f;
            if (activity2 instanceof C0125s) {
                C39623j lifecycle = ((C0125s) activity2).getLifecycle();
                KeyboardHeightProvider$3 keyboardHeightProvider$3 = new KeyboardHeightProvider$3(r1Var3);
                r1Var3.f247648g = keyboardHeightProvider$3;
                lifecycle.addObserver(keyboardHeightProvider$3);
            }
            this.f247625b.mo117858d();
        }
    }

    /* renamed from: h */
    public final void mo117849h(C84968a aVar) {
        Iterator it = ((LinkedHashSet) this.f247632i.clone()).iterator();
        while (it.hasNext()) {
            aVar.mo117843a((C84970c) it.next());
        }
    }
}
