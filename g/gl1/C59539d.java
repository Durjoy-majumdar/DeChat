package gl1;

import al1.C0079b;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: gl1.d */
public final class C59539d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f170169d;

    /* renamed from: e */
    public final /* synthetic */ C0079b f170170e;

    /* renamed from: f */
    public final /* synthetic */ C59547g f170171f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59539d(boolean z, C0079b bVar, C59547g gVar) {
        super(0);
        this.f170169d = z;
        this.f170170e = bVar;
        this.f170171f = gVar;
    }

    public Object invoke() {
        C0079b bVar;
        FinderLiveAnchorAfterPlugin finderLiveAnchorAfterPlugin;
        if (!(!this.f170169d || (bVar = this.f170170e) == null || (finderLiveAnchorAfterPlugin = this.f170171f.f170181n) == null)) {
            finderLiveAnchorAfterPlugin.mo3205f1(bVar);
        }
        return C13598b0.f38549a;
    }
}
