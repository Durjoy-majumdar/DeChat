package com.tencent.p014mm.plugin.offline.p085ui;

import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.offline.ui.g */
public class C57153g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f163788d;

    /* renamed from: e */
    public final /* synthetic */ View f163789e;

    /* renamed from: f */
    public final /* synthetic */ OfflineAlertView f163790f;

    public C57153g(OfflineAlertView offlineAlertView, View view, View view2) {
        this.f163790f = offlineAlertView;
        this.f163788d = view;
        this.f163789e = view2;
    }

    public void run() {
        Log.m105925i("MicroMsg.OfflineAlertView", "qrCodeView.getHeight%s %s", Integer.valueOf(this.f163788d.getHeight()), Integer.valueOf(this.f163789e.getMeasuredHeight()));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f163789e.getLayoutParams();
        if (this.f163789e.getMeasuredHeight() > this.f163788d.getHeight()) {
            layoutParams.height = this.f163789e.getMeasuredHeight();
            this.f163789e.setLayoutParams(layoutParams);
        } else if (this.f163788d.getHeight() > 0) {
            layoutParams.height = this.f163788d.getHeight();
            this.f163789e.setLayoutParams(layoutParams);
        }
        OfflineAlertView$$h offlineAlertView$$h = this.f163790f.f201801h;
        if (offlineAlertView$$h != null) {
            ((WalletOfflineCoinPurseUI$$g) offlineAlertView$$h).mo96319a();
        }
    }
}
