package k11;

import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanNewUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C97625j3;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: k11.b0 */
public class C88067b0 extends HttpWrapperBase.Response {
    public C88067b0(CleanNewUI cleanNewUI, int i, Map map, String str) {
        super(i, map, str);
    }

    public void onComplete() {
        Log.m105919d("MicroMsg.CleanNewUI", "request onComplete:%s", this.content);
        try {
            new JSONObject(this.content);
            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_CLEANUI_QQMGRINFO_STRING, this.content);
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.CleanNewUI", e, "", new Object[0]);
            C115669n.INSTANCE.idkeyStat(714, 6, 1, false);
        }
    }
}
