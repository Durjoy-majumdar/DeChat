package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.text.TextUtils;
import com.tencent.p014mm.autogen.events.RcptRecentAddrEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Map;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.l0 */
public class C6268l0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RcptRecentAddrEvent f23070d;

    /* renamed from: e */
    public final /* synthetic */ String f23071e;

    /* renamed from: f */
    public final /* synthetic */ MsgHandler f23072f;

    public C6268l0(MsgHandler msgHandler, RcptRecentAddrEvent rcptRecentAddrEvent, String str) {
        this.f23072f = msgHandler;
        this.f23070d = rcptRecentAddrEvent;
        this.f23071e = str;
    }

    public void run() {
        String str;
        Log.m105925i("MicroMsg.MsgHandler", "JSOAUTH errCode[%s], isAccept[%s]", Integer.valueOf(this.f23070d.f9408e.f9411a), Boolean.valueOf(this.f23070d.f9408e.f9412b));
        RcptRecentAddrEvent.C1112b bVar = this.f23070d.f9408e;
        int i = bVar.f9411a;
        if (i != -119) {
            if (i != 0) {
                MsgHandler msgHandler = this.f23072f;
                C13851h1 h1Var = msgHandler.f22698e;
                msgHandler.mo7210k5(h1Var, this.f23071e + "fail", (Map<String, Object>) null);
            } else if (!bVar.f9412b) {
                MsgHandler msgHandler2 = this.f23072f;
                C13851h1 h1Var2 = msgHandler2.f22698e;
                msgHandler2.mo7210k5(h1Var2, this.f23071e + "cancel", (Map<String, Object>) null);
            } else {
                HashMap hashMap = new HashMap();
                String str2 = this.f23070d.f9408e.f9413c;
                if (str2 != null && str2.length() > 6) {
                    str2 = str2.substring(0, 6);
                }
                hashMap.put("nationalCode", str2);
                hashMap.put("nationalCodeFull", this.f23070d.f9408e.f9413c);
                hashMap.put("userName", this.f23070d.f9408e.f9415e);
                hashMap.put("telNumber", this.f23070d.f9408e.f9414d);
                hashMap.put("addressPostalCode", this.f23070d.f9408e.f9416f);
                hashMap.put("proviceFirstStageName", this.f23070d.f9408e.f9417g);
                hashMap.put("addressCitySecondStageName", this.f23070d.f9408e.f9418h);
                hashMap.put("addressCountiesThirdStageName", this.f23070d.f9408e.f9419i);
                String nullAsNil = Util.nullAsNil(this.f23070d.f9408e.f9420j);
                String str3 = this.f23070d.f9408e.f9421k;
                if (TextUtils.isEmpty(nullAsNil) || str3.startsWith(nullAsNil)) {
                    str = str3;
                } else {
                    str = String.format("%s%s", new Object[]{nullAsNil, str3});
                }
                hashMap.put("addressStreetFourthStageName", nullAsNil);
                hashMap.put("addressDetailInfo", str);
                hashMap.put("addressDetailInfoNew", str3);
                MsgHandler msgHandler3 = this.f23072f;
                C13851h1 h1Var3 = msgHandler3.f22698e;
                msgHandler3.mo7210k5(h1Var3, this.f23071e + "ok", hashMap);
            }
        }
    }
}
