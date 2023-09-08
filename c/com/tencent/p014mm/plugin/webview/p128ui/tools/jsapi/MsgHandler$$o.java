package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.app.ProgressDialog;
import com.tencent.p014mm.plugin.webview.model.C6036h0;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import java.util.HashMap;
import java.util.Map;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$o */
public class MsgHandler$$o implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ MsgHandler f22832d;

    public MsgHandler$$o(MsgHandler msgHandler) {
        this.f22832d = msgHandler;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        ProgressDialog progressDialog = this.f22832d.f22700g;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f22832d.f22700g.dismiss();
            this.f22832d.f22700g = null;
        }
        C86709a0.m107524d().mo123470p(1177, this);
        if (i == 0 && i2 == 0) {
            Log.m105924i("MicroMsg.MsgHandler", "mmOnActivityResult, MMFunc_Biz_Jsapi_Getuseropendid success");
            C6036h0 h0Var = (C6036h0) yVar;
            HashMap hashMap = new HashMap();
            hashMap.put("package", h0Var.f22311f);
            hashMap.put("sign", h0Var.f22312g);
            hashMap.put("headImgUrl", h0Var.f22313h);
            hashMap.put("nickName", h0Var.f22314i);
            hashMap.put("friendRelation", Integer.valueOf(h0Var.f22315j));
            Log.m105919d("MicroMsg.MsgHandler", "select single contact : opnid:%s, sign:%s, nick_name:%s, friend_relation:%d", h0Var.f22311f, h0Var.f22312g, h0Var.f22314i, Integer.valueOf(h0Var.f22315j));
            MsgHandler msgHandler = this.f22832d;
            msgHandler.mo7210k5(msgHandler.f22698e, "selectSingleContact:ok", hashMap);
            return;
        }
        Log.m105920e("MicroMsg.MsgHandler", "mmOnActivityResult, MMFunc_Biz_Jsapi_Getuseropendid fail");
        MsgHandler msgHandler2 = this.f22832d;
        msgHandler2.mo7210k5(msgHandler2.f22698e, "selectSingleContact:fail", (Map<String, Object>) null);
    }
}
