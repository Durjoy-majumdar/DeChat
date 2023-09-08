package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import q12.C12033h;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.r1 */
public class C4713r1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ IPCallShareCouponUI f19719d;

    public C4713r1(IPCallShareCouponUI iPCallShareCouponUI) {
        this.f19719d = iPCallShareCouponUI;
    }

    public void onClick(View view) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERFINO_IPCALL_MSG_CENTER_SHOW_REDDOT_TYPE_INT;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C85801v1 u = C97625j3.m125812b().mo105906u();
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_IPCALL_MSG_CENTER_SHOW_REDDOT_BOOLEAN;
        Boolean bool = Boolean.FALSE;
        if (((Boolean) u.mo119685f(aVar2, bool)).booleanValue()) {
            C12033h.m11735a(4, -1, ((Integer) C97625j3.m125812b().mo105906u().mo119685f(aVar, -1)).intValue());
        }
        C97625j3.m125812b().mo105906u().mo119677K(aVar, -1);
        C97625j3.m125812b().mo105906u().mo119677K(aVar2, bool);
        this.f19719d.f19602p.setVisibility(8);
        Intent intent = new Intent();
        intent.setClass(this.f19719d.getContext(), IPCallMsgUI.class);
        AppCompatActivity context = this.f19719d.getContext();
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(intent);
        AppCompatActivity appCompatActivity = context;
        C117292a.m165358d(appCompatActivity, aVar3.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar3.mo10231a(0));
        C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
