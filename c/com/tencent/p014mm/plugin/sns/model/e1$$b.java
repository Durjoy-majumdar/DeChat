package com.tencent.p014mm.plugin.sns.model;

import android.app.Activity;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import k20.C9556a;
import qo3.C47883u;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.sns.model.e1$$b */
public final /* synthetic */ class e1$$b implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ Activity f21133a;

    public /* synthetic */ e1$$b(Activity activity) {
        this.f21133a = activity;
    }

    /* renamed from: a */
    public final void mo353a(boolean z, String str) {
        Activity activity = this.f21133a;
        SnsMethodCalculate.markStartTimeMs("lambda$handleSnsDBDamage$1", "com.tencent.mm.plugin.sns.model.SnsCore");
        Log.m105924i("MicroMsg.SnsCore", "[positiveClick]:click reset wechat");
        if (z) {
            int i = C94866e1.Ax0().f274891T.getInt("damage_restart_count_key", 0);
            Log.m105924i("MicroMsg.SnsCore", "get db damage restart count = " + i);
            C94866e1.Ax0().f274891T.putInt("damage_restart_count_key", i + 1);
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(MMApplicationContext.getContext().getPackageName(), "com.tencent.mm.process.KillProcessHelperActivity"));
            intent.addFlags(268435456);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Activity activity2 = activity;
            C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/model/SnsCore", "lambda$handleSnsDBDamage$1", "(Landroid/app/Activity;ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(activity2, "com/tencent/mm/plugin/sns/model/SnsCore", "lambda$handleSnsDBDamage$1", "(Landroid/app/Activity;ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C89779i0.m112248e(activity, MMApplicationContext.getString(C0966R.string.jec), false, 3, (DialogInterface.OnCancelListener) null).show();
            activity.overridePendingTransition(0, 0);
        }
        SnsMethodCalculate.markEndTimeMs("lambda$handleSnsDBDamage$1", "com.tencent.mm.plugin.sns.model.SnsCore");
    }
}
