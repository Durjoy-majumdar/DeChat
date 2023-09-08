package p234sk;

import com.tencent.p014mm.emoji.debug.EmojiDebugUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8477a0;
import gy3.C8478d0;
import gy3.C87413o;
import java.util.List;
import o40.C61926c;
import p595ll.C61303b;
import qo3.C89779i0;
import rx3.C13598b0;
import sx3.C26236u;

/* renamed from: sk.d */
public final class C77721d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ List<String> f226521d;

    /* renamed from: e */
    public final /* synthetic */ EmojiDebugUI f226522e;

    /* renamed from: f */
    public final /* synthetic */ C8477a0 f226523f;

    /* renamed from: g */
    public final /* synthetic */ C8477a0 f226524g;

    /* renamed from: h */
    public final /* synthetic */ Object f226525h;

    /* renamed from: i */
    public final /* synthetic */ C8478d0 f226526i;

    /* renamed from: j */
    public final /* synthetic */ C89779i0 f226527j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77721d(List<String> list, EmojiDebugUI emojiDebugUI, C8477a0 a0Var, C8477a0 a0Var2, Object obj, C8478d0 d0Var, C89779i0 i0Var) {
        super(0);
        this.f226521d = list;
        this.f226522e = emojiDebugUI;
        this.f226523f = a0Var;
        this.f226524g = a0Var2;
        this.f226525h = obj;
        this.f226526i = d0Var;
        this.f226527j = i0Var;
    }

    public Object invoke() {
        int size = this.f226521d.size();
        for (int i = 0; i < size; i++) {
            String str = this.f226522e.f266603d;
            Log.m105924i(str, "addEmoji: start " + i + ' ' + this.f226521d.get(i));
            EmojiDebugUI emojiDebugUI = this.f226522e;
            String str2 = this.f226521d.get(i);
            C77720b bVar = new C77720b(this.f226523f, this.f226522e, i, this.f226526i, this.f226525h, this.f226527j);
            emojiDebugUI.getClass();
            new C61303b(0, 4, C26236u.m33719b(str2)).mo9225i().mo123419C(new C77722f(emojiDebugUI, str2, bVar));
            if (this.f226523f.f27482d || this.f226524g.f27482d) {
                break;
            }
            Object obj = this.f226525h;
            synchronized (obj) {
                obj.wait();
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        C61926c.m72668M(new C13692c(this.f226522e, this.f226526i, this.f226527j));
        return C13598b0.f38549a;
    }
}
