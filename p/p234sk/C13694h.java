package p234sk;

import android.content.Context;
import com.tencent.p014mm.emoji.debug.EmojiDebugUI;
import fy3.C32224a;
import gy3.C87413o;
import p910lj.C76701a;
import rx3.C13598b0;

/* renamed from: sk.h */
public final class C13694h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ EmojiDebugUI f38751d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13694h(EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f38751d = emojiDebugUI;
    }

    public Object invoke() {
        C76701a.makeText((Context) this.f38751d, (CharSequence) "new emoji file done ", 0).show();
        return C13598b0.f38549a;
    }
}
