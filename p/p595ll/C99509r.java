package p595ll;

import com.tencent.p014mm.api.IEmojiInfo;
import fy3.C32224a;
import gy3.C87413o;
import o40.C61926c;
import p595ll.C99504p;
import rx3.C13598b0;

/* renamed from: ll.r */
public final class C99509r extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C99504p f291740d;

    /* renamed from: e */
    public final /* synthetic */ IEmojiInfo f291741e;

    /* renamed from: f */
    public final /* synthetic */ int f291742f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99509r(C99504p pVar, IEmojiInfo iEmojiInfo, int i) {
        super(0);
        this.f291740d = pVar;
        this.f291741e = iEmojiInfo;
        this.f291742f = i;
    }

    public Object invoke() {
        C99504p.C99506b bVar;
        C99504p.C99505a remove = this.f291740d.f291733b.remove(this.f291741e.getMd5());
        if (!(remove == null || (bVar = this.f291740d.f291734c) == null)) {
            bVar.mo138912a(this.f291742f, remove);
        }
        C99504p pVar = this.f291740d;
        pVar.getClass();
        C61926c.m72668M(new C99508q(pVar));
        return C13598b0.f38549a;
    }
}
