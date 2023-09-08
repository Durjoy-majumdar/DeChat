package yd0;

import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import sd0.C22355a;
import sd0.C22357b;
import xd0.C23084k;

/* renamed from: yd0.a */
public abstract class C23283a implements C23295f {

    /* renamed from: a */
    public String f66921a;

    /* renamed from: b */
    public boolean f66922b;

    /* renamed from: c */
    public boolean f66923c;

    /* renamed from: d */
    public boolean f66924d;

    /* renamed from: yd0.a$a */
    public static final class C23284a implements C22357b.C22358b {

        /* renamed from: d */
        public C22357b.C22358b f66925d;

        /* renamed from: e */
        public WeakReference<C23283a> f66926e;

        public C23284a(C23283a aVar, C22357b.C22358b bVar, C22357b bVar2) {
            C87412m.m108594g(aVar, "task");
            C87412m.m108594g(bVar2, "netScene");
            this.f66925d = bVar;
            this.f66926e = new WeakReference<>(aVar);
        }

        /* renamed from: a */
        public void mo17818a(int i, int i2, String str, SubscribeMsgRequestResult subscribeMsgRequestResult) {
            C87412m.m108594g(str, "errMsg");
            C23283a aVar = this.f66926e.get();
            if (aVar != null) {
                C23084k.f66311a.mo36491a(aVar);
            }
            C22357b.C22358b bVar = this.f66925d;
            if (bVar != null) {
                bVar.mo17818a(i, i2, str, subscribeMsgRequestResult);
            }
        }
    }

    public C23283a(String str) {
        C87412m.m108594g(str, "bizUsername");
        this.f66921a = str;
    }

    /* renamed from: a */
    public void mo36762a() {
        this.f66924d = true;
    }

    /* renamed from: b */
    public String mo36763b() {
        return String.valueOf(hashCode());
    }

    /* renamed from: c */
    public final void mo36764c(C22357b bVar) {
        C87412m.m108594g(bVar, "netScene");
        bVar.f63381f = new C23284a(this, bVar.f63381f, bVar);
        bVar.mo35487b(C22355a.f63371a);
    }
}
