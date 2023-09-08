package com.tencent.p014mm.plugin.finder.view;

import android.content.DialogInterface;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.finder.view.l0 */
public final class C4091l0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77407n f18227d;

    /* renamed from: e */
    public final /* synthetic */ DialogInterface.OnClickListener f18228e;

    public C4091l0(C77407n nVar, DialogInterface.OnClickListener onClickListener) {
        this.f18227d = nVar;
        this.f18228e = onClickListener;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderBottomDialogHelper$Companion$showConfirmDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f18227d.mo107572p();
        DialogInterface.OnClickListener onClickListener = this.f18228e;
        if (onClickListener != null) {
            onClickListener.onClick((DialogInterface) null, -1);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderBottomDialogHelper$Companion$showConfirmDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
