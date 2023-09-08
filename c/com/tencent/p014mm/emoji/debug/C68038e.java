package com.tencent.p014mm.emoji.debug;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import p910lj.C76701a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.emoji.debug.e */
public final class C68038e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ EmojiDebugUI f195267d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68038e(EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f195267d = emojiDebugUI;
    }

    public Object invoke() {
        C76701a.makeText((Context) this.f195267d, (CharSequence) "done", 0).show();
        Log.m105924i(this.f195267d.f266603d, "dump new system emoji , done!");
        return C13598b0.f38549a;
    }
}
