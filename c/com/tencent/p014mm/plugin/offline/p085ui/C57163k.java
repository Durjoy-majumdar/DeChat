package com.tencent.p014mm.plugin.offline.p085ui;

import android.view.View;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;

/* renamed from: com.tencent.mm.plugin.offline.ui.k */
public class C57163k extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ View.OnClickListener f163805g;

    public C57163k(OfflineAlertView offlineAlertView, View.OnClickListener onClickListener) {
        this.f163805g = onClickListener;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        View.OnClickListener onClickListener = this.f163805g;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
