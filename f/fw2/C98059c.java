package fw2;

import com.tencent.p014mm.storage.C96983o3;
import gy3.C87412m;
import te3.bc4;
import x60.C15627c;

/* renamed from: fw2.c */
public final class C98059c implements C15627c {

    /* renamed from: d */
    public bc4 f287505d;

    /* renamed from: e */
    public String f287506e;

    /* renamed from: f */
    public C96983o3 f287507f;

    public C98059c(bc4 bc4, String str, C96983o3 o3Var) {
        C87412m.m108594g(bc4, "mediaObj");
        C87412m.m108594g(o3Var, "fromscene");
        this.f287505d = bc4;
        this.f287506e = str;
        this.f287507f = o3Var;
    }

    /* renamed from: b */
    public String mo11841b() {
        String str = this.f287505d.f297963h;
        if (str == null || str.length() == 0) {
            return this.f287505d.f297959d + '_' + this.f287507f.f284144a;
        }
        return this.f287505d.f297963h + '_' + this.f287507f.f284144a;
    }
}
