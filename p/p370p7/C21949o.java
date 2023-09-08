package p370p7;

import com.tencent.p014mm.plugin.appbrand.jsapi.C1883v2;
import p300c8.C16870b;
import p396x6.C22998f;
import p396x6.C23027v;

/* renamed from: p7.o */
public interface C21949o {

    /* renamed from: p7.o$a */
    public interface C21950a {
        /* renamed from: c */
        void mo35001c(C23027v vVar, Object obj);
    }

    /* renamed from: p7.o$b */
    public static final class C21951b {

        /* renamed from: a */
        public final int f62123a;

        /* renamed from: b */
        public final int f62124b;

        /* renamed from: c */
        public final int f62125c;

        public C21951b(int i, int i2, int i3) {
            this.f62123a = i;
            this.f62124b = i2;
            this.f62125c = i3;
        }

        /* renamed from: a */
        public boolean mo35017a() {
            return this.f62124b != -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C21951b.class != obj.getClass()) {
                return false;
            }
            C21951b bVar = (C21951b) obj;
            return this.f62123a == bVar.f62123a && this.f62124b == bVar.f62124b && this.f62125c == bVar.f62125c;
        }

        public int hashCode() {
            return ((((C1883v2.CTRL_INDEX + this.f62123a) * 31) + this.f62124b) * 31) + this.f62125c;
        }
    }

    /* renamed from: a */
    void mo34999a(C21947n nVar);

    /* renamed from: b */
    void mo35000b();

    /* renamed from: d */
    C21947n mo35002d(C21951b bVar, C16870b bVar2);

    /* renamed from: e */
    void mo35003e(C22998f fVar, boolean z, C21950a aVar);

    /* renamed from: f */
    void mo35004f();
}
