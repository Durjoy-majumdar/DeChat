package v60;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import p823sg.C101611g;
import q90.C101062d;
import u60.C65220d;
import w60.C102354f;

/* renamed from: v60.a */
public final class C102152a implements C65550c {

    /* renamed from: a */
    public final int f300808a;

    /* renamed from: b */
    public final C102354f<String, C102153a> f300809b = new C102354f<>(100);

    /* renamed from: v60.a$a */
    public final class C102153a {

        /* renamed from: a */
        public long f300810a;

        /* renamed from: b */
        public int f300811b;

        public C102153a(C102152a aVar, long j, int i) {
            this.f300810a = j;
            this.f300811b = i;
        }
    }

    public C102152a(int i, int i2) {
        this.f300808a = i;
    }

    /* renamed from: a */
    public boolean mo89636a(C65220d dVar) {
        boolean check;
        C87412m.m108594g(dVar, "task");
        C102354f<String, C102153a> fVar = this.f300809b;
        String d = dVar.mo11854d();
        synchronized (fVar) {
            C101611g<K, V> gVar = fVar.f301454a;
            if (gVar != null) {
                check = ((C101062d) gVar).check(d);
            } else {
                throw new NullPointerException("mData == null");
            }
        }
        if (check) {
            long nowSecond = Util.nowSecond();
            C102354f<String, C102153a> fVar2 = this.f300809b;
            String d2 = dVar.mo11854d();
            C101611g<K, V> gVar2 = fVar2.f301454a;
            if (gVar2 != null) {
                C102153a aVar = (C102153a) ((C101062d) gVar2).mo139556b(d2);
                if (aVar.f300811b < this.f300808a || nowSecond - aVar.f300810a >= ((long) Integer.MAX_VALUE)) {
                    if (nowSecond - aVar.f300810a > ((long) Integer.MAX_VALUE)) {
                        Log.m105926v("DefaultRetrySg", "reset: " + dVar.mo11854d());
                        aVar = new C102153a(this, nowSecond, 0);
                    }
                    aVar.f300811b++;
                    aVar.f300810a = nowSecond;
                    this.f300809b.mo141921a(dVar.mo11854d(), aVar);
                } else {
                    Log.m105928w("DefaultRetrySg", "check block by recentdown: " + dVar.mo11854d() + " count " + aVar.f300811b + "  time: " + (nowSecond - aVar.f300810a));
                    return false;
                }
            } else {
                throw new NullPointerException("mData == null");
            }
        } else {
            this.f300809b.mo141921a(dVar.mo11854d(), new C102153a(this, Util.nowSecond(), 1));
        }
        return true;
    }
}
