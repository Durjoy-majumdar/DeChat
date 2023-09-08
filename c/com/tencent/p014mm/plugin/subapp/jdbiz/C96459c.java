package com.tencent.p014mm.plugin.subapp.jdbiz;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import eb0.C75568c3;
import eb0.C97625j3;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.subapp.jdbiz.c */
public class C96459c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C96461f f282210d;

    /* renamed from: e */
    public final /* synthetic */ JDSysMsgNotifyLsn f282211e;

    public C96459c(JDSysMsgNotifyLsn jDSysMsgNotifyLsn, C96461f fVar) {
        this.f282211e = jDSysMsgNotifyLsn;
        this.f282210d = fVar;
    }

    public void run() {
        JDSysMsgNotifyLsn jDSysMsgNotifyLsn = this.f282211e;
        C96461f fVar = this.f282210d;
        jDSysMsgNotifyLsn.getClass();
        int intValue = ((Integer) C97625j3.m125812b().mo105906u().mo119684e(15, 0)).intValue();
        if (!C97625j3.m125815e().f256815j || 1 != intValue) {
            String xx02 = C96463h.xx0(fVar.f282229o, 4);
            Bundle bundle = new Bundle();
            bundle.putString(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, fVar.f282216b);
            bundle.putString("jump_url", xx02);
            ((C75568c3) C97625j3.m125816f()).mo93205b(37, MMApplicationContext.getContext().getString(C0966R.string.a25), fVar.f282225k, xx02, "bizjd", bundle);
            jDSysMsgNotifyLsn.f282208d.alive();
            C115669n.INSTANCE.mo160131h(11178, xx02, C96463h.yx0().Dx0().f282216b, 4);
            return;
        }
        String xx03 = C96463h.xx0(fVar.f282229o, 5);
        Context context = MMApplicationContext.getContext();
        String str = fVar.f282226l;
        String str2 = fVar.f282227m;
        String str3 = fVar.f282228n;
        String str4 = fVar.f282216b;
        int i = JDRemindDialog.f282204f;
        Intent intent = new Intent(context, JDRemindDialog.class);
        intent.putExtra("alertcontent", str);
        intent.putExtra("alertconfirm", str2);
        intent.putExtra("alert_cancel", str3);
        intent.putExtra("alertjumpurl", xx03);
        intent.putExtra("alert_activityid", str4);
        intent.addFlags(805306368);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/subapp/jdbiz/JDRemindDialog", "showAlert", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/subapp/jdbiz/JDRemindDialog", "showAlert", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C115669n.INSTANCE.mo160131h(11178, xx03, C96463h.yx0().Dx0().f282216b, 5);
    }
}
