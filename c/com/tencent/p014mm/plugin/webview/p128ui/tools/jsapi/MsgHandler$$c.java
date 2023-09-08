package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.C68082g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.stub.C6107m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import eb0.C75597w2;
import f40.C86709a0;
import f62.C75700k0;
import java.util.Map;
import lg3.C76697h;
import p196ln.C76706g;
import p196ln.C76708i;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$c */
public class MsgHandler$$c implements C75597w2.C31525a {

    /* renamed from: a */
    public final /* synthetic */ Intent f22757a;

    /* renamed from: b */
    public final /* synthetic */ MsgHandler f22758b;

    public MsgHandler$$c(MsgHandler msgHandler, Intent intent) {
        this.f22758b = msgHandler;
        this.f22757a = intent;
    }

    /* renamed from: a */
    public void mo1109a(String str, boolean z) {
        C6107m mVar;
        Class cls = C75700k0.class;
        MsgHandler msgHandler = this.f22758b;
        msgHandler.f22710s = null;
        if (msgHandler.f22697d == null || (mVar = msgHandler.f22715x) == null) {
            Log.m105928w("MicroMsg.MsgHandler", "getNow callback, msghandler has already been detached!");
            MsgHandler msgHandler2 = this.f22758b;
            msgHandler2.mo7210k5(msgHandler2.f22698e, "profile:fail", (Map<String, Object>) null);
            return;
        }
        try {
            mVar.mo7031V5(WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE, (Bundle) null);
        } catch (RemoteException e) {
            Log.m105921e("MicroMsg.MsgHandler", "hide dialog fail %s", e.getMessage());
        }
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str);
        if (z1Var == null || ((int) z1Var.f108320R1) <= 0) {
            z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69730y3(str);
        }
        if (z1Var == null || ((int) z1Var.f108320R1) <= 0) {
            z = false;
        } else {
            str = z1Var.getUsername();
        }
        if (!z) {
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) C76697h.m92348a(this.f22758b.f22697d).getString(C0966R.string.f0a, new Object[]{3, -1}), 0).show();
            MsgHandler msgHandler3 = this.f22758b;
            msgHandler3.mo7210k5(msgHandler3.f22698e, "profile:fail", (Map<String, Object>) null);
            return;
        }
        ((C76708i) C86312j.m106911c(C76708i.class)).mo106848yE(str, 3);
        ((C68082g) ((C76706g) C86312j.m106911c(C76706g.class)).mo106847uz()).mo93582i(str);
        this.f22757a.addFlags(268435456);
        this.f22757a.putExtra("Contact_User", str);
        if (z1Var.mo62916m3()) {
            Bundle bundle = this.f22758b.f22704n;
            int i = 42;
            if (bundle != null) {
                i = bundle.getInt("Contact_Scene", 42);
            }
            C115669n nVar = C115669n.INSTANCE;
            nVar.kvStat(10298, z1Var.getUsername() + "," + i);
            this.f22757a.putExtra("Contact_Scene", i);
        }
        this.f22758b.mo7199d7(this.f22757a);
        MsgHandler msgHandler4 = this.f22758b;
        msgHandler4.mo7210k5(msgHandler4.f22698e, "profile:ok", (Map<String, Object>) null);
    }
}
