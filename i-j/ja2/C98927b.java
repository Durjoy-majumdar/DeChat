package ja2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.music.player.base.C94221e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.downloadservice.ByteRange;
import ha2.C98329e;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import la2.C99355b;
import la2.C99357e;
import la2.C99364n;
import qc0.C101106m;
import sa2.C101563e;
import sa2.C101566f;
import sa2.C36649g;
import ua2.C101991b;
import za2.C102984b;

/* renamed from: ja2.b */
public class C98927b implements Runnable {

    /* renamed from: d */
    public String f289989d = null;

    /* renamed from: e */
    public C101106m f289990e;

    /* renamed from: f */
    public C98926a f289991f;

    /* renamed from: g */
    public float f289992g;

    /* renamed from: h */
    public long f289993h = 307200;

    /* renamed from: i */
    public boolean f289994i;

    /* renamed from: j */
    public boolean f289995j;

    /* renamed from: n */
    public String f289996n;

    /* renamed from: o */
    public int f289997o;

    /* renamed from: p */
    public int f289998p;

    /* renamed from: q */
    public C98929b f289999q;

    /* renamed from: ja2.b$a */
    public class C98928a implements Runnable {

        /* renamed from: d */
        public int f290000d;

        public C98928a(int i) {
            this.f290000d = i;
        }

        public void run() {
            C98929b bVar = C98927b.this.f289999q;
            if (bVar != null) {
                int i = this.f290000d;
                C101563e.C101565b bVar2 = (C101563e.C101565b) bVar;
                if (i == 1) {
                    C101563e eVar = C101563e.this;
                    C98927b bVar3 = eVar.f297325s;
                    if (bVar3 != null && !eVar.f297328v && eVar.f297324r != null) {
                        C101563e.this.f297324r.mo129534j(C102984b.m136167d(bVar3.f289990e.f295960e, bVar3.f289994i));
                        C101563e eVar2 = C101563e.this;
                        if (eVar2.mo141035z()) {
                            Log.m105924i("MicroMsg.Music.MusicPlayer", "startPlay");
                            try {
                                C94221e eVar3 = eVar2.f297324r;
                                if (eVar3 != null) {
                                    eVar3.mo129532h();
                                }
                            } catch (Exception e) {
                                Log.printErrStackTrace("MicroMsg.Music.MusicPlayer", e, "startPlay", new Object[0]);
                            }
                            eVar2.f297328v = true;
                            eVar2.f297326t = false;
                            return;
                        }
                        Log.m105920e("MicroMsg.Music.MusicPlayer", "request focus error");
                        return;
                    }
                    return;
                }
                bVar2.getClass();
                if (i == -2 || i == 5 || i == 19) {
                    MMHandlerThread.postToMainThread(new C101566f(bVar2, i));
                } else if (i == -1 || i == 6 || i == 4) {
                    MMHandlerThread.postToMainThread(new C36649g(bVar2));
                    C101563e eVar4 = C101563e.this;
                    C101563e.m133349C(eVar4, eVar4.f297323q, i);
                }
            }
        }
    }

    /* renamed from: ja2.b$b */
    public interface C98929b {
    }

    public C98927b(C101106m mVar, C98926a aVar) {
        boolean z = true;
        this.f289995j = true;
        this.f289996n = "";
        this.f289997o = -1;
        this.f289998p = 0;
        this.f289990e = mVar;
        this.f289991f = aVar;
        if ((!((aVar.f289982a > 0 ? 1 : (aVar.f289982a == 0 ? 0 : -1)) == 0 && (aVar.f289983b > 0 ? 1 : (aVar.f289983b == 0 ? 0 : -1)) == 0 && aVar.f289984c == 0) || !((aVar.f289985d > 0 ? 1 : (aVar.f289985d == 0 ? 0 : -1)) == 0 && (aVar.f289987f > 0 ? 1 : (aVar.f289987f == 0 ? 0 : -1)) == 0 && aVar.f289986e == 0)) ? false : z) {
            Log.m105920e("MicroMsg.Music.MusicDownloadTask", "downloadInfo is invalid");
        } else {
            Log.m105924i("MicroMsg.Music.MusicDownloadTask", "downloadInfo is valid");
        }
        this.f289994i = NetStatusUtil.isWifi(MMApplicationContext.getContext());
    }

