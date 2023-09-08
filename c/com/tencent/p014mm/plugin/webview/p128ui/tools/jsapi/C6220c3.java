package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.webview.model.C96651n;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import java.util.Map;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.c3 */
public class C6220c3 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C96651n f22946d;

    /* renamed from: e */
    public final /* synthetic */ String f22947e;

    /* renamed from: f */
    public final /* synthetic */ C13851h1 f22948f;

    /* renamed from: g */
    public final /* synthetic */ MsgHandler f22949g;

    public C6220c3(MsgHandler msgHandler, C96651n nVar, String str, C13851h1 h1Var) {
        this.f22949g = msgHandler;
        this.f22946d = nVar;
        this.f22947e = str;
        this.f22948f = h1Var;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C6080m.Cx0().mo134808h(this.f22946d);
        C6080m.Cx0().mo134804d(this.f22947e);
        this.f22949g.mo7210k5(this.f22948f, "downloadVoice:fail", (Map<String, Object>) null);
    }
}
