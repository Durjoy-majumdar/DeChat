package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.graphics.Bitmap;
import android.os.Message;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Util;
import ic0.C98661k;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.r */
public class C93251r implements C98661k {

    /* renamed from: a */
    public final /* synthetic */ String f268964a;

    /* renamed from: b */
    public final /* synthetic */ String f268965b;

    /* renamed from: c */
    public final /* synthetic */ EmojiStoreV2RewardThanksUI f268966c;

    public C93251r(EmojiStoreV2RewardThanksUI emojiStoreV2RewardThanksUI, String str, String str2) {
        this.f268966c = emojiStoreV2RewardThanksUI;
        this.f268964a = str;
        this.f268965b = str2;
    }

    /* renamed from: a */
    public void mo6935a(String str, View view, Bitmap bitmap, Object... objArr) {
        if (!Util.isNullOrNil(str) && str.equalsIgnoreCase(this.f268964a)) {
            Message message = new Message();
            message.what = 1001;
            message.obj = this.f268965b;
            this.f268966c.f268841o.sendMessage(message);
        }
    }
}
