package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C19623o0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.x3 */
public class C18384x3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C19623o0 f50943d;

    /* renamed from: e */
    public final /* synthetic */ C18397y3 f50944e;

    public C18384x3(C18397y3 y3Var, C19623o0 o0Var) {
        this.f50944e = y3Var;
        this.f50943d = o0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineTextItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!this.f50943d.field_isExpand) {
            this.f50944e.f51005p.setMaxLines(Integer.MAX_VALUE);
            this.f50943d.field_isExpand = true;
            this.f50944e.f51006q.setText(C0966R.string.f360192ap3);
        } else {
            this.f50944e.f51005p.setMaxLines(4);
            this.f50943d.field_isExpand = false;
            this.f50944e.f51006q.setText(C0966R.string.ap4);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineTextItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
