package n61;

import android.content.Intent;
import c00.C0405n;
import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreV3HomeUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import di3.C86312j;
import ke3.C88144b;

/* renamed from: n61.u */
public final class C11135u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV3HomeUI f32895d;

    public C11135u(EmojiStoreV3HomeUI emojiStoreV3HomeUI) {
        this.f32895d = emojiStoreV3HomeUI;
    }

    public final void run() {
        Class cls = C0405n.class;
        Intent O20 = ((C0405n) C86312j.m106911c(cls)).O20();
        ((C0405n) C86312j.m106911c(cls)).mo281hr(O20, this.f32895d.f110659g == 17 ? 50 : 24, false, 384);
        O20.putExtra("ftsneedkeyboard", true);
        O20.putExtra("key_load_js_without_delay", true);
        O20.putExtra("ftsInitToSearch", true);
        C88144b.m109805w(this.f32895d.getContext(), O20);
        C115669n.INSTANCE.mo160131h(13054, Integer.valueOf(this.f32895d.f110660h == 0 ? 0 : 1), 0, "");
    }
}
