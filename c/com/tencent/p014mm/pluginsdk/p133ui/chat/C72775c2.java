package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.c2 */
public class C72775c2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ VoiceInputPanel f212136d;

    public C72775c2(VoiceInputPanel voiceInputPanel) {
        this.f212136d = voiceInputPanel;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f212136d.mo25275e();
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
