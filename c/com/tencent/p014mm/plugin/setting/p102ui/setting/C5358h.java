package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.view.View;
import android.view.ViewParent;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import iy3.C60641c;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.h */
public final class C5358h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f21000d;

    /* renamed from: e */
    public final /* synthetic */ ColorfulSelfQRCodeUI f21001e;

    public C5358h(View view, ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
        this.f21000d = view;
        this.f21001e = colorfulSelfQRCodeUI;
    }

    public final void run() {
        ViewParent parent = this.f21000d.getParent();
        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
        int height = ((View) parent).getHeight();
        int b = C60641c.m70921b(this.f21001e.getResources().getDisplayMetrics().density * ((float) 196));
        StringBuilder sb = new StringBuilder();
        sb.append("adjustQRHeight requestLayout ");
        sb.append(height);
        sb.append(' ');
        sb.append(b);
        sb.append(' ');
        sb.append(this.f21000d.getHeight());
        sb.append(' ');
        int i = height - b;
        sb.append(this.f21000d.getHeight() >= i);
        Log.m105924i("MicroMsg.Setting.ColorfulSelfQRCodeUI", sb.toString());
        if (this.f21000d.getHeight() >= i) {
            this.f21000d.getLayoutParams().height = i;
            this.f21000d.requestLayout();
        }
    }
}
