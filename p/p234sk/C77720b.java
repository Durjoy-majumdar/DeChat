package p234sk;

import com.tencent.p014mm.emoji.debug.EmojiDebugUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C8477a0;
import gy3.C8478d0;
import gy3.C87413o;
import o40.C61926c;
import qo3.C89779i0;
import rx3.C13598b0;

/* renamed from: sk.b */
public final class C77720b extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C8477a0 f226515d;

    /* renamed from: e */
    public final /* synthetic */ EmojiDebugUI f226516e;

    /* renamed from: f */
    public final /* synthetic */ int f226517f;

    /* renamed from: g */
    public final /* synthetic */ C8478d0 f226518g;

    /* renamed from: h */
    public final /* synthetic */ Object f226519h;

    /* renamed from: i */
    public final /* synthetic */ C89779i0 f226520i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77720b(C8477a0 a0Var, EmojiDebugUI emojiDebugUI, int i, C8478d0 d0Var, Object obj, C89779i0 i0Var) {
        super(1);
        this.f226515d = a0Var;
        this.f226516e = emojiDebugUI;
        this.f226517f = i;
        this.f226518g = d0Var;
        this.f226519h = obj;
        this.f226520i = i0Var;
    }

    public Object invoke(Object obj) {
        this.f226515d.f27482d = !((Boolean) obj).booleanValue();
        String str = this.f226516e.f266603d;
        Log.m105924i(str, "addEmoji: " + this.f226517f + ", " + this.f226515d.f27482d);
        C8478d0 d0Var = this.f226518g;
        d0Var.f27483d = d0Var.f27483d + 1;
        C61926c.m72668M(new C77719a(this.f226520i, this.f226516e, d0Var));
        Object obj2 = this.f226519h;
        synchronized (obj2) {
            obj2.notifyAll();
        }
        return C13598b0.f38549a;
    }
}
