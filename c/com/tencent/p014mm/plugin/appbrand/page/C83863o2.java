package com.tencent.p014mm.plugin.appbrand.page;

import android.view.View;
import br0.C79773b;
import com.tencent.p014mm.plugin.appbrand.page.C83873p2;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.plugin.appbrand.page.o2 */
public class C83863o2 extends C79773b {

    /* renamed from: d */
    public final /* synthetic */ C83873p2 f244850d;

    public C83863o2(C83873p2 p2Var) {
        this.f244850d = p2Var;
    }

    /* renamed from: f */
    public void mo109901f() {
        WeakReference<View> weakReference;
        View view;
        C83873p2.C83880g q;
        WeakReference<View> weakReference2;
        View view2;
        C83873p2 p2Var = this.f244850d;
        C83873p2.C83880g q2 = p2Var.mo116439q(p2Var.f244875i);
        float[] fArr = p2Var.f244871e;
        if (!(q2 == null || (weakReference = q2.f244907a) == null || fArr == null || (view = weakReference.get()) == null)) {
            int i = p2Var.f244875i;
            int i2 = p2Var.f244870d;
            if (!(i == i2 || (q = p2Var.mo116439q(i2)) == null || (weakReference2 = q.f244907a) == null || (view2 = weakReference2.get()) == null)) {
                p2Var.mo116447y(p2Var.f244870d, fArr, view2.getVisibility(), Boolean.valueOf(q2.f244911e), Boolean.FALSE);
            }
            int i3 = p2Var.f244875i;
            p2Var.f244870d = -1;
            p2Var.f244875i = -1;
            p2Var.mo116447y(i3, fArr, view.getVisibility(), Boolean.valueOf(q2.f244911e), Boolean.FALSE);
        }
        C83798e4 e4Var = this.f244850d.f244873g;
        if (e4Var != null) {
            e4Var.mo22379a();
            this.f244850d.f244873g = null;
        }
    }
}
