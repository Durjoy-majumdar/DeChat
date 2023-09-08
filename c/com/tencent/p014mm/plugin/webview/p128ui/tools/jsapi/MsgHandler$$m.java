package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.app.ProgressDialog;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.plugin.webview.model.C6025b0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.HashMap;
import java.util.Map;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51117rj2;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$m */
public class MsgHandler$$m implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ MsgHandler f22821d;

    public MsgHandler$$m(MsgHandler msgHandler) {
        this.f22821d = msgHandler;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        ProgressDialog progressDialog = this.f22821d.f22700g;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f22821d.f22700g.dismiss();
            this.f22821d.f22700g = null;
        }
        C86709a0.m107524d().mo123470p(1566, this);
        if (i == 0 && i2 == 0) {
            Log.m105924i("MicroMsg.MsgHandler", "mmOnActivityResult, MMFunc_Cgi_PayIBGGetUserOpenId success");
            C47350c cVar = ((C6025b0) yVar).f22272e;
            C51117rj2 rj22 = cVar == null ? null : (C51117rj2) cVar.f127056b.f127083a;
            if (rj22 == null) {
                MsgHandler msgHandler = this.f22821d;
                msgHandler.mo7210k5(msgHandler.f22698e, "selectSingleContact:fail", (Map<String, Object>) null);
                return;
            }
            Object obj = this.f22821d.f22698e.f38983a.get("result_sign_type");
            int i3 = obj != null ? Util.getInt((String) obj, 0) : 0;
            HashMap hashMap = new HashMap();
            hashMap.put("package", rj22.f140946g);
            hashMap.put("sign", rj22.f140947h);
            if (i3 == 1) {
                hashMap.put("signType", rj22.f140948i);
            }
            hashMap.put(AppMeasurement.Param.TIMESTAMP, rj22.f140945f);
            hashMap.put("noncestr", rj22.f140944e);
            Log.m105919d("MicroMsg.MsgHandler", "select single contact : package:%s, sign:%s", rj22.f140946g, rj22.f140947h);
            MsgHandler msgHandler2 = this.f22821d;
            msgHandler2.mo7210k5(msgHandler2.f22698e, "selectSingleContact:ok", hashMap);
            return;
        }
        Log.m105920e("MicroMsg.MsgHandler", "mmOnActivityResult, MMFunc_Cgi_PayIBGGetUserOpenId fail");
        MsgHandler msgHandler3 = this.f22821d;
        msgHandler3.mo7210k5(msgHandler3.f22698e, "selectSingleContact:fail", (Map<String, Object>) null);
    }
}
