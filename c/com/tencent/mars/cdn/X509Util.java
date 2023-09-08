package com.tencent.mars.cdn;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.util.Pair;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import java.io.ByteArrayInputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

public class X509Util {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final String OID_ANY_EKU = "2.5.29.37.0";
    private static final String OID_SERVER_GATED_MICROSOFT = "1.3.6.1.4.1.311.10.3.3";
    private static final String OID_SERVER_GATED_NETSCAPE = "2.16.840.1.113730.4.1";
    private static final String OID_TLS_SERVER_AUTH = "1.3.6.1.5.5.7.3.1";
    public static final int STATE_APPBRAND = 1;
    public static final int STATE_CDN = 0;
    private static final String TAG = "X509Util";
    private static CertificateFactory sCertificateFactory;
    private static X509TrustManagerImplementation sDefaultTrustManager;
    private static boolean sLoadedSystemKeyStore;
    private static final Object sLock = new Object();
    private static C86009m1 sSystemCertificateDirectory;
    private static KeyStore sSystemKeyStore;
    private static Set<Pair<X500Principal, PublicKey>> sSystemTrustAnchorCache;
    private static KeyStore sTestKeyStore;
    private static X509TrustManagerImplementation sTestTrustManager;
    private static TrustStorageListener sTrustStorageListener;

    public static final class CertVerifyStatusAndroid {
        public static final int EXPIRED = -3;
        public static final int FAILED = -1;
        public static final int INCORRECT_KEY_USAGE = -6;
        public static final int NOT_YET_VALID = -4;
        public static final int NO_TRUSTED_ROOT = -2;

        /* renamed from: OK */
        public static final int f235231OK = 0;
        public static final int UNABLE_TO_PARSE = -5;
    }

    public static final class TrustStorageListener extends BroadcastReceiver {
        private TrustStorageListener() {
        }

