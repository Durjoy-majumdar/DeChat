package com.tencent.p014mm.p136ui.contact;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.contact.c4 */
public class C74471c4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsSelectConversationUI f218995d;

    public C74471c4(SnsSelectConversationUI snsSelectConversationUI) {
        this.f218995d = snsSelectConversationUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/contact/SnsSelectConversationUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsSelectConversationUI snsSelectConversationUI = this.f218995d;
        int i = SnsSelectConversationUI.f218864N;
        snsSelectConversationUI.mo103484i8();
        C117292a.m165361g(this, "com/tencent/mm/ui/contact/SnsSelectConversationUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
