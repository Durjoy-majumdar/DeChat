package p234sk;

import android.content.Context;
import com.tencent.p014mm.emoji.debug.EmojiDebugUI;
import fy3.C32224a;
import gy3.C87413o;
import p910lj.C76701a;
import rx3.C13598b0;

/* renamed from: sk.e */
public final class C13693e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ EmojiDebugUI f38748d;

    /* renamed from: e */
    public final /* synthetic */ int f38749e;

    /* renamed from: f */
    public final /* synthetic */ int f38750f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13693e(EmojiDebugUI emojiDebugUI, int i, int i2) {
        super(0);
        this.f38748d = emojiDebugUI;
        this.f38749e = i;
        this.f38750f = i2;
    }

    public Object invoke() {
        EmojiDebugUI emojiDebugUI = this.f38748d;
        C76701a.makeText((Context) emojiDebugUI, (CharSequence) "errType=" + this.f38749e + ", errCode=" + this.f38750f, 0).show();
        return C13598b0.f38549a;
    }
}
