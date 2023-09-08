package l24;

import android.os.Build;
import android.util.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import d24.C116554w;
import e24.C20509c;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import n24.C117598c;
import n24.C117599e;
import n24.C88898b;
import o24.C21766h;

/* renamed from: l24.b */
public class C117434b extends C117443g {

    /* renamed from: c */
    public final C117442f<Socket> f351482c;

    /* renamed from: d */
    public final C117442f<Socket> f351483d;

    /* renamed from: e */
    public final C117442f<Socket> f351484e;

    /* renamed from: f */
    public final C117442f<Socket> f351485f;

    /* renamed from: g */
    public final C117437c f351486g;

    /* renamed from: l24.b$a */
    public static final class C117435a extends C117598c {

        /* renamed from: a */
        public final Object f351487a;

        /* renamed from: b */
        public final Method f351488b;

        public C117435a(Object obj, Method method) {
            this.f351487a = obj;
            this.f351488b = method;
        }

        /* renamed from: a */
        public List<Certificate> mo182137a(List<Certificate> list, String str) {
            try {
                return (List) this.f351488b.invoke(this.f351487a, new Object[]{(X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str});
            } catch (InvocationTargetException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof C117435a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* renamed from: l24.b$b */
    public static final class C117436b implements C117599e {

        /* renamed from: a */
        public final X509TrustManager f351489a;

        /* renamed from: b */
        public final Method f351490b;

        public C117436b(X509TrustManager x509TrustManager, Method method) {
            this.f351490b = method;
            this.f351489a = x509TrustManager;
        }

        /* renamed from: a */
        public X509Certificate mo123282a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f351490b.invoke(this.f351489a, new Object[]{x509Certificate});
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e) {
                throw C20509c.m22195a("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C117436b)) {
                return false;
            }
            C117436b bVar = (C117436b) obj;
            return this.f351489a.equals(bVar.f351489a) && this.f351490b.equals(bVar.f351490b);
        }

        public int hashCode() {
            return this.f351489a.hashCode() + (this.f351490b.hashCode() * 31);
        }
    }

    /* renamed from: l24.b$c */
    public static final class C117437c {

        /* renamed from: a */
        public final Method f351491a;

        /* renamed from: b */
        public final Method f351492b;

        /* renamed from: c */
        public final Method f351493c;

        public C117437c(Method method, Method method2, Method method3) {
            this.f351491a = method;
            this.f351492b = method2;
            this.f351493c = method3;
        }
    }

    public C117434b(Class<?> cls, C117442f<Socket> fVar, C117442f<Socket> fVar2, C117442f<Socket> fVar3, C117442f<Socket> fVar4) {
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", new Class[0]);
            method = cls2.getMethod(WeChatBrands.Business.GROUP_OPEN, new Class[]{String.class});
            method2 = cls2.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method2 = null;
            method = null;
        }
        this.f351486g = new C117437c(method3, method, method2);
        this.f351482c = fVar;
        this.f351483d = fVar2;
        this.f351484e = fVar3;
        this.f351485f = fVar4;
    }

    /* renamed from: c */
    public C117598c mo182128c(X509TrustManager x509TrustManager) {
        Class<String> cls = String.class;
        try {
            Class<?> cls2 = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C117435a(cls2.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), cls2.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, cls, cls}));
        } catch (Exception unused) {
            return super.mo182128c(x509TrustManager);
        }
    }

    /* renamed from: d */
    public C117599e mo182129d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new C117436b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return new C88898b(x509TrustManager.getAcceptedIssuers());
        }
    }

    /* renamed from: f */
    public void mo182126f(SSLSocket sSLSocket, String str, List<C116554w> list) {
        if (str != null) {
            this.f351482c.mo182148c(sSLSocket, Boolean.TRUE);
            this.f351483d.mo182148c(sSLSocket, str);
        }
        C117442f<Socket> fVar = this.f351485f;
        if (fVar != null) {
            if (fVar.mo182146a(sSLSocket.getClass()) != null) {
                Object[] objArr = new Object[1];
                C21766h hVar = new C21766h();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    C116554w wVar = list.get(i);
                    if (wVar != C116554w.HTTP_1_0) {
                        hVar.mo34148q(wVar.f349574d.length());
                        hVar.mo34116B(wVar.f349574d);
                    }
                }
                objArr[0] = hVar.mo34136g(hVar.f61695e);
                C117442f<Socket> fVar2 = this.f351485f;
                fVar2.getClass();
                try {
                    fVar2.mo182147b(sSLSocket, objArr);
                } catch (InvocationTargetException e) {
                    Throwable targetException = e.getTargetException();
                    if (targetException instanceof RuntimeException) {
                        throw ((RuntimeException) targetException);
                    }
                    AssertionError assertionError = new AssertionError("Unexpected exception");
                    assertionError.initCause(targetException);
                    throw assertionError;
                }
            }
        }
    }

    /* renamed from: g */
    public void mo182130g(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (C20509c.m22209o(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (SecurityException e2) {
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e2);
            throw iOException;
        } catch (ClassCastException e3) {
            if (Build.VERSION.SDK_INT == 26) {
                IOException iOException2 = new IOException("Exception in connect");
                iOException2.initCause(e3);
                throw iOException2;
            }
            throw e3;
        }
    }

    /* renamed from: h */
    public SSLContext mo182131h() {
        boolean z = true;
        try {
            if (Build.VERSION.SDK_INT >= 22) {
                z = false;
            }
        } catch (NoClassDefFoundError unused) {
        }
        if (z) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused2) {
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
        C117442f<Socket> fVar = this.f351484e;
        if (fVar == null) {
            return null;
        }
        if (!(fVar.mo182146a(sSLSocket.getClass()) != null)) {
            return null;
        }
        C117442f<Socket> fVar2 = this.f351484e;
        Object[] objArr = new Object[0];
        fVar2.getClass();
        try {
            byte[] bArr = (byte[]) fVar2.mo182147b(sSLSocket, objArr);
            if (bArr != null) {
                return new String(bArr, C20509c.f57732d);
            }
            return null;
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: j */
    public Object mo182132j(String str) {
        C117437c cVar = this.f351486g;
        Method method = cVar.f351491a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke((Object) null, new Object[0]);
            cVar.f351492b.invoke(invoke, new Object[]{str});
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: k */
    public boolean mo182133k(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return mo182136n(str, cls, cls.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return true;
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw C20509c.m22195a("unable to determine cleartext support", e);
        }
    }

    /* renamed from: l */
    public void mo182134l(int i, String str, Throwable th) {
        int min;
        int i2 = 5;
        if (i != 5) {
            i2 = 3;
        }
        if (th != null) {
            str = str + 10 + Log.getStackTraceString(th);
        }
        int i3 = 0;
        int length = str.length();
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + 4000);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                }
                i3 = min;
            }
            i3 = min + 1;
        }
    }

    /* renamed from: m */
    public void mo182135m(String str, Object obj) {
        C117437c cVar = this.f351486g;
        cVar.getClass();
        boolean z = false;
        if (obj != null) {
            try {
                cVar.f351493c.invoke(obj, new Object[0]);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (!z) {
            mo182134l(5, str, (Throwable) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        return ((java.lang.Boolean) r7.getMethod("isCleartextTrafficPermitted", new java.lang.Class[0]).invoke(r8, new java.lang.Object[0])).booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        return true;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x001d */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo182136n(java.lang.String r6, java.lang.Class<?> r7, java.lang.Object r8) {
        /*
            r5 = this;
            java.lang.String r0 = "isCleartextTrafficPermitted"
            r1 = 0
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r3[r1] = r4     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.reflect.Method r3 = r7.getMethod(r0, r3)     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ NoSuchMethodException -> 0x001d }
            r4[r1] = r6     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.Object r6 = r3.invoke(r8, r4)     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ NoSuchMethodException -> 0x001d }
            boolean r6 = r6.booleanValue()     // Catch:{ NoSuchMethodException -> 0x001d }
            return r6
        L_0x001d:
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.reflect.Method r6 = r7.getMethod(r0, r6)     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.Object r6 = r6.invoke(r8, r7)     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ NoSuchMethodException -> 0x002f }
            boolean r2 = r6.booleanValue()     // Catch:{ NoSuchMethodException -> 0x002f }
        L_0x002f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l24.C117434b.mo182136n(java.lang.String, java.lang.Class, java.lang.Object):boolean");
    }
}
