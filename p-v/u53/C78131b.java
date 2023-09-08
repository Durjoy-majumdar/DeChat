package u53;

import b63.C67210w;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiCancelDownloadTask;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.wallet_core.id_verify.model.RealNameBundle;
import com.tencent.p014mm.plugin.wallet_core.model.BindCardOrder;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C45119n;
import com.tencent.p014mm.wallet_core.model.C75133p0;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: u53.b */
public class C78131b extends C75790l implements C45119n {

    /* renamed from: d */
    public BindCardOrder f228970d;

    /* renamed from: e */
    public String f228971e;

    /* renamed from: f */
    public String f228972f;

    /* renamed from: g */
    public String f228973g;

    /* renamed from: h */
    public int f228974h;

    public C78131b(C67210w wVar) {
        this(wVar, -1, "", (RealNameBundle) null);
    }

    public int getFuncId() {
        return JsApiCancelDownloadTask.CTRL_INDEX;
    }

    public int getTenpayCgicmd() {
        return 17;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/bindverifyreg";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        BindCardOrder bindCardOrder = new BindCardOrder();
        this.f228970d = bindCardOrder;
        bindCardOrder.mo99402a(jSONObject);
        this.f228971e = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        this.f228972f = jSONObject.optString("desc");
        this.f228973g = jSONObject.optString("page");
        this.f228974h = jSONObject.optInt("err_jump_page");
    }

    public C78131b(C67210w wVar, int i, String str, RealNameBundle realNameBundle) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put("flag", wVar.f192983a);
        hashMap.put("passwd", wVar.f192984b);
        hashMap.put("verify_code", wVar.f192985c);
        hashMap.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, wVar.f192986d);
        hashMap.put("bind_flag", wVar.f192989g ? "1" : "0");
        if (i > 0) {
            hashMap.put("realname_scene", i + "");
            Log.m105925i(C75790l.TAG, "realname_scene=%d", Integer.valueOf(i));
        }
        if (realNameBundle != null) {
            realNameBundle.mo99365a(hashMap);
        }
        if (!Util.isNullOrNil(wVar.f192987e)) {
            hashMap.put("bank_type", wVar.f192987e + "");
        }
        hashMap.put("session_id", str);
        if (C75133p0.f221064a) {
            hashMap2.put("uuid_for_bindcard", C75133p0.f221066c);
            hashMap2.put("bindcard_scene", "" + C75133p0.f221065b);
        }
        setPayInfo(wVar.f192996n, hashMap, hashMap2);
        setRequestData(hashMap);
        setWXRequestData(hashMap2);
    }
}
