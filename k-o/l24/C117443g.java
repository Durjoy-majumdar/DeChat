package l24;

import d24.C116554w;
import d24.C20425v;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import n24.C117597a;
import n24.C117598c;
import n24.C117599e;
import n24.C88898b;

/* renamed from: l24.g */
public class C117443g {

    /* renamed from: a */
    public static final C117443g f351507a;

    /* renamed from: b */
    public static final Logger f351508b = Logger.getLogger(C20425v.class.getName());

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: l24.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: l24.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: l24.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: l24.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: l24.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: l24.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: l24.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: l24.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: l24.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: l24.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: l24.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    static {
        /*
            java.lang.String r0 = "java.vm.name"
            java.lang.String r1 = java.lang.System.getProperty(r0)
            java.lang.String r2 = "Dalvik"
            boolean r1 = r2.equals(r1)
            r3 = 0
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x00af
            java.lang.String r1 = "com.android.org.conscrypt.SSLParametersImpl"
            java.lang.String r6 = java.lang.System.getProperty(r0)
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L_0x001e
            goto L_0x0033
        L_0x001e:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ NoClassDefFoundError -> 0x0023 }
            goto L_0x0025
        L_0x0021:
            goto L_0x0033
        L_0x0023:
            r6 = 0
        L_0x0025:
            r7 = 29
            if (r6 < r7) goto L_0x0033
            java.lang.Class r6 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0021 }
            l24.a r7 = new l24.a     // Catch:{ ClassNotFoundException -> 0x0021 }
            r7.<init>(r6)     // Catch:{ ClassNotFoundException -> 0x0021 }
            goto L_0x0034
        L_0x0033:
            r7 = r3
        L_0x0034:
            if (r7 == 0) goto L_0x0038
            goto L_0x0150
        L_0x0038:
            java.lang.Class<byte[]> r6 = byte[].class
            java.lang.String r0 = java.lang.System.getProperty(r0)
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0045
            goto L_0x00a2
        L_0x0045:
            java.lang.Class r0 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x004b }
        L_0x0049:
            r8 = r0
            goto L_0x0052
        L_0x004b:
            java.lang.String r0 = "org.apache.harmony.xnet.provider.jsse.SSLParametersImpl"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x00a1 }
            goto L_0x0049
        L_0x0052:
            l24.f r9 = new l24.f     // Catch:{ ClassNotFoundException -> 0x00a1 }
            java.lang.String r0 = "setUseSessionTickets"
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x00a1 }
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException -> 0x00a1 }
            r1[r4] = r2     // Catch:{ ClassNotFoundException -> 0x00a1 }
            r9.<init>(r3, r0, r1)     // Catch:{ ClassNotFoundException -> 0x00a1 }
            l24.f r10 = new l24.f     // Catch:{ ClassNotFoundException -> 0x00a1 }
            java.lang.String r0 = "setHostname"
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x00a1 }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r4] = r2     // Catch:{ ClassNotFoundException -> 0x00a1 }
            r10.<init>(r3, r0, r1)     // Catch:{ ClassNotFoundException -> 0x00a1 }
            java.lang.String r0 = "GMSCore_OpenSSL"
            java.security.Provider r0 = java.security.Security.getProvider(r0)     // Catch:{ ClassNotFoundException -> 0x00a1 }
            if (r0 == 0) goto L_0x0075
            goto L_0x007a
        L_0x0075:
            java.lang.String r0 = "android.net.Network"
            java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x007c }
        L_0x007a:
            r0 = 1
            goto L_0x007e
        L_0x007c:
            r0 = 0
        L_0x007e:
            if (r0 == 0) goto L_0x0097
            l24.f r0 = new l24.f     // Catch:{ ClassNotFoundException -> 0x00a1 }
            java.lang.String r1 = "getAlpnSelectedProtocol"
            java.lang.Class[] r2 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x00a1 }
            r0.<init>(r6, r1, r2)     // Catch:{ ClassNotFoundException -> 0x00a1 }
            l24.f r1 = new l24.f     // Catch:{ ClassNotFoundException -> 0x00a1 }
            java.lang.String r2 = "setAlpnProtocols"
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x00a1 }
            r5[r4] = r6     // Catch:{ ClassNotFoundException -> 0x00a1 }
            r1.<init>(r3, r2, r5)     // Catch:{ ClassNotFoundException -> 0x00a1 }
            r11 = r0
            r12 = r1
            goto L_0x0099
        L_0x0097:
            r11 = r3
            r12 = r11
        L_0x0099:
            l24.b r0 = new l24.b     // Catch:{ ClassNotFoundException -> 0x00a1 }
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ ClassNotFoundException -> 0x00a1 }
            r3 = r0
            goto L_0x00a2
        L_0x00a1:
        L_0x00a2:
            if (r3 == 0) goto L_0x00a7
        L_0x00a4:
            r7 = r3
            goto L_0x0150
        L_0x00a7:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "No platform found on Android"
            r0.<init>(r1)
            throw r0
        L_0x00af:
            java.lang.String r0 = "okhttp.platform"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r1 = "conscrypt"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00bf
            r0 = 1
            goto L_0x00cf
        L_0x00bf:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r4]
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "Conscrypt"
            boolean r0 = r1.equals(r0)
        L_0x00cf:
            if (r0 == 0) goto L_0x00da
            l24.c r0 = l24.C117438c.m165627n()
            if (r0 == 0) goto L_0x00da
        L_0x00d7:
            r7 = r0
            goto L_0x0150
        L_0x00da:
            java.lang.Class<javax.net.ssl.SSLParameters> r0 = javax.net.ssl.SSLParameters.class
            java.lang.String r1 = "setApplicationProtocols"
            java.lang.Class[] r2 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x00f9 }
            java.lang.Class<java.lang.String[]> r6 = java.lang.String[].class
            r2[r4] = r6     // Catch:{ NoSuchMethodException -> 0x00f9 }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch:{ NoSuchMethodException -> 0x00f9 }
            java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
            java.lang.String r2 = "getApplicationProtocol"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x00f9 }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r6)     // Catch:{ NoSuchMethodException -> 0x00f9 }
            l24.d r2 = new l24.d     // Catch:{ NoSuchMethodException -> 0x00f9 }
            r2.<init>(r0, r1)     // Catch:{ NoSuchMethodException -> 0x00f9 }
            r7 = r2
            goto L_0x00fb
        L_0x00f9:
            r7 = r3
        L_0x00fb:
            if (r7 == 0) goto L_0x00fe
            goto L_0x0150
        L_0x00fe:
            java.lang.String r0 = "org.eclipse.jetty.alpn.ALPN"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0145 }
            java.lang.String r1 = "org.eclipse.jetty.alpn.ALPN$Provider"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0145 }
            java.lang.String r2 = "org.eclipse.jetty.alpn.ALPN$ClientProvider"
            java.lang.Class r10 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0145 }
            java.lang.String r2 = "org.eclipse.jetty.alpn.ALPN$ServerProvider"
            java.lang.Class r11 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0145 }
            java.lang.String r2 = "put"
            r6 = 2
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0145 }
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r6[r4] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0145 }
            r6[r5] = r1     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0145 }
            java.lang.reflect.Method r7 = r0.getMethod(r2, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0145 }
            java.lang.String r1 = "get"
            java.lang.Class[] r2 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0145 }
            java.lang.Class<javax.net.ssl.SSLSocket> r6 = javax.net.ssl.SSLSocket.class
            r2[r4] = r6     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0145 }
            java.lang.reflect.Method r8 = r0.getMethod(r1, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0145 }
            java.lang.String r1 = "remove"
            java.lang.Class[] r2 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0145 }
            java.lang.Class<javax.net.ssl.SSLSocket> r5 = javax.net.ssl.SSLSocket.class
            r2[r4] = r5     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0145 }
            java.lang.reflect.Method r9 = r0.getMethod(r1, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0145 }
            l24.e r0 = new l24.e     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0145 }
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0145 }
            r3 = r0
            goto L_0x0146
        L_0x0145:
        L_0x0146:
            if (r3 == 0) goto L_0x014a
            goto L_0x00a4
        L_0x014a:
            l24.g r0 = new l24.g
            r0.<init>()
            goto L_0x00d7
        L_0x0150:
            f351507a = r7
            java.lang.Class<d24.v> r0 = d24.C20425v.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f351508b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l24.C117443g.<clinit>():void");
    }

    /* renamed from: b */
    public static List<String> m165641b(List<C116554w> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C116554w wVar = list.get(i);
            if (wVar != C116554w.HTTP_1_0) {
                arrayList.add(wVar.f349574d);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo182144a(SSLSocket sSLSocket) {
    }

    /* renamed from: c */
    public C117598c mo182128c(X509TrustManager x509TrustManager) {
        return new C117597a(mo182129d(x509TrustManager));
    }

    /* renamed from: d */
    public C117599e mo182129d(X509TrustManager x509TrustManager) {
        return new C88898b(x509TrustManager.getAcceptedIssuers());
    }

    /* renamed from: e */
    public void mo182142e(SSLSocketFactory sSLSocketFactory) {
    }

    /* renamed from: f */
    public void mo182126f(SSLSocket sSLSocket, String str, List<C116554w> list) {
    }

    /* renamed from: g */
    public void mo182130g(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: h */
    public SSLContext mo182131h() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* renamed from: i */
    public String mo182127i(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: j */
    public Object mo182132j(String str) {
        if (f351508b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* renamed from: k */
    public boolean mo182133k(String str) {
        return true;
    }

    /* renamed from: l */
    public void mo182134l(int i, String str, Throwable th) {
        f351508b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: m */
    public void mo182135m(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        mo182134l(5, str, (Throwable) obj);
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
