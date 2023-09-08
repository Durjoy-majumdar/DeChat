package wd3;

import android.net.Uri;
import com.tencent.p014mm.modelimage.C92856r0;
import com.tencent.p014mm.modelimage.loader.impr.C81002e;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C19449k;
import com.tencent.p014mm.pluginsdk.model.C19460q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import jc0.C21210b;
import p248ug.C102027b;
import qe3.C89625d;

/* renamed from: wd3.l */
public final class C22901l {

    /* renamed from: a */
    public HttpURLConnection f65835a;

    /* renamed from: b */
    public final C22902m f65836b;

    /* renamed from: c */
    public String f65837c;

    /* renamed from: d */
    public final boolean f65838d;

    /* renamed from: e */
    public int f65839e = -1;

    public C22901l(String str, boolean z, C22902m mVar) {
        this.f65837c = str;
        this.f65838d = z;
        this.f65836b = mVar;
    }

    /* renamed from: a */
    public void mo36078a(InputStream inputStream) {
        C22902m mVar = this.f65836b;
        if (mVar != null) {
            ((C22903n) mVar).f65851l = System.currentTimeMillis();
        }
        Util.qualityClose(inputStream);
        C22902m mVar2 = this.f65836b;
        if (mVar2 != null) {
            C22903n nVar = (C22903n) mVar2;
            Log.m105927v("MicroMsg.BizImageHttpUrlConnectionListenerImpl", "alvinluo closeStream id: %s, cost: %d", nVar.f65842c, Long.valueOf(System.currentTimeMillis() - nVar.f65851l));
        }
    }

