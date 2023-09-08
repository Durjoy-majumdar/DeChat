package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83797e3;
import com.tencent.p014mm.plugin.appbrand.utils.C84752i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import cr0.C86127t;
import in3.C87771d;
import java.lang.ref.Reference;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.WeakHashMap;
import js0.C88020k;
import p1042u.C111055b;
import p1042u.C111059i;
import p1042u.C118556h;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.v */
public class C84996v implements C82531i.C82534c {

    /* renamed from: r */
    public static final C84996v f247695r = new C84997a();

    /* renamed from: s */
    public static final C111055b<C83780d1, C84996v> f247696s = new C111055b<>();

    /* renamed from: d */
    public final Map<C85001d, C84996v> f247697d;

    /* renamed from: e */
    public final C83780d1 f247698e;

    /* renamed from: f */
    public final int f247699f;

    /* renamed from: g */
    public int f247700g;

    /* renamed from: h */
    public boolean f247701h;

    /* renamed from: i */
    public boolean f247702i;

    /* renamed from: j */
    public int f247703j;

    /* renamed from: n */
    public Queue<C85002e> f247704n;

    /* renamed from: o */
    public int f247705o;

    /* renamed from: p */
    public final Runnable f247706p;

    /* renamed from: q */
    public final Runnable f247707q;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.v$a */
    public class C84997a extends C84996v {
        /* renamed from: d */
        public void mo117905d(int i) {
        }

        /* renamed from: e */
        public void mo117906e(int i) {
        }

        public void onDestroy() {
        }

