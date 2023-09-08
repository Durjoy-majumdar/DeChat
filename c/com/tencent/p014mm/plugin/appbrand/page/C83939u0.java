package com.tencent.p014mm.plugin.appbrand.page;

import java.util.Iterator;
import p977hj.C87526a;

/* renamed from: com.tencent.mm.plugin.appbrand.page.u0 */
public class C83939u0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f245072d;

    /* renamed from: e */
    public final /* synthetic */ String f245073e;

    /* renamed from: f */
    public final /* synthetic */ int[] f245074f;

    /* renamed from: g */
    public final /* synthetic */ C83849m0 f245075g;

    public C83939u0(C83849m0 m0Var, String str, String str2, int[] iArr) {
        this.f245075g = m0Var;
        this.f245072d = str;
        this.f245073e = str2;
        this.f245074f = iArr;
    }

    public void run() {
        C83849m0 m0Var = this.f245075g;
        String str = this.f245072d;
        String str2 = this.f245073e;
        int[] iArr = this.f245074f;
        synchronized (m0Var.f244744o) {
            Iterator<C83820i0> it = m0Var.f244745p.iterator();
            while (it.hasNext()) {
                it.next().mo116232n(str, str2, iArr);
            }
            Iterator<C83820i0> it4 = m0Var.f244746q.iterator();
            while (it4.hasNext()) {
                it4.next().mo116232n(str, str2, iArr);
            }
        }
        C83780d1 d1Var = m0Var.f244748s;
        if (!(d1Var == null || iArr == null || !C87526a.m108856a(iArr, d1Var.getComponentId()))) {
            m0Var.f244748s.mo109652f(str, str2, 0);
        }
        C83780d1 d1Var2 = m0Var.f244749t;
        if (!(d1Var2 == null || iArr == null || !C87526a.m108856a(iArr, d1Var2.getComponentId()))) {
            m0Var.f244749t.mo109652f(str, str2, 0);
        }
        C83820i0 i0Var = m0Var.f244751v;
        if (i0Var != null) {
            i0Var.mo116232n(str, str2, iArr);
        }
    }
}
