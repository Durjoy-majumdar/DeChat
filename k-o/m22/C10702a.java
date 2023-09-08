package m22;

import android.content.Context;
import c30.C79922d;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32229r;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p565ir.C60606n;
import rx3.C13598b0;
import te3.C49765hx0;
import te3.C50209l31;
import te3.C50397mg0;
import te3.C51533ue1;

/* renamed from: m22.a */
public class C10702a extends C4770c {

    /* renamed from: m22.a$a */
    public class C10703a implements C32229r<Integer, Integer, String, C50397mg0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Map f32143d;

        /* renamed from: e */
        public final /* synthetic */ String f32144e;

        public C10703a(Map map, String str) {
            this.f32143d = map;
            this.f32144e = str;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            C49765hx0 hx02;
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            String str = (String) obj3;
            C50397mg0 mg02 = (C50397mg0) obj4;
            try {
                Log.m105918d("LiteAppJsApiGetFinderLivePreviewMicCover", "resp count" + mg02.f138011d.size());
                if (num.intValue() == 0 && num2.intValue() == 0 && !mg02.f138011d.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    C51533ue1 ue12 = mg02.f138011d.get(0);
                    if (Util.isNullOrNil((List) ue12.f142798e.f182365K.f137806j)) {
                        if (ue12.f142798e.f182365K.f137807n == null) {
                            this.f32143d.put("ret", 0);
                            this.f32143d.put("err_msg", "live mic info is empty");
                            this.f32143d.put("requestId", this.f32144e);
                            C10702a.this.f19815f.mo5691c(this.f32143d);
                            return null;
                        }
                    }
                    if (Util.isNullOrNil((List) ue12.f142798e.f182365K.f137806j)) {
                        C79922d dVar = new C79922d();
                        dVar.mo110094b("headurl", ue12.f142798e.f182365K.f137807n.f138925g.f134919d.headUrl);
                        dVar.mo110094b("nickname", ue12.f142798e.f182365K.f137807n.f138925g.f134919d.nickname);
                        dVar.mo110094b("mictype", 2);
                        jSONArray.put(dVar);
                        this.f32143d.put("micInfos", jSONArray);
                        this.f32143d.put("ret", 0);
                        this.f32143d.put("err_msg", "");
                        this.f32143d.put("requestId", this.f32144e);
                    } else {
                        for (int i = 0; i < ue12.f142798e.f182365K.f137806j.size(); i++) {
                            C50209l31 l312 = ue12.f142798e.f182365K.f137806j.get(i);
                            if (!(l312 == null || (hx02 = l312.f137145d) == null || hx02.f134919d == null)) {
                                C79922d dVar2 = new C79922d();
                                dVar2.mo110094b("headurl", l312.f137145d.f134919d.headUrl);
                                dVar2.mo110094b("nickname", l312.f137145d.f134919d.nickname);
                                dVar2.mo110094b("mictype", Integer.valueOf(l312.f137146e));
                                jSONArray.put(dVar2);
                            }
                        }
                        this.f32143d.put("micInfos", jSONArray);
                        this.f32143d.put("ret", 0);
                        this.f32143d.put("err_msg", "");
                        this.f32143d.put("requestId", this.f32144e);
                    }
                    C10702a.this.f19815f.mo5691c(this.f32143d);
                    return null;
                }
                C10702a.this.f19815f.mo5689a("Invalid input parameters Or live mic info is empty!");
                return null;
            } catch (Exception e) {
                Log.printErrStackTrace("LiteAppJsApiGetFinderLivePreviewMicCover", e, "getFinderLivePreviewMicCover fail", new Object[0]);
                C10702a.this.f19815f.mo5689a("Invalid input parameters");
                return null;
            }
        }
    }

    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Log.m105918d("LiteAppJsApiGetFinderLivePreviewMicCover", "Invoke getFinderLivePreviewMicCover");
        if (jSONObject == null) {
            this.f19815f.mo5689a("data is null");
            return;
        }
        HashMap hashMap = new HashMap();
        try {
            ((C60606n) C86312j.m106911c(C60606n.class)).Lm0(jSONObject.optString("encryptedId"), jSONObject.optString("nonceId"), (Context) null, new C10703a(hashMap, jSONObject.optString("requestId")));
        } catch (Exception e) {
            Log.printErrStackTrace("LiteAppJsApiGetFinderLivePreviewMicCover", e, "getFinderLivePreviewMicCover fail", new Object[0]);
            this.f19815f.mo5689a("Invalid input parameters");
        }
    }
}
