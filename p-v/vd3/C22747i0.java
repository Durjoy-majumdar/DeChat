package vd3;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.VoiceInputFooter;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vd3.i0 */
public class C22747i0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ VoiceInputFooter f65449d;

    public C22747i0(VoiceInputFooter voiceInputFooter) {
        this.f65449d = voiceInputFooter;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/VoiceInputFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        VoiceInputFooter voiceInputFooter = this.f65449d;
        int i = VoiceInputFooter.f55006x;
        if (voiceInputFooter.f55009p.getVisibility() == 0) {
            voiceInputFooter.mo25233i();
        }
        if (!voiceInputFooter.f55015v) {
            voiceInputFooter.f55007n.hideVKB();
            voiceInputFooter.postDelayed(new e0$$a(voiceInputFooter), 100);
            voiceInputFooter.f55010q.requestFocus();
            voiceInputFooter.f55011r.setImageResource(C0966R.C0969drawable.f4803nc);
            voiceInputFooter.f55012s.setImageResource(C0966R.C0969drawable.b0c);
        } else {
            voiceInputFooter.f55010q.requestFocus();
            voiceInputFooter.mo25231e();
            voiceInputFooter.f55007n.showVKB();
            voiceInputFooter.f55011r.setImageResource(C0966R.C0969drawable.f4802nb);
        }
        voiceInputFooter.mo25234j(1);
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/VoiceInputFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
