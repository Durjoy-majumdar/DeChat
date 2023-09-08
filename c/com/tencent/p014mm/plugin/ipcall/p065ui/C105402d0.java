package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.d0 */
public class C105402d0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ View f313369d;

    /* renamed from: e */
    public final /* synthetic */ C105408f0 f313370e;

    public C105402d0(C105408f0 f0Var, View view) {
        this.f313370e = f0Var;
        this.f313369d = view;
    }

    public void onGlobalLayout() {
        Rect rect = new Rect();
        this.f313369d.getWindowVisibleDisplayFrame(rect);
        if (this.f313369d.getRootView().getHeight() - (rect.bottom - rect.top) > 100) {
            C105408f0 f0Var = this.f313370e;
            f0Var.f313394i.postDelayed(new C105405e0(f0Var), 100);
        }
    }
}
