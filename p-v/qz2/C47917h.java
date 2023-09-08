package qz2;

import gy3.C87412m;
import jq3.C9493c;

/* renamed from: qz2.h */
public final class C47917h implements C9493c {

    /* renamed from: d */
    public final String f128575d;

    /* renamed from: e */
    public final String f128576e;

    /* renamed from: f */
    public final String f128577f;

    public C47917h(String str, String str2, String str3, String str4, String str5) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(str2, "desc");
        C87412m.m108594g(str3, "topicId");
        C87412m.m108594g(str4, "statusId");
        C87412m.m108594g(str5, "headImgUrl");
        this.f128575d = str;
        this.f128576e = str3;
        this.f128577f = str4;
    }

    /* renamed from: c */
    public int mo75c() {
        return 0;
    }

    public long getItemId() {
        return (long) hashCode();
    }
}
