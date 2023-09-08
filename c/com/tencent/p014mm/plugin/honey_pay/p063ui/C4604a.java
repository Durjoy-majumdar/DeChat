package com.tencent.p014mm.plugin.honey_pay.p063ui;

import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.honey_pay.p063ui.HoneyPayCardManagerUI;

/* renamed from: com.tencent.mm.plugin.honey_pay.ui.a */
public class C4604a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ HoneyPayCardManagerUI.C4598d f19388d;

    public C4604a(HoneyPayCardManagerUI.C4598d dVar) {
        this.f19388d = dVar;
    }

    public void run() {
        ViewGroup viewGroup = (ViewGroup) this.f19388d.findViewById(C0966R.C0970id.ez6);
        if (viewGroup != null) {
            viewGroup.sendAccessibilityEvent(8);
        }
    }
}
