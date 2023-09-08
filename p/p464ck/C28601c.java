package p464ck;

import fy3.C32224a;
import gy3.C87413o;
import java.util.ArrayList;
import p464ck.C54869f;
import rx3.C13598b0;

/* renamed from: ck.c */
public final class C28601c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ArrayList<C54869f.C54870a> f78489d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28601c(ArrayList<C54869f.C54870a> arrayList) {
        super(0);
        this.f78489d = arrayList;
    }

    public Object invoke() {
        ArrayList arrayList = C28602d.f78490a.mo56079a().get(0);
        if (arrayList != null) {
            arrayList.addAll(this.f78489d);
        }
        return C13598b0.f38549a;
    }
}
