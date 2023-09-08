package pl1;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import er1.C58741j5;
import gr1.C59686x0;
import gy3.C8480h;
import gy3.C87412m;
import p682rz.C36594q;
import te3.C64689rq2;
import up1.C27696y;
import zc1.C66785b;

/* renamed from: pl1.r0 */
public final class C62367r0 extends C62369u0 {

    /* renamed from: e */
    public final C64689rq2 f177253e;

    /* renamed from: f */
    public final C27696y f177254f;

    /* renamed from: g */
    public final String f177255g;

    /* renamed from: h */
    public final int f177256h;

    /* renamed from: i */
    public final int f177257i;

    /* renamed from: j */
    public String f177258j;

    public C62367r0(C64689rq2 rq22, C27696y yVar, String str, int i, int i2, String str2, int i3, C8480h hVar) {
        i = (i3 & 8) != 0 ? C59686x0.f170506a ? 3 : ((C36594q) C86312j.m106911c(C36594q.class)).mo60733UY(4) ? 2 : 1 : i;
        i2 = (i3 & 16) != 0 ? 0 : i2;
        str2 = (i3 & 32) != 0 ? C66785b.f191882e.mo90662O5() : str2;
        C87412m.m108594g(rq22, "mediaObj");
        C87412m.m108594g(yVar, "type");
        C87412m.m108594g(str2, "username");
        this.f177253e = rq22;
        this.f177254f = yVar;
        this.f177255g = str;
        this.f177256h = i;
        this.f177257i = i2;
    }

    /* renamed from: b */
    public String mo11841b() {
        String str = this.f177258j;
        if (str != null) {
            return str;
        }
        C58741j5 j5Var = C58741j5.f168184a;
        String g = mo87422g();
        C64689rq2 rq22 = this.f177253e;
        String j = j5Var.mo83736j(g, rq22.f185275p, rq22.f185266d);
        this.f177258j = j;
        return j;
    }

    /* renamed from: d */
    public int mo87419d() {
        return this.f177256h;
    }

    /* renamed from: e */
    public int mo87420e() {
        return this.f177257i;
    }

    /* renamed from: f */
    public C64689rq2 mo87421f() {
        return this.f177253e;
    }

    /* renamed from: g */
    public String mo87422g() {
        if (TextUtils.isEmpty(this.f177255g)) {
            Log.m105920e("FinderVideoLoadData", "invalid specFormat:" + this.f177255g);
            return "xV99";
        }
        String str = this.f177255g;
        C87412m.m108591d(str);
        return str;
    }

    public String getDecodeKey() {
        String str = this.f177253e.f185284x;
        return str == null ? "" : str;
    }

    public C27696y getMediaType() {
        return this.f177254f;
    }

    public String getPath() {
        C58741j5 j5Var = C58741j5.f168184a;
        return C58741j5.f168189f + mo11841b();
    }

    public String getThumbUrl() {
        String str = this.f177253e.f185267e;
        return str == null ? "" : str;
    }

    public String getThumbUrlToken() {
        String str = this.f177253e.f185288z;
        return str == null ? "" : str;
    }

    public String getUrl() {
        String str = this.f177253e.f185266d;
        return str == null ? "" : str;
    }

    public String getUrlToken() {
        String str = this.f177253e.f185286y;
        return str == null ? "" : str;
    }

    public String toString() {
        return this.f177253e.f185275p + " url=" + this.f177253e.f185266d;
    }
}
