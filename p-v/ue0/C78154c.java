package ue0;

import android.view.View;
import com.tencent.p014mm.openim.p018ui.view.BaseDialogView;
import j20.C117292a;
import java.util.ArrayList;
import ue0.C78151a;

/* renamed from: ue0.c */
public final class C78154c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BaseDialogView f229007d;

    public C78154c(BaseDialogView baseDialogView) {
        this.f229007d = baseDialogView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/openim/ui/view/BaseDialogView$initDialogBg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        BaseDialogView baseDialogView = this.f229007d;
        if (!baseDialogView.f195875W) {
            C117292a.m165361g(this, "com/tencent/mm/openim/ui/view/BaseDialogView$initDialogBg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C78151a.C78152a aVar = baseDialogView.f195887q;
        if (aVar != null) {
            aVar.mo108007a(3);
        }
        C117292a.m165361g(this, "com/tencent/mm/openim/ui/view/BaseDialogView$initDialogBg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
