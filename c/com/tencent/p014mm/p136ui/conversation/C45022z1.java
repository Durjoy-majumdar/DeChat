package com.tencent.p014mm.p136ui.conversation;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.p136ui.conversation.OpenImKefuServiceConversationUI;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.conversation.z1 */
public final class C45022z1 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI f122117d;

    public C45022z1(OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI) {
        this.f122117d = openImKefuServiceConversationFmUI;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/conversation/OpenImKefuServiceConversationUI$OpenImKefuServiceConversationFmUI$initData$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        C87412m.m108594g(view, "v");
        C87412m.m108594g(motionEvent, "event");
        if (motionEvent.getAction() == 0) {
            this.f122117d.f121861o = (int) motionEvent.getRawX();
            this.f122117d.f121862p = (int) motionEvent.getRawY();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/ui/conversation/OpenImKefuServiceConversationUI$OpenImKefuServiceConversationFmUI$initData$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
