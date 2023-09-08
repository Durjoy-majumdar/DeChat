package df1;

import ef1.C58553c;
import ef1.C7637b;
import ef1.C7638e;
import gr1.C59673q2;
import java.util.LinkedList;
import mr1.C61575s;
import mr1.C61576t;
import p1081gi.C98121d;
import p1081gi.C98127h;
import pl1.C62369u0;
import qt1.C12931a;
import te3.C64689rq2;

/* renamed from: df1.c */
public final class C58259c extends C7638e<C58261b> {

    /* renamed from: df1.c$a */
    public static final class C58260a extends C7637b {

        /* renamed from: b */
        public final int f166811b;

        /* renamed from: c */
        public C59673q2 f166812c;

        /* renamed from: d */
        public C64689rq2 f166813d;

        /* renamed from: e */
        public C62369u0 f166814e;

        /* renamed from: f */
        public int f166815f;

        /* renamed from: g */
        public int f166816g;

        /* renamed from: h */
        public long f166817h;

        /* renamed from: i */
        public String f166818i = "";

        /* renamed from: j */
        public LinkedList<C64689rq2> f166819j;

        /* renamed from: k */
        public int f166820k;

        /* renamed from: l */
        public int f166821l;

        /* renamed from: m */
        public int f166822m;

        /* renamed from: n */
        public C98127h f166823n;

        /* renamed from: o */
        public C98121d f166824o;

        /* renamed from: p */
        public int f166825p;

        /* renamed from: q */
        public int f166826q;

        /* renamed from: r */
        public long f166827r;

        /* renamed from: s */
        public C61576t f166828s;

        /* renamed from: t */
        public C61575s f166829t;

        /* renamed from: u */
        public C12931a f166830u;

        /* renamed from: v */
        public int f166831v;

        /* renamed from: w */
        public int f166832w;

        /* renamed from: x */
        public int f166833x;

        /* renamed from: y */
        public boolean f166834y;

        public C58260a(int i) {
            this.f166811b = i;
        }

        /* renamed from: b */
        public final int mo83006b() {
            return this.f166821l;
        }

        /* renamed from: c */
        public final long mo83007c() {
            return this.f166817h;
        }

        /* renamed from: d */
        public final C64689rq2 mo83008d() {
            return this.f166813d;
        }

        /* renamed from: e */
        public final int mo83009e() {
            return this.f166815f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C58260a) && this.f166811b == ((C58260a) obj).f166811b;
        }

        /* renamed from: f */
        public final int mo83011f() {
            return this.f166822m;
        }

        /* renamed from: g */
        public final int mo83012g() {
            return this.f166816g;
        }

        /* renamed from: h */
        public final int mo83013h() {
            return this.f166811b;
        }

        public int hashCode() {
            return this.f166811b;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("(type=");
            sb.append(this.f166811b);
            sb.append(", mediaObject=");
            sb.append(this.f166813d);
            sb.append(", mediaId=");
            C64689rq2 rq22 = this.f166813d;
            if (rq22 == null || (str = rq22.f185275p) == null) {
                str = "";
            }
            sb.append(str);
            sb.append(", offset=");
            sb.append(this.f166815f);
            sb.append(", total=");
            sb.append(this.f166816g);
            sb.append(", feedId=");
            sb.append(this.f166817h);
            sb.append(", objectNonceId='");
            sb.append(this.f166818i);
            sb.append("' mediaListSize=");
            LinkedList<C64689rq2> linkedList = this.f166819j;
            sb.append(linkedList != null ? Integer.valueOf(linkedList.size()) : null);
            sb.append(')');
            return sb.toString();
        }
    }

    /* renamed from: df1.c$b */
    public interface C58261b {
        /* renamed from: a */
        void mo83016a(long j, C64689rq2 rq22, C62369u0 u0Var, boolean z);

        /* renamed from: b */
        void mo83017b(long j, C64689rq2 rq22, int i);

        /* renamed from: c */
        void mo83018c(long j, C64689rq2 rq22, C59673q2 q2Var, int i, C62369u0 u0Var, int i2);

        /* renamed from: d */
        void mo83019d(long j, C64689rq2 rq22, C59673q2 q2Var, int i, C62369u0 u0Var, int i2);

        /* renamed from: e */
        void mo83020e(long j, C64689rq2 rq22, C98127h hVar, C98121d dVar, C62369u0 u0Var);

        /* renamed from: f */
        void mo83021f(long j, C64689rq2 rq22, C62369u0 u0Var, int i, int i2, int i3);

        /* renamed from: g */
        void mo83022g(long j, C64689rq2 rq22, C62369u0 u0Var);

        /* renamed from: h */
        void mo83023h(long j, C64689rq2 rq22, C62369u0 u0Var);

        /* renamed from: i */
        void mo83024i(long j, C64689rq2 rq22, C59673q2 q2Var, int i, C62369u0 u0Var, int i2);

        /* renamed from: j */
        void mo83025j(long j, C64689rq2 rq22, LinkedList<C64689rq2> linkedList, C62369u0 u0Var, C61576t tVar);

        /* renamed from: k */
        void mo83026k(long j, C64689rq2 rq22, int i, C98121d dVar, C62369u0 u0Var);

        /* renamed from: l */
        void mo83027l(long j, C64689rq2 rq22, int i, int i2, C62369u0 u0Var);

        /* renamed from: m */
        void mo83028m(long j, C64689rq2 rq22, C62369u0 u0Var, long j2, C12931a aVar);

        /* renamed from: n */
        void mo83029n(long j, C64689rq2 rq22, LinkedList<C64689rq2> linkedList, C62369u0 u0Var, C61575s sVar);

        /* renamed from: o */
        void mo83030o(long j, C64689rq2 rq22, C62369u0 u0Var);

        /* renamed from: p */
        void mo83031p(long j, C64689rq2 rq22, int i, int i2, C62369u0 u0Var);

        /* renamed from: q */
        void mo83032q(long j, C64689rq2 rq22, int i, int i2, C62369u0 u0Var);

        /* renamed from: r */
        void mo83033r(long j, C64689rq2 rq22, int i, int i2, C62369u0 u0Var);

        /* renamed from: s */
        void mo83034s(long j, C64689rq2 rq22, int i, int i2, C62369u0 u0Var);

        /* renamed from: t */
        void mo83035t(long j, C64689rq2 rq22, C62369u0 u0Var);

        /* renamed from: u */
        void mo83036u(long j, C64689rq2 rq22, C62369u0 u0Var, C61575s sVar);

        /* renamed from: v */
        void mo83037v(long j, C64689rq2 rq22, C62369u0 u0Var, long j2);

        /* renamed from: w */
        void mo83038w(long j, C64689rq2 rq22, int i, int i2, C62369u0 u0Var);

        /* renamed from: x */
        void mo83039x(long j, C64689rq2 rq22, LinkedList<C64689rq2> linkedList, C62369u0 u0Var);
    }

    public C58259c(C58553c cVar) {
        super(cVar);
    }
}
