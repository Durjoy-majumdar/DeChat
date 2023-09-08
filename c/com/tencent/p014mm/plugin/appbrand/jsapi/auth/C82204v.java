package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import android.os.Bundle;
import b30.C39723a;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiAuthorize;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.entity.MMUserPrivacyProtectInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Locale;
import p209nt.C11270c;
import te3.C49713hj2;
import te3.C90411fk2;
import te3.C90429p4;
import te3.C90437rw3;
import te3.gp4;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.v */
public class C82204v implements C11270c.C11271a {

    /* renamed from: a */
    public final /* synthetic */ JsApiAuthorize$AuthorizeTask$$f f241076a;

    public C82204v(JsApiAuthorize.AuthorizeTask authorizeTask, JsApiAuthorize$AuthorizeTask$$f jsApiAuthorize$AuthorizeTask$$f) {
        this.f241076a = jsApiAuthorize$AuthorizeTask$$f;
    }

    /* renamed from: a */
    public void mo11329a(int i, int i2, String str, C11270c cVar) {
        JsApiAuthorize.AuthorizeTask authorizeTask;
        String str2;
        Log.m105919d("MicroMsg.JsApiAuthorize", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i != 0 || i2 != 0) {
            JsApiAuthorize$AuthorizeTask$$f jsApiAuthorize$AuthorizeTask$$f = this.f241076a;
            JsApiAuthorize$AuthorizeTask$$b jsApiAuthorize$AuthorizeTask$$b = (JsApiAuthorize$AuthorizeTask$$b) jsApiAuthorize$AuthorizeTask$$f;
            jsApiAuthorize$AuthorizeTask$$b.mo114538a(-1, String.format(Locale.ENGLISH, "cgi fail(%d,%d)", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        } else if (cVar != null) {
            C90411fk2 fk22 = (C90411fk2) ((C39723a) cVar).f106580d.f127056b.f127083a;
            C49713hj2 hj22 = fk22.f259514d;
            int i3 = hj22.f134688d;
            String str3 = hj22.f134689e;
            Log.m105925i("MicroMsg.JsApiAuthorize", "stev NetSceneJSAuthorize jsErrcode %d", Integer.valueOf(i3));
            if (i3 == -12000) {
                JsApiAuthorize$AuthorizeTask$$b jsApiAuthorize$AuthorizeTask$$b2 = (JsApiAuthorize$AuthorizeTask$$b) this.f241076a;
                jsApiAuthorize$AuthorizeTask$$b2.getClass();
                Log.m105918d("MicroMsg.JsApiAuthorize", "onConfirm !");
                LinkedList<C90437rw3> linkedList = fk22.f259515e;
                jsApiAuthorize$AuthorizeTask$$b2.f240799a.f240763E = linkedList.size();
                int i4 = 0;
                while (true) {
                    authorizeTask = jsApiAuthorize$AuthorizeTask$$b2.f240799a;
                    str2 = "";
                    if (i4 >= authorizeTask.f240763E) {
                        break;
                    }
                    C90437rw3 rw32 = linkedList.get(i4);
                    try {
                        Bundle bundle = jsApiAuthorize$AuthorizeTask$$b2.f240799a.f240764F;
                        bundle.putByteArray(i4 + str2, rw32.toByteArray());
                        i4++;
                    } catch (IOException e) {
                        Log.m105921e("MicroMsg.JsApiAuthorize", "IOException %s", e.getMessage());
                        Log.printErrStackTrace("MicroMsg.JsApiAuthorize", e, str2, new Object[0]);
                        JsApiAuthorize.AuthorizeTask authorizeTask2 = jsApiAuthorize$AuthorizeTask$$b2.f240799a;
                        authorizeTask2.f240783r = "fail";
                        authorizeTask2.mo114394b();
                        return;
                    }
                }
                authorizeTask.f240787v = fk22.f259516f;
                authorizeTask.f240788w = fk22.f259517g;
                authorizeTask.f240789x = fk22.f259520j;
                authorizeTask.f240791z = fk22.f259519i;
                authorizeTask.f240790y = fk22.f259518h;
                C90429p4 p4Var = fk22.f259521n;
                if (p4Var != null) {
                    authorizeTask.f240759A = p4Var.f259729d;
                    authorizeTask.f240760B = p4Var.f259730e;
                }
                gp4 gp4 = fk22.f259524q;
                if (gp4 != null) {
                    authorizeTask.f240773P = new MMUserPrivacyProtectInfo(gp4);
                }
                jsApiAuthorize$AuthorizeTask$$b2.f240799a.f240783r = "needConfirm";
                if (linkedList.size() > 0) {
                    C90437rw3 rw33 = linkedList.get(0);
                    JsApiAuthorize.AuthorizeTask authorizeTask3 = jsApiAuthorize$AuthorizeTask$$b2.f240799a;
                    String str4 = rw33.f259827i;
                    if (str4 == null) {
                        str4 = str2;
                    }
                    authorizeTask3.f240765G = str4;
                    if ("scope.userInfo".equals(rw33.f259822d)) {
                        jsApiAuthorize$AuthorizeTask$$b2.f240799a.f240762D = C75592q0.m90783m();
                        StringBuilder sb = new StringBuilder();
                        sb.append("userNickName=");
                        String str5 = jsApiAuthorize$AuthorizeTask$$b2.f240799a.f240762D;
                        if (str5 != null) {
                            str2 = str5;
                        }
                        sb.append(str2);
                        Log.m105924i("MicroMsg.JsApiAuthorize", sb.toString());
                        C55469m.f158057a.mo76996a(C75592q0.m90789s(), new C82203u(jsApiAuthorize$AuthorizeTask$$b2));
                        return;
                    }
                    jsApiAuthorize$AuthorizeTask$$b2.f240799a.mo114394b();
                    return;
                }
                jsApiAuthorize$AuthorizeTask$$b2.f240799a.mo114394b();
            } else if (i3 == 0) {
                JsApiAuthorize$AuthorizeTask$$b jsApiAuthorize$AuthorizeTask$$b3 = (JsApiAuthorize$AuthorizeTask$$b) this.f241076a;
                jsApiAuthorize$AuthorizeTask$$b3.getClass();
                Log.m105918d("MicroMsg.JsApiAuthorize", "onSuccess !");
                JsApiAuthorize.AuthorizeTask authorizeTask4 = jsApiAuthorize$AuthorizeTask$$b3.f240799a;
                authorizeTask4.f240783r = "ok";
                authorizeTask4.mo114394b();
            } else {
                Log.m105921e("MicroMsg.JsApiAuthorize", "onSceneEnd NetSceneJSAuthorize ERROR %s", str3);
                ((JsApiAuthorize$AuthorizeTask$$b) this.f241076a).mo114538a(i3, str3);
            }
        }
    }
}
