package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.voiceprint.p118ui.C115843s;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.d */
public class C115839d implements C115843s.C115847c {

    /* renamed from: a */
    public final /* synthetic */ VoiceCreateUI f347565a;

    public C115839d(VoiceCreateUI voiceCreateUI) {
        this.f347565a = voiceCreateUI;
    }

    /* renamed from: a */
    public void mo176340a() {
    }

    /* renamed from: b */
    public void mo176341b() {
        this.f347565a.f347490h.setTitleText((int) C0966R.string.n67);
        this.f347565a.f347490h.f347555f.setVisibility(0);
        this.f347565a.f347490h.mo176350b();
        this.f347565a.mo176322H7();
        this.f347565a.f347487e.setEnabled(true);
        View view = this.f347565a.f347487e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI$5", "onNewViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI$5", "onNewViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f347565a.mo176327M7();
    }
}
