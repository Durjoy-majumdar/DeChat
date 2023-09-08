package p993kc;

import android.app.Activity;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85924r4;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84947c0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84967l0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84983t0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import gy3.C87412m;
import java.util.Iterator;
import p176jc.C108699q;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: kc.e */
public final class C108996e {

    /* renamed from: a */
    public final String f326463a = "WebViewExtendInputClient";

    /* renamed from: b */
    public final int f326464b = 5;

    /* renamed from: c */
    public C88135b f326465c;

    /* renamed from: d */
    public C84967l0 f326466d;

    /* renamed from: e */
    public C108995d f326467e;

    /* renamed from: f */
    public EditText f326468f;

    /* renamed from: g */
    public int f326469g;

    /* renamed from: h */
    public boolean f326470h;

    /* renamed from: i */
    public int f326471i;

    /* renamed from: j */
    public int f326472j;

    /* renamed from: k */
    public boolean f326473k;

    /* renamed from: l */
    public Integer f326474l;

    /* renamed from: m */
    public Integer f326475m;

    /* renamed from: n */
    public String f326476n;

    /* renamed from: o */
    public String f326477o;

    /* renamed from: p */
    public int f326478p;

    /* renamed from: q */
    public boolean f326479q;

    /* renamed from: r */
    public final C84983t0.C84990i f326480r = new C108999c(this);

    /* renamed from: s */
    public final C108994c f326481s = new C109000d(this);

    /* renamed from: t */
    public final Runnable f326482t = new C109001e(this);

    /* renamed from: u */
    public final C84967l0.C84970c f326483u = new C108998b(this);

    /* renamed from: kc.e$a */
    public static final class C108997a implements View.OnApplyWindowInsetsListener {

