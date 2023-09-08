package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.voiceprint.p118ui.C115843s;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI$$b */
public class VoiceCreateUI$$b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ VoiceCreateUI f347527d;

    /* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI$$b$a */
    public class C115831a implements C115843s.C115847c {
        public C115831a() {
        }

        /* renamed from: a */
        public void mo176340a() {
        }

        /* renamed from: b */
        public void mo176341b() {
            VoiceCreateUI$$b.this.f347527d.f347517A.setVisibility(8);
            VoiceCreateUI$$b.this.f347527d.f347490h.setTitleText((int) C0966R.string.kdj);
            VoiceCreateUI$$b.this.f347527d.f347490h.f347555f.setVisibility(0);
            VoiceCreateUI$$b.this.f347527d.f347487e.setEnabled(true);
            View view = VoiceCreateUI$$b.this.f347527d.f347487e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI$2$1", "onNewViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI$2$1", "onNewViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public VoiceCreateUI$$b(VoiceCreateUI voiceCreateUI) {
        this.f347527d = voiceCreateUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f347527d.mo176323I7();
        VoiceCreateUI voiceCreateUI = this.f347527d;
        C115843s.m162942b(voiceCreateUI.f347490h, voiceCreateUI, new C115831a());
        C117292a.m165361g(this, "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
