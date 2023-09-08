package gr1;

import com.tencent.p014mm.plugin.finder.storage.FeedData;
import gy3.C87412m;
import pl1.C62369u0;
import te3.C64689rq2;

/* renamed from: gr1.q2 */
public class C59673q2 {

    /* renamed from: a */
    public final String f170491a;

    /* renamed from: b */
    public final String f170492b;

    /* renamed from: c */
    public final String f170493c;

    /* renamed from: d */
    public final C64689rq2 f170494d;

    /* renamed from: e */
    public final C62369u0 f170495e;

    /* renamed from: f */
    public final FeedData f170496f;

    public C59673q2(String str, String str2, String str3, C64689rq2 rq22, C62369u0 u0Var, FeedData feedData) {
        C87412m.m108594g(str2, "path");
        C87412m.m108594g(str3, "mediaId");
        C87412m.m108594g(u0Var, "video");
        C87412m.m108594g(feedData, "feedData");
        this.f170491a = str;
        this.f170492b = str2;
        this.f170493c = str3;
        this.f170494d = rq22;
        this.f170495e = u0Var;
        this.f170496f = feedData;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" downloadUrl='");
        sb.append(this.f170491a);
        sb.append("', path='");
        sb.append(this.f170492b);
        sb.append("', mediaId='");
        sb.append(this.f170493c);
        sb.append("' localFinderMedia is null? ");
        sb.append(this.f170494d == null);
        sb.append(' ');
        return sb.toString();
    }
}
