package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.tencent.p014mm.plugin.ipcall.model.C105385g;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import s12.C13612c;
import s12.C13614k;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.q */
public class C4705q implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ C4725w f19695d;

    public C4705q(C4725w wVar) {
        this.f19695d = wVar;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        if (this.f19695d.f19732b.mo7996n(i)) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (adapterView instanceof ListView) {
            C4709r0 r0Var = this.f19695d.f19732b;
            C13614k kVar = r0Var.f19701q.get(i - ((ListView) adapterView).getHeaderViewsCount());
            if (kVar == null) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            C13612c cVar = null;
            if (kVar.field_addressId > 0) {
                cVar = C105385g.vx0().mo13007Yt(kVar.field_addressId);
            }
            Intent intent = new Intent(this.f19695d.f19734d, IPCallUserProfileUI.class);
            if (cVar != null) {
                intent.putExtra("IPCallProfileUI_contactid", cVar.field_contactId);
                intent.putExtra("IPCallProfileUI_systemUsername", cVar.field_systemAddressBookUsername);
                intent.putExtra("IPCallProfileUI_wechatUsername", cVar.field_wechatUsername);
            } else {
                intent.putExtra("IPCallProfileUI_phonenumber", kVar.field_phonenumber);
            }
            intent.putExtra("IPCallProfileUI_isNeedShowRecord", true);
            IPCallAddressUI iPCallAddressUI = this.f19695d.f19734d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            IPCallAddressUI iPCallAddressUI2 = iPCallAddressUI;
            C117292a.m165358d(iPCallAddressUI2, aVar.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$4", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            iPCallAddressUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(iPCallAddressUI2, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$4", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
