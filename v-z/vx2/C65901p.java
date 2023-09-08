package vx2;

import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import hc0.C20937c;

/* renamed from: vx2.p */
public final class C65901p {

    /* renamed from: a */
    public static final C65901p f189464a = new C65901p();

    /* renamed from: a */
    public final String mo89951a(String str, C20937c cVar) {
        C87412m.m108594g(str, "path");
        C87412m.m108594g(cVar, "imageLoaderOptions");
        if (cVar.f59338v) {
            str = str + "round" + cVar.f59339w;
        }
        if (!Util.isNullOrNil(cVar.f59336t)) {
            str = str + cVar.f59336t;
        }
        return str + "size" + cVar.f59325i + cVar.f59326j;
    }

    /* renamed from: b */
    public final String mo89952b(String str) {
        C87412m.m108594g(str, "id");
        StringBuilder sb = new StringBuilder();
        String str2 = C15029q.f41166a;
        sb.append(C15029q.f41166a);
        sb.append(str);
        return sb.toString();
    }
}
