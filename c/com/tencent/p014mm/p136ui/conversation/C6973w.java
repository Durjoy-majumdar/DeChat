package com.tencent.p014mm.p136ui.conversation;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.p136ui.conversation.EnterpriseConversationUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.conversation.w */
public class C6973w implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ Point f24691d;

    public C6973w(EnterpriseConversationUI.EnterpriseConversationFmUI enterpriseConversationFmUI, Point point) {
        this.f24691d = point;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/conversation/EnterpriseConversationUI$EnterpriseConversationFmUI$12", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            this.f24691d.x = (int) motionEvent.getRawX();
            this.f24691d.y = (int) motionEvent.getRawY();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/ui/conversation/EnterpriseConversationUI$EnterpriseConversationFmUI$12", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
