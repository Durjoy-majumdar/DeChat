package pl1;

import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C8480h;
import gy3.C87412m;
import te3.C64689rq2;
import up1.C27696y;

/* renamed from: pl1.k0 */
public final class C62351k0 extends C62344b0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62351k0(C64689rq2 rq22, C27696y yVar) {
        super(rq22, yVar, (String) null, (String) null, 12, (C8480h) null);
        C87412m.m108594g(rq22, "mediaObj");
        C87412m.m108594g(yVar, "type");
    }

    /* renamed from: b */
    public String mo11841b() {
        StringBuilder sb = new StringBuilder();
        sb.append("finder_image_");
        sb.append(this.f177197f.f76715d);
        sb.append('_');
        sb.append(Util.isNullOrNil(this.f177196e.f185275p) ? MD5Util.getMD5String(Util.nullAs(this.f177196e.f185266d, "")) : this.f177196e.f185275p);
        return sb.toString();
    }
}
