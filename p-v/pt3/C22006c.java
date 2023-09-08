package pt3;

import android.content.Context;
import com.tencent.soter.soterserver.SoterSessionResult;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.UnrecoverableEntryException;
import nt3.C117635a;
import ot3.C117896h;
import ot3.C117897l;
import ot3.C21881e;
import ot3.C21884f;
import ot3.C21885g;
import ot3.C21886i;
import ot3.C47400b;

/* renamed from: pt3.c */
public class C22006c extends C22005b implements C47400b {

    /* renamed from: c */
    public static boolean f62267c;

    /* renamed from: b */
    public String f62268b;

    public C22006c(String str) {
        this.f62268b = str;
    }

    /* renamed from: v */
    public static void m25378v() {
        try {
            Method method = Class.forName("android.security.keystore.SoterKeyStoreProvider").getMethod("install", new Class[0]);
            method.setAccessible(true);
            method.invoke((Object) null, new Object[0]);
        } catch (ClassNotFoundException unused) {
            C21881e.m25084c("Soter.SoterCoreBeforeTreble", "soter: no SoterProvider found", new Object[0]);
        } catch (NoSuchMethodException unused2) {
            C21881e.m25084c("Soter.SoterCoreBeforeTreble", "soter: function not found", new Object[0]);
        } catch (IllegalAccessException unused3) {
            C21881e.m25084c("Soter.SoterCoreBeforeTreble", "soter: cannot access", new Object[0]);
        } catch (InvocationTargetException unused4) {
            C21881e.m25084c("Soter.SoterCoreBeforeTreble", "soter: InvocationTargetException", new Object[0]);
        } catch (Throwable th) {
            f62267c = true;
            throw th;
        }
        f62267c = true;
    }

    /* renamed from: a */
    public byte[] mo35100a(long j) {
        return new byte[0];
    }

