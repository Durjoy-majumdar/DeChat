package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.lite.C56832d;
import di3.C86312j;
import g02.C32291d;
import java.util.List;
import p244tt.C14088e;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.l */
public final class C6507l implements C14088e.C14089a {

    /* renamed from: a */
    public final /* synthetic */ int f23629a;

    /* renamed from: b */
    public final /* synthetic */ C1256g<Bundle> f23630b;

    public C6507l(int i, C1256g<Bundle> gVar) {
        this.f23629a = i;
        this.f23630b = gVar;
    }

    public void onStoreSendResult(String str, int i, String str2, String str3) {
        if (i == this.f23629a) {
            ((C14088e) C86312j.m106911c(C14088e.class)).f20(this);
            Bundle bundle = new Bundle();
            C32291d.m39671d(bundle, "err_msg", "dispatchLiteAppAction:ok");
            if (str2 == null) {
                str2 = "type";
            }
            C32291d.m39671d(bundle, "type", str2);
            if (str3 == null) {
                str3 = "";
            }
            C32291d.m39671d(bundle, "result", str3);
            C1256g<Bundle> gVar = this.f23630b;
            if (gVar != null) {
                gVar.mo894a(bundle);
            }
        }
    }

    /* renamed from: v3 */
    public void mo7500v3(String str, List<? extends C56832d.C56834b> list) {
    }
}
