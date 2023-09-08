package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import java.util.Map;
import p158gt.C8451i;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.j0 */
public class C6256j0 implements C8451i.C8452a {

    /* renamed from: a */
    public final /* synthetic */ ProgressDialog f23044a;

    /* renamed from: b */
    public final /* synthetic */ C44561j f23045b;

    /* renamed from: c */
    public final /* synthetic */ String f23046c;

    /* renamed from: d */
    public final /* synthetic */ String f23047d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f23048e;

    /* renamed from: f */
    public final /* synthetic */ MsgHandler f23049f;

    public C6256j0(MsgHandler msgHandler, ProgressDialog progressDialog, C44561j jVar, String str, String str2, C13851h1 h1Var) {
        this.f23049f = msgHandler;
        this.f23044a = progressDialog;
        this.f23045b = jVar;
        this.f23046c = str;
        this.f23047d = str2;
        this.f23048e = h1Var;
    }

    /* renamed from: a */
    public void mo24a(Bitmap bitmap, byte[] bArr) {
        ProgressDialog progressDialog = this.f23044a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f23049f.mo7178T5(this.f23045b, "", this.f23046c, this.f23047d, (String) null, (String) null, (String) null, (String) null);
        this.f23049f.mo7210k5(this.f23048e, "send_service_app_msg:ok", (Map<String, Object>) null);
        this.f23049f.mo7219p5(this.f23048e);
    }
}
