package jz2;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: jz2.g */
public final class C9546g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C76474e f29741d;

    public C9546g(C76474e eVar) {
        this.f29741d = eVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$handleSameFriendsTip$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f29741d.mo106664G();
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$handleSameFriendsTip$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
