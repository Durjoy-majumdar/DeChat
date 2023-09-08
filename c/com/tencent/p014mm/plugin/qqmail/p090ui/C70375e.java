package com.tencent.p014mm.plugin.qqmail.p090ui;

import android.view.View;
import android.widget.AdapterView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.qqmail.ui.e */
public class C70375e implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ MailAddrsViewControl f203275d;

    public C70375e(MailAddrsViewControl mailAddrsViewControl) {
        this.f203275d = mailAddrsViewControl;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        this.f203275d.mo96851b(this.f203275d.f203198g.f203210d.get(i));
        this.f203275d.f203197f.setText("");
        C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
