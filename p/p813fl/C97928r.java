package p813fl;

import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import gy3.C87412m;

/* renamed from: fl.r */
public final class C97928r extends C97923p {

    /* renamed from: b */
    public final EmojiGroupInfo f287256b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97928r(int i, EmojiGroupInfo emojiGroupInfo) {
        super(i);
        C87412m.m108594g(emojiGroupInfo, "info");
        this.f287256b = emojiGroupInfo;
    }

    /* renamed from: c */
    public String mo137249c() {
        String str = this.f287256b.field_productID;
        return str == null ? "" : str;
    }

    /* renamed from: d */
    public String mo137250d() {
        String str = this.f287256b.field_packGrayIconUrl;
        return str == null ? "" : str;
    }

    /* renamed from: e */
    public String mo137251e() {
        String str = this.f287256b.field_packName;
        return str == null ? "" : str;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
