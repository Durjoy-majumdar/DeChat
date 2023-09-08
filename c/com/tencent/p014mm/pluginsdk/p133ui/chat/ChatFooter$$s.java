package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.transvoice.model.C71561b;
import com.tencent.p014mm.plugin.transvoice.model.C71562c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$s */
public class ChatFooter$$s implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212051d;

    public ChatFooter$$s(ChatFooter chatFooter) {
        this.f212051d = chatFooter;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$52", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        ChatFooter chatFooter = this.f212051d;
        if (chatFooter.f211972z4) {
            chatFooter.f211972z4 = false;
            C71561b bVar = chatFooter.f211935s4;
            if (bVar != null) {
                bVar.mo98687a(false, true);
            }
            this.f212051d.f211961x4.stopTimer();
            ChatFooter chatFooter2 = this.f212051d;
            chatFooter2.f211797P2.setText((CharSequence) ((HashMap) chatFooter2.f211925q4).get(Integer.valueOf(chatFooter2.f211738A4)));
            C71562c cVar = this.f212051d.f211750D2;
            cVar.f207384s = 0;
            cVar.f207380o = System.currentTimeMillis();
            this.f212051d.f211930r4 = false;
        }
        this.f212051d.f211750D2.f207386u = 1;
        C117292a.m165362h(false, this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$52", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
