package vd3;

import android.view.View;
import com.tencent.p014mm.plugin.report.kvdata.VoiceInputBehavior;
import com.tencent.p014mm.pluginsdk.p133ui.VoiceInputUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vd3.m0 */
public class C22750m0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ VoiceInputUI f65452d;

    public C22750m0(VoiceInputUI voiceInputUI) {
        this.f65452d = voiceInputUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/VoiceInputUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        VoiceInputBehavior voiceInputBehavior = new VoiceInputBehavior();
        voiceInputBehavior.send = 3;
        VoiceInputUI voiceInputUI = this.f65452d;
        int i = VoiceInputUI.f55045w;
        voiceInputUI.mo25269I7(voiceInputBehavior);
        this.f65452d.mo25268H7(7);
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/VoiceInputUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
