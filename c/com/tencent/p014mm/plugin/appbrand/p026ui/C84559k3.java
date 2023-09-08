package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.view.KeyEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.SwipeBackLayout;
import hp3.C87581a;
import in3.C87763b;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.k3 */
public final class C84559k3 {
    /* renamed from: a */
    public static final void m104143a(MMActivity mMActivity, C87581a<Void, C87763b> aVar) {
        if (mMActivity != null && aVar != null) {
            SwipeBackLayout swipeBackLayout = mMActivity.getSwipeBackLayout();
            C87763b bVar = null;
            KeyEvent.Callback targetContentView = swipeBackLayout != null ? swipeBackLayout.getTargetContentView() : null;
            if (targetContentView instanceof C87763b) {
                bVar = (C87763b) targetContentView;
            }
            if (bVar != null) {
                aVar.call(bVar);
            }
        }
    }
}
