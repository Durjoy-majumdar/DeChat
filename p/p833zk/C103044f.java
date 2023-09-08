package p833zk;

import com.tencent.p014mm.storage.emotion.EmojiInfo;
import gy3.C87412m;

/* renamed from: zk.f */
public final class C103044f {

    /* renamed from: a */
    public final EmojiInfo f304025a;

    /* renamed from: b */
    public final String f304026b;

    /* renamed from: c */
    public final String f304027c;

    /* renamed from: d */
    public final String f304028d;

    /* renamed from: e */
    public final int f304029e;

    public C103044f(EmojiInfo emojiInfo, String str, String str2, String str3, int i) {
        C87412m.m108594g(emojiInfo, "emojiInfo");
        C87412m.m108594g(str, "url");
        C87412m.m108594g(str2, "path");
        C87412m.m108594g(str3, "authKey");
        this.f304025a = emojiInfo;
        this.f304026b = str;
        this.f304027c = str2;
        this.f304028d = str3;
        this.f304029e = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C103044f)) {
            return false;
        }
        C103044f fVar = (C103044f) obj;
        return C87412m.m108589b(this.f304025a, fVar.f304025a) && C87412m.m108589b(this.f304026b, fVar.f304026b) && C87412m.m108589b(this.f304027c, fVar.f304027c) && C87412m.m108589b(this.f304028d, fVar.f304028d) && this.f304029e == fVar.f304029e;
    }

    public int hashCode() {
        return (((((((this.f304025a.hashCode() * 31) + this.f304026b.hashCode()) * 31) + this.f304027c.hashCode()) * 31) + this.f304028d.hashCode()) * 31) + this.f304029e;
    }

    public String toString() {
        return "EmojiFetcherConfig(emojiInfo=" + this.f304025a + ", url=" + this.f304026b + ", path=" + this.f304027c + ", authKey=" + this.f304028d + ", fetcherType=" + this.f304029e + ')';
    }
}
