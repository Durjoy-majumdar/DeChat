package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.webview.model.C96651n;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import java.util.Map;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.q2 */
public class C6300q2 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C96651n f23137d;

    /* renamed from: e */
    public final /* synthetic */ String f23138e;

    /* renamed from: f */
    public final /* synthetic */ C13851h1 f23139f;

    /* renamed from: g */
    public final /* synthetic */ MsgHandler f23140g;

    public C6300q2(MsgHandler msgHandler, C96651n nVar, String str, C13851h1 h1Var) {
        this.f23140g = msgHandler;
        this.f23137d = nVar;
        this.f23138e = str;
        this.f23139f = h1Var;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C6080m.Cx0().mo134808h(this.f23137d);
        C6080m.Cx0().mo134804d(this.f23138e);
        this.f23140g.mo7210k5(this.f23139f, "downloadImage:fail", (Map<String, Object>) null);
    }
}
