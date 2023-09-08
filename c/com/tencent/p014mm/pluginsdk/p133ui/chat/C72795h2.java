package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.h2 */
public class C72795h2 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ VoiceInputPanel f212186d;

    public C72795h2(VoiceInputPanel voiceInputPanel) {
        this.f212186d = voiceInputPanel;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel$9", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        boolean b = VoiceInputPanel.m20865b(this.f212186d, view, motionEvent);
        C117292a.m165362h(b, this, "com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel$9", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return b;
    }
}
