package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82540i0;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84545i3;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.utils.C84737f0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C68712d0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84983t0;
import com.tencent.p014mm.plugin.appbrand.widget.input.autofill.C104841e;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import eb0.C86493v0;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import js0.C88020k;
import js0.C88024r;
import junit.framework.Assert;
import ll0.C109391e;
import ll0.C109400m;
import ot0.C110062a;
import p849e3.C107168a0;
import p849e3.C107207u;
import qn3.C77382c;
import rt0.C110651a;
import rt0.C110653f;
import rt0.C90097c;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.k */
public abstract class C104873k implements C84954e1<C104930w0> {

    /* renamed from: A */
    public final Runnable f311414A = new C104887m();

    /* renamed from: B */
    public final MMHandler f311415B = new MMHandler(Looper.getMainLooper());

    /* renamed from: C */
    public final C84983t0.C84991j f311416C = new C104877d();

    /* renamed from: D */
    public final C84983t0.C84989h f311417D = new C104878e();

    /* renamed from: E */
    public final C84983t0.C84992k f311418E = new C104879f();

    /* renamed from: F */
    public final C84983t0.C84990i f311419F = new C104880g();

    /* renamed from: d */
    public C68717h1 f311420d = null;

    /* renamed from: e */
    public volatile C104889o f311421e;

    /* renamed from: f */
    public volatile C104888n f311422f;

    /* renamed from: g */
    public final View.OnFocusChangeListener f311423g = new C104884j();

    /* renamed from: h */
    public int f311424h = -1;

    /* renamed from: i */
    public int f311425i = -1;

    /* renamed from: j */
    public C104890p f311426j = null;

    /* renamed from: n */
    public C110653f f311427n;

    /* renamed from: o */
    public WeakReference<C83780d1> f311428o;

    /* renamed from: p */
    public int f311429p;

    /* renamed from: q */
    public C104930w0 f311430q;

    /* renamed from: r */
    public C84983t0 f311431r;

    /* renamed from: s */
    public C104901n0 f311432s;

    /* renamed from: t */
    public long f311433t;

    /* renamed from: u */
    public final C77382c.C77383a f311434u = new C104885k();

    /* renamed from: v */
    public final Runnable f311435v = new C104886l();

    /* renamed from: w */
    public int f311436w;

    /* renamed from: x */
    public int f311437x;

    /* renamed from: y */
    public final C110062a f311438y = new C110062a();

    /* renamed from: z */
    public boolean f311439z = false;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.k$a */
    public class C104874a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ PBool f311440d;

        public C104874a(PBool pBool) {
            this.f311440d = pBool;
        }

