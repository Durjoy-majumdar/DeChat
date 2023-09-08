package pc0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86723g;
import fw0.C87104h;
import gy3.C87412m;
import java.util.Objects;
import ob0.C117747y;
import ob0.C47355o;
import ob0.C77005v;
import p261wl.C38166b;
import p261wl.C38174i;
import ty0.C101935g;
import ty0.C101936i;
import ty0.C37306j;

/* renamed from: pc0.a0 */
public class C100760a0 {

    /* renamed from: a */
    public static C77062c f295176a;

    /* renamed from: pc0.a0$c */
    public interface C77062c {
    }

    /* renamed from: pc0.a0$b */
    public static class C89338b<T extends C117747y> {

        /* renamed from: a */
        public T f257313a;

        /* renamed from: b */
        public long f257314b;

        /* renamed from: a */
        public boolean mo123694a() {
            if (this.f257313a == null) {
                Log.m105921e("SendMsgCgiFactory", "[execute] cgi is null. %s", Util.getStack());
            }
            Objects.requireNonNull(this.f257313a);
            return C86723g.this.f251779b.mo123461g(this.f257313a, 0);
        }
    }

    /* renamed from: pc0.a0$a */
    public static class C100761a {

        /* renamed from: a */
        public C117747y f295177a;

        /* renamed from: b */
        public long f295178b;
    }

    /* renamed from: pc0.a0$d */
    public interface C100762d {
        /* renamed from: d1 */
        void mo127073d1(C100764f fVar);
    }

    /* renamed from: pc0.a0$e */
    public enum C100763e {
        TEXT,
        IMAGE,
        VIDEO,
        CDN_IMAGE,
        EMOJI
    }

    /* renamed from: pc0.a0$f */
    public static class C100764f {

        /* renamed from: A */
        public String f295185A;

        /* renamed from: B */
        public C100763e f295186B;

        /* renamed from: a */
        public String f295187a;

        /* renamed from: b */
        public String f295188b;

        /* renamed from: c */
        public String f295189c;

        /* renamed from: d */
        public int f295190d;

        /* renamed from: e */
        public int f295191e;

        /* renamed from: f */
        public long f295192f;

        /* renamed from: g */
        public Object f295193g;

        /* renamed from: h */
        public int f295194h;

        /* renamed from: i */
        public int f295195i;

        /* renamed from: j */
        public String f295196j = "";

        /* renamed from: k */
        public int f295197k;

        /* renamed from: l */
        public C47355o f295198l;

        /* renamed from: m */
        public C77005v f295199m;

        /* renamed from: n */
        public int f295200n;

        /* renamed from: o */
        public int f295201o;

        /* renamed from: p */
        public boolean f295202p;

        /* renamed from: q */
        public boolean f295203q;

        /* renamed from: r */
        public String f295204r = "";

        /* renamed from: s */
        public String f295205s = "";

        /* renamed from: t */
        public C100765f f295206t;

        /* renamed from: u */
        public int f295207u;

        /* renamed from: v */
        public boolean f295208v;

        /* renamed from: w */
        public int f295209w;

        /* renamed from: x */
        public String f295210x;

        /* renamed from: y */
        public float f295211y;

        /* renamed from: z */
        public float f295212z;

        /* renamed from: a */
        public <T extends C117747y> C89338b<T> mo140195a() {
            C89338b<T> bVar = new C89338b<>();
            C77062c cVar = C100760a0.f295176a;
            if (cVar != null) {
                ((C87104h) cVar).getClass();
                C37306j jVar = C37306j.f98678a;
                C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C101936i.class);
                C38166b.C38167a.C38169b bVar2 = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
                C100761a aVar2 = null;
                Object obj = null;
                while (bVar2.hasNext()) {
                    C38174i iVar = (C38174i) bVar2.next();
                    C101936i iVar2 = (C101936i) iVar.get();
                    boolean z = true;
                    if (iVar2 == null || !iVar2.mo126120d(this)) {
                        z = false;
                    }
                    if (z) {
                        obj = iVar.get();
                    }
                }
                C101935g gVar = obj == null ? C37306j.f98680c : (C101935g) obj;
                C100763e eVar = this.f295186B;
                if (eVar == C100763e.TEXT) {
                    C87412m.m108591d(gVar);
                    aVar2 = gVar.mo141431D(this);
                } else if (eVar == C100763e.IMAGE) {
                    C87412m.m108591d(gVar);
                    aVar2 = gVar.mo141432Q(this);
                } else if (eVar == C100763e.VIDEO) {
                    C87412m.m108591d(gVar);
                    aVar2 = gVar.mo141434q(this);
                } else if (eVar == C100763e.CDN_IMAGE) {
                    C87412m.m108591d(gVar);
                    aVar2 = gVar.mo141430B(this);
                } else if (eVar == C100763e.EMOJI) {
                    C87412m.m108591d(gVar);
                    aVar2 = gVar.mo126118O(this);
                }
                bVar.f257313a = aVar2.f295177a;
                bVar.f257314b = aVar2.f295178b;
            }
            return bVar;
        }

        /* renamed from: c */
        public C100764f mo140196c(int i) {
            this.f295194h = i;
            return this;
        }

        /* renamed from: d */
        public C100764f mo140197d(C100765f fVar) {
            this.f295206t = fVar;
            return this;
        }

        /* renamed from: e */
        public C100764f mo140198e(String str) {
            this.f295187a = str;
            return this;
        }
    }

    /* renamed from: a */
    public static C100764f m131931a(String str) {
        C100763e eVar = C100763e.TEXT;
        C100764f fVar = new C100764f();
        fVar.f295187a = str;
        fVar.f295186B = eVar;
        return fVar;
    }

    /* renamed from: b */
    public static C100764f m131932b(C100763e eVar) {
        C100764f fVar = new C100764f();
        fVar.f295186B = eVar;
        return fVar;
    }
}
