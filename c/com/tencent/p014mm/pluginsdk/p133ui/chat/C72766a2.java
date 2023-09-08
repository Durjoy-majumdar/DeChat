package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.a2 */
public class C72766a2 implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ VoiceInputPanel f212112d;

    public C72766a2(VoiceInputPanel voiceInputPanel) {
        this.f212112d = voiceInputPanel;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        VoiceInputPanel voiceInputPanel = this.f212112d;
        if (voiceInputPanel.f55109y) {
            voiceInputPanel.f55107x = true;
        }
        C117292a.m165362h(true, this, "com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
