package zg2;

import java.util.Set;

/* renamed from: zg2.b */
public final class C53787b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f150957d;

    /* renamed from: e */
    public final /* synthetic */ String f150958e;

    /* renamed from: f */
    public final /* synthetic */ int f150959f;

    public C53787b(int i, String str, int i2) {
        this.f150957d = i;
        this.f150958e = str;
        this.f150959f = i2;
    }

    public final void run() {
        C53784a aVar = C53784a.f150949a;
        Set<C53789d> set = C53784a.f150950b.get(this.f150957d);
        if (set != null) {
            String str = this.f150958e;
            int i = this.f150959f;
            for (C53789d c : set) {
                c.mo74360c(str, i);
            }
        }
    }
}
