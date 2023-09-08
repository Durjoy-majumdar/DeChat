package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.menu.C83699y;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.u */
public final class C82992u extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 798;
    public static final String NAME = "updateShareMenuToDo";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        String str = null;
        C83780d1 l0 = i2Var != null ? i2Var.mo114341l0() : null;
        if (l0 != null) {
            C83699y J0 = l0.mo116155J0(3);
            if (J0 == null) {
                i2Var.mo109647a(i, mo115109j("fail:menu item do not exist"));
                return;
            }
            boolean z = false;
            if (jSONObject != null) {
                z = jSONObject.optBoolean("isToDoMessage", false);
            }
            String str2 = "";
            if (jSONObject != null) {
                str = jSONObject.optString("toDoActivityId", str2);
            }
            if (str != null) {
                str2 = str;
            }
            Log.m105924i("MicroMsg.JsApiUpdateShareMenuToDo", "isToDoMessage=" + z + "  toDoActivityId=" + str2);
            J0.f244320d.mo120962i("is_todo_message", Boolean.valueOf(z));
            J0.f244320d.mo120962i("share_todo_activity_id", str2);
            i2Var.mo109647a(i, mo115109j("ok"));
        } else if (i2Var != null) {
            i2Var.mo109647a(i, mo115109j("fail"));
        }
    }
}
