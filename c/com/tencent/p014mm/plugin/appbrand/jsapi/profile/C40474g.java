package com.tencent.p014mm.plugin.appbrand.jsapi.profile;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.utils.C84789u1;
import com.tencent.p014mm.protocal.protobuf.GetProfileInfoResponse;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import ob0.C47350c;
import org.json.JSONObject;
import pe3.C47465a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.g */
public final class C40474g implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ C82381f f108764a;

    /* renamed from: b */
    public final /* synthetic */ int f108765b;

    /* renamed from: c */
    public final /* synthetic */ C40475h f108766c;

    public C40474g(C82381f fVar, int i, C40475h hVar) {
        this.f108764a = fVar;
        this.f108765b = i;
        this.f108766c = hVar;
    }

    /* renamed from: a */
    public final void mo288a(int i, int i2, String str, C47350c cVar) {
        C47465a aVar;
        if (i != 0 || i2 != 0 || cVar == null || (aVar = cVar.f127056b.f127083a) == null || !(aVar instanceof GetProfileInfoResponse)) {
            Log.m105921e("MicroMsg.operateWxappCGI", "handleGetProfileInfo error, errMsg: %s", str);
            C82381f fVar = this.f108764a;
            int i3 = this.f108765b;
            C40475h hVar = this.f108766c;
            hVar.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 109, "fail:cgi failed for response null");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errno", 109);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            fVar.mo109647a(i3, hVar.mo115115p("fail:cgi failed for response null", jSONObject));
            return;
        }
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetProfileInfoResponse");
        Map<String, Object> a = C84789u1.m104469a(1, (GetProfileInfoResponse) aVar);
        C82381f fVar2 = this.f108764a;
        int i4 = this.f108765b;
        C40475h hVar2 = this.f108766c;
        HashMap hashMap = new HashMap();
        hashMap.put("response", a);
        C13598b0 b0Var = C13598b0.f38549a;
        hVar2.getClass();
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
        }
        hashMap.put("errno", 0);
        fVar2.mo109647a(i4, hVar2.mo115114o("ok", hashMap));
    }
}
