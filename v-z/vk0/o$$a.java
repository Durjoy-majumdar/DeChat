package vk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import java.util.HashMap;
import org.json.JSONObject;
import p918s2.C90111a;
import vk0.C90809a;
import wq0.C91085v;

public final /* synthetic */ class o$$a implements C90111a.C90113b {

    /* renamed from: d */
    public final /* synthetic */ C90820o f260769d;

    /* renamed from: e */
    public final /* synthetic */ C82381f f260770e;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f260771f;

    /* renamed from: g */
    public final /* synthetic */ int f260772g;

    public /* synthetic */ o$$a(C90820o oVar, C82381f fVar, JSONObject jSONObject, int i) {
        this.f260769d = oVar;
        this.f260770e = fVar;
        this.f260771f = jSONObject;
        this.f260772g = i;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C90820o oVar = this.f260769d;
        C82381f fVar = this.f260770e;
        JSONObject jSONObject = this.f260771f;
        int i2 = this.f260772g;
        oVar.getClass();
        if (i == 18) {
            if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("cameraId", Integer.valueOf(jSONObject.optInt("cameraId")));
                C90817j jVar = new C90817j();
                jVar.f242407f = new JSONObject(hashMap).toString();
                C82520h y = oVar.mo122433y(fVar, (JSONObject) null);
                if (y != null) {
                    y.mo109669n(jVar, (int[]) null);
                }
                C90809a.C90811b.f260763a.f260760b = false;
                oVar.f260765g = null;
            } else {
                C90809a.C90811b.f260763a.f260760b = true;
                oVar.mo1505u(fVar, jSONObject, i2);
            }
            C90809a.C90811b.f260763a.f260761c = false;
            C91085v.m114268c(fVar.getAppId());
        }
    }
}
