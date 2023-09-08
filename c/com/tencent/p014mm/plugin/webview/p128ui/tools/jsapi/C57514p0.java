package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import c30.C79922d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32229r;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import rx3.C13598b0;
import t83.C13851h1;
import te3.C49765hx0;
import te3.C50209l31;
import te3.C50397mg0;
import te3.C51533ue1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.p0 */
public class C57514p0 implements C32229r<Integer, Integer, String, C50397mg0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Map f164750d;

    /* renamed from: e */
    public final /* synthetic */ String f164751e;

    /* renamed from: f */
    public final /* synthetic */ C13851h1 f164752f;

    /* renamed from: g */
    public final /* synthetic */ MsgHandler f164753g;

    public C57514p0(MsgHandler msgHandler, Map map, String str, C13851h1 h1Var) {
        this.f164753g = msgHandler;
        this.f164750d = map;
        this.f164751e = str;
        this.f164752f = h1Var;
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        C49765hx0 hx02;
        Integer num = (Integer) obj2;
        String str = (String) obj3;
        C50397mg0 mg02 = (C50397mg0) obj4;
        try {
            if (((Integer) obj).intValue() != 0 || num.intValue() != 0 || mg02 == null || mg02.f138011d.isEmpty()) {
                this.f164750d.put("ret", -1);
                this.f164750d.put("err_msg", "Invalid input parameters:$errType, $errCode");
                this.f164750d.put("requestId", this.f164751e);
                this.f164753g.mo7210k5(this.f164752f, "onGetFinderLivePreviewMicCover:ok", this.f164750d);
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            C51533ue1 ue12 = mg02.f138011d.get(0);
            if (Util.isNullOrNil((List) ue12.f142798e.f182365K.f137806j) && ue12.f142798e.f182365K.f137807n == null) {
                this.f164750d.put("ret", 0);
                this.f164750d.put("err_msg", "live mic info is empty!");
                this.f164750d.put("requestId", this.f164751e);
            } else if (Util.isNullOrNil((List) ue12.f142798e.f182365K.f137806j)) {
                C79922d dVar = new C79922d();
                dVar.mo110094b("headurl", ue12.f142798e.f182365K.f137807n.f138925g.f134919d.headUrl);
                dVar.mo110094b("nickname", ue12.f142798e.f182365K.f137807n.f138925g.f134919d.nickname);
                dVar.mo110094b("mictype", 2);
                jSONArray.put(dVar);
                this.f164750d.put("micInfos", jSONArray);
                this.f164750d.put("ret", 0);
                this.f164750d.put("err_msg", "");
                this.f164750d.put("requestId", this.f164751e);
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
                this.f164750d.put("micInfos", jSONArray);
                this.f164750d.put("ret", 0);
                this.f164750d.put("err_msg", "");
                this.f164750d.put("requestId", this.f164751e);
            }
            this.f164753g.mo7210k5(this.f164752f, "onGetFinderLivePreviewMicCover:ok", this.f164750d);
            return null;
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.MsgHandler", "getFinderLivePreviewMicCover ex:${ex.message}");
            this.f164750d.put("ret", -1);
            this.f164750d.put("err_msg", "Invalid input parameters:${ex.message}");
            this.f164750d.put("requestId", "");
            this.f164753g.mo7210k5(this.f164752f, "onGetFinderLivePreviewMicCover:ok", this.f164750d);
            return null;
        }
    }
}
