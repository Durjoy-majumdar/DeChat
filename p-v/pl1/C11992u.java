package pl1;

import com.tencent.p014mm.sdk.platformtools.MD5Util;
import er1.C58741j5;
import gy3.C87412m;
import up1.C27696y;

/* renamed from: pl1.u */
public final class C11992u extends C11976a {

    /* renamed from: e */
    public final String f34984e;

    /* renamed from: f */
    public final String f34985f;

    /* renamed from: g */
    public final C27696y f34986g;

    /* renamed from: h */
    public final String f34987h;

    public C11992u(String str, String str2, String str3, C27696y yVar) {
        C87412m.m108594g(yVar, "mediaType");
        this.f34984e = str;
        this.f34985f = str3;
        this.f34986g = yVar;
        this.f34987h = MD5Util.getMD5String(str2 == null ? "" : str2);
    }

    /* renamed from: b */
    public String mo11841b() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f34986g.f76715d);
        sb.append("_finder_");
        String str2 = this.f34985f;
        if (str2 == null || str2.length() == 0) {
            str = "";
        } else {
            str = '_' + this.f34985f + '_';
        }
        sb.append(str);
        sb.append(this.f34987h);
        return sb.toString();
    }

    public String getDecodeKey() {
        return "";
    }

    public C27696y getMediaType() {
        return this.f34986g;
    }

    public String getPath() {
        C58741j5 j5Var = C58741j5.f168184a;
        return C58741j5.f168188e + mo11841b();
    }

    public String getThumbUrl() {
        String str = this.f34984e;
        return str == null ? "" : str;
    }

    public String getThumbUrlToken() {
        return "";
    }

    public String getUrl() {
        String str = this.f34984e;
        return str == null ? "" : str;
    }

    public String getUrlToken() {
        return "";
    }
}
