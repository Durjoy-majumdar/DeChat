package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.PlaySound;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.ui.chatting.component.e6 */
public class C73470e6 implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ VoiceComponent f215883d;

    public C73470e6(VoiceComponent voiceComponent) {
        this.f215883d = voiceComponent;
    }

    public Object invoke() {
        PlaySound.play(this.f215883d.f215752d.mo91565f(), C0966R.string.f7507i8);
        return C13598b0.f38549a;
    }
}
