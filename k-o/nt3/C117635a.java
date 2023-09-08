package nt3;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Date;
import javax.security.auth.x500.X500Principal;
import lt3.C21460a;
import ot3.C21881e;

/* renamed from: nt3.a */
public abstract class C117635a {

    /* renamed from: nt3.a$a */
    public static class C117636a extends C117635a {
        public C117636a(String str, int i) {
            super(str, i);
        }

        /* renamed from: a */
        public AlgorithmParameterSpec mo182362a() {
            return null;
        }

        /* renamed from: c */
        public C117635a mo182363c(String... strArr) {
            return null;
        }

        /* renamed from: d */
        public C117635a mo182364d(String... strArr) {
            return null;
        }

        /* renamed from: e */
        public C117635a mo182365e(boolean z) {
            return null;
        }
    }

    /* renamed from: nt3.a$b */
    public static class C117637b extends C117635a {

        /* renamed from: a */
        public KeyGenParameterSpec.Builder f351887a = null;

        public C117637b(String str, int i) {
            super(str, i);
            this.f351887a = new KeyGenParameterSpec.Builder(str, i);
        }

        /* renamed from: a */
        public AlgorithmParameterSpec mo182362a() {
            return this.f351887a.build();
        }

        /* renamed from: c */
        public C117635a mo182363c(String... strArr) {
            this.f351887a.setDigests(strArr);
            return this;
        }

        /* renamed from: d */
        public C117635a mo182364d(String... strArr) {
            this.f351887a.setSignaturePaddings(strArr);
            return this;
        }

        /* renamed from: e */
        public C117635a mo182365e(boolean z) {
            this.f351887a.setUserAuthenticationRequired(z);
            return this;
        }
    }

    /* renamed from: nt3.a$c */
    public static class C117638c extends C117635a {

        /* renamed from: a */
        public final String f351888a;

        /* renamed from: b */
        public int f351889b;

        /* renamed from: c */
        public String[] f351890c;

        /* renamed from: d */
        public String[] f351891d;

        /* renamed from: e */
        public boolean f351892e;

        public C117638c(String str, int i) {
            super(str, i);
            if (str == null) {
                throw new NullPointerException("keystoreAlias == null");
            } else if (!str.isEmpty()) {
                this.f351888a = str;
                this.f351889b = i;
            } else {
                throw new IllegalArgumentException("keystoreAlias must not be empty");
            }
        }

        /* renamed from: a */
        public AlgorithmParameterSpec mo182362a() {
            Class<String[]> cls = String[].class;
            Class<?> cls2 = Class.forName("android.security.keystore.KeyGenParameterSpec");
            Class cls3 = Integer.TYPE;
            Class cls4 = Boolean.TYPE;
            return (AlgorithmParameterSpec) cls2.getConstructor(new Class[]{String.class, cls3, AlgorithmParameterSpec.class, X500Principal.class, BigInteger.class, Date.class, Date.class, Date.class, Date.class, Date.class, cls3, cls, cls, cls, cls, cls4, cls4, cls3}).newInstance(new Object[]{this.f351888a, -1, null, null, null, null, null, null, null, null, Integer.valueOf(this.f351889b), this.f351890c, null, this.f351891d, null, Boolean.TRUE, Boolean.valueOf(this.f351892e), -1});
        }

        /* renamed from: c */
        public C117635a mo182363c(String... strArr) {
            if (strArr != null && strArr.length > 0) {
                strArr = (String[]) strArr.clone();
            }
            this.f351890c = strArr;
            return this;
        }

        /* renamed from: d */
        public C117635a mo182364d(String... strArr) {
            if (strArr != null && strArr.length > 0) {
                strArr = (String[]) strArr.clone();
            }
            this.f351891d = strArr;
            return this;
        }

        /* renamed from: e */
        public C117635a mo182365e(boolean z) {
            this.f351892e = z;
            return this;
        }
    }

    public C117635a(String str, int i) {
    }

    /* renamed from: b */
    public static C117635a m165916b(String str, int i) {
        if (C21460a.m24278l()) {
            return Build.VERSION.SDK_INT >= 23 ? new C117637b(str, i) : new C117638c(str, i);
        }
        C21881e.m25083b("Soter.KeyGenParameterSpecCompatBuilder", "soter: not support soter. return dummy", new Object[0]);
        return new C117636a(str, i);
    }

    /* renamed from: a */
    public abstract AlgorithmParameterSpec mo182362a();

    /* renamed from: c */
    public abstract C117635a mo182363c(String... strArr);

    /* renamed from: d */
    public abstract C117635a mo182364d(String... strArr);

    /* renamed from: e */
    public abstract C117635a mo182365e(boolean z);
}
