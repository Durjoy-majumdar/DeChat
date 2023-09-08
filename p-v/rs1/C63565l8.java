package rs1;

import com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import ej0.C86525c;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: rs1.l8 */
public final class C63565l8 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C86525c f180263d;

    /* renamed from: e */
    public final /* synthetic */ C56711j f180264e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63565l8(C86525c cVar, C56711j jVar) {
        super(0);
        this.f180263d = cVar;
        this.f180264e = jVar;
    }

    public Object invoke() {
        Log.m105924i("FinderProjectionScreenUIC", "onLinkingDevice mrDevice:" + this.f180263d);
        C56711j jVar = this.f180264e;
        jVar.f162605w = this.f180263d;
        jVar.f162606x = jVar.f162607y;
        jVar.f162581E = C31543z5.m39453c();
        this.f180264e.mo80099m3(3);
        return C13598b0.f38549a;
    }
}
