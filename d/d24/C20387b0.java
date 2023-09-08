package d24;

import d24.C20419r;
import java.io.Closeable;

/* renamed from: d24.b0 */
public final class C20387b0 implements Closeable {

    /* renamed from: d */
    public final C20431y f57125d;

    /* renamed from: e */
    public final C116554w f57126e;

    /* renamed from: f */
    public final int f57127f;

    /* renamed from: g */
    public final String f57128g;

    /* renamed from: h */
    public final C20418q f57129h;

    /* renamed from: i */
    public final C20419r f57130i;

    /* renamed from: j */
    public final C20399d0 f57131j;

    /* renamed from: n */
    public final C20387b0 f57132n;

    /* renamed from: o */
    public final C20387b0 f57133o;

    /* renamed from: p */
    public final C20387b0 f57134p;

    /* renamed from: q */
    public final long f57135q;

    /* renamed from: r */
    public final long f57136r;

    /* renamed from: s */
    public volatile C20397d f57137s;

    public C20387b0(C20388a aVar) {
        this.f57125d = aVar.f57138a;
        this.f57126e = aVar.f57139b;
        this.f57127f = aVar.f57140c;
        this.f57128g = aVar.f57141d;
        this.f57129h = aVar.f57142e;
        C20419r.C20420a aVar2 = aVar.f57143f;
        aVar2.getClass();
        this.f57130i = new C20419r(aVar2);
        this.f57131j = aVar.f57144g;
        this.f57132n = aVar.f57145h;
        this.f57133o = aVar.f57146i;
        this.f57134p = aVar.f57147j;
        this.f57135q = aVar.f57148k;
        this.f57136r = aVar.f57149l;
    }

    /* renamed from: a */
    public C20397d mo31885a() {
        C20397d dVar = this.f57137s;
        if (dVar != null) {
            return dVar;
        }
        C20397d a = C20397d.m21952a(this.f57130i);
        this.f57137s = a;
        return a;
    }

    /* renamed from: b */
    public String mo31886b(String str) {
        String c = this.f57130i.mo31926c(str);
        if (c != null) {
            return c;
        }
        return null;
    }

    public void close() {
        C20399d0 d0Var = this.f57131j;
        if (d0Var != null) {
            d0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public String toString() {
        return "Response{protocol=" + this.f57126e + ", code=" + this.f57127f + ", message=" + this.f57128g + ", url=" + this.f57125d.f57340a + '}';
    }

    /* renamed from: d24.b0$a */
    public static class C20388a {

        /* renamed from: a */
        public C20431y f57138a;

        /* renamed from: b */
        public C116554w f57139b;

        /* renamed from: c */
        public int f57140c;

        /* renamed from: d */
        public String f57141d;

        /* renamed from: e */
        public C20418q f57142e;

        /* renamed from: f */
        public C20419r.C20420a f57143f;

        /* renamed from: g */
        public C20399d0 f57144g;

        /* renamed from: h */
        public C20387b0 f57145h;

        /* renamed from: i */
        public C20387b0 f57146i;

        /* renamed from: j */
        public C20387b0 f57147j;

        /* renamed from: k */
        public long f57148k;

        /* renamed from: l */
        public long f57149l;

        public C20388a() {
            this.f57140c = -1;
            this.f57143f = new C20419r.C20420a();
        }

        /* renamed from: a */
        public C20387b0 mo31889a() {
            if (this.f57138a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f57139b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f57140c < 0) {
                throw new IllegalStateException("code < 0: " + this.f57140c);
            } else if (this.f57141d != null) {
                return new C20387b0(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }

        /* renamed from: b */
        public final void mo31890b(String str, C20387b0 b0Var) {
            if (b0Var.f57131j != null) {
                throw new IllegalArgumentException(str + ".body != null");
            } else if (b0Var.f57132n != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            } else if (b0Var.f57133o != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            } else if (b0Var.f57134p != null) {
                throw new IllegalArgumentException(str + ".priorResponse != null");
            }
        }

        public C20388a(C20387b0 b0Var) {
            this.f57140c = -1;
            this.f57138a = b0Var.f57125d;
            this.f57139b = b0Var.f57126e;
            this.f57140c = b0Var.f57127f;
            this.f57141d = b0Var.f57128g;
            this.f57142e = b0Var.f57129h;
            this.f57143f = b0Var.f57130i.mo31928e();
            this.f57144g = b0Var.f57131j;
            this.f57145h = b0Var.f57132n;
            this.f57146i = b0Var.f57133o;
            this.f57147j = b0Var.f57134p;
            this.f57148k = b0Var.f57135q;
            this.f57149l = b0Var.f57136r;
        }
    }
}
