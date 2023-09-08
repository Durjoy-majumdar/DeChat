package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.p1 */
public class C4704p1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ IPCallShareCouponUI f19694d;

    public C4704p1(IPCallShareCouponUI iPCallShareCouponUI) {
        this.f19694d = iPCallShareCouponUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        IPCallShareCouponUI iPCallShareCouponUI = this.f19694d;
        iPCallShareCouponUI.f19586A.f35022d++;
        C115669n.INSTANCE.idkeyStat(257, 1, 1, true);
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_IPCALL_EXCHANGE_RECORD_SHOW_REDDOT_BOOLEAN, Boolean.FALSE);
        iPCallShareCouponUI.f19607u.setVisibility(8);
        Intent intent = new Intent();
        intent.putExtra("rawUrl", iPCallShareCouponUI.getString(C0966R.string.fu6));
        intent.putExtra("showShare", false);
        C88144b.m109791i(iPCallShareCouponUI, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
