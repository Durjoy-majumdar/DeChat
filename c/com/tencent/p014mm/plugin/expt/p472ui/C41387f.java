package com.tencent.p014mm.plugin.expt.p472ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.expt.ui.f */
public class C41387f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ExptDebugUI f111430d;

    public C41387f(ExptDebugUI exptDebugUI) {
        this.f111430d = exptDebugUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/expt/ui/ExptDebugUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ExptDebugUI.m44732H7(this.f111430d, Util.getInt(this.f111430d.f111419d.getText().toString().trim(), 0));
        C117292a.m165361g(this, "com/tencent/mm/plugin/expt/ui/ExptDebugUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
