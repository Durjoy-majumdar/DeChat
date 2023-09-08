package com.tencent.p014mm.plugin.game.p061ui;

import android.view.ViewTreeObserver;
import android.widget.TextView;

/* renamed from: com.tencent.mm.plugin.game.ui.e */
public class C42313e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ TextView f114413d;

    /* renamed from: e */
    public final /* synthetic */ TextView f114414e;

    public C42313e(C42314f fVar, TextView textView, TextView textView2) {
        this.f114413d = textView;
        this.f114414e = textView2;
    }

    public void onGlobalLayout() {
        if (this.f114413d.getLineCount() > 1) {
            this.f114413d.setMaxLines(2);
            this.f114414e.setMaxLines(1);
            return;
        }
        this.f114414e.setMaxLines(2);
    }
}
