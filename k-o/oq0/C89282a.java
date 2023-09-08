package oq0;

import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import di0.C86299o;
import di3.C86312j;
import kr0.C76630x0;
import pq0.C35612a;
import pq0.C35613b;

/* renamed from: oq0.a */
public class C89282a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Intent f257199d;

    public C89282a(C11720b bVar, Intent intent) {
        this.f257199d = intent;
    }

    public void run() {
        String str;
        String stringExtra = this.f257199d.getStringExtra("extra_item");
        C35613b bVar = (C35613b) C81161g2.Bx0(C35613b.class);
        if (stringExtra != null && bVar != null) {
            bVar.getClass();
            C35612a aVar = new C35612a();
            aVar.field_token = stringExtra;
            if (!bVar.get(aVar, XWalkReaderBasePlugin.PARAM_KEY_TOKEN) || (str = aVar.field_token) == null || !str.equals(stringExtra)) {
                aVar = null;
            }
            if (aVar != null) {
                C86299o oVar = new C86299o();
                oVar.f250930b = aVar.field_appid;
                oVar.f250929a = aVar.field_username;
                oVar.f250931c = aVar.field_versionType;
                oVar.f250932d = aVar.field_appVersion;
                oVar.f250939k = 1223;
                C76630x0 x0Var = (C76630x0) C86312j.m106911c(C76630x0.class);
                if (x0Var != null) {
                    x0Var.mo106898tv(MMApplicationContext.getContext(), oVar);
                }
            }
        }
    }
}
