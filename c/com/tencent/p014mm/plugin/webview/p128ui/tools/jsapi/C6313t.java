package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import ic0.C98661k;
import java.util.Map;
import p008bq.C0364r0;
import p008bq.C67305d1;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.t */
public class C6313t implements C98661k {

    /* renamed from: a */
    public final /* synthetic */ String f23182a;

    /* renamed from: b */
    public final /* synthetic */ String f23183b;

    /* renamed from: c */
    public final /* synthetic */ String f23184c;

    /* renamed from: d */
    public final /* synthetic */ C13851h1 f23185d;

    /* renamed from: e */
    public final /* synthetic */ MsgHandler f23186e;

    public C6313t(MsgHandler msgHandler, String str, String str2, String str3, C13851h1 h1Var) {
        this.f23186e = msgHandler;
        this.f23182a = str;
        this.f23183b = str2;
        this.f23184c = str3;
        this.f23185d = h1Var;
    }

    /* renamed from: a */
    public void mo6935a(String str, View view, Bitmap bitmap, Object... objArr) {
        Log.m105925i("MicroMsg.MsgHandler", "imageLoaderListener onImageLoadComplete %s", str);
        if (bitmap == null || objArr == null || objArr.length <= 0) {
            this.f23186e.mo7210k5(this.f23185d, "addToEmoticon:fail", (Map<String, Object>) null);
            return;
        }
        Object obj = objArr[0];
        if (obj == null || !(obj instanceof String)) {
            this.f23186e.mo7210k5(this.f23185d, "addToEmoticon:fail", (Map<String, Object>) null);
        } else if (str.equals(this.f23182a)) {
            C86009m1 m1Var = new C86009m1(objArr[0].toString());
            if (m1Var.mo119967g()) {
                String q = C86013q1.m106456q(m1Var.mo119976n());
                C86013q1.m106442c(m1Var.mo119971i(), ((C0364r0) C86312j.m106911c(C0364r0.class)).mo405BX(((C67305d1) C86312j.m106911c(C67305d1.class)).rx0(), "", q));
                MsgHandler.m6140N3(this.f23186e, q, this.f23183b, this.f23184c);
                return;
            }
            this.f23186e.mo7210k5(this.f23185d, "addToEmoticon:fail", (Map<String, Object>) null);
        } else {
            this.f23186e.mo7210k5(this.f23185d, "addToEmoticon:fail", (Map<String, Object>) null);
        }
    }
}
