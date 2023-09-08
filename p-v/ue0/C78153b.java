package ue0;

import android.view.View;
import com.tencent.p014mm.openim.p018ui.view.BaseDialogView;
import j20.C117292a;
import java.util.ArrayList;
import ue0.C78151a;

/* renamed from: ue0.b */
public final class C78153b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BaseDialogView f229006d;

    public C78153b(BaseDialogView baseDialogView) {
        this.f229006d = baseDialogView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/openim/ui/view/BaseDialogView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C78151a.C78152a aVar = this.f229006d.f195887q;
        if (aVar != null) {
            aVar.mo108007a(4);
        }
        C117292a.m165361g(this, "com/tencent/mm/openim/ui/view/BaseDialogView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
