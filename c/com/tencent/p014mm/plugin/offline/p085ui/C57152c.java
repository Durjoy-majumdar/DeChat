package com.tencent.p014mm.plugin.offline.p085ui;

import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.offline.ui.c */
public class C57152c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f163785d;

    /* renamed from: e */
    public final /* synthetic */ View f163786e;

    /* renamed from: f */
    public final /* synthetic */ OfflineAlertView f163787f;

    public C57152c(OfflineAlertView offlineAlertView, View view, View view2) {
        this.f163787f = offlineAlertView;
        this.f163785d = view;
        this.f163786e = view2;
    }

    public void run() {
        Log.m105925i("MicroMsg.OfflineAlertView", "showEmptyCodeAlert: qrCodeView.getHeight%s %s", Integer.valueOf(this.f163785d.getHeight()), Integer.valueOf(this.f163786e.getMeasuredHeight()));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f163786e.getLayoutParams();
        if (this.f163786e.getMeasuredHeight() > this.f163785d.getHeight()) {
            layoutParams.height = this.f163786e.getMeasuredHeight();
            this.f163786e.setLayoutParams(layoutParams);
        } else if (this.f163785d.getHeight() > 0) {
            layoutParams.height = this.f163785d.getHeight();
            this.f163786e.setLayoutParams(layoutParams);
        }
        OfflineAlertView$$h offlineAlertView$$h = this.f163787f.f201801h;
        if (offlineAlertView$$h != null) {
            ((WalletOfflineCoinPurseUI$$g) offlineAlertView$$h).mo96319a();
        }
    }
}
