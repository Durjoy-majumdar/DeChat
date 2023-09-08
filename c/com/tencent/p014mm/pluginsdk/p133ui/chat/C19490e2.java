package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.View;
import com.tencent.p014mm.plugin.report.kvdata.VoiceInputBehavior;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.e2 */
public class C19490e2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ VoiceInputPanel f55115d;

    public C19490e2(VoiceInputPanel voiceInputPanel) {
        this.f55115d = voiceInputPanel;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f55115d.mo25282l();
        VoiceInputBehavior voiceInputBehavior = new VoiceInputBehavior();
        voiceInputBehavior.clear = 1;
        this.f55115d.mo25279i(voiceInputBehavior);
        this.f55115d.mo25281k(4);
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