    /* renamed from: a */
    public final long[] mo138264a(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        try {
            String[] split = str.replace(ByteRange.BYTES_UNIT, "").trim().split("-");
            long longValue = Long.valueOf(split[0]).longValue();
            String[] split2 = split[1].split("/");
            return new long[]{longValue, Long.valueOf(split2[0]).longValue(), Long.valueOf(split2[1]).longValue()};
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final HttpURLConnection mo138265b(String str, Map<String, String> map) {
        boolean z;
        if (!TextUtils.isEmpty(this.f289989d)) {
            Log.m105924i("MicroMsg.Music.MusicDownloadTask", "use previous temp redirect URL to download , avoid to request source url and than redirect to 302 resp code");
            str = this.f289989d;
        }
        HttpURLConnection httpURLConnection = null;
        int i = 0;
        while (true) {
            if (httpURLConnection != null) {
                try {
                    httpURLConnection.getInputStream().close();
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.Music.MusicDownloadTask", e.getMessage());
                }
                httpURLConnection.disconnect();
            }
            Log.m105925i("MicroMsg.Music.MusicDownloadTask", "getUrlConnect, downloadUrl:%s", str);
            C99355b m = C99364n.m129618m();
            URL url = new URL(str);
            String host = url.getHost();
            if (m == null || (url = m.mo138775M(str)) == null || str.equalsIgnoreCase(url.toString())) {
                z = false;
            } else {
                Log.m105925i("MicroMsg.Music.MusicDownloadTask", "getRedirectURL, srcUrl:%s", url.toString());
                z = true;
            }
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
            httpURLConnection2.setRequestMethod("GET");
            httpURLConnection2.setConnectTimeout(25000);
            httpURLConnection2.setInstanceFollowRedirects(false);
            for (Map.Entry next : map.entrySet()) {
                httpURLConnection2.setRequestProperty((String) next.getKey(), (String) next.getValue());
            }
            if (z && !TextUtils.isEmpty(host)) {
                httpURLConnection2.setRequestProperty("Host", host);
                Log.m105925i("MicroMsg.Music.MusicDownloadTask", "use host :%s", host);
            }
            int responseCode = httpURLConnection2.getResponseCode();
            Log.m105925i("MicroMsg.Music.MusicDownloadTask", "getUrlConnect response:%d, redirectCount:%d", Integer.valueOf(responseCode), Integer.valueOf(i));
            if (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307) {
                C99357e eVar = (C99357e) C101991b.m134284b(C99357e.class);
                if (eVar != null) {
                    eVar.mo138802e0(responseCode);
                }
                String requestMethod = httpURLConnection2.getRequestMethod();
                if (responseCode == 307 && !requestMethod.equals("GET") && !requestMethod.equals("HEAD")) {
                    return httpURLConnection2;
                }
                String headerField = httpURLConnection2.getHeaderField("Location");
                if (headerField == null) {
                    Log.m105921e("MicroMsg.Music.MusicDownloadTask", "Invalid redirect,  response:%d", Integer.valueOf(responseCode));
                    return httpURLConnection2;
                }
                URL url2 = new URL(httpURLConnection2.getURL(), headerField);
                Log.m105925i("MicroMsg.Music.MusicDownloadTask", "location:%s", headerField);
                Log.m105925i("MicroMsg.Music.MusicDownloadTask", "tempUrl:%s", url2.toString());
                if (url2.getProtocol().equals(C113600ck.f339986i) || url2.getProtocol().equals("http")) {
                    i++;
                    if (i > 5) {
                        Log.m105920e("MicroMsg.Music.MusicDownloadTask", "Too many redirects: " + i);
                        return httpURLConnection2;
                    }
                    str = url2.toString();
                    this.f289989d = str;
                    httpURLConnection = httpURLConnection2;
                } else {
                    Log.m105921e("MicroMsg.Music.MusicDownloadTask", "Unsupported protocol redirect,  response:%d", Integer.valueOf(responseCode));
                    return httpURLConnection2;
                }
            } else {
                if (!(responseCode == 200 || responseCode == 206)) {
                    this.f289989d = null;
                }
                return httpURLConnection2;
            }
        }
    }

    /* renamed from: c */
    public final void mo138266c(long j) {
        if (this.f289994i) {
            C98926a aVar = this.f289991f;
            aVar.f289985d = j;
            aVar.f289986e = 1;
            aVar.f289987f = j;
            C98329e.m127109e(this.f289990e.f295960e, aVar);
        } else {
            C98926a aVar2 = this.f289991f;
            aVar2.f289982a = j;
            aVar2.f289984c = 1;
            aVar2.f289983b = j;
            C98329e.m127109e(this.f289990e.f295960e, aVar2);
        }
        MMHandlerThread.postToMainThread(new C98928a(2));
    }

    /* renamed from: d */
    public final void mo138267d(int i) {
        this.f289989d = null;
        MMHandlerThread.postToMainThread(new C98928a(i));
    }

    /* renamed from: e */
    public final void mo138268e(long j, long j2) {
        if (this.f289994i) {
            C98926a aVar = this.f289991f;
            aVar.f289985d = j;
            aVar.f289986e = 0;
            aVar.f289987f = j2;
            C98329e.m127109e(this.f289990e.f295960e, aVar);
        } else {
            C98926a aVar2 = this.f289991f;
            aVar2.f289982a = j;
            aVar2.f289984c = 0;
            aVar2.f289983b = j2;
            C98329e.m127109e(this.f289990e.f295960e, aVar2);
        }
        MMHandlerThread.postToMainThread(new C98928a(3));
    }

    /* renamed from: f */
    public final void mo138269f(long j, long j2) {
        Log.m105927v("MicroMsg.Music.MusicDownloadTask", "update updateCurrentDownloadLength %d %d", Long.valueOf(j), Long.valueOf(j2));
        if (this.f289994i) {
            C98926a aVar = this.f289991f;
            aVar.f289985d = j;
            aVar.f289987f = j2;
            return;
        }
        C98926a aVar2 = this.f289991f;
        aVar2.f289982a = j;
        aVar2.f289983b = j2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v53, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v7, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v54, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v8, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v55, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v9, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v59, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v10, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v81, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v42, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v11, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v12, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v104, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v123, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v13, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v70, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v125, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v73, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v86, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v137, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v138, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v87, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v15, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v88, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v16, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v17, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v89, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v140, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v141, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v92, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v143, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v19, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v22, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v33, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v35, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v25, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v37, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v38, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v40, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v41, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v154, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v42, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v107, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v155, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v156, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v43, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v110, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v157, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v44, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v45, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v46, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v47, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v48, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v49, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v50, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v165, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v51, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v123, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v166, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v52, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v124, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v167, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v168, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v53, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v169, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v54, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v170, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v55, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v171, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v56, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v172, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v129, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v173, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v58, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v130, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v131, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v174, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v62, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v63, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v136, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v65, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v137, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v178, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v66, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v138, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v179, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v180, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v139, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v27, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v68, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v140, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v181, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v141, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v69, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v183, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v142, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v70, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v71, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v72, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v73, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v145, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v28, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v75, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v147, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v187, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v76, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v148, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v77, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v151, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v152, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v194, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v153, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v195, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v160, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v202, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v29, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v30, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v31, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v164, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v165, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v32, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v170, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v171, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v172, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v218, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v173, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v33, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v34, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v35, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v36, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v37, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v178, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v179, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v39, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v40, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v41, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v42, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v43, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v180, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v45, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v46, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v47, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v48, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v49, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v50, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v185, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v52, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v53, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v54, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v55, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v56, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v57, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v58, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v59, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v60, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v61, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v62, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v63, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v65, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v66, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v67, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v29, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v279, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v208, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v280, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v210, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v216, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v285, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v287, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v288, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v311, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v312, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v314, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v69, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v71, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v73, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v242, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v319, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v245, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v325, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v326, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v247, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v248, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v328, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v83, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v84, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v85, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v86, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v35, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v338, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v87, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v258, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v90, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v91, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v92, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v93, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v264, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v94, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v103, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v104, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v105, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v106, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v282, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v107, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v352, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v110, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v353, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v111, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v354, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v112, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v355, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v113, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v356, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v288, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v357, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v289, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v115, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v358, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v290, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v362, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v121, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v296, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v301, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v369, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v39, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v40, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r30v41 */
    /* JADX WARNING: type inference failed for: r30v42 */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0c9d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0c9e, code lost:
        r34 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0cb7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0cb8, code lost:
        r34 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0cc7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0cc8, code lost:
        r34 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0ccb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0ccc, code lost:
        r34 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0ccf, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0cd0, code lost:
        r34 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x0cd4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0cd5, code lost:
        r34 = r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:524:0x0cb7 A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:267:0x0720] */
    /* JADX WARNING: Removed duplicated region for block: B:529:0x0cc7 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:267:0x0720] */
    /* JADX WARNING: Removed duplicated region for block: B:531:0x0ccb A[ExcHandler: UnknownServiceException (e java.net.UnknownServiceException), Splitter:B:267:0x0720] */
    /* JADX WARNING: Removed duplicated region for block: B:533:0x0ccf A[ExcHandler: NoRouteToHostException (e java.net.NoRouteToHostException), Splitter:B:267:0x0720] */
    /* JADX WARNING: Removed duplicated region for block: B:535:0x0cd4 A[ExcHandler: ProtocolException (e java.net.ProtocolException), Splitter:B:267:0x0720] */
    /* JADX WARNING: Removed duplicated region for block: B:638:0x1039  */
    /* JADX WARNING: Removed duplicated region for block: B:646:0x105c  */
    /* JADX WARNING: Removed duplicated region for block: B:658:0x10ac A[SYNTHETIC, Splitter:B:658:0x10ac] */
    /* JADX WARNING: Removed duplicated region for block: B:663:0x10bc A[SYNTHETIC, Splitter:B:663:0x10bc] */
    /* JADX WARNING: Removed duplicated region for block: B:668:0x10ca A[SYNTHETIC, Splitter:B:668:0x10ca] */
    /* JADX WARNING: Removed duplicated region for block: B:685:0x111e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:693:0x1141  */
    /* JADX WARNING: Removed duplicated region for block: B:705:0x1193 A[SYNTHETIC, Splitter:B:705:0x1193] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01dc A[SYNTHETIC, Splitter:B:70:0x01dc] */
    /* JADX WARNING: Removed duplicated region for block: B:710:0x11a3 A[SYNTHETIC, Splitter:B:710:0x11a3] */
    /* JADX WARNING: Removed duplicated region for block: B:715:0x11b1 A[SYNTHETIC, Splitter:B:715:0x11b1] */
    /* JADX WARNING: Removed duplicated region for block: B:730:0x11f8  */
    /* JADX WARNING: Removed duplicated region for block: B:738:0x121b  */
    /* JADX WARNING: Removed duplicated region for block: B:750:0x126d A[SYNTHETIC, Splitter:B:750:0x126d] */
    /* JADX WARNING: Removed duplicated region for block: B:755:0x127d A[SYNTHETIC, Splitter:B:755:0x127d] */
    /* JADX WARNING: Removed duplicated region for block: B:760:0x128b A[SYNTHETIC, Splitter:B:760:0x128b] */
    /* JADX WARNING: Removed duplicated region for block: B:777:0x12dc  */
    /* JADX WARNING: Removed duplicated region for block: B:785:0x12ff  */
    /* JADX WARNING: Removed duplicated region for block: B:797:0x1351 A[SYNTHETIC, Splitter:B:797:0x1351] */
    /* JADX WARNING: Removed duplicated region for block: B:802:0x1361 A[SYNTHETIC, Splitter:B:802:0x1361] */
    /* JADX WARNING: Removed duplicated region for block: B:807:0x136f A[SYNTHETIC, Splitter:B:807:0x136f] */
    /* JADX WARNING: Removed duplicated region for block: B:828:0x13ce  */
    /* JADX WARNING: Removed duplicated region for block: B:836:0x13f1  */
    /* JADX WARNING: Removed duplicated region for block: B:848:0x1443 A[SYNTHETIC, Splitter:B:848:0x1443] */
    /* JADX WARNING: Removed duplicated region for block: B:853:0x1453 A[SYNTHETIC, Splitter:B:853:0x1453] */
    /* JADX WARNING: Removed duplicated region for block: B:858:0x1461 A[SYNTHETIC, Splitter:B:858:0x1461] */
    /* JADX WARNING: Removed duplicated region for block: B:873:0x1499  */
    /* JADX WARNING: Removed duplicated region for block: B:881:0x14bc  */
    /* JADX WARNING: Removed duplicated region for block: B:893:0x150c A[SYNTHETIC, Splitter:B:893:0x150c] */
    /* JADX WARNING: Removed duplicated region for block: B:898:0x151a A[SYNTHETIC, Splitter:B:898:0x151a] */
    /* JADX WARNING: Removed duplicated region for block: B:903:0x1528 A[SYNTHETIC, Splitter:B:903:0x1528] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r40 = this;
            r1 = r40
            java.lang.String r2 = "user-agent"
            java.lang.String r3 = " download  music file fail, :%s"
            java.lang.String r4 = " music is close fail"
            java.lang.String r5 = "stop download music task"
            java.lang.String r6 = "download end, total=%d, downloadLength=%d"
            java.lang.String r7 = "not download end, total=%d, downloadLength=%d"
            java.lang.String r8 = "not find status"
            java.lang.String r9 = "can not get contentLen, but download end"
            java.lang.String r10 = " music raf close fail"
            boolean r11 = r1.f289995j
            if (r11 == 0) goto L_0x001d
            return
        L_0x001d:
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r11 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isNetworkConnected(r11)
            r12 = 0
            r1.f289998p = r12
            r1.f289997o = r12
            la2.b r13 = la2.C99364n.m129618m()
            java.lang.String r14 = "can start play"
            java.lang.String r15 = "MicroMsg.Music.MusicDownloadTask"
            r17 = 1041865114(0x3e19999a, float:0.15)
            r18 = r13
            if (r11 == 0) goto L_0x1543
            boolean r11 = r1.f289994i
            r22 = 4
            java.lang.String r13 = "downloadUrl:%s"
            r24 = 0
            if (r11 == 0) goto L_0x00b9
            qc0.m r11 = r1.f289990e
            java.lang.String r11 = r11.f295955Q
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.String, java.lang.Boolean> r12 = ha2.C32752h.f89140b
            boolean r12 = r12.check(r11)
            if (r12 == 0) goto L_0x005c
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.String, java.lang.Boolean> r12 = ha2.C32752h.f89140b
            java.lang.Object r11 = r12.get(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            goto L_0x005d
        L_0x005c:
            r11 = 0
        L_0x005d:
            if (r18 == 0) goto L_0x006e
            qc0.m r12 = r1.f289990e
            java.lang.String r12 = r12.f295955Q
            r26 = r11
            r11 = r18
            java.lang.String r11 = r11.mo138782d(r12)
            r18 = r3
            goto L_0x0074
        L_0x006e:
            r26 = r11
            r18 = r3
            r11 = r24
        L_0x0074:
            r12 = 1
            java.lang.Object[] r3 = new java.lang.Object[r12]
            r12 = 0
            r3[r12] = r11
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r13, r3)
            ja2.a r3 = r1.f289991f
            long r12 = r3.f289985d
            r27 = r10
            r28 = r11
            long r10 = r3.f289987f
            r20 = 0
            int r29 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r29 == 0) goto L_0x0096
            r29 = r4
            r30 = r5
            long r4 = r10 / r22
            r1.f289993h = r4
            goto L_0x009a
        L_0x0096:
            r29 = r4
            r30 = r5
        L_0x009a:
            long r4 = r1.f289993h
            int r22 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r22 >= 0) goto L_0x00a1
            goto L_0x00a7
        L_0x00a1:
            float r4 = (float) r12
            float r5 = (float) r10
            float r5 = r5 * r17
            float r4 = r4 + r5
            long r4 = (long) r4
        L_0x00a7:
            int r3 = r3.f289986e
            r22 = r4
            r4 = 1
            if (r3 != r4) goto L_0x00b0
            r3 = 1
            goto L_0x00b1
        L_0x00b0:
            r3 = 0
        L_0x00b1:
            r31 = r22
            r22 = r12
            r12 = r3
            r3 = r28
            goto L_0x010e
        L_0x00b9:
            r29 = r4
            r30 = r5
            r27 = r10
            r11 = r18
            r4 = 1
            r18 = r3
            if (r11 == 0) goto L_0x00d0
            qc0.m r3 = r1.f289990e
            java.lang.String r3 = r3.f295955Q
            java.lang.String r3 = r11.mo138782d(r3)
            r11 = r3
            goto L_0x00d2
        L_0x00d0:
            r11 = r24
        L_0x00d2:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r4 = 0
            r3[r4] = r11
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r13, r3)
            ja2.a r3 = r1.f289991f
            long r4 = r3.f289982a
            long r12 = r3.f289983b
            r20 = 0
            int r10 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r10 == 0) goto L_0x00ed
            r26 = r11
            long r10 = r12 / r22
            r1.f289993h = r10
            goto L_0x00ef
        L_0x00ed:
            r26 = r11
        L_0x00ef:
            long r10 = r1.f289993h
            int r22 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r22 >= 0) goto L_0x00f6
            goto L_0x00fc
        L_0x00f6:
            float r10 = (float) r4
            float r11 = (float) r12
            float r11 = r11 * r17
            float r10 = r10 + r11
            long r10 = (long) r10
        L_0x00fc:
            int r3 = r3.f289984c
            r22 = r4
            r4 = 1
            if (r3 != r4) goto L_0x0105
            r3 = 1
            goto L_0x0106
        L_0x0105:
            r3 = 0
        L_0x0106:
            r31 = r10
            r10 = r12
            r12 = r3
            r3 = r26
            r26 = 0
        L_0x010e:
            long r4 = r1.f289993h
            r17 = r12
            r12 = 256000(0x3e800, double:1.26481E-318)
            int r28 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r28 >= 0) goto L_0x0121
            r1.f289993h = r12
            java.lang.String r4 = "music firstTimeDownloadSize is less than startPlayLength, update firstTimeDownloadSize"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r4)
        L_0x0121:
            com.tencent.mm.vfs.m1 r4 = new com.tencent.mm.vfs.m1
            qc0.m r5 = r1.f289990e
            java.lang.String r5 = r5.f295960e
            boolean r12 = r1.f289994i
            java.lang.String r5 = za2.C102984b.m136167d(r5, r12)
            r4.<init>((java.lang.String) r5)
            boolean r5 = r4.mo119967g()
            if (r5 != 0) goto L_0x017a
            boolean r5 = r4.mo119964e()     // Catch:{ IOException -> 0x0151 }
            java.lang.String r12 = "create file:%b"
            r28 = r2
            r13 = 1
            java.lang.Object[] r2 = new java.lang.Object[r13]     // Catch:{ IOException -> 0x014f }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ IOException -> 0x014f }
            r13 = 0
            r2[r13] = r5     // Catch:{ IOException -> 0x014f }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r12, r2)     // Catch:{ IOException -> 0x014f }
            r5 = 1
            r16 = 0
            goto L_0x0165
        L_0x014f:
            r0 = move-exception
            goto L_0x0154
        L_0x0151:
            r0 = move-exception
            r28 = r2
        L_0x0154:
            r2 = r0
            r5 = 1
            java.lang.Object[] r12 = new java.lang.Object[r5]
            java.lang.String r13 = r4.mo119971i()
            r16 = 0
            r12[r16] = r13
            java.lang.String r13 = " createNewFile fail, path:%s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r2, r13, r12)
        L_0x0165:
            long r12 = r1.f289993h
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Long r5 = java.lang.Long.valueOf(r12)
            r2[r16] = r5
            java.lang.String r5 = "music file delete and create again %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r5, r2)
            r17 = 0
            r22 = 0
            goto L_0x0180
        L_0x017a:
            r28 = r2
            r16 = 0
            r12 = r31
        L_0x0180:
            r2 = 3
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Long r31 = java.lang.Long.valueOf(r22)
            r5[r16] = r31
            long r31 = r4.mo119980r()
            java.lang.Long r31 = java.lang.Long.valueOf(r31)
            r25 = 1
            r5[r25] = r31
            java.lang.Long r31 = java.lang.Long.valueOf(r12)
            r2 = 2
            r5[r2] = r31
            java.lang.String r2 = "downloadLength=%d musicFile.Length=%d endRange=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r2, r5)
            r33 = r12
            long r12 = r1.f289993h
            r2 = r6
            r5 = r22
            int r22 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r22 < 0) goto L_0x01b3
            float r12 = r1.f289992g
            r13 = 0
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 == 0) goto L_0x01b5
        L_0x01b3:
            if (r17 == 0) goto L_0x01c4
        L_0x01b5:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r14)
            r12 = 1
            r1.f289995j = r12
            ja2.b$a r2 = new ja2.b$a
            r2.<init>(r12)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
            return
        L_0x01c4:
            r12 = 1
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r13 == 0) goto L_0x01dc
            java.lang.String r2 = "downloadUrl is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r2)
            r1.f289995j = r12
            ja2.b$a r2 = new ja2.b$a
            r3 = -2
            r2.<init>(r3)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
            return
        L_0x01dc:
            boolean r14 = r4.mo119967g()     // Catch:{ ProtocolException -> 0x1393, NoRouteToHostException -> 0x12a2, UnknownServiceException -> 0x11be, IOException -> 0x10e7, Exception -> 0x1001, all -> 0x0fe3 }
            if (r14 != 0) goto L_0x02e1
            r1.f289995j = r12     // Catch:{ ProtocolException -> 0x02cb, NoRouteToHostException -> 0x02b4, UnknownServiceException -> 0x029d, IOException -> 0x0289, Exception -> 0x0275, all -> 0x025f }
            java.lang.String r3 = "create fail or musicFile not exist, musicFile:%s"
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch:{ ProtocolException -> 0x02cb, NoRouteToHostException -> 0x02b4, UnknownServiceException -> 0x029d, IOException -> 0x0289, Exception -> 0x0275, all -> 0x025f }
            java.lang.String r12 = r4.mo119971i()     // Catch:{ ProtocolException -> 0x02cb, NoRouteToHostException -> 0x02b4, UnknownServiceException -> 0x029d, IOException -> 0x0289, Exception -> 0x0275, all -> 0x025f }
            r16 = 0
            r14[r16] = r12     // Catch:{ ProtocolException -> 0x02cb, NoRouteToHostException -> 0x02b4, UnknownServiceException -> 0x029d, IOException -> 0x0289, Exception -> 0x0275, all -> 0x025f }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r3, r14)     // Catch:{ ProtocolException -> 0x02cb, NoRouteToHostException -> 0x02b4, UnknownServiceException -> 0x029d, IOException -> 0x0289, Exception -> 0x0275, all -> 0x025f }
            r3 = 19
            r1.mo138267d(r3)     // Catch:{ ProtocolException -> 0x02cb, NoRouteToHostException -> 0x02b4, UnknownServiceException -> 0x029d, IOException -> 0x0289, Exception -> 0x0275, all -> 0x025f }
            r3 = 0
            int r12 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r12 != 0) goto L_0x0207
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 > 0) goto L_0x0203
            goto L_0x0207
        L_0x0203:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r9)
            throw r24
        L_0x0207:
            if (r12 == 0) goto L_0x0226
            int r3 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x0226
            r3 = 2
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            r4 = 0
            r2[r4] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r4 = 1
            r2[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r7, r2)
            r1.mo138268e(r5, r10)
            r7 = 1
            goto L_0x0257
        L_0x0226:
            if (r12 == 0) goto L_0x0253
            int r3 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x0253
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            r7 = 0
            r3[r7] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r5)
            r7 = 1
            r3[r7] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r2, r3)
            r1.mo138266c(r10)
            r2 = 256000(0x3e800, double:1.26481E-318)
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0257
            ja2.b$a r2 = new ja2.b$a
            r2.<init>(r7)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
            goto L_0x0257
        L_0x0253:
            r7 = 1
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r8)
        L_0x0257:
            r1.f289995j = r7
            r12 = r30
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r12)
            return
        L_0x025f:
            r0 = move-exception
            r12 = r30
            r3 = r0
            r4 = r12
            r13 = r24
            r34 = r13
            r14 = r27
            r17 = 0
            r12 = r2
            r2 = r8
            r8 = r3
            r3 = r7
        L_0x0270:
            r6 = r5
            r5 = r29
            goto L_0x1491
        L_0x0275:
            r0 = move-exception
            r12 = r30
            r3 = r0
            r22 = r4
            r4 = r12
            r14 = r27
            r13 = r29
            r12 = r2
            r2 = r8
            r37 = r7
            r7 = r3
            r3 = r37
            goto L_0x100f
        L_0x0289:
            r0 = move-exception
            r12 = r30
            r3 = r0
            r22 = r4
            r30 = r12
            r4 = r18
            r14 = r27
            r12 = r2
            r2 = r8
            r8 = r3
            r3 = r7
            r7 = r29
            goto L_0x10f4
        L_0x029d:
            r0 = move-exception
            r12 = r30
            r3 = r0
            r22 = r4
            r30 = r12
            r4 = r18
            r14 = r27
            r13 = r29
            r12 = r2
            r2 = r8
            r37 = r7
            r7 = r3
            r3 = r37
            goto L_0x11cb
        L_0x02b4:
            r0 = move-exception
            r12 = r30
            r3 = r0
            r22 = r4
            r30 = r12
            r4 = r18
            r14 = r27
            r13 = r29
            r12 = r2
            r2 = r8
            r37 = r7
            r7 = r3
            r3 = r37
            goto L_0x12af
        L_0x02cb:
            r0 = move-exception
            r12 = r30
            r3 = r0
            r22 = r4
            r4 = r18
            r14 = r27
            r13 = r29
            r37 = r12
            r12 = r2
            r2 = r8
            r8 = r3
            r3 = r7
            r7 = r37
            goto L_0x13a2
        L_0x02e1:
            r12 = r30
            java.lang.String r14 = r4.mo119976n()     // Catch:{ ProtocolException -> 0x0fbc, NoRouteToHostException -> 0x0f95, UnknownServiceException -> 0x0f6e, IOException -> 0x0f51, Exception -> 0x0f43, all -> 0x0f38 }
            r13 = 1
            java.io.RandomAccessFile r14 = com.tencent.p014mm.vfs.C86013q1.m106420B(r14, r13)     // Catch:{ ProtocolException -> 0x0fbc, NoRouteToHostException -> 0x0f95, UnknownServiceException -> 0x0f6e, IOException -> 0x0f51, Exception -> 0x0f43, all -> 0x0f38 }
            java.lang.String r13 = "create connection %s"
            r22 = r4
            r30 = r12
            r4 = 1
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ ProtocolException -> 0x0ea9, NoRouteToHostException -> 0x0e9c, UnknownServiceException -> 0x0e8f, IOException -> 0x0e82, Exception -> 0x0e75, all -> 0x0e68 }
            r4 = 0
            r12[r4] = r3     // Catch:{ ProtocolException -> 0x0ea9, NoRouteToHostException -> 0x0e9c, UnknownServiceException -> 0x0e8f, IOException -> 0x0e82, Exception -> 0x0e75, all -> 0x0e68 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r13, r12)     // Catch:{ ProtocolException -> 0x0ea9, NoRouteToHostException -> 0x0e9c, UnknownServiceException -> 0x0e8f, IOException -> 0x0e82, Exception -> 0x0e75, all -> 0x0e68 }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ ProtocolException -> 0x0ea9, NoRouteToHostException -> 0x0e9c, UnknownServiceException -> 0x0e8f, IOException -> 0x0e82, Exception -> 0x0e75, all -> 0x0e68 }
            r12 = 10
            r4.<init>(r12)     // Catch:{ ProtocolException -> 0x0ea9, NoRouteToHostException -> 0x0e9c, UnknownServiceException -> 0x0e8f, IOException -> 0x0e82, Exception -> 0x0e75, all -> 0x0e68 }
            java.lang.String r12 = "Accept-Encoding"
            java.lang.String r13 = "gzip, deflate"
            r4.put(r12, r13)     // Catch:{ ProtocolException -> 0x0ea9, NoRouteToHostException -> 0x0e9c, UnknownServiceException -> 0x0e8f, IOException -> 0x0e82, Exception -> 0x0e75, all -> 0x0e68 }
            int r12 = (r33 > r5 ? 1 : (r33 == r5 ? 0 : -1))
            if (r12 <= 0) goto L_0x039c
            java.lang.String r12 = "range : %d-%d"
            r23 = r8
            r13 = 2
            java.lang.Object[] r8 = new java.lang.Object[r13]     // Catch:{ ProtocolException -> 0x0362, NoRouteToHostException -> 0x035e, UnknownServiceException -> 0x035a, IOException -> 0x0356, Exception -> 0x0351, all -> 0x034d }
            java.lang.Long r13 = java.lang.Long.valueOf(r5)     // Catch:{ ProtocolException -> 0x0362, NoRouteToHostException -> 0x035e, UnknownServiceException -> 0x035a, IOException -> 0x0356, Exception -> 0x0351, all -> 0x034d }
            r16 = 0
            r8[r16] = r13     // Catch:{ ProtocolException -> 0x0362, NoRouteToHostException -> 0x035e, UnknownServiceException -> 0x035a, IOException -> 0x0356, Exception -> 0x0351, all -> 0x034d }
            java.lang.Long r13 = java.lang.Long.valueOf(r33)     // Catch:{ ProtocolException -> 0x0362, NoRouteToHostException -> 0x035e, UnknownServiceException -> 0x035a, IOException -> 0x0356, Exception -> 0x0351, all -> 0x034d }
            r25 = 1
            r8[r25] = r13     // Catch:{ ProtocolException -> 0x0362, NoRouteToHostException -> 0x035e, UnknownServiceException -> 0x035a, IOException -> 0x0356, Exception -> 0x0351, all -> 0x034d }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r12, r8)     // Catch:{ ProtocolException -> 0x0362, NoRouteToHostException -> 0x035e, UnknownServiceException -> 0x035a, IOException -> 0x0356, Exception -> 0x0351, all -> 0x034d }
            java.lang.String r8 = "range"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ ProtocolException -> 0x0362, NoRouteToHostException -> 0x035e, UnknownServiceException -> 0x035a, IOException -> 0x0356, Exception -> 0x0351, all -> 0x034d }
            r12.<init>()     // Catch:{ ProtocolException -> 0x0362, NoRouteToHostException -> 0x035e, UnknownServiceException -> 0x035a, IOException -> 0x0356, Exception -> 0x0351, all -> 0x034d }
            java.lang.String r13 = "bytes="
            r12.append(r13)     // Catch:{ ProtocolException -> 0x0362, NoRouteToHostException -> 0x035e, UnknownServiceException -> 0x035a, IOException -> 0x0356, Exception -> 0x0351, all -> 0x034d }
            r12.append(r5)     // Catch:{ ProtocolException -> 0x0362, NoRouteToHostException -> 0x035e, UnknownServiceException -> 0x035a, IOException -> 0x0356, Exception -> 0x0351, all -> 0x034d }
            java.lang.String r13 = "-"
            r12.append(r13)     // Catch:{ ProtocolException -> 0x0362, NoRouteToHostException -> 0x035e, UnknownServiceException -> 0x035a, IOException -> 0x0356, Exception -> 0x0351, all -> 0x034d }
            r35 = r14
            r13 = r33
            r12.append(r13)     // Catch:{ ProtocolException -> 0x040e, NoRouteToHostException -> 0x03f9, UnknownServiceException -> 0x03e4, IOException -> 0x03d1, Exception -> 0x03bd, all -> 0x03aa }
            java.lang.String r12 = r12.toString()     // Catch:{ ProtocolException -> 0x040e, NoRouteToHostException -> 0x03f9, UnknownServiceException -> 0x03e4, IOException -> 0x03d1, Exception -> 0x03bd, all -> 0x03aa }
            r4.put(r8, r12)     // Catch:{ ProtocolException -> 0x040e, NoRouteToHostException -> 0x03f9, UnknownServiceException -> 0x03e4, IOException -> 0x03d1, Exception -> 0x03bd, all -> 0x03aa }
            goto L_0x03a0
        L_0x034d:
            r0 = move-exception
        L_0x034e:
            r35 = r14
            goto L_0x036a
        L_0x0351:
            r0 = move-exception
            r35 = r14
            goto L_0x03be
        L_0x0356:
            r0 = move-exception
        L_0x0357:
            r35 = r14
            goto L_0x0384
        L_0x035a:
            r0 = move-exception
        L_0x035b:
            r35 = r14
            goto L_0x038b
        L_0x035e:
            r0 = move-exception
        L_0x035f:
            r35 = r14
            goto L_0x0392
        L_0x0362:
            r0 = move-exception
        L_0x0363:
            r35 = r14
            goto L_0x0399
        L_0x0366:
            r0 = move-exception
            r23 = r8
            goto L_0x034e
        L_0x036a:
            r3 = r0
            goto L_0x03ac
        L_0x036c:
            r0 = move-exception
            r23 = r8
            r35 = r14
        L_0x0371:
            r12 = r2
            r3 = r7
            r2 = r23
            r14 = r27
            r13 = r29
            r4 = r30
            r8 = r35
        L_0x037d:
            r7 = r0
            goto L_0x0ed5
        L_0x0380:
            r0 = move-exception
            r23 = r8
            goto L_0x0357
        L_0x0384:
            r3 = r0
            goto L_0x03d3
        L_0x0387:
            r0 = move-exception
            r23 = r8
            goto L_0x035b
        L_0x038b:
            r3 = r0
            goto L_0x03e6
        L_0x038e:
            r0 = move-exception
            r23 = r8
            goto L_0x035f
        L_0x0392:
            r3 = r0
            goto L_0x03fb
        L_0x0395:
            r0 = move-exception
            r23 = r8
            goto L_0x0363
        L_0x0399:
            r3 = r0
            goto L_0x0410
        L_0x039c:
            r23 = r8
            r35 = r14
        L_0x03a0:
            if (r26 != 0) goto L_0x0425
            boolean r8 = za2.C102987e.m136182j(r3)     // Catch:{ ProtocolException -> 0x040e, NoRouteToHostException -> 0x03f9, UnknownServiceException -> 0x03e4, IOException -> 0x03d1, Exception -> 0x03bd, all -> 0x03aa }
            if (r8 == 0) goto L_0x042b
            goto L_0x0425
        L_0x03aa:
            r0 = move-exception
            goto L_0x036a
        L_0x03ac:
            r12 = r2
            r8 = r3
            r3 = r7
            r2 = r23
            r34 = r24
            r14 = r27
            r4 = r30
            r13 = r35
            r17 = 0
            goto L_0x0270
        L_0x03bd:
            r0 = move-exception
        L_0x03be:
            r3 = r0
            r12 = r2
            r2 = r23
            r14 = r27
            r13 = r29
            r4 = r30
            r8 = r35
            r37 = r7
            r7 = r3
            r3 = r37
            goto L_0x0ed5
        L_0x03d1:
            r0 = move-exception
            goto L_0x0384
        L_0x03d3:
            r12 = r2
            r4 = r18
            r2 = r23
            r34 = r24
            r14 = r27
            r8 = r35
            r37 = r5
            r5 = r3
            r3 = r7
            goto L_0x0f6a
        L_0x03e4:
            r0 = move-exception
            goto L_0x038b
        L_0x03e6:
            r12 = r2
            r4 = r18
            r2 = r23
            r34 = r24
            r14 = r27
            r13 = r29
            r8 = r35
            r37 = r5
            r5 = r3
            r3 = r7
            goto L_0x11d2
        L_0x03f9:
            r0 = move-exception
            goto L_0x0392
        L_0x03fb:
            r12 = r2
            r4 = r18
            r2 = r23
            r34 = r24
            r14 = r27
            r13 = r29
            r8 = r35
            r37 = r5
            r5 = r3
            r3 = r7
            goto L_0x12b6
        L_0x040e:
            r0 = move-exception
            goto L_0x0399
        L_0x0410:
            r12 = r2
            r4 = r18
            r2 = r23
            r34 = r24
            r14 = r27
            r13 = r29
            r8 = r35
            r37 = r5
            r5 = r3
            r3 = r7
            r6 = r37
            goto L_0x13aa
        L_0x0425:
            java.lang.String r8 = "set cookie"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r8)     // Catch:{ ProtocolException -> 0x0e59, NoRouteToHostException -> 0x0e4a, UnknownServiceException -> 0x0e3b, IOException -> 0x0e2c, Exception -> 0x0e29, all -> 0x0e1a }
        L_0x042b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ ProtocolException -> 0x0e59, NoRouteToHostException -> 0x0e4a, UnknownServiceException -> 0x0e3b, IOException -> 0x0e2c, Exception -> 0x0e29, all -> 0x0e1a }
            r8.<init>()     // Catch:{ ProtocolException -> 0x0e59, NoRouteToHostException -> 0x0e4a, UnknownServiceException -> 0x0e3b, IOException -> 0x0e2c, Exception -> 0x0e29, all -> 0x0e1a }
            java.lang.String r12 = "http.agent"
            java.lang.String r12 = java.lang.System.getProperty(r12)     // Catch:{ ProtocolException -> 0x0e59, NoRouteToHostException -> 0x0e4a, UnknownServiceException -> 0x0e3b, IOException -> 0x0e2c, Exception -> 0x0e29, all -> 0x0e1a }
            r8.append(r12)     // Catch:{ ProtocolException -> 0x0e59, NoRouteToHostException -> 0x0e4a, UnknownServiceException -> 0x0e3b, IOException -> 0x0e2c, Exception -> 0x0e29, all -> 0x0e1a }
            java.lang.String r12 = " Built-in music  MicroMessenger/"
            r8.append(r12)     // Catch:{ ProtocolException -> 0x0e59, NoRouteToHostException -> 0x0e4a, UnknownServiceException -> 0x0e3b, IOException -> 0x0e2c, Exception -> 0x0e29, all -> 0x0e1a }
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ ProtocolException -> 0x0e59, NoRouteToHostException -> 0x0e4a, UnknownServiceException -> 0x0e3b, IOException -> 0x0e2c, Exception -> 0x0e29, all -> 0x0e1a }
            java.lang.String r12 = za2.C102987e.m136181i(r12)     // Catch:{ ProtocolException -> 0x0e59, NoRouteToHostException -> 0x0e4a, UnknownServiceException -> 0x0e3b, IOException -> 0x0e2c, Exception -> 0x0e29, all -> 0x0e1a }
            r8.append(r12)     // Catch:{ ProtocolException -> 0x0e59, NoRouteToHostException -> 0x0e4a, UnknownServiceException -> 0x0e3b, IOException -> 0x0e2c, Exception -> 0x0e29, all -> 0x0e1a }
            java.lang.String r8 = r8.toString()     // Catch:{ ProtocolException -> 0x0e59, NoRouteToHostException -> 0x0e4a, UnknownServiceException -> 0x0e3b, IOException -> 0x0e2c, Exception -> 0x0e29, all -> 0x0e1a }
            r12 = r28
            r4.put(r12, r8)     // Catch:{ ProtocolException -> 0x0e59, NoRouteToHostException -> 0x0e4a, UnknownServiceException -> 0x0e3b, IOException -> 0x0e2c, Exception -> 0x0e29, all -> 0x0e1a }
            java.net.HttpURLConnection r3 = r1.mo138265b(r3, r4)     // Catch:{ ProtocolException -> 0x0e59, NoRouteToHostException -> 0x0e4a, UnknownServiceException -> 0x0e3b, IOException -> 0x0e2c, Exception -> 0x0e29, all -> 0x0e1a }
            int r4 = r3.getResponseCode()     // Catch:{ ProtocolException -> 0x0e07, NoRouteToHostException -> 0x0df4, UnknownServiceException -> 0x0de1, IOException -> 0x0dca, Exception -> 0x0db2, all -> 0x0d9e }
            r8 = 200(0xc8, float:2.8E-43)
            if (r4 == r8) goto L_0x0620
            r8 = 206(0xce, float:2.89E-43)
            if (r4 == r8) goto L_0x0620
            java.lang.Class<la2.e> r8 = la2.C99357e.class
            ua2.a r8 = ua2.C101991b.m134284b(r8)     // Catch:{ ProtocolException -> 0x05b7, NoRouteToHostException -> 0x05ab, UnknownServiceException -> 0x059f, IOException -> 0x0594, Exception -> 0x0589, all -> 0x057e }
            la2.e r8 = (la2.C99357e) r8     // Catch:{ ProtocolException -> 0x05b7, NoRouteToHostException -> 0x05ab, UnknownServiceException -> 0x059f, IOException -> 0x0594, Exception -> 0x0589, all -> 0x057e }
            if (r8 == 0) goto L_0x04b8
            r8.mo138802e0(r4)     // Catch:{ ProtocolException -> 0x04ac, NoRouteToHostException -> 0x04a0, UnknownServiceException -> 0x0494, IOException -> 0x0488, Exception -> 0x047c, all -> 0x0470 }
            goto L_0x04b8
        L_0x0470:
            r0 = move-exception
            r12 = r0
            r14 = r23
            r13 = r27
            r4 = r30
            r8 = r35
            goto L_0x05c3
        L_0x047c:
            r0 = move-exception
            r12 = r0
            r14 = r23
            r13 = r27
            r4 = r30
            r8 = r35
            goto L_0x05d5
        L_0x0488:
            r0 = move-exception
            r12 = r0
            r14 = r23
            r13 = r27
            r4 = r30
            r8 = r35
            goto L_0x05e2
        L_0x0494:
            r0 = move-exception
            r12 = r0
            r14 = r23
            r13 = r27
            r4 = r30
            r8 = r35
            goto L_0x05f0
        L_0x04a0:
            r0 = move-exception
            r12 = r0
            r14 = r23
            r13 = r27
            r4 = r30
            r8 = r35
            goto L_0x0600
        L_0x04ac:
            r0 = move-exception
            r12 = r0
            r14 = r23
            r13 = r27
            r4 = r30
            r8 = r35
            goto L_0x0610
        L_0x04b8:
            java.lang.String r8 = "music http req error responseCode:%d"
            r12 = 1
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ ProtocolException -> 0x05b7, NoRouteToHostException -> 0x05ab, UnknownServiceException -> 0x059f, IOException -> 0x0594, Exception -> 0x0589, all -> 0x057e }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)     // Catch:{ ProtocolException -> 0x05b7, NoRouteToHostException -> 0x05ab, UnknownServiceException -> 0x059f, IOException -> 0x0594, Exception -> 0x0589, all -> 0x057e }
            r14 = 0
            r13[r14] = r12     // Catch:{ ProtocolException -> 0x05b7, NoRouteToHostException -> 0x05ab, UnknownServiceException -> 0x059f, IOException -> 0x0594, Exception -> 0x0589, all -> 0x057e }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r8, r13)     // Catch:{ ProtocolException -> 0x05b7, NoRouteToHostException -> 0x05ab, UnknownServiceException -> 0x059f, IOException -> 0x0594, Exception -> 0x0589, all -> 0x057e }
            r1.f289997o = r4     // Catch:{ ProtocolException -> 0x05b7, NoRouteToHostException -> 0x05ab, UnknownServiceException -> 0x059f, IOException -> 0x0594, Exception -> 0x0589, all -> 0x057e }
            r4 = -1
            r1.mo138267d(r4)     // Catch:{ ProtocolException -> 0x05b7, NoRouteToHostException -> 0x05ab, UnknownServiceException -> 0x059f, IOException -> 0x0594, Exception -> 0x0589, all -> 0x057e }
            r12 = 0
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 != 0) goto L_0x0501
            int r8 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r8 <= 0) goto L_0x0501
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r9)
            r8 = r35
            r8.setLength(r5)     // Catch:{ IOException -> 0x04e3 }
            r13 = r27
            goto L_0x04ed
        L_0x04e3:
            r0 = move-exception
            r2 = r0
            r4 = 0
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r13 = r27
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r2, r13, r7)
        L_0x04ed:
            r1.mo138266c(r5)
            r9 = 256000(0x3e800, double:1.26481E-318)
            int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x0555
            ja2.b$a r2 = new ja2.b$a
            r4 = 1
            r2.<init>(r4)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
            goto L_0x0555
        L_0x0501:
            r13 = r27
            r8 = r35
            if (r4 == 0) goto L_0x0523
            int r9 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r9 == 0) goto L_0x0523
            r9 = 2
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            r9 = 0
            r2[r9] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r5)
            r9 = 1
            r2[r9] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r7, r2)
            r1.mo138268e(r5, r10)
            goto L_0x0555
        L_0x0523:
            if (r4 == 0) goto L_0x0550
            int r4 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r4 != 0) goto L_0x0550
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Long r7 = java.lang.Long.valueOf(r10)
            r9 = 0
            r4[r9] = r7
            java.lang.Long r7 = java.lang.Long.valueOf(r5)
            r9 = 1
            r4[r9] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r2, r4)
            r1.mo138266c(r10)
            r10 = 256000(0x3e800, double:1.26481E-318)
            int r2 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x0555
            ja2.b$a r2 = new ja2.b$a
            r2.<init>(r9)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
            goto L_0x0555
        L_0x0550:
            r14 = r23
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r14)
        L_0x0555:
            r8.close()     // Catch:{ IOException -> 0x0559 }
            goto L_0x0561
        L_0x0559:
            r0 = move-exception
            r2 = r0
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r2, r13, r4)
        L_0x0561:
            java.io.InputStream r2 = r3.getInputStream()     // Catch:{ Exception -> 0x0569 }
            r2.close()     // Catch:{ Exception -> 0x0569 }
            goto L_0x0572
        L_0x0569:
            r0 = move-exception
            r2 = r0
            java.lang.String r2 = r2.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r2)
        L_0x0572:
            r3.disconnect()
            r2 = 1
            r1.f289995j = r2
            r4 = r30
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r4)
            return
        L_0x057e:
            r0 = move-exception
            r14 = r23
            r13 = r27
            r4 = r30
            r8 = r35
            r12 = r0
            goto L_0x05c3
        L_0x0589:
            r0 = move-exception
            r14 = r23
            r13 = r27
            r4 = r30
            r8 = r35
            r12 = r0
            goto L_0x05d5
        L_0x0594:
            r0 = move-exception
            r14 = r23
            r13 = r27
            r4 = r30
            r8 = r35
            r12 = r0
            goto L_0x05e2
        L_0x059f:
            r0 = move-exception
            r14 = r23
            r13 = r27
            r4 = r30
            r8 = r35
            r12 = r0
            goto L_0x05f0
        L_0x05ab:
            r0 = move-exception
            r14 = r23
            r13 = r27
            r4 = r30
            r8 = r35
            r12 = r0
            goto L_0x0600
        L_0x05b7:
            r0 = move-exception
            r14 = r23
            r13 = r27
            r4 = r30
            r8 = r35
            r12 = r0
            goto L_0x0610
        L_0x05c3:
            r34 = r3
            r3 = r7
            r17 = 0
            r6 = r5
            r5 = r29
            r37 = r12
            r12 = r2
            r2 = r14
            r14 = r13
            r13 = r8
            r8 = r37
            goto L_0x1491
        L_0x05d5:
            r34 = r3
            r27 = r5
            r3 = r7
            r5 = r12
            r12 = r2
            r2 = r14
            r14 = r13
            r13 = r29
            goto L_0x0c2e
        L_0x05e2:
            r34 = r3
            r30 = r4
            r3 = r7
            r4 = r18
            r6 = r5
            r5 = r12
            r12 = r2
            r2 = r14
            r14 = r13
            goto L_0x10fc
        L_0x05f0:
            r34 = r3
            r30 = r4
            r3 = r7
            r4 = r18
            r6 = r5
            r5 = r12
            r12 = r2
            r2 = r14
            r14 = r13
            r13 = r29
            goto L_0x11d4
        L_0x0600:
            r34 = r3
            r30 = r4
            r3 = r7
            r4 = r18
            r6 = r5
            r5 = r12
            r12 = r2
            r2 = r14
            r14 = r13
            r13 = r29
            goto L_0x12b8
        L_0x0610:
            r34 = r3
            r30 = r4
            r3 = r7
            r4 = r18
            r6 = r5
            r5 = r12
            r12 = r2
            r2 = r14
            r14 = r13
            r13 = r29
            goto L_0x13aa
        L_0x0620:
            r14 = r23
            r13 = r27
            r36 = r30
            r8 = r35
            r23 = r14
            java.lang.String r14 = "getResponseCode:%d"
            r26 = r2
            r27 = r7
            r2 = 1
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ ProtocolException -> 0x0d2e, NoRouteToHostException -> 0x0d1a, UnknownServiceException -> 0x0d06, IOException -> 0x0cf2, Exception -> 0x0ced, all -> 0x0cd9 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ ProtocolException -> 0x0d2e, NoRouteToHostException -> 0x0d1a, UnknownServiceException -> 0x0d06, IOException -> 0x0cf2, Exception -> 0x0ced, all -> 0x0cd9 }
            r4 = 0
            r7[r4] = r2     // Catch:{ ProtocolException -> 0x0d2e, NoRouteToHostException -> 0x0d1a, UnknownServiceException -> 0x0d06, IOException -> 0x0cf2, Exception -> 0x0ced, all -> 0x0cd9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r14, r7)     // Catch:{ ProtocolException -> 0x0d2e, NoRouteToHostException -> 0x0d1a, UnknownServiceException -> 0x0d06, IOException -> 0x0cf2, Exception -> 0x0ced, all -> 0x0cd9 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ ProtocolException -> 0x0d2e, NoRouteToHostException -> 0x0d1a, UnknownServiceException -> 0x0d06, IOException -> 0x0cf2, Exception -> 0x0ced, all -> 0x0cd9 }
            r2.<init>()     // Catch:{ ProtocolException -> 0x0d2e, NoRouteToHostException -> 0x0d1a, UnknownServiceException -> 0x0d06, IOException -> 0x0cf2, Exception -> 0x0ced, all -> 0x0cd9 }
            java.lang.String r4 = "user-agent: "
            r2.append(r4)     // Catch:{ ProtocolException -> 0x0d2e, NoRouteToHostException -> 0x0d1a, UnknownServiceException -> 0x0d06, IOException -> 0x0cf2, Exception -> 0x0ced, all -> 0x0cd9 }
            java.lang.String r4 = r3.getRequestProperty(r12)     // Catch:{ ProtocolException -> 0x0d2e, NoRouteToHostException -> 0x0d1a, UnknownServiceException -> 0x0d06, IOException -> 0x0cf2, Exception -> 0x0ced, all -> 0x0cd9 }
            r2.append(r4)     // Catch:{ ProtocolException -> 0x0d2e, NoRouteToHostException -> 0x0d1a, UnknownServiceException -> 0x0d06, IOException -> 0x0cf2, Exception -> 0x0ced, all -> 0x0cd9 }
            java.lang.String r2 = r2.toString()     // Catch:{ ProtocolException -> 0x0d2e, NoRouteToHostException -> 0x0d1a, UnknownServiceException -> 0x0d06, IOException -> 0x0cf2, Exception -> 0x0ced, all -> 0x0cd9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r2)     // Catch:{ ProtocolException -> 0x0d2e, NoRouteToHostException -> 0x0d1a, UnknownServiceException -> 0x0d06, IOException -> 0x0cf2, Exception -> 0x0ced, all -> 0x0cd9 }
            java.lang.String r2 = r3.getContentType()     // Catch:{ ProtocolException -> 0x0d2e, NoRouteToHostException -> 0x0d1a, UnknownServiceException -> 0x0d06, IOException -> 0x0cf2, Exception -> 0x0ced, all -> 0x0cd9 }
            java.lang.String r4 = "ContentType:%s"
            r7 = 1
            java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ ProtocolException -> 0x0d2e, NoRouteToHostException -> 0x0d1a, UnknownServiceException -> 0x0d06, IOException -> 0x0cf2, Exception -> 0x0ced, all -> 0x0cd9 }
            r7 = 0
            r12[r7] = r2     // Catch:{ ProtocolException -> 0x0d2e, NoRouteToHostException -> 0x0d1a, UnknownServiceException -> 0x0d06, IOException -> 0x0cf2, Exception -> 0x0ced, all -> 0x0cd9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r4, r12)     // Catch:{ ProtocolException -> 0x0d2e, NoRouteToHostException -> 0x0d1a, UnknownServiceException -> 0x0d06, IOException -> 0x0cf2, Exception -> 0x0ced, all -> 0x0cd9 }
            r1.f289996n = r2     // Catch:{ ProtocolException -> 0x0d2e, NoRouteToHostException -> 0x0d1a, UnknownServiceException -> 0x0d06, IOException -> 0x0cf2, Exception -> 0x0ced, all -> 0x0cd9 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ ProtocolException -> 0x0d2e, NoRouteToHostException -> 0x0d1a, UnknownServiceException -> 0x0d06, IOException -> 0x0cf2, Exception -> 0x0ced, all -> 0x0cd9 }
            if (r2 != 0) goto L_0x070d
            ja2.a r2 = r1.f289991f     // Catch:{ ProtocolException -> 0x06f4, NoRouteToHostException -> 0x06db, UnknownServiceException -> 0x06c2, IOException -> 0x06af, Exception -> 0x069e, all -> 0x0686 }
            java.lang.String r2 = r2.f289988g     // Catch:{ ProtocolException -> 0x06f4, NoRouteToHostException -> 0x06db, UnknownServiceException -> 0x06c2, IOException -> 0x06af, Exception -> 0x069e, all -> 0x0686 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ ProtocolException -> 0x06f4, NoRouteToHostException -> 0x06db, UnknownServiceException -> 0x06c2, IOException -> 0x06af, Exception -> 0x069e, all -> 0x0686 }
            if (r2 == 0) goto L_0x070d
            ja2.a r2 = r1.f289991f     // Catch:{ ProtocolException -> 0x06f4, NoRouteToHostException -> 0x06db, UnknownServiceException -> 0x06c2, IOException -> 0x06af, Exception -> 0x069e, all -> 0x0686 }
            java.lang.String r4 = r1.f289996n     // Catch:{ ProtocolException -> 0x06f4, NoRouteToHostException -> 0x06db, UnknownServiceException -> 0x06c2, IOException -> 0x06af, Exception -> 0x069e, all -> 0x0686 }
            r2.f289988g = r4     // Catch:{ ProtocolException -> 0x06f4, NoRouteToHostException -> 0x06db, UnknownServiceException -> 0x06c2, IOException -> 0x06af, Exception -> 0x069e, all -> 0x0686 }
            qc0.m r2 = r1.f289990e     // Catch:{ ProtocolException -> 0x06f4, NoRouteToHostException -> 0x06db, UnknownServiceException -> 0x06c2, IOException -> 0x06af, Exception -> 0x069e, all -> 0x0686 }
            java.lang.String r2 = r2.f295960e     // Catch:{ ProtocolException -> 0x06f4, NoRouteToHostException -> 0x06db, UnknownServiceException -> 0x06c2, IOException -> 0x06af, Exception -> 0x069e, all -> 0x0686 }
            ha2.C98329e.m127110f(r2, r4)     // Catch:{ ProtocolException -> 0x06f4, NoRouteToHostException -> 0x06db, UnknownServiceException -> 0x06c2, IOException -> 0x06af, Exception -> 0x069e, all -> 0x0686 }
            goto L_0x070d
        L_0x0686:
            r0 = move-exception
            r2 = r0
            r34 = r3
            r14 = r13
            r12 = r26
            r3 = r27
            r13 = r29
            r4 = r36
            r37 = r5
            r5 = r2
            r2 = r23
            r6 = r24
            r22 = r37
            goto L_0x0cb3
        L_0x069e:
            r0 = move-exception
            r7 = r0
            r34 = r3
            r14 = r13
            r2 = r23
            r12 = r26
            r3 = r27
            r13 = r29
            r4 = r36
            goto L_0x1013
        L_0x06af:
            r0 = move-exception
            r2 = r0
            r34 = r3
            r6 = r5
            r14 = r13
            r12 = r26
            r3 = r27
            r13 = r29
            r4 = r36
            r5 = r2
            r2 = r23
            goto L_0x0c77
        L_0x06c2:
            r0 = move-exception
            r2 = r0
            r34 = r3
            r6 = r5
            r14 = r13
            r12 = r26
            r3 = r27
            r13 = r29
            r4 = r36
            r5 = r2
            r2 = r23
        L_0x06d3:
            r37 = r24
            r24 = r8
            r8 = r37
            goto L_0x0f89
        L_0x06db:
            r0 = move-exception
            r2 = r0
            r34 = r3
            r6 = r5
            r14 = r13
            r12 = r26
            r3 = r27
            r13 = r29
            r4 = r36
            r5 = r2
            r2 = r23
        L_0x06ec:
            r37 = r24
            r24 = r8
            r8 = r37
            goto L_0x0fb0
        L_0x06f4:
            r0 = move-exception
            r2 = r0
            r34 = r3
            r6 = r5
            r14 = r13
            r12 = r26
            r3 = r27
            r13 = r29
            r4 = r36
            r5 = r2
            r2 = r23
        L_0x0705:
            r37 = r24
            r24 = r8
            r8 = r37
            goto L_0x0fd7
        L_0x070d:
            java.lang.String r2 = "Content-Range"
            java.lang.String r2 = r3.getHeaderField(r2)     // Catch:{ ProtocolException -> 0x0d2e, NoRouteToHostException -> 0x0d1a, UnknownServiceException -> 0x0d06, IOException -> 0x0cf2, Exception -> 0x0ced, all -> 0x0cd9 }
            long[] r4 = r1.mo138264a(r2)     // Catch:{ ProtocolException -> 0x0d2e, NoRouteToHostException -> 0x0d1a, UnknownServiceException -> 0x0d06, IOException -> 0x0cf2, Exception -> 0x0ced, all -> 0x0cd9 }
            java.lang.String r7 = "Content-Length"
            java.lang.String r7 = r3.getHeaderField(r7)     // Catch:{ ProtocolException -> 0x0d2e, NoRouteToHostException -> 0x0d1a, UnknownServiceException -> 0x0d06, IOException -> 0x0cf2, Exception -> 0x0ced, all -> 0x0cd9 }
            r14 = r13
            r12 = 0
            long r33 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r7, r12)     // Catch:{ ProtocolException -> 0x0cd4, NoRouteToHostException -> 0x0ccf, UnknownServiceException -> 0x0ccb, IOException -> 0x0cc7, Exception -> 0x0cb7, all -> 0x0ca1 }
            java.lang.String r7 = "content-range: %s contentLen=%d"
            r12 = 2
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ ProtocolException -> 0x0cd4, NoRouteToHostException -> 0x0ccf, UnknownServiceException -> 0x0ccb, IOException -> 0x0cc7, Exception -> 0x0cb7, all -> 0x0c9d }
            r12 = 0
            r13[r12] = r2     // Catch:{ ProtocolException -> 0x0cd4, NoRouteToHostException -> 0x0ccf, UnknownServiceException -> 0x0ccb, IOException -> 0x0cc7, Exception -> 0x0cb7, all -> 0x0c9d }
            java.lang.Long r2 = java.lang.Long.valueOf(r33)     // Catch:{ ProtocolException -> 0x0cd4, NoRouteToHostException -> 0x0ccf, UnknownServiceException -> 0x0ccb, IOException -> 0x0cc7, Exception -> 0x0cb7, all -> 0x0c9d }
            r12 = 1
            r13[r12] = r2     // Catch:{ ProtocolException -> 0x0cd4, NoRouteToHostException -> 0x0ccf, UnknownServiceException -> 0x0ccb, IOException -> 0x0cc7, Exception -> 0x0cb7, all -> 0x0c9d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r7, r13)     // Catch:{ ProtocolException -> 0x0cd4, NoRouteToHostException -> 0x0ccf, UnknownServiceException -> 0x0ccb, IOException -> 0x0cc7, Exception -> 0x0cb7, all -> 0x0c9d }
            if (r4 != 0) goto L_0x079a
            java.lang.String r2 = "not support range feature"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r2)     // Catch:{ ProtocolException -> 0x078e, NoRouteToHostException -> 0x0782, UnknownServiceException -> 0x0776, IOException -> 0x076a, Exception -> 0x075e, all -> 0x0752 }
            r10 = 0
            int r2 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x0746
            r5 = 0
        L_0x0746:
            r2 = r23
            r12 = r26
            r7 = r27
            r10 = r33
            r13 = r36
            goto L_0x08e9
        L_0x0752:
            r0 = move-exception
            r4 = r0
            r2 = r23
            r12 = r26
            r7 = r27
            r13 = r36
            goto L_0x0863
        L_0x075e:
            r0 = move-exception
            r4 = r0
            r2 = r23
            r12 = r26
            r7 = r27
            r13 = r36
            goto L_0x087c
        L_0x076a:
            r0 = move-exception
            r4 = r0
            r2 = r23
            r12 = r26
            r7 = r27
            r13 = r36
            goto L_0x088f
        L_0x0776:
            r0 = move-exception
            r4 = r0
            r2 = r23
            r12 = r26
            r7 = r27
            r13 = r36
            goto L_0x08a2
        L_0x0782:
            r0 = move-exception
            r4 = r0
            r2 = r23
            r12 = r26
            r7 = r27
            r13 = r36
            goto L_0x08b9
        L_0x078e:
            r0 = move-exception
            r4 = r0
            r2 = r23
            r12 = r26
            r7 = r27
            r13 = r36
            goto L_0x08d0
        L_0x079a:
            r12 = 0
            int r2 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x08dd
            r7 = 0
            r12 = r4[r7]     // Catch:{ ProtocolException -> 0x08c6, NoRouteToHostException -> 0x08af, UnknownServiceException -> 0x0898, IOException -> 0x0885, Exception -> 0x0872, all -> 0x0859 }
            int r7 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r7 == 0) goto L_0x08dd
            java.lang.String r4 = "return http error, need to download again"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r4)     // Catch:{ ProtocolException -> 0x08c6, NoRouteToHostException -> 0x08af, UnknownServiceException -> 0x0898, IOException -> 0x0885, Exception -> 0x0872, all -> 0x0859 }
            r4 = 6
            r1.mo138267d(r4)     // Catch:{ ProtocolException -> 0x08c6, NoRouteToHostException -> 0x08af, UnknownServiceException -> 0x0898, IOException -> 0x0885, Exception -> 0x0872, all -> 0x0859 }
            r12 = 0
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 != 0) goto L_0x07dc
            if (r2 <= 0) goto L_0x07dc
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r9)
            r8.setLength(r5)     // Catch:{ IOException -> 0x07c0 }
            goto L_0x07c8
        L_0x07c0:
            r0 = move-exception
            r2 = r0
            r4 = 0
            java.lang.Object[] r7 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r2, r14, r7)
        L_0x07c8:
            r1.mo138266c(r5)
            r9 = 256000(0x3e800, double:1.26481E-318)
            int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x0830
            ja2.b$a r2 = new ja2.b$a
            r4 = 1
            r2.<init>(r4)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
            goto L_0x0830
        L_0x07dc:
            if (r4 == 0) goto L_0x07fc
            int r2 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x07fc
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            r7 = 0
            r2[r7] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r5)
            r7 = 1
            r2[r7] = r4
            r7 = r27
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r7, r2)
            r1.mo138268e(r5, r10)
            goto L_0x0830
        L_0x07fc:
            if (r4 == 0) goto L_0x082b
            int r2 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x082b
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            r7 = 0
            r2[r7] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r5)
            r7 = 1
            r2[r7] = r4
            r12 = r26
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r12, r2)
            r1.mo138266c(r10)
            r9 = 256000(0x3e800, double:1.26481E-318)
            int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x0830
            ja2.b$a r2 = new ja2.b$a
            r2.<init>(r7)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
            goto L_0x0830
        L_0x082b:
            r2 = r23
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r2)
        L_0x0830:
            r8.close()     // Catch:{ IOException -> 0x0834 }
            goto L_0x083c
        L_0x0834:
            r0 = move-exception
            r2 = r0
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r2, r14, r4)
        L_0x083c:
            java.io.InputStream r2 = r3.getInputStream()     // Catch:{ Exception -> 0x0844 }
            r2.close()     // Catch:{ Exception -> 0x0844 }
            goto L_0x084d
        L_0x0844:
            r0 = move-exception
            r2 = r0
            java.lang.String r2 = r2.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r2)
        L_0x084d:
            r3.disconnect()
            r2 = 1
            r1.f289995j = r2
            r13 = r36
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r13)
            return
        L_0x0859:
            r0 = move-exception
            r2 = r23
            r12 = r26
            r7 = r27
            r13 = r36
            r4 = r0
        L_0x0863:
            r34 = r3
            r22 = r5
            r3 = r7
            r6 = r24
            r5 = r29
            r7 = r4
            r24 = r8
            r4 = r13
            goto L_0x148e
        L_0x0872:
            r0 = move-exception
            r2 = r23
            r12 = r26
            r7 = r27
            r13 = r36
            r4 = r0
        L_0x087c:
            r34 = r3
            r3 = r7
            r7 = r4
            r4 = r13
            r13 = r29
            goto L_0x1013
        L_0x0885:
            r0 = move-exception
            r2 = r23
            r12 = r26
            r7 = r27
            r13 = r36
            r4 = r0
        L_0x088f:
            r34 = r3
            r3 = r7
            r30 = r13
            r6 = r5
            r5 = r4
            goto L_0x0c7b
        L_0x0898:
            r0 = move-exception
            r2 = r23
            r12 = r26
            r7 = r27
            r13 = r36
            r4 = r0
        L_0x08a2:
            r34 = r3
            r3 = r7
            r30 = r13
            r13 = r29
            r6 = r5
            r5 = r4
            r4 = r18
            goto L_0x11d4
        L_0x08af:
            r0 = move-exception
            r2 = r23
            r12 = r26
            r7 = r27
            r13 = r36
            r4 = r0
        L_0x08b9:
            r34 = r3
            r3 = r7
            r30 = r13
            r13 = r29
            r6 = r5
            r5 = r4
            r4 = r18
            goto L_0x12b8
        L_0x08c6:
            r0 = move-exception
            r2 = r23
            r12 = r26
            r7 = r27
            r13 = r36
            r4 = r0
        L_0x08d0:
            r34 = r3
            r3 = r7
            r30 = r13
            r13 = r29
            r6 = r5
            r5 = r4
            r4 = r18
            goto L_0x13aa
        L_0x08dd:
            r2 = r23
            r12 = r26
            r7 = r27
            r13 = r36
            r23 = 2
            r10 = r4[r23]     // Catch:{ ProtocolException -> 0x0c93, NoRouteToHostException -> 0x0c89, UnknownServiceException -> 0x0c7f, IOException -> 0x0c6d, Exception -> 0x0c64, all -> 0x0c5b }
        L_0x08e9:
            r26 = 10000000(0x989680, double:4.9406565E-317)
            r20 = 0
            int r4 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r4 == 0) goto L_0x08f5
            r33 = r10
            goto L_0x08f7
        L_0x08f5:
            r33 = r26
        L_0x08f7:
            r30 = r13
            java.lang.String r13 = "fileLen=%d downloadLength=%d, isStop:%b"
            r23 = r2
            r26 = r12
            r2 = 3
            java.lang.Object[] r12 = new java.lang.Object[r2]     // Catch:{ ProtocolException -> 0x0c01, NoRouteToHostException -> 0x0bf0, UnknownServiceException -> 0x0bdf, IOException -> 0x0bcf, Exception -> 0x0bbe, all -> 0x0bad }
            java.lang.Long r2 = java.lang.Long.valueOf(r33)     // Catch:{ ProtocolException -> 0x0c01, NoRouteToHostException -> 0x0bf0, UnknownServiceException -> 0x0bdf, IOException -> 0x0bcf, Exception -> 0x0bbe, all -> 0x0bad }
            r16 = 0
            r12[r16] = r2     // Catch:{ ProtocolException -> 0x0c01, NoRouteToHostException -> 0x0bf0, UnknownServiceException -> 0x0bdf, IOException -> 0x0bcf, Exception -> 0x0bbe, all -> 0x0bad }
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ ProtocolException -> 0x0c01, NoRouteToHostException -> 0x0bf0, UnknownServiceException -> 0x0bdf, IOException -> 0x0bcf, Exception -> 0x0bbe, all -> 0x0bad }
            r25 = 1
            r12[r25] = r2     // Catch:{ ProtocolException -> 0x0c01, NoRouteToHostException -> 0x0bf0, UnknownServiceException -> 0x0bdf, IOException -> 0x0bcf, Exception -> 0x0bbe, all -> 0x0bad }
            boolean r2 = r1.f289995j     // Catch:{ ProtocolException -> 0x0c01, NoRouteToHostException -> 0x0bf0, UnknownServiceException -> 0x0bdf, IOException -> 0x0bcf, Exception -> 0x0bbe, all -> 0x0bad }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ ProtocolException -> 0x0c01, NoRouteToHostException -> 0x0bf0, UnknownServiceException -> 0x0bdf, IOException -> 0x0bcf, Exception -> 0x0bbe, all -> 0x0bad }
            r27 = 2
            r12[r27] = r2     // Catch:{ ProtocolException -> 0x0c01, NoRouteToHostException -> 0x0bf0, UnknownServiceException -> 0x0bdf, IOException -> 0x0bcf, Exception -> 0x0bbe, all -> 0x0bad }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r13, r12)     // Catch:{ ProtocolException -> 0x0c01, NoRouteToHostException -> 0x0bf0, UnknownServiceException -> 0x0bdf, IOException -> 0x0bcf, Exception -> 0x0bbe, all -> 0x0bad }
            r12 = r33
            r8.setLength(r12)     // Catch:{ ProtocolException -> 0x0c01, NoRouteToHostException -> 0x0bf0, UnknownServiceException -> 0x0bdf, IOException -> 0x0bcf, Exception -> 0x0bbe, all -> 0x0bad }
            r8.seek(r5)     // Catch:{ ProtocolException -> 0x0c01, NoRouteToHostException -> 0x0bf0, UnknownServiceException -> 0x0bdf, IOException -> 0x0bcf, Exception -> 0x0bbe, all -> 0x0bad }
            java.io.InputStream r2 = r3.getInputStream()     // Catch:{ ProtocolException -> 0x0c01, NoRouteToHostException -> 0x0bf0, UnknownServiceException -> 0x0bdf, IOException -> 0x0bcf, Exception -> 0x0bbe, all -> 0x0bad }
            r27 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r5]     // Catch:{ ProtocolException -> 0x0b9a, NoRouteToHostException -> 0x0b87, UnknownServiceException -> 0x0b74, IOException -> 0x0b61, Exception -> 0x0b50, all -> 0x0b3b }
            r34 = r3
            r33 = r7
            r6 = r27
        L_0x0937:
            boolean r3 = r1.f289995j     // Catch:{ ProtocolException -> 0x0b34, NoRouteToHostException -> 0x0b2d, UnknownServiceException -> 0x0b26, IOException -> 0x0b22, Exception -> 0x0b1e, all -> 0x0b13 }
            if (r3 != 0) goto L_0x0a01
            int r3 = r2.read(r5)     // Catch:{ ProtocolException -> 0x09f0, NoRouteToHostException -> 0x09df, UnknownServiceException -> 0x09ce, IOException -> 0x09bd, Exception -> 0x09ab, all -> 0x099a }
            if (r3 <= 0) goto L_0x095f
            r24 = r2
            r2 = 0
            r8.write(r5, r2, r3)     // Catch:{ ProtocolException -> 0x0997, NoRouteToHostException -> 0x0995, UnknownServiceException -> 0x0993, IOException -> 0x0991, Exception -> 0x098f, all -> 0x098d }
            long r2 = (long) r3     // Catch:{ ProtocolException -> 0x0997, NoRouteToHostException -> 0x0995, UnknownServiceException -> 0x0993, IOException -> 0x0991, Exception -> 0x098f, all -> 0x098d }
            long r6 = r6 + r2
            r1.mo138269f(r6, r12)     // Catch:{ ProtocolException -> 0x0997, NoRouteToHostException -> 0x0995, UnknownServiceException -> 0x0993, IOException -> 0x0991, Exception -> 0x098f, all -> 0x098d }
            r2 = 256000(0x3e800, double:1.26481E-318)
            int r27 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r27 < 0) goto L_0x095c
            ja2.b$a r2 = new ja2.b$a     // Catch:{ ProtocolException -> 0x0997, NoRouteToHostException -> 0x0995, UnknownServiceException -> 0x0993, IOException -> 0x0991, Exception -> 0x098f, all -> 0x098d }
            r3 = 1
            r2.<init>(r3)     // Catch:{ ProtocolException -> 0x0997, NoRouteToHostException -> 0x0995, UnknownServiceException -> 0x0993, IOException -> 0x0991, Exception -> 0x098f, all -> 0x098d }
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)     // Catch:{ ProtocolException -> 0x0997, NoRouteToHostException -> 0x0995, UnknownServiceException -> 0x0993, IOException -> 0x0991, Exception -> 0x098f, all -> 0x098d }
        L_0x095c:
            r2 = r24
            goto L_0x0937
        L_0x095f:
            r24 = r2
            java.lang.String r2 = "read length:%d, isStop:%b, downloadLength:%d, realFileLength:%d"
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ ProtocolException -> 0x0997, NoRouteToHostException -> 0x0995, UnknownServiceException -> 0x0993, IOException -> 0x0991, Exception -> 0x098f, all -> 0x098d }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ ProtocolException -> 0x0997, NoRouteToHostException -> 0x0995, UnknownServiceException -> 0x0993, IOException -> 0x0991, Exception -> 0x098f, all -> 0x098d }
            r16 = 0
            r5[r16] = r3     // Catch:{ ProtocolException -> 0x0997, NoRouteToHostException -> 0x0995, UnknownServiceException -> 0x0993, IOException -> 0x0991, Exception -> 0x098f, all -> 0x098d }
            boolean r3 = r1.f289995j     // Catch:{ ProtocolException -> 0x0997, NoRouteToHostException -> 0x0995, UnknownServiceException -> 0x0993, IOException -> 0x0991, Exception -> 0x098f, all -> 0x098d }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ ProtocolException -> 0x0997, NoRouteToHostException -> 0x0995, UnknownServiceException -> 0x0993, IOException -> 0x0991, Exception -> 0x098f, all -> 0x098d }
            r19 = 1
            r5[r19] = r3     // Catch:{ ProtocolException -> 0x0997, NoRouteToHostException -> 0x0995, UnknownServiceException -> 0x0993, IOException -> 0x0991, Exception -> 0x098f, all -> 0x098d }
            java.lang.Long r3 = java.lang.Long.valueOf(r6)     // Catch:{ ProtocolException -> 0x0997, NoRouteToHostException -> 0x0995, UnknownServiceException -> 0x0993, IOException -> 0x0991, Exception -> 0x098f, all -> 0x098d }
            r19 = 2
            r5[r19] = r3     // Catch:{ ProtocolException -> 0x0997, NoRouteToHostException -> 0x0995, UnknownServiceException -> 0x0993, IOException -> 0x0991, Exception -> 0x098f, all -> 0x098d }
            java.lang.Long r3 = java.lang.Long.valueOf(r12)     // Catch:{ ProtocolException -> 0x0997, NoRouteToHostException -> 0x0995, UnknownServiceException -> 0x0993, IOException -> 0x0991, Exception -> 0x098f, all -> 0x098d }
            r12 = 3
            r5[r12] = r3     // Catch:{ ProtocolException -> 0x0997, NoRouteToHostException -> 0x0995, UnknownServiceException -> 0x0993, IOException -> 0x0991, Exception -> 0x098f, all -> 0x098d }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r2, r5)     // Catch:{ ProtocolException -> 0x0997, NoRouteToHostException -> 0x0995, UnknownServiceException -> 0x0993, IOException -> 0x0991, Exception -> 0x098f, all -> 0x098d }
            goto L_0x0a03
        L_0x098d:
            r0 = move-exception
            goto L_0x099d
        L_0x098f:
            r0 = move-exception
            goto L_0x09ae
        L_0x0991:
            r0 = move-exception
            goto L_0x09c0
        L_0x0993:
            r0 = move-exception
            goto L_0x09d1
        L_0x0995:
            r0 = move-exception
            goto L_0x09e2
        L_0x0997:
            r0 = move-exception
            goto L_0x09f3
        L_0x099a:
            r0 = move-exception
            r24 = r2
        L_0x099d:
            r2 = r0
            r5 = r2
            r2 = r23
            r12 = r26
            r13 = r29
            r4 = r30
            r3 = r33
            goto L_0x0b18
        L_0x09ab:
            r0 = move-exception
            r24 = r2
        L_0x09ae:
            r2 = r0
            r5 = r6
            r12 = r26
            r13 = r29
            r4 = r30
            r3 = r33
            r7 = r2
            r2 = r23
            goto L_0x1013
        L_0x09bd:
            r0 = move-exception
            r24 = r2
        L_0x09c0:
            r2 = r0
            r5 = r2
            r2 = r23
            r12 = r26
            r13 = r29
            r4 = r30
            r3 = r33
            goto L_0x0c77
        L_0x09ce:
            r0 = move-exception
            r24 = r2
        L_0x09d1:
            r2 = r0
            r5 = r2
            r2 = r23
            r12 = r26
            r13 = r29
            r4 = r30
            r3 = r33
            goto L_0x06d3
        L_0x09df:
            r0 = move-exception
            r24 = r2
        L_0x09e2:
            r2 = r0
            r5 = r2
            r2 = r23
            r12 = r26
            r13 = r29
            r4 = r30
            r3 = r33
            goto L_0x06ec
        L_0x09f0:
            r0 = move-exception
            r24 = r2
        L_0x09f3:
            r2 = r0
            r5 = r2
            r2 = r23
            r12 = r26
            r13 = r29
            r4 = r30
            r3 = r33
            goto L_0x0705
        L_0x0a01:
            r24 = r2
        L_0x0a03:
            java.lang.String r2 = "isStop:%b"
            r3 = 1
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ ProtocolException -> 0x0b07, NoRouteToHostException -> 0x0afb, UnknownServiceException -> 0x0aef, IOException -> 0x0ae1, Exception -> 0x0ad4, all -> 0x0ac8 }
            boolean r3 = r1.f289995j     // Catch:{ ProtocolException -> 0x0b07, NoRouteToHostException -> 0x0afb, UnknownServiceException -> 0x0aef, IOException -> 0x0ae1, Exception -> 0x0ad4, all -> 0x0ac8 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ ProtocolException -> 0x0b07, NoRouteToHostException -> 0x0afb, UnknownServiceException -> 0x0aef, IOException -> 0x0ae1, Exception -> 0x0ad4, all -> 0x0ac8 }
            r12 = 0
            r5[r12] = r3     // Catch:{ ProtocolException -> 0x0b07, NoRouteToHostException -> 0x0afb, UnknownServiceException -> 0x0aef, IOException -> 0x0ae1, Exception -> 0x0ad4, all -> 0x0ac8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r2, r5)     // Catch:{ ProtocolException -> 0x0b07, NoRouteToHostException -> 0x0afb, UnknownServiceException -> 0x0aef, IOException -> 0x0ae1, Exception -> 0x0ad4, all -> 0x0ac8 }
            if (r4 != 0) goto L_0x0a40
            r2 = 0
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x0a40
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r9)
            r8.setLength(r6)     // Catch:{ IOException -> 0x0a24 }
            goto L_0x0a2c
        L_0x0a24:
            r0 = move-exception
            r2 = r0
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r2, r14, r4)
        L_0x0a2c:
            r1.mo138266c(r6)
            r2 = 256000(0x3e800, double:1.26481E-318)
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0a94
            ja2.b$a r2 = new ja2.b$a
            r3 = 1
            r2.<init>(r3)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
            goto L_0x0a94
        L_0x0a40:
            if (r4 == 0) goto L_0x0a60
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x0a60
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            r4 = 0
            r2[r4] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r4 = 1
            r2[r4] = r3
            r3 = r33
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r3, r2)
            r1.mo138268e(r6, r10)
            goto L_0x0a94
        L_0x0a60:
            if (r4 == 0) goto L_0x0a8f
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x0a8f
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            r4 = 0
            r2[r4] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r4 = 1
            r2[r4] = r3
            r12 = r26
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r12, r2)
            r1.mo138266c(r10)
            r2 = 256000(0x3e800, double:1.26481E-318)
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x0a94
            ja2.b$a r2 = new ja2.b$a
            r2.<init>(r4)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
            goto L_0x0a94
        L_0x0a8f:
            r2 = r23
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r2)
        L_0x0a94:
            if (r24 == 0) goto L_0x0aa5
            r24.close()     // Catch:{ IOException -> 0x0a9a }
            goto L_0x0aa5
        L_0x0a9a:
            r0 = move-exception
            r2 = r0
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r13 = r29
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r2, r13, r4)
            goto L_0x0aa6
        L_0x0aa5:
            r3 = 0
        L_0x0aa6:
            r8.close()     // Catch:{ IOException -> 0x0aaa }
            goto L_0x0ab1
        L_0x0aaa:
            r0 = move-exception
            r2 = r0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r2, r14, r3)
        L_0x0ab1:
            java.io.InputStream r2 = r34.getInputStream()     // Catch:{ Exception -> 0x0ab9 }
            r2.close()     // Catch:{ Exception -> 0x0ab9 }
            goto L_0x0ac2
        L_0x0ab9:
            r0 = move-exception
            r2 = r0
            java.lang.String r2 = r2.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r2)
        L_0x0ac2:
            r34.disconnect()
        L_0x0ac5:
            r2 = 1
            goto L_0x1477
        L_0x0ac8:
            r0 = move-exception
        L_0x0ac9:
            r2 = r23
            r12 = r26
            r13 = r29
            r4 = r30
            r3 = r33
            goto L_0x0b17
        L_0x0ad4:
            r0 = move-exception
        L_0x0ad5:
            r2 = r23
            r12 = r26
            r13 = r29
            r4 = r30
            r3 = r33
            goto L_0x0dc2
        L_0x0ae1:
            r0 = move-exception
        L_0x0ae2:
            r2 = r23
            r12 = r26
            r13 = r29
            r4 = r30
            r3 = r33
        L_0x0aec:
            r5 = r0
            goto L_0x0c77
        L_0x0aef:
            r0 = move-exception
        L_0x0af0:
            r2 = r23
            r12 = r26
            r13 = r29
            r4 = r30
            r3 = r33
            goto L_0x0b2a
        L_0x0afb:
            r0 = move-exception
        L_0x0afc:
            r2 = r23
            r12 = r26
            r13 = r29
            r4 = r30
            r3 = r33
            goto L_0x0b31
        L_0x0b07:
            r0 = move-exception
        L_0x0b08:
            r2 = r23
            r12 = r26
            r13 = r29
            r4 = r30
            r3 = r33
            goto L_0x0b38
        L_0x0b13:
            r0 = move-exception
            r24 = r2
            goto L_0x0ac9
        L_0x0b17:
            r5 = r0
        L_0x0b18:
            r22 = r6
            r6 = r24
            goto L_0x0cb3
        L_0x0b1e:
            r0 = move-exception
            r24 = r2
            goto L_0x0ad5
        L_0x0b22:
            r0 = move-exception
            r24 = r2
            goto L_0x0ae2
        L_0x0b26:
            r0 = move-exception
            r24 = r2
            goto L_0x0af0
        L_0x0b2a:
            r5 = r0
            goto L_0x06d3
        L_0x0b2d:
            r0 = move-exception
            r24 = r2
            goto L_0x0afc
        L_0x0b31:
            r5 = r0
            goto L_0x06ec
        L_0x0b34:
            r0 = move-exception
            r24 = r2
            goto L_0x0b08
        L_0x0b38:
            r5 = r0
            goto L_0x0705
        L_0x0b3b:
            r0 = move-exception
            r24 = r2
            r34 = r3
            r3 = r7
            r2 = r23
            r12 = r26
            r13 = r29
            r4 = r30
            r5 = r0
            r6 = r24
            r22 = r27
            goto L_0x0cb3
        L_0x0b50:
            r0 = move-exception
            r24 = r2
            r34 = r3
            r3 = r7
            r2 = r23
            r12 = r26
            r13 = r29
            r4 = r30
            r7 = r0
            goto L_0x0c2f
        L_0x0b61:
            r0 = move-exception
            r24 = r2
            r34 = r3
            r3 = r7
            r2 = r23
            r12 = r26
            r13 = r29
            r4 = r30
            r5 = r0
            r6 = r27
            goto L_0x0c77
        L_0x0b74:
            r0 = move-exception
            r24 = r2
            r34 = r3
            r3 = r7
            r2 = r23
            r12 = r26
            r13 = r29
            r4 = r30
            r5 = r0
            r6 = r27
            goto L_0x06d3
        L_0x0b87:
            r0 = move-exception
            r24 = r2
            r34 = r3
            r3 = r7
            r2 = r23
            r12 = r26
            r13 = r29
            r4 = r30
            r5 = r0
            r6 = r27
            goto L_0x06ec
        L_0x0b9a:
            r0 = move-exception
            r24 = r2
            r34 = r3
            r3 = r7
            r2 = r23
            r12 = r26
            r13 = r29
            r4 = r30
            r5 = r0
            r6 = r27
            goto L_0x0705
        L_0x0bad:
            r0 = move-exception
            r34 = r3
            r27 = r5
            r3 = r7
            r2 = r23
            r12 = r26
            r13 = r29
            r4 = r30
            r5 = r0
            goto L_0x0c12
        L_0x0bbe:
            r0 = move-exception
            r34 = r3
            r27 = r5
            r3 = r7
            r2 = r23
            r12 = r26
        L_0x0bc8:
            r13 = r29
            r4 = r30
            r5 = r0
            goto L_0x0c2e
        L_0x0bcf:
            r0 = move-exception
            r34 = r3
            r27 = r5
            r3 = r7
            r2 = r23
            r12 = r26
        L_0x0bd9:
            r13 = r29
            r4 = r30
            goto L_0x0ddb
        L_0x0bdf:
            r0 = move-exception
            r34 = r3
            r27 = r5
            r3 = r7
            r2 = r23
            r12 = r26
            r13 = r29
            r4 = r30
        L_0x0bed:
            r5 = r0
            goto L_0x0efc
        L_0x0bf0:
            r0 = move-exception
            r34 = r3
            r27 = r5
            r3 = r7
            r2 = r23
            r12 = r26
            r13 = r29
            r4 = r30
        L_0x0bfe:
            r5 = r0
            goto L_0x0f16
        L_0x0c01:
            r0 = move-exception
            r34 = r3
            r27 = r5
            r3 = r7
            r2 = r23
            r12 = r26
            r13 = r29
            r4 = r30
        L_0x0c0f:
            r5 = r0
            goto L_0x0f30
        L_0x0c12:
            r22 = r27
            goto L_0x138f
        L_0x0c16:
            r0 = move-exception
            r34 = r3
            r27 = r5
            r3 = r7
            r13 = r29
            r4 = r30
            r30 = r4
            r7 = r13
            r22 = r27
            goto L_0x0d53
        L_0x0c27:
            r0 = move-exception
            r34 = r3
            r27 = r5
            r3 = r7
            goto L_0x0bc8
        L_0x0c2e:
            r7 = r5
        L_0x0c2f:
            r5 = r27
            goto L_0x1013
        L_0x0c33:
            r0 = move-exception
            r34 = r3
            r27 = r5
            r3 = r7
            goto L_0x0bd9
        L_0x0c3a:
            r0 = move-exception
            r34 = r3
            r27 = r5
            r3 = r7
            r13 = r29
            r4 = r30
            goto L_0x0bed
        L_0x0c45:
            r0 = move-exception
            r34 = r3
            r27 = r5
            r3 = r7
            r13 = r29
            r4 = r30
            goto L_0x0bfe
        L_0x0c50:
            r0 = move-exception
            r34 = r3
            r27 = r5
            r3 = r7
            r13 = r29
            r4 = r30
            goto L_0x0c0f
        L_0x0c5b:
            r0 = move-exception
            r34 = r3
            r3 = r7
            r4 = r13
            r13 = r29
            goto L_0x0cae
        L_0x0c64:
            r0 = move-exception
            r34 = r3
            r3 = r7
            r4 = r13
            r13 = r29
            goto L_0x0cc4
        L_0x0c6d:
            r0 = move-exception
            r34 = r3
            r3 = r7
            r4 = r13
            r13 = r29
            r6 = r5
            goto L_0x0aec
        L_0x0c77:
            r30 = r4
            r29 = r13
        L_0x0c7b:
            r4 = r18
            goto L_0x10fc
        L_0x0c7f:
            r0 = move-exception
            r34 = r3
            r3 = r7
            r4 = r13
            r13 = r29
            r7 = r0
            goto L_0x0f7e
        L_0x0c89:
            r0 = move-exception
            r34 = r3
            r3 = r7
            r4 = r13
            r13 = r29
            r7 = r0
            goto L_0x0fa5
        L_0x0c93:
            r0 = move-exception
            r34 = r3
            r3 = r7
            r4 = r13
            r13 = r29
            r7 = r0
            goto L_0x0fcc
        L_0x0c9d:
            r0 = move-exception
            r34 = r3
            goto L_0x0cdd
        L_0x0ca1:
            r0 = move-exception
            r34 = r3
            r2 = r23
            r12 = r26
            r3 = r27
            r13 = r29
            r4 = r36
        L_0x0cae:
            r22 = r5
            r6 = r24
            r5 = r0
        L_0x0cb3:
            r24 = r8
            goto L_0x0ff5
        L_0x0cb7:
            r0 = move-exception
            r34 = r3
        L_0x0cba:
            r2 = r23
            r12 = r26
            r3 = r27
        L_0x0cc0:
            r13 = r29
            r4 = r36
        L_0x0cc4:
            r7 = r0
            goto L_0x1013
        L_0x0cc7:
            r0 = move-exception
            r34 = r3
            goto L_0x0cf6
        L_0x0ccb:
            r0 = move-exception
            r34 = r3
            goto L_0x0d0a
        L_0x0ccf:
            r0 = move-exception
            r34 = r3
            goto L_0x0d1e
        L_0x0cd4:
            r0 = move-exception
            r34 = r3
            goto L_0x0d32
        L_0x0cd9:
            r0 = move-exception
            r34 = r3
            r14 = r13
        L_0x0cdd:
            r2 = r23
            r12 = r26
            r3 = r27
            r13 = r29
            r4 = r36
            r7 = r0
            r22 = r5
            r5 = r7
            goto L_0x138f
        L_0x0ced:
            r0 = move-exception
            r34 = r3
            r14 = r13
            goto L_0x0cba
        L_0x0cf2:
            r0 = move-exception
            r34 = r3
            r14 = r13
        L_0x0cf6:
            r2 = r23
            r12 = r26
            r3 = r27
            r13 = r29
            r4 = r36
            r7 = r0
            r27 = r5
            r5 = r7
            goto L_0x0ddc
        L_0x0d06:
            r0 = move-exception
            r34 = r3
            r14 = r13
        L_0x0d0a:
            r2 = r23
            r12 = r26
            r3 = r27
            r13 = r29
            r4 = r36
            r7 = r0
            r27 = r5
            r5 = r7
            goto L_0x0efc
        L_0x0d1a:
            r0 = move-exception
            r34 = r3
            r14 = r13
        L_0x0d1e:
            r2 = r23
            r12 = r26
            r3 = r27
            r13 = r29
            r4 = r36
            r7 = r0
            r27 = r5
            r5 = r7
            goto L_0x0f16
        L_0x0d2e:
            r0 = move-exception
            r34 = r3
            r14 = r13
        L_0x0d32:
            r2 = r23
            r12 = r26
            r3 = r27
            r13 = r29
            r4 = r36
            r7 = r0
            r27 = r5
            r5 = r7
            goto L_0x0f30
        L_0x0d42:
            r0 = move-exception
            r12 = r2
            r34 = r3
            r3 = r7
            r14 = r13
            r2 = r23
            r13 = r29
            r4 = r36
            r30 = r4
            r22 = r5
            r7 = r13
        L_0x0d53:
            r4 = r0
            goto L_0x10dd
        L_0x0d56:
            r0 = move-exception
            r12 = r2
            r34 = r3
            r3 = r7
            r14 = r13
            r2 = r23
            goto L_0x0cc0
        L_0x0d60:
            r0 = move-exception
            r12 = r2
            r34 = r3
            r3 = r7
            r14 = r13
            r2 = r23
            r13 = r29
            r4 = r36
            goto L_0x0dd9
        L_0x0d6e:
            r0 = move-exception
            r12 = r2
            r34 = r3
            r3 = r7
            r14 = r13
            r2 = r23
            r13 = r29
            r4 = r36
            r27 = r5
            goto L_0x0bed
        L_0x0d7e:
            r0 = move-exception
            r12 = r2
            r34 = r3
            r3 = r7
            r14 = r13
            r2 = r23
            r13 = r29
            r4 = r36
            r27 = r5
            goto L_0x0bfe
        L_0x0d8e:
            r0 = move-exception
            r12 = r2
            r34 = r3
            r3 = r7
            r14 = r13
            r2 = r23
            r13 = r29
            r4 = r36
            r27 = r5
            goto L_0x0c0f
        L_0x0d9e:
            r0 = move-exception
            r12 = r2
            r34 = r3
            r3 = r7
            r2 = r23
            r14 = r27
            r13 = r29
            r4 = r30
            r8 = r35
            r22 = r5
            r5 = r0
            goto L_0x138f
        L_0x0db2:
            r0 = move-exception
            r12 = r2
            r34 = r3
            r3 = r7
            r2 = r23
            r14 = r27
            r13 = r29
            r4 = r30
            r8 = r35
            r6 = r5
        L_0x0dc2:
            r5 = r0
            r37 = r6
            r7 = r5
            r5 = r37
            goto L_0x1013
        L_0x0dca:
            r0 = move-exception
            r12 = r2
            r34 = r3
            r3 = r7
            r2 = r23
            r14 = r27
            r13 = r29
            r4 = r30
            r8 = r35
        L_0x0dd9:
            r27 = r5
        L_0x0ddb:
            r5 = r0
        L_0x0ddc:
            r7 = r5
            r5 = r27
            goto L_0x0f61
        L_0x0de1:
            r0 = move-exception
            r12 = r2
            r34 = r3
            r3 = r7
            r2 = r23
            r14 = r27
            r13 = r29
            r4 = r30
            r8 = r35
            r27 = r5
            goto L_0x0bed
        L_0x0df4:
            r0 = move-exception
            r12 = r2
            r34 = r3
            r3 = r7
            r2 = r23
            r14 = r27
            r13 = r29
            r4 = r30
            r8 = r35
            r27 = r5
            goto L_0x0bfe
        L_0x0e07:
            r0 = move-exception
            r12 = r2
            r34 = r3
            r3 = r7
            r2 = r23
            r14 = r27
            r13 = r29
            r4 = r30
            r8 = r35
            r27 = r5
            goto L_0x0c0f
        L_0x0e1a:
            r0 = move-exception
            r12 = r2
            r3 = r7
            r2 = r23
            r14 = r27
            r13 = r29
            r4 = r30
            r8 = r35
            goto L_0x0ec0
        L_0x0e29:
            r0 = move-exception
            goto L_0x0371
        L_0x0e2c:
            r0 = move-exception
            r12 = r2
            r3 = r7
            r2 = r23
            r14 = r27
            r13 = r29
            r4 = r30
            r8 = r35
            goto L_0x0ee5
        L_0x0e3b:
            r0 = move-exception
            r12 = r2
            r3 = r7
            r2 = r23
            r14 = r27
            r13 = r29
            r4 = r30
            r8 = r35
            goto L_0x0ef6
        L_0x0e4a:
            r0 = move-exception
            r12 = r2
            r3 = r7
            r2 = r23
            r14 = r27
            r13 = r29
            r4 = r30
            r8 = r35
            goto L_0x0f10
        L_0x0e59:
            r0 = move-exception
            r12 = r2
            r3 = r7
            r2 = r23
            r14 = r27
            r13 = r29
            r4 = r30
            r8 = r35
            goto L_0x0f2a
        L_0x0e68:
            r0 = move-exception
            r12 = r2
            r3 = r7
            r2 = r8
            r8 = r14
            r14 = r27
            r13 = r29
            r4 = r30
            goto L_0x0ec0
        L_0x0e75:
            r0 = move-exception
            r12 = r2
            r3 = r7
            r2 = r8
            r8 = r14
            r14 = r27
            r13 = r29
            r4 = r30
            goto L_0x037d
        L_0x0e82:
            r0 = move-exception
            r12 = r2
            r3 = r7
            r2 = r8
            r8 = r14
            r14 = r27
            r13 = r29
            r4 = r30
            goto L_0x0ee5
        L_0x0e8f:
            r0 = move-exception
            r12 = r2
            r3 = r7
            r2 = r8
            r8 = r14
            r14 = r27
            r13 = r29
            r4 = r30
            goto L_0x0ef6
        L_0x0e9c:
            r0 = move-exception
            r12 = r2
            r3 = r7
            r2 = r8
            r8 = r14
            r14 = r27
            r13 = r29
            r4 = r30
            goto L_0x0f10
        L_0x0ea9:
            r0 = move-exception
            r12 = r2
            r3 = r7
            r2 = r8
            r8 = r14
            r14 = r27
            r13 = r29
            r4 = r30
            goto L_0x0f2a
        L_0x0eb6:
            r0 = move-exception
            r3 = r7
            r4 = r12
            r13 = r29
            r12 = r2
            r2 = r8
            r8 = r14
            r14 = r27
        L_0x0ec0:
            r7 = r0
            r22 = r5
            r34 = r24
            goto L_0x1390
        L_0x0ec7:
            r0 = move-exception
            r22 = r4
            r3 = r7
            r4 = r12
            r13 = r29
            r12 = r2
            r2 = r8
            r8 = r14
            r14 = r27
            goto L_0x037d
        L_0x0ed5:
            r34 = r24
            goto L_0x1013
        L_0x0ed9:
            r0 = move-exception
            r22 = r4
            r3 = r7
            r4 = r12
            r13 = r29
            r12 = r2
            r2 = r8
            r8 = r14
            r14 = r27
        L_0x0ee5:
            r7 = r0
            r34 = r24
            goto L_0x0f61
        L_0x0eea:
            r0 = move-exception
            r22 = r4
            r3 = r7
            r4 = r12
            r13 = r29
            r12 = r2
            r2 = r8
            r8 = r14
            r14 = r27
        L_0x0ef6:
            r7 = r0
            r27 = r5
            r5 = r7
            r34 = r24
        L_0x0efc:
            r30 = r4
            r4 = r18
            r6 = r27
            goto L_0x11d4
        L_0x0f04:
            r0 = move-exception
            r22 = r4
            r3 = r7
            r4 = r12
            r13 = r29
            r12 = r2
            r2 = r8
            r8 = r14
            r14 = r27
        L_0x0f10:
            r7 = r0
            r27 = r5
            r5 = r7
            r34 = r24
        L_0x0f16:
            r30 = r4
            r4 = r18
            r6 = r27
            goto L_0x12b8
        L_0x0f1e:
            r0 = move-exception
            r22 = r4
            r3 = r7
            r4 = r12
            r13 = r29
            r12 = r2
            r2 = r8
            r8 = r14
            r14 = r27
        L_0x0f2a:
            r7 = r0
            r27 = r5
            r5 = r7
            r34 = r24
        L_0x0f30:
            r30 = r4
            r4 = r18
            r6 = r27
            goto L_0x13aa
        L_0x0f38:
            r0 = move-exception
            r3 = r7
            r4 = r12
            r14 = r27
            r13 = r29
            r12 = r2
            r2 = r8
            goto L_0x0fed
        L_0x0f43:
            r0 = move-exception
            r22 = r4
            r3 = r7
            r4 = r12
            r14 = r27
            r13 = r29
            r12 = r2
            r2 = r8
        L_0x0f4e:
            r7 = r0
            goto L_0x100f
        L_0x0f51:
            r0 = move-exception
            r22 = r4
            r3 = r7
            r4 = r12
            r14 = r27
            r13 = r29
            r12 = r2
            r2 = r8
            r7 = r0
            r8 = r24
            r34 = r8
        L_0x0f61:
            r30 = r4
            r29 = r13
            r4 = r18
            r37 = r5
            r5 = r7
        L_0x0f6a:
            r6 = r37
            goto L_0x10fc
        L_0x0f6e:
            r0 = move-exception
            r22 = r4
            r3 = r7
            r4 = r12
            r14 = r27
            r13 = r29
            r12 = r2
            r2 = r8
            r7 = r0
            r8 = r24
            r34 = r8
        L_0x0f7e:
            r37 = r5
            r5 = r7
            r6 = r37
            r39 = r24
            r24 = r8
            r8 = r39
        L_0x0f89:
            r30 = r4
            r4 = r18
            r37 = r24
            r24 = r8
            r8 = r37
            goto L_0x11d4
        L_0x0f95:
            r0 = move-exception
            r22 = r4
            r3 = r7
            r4 = r12
            r14 = r27
            r13 = r29
            r12 = r2
            r2 = r8
            r7 = r0
            r8 = r24
            r34 = r8
        L_0x0fa5:
            r37 = r5
            r5 = r7
            r6 = r37
            r39 = r24
            r24 = r8
            r8 = r39
        L_0x0fb0:
            r30 = r4
            r4 = r18
            r37 = r24
            r24 = r8
            r8 = r37
            goto L_0x12b8
        L_0x0fbc:
            r0 = move-exception
            r22 = r4
            r3 = r7
            r4 = r12
            r14 = r27
            r13 = r29
            r12 = r2
            r2 = r8
            r7 = r0
            r8 = r24
            r34 = r8
        L_0x0fcc:
            r37 = r5
            r5 = r7
            r6 = r37
            r39 = r24
            r24 = r8
            r8 = r39
        L_0x0fd7:
            r30 = r4
            r4 = r18
            r37 = r24
            r24 = r8
            r8 = r37
            goto L_0x13aa
        L_0x0fe3:
            r0 = move-exception
            r12 = r2
            r3 = r7
            r2 = r8
            r14 = r27
            r13 = r29
            r4 = r30
        L_0x0fed:
            r7 = r0
            r22 = r5
            r5 = r7
            r6 = r24
            r34 = r6
        L_0x0ff5:
            r8 = r5
            r5 = r13
        L_0x0ff7:
            r13 = r24
            r17 = 0
            r24 = r6
            r6 = r22
            goto L_0x1491
        L_0x1001:
            r0 = move-exception
            r12 = r2
            r22 = r4
            r3 = r7
            r2 = r8
            r14 = r27
            r13 = r29
            r4 = r30
            goto L_0x0f4e
        L_0x100f:
            r8 = r24
            r34 = r8
        L_0x1013:
            r30 = r4
            r29 = r13
            r4 = 1
            java.lang.Object[] r13 = new java.lang.Object[r4]     // Catch:{ all -> 0x10d7 }
            java.lang.String r4 = r22.mo119971i()     // Catch:{ all -> 0x10d7 }
            r16 = 0
            r13[r16] = r4     // Catch:{ all -> 0x10d7 }
            r4 = r18
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r7, r4, r13)     // Catch:{ all -> 0x10d7 }
            r4 = 754(0x2f2, float:1.057E-42)
            r1.f289998p = r4     // Catch:{ all -> 0x10d7 }
            r4 = 5
            r1.mo138267d(r4)     // Catch:{ all -> 0x10d7 }
            r17 = 0
            int r4 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r4 != 0) goto L_0x105c
            int r7 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r7 <= 0) goto L_0x105c
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r9)
            r8.setLength(r5)     // Catch:{ IOException -> 0x1040 }
            goto L_0x1048
        L_0x1040:
            r0 = move-exception
            r2 = r0
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r2, r14, r4)
        L_0x1048:
            r1.mo138266c(r5)
            r2 = 256000(0x3e800, double:1.26481E-318)
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x10aa
            ja2.b$a r2 = new ja2.b$a
            r3 = 1
            r2.<init>(r3)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
            goto L_0x10aa
        L_0x105c:
            if (r4 == 0) goto L_0x107a
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x107a
            r7 = 2
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            r7 = 0
            r2[r7] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r5)
            r7 = 1
            r2[r7] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r3, r2)
            r1.mo138268e(r5, r10)
            goto L_0x10aa
        L_0x107a:
            if (r4 == 0) goto L_0x10a7
            int r3 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x10a7
            r3 = 2
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            r4 = 0
            r2[r4] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r4 = 1
            r2[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r12, r2)
            r1.mo138266c(r10)
            r2 = 256000(0x3e800, double:1.26481E-318)
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x10aa
            ja2.b$a r2 = new ja2.b$a
            r2.<init>(r4)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
            goto L_0x10aa
        L_0x10a7:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r2)
        L_0x10aa:
            if (r24 == 0) goto L_0x10ba
            r24.close()     // Catch:{ IOException -> 0x10b0 }
            goto L_0x10ba
        L_0x10b0:
            r0 = move-exception
            r2 = r0
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r7 = r29
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r2, r7, r4)
        L_0x10ba:
            if (r8 == 0) goto L_0x10c8
            r8.close()     // Catch:{ IOException -> 0x10c0 }
            goto L_0x10c8
        L_0x10c0:
            r0 = move-exception
            r2 = r0
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r2, r14, r3)
        L_0x10c8:
            if (r34 == 0) goto L_0x0ac5
            java.io.InputStream r2 = r34.getInputStream()     // Catch:{ Exception -> 0x10d3 }
            r2.close()     // Catch:{ Exception -> 0x10d3 }
            goto L_0x1380
        L_0x10d3:
            r0 = move-exception
            r2 = r0
            goto L_0x1379
        L_0x10d7:
            r0 = move-exception
            r7 = r29
            r4 = r0
            r22 = r5
        L_0x10dd:
            r5 = r7
            r6 = r24
            r7 = r4
            r24 = r8
            r4 = r30
            goto L_0x148e
        L_0x10e7:
            r0 = move-exception
            r12 = r2
            r22 = r4
            r3 = r7
            r2 = r8
            r4 = r18
            r14 = r27
            r7 = r29
            r8 = r0
        L_0x10f4:
            r29 = r7
            r34 = r24
            r6 = r5
            r5 = r8
            r8 = r34
        L_0x10fc:
            r23 = r2
            r13 = 1
            java.lang.Object[] r2 = new java.lang.Object[r13]     // Catch:{ all -> 0x1298 }
            java.lang.String r13 = r22.mo119971i()     // Catch:{ all -> 0x1298 }
            r16 = 0
            r2[r16] = r13     // Catch:{ all -> 0x1298 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r5, r4, r2)     // Catch:{ all -> 0x1298 }
            r2 = 753(0x2f1, float:1.055E-42)
            r1.f289998p = r2     // Catch:{ all -> 0x1298 }
            r2 = 5
            r1.mo138267d(r2)     // Catch:{ all -> 0x1298 }
            r4 = 0
            int r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x1141
            int r13 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r13 <= 0) goto L_0x1141
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r9)
            r8.setLength(r6)     // Catch:{ IOException -> 0x1125 }
            goto L_0x112d
        L_0x1125:
            r0 = move-exception
            r2 = r0
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r2, r14, r4)
        L_0x112d:
            r1.mo138266c(r6)
            r2 = 256000(0x3e800, double:1.26481E-318)
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x1191
            ja2.b$a r2 = new ja2.b$a
            r3 = 1
            r2.<init>(r3)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
            goto L_0x1191
        L_0x1141:
            if (r2 == 0) goto L_0x115f
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x115f
            r4 = 2
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            r5 = 0
            r2[r5] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r5 = 1
            r2[r5] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r3, r2)
            r1.mo138268e(r6, r10)
            goto L_0x1191
        L_0x115f:
            if (r2 == 0) goto L_0x118c
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x118c
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            r4 = 0
            r2[r4] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r4 = 1
            r2[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r12, r2)
            r1.mo138266c(r10)
            r2 = 256000(0x3e800, double:1.26481E-318)
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x1191
            ja2.b$a r2 = new ja2.b$a
            r2.<init>(r4)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
            goto L_0x1191
        L_0x118c:
            r2 = r23
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r2)
        L_0x1191:
            if (r24 == 0) goto L_0x11a1
            r24.close()     // Catch:{ IOException -> 0x1197 }
            goto L_0x11a1
        L_0x1197:
            r0 = move-exception
            r2 = r0
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r13 = r29
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r2, r13, r4)
        L_0x11a1:
            if (r8 == 0) goto L_0x11af
            r8.close()     // Catch:{ IOException -> 0x11a7 }
            goto L_0x11af
        L_0x11a7:
            r0 = move-exception
            r2 = r0
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r2, r14, r3)
        L_0x11af:
            if (r34 == 0) goto L_0x0ac5
            java.io.InputStream r2 = r34.getInputStream()     // Catch:{ Exception -> 0x11ba }
            r2.close()     // Catch:{ Exception -> 0x11ba }
            goto L_0x1380
        L_0x11ba:
            r0 = move-exception
            r2 = r0
            goto L_0x1379
        L_0x11be:
            r0 = move-exception
            r12 = r2
            r22 = r4
            r3 = r7
            r2 = r8
            r4 = r18
            r14 = r27
            r13 = r29
            r7 = r0
        L_0x11cb:
            r8 = r24
            r34 = r8
            r37 = r5
            r5 = r7
        L_0x11d2:
            r6 = r37
        L_0x11d4:
            r23 = r2
            r29 = r13
            r13 = 1
            java.lang.Object[] r2 = new java.lang.Object[r13]     // Catch:{ all -> 0x1298 }
            java.lang.String r13 = r22.mo119971i()     // Catch:{ all -> 0x1298 }
            r16 = 0
            r2[r16] = r13     // Catch:{ all -> 0x1298 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r5, r4, r2)     // Catch:{ all -> 0x1298 }
            r2 = 752(0x2f0, float:1.054E-42)
            r1.f289998p = r2     // Catch:{ all -> 0x1298 }
            r2 = 5
            r1.mo138267d(r2)     // Catch:{ all -> 0x1298 }
            r4 = 0
            int r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x121b
            int r13 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r13 <= 0) goto L_0x121b
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r9)
            r8.setLength(r6)     // Catch:{ IOException -> 0x11ff }
            goto L_0x1207
        L_0x11ff:
            r0 = move-exception
            r2 = r0
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r2, r14, r4)
        L_0x1207:
            r1.mo138266c(r6)
            r2 = 256000(0x3e800, double:1.26481E-318)
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x126b
            ja2.b$a r2 = new ja2.b$a
            r3 = 1
            r2.<init>(r3)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
            goto L_0x126b
        L_0x121b:
            if (r2 == 0) goto L_0x1239
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x1239
            r4 = 2
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            r5 = 0
            r2[r5] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r5 = 1
            r2[r5] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r3, r2)
            r1.mo138268e(r6, r10)
            goto L_0x126b
        L_0x1239:
            if (r2 == 0) goto L_0x1266
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x1266
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            r4 = 0
            r2[r4] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r4 = 1
            r2[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r12, r2)
            r1.mo138266c(r10)
            r2 = 256000(0x3e800, double:1.26481E-318)
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x126b
            ja2.b$a r2 = new ja2.b$a
            r2.<init>(r4)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
            goto L_0x126b
        L_0x1266:
            r2 = r23
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r2)
        L_0x126b:
            if (r24 == 0) goto L_0x127b
            r24.close()     // Catch:{ IOException -> 0x1271 }
            goto L_0x127b
        L_0x1271:
            r0 = move-exception
            r2 = r0
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r13 = r29
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r2, r13, r4)
        L_0x127b:
            if (r8 == 0) goto L_0x1289
            r8.close()     // Catch:{ IOException -> 0x1281 }
            goto L_0x1289
        L_0x1281:
            r0 = move-exception
            r2 = r0
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r2, r14, r3)
        L_0x1289:
            if (r34 == 0) goto L_0x0ac5
            java.io.InputStream r2 = r34.getInputStream()     // Catch:{ Exception -> 0x1294 }
            r2.close()     // Catch:{ Exception -> 0x1294 }
            goto L_0x1380
        L_0x1294:
            r0 = move-exception
            r2 = r0
            goto L_0x1379
        L_0x1298:
            r0 = move-exception
            r5 = r0
            r2 = r23
            r13 = r29
            r4 = r30
            goto L_0x138d
        L_0x12a2:
            r0 = move-exception
            r12 = r2
            r22 = r4
            r3 = r7
            r2 = r8
            r4 = r18
            r14 = r27
            r13 = r29
            r7 = r0
        L_0x12af:
            r8 = r24
            r34 = r8
            r37 = r5
            r5 = r7
        L_0x12b6:
            r6 = r37
        L_0x12b8:
            r23 = r2
            r29 = r13
            r13 = 1
            java.lang.Object[] r2 = new java.lang.Object[r13]     // Catch:{ all -> 0x1385 }
            java.lang.String r13 = r22.mo119971i()     // Catch:{ all -> 0x1385 }
            r16 = 0
            r2[r16] = r13     // Catch:{ all -> 0x1385 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r5, r4, r2)     // Catch:{ all -> 0x1385 }
            r2 = 751(0x2ef, float:1.052E-42)
            r1.f289998p = r2     // Catch:{ all -> 0x1385 }
            r2 = 5
            r1.mo138267d(r2)     // Catch:{ all -> 0x1385 }
            r4 = 0
            int r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x12ff
            int r13 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r13 <= 0) goto L_0x12ff
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r9)
            r8.setLength(r6)     // Catch:{ IOException -> 0x12e3 }
            goto L_0x12eb
        L_0x12e3:
            r0 = move-exception
            r2 = r0
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r2, r14, r4)
        L_0x12eb:
            r1.mo138266c(r6)
            r2 = 256000(0x3e800, double:1.26481E-318)
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x134f
            ja2.b$a r2 = new ja2.b$a
            r3 = 1
            r2.<init>(r3)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
            goto L_0x134f
        L_0x12ff:
            if (r2 == 0) goto L_0x131d
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x131d
            r4 = 2
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            r5 = 0
            r2[r5] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r5 = 1
            r2[r5] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r3, r2)
            r1.mo138268e(r6, r10)
            goto L_0x134f
        L_0x131d:
            if (r2 == 0) goto L_0x134a
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x134a
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            r4 = 0
            r2[r4] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r4 = 1
            r2[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r12, r2)
            r1.mo138266c(r10)
            r2 = 256000(0x3e800, double:1.26481E-318)
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x134f
            ja2.b$a r2 = new ja2.b$a
            r2.<init>(r4)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
            goto L_0x134f
        L_0x134a:
            r2 = r23
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r2)
        L_0x134f:
            if (r24 == 0) goto L_0x135f
            r24.close()     // Catch:{ IOException -> 0x1355 }
            goto L_0x135f
        L_0x1355:
            r0 = move-exception
            r2 = r0
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r13 = r29
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r2, r13, r4)
        L_0x135f:
            if (r8 == 0) goto L_0x136d
            r8.close()     // Catch:{ IOException -> 0x1365 }
            goto L_0x136d
        L_0x1365:
            r0 = move-exception
            r2 = r0
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r2, r14, r3)
        L_0x136d:
            if (r34 == 0) goto L_0x0ac5
            java.io.InputStream r2 = r34.getInputStream()     // Catch:{ Exception -> 0x1377 }
            r2.close()     // Catch:{ Exception -> 0x1377 }
            goto L_0x1380
        L_0x1377:
            r0 = move-exception
            r2 = r0
        L_0x1379:
            java.lang.String r2 = r2.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r2)
        L_0x1380:
            r34.disconnect()
            goto L_0x0ac5
        L_0x1385:
            r0 = move-exception
            r2 = r23
            r13 = r29
            r4 = r30
            r5 = r0
        L_0x138d:
            r22 = r6
        L_0x138f:
            r7 = r5
        L_0x1390:
            r5 = r13
            goto L_0x148a
        L_0x1393:
            r0 = move-exception
            r12 = r2
            r22 = r4
            r3 = r7
            r2 = r8
            r4 = r18
            r14 = r27
            r13 = r29
            r7 = r30
            r8 = r0
        L_0x13a2:
            r30 = r7
            r34 = r24
            r6 = r5
            r5 = r8
            r8 = r34
        L_0x13aa:
            r23 = r2
            r29 = r13
            r13 = 1
            java.lang.Object[] r2 = new java.lang.Object[r13]     // Catch:{ all -> 0x147f }
            java.lang.String r13 = r22.mo119971i()     // Catch:{ all -> 0x147f }
            r16 = 0
            r2[r16] = r13     // Catch:{ all -> 0x147f }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r5, r4, r2)     // Catch:{ all -> 0x147f }
            r2 = 750(0x2ee, float:1.051E-42)
            r1.f289998p = r2     // Catch:{ all -> 0x147f }
            r2 = 5
            r1.mo138267d(r2)     // Catch:{ all -> 0x147f }
            r4 = 0
            int r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x13f1
            int r13 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r13 <= 0) goto L_0x13f1
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r9)
            r8.setLength(r6)     // Catch:{ IOException -> 0x13d5 }
            goto L_0x13dd
        L_0x13d5:
            r0 = move-exception
            r2 = r0
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r2, r14, r4)
        L_0x13dd:
            r1.mo138266c(r6)
            r2 = 256000(0x3e800, double:1.26481E-318)
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x1441
            ja2.b$a r2 = new ja2.b$a
            r3 = 1
            r2.<init>(r3)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
            goto L_0x1441
        L_0x13f1:
            if (r2 == 0) goto L_0x140f
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x140f
            r4 = 2
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            r5 = 0
            r2[r5] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r5 = 1
            r2[r5] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r3, r2)
            r1.mo138268e(r6, r10)
            goto L_0x1441
        L_0x140f:
            if (r2 == 0) goto L_0x143c
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x143c
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            r4 = 0
            r2[r4] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r4 = 1
            r2[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r12, r2)
            r1.mo138266c(r10)
            r2 = 256000(0x3e800, double:1.26481E-318)
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x1441
            ja2.b$a r2 = new ja2.b$a
            r2.<init>(r4)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
            goto L_0x1441
        L_0x143c:
            r2 = r23
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r2)
        L_0x1441:
            if (r24 == 0) goto L_0x1451
            r24.close()     // Catch:{ IOException -> 0x1447 }
            goto L_0x1451
        L_0x1447:
            r0 = move-exception
            r2 = r0
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = r29
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r2, r5, r4)
        L_0x1451:
            if (r8 == 0) goto L_0x145f
            r8.close()     // Catch:{ IOException -> 0x1457 }
            goto L_0x145f
        L_0x1457:
            r0 = move-exception
            r2 = r0
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r2, r14, r3)
        L_0x145f:
            if (r34 == 0) goto L_0x0ac5
            java.io.InputStream r2 = r34.getInputStream()     // Catch:{ Exception -> 0x1469 }
            r2.close()     // Catch:{ Exception -> 0x1469 }
            goto L_0x1472
        L_0x1469:
            r0 = move-exception
            r2 = r0
            java.lang.String r2 = r2.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r2)
        L_0x1472:
            r34.disconnect()
            goto L_0x0ac5
        L_0x1477:
            r1.f289995j = r2
            r4 = r30
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r4)
            return
        L_0x147f:
            r0 = move-exception
            r2 = r23
            r5 = r29
            r4 = r30
            r13 = r0
            r22 = r6
            r7 = r13
        L_0x148a:
            r6 = r24
            r24 = r8
        L_0x148e:
            r8 = r7
            goto L_0x0ff7
        L_0x1491:
            int r19 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r19 != 0) goto L_0x14bc
            int r20 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r20 <= 0) goto L_0x14bc
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r9)
            r13.setLength(r6)     // Catch:{ IOException -> 0x14a0 }
            goto L_0x14a8
        L_0x14a0:
            r0 = move-exception
            r2 = r0
            r3 = 0
            java.lang.Object[] r9 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r2, r14, r9)
        L_0x14a8:
            r1.mo138266c(r6)
            r2 = 256000(0x3e800, double:1.26481E-318)
            int r9 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r9 >= 0) goto L_0x150a
            ja2.b$a r2 = new ja2.b$a
            r3 = 1
            r2.<init>(r3)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
            goto L_0x150a
        L_0x14bc:
            if (r19 == 0) goto L_0x14da
            int r9 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r9 == 0) goto L_0x14da
            r9 = 2
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.Long r9 = java.lang.Long.valueOf(r10)
            r12 = 0
            r2[r12] = r9
            java.lang.Long r9 = java.lang.Long.valueOf(r6)
            r12 = 1
            r2[r12] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r3, r2)
            r1.mo138268e(r6, r10)
            goto L_0x150a
        L_0x14da:
            if (r19 == 0) goto L_0x1507
            int r3 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x1507
            r3 = 2
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            r9 = 0
            r2[r9] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r9 = 1
            r2[r9] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r12, r2)
            r1.mo138266c(r10)
            r2 = 256000(0x3e800, double:1.26481E-318)
            int r10 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r10 >= 0) goto L_0x150a
            ja2.b$a r2 = new ja2.b$a
            r2.<init>(r9)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
            goto L_0x150a
        L_0x1507:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r2)
        L_0x150a:
            if (r24 == 0) goto L_0x1518
            r24.close()     // Catch:{ IOException -> 0x1510 }
            goto L_0x1518
        L_0x1510:
            r0 = move-exception
            r2 = r0
            r3 = 0
            java.lang.Object[] r6 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r2, r5, r6)
        L_0x1518:
            if (r13 == 0) goto L_0x1526
            r13.close()     // Catch:{ IOException -> 0x151e }
            goto L_0x1526
        L_0x151e:
            r0 = move-exception
            r2 = r0
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r2, r14, r3)
        L_0x1526:
            if (r34 == 0) goto L_0x153c
            java.io.InputStream r2 = r34.getInputStream()     // Catch:{ Exception -> 0x1530 }
            r2.close()     // Catch:{ Exception -> 0x1530 }
            goto L_0x1539
        L_0x1530:
            r0 = move-exception
            r2 = r0
            java.lang.String r2 = r2.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r2)
        L_0x1539:
            r34.disconnect()
        L_0x153c:
            r2 = 1
            r1.f289995j = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r4)
            throw r8
        L_0x1543:
            ja2.a r2 = r1.f289991f
            long r3 = r2.f289985d
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x1576
            long r5 = r1.f289993h
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x1559
            long r5 = r2.f289987f
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x1576
        L_0x1559:
            float r3 = (float) r3
            long r4 = r2.f289987f
            float r4 = (float) r4
            float r3 = r3 / r4
            float r4 = r1.f289992g
            float r3 = r3 - r4
            int r3 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r3 < 0) goto L_0x1576
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r14)
            r2 = 1
            r1.f289995j = r2
            r1.f289994i = r2
            ja2.b$a r3 = new ja2.b$a
            r3.<init>(r2)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r3)
            return
        L_0x1576:
            long r3 = r2.f289982a
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x15a8
            long r5 = r1.f289993h
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x158a
            long r5 = r2.f289983b
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x15a8
        L_0x158a:
            float r3 = (float) r3
            long r4 = r2.f289983b
            float r2 = (float) r4
            float r3 = r3 / r2
            float r2 = r1.f289992g
            float r3 = r3 - r2
            int r2 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r2 < 0) goto L_0x15a8
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r14)
            r2 = 1
            r1.f289995j = r2
            r3 = 0
            r1.f289994i = r3
            ja2.b$a r3 = new ja2.b$a
            r3.<init>(r2)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r3)
            return
        L_0x15a8:
            r2 = 1
            java.lang.String r3 = "not connect network"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r3)
            r1.f289995j = r2
            r2 = 4
            r1.mo138267d(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ja2.C98927b.run():void");
    }
}
