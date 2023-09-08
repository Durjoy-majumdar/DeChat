package rr3;

import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: rr3.g */
public final class C110630g {

    /* renamed from: a */
    public String f330974a;

    /* renamed from: b */
    public float f330975b;

    /* renamed from: c */
    public String f330976c;

    /* renamed from: d */
    public boolean f330977d;

    /* renamed from: e */
    public boolean f330978e;

    public C110630g(String str, float f, String str2, boolean z, boolean z2, int i, C8480h hVar) {
        str = (i & 1) != 0 ? "" : str;
        f = (i & 2) != 0 ? 0.0f : f;
        str2 = (i & 4) != 0 ? "" : str2;
        z = (i & 8) != 0 ? false : z;
        z2 = (i & 16) != 0 ? false : z2;
        C87412m.m108595h(str, MimeTypes.BASE_TYPE_TEXT);
        C87412m.m108595h(str2, "fontFamily");
        this.f330974a = str;
        this.f330975b = f;
        this.f330976c = str2;
        this.f330977d = z;
        this.f330978e = z2;
    }
}
