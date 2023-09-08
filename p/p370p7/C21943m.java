package p370p7;

import p300c8.C16870b;
import p333e8.C20528a;
import p370p7.C21949o;
import p396x6.C22998f;
import p396x6.C23027v;

/* renamed from: p7.m */
public final class C21943m implements C21949o {

    /* renamed from: d */
    public final C21949o f62113d;

    /* renamed from: e */
    public final int f62114e;

    /* renamed from: f */
    public int f62115f;

    /* renamed from: p7.m$a */
    public class C21944a implements C21949o.C21950a {

        /* renamed from: d */
        public final /* synthetic */ C21949o.C21950a f62116d;

        public C21944a(C21949o.C21950a aVar) {
            this.f62116d = aVar;
        }

        /* renamed from: c */
        public void mo35001c(C23027v vVar, Object obj) {
            C21943m.this.f62115f = vVar.mo35005f();
            this.f62116d.mo35001c(C21943m.this.f62114e != Integer.MAX_VALUE ? new C21946c(vVar, C21943m.this.f62114e) : new C21945b(vVar), obj);
        }
    }

    /* renamed from: p7.m$b */
    public static final class C21945b extends C23027v {

        /* renamed from: b */
        public final C23027v f62118b;

        public C21945b(C23027v vVar) {
            this.f62118b = vVar;
        }

        /* renamed from: a */
        public int mo34967a(Object obj) {
            return this.f62118b.mo34967a(obj);
        }

        /* renamed from: c */
        public int mo34968c(int i, int i2) {
            int c = this.f62118b.mo34968c(i, i2);
            if (c == -1) {
                return 0;
            }
            return c;
        }

        /* renamed from: e */
        public C23027v.C23029b mo34969e(int i, C23027v.C23029b bVar, boolean z) {
            return this.f62118b.mo34969e(i, bVar, z);
        }

        /* renamed from: f */
        public int mo35005f() {
            return this.f62118b.mo35005f();
        }

        /* renamed from: i */
        public C23027v.C23030c mo34970i(int i, C23027v.C23030c cVar, boolean z, long j) {
            return this.f62118b.mo34970i(i, cVar, z, j);
        }

        /* renamed from: j */
        public int mo35006j() {
            return this.f62118b.mo35006j();
        }
    }

    /* renamed from: p7.m$c */
    public static final class C21946c extends C21918a {

        /* renamed from: c */
        public final C23027v f62119c;

        /* renamed from: d */
        public final int f62120d;

        /* renamed from: e */
        public final int f62121e;

        /* renamed from: f */
        public final int f62122f;

        public C21946c(C23027v vVar, int i) {
            super(i);
            this.f62119c = vVar;
            int f = vVar.mo35005f();
            this.f62120d = f;
            this.f62121e = vVar.mo35006j();
            this.f62122f = i;
            C20528a.m22241e(i <= Integer.MAX_VALUE / f, "LoopingMediaSource contains too many periods");
        }

        /* renamed from: f */
        public int mo35005f() {
            return this.f62120d * this.f62122f;
        }

        /* renamed from: j */
        public int mo35006j() {
            return this.f62121e * this.f62122f;
        }
    }

    public C21943m(C21949o oVar, int i) {
        C20528a.m22237a(i > 0);
        this.f62113d = oVar;
        this.f62114e = i;
    }

    /* renamed from: a */
    public void mo34999a(C21947n nVar) {
        this.f62113d.mo34999a(nVar);
    }

    /* renamed from: b */
    public void mo35000b() {
        this.f62113d.mo35000b();
    }

    /* renamed from: d */
    public C21947n mo35002d(C21949o.C21951b bVar, C16870b bVar2) {
        return this.f62114e != Integer.MAX_VALUE ? this.f62113d.mo35002d(new C21949o.C21951b(bVar.f62123a % this.f62115f, -1, -1), bVar2) : this.f62113d.mo35002d(bVar, bVar2);
    }

    /* renamed from: e */
    public void mo35003e(C22998f fVar, boolean z, C21949o.C21950a aVar) {
        this.f62113d.mo35003e(fVar, false, new C21944a(aVar));
    }

    /* renamed from: f */
    public void mo35004f() {
        this.f62113d.mo35004f();
    }
}
