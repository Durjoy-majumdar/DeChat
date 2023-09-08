package gr1;

import android.content.Context;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ts1.C14083g;

/* renamed from: gr1.b2 */
public final class C8380b2 extends C87413o implements C32224a<C14083g> {

    /* renamed from: d */
    public final /* synthetic */ FinderVideoLayout f27371d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8380b2(FinderVideoLayout finderVideoLayout) {
        super(0);
        this.f27371d = finderVideoLayout;
    }

    public Object invoke() {
        C39818r rVar = C39818r.f106831a;
        Context context = this.f27371d.getContext();
        C87412m.m108593f(context, "context");
        return (C14083g) rVar.mo62443b(context).mo75002a(C14083g.class);
    }
}
