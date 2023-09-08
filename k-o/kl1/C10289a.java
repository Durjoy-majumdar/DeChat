package kl1;

import android.graphics.Bitmap;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import er1.C58739j4;
import gy3.C8480h;
import gy3.C87412m;
import ok1.C62042e;
import org.libpag.PAGImage;
import p1028re.C89928a;
import p1028re.C89931d;
import wk1.C15440n;

/* renamed from: kl1.a */
public final class C10289a {

    /* renamed from: i */
    public static final C10293d f31347i = new C10293d((C8480h) null);

    /* renamed from: j */
    public static final LruCache<Integer, Bitmap> f31348j = new LruCache<>(3);

    /* renamed from: k */
    public static final LruCache<Integer, PAGImage> f31349k = new LruCache<>(2);

    /* renamed from: l */
    public static C10289a f31350l;

    /* renamed from: a */
    public final String f31351a;

    /* renamed from: b */
    public C10290a f31352b;

    /* renamed from: c */
    public C10291b f31353c;

    /* renamed from: d */
    public boolean f31354d;

    /* renamed from: e */
    public final boolean f31355e;

    /* renamed from: f */
    public final C10297h f31356f;

    /* renamed from: g */
    public final C10298i f31357g;

    /* renamed from: h */
    public final C10294e f31358h;

    /* renamed from: kl1.a$a */
    public enum C10290a {
        START,
        REPLACE
    }

    /* renamed from: kl1.a$b */
    public enum C10291b {
        H_JOIN,
        NORMAL_JOIN,
        EXCEPT_JOIN
    }

    /* renamed from: kl1.a$c */
    public static final class C10292c implements C89928a {
        /* renamed from: a */
        public void mo391a(int i) {
            C10293d.m10247a(C10289a.f31347i, "systemTrim");
        }

        /* renamed from: b */
        public void mo392b() {
            C10293d.m10247a(C10289a.f31347i, "backgroundTrim");
        }
    }

    /* renamed from: kl1.a$d */
    public static final class C10293d {
        public C10293d(C8480h hVar) {
        }

        /* renamed from: a */
        public static final void m10247a(C10293d dVar, String str) {
            dVar.getClass();
            try {
                LruCache<Integer, Bitmap> lruCache = C10289a.f31348j;
                int size = lruCache.size();
                LruCache<Integer, PAGImage> lruCache2 = C10289a.f31349k;
                int size2 = lruCache2.size();
                Log.m105924i("AnimConfig", str + " flashLight cache Size:" + size + ",floatCover cache Size:" + size2 + '!');
                if (size > 0) {
                    lruCache.evictAll();
                }
                if (size2 > 0) {
                    lruCache2.evictAll();
                }
                dVar.mo10587b((C10289a) null);
            } catch (Exception e) {
                C58739j4.f168176a.mo83712h0(e, "AnimConfig-memoryTrim");
            }
        }

        /* renamed from: b */
        public final void mo10587b(C10289a aVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("saveAnimConfig from ");
            C10289a aVar2 = C10289a.f31350l;
            String str = null;
            sb.append(aVar2 != null ? aVar2.f31351a : null);
            sb.append(" to ");
            if (aVar != null) {
                str = aVar.f31351a;
            }
            sb.append(str);
            sb.append('!');
            Log.m105924i("AnimConfig", sb.toString());
            C10289a.f31350l = aVar;
        }
    }

    /* renamed from: kl1.a$e */
    public static final class C10294e {

        /* renamed from: a */
        public int f31366a;

        public C10294e() {
            this(0, 1, (C8480h) null);
        }

        public C10294e(int i, int i2, C8480h hVar) {
            this.f31366a = (i2 & 1) != 0 ? -1 : i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10294e) && this.f31366a == ((C10294e) obj).f31366a;
        }

        public int hashCode() {
            return this.f31366a;
        }