        public void run() {
            Log.m105924i("MicroMsg.AppBrandInputInvokeHandler", "ensureInputFocusedWithSoftKeyboard, before run checkForInput");
            this.f311440d.value = true;
            WeakReference<C83780d1> weakReference = C104873k.this.f311428o;
            C83780d1 d1Var = weakReference == null ? null : weakReference.get();
            if (d1Var != null && C104873k.this.f311430q != null && C84947c0.m104714b(d1Var) == C104873k.this) {
                Log.m105924i("MicroMsg.AppBrandInputInvokeHandler", "ensureInputFocusedWithSoftKeyboard, run checkForInput");
                C84959i.f247617b.mo117841b(d1Var.f244558J);
                C84975p1.m104766a(C104873k.this.f311430q);
                C84983t0 t0Var = C104873k.this.f311431r;
                if (t0Var != null && t0Var.mo117874c((EditText) null)) {
                    C104873k kVar = C104873k.this;
                    kVar.f311431r.mo117878o(kVar.f311419F);
                    C104873k.this.f311431r.mo117893z();
                }
                C104873k kVar2 = C104873k.this;
                kVar2.f311430q.mo148811h(kVar2.f311423g);
                C104873k.this.f311430q.setFocusable(true);
                C104873k.this.f311430q.setFocusableInTouchMode(true);
                C104873k kVar3 = C104873k.this;
                C84983t0 t0Var2 = kVar3.f311431r;
                C104930w0 w0Var = kVar3.f311430q;
                t0Var2.f247681w = w0Var;
                w0Var.requestFocus();
                C84975p1.m104766a(C104873k.this.f311430q);
                C104873k kVar4 = C104873k.this;
                C84983t0 t0Var3 = kVar4.f311431r;
                if (t0Var3 != null) {
                    t0Var3.mo117877j(kVar4.f311419F);
                    C104873k.this.f311431r.mo117869I();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.k$b */
    public class C104875b implements C84983t0.C84992k {

        /* renamed from: a */
        public final /* synthetic */ PBool f311442a;

        /* renamed from: b */
        public final /* synthetic */ Runnable f311443b;

        public C104875b(C104873k kVar, PBool pBool, Runnable runnable) {
            this.f311442a = pBool;
            this.f311443b = runnable;
        }

        /* renamed from: a */
        public void mo117902a(int i) {
            if (!this.f311442a.value && i == 2) {
                this.f311443b.run();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.k$c */
    public class C104876c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ PBool f311444d;

        /* renamed from: e */
        public final /* synthetic */ Runnable f311445e;

        public C104876c(C104873k kVar, PBool pBool, Runnable runnable) {
            this.f311444d = pBool;
            this.f311445e = runnable;
        }

        public void run() {
            if (!this.f311444d.value) {
                this.f311445e.run();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.k$d */
    public class C104877d implements C84983t0.C84991j {
        public C104877d() {
        }

        /* renamed from: a */
        public boolean mo117901a(String str) {
            if (C104873k.this.f311430q == null) {
                return true;
            }
            if ("[DELETE_EMOTION]".equalsIgnoreCase(str)) {
                C104873k.this.f311430q.mo148901u();
                return true;
            }
            C104873k.this.f311430q.mo148897r(str);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.k$e */
    public class C104878e implements C84983t0.C84989h {
        public C104878e() {
        }

        /* renamed from: a */
        public void mo117898a(boolean z) {
            if (z) {
                C104873k.this.f311426j = C104890p.CONFIRM_BAR_CLICKED;
            }
            C104873k.m140583i(C104873k.this);
            C104873k.this.f311426j = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.k$f */
    public class C104879f implements C84983t0.C84992k {
        public C104879f() {
        }

        /* renamed from: a */
        public void mo117902a(int i) {
            C104930w0 w0Var;
            Log.m105919d("MicroMsg.AppBrandInputInvokeHandler", "[appInput], onSmileyPanelVisibilityChanged = %d", Integer.valueOf(i));
            if (i != 2) {
                if (i == 0 && (w0Var = C104873k.this.f311430q) != null) {
                    w0Var.requestFocus();
                }
                C104873k.this.mo148837o();
                WeakReference<C83780d1> weakReference = C104873k.this.f311428o;
                if (weakReference != null && weakReference.get() != null) {
                    C83780d1 d1Var = C104873k.this.f311428o.get();
                    C104930w0 w0Var2 = C104873k.this.f311430q;
                    Map<String, Integer> map = C84947c0.f247596d;
                    if (d1Var != null) {
                        C88024r.m109572b(new C84945a0(d1Var, w0Var2));
                        return;
                    }
                    return;
                }
                return;
            }
            C104873k kVar = C104873k.this;
            kVar.f311426j = C104890p.PANEL_HIDDEN;
            C104873k.m140583i(kVar);
            C104873k.this.f311426j = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.k$g */
    public class C104880g implements C84983t0.C84990i {

        /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.k$g$a */
        public class C104881a implements Runnable {
            public C104881a() {
            }

            public void run() {
                WeakReference<C83780d1> weakReference = C104873k.this.f311428o;
                if (weakReference == null) {
                    Log.m105920e("MicroMsg.AppBrandInputInvokeHandler", "postDelayed scroll up found page is null");
                    return;
                }
                C84996v.m104811c(weakReference).mo117907k(C104873k.this.f311429p, false, false);
                C104873k.this.f311433t = Util.currentTicks();
            }
        }

        public C104880g() {
        }

        /* renamed from: a */
        public void mo117899a(int i) {
            if (Util.ticksToNow(C104873k.this.f311433t) > 50) {
                MMHandlerThread.postToMainThreadDelayed(new C104881a(), 50);
            }
        }

        /* renamed from: b */
        public EditText mo117900b() {
            return C104873k.this.f311430q;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.k$h */
    public class C104882h implements View.OnKeyListener {
        public C104882h() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(keyEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputInvokeHandler$18", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
            C104873k kVar = C104873k.this;
            boolean z = 67 == i;
            kVar.f311439z = z;
            if (z) {
                kVar.f311415B.removeCallbacks(kVar.f311414A);
                C104873k kVar2 = C104873k.this;
                kVar2.f311415B.postDelayed(kVar2.f311414A, 1000);
            } else {
                ((C104887m) kVar.f311414A).run();
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputInvokeHandler$18", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.k$i */
    public class C104883i implements TextView.OnEditorActionListener {

        /* renamed from: d */
        public final /* synthetic */ int f311452d;

        public C104883i(int i) {
            this.f311452d = i;
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != this.f311452d) {
                return false;
            }
            C104873k kVar = C104873k.this;
            kVar.f311426j = C104890p.CONFIRM_KEYBOARD_CLICKED;
            C104873k.m140583i(kVar);
            C104873k.this.f311426j = null;
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.k$j */
    public class C104884j implements View.OnFocusChangeListener {
        public C104884j() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0091, code lost:
            r4 = r3.f311454d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onFocusChange(android.view.View r4, boolean r5) {
            /*
                r3 = this;
                if (r5 == 0) goto L_0x0015
                com.tencent.mm.plugin.appbrand.widget.input.k r4 = com.tencent.p014mm.plugin.appbrand.widget.input.C104873k.this
                java.lang.ref.WeakReference<com.tencent.mm.plugin.appbrand.page.d1> r4 = r4.f311428o
                java.lang.Object r4 = r4.get()
                com.tencent.mm.plugin.appbrand.page.d1 r4 = (com.tencent.p014mm.plugin.appbrand.page.C83780d1) r4
                com.tencent.mm.plugin.appbrand.widget.input.k r0 = com.tencent.p014mm.plugin.appbrand.widget.input.C104873k.this
                java.util.Map<java.lang.String, java.lang.Integer> r1 = com.tencent.p014mm.plugin.appbrand.widget.input.C84947c0.f247596d
                js0.l<com.tencent.mm.plugin.appbrand.page.d1, com.tencent.mm.plugin.appbrand.widget.input.e1<?>> r1 = com.tencent.p014mm.plugin.appbrand.widget.input.C84955f.f247608a
                r1.mo122464e(r4, r0)
            L_0x0015:
                com.tencent.mm.plugin.appbrand.widget.input.k r4 = com.tencent.p014mm.plugin.appbrand.widget.input.C104873k.this
                com.tencent.mm.plugin.appbrand.widget.input.t0 r0 = r4.f311431r
                if (r0 != 0) goto L_0x0021
                com.tencent.mm.plugin.appbrand.widget.input.t0 r0 = r4.mo148835m()
                r4.f311431r = r0
            L_0x0021:
                r0 = 0
                if (r5 == 0) goto L_0x0039
                r4.mo148830B()
                rt0.f r1 = r4.f311427n
                java.lang.Boolean r1 = r1.f331050u
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L_0x007a
                java.lang.Runnable r4 = r4.f311435v
                r1 = 100
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r4, r1)
                goto L_0x007a
            L_0x0039:
                com.tencent.mm.plugin.appbrand.widget.input.w0 r1 = r4.f311430q
                if (r1 == 0) goto L_0x007a
                rt0.f r1 = r4.f311427n
                boolean r1 = r1.f331020T
                if (r1 != 0) goto L_0x005c
                com.tencent.mm.plugin.appbrand.widget.input.k$p r1 = r4.f311426j
                if (r1 != 0) goto L_0x004a
                r4.mo148833k(r0)
            L_0x004a:
                com.tencent.mm.plugin.appbrand.widget.input.w0 r1 = r4.f311430q
                r1.setFocusable(r0)
                com.tencent.mm.plugin.appbrand.widget.input.w0 r1 = r4.f311430q
                r1.setFocusableInTouchMode(r0)
                com.tencent.mm.plugin.appbrand.widget.input.t0 r1 = r4.f311431r
                com.tencent.mm.plugin.appbrand.widget.input.w0 r4 = r4.f311430q
                r1.mo117874c(r4)
                goto L_0x007a
            L_0x005c:
                r4.mo148833k(r0)
                com.tencent.mm.plugin.appbrand.widget.input.t0 r1 = r4.f311431r
                com.tencent.mm.plugin.appbrand.widget.input.w0 r2 = r4.f311430q
                r1.mo117874c(r2)
                com.tencent.mm.plugin.appbrand.widget.input.w0 r1 = r4.f311430q
                r4.mo148848z(r1)
                com.tencent.mm.plugin.appbrand.widget.input.w0 r1 = r4.f311430q
                r1.destroy()
                r1 = 0
                r4.f311430q = r1
                java.util.Set<java.lang.Object> r1 = com.tencent.p014mm.plugin.appbrand.utils.C84737f0.f247137a
                java.util.HashSet r1 = (java.util.HashSet) r1
                r1.remove(r4)
            L_0x007a:
                if (r5 == 0) goto L_0x008f
                com.tencent.mm.plugin.appbrand.widget.input.k r4 = com.tencent.p014mm.plugin.appbrand.widget.input.C104873k.this
                rt0.f r4 = r4.f311427n
                boolean r4 = r4.f331020T
                if (r4 == 0) goto L_0x008e
                com.tencent.mm.plugin.appbrand.widget.input.k r4 = com.tencent.p014mm.plugin.appbrand.widget.input.C104873k.this
                com.tencent.mm.plugin.appbrand.widget.input.w0 r4 = r4.f311430q
                boolean r4 = com.tencent.p014mm.plugin.appbrand.p026ui.C84545i3.m104134k(r4)
                if (r4 == 0) goto L_0x008f
            L_0x008e:
                r0 = 1
            L_0x008f:
                if (r0 == 0) goto L_0x00ae
                com.tencent.mm.plugin.appbrand.widget.input.k r4 = com.tencent.p014mm.plugin.appbrand.widget.input.C104873k.this
                com.tencent.mm.plugin.appbrand.widget.input.w0 r5 = r4.f311430q
                if (r5 == 0) goto L_0x00ae
                com.tencent.mm.plugin.appbrand.widget.input.t0 r4 = r4.f311431r
                if (r4 == 0) goto L_0x00ae
                r5.requestFocus()
                com.tencent.mm.plugin.appbrand.widget.input.k r4 = com.tencent.p014mm.plugin.appbrand.widget.input.C104873k.this
                com.tencent.mm.plugin.appbrand.widget.input.t0 r5 = r4.f311431r
                com.tencent.mm.plugin.appbrand.widget.input.t0$i r4 = r4.f311419F
                r5.mo117877j(r4)
                com.tencent.mm.plugin.appbrand.widget.input.k r4 = com.tencent.p014mm.plugin.appbrand.widget.input.C104873k.this
                com.tencent.mm.plugin.appbrand.widget.input.t0 r4 = r4.f311431r
                r4.mo117869I()
            L_0x00ae:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.input.C104873k.C104884j.onFocusChange(android.view.View, boolean):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.k$k */
    public class C104885k extends C68712d0.C68713a {
        public C104885k() {
        }

        /* renamed from: L0 */
        public void mo4083L0(String str) {
            C104873k kVar = C104873k.this;
            C104930w0 w0Var = kVar.f311430q;
            if (w0Var != null) {
                try {
                    kVar.f311438y.mo161469a(w0Var.getEditableText(), false);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.k$l */
    public class C104886l implements Runnable {
        public C104886l() {
        }

        public void run() {
            C104873k.this.mo148842t(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.k$m */
    public class C104887m implements Runnable {
        public C104887m() {
        }

        public void run() {
            C104873k.this.f311439z = false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.k$n */
    public interface C104888n {
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.k$o */
    public interface C104889o {
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.k$p */
    public enum C104890p {
        PANEL_HIDDEN,
        CONFIRM_KEYBOARD_CLICKED,
        CONFIRM_BAR_CLICKED
    }

    /* renamed from: i */
    public static void m140583i(C104873k kVar) {
        boolean z = kVar.f311426j == C104890p.CONFIRM_KEYBOARD_CLICKED && C84975p1.m104768c(kVar.f311427n.f331025A);
        if (!z) {
            if (kVar.mo148835m() != null) {
                kVar.f311431r.mo117878o(kVar.f311419F);
                kVar.f311431r.mo117893z();
            } else {
                WeakReference<C83780d1> weakReference = kVar.f311428o;
                if (weakReference != null) {
                    C83780d1 d1Var = weakReference.get();
                    if (d1Var != null) {
                        C84963i1 H0 = d1Var.mo116153H0();
                        if (H0 != null) {
                            H0.hideVKB();
                        }
                    }
                }
            }
            C84996v.m104811c(kVar.f311428o).mo117905d(kVar.f311429p);
        }
        C104930w0 w0Var = kVar.f311430q;
        if (w0Var != null) {
            if (w0Var.hasFocus()) {
                kVar.mo148833k(z);
            }
            if (!z) {
                kVar.f311430q.mo148799c(kVar.f311423g);
                C84983t0 t0Var = kVar.f311431r;
                if (t0Var != null && t0Var.mo117874c(kVar.f311430q)) {
                    kVar.f311431r.mo117878o(kVar.f311419F);
                    kVar.f311431r.mo117893z();
                }
                kVar.f311430q.setFocusable(false);
                kVar.f311430q.setFocusableInTouchMode(false);
                if (kVar.f311427n.f331020T) {
                    kVar.f311431r.mo117874c(kVar.f311430q);
                    kVar.mo148848z(kVar.f311430q);
                    kVar.f311430q.destroy();
                    kVar.f311430q = null;
                    ((HashSet) C84737f0.f247137a).remove(kVar);
                }
            }
        }
    }

    /* renamed from: A */
    public final void mo148829A() {
        C104848b.m140515a(this.f311430q, this.f311427n);
        C110653f fVar = this.f311427n;
        Integer num = fVar.f331043n;
        if (num == null) {
            fVar.f331043n = 140;
        } else if (num.intValue() <= 0) {
            this.f311427n.f331043n = Integer.MAX_VALUE;
        }
        C68712d0 g = C68712d0.m80987g(this.f311430q);
        int intValue = this.f311427n.f331043n.intValue();
        g.f225611e = 0;
        g.f225610d = intValue;
        g.f225607a = false;
        g.f225612f = C45078p0.C45079a.MODE_CHINESE_AS_1;
        g.mo107499d(this.f311434u);
        this.f311430q.setPasswordMode(this.f311427n.f331019S);
        if (C84975p1.m104768c(this.f311427n.f331048s)) {
            this.f311430q.setEnabled(false);
            this.f311430q.setFocusable(false);
            this.f311430q.setFocusableInTouchMode(false);
            this.f311430q.setClickable(false);
        } else {
            this.f311430q.setEnabled(true);
            this.f311430q.setClickable(true);
        }
        C104930w0 w0Var = this.f311430q;
        if (w0Var instanceof C104858e0) {
            Integer num2 = this.f311427n.f331028D;
            if (num2 != null) {
                ((C104858e0) w0Var).setLineSpace((float) num2.intValue());
            }
            Integer num3 = this.f311427n.f331029E;
            if (num3 != null) {
                ((C104858e0) this.f311430q).setLineHeight((float) num3.intValue());
            }
        }
    }

    /* renamed from: B */
    public final void mo148830B() {
        C104930w0 w0Var;
        if (this.f311427n.f331050u.booleanValue()) {
            mo148835m();
        }
        C84983t0 t0Var = this.f311431r;
        if (t0Var != null && (w0Var = this.f311430q) != null) {
            t0Var.f247681w = w0Var;
            t0Var.setComponentView(this.f311427n.f226133G.booleanValue());
            this.f311431r.mo117873N();
            this.f311431r.setShowDoneButton(C84975p1.m104768c(this.f311427n.f331051v));
            C84983t0 t0Var2 = this.f311431r;
            if (t0Var2 != null) {
                t0Var2.setOnSmileyChosenListener(this.f311416C);
                this.f311431r.setOnDoneListener(this.f311417D);
                this.f311431r.setOnVisibilityChangedListener(this.f311418E);
            }
            if (C84545i3.m104134k(this.f311430q) && this.f311430q.hasFocus()) {
                this.f311431r.mo117877j(this.f311419F);
                this.f311431r.mo117869I();
            }
        }
    }

    /* renamed from: C */
    public boolean mo148831C(C104930w0 w0Var, C110653f fVar) {
        WeakReference<C83780d1> weakReference;
        C84957h hVar;
        if (w0Var == null || (weakReference = this.f311428o) == null || weakReference.get() == null || (hVar = (C84957h) this.f311428o.get().mo116152G0()) == null) {
            return false;
        }
        return hVar.mo117836r(this.f311428o.get().f244558J, w0Var, fVar.f331031b.intValue(), fVar.f331032c.intValue(), fVar.f331034e.intValue(), fVar.f331033d.intValue());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo117815a() {
        /*
            r5 = this;
            com.tencent.mm.plugin.appbrand.widget.input.w0 r0 = r5.f311430q
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0056
            java.lang.ref.WeakReference<com.tencent.mm.plugin.appbrand.page.d1> r0 = r5.f311428o
            if (r0 == 0) goto L_0x0056
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L_0x0011
            goto L_0x0056
        L_0x0011:
            com.tencent.mm.plugin.appbrand.widget.input.w0 r0 = r5.f311430q
            r0.destroy()
            java.lang.ref.WeakReference<com.tencent.mm.plugin.appbrand.page.d1> r0 = r5.f311428o
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.appbrand.page.d1 r0 = (com.tencent.p014mm.plugin.appbrand.page.C83780d1) r0
            android.view.ViewGroup r0 = r0.mo116152G0()
            com.tencent.mm.plugin.appbrand.widget.input.h r0 = (com.tencent.p014mm.plugin.appbrand.widget.input.C84957h) r0
            if (r0 != 0) goto L_0x0027
            goto L_0x0056
        L_0x0027:
            com.tencent.mm.plugin.appbrand.widget.input.w0 r3 = r5.f311430q
            boolean r3 = r3.hasFocus()
            if (r3 == 0) goto L_0x0042
            com.tencent.mm.plugin.appbrand.widget.input.n0 r3 = r5.f311432s
            r4 = 8
            if (r3 == 0) goto L_0x0038
            r3.setVisibility(r4)
        L_0x0038:
            r5.mo148835m()
            com.tencent.mm.plugin.appbrand.widget.input.t0 r3 = r5.f311431r
            if (r3 == 0) goto L_0x0042
            r3.setVisibility(r4)
        L_0x0042:
            com.tencent.mm.plugin.appbrand.widget.input.w0 r3 = r5.f311430q
            r0.mo117830l(r3)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.appbrand.page.d1> r0 = r5.f311428o
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.appbrand.page.d1 r0 = (com.tencent.p014mm.plugin.appbrand.page.C83780d1) r0
            com.tencent.mm.plugin.appbrand.widget.input.w0 r3 = r5.f311430q
            com.tencent.p014mm.plugin.appbrand.widget.input.C84947c0.m104720i(r0, r3)
            r0 = 1
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            if (r0 == 0) goto L_0x0064
            r0 = 0
            r5.f311430q = r0
            java.util.Set<java.lang.Object> r0 = com.tencent.p014mm.plugin.appbrand.utils.C84737f0.f247137a
            java.util.HashSet r0 = (java.util.HashSet) r0
            r0.remove(r5)
            return r2
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.input.C104873k.mo117815a():boolean");
    }

    /* renamed from: b */
    public boolean mo117816b() {
        C110653f fVar = this.f311427n;
        return fVar != null && C84975p1.m104768c(fVar.f331026B);
    }

    /* renamed from: c */
    public int mo117817c() {
        Integer num;
        C110653f fVar = this.f311427n;
        if (fVar != null && (num = fVar.f331054y) != null) {
            return num.intValue();
        }
        C104930w0 w0Var = this.f311430q;
        return (w0Var == null || !w0Var.mo148774o()) ? 0 : 5;
    }

    public Editable currentValue() {
        C104930w0 w0Var = this.f311430q;
        if (w0Var == null) {
            return null;
        }
        return w0Var.getText();
    }

    /* renamed from: d */
    public boolean mo117819d(int i, int i2, boolean z) {
        WeakReference<C83780d1> weakReference;
        if (!(this.f311430q == null || (weakReference = this.f311428o) == null || weakReference.get() == null)) {
            this.f311430q.performClick();
        }
        C104848b.m140516b(this.f311430q, i, i2);
        mo148842t(false);
        return true;
    }

    /* renamed from: e */
    public void mo117820e(String str, Integer num) {
        C104930w0 w0Var = this.f311430q;
        if (w0Var != null) {
            w0Var.mo148919B(str);
            Integer valueOf = Integer.valueOf(num == null ? -1 : num.intValue());
            C104848b.m140516b(this.f311430q, valueOf.intValue(), valueOf.intValue());
            mo148842t(false);
            mo148840r();
        }
    }

    /* renamed from: f */
    public final void mo117821f(int i) {
        C104888n nVar = this.f311422f;
        if (nVar != null) {
            C109400m mVar = (C109400m) nVar;
            mVar.getClass();
            try {
                C83780d1 d1Var = (C83780d1) mVar.f327490a.get();
                if (d1Var != null) {
                    mVar.f327491b.mo160603D(getInputId(), i, d1Var);
                    new C82540i0().mo114873s(i, d1Var.mo116160O0(), d1Var, Integer.valueOf(getInputId()));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r1.f311428o;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo117822g(com.tencent.p014mm.plugin.appbrand.page.C83780d1 r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x000e
            java.lang.ref.WeakReference<com.tencent.mm.plugin.appbrand.page.d1> r0 = r1.f311428o
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r0.get()
            if (r2 != r0) goto L_0x000e
            r2 = 1
            goto L_0x000f
        L_0x000e:
            r2 = 0
        L_0x000f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.input.C104873k.mo117822g(com.tencent.mm.plugin.appbrand.page.d1):boolean");
    }

    public final int getInputId() {
        return this.f311429p;
    }

    public <P extends View & C84956g1> P getInputPanel() {
        return this.f311431r;
    }

    /* renamed from: h */
    public EditText mo117825h() {
        return this.f311430q;
    }

    public boolean hideKeyboard() {
        C104930w0 w0Var = this.f311430q;
        boolean z = false;
        if (!(w0Var != null && (w0Var.isFocused() || (mo148835m() != null && mo148835m().getAttachedEditText() == this.f311430q)))) {
            WeakReference<C83780d1> weakReference = this.f311428o;
            if (!(weakReference == null || weakReference.get() == null)) {
                Context context = this.f311428o.get().getContext();
                if ((context instanceof Activity) && ((Activity) context).getCurrentFocus() != null) {
                    z = true;
                }
            }
            if (z) {
                Log.m105918d("MicroMsg.AppBrandInputInvokeHandler", "doHideKeyboard, not focused, return");
                return true;
            }
        }
        C84983t0 m = mo148835m();
        if (m != null) {
            m.setVisibility(8);
        }
        return true;
    }

    /* renamed from: j */
    public boolean mo148832j(C104930w0 w0Var, C110653f fVar) {
        WeakReference<C83780d1> weakReference;
        C84957h hVar;
        if (w0Var == null || (weakReference = this.f311428o) == null || weakReference.get() == null || (hVar = (C84957h) this.f311428o.get().mo116152G0()) == null) {
            return false;
        }
        return hVar.mo117828j(this.f311428o.get().f244558J, w0Var, fVar.f331031b.intValue(), fVar.f331032c.intValue(), fVar.f331034e.intValue(), fVar.f331033d.intValue());
    }

    /* renamed from: k */
    public final void mo148833k(boolean z) {
        String str;
        String str2;
        C104930w0 w0Var = this.f311430q;
        if (w0Var != null) {
            C110653f fVar = this.f311427n;
            C104890p pVar = C104890p.CONFIRM_KEYBOARD_CLICKED;
            C104890p pVar2 = this.f311426j;
            boolean z2 = pVar == pVar2 || C104890p.CONFIRM_BAR_CLICKED == pVar2;
            String obj = w0Var.getText().toString();
            String str3 = fVar != null ? fVar.f331018R : null;
            Map<String, Integer> map = C84947c0.f247596d;
            if ("encrypt-text".equalsIgnoreCase(str3)) {
                Log.m105924i("MicroMsg.AppBrandInputInvokeHandler", "dispatchKeyboardComplete, do encrypt");
                try {
                    str = null;
                    str2 = C68709b1.m80980b(mo148836n(), this.f311428o.get(), fVar);
                } catch (C68698a1 e) {
                    Log.m105921e("MicroMsg.AppBrandInputInvokeHandler", "dispatchKeyboardComplete, encrypt fail since %s", e);
                    str2 = null;
                    str = e.getMessage();
                }
                mo148845w(obj, this.f311430q.getSelectionEnd(), z2, z, str2, str);
                return;
            }
            mo148844v(obj, this.f311430q.getSelectionEnd(), z2, z);
        }
    }

    /* renamed from: l */
    public final void mo148834l() {
        C104930w0 w0Var;
        WeakReference<C83780d1> weakReference = this.f311428o;
        C83780d1 d1Var = weakReference == null ? null : weakReference.get();
        if (this.f311431r == null) {
            mo148835m();
        }
        Object[] objArr = new Object[3];
        boolean z = true;
        objArr[0] = Boolean.valueOf(this.f311430q == null);
        objArr[1] = Boolean.valueOf(d1Var == null);
        objArr[2] = Boolean.valueOf(this.f311431r == null);
        Log.m105925i("MicroMsg.AppBrandInputInvokeHandler", "ensureInputFocusedWithSoftKeyboard, null==mInput[%b], null==page[%b], null==mSmileyPanel[%b]", objArr);
        if (d1Var != null && (w0Var = this.f311430q) != null && this.f311431r != null) {
            Map<String, Integer> map = C84947c0.f247596d;
            C88024r.m109572b(new C84945a0(d1Var, w0Var));
            PBool pBool = new PBool();
            pBool.value = false;
            C104874a aVar = new C104874a(pBool);
            Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(d1Var.getContext());
            if (!(castActivityOrNull == null || castActivityOrNull.getCurrentFocus() == null)) {
                View currentFocus = castActivityOrNull.getCurrentFocus();
                boolean isActive = C84975p1.m104767b(currentFocus).isActive(currentFocus);
                View wrapperView = d1Var.f244558J.getWrapperView();
                if (wrapperView == null || currentFocus == null) {
                    z = false;
                } else {
                    ViewParent parent = currentFocus.getParent();
                    while (true) {
                        if (wrapperView == parent) {
                            break;
                        }
                        parent = parent.getParent();
                        if (parent == null) {
                            break;
                        }
                    }
                    z = false;
                }
                if (isActive && z) {
                    Log.m105924i("MicroMsg.AppBrandInputInvokeHandler", "ensureInputFocusedWithSoftKeyboard, servedConnecting && servedForWebView, delay checkForInput");
                    this.f311431r.setOnVisibilityChangedListener(new C104875b(this, pBool, aVar));
                    C119179t tVar = C119157j.f356862d;
                    C104876c cVar = new C104876c(this, pBool, aVar);
                    C119157j jVar = (C119157j) tVar;
                    jVar.getClass();
                    jVar.mo183892w(cVar, 100, false);
                    return;
                }
            }
            aVar.run();
        }
    }

    /* renamed from: m */
    public final C84983t0 mo148835m() {
        C83780d1 d1Var;
        C84983t0 t0Var = this.f311431r;
        if (t0Var != null) {
            return t0Var;
        }
        WeakReference<C83780d1> weakReference = this.f311428o;
        if (weakReference == null || (d1Var = weakReference.get()) == null) {
            return null;
        }
        C84983t0 y = C84983t0.m104783y(d1Var.f244552D);
        this.f311431r = y;
        return y;
    }

    /* renamed from: n */
    public synchronized C68717h1 mo148836n() {
        C68717h1 h1Var;
        h1Var = this.f311420d;
        if (h1Var == null) {
            C110653f fVar = this.f311427n;
            C84950e eVar = new C84950e(fVar != null ? fVar.f331018R : null, this);
            this.f311420d = eVar;
            h1Var = eVar;
        }
        return h1Var;
    }

    /* renamed from: o */
    public final void mo148837o() {
        C83780d1 d1Var;
        ViewGroup viewGroup;
        C104901n0 n0Var = this.f311432s;
        if (n0Var == null) {
            WeakReference<C83780d1> weakReference = this.f311428o;
            if (!(weakReference == null || (d1Var = weakReference.get()) == null || (viewGroup = d1Var.f244552D) == null)) {
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                if (C107207u.C107211e.m145207b(viewGroup)) {
                    ViewGroup viewGroup2 = d1Var.f244552D;
                    int i = C104901n0.f311479o;
                    n0Var = (C104901n0) viewGroup2.getRootView().findViewById(C0966R.C0970id.f5933so);
                    this.f311432s = n0Var;
                }
            }
            n0Var = null;
        }
        if (n0Var != null) {
            this.f311432s.setVisibility(8);
        }
    }

    /* renamed from: p */
    public final void mo148838p(boolean z) {
        int i;
        C90097c cVar = C90097c.RETURN;
        C90097c cVar2 = C90097c.DONE;
        C83780d1 d1Var = this.f311428o.get();
        ViewGroup viewGroup = d1Var.f244552D;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (C107207u.C107211e.m145207b(viewGroup)) {
            C104883i iVar = null;
            C84983t0 G = C84983t0.m104780G(d1Var.f244552D, (Context) null, d1Var.mo116161P0());
            this.f311431r = G;
            G.setComponentView(this.f311427n.f226133G.booleanValue());
            this.f311431r.mo117873N();
            if (this.f311427n.f331020T) {
                C84983t0 t0Var = this.f311431r;
                if (t0Var != null) {
                    t0Var.setOnSmileyChosenListener(this.f311416C);
                    this.f311431r.setOnDoneListener(this.f311417D);
                    this.f311431r.setOnVisibilityChangedListener(this.f311418E);
                }
                mo148837o();
            }
            this.f311430q.mo148811h(this.f311423g);
            this.f311430q.setOnKeyListener(new C104882h());
            if (this.f311427n.f331020T) {
                C83780d1 d1Var2 = this.f311428o.get();
                C104930w0 w0Var = this.f311430q;
                Map<String, Integer> map = C84947c0.f247596d;
                if (d1Var2 != null) {
                    C88024r.m109572b(new C84945a0(d1Var2, w0Var));
                }
            }
            this.f311431r.setCanSmileyInput(!this.f311427n.f331019S && z);
            C110653f fVar = this.f311427n;
            if (fVar.f331055z == null) {
                if (!fVar.f331050u.booleanValue()) {
                    cVar = cVar2;
                }
                i = cVar.f258754d;
            } else {
                if (!fVar.f331050u.booleanValue()) {
                    C110653f fVar2 = this.f311427n;
                    if (cVar == fVar2.f331055z) {
                        fVar2.f331055z = cVar2;
                    }
                }
                i = this.f311427n.f331055z.f258754d;
            }
            Log.m105918d("MicroMsg.AppBrandInputInvokeHandler", "initSmileyPanelAndShow, myImeOption: " + i);
            if (!this.f311427n.f331050u.booleanValue() || i != 0) {
                iVar = new C104883i(i);
            }
            this.f311430q.setImeOptions(i);
            this.f311430q.setOnEditorActionListener(iVar);
            this.f311431r.setShowDoneButton(this.f311427n.f331051v.booleanValue());
            this.f311431r.f247681w = this.f311430q;
            if (this.f311427n.f331020T) {
                mo148834l();
            } else {
                this.f311430q.setFocusable(false);
                this.f311430q.setFocusableInTouchMode(false);
                this.f311431r.mo117878o(this.f311419F);
                this.f311431r.mo117893z();
            }
            if (this.f311427n.f331020T) {
                C84996v.m104811c(this.f311428o).mo117906e(this.f311429p);
            }
        }
    }

    /* renamed from: q */
    public final void mo148839q(C110653f fVar, int i, int i2) {
        this.f311427n = fVar;
        C83780d1 d1Var = fVar.f331023W.get();
        if (d1Var != null) {
            new C85003w(d1Var);
        }
        WeakReference<C83780d1> weakReference = this.f311427n.f331023W;
        this.f311428o = weakReference;
        C83780d1 d1Var2 = weakReference == null ? null : weakReference.get();
        if (d1Var2 == null || d1Var2.mo116164S0() == null) {
            Log.m105920e("MicroMsg.AppBrandInputInvokeHandler", "insertInputImpl, view not ready, return fail");
            mo148847y();
            return;
        }
        C104930w0 e0Var = C84975p1.m104768c(this.f311427n.f331050u) ? new C104858e0(d1Var2.getContext()) : new C104870h0(d1Var2.getContext());
        this.f311430q = e0Var;
        int i3 = this.f311427n.f331017Q;
        this.f311429p = i3;
        e0Var.setInputId(i3);
        C84947c0.m104719h(d1Var2, this);
        mo148829A();
        this.f311430q.setText(Util.nullAsNil(this.f311427n.f331030a));
        if (C84975p1.m104768c(this.f311427n.f331052w)) {
            mo148840r();
        }
        this.f311430q.addTextChangedListener(new C104895m(this));
        this.f311430q.setOnComposingDismissedListener(new C104900n(this));
        this.f311430q.setOnKeyUpPostImeListener(new C104904o(this));
        if (!mo148832j(this.f311430q, this.f311427n)) {
            Log.m105920e("MicroMsg.AppBrandInputInvokeHandler", "add custom view into webView failed");
            mo148847y();
            return;
        }
        C110651a aVar = this.f311427n.f331022V;
        if (aVar != null && !Util.isNullOrNil((List) aVar.f331012b)) {
            C104841e.m140510a(d1Var2, this.f311430q, this.f311427n.f331022V);
        }
        if (!C84975p1.m104768c(this.f311427n.f331050u)) {
            C104848b.m140516b(this.f311430q, i, i2);
        }
        if (C84975p1.m104768c(this.f311427n.f331050u)) {
            this.f311430q.post(new C104911p(this));
        }
        if (C84975p1.m104768c(this.f311427n.f331050u)) {
            ((C104858e0) this.f311430q).setAdjustKeyboardTo(this.f311427n.f331027C);
        }
        if (C84947c0.m104718g(this.f311427n.f331018R) || "textarea".equalsIgnoreCase(this.f311427n.f331018R)) {
            mo148838p(false);
        } else if ("emoji".equalsIgnoreCase(this.f311427n.f331018R)) {
            mo148838p(true);
        } else {
            Assert.fail(String.format(Locale.US, "Unrecognized type(%s) implementation removed from here", new Object[]{this.f311427n.f331018R}));
        }
        this.f311430q.setOnClickListener(new C104871j(this));
        mo148846x();
    }

    /* renamed from: r */
    public final void mo148840r() {
        WeakReference weakReference;
        C104930w0 w0Var = this.f311430q;
        if (w0Var != null) {
            if (w0Var.getLineCount() != this.f311424h || this.f311430q.mo148941t() != this.f311425i) {
                int i = 0;
                boolean z = this.f311424h == -1;
                this.f311424h = this.f311430q.getLineCount();
                this.f311425i = this.f311430q.mo148941t();
                if (this.f311421e != null) {
                    C104889o oVar = this.f311421e;
                    int i2 = this.f311424h;
                    int i3 = this.f311425i;
                    C109391e.C109392a aVar = (C109391e.C109392a) oVar;
                    int i4 = aVar.f327469a.f311429p;
                    C109391e.this.getClass();
                    C86493v0 d = C86493v0.m107224d();
                    C86493v0.C86495c b = d.mo120946b("AppBrandJsInput@" + i4);
                    C83780d1 d1Var = (b == null || (weakReference = (WeakReference) b.mo120956c("webview_reference", null)) == null) ? null : (C83780d1) weakReference.get();
                    if (d1Var != null && d1Var.isRunning()) {
                        C109391e.C109394c cVar = new C109391e.C109394c((C109391e.C109392a) null);
                        HashMap hashMap = new HashMap();
                        hashMap.put("height", Integer.valueOf(C88020k.m109554e(i3)));
                        hashMap.put("lineCount", Integer.valueOf(i2));
                        hashMap.put("inputId", Integer.valueOf(i4));
                        cVar.mo115194p(d1Var);
                        cVar.mo115165o(hashMap);
                        cVar.mo115158h();
                    }
                }
                if (this.f311427n.f331050u.booleanValue() && !z) {
                    Integer num = this.f311427n.f331033d;
                    Class cls = C84975p1.f247639d;
                    int intValue = num != null ? num.intValue() : 0;
                    Integer num2 = this.f311427n.f331032c;
                    this.f311436w = intValue + (num2 != null ? num2.intValue() : 0);
                    mo148841s();
                    Integer num3 = this.f311427n.f331033d;
                    int intValue2 = num3 != null ? num3.intValue() : 0;
                    Integer num4 = this.f311427n.f331032c;
                    if (num4 != null) {
                        i = num4.intValue();
                    }
                    this.f311437x = intValue2 + i;
                    mo148842t(true);
                }
            }
        }
    }

    /* renamed from: s */
    public final void mo148841s() {
        if (this.f311430q != null && C84975p1.m104768c(this.f311427n.f331052w) && C84975p1.m104768c(this.f311427n.f331050u)) {
            ((C104858e0) this.f311430q).setAutoHeight(true);
            int lineHeight = this.f311430q.getLineHeight();
            int t = this.f311430q.mo148941t();
            Integer num = this.f311427n.f331035f;
            int intValue = (num == null || num.intValue() <= 0) ? lineHeight : this.f311427n.f331035f.intValue();
            Integer num2 = this.f311427n.f331036g;
            int max = (num2 == null || num2.intValue() <= 0) ? Integer.MAX_VALUE : Math.max(this.f311427n.f331036g.intValue(), lineHeight);
            this.f311430q.setMinHeight(intValue);
            this.f311430q.setMaxHeight(max);
            this.f311427n.f331032c = Integer.valueOf(Math.max(intValue, Math.min(t, max)));
            mo148831C(this.f311430q, this.f311427n);
        }
    }

    /* renamed from: t */
    public final void mo148842t(boolean z) {
        C84983t0 t0Var;
        C104930w0 w0Var;
        int i;
        if (this.f311427n.f331050u.booleanValue() && (t0Var = this.f311431r) != null && t0Var.isShown() && (w0Var = this.f311430q) != null && w0Var == this.f311431r.getAttachedEditText()) {
            if (z) {
                int i2 = 0;
                WeakReference<C83780d1> weakReference = this.f311428o;
                if (!(weakReference == null || weakReference.get() == null || this.f311428o.get().mo116152G0() == null)) {
                    i2 = this.f311428o.get().mo116152G0().getMeasuredHeight() + this.f311428o.get().mo116152G0().getScrollY();
                }
                int i3 = this.f311437x;
                if ((i3 > this.f311436w && i3 - this.f311430q.getLineHeight() <= i2) || (((i = this.f311437x) <= this.f311436w && i + this.f311430q.getLineHeight() <= i2) || this.f311430q.mo148941t() >= i2)) {
                    C84996v.m104811c(this.f311428o).mo117906e(this.f311429p);
                    return;
                }
                return;
            }
            C84996v.m104811c(this.f311428o).mo117906e(this.f311429p);
        }
    }

    /* renamed from: u */
    public abstract void mo148843u(String str);

    /* renamed from: v */
    public abstract void mo148844v(String str, int i, boolean z, boolean z2);

    /* renamed from: w */
    public void mo148845w(String str, int i, boolean z, boolean z2, String str2, String str3) {
        mo148844v(str, i, z, z2);
    }

    /* renamed from: x */
    public abstract void mo148846x();

    /* renamed from: y */
    public abstract void mo148847y();

    /* renamed from: z */
    public void mo148848z(C104930w0 w0Var) {
        C84957h hVar;
        if (w0Var != null) {
            w0Var.mo148799c(this.f311423g);
            WeakReference<C83780d1> weakReference = this.f311428o;
            C83780d1 d1Var = weakReference == null ? null : weakReference.get();
            if (d1Var != null && (hVar = (C84957h) d1Var.mo116152G0()) != null) {
                hVar.mo117830l(w0Var);
            }
        }
    }
}
