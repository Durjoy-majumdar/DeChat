package er1;

import com.tencent.p014mm.sdk.platformtools.Log;
import d62.C97425j;
import er1.C58784w3;
import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: er1.b4 */
public final class C7785b4 implements C97425j.C58243b {

    /* renamed from: a */
    public final /* synthetic */ C58784w3.C7912a f26285a;

    /* renamed from: b */
    public final /* synthetic */ C32226l<C58784w3.C7912a, C13598b0> f26286b;

    public C7785b4(C58784w3.C7912a aVar, C32226l<? super C58784w3.C7912a, C13598b0> lVar) {
        this.f26285a = aVar;
        this.f26286b = lVar;
    }

    /* renamed from: a */
    public final void mo8896a(boolean z) {
        String str = C58784w3.f168296b;
        Log.m105918d(str, "shareWeworkSupport " + z);
        C58784w3.C7912a aVar = this.f26285a;
        aVar.f26590l = z ^ true;
        this.f26286b.invoke(aVar);
    }
}
