package p346hh;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
import p213oh.C11412b;
import p213oh.C89209a;
import p335eh.C107275e;
import p335eh.C116768d;
import p339fh.C116868i;
import p339fh.C45784e;

/* renamed from: hh.f */
public class C117085f extends C117084e {

    /* renamed from: o */
    public C116768d f350846o;

    /* renamed from: p */
    public OutputStream f350847p;

    /* renamed from: q */
    public InputStream f350848q;

    public C117085f(C116768d dVar, int i, int i2, int i3, String str) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        int i4 = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioFixedConvertProcess", "AudioFixedConvertProcess src:%s, sample:%d, channels:%d, encodeBit:%d", objArr);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            C117083d.f350831a = true;
        } else {
            C117083d.f350831a = false;
        }
        this.f350846o = dVar;
        String a = C89209a.m111499a(str);
        this.f350843k = a;
        Log.m105925i("MicroMsg.Mix.AudioFixedConvertProcess", "outFile:%s", a);
        C86013q1.m106447h(this.f350843k);
        C45784e.m51066c().mo71257a(dVar.f350074c);
        try {
            this.f350847p = C86013q1.m106426H(C89209a.m111500b(this.f350843k));
        } catch (FileNotFoundException e) {
            Log.printErrStackTrace("MicroMsg.Mix.AudioFixedConvertProcess", e, "VFSFileOp.openWrite", new Object[0]);
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.Mix.AudioFixedConvertProcess", e2, "VFSFileOp.openWrite", new Object[0]);
        }
        try {
            this.f350848q = C86013q1.m106422D(C89209a.m111500b(this.f350843k));
        } catch (FileNotFoundException e3) {
            Log.printErrStackTrace("MicroMsg.Mix.AudioFixedConvertProcess", e3, "VFSFileOp.openRead", new Object[0]);
        } catch (Exception e4) {
            Log.printErrStackTrace("MicroMsg.Mix.AudioFixedConvertProcess", e4, "VFSFileOp.openRead", new Object[0]);
        }
        this.f350837e = 44100;
        this.f350838f = 2;
        this.f350839g = 2;
        mo181038f(i, i2, i3);
    }

    /* renamed from: a */
    public byte[] mo32679a(byte[] bArr) {
        if (bArr == null) {
            return bArr;
        }
        byte[] a = super.mo32679a(bArr);
        OutputStream outputStream = this.f350847p;
        if (outputStream == null) {
            return a;
        }
        if (a != null) {
            try {
                outputStream.write(a, 0, a.length);
            } catch (Exception e) {
                int i = C11412b.f33577a;
                Log.printErrStackTrace("MicroMsg.Mix.AudioFixedConvertProcess", e, "write", new Object[0]);
            }
            return a;
        }
        int i2 = C11412b.f33577a;
        Log.m105921e("MicroMsg.Mix.AudioFixedConvertProcess", "desdata is null", (Object[]) null);
        return null;
    }

    /* renamed from: b */
    public void mo32680b() {
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioFixedConvertProcess", "flushCache", (Object[]) null);
        if (this.f350848q == null) {
            Log.m105921e("MicroMsg.Mix.AudioFixedConvertProcess", "flushCache, inputStream is null", (Object[]) null);
        } else if (this.f350846o.f350073b) {
            Log.m105921e("MicroMsg.Mix.AudioFixedConvertProcess", "flushCache, cache is complete", (Object[]) null);
        } else {
            int i2 = 0;
            while (i2 != -1) {
                byte[] bArr = new byte[3536];
                try {
                    i2 = this.f350848q.read(bArr, 0, 3536);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.Mix.AudioFixedConvertProcess", e, "readPcmDataTrack", new Object[0]);
                }
                if (i2 > 0) {
                    C107275e b = C116868i.m164843a().mo180852b();
                    b.f320943f = bArr;
                    this.f350846o.mo180747m(b);
                }
            }
            this.f350846o.mo180735a();
        }
    }

    /* renamed from: c */
    public void mo32681c() {
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioFixedConvertProcess", "finishProcess", (Object[]) null);
        try {
            OutputStream outputStream = this.f350847p;
            if (outputStream != null) {
                outputStream.flush();
                this.f350847p.close();
                this.f350847p = null;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Mix.AudioFixedConvertProcess", e, "finishProcess", new Object[0]);
        }
        Runtime.getRuntime().gc();
    }

    /* renamed from: d */
    public C107275e mo32682d(int i) {
        InputStream inputStream = this.f350848q;
        if (inputStream == null) {
            int i2 = C11412b.f33577a;
            Log.m105921e("MicroMsg.Mix.AudioFixedConvertProcess", "readPcmDataTrack, inputStream is null", (Object[]) null);
            return null;
        }
        if (i > 0) {
            byte[] bArr = new byte[i];
            try {
                if (inputStream.read(bArr, 0, i) > 0) {
                    C107275e b = C116868i.m164843a().mo180852b();
                    b.f320943f = bArr;
                    return b;
                }
                int i3 = C11412b.f33577a;
                Log.m105921e("MicroMsg.Mix.AudioFixedConvertProcess", "readPcmDataTrack readSize is 0", (Object[]) null);
            } catch (Exception e) {
                int i4 = C11412b.f33577a;
                Log.printErrStackTrace("MicroMsg.Mix.AudioFixedConvertProcess", e, "readPcmDataTrack", new Object[0]);
            }
        }
        return null;
    }

    /* renamed from: e */
    public C117088k mo181037e() {
        return C117082c.m165104a(1);
    }

    public void release() {
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioFixedConvertProcess", "release", (Object[]) null);
        super.release();
        try {
            OutputStream outputStream = this.f350847p;
            if (outputStream != null) {
                outputStream.flush();
                this.f350847p.close();
                this.f350847p = null;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Mix.AudioFixedConvertProcess", e, "outputStream close", new Object[0]);
        }
        try {
            InputStream inputStream = this.f350848q;
            if (inputStream != null) {
                inputStream.close();
                this.f350848q = null;
            }
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.Mix.AudioFixedConvertProcess", e2, "inputStream close", new Object[0]);
        }
    }
}
