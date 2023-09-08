package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import bt0.C79811f;
import bu0.C79819c;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p1042u.C90590d;
import p170ic.C87690d;
import p225rc.C89925n;
import p329d3.C86165a;
import u24.C90599h;

/* renamed from: com.tencent.mm.plugin.appbrand.page.x */
public class C83966x extends C83820i0 {

    /* renamed from: L */
    public String f245119L;

    /* renamed from: M */
    public final SparseIntArray f245120M = new SparseIntArray();

    /* renamed from: N */
    public ViewGroup f245121N;

    /* renamed from: P */
    public C79819c f245122P;

    /* renamed from: Q */
    public boolean f245123Q = false;

    /* renamed from: R */
    public FrameLayout f245124R;

    /* renamed from: S */
    public C83780d1 f245125S;

    /* renamed from: T */
    public Map<String, C83780d1> f245126T = new HashMap();

    /* renamed from: U */
    public SparseArray<AppBrandPageFullScreenView> f245127U = new SparseArray<>();

    /* renamed from: V */
    public boolean f245128V = false;

    /* renamed from: W */
    public boolean f245129W = false;

    /* renamed from: p0 */
    public final Runnable f245130p0 = new x$$d(this);

    /* renamed from: x0 */
    public final Runnable f245131x0 = new x$$e(this);

    /* renamed from: y0 */
    public final LinkedList<x$$i> f245132y0 = new LinkedList<>();

    public C83966x(Context context, C83849m0 m0Var) {
        super(context, m0Var);
    }

    /* renamed from: B */
    public void mo114316B(long j, String str, C83817h4 h4Var) {
        mo116594R(j, str, (x$$h) null, h4Var);
    }

    /* renamed from: C */
    public void mo116223C() {
        getCurrentPageView().getClass();
    }

    /* renamed from: D */
    public void mo116224D() {
        super.mo116224D();
        getCurrentPageView().mo116171Z0();
    }

    /* renamed from: E */
    public void mo116225E() {
        super.mo116225E();
        C83780d1 d1Var = this.f245125S;
        if (d1Var != null) {
            d1Var.mo116174c1();
        }
        mo116595S(new x$$c());
    }

    /* renamed from: F */
    public void mo116226F() {
        super.mo116226F();
        getCurrentPageView().mo116175d1();
    }

    /* renamed from: L */
    public boolean mo116287L() {
        return super.mo116287L() && this.f245123Q;
    }

