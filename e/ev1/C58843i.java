package ev1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashSet;
import java.util.concurrent.ConcurrentLinkedQueue;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: ev1.i */
public final class C58843i {

    /* renamed from: c */
    public static final C58845b f168452c = new C58845b((C8480h) null);

    /* renamed from: d */
    public static final C13601g<C58843i> f168453d = C36568h.m40985a(C58844a.f168456d);

    /* renamed from: a */
    public final ConcurrentLinkedQueue<C58838a> f168454a = new ConcurrentLinkedQueue<>();

    /* renamed from: b */
    public final HashSet<String> f168455b = new HashSet<>();

    /* renamed from: ev1.i$a */
    public static final class C58844a extends C87413o implements C32224a<C58843i> {

        /* renamed from: d */
        public static final C58844a f168456d = new C58844a();

        public C58844a() {
            super(0);
        }

        public Object invoke() {
            return new C58843i();
        }
    }

    /* renamed from: ev1.i$b */
    public static final class C58845b {
        public C58845b(C8480h hVar) {
        }

        /* renamed from: a */
        public final C58843i mo84050a() {
            return (C58843i) ((C36570n) C58843i.f168453d).getValue();
        }
    }

    /* renamed from: a */
    public final void mo84049a(C58838a aVar) {
        C87412m.m108594g(aVar, "item");
        if (this.f168455b.contains(aVar.f168434d)) {
            Log.m105924i("ForceNotifyItemMgr", "add info failed, historyIdSet contains " + aVar.f168434d);
            return;
        }
        this.f168454a.offer(aVar);
        this.f168455b.add(aVar.f168434d);
    }
}