        public String toString() {
            return "Extra(level=" + this.f31366a + ')';
        }
    }

    /* renamed from: kl1.a$f */
    public static final class C10295f {

        /* renamed from: a */
        public final long f31367a;

        /* renamed from: b */
        public Bitmap f31368b;

        /* renamed from: c */
        public final float f31369c;

        public C10295f() {
            this(0, (Bitmap) null, 0.0f, 7, (C8480h) null);
        }

        public C10295f(long j, Bitmap bitmap, float f, int i, C8480h hVar) {
            j = (i & 1) != 0 ? 2500 : j;
            bitmap = (i & 2) != 0 ? null : bitmap;
            f = (i & 4) != 0 ? (float) C15440n.f41895a.mo14258g() : f;
            this.f31367a = j;
            this.f31368b = bitmap;
            this.f31369c = f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10295f)) {
                return false;
            }
            C10295f fVar = (C10295f) obj;
            return this.f31367a == fVar.f31367a && C87412m.m108589b(this.f31368b, fVar.f31368b) && C87412m.m108589b(Float.valueOf(this.f31369c), Float.valueOf(fVar.f31369c));
        }

        public int hashCode() {
            long j = this.f31367a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            Bitmap bitmap = this.f31368b;
            return ((i + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + Float.floatToIntBits(this.f31369c);
        }

        public String toString() {
            return "FlashFlightConfig(flashLightDuration=" + this.f31367a + ", bitmap=" + this.f31368b + ", radius=" + this.f31369c + ')';
        }
    }

    /* renamed from: kl1.a$g */
    public static final class C10296g {

        /* renamed from: a */
        public final long f31370a;

        /* renamed from: b */
        public final long f31371b;

        /* renamed from: c */
        public final long f31372c;

        /* renamed from: d */
        public PAGImage f31373d;

        public C10296g() {
            this(0, 0, 0, (PAGImage) null, 15, (C8480h) null);
        }

        public C10296g(long j, long j2, long j3, PAGImage pAGImage, int i, C8480h hVar) {
            j = (i & 1) != 0 ? 200 : j;
            j2 = (i & 2) != 0 ? 0 : j2;
            j3 = (i & 4) != 0 ? FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION : j3;
            pAGImage = (i & 8) != 0 ? null : pAGImage;
            this.f31370a = j;
            this.f31371b = j2;
            this.f31372c = j3;
            this.f31373d = pAGImage;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10296g)) {
                return false;
            }
            C10296g gVar = (C10296g) obj;
            return this.f31370a == gVar.f31370a && this.f31371b == gVar.f31371b && this.f31372c == gVar.f31372c && C87412m.m108589b(this.f31373d, gVar.f31373d);
        }

        public int hashCode() {
            long j = this.f31370a;
            long j2 = this.f31371b;
            long j3 = this.f31372c;
            int i = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            PAGImage pAGImage = this.f31373d;
            return i + (pAGImage == null ? 0 : pAGImage.hashCode());
        }

        public String toString() {
            return "FloatCoverConfig(floatCoverTranslationDuration=" + this.f31370a + ", floatCoverTranslationDelay=" + this.f31371b + ", floatCoverDuration=" + this.f31372c + ", replaceImg=" + this.f31373d + ')';
        }
    }

    /* renamed from: kl1.a$h */
    public static final class C10297h {

        /* renamed from: a */
        public final boolean f31374a;

        /* renamed from: b */
        public final long f31375b;

        /* renamed from: c */
        public final long f31376c;

        /* renamed from: d */
        public final long f31377d;

        /* renamed from: e */
        public final long f31378e;

        /* renamed from: f */
        public boolean f31379f;

        /* renamed from: g */
        public boolean f31380g;

        /* renamed from: h */
        public final long f31381h;

        /* renamed from: i */
        public final int f31382i;

        /* renamed from: j */
        public final C10295f f31383j;

        /* renamed from: k */
        public final C10296g f31384k;

        /* renamed from: l */
        public long f31385l;

        /* renamed from: m */
        public final long f31386m;

        public C10297h() {
            this(false, 0, 0, 0, 0, false, false, 0, 0, (C10295f) null, (C10296g) null, 0, 0, 8191, (C8480h) null);
        }

        public C10297h(boolean z, long j, long j2, long j3, long j4, boolean z2, boolean z3, long j5, int i, C10295f fVar, C10296g gVar, long j6, long j7, int i2, C8480h hVar) {
            int i3 = i2;
            boolean z4 = (i3 & 1) != 0 ? !C62042e.f176370a.mo87027N0() : z;
            long j8 = (i3 & 2) != 0 ? 200 : j;
            long j9 = (i3 & 4) != 0 ? 150 : j2;
            long j15 = 250;
            long j16 = (i3 & 8) != 0 ? 250 : j3;
            long j17 = (i3 & 16) != 0 ? 250 : j4;
            boolean z5 = false;
            boolean z6 = (i3 & 32) != 0 ? false : z2;
            z5 = (i3 & 64) == 0 ? z3 : z5;
            j15 = (i3 & 128) == 0 ? j5 : j15;
            int i4 = (i3 & 256) != 0 ? -500 : i;
            C10295f fVar2 = (i3 & 512) != 0 ? new C10295f(0, (Bitmap) null, 0.0f, 7, (C8480h) null) : fVar;
            long j18 = j15;
            C10296g gVar2 = (i3 & 1024) != 0 ? new C10296g(0, 0, 0, (PAGImage) null, 15, (C8480h) null) : gVar;
            long j19 = (i3 & 2048) != 0 ? 1500 : j6;
            long j25 = (i3 & 4096) != 0 ? 1500 : j7;
            C87412m.m108594g(fVar2, "flashLightConfig");
            C87412m.m108594g(gVar2, "floatCoverConfig");
            this.f31374a = z4;
            this.f31375b = j8;
            this.f31376c = j9;
            this.f31377d = j16;
            this.f31378e = j17;
            this.f31379f = z6;
            this.f31380g = z5;
            this.f31381h = j18;
            this.f31382i = i4;
            this.f31383j = fVar2;
            this.f31384k = gVar2;
            this.f31385l = j19;
            this.f31386m = j25;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10297h)) {
                return false;
            }
            C10297h hVar = (C10297h) obj;
            return this.f31374a == hVar.f31374a && this.f31375b == hVar.f31375b && this.f31376c == hVar.f31376c && this.f31377d == hVar.f31377d && this.f31378e == hVar.f31378e && this.f31379f == hVar.f31379f && this.f31380g == hVar.f31380g && this.f31381h == hVar.f31381h && this.f31382i == hVar.f31382i && C87412m.m108589b(this.f31383j, hVar.f31383j) && C87412m.m108589b(this.f31384k, hVar.f31384k) && this.f31385l == hVar.f31385l && this.f31386m == hVar.f31386m;
        }

        public int hashCode() {
            boolean z = this.f31374a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            long j = this.f31375b;
            long j2 = this.f31376c;
            long j3 = this.f31377d;
            long j4 = this.f31378e;
            int i = (((((((((z ? 1 : 0) * true) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            boolean z3 = this.f31379f;
            if (z3) {
                z3 = true;
            }
            int i2 = (i + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f31380g;
            if (!z4) {
                z2 = z4;
            }
            long j5 = this.f31381h;
            long j6 = this.f31385l;
            long j7 = this.f31386m;
            return ((((((((((((i2 + (z2 ? 1 : 0)) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f31382i) * 31) + this.f31383j.hashCode()) * 31) + this.f31384k.hashCode()) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)));
        }

        public String toString() {
            return "HightLevelAnimParams(scale=" + this.f31374a + ", scaleInDelay=" + this.f31375b + ", scaleInDuration=" + this.f31376c + ", scaleBackDuration=" + this.f31377d + ", alphaOutDuration=" + this.f31378e + ", flashLight=" + this.f31379f + ", floatCover=" + this.f31380g + ", startDuration=" + this.f31381h + ", startFromTranslationX=" + this.f31382i + ", flashLightConfig=" + this.f31383j + ", floatCoverConfig=" + this.f31384k + ", beforeNextCheckDuration=" + this.f31385l + ", beforeAnimOutDuration=" + this.f31386m + ')';
        }
    }

    /* renamed from: kl1.a$i */
    public static final class C10298i {

        /* renamed from: a */
        public final long f31387a;

        /* renamed from: b */
        public final int f31388b;

        /* renamed from: c */
        public long f31389c;

        /* renamed from: d */
        public final long f31390d;

        public C10298i() {
            this(0, 0, 0, 0, 15, (C8480h) null);
        }

        public C10298i(long j, int i, long j2, long j3, int i2, C8480h hVar) {
            j = (i2 & 1) != 0 ? 500 : j;
            i = (i2 & 2) != 0 ? -500 : i;
            j2 = (i2 & 4) != 0 ? 2000 : j2;
            j3 = (i2 & 8) != 0 ? 500 : j3;
            this.f31387a = j;
            this.f31388b = i;
            this.f31389c = j2;
            this.f31390d = j3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10298i)) {
                return false;
            }
            C10298i iVar = (C10298i) obj;
            return this.f31387a == iVar.f31387a && this.f31388b == iVar.f31388b && this.f31389c == iVar.f31389c && this.f31390d == iVar.f31390d;
        }

        public int hashCode() {
            long j = this.f31387a;
            long j2 = this.f31389c;
            long j3 = this.f31390d;
            return (((((((int) (j ^ (j >>> 32))) * 31) + this.f31388b) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
        }

        public String toString() {
            return "NormalAnimParams(startDuration=" + this.f31387a + ", startFromTranslationX=" + this.f31388b + ", beforeNextCheckDuration=" + this.f31389c + ", alphaOutDuration=" + this.f31390d + ')';
        }
    }

    static {
        Log.m105924i("BulletCommentHelper", "initMemoryTrim");
        C89931d.f258426c.mo124253c(new C10292c());
    }

    public C10289a(String str, C10290a aVar, C10291b bVar, boolean z, boolean z2, C10297h hVar, C10298i iVar, C10294e eVar, int i, C8480h hVar2) {
        aVar = (i & 2) != 0 ? C10290a.START : aVar;
        bVar = (i & 4) != 0 ? C10291b.NORMAL_JOIN : bVar;
        z = (i & 8) != 0 ? false : z;
        z2 = (i & 16) != 0 ? true : z2;
        C87412m.m108594g(str, "uniqueId");
        C87412m.m108594g(aVar, "beginState");
        C87412m.m108594g(bVar, "mode");
        C87412m.m108594g(hVar, "hParams");
        C87412m.m108594g(iVar, "nParams");
        C87412m.m108594g(eVar, "extra");
        this.f31351a = str;
        this.f31352b = aVar;
        this.f31353c = bVar;
        this.f31354d = z;
        this.f31355e = z2;
        this.f31356f = hVar;
        this.f31357g = iVar;
        this.f31358h = eVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10289a)) {
            return false;
        }
        C10289a aVar = (C10289a) obj;
        return C87412m.m108589b(this.f31351a, aVar.f31351a) && this.f31352b == aVar.f31352b && this.f31353c == aVar.f31353c && this.f31354d == aVar.f31354d && this.f31355e == aVar.f31355e && C87412m.m108589b(this.f31356f, aVar.f31356f) && C87412m.m108589b(this.f31357g, aVar.f31357g) && C87412m.m108589b(this.f31358h, aVar.f31358h);
    }

    public int hashCode() {
        int hashCode = ((((this.f31351a.hashCode() * 31) + this.f31352b.hashCode()) * 31) + this.f31353c.hashCode()) * 31;
        boolean z = this.f31354d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f31355e;
        if (!z3) {
            z2 = z3;
        }
        return ((((((i + (z2 ? 1 : 0)) * 31) + this.f31356f.hashCode()) * 31) + this.f31357g.hashCode()) * 31) + this.f31358h.f31366a;
    }

    public String toString() {
        return "AnimConfig(uniqueId=" + this.f31351a + ", beginState=" + this.f31352b + ", mode=" + this.f31353c + ", working=" + this.f31354d + ", alphaTo1WhenBegin=" + this.f31355e + ", hParams=" + this.f31356f + ", nParams=" + this.f31357g + ", extra=" + this.f31358h + ')';
    }
}
