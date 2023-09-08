package p516f9;

import com.google.android.gms.common.internal.Objects;
import java.security.KeyPair;

/* renamed from: f9.e0 */
public final class C116818e0 {

    /* renamed from: a */
    public final KeyPair f350170a;

    /* renamed from: b */
    public final long f350171b;

    public C116818e0(KeyPair keyPair, long j) {
        this.f350170a = keyPair;
        this.f350171b = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C116818e0)) {
            return false;
        }
        C116818e0 e0Var = (C116818e0) obj;
        return this.f350171b == e0Var.f350171b && this.f350170a.getPublic().equals(e0Var.f350170a.getPublic()) && this.f350170a.getPrivate().equals(e0Var.f350170a.getPrivate());
    }

    public final int hashCode() {
        return Objects.hashCode(this.f350170a.getPublic(), this.f350170a.getPrivate(), Long.valueOf(this.f350171b));
    }
}
