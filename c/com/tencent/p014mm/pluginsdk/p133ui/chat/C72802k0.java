package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.View;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.k0 */
public class C72802k0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212196d;

    public C72802k0(ChatFooter chatFooter) {
        this.f212196d = chatFooter;
    }

    public void run() {
        View findViewById = this.f212196d.f211873g.findViewById(C0966R.C0970id.lbl);
        findViewById.setFocusable(true);
        findViewById.setFocusableInTouchMode(true);
        findViewById.requestFocus();
        findViewById.sendAccessibilityEvent(128);
    }
}
