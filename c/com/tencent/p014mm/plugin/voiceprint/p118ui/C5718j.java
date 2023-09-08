package com.tencent.p014mm.plugin.voiceprint.p118ui;

import com.tencent.p014mm.C0966R;
import java.util.ArrayList;
import nj3.C11182m0;
import nj3.C76874e0;
import nj3.C76875f0;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.j */
public final class C5718j implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ VoicePrintStateSettingUI f21733d;

    public C5718j(VoicePrintStateSettingUI voicePrintStateSettingUI) {
        this.f21733d = voicePrintStateSettingUI;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107125a(1, C0966R.string.n5l);
        int color = this.f21733d.getResources().getColor(C0966R.color.a_0);
        C76875f0 f0Var = new C76875f0(e0Var.f224706f, 2, 0);
        f0Var.f224723r = C0966R.string.n5j;
        f0Var.f224718j = color;
        ((ArrayList) e0Var.f224704d).add(f0Var);
    }
}