    /* renamed from: N */
    public void mo116228N(String str, C83780d1 d1Var) {
        this.f245119L = str;
        this.f245120M.put(str.hashCode(), 1);
        ((HashMap) this.f245126T).put(C89925n.m112488a(str), d1Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0034, code lost:
        if (r4.getChildAt(r4.getChildCount() - 1) == r2) goto L_0x0038;
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo116591O(long r22, java.lang.String r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = 0
            r0.f245128V = r1
            java.lang.String r2 = p225rc.C89925n.m112488a(r24)
            java.util.Map<java.lang.String, com.tencent.mm.plugin.appbrand.page.d1> r3 = r0.f245126T
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r3 = r3.get(r2)
            com.tencent.mm.plugin.appbrand.page.d1 r3 = (com.tencent.p014mm.plugin.appbrand.page.C83780d1) r3
            java.lang.String r4 = r3.mo116162Q0()
            boolean r2 = u24.C90599h.m113509b(r4, r2)
            junit.framework.Assert.assertTrue(r2)
            android.view.ViewGroup r2 = r3.f244552D
            android.view.ViewParent r4 = r2.getParent()
            boolean r5 = r4 instanceof android.view.ViewGroup
            r6 = 1
            if (r5 == 0) goto L_0x0037
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r5 = r4.getChildCount()
            int r5 = r5 - r6
            android.view.View r4 = r4.getChildAt(r5)
            if (r4 != r2) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r6 = 0
        L_0x0038:
            r2 = 4
            if (r6 != 0) goto L_0x0079
            android.view.View r4 = r3.getContentView()
            k20.a r5 = new k20.a
            r5.<init>()
            k20.C60958c.m71442b(r2, r5)
            java.lang.Object[] r8 = r5.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/appbrand/page/AppBrandMultiplePage"
            java.lang.String r10 = "bringPageViewToFront"
            java.lang.String r11 = "(JLjava/lang/String;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r4
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r5 = r5.mo10231a(r1)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r8 = "com/tencent/mm/plugin/appbrand/page/AppBrandMultiplePage"
            java.lang.String r9 = "bringPageViewToFront"
            java.lang.String r10 = "(JLjava/lang/String;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
        L_0x0079:
            r4 = 0
            java.util.Map<java.lang.String, com.tencent.mm.plugin.appbrand.page.d1> r5 = r0.f245126T
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.util.Collection r5 = r5.values()
            java.util.Iterator r5 = r5.iterator()
        L_0x0086:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00a0
            java.lang.Object r6 = r5.next()
            com.tencent.mm.plugin.appbrand.page.d1 r6 = (com.tencent.p014mm.plugin.appbrand.page.C83780d1) r6
            android.view.View r7 = r6.getContentView()
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L_0x0086
            if (r3 == r6) goto L_0x0086
            r4 = r6
            goto L_0x0086
        L_0x00a0:
            android.view.View r5 = r3.getContentView()
            r5.bringToFront()
            android.view.View r5 = r3.getContentView()
            k20.a r14 = new k20.a
            r14.<init>()
            k20.C60958c.m71442b(r1, r14)
            java.lang.Object[] r7 = r14.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/appbrand/page/AppBrandMultiplePage"
            java.lang.String r9 = "bringPageViewToFront"
            java.lang.String r10 = "(JLjava/lang/String;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r5
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r6 = r14.mo10231a(r1)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.setVisibility(r6)
            java.lang.String r7 = "com/tencent/mm/plugin/appbrand/page/AppBrandMultiplePage"
            java.lang.String r8 = "bringPageViewToFront"
            java.lang.String r9 = "(JLjava/lang/String;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r6 = r5
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            if (r4 == 0) goto L_0x0126
            android.view.View r5 = r4.getContentView()
            k20.a r6 = new k20.a
            r6.<init>()
            k20.C60958c.m71442b(r2, r6)
            java.lang.Object[] r14 = r6.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/appbrand/page/AppBrandMultiplePage"
            java.lang.String r16 = "bringPageViewToFront"
            java.lang.String r17 = "(JLjava/lang/String;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r5
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r6 = r6.mo10231a(r1)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.setVisibility(r6)
            java.lang.String r14 = "com/tencent/mm/plugin/appbrand/page/AppBrandMultiplePage"
            java.lang.String r15 = "bringPageViewToFront"
            java.lang.String r16 = "(JLjava/lang/String;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
        L_0x0126:
            if (r4 == 0) goto L_0x012b
            r4.mo116171Z0()
        L_0x012b:
            r3.mo116175d1()
            android.util.SparseArray<com.tencent.mm.plugin.appbrand.page.AppBrandPageFullScreenView> r3 = r0.f245127U
            int r3 = r3.size()
            if (r3 > 0) goto L_0x0137
            goto L_0x0166
        L_0x0137:
            r3 = 0
        L_0x0138:
            android.util.SparseArray<com.tencent.mm.plugin.appbrand.page.AppBrandPageFullScreenView> r4 = r0.f245127U
            int r4 = r4.size()
            if (r3 >= r4) goto L_0x014e
            android.util.SparseArray<com.tencent.mm.plugin.appbrand.page.AppBrandPageFullScreenView> r4 = r0.f245127U
            java.lang.Object r4 = r4.valueAt(r3)
            com.tencent.mm.plugin.appbrand.page.AppBrandPageFullScreenView r4 = (com.tencent.p014mm.plugin.appbrand.page.AppBrandPageFullScreenView) r4
            r4.setVisibility(r2)
            int r3 = r3 + 1
            goto L_0x0138
        L_0x014e:
            com.tencent.mm.plugin.appbrand.page.d1 r2 = r21.getCurrentPageView()
            if (r2 != 0) goto L_0x0155
            goto L_0x0166
        L_0x0155:
            android.util.SparseArray<com.tencent.mm.plugin.appbrand.page.AppBrandPageFullScreenView> r3 = r0.f245127U
            int r2 = r2.hashCode()
            java.lang.Object r2 = r3.get(r2)
            com.tencent.mm.plugin.appbrand.page.AppBrandPageFullScreenView r2 = (com.tencent.p014mm.plugin.appbrand.page.AppBrandPageFullScreenView) r2
            if (r2 == 0) goto L_0x0166
            r2.setVisibility(r1)
        L_0x0166:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.page.C83966x.mo116591O(long, java.lang.String):void");
    }

    /* renamed from: P */
    public final void mo116592P(boolean z) {
        Iterator<x$$i> it = this.f245132y0.iterator();
        while (it.hasNext()) {
            x$$i next = it.next();
            removeCallbacks(next);
            if (z) {
                next.run();
            } else {
                next.f245145e = true;
            }
        }
        this.f245132y0.clear();
    }

    /* renamed from: Q */
    public synchronized C83780d1 mo116593Q(boolean z) {
        if (!z) {
            C83780d1 d1Var = this.f245125S;
            if (d1Var != null) {
                return d1Var;
            }
        }
        return (C83780d1) ((HashMap) this.f245126T).get(C89925n.m112488a(this.f245119L));
    }

    /* renamed from: R */
    public final void mo116594R(long j, String str, x$$h x__h, C83817h4 h4Var) {
        AtomicBoolean atomicBoolean;
        String str2 = str;
        x$$h x__h2 = x__h;
        C83817h4 h4Var2 = C83817h4.SWITCH_TAB;
        Log.m105925i("MicroMsg.AppBrandMultiplePage", "AppBrandPageProfile| loadUrl, appId:%s, url:%s", getAppId(), str2);
        if (!C90599h.m113509b(str2, this.f245119L) || this.f245120M.get(str.hashCode(), 0) != 1) {
            int b = this.f245122P.mo110000b(str2);
            if (b < 0) {
                Log.m105921e("MicroMsg.AppBrandMultiplePage", "loadUrl, index not found, appId:%s, url:%s", getAppId(), str2);
                if (x__h2 != null) {
                    x__h2.mo116459c(this, str2);
                    return;
                }
                return;
            }
            mo116592P(true);
            C83780d1 Q = mo116593Q(true);
            this.f245119L = str2;
            this.f245120M.put(str.hashCode(), 1);
            this.f245122P.mo110003f(b);
            if (((HashMap) this.f245126T).get(C89925n.m112488a(str)) == null) {
                if (Q == null || !Q.mo116205x1() || !Q.mo116207y1(str2)) {
                    String a = C89925n.m112488a(str);
                    synchronized (this) {
                        Q = this.f245125S;
                        if (Q != null) {
                            this.f245125S = null;
                        } else {
                            Q = getContainer().mo116364p(a);
                            Q.f244572U = this;
                        }
                        ((HashMap) this.f245126T).put(a, Q);
                        this.f245124R.addView(Q.f244552D, 0);
                    }
                } else {
                    ((HashMap) this.f245126T).put(C89925n.m112488a(str), Q);
                }
                C83780d1 d1Var = Q;
                boolean[] zArr = new boolean[1];
                x$$f x__f = new x$$f(this, x__h2, zArr, str2);
                Log.m105925i("MicroMsg.AppBrandMultiplePage", "loadAndWait appId[%s] url[%s]", getAppId(), str2);
                C83761b0 b0Var = new C83761b0(this, j, str, x__f);
                AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                try {
                    C83772c0 c0Var = r1;
                    AtomicBoolean atomicBoolean3 = atomicBoolean2;
                    C83761b0 b0Var2 = b0Var;
                    String str3 = "MicroMsg.AppBrandMultiplePage";
                    try {
                        C83772c0 c0Var2 = new C83772c0(this, d1Var, atomicBoolean2, b0Var, System.currentTimeMillis(), str);
                        d1Var.mo116272g0(c0Var);
                        if (((HashMap) this.f245126T).size() > 1) {
                            C83761b0 b0Var3 = b0Var2;
                            this.f245132y0.addLast(b0Var3);
                            postDelayed(b0Var3, 500);
                        }
                        this.f245128V = true;
                        if (!d1Var.mo116205x1() || C90599h.m113511d(C89925n.m112488a(d1Var.f244582x0))) {
                            d1Var.mo116169X0(j, str2, h4Var);
                        } else {
                            Log.m105924i(str3, "[perf] customRoute[switchTab] in loadAndWait");
                            d1Var.mo116198u0(j, str, h4Var2, (JSONObject) null, false);
                        }
                        atomicBoolean3.set(true);
                        if (x__h2 != null) {
                            x__h2.mo116458b(this, str2);
                            zArr[0] = true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        atomicBoolean = atomicBoolean3;
                        atomicBoolean.set(true);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    atomicBoolean = atomicBoolean2;
                    atomicBoolean.set(true);
                    throw th;
                }
            } else {
                long j2 = j;
                String a2 = C89925n.m112488a(str);
                C83780d1 d1Var2 = (C83780d1) ((HashMap) this.f245126T).get(a2);
                if (d1Var2.mo116205x1() && !C90599h.m113509b(d1Var2.mo116162Q0(), a2)) {
                    d1Var2.mo116198u0(j, str, h4Var2, (JSONObject) null, false);
                }
                if (x__h2 != null) {
                    x__h2.mo116458b(this, str2);
                }
                mo116591O(j, str);
                if (x__h2 != null) {
                    x__h2.mo116457a(this, str2);
                }
            }
        } else if (x__h2 != null) {
            x__h2.mo116458b(this, str2);
            x__h2.mo116457a(this, str2);
        }
    }

    /* renamed from: S */
    public final void mo116595S(C86165a<C83780d1> aVar) {
        Collection values = ((HashMap) this.f245126T).values();
        C90590d dVar = new C90590d();
        if (values != null) {
            dVar.addAll(values);
        }
        Iterator it = dVar.iterator();
        while (it.hasNext()) {
            aVar.accept((C83780d1) it.next());
        }
    }

    /* renamed from: e */
    public void mo116288e(C83780d1 d1Var, AppBrandPageFullScreenView appBrandPageFullScreenView) {
        if (d1Var == null) {
            Log.m105920e("MicroMsg.AppBrandMultiplePage", "getCurrentFullScreenView err, pageView is null");
        } else if (appBrandPageFullScreenView != null && appBrandPageFullScreenView.getParent() == null) {
            ViewGroup viewGroup = this.f245121N;
            if (viewGroup instanceof ViewGroup) {
                viewGroup.addView(appBrandPageFullScreenView, new ViewGroup.LayoutParams(-1, -1));
                this.f245127U.put(d1Var.hashCode(), appBrandPageFullScreenView);
            }
        }
    }

    /* renamed from: f */
    public void mo116229f() {
        this.f245129W = true;
        C83780d1 d1Var = this.f245125S;
        if (d1Var != null) {
            d1Var.mo114329F();
        }
        mo116595S(new x$$a());
        mo116592P(false);
        removeCallbacks(this.f245130p0);
        removeCallbacks(this.f245131x0);
        C79819c cVar = this.f245122P;
        if (cVar != null) {
            cVar.setClickListener((C79819c.C79830j) null);
            this.f245122P.mo109999a();
            this.f245122P = null;
        }
        this.f245124R = null;
        ((HashMap) this.f245126T).clear();
        removeAllViews();
    }

    /* renamed from: g */
    public View mo114317g() {
        if (this.f245121N == null) {
            x$$j x__j = new x$$j(this, getContext());
            this.f245124R = new FrameLayout(getContext());
            C87690d.m109091b("createTabBar", new C83980z(this));
            if (getContainer().getAppConfig().mo113985d().f239643f) {
                this.f245122P.setVisibility(8);
                this.f245123Q = true;
            }
            if ("top".equals(getContainer().getAppConfig().mo113985d().f239638a)) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                x__j.addView(this.f245124R, layoutParams);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(10);
                x__j.addView(this.f245122P, layoutParams2);
            } else {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams3.addRule(12);
                x__j.addView(this.f245122P, layoutParams3);
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams4.addRule(2, this.f245122P.getId());
                layoutParams4.removeRule(12);
                x__j.addView(this.f245124R, layoutParams4);
            }
            this.f245121N = x__j;
            C83780d1 p = getContainer().mo116364p(this.f245119L);
            this.f245125S = p;
            p.f244572U = this;
        }
        return this.f245121N;
    }

    public synchronized C83780d1 getCurrentPageView() {
        return mo116593Q(false);
    }

    public String getCurrentUrl() {
        return this.f245119L;
    }

    public C79819c getTabBar() {
        return this.f245122P;
    }

    /* renamed from: n */
    public void mo116232n(String str, String str2, int[] iArr) {
        C83780d1 d1Var = this.f245125S;
        if (d1Var != null && mo116309y(iArr, d1Var.getComponentId())) {
            this.f245125S.mo109652f(str, str2, 0);
        }
        mo116595S(new x$$b(this, iArr, str, str2));
    }

    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (view2 instanceof C79811f) {
            if (!this.f245129W) {
                post(this.f245130p0);
            }
            if (!this.f245129W) {
                post(this.f245131x0);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f245129W) {
            post(this.f245130p0);
        }
        if (!this.f245129W) {
            post(this.f245131x0);
        }
    }

    /* renamed from: s */
    public C83780d1 mo116233s(int i, boolean z) {
        for (C83780d1 d1Var : ((HashMap) this.f245126T).values()) {
            if (!z || !d1Var.mo116205x1()) {
                if (d1Var.getComponentId() == i) {
                    return d1Var;
                }
            } else if (d1Var.mo116190q0(i)) {
                return d1Var;
            }
        }
        return null;
    }

    public void setInitialUrl(String str) {
        this.f245119L = str;
    }

    /* renamed from: v */
    public boolean mo116235v(String str) {
        return this.f245122P.mo110000b(str) != -1;
    }
}
