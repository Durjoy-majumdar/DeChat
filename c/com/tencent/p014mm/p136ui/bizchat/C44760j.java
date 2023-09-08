package com.tencent.p014mm.p136ui.bizchat;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.p136ui.bizchat.BizChatConversationUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.bizchat.j */
public class C44760j implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ BizChatConversationUI.BizChatConversationFmUI f121484d;

    public C44760j(BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI) {
        this.f121484d = bizChatConversationFmUI;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/bizchat/BizChatConversationUI$BizChatConversationFmUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            this.f121484d.f121348s = (int) motionEvent.getRawX();
            this.f121484d.f121349t = (int) motionEvent.getRawY();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/ui/bizchat/BizChatConversationUI$BizChatConversationFmUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
