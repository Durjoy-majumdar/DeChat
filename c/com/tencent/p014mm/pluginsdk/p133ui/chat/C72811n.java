package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.n */
public class C72811n implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212206d;

    public C72811n(ChatFooter chatFooter) {
        this.f212206d = chatFooter;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$15", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f212206d.setToSendTextColor(true);
        C72825s0 s0Var = this.f212206d.f211780L;
        if (s0Var != null) {
            s0Var.mo100659u(view, motionEvent);
        }
        ChatFooter chatFooter = this.f212206d;
        chatFooter.getClass();
        chatFooter.postDelayed(new C72809m0(chatFooter, false), (long) 10);
        C117292a.m165362h(false, this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$15", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
