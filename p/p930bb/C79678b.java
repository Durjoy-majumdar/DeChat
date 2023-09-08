package p930bb;

import android.text.TextUtils;
import com.github.henryye.nativeiv.ImageDecodeConfig;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import java.io.BufferedInputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import km0.C88224a;
import km0.C88226c;
import p1030s6.C90132b;
import p224ra.C89909e;
import p927ab.C79480e;
import p930bb.C79680d;

/* renamed from: bb.b */
public class C79678b extends C79680d<C79680d.C79683c> {

    /* renamed from: a */
    public int f233589a = CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;

    /* renamed from: b */
    public int f233590b = CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;

    /* renamed from: c */
    public final String f233591c;

    /* renamed from: d */
    public C79680d.C79683c f233592d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        r1 = (sp0.C90272a) r1.mo113018M(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C79678b(p930bb.C79680d.C79683c r6) {
        /*
            r5 = this;
            java.lang.Class<sp0.a> r0 = sp0.C90272a.class
            r5.<init>(r6)
            r1 = 60000(0xea60, float:8.4078E-41)
            r5.f233589a = r1
            r5.f233590b = r1
            r5.f233592d = r6
            ab.e$b r6 = (p927ab.C79480e.C79482b) r6
            java.lang.ref.WeakReference<com.tencent.mm.plugin.appbrand.AppBrandRuntime> r1 = r6.f233042a
            java.lang.Object r1 = r1.get()
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r1 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntime) r1
            r2 = 0
            if (r1 != 0) goto L_0x001d
        L_0x001b:
            r1 = 0
            goto L_0x0028
        L_0x001d:
            com.tencent.mm.plugin.appbrand.jsapi.m r1 = r1.mo113018M(r0)
            sp0.a r1 = (sp0.C90272a) r1
            if (r1 != 0) goto L_0x0026
            goto L_0x001b
        L_0x0026:
            int r1 = r1.f259132i
        L_0x0028:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.appbrand.AppBrandRuntime> r3 = r6.f233042a
            java.lang.Object r3 = r3.get()
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r3 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntime) r3
            if (r3 != 0) goto L_0x0034
        L_0x0032:
            r3 = 0
            goto L_0x003f
        L_0x0034:
            com.tencent.mm.plugin.appbrand.jsapi.m r3 = r3.mo113018M(r0)
            sp0.a r3 = (sp0.C90272a) r3
            if (r3 != 0) goto L_0x003d
            goto L_0x0032
        L_0x003d:
            int r3 = r3.f259132i
        L_0x003f:
            if (r1 <= 0) goto L_0x005f
            if (r3 > 0) goto L_0x0044
            goto L_0x005f
        L_0x0044:
            r5.f233589a = r1
            r5.f233590b = r3
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r2] = r1
            r1 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r4[r1] = r2
            java.lang.String r1 = "AppBrandImageHttpFetcher"
            java.lang.String r2 = "Http Timeout Set: connection[%d] read[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r4)
        L_0x005f:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.appbrand.AppBrandRuntime> r6 = r6.f233042a
            java.lang.Object r6 = r6.get()
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r6 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntime) r6
            if (r6 != 0) goto L_0x006a
            goto L_0x0072
        L_0x006a:
            com.tencent.mm.plugin.appbrand.jsapi.m r6 = r6.mo113018M(r0)
            sp0.a r6 = (sp0.C90272a) r6
            if (r6 != 0) goto L_0x0075
        L_0x0072:
            java.lang.String r6 = ""
            goto L_0x0077
        L_0x0075:
            java.lang.String r6 = r6.f259120B
        L_0x0077:
            r5.f233591c = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p930bb.C79678b.<init>(bb.d$c):void");
    }

    /* renamed from: a */
    public String mo109801a() {
        return "http";
    }

    public boolean accept(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String str = (String) obj;
        return str.startsWith(HttpWrapperBase.PROTOCAL_HTTP) || str.startsWith(HttpWrapperBase.PROTOCAL_HTTPS);
    }

    /* renamed from: b */
    public C90132b.C90133a mo109803b(Object obj, ImageDecodeConfig imageDecodeConfig) {
        String str;
        HttpURLConnection c;
        C88226c cVar = C88226c.ORIGIN;
        C88226c cVar2 = C88226c.NO_REFERRER;
        C90132b.C90133a aVar = new C90132b.C90133a();
        C79680d.C79683c cVar3 = this.f233592d;
        ImageDecodeConfig.ReferrerPolicy referrerPolicy = imageDecodeConfig.mReferrerPolicy;
        AppBrandRuntime appBrandRuntime = ((C79480e.C79482b) cVar3).f233042a.get();
        BufferedInputStream bufferedInputStream = null;
        if (appBrandRuntime != null) {
            C88224a aVar2 = (C88224a) C89909e.m112436a(C88224a.class);
            if (aVar2 != null) {
                ImageDecodeConfig.ReferrerPolicy referrerPolicy2 = ImageDecodeConfig.ReferrerPolicy.NOT_SET;
                if (referrerPolicy == referrerPolicy2) {
                    C88226c eV = aVar2.mo117492eV(appBrandRuntime.mo113047b0());
                    if (eV != null) {
                        if (eV == cVar2) {
                            referrerPolicy = ImageDecodeConfig.ReferrerPolicy.NO_REFERRER;
                        } else if (eV == cVar) {
                            referrerPolicy = ImageDecodeConfig.ReferrerPolicy.ORIGIN;
                        }
                    }
                    referrerPolicy = referrerPolicy2;
                }
                if (referrerPolicy == referrerPolicy2) {
                    C88226c e4 = aVar2.mo117491e4();
                    if (e4 != null) {
                        if (e4 == cVar2) {
                            referrerPolicy2 = ImageDecodeConfig.ReferrerPolicy.NO_REFERRER;
                        } else if (e4 == cVar) {
                            referrerPolicy2 = ImageDecodeConfig.ReferrerPolicy.ORIGIN;
                        }
                    }
                    referrerPolicy = referrerPolicy2;
                }
                if (referrerPolicy == ImageDecodeConfig.ReferrerPolicy.ORIGIN) {
                    str = aVar2.mo117489A4(appBrandRuntime.mo113047b0());
                    c = mo109804c((String) obj, str, imageDecodeConfig, aVar);
                    if (c != null && TextUtils.isEmpty(aVar.f258829b)) {
                        bufferedInputStream = new BufferedInputStream(c.getInputStream());
                    }
                    aVar.f258828a = bufferedInputStream;
                    return aVar;
                }
            } else {
                Log.m105928w("MicroMsg.ImageFetcherConfigImp", "referrer helper is null");
            }
        }
        str = null;
        try {
            c = mo109804c((String) obj, str, imageDecodeConfig, aVar);
            bufferedInputStream = new BufferedInputStream(c.getInputStream());
        } catch (SocketTimeoutException e) {
            Log.m105921e("AppBrandImageHttpFetcher", "ImageFetch Timeout! path[%s] connectionTimeout[%d] readTimeout[%d] error[%s]", obj, Integer.valueOf(this.f233589a), Integer.valueOf(this.f233590b), e.toString());
            aVar.f258829b = MMApplicationContext.getContext().getString(C0966R.string.a5x);
        } catch (Exception e2) {
            Log.m105921e("AppBrandImageHttpFetcher", "fetch error. path = [%s], error = [%s]", obj, e2.toString());
            aVar.f258829b = String.format(MMApplicationContext.getContext().getString(C0966R.string.a5v), new Object[]{e2.toString()});
        }
        aVar.f258828a = bufferedInputStream;
        return aVar;
    }

    /* renamed from: c */
    public final HttpURLConnection mo109804c(String str, String str2, ImageDecodeConfig imageDecodeConfig, C90132b.C90133a aVar) {
        int i = 0;
        while (true) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            if (imageDecodeConfig != null && !TextUtils.isEmpty(str2)) {
                httpURLConnection.addRequestProperty("Referer", str2);
            }
            httpURLConnection.setRequestProperty("User-Agent", this.f233591c);
            httpURLConnection.setReadTimeout(this.f233590b);
            httpURLConnection.setConnectTimeout(this.f233589a);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 301 || responseCode == 302) {
                String headerField = httpURLConnection.getHeaderField(FirebaseAnalytics.C113379b.LOCATION);
                Log.m105925i("AppBrandImageHttpFetcher", "redirect from[%s] to[%s]", str, headerField);
                httpURLConnection.disconnect();
                if (headerField == null) {
                    return null;
                }
                int i2 = i + 1;
                if (i >= 3) {
                    Log.m105920e("AppBrandImageHttpFetcher", "too much redirection!");
                    aVar.f258829b = MMApplicationContext.getContext().getString(C0966R.string.a5w);
                    return null;
                }
                str = headerField;
                i = i2;
            } else {
                if (responseCode < 200 || responseCode >= 300) {
                    aVar.f258829b = String.format(MMApplicationContext.getContext().getString(C0966R.string.a5u), new Object[]{Integer.valueOf(responseCode)});
                }
                return httpURLConnection;
            }
        }
    }
}
