package nw0;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import mw0.C47108k;

/* renamed from: nw0.f */
public class C47303f extends C47302a {

    /* renamed from: n */
    public static final String f126960n = C47303f.class.getName();

    /* renamed from: o */
    public static String f126961o = "0000fea1-0000-1000-8000-00805f9b34fb";

    /* renamed from: p */
    public static String f126962p = "0000fea2-0000-1000-8000-00805f9b34fb";

    /* renamed from: h */
    public int f126963h = -1;

    /* renamed from: i */
    public int f126964i = -1;

    /* renamed from: j */
    public int f126965j = -1;

    static {
        HashMap<String, String> hashMap = C47108k.f126586a;
    }

    public C47303f() {
        this.f126958e = null;
        this.f126959f = 8;
        this.f126957d = 1;
    }

    /* renamed from: a */
    public byte[] mo33979a() {
        if (this.f126963h < 0) {
            Log.m105920e(f126960n, "stepCount is invalid");
            return null;
        }
        int i = this.f126964i >= 0 ? 7 : 4;
        if (this.f126965j >= 0) {
            i += 3;
        }
        byte[] bArr = new byte[i];
        bArr[0] = 1;
        int i2 = 1;
        for (int i3 = 0; i3 < 3; i3++) {
            bArr[i2] = (byte) ((this.f126963h >> (i3 * 8)) & 255);
            i2++;
        }
        if (this.f126964i >= 0) {
            bArr[0] = (byte) (bArr[0] | 2);
            for (int i4 = 0; i4 < 3; i4++) {
                bArr[i2] = (byte) ((this.f126964i >> (i4 * 8)) & 255);
                i2++;
            }
        }
        if (this.f126965j >= 0) {
            bArr[0] = 4;
            for (int i5 = 0; i5 < 3; i5++) {
                bArr[i2] = (byte) ((this.f126965j >> (i5 * 8)) & 255);
                i2++;
            }
        }
        return bArr;
    }
}