        public void onReceive(Context context, Intent intent) {
            if (Build.VERSION.SDK_INT >= 26 ? "android.security.action.KEYCHAIN_CHANGED".equals(intent.getAction()) || "android.security.action.TRUST_STORE_CHANGED".equals(intent.getAction()) || ("android.security.action.KEY_ACCESS_CHANGED".equals(intent.getAction()) && !intent.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false)) : "android.security.STORAGE_CHANGED".equals(intent.getAction())) {
                try {
                    X509Util.reloadDefaultTrustManager();
                } catch (CertificateException e) {
                    Log.m105921e(X509Util.TAG, "Unable to reload the default TrustManager", e);
                } catch (KeyStoreException e2) {
                    Log.m105921e(X509Util.TAG, "Unable to reload the default TrustManager", e2);
                } catch (NoSuchAlgorithmException e3) {
                    Log.m105921e(X509Util.TAG, "Unable to reload the default TrustManager", e3);
                }
            }
        }
    }

    public static final class X509TrustManagerIceCreamSandwich implements X509TrustManagerImplementation {
        private final X509TrustManager mTrustManager;

        public X509TrustManagerIceCreamSandwich(X509TrustManager x509TrustManager) {
            this.mTrustManager = x509TrustManager;
        }

        public List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2) {
            this.mTrustManager.checkServerTrusted(x509CertificateArr, str);
            return Collections.emptyList();
        }
    }

    public interface X509TrustManagerImplementation {
        List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2);
    }

    public static final class X509TrustManagerJellyBean implements X509TrustManagerImplementation {
        private final X509TrustManagerExtensions mTrustManagerExtensions;

        public X509TrustManagerJellyBean(X509TrustManager x509TrustManager) {
            this.mTrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        }

        public List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2) {
            return this.mTrustManagerExtensions.checkServerTrusted(x509CertificateArr, str, str2);
        }
    }

    public static void addTestRootCertificate(byte[] bArr) {
        ensureInitialized();
        X509Certificate createCertificateFromBytes = createCertificateFromBytes(bArr);
        synchronized (sLock) {
            KeyStore keyStore = sTestKeyStore;
            keyStore.setCertificateEntry("root_cert_" + Integer.toString(sTestKeyStore.size()), createCertificateFromBytes);
            reloadTestTrustManager();
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void clearTestRootCertificates() {
        /*
            ensureInitialized()
            java.lang.Object r0 = sLock
            monitor-enter(r0)
            java.security.KeyStore r1 = sTestKeyStore     // Catch:{ IOException -> 0x0012 }
            r2 = 0
            r1.load(r2)     // Catch:{ IOException -> 0x0012 }
            reloadTestTrustManager()     // Catch:{ IOException -> 0x0012 }
            goto L_0x0012
        L_0x0010:
            r1 = move-exception
            goto L_0x0014
        L_0x0012:
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            return
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mars.cdn.X509Util.clearTestRootCertificates():void");
    }

    public static X509Certificate createCertificateFromBytes(byte[] bArr) {
        ensureInitialized();
        return (X509Certificate) sCertificateFactory.generateCertificate(new ByteArrayInputStream(bArr));
    }

    private static X509TrustManagerImplementation createTrustManager(KeyStore keyStore) {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init(keyStore);
        TrustManager[] trustManagers = instance.getTrustManagers();
        int length = trustManagers.length;
        int i = 0;
        while (i < length) {
            TrustManager trustManager = trustManagers[i];
            if (trustManager instanceof X509TrustManager) {
                try {
                    return new X509TrustManagerJellyBean((X509TrustManager) trustManager);
                } catch (IllegalArgumentException e) {
                    String name = trustManager.getClass().getName();
                    Log.m105920e(TAG, "Error creating trust manager (" + name + "): " + e);
                }
            } else {
                i++;
            }
        }
        Log.m105920e(TAG, "Could not find suitable trust manager");
        return null;
    }

    private static void ensureInitialized() {
        synchronized (sLock) {
            ensureInitializedLocked();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|11|12|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0026 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void ensureInitializedLocked() {
        /*
            java.security.cert.CertificateFactory r0 = sCertificateFactory
            if (r0 != 0) goto L_0x000c
            java.lang.String r0 = "X.509"
            java.security.cert.CertificateFactory r0 = java.security.cert.CertificateFactory.getInstance(r0)
            sCertificateFactory = r0
        L_0x000c:
            com.tencent.mars.cdn.X509Util$X509TrustManagerImplementation r0 = sDefaultTrustManager
            r1 = 0
            if (r0 != 0) goto L_0x0017
            com.tencent.mars.cdn.X509Util$X509TrustManagerImplementation r0 = createTrustManager(r1)
            sDefaultTrustManager = r0
        L_0x0017:
            boolean r0 = sLoadedSystemKeyStore
            if (r0 != 0) goto L_0x0047
            java.lang.String r0 = "AndroidCAStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)     // Catch:{ KeyStoreException -> 0x0044 }
            sSystemKeyStore = r0     // Catch:{ KeyStoreException -> 0x0044 }
            r0.load(r1)     // Catch:{ IOException -> 0x0026 }
        L_0x0026:
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1     // Catch:{ KeyStoreException -> 0x0044 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ KeyStoreException -> 0x0044 }
            r2.<init>()     // Catch:{ KeyStoreException -> 0x0044 }
            java.lang.String r3 = "ANDROID_ROOT"
            java.lang.String r3 = java.lang.System.getenv(r3)     // Catch:{ KeyStoreException -> 0x0044 }
            r2.append(r3)     // Catch:{ KeyStoreException -> 0x0044 }
            java.lang.String r3 = "/etc/security/cacerts"
            r2.append(r3)     // Catch:{ KeyStoreException -> 0x0044 }
            java.lang.String r2 = r2.toString()     // Catch:{ KeyStoreException -> 0x0044 }
            r0.<init>((java.lang.String) r2)     // Catch:{ KeyStoreException -> 0x0044 }
            sSystemCertificateDirectory = r0     // Catch:{ KeyStoreException -> 0x0044 }
        L_0x0044:
            r0 = 1
            sLoadedSystemKeyStore = r0
        L_0x0047:
            java.util.Set<android.util.Pair<javax.security.auth.x500.X500Principal, java.security.PublicKey>> r0 = sSystemTrustAnchorCache
            if (r0 != 0) goto L_0x0052
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            sSystemTrustAnchorCache = r0
        L_0x0052:
            java.security.KeyStore r0 = sTestKeyStore
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = java.security.KeyStore.getDefaultType()
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)
            sTestKeyStore = r0
            r0.load(r1)     // Catch:{ IOException -> 0x0064 }
            goto L_0x0065
        L_0x0064:
        L_0x0065:
            com.tencent.mars.cdn.X509Util$X509TrustManagerImplementation r0 = sTestTrustManager
            if (r0 != 0) goto L_0x0071
            java.security.KeyStore r0 = sTestKeyStore
            com.tencent.mars.cdn.X509Util$X509TrustManagerImplementation r0 = createTrustManager(r0)
            sTestTrustManager = r0
        L_0x0071:
            com.tencent.mars.cdn.X509Util$TrustStorageListener r0 = sTrustStorageListener
            if (r0 != 0) goto L_0x00a5
            com.tencent.mars.cdn.X509Util$TrustStorageListener r0 = new com.tencent.mars.cdn.X509Util$TrustStorageListener
            r0.<init>()
            sTrustStorageListener = r0
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L_0x0097
            java.lang.String r1 = "android.security.action.KEYCHAIN_CHANGED"
            r0.addAction(r1)
            java.lang.String r1 = "android.security.action.KEY_ACCESS_CHANGED"
            r0.addAction(r1)
            java.lang.String r1 = "android.security.action.TRUST_STORE_CHANGED"
            r0.addAction(r1)
            goto L_0x009c
        L_0x0097:
            java.lang.String r1 = "android.security.STORAGE_CHANGED"
            r0.addAction(r1)
        L_0x009c:
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            com.tencent.mars.cdn.X509Util$TrustStorageListener r2 = sTrustStorageListener
            r1.registerReceiver(r2, r0)
        L_0x00a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mars.cdn.X509Util.ensureInitializedLocked():void");
    }

    private static List<String> getSubjectAlternativeNames(X509Certificate x509Certificate) {
        String str;
        Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        if (subjectAlternativeNames == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (List<?> list : subjectAlternativeNames) {
            Object obj = list.get(1);
            if (obj instanceof String) {
                arrayList.add(((String) obj).toLowerCase());
            }
        }
        String trim = x509Certificate.getSubjectDN().getName().trim();
        int indexOf = trim.indexOf("CN=");
        if (indexOf >= 0) {
            str = trim.substring(indexOf + 3);
            int indexOf2 = str.indexOf(",");
            if (indexOf2 > 0) {
                str = str.substring(0, indexOf2);
            }
        } else {
            str = "";
        }
        Log.m105925i(TAG, "certificate dn %s cn %s", trim, str);
        if (str.length() > 0) {
            arrayList.add(str);
        }
        return arrayList;
    }

    private static String hashPrincipal(X500Principal x500Principal) {
        byte[] digest = MessageDigest.getInstance("MD5").digest(x500Principal.getEncoded());
        char[] cArr = new char[8];
        for (int i = 0; i < 4; i++) {
            int i2 = i * 2;
            char[] cArr2 = HEX_DIGITS;
            byte b = digest[3 - i];
            cArr[i2] = cArr2[(b >> 4) & 15];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    private static boolean isHostMatched(List<String> list, String str) {
        if (list.contains(str)) {
            return true;
        }
        int indexOf = str.indexOf(".");
        int lastIndexOf = str.lastIndexOf(".");
        while (indexOf > 0 && indexOf < lastIndexOf) {
            String str2 = "*" + str.substring(indexOf);
            Log.m105924i(TAG, "try match nhost " + str2);
            if (list.contains(str2)) {
                return true;
            }
            indexOf = str.indexOf(".", indexOf + 1);
        }
        return false;
    }

    private static boolean isKnownRoot(X509Certificate x509Certificate) {
        if (sSystemKeyStore == null) {
            return false;
        }
        Pair pair = new Pair(x509Certificate.getSubjectX500Principal(), x509Certificate.getPublicKey());
        if (sSystemTrustAnchorCache.contains(pair)) {
            return true;
        }
        String hashPrincipal = hashPrincipal(x509Certificate.getSubjectX500Principal());
        int i = 0;
        while (true) {
            String str = hashPrincipal + '.' + i;
            if (!new C86009m1(sSystemCertificateDirectory, str).mo119967g()) {
                return false;
            }
            Certificate certificate = sSystemKeyStore.getCertificate("system:" + str);
            if (certificate != null) {
                if (!(certificate instanceof X509Certificate)) {
                    Log.m105920e(TAG, "Anchor " + str + " not an X509Certificate: " + certificate.getClass().getName());
                } else {
                    X509Certificate x509Certificate2 = (X509Certificate) certificate;
                    if (x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getSubjectX500Principal()) && x509Certificate.getPublicKey().equals(x509Certificate2.getPublicKey())) {
                        sSystemTrustAnchorCache.add(pair);
                        return true;
                    }
                }
            }
            i++;
        }
    }

    /* access modifiers changed from: private */
    public static void reloadDefaultTrustManager() {
        synchronized (sLock) {
            sDefaultTrustManager = null;
            sSystemTrustAnchorCache = null;
            ensureInitializedLocked();
        }
    }

    private static void reloadTestTrustManager() {
        sTestTrustManager = createTrustManager(sTestKeyStore);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean verifyKeyUsage(java.security.cert.X509Certificate r4) {
        /*
            r0 = 0
            java.util.List r4 = r4.getExtendedKeyUsage()     // Catch:{ NullPointerException -> 0x003a }
            r1 = 1
            if (r4 != 0) goto L_0x0009
            return r1
        L_0x0009:
            java.util.Iterator r4 = r4.iterator()
        L_0x000d:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x003a
            java.lang.Object r2 = r4.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "1.3.6.1.5.5.7.3.1"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x0039
            java.lang.String r3 = "2.5.29.37.0"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x0039
            java.lang.String r3 = "2.16.840.1.113730.4.1"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x0039
            java.lang.String r3 = "1.3.6.1.4.1.311.10.3.3"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x000d
        L_0x0039:
            return r1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mars.cdn.X509Util.verifyKeyUsage(java.security.cert.X509Certificate):boolean");
    }

    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2) {
        return verifyServerCertificates(bArr, str, str2, 0, (X509TrustManager) null);
    }

    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2, X509TrustManager x509TrustManager) {
        return verifyServerCertificates(bArr, str, str2, 0, x509TrustManager);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0086 A[SYNTHETIC, Splitter:B:29:0x0086] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c7 A[Catch:{ CertificateExpiredException -> 0x016d, CertificateNotYetValidException -> 0x0166, CertificateException -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.mars.cdn.AndroidCertVerifyResult verifyServerCertificates(byte[][] r9, java.lang.String r10, java.lang.String r11, int r12, javax.net.ssl.X509TrustManager r13) {
        /*
            java.lang.String r0 = "X509Util"
            java.lang.String r1 = "verifyServerCertificates %s type %s"
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r11
            r5 = 1
            r3[r5] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r3)
            if (r9 == 0) goto L_0x0181
            int r0 = r9.length
            if (r0 == 0) goto L_0x0181
            r0 = r9[r4]
            if (r0 == 0) goto L_0x0181
            r0 = -1
            ensureInitialized()     // Catch:{ CertificateException -> 0x017b }
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3 = r9[r4]     // Catch:{ CertificateException -> 0x0174 }
            java.security.cert.X509Certificate r3 = createCertificateFromBytes(r3)     // Catch:{ CertificateException -> 0x0174 }
            r1.add(r3)     // Catch:{ CertificateException -> 0x0174 }
            java.lang.Object r3 = r1.get(r4)     // Catch:{ Exception -> 0x005e }
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3     // Catch:{ Exception -> 0x005e }
            java.util.List r3 = getSubjectAlternativeNames(r3)     // Catch:{ Exception -> 0x005e }
            java.lang.String r6 = "X509Util"
            java.lang.String r7 = "check host %s in altnames %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x005e }
            r2[r4] = r11     // Catch:{ Exception -> 0x005e }
            java.lang.String r8 = r3.toString()     // Catch:{ Exception -> 0x005e }
            r2[r5] = r8     // Catch:{ Exception -> 0x005e }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r2)     // Catch:{ Exception -> 0x005e }
            boolean r2 = isHostMatched(r3, r11)     // Catch:{ Exception -> 0x005e }
            if (r2 != 0) goto L_0x005c
            java.lang.String r2 = "X509Util"
            java.lang.String r3 = "hostname mismatch"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r3)     // Catch:{ Exception -> 0x005e }
            if (r12 == r5) goto L_0x0081
            com.tencent.mars.cdn.AndroidCertVerifyResult r2 = new com.tencent.mars.cdn.AndroidCertVerifyResult     // Catch:{ Exception -> 0x005e }
            r2.<init>(r0)     // Catch:{ Exception -> 0x005e }
            return r2
        L_0x005c:
            r12 = 1
            goto L_0x0082
        L_0x005e:
            r2 = move-exception
            java.lang.String r3 = "X509Util"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "hostname verify failed "
            r6.append(r7)
            java.lang.String r2 = r2.getLocalizedMessage()
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
            if (r12 == r5) goto L_0x0081
            com.tencent.mars.cdn.AndroidCertVerifyResult r9 = new com.tencent.mars.cdn.AndroidCertVerifyResult
            r9.<init>(r0)
            return r9
        L_0x0081:
            r12 = 0
        L_0x0082:
            r2 = 1
        L_0x0083:
            int r3 = r9.length
            if (r2 >= r3) goto L_0x00ae
            r3 = r9[r2]     // Catch:{ CertificateException -> 0x0090 }
            java.security.cert.X509Certificate r3 = createCertificateFromBytes(r3)     // Catch:{ CertificateException -> 0x0090 }
            r1.add(r3)     // Catch:{ CertificateException -> 0x0090 }
            goto L_0x00ab
        L_0x0090:
            java.lang.String r3 = "X509Util"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "intermediate "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r7 = " failed parsing"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r6)
        L_0x00ab:
            int r2 = r2 + 1
            goto L_0x0083
        L_0x00ae:
            int r9 = r1.size()
            java.security.cert.X509Certificate[] r9 = new java.security.cert.X509Certificate[r9]
            java.lang.Object[] r9 = r1.toArray(r9)
            java.security.cert.X509Certificate[] r9 = (java.security.cert.X509Certificate[]) r9
            r1 = r9[r4]     // Catch:{ CertificateExpiredException -> 0x016d, CertificateNotYetValidException -> 0x0166, CertificateException -> 0x0160 }
            r1.checkValidity()     // Catch:{ CertificateExpiredException -> 0x016d, CertificateNotYetValidException -> 0x0166, CertificateException -> 0x0160 }
            r1 = r9[r4]     // Catch:{ CertificateExpiredException -> 0x016d, CertificateNotYetValidException -> 0x0166, CertificateException -> 0x0160 }
            boolean r1 = verifyKeyUsage(r1)     // Catch:{ CertificateExpiredException -> 0x016d, CertificateNotYetValidException -> 0x0166, CertificateException -> 0x0160 }
            if (r1 != 0) goto L_0x00ce
            com.tencent.mars.cdn.AndroidCertVerifyResult r9 = new com.tencent.mars.cdn.AndroidCertVerifyResult     // Catch:{ CertificateExpiredException -> 0x016d, CertificateNotYetValidException -> 0x0166, CertificateException -> 0x0160 }
            r10 = -6
            r9.<init>(r10)     // Catch:{ CertificateExpiredException -> 0x016d, CertificateNotYetValidException -> 0x0166, CertificateException -> 0x0160 }
            return r9
        L_0x00ce:
            java.lang.Object r1 = sLock
            monitor-enter(r1)
            com.tencent.mars.cdn.X509Util$X509TrustManagerImplementation r2 = sDefaultTrustManager     // Catch:{ all -> 0x015d }
            if (r2 != 0) goto L_0x00de
            if (r13 != 0) goto L_0x00de
            com.tencent.mars.cdn.AndroidCertVerifyResult r9 = new com.tencent.mars.cdn.AndroidCertVerifyResult     // Catch:{ all -> 0x015d }
            r9.<init>(r0)     // Catch:{ all -> 0x015d }
            monitor-exit(r1)     // Catch:{ all -> 0x015d }
            return r9
        L_0x00de:
            r0 = -2
            if (r13 == 0) goto L_0x0112
            r13.checkServerTrusted(r9, r10)     // Catch:{ CertificateException -> 0x00f0 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x015d }
            r9.<init>()     // Catch:{ all -> 0x015d }
            com.tencent.mars.cdn.AndroidCertVerifyResult r10 = new com.tencent.mars.cdn.AndroidCertVerifyResult     // Catch:{ all -> 0x015d }
            r10.<init>(r4, r5, r9, r12)     // Catch:{ all -> 0x015d }
            monitor-exit(r1)     // Catch:{ all -> 0x015d }
            return r10
        L_0x00f0:
            r9 = move-exception
            java.lang.String r10 = "X509Util"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x015d }
            r11.<init>()     // Catch:{ all -> 0x015d }
            java.lang.String r12 = "Failed to validate the certificate chain use self trustmanager, error: "
            r11.append(r12)     // Catch:{ all -> 0x015d }
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x015d }
            r11.append(r9)     // Catch:{ all -> 0x015d }
            java.lang.String r9 = r11.toString()     // Catch:{ all -> 0x015d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)     // Catch:{ all -> 0x015d }
            com.tencent.mars.cdn.AndroidCertVerifyResult r9 = new com.tencent.mars.cdn.AndroidCertVerifyResult     // Catch:{ all -> 0x015d }
            r9.<init>(r0)     // Catch:{ all -> 0x015d }
            monitor-exit(r1)     // Catch:{ all -> 0x015d }
            return r9
        L_0x0112:
            java.util.List r9 = r2.checkServerTrusted(r9, r10, r11)     // Catch:{ CertificateException -> 0x0117 }
            goto L_0x011e
        L_0x0117:
            r13 = move-exception
            com.tencent.mars.cdn.X509Util$X509TrustManagerImplementation r2 = sTestTrustManager     // Catch:{ CertificateException -> 0x013c }
            java.util.List r9 = r2.checkServerTrusted(r9, r10, r11)     // Catch:{ CertificateException -> 0x013c }
        L_0x011e:
            int r10 = r9.size()     // Catch:{ all -> 0x015d }
            if (r10 <= 0) goto L_0x0134
            int r10 = r9.size()     // Catch:{ all -> 0x015d }
            int r10 = r10 - r5
            java.lang.Object r10 = r9.get(r10)     // Catch:{ all -> 0x015d }
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10     // Catch:{ all -> 0x015d }
            boolean r10 = isKnownRoot(r10)     // Catch:{ all -> 0x015d }
            goto L_0x0135
        L_0x0134:
            r10 = 0
        L_0x0135:
            com.tencent.mars.cdn.AndroidCertVerifyResult r11 = new com.tencent.mars.cdn.AndroidCertVerifyResult     // Catch:{ all -> 0x015d }
            r11.<init>(r4, r10, r9, r12)     // Catch:{ all -> 0x015d }
            monitor-exit(r1)     // Catch:{ all -> 0x015d }
            return r11
        L_0x013c:
            java.lang.String r9 = "X509Util"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x015d }
            r10.<init>()     // Catch:{ all -> 0x015d }
            java.lang.String r11 = "Failed to validate the certificate chain, error: "
            r10.append(r11)     // Catch:{ all -> 0x015d }
            java.lang.String r11 = r13.getMessage()     // Catch:{ all -> 0x015d }
            r10.append(r11)     // Catch:{ all -> 0x015d }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x015d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)     // Catch:{ all -> 0x015d }
            com.tencent.mars.cdn.AndroidCertVerifyResult r9 = new com.tencent.mars.cdn.AndroidCertVerifyResult     // Catch:{ all -> 0x015d }
            r9.<init>(r0)     // Catch:{ all -> 0x015d }
            monitor-exit(r1)     // Catch:{ all -> 0x015d }
            return r9
        L_0x015d:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x015d }
            throw r9
        L_0x0160:
            com.tencent.mars.cdn.AndroidCertVerifyResult r9 = new com.tencent.mars.cdn.AndroidCertVerifyResult
            r9.<init>(r0)
            return r9
        L_0x0166:
            com.tencent.mars.cdn.AndroidCertVerifyResult r9 = new com.tencent.mars.cdn.AndroidCertVerifyResult
            r10 = -4
            r9.<init>(r10)
            return r9
        L_0x016d:
            com.tencent.mars.cdn.AndroidCertVerifyResult r9 = new com.tencent.mars.cdn.AndroidCertVerifyResult
            r10 = -3
            r9.<init>(r10)
            return r9
        L_0x0174:
            com.tencent.mars.cdn.AndroidCertVerifyResult r9 = new com.tencent.mars.cdn.AndroidCertVerifyResult
            r10 = -5
            r9.<init>(r10)
            return r9
        L_0x017b:
            com.tencent.mars.cdn.AndroidCertVerifyResult r9 = new com.tencent.mars.cdn.AndroidCertVerifyResult
            r9.<init>(r0)
            return r9
        L_0x0181:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Expected non-null and non-empty certificate chain passed as |certChain|. |certChain|="
            r11.append(r12)
            java.lang.String r9 = java.util.Arrays.deepToString(r9)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mars.cdn.X509Util.verifyServerCertificates(byte[][], java.lang.String, java.lang.String, int, javax.net.ssl.X509TrustManager):com.tencent.mars.cdn.AndroidCertVerifyResult");
    }
}
