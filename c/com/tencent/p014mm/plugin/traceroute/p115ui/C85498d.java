package com.tencent.p014mm.plugin.traceroute.p115ui;

import b13.C79646a;
import b13.C79661d;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import eb0.C75576f4;
import eb0.C75592q0;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tencent.mm.plugin.traceroute.ui.d */
public class C85498d implements C75576f4.C75578b {

    /* renamed from: a */
    public final /* synthetic */ NetworkDiagnoseUI f249161a;

    /* renamed from: com.tencent.mm.plugin.traceroute.ui.d$a */
    public class C85499a implements C79646a.C79651e {
        public C85499a() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.traceroute.ui.d$b */
    public class C85500b implements C79646a.C79652f {
        public C85500b() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.traceroute.ui.d$c */
    public class C85501c implements C79646a.C79649c {
        public C85501c() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.traceroute.ui.d$d */
    public class C85502d implements C79646a.C79650d {
        public C85502d() {
        }
    }

    public C85498d(NetworkDiagnoseUI networkDiagnoseUI) {
        this.f249161a = networkDiagnoseUI;
    }

    /* renamed from: a */
    public void mo57753a(C114770g gVar) {
        if (gVar != null) {
            String s = C75592q0.m90789s();
            this.f249161a.f249151f = new C79646a(s);
            this.f249161a.f249151f.mo109776c(gVar.mo55446E5(true), true);
            this.f249161a.f249151f.mo109776c(gVar.mo55446E5(false), false);
            C79646a aVar = this.f249161a.f249151f;
            aVar.f233545f = new C85499a();
            aVar.f233544e = new C85500b();
            aVar.f233547h = new C85501c();
            aVar.f233546g = new C85502d();
            Map<String, Set<Integer>> map = aVar.f233542c;
            if (map == null || ((HashMap) map).size() == 0) {
                Log.m105920e("MicroMsg.MMTraceRoute", "no iplist");
            } else {
                if (C79646a.f233539j == null) {
                    C79646a.f233539j = new C79661d();
                }
                ThreadPool.post(new C79646a.C79657k((C79646a.C79647a) null), "MMTraceRoute_start");
            }
            this.f249161a.f249154i.startTimer(1200);
        }
    }
}
