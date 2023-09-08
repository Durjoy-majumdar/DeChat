package p370p7;

import android.os.Handler;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import p300c8.C79950j;
import p396x6.C22994b;

/* renamed from: p7.c */
public interface C21920c {

    /* renamed from: p7.c$a */
    public static final class C21921a {

        /* renamed from: a */
        public final Handler f61980a;

        /* renamed from: b */
        public final C21920c f61981b;

        /* renamed from: p7.c$a$a */
        public class C21922a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C79950j f61982d;

            /* renamed from: e */
            public final /* synthetic */ int f61983e;

            /* renamed from: f */
            public final /* synthetic */ int f61984f;

            /* renamed from: g */
            public final /* synthetic */ Format f61985g;

            /* renamed from: h */
            public final /* synthetic */ int f61986h;

            /* renamed from: i */
            public final /* synthetic */ Object f61987i;

            /* renamed from: j */
            public final /* synthetic */ long f61988j;

            /* renamed from: n */
            public final /* synthetic */ long f61989n;

            /* renamed from: o */
            public final /* synthetic */ long f61990o;

            /* renamed from: p */
            public final /* synthetic */ long f61991p;

            /* renamed from: q */
            public final /* synthetic */ long f61992q;

            /* renamed from: r */
            public final /* synthetic */ C21921a f61993r;

            public C21922a(C21921a aVar, C79950j jVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
                this.f61993r = aVar;
                this.f61982d = jVar;
                this.f61983e = i;
                this.f61984f = i2;
                this.f61985g = format;
                this.f61986h = i3;
                this.f61987i = obj;
                this.f61988j = j;
                this.f61989n = j2;
                this.f61990o = j3;
                this.f61991p = j4;
                this.f61992q = j5;
            }

            public void run() {
                C21921a aVar = this.f61993r;
                C21920c cVar = aVar.f61981b;
                C79950j jVar = this.f61982d;
                C79950j jVar2 = jVar;
                cVar.mo33449m(jVar2, this.f61983e, this.f61984f, this.f61985g, this.f61986h, this.f61987i, C21921a.m25190a(aVar, this.f61988j), C21921a.m25190a(this.f61993r, this.f61989n), this.f61990o, this.f61991p, this.f61992q);
            }
        }

        /* renamed from: p7.c$a$b */
        public class C21923b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C79950j f61994d;

            /* renamed from: e */
            public final /* synthetic */ int f61995e;

            /* renamed from: f */
            public final /* synthetic */ int f61996f;

            /* renamed from: g */
            public final /* synthetic */ Format f61997g;

            /* renamed from: h */
            public final /* synthetic */ int f61998h;

            /* renamed from: i */
            public final /* synthetic */ Object f61999i;

            /* renamed from: j */
            public final /* synthetic */ long f62000j;

            /* renamed from: n */
            public final /* synthetic */ long f62001n;

            /* renamed from: o */
            public final /* synthetic */ long f62002o;

            /* renamed from: p */
            public final /* synthetic */ long f62003p;

            /* renamed from: q */
            public final /* synthetic */ long f62004q;

            /* renamed from: r */
            public final /* synthetic */ C21921a f62005r;

            public C21923b(C21921a aVar, C79950j jVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
                this.f62005r = aVar;
                this.f61994d = jVar;
                this.f61995e = i;
                this.f61996f = i2;
                this.f61997g = format;
                this.f61998h = i3;
                this.f61999i = obj;
                this.f62000j = j;
                this.f62001n = j2;
                this.f62002o = j3;
                this.f62003p = j4;
                this.f62004q = j5;
            }

