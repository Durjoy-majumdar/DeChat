package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.view.View;
import com.tencent.p014mm.booter.notification.MMNotification;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.n2 */
public class C105430n2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C105420i2 f313460d;

    public C105430n2(C105420i2 i2Var) {
        this.f313460d = i2Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/TalkUIController$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C105420i2 i2Var = this.f313460d;
        i2Var.f313452y.mo150067j(0, 0);
        ((MMNotification) C97625j3.m125816f()).mo93207e(42);
        i2Var.f313450w.finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/TalkUIController$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
