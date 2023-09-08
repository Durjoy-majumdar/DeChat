package wd3;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import di3.C86301e;
import ei3.C86522b;
import wc3.C15130a;
import wc3.C15140v;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: wd3.d */
public class C78561d extends C86301e implements C15140v {
    /* renamed from: Ck */
    public C15152t0 mo14097Ck(Context context, String str, int i, C78574s0 s0Var) {
        return new C78545b(context, str, i, s0Var);
    }

    /* renamed from: jU */
    public C15152t0 mo14098jU(Context context, String str, int i, C78574s0 s0Var, C15130a aVar) {
        C78545b bVar = new C78545b(context, str, i, s0Var);
        bVar.mo108517d(aVar);
        return bVar;
    }

    /* renamed from: ne */
    public C15152t0 mo14099ne(Context context, String str, int i, boolean z, C78574s0 s0Var, C15130a aVar) {
        C78545b bVar = new C78545b(context, str, i, s0Var);
        bVar.mo108517d(aVar);
        bVar.f230082v = z;
        return bVar;
    }
}
