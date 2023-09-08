package pl1;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import er1.C58741j5;
import gy3.C8480h;
import gy3.C87412m;
import p213oh.C11412b;
import te3.C64450iq0;
import te3.C64689rq2;
import up1.C27696y;
import x60.C66236d;

/* renamed from: pl1.b0 */
public class C62344b0 extends C11976a implements C66236d {

    /* renamed from: e */
    public C64689rq2 f177196e;

    /* renamed from: f */
    public C27696y f177197f;

    /* renamed from: g */
    public String f177198g;

    public C62344b0(C64689rq2 rq22, C27696y yVar, String str, String str2, int i, C8480h hVar) {
        if ((i & 4) != 0) {
            str = C75592q0.m90789s();
            C87412m.m108593f(str, "getUsernameFromUserInfo()");
        }
        str2 = (i & 8) != 0 ? "" : str2;
        C87412m.m108594g(rq22, "mediaObj");
        C87412m.m108594g(yVar, "type");
        C87412m.m108594g(str, "username");
        C87412m.m108594g(str2, "localThumbUrl");
        C87412m.m108593f(C75592q0.m90789s(), "getUsernameFromUserInfo()");
        this.f177196e = rq22;
        this.f177197f = yVar;
        this.f177198g = str2;
        if (rq22.f185266d == null) {
            int i2 = C11412b.f33577a;
            Log.m105921e("FinderImage", "mediaObj.url == null " + Util.getStack(), (Object[]) null);
        }
    }

    /* renamed from: b */
    public String mo11841b() {
        String str;
        if (this.f177197f != C27696y.THUMB_IMAGE ? (str = this.f177196e.f185287y0) == null : (str = this.f177196e.f185285x0) == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("finder_image_");
        sb.append(this.f177197f.f76715d);
        sb.append('_');
        sb.append(Util.isNullOrNil(this.f177196e.f185275p) ? MD5Util.getMD5String(Util.nullAs(this.f177196e.f185266d, "")) : this.f177196e.f185275p);
        sb.append('_');
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: c */
    public Matrix mo87410c(float f, float f2) {
        C64450iq0 iq02;
        if (this.f177197f == C27696y.THUMB_IMAGE || (iq02 = this.f177196e.f185248P) == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        Rect rect = new Rect((int) iq02.f183717d, (int) iq02.f183718e, (int) iq02.f183719f, (int) iq02.f183720g);
        float max = Math.max(f / ((float) rect.width()), f2 / ((float) rect.height()));
        C64689rq2 rq22 = this.f177196e;
        float f3 = rq22.f185270h;
        float f4 = rq22.f185271i;
        matrix.postScale(max, max);
        matrix.postTranslate(((float) (-rect.left)) * max, ((float) (-rect.top)) * max);
        return matrix;
    }

    public String getDecodeKey() {
        String str = this.f177196e.f185284x;
        return str == null ? "" : str;
    }

    public C27696y getMediaType() {
        return this.f177197f;
    }

    public String getPath() {
        if (!(this.f177198g.length() == 0)) {
            return this.f177198g;
        }
        C58741j5 j5Var = C58741j5.f168184a;
        return C58741j5.f168188e + mo11841b();
    }

    public String getThumbUrl() {
        String str;
        if (this.f177198g.length() == 0) {
            str = this.f177196e.f185267e;
            if (str == null) {
                str = "";
            }
        } else {
            str = this.f177198g;
        }
        C87412m.m108593f(str, "if (localThumbUrl.isEmpt… ?: \"\" else localThumbUrl");
        return str;
    }

    public String getThumbUrlToken() {
        String str;
        return (!(this.f177198g.length() == 0) || (str = this.f177196e.f185288z) == null) ? "" : str;
    }

    public String getUrl() {
        String str = this.f177196e.f185266d;
        return str == null ? "" : str;
    }

    public String getUrlToken() {
        String str = this.f177196e.f185286y;
        return str == null ? "" : str;
    }
}
