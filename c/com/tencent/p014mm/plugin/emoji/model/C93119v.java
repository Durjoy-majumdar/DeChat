package com.tencent.p014mm.plugin.emoji.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import p1072al.C92042f;

/* renamed from: com.tencent.mm.plugin.emoji.model.v */
public final class C93119v implements C92042f {

    /* renamed from: a */
    public final /* synthetic */ EmojiInfo f268265a;

    public C93119v(EmojiInfo emojiInfo) {
        this.f268265a = emojiInfo;
    }

    /* renamed from: a */
    public void mo55799a(boolean z) {
        Log.m105924i("MicroMsg.FTS.FTSEmojiLogic", "onResult: " + z);
        C93103c.f268230a.mo62471a(z, this.f268265a);
    }
}
