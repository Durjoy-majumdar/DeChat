package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.autogen.events.GameCommOperationEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$d */
public class MsgHandler$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f22760d;

    /* renamed from: e */
    public final /* synthetic */ String f22761e;

    /* renamed from: f */
    public final /* synthetic */ C13851h1 f22762f;

    /* renamed from: g */
    public final /* synthetic */ MsgHandler f22763g;

    public MsgHandler$$d(MsgHandler msgHandler, int i, String str, C13851h1 h1Var) {
        this.f22763g = msgHandler;
        this.f22760d = i;
        this.f22761e = str;
        this.f22762f = h1Var;
    }

    public void run() {
        GameCommOperationEvent gameCommOperationEvent = new GameCommOperationEvent();
        GameCommOperationEvent.C1072a aVar = gameCommOperationEvent.f9268d;
        aVar.f9270a = this.f22760d;
        aVar.f9271b = this.f22761e;
        aVar.f9272c = this.f22763g.f22697d;
        gameCommOperationEvent.publish();
        Log.m105925i("MicroMsg.MsgHandler", "gameCommInfo:%s", gameCommOperationEvent.f9269e.f9273a);
        if (Util.isNullOrNil(gameCommOperationEvent.f9269e.f9273a)) {
            this.f22763g.mo7210k5(this.f22762f, "getGameCommInfo:fail", (Map<String, Object>) null);
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(gameCommOperationEvent.f9269e.f9273a);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            this.f22763g.mo7210k5(this.f22762f, "getGameCommInfo:ok", hashMap);
        } catch (JSONException unused) {
            this.f22763g.mo7210k5(this.f22762f, "getGameCommInfo:fail", (Map<String, Object>) null);
        }
    }
}
