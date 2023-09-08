package pl1;

import android.graphics.Matrix;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C8480h;
import gy3.C87412m;
import te3.C64689rq2;
import up1.C27696y;

/* renamed from: pl1.x */
public final class C62372x extends C62344b0 {

    /* renamed from: h */
    public final String f177263h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C62372x(te3.C64689rq2 r1, up1.C27696y r2, java.lang.String r3, int r4, gy3.C8480h r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L_0x000d
            java.lang.String r3 = eb0.C75592q0.m90789s()
            java.lang.String r4 = "getUsernameFromUserInfo()"
            gy3.C87412m.m108593f(r3, r4)
        L_0x000d:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pl1.C62372x.<init>(te3.rq2, up1.y, java.lang.String, int, gy3.h):void");
    }

    /* renamed from: b */
    public String mo11841b() {
        return this.f177263h;
    }

    /* renamed from: c */
    public Matrix mo87410c(float f, float f2) {
        return null;
    }

    public String getThumbUrl() {
        String str = this.f177196e.f185239F;
        if (str == null || str.length() == 0) {
            return super.getThumbUrl();
        }
        String str2 = this.f177196e.f185239F;
        C87412m.m108591d(str2);
        return str2;
    }

    public String getThumbUrlToken() {
        String str = this.f177196e.f185240G;
        if (str == null || str.length() == 0) {
            return super.getThumbUrlToken();
        }
        String str2 = this.f177196e.f185240G;
        C87412m.m108591d(str2);
        return str2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62372x(C64689rq2 rq22, C27696y yVar, String str) {
        super(rq22, yVar, str, (String) null, 8, (C8480h) null);
        C87412m.m108594g(rq22, "mediaObj");
        C87412m.m108594g(yVar, "type");
        C87412m.m108594g(str, "username");
        this.f177263h = "finder_image_" + yVar.f76715d + '_' + MD5Util.getMD5String(Util.nullAs(getThumbUrl(), ""));
    }
}
