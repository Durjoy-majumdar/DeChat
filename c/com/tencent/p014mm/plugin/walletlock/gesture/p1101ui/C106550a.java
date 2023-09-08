package com.tencent.p014mm.plugin.walletlock.gesture.p1101ui;

import com.tencent.p014mm.plugin.walletlock.gesture.p1101ui.GestureGuardLogicUI;
import com.tencent.p014mm.plugin.walletlock.gesture.p1101ui.widget.PatternLockView;

/* renamed from: com.tencent.mm.plugin.walletlock.gesture.ui.a */
public class C106550a implements GestureGuardLogicUI.C106549m {

    /* renamed from: a */
    public final /* synthetic */ PatternLockView f318334a;

    public C106550a(GestureGuardLogicUI gestureGuardLogicUI, PatternLockView patternLockView) {
        this.f318334a = patternLockView;
    }

    public void onDone() {
        this.f318334a.mo153225b();
        this.f318334a.setEnableInput(true);
    }
}
