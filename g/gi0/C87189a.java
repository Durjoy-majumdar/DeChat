package gi0;

import hp3.C87581a;
import ii0.C87732a;
import lp3.C46888b;

/* renamed from: gi0.a */
public class C87189a implements C87581a<Void, Boolean> {

    /* renamed from: a */
    public final /* synthetic */ boolean f252849a;

    /* renamed from: b */
    public final /* synthetic */ int f252850b;

    /* renamed from: c */
    public final /* synthetic */ C46888b f252851c;

    public C87189a(C87192d dVar, boolean z, int i, C46888b bVar) {
        this.f252849a = z;
        this.f252850b = i;
        this.f252851c = bVar;
    }

    public Object call(Object obj) {
        Boolean bool = (Boolean) obj;
        C87732a.INSTANCE.mo122144a(this.f252850b, bool.booleanValue() ? this.f252849a ? 52 : 47 : this.f252849a ? 53 : 48);
        this.f252851c.mo72093c(bool);
        return null;
    }
}
