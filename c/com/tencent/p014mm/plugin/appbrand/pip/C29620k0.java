package com.tencent.p014mm.plugin.appbrand.pip;

import android.graphics.Point;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.List;
import wi0.C38158d;
import z04.C112550d0;
import z04.C66731x;

/* renamed from: com.tencent.mm.plugin.appbrand.pip.k0 */
public final class C29620k0 implements C29618i0 {

    /* renamed from: a */
    public final C38158d f80548a = C81161g2.m99451h1();

    /* renamed from: a */
    public void mo56861a(String str, Point point) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(point, "point");
        C38158d dVar = this.f80548a;
        if (dVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(point.x);
            sb.append(',');
            sb.append(point.y);
            dVar.mo61552B9(str + "#PipStablePos", sb.toString());
        }
    }

    public Point get(String str) {
        String str2;
        C87412m.m108594g(str, "appId");
        C38158d dVar = this.f80548a;
        if (dVar != null) {
            str2 = dVar.mo61553Lo(str + "#PipStablePos", (String) null);
        } else {
            str2 = null;
        }
        if (str2 == null) {
            Log.m105928w("MicroMsg.AppBrand.AppBrandPipStablePosLogicWC", "PipStablePosStorage#get, pointStr is null");
            return null;
        }
        List U = C112550d0.m153785U(str2, new String[]{","}, false, 0, 6, (Object) null);
        if (2 != U.size()) {
            Log.m105928w("MicroMsg.AppBrand.AppBrandPipStablePosLogicWC", "PipStablePosStorage#unmarshalPoint, size is not 2");
            return null;
        }
        Integer e = C66731x.m78731e((String) U.get(0));
        Integer e2 = C66731x.m78731e((String) U.get(1));
        if (e != null && e2 != null) {
            return new Point(e.intValue(), e2.intValue());
        }
        Log.m105928w("MicroMsg.AppBrand.AppBrandPipStablePosLogicWC", "PipStablePosStorage#unmarshalPoint, x: " + e + ", y: " + e2);
        return null;
    }
}