    /* renamed from: b */
    public void mo36079b() {
        InputStream inputStream;
        try {
            HttpURLConnection httpURLConnection = this.f65835a;
            if (!(httpURLConnection == null || (inputStream = httpURLConnection.getInputStream()) == null)) {
                inputStream.close();
            }
            HttpURLConnection httpURLConnection2 = this.f65835a;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            C22902m mVar = this.f65836b;
            if (mVar != null) {
                Log.m105927v("MicroMsg.BizImageHttpUrlConnectionListenerImpl", "alvinluo onDisconnect id: %s", ((C22903n) mVar).f65842c);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public C21210b mo36080c(InputStream inputStream) {
        Object[] objArr = new Object[3];
        HttpURLConnection httpURLConnection = this.f65835a;
        String str = null;
        objArr[0] = httpURLConnection != null ? httpURLConnection.getContentType() : null;
        objArr[1] = this.f65837c;
        HttpURLConnection httpURLConnection2 = this.f65835a;
        objArr[2] = httpURLConnection2 != null ? Integer.valueOf(httpURLConnection2.getContentLength()) : null;
        Log.m105919d("MicroMsg.BizImageHttpUrlConnection", "alvinluo getDataResponse contentType: %s, url: %s, contentLength: %s", objArr);
        C22902m mVar = this.f65836b;
        if (mVar != null) {
            ((C22903n) mVar).f65850k = System.currentTimeMillis();
        }
        if (inputStream == null) {
            HttpURLConnection httpURLConnection3 = this.f65835a;
            inputStream = httpURLConnection3 != null ? httpURLConnection3.getInputStream() : null;
        }
        byte[] d = C81002e.m98906d(inputStream, false);
        HttpURLConnection httpURLConnection4 = this.f65835a;
        if (httpURLConnection4 != null) {
            str = httpURLConnection4.getContentType();
        }
        C21210b bVar = new C21210b(d, 2, str);
        HttpURLConnection httpURLConnection5 = this.f65835a;
        bVar.f59990f = httpURLConnection5 != null ? httpURLConnection5.getContentLength() : 0;
        C22902m mVar2 = this.f65836b;
        if (mVar2 != null) {
            C22903n nVar = (C22903n) mVar2;
            Log.m105927v("MicroMsg.BizImageHttpUrlConnectionListenerImpl", "alvinluo readStreamData id: %s, cost: %d", nVar.f65842c, Long.valueOf(System.currentTimeMillis() - nVar.f65850k));
        }
        return bVar;
    }

    /* renamed from: d */
    public int mo36081d() {
        C22902m mVar = this.f65836b;
        if (mVar != null) {
            int i = this.f65839e;
            boolean z = this.f65838d;
            C22903n nVar = (C22903n) mVar;
            Log.m105925i("MicroMsg.BizImageHttpUrlConnectionListenerImpl", "alvinluo BizImage download onRequest id: %s, imageType: %d, forceNormal: %b, url: %s", nVar.f65842c, Integer.valueOf(i), Boolean.valueOf(z), nVar.f65840a);
            nVar.f65843d = i;
            nVar.f65844e = z;
            nVar.f65852m = System.currentTimeMillis();
            if (nVar.f65845f) {
                Log.m105926v("MicroMsg.BizImageDownloadReporter", "alvinluo reportRequestDownload");
                C115669n nVar2 = C115669n.INSTANCE;
                nVar2.mo175913w(1111, 0, 1);
                int i2 = nVar.f65843d;
                Log.m105927v("MicroMsg.BizImageDownloadReporter", "alvinluo reportRequestDownloadByImageType imageType: %d", Integer.valueOf(i2));
                if (i2 == 0) {
                    nVar2.mo175913w(1111, 1, 1);
                } else if (i2 == 1) {
                    nVar2.mo175913w(1111, 2, 1);
                } else if (i2 == 2) {
                    nVar2.mo175913w(1111, 31, 1);
                }
                if (nVar.f65844e) {
                    int i3 = nVar.f65843d;
                    Log.m105927v("MicroMsg.BizImageDownloadReporter", "alvinluo reportRequestNormalAfterGetWxPicFailed requestImageType: %d", Integer.valueOf(i3));
                    if (i3 == 0) {
                        nVar2.mo175913w(1111, 14, 1);
                    } else if (i3 == 2) {
                        nVar2.mo175913w(1111, 40, 1);
                    }
                }
            }
        }
        C22902m mVar2 = this.f65836b;
        if (mVar2 != null) {
            ((C22903n) mVar2).f65849j = System.currentTimeMillis();
        }
        HttpURLConnection httpURLConnection = this.f65835a;
        int responseCode = httpURLConnection != null ? httpURLConnection.getResponseCode() : -1;
        C22902m mVar3 = this.f65836b;
        if (mVar3 != null) {
            C22903n nVar3 = (C22903n) mVar3;
            Log.m105927v("MicroMsg.BizImageHttpUrlConnectionListenerImpl", "alvinluo getResponseCode id: %s, cost: %d", nVar3.f65842c, Long.valueOf(System.currentTimeMillis() - nVar3.f65849j));
        }
        return responseCode;
    }

    /* renamed from: e */
    public HttpURLConnection mo36082e() {
        C22902m mVar;
        String str = this.f65837c;
        String str2 = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        String str3 = this.f65837c;
        if (this.f65838d) {
            if (str3 != null) {
                C118762j jVar = C118762j.f355306a;
                Uri parse = Uri.parse(str3);
                C87412m.m108593f(parse, "parse(url)");
                String e = jVar.mo183492e(parse, "tp");
                Log.m105919d("MicroMsg.BizImageHttpUrlConnection", "alvinluo forceWebp url: %s, temp: %s", str3, e);
                str2 = C102027b.m134387b(e, false);
            }
            this.f65837c = str2;
        }
        C22902m mVar2 = this.f65836b;
        if (mVar2 != null) {
            String str4 = this.f65837c;
            C22903n nVar = (C22903n) mVar2;
            nVar.f65841b = str3;
            nVar.f65840a = str4;
            nVar.f65847h = System.currentTimeMillis();
            if (C118762j.f355306a.mo183489b(nVar.f65846g)) {
                C19449k.f54939a.mo25210c(3, nVar.f65841b, 0);
            }
            Log.m105925i("MicroMsg.BizImageHttpUrlConnectionListenerImpl", "alvinluo BizImage download onStart id: %s", nVar.f65842c);
        }
        if (this.f65838d && (mVar = this.f65836b) != null) {
            C22903n nVar2 = (C22903n) mVar;
            if (C118762j.f355306a.mo183489b(nVar2.f65846g)) {
                C19449k kVar = C19449k.f54939a;
                String str5 = nVar2.f65841b;
                if (!(str5 == null || str5.length() == 0)) {
                    Log.m105919d("MicroMsg.BizImageBlankReporter", "alvinluo retryDownload id: %s, url: %s", kVar.mo25209b(str5), str5);
                    MMHandlerThread.postToMainThread(new C19460q(str5, System.currentTimeMillis()));
                }
            }
        }
        C22902m mVar3 = this.f65836b;
        if (mVar3 != null) {
            ((C22903n) mVar3).f65848i = System.currentTimeMillis();
        }
        URLConnection openConnection = new URL(this.f65837c).openConnection();
        C87412m.m108592e(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        this.f65835a = httpURLConnection;
        httpURLConnection.setConnectTimeout(15000);
        HttpURLConnection httpURLConnection2 = this.f65835a;
        if (httpURLConnection2 != null) {
            httpURLConnection2.setReadTimeout(20000);
        }
        if (!this.f65838d && C102027b.m134391f(this.f65837c)) {
            Log.m105926v("MicroMsg.BizImageHttpUrlConnection", "alvinluo BizImage get WxPic");
            this.f65839e = 1;
            HttpURLConnection httpURLConnection3 = this.f65835a;
            if (httpURLConnection3 != null) {
                httpURLConnection3.addRequestProperty("Accept", "image/wxpic");
            }
        } else if (C102027b.m134392g(this.f65837c)) {
            Log.m105926v("MicroMsg.BizImageHttpUrlConnection", "alvinluo BizImage get Webp");
            this.f65839e = 2;
            HttpURLConnection httpURLConnection4 = this.f65835a;
            if (httpURLConnection4 != null) {
                httpURLConnection4.setRequestProperty("Referer", C92856r0.m117115a(C89625d.f257841g));
            }
        } else {
            Log.m105926v("MicroMsg.BizImageHttpUrlConnection", "alvinluo BizImage get jpeg");
            this.f65839e = 0;
        }
        C22902m mVar4 = this.f65836b;
        if (mVar4 != null) {
            C22903n nVar3 = (C22903n) mVar4;
            Log.m105927v("MicroMsg.BizImageHttpUrlConnectionListenerImpl", "alvinluo onAfterOpenConnection id: %s, cost: %d", nVar3.f65842c, Long.valueOf(System.currentTimeMillis() - nVar3.f65848i));
        }
        return this.f65835a;
    }

    /* renamed from: f */
    public void mo36083f(int i) {
        C22902m mVar = this.f65836b;
        if (mVar != null) {
            C22903n nVar = (C22903n) mVar;
            Log.m105921e("MicroMsg.BizImageHttpUrlConnectionListenerImpl", "alvinluo BizImage download onResultError id: %s, requestImageType: %d, responseCode: %d", nVar.f65842c, Integer.valueOf(nVar.f65843d), Integer.valueOf(i));
            nVar.f65853n = System.currentTimeMillis();
            if (nVar.f65845f) {
                C22899i iVar = C22899i.f65833a;
                iVar.mo36071a(nVar.f65843d, false);
                if (nVar.f65844e) {
                    iVar.mo36075e(nVar.f65843d, false);
                }
            }
            if (C118762j.f355306a.mo183489b(nVar.f65846g)) {
                C19449k.m20803a(C19449k.f54939a, 3, nVar.f65841b, 0, 4, (Object) null);
            }
        }
    }

    /* renamed from: g */
    public void mo36084g(C21210b bVar) {
        C21210b bVar2 = bVar;
        C87412m.m108594g(bVar2, "response");
        C22902m mVar = this.f65836b;
        if (mVar != null) {
            C22903n nVar = (C22903n) mVar;
            Log.m105925i("MicroMsg.BizImageHttpUrlConnectionListenerImpl", "alvinluo BizImage download onResultSuccess id: %s, contentType: %s, cost: %d", nVar.f65842c, bVar2.f59989e, Long.valueOf(System.currentTimeMillis() - nVar.f65847h));
            nVar.f65853n = System.currentTimeMillis();
            if (nVar.f65845f) {
                C22899i iVar = C22899i.f65833a;
                iVar.mo36071a(nVar.f65843d, true);
                int i = nVar.f65843d;
                String str = bVar2.f59989e;
                Log.m105927v("MicroMsg.BizImageDownloadReporter", "alvinluo reportDownloadImageType requestImageType: %d, responseContentType: %s", Integer.valueOf(i), str);
                if (i == 1) {
                    int c = C118762j.f355306a.mo183490c(str);
                    if (c == 0) {
                        C115669n.INSTANCE.mo175913w(1111, 7, 1);
                    } else if (c == 1) {
                        C115669n.INSTANCE.mo175913w(1111, 8, 1);
                    }
                }
                Log.m105927v("MicroMsg.BizImageDownloadReporter", "alvinluo reportDownloadImageType responseContentType: %s", str);
                C118762j jVar = C118762j.f355306a;
                int c2 = jVar.mo183490c(str);
                if (c2 == 0) {
                    C115669n.INSTANCE.mo175913w(1111, 17, 1);
                } else if (c2 == 1) {
                    C115669n.INSTANCE.mo175913w(1111, 19, 1);
                } else if (c2 == 2) {
                    C115669n.INSTANCE.mo175913w(1111, 36, 1);
                }
                String str2 = bVar2.f59989e;
                long j = nVar.f65853n - nVar.f65852m;
                Log.m105927v("MicroMsg.BizImageDownloadReporter", "alvinluo reportDownloadTime contentType: %s, downloadTime: %d", str2, Long.valueOf(j));
                if (j >= 0) {
                    int c3 = jVar.mo183490c(str2);
                    if (c3 == 0) {
                        C115669n.INSTANCE.mo175913w(1111, 18, j);
                    } else if (c3 == 1) {
                        C115669n.INSTANCE.mo175913w(1111, 20, j);
                    } else if (c3 == 2) {
                        C115669n.INSTANCE.mo175913w(1111, 37, j);
                    }
                }
                if (nVar.f65844e && bVar2.f59987c != null) {
                    iVar.mo36075e(nVar.f65843d, true);
                }
            }
            if (C118762j.f355306a.mo183489b(nVar.f65846g)) {
                C19449k.m20803a(C19449k.f54939a, 3, nVar.f65841b, 0, 4, (Object) null);
            }
        }
    }
}
