package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.a2 */
public class C4673a2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ IPCallUserProfileUI f19644d;

    public C4673a2(IPCallUserProfileUI iPCallUserProfileUI) {
        this.f19644d = iPCallUserProfileUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            C115669n.INSTANCE.mo160131h(12061, 0, 0, 0, 0, 0, 1);
            Intent intent = new Intent("android.intent.action.INSERT");
            intent.setType("vnd.android.cursor.dir/contact");
            intent.putExtra("phone", this.f19644d.f19631u);
            IPCallUserProfileUI iPCallUserProfileUI = this.f19644d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(iPCallUserProfileUI, aVar.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            iPCallUserProfileUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(iPCallUserProfileUI, "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (Exception e) {
            Log.m105920e("MicroMsg.IPCallUserProfileUI", e.getMessage());
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
