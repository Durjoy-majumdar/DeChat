package p298c6;

/* renamed from: c6.c */
public class C23707c {

    /* renamed from: a */
    public int f67906a;

    /* renamed from: b */
    public long f67907b;

    public C23707c(long j, int i) {
        this.f67907b = j;
        this.f67906a = i;
    }

    /* renamed from: a */
    public static C23707c m28367a(String str, int i, int i2, boolean z) {
        if (i >= i2) {
            return null;
        }
        boolean z2 = false;
        if (z) {
            char charAt = str.charAt(i);
            if (charAt != '+') {
                if (charAt == '-') {
                    z2 = true;
                }
            }
            i++;
        }
        long j = 0;
        int i3 = i;
        while (i3 < i2) {
            char charAt2 = str.charAt(i3);
            if (charAt2 < '0' || charAt2 > '9') {
                break;
            }
            if (z2) {
                j = (j * 10) - ((long) (charAt2 - '0'));
                if (j < -2147483648L) {
                    return null;
                }
            } else {
                j = (j * 10) + ((long) (charAt2 - '0'));
                if (j > 2147483647L) {
                    return null;
                }
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new C23707c(j, i3);
    }
}
