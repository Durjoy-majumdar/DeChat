package com.tencent.p014mm.plugin.finder.view;

import android.content.DialogInterface;
import android.view.ViewTreeObserver;
import com.tencent.p014mm.plugin.finder.view.C4191v0;

/* renamed from: com.tencent.mm.plugin.finder.view.q0 */
public class C4151q0 implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C4191v0 f18375d;

    public C4151q0(C4191v0 v0Var) {
        this.f18375d = v0Var;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        ViewTreeObserver viewTreeObserver = this.f18375d.f18468n;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                C4191v0 v0Var = this.f18375d;
                v0Var.f18468n = v0Var.f18467j.getViewTreeObserver();
            }
            C4191v0 v0Var2 = this.f18375d;
            v0Var2.f18468n.removeGlobalOnLayoutListener(v0Var2);
            this.f18375d.f18468n = null;
        }
        C4191v0 v0Var3 = this.f18375d;
        if (!v0Var3.f18469o) {
            v0Var3.f18461d = null;
        }
        C4191v0.C4192a aVar = v0Var3.f18472r;
        if (aVar != null) {
            aVar.onDismiss();
        }
        this.f18375d.f18456A.removeAllViews();
        this.f18375d.f18460E.clear();
    }
}
