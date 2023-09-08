package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.internal.C113905ky;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.tencent.mapsdk.internal.lb */
public final class C113925lb {

    /* renamed from: a */
    private static final char[] f340768a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    private final C104555ku<String, String> f340769b = new C104555ku<>(1000);

    /* renamed from: c */
    private final C113905ky.C113916g<C113905ky.C113918i<MessageDigest>> f340770c = C113905ky.m157771a(10, new C113905ky.C113914e<C113905ky.C113918i<MessageDigest>>() {
        /* renamed from: b */
        private static C113905ky.C113918i<MessageDigest> m157810b() {
            try {
                return new C113905ky.C113918i<>(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo172330a() {
            return m157810b();
        }
    });

    /* renamed from: a */
    public final String mo172345a(String str) {
        String b;
        synchronized (this.f340769b) {
            b = this.f340769b.mo147873b(str);
        }
        if (b == null) {
            C113905ky.C113918i a = this.f340770c.mo172343a();
            try {
                ((MessageDigest) a.f340762a).update(str.getBytes());
                byte[] digest = ((MessageDigest) a.f340762a).digest();
                if (digest == null || digest.length == 0) {
                    b = null;
                } else {
                    char[] cArr = new char[(digest.length * 2)];
                    for (int i = 0; i < digest.length; i++) {
                        byte b2 = digest[i];
                        int i2 = i * 2;
                        char[] cArr2 = f340768a;
                        cArr[i2 + 1] = cArr2[b2 & 15];
                        cArr[i2 + 0] = cArr2[((byte) (b2 >>> 4)) & 15];
                    }
                    b = new String(cArr);
                }
            } finally {
                this.f340770c.mo172344a(a);
            }
        }
        synchronized (this.f340769b) {
            this.f340769b.mo147869a(str, b);
        }
        return b;
    }

    /* renamed from: a */
    private static String m157808a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = f340768a;
            cArr[i2 + 1] = cArr2[b & 15];
            cArr[i2 + 0] = cArr2[((byte) (b >>> 4)) & 15];
        }
        return new String(cArr);
    }
}
