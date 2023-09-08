package p234sk;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.emoji.debug.EmojiDebugUI;
import fy3.C32224a;
import gy3.C8478d0;
import gy3.C87413o;
import qo3.C89779i0;
import rx3.C13598b0;

/* renamed from: sk.a */
public final class C77719a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C89779i0 f226512d;

    /* renamed from: e */
    public final /* synthetic */ EmojiDebugUI f226513e;

    /* renamed from: f */
    public final /* synthetic */ C8478d0 f226514f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77719a(C89779i0 i0Var, EmojiDebugUI emojiDebugUI, C8478d0 d0Var) {
        super(0);
        this.f226512d = i0Var;
        this.f226513e = emojiDebugUI;
        this.f226514f = d0Var;
    }

    public Object invoke() {
        C89779i0 i0Var = this.f226512d;
        i0Var.setMessage(this.f226513e.getString(C0966R.string.c_x) + ' ' + this.f226514f.f27483d);
        return C13598b0.f38549a;
    }
}
