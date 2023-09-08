package sx2;

import android.content.Context;
import android.os.Looper;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import dd0.C45323b;
import dd0.C75345c;
import dd0.C75350g;
import di3.C86301e;
import di3.C86312j;
import eb0.C75592q0;
import ei3.C86522b;
import f40.C86709a0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p446av.C67110f;
import qx2.C47888a;
import qx2.C47889b;
import te3.gf4;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: sx2.d */
public class C118318d extends C86301e implements C67110f {

    /* renamed from: d */
    public C118325m f353600d;

    /* renamed from: e */
    public C118322g f353601e = new C118322g();

    /* renamed from: f */
    public C48497j f353602f;

    /* renamed from: g */
    public C118324l f353603g;

    /* renamed from: h */
    public C29060q f353604h = new C118319a();

    /* renamed from: sx2.d$a */
    public class C118319a extends C29060q.C29061a {

        /* renamed from: sx2.d$a$a */
        public class C118320a implements Runnable {
            public C118320a() {
            }

            public void run() {
                C118325m mVar = C118318d.this.f353600d;
                if (mVar != null) {
                    mVar.mo183123p(false);
                }
            }
        }

        public C118319a() {
        }

        public void onNetworkChange(int i) {
            if (i == 4) {
                new MMHandler(Looper.getMainLooper()).post(new C118320a());
            }
        }
    }

    public static C118318d vx0() {
        return (C118318d) C86312j.m106911c(C118318d.class);
    }

    public static C118322g wx0() {
        return vx0().f353601e;
    }

    public static C118324l xx0() {
        if (vx0().f353603g == null) {
            vx0().f353603g = new C118324l();
        }
        return vx0().f353603g;
    }

    public static C118325m yx0() {
        if (vx0().f353600d == null) {
            C29060q qVar = vx0().f353604h;
            C86709a0.m107528h();
            C86709a0.m107529k().mo121126a(qVar);
            vx0().f353600d = new C118325m();
        }
        return vx0().f353600d;
    }

    public static C48497j zx0() {
        if (vx0().f353602f == null) {
            vx0().f353602f = new C48497j();
        }
        return vx0().f353602f;
    }

    /* renamed from: Nb */
    public C45323b mo91210Nb() {
        return zx0();
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        C48497j jVar = (C48497j) C75350g.m90357a();
        synchronized (jVar) {
            LinkedList<C47888a> linkedList = new LinkedList<>();
            LinkedList<C47888a> linkedList2 = jVar.f129703b.f128488d;
            if (linkedList2 != null && !linkedList2.isEmpty()) {
                for (C47888a aVar : (C47888a[]) jVar.f129703b.f128488d.toArray(new C47888a[0])) {
                    if (!Util.isNullOrNil((List) aVar.f128486e)) {
                        Iterator<gf4> it = aVar.f128486e.iterator();
                        boolean z = true;
                        while (it.hasNext()) {
                            gf4 next = it.next();
                            Log.m105918d("MicroMsg.TalkRoomInfoListMgr", "member :" + next);
                            if (next.f134027e.equals(C75592q0.m90789s())) {
                                Log.m105924i("MicroMsg.TalkRoomInfoListMgr", "reset list info and remove self location info");
                                z = false;
                            }
                        }
                        if (z) {
                            linkedList.add(aVar);
                        }
                    }
                }
            }
            C47889b bVar = new C47889b();
            bVar.f128488d = linkedList;
            jVar.mo73131e(bVar);
        }
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        C29060q qVar = this.f353604h;
        C86709a0.m107528h();
        C86709a0.m107529k().mo121129d(qVar);
        C118325m mVar = this.f353600d;
        if (mVar != null) {
            mVar.mo183116i();
            this.f353600d = null;
        }
    }

    /* renamed from: vt */
    public C75345c mo91211vt() {
        return yx0();
    }
}
