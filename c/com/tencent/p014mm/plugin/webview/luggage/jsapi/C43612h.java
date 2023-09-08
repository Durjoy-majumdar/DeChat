package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C47350c;
import org.json.JSONObject;
import p828wa.C53096b;
import te3.C49158dk2;
import te3.C49713hj2;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.h */
public class C43612h implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ C53096b.C53097a f117868a;

    /* renamed from: b */
    public final /* synthetic */ int f117869b;

    public C43612h(C43608g gVar, C53096b.C53097a aVar, int i) {
        this.f117868a = aVar;
        this.f117869b = i;
    }

    /* renamed from: a */
    public void mo288a(int i, int i2, String str, C47350c cVar) {
        C49713hj2 hj22;
        Log.m105925i("MicroMsg.JsApiAuthorize", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i != 0 || i2 != 0) {
            this.f117868a.mo73778c("fail", (JSONObject) null);
        } else if (this.f117869b == 2) {
            Log.m105918d("MicroMsg.JsApiAuthorize", "press reject button");
            this.f117868a.mo73778c("fail", (JSONObject) null);
        } else {
            C49158dk2 dk22 = (C49158dk2) cVar.f127056b.f127083a;
            if (dk22 == null || (hj22 = dk22.f132382d) == null) {
                this.f117868a.mo73778c("fail", (JSONObject) null);
                return;
            }
            int i3 = hj22.f134688d;
            String str2 = hj22.f134689e;
            Log.m105925i("MicroMsg.JsApiAuthorize", "jsErrcode = %d", Integer.valueOf(i3));
            if (i3 == 0) {
                this.f117868a.mo73776a();
                return;
            }
            Log.m105921e("MicroMsg.JsApiAuthorize", "ERROR = %s", str2);
            this.f117868a.mo73778c("fail", (JSONObject) null);
        }
    }
}
