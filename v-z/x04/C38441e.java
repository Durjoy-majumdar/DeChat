package x04;

import java.io.Serializable;

/* renamed from: x04.e */
public final class C38441e<K, V> implements Serializable {

    /* renamed from: d */
    public final K f101397d;

    /* renamed from: e */
    public final V f101398e;

    public C38441e(K k, V v) {
        this.f101397d = k;
        this.f101398e = v;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof x04.C38441e
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            x04.e r4 = (x04.C38441e) r4
            K r0 = r3.f101397d
            if (r0 != 0) goto L_0x0011
            K r0 = r4.f101397d
            if (r0 != 0) goto L_0x0029
            goto L_0x0019
        L_0x0011:
            K r2 = r4.f101397d
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0029
        L_0x0019:
            V r0 = r3.f101398e
            V r4 = r4.f101398e
            if (r0 != 0) goto L_0x0022
            if (r4 != 0) goto L_0x0029
            goto L_0x0028
        L_0x0022:
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0029
        L_0x0028:
            r1 = 1
        L_0x0029:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x04.C38441e.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        K k = this.f101397d;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.f101398e;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return this.f101397d + "=" + this.f101398e;
    }
}
