package com.tencent.p014mm.plugin.offline.p085ui;

import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.offline.ui.OfflineAlertView$$a */
public final /* synthetic */ class OfflineAlertView$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ OfflineAlertView f163782d;

    /* renamed from: e */
    public final /* synthetic */ View f163783e;

    /* renamed from: f */
    public final /* synthetic */ View f163784f;

    public /* synthetic */ OfflineAlertView$$a(OfflineAlertView offlineAlertView, View view, View view2) {
        this.f163782d = offlineAlertView;
        this.f163783e = view;
        this.f163784f = view2;
    }

    public final void run() {
        OfflineAlertView offlineAlertView = this.f163782d;
        View view = this.f163783e;
        View view2 = this.f163784f;
        int i = OfflineAlertView.f201796n;
        offlineAlertView.getClass();
        Log.m105925i("MicroMsg.OfflineAlertView", "qrCodeView.getHeight%s %s", Integer.valueOf(view.getHeight()), Integer.valueOf(view2.getMeasuredHeight()));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
        if (view2.getMeasuredHeight() > view.getHeight()) {
            layoutParams.height = view2.getMeasuredHeight();
            view2.setLayoutParams(layoutParams);
        } else if (view.getHeight() > 0) {
            layoutParams.height = view.getHeight();
            view2.setLayoutParams(layoutParams);
        }
        OfflineAlertView$$h offlineAlertView$$h = offlineAlertView.f201801h;
        if (offlineAlertView$$h != null) {
            ((WalletOfflineCoinPurseUI$$g) offlineAlertView$$h).mo96319a();
        }
    }
}
