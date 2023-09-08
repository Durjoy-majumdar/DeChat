package com.tencent.p014mm.plugin.offline.p085ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.offline.ui.OfflineAlertView$$d */
public class OfflineAlertView$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TextView f201804d;

    /* renamed from: e */
    public final /* synthetic */ CheckBox f201805e;

    /* renamed from: f */
    public final /* synthetic */ View f201806f;

    /* renamed from: g */
    public final /* synthetic */ OfflineAlertView f201807g;

    public OfflineAlertView$$d(OfflineAlertView offlineAlertView, TextView textView, CheckBox checkBox, View view) {
        this.f201807g = offlineAlertView;
        this.f201804d = textView;
        this.f201805e = checkBox;
        this.f201806f = view;
    }

    public void run() {
        LinearLayout.LayoutParams layoutParams;
        if (this.f201804d.getLineCount() > 1 && (layoutParams = (LinearLayout.LayoutParams) this.f201805e.getLayoutParams()) != null) {
            Rect rect = new Rect();
            this.f201804d.getLineBounds(0, rect);
            layoutParams.gravity = 48;
            layoutParams.topMargin = (rect.height() - layoutParams.height) / 2;
            this.f201805e.setLayoutParams(layoutParams);
        }
        LinearLayout linearLayout = (LinearLayout) this.f201807g.findViewById(C0966R.C0970id.bsa);
        if (linearLayout != null) {
            Log.m105925i("MicroMsg.OfflineAlertView", "showOpenAlertView: qrCodeView.getHeight%s %s", Integer.valueOf(this.f201806f.getHeight()), Integer.valueOf(linearLayout.getHeight()));
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            if (linearLayout.getHeight() > this.f201806f.getHeight()) {
                Log.m105928w("MicroMsg.OfflineAlertView", "don't modify alert height");
                layoutParams2.height = linearLayout.getHeight();
                linearLayout.setLayoutParams(layoutParams2);
            } else if (linearLayout.getHeight() > 0) {
                layoutParams2.height = this.f201806f.getHeight();
                linearLayout.setLayoutParams(layoutParams2);
                View findViewById = this.f201807g.findViewById(C0966R.C0970id.l8n);
                View findViewById2 = this.f201807g.findViewById(C0966R.C0970id.l8o);
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
                layoutParams3.weight = 67.0f;
                findViewById.setLayoutParams(layoutParams3);
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) findViewById2.getLayoutParams();
                layoutParams4.weight = 56.0f;
                findViewById2.setLayoutParams(layoutParams4);
            }
            OfflineAlertView$$h offlineAlertView$$h = this.f201807g.f201801h;
            if (offlineAlertView$$h != null) {
                ((WalletOfflineCoinPurseUI$$g) offlineAlertView$$h).mo96319a();
            }
        }
    }
}
