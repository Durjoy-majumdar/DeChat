package p465cl;

import com.tencent.p014mm.storage.emotion.EmojiInfo;
import gy3.C87412m;

/* renamed from: cl.c */
public final class C92425c {

    /* renamed from: a */
    public final EmojiInfo f264468a;

    /* renamed from: b */
    public final String f264469b;

    /* renamed from: c */
    public final boolean f264470c;

    /* renamed from: d */
    public final String f264471d;

    /* renamed from: e */
    public final String f264472e;

    /* renamed from: f */
    public final String f264473f;

    /* renamed from: g */
    public final int f264474g;

    public C92425c(EmojiInfo emojiInfo, String str, boolean z, String str2, String str3, String str4, int i) {
        C87412m.m108594g(emojiInfo, "emojiInfo");
        C87412m.m108594g(str, "verifyMd5");
        C87412m.m108594g(str2, "aesKey");
        C87412m.m108594g(str3, "path");
        C87412m.m108594g(str4, "tempPath");
        this.f264468a = emojiInfo;
        this.f264469b = str;
        this.f264470c = z;
        this.f264471d = str2;
        this.f264472e = str3;
        this.f264473f = str4;
        this.f264474g = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C92425c)) {
            return false;
        }
        C92425c cVar = (C92425c) obj;
        return C87412m.m108589b(this.f264468a, cVar.f264468a) && C87412m.m108589b(this.f264469b, cVar.f264469b) && this.f264470c == cVar.f264470c && C87412m.m108589b(this.f264471d, cVar.f264471d) && C87412m.m108589b(this.f264472e, cVar.f264472e) && C87412m.m108589b(this.f264473f, cVar.f264473f) && this.f264474g == cVar.f264474g;
    }

    public int hashCode() {
        int hashCode = ((this.f264468a.hashCode() * 31) + this.f264469b.hashCode()) * 31;
        boolean z = this.f264470c;
        if (z) {
            z = true;
        }
        return ((((((((hashCode + (z ? 1 : 0)) * 31) + this.f264471d.hashCode()) * 31) + this.f264472e.hashCode()) * 31) + this.f264473f.hashCode()) * 31) + this.f264474g;
    }

    public String toString() {
        return "EmojiVerifyConfig(emojiInfo=" + this.f264468a + ", verifyMd5=" + this.f264469b + ", needDecrypt=" + this.f264470c + ", aesKey=" + this.f264471d + ", path=" + this.f264472e + ", tempPath=" + this.f264473f + ", fetcherType=" + this.f264474g + ')';
    }
}
