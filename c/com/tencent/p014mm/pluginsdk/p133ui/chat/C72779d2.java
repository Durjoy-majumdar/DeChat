package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.d2 */
public class C72779d2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ VoiceInputPanel f212140d;

    public C72779d2(VoiceInputPanel voiceInputPanel) {
        this.f212140d = voiceInputPanel;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        VoiceInputPanel.m20867d(this.f212140d, 2);
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
