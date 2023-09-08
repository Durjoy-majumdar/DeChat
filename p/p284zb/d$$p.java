package p284zb;

import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.plugin.appbrand.utils.C84754j1;
import java.util.concurrent.atomic.AtomicInteger;
import p1044ub.C90636f;

/* renamed from: zb.d$$p */
public class d$$p implements C84754j1.C84757c {

    /* renamed from: a */
    public final String f262584a;

    /* renamed from: b */
    public final C91635f f262585b;

    /* renamed from: c */
    public int f262586c = 0;

    /* renamed from: d */
    public boolean f262587d = false;

    /* renamed from: e */
    public C80669j.C80676g f262588e = null;

    /* renamed from: f */
    public final AtomicInteger f262589f = new AtomicInteger(2);

    /* renamed from: g */
    public final long f262590g;

    public d$$p(String str, C91635f fVar, d$$h d__h) {
        this.f262584a = str;
        this.f262585b = fVar;
        this.f262590g = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo117481a(C80669j.C80676g gVar) {
        this.f262588e = gVar;
        this.f262586c = gVar.sourceLength;
        mo125515c();
    }

    /* renamed from: b */
    public void mo114825b(String str) {
        this.f262587d = false;
        mo125515c();
    }

    /* renamed from: c */
    public final void mo125515c() {
        if (this.f262589f.decrementAndGet() == 0) {
            C80669j.C80676g gVar = this.f262588e;
            long j = gVar == null ? this.f262590g : gVar.f236058a;
            long currentTimeMillis = gVar == null ? System.currentTimeMillis() : gVar.f236059b;
            C90636f.C90637a aVar = new C90636f.C90637a();
            aVar.f260398i = this.f262584a;
            aVar.f260400k = (long) this.f262586c;
            this.f262585b.mo122648L0(aVar, this.f262587d, j, currentTimeMillis, this.f262588e);
        }
    }

    public void onSuccess(String str) {
        this.f262587d = true;
        mo125515c();
    }
}
