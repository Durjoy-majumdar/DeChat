package ch1;

import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import cl1.C54943a1;
import cl1.C54947b1;
import cl1.C54950c1;
import cl1.C54970d1;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import d50.C58115i;
import fj1.C45795b;
import gy3.C8479f0;
import gy3.C87412m;
import j50.C60735a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import o40.C61937h;
import rx3.C13598b0;
import te3.C48742ao0;
import te3.C52013xs0;
import te3.C64530lp2;
import te3.C64674r41;
import wx3.C15601d;
import yg1.C39014a;
import yg1.C66639f;

/* renamed from: ch1.o */
public final class C54728o extends C66639f {

    /* renamed from: a */
    public final C45795b f153372a;

    /* renamed from: b */
    public boolean f153373b;

    public C54728o(C45795b bVar) {
        C87412m.m108594g(bVar, "liveContext");
        this.f153372a = bVar;
    }

    /* renamed from: b */
    public boolean mo49b(C39014a.C39015a aVar) {
        C58115i iVar;
        Class cls = C54943a1.class;
        C87412m.m108594g(aVar, "respWrapper");
        C48742ao0 ao02 = aVar.f105072a;
        if (ao02 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("isHistory:");
            sb.append(ao02.f130664B);
            sb.append(", getConfig:");
            C64530lp2 lp22 = ao02.f130663A;
            sb.append(lp22 != null ? C61937h.m72703b(lp22) : "");
            sb.append(",msgsize:");
            sb.append(ao02.f130677e.size());
            Log.m105924i("LiveMsgRespSpeedInterceptor", sb.toString());
            C54943a1 a1Var = (C54943a1) this.f153372a.mo71262a(cls);
            C64530lp2 lp23 = ao02.f130663A;
            boolean z = false;
            if (lp23 != null) {
                if (!(lp23.f184140q >= 0 || lp23.f184141r > 0 || lp23.f184130d > 0 || lp23.f184136j > 0 || lp23.f184133g > 0)) {
                    lp23 = null;
                }
                if (lp23 != null) {
                    C64530lp2 lp24 = a1Var.f153975f;
                    C87412m.m108594g(lp24, "other");
                    boolean z2 = lp23.f184140q == lp24.f184140q && lp23.f184141r == lp24.f184141r && lp23.f184130d == lp24.f184130d && lp23.f184142s == lp24.f184142s;
                    Log.m105924i("MMFinder.LiveMsgSpeedControlSlice", "[isSame] " + z2);
                    if (!z2) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("[isSame]  ");
                        sb4.append("config = " + C61937h.m72703b(lp23));
                        Log.m105924i("MMFinder.LiveMsgSpeedControlSlice", sb4.toString());
                    }
                    if (!z2) {
                        a1Var.f153975f = lp23;
                        C54943a1.f153974o = a1Var.f153975f.f184142s;
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            }
            FinderLiveService.f159376d.getClass();
            C60735a aVar2 = FinderLiveService.f159378f;
            if ((aVar2 == null || (iVar = aVar2.f172989A) == null || iVar.mo82881c()) ? false : true) {
                C54943a1 a1Var2 = (C54943a1) this.f153372a.mo71262a(cls);
                LinkedList<C64674r41> linkedList = ao02.f130677e;
                C87412m.m108593f(linkedList, "it.msgList");
                LinkedList<C52013xs0> linkedList2 = ao02.f130689t;
                C87412m.m108593f(linkedList2, "it.app_msg_list");
                if (!((C54991o) a1Var2.business(C54991o.class)).f154370u) {
                    Log.m105924i("MMFinder.LiveMsgSpeedControlSlice", "unable LiveRoom Comment,clear cache");
                    a1Var2.f153978i.post(new C54950c1(a1Var2));
                } else {
                    if (a1Var2.f153975f.f184140q <= 0) {
                        if (BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG || WeChatEnvironment.hasDebugger()) {
                            z = true;
                        }
                        if (z) {
                            Log.m105918d("MMFinder.LiveMsgSpeedControlSlice", "no ctrol speed ,so dont fillter");
                        }
                    } else {
                        C8479f0 f0Var = new C8479f0();
                        f0Var.f27484d = new ArrayList();
                        Iterator<C64674r41> it = linkedList.iterator();
                        C87412m.m108593f(it, "remoteLiveMsg.iterator()");
                        while (it.hasNext()) {
                            C64674r41 next = it.next();
                            C87412m.m108593f(next, "liveMsgIterator.next()");
                            C64674r41 r412 = next;
                            if (a1Var2.f153977h.contains(Integer.valueOf(r412.f185127g))) {
                                ((ArrayList) f0Var.f27484d).add(r412);
                                it.remove();
                            }
                        }
                        Iterator<C52013xs0> it4 = linkedList2.iterator();
                        C87412m.m108593f(it4, "remoteLiveAppMsg.iterator()");
                        while (it4.hasNext()) {
                            C52013xs0 next2 = it4.next();
                            C87412m.m108593f(next2, "liveAppMsgIterator.next()");
                            C52013xs0 xs02 = next2;
                            if (a1Var2.f153977h.contains(Integer.valueOf(xs02.f144903e))) {
                                ((ArrayList) f0Var.f27484d).add(xs02);
                                it4.remove();
                            }
                        }
                        a1Var2.f153978i.post(new C54970d1(a1Var2, f0Var));
                    }
                }
            }
            if (!this.f153373b) {
                C54943a1 a1Var3 = (C54943a1) this.f153372a.mo71262a(cls);
                C53895h.m60466d(a1Var3.f107146d.f123702i, C53872d1.f151119c, (C53934p0) null, new C54947b1(a1Var3, (C15601d<? super C54947b1>) null), 2, (Object) null);
                this.f153373b = true;
            }
        }
        return true;
    }

    /* renamed from: c */
    public void mo75610c() {
        this.f153373b = false;
    }
}
