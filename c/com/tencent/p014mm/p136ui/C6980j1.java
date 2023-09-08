package com.tencent.p014mm.p136ui;

import android.os.SystemClock;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.j1 */
public class C6980j1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Runnable f24707d;

    /* renamed from: e */
    public final /* synthetic */ MMActivityController f24708e;

    public C6980j1(MMActivityController mMActivityController, Runnable runnable) {
        this.f24708e = mMActivityController;
        this.f24707d = runnable;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/MMActivityController$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (SystemClock.elapsedRealtime() - this.f24708e.f348109l0 < 300) {
            this.f24707d.run();
        }
        this.f24708e.f348109l0 = SystemClock.elapsedRealtime();
        C117292a.m165361g(this, "com/tencent/mm/ui/MMActivityController$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
