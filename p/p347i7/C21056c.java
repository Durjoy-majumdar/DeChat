package p347i7;

import p294b7.C16738b;
import p294b7.C16742f;
import p333e8.C20528a;
import p333e8.C20541m;
import p333e8.C20551y;
import p396x6.C23015n;

/* renamed from: i7.c */
public final class C21056c {

    /* renamed from: i7.c$a */
    public static final class C21057a {

        /* renamed from: a */
        public final int f59575a;

        /* renamed from: b */
        public final long f59576b;

        public C21057a(int i, long j) {
            this.f59575a = i;
            this.f59576b = j;
        }

        /* renamed from: a */
        public static C21057a m23244a(C16742f fVar, C20541m mVar) {
            ((C16738b) fVar).mo17734b(mVar.f57809a, 0, 8, false);
            mVar.mo32113x(0);
            return new C21057a(mVar.mo32092c(), mVar.mo32095f());
        }
    }

    /* renamed from: a */
    public static C21055b m23243a(C16742f fVar) {
        fVar.getClass();
        C20541m mVar = new C20541m(16);
        if (C21057a.m23244a(fVar, mVar).f59575a != C20551y.m22316f("RIFF")) {
            return null;
        }
        C16738b bVar = (C16738b) fVar;
        bVar.mo17734b(mVar.f57809a, 0, 4, false);
        mVar.mo32113x(0);
        if (mVar.mo32092c() != C20551y.m22316f("WAVE")) {
            return null;
        }
        C21057a a = C21057a.m23244a(fVar, mVar);
        while (a.f59575a != C20551y.m22316f("fmt ")) {
            bVar.mo17733a((int) a.f59576b, false);
            a = C21057a.m23244a(fVar, mVar);
        }
        C20528a.m22240d(a.f59576b >= 16);
        bVar.mo17734b(mVar.f57809a, 0, 16, false);
        mVar.mo32113x(0);
        int h = mVar.mo32097h();
        int h2 = mVar.mo32097h();
        int g = mVar.mo32096g();
        int g2 = mVar.mo32096g();
        int h3 = mVar.mo32097h();
        int h4 = mVar.mo32097h();
        int i = (h2 * h4) / 8;
        if (h3 == i) {
            int g3 = C20551y.m22317g(h4);
            if (g3 == 0) {
                return null;
            }
            if (h != 1 && h != 65534) {
                return null;
            }
            bVar.mo17733a(((int) a.f59576b) - 16, false);
            return new C21055b(h2, g, g2, h3, h4, g3);
        }
        throw new C23015n("Expected block alignment: " + i + "; got: " + h3);
    }
}
