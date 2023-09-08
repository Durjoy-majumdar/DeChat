package com.tencent.p014mm.plugin.offline.p085ui;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.offline.ui.OfflineAlertView$$f */
public class OfflineAlertView$$f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TextView f115250d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f115251e;

    /* renamed from: f */
    public final /* synthetic */ ImageView f115252f;

    /* renamed from: g */
    public final /* synthetic */ OfflineAlertView f115253g;

    public OfflineAlertView$$f(OfflineAlertView offlineAlertView, TextView textView, ImageView imageView, ImageView imageView2) {
        this.f115253g = offlineAlertView;
        this.f115250d = textView;
        this.f115251e = imageView;
        this.f115252f = imageView2;
    }

    public void run() {
        if (this.f115250d.getLineCount() > 1) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C76577a.m92157h(this.f115253g.getContext(), C0966R.dimen.f3736cp), C76577a.m92157h(this.f115253g.getContext(), C0966R.dimen.f3736cp));
            int b = C76577a.m92151b(this.f115253g.getContext(), 2);
            layoutParams.gravity = 48;
            layoutParams.topMargin = b;
            this.f115251e.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C76577a.m92157h(this.f115253g.getContext(), C0966R.dimen.f3766df), C76577a.m92157h(this.f115253g.getContext(), C0966R.dimen.f3736cp));
            layoutParams2.gravity = 48;
            layoutParams2.topMargin = b;
            this.f115252f.setLayoutParams(layoutParams2);
        }
    }
}
