package com.tencent.p014mm.p136ui;

import android.os.SystemClock;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.k1 */
public class C6983k1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Runnable f24711d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f24712e;

    /* renamed from: f */
    public final /* synthetic */ MMActivityController f24713f;

    public C6983k1(MMActivityController mMActivityController, Runnable runnable, Runnable runnable2) {
        this.f24713f = mMActivityController;
        this.f24711d = runnable;
        this.f24712e = runnable2;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/MMActivityController$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (SystemClock.elapsedRealtime() - this.f24713f.f348109l0 < 300) {
            Runnable runnable = this.f24711d;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            Runnable runnable2 = this.f24712e;
            if (runnable2 != null) {
                runnable2.run();
            }
        }
        this.f24713f.f348109l0 = SystemClock.elapsedRealtime();
        C117292a.m165361g(this, "com/tencent/mm/ui/MMActivityController$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
