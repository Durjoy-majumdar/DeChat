package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.d0 */
public class C72777d0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212137d;

    public C72777d0(ChatFooter chatFooter) {
        this.f212137d = chatFooter;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$32", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ChatFooter chatFooter = this.f212137d;
        if (chatFooter.f211838Y0 == 1) {
            chatFooter.setMode(2);
        } else {
            chatFooter.setMode(1);
            C72825s0 s0Var = chatFooter.f211780L;
            if (s0Var != null) {
                s0Var.mo100649D(true);
                chatFooter.f211780L.mo100659u((View) null, (MotionEvent) null);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$32", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
