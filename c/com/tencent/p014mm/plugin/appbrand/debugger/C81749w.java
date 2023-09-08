package com.tencent.p014mm.plugin.appbrand.debugger;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import te3.C48970c82;
import us0.C90729a;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.w */
public class C81749w implements C87581a<Object, C48970c82> {

    /* renamed from: a */
    public final /* synthetic */ C81745v f239922a;

    public C81749w(C81745v vVar) {
        this.f239922a = vVar;
    }

    public Object call(Object obj) {
        C48970c82 c822 = (C48970c82) obj;
        if (c822 == null) {
            Log.m105920e("MicroMsg.RemoteDebugJsEngine", "getsubbusinessinfo cgi failed, null response");
            return null;
        }
        int i = c822.BaseResponse.f135955d;
        boolean z = false;
        if (i != 0) {
            Log.m105921e("MicroMsg.RemoteDebugJsEngine", "getsubbusinessinfo cgi failed, errCode = %d, errMsg = %s, rr.resp = %b", Integer.valueOf(i), c822.BaseResponse.f135956e, Boolean.FALSE);
            return null;
        }
        C81743t tVar = this.f239922a.f239910d;
        String str = c822.f131573d;
        synchronized (tVar) {
            tVar.f239881c = str;
        }
        Log.m105925i("MicroMsg.RemoteDebugJsEngine", "loginTicket %s", c822.f131573d);
        C90729a aVar = this.f239922a.f239913g.f239865a;
        if (aVar != null) {
            z = aVar.isOpen();
        }
        if (!z) {
            return null;
        }
        if (!TextUtils.isEmpty(this.f239922a.f239910d.f239902x)) {
            Log.m105924i("MicroMsg.RemoteDebugJsEngine", "connect with wsEndpoint");
            return null;
        }
        C81745v.m100312l(this.f239922a);
        return null;
    }
}
