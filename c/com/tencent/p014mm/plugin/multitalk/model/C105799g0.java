package com.tencent.p014mm.plugin.multitalk.model;

import android.util.ArrayMap;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Map;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: com.tencent.mm.plugin.multitalk.model.g0 */
public final class C105799g0 {

    /* renamed from: a */
    public C105814l f314611a;

    /* renamed from: b */
    public final ArrayMap<String, Integer> f314612b = new ArrayMap<>();

    /* renamed from: c */
    public ArrayList<String> f314613c;

    /* renamed from: d */
    public final C32226l<String, C13598b0> f314614d;

    /* renamed from: e */
    public final C32226l<String, C13598b0> f314615e;

    /* renamed from: f */
    public final C32226l<String, C13598b0> f314616f;

    /* renamed from: g */
    public final C32226l<String, C13598b0> f314617g;

    /* renamed from: h */
    public final Map<Integer, C32226l<String, C13598b0>> f314618h;

    /* renamed from: com.tencent.mm.plugin.multitalk.model.g0$a */
    public static final class C105800a extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C105799g0 f314619d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105800a(C105799g0 g0Var) {
            super(1);
            this.f314619d = g0Var;
        }

        public Object invoke(Object obj) {
            C13598b0 b0Var;
            C105814l lVar;
            String str = (String) obj;
            C87412m.m108594g(str, "wxUserName");
            Integer num = this.f314619d.f314612b.get(str);
            if (num != null) {
                C105799g0 g0Var = this.f314619d;
                if (num.intValue() == 104) {
                    Log.m105924i("MicroMsg.MultiTalkScreenCastManager", "state change from stop to default");
                } else {
                    C105814l lVar2 = g0Var.f314611a;
                    if (lVar2 != null) {
                        lVar2.mo150715d(str);
                    }
                }
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null && (lVar = this.f314619d.f314611a) != null) {
                lVar.mo150715d(str);
            }
            this.f314619d.f314612b.put(str, 100);
            if (C105851w0.zx0().f314477R0) {
                C105851w0.zx0().mo150670m().mo150710l(str, 0);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.g0$b */
    public static final class C105801b extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C105799g0 f314620d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105801b(C105799g0 g0Var) {
            super(1);
            this.f314620d = g0Var;
        }

        public Object invoke(Object obj) {
            C13598b0 b0Var;
            C105814l lVar;
            String str = (String) obj;
            C87412m.m108594g(str, "wxUserName");
            boolean z = true;
            if (this.f314620d.f314612b.get(str) != null) {
                C105799g0 g0Var = this.f314620d;
                Integer num = g0Var.f314612b.get(str);
                if (num != null && num.intValue() == 104) {
                    Log.m105920e("MicroMsg.MultiTalkScreenCastManager", "error state change from stop to pause");
                    z = false;
                } else if (num != null && num.intValue() == 102) {
                    Log.m105924i("MicroMsg.MultiTalkScreenCastManager", "state change from pause to pause");
                } else {
                    C105814l lVar2 = g0Var.f314611a;
                    if (lVar2 != null) {
                        lVar2.mo150713b(str);
                    }
                }
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null && (lVar = this.f314620d.f314611a) != null) {
                lVar.mo150713b(str);
            }
            if (z) {
                this.f314620d.f314612b.put(str, 102);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.g0$c */
    public static final class C105802c extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C105799g0 f314621d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105802c(C105799g0 g0Var) {
            super(1);
            this.f314621d = g0Var;
        }

        public Object invoke(Object obj) {
            C13598b0 b0Var;
            C105814l lVar;
            String str = (String) obj;
            C87412m.m108594g(str, "wxUserName");
            Integer num = this.f314621d.f314612b.get(str);
            if (num != null) {
                C105799g0 g0Var = this.f314621d;
                switch (num.intValue()) {
                    case 100:
                        C105814l lVar2 = g0Var.f314611a;
                        if (lVar2 != null) {
                            lVar2.mo150716e(str);
                            break;
                        }
                        break;
                    case 101:
                        Log.m105924i("MicroMsg.MultiTalkScreenCastManager", "state change from start to start");
                        break;
                    case 102:
                        C105814l lVar3 = g0Var.f314611a;
                        if (lVar3 != null) {
                            lVar3.mo150712a(str);
                            break;
                        }
                        break;
                    case 104:
                        C105814l lVar4 = g0Var.f314611a;
                        if (lVar4 != null) {
                            lVar4.mo150714c(str);
                            break;
                        }
                        break;
                }
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null && (lVar = this.f314621d.f314611a) != null) {
                lVar.mo150716e(str);
            }
            this.f314621d.f314612b.put(str, 101);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.g0$d */
    public static final class C105803d extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C105799g0 f314622d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105803d(C105799g0 g0Var) {
            super(1);
            this.f314622d = g0Var;
        }

        public Object invoke(Object obj) {
            C13598b0 b0Var;
            C105814l lVar;
            String str = (String) obj;
            C87412m.m108594g(str, "wxUserName");
            Integer num = this.f314622d.f314612b.get(str);
            if (num != null) {
                C105799g0 g0Var = this.f314622d;
                if (num.intValue() == 104) {
                    Log.m105924i("MicroMsg.MultiTalkScreenCastManager", "state change from stop to stop");
                } else {
                    C105814l lVar2 = g0Var.f314611a;
                    if (lVar2 != null) {
                        lVar2.mo150715d(str);
                    }
                }
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null && (lVar = this.f314622d.f314611a) != null) {
                lVar.mo150715d(str);
            }
            this.f314622d.f314612b.put(str, 104);
            if (C105851w0.zx0().f314477R0) {
                C105851w0.zx0().mo150670m().mo150710l(str, 0);
            }
            return C13598b0.f38549a;
        }
    }

    public C105799g0() {
        C105802c cVar = new C105802c(this);
        this.f314614d = cVar;
        C105801b bVar = new C105801b(this);
        this.f314615e = bVar;
        C105803d dVar = new C105803d(this);
        this.f314616f = dVar;
        C105800a aVar = new C105800a(this);
        this.f314617g = aVar;
        this.f314618h = C90364q0.m113147f(new C13604l(100, aVar), new C13604l(101, cVar), new C13604l(102, bVar), new C13604l(104, dVar));
    }

    /* renamed from: a */
    public final int mo150748a(String str) {
        C87412m.m108594g(str, "wxUserName");
        Integer num = this.f314612b.get(str);
        if (num == null) {
            return 100;
        }
        return num.intValue();
    }
}
