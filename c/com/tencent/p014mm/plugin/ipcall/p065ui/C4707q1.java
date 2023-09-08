package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.q1 */
public class C4707q1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ IPCallShareCouponUI f19696d;

    public C4707q1(IPCallShareCouponUI iPCallShareCouponUI) {
        this.f19696d = iPCallShareCouponUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C115669n.INSTANCE.mo160131h(13340, 1, -1, -1, -1, -1);
        Intent intent = new Intent();
        intent.setClass(this.f19696d.getContext(), IPCallShareCouponCardUI.class);
        AppCompatActivity context = this.f19696d.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        AppCompatActivity appCompatActivity = context;
        C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
