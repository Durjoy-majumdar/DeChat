package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.view.View;
import android.view.Window;
import gy3.C87412m;
import qo3.C12903b;

/* renamed from: com.tencent.mm.plugin.finder.view.q1 */
public final class C4152q1 extends C12903b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4152q1(Context context) {
        super(context, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: G */
    public boolean mo5042G() {
        return true;
    }

    public void show() {
        if (mo12437F()) {
            Window window = getWindow();
            if (window != null) {
                window.setFlags(1024, 1024);
            }
            Window window2 = getWindow();
            View decorView = window2 != null ? window2.getDecorView() : null;
            if (decorView != null) {
                decorView.setSystemUiVisibility(6);
            }
        }
        super.show();
    }
}
