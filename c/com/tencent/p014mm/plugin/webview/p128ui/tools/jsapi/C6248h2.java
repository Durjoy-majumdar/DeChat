package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.plugin.webview.model.C6045j1;
import di3.C86312j;
import java.util.Map;
import nd3.C47223a;
import p166hy.C46134x;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.h2 */
public class C6248h2 implements C47223a {

    /* renamed from: a */
    public final /* synthetic */ String f23025a;

    /* renamed from: b */
    public final /* synthetic */ String f23026b;

    /* renamed from: c */
    public final /* synthetic */ C13851h1 f23027c;

    /* renamed from: d */
    public final /* synthetic */ MsgHandler f23028d;

    public C6248h2(MsgHandler msgHandler, String str, String str2, C13851h1 h1Var) {
        this.f23028d = msgHandler;
        this.f23025a = str;
        this.f23026b = str2;
        this.f23027c = h1Var;
    }

    /* renamed from: a */
    public void mo6947a(boolean z) {
        if (z) {
            String b = C6045j1.f22331a.mo7004b(this.f23025a, this.f23026b);
            if (b != null) {
                ((C46134x) C86312j.m106911c(C46134x.class)).rw0(b);
            }
            this.f23028d.mo7210k5(this.f23027c, "install_download_task:ok", (Map<String, Object>) null);
            return;
        }
        this.f23028d.mo7210k5(this.f23027c, "install_download_task:fail", (Map<String, Object>) null);
    }
}
