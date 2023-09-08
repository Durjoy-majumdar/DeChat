package vq0;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: vq0.i */
public final class C37808i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel f100127d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37808i(WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel webRenderingCacheIPCOperations$WebRenderingCacheRecordParcel) {
        super(0);
        this.f100127d = webRenderingCacheIPCOperations$WebRenderingCacheRecordParcel;
    }

    public Object invoke() {
        C37802b a = this.f100127d.mo56849a();
        Log.m105924i("MicroMsg.AppBrand.WebRenderingCacheIPCOperations", "delete " + a);
        C37803c cVar = (C37803c) C81161g2.Bx0(C37803c.class);
        if (cVar != null) {
            cVar.delete(a, new String[0]);
        }
        return C13598b0.f38549a;
    }
}
