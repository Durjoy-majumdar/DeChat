package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.emoji.model.C41051m;
import com.tencent.p014mm.plugin.emoji.p040ui.p041v2.EmojiStoreV2TabView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.z */
public class C41074z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV2TabView.C410682 f110654d;

    public C41074z(EmojiStoreV2TabView.C410682 r1) {
        this.f110654d = r1;
    }

    public void run() {
        try {
            if (EmojiStoreV2TabView.this.f110622j == null) {
                return;
            }
            if (!Util.isNullOrNil(C41051m.m44498a().f110537e)) {
                EmojiStoreV2TabView.this.f110622j.setText(C41051m.m44498a().f110537e);
            } else if (C41051m.m44498a().f110536d) {
                EmojiStoreV2TabView.this.f110622j.setText((int) C0966R.string.c8t);
            } else {
                EmojiStoreV2TabView.this.f110622j.setText((int) C0966R.string.c8s);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.emoji.EmojiStoreV2TabView", e, "event update error", new Object[0]);
        }
    }
}
