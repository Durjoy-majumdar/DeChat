package vq0;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: vq0.e */
public final class C37804e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel f100125d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37804e(WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel webRenderingCacheIPCOperations$WebRenderingCacheRecordParcel) {
        super(0);
        this.f100125d = webRenderingCacheIPCOperations$WebRenderingCacheRecordParcel;
    }

    public Object invoke() {
        C37803c cVar = (C37803c) C81161g2.Bx0(C37803c.class);
        if (cVar != null) {
            C37802b a = this.f100125d.mo56849a();
            if (cVar.get(a, new String[0])) {
                a.field_accessTime = Util.nowMilliSecond();
                cVar.update(a, new String[0]);
                Log.m105924i("MicroMsg.AppBrand.WebRenderingCacheIPCOperations", "access " + a);
            } else {
                Log.m105920e("MicroMsg.AppBrand.WebRenderingCacheIPCOperations", "access failed " + a);
            }
        }
        return C13598b0.f38549a;
    }
}
