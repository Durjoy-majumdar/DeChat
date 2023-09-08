package com.tencent.p014mm.plugin.emoji.p040ui;

import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C30777t2;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import tc0.C77885p;
import te3.C64266br1;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiMineUI$$b */
public final /* synthetic */ class EmojiMineUI$$b implements MMSwitchBtn.C7041b {

    /* renamed from: a */
    public final /* synthetic */ C30777t2 f12239a;

    public /* synthetic */ EmojiMineUI$$b(C30777t2 t2Var) {
        this.f12239a = t2Var;
    }

    public final void onStatusChange(boolean z) {
        this.f12239a.getClass();
        Log.m105924i("MicroMsg.EmojiPrivacy", "setEmojiRecommendFromUnsavedEnabled: enabled=" + z);
        long k = C75592q0.m90781k();
        C75592q0.m90769Q(Long.valueOf(z ? k | 2097152 : k & -2097153));
        C64266br1 br12 = new C64266br1();
        br12.f182324d = 86;
        br12.f182325e = z ? 1 : 2;
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(23, br12));
    }
}
