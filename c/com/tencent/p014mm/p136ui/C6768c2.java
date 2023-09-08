package com.tencent.p014mm.p136ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86718e;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import nj3.C88990b;

/* renamed from: com.tencent.mm.ui.c2 */
public class C6768c2 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f24297d;

    /* renamed from: e */
    public final /* synthetic */ Activity f24298e;

    /* renamed from: f */
    public final /* synthetic */ Intent f24299f;

    public C6768c2(String str, Activity activity, Intent intent) {
        this.f24297d = str;
        this.f24298e = activity;
        this.f24299f = intent;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(322, 23, 1, true);
        nVar.mo160131h(11098, 4023, String.format("%b|%s", new Object[]{Boolean.valueOf(Util.isNullOrNil(this.f24297d)), this.f24297d}));
        C86718e.m107550n();
        if (Util.isNullOrNil(this.f24297d)) {
            Activity activity = this.f24298e;
            Intent intent = this.f24299f;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Activity activity2 = activity;
            C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/mm/ui/MMErrorProcessor$3", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(activity2, "com/tencent/mm/ui/MMErrorProcessor$3", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C88990b.m111192a(this.f24298e, this.f24299f);
            return;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("rawUrl", this.f24297d);
        intent2.putExtra("showShare", false);
        intent2.putExtra("show_bottom", false);
        intent2.putExtra("needRedirect", false);
        intent2.putExtra("neverGetA8Key", true);
        intent2.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
        intent2.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
        C88144b.m109791i(this.f24298e, "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
    }
}
