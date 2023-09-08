package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.View;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.ui.h */
public final class C3831h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderActivityDescUI f17364d;

    /* renamed from: e */
    public final /* synthetic */ FinderContact f17365e;

    public C3831h(FinderActivityDescUI finderActivityDescUI, FinderContact finderContact) {
        this.f17364d = finderActivityDescUI;
        this.f17365e = finderContact;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderActivityDescUI$showBottomSheet$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderActivityDescUI finderActivityDescUI = this.f17364d;
        String str = this.f17365e.username;
        if (str == null) {
            str = "";
        }
        FinderActivityDescUI.m3816O7(finderActivityDescUI, str);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderActivityDescUI$showBottomSheet$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
