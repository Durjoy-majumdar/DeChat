package com.tencent.p014mm.p136ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C9556a;
import nj3.C88990b;

/* renamed from: com.tencent.mm.ui.d2 */
public class C6974d2 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ String f24692d;

    /* renamed from: e */
    public final /* synthetic */ Activity f24693e;

    /* renamed from: f */
    public final /* synthetic */ Intent f24694f;

    public C6974d2(String str, Activity activity, Intent intent) {
        this.f24692d = str;
        this.f24693e = activity;
        this.f24694f = intent;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(322, 24, 1, true);
        nVar.mo160131h(11098, 4024, String.format("%b|%s", new Object[]{Boolean.valueOf(Util.isNullOrNil(this.f24692d)), this.f24692d}));
        Activity activity = this.f24693e;
        Intent intent = this.f24694f;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Activity activity2 = activity;
        C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/mm/ui/MMErrorProcessor$4", "onCancel", "(Landroid/content/DialogInterface;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity2, "com/tencent/mm/ui/MMErrorProcessor$4", "onCancel", "(Landroid/content/DialogInterface;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C88990b.m111192a(this.f24693e, this.f24694f);
    }
}
