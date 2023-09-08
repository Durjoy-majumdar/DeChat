package t61;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import gy3.C87412m;

/* renamed from: t61.f */
public final class C101730f extends C101735i {

    /* renamed from: a */
    public final EmojiGroupInfo f297806a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101730f(EmojiGroupInfo emojiGroupInfo) {
        super(0);
        C87412m.m108594g(emojiGroupInfo, "groupInfo");
        this.f297806a = emojiGroupInfo;
    }

    /* renamed from: a */
    public String mo141164a() {
        if (!Util.isNullOrNil(this.f297806a.field_packIconUrl)) {
            String str = this.f297806a.field_packIconUrl;
            C87412m.m108593f(str, "groupInfo.packIconUrl");
            return str;
        }
        String str2 = this.f297806a.field_packGrayIconUrl;
        return str2 == null ? "" : str2;
    }

    /* renamed from: b */
    public String mo141165b() {
        String str = this.f297806a.field_productID;
        return str == null ? "" : str;
    }

    /* renamed from: c */
    public String mo141166c() {
        String str = this.f297806a.field_packName;
        return str == null ? "" : str;
    }
}
