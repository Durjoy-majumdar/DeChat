package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Iterator;
import ke3.C88144b;
import nj3.C76874e0;
import nj3.C76875f0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.account.ui.q */
public class C68507q {
    /* renamed from: a */
    public static void m80766a(Context context, String str) {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
        intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
        intent.putExtra("KFromLoginHistory", false);
        C88144b.m109791i(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: b */
    public static void m80767b(Context context, int i) {
        LayoutInflater.from(context);
        C77407n nVar = new C77407n(context, 1, false);
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        C68505o oVar = new C68505o(i, context);
        C68506p pVar = new C68506p(context, (String) null, (String) null, (String) null);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C76875f0 f0Var = (C76875f0) ((MenuItem) it.next());
            f0Var.f224728w = null;
            f0Var.f224729x = null;
        }
        arrayList.clear();
        C76874e0 e0Var = new C76874e0(context);
        oVar.onCreateMMMenu(e0Var);
        if (e0Var.mo107176v()) {
            Log.m105928w("MicroMsg.MMSubMenuHelper", "show, menu empty");
            return;
        }
        nVar.f225771i = oVar;
        nVar.f225782p = pVar;
        nVar.f225761d = null;
        nVar.f225725D = null;
        nVar.mo107573q();
    }
}
