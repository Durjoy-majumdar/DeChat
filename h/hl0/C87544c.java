package hl0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import di3.C86312j;
import kr0.C88267e;
import kz1.C88349l;
import org.json.JSONObject;

/* renamed from: hl0.c */
public class C87544c extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 1030;
    public static final String NAME = "exitGameLive";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        ((C88349l) C86312j.m106911c(C88349l.class)).V60(eVar.getAppId(), eVar.getRuntime().mo113210l1().f239365g, eVar.getContext(), 3, new C87543b(this, eVar, i));
    }
}
