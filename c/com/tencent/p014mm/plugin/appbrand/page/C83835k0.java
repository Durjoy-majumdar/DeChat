package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.graphics.Color;
import android.view.MenuItem;
import android.view.View;
import br0.C79774c;
import bt0.C79815i;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.menu.C83699y;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.appbrand.page.k0 */
public class C83835k0 implements C82531i.C82533b, C82531i.C82534c {

    /* renamed from: d */
    public C77407n f244701d;

    /* renamed from: e */
    public String f244702e;

    /* renamed from: f */
    public C83780d1 f244703f;

    /* renamed from: g */
    public View f244704g = null;

    /* renamed from: h */
    public List<C83699y> f244705h;

    /* renamed from: i */
    public final Set<Runnable> f244706i = new HashSet();

    /* renamed from: j */
    public final Set<Runnable> f244707j = new HashSet();

    /* renamed from: n */
    public C55541f f244708n;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.k0$f */
    public interface C55541f {
        /* renamed from: a */
        void mo77065a(C83699y yVar);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.k0$a */
    public class C83836a implements View.OnAttachStateChangeListener {
        public C83836a() {
        }

        public void onViewAttachedToWindow(View view) {
            Iterator it = ((HashSet) C83835k0.this.f244706i).iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public void onViewDetachedFromWindow(View view) {
            Iterator it = ((HashSet) C83835k0.this.f244707j).iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.k0$b */
    public class C83837b implements C11182m0 {
        public C83837b() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            C83835k0.m103117c(C83835k0.this, e0Var, true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.k0$c */
    public class C83838c implements C11184p0 {
        public C83838c() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C83835k0.m103118d(C83835k0.this, menuItem);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.k0$d */
    public class C83839d implements C11182m0 {
        public C83839d() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            C83835k0.m103117c(C83835k0.this, e0Var, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.k0$e */
    public class C83840e implements C11184p0 {
        public C83840e() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C83835k0.m103118d(C83835k0.this, menuItem);
        }
    }

    public C83835k0(C83780d1 d1Var, List<C83699y> list, boolean z) {
        this.f244702e = d1Var.getAppId();
        this.f244703f = d1Var;
        this.f244705h = list;
        this.f244701d = new C77407n(d1Var.getContext(), false, z ^ true ? 1 : 0);
        C79774c f0 = d1Var.getRuntime().mo113054f0();
        Log.m105925i("MicroMsg.AppBrandPageActionSheet", "AppBrandPageActionSheet: width [%d]", Integer.valueOf(f0.getVDisplayMetrics().widthPixels));
        if (f0.shouldInLargeScreenCompatMode()) {
            this.f244701d.f225790s1 = (int) (((float) f0.getVDisplayMetrics().widthPixels) * f0.getScale());
        }
        mo116322k(this.f244701d);
    }

    /* renamed from: c */
    public static void m103117c(C83835k0 k0Var, C76874e0 e0Var, boolean z) {
        for (C83699y next : k0Var.f244705h) {
            if (next != null && next.f244318b == z) {
                next.f244321e.mo115966a(k0Var.f244703f.getContext(), k0Var.f244703f, e0Var, k0Var.f244702e);
            }
        }
    }

    /* renamed from: d */
    public static void m103118d(C83835k0 k0Var, MenuItem menuItem) {
        C83699y yVar;
        boolean z;
        List<C83699y> list = k0Var.f244705h;
        int itemId = menuItem.getItemId();
        Iterator<C83699y> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                yVar = null;
                break;
            }
            yVar = it.next();
            if (yVar.f244317a == itemId) {
                break;
            }
        }
        Context context = k0Var.f244703f.getContext();
        C83780d1 d1Var = k0Var.f244703f;
        String str = k0Var.f244702e;
        if (yVar == null) {
            z = false;
        } else {
            yVar.f244321e.mo115967b(context, d1Var, str, yVar);
            z = true;
        }
        if (z) {
            C55541f fVar = k0Var.f244708n;
            if (fVar != null) {
                fVar.mo77065a(yVar);
            }
            k0Var.f244701d.mo107572p();
        }
    }

    /* renamed from: b */
    public void mo22089b() {
        mo116321e();
    }

    /* renamed from: e */
    public final boolean mo116321e() {
        try {
            this.f244701d.mo107572p();
            this.f244703f.mo114863i(this);
            this.f244703f.mo114867r(this);
            return true;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrandPageActionSheet", "hide exception = %s", e);
            return false;
        }
    }

    /* renamed from: k */
    public void mo116322k(C77407n nVar) {
        View a1 = this.f244703f.mo116172a1();
        if (a1 != null) {
            this.f244701d.mo107569n(a1, true);
            this.f244704g = a1;
        }
        this.f244703f.getClass();
        C77407n nVar2 = this.f244701d;
        nVar2.f225771i = new C83837b();
        nVar2.f225782p = new C83838c();
        nVar2.f225773j = new C83839d();
        nVar2.f225787r = new C83840e();
        if (C79815i.C79816a.BLACK == this.f244703f.f244564Q) {
            nVar2.mo107566k(Color.parseColor("#000000"));
        }
    }

    /* renamed from: l */
    public void mo116323l(C77407n nVar) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024 A[Catch:{ Exception -> 0x006f }] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo116324n() {
        /*
            r5 = this;
            r0 = 0
            qo3.n r1 = r5.f244701d     // Catch:{ Exception -> 0x006f }
            com.tencent.mm.plugin.appbrand.page.d1 r2 = r5.f244703f     // Catch:{ Exception -> 0x006f }
            boolean r2 = r2.mo109677x()     // Catch:{ Exception -> 0x006f }
            r3 = 1
            if (r2 != 0) goto L_0x0017
            com.tencent.mm.plugin.appbrand.page.d1 r2 = r5.f244703f     // Catch:{ Exception -> 0x006f }
            boolean r2 = r2.mo116167V0()     // Catch:{ Exception -> 0x006f }
            if (r2 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r2 = 0
            goto L_0x0018
        L_0x0017:
            r2 = 1
        L_0x0018:
            r1.f225774j1 = r2     // Catch:{ Exception -> 0x006f }
            qo3.n r1 = r5.f244701d     // Catch:{ Exception -> 0x006f }
            com.tencent.mm.plugin.appbrand.page.d1 r2 = r5.f244703f     // Catch:{ Exception -> 0x006f }
            boolean r2 = r2.mo109677x()     // Catch:{ Exception -> 0x006f }
            if (r2 != 0) goto L_0x002f
            com.tencent.mm.plugin.appbrand.page.d1 r2 = r5.f244703f     // Catch:{ Exception -> 0x006f }
            boolean r2 = r2.mo116167V0()     // Catch:{ Exception -> 0x006f }
            if (r2 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r2 = 0
            goto L_0x0030
        L_0x002f:
            r2 = 1
        L_0x0030:
            r1.f225779n1 = r2     // Catch:{ Exception -> 0x006f }
            qo3.n r1 = r5.f244701d     // Catch:{ Exception -> 0x006f }
            r5.mo116323l(r1)     // Catch:{ Exception -> 0x006f }
            qo3.n r1 = r5.f244701d     // Catch:{ Exception -> 0x006f }
            r1.mo107573q()     // Catch:{ Exception -> 0x006f }
            com.tencent.mm.plugin.appbrand.page.d1 r1 = r5.f244703f     // Catch:{ Exception -> 0x006f }
            r1.mo114864j(r5)     // Catch:{ Exception -> 0x006f }
            com.tencent.mm.plugin.appbrand.page.d1 r1 = r5.f244703f     // Catch:{ Exception -> 0x006f }
            r1.mo114865m(r5)     // Catch:{ Exception -> 0x006f }
            qo3.n r1 = r5.f244701d     // Catch:{ Exception -> 0x006f }
            android.view.Window r1 = r1.mo107558c()     // Catch:{ Exception -> 0x006f }
            android.view.View r1 = r1.getDecorView()     // Catch:{ Exception -> 0x006f }
            com.tencent.mm.plugin.appbrand.page.k0$a r2 = new com.tencent.mm.plugin.appbrand.page.k0$a     // Catch:{ Exception -> 0x006f }
            r2.<init>()     // Catch:{ Exception -> 0x006f }
            r1.addOnAttachStateChangeListener(r2)     // Catch:{ Exception -> 0x006f }
            qo3.n r1 = r5.f244701d     // Catch:{ Exception -> 0x006f }
            android.view.Window r1 = r1.mo107558c()     // Catch:{ Exception -> 0x006f }
            r2 = 131072(0x20000, float:1.83671E-40)
            r1.setFlags(r2, r2)     // Catch:{ Exception -> 0x006f }
            qo3.n r1 = r5.f244701d     // Catch:{ Exception -> 0x006f }
            android.view.Window r1 = r1.mo107558c()     // Catch:{ Exception -> 0x006f }
            r2 = 48
            r1.setSoftInputMode(r2)     // Catch:{ Exception -> 0x006f }
            return r3
        L_0x006f:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r3 = "MicroMsg.AppBrandPageActionSheet"
            java.lang.String r4 = "showActionSheet"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r1, r4, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.page.C83835k0.mo116324n():boolean");
    }

    public void onDestroy() {
        mo116321e();
    }
}
