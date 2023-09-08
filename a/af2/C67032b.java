package af2;

import com.tencent.p014mm.autogen.events.ProductOperationEvent;
import com.tencent.p014mm.plugin.product.p087ui.C70106c;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.List;
import ze2.C79322b;

/* renamed from: af2.b */
public class C67032b extends IStaticListener<ProductOperationEvent> {
    public boolean callback(IEvent iEvent) {
        ProductOperationEvent productOperationEvent = (ProductOperationEvent) iEvent;
        if (productOperationEvent.f193823d.f193825a == 1) {
            C67033e wx02 = C79322b.vx0().wx0();
            if (wx02 == null) {
                Log.m105929w("MicroMsg.MallProductListener", "error, xml[%s] can not parse", productOperationEvent.f193823d.f193827c);
                productOperationEvent.f193824e.f193828a = false;
            } else {
                String str = null;
                C67036o c = C67036o.m79218c((C67036o) null, productOperationEvent.f193823d.f193827c);
                wx02.mo91017u(c, (List<C39560p>) null);
                productOperationEvent.f193824e.f193829b = wx02.mo91012p();
                ProductOperationEvent.C67756b bVar = productOperationEvent.f193824e;
                if (!Util.isNullOrNil(c.mo91020a())) {
                    str = C70106c.m82576m(c.mo91020a());
                }
                bVar.f193830c = str;
                productOperationEvent.f193824e.f193828a = true;
            }
        }
        return false;
    }
}
