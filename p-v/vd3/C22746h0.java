package vd3;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.VoiceInputFooter;
import com.tencent.p014mm.pluginsdk.p133ui.VoiceInputUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vd3.h0 */
public class C22746h0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ VoiceInputFooter f65448d;

    public C22746h0(VoiceInputFooter voiceInputFooter) {
        this.f65448d = voiceInputFooter;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/VoiceInputFooter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        VoiceInputFooter voiceInputFooter = this.f65448d;
        voiceInputFooter.f55010q.requestFocus();
        if (voiceInputFooter.f55014u) {
            voiceInputFooter.mo25233i();
            voiceInputFooter.f55007n.showVKB();
        } else {
            boolean z = true;
            voiceInputFooter.f55014u = true;
            voiceInputFooter.f55007n.hideVKB();
            if (voiceInputFooter.f55008o.getVisibility() != 0) {
                z = false;
            }
            if (z) {
                voiceInputFooter.mo25231e();
            }
            voiceInputFooter.postDelayed(new e0$$b(voiceInputFooter), 100);
            voiceInputFooter.f55012s.setImageResource(C0966R.C0969drawable.f4803nc);
            voiceInputFooter.f55011r.setImageResource(C0966R.C0969drawable.f4802nb);
            voiceInputFooter.f55011r.setVisibility(8);
            VoiceInputFooter.C19468a aVar = voiceInputFooter.f55016w;
            if (aVar != null) {
                VoiceInputUI.this.f55047e.setVisibility(4);
            }
        }
        voiceInputFooter.mo25234j(2);
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/VoiceInputFooter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
