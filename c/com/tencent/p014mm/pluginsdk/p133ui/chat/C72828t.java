package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.t */
public class C72828t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212237d;

    public C72828t(ChatFooter chatFooter) {
        this.f212237d = chatFooter;
    }

    public void run() {
        View contentView = this.f212237d.f211855c2.getContentView();
        contentView.getLocationOnScreen(new int[2]);
        View findViewById = contentView.findViewById(C0966R.C0970id.kmr);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.leftMargin = MMApplicationContext.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
        findViewById.setLayoutParams(layoutParams);
    }
}
