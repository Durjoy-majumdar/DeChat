package vq1;

import com.tencent.p014mm.plugin.finder.feed.model.C2815r0;
import com.tencent.p014mm.plugin.finder.view.FinderWordingLayout;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import u60.C65222f;
import v60.C102152a;
import v60.C102156f;
import v60.C102157g;

/* renamed from: vq1.b0 */
public final class C14951b0 {

    /* renamed from: g */
    public static final C14951b0 f40992g = new C14951b0();

    /* renamed from: a */
    public C65222f<C14955d0> f40993a = new C65222f<>(new C102156f(new C102152a(100, Integer.MAX_VALUE), new C102157g(1, 5), 1, "finder_action_wording_like_post_quene"));

    /* renamed from: b */
    public final ConcurrentLinkedQueue<C14961i> f40994b = new ConcurrentLinkedQueue<>();

    /* renamed from: c */
    public final ConcurrentHashMap<C14952a, C14958f0> f40995c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public final ConcurrentHashMap<Long, FinderWordingLayout.C3984a> f40996d;

    /* renamed from: e */
    public final ConcurrentHashMap<C14952a, Boolean> f40997e;

    /* renamed from: f */
    public final Runnable f40998f;

    /* renamed from: vq1.b0$a */
    public static final class C14952a {

        /* renamed from: a */
        public final long f40999a;

        /* renamed from: b */
        public final long f41000b;

        public C14952a(long j, long j2) {
            this.f40999a = j;
            this.f41000b = j2;
        }

        public boolean equals(Object obj) {
            C14952a aVar = obj instanceof C14952a ? (C14952a) obj : null;
            return aVar != null && aVar.f40999a == this.f40999a && aVar.f41000b == this.f41000b;
        }

        public int hashCode() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f40999a);
            sb.append('_');
            sb.append(this.f41000b);
            return sb.toString().hashCode();
        }
    }

    /* renamed from: vq1.b0$b */
    public static final class C14953b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C14951b0 f41001d;

        public C14953b(C14951b0 b0Var) {
            this.f41001d = b0Var;
        }

        public final void run() {
            this.f41001d.mo14002d();
        }
    }

    public C14951b0() {
        new ConcurrentHashMap();
        this.f40996d = new ConcurrentHashMap<>();
        this.f40997e = new ConcurrentHashMap<>();
        this.f40998f = new C14953b(this);
    }

    /* renamed from: a */
    public final boolean mo13999a(C2815r0 r0Var) {
        C87412m.m108594g(r0Var, "wordingItem");
        long j = r0Var.f131802d;
        boolean z = false;
        if (j == 0) {
            return r0Var.f131805g == 1;
        }
        if (r0Var.f131805g == 1) {
            z = true;
        }
        C14958f0 f0Var = this.f40995c.get(new C14952a(r0Var.f14070h, j));
        return f0Var != null ? f0Var.f41010d : z;
    }

    /* renamed from: b */
    public final void mo14000b(C14960h0 h0Var) {
        C87412m.m108594g(h0Var, "action");
        C2815r0 r0Var = h0Var.f41014c;
        C14952a aVar = new C14952a(r0Var.f14070h, r0Var.f131802d);
        if (this.f40997e.get(aVar) != null) {
            if (BuildInfo.DEBUG) {
                Log.m105924i("Finder.WordingActionMgr", "removeLikeCache " + h0Var + " result true");
            }
            Boolean remove = this.f40997e.remove(aVar);
        }
    }

    /* renamed from: c */
    public final void mo14001c(C14958f0 f0Var) {
        C87412m.m108594g(f0Var, "action");
        C2815r0 r0Var = f0Var.f41009c;
        C14952a aVar = new C14952a(r0Var.f14070h, r0Var.f131802d);
        C14958f0 f0Var2 = this.f40995c.get(aVar);
        if (f0Var2 != null) {
            if (BuildInfo.DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append("removeLikeCache ");
                sb.append(f0Var);
                sb.append(" result ");
                sb.append(f0Var.f41018b >= f0Var2.f41018b);
                Log.m105924i("Finder.WordingActionMgr", sb.toString());
            }
            if (f0Var.f41018b >= f0Var2.f41018b) {
                this.f40995c.remove(aVar);
            }
        }
    }

    /* renamed from: d */
    public final void mo14002d() {
        if (this.f40994b.size() > 0) {
            C14961i poll = this.f40994b.poll();
            boolean b = poll.mo14011b();
            Log.m105924i("Finder.WordingActionMgr", "tryNext isValid:" + b + " action:" + poll + " size:" + this.f40994b.size());
            if (!b) {
                mo14002d();
            } else {
                this.f40993a.mo89349c(new C14955d0(poll), new C14954c0(this, poll));
            }
        }
    }
}
