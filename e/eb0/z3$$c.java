package eb0;

import java.util.List;

public final /* synthetic */ class z3$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f84303d;

    /* renamed from: e */
    public final /* synthetic */ C31505r2 f84304e;

    /* renamed from: f */
    public final /* synthetic */ long f84305f;

    public /* synthetic */ z3$$c(List list, C31505r2 r2Var, long j) {
        this.f84303d = list;
        this.f84304e = r2Var;
        this.f84305f = j;
    }

    public final void run() {
        List<String> list = this.f84303d;
        C31505r2 r2Var = this.f84304e;
        long j = this.f84305f;
        for (String XN : list) {
            r2Var.mo58206XN(XN, j);
        }
    }
}
