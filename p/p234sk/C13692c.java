package p234sk;

import android.content.Context;
import com.tencent.p014mm.emoji.debug.EmojiDebugUI;
import fy3.C32224a;
import gy3.C8478d0;
import gy3.C87413o;
import p910lj.C76701a;
import qo3.C89779i0;
import rx3.C13598b0;

/* renamed from: sk.c */
public final class C13692c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ EmojiDebugUI f38745d;

    /* renamed from: e */
    public final /* synthetic */ C8478d0 f38746e;

    /* renamed from: f */
    public final /* synthetic */ C89779i0 f38747f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13692c(EmojiDebugUI emojiDebugUI, C8478d0 d0Var, C89779i0 i0Var) {
        super(0);
        this.f38745d = emojiDebugUI;
        this.f38746e = d0Var;
        this.f38747f = i0Var;
    }

    public Object invoke() {
        EmojiDebugUI emojiDebugUI = this.f38745d;
        C76701a.makeText((Context) emojiDebugUI, (CharSequence) "added " + this.f38746e.f27483d, 0).show();
        this.f38747f.dismiss();
        return C13598b0.f38549a;
    }
}
