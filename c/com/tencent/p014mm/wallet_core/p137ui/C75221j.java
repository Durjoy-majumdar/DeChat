package com.tencent.p014mm.wallet_core.p137ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76901s0;

/* renamed from: com.tencent.mm.wallet_core.ui.j */
public class C75221j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C75218i f221334d;

    public C75221j(C75218i iVar) {
        this.f221334d = iVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/wallet_core/ui/OfflinePopupWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105918d("MicroMsg.OfflinePopupWindow", "root on click");
        C76901s0 s0Var = this.f221334d.f221324h;
        if (s0Var != null && s0Var.isShowing()) {
            this.f221334d.f221324h.dismiss();
        }
        C117292a.m165361g(this, "com/tencent/mm/wallet_core/ui/OfflinePopupWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
