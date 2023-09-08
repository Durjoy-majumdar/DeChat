package com.tencent.p014mm.p136ui;

import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.C73309a2;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.u2 */
public class C45094u2 implements View.OnClickListener {

    /* renamed from: d */
    public C67391b f122328d;

    public C45094u2(C67391b bVar) {
        this.f122328d = bVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/MediaIconClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() instanceof C74244u.C74254i) {
            C73309a2.m86452e(view);
            this.f122328d.mo91540A();
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/MediaIconClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
