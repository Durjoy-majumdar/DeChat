package i42;

import com.tencent.p014mm.plugin.magicbrush.C85270j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import d42.C86183k;
import e42.C7594e;
import fy3.C32224a;
import gy3.C87413o;
import java.util.Iterator;
import rx3.C13598b0;

/* renamed from: i42.j */
public final class C87647j extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C87609c<C7594e> f253851d;

    /* renamed from: e */
    public final /* synthetic */ C85270j0 f253852e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87647j(C87609c<C7594e> cVar, C85270j0 j0Var) {
        super(0);
        this.f253851d = cVar;
        this.f253852e = j0Var;
    }

    public Object invoke() {
        Log.m105924i(this.f253851d.f253746t, "setMBService");
        C87609c<C7594e> cVar = this.f253851d;
        cVar.f253747u = this.f253852e;
        Iterator<C86183k> it = cVar.f253733g.iterator();
        while (it.hasNext()) {
            it.next().mo109590n();
        }
        return C13598b0.f38549a;
    }
}
