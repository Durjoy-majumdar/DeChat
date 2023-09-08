package ea2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection;
import java.net.URL;
import java.util.HashMap;
import nb0.C88912b;
import p366nh.C21631b;

/* renamed from: ea2.d */
public class C20559d extends C21631b {

    /* renamed from: a */
    public IMediaHTTPConnection f57846a;

    /* renamed from: b */
    public C88912b f57847b;

    public C20559d(IMediaHTTPConnection iMediaHTTPConnection, C88912b bVar) {
        this.f57846a = iMediaHTTPConnection;
        this.f57847b = bVar;
    }

    /* renamed from: a */
    public C88912b mo32136a() {
        return this.f57847b;
    }

    /* renamed from: b */
    public String mo32137b() {
        IMediaHTTPConnection iMediaHTTPConnection = this.f57846a;
        if (iMediaHTTPConnection != null) {
            return iMediaHTTPConnection.getMIMEType();
        }
        return null;
    }

    public void connect() {
        if (this.f57846a != null) {
            URL url = null;
            try {
                url = new URL(this.f57847b.f256417b);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Audio.AudioHttpDownloadSource", e, "connect", new Object[0]);
            }
            this.f57846a.connect(url, new HashMap());
        }
    }

    public void disconnect() {
        IMediaHTTPConnection iMediaHTTPConnection = this.f57846a;
        if (iMediaHTTPConnection != null) {
            iMediaHTTPConnection.disconnect();
        }
    }

    public long getSize() {
        IMediaHTTPConnection iMediaHTTPConnection = this.f57846a;
        if (iMediaHTTPConnection != null) {
            return iMediaHTTPConnection.getSize();
        }
        return -1;
    }

    public int readAt(long j, byte[] bArr, int i, int i2) {
        IMediaHTTPConnection iMediaHTTPConnection = this.f57846a;
        if (iMediaHTTPConnection != null) {
            return iMediaHTTPConnection.readAt(j, bArr, i, i2);
        }
        return -1;
    }
}
