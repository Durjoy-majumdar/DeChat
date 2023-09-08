package sf0;

import p1174c5.C113246d;
import p1174c5.C113248f;

/* renamed from: sf0.r */
public class C118279r implements C113246d<Boolean, String> {

    /* renamed from: a */
    public final /* synthetic */ C118281t f353520a;

    public C118279r(C118281t tVar) {
        this.f353520a = tVar;
    }

    /* renamed from: a */
    public Object mo165790a(C113248f fVar) {
        TResult tresult;
        synchronized (fVar.f338849a) {
            tresult = fVar.f338851c;
        }
        if (((Boolean) tresult).booleanValue()) {
            return (String) this.f353520a.f353522a.call();
        }
        return null;
    }
}
