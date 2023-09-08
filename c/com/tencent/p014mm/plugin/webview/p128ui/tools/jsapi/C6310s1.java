package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.report.service.C115669n;
import java.util.Map;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.s1 */
public class C6310s1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f23172d;

    /* renamed from: e */
    public final /* synthetic */ String f23173e;

    /* renamed from: f */
    public final /* synthetic */ String f23174f;

    /* renamed from: g */
    public final /* synthetic */ C13851h1 f23175g;

    /* renamed from: h */
    public final /* synthetic */ MsgHandler f23176h;

    public C6310s1(MsgHandler msgHandler, String str, String str2, String str3, C13851h1 h1Var) {
        this.f23176h = msgHandler;
        this.f23172d = str;
        this.f23173e = str2;
        this.f23174f = str3;
        this.f23175g = h1Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C115669n.INSTANCE.mo160131h(14217, this.f23172d, 6, this.f23173e, this.f23174f, 3);
        dialogInterface.dismiss();
        this.f23176h.mo7210k5(this.f23175g, "add_download_task_straight:fail_network_not_wifi", (Map<String, Object>) null);
    }
}
