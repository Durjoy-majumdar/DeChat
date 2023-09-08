package com.tencent.qqpinyin.voicerecoapi;

/* renamed from: com.tencent.qqpinyin.voicerecoapi.a */
public class C19979a {

    /* renamed from: a */
    public byte[] f56930a = null;

    /* renamed from: b */
    public byte[] f56931b = null;

    /* renamed from: c */
    public long f56932c = 0;

    /* renamed from: d */
    public long f56933d = 0;

    /* renamed from: e */
    public TRSpeexNative f56934e = new TRSpeexNative();

    /* renamed from: a */
    public byte[] mo27822a(byte[] bArr, int i, int i2) {
        long j = this.f56933d;
        if (j == 0) {
            throw new C19980b(-102);
        } else if (bArr == null || bArr.length == 0) {
            throw new C19980b(-104);
        } else {
            int nativeTRSpeexDecode = this.f56934e.nativeTRSpeexDecode(j, bArr, i, i2, this.f56931b);
            if (nativeTRSpeexDecode < 0) {
                throw new C19980b(nativeTRSpeexDecode);
            } else if (nativeTRSpeexDecode == 0) {
                return null;
            } else {
                byte[] bArr2 = new byte[nativeTRSpeexDecode];
                System.arraycopy(this.f56931b, 0, bArr2, 0, nativeTRSpeexDecode);
                return bArr2;
            }
        }
    }

    /* renamed from: b */
    public int mo27823b() {
        if (this.f56933d != 0) {
            return -103;
        }
        long nativeTRSpeexDecodeInit = this.f56934e.nativeTRSpeexDecodeInit();
        if (nativeTRSpeexDecodeInit == -1) {
            return (int) nativeTRSpeexDecodeInit;
        }
        this.f56933d = nativeTRSpeexDecodeInit;
        this.f56931b = new byte[30000];
        return 0;
    }

    /* renamed from: c */
    public int mo27824c() {
        long j = this.f56933d;
        if (j == 0) {
            return -102;
        }
        this.f56931b = null;
        int nativeTRSpeexDecodeRelease = this.f56934e.nativeTRSpeexDecodeRelease(j);
        this.f56933d = 0;
        return nativeTRSpeexDecodeRelease;
    }

    /* renamed from: d */
    public byte[] mo27825d(byte[] bArr, int i, int i2) {
        long j = this.f56932c;
        if (j == 0) {
            throw new C19980b(-102);
        } else if (bArr == null || bArr.length == 0) {
            throw new C19980b(-104);
        } else {
            int nativeTRSpeexEncode = this.f56934e.nativeTRSpeexEncode(j, bArr, i, i2, this.f56930a);
            if (nativeTRSpeexEncode < 0) {
                throw new C19980b(nativeTRSpeexEncode);
            } else if (nativeTRSpeexEncode == 0) {
                return null;
            } else {
                byte[] bArr2 = new byte[nativeTRSpeexEncode];
                System.arraycopy(this.f56930a, 0, bArr2, 0, nativeTRSpeexEncode);
                return bArr2;
            }
        }
    }

    /* renamed from: e */
    public int mo27826e() {
        if (this.f56932c != 0) {
            return -103;
        }
        long nativeTRSpeexInit = this.f56934e.nativeTRSpeexInit();
        if (nativeTRSpeexInit == -1) {
            return (int) nativeTRSpeexInit;
        }
        this.f56932c = nativeTRSpeexInit;
        this.f56930a = new byte[20000];
        return 0;
    }

    /* renamed from: f */
    public int mo27827f() {
        long j = this.f56932c;
        if (j == 0) {
            return -102;
        }
        this.f56930a = null;
        int nativeTRSpeexRelease = this.f56934e.nativeTRSpeexRelease(j);
        this.f56932c = 0;
        return nativeTRSpeexRelease;
    }
}
