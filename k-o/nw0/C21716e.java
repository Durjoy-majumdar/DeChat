package nw0;

import java.util.HashMap;
import mw0.C47108k;

/* renamed from: nw0.e */
public class C21716e extends C47302a {

    /* renamed from: s */
    public static final String f61466s = C21716e.class.getName();

    /* renamed from: t */
    public static final String f61467t = "0000feb1-0000-1000-8000-00805f9b34fb";

    /* renamed from: u */
    public static final String f61468u = "0000feb2-0000-1000-8000-00805f9b34fb";

    /* renamed from: v */
    public static final String f61469v = "0000feb3-0000-1000-8000-00805f9b34fb";

    /* renamed from: w */
    public static final String f61470w = "0000feb4-0000-1000-8000-00805f9b34fb";

    /* renamed from: h */
    public byte f61471h = 0;

    /* renamed from: i */
    public byte f61472i = 0;

    /* renamed from: j */
    public byte f61473j = 0;

    /* renamed from: n */
    public byte f61474n = 0;

    /* renamed from: o */
    public byte[] f61475o = {0, 0};

    /* renamed from: p */
    public int f61476p = -1;

    /* renamed from: q */
    public byte f61477q = 0;

    /* renamed from: r */
    public byte[] f61478r = null;

    static {
        HashMap<String, String> hashMap = C47108k.f126586a;
    }

    public C21716e() {
        this.f126958e = null;
        this.f126959f = 8;
        this.f126957d = 16;
    }

    /* renamed from: a */
    public byte[] mo33979a() {
        if (this.f126958e.equalsIgnoreCase(f61467t)) {
            byte[] bArr = new byte[3];
            System.arraycopy(Byte.valueOf(this.f61471h), 0, bArr, 0, 1);
            System.arraycopy(Byte.valueOf(this.f61472i), 0, bArr, 1, 1);
            System.arraycopy(Byte.valueOf(this.f61473j), 0, bArr, 2, 1);
            return bArr;
        } else if (this.f126958e.equalsIgnoreCase(f61468u)) {
            byte[] bArr2 = new byte[1];
            System.arraycopy(Byte.valueOf(this.f61474n), 0, bArr2, 0, 1);
            return bArr2;
        } else if (!this.f126958e.equalsIgnoreCase(f61470w)) {
            return null;
        } else {
            int i = this.f61476p;
            byte[] bArr3 = new byte[i];
            System.arraycopy(Byte.valueOf((byte) (i & 255)), 0, bArr3, 0, 1);
            System.arraycopy(Byte.valueOf((byte) ((i >> 8) & 255)), 0, bArr3, 1, 1);
            System.arraycopy(Byte.valueOf(this.f61477q), 0, bArr3, 2, 1);
            int i2 = this.f61476p;
            if (i2 > 3) {
                System.arraycopy(this.f61478r, 0, bArr3, 3, i2 - 3);
            }
            return bArr3;
        }
    }
}
