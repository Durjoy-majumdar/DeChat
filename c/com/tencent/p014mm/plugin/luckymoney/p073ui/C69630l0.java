package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.l0 */
public class C69630l0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyDetailUI f201000d;

    public C69630l0(LuckyMoneyDetailUI luckyMoneyDetailUI) {
        this.f201000d = luckyMoneyDetailUI;
    }

    public void run() {
        if (!this.f201000d.isFinishing() && !this.f201000d.isDestroyed()) {
            TextView textView = (TextView) this.f201000d.f199903u.findViewById(C0966R.C0970id.gdf);
            if (this.f201000d.f199801E.getVisibility() != 8 || this.f201000d.f199799D.getVisibility() != 8 || this.f201000d.f199797C.getVisibility() != 8 || textView.getVisibility() != 8) {
                View findViewById = this.f201000d.findViewById(C0966R.C0970id.gcy);
                LuckyMoneyDetailUI luckyMoneyDetailUI = this.f201000d;
                View view = luckyMoneyDetailUI.f199903u;
                if (view != null && findViewById != null) {
                    if (!luckyMoneyDetailUI.f199844W1) {
                        luckyMoneyDetailUI.f199844W1 = true;
                        luckyMoneyDetailUI.f199855a2 = view.getHeight();
                    }
                    int height = findViewById.getHeight();
                    this.f201000d.f199903u.getGlobalVisibleRect(new Rect());
                    int top = this.f201000d.f199903u.getTop();
                    int i = height - top;
                    LuckyMoneyDetailUI luckyMoneyDetailUI2 = this.f201000d;
                    int i2 = luckyMoneyDetailUI2.f199855a2;
                    if (i > i2) {
                        luckyMoneyDetailUI2.f199903u.setMinimumHeight(i);
                    } else {
                        luckyMoneyDetailUI2.f199903u.setMinimumHeight(i2);
                    }
                    Log.m105919d("MicroMsg.LuckyMoneyDetailUI", "winHeight:%s diff:%s recordHeight:%s", Integer.valueOf(height), Integer.valueOf(i), Integer.valueOf(top));
                }
            }
        }
    }
}
