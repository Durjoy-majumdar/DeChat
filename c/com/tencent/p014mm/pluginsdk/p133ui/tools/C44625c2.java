package com.tencent.p014mm.pluginsdk.p133ui.tools;

import a70.C112760b;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Base64;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import bh3.C113177k;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C6686h2;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.p014mm.vfs.VFSStrategy$$b;
import com.tencent.xweb.WebView;
import di3.C86312j;
import ea3.C45588e;
import h81.C32735h;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;
import p140cw.C7138g;
import p159gw.C98250h;
import p910lj.C76701a;
import qo3.C89779i0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.c2 */
public class C44625c2 extends C6686h2 {

    /* renamed from: a */
    public static QueueWorkerThread f121005a;

    /* renamed from: b */
    public static final Pattern f121006b = Pattern.compile("data:(image|img)/\\S+;base64,\\S+");

    /* renamed from: c */
    public static int f121007c = -1;

    /* renamed from: d */
    public static int f121008d = -1;

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.c2$b */
    public class C30705b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f82613d;

        public C30705b(Context context) {
            this.f82613d = context;
        }

        public void run() {
            Context context = this.f82613d;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.lmf), 1).show();
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.c2$a */
    public class C44626a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f121009d;

        /* renamed from: e */
        public final /* synthetic */ String f121010e;

        /* renamed from: f */
        public final /* synthetic */ String f121011f;

        /* renamed from: g */
        public final /* synthetic */ String f121012g;

        /* renamed from: h */
        public final /* synthetic */ boolean f121013h;

        /* renamed from: com.tencent.mm.pluginsdk.ui.tools.c2$a$a */
        public class C44627a implements C113177k.C113181e {
            public C44627a() {
            }

            public void onOp(Boolean bool) {
                if (bool.booleanValue()) {
                    C44626a aVar = C44626a.this;
                    C44625c2.m49077j(aVar.f121009d, aVar.f121010e, aVar.f121011f, aVar.f121012g, aVar.f121013h);
                }
            }
        }

        public C44626a(Context context, String str, String str2, String str3, boolean z) {
            this.f121009d = context;
            this.f121010e = str;
            this.f121011f = str2;
            this.f121012g = str3;
            this.f121013h = z;
        }

        public void run() {
            if (((C113177k) C86312j.m106911c(C113177k.class)).mo165712hg(C113177k.C113179b.STORAGE, C113177k.C113178a.SAVE_FILE, new C44627a())) {
                Log.m105924i("MicroMsg.WebViewUtil", "business switch close ,return");
                return;
            }
            if (C44625c2.f121005a == null) {
                C44625c2.f121005a = new QueueWorkerThread(1, "webview-save-image", 1);
            }
            C44625c2.f121005a.add(new C44630e(this.f121009d, this.f121010e, this.f121011f, this.f121012g, this.f121013h, 0, (C6686h2.C6687a) null));
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.c2$c */
    public class C44628c implements C44629d {

        /* renamed from: a */
        public final /* synthetic */ WebView f121015a;

        public C44628c(WebView webView) {
            this.f121015a = webView;
        }

        public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
            this.f121015a.evaluateJavascript(str, valueCallback);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.c2$d */
    public interface C44629d {
        void evaluateJavascript(String str, ValueCallback<String> valueCallback);
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.c2$e */
    public static class C44630e implements QueueWorkerThread.ThreadObject {

        /* renamed from: r */
        public static Pattern f121016r = Pattern.compile("image/[A-Za-z0-9]+");

        /* renamed from: s */
        public static Pattern f121017s = Pattern.compile("filename=[A-Za-z0-9@.]+.[A-Za-z0-9]+");

        /* renamed from: d */
        public Context f121018d;

        /* renamed from: e */
        public String f121019e;

        /* renamed from: f */
        public String f121020f;

        /* renamed from: g */
        public String f121021g;

        /* renamed from: h */
        public String f121022h;

        /* renamed from: i */
        public String f121023i;

        /* renamed from: j */
        public boolean f121024j;

        /* renamed from: n */
        public int f121025n;

        /* renamed from: o */
        public C6686h2.C6687a f121026o;

        /* renamed from: p */
        public C89779i0 f121027p;

        /* renamed from: q */
        public boolean f121028q = false;

        /* renamed from: com.tencent.mm.pluginsdk.ui.tools.c2$e$a */
        public class C44631a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Context f121029d;

            public C44631a(Context context) {
                this.f121029d = context;
            }

            public void run() {
                Log.m105918d("MicroMsg.WebViewUtil", "LoadImageThreadObject check show loading");
                C44630e eVar = C44630e.this;
                if (!eVar.f121028q) {
                    eVar.f121027p = C45588e.f123306a.mo71111a(this.f121029d.getString(C0966R.string.a4d), this.f121029d, C44630e.this.f121027p);
                }
            }
        }

        /* renamed from: com.tencent.mm.pluginsdk.ui.tools.c2$e$b */
        public class C44632b implements BitmapUtil.ImageWriteOSCallback {

            /* renamed from: a */
            public final /* synthetic */ InputStream f121031a;

            public C44632b(C44630e eVar, InputStream inputStream) {
                this.f121031a = inputStream;
            }

            public void callback(OutputStream outputStream) {
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = this.f121031a.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        outputStream.write(bArr, 0, read);
                    }
                    outputStream.flush();
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.WebViewUtil", "close os failed : %s", e.getMessage());
                } catch (Throwable th) {
                    try {
                        outputStream.close();
                    } catch (Exception unused) {
                    }
                    throw th;
                }
                try {
                    outputStream.close();
                } catch (Exception unused2) {
                }
            }
        }

        public C44630e(Context context, String str, String str2, String str3, boolean z, int i, C6686h2.C6687a aVar) {
            this.f121018d = context;
            this.f121019e = str;
            this.f121020f = str2;
            this.f121023i = str3;
            this.f121024j = z;
            this.f121025n = i;
            this.f121026o = aVar;
            Log.m105918d("MicroMsg.WebViewUtil", "LoadImageThreadObject startLoad");
            C119179t tVar = C119157j.f356862d;
            C44631a aVar2 = new C44631a(context);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(aVar2, 1000, false);
        }

        /* renamed from: a */
        public final void mo69418a() {
            InputStream inputStream;
            HttpURLConnection httpURLConnection;
            try {
                httpURLConnection = (HttpURLConnection) new URL(this.f121019e).openConnection();
                try {
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setRequestProperty("Cookie", this.f121023i);
                    httpURLConnection.setRequestProperty("referer", this.f121020f);
                    httpURLConnection.setAllowUserInteraction(true);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        if (responseCode == 301 || responseCode == 302) {
                            String headerField = httpURLConnection.getHeaderField("Location");
                            if (headerField == null) {
                                headerField = httpURLConnection.getHeaderField(FirebaseAnalytics.C113379b.LOCATION);
                            }
                            Log.m105925i("MicroMsg.WebViewUtil", "redirect url = %s", headerField);
                            if (!Util.isNullOrNil(headerField)) {
                                this.f121019e = headerField;
                                mo69418a();
                                mo69420c(httpURLConnection, (InputStream) null, (OutputStream) null);
                                return;
                            }
                        }
                        this.f121022h = this.f121018d.getString(C0966R.string.lmf);
                        mo69420c(httpURLConnection, (InputStream) null, (OutputStream) null);
                        return;
                    }
                    String contentType = httpURLConnection.getContentType();
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        mo69421d(contentType, httpURLConnection.getHeaderField("Content-Disposition"), inputStream, (OutputStream) null);
                    } catch (Exception e) {
                        e = e;
                    }
                    mo69420c(httpURLConnection, inputStream, (OutputStream) null);
                } catch (Exception e2) {
                    e = e2;
                    inputStream = null;
                    try {
                        Log.m105921e("MicroMsg.WebViewUtil", "init http url connection failed : %s", e.getMessage());
                        mo69420c(httpURLConnection, inputStream, (OutputStream) null);
                    } catch (Throwable th) {
                        th = th;
                        mo69420c(httpURLConnection, inputStream, (OutputStream) null);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    inputStream = null;
                    mo69420c(httpURLConnection, inputStream, (OutputStream) null);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                httpURLConnection = null;
                inputStream = null;
                Log.m105921e("MicroMsg.WebViewUtil", "init http url connection failed : %s", e.getMessage());
                mo69420c(httpURLConnection, inputStream, (OutputStream) null);
            } catch (Throwable th5) {
                th = th5;
                httpURLConnection = null;
                inputStream = null;
                mo69420c(httpURLConnection, inputStream, (OutputStream) null);
                throw th;
            }
        }

        /* renamed from: b */
        public final String mo69419b(String str) {
            String str2;
            if (this.f121025n == 1) {
                VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
                C86009m1 i0 = C112760b.m154236i0("WebImageCache");
                str2 = i0.mo119971i() + "/";
            } else {
                str2 = ((C7138g) C86312j.m106911c(C7138g.class)).mo8323lm();
            }
            String str3 = str2 + String.format(Locale.US, "mmexport%s_%d.%s", new Object[]{MD5Util.getMD5String(this.f121019e), Long.valueOf(System.currentTimeMillis()), str});
            this.f121021g = str3;
            return str3;
        }

        /* renamed from: c */
        public final void mo69420c(HttpURLConnection httpURLConnection, InputStream inputStream, OutputStream outputStream) {
            if (httpURLConnection != null) {
                try {
                    httpURLConnection.getInputStream().close();
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.WebViewUtil", e.getMessage());
                }
                httpURLConnection.disconnect();
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.WebViewUtil", e2, "", new Object[0]);
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception e3) {
                    Log.printErrStackTrace("MicroMsg.WebViewUtil", e3, "", new Object[0]);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x006a  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0096  */
        /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo69421d(java.lang.String r6, java.lang.String r7, java.io.InputStream r8, java.io.OutputStream r9) {
            /*
                r5 = this;
                java.lang.Class<cw.g> r9 = p140cw.C7138g.class
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                r0[r1] = r6
                r2 = 1
                r0[r2] = r7
                java.lang.String r3 = "MicroMsg.WebViewUtil"
                java.lang.String r4 = "contentType = %s, dispositionType = %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r0)
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                if (r0 != 0) goto L_0x0038
                java.util.regex.Pattern r0 = f121016r
                java.util.regex.Matcher r6 = r0.matcher(r6)
                boolean r0 = r6.find()
                if (r0 == 0) goto L_0x0038
                java.lang.String r0 = r6.group()
                java.lang.String r6 = r6.group()
                r3 = 47
                int r6 = r6.lastIndexOf(r3)
                int r6 = r6 + r2
                java.lang.String r6 = r0.substring(r6)
                goto L_0x0039
            L_0x0038:
                r6 = 0
            L_0x0039:
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                r3 = 46
                if (r0 == 0) goto L_0x0064
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                if (r0 != 0) goto L_0x0064
                java.util.regex.Pattern r0 = f121017s
                java.util.regex.Matcher r7 = r0.matcher(r7)
                boolean r0 = r7.find()
                if (r0 == 0) goto L_0x0064
                java.lang.String r6 = r7.group()
                java.lang.String r7 = r7.group()
                int r7 = r7.lastIndexOf(r3)
                int r7 = r7 + r2
                java.lang.String r6 = r6.substring(r7)
            L_0x0064:
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                if (r7 == 0) goto L_0x0084
                com.tencent.mm.pluginsdk.ui.tools.a2 r6 = new com.tencent.mm.pluginsdk.ui.tools.a2
                java.lang.String r7 = r5.f121019e
                r6.<init>(r7)
                java.lang.String r7 = r6.f121001d
                int r7 = r7.lastIndexOf(r3)
                r0 = -1
                if (r7 != r0) goto L_0x007d
                java.lang.String r6 = "jpg"
                goto L_0x0084
            L_0x007d:
                java.lang.String r6 = r6.f121001d
                int r7 = r7 + r2
                java.lang.String r6 = r6.substring(r7)
            L_0x0084:
                java.lang.String r6 = r5.mo69419b(r6)
                r5.f121021g = r6
                com.tencent.mm.pluginsdk.ui.tools.c2$e$b r7 = new com.tencent.mm.pluginsdk.ui.tools.c2$e$b
                r7.<init>(r5, r8)
                com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageWriteOutputStream((java.lang.String) r6, (com.tencent.p014mm.sdk.platformtools.BitmapUtil.ImageWriteOSCallback) r7)
                int r6 = r5.f121025n
                if (r6 != 0) goto L_0x00bc
                android.content.Context r6 = r5.f121018d
                r7 = 2131824506(0x7f110f7a, float:1.9281842E38)
                java.lang.Object[] r8 = new java.lang.Object[r2]
                di3.d r0 = di3.C86312j.m106911c(r9)
                cw.g r0 = (p140cw.C7138g) r0
                java.lang.String r0 = r0.mo8327wx()
                r8[r1] = r0
                java.lang.String r6 = r6.getString(r7, r8)
                r5.f121022h = r6
                di3.d r6 = di3.C86312j.m106911c(r9)
                cw.g r6 = (p140cw.C7138g) r6
                java.lang.String r7 = r5.f121021g
                android.content.Context r8 = r5.f121018d
                r6.mo8315Wr(r7, r8)
            L_0x00bc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2.C44630e.mo69421d(java.lang.String, java.lang.String, java.io.InputStream, java.io.OutputStream):void");
        }

        public boolean doInBackground() {
            InputStream inputStream;
            HttpsURLConnection httpsURLConnection;
            Exception e;
            if (!this.f121024j) {
                this.f121022h = this.f121018d.getString(C0966R.string.lmg);
                return true;
            } else if (Util.isNullOrNil(this.f121019e)) {
                return false;
            } else {
                if (URLUtil.isDataUrl(this.f121019e)) {
                    Class cls = C7138g.class;
                    this.f121021g = mo69419b(((Util.isNullOrNil(this.f121019e) || !this.f121019e.startsWith("data:image/png")) && !this.f121019e.startsWith("data:image/png".toUpperCase())) ? "jpg" : "png");
                    try {
                        int indexOf = this.f121019e.indexOf("base64");
                        if (indexOf > 0) {
                            this.f121019e = this.f121019e.substring(indexOf + 7);
                        }
                        BitmapUtil.getImageWriteOutputStream(this.f121021g, (BitmapUtil.ImageWriteOSCallback) new C44638g2(this));
                        this.f121022h = this.f121018d.getString(C0966R.string.bwc, new Object[]{((C7138g) C86312j.m106911c(cls)).mo8327wx()});
                        ((C7138g) C86312j.m106911c(cls)).mo8315Wr(this.f121021g, this.f121018d);
                    } catch (Exception e2) {
                        Log.m105921e("MicroMsg.WebViewUtil", "decode base64 pic failed : %s", e2.getMessage());
                    }
                } else if (URLUtil.isHttpsUrl(this.f121019e)) {
                    try {
                        httpsURLConnection = (HttpsURLConnection) new URL(this.f121019e).openConnection();
                        try {
                            httpsURLConnection.setRequestMethod("GET");
                            httpsURLConnection.setRequestProperty("Cookie", this.f121023i);
                            httpsURLConnection.setRequestProperty("referer", this.f121020f);
                            httpsURLConnection.setAllowUserInteraction(true);
                            int responseCode = httpsURLConnection.getResponseCode();
                            if (responseCode != 200) {
                                if (responseCode == 301 || responseCode == 302) {
                                    String headerField = httpsURLConnection.getHeaderField("Location");
                                    if (headerField == null) {
                                        headerField = httpsURLConnection.getHeaderField(FirebaseAnalytics.C113379b.LOCATION);
                                    }
                                    Log.m105925i("MicroMsg.WebViewUtil", "redirect url = %s", headerField);
                                    if (!Util.isNullOrNil(headerField)) {
                                        this.f121019e = headerField;
                                        mo69418a();
                                        mo69420c(httpsURLConnection, (InputStream) null, (OutputStream) null);
                                    }
                                }
                                this.f121022h = this.f121018d.getString(C0966R.string.lmf);
                                mo69420c(httpsURLConnection, (InputStream) null, (OutputStream) null);
                            } else {
                                String contentType = httpsURLConnection.getContentType();
                                inputStream = httpsURLConnection.getInputStream();
                                try {
                                    mo69421d(contentType, httpsURLConnection.getHeaderField("Content-Disposition"), inputStream, (OutputStream) null);
                                } catch (Exception e3) {
                                    e = e3;
                                }
                                mo69420c(httpsURLConnection, inputStream, (OutputStream) null);
                            }
                        } catch (Exception e4) {
                            e = e4;
                            inputStream = null;
                            try {
                                Log.m105921e("MicroMsg.WebViewUtil", "download https resource failed : %s", e.getMessage());
                                mo69420c(httpsURLConnection, inputStream, (OutputStream) null);
                                return true;
                            } catch (Throwable th) {
                                th = th;
                                mo69420c(httpsURLConnection, inputStream, (OutputStream) null);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            inputStream = null;
                            mo69420c(httpsURLConnection, inputStream, (OutputStream) null);
                            throw th;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        httpsURLConnection = null;
                        inputStream = null;
                        Log.m105921e("MicroMsg.WebViewUtil", "download https resource failed : %s", e.getMessage());
                        mo69420c(httpsURLConnection, inputStream, (OutputStream) null);
                        return true;
                    } catch (Throwable th5) {
                        th = th5;
                        httpsURLConnection = null;
                        inputStream = null;
                        mo69420c(httpsURLConnection, inputStream, (OutputStream) null);
                        throw th;
                    }
                } else {
                    mo69418a();
                }
                return true;
            }
        }

        public boolean onPostExecute() {
            this.f121028q = true;
            C89779i0 i0Var = this.f121027p;
            if (i0Var != null && i0Var.isShowing()) {
                i0Var.dismiss();
            }
            if (1 == this.f121025n) {
                this.f121026o.mo7610a(this.f121021g);
            } else if (!Util.isNullOrNil(this.f121022h)) {
                C76701a.makeText(this.f121018d, (CharSequence) this.f121022h, 1).show();
            } else {
                Context context = this.f121018d;
                C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.lmf), 1).show();
            }
            return true;
        }
    }

    /* renamed from: b */
    public static final String m49069b(Map<String, Object> map) {
        StringBuilder sb = new StringBuilder();
        if (map != null) {
            for (String next : map.keySet()) {
                Object obj = map.get(next);
                if (!Util.isNullOrNil(next) && obj != null) {
                    if (!(obj instanceof String) || !Util.isNullOrNil((String) obj)) {
                        if (sb.length() > 0) {
                            sb.append("&");
                        }
                        sb.append(next);
                        sb.append("=");
                        sb.append(obj);
                    }
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static final String m49070c(String str, int i) {
        byte[] bArr;
        if (Util.isNullOrNil(str)) {
            return str;
        }
        try {
            bArr = str.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            bArr = str.getBytes();
            Log.m105921e("MicroMsg.WebViewUtil", "getBytes fail, throw : %s", e.getMessage());
        }
        return Base64.encodeToString(bArr, i);
    }

    /* renamed from: d */
    public static String m49071d(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return C85875k4.m106211z() ? jSONObject.optString("dark") : jSONObject.optString("light");
        } catch (Exception e) {
            Log.m105920e("MicroMsg.WebViewUtil", e.getMessage());
            return null;
        }
    }

    /* renamed from: e */
    public static void m49072e(Context context, String str, String str2, String str3, boolean z, C6686h2.C6687a aVar) {
        if (f121005a == null) {
            f121005a = new QueueWorkerThread(1, "webview-save-image", 1);
        }
        f121005a.add(new C44630e(context, str, str2, str3, z, 1, aVar));
    }

    /* renamed from: f */
    public static void m49073f(WebView webView, String str, String str2, boolean z) {
        if (webView != null) {
            C44628c cVar = new C44628c(webView);
            if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
                Log.m105921e("MicroMsg.WebViewUtil", "getJsResult fail, invalid argument, scheme = %s, jsCode = %s", str, str2);
                return;
            }
            Log.m105919d("MicroMsg.WebViewUtil", "getJsResult, scheme = %s, jsCode = %s", str, str2);
            Log.m105918d("MicroMsg.WebViewUtil", "initIFrame");
            MMHandlerThread.postToMainThread(new C44635e2(cVar));
            MMHandlerThread.postToMainThread(new C44637f2(z, cVar, str, str2));
        }
    }

    /* renamed from: g */
    public static String m49074g() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return "no";
        }
        if (activeNetworkInfo.getType() == 1) {
            return "WIFI";
        }
        Log.m105919d("MicroMsg.WebViewUtil", "activeNetInfo extra=%s, type=%d, %s", activeNetworkInfo.getExtraInfo(), Integer.valueOf(activeNetworkInfo.getType()), activeNetworkInfo.getExtraInfo());
        return activeNetworkInfo.getExtraInfo() != null ? activeNetworkInfo.getExtraInfo().toLowerCase() : "no";
    }

    /* renamed from: h */
    public static String m49075h(String str) {
        if (!Util.isNullOrNil(str) && f121006b.matcher(str).matches()) {
            return str.substring(str.indexOf("base64,") + 7).trim();
        }
        return null;
    }

    /* renamed from: i */
    public static boolean m49076i() {
        int i = f121008d;
        if (i != -1) {
            return i == 1;
        }
        if (BuildInfo.IS_FLAVOR_RED || (WeChatEnvironment.hasDebugger() && 1 > Log.getLogLevel())) {
            return true;
        }
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_webview_mp_video_share_to_sns, 0);
        f121008d = Qe;
        Log.m105925i("MicroMsg.WebViewUtil", "mpVideoShareToSns open=%d", Integer.valueOf(Qe));
        return f121008d == 1;
    }

    /* renamed from: j */
    public static void m49077j(Context context, String str, String str2, String str3, boolean z) {
        ((C98250h) C86312j.m106911c(C98250h.class)).mo137341Iy(context, new C44626a(context, str, str2, str3, z), new C30705b(context));
    }

    /* renamed from: k */
    public static boolean m49078k() {
        int i = f121007c;
        if (i != -1) {
            return i == 1;
        }
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_webview_pagecommit_update_random_str_v2, 1);
        f121007c = Qe;
        Log.m105925i("MicroMsg.WebViewUtil", "updateRandomStr updateRandomStr=%d", Integer.valueOf(Qe));
        return f121007c == 1;
    }
}
