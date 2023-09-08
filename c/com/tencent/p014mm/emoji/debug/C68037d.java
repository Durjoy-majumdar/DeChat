package com.tencent.p014mm.emoji.debug;

import android.content.Context;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import hp3.C87581a;
import ob0.C89132b;
import p910lj.C76701a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.emoji.debug.d */
public final class C68037d<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ EmojiDebugUI f195266a;

    public C68037d(EmojiDebugUI emojiDebugUI) {
        this.f195266a = emojiDebugUI;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        EmojiInfo TO = C30790w2.m39221h().mo57717d().mo142044TO("9bd1281af3a31710a45b84d736363691");
        EmojiInfo TO2 = C30790w2.m39221h().mo57717d().mo142044TO("08f223fa83f1ca34e143d1e580252c7c");
        TO.field_catalog = 18;
        TO2.field_catalog = 18;
        TO.field_reserved3 = 0;
        TO2.field_reserved3 = 0;
        C30790w2.m39221h().mo57717d().r50(TO);
        C30790w2.m39221h().mo57717d().r50(TO2);
        C76701a.makeText((Context) this.f195266a, (CharSequence) "done", 0).show();
        return C13598b0.f38549a;
    }
}
