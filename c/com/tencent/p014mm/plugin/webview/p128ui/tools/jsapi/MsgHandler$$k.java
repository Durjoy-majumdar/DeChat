package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import java.util.Map;
import lg3.C76697h;
import nj3.C76879j;
import p158gt.C8451i;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$k */
public class MsgHandler$$k implements C8451i.C8452a {

    /* renamed from: a */
    public final /* synthetic */ ProgressDialog f22804a;

    /* renamed from: b */
    public final /* synthetic */ C44561j f22805b;

    /* renamed from: c */
    public final /* synthetic */ String f22806c;

    /* renamed from: d */
    public final /* synthetic */ String f22807d;

    /* renamed from: e */
    public final /* synthetic */ String f22808e;

    /* renamed from: f */
    public final /* synthetic */ String f22809f;

    /* renamed from: g */
    public final /* synthetic */ String f22810g;

    /* renamed from: h */
    public final /* synthetic */ String f22811h;

    /* renamed from: i */
    public final /* synthetic */ Map f22812i;

    /* renamed from: j */
    public final /* synthetic */ MsgHandler f22813j;

    public MsgHandler$$k(MsgHandler msgHandler, ProgressDialog progressDialog, C44561j jVar, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        this.f22813j = msgHandler;
        this.f22804a = progressDialog;
        this.f22805b = jVar;
        this.f22806c = str;
        this.f22807d = str2;
        this.f22808e = str3;
        this.f22809f = str4;
        this.f22810g = str5;
        this.f22811h = str6;
        this.f22812i = map;
    }

    /* renamed from: a */
    public void mo24a(Bitmap bitmap, byte[] bArr) {
        ProgressDialog progressDialog = this.f22804a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f22813j.mo7178T5(this.f22805b, this.f22806c, this.f22807d, this.f22808e, this.f22809f, this.f22810g, (String) null, this.f22811h);
        Context context = this.f22813j.f22697d;
        if (context != null) {
            C76879j.m92726T(context, C76697h.m92348a(context).getString(C0966R.string.a2o));
        }
        MsgHandler msgHandler = this.f22813j;
        msgHandler.mo7210k5(msgHandler.f22698e, "send_app_msg:ok", this.f22812i);
    }
}
