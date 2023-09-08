package com.tencent.p014mm.p136ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import j20.C117292a;
import k20.C9556a;
import nj3.C88990b;

/* renamed from: com.tencent.mm.ui.b2 */
public class C6753b2 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ Intent f24176d;

    /* renamed from: e */
    public final /* synthetic */ Activity f24177e;

    public C6753b2(Intent intent, Activity activity) {
        this.f24176d = intent;
        this.f24177e = activity;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C115669n.INSTANCE.idkeyStat(405, 39, 1, true);
        if (this.f24176d != null) {
            this.f24177e.finish();
            Activity activity = this.f24177e;
            Intent intent = this.f24176d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/ui/MMErrorProcessor$10", "onCancel", "(Landroid/content/DialogInterface;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(activity, "com/tencent/mm/ui/MMErrorProcessor$10", "onCancel", "(Landroid/content/DialogInterface;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C88990b.m111192a(this.f24177e, this.f24176d);
        }
    }
}
