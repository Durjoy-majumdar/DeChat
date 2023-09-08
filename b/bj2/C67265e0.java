package bj2;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import zb2.C66777a;

/* renamed from: bj2.e0 */
public final class C67265e0 extends C66777a<C67265e0> {

    /* renamed from: d */
    public final String f193099d;

    /* renamed from: e */
    public final int f193100e;

    /* renamed from: f */
    public final int f193101f;

    /* renamed from: g */
    public final String f193102g;

    public C67265e0(String str, int i, int i2, String str2) {
        C87412m.m108594g(str, "id");
        C87412m.m108594g(str2, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        this.f193099d = str;
        this.f193100e = i;
        this.f193101f = i2;
        this.f193102g = str2;
    }

    /* renamed from: Oa */
    public String mo344Oa() {
        return this.f193099d;
    }

    public Object clone() {
        return super.clone();
    }

    public int compareTo(Object obj) {
        C67265e0 e0Var = (C67265e0) obj;
        C87412m.m108594g(e0Var, "other");
        return C87412m.m108596i(this.f193100e, e0Var.f193100e);
    }

    /* renamed from: g5 */
    public boolean mo347g5(Object obj) {
        C67265e0 e0Var = (C67265e0) obj;
        C87412m.m108594g(e0Var, "other");
        return C87412m.m108589b(this.f193102g, e0Var.f193102g);
    }
}
