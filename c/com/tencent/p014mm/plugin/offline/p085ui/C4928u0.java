package com.tencent.p014mm.plugin.offline.p085ui;

import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.offline.ui.u0 */
public class C4928u0 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ int f20089d;

    /* renamed from: e */
    public final /* synthetic */ WalletOfflineCoinPurseUI f20090e;

    public C4928u0(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI, int i) {
        this.f20090e = walletOfflineCoinPurseUI;
        this.f20089d = i;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/offline/ui/WalletOfflineCoinPurseUI$23", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f20090e;
            walletOfflineCoinPurseUI.f201827I.setBackgroundDrawable(walletOfflineCoinPurseUI.getContext().getResources().getDrawable(C0966R.C0969drawable.b28));
        } else if (motionEvent.getAction() == 1) {
            WalletOfflineCoinPurseUI walletOfflineCoinPurseUI2 = this.f20090e;
            walletOfflineCoinPurseUI2.f201827I.setBackgroundDrawable(walletOfflineCoinPurseUI2.getContext().getResources().getDrawable(C0966R.C0969drawable.b29));
            ((GradientDrawable) this.f20090e.f201827I.getBackground()).setColor(this.f20089d);
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/offline/ui/WalletOfflineCoinPurseUI$23", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
