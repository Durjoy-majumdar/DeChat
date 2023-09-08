package p346hh;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p213oh.C11412b;
import p213oh.C89209a;

/* renamed from: hh.b */
public class C87490b {

    /* renamed from: a */
    public InputStream f253487a;

    /* renamed from: b */
    public String f253488b;

    public C87490b(String str, boolean z, String str2) {
        if (z) {
            this.f253488b = C89209a.m111504f(str2, str);
        } else {
            this.f253488b = C89209a.m111499a(str);
        }
        Object[] objArr = {this.f253488b};
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioConvertCacheReader", "cacheFile:%s", objArr);
        try {
            this.f253487a = C86013q1.m106422D(C89209a.m111500b(this.f253488b));
        } catch (FileNotFoundException e) {
            Log.printErrStackTrace("MicroMsg.Mix.AudioConvertCacheReader", e, "VFSFileOp.openRead", new Object[0]);
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.Mix.AudioConvertCacheReader", e2, "VFSFileOp.openRead", new Object[0]);
        }
    }

    /* renamed from: a */
    public byte[] mo121953a(int i) {
        InputStream inputStream = this.f253487a;
        if (inputStream == null) {
            int i2 = C11412b.f33577a;
            Log.m105921e("MicroMsg.Mix.AudioConvertCacheReader", "readPcmDataTrack, inputStream is null", (Object[]) null);
            return null;
        }
        if (i > 0) {
            byte[] bArr = new byte[i];
            try {
                if (inputStream.read(bArr, 0, i) > 0) {
                    return bArr;
                }
            } catch (Exception e) {
                int i3 = C11412b.f33577a;
                Log.printErrStackTrace("MicroMsg.Mix.AudioConvertCacheReader", e, "readPcmDataTrack", new Object[0]);
            }
        }
        return null;
    }

    /* renamed from: b */
    public void mo121954b() {
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioConvertCacheReader", "release", (Object[]) null);
        try {
            InputStream inputStream = this.f253487a;
            if (inputStream != null) {
                inputStream.close();
                this.f253487a = null;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Mix.AudioConvertCacheReader", e, "inputStream close", new Object[0]);
        }
    }
}
