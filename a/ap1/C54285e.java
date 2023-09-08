package ap1;

import al1.C54127h;
import bl3.C54492n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8479f0;
import hp3.C87581a;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49498g11;
import te3.C64370fp1;
import te3.C64859yk1;

/* renamed from: ap1.e */
public final class C54285e<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C64859yk1 f152369a;

    /* renamed from: b */
    public final /* synthetic */ C54127h f152370b;

    /* renamed from: c */
    public final /* synthetic */ C8479f0<String> f152371c;

    public C54285e(C64859yk1 yk12, C54127h hVar, C8479f0<String> f0Var) {
        this.f152369a = yk12;
        this.f152370b = hVar;
        this.f152371c = f0Var;
    }

    public Object call(Object obj) {
        String str;
        C64370fp1 fp12;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C49498g11 g112 = (C49498g11) cVar.f256796d;
            if (g112 == null || (fp12 = g112.f133782f) == null || (str = fp12.f183193x) == null) {
                str = "";
            }
            C64370fp1 fp13 = this.f152369a.f186570h;
            if (fp13 != null) {
                fp13.f183193x = str;
            }
            Log.m105924i(C54492n.TAG, "fxxkshopreport requestId replay enter cgiback, " + str);
        }
        C54286f.m61015c3(this.f152370b, (String) this.f152371c.f27484d, this.f152369a);
        return C13598b0.f38549a;
    }
}
