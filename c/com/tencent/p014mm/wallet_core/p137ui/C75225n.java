package com.tencent.p014mm.wallet_core.p137ui;

import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.wallet_core.ui.n */
public class C75225n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C75218i f221340d;

    public C75225n(C75218i iVar) {
        this.f221340d = iVar;
    }

    public void run() {
        ViewGroup viewGroup = (ViewGroup) this.f221340d.f221330n.findViewById(C0966R.C0970id.gov);
        if (viewGroup != null) {
            viewGroup.sendAccessibilityEvent(128);
        }
    }
}
