package hp0;

import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import java.io.InputStream;
import nb0.C88915e;
import p225rc.C89912a;

/* renamed from: hp0.c */
public class C87576c implements C88915e {

    /* renamed from: d */
    public String f253665d;

    /* renamed from: e */
    public String f253666e;

    /* renamed from: f */
    public C89912a f253667f = null;

    /* renamed from: g */
    public long f253668g;

    public C87576c(String str, String str2) {
        this.f253665d = str;
        this.f253666e = str2;
        this.f253667f = mo122018b(str, str2);
    }

    /* renamed from: a */
    public int mo122017a() {
        if (this.f253667f == null) {
            this.f253667f = mo122018b(this.f253665d, this.f253666e);
        }
        if (this.f253667f == null) {
            Log.m105920e("MicroMsg.WxaAudioDataSource", "[getAudioType] inputStream is null");
            return 0;
        } else if (this.f253665d.toLowerCase().endsWith(".mp3")) {
            Log.m105918d("MicroMsg.WxaAudioDataSource", "[getAudioType] mp3");
            return 2;
        } else if (this.f253665d.toLowerCase().contains(".wav")) {
            Log.m105918d("MicroMsg.WxaAudioDataSource", "[getAudioType] wav");
            return 3;
        } else if (this.f253665d.toLowerCase().contains(".ogg")) {
            Log.m105918d("MicroMsg.WxaAudioDataSource", "[getAudioType] ogg");
            return 4;
        } else {
            String str = null;
            try {
                byte[] bArr = new byte[64];
                this.f253667f.mo124214b(0);
                this.f253667f.read(bArr);
                String str2 = new String(bArr);
                this.f253667f.mo124214b(0);
                str = str2;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.WxaAudioDataSource", "getAudioType", e);
                this.f253667f.mo124214b(0);
            } catch (Throwable th) {
                this.f253667f.mo124214b(0);
                throw th;
            }
            if (str == null || !str.contains("ftyp")) {
                return 0;
            }
            Log.m105918d("MicroMsg.WxaAudioDataSource", "[getAudioType] aac");
            return 1;
        }
    }

    /* renamed from: b */
    public final C89912a mo122018b(String str, String str2) {
        long nanoTime = System.nanoTime();
        if (Util.isNullOrNil(str2)) {
            Log.m105920e("MicroMsg.WxaAudioDataSource", "pkgpath is null, return");
            return null;
        }
        WxaPkg wxaPkg = new WxaPkg(new C86009m1(str2));
        if (!wxaPkg.f238564g) {
            wxaPkg.close();
            Log.m105920e("MicroMsg.WxaAudioDataSource", "pkg invalid");
            return null;
        } else if (!wxaPkg.mo63189b()) {
            wxaPkg.close();
            Log.m105920e("MicroMsg.WxaAudioDataSource", "pkg readInfo failed");
            return null;
        } else {
            InputStream a = wxaPkg.mo63188a(str);
            if (a == null) {
                wxaPkg.close();
                Log.m105921e("MicroMsg.WxaAudioDataSource", "inputstream for %s is null", str);
                return null;
            }
            wxaPkg.close();
            Log.m105919d("MicroMsg.WxaAudioDataSource", "time:%d", Long.valueOf(System.nanoTime() - nanoTime));
            return (C89912a) a;
        }
    }

    public void close() {
        C89912a aVar = this.f253667f;
        if (aVar != null) {
            Log.m105924i("MicroMsg.WxaAudioDataSource", "close");
            aVar.close();
            this.f253667f = null;
        }
    }

    public long getSize() {
        C89912a aVar = this.f253667f;
        if (aVar != null) {
            return (long) aVar.f258369d.limit();
        }
        Log.m105920e("MicroMsg.WxaAudioDataSource", "[getSize] inputStream is null");
        return 0;
    }

    public int readAt(long j, byte[] bArr, int i, int i2) {
        if (this.f253667f == null) {
            Log.m105920e("MicroMsg.WxaAudioDataSource", "[readAt]inputstream is null");
            return -1;
        } else if (bArr == null || bArr.length <= 0) {
            Log.m105920e("MicroMsg.WxaAudioDataSource", "[readAt]bytes is null");
            return -1;
        } else if (j < 0 || i < 0 || i2 <= 0) {
            Log.m105921e("MicroMsg.WxaAudioDataSource", "position:%d, offset:%d, size:%d", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2));
            return -1;
        } else if (i + i2 > bArr.length) {
            Log.m105921e("MicroMsg.WxaAudioDataSource", "offset:%d, size:%d, bytes.length:%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bArr.length));
            return -1;
        } else {
            if (((long) i2) + j > getSize()) {
                Log.m105921e("MicroMsg.WxaAudioDataSource", "position:%d, size:%d, getSize():%d", Long.valueOf(j), Integer.valueOf(i2), Long.valueOf(getSize()));
            }
            if (this.f253668g != j) {
                this.f253667f.mo124214b((int) j);
                this.f253668g = j;
            }
            int read = this.f253667f.read(bArr, i, i2);
            if (read >= 0) {
                this.f253668g += (long) read;
            }
            return read;
        }
    }
}
