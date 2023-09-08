package com.tencent.p014mm.plugin.finder.view;

import android.content.DialogInterface;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.finder.view.m0 */
public final class C4101m0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77407n f18249d;

    /* renamed from: e */
    public final /* synthetic */ DialogInterface.OnClickListener f18250e;

    public C4101m0(C77407n nVar, DialogInterface.OnClickListener onClickListener) {
        this.f18249d = nVar;
        this.f18250e = onClickListener;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderBottomDialogHelper$Companion$showConfirmDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f18249d.mo107572p();
        DialogInterface.OnClickListener onClickListener = this.f18250e;
        if (onClickListener != null) {
            onClickListener.onClick((DialogInterface) null, -2);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderBottomDialogHelper$Companion$showConfirmDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