        /* renamed from: d */
        public static final C108997a f326484d = new C108997a();

        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return windowInsets == null ? WindowInsets.CONSUMED : windowInsets;
        }
    }

    /* renamed from: kc.e$b */
    public static final class C108998b implements C84967l0.C84970c {

        /* renamed from: d */
        public final /* synthetic */ C108996e f326485d;

        public C108998b(C108996e eVar) {
            this.f326485d = eVar;
        }

        /* renamed from: d */
        public void mo117850d(boolean z) {
            C108995d a = this.f326485d.mo160115a((InputConnection) null);
            if (a != null) {
                C108996e eVar = this.f326485d;
                EditText editText = eVar.f326468f;
                if (editText != null) {
                    if (z) {
                        a.mo122532f(editText);
                    } else {
                        a.mo122529c(editText);
                    }
                }
                a.mo122531e(z ? eVar.f326471i : 0);
            }
            this.f326485d.mo160119e((Integer) null);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
            r0 = r3.f326485d.f326471i;
         */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo117851e(int r4) {
            /*
                r3 = this;
                if (r4 == 0) goto L_0x000c
                kc.e r0 = r3.f326485d
                int r0 = r0.f326471i
                if (r0 == 0) goto L_0x000c
                if (r4 == r0) goto L_0x000c
                r0 = 1
                goto L_0x000d
            L_0x000c:
                r0 = 0
            L_0x000d:
                kc.e r1 = r3.f326485d
                r1.f326471i = r4
                r2 = 0
                if (r0 == 0) goto L_0x0017
                r1.mo160119e(r2)
            L_0x0017:
                kc.e r0 = r3.f326485d
                kc.d r0 = r0.mo160115a(r2)
                if (r0 == 0) goto L_0x0022
                r0.mo122531e(r4)
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p993kc.C108996e.C108998b.mo117851e(int):void");
        }

        public int getHeight() {
            return this.f326485d.f326471i;
        }
    }

    /* renamed from: kc.e$c */
    public static final class C108999c implements C84983t0.C84990i {

        /* renamed from: a */
        public final /* synthetic */ C108996e f326486a;

        public C108999c(C108996e eVar) {
            this.f326486a = eVar;
        }

        /* renamed from: a */
        public void mo117899a(int i) {
            C108995d dVar = this.f326486a.f326467e;
            if (dVar != null) {
                C87412m.m108591d(dVar);
                int b = dVar.mo122528b();
                Log.m105925i(this.f326486a.f326463a, "OnHeightChangedListener, totalHeight: %d, lateSavedKeyboardPanelHeight: %d, currentKeyboardPanelHeight: %d", Integer.valueOf(i), Integer.valueOf(this.f326486a.f326469g), Integer.valueOf(b));
                C108996e eVar = this.f326486a;
                if (eVar.f326469g != b) {
                    eVar.f326469g = b;
                    eVar.mo160119e((Integer) null);
                }
            }
        }

        /* renamed from: b */
        public EditText mo117900b() {
            EditText editText = this.f326486a.f326468f;
            C87412m.m108591d(editText);
            return editText;
        }
    }

    /* renamed from: kc.e$d */
    public static final class C109000d implements C108994c {

        /* renamed from: a */
        public final /* synthetic */ C108996e f326487a;

        public C109000d(C108996e eVar) {
            this.f326487a = eVar;
        }

        /* renamed from: a */
        public void mo160113a() {
            this.f326487a.mo160119e(0);
        }

        /* renamed from: b */
        public void mo160114b() {
            this.f326487a.mo160118d();
        }
    }

    /* renamed from: kc.e$e */
    public static final class C109001e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C108996e f326488d;

        public C109001e(C108996e eVar) {
            this.f326488d = eVar;
        }

        public final void run() {
            Log.m105926v(this.f326488d.f326463a, "[scrollUp] offsetRunner enter");
            C108996e eVar = this.f326488d;
            C108995d dVar = eVar.f326467e;
            if (dVar != null) {
                if (!dVar.mo117827q()) {
                    String str = eVar.f326463a;
                    Object[] objArr = new Object[2];
                    View view = dVar.getView();
                    objArr[0] = Integer.valueOf(view != null ? view.getMeasuredHeight() : 0);
                    objArr[1] = Integer.valueOf(eVar.f326472j);
                    Log.m105927v(str, "[scrollUp], panel height %d, tryCount %d", objArr);
                    int i = eVar.f326472j + 1;
                    eVar.f326472j = i;
                    if (i < eVar.f326464b) {
                        eVar.mo160118d();
                        return;
                    }
                    return;
                }
                eVar.f326472j = 0;
                View view2 = dVar.getView();
                int measuredHeight = view2 != null ? view2.getMeasuredHeight() : 0;
                Log.m105927v(eVar.f326463a, "[scrollUp], panelHeight %d", Integer.valueOf(measuredHeight));
                eVar.mo160119e(Integer.valueOf(measuredHeight));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [kc.d] */
    /* JADX WARNING: type inference failed for: r2v3, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x009d, code lost:
        return r2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p993kc.C108995d mo160115a(android.view.inputmethod.InputConnection r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.f326463a
            monitor-enter(r0)
            kc.d r1 = r4.f326467e     // Catch:{ all -> 0x009e }
            if (r1 == 0) goto L_0x0013
            java.lang.String r2 = r4.f326476n     // Catch:{ all -> 0x009e }
            java.lang.String r3 = r4.f326477o     // Catch:{ all -> 0x009e }
            boolean r2 = gy3.C87412m.m108589b(r2, r3)     // Catch:{ all -> 0x009e }
            if (r2 == 0) goto L_0x0013
            monitor-exit(r0)
            return r1
        L_0x0013:
            java.lang.String r1 = r4.f326476n     // Catch:{ all -> 0x009e }
            r2 = 0
            if (r1 != 0) goto L_0x001a
            monitor-exit(r0)
            return r2
        L_0x001a:
            boolean r3 = r4.f326470h     // Catch:{ all -> 0x009e }
            if (r3 != 0) goto L_0x0020
            monitor-exit(r0)
            return r2
        L_0x0020:
            boolean r1 = com.tencent.p014mm.plugin.appbrand.widget.input.C84947c0.m104717f(r1)     // Catch:{ all -> 0x009e }
            if (r1 != 0) goto L_0x0030
            java.lang.String r1 = r4.f326476n     // Catch:{ all -> 0x009e }
            java.lang.String r3 = "safe-password"
            boolean r1 = gy3.C87412m.m108589b(r1, r3)     // Catch:{ all -> 0x009e }
            if (r1 == 0) goto L_0x0034
        L_0x0030:
            if (r5 != 0) goto L_0x0034
            monitor-exit(r0)
            return r2
        L_0x0034:
            kc.b r1 = r4.f326465c     // Catch:{ all -> 0x009e }
            if (r1 == 0) goto L_0x007a
            android.view.View r1 = r1.mo122406a()     // Catch:{ all -> 0x009e }
            if (r1 == 0) goto L_0x007a
            java.lang.String r1 = r4.f326476n     // Catch:{ all -> 0x009e }
            gy3.C87412m.m108591d(r1)     // Catch:{ all -> 0x009e }
            kc.d r5 = r4.mo160116b(r1, r5)     // Catch:{ all -> 0x009e }
            r4.f326467e = r5     // Catch:{ all -> 0x009e }
            kc.b r5 = r4.f326465c     // Catch:{ all -> 0x009e }
            gy3.C87412m.m108591d(r5)     // Catch:{ all -> 0x009e }
            android.view.View r5 = r5.mo122406a()     // Catch:{ all -> 0x009e }
            if (r5 == 0) goto L_0x0059
            kc.e$a r1 = p993kc.C108996e.C108997a.f326484d     // Catch:{ all -> 0x009e }
            r5.setOnApplyWindowInsetsListener(r1)     // Catch:{ all -> 0x009e }
        L_0x0059:
            kc.d r5 = r4.f326467e     // Catch:{ all -> 0x009e }
            if (r5 == 0) goto L_0x0073
            android.widget.EditText r1 = new android.widget.EditText     // Catch:{ all -> 0x009e }
            android.view.View r3 = r5.getView()     // Catch:{ all -> 0x009e }
            if (r3 == 0) goto L_0x0069
            android.content.Context r2 = r3.getContext()     // Catch:{ all -> 0x009e }
        L_0x0069:
            r1.<init>(r2)     // Catch:{ all -> 0x009e }
            r4.f326468f = r1     // Catch:{ all -> 0x009e }
            com.tencent.mm.plugin.appbrand.widget.input.t0$i r1 = r4.f326480r     // Catch:{ all -> 0x009e }
            r5.mo122538j(r1)     // Catch:{ all -> 0x009e }
        L_0x0073:
            java.lang.String r5 = r4.f326476n     // Catch:{ all -> 0x009e }
            r4.f326477o = r5     // Catch:{ all -> 0x009e }
            kc.d r2 = r4.f326467e     // Catch:{ all -> 0x009e }
            goto L_0x009c
        L_0x007a:
            java.lang.String r5 = r4.f326476n     // Catch:{ all -> 0x009e }
            java.lang.String r1 = r4.f326477o     // Catch:{ all -> 0x009e }
            boolean r5 = gy3.C87412m.m108589b(r5, r1)     // Catch:{ all -> 0x009e }
            if (r5 != 0) goto L_0x009c
            java.lang.String r5 = r4.f326476n     // Catch:{ all -> 0x009e }
            boolean r5 = com.tencent.p014mm.plugin.appbrand.widget.input.C84947c0.m104718g(r5)     // Catch:{ all -> 0x009e }
            if (r5 != 0) goto L_0x009c
            kc.d r5 = r4.f326467e     // Catch:{ all -> 0x009e }
            if (r5 == 0) goto L_0x0098
            int r1 = r4.f326478p     // Catch:{ all -> 0x009e }
            r5.setXMode(r1)     // Catch:{ all -> 0x009e }
            r5.mo122527a()     // Catch:{ all -> 0x009e }
        L_0x0098:
            java.lang.String r5 = r4.f326476n     // Catch:{ all -> 0x009e }
            r4.f326477o = r5     // Catch:{ all -> 0x009e }
        L_0x009c:
            monitor-exit(r0)
            return r2
        L_0x009e:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p993kc.C108996e.mo160115a(android.view.inputmethod.InputConnection):kc.d");
    }

    /* renamed from: b */
    public final C108995d mo160116b(String str, InputConnection inputConnection) {
        C88135b bVar = this.f326465c;
        if ((bVar != null ? bVar.mo122406a() : null) == null) {
            return new C88134a();
        }
        if (C84947c0.m104717f(str)) {
            C88135b bVar2 = this.f326465c;
            C87412m.m108591d(bVar2);
            View a = bVar2.mo122406a();
            C87412m.m108591d(a);
            C87412m.m108591d(inputConnection);
            C109003h hVar = new C109003h(a, inputConnection, this.f326481s);
            hVar.setXMode(this.f326478p);
            return hVar;
        }
        C88135b bVar3 = this.f326465c;
        C87412m.m108591d(bVar3);
        return new C88137i(bVar3, this.f326481s);
    }

    /* renamed from: c */
    public boolean mo160117c(String str, InputConnection inputConnection) {
        C108995d a;
        if (!(this.f326465c == null || (a = mo160115a((InputConnection) null)) == null)) {
            a.hideKeyboard();
            a.mo122530d(false);
        }
        mo160119e(0);
        C84967l0 l0Var = this.f326466d;
        if (l0Var != null) {
            l0Var.mo117847e(this.f326483u);
        }
        this.f326476n = null;
        this.f326474l = null;
        this.f326475m = null;
        this.f326470h = false;
        C108995d dVar = this.f326467e;
        if (dVar != null) {
            dVar.mo122539o(this.f326480r);
        }
        this.f326467e = null;
        return false;
    }

    /* renamed from: d */
    public final void mo160118d() {
        View a;
        View a2;
        if (this.f326472j == 0) {
            C88135b bVar = this.f326465c;
            if (bVar != null && (a2 = bVar.mo122406a()) != null) {
                a2.post(this.f326482t);
                return;
            }
            return;
        }
        C88135b bVar2 = this.f326465c;
        if (bVar2 != null && (a = bVar2.mo122406a()) != null) {
            a.postOnAnimationDelayed(this.f326482t, 100);
        }
    }

    /* renamed from: e */
    public final void mo160119e(Integer num) {
        int i;
        int i2;
        Insets insets;
        C88135b bVar = this.f326465c;
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(bVar != null ? bVar.mo122407b() : null);
        if (castActivityOrNull == null) {
            Log.m105928w(this.f326463a, "send keyboard height, but activity is null");
            return;
        }
        C88135b bVar2 = this.f326465c;
        if (bVar2 != null && bVar2.mo122406a() != null) {
            WindowInsets b = C85924r4.m106237b(castActivityOrNull);
            int i3 = Build.VERSION.SDK_INT;
            int c = i3 >= 30 ? (b == null || (insets = b.getInsets(WindowInsets.Type.navigationBars())) == null) ? C75044y4.m89991c(castActivityOrNull) : insets.bottom : !this.f326479q ? 0 : C75044y4.m89991c(castActivityOrNull);
            if (b != null) {
                if (num != null) {
                    i = num.intValue();
                } else {
                    if (i3 >= 30) {
                        Insets insets2 = b.getInsets(WindowInsets.Type.ime());
                        C87412m.m108593f(insets2, "getInsets(WindowInsets.Type.ime())");
                        i2 = insets2.bottom;
                    } else {
                        i2 = b.getSystemWindowInsetBottom();
                    }
                    i = i2 - c;
                }
                if (i3 < 30 && (i == 0 || i == C75044y4.m89991c(castActivityOrNull))) {
                    C119179t tVar = C119157j.f356862d;
                    C88136g gVar = new C88136g(this, castActivityOrNull);
                    C119157j jVar = (C119157j) tVar;
                    jVar.getClass();
                    jVar.mo183892w(gVar, 250, false);
                }
                C108699q qVar = C108699q.f325532a;
                Integer num2 = this.f326475m;
                int intValue = num2 != null ? num2.intValue() : -1;
                Iterator<C108699q.C87936b> it = C108699q.f325538g.iterator();
                while (it.hasNext()) {
                    it.next().mo111448a(intValue, i);
                }
            }
        }
    }
}
