package p346hh;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Arrays;
import p213oh.C11412b;

/* renamed from: hh.l */
public class C117089l implements C117088k {

    /* renamed from: a */
    public int f350853a = 0;

    /* renamed from: b */
    public int f350854b = 0;

    /* renamed from: c */
    public short[] f350855c;

    /* renamed from: a */
    public byte[] mo181039a(byte[] bArr) {
        short[] a = C117081a.m165100a(bArr, bArr.length);
        int length = a.length - 1;
        int length2 = (int) (((float) a.length) * (((float) this.f350854b) / ((float) this.f350853a)));
        short[] sArr = this.f350855c;
        if (sArr == null || sArr.length != length2) {
            this.f350855c = new short[length2];
        }
        Arrays.fill(this.f350855c, 0, length2, 0);
        for (int i = 0; i < length2; i++) {
            float f = (((float) i) * ((float) this.f350853a)) / ((float) this.f350854b);
            int i2 = (int) f;
            float f2 = f - ((float) i2);
            this.f350855c[i] = (short) ((int) (((1.0f - f2) * ((float) a[i2])) + (f2 * ((float) a[i2 == length ? length : i2 + 1]))));
        }
        return C117081a.m165103d(this.f350855c);
    }

    /* renamed from: b */
    public boolean mo181040b(String str, int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        int i3 = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.LinearResampleAlgorithm", "linear resample algorithm  sSample:%d, dSample:%d", objArr);
        this.f350853a = i;
        this.f350854b = i2;
        return true;
    }

    public boolean release() {
        return false;
    }
}
