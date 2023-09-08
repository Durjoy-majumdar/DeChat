package we2;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import p556hw.C98548d;
import te2.C101750g;

@C86522b
/* renamed from: we2.c */
public final class C102432c extends C86301e implements C98548d {

    /* renamed from: d */
    public C98548d.C98549a f301681d;

    /* renamed from: AM */
    public void mo137918AM(C98548d.C98549a aVar) {
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (this.f301681d == null) {
            this.f301681d = aVar;
        }
    }

    /* renamed from: EB */
    public C98548d.C98549a mo137919EB() {
        return this.f301681d;
    }

    /* renamed from: xN */
    public int mo137920xN(String str) {
        C101750g.C101752b bVar = C101750g.f297828a;
        if (str == null) {
            str = "";
        }
        return bVar.mo141183c(3, str);
    }
}
