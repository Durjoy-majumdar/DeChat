package rs1;

import bl3.C54492n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import er1.C58784w3;
import gy3.C8480h;
import gy3.C87412m;
import hp3.C87581a;
import je1.C46547x1;
import je1.C60798d2;
import ob0.C89132b;
import p749xh.C66276va;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C48693ac1;
import te3.C49712hj1;
import te3.C49946j51;
import te3.C50882pv2;
import te3.C51603uv2;
import te3.C52028xv2;
import up1.C65426w0;

/* renamed from: rs1.q6 */
public final class C63617q6<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C66276va f180380a;

    /* renamed from: b */
    public final /* synthetic */ C63621r6 f180381b;

    public C63617q6(C66276va vaVar, C63621r6 r6Var) {
        this.f180380a = vaVar;
        this.f180381b = r6Var;
    }

    public Object call(Object obj) {
        C52028xv2 xv22;
        C52028xv2 xv23;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar == null) {
            Log.m105924i(C54492n.TAG, "result == null id " + this.f180380a.field_id + " content " + Util.secPrint(this.f180380a.field_content));
        } else if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("get mega video detail success, id = ");
            C60798d2 d2Var = this.f180381b.f180389h;
            C49712hj1 hj12 = null;
            sb.append(d2Var != null ? Long.valueOf(d2Var.f173169s) : null);
            Log.m105924i(C54492n.TAG, sb.toString());
            C48693ac1 ac12 = new C48693ac1();
            T t = cVar.f256796d;
            C87412m.m108592e(t, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MegaVideoDetailResponse");
            ac12.f130427d = ((C51603uv2) t).f143156d;
            T t2 = cVar.f256796d;
            C87412m.m108592e(t2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MegaVideoDetailResponse");
            ac12.f130428e = ((C51603uv2) t2).f143157e;
            C58784w3 w3Var = C58784w3.f168295a;
            int i = this.f180381b.f180385d;
            w3Var.getClass();
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            int i2 = z ? 7 : 5;
            C50882pv2 pv22 = ac12.f130427d;
            if (!(pv22 == null || (xv22 = pv22.f140025y) == null)) {
                long j = xv22.f144993d;
                C63621r6 r6Var = this.f180381b;
                C66276va vaVar = this.f180380a;
                C50882pv2 pv23 = ac12.f130427d;
                String str = (pv23 == null || (xv23 = pv23.f140025y) == null) ? null : xv23.f144994e;
                int i3 = r6Var.f180385d;
                C13442s8 f = C13442s8.f38060Q0.mo12873f(r6Var.getContext());
                if (f != null) {
                    hj12 = f.mo12861q3();
                }
                C46547x1 x1Var = new C46547x1(j, str, i2, i3, "", true, (C89349b) null, (C65426w0) null, 0, (String) null, false, false, (String) null, hj12, 0, (C49946j51) null, false, 122816, (C8480h) null);
                r6Var.f180388g = x1Var;
                x1Var.mo9225i().mo123062e(new C63614p6(vaVar, r6Var));
            }
        } else {
            C63621r6.m74939c3(this.f180381b, cVar.f256794b);
        }
        return C13598b0.f38549a;
    }
}
