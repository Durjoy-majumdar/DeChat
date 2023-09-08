package jn0;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.io.IOException;
import java.io.InputStream;
import p300c8.C79946g;
import p300c8.C79949i;
import p300c8.C79950j;
import p333e8.C20528a;

/* renamed from: jn0.b */
public final class C87990b extends InputStream {

    /* renamed from: d */
    public final C79946g f254592d;

    /* renamed from: e */
    public final Uri f254593e;

    /* renamed from: f */
    public final byte[] f254594f = new byte[1];

    /* renamed from: g */
    public long f254595g;

    /* renamed from: h */
    public long f254596h;

    /* renamed from: i */
    public InputStream f254597i;

    /* renamed from: j */
    public boolean f254598j;

    public C87990b(C79946g gVar, Uri uri) {
        C87412m.m108594g(gVar, "dataSource");
        C87412m.m108594g(uri, "uri");
        this.f254592d = gVar;
        this.f254593e = uri;
    }

    /* renamed from: a */
    public final InputStream mo122439a() {
        InputStream inputStream = this.f254597i;
        long j = this.f254595g;
        long j2 = this.f254596h;
        StringBuilder sb = new StringBuilder();
        sb.append("requireInputStream, curInputStream is ");
        sb.append(inputStream == null ? "null" : "not null");
        sb.append(", curReadPos: ");
        sb.append(j);
        sb.append(", expectReadLen: ");
        sb.append(j2);
        Log.m105918d("MicroMsg.AppBrand.RealInferContentTypeInputStream", sb.toString());
        if (inputStream != null) {
            return inputStream;
        }
        if (32768 <= j) {
            Log.m105924i("MicroMsg.AppBrand.RealInferContentTypeInputStream", "requireInputStream, reach max read length");
            return null;
        } else if (j < j2) {
            Log.m105924i("MicroMsg.AppBrand.RealInferContentTypeInputStream", "requireInputStream, end of file");
            return null;
        } else {
            this.f254596h = j;
            C79949i iVar = new C79949i(this.f254592d, new C79950j(this.f254593e, j, 1024, (String) null));
            this.f254597i = iVar;
            this.f254596h += 1024;
            return iVar;
        }
    }

    public void close() {
        Log.m105918d("MicroMsg.AppBrand.RealInferContentTypeInputStream", "close");
        if (!this.f254598j) {
            InputStream inputStream = this.f254597i;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f254597i = null;
            this.f254595g = 0;
            this.f254598j = true;
        }
    }

    public int read() {
        Log.m105918d("MicroMsg.AppBrand.RealInferContentTypeInputStream", "read");
        if (-1 == read(this.f254594f)) {
            return -1;
        }
        return this.f254594f[0];
    }

    public int read(byte[] bArr) {
        Log.m105918d("MicroMsg.AppBrand.RealInferContentTypeInputStream", "read([B)");
        C20528a.m22240d(!this.f254598j);
        InputStream a = mo122439a();
        if (a == null) {
            return -1;
        }
        try {
            int read = a.read(bArr);
            if (-1 == read) {
                InputStream inputStream = this.f254597i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f254597i = null;
                return read(bArr);
            }
            this.f254595g += (long) read;
            return read;
        } catch (IOException e) {
            Log.m105924i("MicroMsg.AppBrand.RealInferContentTypeInputStream", "read([B), fail since " + e);
            throw e;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        Log.m105918d("MicroMsg.AppBrand.RealInferContentTypeInputStream", "read([BII), off: " + i + ", len: " + i2);
        C20528a.m22240d(this.f254598j ^ true);
        InputStream a = mo122439a();
        if (a == null) {
            return -1;
        }
        try {
            int read = a.read(bArr, i, i2);
            if (-1 == read) {
                InputStream inputStream = this.f254597i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f254597i = null;
                return read(bArr, i, i2);
            }
            this.f254595g += (long) read;
            return read;
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.AppBrand.RealInferContentTypeInputStream", e, "read([BII), fail", new Object[0]);
            throw e;
        }
    }
}
