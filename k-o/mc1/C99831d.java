package mc1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import pb1.C100734q;
import pb1.C100755z;
import qo3.C47883u;

/* renamed from: mc1.d */
public final class C99831d implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ C100755z f292532a;

    /* renamed from: b */
    public final /* synthetic */ C99841k f292533b;

    /* renamed from: mc1.d$a */
    public static final class C99832a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C99841k f292534d;

        public C99832a(C99841k kVar) {
            this.f292534d = kVar;
        }

        public final void run() {
            this.f292534d.f292547f.invoke(10);
        }
    }

    public C99831d(C100755z zVar, C99841k kVar) {
        this.f292532a = zVar;
        this.f292533b = kVar;
    }

    /* renamed from: a */
    public final void mo353a(boolean z, String str) {
        if (z) {
            Log.m105924i("MicroMsg.FavFinderFilterUI", "[handleDelete] positiveClick remove favItemInfo = " + this.f292532a.field_id);
            this.f292533b.mo139192d3();
            C100755z zVar = this.f292532a;
            C99841k kVar = this.f292533b;
            int i = kVar.f292548g;
            C99832a aVar = new C99832a(kVar);
            C87412m.m108594g(zVar, "favItemInfo");
            C100734q.m131858l(zVar, new C99829b(i, aVar), 5);
        }
    }
}
