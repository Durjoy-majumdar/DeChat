package gk0;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import java.util.HashMap;
import java.util.LinkedList;
import org.json.JSONArray;
import te3.C52093ya2;

/* renamed from: gk0.g0 */
public class C45921g0 implements C87581a<Object, C52093ya2> {

    /* renamed from: a */
    public final /* synthetic */ C83780d1 f123902a;

    /* renamed from: b */
    public final /* synthetic */ int f123903b;

    /* renamed from: c */
    public final /* synthetic */ C45922h0 f123904c;

    public C45921g0(C45922h0 h0Var, C83780d1 d1Var, int i) {
        this.f123904c = h0Var;
        this.f123902a = d1Var;
        this.f123903b = i;
    }

    public Object call(Object obj) {
        C52093ya2 ya22 = (C52093ya2) obj;
        HashMap hashMap = new HashMap();
        if (ya22 == null) {
            Log.m105920e("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData cgi failed, null response");
            hashMap.put("ret", -99);
            this.f123902a.mo109647a(this.f123903b, this.f123904c.mo115112m("fail: ErrMsg: cgi fail", hashMap));
            return null;
        }
        int i = ya22.BaseResponse.f135955d;
        if (i != 0) {
            Log.m105921e("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData cgi failed, errCode = %d, errMsg = %s", Integer.valueOf(i), ya22.BaseResponse.f135956e);
            hashMap.put("ret", Integer.valueOf(ya22.BaseResponse.f135955d));
            C83780d1 d1Var = this.f123902a;
            int i2 = this.f123903b;
            C45922h0 h0Var = this.f123904c;
            d1Var.mo109647a(i2, h0Var.mo115112m("fail: ErrMsg:" + ya22.BaseResponse.f135956e, hashMap));
            return null;
        }
        Log.m105924i("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData success");
        String str = "";
        String str2 = !TextUtils.isEmpty(ya22.f145212d) ? ya22.f145212d : str;
        if (!TextUtils.isEmpty(ya22.f145214f)) {
            str = ya22.f145214f;
        }
        int i3 = ya22.f145213e;
        LinkedList<String> linkedList = ya22.f145215g;
        Log.m105925i("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData auth_info:%s, auth_status:%d", str, Integer.valueOf(i3));
        Log.m105925i("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData user_info_json:%s", str2);
        hashMap.put("userData", str2);
        hashMap.put("authStatus", Integer.valueOf(i3));
        hashMap.put("authInfo", str);
        if (linkedList != null && linkedList.size() > 0) {
            hashMap.put("authGroupList", new JSONArray(linkedList));
            Log.m105925i("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData authGroupList:%s", new JSONArray(linkedList).toString());
        }
        this.f123902a.mo109647a(this.f123903b, this.f123904c.mo115112m("ok", hashMap));
        return null;
    }
}
