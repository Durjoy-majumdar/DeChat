package p276y9;

import java.util.ArrayList;
import p1224z9.C119086a;
import p1224z9.C119087b;

/* renamed from: y9.h */
public abstract class C26632h {

    /* renamed from: d */
    public final long f74093d;

    /* renamed from: e */
    public long f74094e;

    /* renamed from: f */
    public C26630f f74095f;

    /* renamed from: g */
    public int f74096g;

    public C26632h(long j, C26636m mVar) {
        new ArrayList();
        this.f74093d = j;
    }

    /* renamed from: a */
    public C119086a mo53630a() {
        return this.f74095f.f74087i.f74116a;
    }

    /* renamed from: b */
    public C26628c mo53605b() {
        return this.f74095f.f74087i.mo53635b(this.f74094e);
    }

    /* renamed from: c */
    public int mo53606c() {
        return this.f74096g;
    }

    /* renamed from: e */
    public long mo53631e() {
        C26635k kVar = this.f74095f.f74087i;
        C23282o oVar = C23282o.OBJECT;
        int i = kVar.f74120e[2];
        if (i == 1) {
            return (long) ((C119087b) mo53630a()).mo183757c();
        }
        if (i == 2) {
            return (long) ((C119087b) mo53630a()).mo183760f();
        }
        if (i == 4) {
            return (long) ((C119087b) mo53630a()).mo183758d();
        }
        if (i != 8) {
            return 0;
        }
        return ((C119087b) mo53630a()).mo183759e();
    }

    /* renamed from: f */
    public Object mo53632f(C23282o oVar) {
        switch (oVar.ordinal()) {
            case 0:
                return this.f74095f.f74087i.mo53637d(mo53631e());
            case 1:
                return Boolean.valueOf(((C119087b) mo53630a()).mo183757c() != 0);
            case 2:
                C119087b bVar = (C119087b) mo53630a();
                char c = bVar.f356636d[bVar.mo183755a()].getChar(bVar.mo183756b());
                bVar.f356638f += 2;
                return Character.valueOf(c);
            case 3:
                C119087b bVar2 = (C119087b) mo53630a();
                float f = bVar2.f356636d[bVar2.mo183755a()].getFloat(bVar2.mo183756b());
                bVar2.f356638f += 4;
                return Float.valueOf(f);
            case 4:
                C119087b bVar3 = (C119087b) mo53630a();
                double d = bVar3.f356636d[bVar3.mo183755a()].getDouble(bVar3.mo183756b());
                bVar3.f356638f += 8;
                return Double.valueOf(d);
            case 5:
                return Byte.valueOf(((C119087b) mo53630a()).mo183757c());
            case 6:
                return Short.valueOf(((C119087b) mo53630a()).mo183760f());
            case 7:
                return Integer.valueOf(((C119087b) mo53630a()).mo183758d());
            case 8:
                return Long.valueOf(((C119087b) mo53630a()).mo183759e());
            default:
                return null;
        }
    }
}
