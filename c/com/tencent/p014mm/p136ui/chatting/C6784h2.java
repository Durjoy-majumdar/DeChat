package com.tencent.p014mm.p136ui.chatting;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.chatting.h2 */
public class C6784h2 implements View.OnTouchListener {

    /* renamed from: d */
    public int[] f24331d = new int[2];

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/ChattingListEventListener$ChattingListTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if ((motionEvent.getAction() & 255) == 0) {
            this.f24331d[0] = (int) motionEvent.getRawX();
            this.f24331d[1] = (int) motionEvent.getRawY();
            view.setTag(C0966R.C0970id.f359414kt0, this.f24331d);
        }
        C117292a.m165362h(false, this, "com/tencent/mm/ui/chatting/ChattingListEventListener$ChattingListTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
