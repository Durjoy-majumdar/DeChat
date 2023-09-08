package com.tencent.p014mm.plugin.topstory.p113ui.webview;

import com.tencent.p014mm.plugin.brandservice.api.TransferRequestInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ex0.C45699g;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C52109yf2;
import te3.C52278zk2;

/* renamed from: com.tencent.mm.plugin.topstory.ui.webview.e$$p */
public class e$$p implements C45699g {

    /* renamed from: a */
    public String f117088a;

    /* renamed from: b */
    public final /* synthetic */ C19391e f117089b;

    public e$$p(C19391e eVar, String str) {
        this.f117089b = eVar;
        this.f117088a = str;
    }

    /* renamed from: a */
    public boolean mo66580a(TransferRequestInfo transferRequestInfo) {
        return false;
    }

    /* renamed from: b */
    public void mo66581b(int i, String str, C52278zk2 zk22) {
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "TopStoryTransferRequestResultCallback.onResult errCode: %s errMsg: %s, response: %s", Integer.valueOf(i), str, zk22);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("objectid", this.f117088a);
        } catch (Exception unused) {
        }
        if (zk22 != null) {
            try {
                if (Util.isNullOrNil(zk22.f146053f)) {
                    jSONObject.put("result", "");
                } else {
                    jSONObject.put("result", zk22.f146053f);
                }
                LinkedList<C52109yf2> linkedList = zk22.f146054g;
                if (linkedList != null && linkedList.size() > 0) {
                    JSONObject jSONObject2 = new JSONObject();
                    Iterator<C52109yf2> it = zk22.f146054g.iterator();
                    while (it.hasNext()) {
                        C52109yf2 next = it.next();
                        if (!Util.isNullOrNil(next.f145258d)) {
                            try {
                                jSONObject2.put(next.f145258d, next.f145259e);
                            } catch (JSONException unused2) {
                            }
                        }
                    }
                    jSONObject.put("header", jSONObject2);
                }
                jSONObject.put("ret", zk22.f146051d);
                C43261a.m46837a(this.f117089b, "onExtTransferReady", jSONObject.toString());
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e, "onResult", new Object[0]);
                C19391e eVar = this.f117089b;
                C43261a.m46837a(eVar, "onExtTransferReady", eVar.mo74340d().toString());
            }
        } else {
            C19391e eVar2 = this.f117089b;
            C43261a.m46837a(eVar2, "onExtTransferReady", eVar2.mo74340d().toString());
        }
    }
}
