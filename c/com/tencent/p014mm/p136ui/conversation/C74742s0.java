package com.tencent.p014mm.p136ui.conversation;

import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.conversation.s0 */
public class C74742s0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f219785d;

    /* renamed from: e */
    public final /* synthetic */ MainUI f219786e;

    public C74742s0(MainUI mainUI, int i) {
        this.f219786e = mainUI;
        this.f219785d = i;
    }

    public void run() {
        MainUI mainUI = this.f219786e;
        mainUI.f219476o.smoothScrollToPositionFromTop(this.f219785d, C76577a.m92151b(mainUI.getContext(), 120), 900);
    }
}
