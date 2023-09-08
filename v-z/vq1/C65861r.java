package vq1;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fe1.C58961d;
import fe1.C58969q;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import je1.C60811w;
import te3.C49712hj1;
import te3.C64414h71;
import u60.C65222f;
import v60.C102152a;
import v60.C102156f;
import v60.C102157g;

/* renamed from: vq1.r */
public final class C65861r {

    /* renamed from: e */
    public static final C65861r f189395e = new C65861r();

    /* renamed from: a */
    public C65222f<C65863s> f189396a = new C65222f<>(new C102156f(new C102152a(100, Integer.MAX_VALUE), new C102157g(1, 5), 1, "finder_action_follow_post_quene"));

    /* renamed from: b */
    public final ConcurrentLinkedQueue<C14961i> f189397b = new ConcurrentLinkedQueue<>();

    /* renamed from: c */
    public final ConcurrentHashMap<String, C65859p> f189398c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public final Runnable f189399d = new C65862a(this);

    /* renamed from: vq1.r$a */
    public static final class C65862a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C65861r f189400d;

        public C65862a(C65861r rVar) {
            this.f189400d = rVar;
        }

        public final void run() {
            this.f189400d.mo89901e();
        }
    }

    /* renamed from: b */
    public static boolean m77586b(C65861r rVar, String str, boolean z, boolean z2, int i, Object obj) {
        boolean z3 = false;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        rVar.getClass();
        if (str != null && !C87412m.m108589b(str, "")) {
            C58961d.C58963b bVar = C58961d.f168673a;
            boolean h = C58961d.C58963b.m68836h(bVar, str, (String) null, z, z2, 2, (Object) null);
            C65859p pVar = rVar.f189398c.get(str);
            if (pVar != null) {
                int i2 = pVar.f189385d;
                int i3 = C60811w.f173196u;
                if (i2 == 1 && !pVar.f189388g) {
                    z3 = true;
                }
            } else {
                z3 = h;
            }
            if (BuildInfo.DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append("isFollow test ");
                sb.append(str);
                sb.append(" optype:");
                C65859p pVar2 = rVar.f189398c.get(str);
                sb.append(pVar2 != null ? Integer.valueOf(pVar2.f189385d) : null);
                sb.append(" followFlag:");
                sb.append(C58961d.C58963b.m68836h(bVar, str, (String) null, z, z2, 2, (Object) null));
                sb.append(" result:");
                sb.append(z3);
                Log.m105924i("Finder.FollowActionMgr", sb.toString());
            }
        }
        return z3;
    }

    /* renamed from: a */
    public final void mo89898a(String str, int i, long j, C49712hj1 hj12, boolean z, int i2, String str2, C64414h71 h712, Integer num) {
        String str3 = str;
        int i3 = i;
        C87412m.m108594g(str3, "finderUser");
        String str4 = str2;
        C87412m.m108594g(str4, "participantFinderUsername");
        StringBuilder sb = new StringBuilder();
        sb.append("doFollow ");
        sb.append(str3);
        sb.append(' ');
        sb.append(i3);
        sb.append(", feedId = ");
        long j2 = j;
        sb.append(j2);
        Log.m105924i("Finder.FollowActionMgr", sb.toString());
        C65859p pVar = new C65859p(str, i, j2, hj12, z, i2, str4, h712, num);
        this.f189398c.put(str3, pVar);
        this.f189396a.mo89349c(new C65863s(pVar), new C65860q(this, pVar));
        ((C14967t) C86312j.m106911c(C14967t.class)).mo14013LZ(1, str3, i3 == 2);
    }

    /* renamed from: c */
    public final boolean mo89899c(String str) {
        boolean z = false;
        if (str == null || C87412m.m108589b(str, "")) {
            return false;
        }
        C58961d.C58963b bVar = C58961d.f168673a;
        bVar.getClass();
        C58969q b = bVar.mo84155b(str);
        boolean z2 = b != null && b.field_follow_Flag == C58969q.f168706b2;
        C65859p pVar = this.f189398c.get(str);
        if (pVar != null) {
            int i = pVar.f189385d;
            int i2 = C60811w.f173196u;
            z2 = i == 1 && pVar.f189388g;
        }
        if (BuildInfo.DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("isWaiting test ");
            sb.append(str);
            sb.append(" optype:");
            C65859p pVar2 = this.f189398c.get(str);
            sb.append(pVar2 != null ? Integer.valueOf(pVar2.f189385d) : null);
            sb.append(" waitingFlag:");
            C58969q b2 = bVar.mo84155b(str);
            if (b2 != null && b2.field_follow_Flag == C58969q.f168706b2) {
                z = true;
            }
            sb.append(z);
            sb.append(" result:");
            sb.append(z2);
            Log.m105924i("Finder.FollowActionMgr", sb.toString());
        }
        return z2;
    }

    /* renamed from: d */
    public final void mo89900d(C65859p pVar) {
        C87412m.m108594g(pVar, "action");
        C65859p pVar2 = this.f189398c.get(pVar.f189384c);
        if (pVar2 != null) {
            if (BuildInfo.DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append("removeFollowCache ");
                sb.append(pVar);
                sb.append(" result ");
                sb.append(pVar.f41018b >= pVar2.f41018b);
                Log.m105924i("Finder.FollowActionMgr", sb.toString());
            }
            if (pVar.f41018b >= pVar2.f41018b) {
                this.f189398c.remove(pVar.f189384c);
            }
        }
    }

    /* renamed from: e */
    public final void mo89901e() {
        if (this.f189397b.size() > 0) {
            C14961i poll = this.f189397b.poll();
            boolean b = poll.mo14011b();
            Log.m105924i("Finder.FollowActionMgr", "tryNext isValid:" + b + " action:" + poll + " size:" + this.f189397b.size());
            if (!b) {
                mo89901e();
            } else {
                this.f189396a.mo89349c(new C65863s(poll), new C65860q(this, poll));
            }
        }
    }
}
