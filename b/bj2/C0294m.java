package bj2;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import zb2.C66777a;

/* renamed from: bj2.m */
public final class C0294m extends C66777a<C0294m> {

    /* renamed from: d */
    public final int f860d;

    /* renamed from: e */
    public final String f861e;

    public C0294m(int i, String str) {
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        this.f860d = i;
        this.f861e = str;
    }

    /* renamed from: Oa */
    public String mo344Oa() {
        return String.valueOf(this.f860d);
    }

    public Object clone() {
        return super.clone();
    }

    public int compareTo(Object obj) {
        C0294m mVar = (C0294m) obj;
        C87412m.m108594g(mVar, "other");
        return C87412m.m108596i(this.f860d, mVar.f860d);
    }

    /* renamed from: g5 */
    public boolean mo347g5(Object obj) {
        C0294m mVar = (C0294m) obj;
        C87412m.m108594g(mVar, "other");
        return C87412m.m108589b(this.f861e, mVar.f861e);
    }
}
