package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import gy3.C87412m;
import org.json.JSONObject;
import rx3.C13604l;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.a4 */
public final class C6203a4 {

    /* renamed from: a */
    public final MsgHandler f22901a;

    public C6203a4(MsgHandler msgHandler) {
        C87412m.m108594g(msgHandler, "msgHandler");
        this.f22901a = msgHandler;
    }

    /* renamed from: a */
    public static final String m6494a(C6203a4 a4Var, C13604l... lVarArr) {
        a4Var.getClass();
        JSONObject jSONObject = new JSONObject();
        for (C13604l lVar : lVarArr) {
            jSONObject.put(lVar.f38555d.toString(), lVar.f38556e.toString());
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(jSONObject);
        sb.append(']');
        return sb.toString();
    }
}
