package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.content.Intent;
import c00.C0405n;
import c00.C0406o;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.a0 */
public class C2219a0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV2UI f12271d;

    public C2219a0(EmojiStoreV2UI emojiStoreV2UI) {
        this.f12271d = emojiStoreV2UI;
    }

    public void run() {
        Class cls = C0405n.class;
        boolean yv02 = ((C0406o) C86312j.m106911c(C0406o.class)).yv0(this.f12271d.f110638o, 384);
        Intent O20 = ((C0405n) C86312j.m106911c(cls)).O20();
        ((C0405n) C86312j.m106911c(cls)).mo281hr(O20, this.f12271d.f110638o, false, 384);
        O20.putExtra("ftsneedkeyboard", !yv02);
        Log.m105925i("MicroMsg.emoji.EmojiStoreV2UI", "reportEntranceScene = %s", Integer.valueOf(this.f12271d.f110638o));
        O20.putExtra("key_load_js_without_delay", true);
        O20.putExtra("ftsInitToSearch", true);
        O20.putExtra("ftsNeedShowCamera", false);
        C88144b.m109805w(this.f12271d.getContext(), O20);
        C115669n.INSTANCE.mo160131h(13054, Integer.valueOf(this.f12271d.f110634h == 0 ? 0 : 1), 0, "");
    }
}
