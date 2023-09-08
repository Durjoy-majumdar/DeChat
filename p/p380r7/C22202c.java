package p380r7;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import p295b8.C16762b;
import p295b8.C16772f;
import p300c8.C79946g;
import p300c8.C79950j;
import p333e8.C20551y;
import p370p7.C21961u;
import p373q7.C22074a;
import p373q7.C22075b;
import p381s7.C22300a;
import p381s7.C22305e;

/* renamed from: r7.c */
public class C22202c {

    /* renamed from: a */
    public final C79946g f62845a;

    /* renamed from: b */
    public final C79946g f62846b;

    /* renamed from: c */
    public final C22215k f62847c;

    /* renamed from: d */
    public final C22300a.C22301a[] f62848d;

    /* renamed from: e */
    public final C22305e f62849e;

    /* renamed from: f */
    public final C21961u f62850f;

    /* renamed from: g */
    public final List<Format> f62851g;

    /* renamed from: h */
    public boolean f62852h;

    /* renamed from: i */
    public byte[] f62853i;

    /* renamed from: j */
    public IOException f62854j;

    /* renamed from: k */
    public C22300a.C22301a f62855k;

    /* renamed from: l */
    public boolean f62856l;

    /* renamed from: m */
    public Uri f62857m;

    /* renamed from: n */
    public byte[] f62858n;

    /* renamed from: o */
    public String f62859o;

    /* renamed from: p */
    public byte[] f62860p;

    /* renamed from: q */
    public C16772f f62861q;

    /* renamed from: r7.c$a */
    public static final class C22203a extends C22075b {

        /* renamed from: l */
        public final String f62862l;

        /* renamed from: m */
        public byte[] f62863m;

        public C22203a(C79946g gVar, C79950j jVar, Format format, int i, Object obj, byte[] bArr, String str) {
            super(gVar, jVar, 3, format, i, obj, bArr);
            this.f62862l = str;
        }
    }

    /* renamed from: r7.c$b */
    public static final class C22204b {

        /* renamed from: a */
        public C22074a f62864a = null;

        /* renamed from: b */
        public boolean f62865b = false;

        /* renamed from: c */
        public C22300a.C22301a f62866c = null;
    }

    /* renamed from: r7.c$c */
    public static final class C22205c extends C16762b {

        /* renamed from: g */
        public int f62867g;

        public C22205c(C21961u uVar, int[] iArr) {
            super(uVar, iArr);
            int i = 0;
            Format format = uVar.f62174b[0];
            while (true) {
                if (i >= this.f45303b) {
                    i = -1;
                    break;
                } else if (this.f45305d[i] == format) {
                    break;
                } else {
                    i++;
                }
            }
            this.f62867g = i;
        }

        /* renamed from: g */
        public void mo17782g(long j) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (mo17797k(this.f62867g, elapsedRealtime)) {
                for (int i = this.f45303b - 1; i >= 0; i--) {
                    if (!mo17797k(i, elapsedRealtime)) {
                        this.f62867g = i;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        public int getSelectedIndex() {
            return this.f62867g;
        }

        /* renamed from: i */
        public Object mo17784i() {
            return null;
        }

        /* renamed from: j */
        public int mo17785j() {
            return 0;
        }
    }

    public C22202c(C22305e eVar, C22300a.C22301a[] aVarArr, C22206d dVar, C22215k kVar, List<Format> list) {
        this.f62849e = eVar;
        this.f62848d = aVarArr;
        this.f62847c = kVar;
        this.f62851g = list;
        Format[] formatArr = new Format[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            formatArr[i] = aVarArr[i].f63216b;
            iArr[i] = i;
        }
        C22201b bVar = (C22201b) dVar;
        this.f62845a = bVar.f62844a.createDataSource();
        this.f62846b = bVar.f62844a.createDataSource();
        C21961u uVar = new C21961u(formatArr);
        this.f62850f = uVar;
        this.f62861q = new C22205c(uVar, iArr);
    }

    /* renamed from: a */
    public final void mo35336a(Uri uri, String str, byte[] bArr) {
        byte[] byteArray = new BigInteger(C20551y.m22322l(str).startsWith("0x") ? str.substring(2) : str, 16).toByteArray();
        byte[] bArr2 = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr2, (16 - byteArray.length) + length, byteArray.length - length);
        this.f62857m = uri;
        this.f62858n = bArr;
        this.f62859o = str;
        this.f62860p = bArr2;
    }
}
