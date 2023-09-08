package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.p136ui.chatting.component.VoiceComponent;

/* renamed from: com.tencent.mm.ui.chatting.component.d6 */
public class C73464d6 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f215871d;

    /* renamed from: e */
    public final /* synthetic */ VoiceComponent.C734013 f215872e;

    public C73464d6(VoiceComponent.C734013 r1, boolean z) {
        this.f215872e = r1;
        this.f215871d = z;
    }

    public void run() {
        VoiceComponent.this.f215752d.mo91540A();
        if (this.f215871d) {
            VoiceComponent.this.f215722i.get().performClick();
        }
    }
}
