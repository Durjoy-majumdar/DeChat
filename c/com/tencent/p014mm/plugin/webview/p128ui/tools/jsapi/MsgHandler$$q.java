package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import java.util.Map;
import lg3.C76697h;
import nj3.C76879j;
import p158gt.C8451i;
import rb0.C48009v0;
import sb0.C48334c;
import sb0.C48340e;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$q */
public class MsgHandler$$q implements C8451i.C8452a {

    /* renamed from: a */
    public final /* synthetic */ long f22836a;

    /* renamed from: b */
    public final /* synthetic */ C44561j f22837b;

    /* renamed from: c */
    public final /* synthetic */ String f22838c;

    /* renamed from: d */
    public final /* synthetic */ String f22839d;

    /* renamed from: e */
    public final /* synthetic */ String f22840e;

    /* renamed from: f */
    public final /* synthetic */ String f22841f;

    /* renamed from: g */
    public final /* synthetic */ String f22842g;

    /* renamed from: h */
    public final /* synthetic */ String f22843h;

    /* renamed from: i */
    public final /* synthetic */ String f22844i;

    /* renamed from: j */
    public final /* synthetic */ MsgHandler f22845j;

    public MsgHandler$$q(MsgHandler msgHandler, long j, C44561j jVar, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f22845j = msgHandler;
        this.f22836a = j;
        this.f22837b = jVar;
        this.f22838c = str;
        this.f22839d = str2;
        this.f22840e = str3;
        this.f22841f = str4;
        this.f22842g = str5;
        this.f22843h = str6;
        this.f22844i = str7;
    }

    /* renamed from: a */
    public void mo24a(Bitmap bitmap, byte[] bArr) {
        this.f22845j.getClass();
        if (this.f22836a >= 0) {
            C48334c a0 = C48009v0.Ax0().mo73042a0(this.f22836a);
            synchronized (C48340e.f129429d) {
                String j = C48340e.m53669j();
                C48340e.m53670k(a0);
                this.f22845j.mo7178T5(this.f22837b, this.f22838c, this.f22839d, this.f22840e, this.f22841f, this.f22842g, this.f22843h, this.f22844i);
                C48340e.m53662c(j);
            }
        } else {
            this.f22845j.mo7178T5(this.f22837b, this.f22838c, this.f22839d, this.f22840e, this.f22841f, this.f22842g, this.f22843h, this.f22844i);
        }
        Context context = this.f22845j.f22697d;
        if (context != null) {
            C76879j.m92726T(context, C76697h.m92348a(context).getString(C0966R.string.bjc));
        }
        MsgHandler msgHandler = this.f22845j;
        msgHandler.mo7210k5(msgHandler.f22698e, "send_app_msg:ok", (Map<String, Object>) null);
    }
}
