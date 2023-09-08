package qj1;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import fy3.C32224a;
import gy3.C87413o;
import java.util.List;
import rx3.C13598b0;
import te3.C49765hx0;
import te3.C52013xs0;

/* renamed from: qj1.aa */
public final class C62635aa extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C63049v9 f177885d;

    /* renamed from: e */
    public final /* synthetic */ List<C52013xs0> f177886e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62635aa(C63049v9 v9Var, List<C52013xs0> list) {
        super(0);
        this.f177885d = v9Var;
        this.f177886e = list;
    }

    public Object invoke() {
        FinderContact finderContact;
        String str;
        int i;
        C63049v9 v9Var = this.f177885d;
        int[] iArr = v9Var.f178927M;
        if (iArr[0] <= 0 || (i = iArr[1]) <= 0 || ((float) i) >= v9Var.f178937r) {
            v9Var.mo87988c1();
        }
        List<C52013xs0> list = this.f177886e;
        C63049v9 v9Var2 = this.f177885d;
        synchronized (list) {
            for (C52013xs0 xs02 : list) {
                C49765hx0 hx02 = xs02.f144914s;
                if (!(hx02 == null || (finderContact = hx02.f134919d) == null || (str = finderContact.headUrl) == null)) {
                    v9Var2.f178925K.add(str);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
