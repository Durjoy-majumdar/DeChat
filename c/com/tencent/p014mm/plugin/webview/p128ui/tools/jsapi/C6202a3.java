package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.webview.model.C96651n;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import java.util.Map;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.a3 */
public class C6202a3 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C96651n f22897d;

    /* renamed from: e */
    public final /* synthetic */ String f22898e;

    /* renamed from: f */
    public final /* synthetic */ C13851h1 f22899f;

    /* renamed from: g */
    public final /* synthetic */ MsgHandler f22900g;

    public C6202a3(MsgHandler msgHandler, C96651n nVar, String str, C13851h1 h1Var) {
        this.f22900g = msgHandler;
        this.f22897d = nVar;
        this.f22898e = str;
        this.f22899f = h1Var;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C6080m.Cx0().mo134808h(this.f22897d);
        C6080m.Cx0().mo134805e(this.f22898e);
        this.f22900g.mo7210k5(this.f22899f, "uploadVoice:fail", (Map<String, Object>) null);
    }
}
