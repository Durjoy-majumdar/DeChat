package p765yp;

import a70.C112760b;
import android.content.Context;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import di0.C86299o;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import gy3.C87412m;
import h81.C32735h;
import i61.C98602h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;
import kr0.C33983a1;
import kr0.C76630x0;
import kr0.C88273g1;
import kr0.C88274h0;
import lc3.C10485b;
import p578js.C108769b;
import p777zp.C112645b;
import u51.C37341a;
import uc0.C111153e;
import uc0.C111154h;
import uc0.C111156r;
import uc0.C90638g;
import wi0.C91003z;
import z51.C39315g;
import zt3.C119157j;
import zt3.C119179t;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: yp.a */
public class C112477a extends C86301e implements C112645b {

    /* renamed from: e */
    public static final String f336781e = C112760b.m154248t();

    /* renamed from: f */
    public static final String f336782f;

    /* renamed from: g */
    public static final String f336783g;

    /* renamed from: d */
    public final Set<String> f336784d = new HashSet();

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C112760b.m154231g() + "/emoji/");
        sb.append("egg_spring/");
        String sb4 = sb.toString();
        f336782f = sb4;
        f336783g = sb4 + "innerLuckyBag.wxam";
    }

    /* renamed from: Ob */
    public void mo164199Ob(Context context, String str, String str2, int i, String str3) {
        C86299o oVar = new C86299o();
        oVar.f250929a = str2;
        boolean z = 1 == C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Egg_PreviewMiniApp_Int, 0);
        oVar.f250939k = i;
        if (z) {
            oVar.f250931c = 2;
        } else {
            oVar.f250931c = 0;
        }
        C91003z zVar = C91003z.POPUP;
        oVar.f250923L = zVar;
        oVar.f250924M = zVar;
        if (!Util.isNullOrNil(str3)) {
            oVar.f250937i = new a$$d(this, str3);
        }
        Log.m105925i("MicroMsg.EggSpringFeatureService", "goMiniApp username:%s", str2);
        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(context, oVar);
    }

    /* renamed from: XE */
    public boolean mo164200XE() {
        int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("EmoticonLuckyBagProb", 100);
        int nextInt = new Random().nextInt(100);
        Log.m105925i("MicroMsg.EggSpringFeatureService", "enablePlayLuckyEffect config:%d, random:%d", Integer.valueOf(b), Integer.valueOf(nextInt));
        return nextInt < b;
    }

    public void onAccountInitialized(Context context) {
        Log.m105924i("MicroMsg.EggSpringFeatureService", "onAccountInitialized");
        ThreadPool.post(new a$$b(this), "init_egg_spring_dir");
        C90638g E = ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo137997E();
        if (E != null && !E.f260401d.isEmpty()) {
            Iterator<C111153e> it = E.f260401d.iterator();
            while (it.hasNext()) {
                C111153e next = it.next();
                if (next.f332887q == 5) {
                    C33983a1 a1Var = (C33983a1) C86312j.m106911c(C33983a1.class);
                    if (a1Var != null) {
                        C111154h hVar = next.f332892v;
                        Log.m105925i("MicroMsg.EggSpringFeatureService", "registerPkgSpecs success, username:%s, appId:%s", hVar.f332895e, hVar.f332894d);
                        C111154h hVar2 = next.f332892v;
                        a1Var.mo56532sv(hVar2.f332895e, hVar2.f332894d, 1189);
                    } else {
                        C119179t tVar = C119157j.f356862d;
                        a$$a a__a = new a$$a(next);
                        C119157j jVar = (C119157j) tVar;
                        jVar.getClass();
                        jVar.mo183892w(a__a, 10000, false);
                        Log.m105924i("MicroMsg.EggSpringFeatureService", "registerPkgSpecs Failed, IWxaPkgDownloaderExportService Null");
                    }
                }
            }
        }
    }

    public void pw0(String str) {
        Class cls = C108769b.class;
        ((HashSet) this.f336784d).add(str);
        if (((C108769b) C86312j.m106911c(cls)).get(str) != null) {
            Log.m105925i("MicroMsg.EggSpringFeatureService", "has prefetch %s", str);
            return;
        }
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_egg_preload_url, 1);
        Log.m105925i("MicroMsg.EggSpringFeatureService", "prefetch %s: config %s", str, Integer.valueOf(Qe));
        if (Qe == 1) {
            ((C108769b) C86312j.m106911c(cls)).mo71689Dz(((C108769b) C86312j.m106911c(cls)).Zn0(), str, new a$$c(this));
        }
    }

    public void qh0(C90638g gVar) {
        C37341a aVar = C37341a.f98737a;
        if (gVar != null) {
            LinkedList<C111153e> linkedList = gVar.f260401d;
            C87412m.m108593f(linkedList, "eggList.eggList");
            ArrayList arrayList = new ArrayList();
            for (C111153e eVar : linkedList) {
                C111156r rVar = eVar.f332885o;
                String str = rVar != null ? rVar.f332898d : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            LinkedList<String> linkedList2 = C37341a.f98738b;
            synchronized (linkedList2) {
                Iterator<String> it = linkedList2.iterator();
                C87412m.m108593f(it, "blockList.iterator()");
                while (it.hasNext()) {
                    String next = it.next();
                    C87412m.m108593f(next, "iterator.next()");
                    if (!arrayList.contains(next)) {
                        it.remove();
                    }
                }
            }
            aVar.mo61045a();
        }
    }

    public void rl0() {
        Log.m105924i("MicroMsg.EggSpringFeatureService", "cleanPrefetch: ");
        Iterator it = ((HashSet) this.f336784d).iterator();
        while (it.hasNext()) {
            ((C108769b) C86312j.m106911c(C108769b.class)).remove((String) it.next());
        }
        ((HashSet) this.f336784d).clear();
    }

    public void u30(String str) {
        ((C88274h0) C86312j.m106911c(C88274h0.class)).mo113299AC(C88273g1.CHATTING_LUCKY_BAG);
    }
}
