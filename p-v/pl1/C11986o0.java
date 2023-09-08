package pl1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import er1.C58741j5;
import gy3.C87412m;
import p213oh.C11412b;
import te3.C64689rq2;
import up1.C27696y;

/* renamed from: pl1.o0 */
public class C11986o0 extends C11976a {

    /* renamed from: e */
    public C64689rq2 f34979e;

    /* renamed from: f */
    public C27696y f34980f;

    public C11986o0(C64689rq2 rq22, C27696y yVar, String str) {
        C87412m.m108594g(rq22, "mediaObj");
        C87412m.m108594g(yVar, "type");
        C87412m.m108594g(str, "username");
        C87412m.m108593f(C75592q0.m90789s(), "getUsernameFromUserInfo()");
        this.f34979e = rq22;
        this.f34980f = yVar;
        if (rq22.f185266d == null) {
            int i = C11412b.f33577a;
            Log.m105921e("FinderVideoCover", "mediaObj.url == null " + Util.getStack(), (Object[]) null);
        }
    }

    /* renamed from: b */
    public String mo11841b() {
        return "finder_video_cover_" + this.f34980f.f76715d + '_' + MD5Util.getMD5String(Util.nullAs(this.f34979e.f185283w, ""));
    }

    public String getDecodeKey() {
        String str = this.f34979e.f185284x;
        return str == null ? "" : str;
    }

    public C27696y getMediaType() {
        return this.f34980f;
    }

    public String getPath() {
        C58741j5 j5Var = C58741j5.f168184a;
        return C58741j5.f168188e + mo11841b();
    }

    public String getThumbUrl() {
        String str = this.f34979e.f185283w;
        return str == null ? "" : str;
    }

    public String getThumbUrlToken() {
        String str = this.f34979e.f185234A;
        return str == null ? "" : str;
    }

    public String getUrl() {
        String str = this.f34979e.f185283w;
        return str == null ? "" : str;
    }

    public String getUrlToken() {
        String str = this.f34979e.f185234A;
        return str == null ? "" : str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C11986o0(te3.C64689rq2 r1, up1.C27696y r2, java.lang.String r3, int r4, gy3.C8480h r5) {
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
        throw new UnsupportedOperationException("Method not decompiled: pl1.C11986o0.<init>(te3.rq2, up1.y, java.lang.String, int, gy3.h):void");
    }
}
