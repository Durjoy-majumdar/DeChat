package com.tencent.p014mm.plugin.lite.p068ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.liteapp.p877ui.WxaLiteAppTransparentUI;
import com.tencent.p014mm.autogen.events.LiteAppCloseWindowEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import di3.C86312j;
import org.json.JSONObject;
import p244tt.C14088e;
import tw3.C118552d;

/* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppTransparentLiteUI */
public class WxaLiteAppTransparentLiteUI extends WxaLiteAppTransparentUI {

    /* renamed from: Q */
    public JSONObject f313523Q;

    /* renamed from: J7 */
    public boolean mo150202J7() {
        return C85875k4.m106211z();
    }

    public void closeWindow(Intent intent) {
        if (intent.hasExtra("extraData")) {
            try {
                this.f313523Q = new JSONObject(intent.getStringExtra("extraData"));
            } catch (Exception unused) {
            }
        }
        super.closeWindow(intent);
    }

    public void onCreate(Bundle bundle) {
        ((C14088e) C86312j.m106911c(C14088e.class)).mo13514aF(Boolean.TRUE);
        if (!(C118552d.m167207g().f354797a != null)) {
            C115669n.INSTANCE.mo175913w(1293, 112, 1);
        }
        super.onCreate(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        LiteAppCloseWindowEvent liteAppCloseWindowEvent = new LiteAppCloseWindowEvent();
        LiteAppCloseWindowEvent.C104592a aVar = liteAppCloseWindowEvent.f309997d;
        aVar.f309999b = this.f339384v;
        aVar.f310000c = Long.valueOf(this.f339385w);
        JSONObject jSONObject = this.f313523Q;
        if (jSONObject != null) {
            liteAppCloseWindowEvent.f309997d.f309998a = jSONObject;
        }
        liteAppCloseWindowEvent.publish();
        ((C14088e) C86312j.m106911c(C14088e.class)).mo13514aF(Boolean.FALSE);
    }
}
