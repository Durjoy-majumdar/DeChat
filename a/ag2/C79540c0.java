package ag2;

import a70.C112760b;
import android.os.AsyncTask;
import android.util.SparseArray;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.appstorage.ZipJNI;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kg3.C76577a;
import p823sg.C90193h;
import xf2.C91196d;
import zf2.C16157c;

/* renamed from: ag2.c0 */
public class C79540c0 {

    /* renamed from: g */
    public static final String f233199g = WeChatHosts.domainString(C0966R.string.fmv);

    /* renamed from: h */
    public static SparseArray<String> f233200h = null;

    /* renamed from: a */
    public Map<String, String> f233201a = new HashMap();

    /* renamed from: b */
    public C67042s f233202b;

    /* renamed from: c */
    public C27896j f233203c;

    /* renamed from: d */
    public C27899n f233204d;

    /* renamed from: e */
    public Map<Long, C91196d.C91199c> f233205e = new HashMap();

    /* renamed from: f */
    public Map<Long, C79542b> f233206f = new HashMap();

    /* renamed from: ag2.c0$a */
    public class C79541a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C91196d.C91199c f233207d;

        public C79541a(C91196d.C91199c cVar) {
            this.f233207d = cVar;
        }

        public void run() {
            C79542b bVar = new C79542b((C79541a) null);
            ((HashMap) C79540c0.this.f233205e).put(Long.valueOf(this.f233207d.f261468a), this.f233207d);
            ((HashMap) C79540c0.this.f233206f).put(Long.valueOf(this.f233207d.f261468a), bVar);
            C91196d.C91199c cVar = this.f233207d;
            if (cVar.f261474g.mo66937c()) {
                bVar.f233210e = cVar;
                bVar.execute(new C91196d.C91199c[]{cVar});
            }
        }
    }

    /* renamed from: ag2.c0$b */
    public class C79542b extends AsyncTask<C91196d.C91199c, Integer, C91196d.C91199c> implements C91196d.C91200d {

        /* renamed from: d */
        public C91196d f233209d;

        /* renamed from: e */
        public C91196d.C91199c f233210e;

        /* renamed from: ag2.c0$b$a */
        public class C79543a implements Runnable {
            public C79543a() {
            }

            public void run() {
                C91196d dVar = C79542b.this.f233209d;
                if (dVar != null) {
                    dVar.mo125254a();
                }
            }

            public String toString() {
                return super.toString() + "|onCancelled";
            }
        }

        public C79542b(C79541a aVar) {
        }

        /* renamed from: a */
        public void mo109600a() {
            publishProgress(new Integer[]{0});
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x00bd  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00bf  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00c6  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00fc  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x010e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object doInBackground(java.lang.Object[] r10) {
            /*
                r9 = this;
                xf2.d$c[] r10 = (xf2.C91196d.C91199c[]) r10
                r0 = 0
                r10 = r10[r0]
                xf2.d$e r1 = r10.f261471d
                java.util.Map<java.lang.String, java.lang.String> r1 = r1.f261477c
                java.lang.String r2 = "xm_skey"
                java.lang.Object r1 = r1.get(r2)
                java.lang.String r1 = (java.lang.String) r1
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 == 0) goto L_0x001a
                goto L_0x0120
            L_0x001a:
                xf2.d$b r1 = r10.f261470c
                boolean r2 = r1.f261465a
                r3 = 304(0x130, float:4.26E-43)
                r4 = 0
                if (r2 != 0) goto L_0x00ce
                boolean r1 = r1.f261466b
                if (r1 == 0) goto L_0x00ce
                ag2.c0 r1 = ag2.C79540c0.this
                ag2.n r1 = r1.f233204d
                java.lang.String r2 = r10.f261469b
                xf2.d$e r5 = r10.f261471d
                java.util.Map<java.lang.String, java.lang.String> r5 = r5.f261476b
                r1.getClass()
                java.lang.String r6 = "Msg.Plugin.HttpRequestCache"
                if (r2 == 0) goto L_0x00b5
                int r7 = r2.length()
                if (r7 != 0) goto L_0x0040
                goto L_0x00b5
            L_0x0040:
                java.lang.String r2 = r1.mo55676b(r2, r5)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r1 = r1.f77070a
                r5.append(r1)
                r5.append(r2)
                java.lang.String r1 = r5.toString()
                r5 = -1
                byte[] r1 = com.tencent.p014mm.vfs.C86013q1.m106433O(r1, r0, r5)
                if (r1 != 0) goto L_0x0063
                java.lang.String r1 = "readFromFile fail, cipherText is null, read error or cache not exist"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
                goto L_0x00ba
            L_0x0063:
                java.lang.String r2 = r2.toString()
                byte[] r2 = r2.getBytes()
                java.lang.String r2 = p823sg.C90193h.m112878f(r2)
                r5 = 8
                r7 = 16
                java.lang.String r2 = r2.substring(r5, r7)
                byte[] r2 = r2.getBytes()
                javax.crypto.spec.DESKeySpec r5 = new javax.crypto.spec.DESKeySpec     // Catch:{ Exception -> 0x00a4 }
                r5.<init>(r2)     // Catch:{ Exception -> 0x00a4 }
                java.lang.String r2 = "DES"
                javax.crypto.SecretKeyFactory r2 = javax.crypto.SecretKeyFactory.getInstance(r2)     // Catch:{ Exception -> 0x00a4 }
                javax.crypto.SecretKey r2 = r2.generateSecret(r5)     // Catch:{ Exception -> 0x00a4 }
                java.lang.String r5 = "DES/CBC/PKCS5Padding"
                javax.crypto.Cipher r5 = javax.crypto.Cipher.getInstance(r5)     // Catch:{ Exception -> 0x00a4 }
                javax.crypto.spec.IvParameterSpec r7 = new javax.crypto.spec.IvParameterSpec     // Catch:{ Exception -> 0x00a4 }
                java.lang.String r8 = "12345678"
                byte[] r8 = r8.getBytes()     // Catch:{ Exception -> 0x00a4 }
                r7.<init>(r8)     // Catch:{ Exception -> 0x00a4 }
                r8 = 2
                r5.init(r8, r2, r7)     // Catch:{ Exception -> 0x00a4 }
                byte[] r1 = r5.doFinal(r1)     // Catch:{ Exception -> 0x00a4 }
                goto L_0x00ad
            L_0x00a4:
                r1 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r0]
                java.lang.String r5 = ""
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r1, r5, r2)
                r1 = r4
            L_0x00ad:
                if (r1 != 0) goto L_0x00bb
                java.lang.String r1 = "decrypt fail, plaintText is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r1)
                goto L_0x00ba
            L_0x00b5:
                java.lang.String r1 = "getCache, invalid argument"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r1)
            L_0x00ba:
                r1 = r4
            L_0x00bb:
                if (r1 != 0) goto L_0x00bf
                r2 = r4
                goto L_0x00c4
            L_0x00bf:
                java.lang.String r2 = new java.lang.String
                r2.<init>(r1)
            L_0x00c4:
                if (r2 == 0) goto L_0x00ce
                xf2.d$f r1 = new xf2.d$f
                r1.<init>(r3, r4, r2)
                r10.f261472e = r1
                goto L_0x00ea
            L_0x00ce:
                xf2.d$e r1 = r10.f261471d
                r1.getClass()
                xf2.c r1 = new xf2.c
                r1.<init>()
                r9.f233209d = r1
                java.lang.String r2 = r10.f261469b
                xf2.d$e r5 = r10.f261471d
                java.lang.String r6 = "https://"
                xf2.d$f r1 = r1.mo125255e(r6, r2, r5, r9)
                r10.f261472e = r1
                if (r1 != 0) goto L_0x00ea
                r10 = r4
                goto L_0x0120
            L_0x00ea:
                xf2.d$b r1 = r10.f261470c
                boolean r1 = r1.f261467c
                java.lang.String r2 = "MicroMsg.Mail.NormalMailAppService"
                if (r1 == 0) goto L_0x010e
                xf2.d$f r1 = r10.f261472e
                int r5 = r1.f261478a
                if (r5 == r3) goto L_0x00fc
                r3 = 200(0xc8, float:2.8E-43)
                if (r5 != r3) goto L_0x010e
            L_0x00fc:
                java.lang.String r0 = r1.f261480c
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
                xf2.d$f r0 = r10.f261472e
                java.lang.String r0 = r0.f261480c
                java.lang.String r1 = "Response"
                java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r1, r4)
                r10.f261473f = r0
                goto L_0x0120
            L_0x010e:
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                xf2.d$f r3 = r10.f261472e
                int r3 = r3.f261478a
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1[r0] = r3
                java.lang.String r0 = "http error, %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r1)
            L_0x0120:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: ag2.C79540c0.C79542b.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        public void onCancelled() {
            C86709a0.m107528h();
            C86709a0.m107525e().postToWorker(new C79543a());
            super.onCancelled();
        }

        public void onPostExecute(Object obj) {
            byte[] bArr;
            C91196d.C91199c cVar = (C91196d.C91199c) obj;
            if (cVar != null) {
                if (Util.isNullOrNil(cVar.f261471d.f261477c.get("xm_skey"))) {
                    cVar.f261474g.mo66936b(-5, "");
                } else {
                    C91196d.C91202f fVar = cVar.f261472e;
                    int i = fVar.f261478a;
                    if (i == 304) {
                        C79540c0.m96569a(C79540c0.this, cVar);
                    } else if (i == 200) {
                        C79540c0 c0Var = C79540c0.this;
                        Map<String, String> map = fVar.f261479b;
                        if (!(c0Var.f233201a == null || map == null)) {
                            for (String next : map.keySet()) {
                                ((HashMap) c0Var.f233201a).put(next, map.get(next));
                            }
                        }
                        if (C79540c0.m96569a(C79540c0.this, cVar) == 0 && cVar.f261470c.f261466b) {
                            C27899n nVar = C79540c0.this.f233204d;
                            String str = cVar.f261469b;
                            Map<String, String> map2 = cVar.f261471d.f261476b;
                            byte[] bytes = cVar.f261472e.f261480c.getBytes();
                            nVar.getClass();
                            if (str == null || str.length() == 0 || bytes == null || bytes.length == 0) {
                                Log.m105920e("Msg.Plugin.HttpRequestCache", "setCache, invalid argument");
                            } else {
                                nVar.mo55675a();
                                String b = nVar.mo55676b(str, map2);
                                try {
                                    SecretKey generateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(C90193h.m112878f(b.toString().getBytes()).substring(8, 16).getBytes()));
                                    Cipher instance = Cipher.getInstance("DES/CBC/PKCS5Padding");
                                    instance.init(1, generateSecret, new IvParameterSpec("12345678".getBytes()));
                                    bArr = instance.doFinal(bytes);
                                } catch (Exception e) {
                                    Log.printErrStackTrace("Msg.Plugin.HttpRequestCache", e, "", new Object[0]);
                                    bArr = null;
                                }
                                if (bArr == null) {
                                    Log.m105920e("Msg.Plugin.HttpRequestCache", "encrypt fail, cipherText is null");
                                } else {
                                    Util.isEqual(C86013q1.m106438T(nVar.f77070a + b, bArr, 0, bArr.length), 0);
                                }
                            }
                        }
                    } else {
                        C91196d.C91197a aVar = cVar.f261474g;
                        C79540c0 c0Var2 = C79540c0.this;
                        String str2 = C79540c0.f233199g;
                        c0Var2.getClass();
                        if (C79540c0.f233200h == null) {
                            C79540c0.f233200h = new SparseArray<>();
                            for (Field field : HttpURLConnection.class.getDeclaredFields()) {
                                int modifiers = field.getModifiers();
                                String name = field.getName();
                                if (name != null && name.startsWith("HTTP_") && Modifier.isPublic(modifiers) && Modifier.isFinal(modifiers) && Modifier.isStatic(modifiers)) {
                                    try {
                                        int i2 = field.getInt(0);
                                        StringBuilder sb = new StringBuilder();
                                        String[] split = name.split("_");
                                        if (split != null) {
                                            for (int i3 = 1; i3 < split.length; i3++) {
                                                sb.append(split[i3]);
                                                sb.append(' ');
                                            }
                                            sb.append("error");
                                        }
                                        C79540c0.f233200h.put(i2, sb.toString().toLowerCase());
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        }
                        String str3 = C79540c0.f233200h.get(i);
                        if (str3 == null) {
                            str3 = c0Var2.mo109596e(i, "request error");
                        }
                        aVar.mo66936b(i, str3);
                    }
                }
                cVar.f261474g.mo66935a();
                ((HashMap) C79540c0.this.f233205e).remove(Long.valueOf(cVar.f261468a));
                ((HashMap) C79540c0.this.f233206f).remove(Long.valueOf(cVar.f261468a));
            }
        }

        public void onProgressUpdate(Object[] objArr) {
            C91196d.C91197a aVar = this.f233210e.f261474g;
            ((Integer[]) objArr)[0].intValue();
            aVar.getClass();
        }
    }

    static {
        WeChatHosts.domainString(C0966R.string.fmv);
    }

    public C79540c0() {
        mo109597f();
    }

    /* renamed from: a */
    public static int m96569a(C79540c0 c0Var, C91196d.C91199c cVar) {
        c0Var.getClass();
        if (!cVar.f261470c.f261467c) {
            cVar.f261474g.mo66938d(cVar.f261472e.f261480c, (Map<String, String>) null);
            return 0;
        }
        C91196d.C91202f fVar = cVar.f261472e;
        Map<String, String> map = cVar.f261473f;
        if (map == null) {
            cVar.f261474g.mo66936b(-1002, "format error");
            return -1002;
        }
        int i = Util.getInt(map.get(".Response.error.code"), 0);
        if (i == 0) {
            cVar.f261474g.mo66938d(fVar.f261480c, cVar.f261473f);
            return 0;
        }
        cVar.f261474g.mo66936b(i, c0Var.mo109596e(i, cVar.f261473f.get(".Response.error.message")));
        return i;
    }

    /* renamed from: c */
    public static String m96570c() {
        return HttpWrapperBase.PROTOCAL_HTTPS + f233199g;
    }

    /* renamed from: b */
    public void mo109594b(long j) {
        C79542b bVar = (C79542b) ((HashMap) this.f233206f).get(Long.valueOf(j));
        if (bVar != null) {
            bVar.onCancelled();
            bVar.cancel(true);
        }
        ((HashMap) this.f233206f).remove(Long.valueOf(j));
        ((HashMap) this.f233205e).remove(Long.valueOf(j));
    }

    /* renamed from: d */
    public String mo109595d() {
        String str;
        StringBuilder sb = new StringBuilder();
        synchronized (C112760b.class) {
            str = C112760b.m154195C() + "mail/";
        }
        sb.append(str);
        sb.append("attach/");
        String sb4 = sb.toString();
        C86013q1.m106461v(sb4);
        return sb4;
    }

    /* renamed from: e */
    public final String mo109596e(int i, String str) {
        int i2;
        if (i != -7) {
            if (i != -6) {
                if (i == -4 || i == -3) {
                    i2 = C0966R.string.hla;
                } else if (i != -1) {
                    switch (i) {
                        case ZipJNI.UNZ_CRCERROR /*-105*/:
                            break;
                        case -104:
                            i2 = C0966R.string.hl_;
                            break;
                        case -103:
                            i2 = C0966R.string.hl9;
                            break;
                        case -102:
                            i2 = C0966R.string.hl8;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                } else {
                    i2 = C0966R.string.hl6;
                }
            }
            i2 = C0966R.string.hlb;
        } else {
            i2 = C0966R.string.hlc;
        }
        return i2 == 0 ? str : C76577a.m92166q(MMApplicationContext.getContext(), i2);
    }

    /* renamed from: f */
    public void mo109597f() {
        for (C79542b cancel : ((HashMap) this.f233206f).values()) {
            cancel.cancel(true);
        }
        ((HashMap) this.f233206f).clear();
        ((HashMap) this.f233205e).clear();
        ((HashMap) this.f233201a).clear();
        String str = ((IPCString) C80907o.m98783f(MMApplicationContext.getPackageName(), new IPCVoid(), C16157c.class)).f10315d;
        if (Util.isNullOrNil(str)) {
            C67042s sVar = new C67042s("wcf://mailapp/addr/mail_address/addrpage");
            this.f233202b = sVar;
            sVar.f192588b.mo73081a();
        } else {
            this.f233202b = new C67042s("wcf://mailapp/" + "addr/mail_address/" + str + "/addrpage");
        }
        this.f233203c = new C27896j("wcf://mailapp/draft/");
        this.f233204d = new C27899n("wcf://mailapp/http/", 0);
    }

    /* renamed from: g */
    public final long mo109598g(String str, int i, Map<String, String> map, C91196d.C91203g gVar, C91196d.C91198b bVar, C91196d.C91197a aVar) {
        String str2;
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("appname", "qqmail_weixin");
        map.put("f", "xml");
        map.put("charset", "utf-8");
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            loop0:
            while (true) {
                if (!networkInterfaces.hasMoreElements()) {
                    break;
                }
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (true) {
                    if (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement = inetAddresses.nextElement();
                        if (!nextElement.isLoopbackAddress()) {
                            str2 = nextElement.getHostAddress();
                            break loop0;
                        }
                    }
                }
            }
        } catch (Exception | SocketException unused) {
        }
        str2 = null;
        map.put("clientip", str2);
        C91196d.C91201e eVar = new C91196d.C91201e(i, map, this.f233201a, gVar);
        C91196d.C91199c cVar = new C91196d.C91199c(m96570c() + str, eVar, aVar);
        cVar.f261470c = bVar;
        MMHandlerThread.postToMainThread(new C79541a(cVar));
        return cVar.f261468a;
    }
}
