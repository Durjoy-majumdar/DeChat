package com.tencent.p014mm.p136ui.tools;

/* renamed from: com.tencent.mm.ui.tools.d1 */
public class C97241d1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ PressImageView f285338d;

    public C97241d1(PressImageView pressImageView) {
        this.f285338d = pressImageView;
    }

    public void run() {
        this.f285338d.setPressed(false);
        this.f285338d.invalidate();
    }
}
