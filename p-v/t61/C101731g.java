package t61;

import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import com.tencent.p014mm.storage.emotion.EmojiIPSetInfo;
import gy3.C87412m;
import java.util.LinkedList;

/* renamed from: t61.g */
public final class C101731g extends C101735i {

    /* renamed from: a */
    public final EmojiIPSetInfo f297807a;

    /* renamed from: b */
    public final LinkedList<EmojiGroupInfo> f297808b = new LinkedList<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101731g(EmojiIPSetInfo emojiIPSetInfo) {
        super(1);
        C87412m.m108594g(emojiIPSetInfo, "info");
        this.f297807a = emojiIPSetInfo;
    }

    /* renamed from: a */
    public String mo141164a() {
        String str = this.f297807a.field_panelUrl;
        return str == null ? "" : str;
    }

    /* renamed from: b */
    public String mo141165b() {
        String str = this.f297807a.field_key;
        return str == null ? "" : str;
    }

    /* renamed from: c */
    public String mo141166c() {
        StringBuilder sb = new StringBuilder();
        String str = this.f297807a.field_title;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append('(');
        sb.append(this.f297808b.size());
        sb.append(')');
        return sb.toString();
    }
}
