package com.tencent.p014mm.plugin.offline.p085ui;

import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.offline.ui.i */
public class C57162i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f163802d;

    /* renamed from: e */
    public final /* synthetic */ View f163803e;

    /* renamed from: f */
    public final /* synthetic */ OfflineAlertView f163804f;

    public C57162i(OfflineAlertView offlineAlertView, View view, View view2) {
        this.f163804f = offlineAlertView;
        this.f163802d = view;
        this.f163803e = view2;
    }

    public void run() {
        Log.m105925i("MicroMsg.OfflineAlertView", "qrCodeView.getHeight%s %s", Integer.valueOf(this.f163802d.getHeight()), Integer.valueOf(this.f163803e.getMeasuredHeight()));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f163803e.getLayoutParams();
        if (this.f163803e.getMeasuredHeight() > this.f163802d.getHeight()) {
            layoutParams.height = this.f163803e.getMeasuredHeight();
            this.f163803e.setLayoutParams(layoutParams);
        } else if (this.f163802d.getHeight() > 0) {
            layoutParams.height = this.f163802d.getHeight();
            this.f163803e.setLayoutParams(layoutParams);
        }
        OfflineAlertView$$h offlineAlertView$$h = this.f163804f.f201801h;
        if (offlineAlertView$$h != null) {
            ((WalletOfflineCoinPurseUI$$g) offlineAlertView$$h).mo96319a();
        }
    }
}
