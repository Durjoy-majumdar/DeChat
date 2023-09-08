package p11;

import gy3.C8480h;

/* renamed from: p11.b */
public abstract class C110102b {

    /* renamed from: a */
    public final boolean f329411a;

    public C110102b() {
        this(false, (String) null, 3, (C8480h) null);
    }

    public C110102b(boolean z, String str) {
        this.f329411a = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C110102b(boolean z, String str, int i, C8480h hVar) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : str);
    }
}
