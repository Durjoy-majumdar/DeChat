package p594lk;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f62.C75707s0;
import ob0.C35136m;
import ob0.C35141t;
import org.json.JSONException;
import org.json.JSONObject;
import p248ug.C37467u;
import p872ah.C67046a;
import pe3.C89349b;
import te3.C50694ok;

/* renamed from: lk.c */
public class C34289c implements C35141t {
    /* renamed from: Fg */
    public C35136m.C35139b mo56403Fg(C35136m.C35137a aVar) {
        return ((C75707s0) C86312j.m106911c(C75707s0.class)).H60().mo56403Fg(aVar);
    }

    /* renamed from: ld */
    public void mo56404ld(C35136m.C35138c cVar) {
        C50694ok okVar;
        C89349b bVar;
        if (cVar != null) {
            Object obj = cVar.f94252c;
            if (!(!(obj instanceof C37467u) || (okVar = ((C37467u) obj).field_businessInfo) == null || (bVar = okVar.f139227e) == null)) {
                try {
                    String h = bVar.mo123705h();
                    Log.m105925i("FunctionMsg.NewXmlMsgExtension", "bussinessInfo:%s", h);
                    JSONObject jSONObject = new JSONObject(h);
                    cVar.f94254e = jSONObject.optString("msgid");
                    cVar.f94253d = jSONObject.optString("msgtype");
                } catch (JSONException unused) {
                }
            }
        }
        ((C75707s0) C86312j.m106911c(C75707s0.class)).H60().mo56404ld(cVar);
    }

    /* renamed from: nA */
    public /* synthetic */ boolean mo56405nA(C67046a aVar, String str, long j, String str2, String str3, String str4, int i, String str5, String str6, String str7, int i2) {
        return false;
    }
}