            public void run() {
                C21921a aVar = this.f62005r;
                C21920c cVar = aVar.f61981b;
                C79950j jVar = this.f61994d;
                C79950j jVar2 = jVar;
                cVar.mo33454t(jVar2, this.f61995e, this.f61996f, this.f61997g, this.f61998h, this.f61999i, C21921a.m25190a(aVar, this.f62000j), C21921a.m25190a(this.f62005r, this.f62001n), this.f62002o, this.f62003p, this.f62004q);
            }
        }

        /* renamed from: p7.c$a$c */
        public class C21924c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C79950j f62006d;

            /* renamed from: e */
            public final /* synthetic */ int f62007e;

            /* renamed from: f */
            public final /* synthetic */ int f62008f;

            /* renamed from: g */
            public final /* synthetic */ Format f62009g;

            /* renamed from: h */
            public final /* synthetic */ int f62010h;

            /* renamed from: i */
            public final /* synthetic */ Object f62011i;

            /* renamed from: j */
            public final /* synthetic */ long f62012j;

            /* renamed from: n */
            public final /* synthetic */ long f62013n;

            /* renamed from: o */
            public final /* synthetic */ long f62014o;

            /* renamed from: p */
            public final /* synthetic */ long f62015p;

            /* renamed from: q */
            public final /* synthetic */ long f62016q;

            /* renamed from: r */
            public final /* synthetic */ IOException f62017r;

            /* renamed from: s */
            public final /* synthetic */ boolean f62018s;

            /* renamed from: t */
            public final /* synthetic */ C21921a f62019t;

            public C21924c(C21921a aVar, C79950j jVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
                this.f62019t = aVar;
                this.f62006d = jVar;
                this.f62007e = i;
                this.f62008f = i2;
                this.f62009g = format;
                this.f62010h = i3;
                this.f62011i = obj;
                this.f62012j = j;
                this.f62013n = j2;
                this.f62014o = j3;
                this.f62015p = j4;
                this.f62016q = j5;
                this.f62017r = iOException;
                this.f62018s = z;
            }

            public void run() {
                C21921a aVar = this.f62019t;
                C21920c cVar = aVar.f61981b;
                C79950j jVar = this.f62006d;
                C79950j jVar2 = jVar;
                cVar.mo33448l(jVar2, this.f62007e, this.f62008f, this.f62009g, this.f62010h, this.f62011i, C21921a.m25190a(aVar, this.f62012j), C21921a.m25190a(this.f62019t, this.f62013n), this.f62014o, this.f62015p, this.f62016q, this.f62017r, this.f62018s);
            }
        }

        public C21921a(Handler handler, C21920c cVar) {
            if (cVar != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.f61980a = handler;
            this.f61981b = cVar;
        }

        /* renamed from: a */
        public static long m25190a(C21921a aVar, long j) {
            aVar.getClass();
            long b = C22994b.m27204b(j);
            if (b == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return 0 + b;
        }

        /* renamed from: b */
        public void mo34972b(C79950j jVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            if (this.f61981b != null) {
                C21923b bVar = r0;
                C21923b bVar2 = new C21923b(this, jVar, i, i2, format, i3, obj, j, j2, j3, j4, j5);
                this.f61980a.post(bVar);
            }
        }

        /* renamed from: c */
        public void mo34973c(C79950j jVar, int i, long j, long j2, long j3) {
            mo34972b(jVar, i, -1, (Format) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
        }

        /* renamed from: d */
        public void mo34974d(C79950j jVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            if (this.f61981b != null) {
                C21922a aVar = r0;
                C21922a aVar2 = new C21922a(this, jVar, i, i2, format, i3, obj, j, j2, j3, j4, j5);
                this.f61980a.post(aVar);
            }
        }

        /* renamed from: e */
        public void mo34975e(C79950j jVar, int i, long j, long j2, long j3) {
            mo34974d(jVar, i, -1, (Format) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
        }

        /* renamed from: f */
        public void mo34976f(C79950j jVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
            if (this.f61981b != null) {
                C21924c cVar = r0;
                C21924c cVar2 = new C21924c(this, jVar, i, i2, format, i3, obj, j, j2, j3, j4, j5, iOException, z);
                this.f61980a.post(cVar);
            }
        }

        /* renamed from: g */
        public void mo34977g(C79950j jVar, int i, long j, long j2, long j3, IOException iOException, boolean z) {
            mo34976f(jVar, i, -1, (Format) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, j, j2, j3, iOException, z);
        }
    }

    /* renamed from: d */
    void mo33442d();

    /* renamed from: k */
    void mo33447k(int i, Format format, int i2, Object obj, long j);

    /* renamed from: l */
    void mo33448l(C79950j jVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z);

    /* renamed from: m */
    void mo33449m(C79950j jVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5);

    /* renamed from: o */
    void mo33451o(C79950j jVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3);

    /* renamed from: t */
    void mo33454t(C79950j jVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5);
}
