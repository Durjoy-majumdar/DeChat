package qj1;

import com.tencent.p014mm.p136ui.C75044y4;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import zj1.C16217b;

/* renamed from: qj1.w2 */
public final class C12722w2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12693u2 f36448d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12722w2(C12693u2 u2Var) {
        super(0);
        this.f36448d = u2Var;
    }

    public Object invoke() {
        this.f36448d.mo12266a1(false);
        this.f36448d.f166287d.animate().translationY((float) C75044y4.m89990b(this.f36448d.f166287d.getContext()).y).setDuration(200).setListener(new C12704v2(this.f36448d)).start();
        C32224a<C13598b0> aVar = this.f36448d.f36376r;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f36448d.getClass();
        C16217b bVar = C16217b.f43438a;
        bVar.mo14746c("anchorlive.bottom.music.song");
        bVar.mo14746c("startlive.bottom.music.song");
        bVar.mo14746c("startlive.bottom.music.bgmusic");
        bVar.mo14746c("anchorlive.bottom.music.bgmusic");
        return C13598b0.f38549a;
    }
}
