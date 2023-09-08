package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.webview.model.C6036h0;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import java.util.HashMap;
import java.util.Map;
import lg3.C76697h;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$r */
public class MsgHandler$$r implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ Intent f22848d;

    /* renamed from: e */
    public final /* synthetic */ String f22849e;

    /* renamed from: f */
    public final /* synthetic */ MsgHandler f22850f;

    public MsgHandler$$r(MsgHandler msgHandler, Intent intent, String str) {
        this.f22850f = msgHandler;
        this.f22848d = intent;
        this.f22849e = str;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        ProgressDialog progressDialog = this.f22850f.f22700g;
        String str2 = null;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f22850f.f22700g.dismiss();
            this.f22850f.f22700g = null;
        }
        C86709a0.m107524d().mo123470p(1177, this);
        if (i == 0 && i2 == 0) {
            Log.m105924i("MicroMsg.MsgHandler", "mmOnActivityResult, MMFunc_Biz_Jsapi_Getuseropendid success");
            C6036h0 h0Var = (C6036h0) yVar;
            HashMap hashMap = new HashMap();
            hashMap.put(Scopes.OPEN_ID, h0Var.f22311f);
            hashMap.put("headImgUrl", h0Var.f22313h);
            hashMap.put("nickName", h0Var.f22314i);
            Log.m105919d("MicroMsg.MsgHandler", "opnid:%s, nick_name:%s", h0Var.f22311f, h0Var.f22314i);
            String str3 = (String) this.f22850f.f22698e.f38983a.get("img_url");
            String str4 = (String) this.f22850f.f22698e.f38983a.get("src_username");
            String str5 = (String) this.f22850f.f22698e.f38983a.get("src_displayname");
            Intent intent = this.f22848d;
            if (intent != null) {
                str2 = intent.getStringExtra("custom_send_text");
            }
            this.f22850f.mo7178T5((C44561j) null, "", this.f22849e, str3, str4, str5, str2, (String) null);
            Context context = this.f22850f.f22697d;
            if (context != null) {
                C76879j.m92726T(context, C76697h.m92348a(context).getString(C0966R.string.f360099a34));
            }
            MsgHandler msgHandler = this.f22850f;
            msgHandler.mo7210k5(msgHandler.f22698e, "sendSingleAppMessage:ok", hashMap);
            return;
        }
        Log.m105920e("MicroMsg.MsgHandler", "mmOnActivityResult, MMFunc_Biz_Jsapi_Getuseropendid fail");
        MsgHandler msgHandler2 = this.f22850f;
        msgHandler2.mo7210k5(msgHandler2.f22698e, "sendSingleAppMessage:fail", (Map<String, Object>) null);
    }
}
