package mt3;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import ot3.C117896h;
import ot3.C21881e;

@Deprecated
/* renamed from: mt3.d */
public final class C21535d {

    /* renamed from: mt3.d$a */
    public static abstract class C21536a {
        /* renamed from: a */
        public abstract void mo33735a(int i, CharSequence charSequence);
    }

    /* renamed from: a */
    public static void m24409a(Context context, C21537b bVar, int i, Object obj, C21536a aVar, Handler handler) {
        if (m24410b(context, "android.permission.USE_FINGERPRINT") != 0) {
            C21881e.m25083b("Soter.FingerprintManagerCompatApi23", "soter: permission check failed: authenticate", new Object[0]);
            return;
        }
        try {
            FingerprintManager fingerprintManager = (FingerprintManager) context.getSystemService(FingerprintManagerProxy.FINGERPRINT_SERVICE);
            if (fingerprintManager != null) {
                FingerprintManager.CryptoObject cryptoObject = null;
                if (bVar != null) {
                    if (bVar.f60995b != null) {
                        cryptoObject = new FingerprintManager.CryptoObject(bVar.f60995b);
                    } else if (bVar.f60994a != null) {
                        cryptoObject = new FingerprintManager.CryptoObject(bVar.f60994a);
                    } else if (bVar.f60996c != null) {
                        cryptoObject = new FingerprintManager.CryptoObject(bVar.f60996c);
                    }
                }
                fingerprintManager.authenticate(cryptoObject, (CancellationSignal) obj, i, new C21534c(aVar), handler);
                return;
            }
            C21881e.m25083b("Soter.FingerprintManagerCompatApi23", "soter: fingerprint manager is null in authenticate! Should never happen", new Object[0]);
        } catch (SecurityException unused) {
            C21881e.m25083b("Soter.FingerprintManagerCompatApi23", "soter: triggered SecurityException in authenticate! Make sure you declared USE_FINGERPRINT in AndroidManifest.xml", new Object[0]);
        }
    }

    /* renamed from: b */
    public static int m24410b(Context context, String str) {
        if (context == null) {
            C21881e.m25083b("Soter.FingerprintManagerCompatApi23", "soter: check self permission: context is null", new Object[0]);
            return -1;
        } else if (C117896h.m166297b(str)) {
            C21881e.m25083b("Soter.FingerprintManagerCompatApi23", "soter: requested permission is null or nil", new Object[0]);
            return -1;
        } else if (Build.VERSION.SDK_INT >= 23) {
            return context.checkSelfPermission(str);
        } else {
            C21881e.m25082a("Soter.FingerprintManagerCompatApi23", "soter: below 23. directly return.", new Object[0]);
            return 0;
        }
    }

    /* renamed from: c */
    public static boolean m24411c(Context context) {
        if (m24410b(context, "android.permission.USE_FINGERPRINT") != 0) {
            C21881e.m25083b("Soter.FingerprintManagerCompatApi23", "soter: permission check failed: hasEnrolledFingerprints", new Object[0]);
            return false;
        }
        try {
            FingerprintManager fingerprintManager = (FingerprintManager) context.getSystemService(FingerprintManagerProxy.FINGERPRINT_SERVICE);
            if (fingerprintManager != null) {
                return fingerprintManager.hasEnrolledFingerprints();
            }
            C21881e.m25083b("Soter.FingerprintManagerCompatApi23", "soter: fingerprint manager is null in hasEnrolledFingerprints! Should never happen", new Object[0]);
            return false;
        } catch (SecurityException unused) {
            C21881e.m25083b("Soter.FingerprintManagerCompatApi23", "soter: triggered SecurityException in hasEnrolledFingerprints! Make sure you declared USE_FINGERPRINT in AndroidManifest.xml", new Object[0]);
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m24412d(Context context) {
        if (m24410b(context, "android.permission.USE_FINGERPRINT") != 0) {
            C21881e.m25083b("Soter.FingerprintManagerCompatApi23", "soter: permission check failed: isHardwareDetected", new Object[0]);
            return false;
        }
        try {
            FingerprintManager fingerprintManager = (FingerprintManager) context.getSystemService(FingerprintManagerProxy.FINGERPRINT_SERVICE);
            if (fingerprintManager != null) {
                return fingerprintManager.isHardwareDetected();
            }
            C21881e.m25083b("Soter.FingerprintManagerCompatApi23", "soter: fingerprint manager is null in isHardwareDetected! Should never happen", new Object[0]);
            return false;
        } catch (SecurityException unused) {
            C21881e.m25083b("Soter.FingerprintManagerCompatApi23", "soter: triggered SecurityException in isHardwareDetected! Make sure you declared USE_FINGERPRINT in AndroidManifest.xml", new Object[0]);
            return false;
        }
    }

    /* renamed from: mt3.d$b */
    public static class C21537b {

        /* renamed from: a */
        public final Signature f60994a;

        /* renamed from: b */
        public final Cipher f60995b;

        /* renamed from: c */
        public final Mac f60996c;

        public C21537b(Signature signature) {
            this.f60994a = signature;
            this.f60995b = null;
            this.f60996c = null;
        }

        public C21537b(Cipher cipher) {
            this.f60995b = cipher;
            this.f60994a = null;
            this.f60996c = null;
        }

        public C21537b(Mac mac) {
            this.f60996c = mac;
            this.f60995b = null;
            this.f60994a = null;
        }
    }
}
