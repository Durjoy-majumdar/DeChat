package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.z1 */
public class C72874z1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ VoiceInputPanel f212360d;

    public C72874z1(VoiceInputPanel voiceInputPanel) {
        this.f212360d = voiceInputPanel;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        VoiceInputPanel voiceInputPanel = this.f212360d;
        voiceInputPanel.mo25284n(voiceInputPanel.f55095j.getText().length());
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
