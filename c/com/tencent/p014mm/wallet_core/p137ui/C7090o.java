package com.tencent.p014mm.wallet_core.p137ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.wallet_core.ui.o */
public class C7090o implements View.OnClickListener {
    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/wallet_core/ui/SafeOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (System.currentTimeMillis() - 0 < 500) {
            C117292a.m165361g(this, "com/tencent/mm/wallet_core/ui/SafeOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        throw null;
    }
}
