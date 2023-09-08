package nw0;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import mw0.C47108k;

/* renamed from: nw0.b */
public class C21710b extends C47302a {

    /* renamed from: n */
    public static final String f61437n = C21710b.class.getName();

    /* renamed from: o */
    public static String f61438o = "00002a35-0000-1000-8000-00805f9b34fb";

    /* renamed from: p */
    public static String f61439p = "00002a36-0000-1000-8000-00805f9b34fb";

    /* renamed from: q */
    public static String f61440q = "00002a49-0000-1000-8000-00805f9b34fb";

    /* renamed from: h */
    public C21712b f61441h = null;

    /* renamed from: i */
    public C21711a f61442i;

    /* renamed from: j */
    public int f61443j;

    /* renamed from: nw0.b$a */
    public class C21711a {

        /* renamed from: a */
        public int f61444a = 0;

        /* renamed from: b */
        public int f61445b = 0;

        /* renamed from: c */
        public int f61446c = 0;

        /* renamed from: d */
        public C21713c f61447d = new C21713c();

        public C21711a(C21710b bVar) {
        }
    }

    /* renamed from: nw0.b$b */
    public class C21712b {

        /* renamed from: a */
        public int f61448a = 0;

        /* renamed from: b */
        public int f61449b = 0;

        /* renamed from: c */
        public int f61450c = 0;

        /* renamed from: d */
        public C21713c f61451d = new C21713c();

        public C21712b(C21710b bVar) {
        }
    }

    /* renamed from: nw0.b$c */
    public static class C21713c {

        /* renamed from: a */
        public int f61452a = 0;

        /* renamed from: b */
        public int f61453b = 0;

        /* renamed from: c */
        public int f61454c = 0;

        /* renamed from: d */
        public int f61455d = 0;

        /* renamed from: e */
        public int f61456e = 0;

        /* renamed from: a */
        public boolean mo33980a(byte[] bArr, int i, int i2) {
            String str = C21710b.f61437n;
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(bArr == null ? 0 : bArr.length);
            objArr[1] = Integer.valueOf(i);
            objArr[2] = Integer.valueOf(i2);
            Log.m105919d(str, "data size = %d, offset = %d, lenght = %d", objArr);
            if (bArr == null || i < 0 || 7 > i2 || bArr.length < i2 + i) {
                Log.m105920e(str, "data input error");
                return false;
            }
            int i3 = (bArr[i] & ExifInterface.MARKER) + ((bArr[i + 1] & ExifInterface.MARKER) << 8);
            this.f61452a = bArr[i + 2] & ExifInterface.MARKER;
            this.f61453b = bArr[i + 3] & ExifInterface.MARKER;
            this.f61454c = bArr[i + 4] & ExifInterface.MARKER;
            this.f61455d = bArr[i + 5] & ExifInterface.MARKER;
            this.f61456e = bArr[i + 6] & ExifInterface.MARKER;
            Log.m105919d(str, "year = %d, month = %d, day = %d, hours = %d, minutes = %d, seconds = %d", Integer.valueOf(i3), Integer.valueOf(this.f61452a), Integer.valueOf(this.f61453b), Integer.valueOf(this.f61454c), Integer.valueOf(this.f61455d), Integer.valueOf(this.f61456e));
            return true;
        }
    }

    static {
        HashMap<String, String> hashMap = C47108k.f126586a;
    }

    public C21710b() {
        this.f126958e = null;
        this.f126959f = 2;
        this.f126957d = 8;
    }

    /* renamed from: d */
    public static double m24669d(byte[] bArr, int i) {
        byte b = (bArr[i + 1] << 8) & 65280;
        int i2 = (b >> 12) - 16;
        byte b2 = b & 3840;
        int i3 = (bArr[i] & ExifInterface.MARKER) + (b2 & 65280);
        double pow = ((double) i3) * Math.pow(10.0d, (double) i2);
        Log.m105918d(f61437n, "hbyte=" + b + " hvalue=" + b2 + " value=" + i3 + " exp=" + i2);
        return pow;
    }

    /* renamed from: a */
    public byte[] mo33979a() {
        return null;
    }
}
