package mt3;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import mt3.C21527b;
import mt3.C21535d;
import ot3.C21881e;

/* renamed from: mt3.c */
public class C21534c extends FingerprintManager.AuthenticationCallback {

    /* renamed from: a */
    public final /* synthetic */ C21535d.C21536a f60993a;

    public C21534c(C21535d.C21536a aVar) {
        this.f60993a = aVar;
    }

    public void onAuthenticationError(int i, CharSequence charSequence) {
        C21881e.m25082a("Soter.FingerprintManagerCompatApi23", "hy: lowest level return onAuthenticationError", new Object[0]);
        this.f60993a.mo33735a(i, charSequence);
    }

    public void onAuthenticationFailed() {
        C21881e.m25082a("Soter.FingerprintManagerCompatApi23", "hy: lowest level return onAuthenticationFailed", new Object[0]);
        C21526a aVar = (C21526a) this.f60993a;
        aVar.getClass();
        C21881e.m25082a("Soter.FingerprintManagerCompat", "soter: basic onAuthenticationFailed", new Object[0]);
        if (!aVar.f60985a && !C21527b.C21528a.m24397c(aVar, aVar.f60987c)) {
            if (!(Build.VERSION.SDK_INT >= 23)) {
                Context context = aVar.f60987c;
                C21538e.m24417d(context, Integer.valueOf(Integer.valueOf(C21538e.m24414a(context)).intValue() + 1).intValue());
                if (!C21538e.m24415b(aVar.f60987c)) {
                    C21881e.m25087f("Soter.FingerprintManagerCompat", "soter: too many fail trials", new Object[0]);
                    Context context2 = aVar.f60987c;
                    C21538e.m24417d(context2, 6);
                    C21538e.m24418e(context2, System.currentTimeMillis());
                    C21881e.m25087f("Soter.FingerprintManagerCompat", "soter: too many fail fingerprint callback. inform it.", new Object[0]);
                    aVar.mo33735a(10308, "Too many failed times");
                    return;
                }
            }
            aVar.f60986b.mo33741c();
        }
    }

    public void onAuthenticationHelp(int i, CharSequence charSequence) {
        C21881e.m25082a("Soter.FingerprintManagerCompatApi23", "hy: lowest level return onAuthenticationHelp", new Object[0]);
        C21526a aVar = (C21526a) this.f60993a;
        aVar.getClass();
        C21881e.m25082a("Soter.FingerprintManagerCompat", "soter: basic onAuthenticationHelp", new Object[0]);
        if (!aVar.f60985a && !C21527b.C21528a.m24397c(aVar, aVar.f60987c)) {
            aVar.f60986b.mo33742d(i, charSequence);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager.AuthenticationResult r9) {
        /*
            r8 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "Soter.FingerprintManagerCompatApi23"
            java.lang.String r3 = "hy: lowest level return onAuthenticationSucceeded"
            ot3.C21881e.m25082a(r2, r3, r1)
            mt3.d$a r1 = r8.f60993a
            android.hardware.fingerprint.FingerprintManager$CryptoObject r9 = r9.getCryptoObject()
            r2 = 0
            if (r9 != 0) goto L_0x0014
            goto L_0x0044
        L_0x0014:
            javax.crypto.Cipher r3 = r9.getCipher()
            if (r3 == 0) goto L_0x0024
            mt3.d$b r3 = new mt3.d$b
            javax.crypto.Cipher r9 = r9.getCipher()
            r3.<init>((javax.crypto.Cipher) r9)
            goto L_0x0045
        L_0x0024:
            java.security.Signature r3 = r9.getSignature()
            if (r3 == 0) goto L_0x0034
            mt3.d$b r3 = new mt3.d$b
            java.security.Signature r9 = r9.getSignature()
            r3.<init>((java.security.Signature) r9)
            goto L_0x0045
        L_0x0034:
            javax.crypto.Mac r3 = r9.getMac()
            if (r3 == 0) goto L_0x0044
            mt3.d$b r3 = new mt3.d$b
            javax.crypto.Mac r9 = r9.getMac()
            r3.<init>((javax.crypto.Mac) r9)
            goto L_0x0045
        L_0x0044:
            r3 = r2
        L_0x0045:
            mt3.a r1 = (mt3.C21526a) r1
            r1.getClass()
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.String r4 = "Soter.FingerprintManagerCompat"
            java.lang.String r5 = "soter: basic onAuthenticationSucceeded"
            ot3.C21881e.m25082a(r4, r5, r9)
            boolean r9 = r1.f60985a
            if (r9 == 0) goto L_0x0059
            goto L_0x00a3
        L_0x0059:
            android.content.Context r9 = r1.f60987c
            boolean r9 = mt3.C21527b.C21528a.m24397c(r1, r9)
            if (r9 != 0) goto L_0x00a3
            int r9 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            r5 = 1
            if (r9 < r4) goto L_0x006a
            r9 = 1
            goto L_0x006b
        L_0x006a:
            r9 = 0
        L_0x006b:
            if (r9 != 0) goto L_0x0077
            android.content.Context r9 = r1.f60987c
            r6 = -1
            mt3.C21538e.m24418e(r9, r6)
            mt3.C21538e.m24417d(r9, r0)
        L_0x0077:
            r1.f60985a = r5
            mt3.b$b r9 = r1.f60986b
            mt3.b$c r0 = new mt3.b$c
            if (r3 != 0) goto L_0x0080
            goto L_0x009d
        L_0x0080:
            javax.crypto.Cipher r1 = r3.f60995b
            if (r1 == 0) goto L_0x008a
            mt3.b$d r2 = new mt3.b$d
            r2.<init>((javax.crypto.Cipher) r1)
            goto L_0x009d
        L_0x008a:
            java.security.Signature r1 = r3.f60994a
            if (r1 == 0) goto L_0x0094
            mt3.b$d r2 = new mt3.b$d
            r2.<init>((java.security.Signature) r1)
            goto L_0x009d
        L_0x0094:
            javax.crypto.Mac r1 = r3.f60996c
            if (r1 == 0) goto L_0x009d
            mt3.b$d r2 = new mt3.b$d
            r2.<init>((javax.crypto.Mac) r1)
        L_0x009d:
            r0.<init>(r2)
            r9.mo33743e(r0)
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mt3.C21534c.onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager$AuthenticationResult):void");
    }
}
