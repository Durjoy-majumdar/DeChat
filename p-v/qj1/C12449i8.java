package qj1;

import cj1.C0639y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import dj1.C58291w0;
import eb0.C31543z5;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedList;
import rx3.C13598b0;
import te3.C51548uh3;

/* renamed from: qj1.i8 */
public final class C12449i8 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LinkedList<C51548uh3> f35829d;

    /* renamed from: e */
    public final /* synthetic */ C58291w0 f35830e;

    /* renamed from: f */
    public final /* synthetic */ C12360e8 f35831f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12449i8(LinkedList<C51548uh3> linkedList, C58291w0 w0Var, C12360e8 e8Var) {
        super(0);
        this.f35829d = linkedList;
        this.f35830e = w0Var;
        this.f35831f = e8Var;
    }

    public Object invoke() {
        T t;
        boolean z;
        LinkedList<C51548uh3> linkedList = this.f35829d;
        C58291w0 w0Var = this.f35830e;
        Iterator<T> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            C51548uh3 uh32 = (C51548uh3) t;
            if (!C87412m.m108589b(uh32.f142860g, w0Var.f166911w) || !C87412m.m108589b(uh32.f142857d, w0Var.f166912x)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        C51548uh3 uh33 = (C51548uh3) t;
        if (uh33 != null) {
            C58291w0 w0Var2 = this.f35830e;
            C12360e8 e8Var = this.f35831f;
            if (uh33.f142859f < C31543z5.m39455e()) {
                Log.m105924i("Finder.FinderLiveGiftSendPlugin", "gift is already expire_time, it.expire_time = " + uh33.f142859f);
                uh33.f142858e = 0;
                String str = w0Var2.f166908t;
                if (str != null) {
                    C0639y1.f1510a.mo618j(str);
                }
            } else {
                uh33.f142858e += (long) w0Var2.f166909u;
            }
            e8Var.mo12049a1("resumePkgGiftPatchInfoOnFail");
        }
        return C13598b0.f38549a;
    }
}
