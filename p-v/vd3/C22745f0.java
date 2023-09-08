package vd3;

import android.view.View;
import com.tencent.p014mm.pluginsdk.p133ui.VoiceInputFooter;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vd3.f0 */
public class C22745f0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ VoiceInputFooter f65447d;

    public C22745f0(VoiceInputFooter voiceInputFooter) {
        this.f65447d = voiceInputFooter;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/VoiceInputFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z = false;
        if (this.f65447d.getVisibility() == 8) {
            this.f65447d.setVisibility(0);
        }
        if (this.f65447d.f55009p.getVisibility() == 0) {
            this.f65447d.mo25233i();
        }
        if (this.f65447d.f55008o.getVisibility() == 0) {
            z = true;
        }
        if (z) {
            this.f65447d.mo25231e();
        }
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/VoiceInputFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
