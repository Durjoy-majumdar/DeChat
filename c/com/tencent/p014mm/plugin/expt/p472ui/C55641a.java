package com.tencent.p014mm.plugin.expt.p472ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.expt.ui.a */
public class C55641a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ExptAppDebugUI f158375d;

    public C55641a(ExptAppDebugUI exptAppDebugUI) {
        this.f158375d = exptAppDebugUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/expt/ui/ExptAppDebugUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ExptAppDebugUI.m63246H7(this.f158375d, Util.getInt(this.f158375d.f158355d.getText().toString().trim(), 0));
        C117292a.m165361g(this, "com/tencent/mm/plugin/expt/ui/ExptAppDebugUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
