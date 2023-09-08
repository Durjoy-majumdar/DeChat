package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import a93.C0026g;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import nj3.C76879j;
import org.json.JSONObject;
import p158gt.C8451i;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.r1 */
public class C5980r1 implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ JSONObject f22225d;

    /* renamed from: e */
    public final /* synthetic */ C43620m2.C5947b f22226e;

    /* renamed from: f */
    public final /* synthetic */ Context f22227f;

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.r1$a */
    public class C5981a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ String f22228d;

        public C5981a(String str) {
            this.f22228d = str;
        }

        public void onCancel(DialogInterface dialogInterface) {
            ((C8451i) C86312j.m106911c(C8451i.class)).mo9372SO(this.f22228d);
            C5980r1.this.f22226e.mo6945a("cancel", (JSONObject) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.r1$b */
    public class C5982b implements C8451i.C8452a {

        /* renamed from: a */
        public final /* synthetic */ ProgressDialog f22230a;

        /* renamed from: b */
        public final /* synthetic */ String f22231b;

        /* renamed from: c */
        public final /* synthetic */ String f22232c;

        /* renamed from: d */
        public final /* synthetic */ String f22233d;

        public C5982b(ProgressDialog progressDialog, String str, String str2, String str3) {
            this.f22230a = progressDialog;
            this.f22231b = str;
            this.f22232c = str2;
            this.f22233d = str3;
        }

        /* renamed from: a */
        public void mo24a(Bitmap bitmap, byte[] bArr) {
            ProgressDialog progressDialog = this.f22230a;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            C5980r1 r1Var = C5980r1.this;
            C0026g.m15a(r1Var.f22227f, this.f22231b, this.f22232c, r1Var.f22225d, this.f22233d);
            C5980r1.this.f22226e.mo6945a((String) null, (JSONObject) null);
        }
    }

    public C5980r1(C5984s1 s1Var, JSONObject jSONObject, C43620m2.C5947b bVar, Context context) {
        this.f22225d = jSONObject;
        this.f22226e = bVar;
        this.f22227f = context;
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        int i3 = i2;
        Intent intent2 = intent;
        if (i == 1) {
            String optString = this.f22225d.optString("appid");
            if (i3 == -1) {
                String stringExtra = intent2 == null ? null : intent2.getStringExtra("Select_Conv_User");
                String stringExtra2 = intent2 == null ? null : intent2.getStringExtra("custom_send_text");
                if (Util.isNullOrNil(stringExtra)) {
                    Log.m105920e("MicroMsg.JsApiSendAppMessage", "toUser is null");
                    this.f22226e.mo6945a("fail", (JSONObject) null);
                    return;
                }
                String optString2 = this.f22225d.optString("img_url");
                if (!Util.isNullOrNil(optString2)) {
                    Context context = this.f22227f;
                    ((C8451i) C86312j.m106911c(C8451i.class)).mo9375mT(optString2, new C5982b(C76879j.m92723Q(context, "", context.getResources().getString(C0966R.string.a2w), true, true, new C5981a(optString2)), optString, stringExtra, stringExtra2));
                    return;
                }
                C0026g.m15a(this.f22227f, optString, stringExtra, this.f22225d, stringExtra2);
            } else if (i3 == 0 || i3 == 1) {
                this.f22226e.mo6945a("cancel", (JSONObject) null);
            } else {
                this.f22226e.mo6945a("fail", (JSONObject) null);
            }
        }
    }
}
