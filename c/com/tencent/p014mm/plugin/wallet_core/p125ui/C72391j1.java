package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import st1.C77781t;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.j1 */
public class C72391j1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C72379f1 f210611d;

    public C72391j1(C72379f1 f1Var) {
        this.f210611d = f1Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C72379f1 f1Var = this.f210611d;
        HashMap<String, Boolean> hashMap = C72379f1.f210536Q0;
        f1Var.getClass();
        Log.m105924i("MicroMsg.WalletPwdDialog", "do req face id");
        C115669n.INSTANCE.mo160131h(15817, 3);
        Bundle bundle = new Bundle();
        bundle.putInt("face_auth_scene", 1);
        View view2 = f1Var.f210562d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "reqFaceIdAuth", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "reqFaceIdAuth", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((C77781t) C86312j.m106911c(C77781t.class)).d60((MMActivity) f1Var.f210561Z, new C72399l1(f1Var), bundle);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