    /* renamed from: b */
    public C21885g mo35097b() {
        C21881e.m25084c("Soter.SoterCoreBeforeTreble", "soter: start generate ask", new Object[0]);
        if (mo35110m()) {
            try {
                KeyStore.getInstance(this.f62268b).load((KeyStore.LoadStoreParameter) null);
                KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA", "SoterKeyStore");
                instance.initialize(C117635a.m165916b(C21884f.m25094a().f61885a + ".addcounter.auto_signed_when_get_pubkey_attk", 4).mo182363c("SHA-256").mo182364d("PSS").mo182362a());
                long nanoTime = System.nanoTime();
                instance.generateKeyPair();
                C21881e.m25084c("Soter.SoterCoreBeforeTreble", "soter: generate successfully. cost: %d ms", Long.valueOf(((System.nanoTime() - nanoTime) / 1000) / 1000));
                C21886i.m25097b();
                return new C21885g(0);
            } catch (Exception e) {
                C21881e.m25083b("Soter.SoterCoreBeforeTreble", "soter: generateAppGlobalSecureKey " + e.toString(), new Object[0]);
                C21881e.m25085d("Soter.SoterCoreBeforeTreble", e, "soter: generateAppGlobalSecureKey error");
                return new C21885g(4, e.toString());
            } catch (OutOfMemoryError e2) {
                C21881e.m25085d("Soter.SoterCoreBeforeTreble", e2, "soter: out of memory when generate ASK!! maybe no attk inside");
                C21886i.m25096a();
            }
        } else {
            C21881e.m25083b("Soter.SoterCoreBeforeTreble", "soter: not support soter", new Object[0]);
            return new C21885g(2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d2, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d3, code lost:
        ot3.C21881e.m25085d("Soter.SoterCoreBeforeTreble", r10, "soter: out of memory when generate AuthKey!! maybe no attk inside");
        ot3.C21886i.m25096a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00dd, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00de, code lost:
        ot3.C21881e.m25083b("Soter.SoterCoreBeforeTreble", "soter: generate auth key failed: " + r10.toString(), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0102, code lost:
        return new ot3.C21885g(6, r10.toString());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00d2 A[ExcHandler: OutOfMemoryError (r10v5 'e' java.lang.OutOfMemoryError A[CUSTOM_DECLARE]), Splitter:B:7:0x0021] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ot3.C21885g mo35101c(java.lang.String r10) {
        /*
            r9 = this;
            boolean r0 = ot3.C117896h.m166297b(r10)
            r1 = 1
            java.lang.String r2 = "Soter.SoterCoreBeforeTreble"
            r3 = 0
            if (r0 == 0) goto L_0x001a
            java.lang.Object[] r10 = new java.lang.Object[r3]
            java.lang.String r0 = "soter: auth key name is null or nil. abort."
            ot3.C21881e.m25083b(r2, r0, r10)
            ot3.g r10 = new ot3.g
            java.lang.String r0 = "no authKeyName"
            r10.<init>(r1, r0)
            return r10
        L_0x001a:
            boolean r0 = r9.mo35110m()
            if (r0 == 0) goto L_0x0103
            r0 = 6
            boolean r4 = r9.mo35104g()     // Catch:{ Exception -> 0x00dd, OutOfMemoryError -> 0x00d2 }
            if (r4 != 0) goto L_0x0030
            ot3.g r10 = new ot3.g     // Catch:{ Exception -> 0x00dd, OutOfMemoryError -> 0x00d2 }
            r1 = 3
            java.lang.String r4 = "app secure key not exist"
            r10.<init>(r1, r4)     // Catch:{ Exception -> 0x00dd, OutOfMemoryError -> 0x00d2 }
            return r10
        L_0x0030:
            java.lang.String r4 = r9.f62268b     // Catch:{ Exception -> 0x00dd, OutOfMemoryError -> 0x00d2 }
            java.security.KeyStore r4 = java.security.KeyStore.getInstance(r4)     // Catch:{ Exception -> 0x00dd, OutOfMemoryError -> 0x00d2 }
            r5 = 0
            r4.load(r5)     // Catch:{ Exception -> 0x00dd, OutOfMemoryError -> 0x00d2 }
            java.lang.String r4 = "RSA"
            java.lang.String r5 = r9.f62268b     // Catch:{ Exception -> 0x00dd, OutOfMemoryError -> 0x00d2 }
            java.security.KeyPairGenerator r4 = java.security.KeyPairGenerator.getInstance(r4, r5)     // Catch:{ Exception -> 0x00dd, OutOfMemoryError -> 0x00d2 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ac, OutOfMemoryError -> 0x00d2 }
            r5.<init>()     // Catch:{ Exception -> 0x00ac, OutOfMemoryError -> 0x00d2 }
            r5.append(r10)     // Catch:{ Exception -> 0x00ac, OutOfMemoryError -> 0x00d2 }
            java.lang.String r10 = ".addcounter.auto_signed_when_get_pubkey(%s).secmsg_and_counter_signed_when_sign"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x00ac, OutOfMemoryError -> 0x00d2 }
            ot3.f r7 = ot3.C21884f.m25094a()     // Catch:{ Exception -> 0x00ac, OutOfMemoryError -> 0x00d2 }
            java.lang.String r7 = r7.f61885a     // Catch:{ Exception -> 0x00ac, OutOfMemoryError -> 0x00d2 }
            r6[r3] = r7     // Catch:{ Exception -> 0x00ac, OutOfMemoryError -> 0x00d2 }
            java.lang.String r10 = java.lang.String.format(r10, r6)     // Catch:{ Exception -> 0x00ac, OutOfMemoryError -> 0x00d2 }
            r5.append(r10)     // Catch:{ Exception -> 0x00ac, OutOfMemoryError -> 0x00d2 }
            java.lang.String r10 = r5.toString()     // Catch:{ Exception -> 0x00ac, OutOfMemoryError -> 0x00d2 }
            r5 = 4
            nt3.a r10 = nt3.C117635a.m165916b(r10, r5)     // Catch:{ Exception -> 0x00ac, OutOfMemoryError -> 0x00d2 }
            java.lang.String r5 = "SHA-256"
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch:{ Exception -> 0x00ac, OutOfMemoryError -> 0x00d2 }
            nt3.a r10 = r10.mo182363c(r5)     // Catch:{ Exception -> 0x00ac, OutOfMemoryError -> 0x00d2 }
            nt3.a r10 = r10.mo182365e(r1)     // Catch:{ Exception -> 0x00ac, OutOfMemoryError -> 0x00d2 }
            java.lang.String r5 = "PSS"
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch:{ Exception -> 0x00ac, OutOfMemoryError -> 0x00d2 }
            nt3.a r10 = r10.mo182364d(r5)     // Catch:{ Exception -> 0x00ac, OutOfMemoryError -> 0x00d2 }
            java.security.spec.AlgorithmParameterSpec r10 = r10.mo182362a()     // Catch:{ Exception -> 0x00ac, OutOfMemoryError -> 0x00d2 }
            r4.initialize(r10)     // Catch:{ Exception -> 0x00ac, OutOfMemoryError -> 0x00d2 }
            long r5 = java.lang.System.nanoTime()     // Catch:{ Exception -> 0x00ac, OutOfMemoryError -> 0x00d2 }
            r4.generateKeyPair()     // Catch:{ Exception -> 0x00ac, OutOfMemoryError -> 0x00d2 }
            long r7 = java.lang.System.nanoTime()     // Catch:{ Exception -> 0x00ac, OutOfMemoryError -> 0x00d2 }
            long r7 = r7 - r5
            r4 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r4
            long r7 = r7 / r4
            java.lang.String r10 = "soter: generate successfully, cost: %d ms"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x00ac, OutOfMemoryError -> 0x00d2 }
            java.lang.Long r4 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x00ac, OutOfMemoryError -> 0x00d2 }
            r1[r3] = r4     // Catch:{ Exception -> 0x00ac, OutOfMemoryError -> 0x00d2 }
            ot3.C21881e.m25084c(r2, r10, r1)     // Catch:{ Exception -> 0x00ac, OutOfMemoryError -> 0x00d2 }
            ot3.C21886i.m25097b()     // Catch:{ Exception -> 0x00ac, OutOfMemoryError -> 0x00d2 }
            ot3.g r10 = new ot3.g     // Catch:{ Exception -> 0x00ac, OutOfMemoryError -> 0x00d2 }
            r10.<init>(r3)     // Catch:{ Exception -> 0x00ac, OutOfMemoryError -> 0x00d2 }
            return r10
        L_0x00ac:
            r10 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00dd, OutOfMemoryError -> 0x00d2 }
            r1.<init>()     // Catch:{ Exception -> 0x00dd, OutOfMemoryError -> 0x00d2 }
            java.lang.String r4 = "soter: cause exception. maybe reflection exception: "
            r1.append(r4)     // Catch:{ Exception -> 0x00dd, OutOfMemoryError -> 0x00d2 }
            java.lang.String r4 = r10.toString()     // Catch:{ Exception -> 0x00dd, OutOfMemoryError -> 0x00d2 }
            r1.append(r4)     // Catch:{ Exception -> 0x00dd, OutOfMemoryError -> 0x00d2 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00dd, OutOfMemoryError -> 0x00d2 }
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00dd, OutOfMemoryError -> 0x00d2 }
            ot3.C21881e.m25083b(r2, r1, r4)     // Catch:{ Exception -> 0x00dd, OutOfMemoryError -> 0x00d2 }
            ot3.g r1 = new ot3.g     // Catch:{ Exception -> 0x00dd, OutOfMemoryError -> 0x00d2 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x00dd, OutOfMemoryError -> 0x00d2 }
            r1.<init>(r0, r10)     // Catch:{ Exception -> 0x00dd, OutOfMemoryError -> 0x00d2 }
            return r1
        L_0x00d2:
            r10 = move-exception
            java.lang.String r0 = "soter: out of memory when generate AuthKey!! maybe no attk inside"
            ot3.C21881e.m25085d(r2, r10, r0)
            ot3.C21886i.m25096a()
            goto L_0x010b
        L_0x00dd:
            r10 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "soter: generate auth key failed: "
            r1.append(r4)
            java.lang.String r4 = r10.toString()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            ot3.C21881e.m25083b(r2, r1, r3)
            ot3.g r1 = new ot3.g
            java.lang.String r10 = r10.toString()
            r1.<init>(r0, r10)
            return r1
        L_0x0103:
            java.lang.Object[] r10 = new java.lang.Object[r3]
            java.lang.String r0 = "soter: not support soter"
            ot3.C21881e.m25083b(r2, r0, r10)
        L_0x010b:
            ot3.g r10 = new ot3.g
            r0 = 2
            r10.<init>(r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: pt3.C22006c.mo35101c(java.lang.String):ot3.g");
    }

    /* renamed from: d */
    public C117897l mo35098d() {
        C21881e.m25084c("Soter.SoterCoreBeforeTreble", "soter: start get app global secure key pub", new Object[0]);
        if (mo35110m()) {
            try {
                KeyStore instance = KeyStore.getInstance(this.f62268b);
                instance.load((KeyStore.LoadStoreParameter) null);
                try {
                    Key key = instance.getKey(C21884f.m25094a().f61885a, "from_soter_ui".toCharArray());
                    if (key != null) {
                        C21886i.m25097b();
                        return C22005b.m25358q(key.getEncoded());
                    }
                    C21881e.m25083b("Soter.SoterCoreBeforeTreble", "soter: key can not be retrieved", new Object[0]);
                    return null;
                } catch (ClassCastException e) {
                    C21881e.m25083b("Soter.SoterCoreBeforeTreble", "soter: cast error: " + e.toString(), new Object[0]);
                    return null;
                }
            } catch (Exception e2) {
                C21881e.m25085d("Soter.SoterCoreBeforeTreble", e2, "soter: error when get ask");
            } catch (OutOfMemoryError e3) {
                C21881e.m25085d("Soter.SoterCoreBeforeTreble", e3, "soter: out of memory when getting ask!! maybe no attk inside");
                C21886i.m25096a();
            }
        } else {
            C21881e.m25083b("Soter.SoterCoreBeforeTreble", "soter: not support soter", new Object[0]);
            return null;
        }
    }

    /* renamed from: e */
    public Signature mo35102e(String str) {
        if (C117896h.m166297b(str)) {
            C21881e.m25083b("Soter.SoterCoreBeforeTreble", "soter: auth key name is null or nil. abort.", new Object[0]);
            return null;
        } else if (mo35110m()) {
            try {
                C21886i.m25097b();
                return mo35099u(str);
            } catch (InvalidKeyException | UnrecoverableEntryException unused) {
                C21881e.m25083b("Soter.SoterCoreBeforeTreble", "soter: key invalid. Advice remove the key", new Object[0]);
                return null;
            } catch (Exception e) {
                C21881e.m25083b("Soter.SoterCoreBeforeTreble", "soter: exception when getSignatureResult: " + e.toString(), new Object[0]);
                C21881e.m25085d("Soter.SoterCoreBeforeTreble", e, "soter: exception when getSignatureResult");
                return null;
            } catch (OutOfMemoryError e2) {
                C21881e.m25085d("Soter.SoterCoreBeforeTreble", e2, "soter: out of memory when getAuthInitAndSign!! maybe no attk inside");
                C21886i.m25096a();
                return null;
            }
        } else {
            C21881e.m25083b("Soter.SoterCoreBeforeTreble", "soter: not support soter" + this.f62268b, new Object[0]);
            return null;
        }
    }

    /* renamed from: f */
    public C117897l mo35103f(String str) {
        if (C117896h.m166297b(str)) {
            C21881e.m25083b("Soter.SoterCoreBeforeTreble", "soter: auth key name is null or nil. abort.", new Object[0]);
            return null;
        } else if (mo35110m()) {
            try {
                KeyStore instance = KeyStore.getInstance(this.f62268b);
                instance.load((KeyStore.LoadStoreParameter) null);
                try {
                    Key key = instance.getKey(str, "from_soter_ui".toCharArray());
                    C21886i.m25097b();
                    if (key != null) {
                        return C22005b.m25358q(key.getEncoded());
                    }
                    C21881e.m25083b("Soter.SoterCoreBeforeTreble", "soter: key can not be retrieved", new Object[0]);
                    return null;
                } catch (ClassCastException e) {
                    C21881e.m25083b("Soter.SoterCoreBeforeTreble", "soter: cast error: " + e.toString(), new Object[0]);
                    return null;
                }
            } catch (Exception e2) {
                C21881e.m25085d("Soter.SoterCoreBeforeTreble", e2, "soter: error in get auth key model");
            } catch (OutOfMemoryError e3) {
                C21881e.m25085d("Soter.SoterCoreBeforeTreble", e3, "soter: out of memory when getAuthKeyModel!! maybe no attk inside");
                C21886i.m25096a();
            }
        } else {
            C21881e.m25083b("Soter.SoterCoreBeforeTreble", "soter: not support soter " + this.f62268b, new Object[0]);
            return null;
        }
    }

    /* renamed from: g */
    public boolean mo35104g() {
        try {
            KeyStore instance = KeyStore.getInstance(this.f62268b);
            instance.load((KeyStore.LoadStoreParameter) null);
            return instance.getCertificate(C21884f.m25094a().f61885a) != null;
        } catch (Exception e) {
            C21881e.m25083b("Soter.SoterCoreBeforeTreble", "soter: hasAppGlobalSecureKey exception: " + e.toString(), new Object[0]);
            return false;
        }
    }

    /* renamed from: h */
    public boolean mo35105h(String str) {
        if (C117896h.m166297b(str)) {
            C21881e.m25083b("Soter.SoterCoreBeforeTreble", "soter: authkey name not correct", new Object[0]);
            return false;
        }
        try {
            KeyStore instance = KeyStore.getInstance(this.f62268b);
            instance.load((KeyStore.LoadStoreParameter) null);
            return instance.getCertificate(str) != null;
        } catch (Exception e) {
            C21881e.m25083b("Soter.SoterCoreBeforeTreble", "soter: hasAppGlobalSecureKey exception: " + e.toString(), new Object[0]);
            return false;
        }
    }

    /* renamed from: i */
    public SoterSessionResult mo35106i(String str, String str2) {
        return null;
    }

    /* renamed from: j */
    public boolean mo35107j(Context context) {
        m25378v();
        return true;
    }

    /* renamed from: k */
    public boolean mo35108k() {
        return mo35104g() && mo35098d() != null;
    }

    /* renamed from: l */
    public boolean mo35109l(String str, boolean z) {
        C21881e.m25084c("Soter.SoterCoreBeforeTreble", String.format("soter: checking key valid: auth key name: %s, autoDelIfNotValid: %b ", new Object[]{str, Boolean.valueOf(z)}), new Object[0]);
        if (C117896h.m166297b(str)) {
            C21881e.m25083b("Soter.SoterCoreBeforeTreble", "soter: checking key valid: authkey name not correct", new Object[0]);
            return false;
        }
        try {
            mo35099u(str);
            C21881e.m25084c("Soter.SoterCoreBeforeTreble", "soter: key valid", new Object[0]);
            C21886i.m25097b();
            return true;
        } catch (InvalidKeyException | UnrecoverableEntryException unused) {
            C21881e.m25083b("Soter.SoterCoreBeforeTreble", "soter: key invalid.", new Object[0]);
            if (z) {
                mo35113p(str, false);
            }
            return false;
        } catch (Exception e) {
            C21881e.m25083b("Soter.SoterCoreBeforeTreble", "soter: occurs other exceptions: %s", e.toString());
            C21881e.m25085d("Soter.SoterCoreBeforeTreble", e, "soter: occurs other exceptions");
            return false;
        } catch (OutOfMemoryError e2) {
            C21881e.m25085d("Soter.SoterCoreBeforeTreble", e2, "soter: out of memory when isAuthKeyValid!! maybe no attk inside");
            C21886i.m25096a();
            return false;
        }
    }

    /* renamed from: m */
    public boolean mo35110m() {
        if (!f62267c) {
            m25378v();
        }
        if (C21886i.f61888a.mo34912a()) {
            C21881e.m25087f("Soter.SoterCoreBeforeTreble", "hy: the device has already triggered OOM. mark as not support", new Object[0]);
            return false;
        }
        Provider[] providers = Security.getProviders();
        if (providers == null) {
            C21881e.m25083b("Soter.SoterCoreBeforeTreble", "soter: no provider supported", new Object[0]);
            return false;
        }
        int length = providers.length;
        int i = 0;
        while (i < length) {
            String name = providers[i].getName();
            if (name == null || !name.startsWith("SoterKeyStore")) {
                i++;
            } else {
                C21881e.m25084c("Soter.SoterCoreBeforeTreble", "soter: found soter provider", new Object[0]);
                return true;
            }
        }
        C21881e.m25084c("Soter.SoterCoreBeforeTreble", "soter: soter provider not found", new Object[0]);
        return false;
    }

    /* renamed from: o */
    public C21885g mo35112o() {
        C21881e.m25084c("Soter.SoterCoreBeforeTreble", "soter: start remove app global secure key", new Object[0]);
        if (mo35110m()) {
            try {
                KeyStore instance = KeyStore.getInstance(this.f62268b);
                instance.load((KeyStore.LoadStoreParameter) null);
                instance.deleteEntry(C21884f.m25094a().f61885a);
                return new C21885g(0);
            } catch (Exception e) {
                C21881e.m25083b("Soter.SoterCoreBeforeTreble", "soter: removeAppGlobalSecureKey " + e.toString(), new Object[0]);
                return new C21885g(5, e.toString());
            }
        } else {
            C21881e.m25083b("Soter.SoterCoreBeforeTreble", "soter: not support soter", new Object[0]);
            return new C21885g(2);
        }
    }

    /* renamed from: p */
    public C21885g mo35113p(String str, boolean z) {
        if (C117896h.m166297b(str)) {
            C21881e.m25083b("Soter.SoterCoreBeforeTreble", "soter: auth key name is null or nil. abort.", new Object[0]);
            return new C21885g(1, "no authKeyName");
        }
        C21881e.m25084c("Soter.SoterCoreBeforeTreble", "soter: start remove key: " + str, new Object[0]);
        if (mo35110m()) {
            try {
                KeyStore instance = KeyStore.getInstance(this.f62268b);
                instance.load((KeyStore.LoadStoreParameter) null);
                instance.deleteEntry(str);
                if (z) {
                    C21881e.m25084c("Soter.SoterCoreBeforeTreble", "soter: auto delete ask", new Object[0]);
                    if (mo35104g()) {
                        mo35112o();
                    }
                }
                return new C21885g(0);
            } catch (Exception e) {
                C21881e.m25083b("Soter.SoterCoreBeforeTreble", "soter: removeAuthKey " + e.toString(), new Object[0]);
                return new C21885g(7, e.toString());
            }
        } else {
            C21881e.m25083b("Soter.SoterCoreBeforeTreble", "soter: not support soter", new Object[0]);
            return new C21885g(2);
        }
    }

    /* renamed from: u */
    public Signature mo35099u(String str) {
        if (C117896h.m166297b(str)) {
            C21881e.m25083b("Soter.SoterCoreBeforeTreble", "soter: auth key name is null or nil. abort.", new Object[0]);
            return null;
        }
        Signature instance = Signature.getInstance("SHA256withRSA/PSS", "AndroidKeyStoreBCWorkaround");
        KeyStore instance2 = KeyStore.getInstance(this.f62268b);
        instance2.load((KeyStore.LoadStoreParameter) null);
        KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) instance2.getEntry(str, (KeyStore.ProtectionParameter) null);
        if (privateKeyEntry != null) {
            instance.initSign(privateKeyEntry.getPrivateKey());
            return instance;
        }
        C21881e.m25083b("Soter.SoterCoreBeforeTreble", "soter: entry not exists", new Object[0]);
        return null;
    }
}
