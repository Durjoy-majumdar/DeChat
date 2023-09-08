package oe3;

import bw1.C28430a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import dw1.C31315a;
import dw1.C31320g;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import o40.C61926c;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;

/* renamed from: oe3.a */
public final class C35156a extends C31315a {

    /* renamed from: d */
    public final String f94284d = "FinderLiveNoticeMsgItemProcessor";

    /* renamed from: e */
    public final long f94285e = 1000;

    /* renamed from: f */
    public final ArrayList<C13604l<C28430a, C31320g>> f94286f = new ArrayList<>();

    /* renamed from: oe3.a$a */
    public static final class C35157a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C35156a f94287d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35157a(C35156a aVar) {
            super(0);
            this.f94287d = aVar;
        }

        public Object invoke() {
            C35156a aVar = this.f94287d;
            synchronized (aVar.f94286f) {
                C13604l lVar = (C13604l) C110818d0.m150925W(aVar.f94286f);
                if (lVar != null) {
                    String str = aVar.f94284d;
                    Log.m105918d(str, "on time expired: cmdid = " + ((C28430a) lVar.f38555d).mo55972M5() + ", funcId = " + ((C28430a) lVar.f38555d).mo55977S5());
                    C35156a.super.mo8643d(lVar);
                }
                aVar.f94286f.clear();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public void mo58071a(int i) {
        String str = this.f94284d;
        Log.m105924i(str, "[reportFetchResult] errCode = " + i);
        if (i == 0) {
            C115669n.INSTANCE.mo160131h(21158, "", "", "", 7);
            return;
        }
        C115669n.INSTANCE.mo160131h(21158, "", "", "", 8);
    }

    /* renamed from: d */
    public void mo8643d(C13604l<? extends C28430a, ? extends C31320g> lVar) {
        C87412m.m108594g(lVar, "item");
        synchronized (this.f94286f) {
            String str = this.f94284d;
            Log.m105918d(str, "add item: cmdid = " + ((C28430a) lVar.f38555d).mo55972M5() + ", funcId = " + ((C28430a) lVar.f38555d).mo55977S5());
            if (this.f94286f.isEmpty()) {
                Log.m105918d(this.f94284d, "start timer");
                C61926c.m72662G(this.f94284d, false, new C35157a(this), this.f94285e);
            }
            this.f94286f.add(lVar);
        }
    }
}
