package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.view.View;
import com.tencent.p014mm.pluginsdk.p133ui.tools.DropdownListView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.t */
public final class C72926t implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ DropdownListView f212543d;

    public C72926t(DropdownListView dropdownListView) {
        this.f212543d = dropdownListView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/tools/DropdownListView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        DropdownListView dropdownListView = this.f212543d;
        if (!dropdownListView.f212477h || dropdownListView.f212478i) {
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/DropdownListView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        dropdownListView.mo100758b();
        DropdownListView.C72903d mOnFolderAlbumDialogDismiss = this.f212543d.getMOnFolderAlbumDialogDismiss();
        C87412m.m108591d(mOnFolderAlbumDialogDismiss);
        mOnFolderAlbumDialogDismiss.mo100775a();
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/DropdownListView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