        public String toString() {
            return super.toString() + "|DUMMY";
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.v$b */
    public class C84998b implements Runnable {
        public C84998b() {
        }

        public void run() {
            C83797e3 e3Var;
            View contentView;
            if (C84996v.this.f247698e.isRunning()) {
                C84996v vVar = C84996v.this;
                FrameLayout frameLayout = !vVar.f247698e.isRunning() ? null : vVar.f247698e.f244555G;
                if (frameLayout != null) {
                    frameLayout.scrollTo(0, 0);
                    C84996v vVar2 = C84996v.this;
                    if (!(vVar2.f247705o == 0 || (e3Var = vVar2.f247698e.f244558J) == null || (contentView = e3Var.getContentView()) == null)) {
                        contentView.scrollBy(contentView.getScrollX(), -C84996v.this.f247705o);
                    }
                    Map<C85001d, C84996v> map = C84996v.this.f247697d;
                    if (((C111059i) map).f332583f > 0) {
                        for (C85001d b : (C85001d[]) ((C118556h.C118559c) ((C111055b) map).keySet()).toArray(new C85001d[((C111059i) map).f332583f])) {
                            b.mo117918b();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.v$c */
    public class C84999c implements Runnable {

        /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.v$c$a */
        public class C85000a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C84954e1 f247710d;

            /* renamed from: e */
            public final /* synthetic */ int f247711e;

            public C85000a(C84999c cVar, C84954e1 e1Var, int i) {
                this.f247710d = e1Var;
                this.f247711e = i;
            }

            public void run() {
                this.f247710d.mo117821f(this.f247711e);
            }
        }

        public C84999c() {
        }

        /* renamed from: a */
        public final int mo117912a() {
            C84996v vVar = C84996v.this;
            FrameLayout frameLayout = !vVar.f247698e.isRunning() ? null : vVar.f247698e.f244555G;
            if (frameLayout != null) {
                return frameLayout.getScrollY();
            }
            return 0;
        }

        /* renamed from: b */
        public final void mo117913b(C84954e1 e1Var, int i) {
            Log.m105921e("MicroMsg.AppBrandInputPageOffsetHelper", "sendKeyboardEvent: %b", Boolean.valueOf(C84996v.this.f247702i));
            if (C84996v.this.f247702i) {
                MMHandlerThread.postToMainThread(new C85000a(this, e1Var, i));
            }
        }

        /* renamed from: c */
        public final void mo117914c(int i) {
            Log.m105919d("MicroMsg.AppBrandInputPageOffsetHelper", "[TextAreaHeight] offsetRoot %d", Integer.valueOf(i));
            C84996v vVar = C84996v.this;
            FrameLayout frameLayout = !vVar.f247698e.isRunning() ? null : vVar.f247698e.f244555G;
            if (frameLayout != null) {
                frameLayout.scrollTo(0, i);
                Map<C85001d, C84996v> map = C84996v.this.f247697d;
                if (((C111059i) map).f332583f > 0) {
                    for (C85001d a : (C85001d[]) ((C118556h.C118559c) ((C111055b) map).keySet()).toArray(new C85001d[((C111059i) map).f332583f])) {
                        a.mo117917a();
                    }
                }
            }
        }

        public void run() {
            View contentView;
            View contentView2;
            Log.m105926v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp] offsetRunner enter");
            C84954e1 b = C84947c0.m104714b(C84996v.this.f247698e);
            if (b == null) {
                C84996v.this.mo117909n();
            } else if (!C84996v.this.f247698e.isRunning()) {
                C84996v.this.mo117909n();
            } else {
                C84996v.this.f247705o = 0;
                if (b.getInputPanel() == null || b.mo117825h() == null) {
                    C84996v.this.mo117909n();
                    return;
                }
                EditText h = b.mo117825h();
                View inputPanel = b.getInputPanel();
                if (C84752i2.m104416d(h)) {
                    mo117913b(b, 0);
                    C84996v.this.mo117909n();
                    return;
                }
                if (!((C84956g1) inputPanel).mo117827q()) {
                    Log.m105927v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp], panel height %d, tryCount %d", Integer.valueOf(inputPanel.getHeight()), Integer.valueOf(C84996v.this.f247700g));
                    C84996v vVar = C84996v.this;
                    int i = vVar.f247700g + 1;
                    vVar.f247700g = i;
                    if (i < 5) {
                        vVar.mo117908l(false);
                        return;
                    }
                } else {
                    C84996v.this.f247700g = 0;
                    Log.m105927v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp], panelHeight %d", Integer.valueOf(inputPanel.getHeight()));
                }
                mo117913b(b, inputPanel.getHeight());
                if (!b.mo117816b()) {
                    Log.m105925i("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp] beginOffset, no need adjust position, notify height %d", Integer.valueOf(inputPanel.getHeight()));
                    C84996v.this.mo117909n();
                    return;
                }
                C83780d1 d1Var = C84996v.this.f247698e;
                if (!(d1Var.f244577X instanceof C86127t) || !d1Var.mo109677x()) {
                    int[] iArr = new int[2];
                    h.getLocationOnScreen(iArr);
                    int i2 = iArr[1];
                    WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                    Log.m105927v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp] inputHeight %d, inputTop %d, inputAttached %B", Integer.valueOf(h.getHeight()), Integer.valueOf(i2), Boolean.valueOf(C107207u.C107211e.m145207b(h)));
                    ((WindowManager) C84996v.this.f247698e.f244552D.getContext().getSystemService("window")).getDefaultDisplay().getSize(new Point());
                    int height = h.getHeight() + i2;
                    inputPanel.getLocationOnScreen(iArr);
                    int i3 = iArr[1];
                    String str = null;
                    if (h instanceof C104858e0) {
                        str = ((C104858e0) h).getAdjustKeyboardTo();
                    }
                    C104863f1 f1Var = (C104863f1) h;
                    if (f1Var.mo148774o() && h.getLayout() != null && !"bottom".equals(str)) {
                        int scrollY = h.getScrollY();
                        int q = (f1Var.mo148815q(h.getLayout().getLineForOffset(h.getSelectionStart())) + i2) - scrollY;
                        int q2 = (f1Var.mo148815q(h.getLayout().getLineForOffset(h.getSelectionStart()) + 1) + i2) - scrollY;
                        if (q - i2 >= h.getHeight()) {
                            q = height - h.getLineHeight();
                        }
                        if (q2 - i2 < h.getHeight()) {
                            height = q2;
                        }
                        i2 = q;
                    }
                    if (!C84996v.this.f247698e.mo109677x()) {
                        height += b.mo117817c();
                    }
                    if (i3 == height) {
                        C84996v.this.mo117909n();
                        return;
                    }
                    C84996v vVar2 = C84996v.this;
                    if (i2 < vVar2.f247699f) {
                        C83797e3 e3Var = vVar2.f247698e.f244558J;
                        if (!(e3Var == null || (contentView2 = e3Var.getContentView()) == null)) {
                            contentView2.scrollBy(contentView2.getScrollX(), -(e3Var.getWebScrollY() - h.getTop()));
                        }
                        C84996v.this.mo117909n();
                        return;
                    }
                    int max = Math.max(-mo117912a(), Math.min(height - i3, i2 - C84996v.this.f247699f));
                    C83797e3 e3Var2 = C84996v.this.f247698e.f244558J;
                    if (!(e3Var2 == null || (contentView = e3Var2.getContentView()) == null)) {
                        if (f1Var.mo148793a()) {
                            mo117914c(max + mo117912a());
                        } else {
                            int height2 = e3Var2.getHeight();
                            int webScrollY = e3Var2.getWebScrollY();
                            int d = C88020k.m109553d(e3Var2.getContentHeight());
                            int height3 = h.getHeight();
                            h.getTop();
                            if (f1Var.mo148774o() || (h.getTop() + height3) - webScrollY > height2) {
                                int max2 = Math.max(0, Math.min((d - webScrollY) - height2, max));
                                contentView.scrollBy(contentView.getScrollX(), max2);
                                C84996v.this.f247705o = max2;
                                mo117914c((max - max2) + mo117912a());
                            } else {
                                mo117914c(max + mo117912a());
                            }
                        }
                    }
                    C84996v.this.mo117909n();
                    return;
                }
                Log.m105925i("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp] beginOffset, in landscape skip adjust position, notify height %d", Integer.valueOf(inputPanel.getHeight()));
                C84996v.this.mo117909n();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.v$d */
    public interface C85001d {
        /* renamed from: a */
        void mo117917a();

        /* renamed from: b */
        void mo117918b();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.v$e */
    public static class C85002e {

        /* renamed from: a */
        public int f247712a;

        /* renamed from: b */
        public boolean f247713b;

        public C85002e(int i, boolean z) {
            this.f247712a = i;
            this.f247713b = z;
        }
    }

    public C84996v() {
        this.f247697d = new C111055b();
        this.f247700g = 0;
        this.f247701h = false;
        this.f247702i = true;
        this.f247703j = -1;
        this.f247704n = new LinkedList();
        this.f247705o = 0;
        this.f247706p = new C84998b();
        this.f247707q = new C84999c();
        this.f247698e = null;
        this.f247699f = 0;
    }

    /* renamed from: b */
    public static C84996v m104810b(C83780d1 d1Var) {
        if (d1Var == null || !d1Var.isRunning()) {
            Log.printDebugStack("MicroMsg.AppBrandInputPageOffsetHelper", " obtain with invalid page " + d1Var, new Object[0]);
            return f247695r;
        }
        C111055b<C83780d1, C84996v> bVar = f247696s;
        C84996v orDefault = bVar.getOrDefault(d1Var, null);
        if (orDefault != null) {
            return orDefault;
        }
        C84996v vVar = new C84996v(d1Var);
        bVar.put(d1Var, vVar);
        return vVar;
    }

    /* renamed from: c */
    public static C84996v m104811c(Reference<C83780d1> reference) {
        return m104810b(reference == null ? null : reference.get());
    }

    /* renamed from: d */
    public void mo117905d(int i) {
        if (this.f247698e.isRunning()) {
            int i2 = this.f247703j;
            if (i != i2) {
                Log.m105929w("MicroMsg.AppBrandInputPageOffsetHelper", "requestScrollDown, skip last-ticket %d, pass-in-ticket %d", Integer.valueOf(i2), Integer.valueOf(i));
                return;
            }
            this.f247701h = true;
            this.f247702i = true;
            this.f247698e.f244552D.post(this.f247706p);
        }
    }

    /* renamed from: e */
    public void mo117906e(int i) {
        mo117907k(i, true, false);
    }

    /* renamed from: k */
    public final void mo117907k(int i, boolean z, boolean z2) {
        if (!z2) {
            ((LinkedList) this.f247704n).offer(new C85002e(i, z));
        }
        if (((LinkedList) this.f247704n).size() <= 1 || z2) {
            this.f247703j = i;
            this.f247702i = z;
            mo117908l(true);
        }
    }

    /* renamed from: l */
    public final void mo117908l(boolean z) {
        if (z) {
            this.f247700g = 0;
            this.f247701h = false;
        }
        C83780d1 d1Var = this.f247698e;
        if (d1Var == null || !d1Var.isRunning()) {
            mo117909n();
        } else if (this.f247701h) {
            this.f247700g = 0;
            mo117909n();
        } else if (this.f247700g == 0) {
            ViewGroup viewGroup = this.f247698e.f244552D;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            Log.m105927v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp] post, attached %B", Boolean.valueOf(C107207u.C107211e.m145207b(viewGroup)));
            this.f247698e.f244552D.post(this.f247707q);
        } else {
            ViewGroup viewGroup2 = this.f247698e.f244552D;
            WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
            Log.m105927v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp] postOnAnimation, attached %B", Boolean.valueOf(C107207u.C107211e.m145207b(viewGroup2)));
            this.f247698e.f244552D.postOnAnimationDelayed(this.f247707q, 100);
        }
    }

    /* renamed from: n */
    public final void mo117909n() {
        if (!this.f247704n.isEmpty()) {
            this.f247704n.poll();
            if (!this.f247704n.isEmpty()) {
                C85002e peek = this.f247704n.peek();
                mo117907k(peek.f247712a, peek.f247713b, true);
            }
        }
    }

    public void onDestroy() {
        this.f247698e.mo114867r(this);
        f247696s.remove(this.f247698e);
    }

    public C84996v(C83780d1 d1Var) {
        this.f247697d = new C111055b();
        int i = 0;
        this.f247700g = 0;
        this.f247701h = false;
        this.f247702i = true;
        this.f247703j = -1;
        this.f247704n = new LinkedList();
        this.f247705o = 0;
        this.f247706p = new C84998b();
        this.f247707q = new C84999c();
        this.f247698e = d1Var;
        d1Var.mo114865m(this);
        Activity A0 = d1Var.mo116146A0();
        if (C87771d.f254121g && A0 != null) {
            i = C87771d.m109203b(A0).f254129e;
        }
        this.f247699f = i;
    }
}
