package p510ev;

import di3.C86301e;
import ei3.C86522b;
import ma2.C61453s;
import ma2.C99814o0;
import p529fv.C59329p;
import p749xh.C102658n6;
import q90.C101062d;
import ra2.C101366b;

@C86522b
/* renamed from: ev.p */
public class C58836p extends C86301e implements C59329p {
    /* renamed from: Ts */
    public C102658n6 mo84019Ts(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        return C99814o0.wx0().mo140854bD(str, str2, str3, str4, z, z2);
    }

    public C61453s is0(C102658n6 n6Var, boolean z) {
        C101366b wx02 = C99814o0.wx0();
        if (((C101062d) wx02.f296944f).get(n6Var.field_musicId) == null) {
            return wx02.mo140851Lo(n6Var, z, false);
        }
        return (C61453s) ((C101062d) wx02.f296944f).get(n6Var.field_musicId);
    }
}
