package com.tencent.p014mm.plugin.offline.p085ui;

import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.offline.ui.n */
public class C57164n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f163806d;

    /* renamed from: e */
    public final /* synthetic */ View f163807e;

    /* renamed from: f */
    public final /* synthetic */ OfflineAlertView f163808f;

    public C57164n(OfflineAlertView offlineAlertView, View view, View view2) {
        this.f163808f = offlineAlertView;
        this.f163806d = view;
        this.f163807e = view2;
    }

    public void run() {
        Log.m105925i("MicroMsg.OfflineAlertView", "showFirstPostTip: qrCodeView.getHeight %s %s", Integer.valueOf(this.f163806d.getHeight()), Integer.valueOf(this.f163806d.getMeasuredHeight()));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f163807e.getLayoutParams();
        if (this.f163806d.getHeight() > 0) {
            if (this.f163807e.getHeight() > this.f163806d.getHeight()) {
                this.f163808f.requestLayout();
            } else {
                layoutParams.height = this.f163806d.getHeight();
                this.f163807e.setLayoutParams(layoutParams);
            }
        }
        OfflineAlertView$$h offlineAlertView$$h = this.f163808f.f201801h;
        if (offlineAlertView$$h != null) {
            ((WalletOfflineCoinPurseUI$$g) offlineAlertView$$h).mo96319a();
        }
    }
}
