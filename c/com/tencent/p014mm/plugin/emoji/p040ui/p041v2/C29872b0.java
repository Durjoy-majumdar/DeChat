package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.os.MessageQueue;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import s00.C90110f;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.b0 */
public class C29872b0 implements MessageQueue.IdleHandler {
    public C29872b0(EmojiStoreV2UI emojiStoreV2UI) {
    }

    public boolean queueIdle() {
        Log.m105924i("MicroMsg.emoji.EmojiStoreV2UI", "now try to activity the tools process");
        ((C90110f) C86312j.m106911c(C90110f.class)).mo124152cj();
        return false;
    }
}
