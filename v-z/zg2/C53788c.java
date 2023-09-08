package zg2;

import java.util.Set;

/* renamed from: zg2.c */
public final class C53788c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f150960d;

    /* renamed from: e */
    public final /* synthetic */ String f150961e;

    public C53788c(int i, String str) {
        this.f150960d = i;
        this.f150961e = str;
    }

    public final void run() {
        C53784a aVar = C53784a.f150949a;
        Set<C53789d> set = C53784a.f150950b.get(this.f150960d);
        if (set != null) {
            String str = this.f150961e;
            for (C53789d b : set) {
                b.mo74359b(str);
            }
        }
    }
}
