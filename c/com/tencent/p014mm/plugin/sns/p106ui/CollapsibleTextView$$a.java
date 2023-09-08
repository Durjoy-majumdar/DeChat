package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.CollapsibleTextView$$a */
public final /* synthetic */ class CollapsibleTextView$$a implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ CollapsibleTextView f276755d;

    public /* synthetic */ CollapsibleTextView$$a(CollapsibleTextView collapsibleTextView) {
        this.f276755d = collapsibleTextView;
    }

    public final boolean onLongClick(View view) {
        CollapsibleTextView collapsibleTextView = this.f276755d;
        int i = CollapsibleTextView.f276737x;
        collapsibleTextView.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/CollapsibleTextView", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", collapsibleTextView, array);
        SnsMethodCalculate.markStartTimeMs("lambda$setText$0", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        collapsibleTextView.f276740f.performLongClick();
        SnsMethodCalculate.markEndTimeMs("lambda$setText$0", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        C117292a.m165362h(false, collapsibleTextView, "com/tencent/mm/plugin/sns/ui/CollapsibleTextView", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
