package vl3;

import android.content.Context;
import com.tencent.p014mm.smiley.C96936g0;
import com.tencent.p014mm.smiley.C96939h0;
import com.tencent.p014mm.smiley.C96945j0;
import com.tencent.p014mm.smiley.C96951l;
import com.tencent.p014mm.smiley.C96963p0;
import gy3.C8478d0;
import p441aq.C92052d0;

/* renamed from: vl3.d */
public class C102226d {

    /* renamed from: a */
    public static C102225c f301013a;

    /* renamed from: a */
    public static CharSequence m134696a(Context context, CharSequence charSequence) {
        C102225c cVar = f301013a;
        if (cVar == null) {
            return charSequence;
        }
        ((C92052d0.C92053a) cVar).getClass();
        return C96963p0.wx0().mo83004M(context, charSequence);
    }

    /* renamed from: b */
    public static int m134697b(Context context, String str, int i) {
        C102225c cVar = f301013a;
        if (cVar == null) {
            return i;
        }
        ((C92052d0.C92053a) cVar).getClass();
        C96963p0.wx0().getClass();
        C96936g0 g0Var = C96945j0.m124519b().f284016q;
        C96951l lVar = new C96951l(g0Var.f283975a);
        C8478d0 d0Var = new C8478d0();
        d0Var.f27483d = i;
        int i2 = g0Var.f283976b;
        lVar.mo135537a(str, i - i2, i2 + i, new C96939h0(i, d0Var));
        return d0Var.f27483d;
    }
}
