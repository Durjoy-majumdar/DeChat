package com.tencent.p014mm.plugin.finder.view;

import android.content.DialogInterface;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import qo3.C77407n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lrx3/b0;", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion$showConfirmDialog$1 */
public final class FinderBottomCustomDialogHelper$Companion$showConfirmDialog$1 implements View.OnClickListener {
    public final /* synthetic */ C77407n $dialog;
    public final /* synthetic */ DialogInterface.OnClickListener $lok;
    private byte _hellAccFlag_;

    public FinderBottomCustomDialogHelper$Companion$showConfirmDialog$1(C77407n nVar, DialogInterface.OnClickListener onClickListener) {
        this.$dialog = nVar;
        this.$lok = onClickListener;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderBottomCustomDialogHelper$Companion$showConfirmDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.$dialog.mo107572p();
        DialogInterface.OnClickListener onClickListener = this.$lok;
        if (onClickListener != null) {
            onClickListener.onClick((DialogInterface) null, -1);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderBottomCustomDialogHelper$Companion$showConfirmDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
