package com.tencent.p014mm.p136ui.chatting.view;

import android.view.View;
import com.tencent.p014mm.p136ui.chatting.view.C57702l;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.chatting.view.k */
public class C57701k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C57702l f165141d;

    public C57701k(C57702l lVar) {
        this.f165141d = lVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/view/MMRemindDatePicker$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C57702l.C57703a aVar = this.f165141d.f165149h;
        if (aVar != null) {
            aVar.onCancel();
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/view/MMRemindDatePicker$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
