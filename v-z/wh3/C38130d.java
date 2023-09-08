package wh3;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.storage.emotion.EmojiIPSetInfo;
import gy3.C87412m;
import o90.C100308d;

/* renamed from: wh3.d */
public final class C38130d extends MAutoStorage<EmojiIPSetInfo> {

    /* renamed from: f */
    public static final String[] f100765f = {MAutoStorage.getCreateSQLs(EmojiIPSetInfo.f82659w, "EmojiIPSetInfo")};

    /* renamed from: d */
    public final ISQLiteDatabase f100766d;

    /* renamed from: e */
    public final C100308d<String, EmojiIPSetInfo> f100767e = new C100308d<>(100);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38130d(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, EmojiIPSetInfo.f82659w, "EmojiIPSetInfo", (String[]) null);
        C87412m.m108594g(iSQLiteDatabase, "db");
        EmojiIPSetInfo.C30735b bVar = EmojiIPSetInfo.f82658v;
        this.f100766d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public final void mo61529Lo(EmojiIPSetInfo emojiIPSetInfo) {
        C87412m.m108594g(emojiIPSetInfo, "info");
        this.f100767e.put(emojiIPSetInfo.field_key, emojiIPSetInfo);
        super.replace(emojiIPSetInfo);
    }

    /* renamed from: jo */
    public final EmojiIPSetInfo mo61530jo(String str) {
        EmojiIPSetInfo emojiIPSetInfo = null;
        if (str == null) {
            return null;
        }
        EmojiIPSetInfo emojiIPSetInfo2 = this.f100767e.get(str);
        if (emojiIPSetInfo2 != null) {
            return emojiIPSetInfo2;
        }
        EmojiIPSetInfo emojiIPSetInfo3 = new EmojiIPSetInfo();
        emojiIPSetInfo3.field_key = str;
        boolean z = true;
        super.get(emojiIPSetInfo3, getPrimaryKey());
        String str2 = emojiIPSetInfo3.field_title;
        if (!(str2 == null || str2.length() == 0)) {
            z = false;
        }
        if (!z) {
            emojiIPSetInfo = emojiIPSetInfo3;
        }
        if (emojiIPSetInfo != null) {
            this.f100767e.put(emojiIPSetInfo.field_key, emojiIPSetInfo);
        }
        return emojiIPSetInfo;
    }
}
