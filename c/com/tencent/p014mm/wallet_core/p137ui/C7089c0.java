package com.tencent.p014mm.wallet_core.p137ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.wallet_core.ui.c0 */
public abstract class C7089c0 implements View.OnClickListener {

    /* renamed from: d */
    public boolean f24994d = false;

    /* renamed from: e */
    public long f24995e = 3000;

    /* renamed from: f */
    public long f24996f;

    /* renamed from: a */
    public abstract void mo2066a(View view);

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/wallet_core/ui/WalletOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f24994d) {
            long j = this.f24995e;
            if (j == 0) {
                j = 3000;
            }
            boolean z = true;
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f24996f >= j) {
                z = false;
            }
            this.f24996f = currentTimeMillis;
            if (z) {
                C117292a.m165361g(this, "com/tencent/mm/wallet_core/ui/WalletOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        mo2066a(view);
        C75226r.m90203c(view);
        C117292a.m165361g(this, "com/tencent/mm/wallet_core/ui/WalletOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
