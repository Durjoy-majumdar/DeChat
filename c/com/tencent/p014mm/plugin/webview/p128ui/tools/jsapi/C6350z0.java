package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import java.util.Map;
import p447aw.C103918d;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.z0 */
public class C6350z0 implements AbsRequestFloatWindowPermissionDialog.C85613a {

    /* renamed from: a */
    public final /* synthetic */ Map f23258a;

    /* renamed from: b */
    public final /* synthetic */ C13851h1 f23259b;

    /* renamed from: c */
    public final /* synthetic */ MsgHandler f23260c;

    public C6350z0(MsgHandler msgHandler, Map map, C13851h1 h1Var) {
        this.f23260c = msgHandler;
        this.f23258a = map;
        this.f23259b = h1Var;
    }

    /* renamed from: a */
    public void mo247a(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        Log.m105928w("MicroMsg.MsgHandler", "float window permission granted");
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        this.f23258a.put("ret", 0);
        this.f23260c.mo7210k5(this.f23259b, "requestOverlayPermission:ok", this.f23258a);
    }

    /* renamed from: b */
    public void mo248b(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        Log.m105929w("MicroMsg.MsgHandler", "onResultCancel ok:%b", Boolean.valueOf(((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(MMApplicationContext.getContext())));
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        this.f23258a.put("ret", -1);
        this.f23260c.mo7210k5(this.f23259b, "requestOverlayPermission:ok", this.f23258a);
    }

    /* renamed from: c */
    public void mo249c(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        Log.m105928w("MicroMsg.MsgHandler", "float window permission refused");
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        this.f23258a.put("ret", -1);
        this.f23260c.mo7210k5(this.f23259b, "requestOverlayPermission:ok", this.f23258a);
    }
}
