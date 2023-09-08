package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.report.service.C115669n;
import java.util.Map;
import p749xh.C53352w2;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.e2 */
public class C6229e2 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C53352w2 f22974d;

    /* renamed from: e */
    public final /* synthetic */ String f22975e;

    /* renamed from: f */
    public final /* synthetic */ String f22976f;

    /* renamed from: g */
    public final /* synthetic */ C13851h1 f22977g;

    /* renamed from: h */
    public final /* synthetic */ MsgHandler f22978h;

    public C6229e2(MsgHandler msgHandler, C53352w2 w2Var, String str, String str2, C13851h1 h1Var) {
        this.f22978h = msgHandler;
        this.f22974d = w2Var;
        this.f22975e = str;
        this.f22976f = str2;
        this.f22977g = h1Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C115669n.INSTANCE.mo160131h(14217, this.f22974d.field_appId, 6, this.f22975e, this.f22976f, 3);
        dialogInterface.dismiss();
        this.f22978h.mo7210k5(this.f22977g, "doResumeDownloadTask:fail_network_not_wifi", (Map<String, Object>) null);
    }
}
