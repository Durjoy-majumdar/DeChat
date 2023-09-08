package com.tencent.p014mm.plugin.emoji.p040ui;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$n */
public class EmojiCustomUI$$n implements MStorage.IOnStorageChange {

    /* renamed from: d */
    public final /* synthetic */ EmojiCustomUI f268452d;

    public EmojiCustomUI$$n(EmojiCustomUI emojiCustomUI) {
        this.f268452d = emojiCustomUI;
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        if (Util.isNullOrNil(str)) {
            return;
        }
        if (str.length() == 32 || str.equals("event_update_emoji") || str.equals("delete_emoji_info_notify")) {
            this.f268452d.f268421h.mo137253c();
        }
    }
}
