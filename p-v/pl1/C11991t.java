package pl1;

import com.tencent.p014mm.sdk.platformtools.MD5Util;
import er1.C58741j5;
import gy3.C87412m;
import up1.C27696y;

/* renamed from: pl1.t */
public final class C11991t extends C11976a {

    /* renamed from: e */
    public final String f34982e;

    /* renamed from: f */
    public final String f34983f;

    public C11991t(String str) {
        C87412m.m108594g(str, "url");
        this.f34982e = str;
        this.f34983f = "finder_cover_" + MD5Util.getMD5String(str);
    }

    /* renamed from: b */
    public String mo11841b() {
        return this.f34983f;
    }

    public String getDecodeKey() {
        return "";
    }

    public C27696y getMediaType() {
        return C27696y.RAW_IMAGE;
    }

    public String getPath() {
        C58741j5 j5Var = C58741j5.f168184a;
        return C58741j5.f168191h + this.f34983f;
    }

    public String getThumbUrl() {
        return this.f34982e;
    }

    public String getThumbUrlToken() {
        return "";
    }

    public String getUrl() {
        return this.f34982e;
    }

    public String getUrlToken() {
        return "";
    }
}
