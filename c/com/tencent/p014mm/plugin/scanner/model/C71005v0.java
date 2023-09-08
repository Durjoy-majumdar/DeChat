package com.tencent.p014mm.plugin.scanner.model;

import android.view.View;
import com.tencent.p014mm.plugin.scanner.p101ui.BaseScanUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.scanner.model.v0 */
public final class C71005v0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C71007x0 f205482d;

    public C71005v0(C71007x0 x0Var) {
        this.f205482d = x0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/scanner/model/ScanInfoPageViewHelper$buildViewParams$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C71004i iVar = this.f205482d.f205484a;
        if (iVar != null) {
            ((BaseScanUI) iVar).mo24312m8(12);
        }
        C19016e1.m20079m(6, false, -1, 0);
        C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/model/ScanInfoPageViewHelper$buildViewParams$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
