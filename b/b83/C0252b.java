package b83;

import b83.C0255c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import kv1.C61173o;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C76728k;
import lv1.C99681n;
import p255vr.C14972g;

/* renamed from: b83.b */
public class C0252b implements C0255c {

    /* renamed from: a */
    public Map<C0251a, CountDownLatch> f793a = new ConcurrentHashMap();

    /* renamed from: b */
    public Map<C0251a, C0255c.C0256a> f794b = new HashMap();

    /* renamed from: c */
    public C61173o f795c = new C0253a();

    /* renamed from: d */
    public C61173o f796d = new C0254b();

    /* renamed from: b83.b$a */
    public class C0253a implements C61173o {
        public C0253a() {
        }

        /* renamed from: H0 */
        public void mo293H0(C10656l lVar) {
            C0251a aVar = (C0251a) lVar.f32073b.f292083i;
            if (aVar != null) {
                CountDownLatch countDownLatch = (CountDownLatch) ((ConcurrentHashMap) C0252b.this.f793a).remove(aVar);
                int i = lVar.f32074c;
                if (i == -3 || i == -2 || i == -1) {
                    aVar.mo289a(Collections.emptyList());
                } else if (i == 0) {
                    List<C99681n> list = lVar.f32076e;
                    if (list == null || list.size() == 0) {
                        Log.m105924i("FTSMatchContact", "local contact search size 0");
                        aVar.mo289a(Collections.emptyList());
                        countDownLatch.countDown();
                        return;
                    }
                    aVar.mo289a(lVar.f32076e);
                }
                countDownLatch.countDown();
            }
        }
    }

    /* renamed from: b83.b$b */
    public class C0254b implements C61173o {
        public C0254b() {
        }

        /* renamed from: H0 */
        public void mo293H0(C10656l lVar) {
            C0255c.C0256a aVar;
            C0251a aVar2 = (C0251a) lVar.f32073b.f292083i;
            if (aVar2 != null && (aVar = (C0255c.C0256a) ((HashMap) C0252b.this.f794b).remove(aVar2)) != null) {
                int i = lVar.f32074c;
                if (i == -3 || i == -2 || i == -1) {
                    aVar2.mo289a(Collections.emptyList());
                } else if (i == 0) {
                    List<C99681n> list = lVar.f32076e;
                    if (list == null || list.size() == 0) {
                        Log.m105924i("FTSMatchContact", "local contact search size 0");
                        aVar.mo294a(aVar2);
                        return;
                    }
                    aVar2.mo289a(lVar.f32076e);
                }
                aVar.mo294a(aVar2);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo292a(C0251a aVar, C61173o oVar) {
        if (Util.isNullOrNil(aVar.f791a)) {
            return false;
        }
        C76728k kVar = new C76728k();
        kVar.f224468c = aVar.f791a;
        kVar.f224472g = new int[]{131072};
        kVar.f224473h = new int[]{1, 5};
        kVar.f224474i = aVar.f792b;
        kVar.f224477l = ((C14972g) C86312j.m106911c(C14972g.class)).mo14022MG();
        kVar.f224475j = new HashSet<>();
        kVar.f224478m = oVar;
        kVar.f224480o = 1;
        ((C99260q) C86312j.m106911c(C99260q.class)).Xn0(2, kVar).f292083i = aVar;
        return true;
    }
}
