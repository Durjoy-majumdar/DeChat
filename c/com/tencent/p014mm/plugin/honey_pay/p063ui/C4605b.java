package com.tencent.p014mm.plugin.honey_pay.p063ui;

import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.honey_pay.p063ui.HoneyPayMainUI;

/* renamed from: com.tencent.mm.plugin.honey_pay.ui.b */
public class C4605b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ HoneyPayMainUI.C4600f f19389d;

    public C4605b(HoneyPayMainUI.C4600f fVar) {
        this.f19389d = fVar;
    }

    public void run() {
        ViewGroup viewGroup = (ViewGroup) this.f19389d.findViewById(C0966R.C0970id.f358419f04);
        if (viewGroup != null) {
            viewGroup.sendAccessibilityEvent(8);
        }
    }
}
