package p813fl;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import rx3.C13598b0;

/* renamed from: fl.r0 */
public final class C97929r0 {
    /* renamed from: a */
    public static final C97923p m126479a() {
        EmojiGroupInfo emojiGroupInfo = new EmojiGroupInfo();
        emojiGroupInfo.field_productID = "capture";
        emojiGroupInfo.field_packName = MMApplicationContext.getContext().getString(C0966R.string.c6w);
        C13598b0 b0Var = C13598b0.f38549a;
        return new C97928r(1, emojiGroupInfo);
    }

    /* renamed from: b */
    public static final C97923p m126480b() {
        EmojiGroupInfo emojiGroupInfo = new EmojiGroupInfo();
        emojiGroupInfo.field_productID = "custom";
        emojiGroupInfo.field_packName = MMApplicationContext.getContext().getString(C0966R.string.c6x);
        C13598b0 b0Var = C13598b0.f38549a;
        return new C97928r(1, emojiGroupInfo);
    }

    /* renamed from: c */
    public static final C97923p m126481c() {
        EmojiGroupInfo emojiGroupInfo = new EmojiGroupInfo();
        emojiGroupInfo.field_productID = "smiley";
        emojiGroupInfo.field_packName = MMApplicationContext.getContext().getString(C0966R.string.c75);
        C13598b0 b0Var = C13598b0.f38549a;
        return new C97928r(1, emojiGroupInfo);
    }
}
