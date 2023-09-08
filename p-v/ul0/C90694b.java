package ul0;

import android.net.Network;
import com.tencent.map.sdk.comps.vis.VisualLayer;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sp0.C90275c0;
import sp0.C90291h;

/* renamed from: ul0.b */
public class C90694b extends C90696d {
    public static final int CTRL_INDEX = 1060;
    public static final String NAME = "createCellularNetworkRequestTaskAsync";

    public C90694b(C90291h.C90295d dVar) {
        super(0, dVar);
    }

    /* renamed from: w */
    public static /* synthetic */ void m113709w(C90694b bVar, C82381f fVar, String str, JSONObject jSONObject, Network network) {
        bVar.getClass();
        if (network == null) {
            Log.m105924i("MicroMsg.AppBrand.JsApiCreateCellularNetworkRequestTaskAsync", "invokeImp, cellular network is unavailable");
            bVar.f260529h.mo124828b(fVar, str, "cellular network is unavailable", 600006, (Map) null);
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("forceCellularNetwork", true);
            super.mo122436d(fVar, jSONObject, str);
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.AppBrand.JsApiCreateCellularNetworkRequestTaskAsync", e, "put forceCellularNetwork fail, are you kidding me?", new Object[0]);
            bVar.f260529h.mo124828b(fVar, str, VisualLayer.OnLayerStatusChangedListener.LayerStatusMsg.MSG_ERR_INTERNAL_ERROR, 600004, (Map) null);
        }
    }

    /* renamed from: d */
    public void mo122436d(C82381f fVar, JSONObject jSONObject, String str) {
        C90275c0.C90277b.f259159h.mo124499b(new b$$a(this, fVar, str, jSONObject));
    }
}
