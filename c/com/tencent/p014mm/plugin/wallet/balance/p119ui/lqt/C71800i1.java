package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.widget.AbsListView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import te3.C78017yd3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.i1 */
public class C71800i1 implements AbsListView.OnScrollListener {

    /* renamed from: d */
    public final /* synthetic */ C78017yd3 f208330d;

    /* renamed from: e */
    public final /* synthetic */ WalletLqtPlanDetailUI f208331e;

    public C71800i1(WalletLqtPlanDetailUI walletLqtPlanDetailUI, C78017yd3 yd32) {
        this.f208331e = walletLqtPlanDetailUI;
        this.f208330d = yd32;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        arrayList.add(Integer.valueOf(i3));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i == 0 && absListView.getLastVisiblePosition() == absListView.getCount() - 1) {
            Log.m105924i("MicroMsg.WalletLqtPlanDetailUI", "doPlanOrderList more");
            WalletLqtPlanDetailUI walletLqtPlanDetailUI = this.f208331e;
            if (!walletLqtPlanDetailUI.f208060B) {
                walletLqtPlanDetailUI.mo98952I7(this.f208330d.f228580p, walletLqtPlanDetailUI.f208059A, 6);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
