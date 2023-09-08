package p346hh;

import com.tencent.p014mm.audio.mix.jni.SilkResampleJni;
import com.tencent.p014mm.sdk.platformtools.Log;
import p213oh.C11412b;

/* renamed from: hh.m */
public class C117090m implements C117088k {

    /* renamed from: a */
    public int f350856a = 0;

    /* renamed from: b */
    public int f350857b = 0;

    /* renamed from: c */
    public String f350858c;

    /* renamed from: a */
    public byte[] mo181039a(byte[] bArr) {
        short[] a = C117081a.m165100a(bArr, bArr.length);
        int length = a.length;
        int i = this.f350857b;
        int i2 = this.f350856a;
        int i3 = (length * i) / i2;
        if (i % i2 != 0) {
            i3++;
        }
        short[] sArr = new short[i3];
        if (SilkResampleJni.resamplePcm(this.f350858c, i2, i, a, a.length, sArr) != -1) {
            return C117081a.m165103d(sArr);
        }
        Object[] objArr = {this.f350858c};
        int i4 = C11412b.f33577a;
        Log.m105921e("MicroMsg.Mix.SilkResampleAlgorithm", "resamplePcm result is -1, fileName:%s", objArr);
        return null;
    }

    /* renamed from: b */
    public boolean mo181040b(String str, int i, int i2) {
        this.f350856a = i;
        this.f350857b = i2;
        this.f350858c = str;
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        int i3 = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.SilkResampleAlgorithm", "initResample, fileName:%s, sSample:%d, dSample:%d", objArr);
        if (SilkResampleJni.initResample(str, i, i2) != -1) {
            return true;
        }
        Log.m105921e("MicroMsg.Mix.SilkResampleAlgorithm", "initResample result is -1, fileName:%s", str);
        return false;
    }

    public boolean release() {
        if (SilkResampleJni.clearResample(this.f350858c) == -1) {
            int i = C11412b.f33577a;
            Log.m105921e("MicroMsg.Mix.SilkResampleAlgorithm", "clearResample result is -1", (Object[]) null);
            return false;
        }
        int i2 = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.SilkResampleAlgorithm", "release", (Object[]) null);
        return true;
    }
}
