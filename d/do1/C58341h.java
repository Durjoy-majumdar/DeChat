package do1;

import android.content.Intent;
import android.os.SystemClock;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import bo1.C54509v;
import cm1.C0740i2;
import co1.C55048e;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore;
import com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import do1.C58329a;
import dp1.C58417y0;
import eb0.C31543z5;
import eo1.C58638b;
import er1.C58784w3;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import je1.C46518f;
import je1.C46527o;
import je1.C9302e;
import je1.C9342n1;
import kj2.C117407d;
import le1.C10497i;
import o40.C61926c;
import o40.C61937h;
import os1.C11739f;
import os1.C11749q;
import pe1.C35464c;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C48736am1;
import te3.C49173do1;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C51822we1;
import te3.C64232aj1;
import te3.C64586nn1;
import te3.C64777vl1;
import te3.C64858yi1;
import te3.C64882zi1;
import up1.C37521f;
import vp1.C14937o;
import vp1.C65834e;
import wp1.C15585f;
import z04.C112551y;
import z04.C66731x;

/* renamed from: do1.h */
public abstract class C58341h {

    /* renamed from: s */
    public static final C13601g<Boolean> f167024s = C36568h.m40985a(C31223c.f83661d);

    /* renamed from: a */
    public final int f167025a;

    /* renamed from: b */
    public final FinderStreamTabPreloadCore f167026b;

    /* renamed from: c */
    public final String f167027c;

    /* renamed from: d */
    public boolean f167028d;

    /* renamed from: e */
    public final C58329a f167029e;

    /* renamed from: f */
    public final AtomicBoolean f167030f = new AtomicBoolean(true);

    /* renamed from: g */
    public final AtomicBoolean f167031g = new AtomicBoolean(false);

    /* renamed from: h */
    public final AtomicBoolean f167032h = new AtomicBoolean(false);

    /* renamed from: i */
    public final C13601g f167033i = C36568h.m40985a(C58350n.f167086d);

    /* renamed from: j */
    public C64777vl1 f167034j;

    /* renamed from: k */
    public boolean f167035k;

    /* renamed from: l */
    public final C58347j f167036l;

    /* renamed from: m */
    public final C13601g f167037m;

    /* renamed from: n */
    public final ReentrantLock f167038n;

    /* renamed from: o */
    public final Condition f167039o;

    /* renamed from: p */
    public final C58342a f167040p;

    /* renamed from: q */
    public C9342n1 f167041q;

    /* renamed from: r */
    public C7408e f167042r;

    /* renamed from: do1.h$e */
    public static final class C7408e {

        /* renamed from: a */
        public boolean f25557a;

        /* renamed from: b */
        public C58344f f25558b;

        public C7408e(boolean z) {
            this.f25557a = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C7408e) && this.f25557a == ((C7408e) obj).f25557a;
        }

        public int hashCode() {
            boolean z = this.f25557a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f25557a);
            sb.append('@');
            sb.append(this.f25558b);
            return sb.toString();
        }
    }

    /* renamed from: do1.h$h */
    public static final class C7409h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58341h f25559d;

        /* renamed from: e */
        public final /* synthetic */ LinkedList<FinderObject> f25560e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7409h(C58341h hVar, LinkedList<FinderObject> linkedList) {
            super(0);
            this.f25559d = hVar;
            this.f25560e = linkedList;
        }

        public Object invoke() {
            C58341h hVar = this.f25559d;
            LinkedList<FinderObject> linkedList = this.f25560e;
            hVar.getClass();
            Class<FinderCommonFeatureService> cls = FinderCommonFeatureService.class;
            C37521f.f99374d.getClass();
            if (C37521f.f99416h6.mo60266n().intValue() == 1 && hVar.f167025a == 4) {
                C39622i0 a = C39818r.f106831a.mo62446e(cls).mo75002a(C11749q.class);
                C87412m.m108593f(a, "UICProvider.of(FinderCom…reamUnreadVM::class.java)");
                C61926c.m72675T(linkedList, new C7416p((C11749q) a, hVar));
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = linkedList.iterator();
                while (true) {
                    boolean z = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    FinderObject finderObject = (FinderObject) next;
                    if (!C65834e.f189316a.mo89873g(hVar.f167025a, finderObject.f164794id) && FinderItem.Companion.mo79056a(finderObject, 0).isSupportCache()) {
                        z = true;
                    }
                    if (z) {
                        arrayList.add(next);
                    }
                }
                if (arrayList.isEmpty()) {
                    String str = hVar.f167027c;
                    Log.m105924i(str, "refreshFirstPage: valid feed is empty, origin size=" + linkedList.size());
                } else {
                    FinderObject finderObject2 = (FinderObject) C110818d0.m150916N(arrayList);
                    C13598b0 b0Var = null;
                    if (finderObject2 != null) {
                        BaseFinderFeed k = C15585f.f42211a.mo14348k(FinderItem.Companion.mo79056a(finderObject2, 0));
                        k.mo3514o0(true);
                        ArrayList<C0740i2> arrayList2 = ((C11739f) C39818r.f106831a.mo62446e(cls).mo75002a(C11739f.class)).mo11600c3(4).f34369b;
                        if (arrayList2.size() > 0) {
                            Iterator<C0740i2> it4 = arrayList2.iterator();
                            int i = 0;
                            while (true) {
                                if (!it4.hasNext()) {
                                    i = -1;
                                    break;
                                }
                                C0740i2 next2 = it4.next();
                                BaseFinderFeed baseFinderFeed = next2 instanceof BaseFinderFeed ? (BaseFinderFeed) next2 : null;
                                if (baseFinderFeed != null && baseFinderFeed.mo3481O()) {
                                    break;
                                }
                                i++;
                            }
                            if (i >= 0) {
                                arrayList2.remove(i);
                                arrayList2.add(i, k);
                                String str2 = hVar.f167027c;
                                Log.m105924i(str2, "refreshFirstPage: insert to cache, index=" + i + ", feedId=" + C61926c.m72691p(finderObject2.f164794id));
                            } else {
                                arrayList2.add(k);
                                String str3 = hVar.f167027c;
                                Log.m105924i(str3, "refreshFirstPage: insert to cache tail, feedId=" + C61926c.m72691p(finderObject2.f164794id));
                            }
                        }
                        C58784w3 w3Var = C58784w3.f168295a;
                        int M1 = w3Var.mo83887M1(4);
                        int L1 = w3Var.mo83884L1(M1);
                        LinkedList linkedList2 = new LinkedList();
                        linkedList2.addAll(C14937o.C14938a.m14143i(C14937o.f40972a, L1, (String) null, 2, (Object) null));
                        if (linkedList2.isEmpty()) {
                            linkedList2.add(k);
                        } else {
                            if (linkedList2.size() > 1) {
                                linkedList2.remove(1);
                            }
                            linkedList2.add(1, k);
                        }
                        C15585f.f42211a.mo14346i(linkedList2, M1, "", true);
                        String str4 = hVar.f167027c;
                        Log.m105924i(str4, "refreshFirstPage: store unread feed, id=" + C61926c.m72691p(finderObject2.f164794id));
                        b0Var = C13598b0.f38549a;
                    }
                    if (b0Var == null) {
                        String str5 = hVar.f167027c;
                        Log.m105920e(str5, "refreshFirstPage: error, feed is null, size=" + arrayList.size());
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: do1.h$k */
    public static final class C7410k implements C9342n1.C9347e {

        /* renamed from: a */
        public final /* synthetic */ boolean f25561a;

        /* renamed from: b */
        public final /* synthetic */ C58344f f25562b;

        /* renamed from: c */
        public final /* synthetic */ int f25563c;

        /* renamed from: d */
        public final /* synthetic */ C58341h f25564d;

        /* renamed from: e */
        public final /* synthetic */ C9342n1 f25565e;

        public C7410k(boolean z, C58344f fVar, int i, C58341h hVar, C9342n1 n1Var) {
            this.f25561a = z;
            this.f25562b = fVar;
            this.f25563c = i;
            this.f25564d = hVar;
            this.f25565e = n1Var;
        }

        /* renamed from: a */
        public void mo3671a() {
        }

        /* renamed from: b */
        public boolean mo3672b(int i, int i2, C49335eu3 eu32) {
            C87412m.m108594g(eu32, "resp");
            return false;
        }

        /* renamed from: c */
        public boolean mo3673c() {
            return false;
        }

        /* renamed from: d */
        public void mo3674d(C9342n1.C9345c cVar) {
            C87412m.m108594g(cVar, "request");
            boolean z = true;
            if (this.f25561a) {
                cVar.f145378p = 0;
            } else {
                cVar.f145378p = 1;
            }
            if (this.f25562b != C58344f.EnterLoad) {
                C58332b.m67542a(C58332b.f167018a, this.f25563c, 0, 1, 0, cVar.f145380r != 0, 0, false, 106, (Object) null);
            }
            C58344f fVar = this.f25562b;
            boolean z2 = fVar == C58344f.InsideConfigNotify || fVar == C58344f.InsideTimeout || fVar == C58344f.InsideRedDot;
            C48736am1 am12 = new C48736am1();
            C9342n1 n1Var = this.f25565e;
            FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0();
            if (z2) {
                am12.f130632g = Nx0.mo77227G5("TLRecommendTab") != null;
                am12.f130631f = Nx0.mo77227G5("TLFollow") != null;
                if (Nx0.mo77227G5("finder_tl_hot_tab") == null) {
                    z = false;
                }
                am12.f130630e = z;
                am12.f130635j = n1Var.f29180d;
            } else {
                if (Nx0.mo77227G5("FinderEntrance") == null) {
                    z = false;
                }
                am12.f130629d = z;
                am12.f130635j = 0;
            }
            cVar.f145364J = am12;
            String str = this.f25564d.f167027c;
            StringBuilder sb = new StringBuilder();
            sb.append("preload: onBuildRequest scene_status = ");
            C48736am1 am13 = cVar.f145364J;
            sb.append(am13 != null ? C61937h.m72703b(am13) : null);
            Log.m105924i(str, sb.toString());
        }
    }

    /* renamed from: do1.h$b */
    public static final class C31222b {

        /* renamed from: a */
        public final long f83660a;

        public C31222b(long j) {
            this.f83660a = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C31222b) && this.f83660a == ((C31222b) obj).f83660a;
        }

        public int hashCode() {
            long j = this.f83660a;
            return (int) (j ^ (j >>> 32));
        }

        public String toString() {
            return "CacheTime(lastTime=" + this.f83660a + ')';
        }
    }

    /* renamed from: do1.h$c */
    public static final class C31223c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C31223c f83661d = new C31223c();

        public C31223c() {
            super(0);
        }

        public Object invoke() {
            C37521f.f99374d.getClass();
            boolean z = true;
            if (C37521f.f99212K2.mo60266n().intValue() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: do1.h$a */
    public final class C58342a {

        /* renamed from: a */
        public final int f167043a;

        /* renamed from: b */
        public C9342n1.C9346d f167044b;

        /* renamed from: c */
        public C58344f f167045c;

        /* renamed from: d */
        public C58343d f167046d;

        /* renamed from: e */
        public final LinkedList<FinderObject> f167047e = new LinkedList<>();

        /* renamed from: f */
        public long f167048f;

        /* renamed from: g */
        public long f167049g;

        /* renamed from: h */
        public long f167050h;

        /* renamed from: i */
        public C89349b f167051i;

        /* renamed from: j */
        public int f167052j;

        /* renamed from: k */
        public final ConcurrentHashMap<Integer, C31222b> f167053k = new ConcurrentHashMap<>();

        public C58342a(int i) {
            this.f167043a = i;
            C64232aj1 b = mo83100b();
            LinkedList<C64882zi1> linkedList = b.f182082d;
            C87412m.m108593f(linkedList, "refreshPreloadCacheList.caches");
            ArrayList<C64882zi1> arrayList = new ArrayList<>();
            Iterator<T> it = linkedList.iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (((C64882zi1) next).f186704d == this.f167043a ? true : z) {
                    arrayList.add(next);
                }
            }
            for (C64882zi1 zi12 : arrayList) {
                this.f167053k.put(Integer.valueOf(zi12.f186706f), new C31222b(zi12.f186705e));
            }
            mo83099a(b, "build");
            mo83101c(C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_TIMELINE_PRELOAD_FAIL_RETRY_CNT_INT_SYNC, 0));
            String str = C58341h.this.f167027c;
            Log.m105924i(str, "init: cache, cgiFailRetryCnt=" + this.f167052j);
        }

        /* renamed from: a */
        public final void mo83099a(C64232aj1 aj12, String str) {
            C87412m.m108594g(aj12, "<this>");
            C87412m.m108594g(str, "tag");
            String str2 = C58341h.this.f167027c;
            StringBuilder sb = new StringBuilder();
            sb.append("[FinderRefreshPreloadCacheList#print] tag=");
            sb.append(str);
            sb.append(' ');
            LinkedList<C64882zi1> linkedList = aj12.f182082d;
            C87412m.m108593f(linkedList, "this.caches");
            ArrayList<C64882zi1> arrayList = new ArrayList<>();
            for (T next : linkedList) {
                if (((C64882zi1) next).f186704d == this.f167043a) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
            for (C64882zi1 zi12 : arrayList) {
                arrayList2.add(zi12.f186704d + XVFSFile.PATH_SEPARATOR_CHAR + zi12.f186706f + "=>" + zi12.f186705e);
            }
            sb.append(arrayList2);
            Log.m105924i(str2, sb.toString());
        }

        /* renamed from: b */
        public final C64232aj1 mo83100b() {
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_TIMELINE_PRELOAD_REFRESH_CACHE_STRING;
            C64232aj1 aj12 = new C64232aj1();
            Object f = C86709a0.m107535s().mo121142i().mo119685f(aVar, "");
            C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
            String str = (String) f;
            if (str.length() > 0) {
                try {
                    aj12.parseFrom(Util.decodeHexString(str));
                } catch (Exception e) {
                    Log.printErrStackTrace(C58341h.this.f167027c, e, "", new Object[0]);
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, (Object) null);
                }
            }
            return aj12;
        }

        /* renamed from: c */
        public final void mo83101c(int i) {
            if (this.f167052j != i) {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_TIMELINE_PRELOAD_FAIL_RETRY_CNT_INT_SYNC, Integer.valueOf(i));
            }
            this.f167052j = i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            sb.append(this.f167045c);
            sb.append(", resp=");
            C9342n1.C9346d dVar = this.f167044b;
            sb.append(dVar != null ? Integer.valueOf(dVar.hashCode()) : null);
            sb.append(", lastTime=");
            sb.append(this.f167048f);
            sb.append(", lastRedDotPreloadTime=");
            sb.append(this.f167049g);
            sb.append(", overCount=");
            sb.append(this.f167050h);
            sb.append(", recycledList=");
            LinkedList<FinderObject> linkedList = this.f167047e;
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (FinderObject finderObject : linkedList) {
                arrayList.add(C61926c.m72691p(finderObject.f164794id));
            }
            sb.append(arrayList);
            sb.append(']');
            return sb.toString();
        }
    }

    /* renamed from: do1.h$d */
    public static final class C58343d {

        /* renamed from: a */
        public long f167055a;

        /* renamed from: b */
        public int f167056b;

        /* renamed from: c */
        public long f167057c;

        /* renamed from: d */
        public int f167058d;
    }

    /* renamed from: do1.h$f */
    public enum C58344f {
        OutSideRedDot(1),
        InsideRedDot(2),
        OutSideTimeout(3),
        InsideConfigNotify(4),
        OutSideJumpHot(5),
        EnterLoad(6),
        InsideTimeout(7),
        RefreshContinue(8),
        ExitFinderHome(9),
        WxForeground(10);
        

        /* renamed from: d */
        public final int f167070d;

        /* renamed from: e */
        public int f167071e;

        /* access modifiers changed from: public */
        C58344f(int i) {
            this.f167070d = i;
            this.f167071e = 0;
        }
    }

    /* renamed from: do1.h$g */
    public enum C58345g {
        LOADING,
        DISABLE,
        INVALID,
        OK
    }

    /* renamed from: do1.h$i */
    public static final class C58346i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58341h f167077d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58346i(C58341h hVar) {
            super(0);
            this.f167077d = hVar;
        }

        public Object invoke() {
            this.f167077d.mo83088d("cacheClear");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: do1.h$j */
    public static final class C58347j extends C58329a.C58331b {

        /* renamed from: g */
        public final /* synthetic */ C58341h f167078g;

        /* renamed from: do1.h$j$a */
        public static final class C31224a extends C87413o implements C32226l<C58345g, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C58341h f83662d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C31224a(C58341h hVar) {
                super(1);
                this.f83662d = hVar;
            }

            public Object invoke(Object obj) {
                C58345g gVar = (C58345g) obj;
                C87412m.m108594g(gVar, "ret");
                String str = this.f83662d.f167027c;
                Log.m105924i(str, "[outSideDelayRunnable] preload result = " + gVar);
                return C13598b0.f38549a;
            }
        }

        public C58347j(C58341h hVar) {
            this.f167078g = hVar;
        }

        public void run() {
            String str = this.f167078g.f167027c;
            Log.m105924i(str, "outSideDelayRunnable run... isInFinder=" + this.f167078g.f167028d);
            C58341h hVar = this.f167078g;
            C58341h.m67552q(hVar, hVar.mo83091h(), (Intent) null, new C31224a(this.f167078g), 2, (Object) null);
        }
    }

    /* renamed from: do1.h$l */
    public static final class C58348l implements C9342n1.C9343a {

        /* renamed from: a */
        public final /* synthetic */ C58341h f167079a;

        /* renamed from: b */
        public final /* synthetic */ C58344f f167080b;

        /* renamed from: c */
        public final /* synthetic */ C9342n1 f167081c;

        /* renamed from: d */
        public final /* synthetic */ int f167082d;

        /* renamed from: e */
        public final /* synthetic */ C55718s0 f167083e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<C58345g, C13598b0> f167084f;

        public C58348l(C58341h hVar, C58344f fVar, C9342n1 n1Var, int i, C55718s0 s0Var, C32226l<? super C58345g, C13598b0> lVar) {
            this.f167079a = hVar;
            this.f167080b = fVar;
            this.f167081c = n1Var;
            this.f167082d = i;
            this.f167083e = s0Var;
            this.f167084f = lVar;
        }

        /* renamed from: a */
        public void mo3675a(int i, int i2, String str, C9342n1.C9346d dVar, List<? extends C10497i> list) {
            C64858yi1 yi12;
            C64858yi1 yi13;
            int i3 = i;
            int i4 = i2;
            C9342n1.C9346d dVar2 = dVar;
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_TIMELINE_PRELOAD_REFRESH_CONFIG_STRING_SYNC;
            C58345g gVar = C58345g.OK;
            C87412m.m108594g(dVar2, "resp");
            C87412m.m108594g(list, "interceptors");
            this.f167079a.f167038n.lock();
            boolean z = true;
            if (i3 == 0 && i4 == 0) {
                try {
                    this.f167079a.f167040p.f167047e.clear();
                    if (this.f167079a.mo83082l(this.f167080b, dVar2)) {
                        C9342n1 n1Var = this.f167079a.f167041q;
                        if (!(n1Var != null && n1Var.f29195v.get())) {
                            if (!dVar2.f146069d.isEmpty()) {
                                C58341h.m67550a(this.f167079a, dVar2, this.f167080b, this.f167082d, this.f167083e);
                                Log.m105924i(this.f167079a.f167027c, "onCgiBack: tabType=" + this.f167081c.f29180d + " preload successfully! size=" + dVar2.f146069d.size() + " cache=" + this.f167079a.f167040p);
                            } else {
                                Log.m105920e(this.f167079a.f167027c, "onCgiBack: tabType=" + this.f167081c.f29180d + " preload fail! list is empty! cache=" + this.f167079a.f167040p);
                            }
                        }
                    }
                    String str2 = this.f167079a.f167027c;
                    StringBuilder sb = new StringBuilder();
                    sb.append("onCgiBack: tabType=");
                    sb.append(this.f167081c.f29180d);
                    sb.append(" throw this preload, size=");
                    sb.append(dVar2.f146069d.size());
                    sb.append(" cache=");
                    sb.append(this.f167079a.f167040p);
                    sb.append(", isCancel = ");
                    C9342n1 n1Var2 = this.f167079a.f167041q;
                    sb.append(n1Var2 != null && n1Var2.f29195v.get());
                    Log.m105924i(str2, sb.toString());
                    LinkedList<FinderObject> linkedList = dVar2.f146069d;
                    if (linkedList != null) {
                        if (!(!linkedList.isEmpty())) {
                            linkedList = null;
                        }
                        if (linkedList != null) {
                            this.f167079a.mo83097s(linkedList);
                        }
                    }
                    C9342n1 n1Var3 = this.f167079a.f167041q;
                    if (n1Var3 == null || !n1Var3.f29195v.get()) {
                        z = false;
                    }
                    if (z) {
                        C54509v vVar = C54509v.f152802a;
                        C54509v.C54510a aVar2 = C54509v.C54510a.CancelTask;
                        C58344f fVar = this.f167080b;
                        int i5 = this.f167081c.f29180d;
                        C58343d dVar3 = new C58343d();
                        int i6 = this.f167082d;
                        C55718s0 s0Var = this.f167083e;
                        dVar3.f167056b = i6;
                        dVar3.f167055a = (s0Var == null || (yi13 = s0Var.f158585F) == null) ? 0 : yi13.f186549g;
                        dVar3.f167058d = (s0Var == null || (yi12 = s0Var.f158585F) == null) ? -1 : yi12.f186563x;
                        dVar3.f167057c = s0Var != null ? s0Var.field_aiScene : 0;
                        C13598b0 b0Var = C13598b0.f38549a;
                        C54509v.m61229b(vVar, aVar2, fVar, i5, dVar3, this.f167079a.f167034j, fVar.f167071e, (String) null, 64, (Object) null);
                    }
                } catch (Throwable th) {
                    C58341h.m67551b(this.f167079a, this.f167080b, i3);
                    this.f167084f.invoke(gVar);
                    if (dVar2.f146085w != null) {
                        C58341h hVar = this.f167079a;
                        C9342n1 n1Var4 = this.f167081c;
                        C85801v1 i7 = C86709a0.m107535s().mo121142i();
                        C64777vl1 vl12 = dVar2.f146085w;
                        i7.mo119677K(aVar, Util.encodeHexString(vl12 != null ? vl12.toByteArray() : null));
                        hVar.mo83084o(n1Var4.f29180d, hVar.f167026b.mo78458g3());
                    }
                    C58341h hVar2 = this.f167079a;
                    C7408e eVar = hVar2.f167042r;
                    eVar.f25557a = false;
                    eVar.f25558b = this.f167080b;
                    hVar2.f167041q = null;
                    hVar2.f167039o.signalAll();
                    this.f167079a.f167038n.unlock();
                    throw th;
                }
            } else {
                this.f167079a.mo83089e(true, "preloadFail");
                Log.m105920e(this.f167079a.f167027c, "onCgiBack: tabType=" + this.f167081c.f29180d + " preload fail! errType=" + i3 + " errCode=" + i4 + " cache=" + this.f167079a.f167040p);
            }
            C58341h.m67551b(this.f167079a, this.f167080b, i3);
            this.f167084f.invoke(gVar);
            if (dVar2.f146085w != null) {
                C58341h hVar3 = this.f167079a;
                C9342n1 n1Var5 = this.f167081c;
                C85801v1 i8 = C86709a0.m107535s().mo121142i();
                C64777vl1 vl13 = dVar2.f146085w;
                i8.mo119677K(aVar, Util.encodeHexString(vl13 != null ? vl13.toByteArray() : null));
                hVar3.mo83084o(n1Var5.f29180d, hVar3.f167026b.mo78458g3());
            }
            C58341h hVar4 = this.f167079a;
            C7408e eVar2 = hVar4.f167042r;
            eVar2.f25557a = false;
            eVar2.f25558b = this.f167080b;
            hVar4.f167041q = null;
            hVar4.f167039o.signalAll();
            this.f167079a.f167038n.unlock();
        }
    }

    /* renamed from: do1.h$m */
    public static final class C58349m extends C87413o implements C32224a<C58638b> {

        /* renamed from: d */
        public final /* synthetic */ C58341h f167085d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58349m(C58341h hVar) {
            super(0);
            this.f167085d = hVar;
        }

        public Object invoke() {
            C55048e Hx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Hx0();
            C58638b bVar = new C58638b(Hx0, "tab=" + this.f167085d.f167025a);
            bVar.f167880i.add(new C58351o(this.f167085d));
            return bVar;
        }
    }

    /* renamed from: do1.h$n */
    public static final class C58350n extends C87413o implements C32224a<FinderRedDotManager> {

        /* renamed from: d */
        public static final C58350n f167086d = new C58350n();

        public C58350n() {
            super(0);
        }

        public Object invoke() {
            return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0();
        }
    }

    public C58341h(int i, FinderStreamTabPreloadCore finderStreamTabPreloadCore) {
        C87412m.m108594g(finderStreamTabPreloadCore, "core");
        this.f167025a = i;
        this.f167026b = finderStreamTabPreloadCore;
        String str = "Finder.TabPreloadWorker#" + i;
        this.f167027c = str;
        this.f167029e = new C58329a(str);
        this.f167034j = finderStreamTabPreloadCore.mo78458g3();
        this.f167035k = true;
        this.f167036l = new C58347j(this);
        this.f167037m = C36568h.m40985a(new C58349m(this));
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f167038n = reentrantLock;
        this.f167039o = reentrantLock.newCondition();
        this.f167040p = new C58342a(i);
        this.f167042r = new C7408e(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001d, code lost:
        r9 = r4.f158585F;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m67550a(do1.C58341h r20, je1.C9342n1.C9346d r21, do1.C58341h.C58344f r22, int r23, com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0 r24) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            do1.h$a r5 = r0.f167040p
            r5.f167044b = r1
            pe3.b r6 = r1.f146070e
            r5.f167051i = r6
            do1.h$d r6 = new do1.h$d
            r6.<init>()
            r6.f167056b = r3
            r7 = 0
            if (r4 == 0) goto L_0x0024
            te3.yi1 r9 = r4.f158585F
            if (r9 == 0) goto L_0x0024
            long r9 = r9.f186549g
            goto L_0x0025
        L_0x0024:
            r9 = r7
        L_0x0025:
            r6.f167055a = r9
            if (r4 == 0) goto L_0x0030
            te3.yi1 r9 = r4.f158585F
            if (r9 == 0) goto L_0x0030
            int r9 = r9.f186563x
            goto L_0x0031
        L_0x0030:
            r9 = -1
        L_0x0031:
            r6.f167058d = r9
            if (r4 == 0) goto L_0x0037
            long r7 = r4.field_aiScene
        L_0x0037:
            r6.f167057c = r7
            r5.f167046d = r6
            r5.f167045c = r2
            do1.h$f r4 = do1.C58341h.C58344f.InsideTimeout
            if (r2 != r4) goto L_0x004f
            com.tencent.mm.autogen.events.FinderNextTabPreloadEvent r4 = new com.tencent.mm.autogen.events.FinderNextTabPreloadEvent
            r4.<init>()
            com.tencent.mm.autogen.events.FinderNextTabPreloadEvent$a r5 = r4.f9236d
            int r6 = r0.f167025a
            r5.f9237a = r6
            r4.publish()
        L_0x004f:
            up1.f r4 = up1.C37521f.f99374d
            boolean r5 = r4.mo61168V()
            if (r5 == 0) goto L_0x0115
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r5 = r1.f146069d
            java.lang.String r6 = "resp.`object`"
            gy3.C87412m.m108593f(r5, r6)
            java.lang.Object r5 = sx3.C110818d0.m150916N(r5)
            com.tencent.mm.protocal.protobuf.FinderObject r5 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r5
            if (r5 == 0) goto L_0x0115
            com.tencent.mm.plugin.finder.storage.FinderItem$a r6 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
            er1.w3 r7 = er1.C58784w3.f168295a
            int r8 = r0.f167025a
            int r8 = r7.mo83887M1(r8)
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r6.mo79056a(r5, r8)
            wp1.f$a r6 = wp1.C15585f.f42211a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = r6.mo14348k(r5)
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r5.mo3513o()
            java.util.LinkedList r8 = r8.getMediaList()
            r6.addAll(r8)
            rx3.l r8 = new rx3.l
            java.util.List r6 = sx3.C110818d0.m150900B0(r6)
            r8.<init>(r5, r6)
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            r6.add(r8)
            int r8 = r0.f167025a
            int r12 = r7.mo83890O(r8)
            r7 = 6
            if (r3 == r7) goto L_0x00b3
            r7 = 9
            if (r3 == r7) goto L_0x00b3
            r7 = 20
            if (r3 == r7) goto L_0x00b3
            r7 = 8
            if (r3 != r7) goto L_0x00b1
            goto L_0x00b3
        L_0x00b1:
            r3 = 0
            goto L_0x00b4
        L_0x00b3:
            r3 = 1
        L_0x00b4:
            if (r3 == 0) goto L_0x00b9
            r3 = 2
            r13 = 2
            goto L_0x00bb
        L_0x00b9:
            r3 = 5
            r13 = 5
        L_0x00bb:
            rx3.g r3 = r0.f167037m
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            eo1.b r3 = (eo1.C58638b) r3
            e03.b r7 = new e03.b
            r10 = 1
            r11 = -1
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 112(0x70, float:1.57E-43)
            r19 = 0
            r9 = r7
            r9.<init>(r10, r11, r12, r13, r14, r16, r17, r18, r19)
            com.tencent.mm.plugin.finder.storage.FeedData$a r8 = com.tencent.p014mm.plugin.finder.storage.FeedData.Companion
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo3513o()
            com.tencent.mm.plugin.finder.storage.FeedData r5 = r8.mo78884b(r5)
            java.util.List r6 = sx3.C110818d0.m150900B0(r6)
            r8 = 1000(0x3e8, float:1.401E-42)
            java.util.LinkedList r3 = r3.mo83526h(r7, r5, r6, r8)
            java.lang.Object r3 = sx3.C110818d0.m150916N(r3)
            bo1.y r3 = (bo1.C54512y) r3
            if (r3 == 0) goto L_0x00fc
            java.lang.String r3 = r3.f152814l1
            java.lang.String r5 = "<set-?>"
            gy3.C87412m.m108594g(r3, r5)
            r1.f29213Q = r3
        L_0x00fc:
            java.lang.String r0 = r0.f167027c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "setCacheWithPreload: preload mediaId="
            r3.append(r5)
            java.lang.String r1 = r1.f29213Q
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
        L_0x0115:
            boolean r0 = com.tencent.p014mm.plugin.finder.preload.MediaPreloadCore.f160304p
            if (r0 == 0) goto L_0x0127
            boolean r0 = r4.mo61168V()
            if (r0 == 0) goto L_0x0127
            do1.r r0 = new do1.r
            r0.<init>(r2)
            o40.C61926c.m72668M(r0)
        L_0x0127:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: do1.C58341h.m67550a(do1.h, je1.n1$d, do1.h$f, int, com.tencent.mm.plugin.finder.extension.reddot.s0):void");
    }

    /* renamed from: b */
    public static final void m67551b(C58341h hVar, C58344f fVar, int i) {
        T t;
        boolean z;
        C58342a aVar = hVar.f167040p;
        aVar.f167045c = fVar;
        C87412m.m108594g(fVar, FirebaseAnalytics.C113379b.SOURCE);
        aVar.f167048f = fVar.f167071e == 2 ? aVar.f167048f : C31543z5.m39453c();
        if (fVar == C58344f.OutSideRedDot) {
            aVar.f167049g = C31543z5.m39453c();
        }
        aVar.f167053k.put(Integer.valueOf(fVar.f167070d), new C31222b(aVar.f167048f));
        C64232aj1 b = aVar.mo83100b();
        LinkedList<C64882zi1> linkedList = b.f182082d;
        C87412m.m108593f(linkedList, "list.caches");
        Iterator<T> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C64882zi1) t).f186706f == fVar.f167070d) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C64882zi1 zi12 = (C64882zi1) t;
        if (zi12 == null) {
            zi12 = new C64882zi1();
            b.f182082d.add(zi12);
        }
        zi12.f186706f = fVar.f167070d;
        zi12.f186705e = aVar.f167048f;
        zi12.f186704d = aVar.f167043a;
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_TIMELINE_PRELOAD_REFRESH_CACHE_STRING, Util.encodeHexString(b.toByteArray()));
        aVar.mo83099a(b, "storeTime");
        if (i == 4) {
            C58342a aVar2 = hVar.f167040p;
            aVar2.mo83101c(aVar2.f167052j + 1);
            String str = hVar.f167027c;
            Log.m105924i(str, "storeTime: cgi fail, cgiFailRetryCnt=" + hVar.f167040p.f167052j);
            return;
        }
        hVar.f167040p.mo83101c(0);
    }

    /* renamed from: q */
    public static /* synthetic */ void m67552q(C58341h hVar, C58344f fVar, Intent intent, C32226l lVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                intent = null;
            }
            hVar.mo83085p(fVar, intent, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preload");
    }

    /* renamed from: t */
    public static C9342n1.C9346d m67553t(C58341h hVar, int i, boolean z, C32224a aVar, int i2, Object obj) {
        long j;
        C58341h hVar2 = hVar;
        int i3 = i;
        if (obj == null) {
            boolean z2 = (i2 & 2) != 0 ? true : z;
            C32224a aVar2 = (i2 & 4) != 0 ? null : aVar;
            String str = hVar2.f167027c;
            StringBuilder sb = new StringBuilder();
            sb.append("requestCache: scene=");
            sb.append(hVar2.f167025a);
            sb.append(", isPreloading:");
            sb.append(hVar2.f167042r);
            sb.append(" cache=");
            sb.append(hVar2.f167040p);
            sb.append(" isLocked=");
            sb.append(hVar2.f167038n.isLocked());
            sb.append(" fakeWaitForRefresh=");
            C37521f.f99374d.getClass();
            C35464c<Long> cVar = C37521f.f99343Z1;
            sb.append(cVar.mo60266n().longValue());
            sb.append("ms ");
            Log.m105924i(str, sb.toString());
            if (z2) {
                hVar2.f167038n.lock();
                try {
                    if (hVar2.f167042r.f25557a) {
                        if (aVar2 != null) {
                            aVar2.invoke();
                        }
                        long uptimeMillis = SystemClock.uptimeMillis();
                        hVar2.f167039o.await(1, TimeUnit.MINUTES);
                        long longValue = cVar.mo60266n().longValue() - (SystemClock.uptimeMillis() - uptimeMillis);
                        String str2 = hVar2.f167027c;
                        Log.m105924i(str2, "requestCache: loading delay = " + longValue + ", tabType = " + hVar2.f167025a + ", pullType = " + i3);
                        if (longValue > 0) {
                            hVar2.f167039o.await(longValue, TimeUnit.MILLISECONDS);
                        }
                    } else if (hVar.mo83087c()) {
                        String str3 = hVar2.f167027c;
                        Log.m105924i(str3, "requestCache: force wait " + cVar.mo60266n().longValue() + "ms, tabType = " + hVar2.f167025a + ", pullType = " + i3);
                        hVar2.f167039o.await(cVar.mo60266n().longValue(), TimeUnit.MILLISECONDS);
                    }
                } finally {
                    hVar2.f167038n.unlock();
                }
            }
            C8479f0 f0Var = new C8479f0();
            f0Var.f27484d = hVar2.f167040p.f167044b;
            String str4 = hVar2.f167027c;
            Log.m105924i(str4, "requestCache: source = " + hVar2.f167040p.f167045c + ", result = " + f0Var.f27484d + " tabType = " + hVar2.f167025a + ", pullType = " + i3 + ", waitLoading=" + z2);
            if (!(hVar2.f167040p.f167045c == C58344f.EnterLoad)) {
                C9342n1.C9346d dVar = (C9342n1.C9346d) f0Var.f27484d;
                if (dVar != null) {
                    C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11749q.class);
                    C87412m.m108593f(a, "UICProvider.of(FinderCom…reamUnreadVM::class.java)");
                    LinkedList<FinderObject> linkedList = dVar.f146069d;
                    C87412m.m108593f(linkedList, "it.`object`");
                    C61926c.m72675T(linkedList, new C7417q(f0Var, (C11749q) a, hVar2));
                    int intValue = C37521f.f99437k1.mo60266n().intValue();
                    if (dVar.f146069d.size() < intValue) {
                        String str5 = hVar2.f167027c;
                        Log.m105928w(str5, "requestCache: cache after filter read feed is less than " + intValue + ", abandon it");
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("cacheTooLess");
                        sb4.append(intValue);
                        hVar2.mo83089e(true, sb4.toString());
                        f0Var.f27484d = null;
                    }
                }
                boolean z3 = f0Var.f27484d != null;
                int i4 = hVar2.f167025a;
                long j2 = hVar2.f167040p.f167050h;
                if (i3 == 0) {
                    j = j2;
                    C117407d dVar2 = C117407d.INSTANCE;
                    dVar2.idkeyStat(1421, hVar2.mo83093j(i4) + 1, 1, false);
                    if (!z3) {
                        dVar2.idkeyStat(1421, hVar2.mo83093j(i4) + ((long) 2), 1, false);
                    } else {
                        dVar2.idkeyStat(1421, hVar2.mo83093j(i4) + ((long) 3), 1, false);
                    }
                } else if (i3 != 1) {
                    j = j2;
                } else {
                    C117407d dVar3 = C117407d.INSTANCE;
                    j = j2;
                    dVar3.idkeyStat(1421, hVar2.mo83093j(i4) + ((long) 4), 1, false);
                    if (!z3) {
                        dVar3.idkeyStat(1421, ((long) 5) + hVar2.mo83093j(i4), 1, false);
                    } else {
                        dVar3.idkeyStat(1421, ((long) 6) + hVar2.mo83093j(i4), 1, false);
                    }
                }
                C117407d dVar4 = C117407d.INSTANCE;
                dVar4.idkeyStat(1421, hVar2.mo83093j(i4) + ((long) 7), 1, false);
                if (!z3) {
                    dVar4.idkeyStat(1421, hVar2.mo83093j(i4) + ((long) 8), 1, false);
                } else {
                    dVar4.idkeyStat(1421, hVar2.mo83093j(i4) + ((long) 9), 1, false);
                    dVar4.idkeyStat(1421, hVar2.mo83093j(i4) + ((long) 10), j + 1, false);
                }
                C9342n1.C9346d dVar5 = (C9342n1.C9346d) f0Var.f27484d;
                if (dVar5 != null) {
                    new C46527o(hVar2.f167040p.f167043a, dVar5 != null ? dVar5.f146070e : null).mo9225i();
                    C58332b.m67542a(C58332b.f167018a, 0, 0, 2, 0, false, 0, false, 123, (Object) null);
                    int i5 = hVar2.f167040p.f167043a;
                    LinkedList<FinderObject> linkedList2 = dVar5.f146069d;
                    C87412m.m108593f(linkedList2, "`object`");
                    ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList2, 10));
                    for (FinderObject finderObject : linkedList2) {
                        arrayList.add(Long.valueOf(finderObject.f164794id));
                    }
                    new C9302e(0, i5, arrayList, dVar5.f146070e).mo9225i();
                    C54509v vVar = C54509v.f152802a;
                    C54509v.C54510a aVar3 = C54509v.C54510a.UseCache;
                    C58342a aVar4 = hVar2.f167040p;
                    C58344f fVar = aVar4.f167045c;
                    int i6 = hVar2.f167025a;
                    C58343d dVar6 = aVar4.f167046d;
                    if (dVar6 == null) {
                        dVar6 = new C58343d();
                    }
                    C54509v.m61229b(vVar, aVar3, fVar, i6, dVar6, hVar2.f167034j, fVar != null ? fVar.f167071e : 0, (String) null, 64, (Object) null);
                    if (i3 == 0) {
                        C58784w3 w3Var = C58784w3.f168295a;
                        w3Var.mo83861C1(dVar5, hVar2.f167040p.f167043a, hVar2.f167027c);
                        C85801v1 i7 = C86709a0.m107535s().mo121142i();
                        C72994y1.C72995a a0 = w3Var.mo83914a0(hVar2.f167040p.f167043a);
                        C89349b bVar = dVar5.f146070e;
                        i7.mo119677K(a0, bVar == null ? null : Util.encodeHexString(bVar.mo123703f()));
                        String str6 = hVar2.f167027c;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("requestCache: lastBufferSize=");
                        C89349b bVar2 = dVar5.f146070e;
                        sb5.append(bVar2 != null ? Integer.valueOf(bVar2.f257327a.length) : null);
                        sb5.append(", lastBuffer=");
                        C89349b bVar3 = dVar5.f146070e;
                        sb5.append(bVar3 == null ? "null" : MD5Util.getMD5String(bVar3.f257327a));
                        Log.m105924i(str6, sb5.toString());
                    }
                }
            }
            hVar2.mo83089e(false, "requestCache");
            return (C9342n1.C9346d) f0Var.f27484d;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestCache");
    }

    /* renamed from: c */
    public final boolean mo83087c() {
        boolean z = false;
        if (this.f167040p.f167044b == null) {
            return false;
        }
        if (C31543z5.m39453c() - this.f167040p.f167048f <= this.f167026b.mo78454c3(this.f167025a) || this.f167040p.f167048f == 0) {
            z = true;
        }
        String str = this.f167027c;
        Log.m105924i(str, "checkCacheValid: isCacheValid = " + z + ", tabType = " + this.f167025a + ", cache.lastTime = " + this.f167040p.f167048f);
        if (!z) {
            mo83089e(true, "cacheInvalid");
        }
        return z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: cm1.j0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo83088d(java.lang.String r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.f167030f
            boolean r2 = r2.get()
            java.lang.String r3 = r0.f167027c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "checkPreloadVideoPlayer: checkSource="
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = ", hasCache="
            r4.append(r5)
            do1.h$a r5 = r0.f167040p
            je1.n1$d r5 = r5.f167044b
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L_0x0028
            r5 = 1
            goto L_0x0029
        L_0x0028:
            r5 = 0
        L_0x0029:
            r4.append(r5)
            java.lang.String r5 = ", preloadMediaId="
            r4.append(r5)
            do1.h$a r5 = r0.f167040p
            je1.n1$d r5 = r5.f167044b
            r8 = 0
            if (r5 == 0) goto L_0x003b
            java.lang.String r5 = r5.f29213Q
            goto L_0x003c
        L_0x003b:
            r5 = r8
        L_0x003c:
            r4.append(r5)
            java.lang.String r5 = ", isBackground="
            r4.append(r5)
            r4.append(r2)
            java.lang.String r5 = ", isInFinder="
            r4.append(r5)
            boolean r5 = r0.f167028d
            r4.append(r5)
            java.lang.String r5 = ", tabType="
            r4.append(r5)
            do1.h$a r5 = r0.f167040p
            int r5 = r5.f167043a
            r4.append(r5)
            java.lang.String r5 = ", preloadSource="
            r4.append(r5)
            do1.h$a r5 = r0.f167040p
            do1.h$f r5 = r5.f167045c
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            if (r2 != 0) goto L_0x022d
            boolean r2 = r0.f167028d
            if (r2 == 0) goto L_0x0078
            goto L_0x022d
        L_0x0078:
            do1.h$a r2 = r0.f167040p
            je1.n1$d r3 = r2.f167044b
            r4 = 4
            if (r3 == 0) goto L_0x00ea
            com.tencent.mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore r2 = com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore.f160325a
            java.lang.String r5 = r3.f29213Q
            boolean r2 = r2.mo78451b(r5)
            if (r2 == 0) goto L_0x00a0
            java.lang.String r2 = r0.f167027c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "checkPreloadVideoPlayer: return, has preload player, checkSource="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            return
        L_0x00a0:
            do1.h$a r1 = r0.f167040p
            int r2 = r1.f167043a
            if (r2 != r4) goto L_0x022d
            do1.h$f r1 = r1.f167045c
            do1.h$f r2 = do1.C58341h.C58344f.OutSideRedDot
            if (r1 == r2) goto L_0x00bc
            do1.h$f r2 = do1.C58341h.C58344f.OutSideJumpHot
            if (r1 == r2) goto L_0x00bc
            do1.h$f r2 = do1.C58341h.C58344f.OutSideTimeout
            if (r1 == r2) goto L_0x00bc
            do1.h$f r2 = do1.C58341h.C58344f.ExitFinderHome
            if (r1 == r2) goto L_0x00bc
            do1.h$f r2 = do1.C58341h.C58344f.WxForeground
            if (r1 != r2) goto L_0x022d
        L_0x00bc:
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r1 = r3.f146069d
            java.lang.String r2 = "resp.`object`"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.Object r1 = sx3.C110818d0.m150916N(r1)
            com.tencent.mm.protocal.protobuf.FinderObject r1 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r1
            if (r1 != 0) goto L_0x00d3
            java.lang.String r1 = r0.f167027c
            java.lang.String r2 = "checkPreloadVideoPlayer: error finder object is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            return
        L_0x00d3:
            com.tencent.mm.plugin.finder.storage.FinderItem$a r2 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
            er1.w3 r4 = er1.C58784w3.f168295a
            int r5 = r0.f167025a
            int r4 = r4.mo83887M1(r5)
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r2.mo79056a(r1, r4)
            java.lang.String r2 = r3.f29213Q
            java.lang.String r3 = "PreloadCache"
            r0.mo83094k(r1, r2, r3)
            goto L_0x022d
        L_0x00ea:
            int r1 = r2.f167043a
            if (r1 == r4) goto L_0x00ef
            return
        L_0x00ef:
            up1.f r1 = up1.C37521f.f99374d
            r1.getClass()
            pe1.c<java.lang.Integer> r1 = up1.C37521f.f99416h6
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 == r7) goto L_0x0103
            return
        L_0x0103:
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r1 = r18.mo83092i()
            java.lang.String r2 = "FinderEntrance"
            com.tencent.mm.plugin.finder.extension.reddot.s0 r1 = r1.mo77227G5(r2)
            if (r1 == 0) goto L_0x0116
            te3.yi1 r2 = r1.f158585F
            if (r2 == 0) goto L_0x0116
            int r2 = r2.f186541C
            goto L_0x0117
        L_0x0116:
            r2 = 0
        L_0x0117:
            if (r1 == 0) goto L_0x011b
            r1 = 1
            goto L_0x011c
        L_0x011b:
            r1 = 0
        L_0x011c:
            if (r1 == 0) goto L_0x0123
            if (r2 != r7) goto L_0x0121
            goto L_0x0123
        L_0x0121:
            r1 = 0
            goto L_0x0124
        L_0x0123:
            r1 = 1
        L_0x0124:
            if (r1 != 0) goto L_0x013d
            java.lang.String r1 = r0.f167027c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "checkPreloadVideoPlayer: refreshPrefetchStatus="
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            return
        L_0x013d:
            er1.w3 r1 = er1.C58784w3.f168295a
            int r2 = r1.mo83887M1(r4)
            int r12 = r1.mo83884L1(r2)
            tf1.i$a r2 = tf1.C13908i.f39090e
            tf1.i r2 = r2.mo13382a(r4)
            int r10 = r2.f39109d
            r11 = 0
            r13 = 0
            r14 = 1
            r15 = 0
            r16 = 42
            r17 = 0
            r9 = r1
            java.util.List r2 = er1.C58784w3.m68434Z(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Class<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r3 = com.tencent.p014mm.plugin.finder.model.BaseFinderFeed.class
            java.util.List r1 = r1.mo83922d0(r2, r3)
            boolean r2 = r1.isEmpty()
            r2 = r2 ^ r7
            if (r2 == 0) goto L_0x0226
            te3.vl1 r2 = r0.f167034j
            int r2 = r2.f185935P
            long r2 = (long) r2
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r4 = r1
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
        L_0x017a:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x01d6
            java.lang.Object r9 = r4.next()
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r9 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r9
            boolean r10 = r9 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r10 == 0) goto L_0x018c
            r11 = r9
            goto L_0x018d
        L_0x018c:
            r11 = r8
        L_0x018d:
            if (r11 == 0) goto L_0x0194
            boolean r11 = r11.mo3515p()
            goto L_0x0195
        L_0x0194:
            r11 = 0
        L_0x0195:
            if (r10 == 0) goto L_0x0199
            r12 = r9
            goto L_0x019a
        L_0x0199:
            r12 = r8
        L_0x019a:
            if (r12 == 0) goto L_0x01a4
            boolean r12 = r12.mo3481O()
            if (r12 != r7) goto L_0x01a4
            r12 = 1
            goto L_0x01a5
        L_0x01a4:
            r12 = 0
        L_0x01a5:
            if (r10 == 0) goto L_0x01a8
            goto L_0x01a9
        L_0x01a8:
            r9 = r8
        L_0x01a9:
            if (r9 == 0) goto L_0x01be
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r9.mo3513o()
            if (r9 == 0) goto L_0x01be
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r9.getFeedObject()
            if (r9 == 0) goto L_0x01be
            te3.xe1 r9 = r9.client_local_buffer
            if (r9 == 0) goto L_0x01be
            long r9 = r9.f186293d
            goto L_0x01c0
        L_0x01be:
            r9 = 0
        L_0x01c0:
            if (r11 != 0) goto L_0x01cf
            if (r12 == 0) goto L_0x01cf
            long r9 = r9 + r2
            long r11 = eb0.C31543z5.m39453c()
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x01cf
            r9 = 1
            goto L_0x01d0
        L_0x01cf:
            r9 = 0
        L_0x01d0:
            if (r9 == 0) goto L_0x01d3
            goto L_0x01d7
        L_0x01d3:
            int r5 = r5 + 1
            goto L_0x017a
        L_0x01d6:
            r5 = -1
        L_0x01d7:
            java.lang.String r2 = r0.f167027c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "checkPreloadVideoPlayer: preload unread feed, unreadPosition="
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            java.lang.Object r1 = sx3.C110818d0.m150917O(r1, r5)
            boolean r2 = r1 instanceof cm1.C55018j0
            if (r2 == 0) goto L_0x01f8
            r8 = r1
            cm1.j0 r8 = (cm1.C55018j0) r8
        L_0x01f8:
            if (r8 == 0) goto L_0x022d
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r8.mo3513o()
            java.util.LinkedList r1 = r1.getMediaList()
            java.lang.Object r1 = r1.getFirst()
            te3.rq2 r1 = (te3.C64689rq2) r1
            co1.a r2 = co1.C55041a.f154526a
            long r3 = r8.getItemId()
            java.lang.String r5 = "media"
            gy3.C87412m.m108593f(r1, r5)
            pl1.r0 r1 = r2.mo76098a(r3, r1, r7)
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r8.mo3513o()
            java.lang.String r1 = r1.mo11841b()
            java.lang.String r3 = "unreadCache"
            r0.mo83094k(r2, r1, r3)
            goto L_0x022d
        L_0x0226:
            java.lang.String r1 = r0.f167027c
            java.lang.String r2 = "checkPreloadVideoPlayer: do not have unread cache feed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
        L_0x022d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: do1.C58341h.mo83088d(java.lang.String):void");
    }

    /* renamed from: e */
    public final boolean mo83089e(boolean z, String str) {
        String str2;
        int i;
        LinkedList<FinderObject> linkedList;
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        this.f167038n.lock();
        try {
            C58342a aVar = this.f167040p;
            C9342n1.C9346d dVar = aVar.f167044b;
            boolean z2 = dVar != null;
            if (z) {
                if (!(dVar == null || (linkedList = dVar.f146069d) == null)) {
                    aVar.f167047e.addAll(linkedList);
                    this.f167040p.f167050h++;
                    mo83097s(linkedList);
                    C61926c.m72668M(new C7409h(this, linkedList));
                }
                if (z2) {
                    C54509v vVar = C54509v.f152802a;
                    C54509v.C54510a aVar2 = C54509v.C54510a.RecycleCache;
                    C58342a aVar3 = this.f167040p;
                    C58344f fVar = aVar3.f167045c;
                    int i2 = this.f167025a;
                    C58343d dVar2 = aVar3.f167046d;
                    if (dVar2 == null) {
                        dVar2 = new C58343d();
                    }
                    C58343d dVar3 = dVar2;
                    C64777vl1 vl12 = this.f167034j;
                    if (C112551y.m153819s(str, "newRedDotStatus=", false)) {
                        String substring = str.substring(str.length() - 2);
                        C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
                        Integer e = C66731x.m78731e(substring);
                        if (e != null) {
                            i = e.intValue();
                            vVar.mo75349a(aVar2, fVar, i2, dVar3, vl12, i, str);
                        }
                    }
                    i = 0;
                    vVar.mo75349a(aVar2, fVar, i2, dVar3, vl12, i, str);
                }
                FinderPlayerPreloadCore finderPlayerPreloadCore = FinderPlayerPreloadCore.f160325a;
                C9342n1.C9346d dVar4 = this.f167040p.f167044b;
                if (dVar4 == null || (str2 = dVar4.f29213Q) == null) {
                    str2 = "";
                }
                if (finderPlayerPreloadCore.mo78451b(str2)) {
                    finderPlayerPreloadCore.mo78450a("cacheClear");
                }
            } else {
                aVar.f167050h = 0;
            }
            if (z2) {
                Log.m105924i(this.f167027c, "clear: source=" + str + ", tabType=" + this.f167025a + " cache=" + this.f167040p + " isRecycle=" + z);
            }
            C58342a aVar4 = this.f167040p;
            aVar4.f167044b = null;
            aVar4.f167045c = null;
            aVar4.f167046d = null;
            if (z2 && z && aVar4.f167043a == 4) {
                C61926c.m72668M(new C58346i(this));
            }
            this.f167038n.unlock();
            return z2;
        } catch (Throwable th) {
            this.f167038n.unlock();
            throw th;
        }
    }

    /* renamed from: f */
    public final long mo83090f() {
        long j;
        long j2;
        C58344f fVar = C58344f.OutSideRedDot;
        C58344f h = mo83091h();
        C87412m.m108594g(h, "preloadSource");
        boolean z = false;
        if (h == C58344f.WxForeground) {
            FinderStreamTabPreloadCore finderStreamTabPreloadCore = this.f167026b;
            int i = this.f167025a;
            boolean z2 = this.f167040p.f167044b != null;
            if (i != 4) {
                finderStreamTabPreloadCore.getClass();
            } else {
                long j3 = ((long) finderStreamTabPreloadCore.mo78458g3().f185934N) * 1000;
                if (j3 > 0 && z2) {
                    long c3 = finderStreamTabPreloadCore.mo78454c3(i);
                    Log.m105924i("Finder.StreamTabPreloadCore", "getForegroundPreloadIntervalTime: get cache valid time, tabType=" + i + " prefetchInterval=" + j3 + "ms cacheValidTime=" + c3 + LocaleUtil.MALAY);
                    if (c3 > 0 && c3 > j3) {
                        j3 = c3;
                    }
                }
                Log.m105924i("Finder.StreamTabPreloadCore", "getForegroundPreloadIntervalTime: tabType=" + i + " time=" + j3 + "ms ");
                if (j3 > 0) {
                    j = j3;
                }
            }
            j = MAlarmHandler.NEXT_FIRE_INTERVAL;
        } else {
            j = this.f167026b.mo78456e3(this.f167025a, h == fVar, this.f167040p.f167044b != null);
        }
        C55718s0 G5 = mo83092i().mo77227G5("FinderEntrance");
        if (G5 != null && G5.field_aiScene >= 10000) {
            z = true;
        }
        Log.m105924i(this.f167027c, "getNextTime: preloadSource = " + h + ", isAiRedDot = " + z);
        int i2 = this.f167040p.f167052j;
        if (i2 > 1) {
            long pow = (long) (((float) j) * ((float) Math.pow((double) 2.0f, (double) (i2 - 1))));
            if (pow > 3600000) {
                pow = 3600000;
            }
            Log.m105924i(this.f167027c, "getNextTime: cgi fail downgrade, failDelayInterval=" + pow + ", current expired=" + j + ", cgiFailRetryCnt=" + this.f167040p.f167052j);
            j = pow;
        }
        long c = C31543z5.m39453c();
        if (!z || h != fVar) {
            j2 = this.f167040p.f167048f;
            if (j2 <= 0 && j != MAlarmHandler.NEXT_FIRE_INTERVAL) {
                return 0;
            }
        } else {
            j2 = this.f167040p.f167049g;
            if (j2 <= 0 && j != MAlarmHandler.NEXT_FIRE_INTERVAL) {
                return 0;
            }
        }
        return j - (c - j2);
    }

    /* renamed from: g */
    public C58344f mo83081g() {
        return C58344f.OutSideTimeout;
    }

    /* renamed from: h */
    public final C58344f mo83091h() {
        C64858yi1 yi12;
        C64858yi1 yi13;
        C64858yi1 yi14;
        if (mo83095m() && !this.f167032h.get()) {
            return C58344f.WxForeground;
        }
        C55718s0 G5 = mo83092i().mo77227G5("FinderEntrance");
        String str = null;
        C64586nn1 o2 = G5 != null ? G5.mo77308o2("FinderEntrance") : null;
        int i = (G5 == null || (yi14 = G5.f158585F) == null) ? -1 : yi14.f186555p;
        boolean z = true;
        if (G5 == null || o2 == null || this.f167025a != i || ((!((Boolean) ((C36570n) f167024s).getValue()).booleanValue() && G5.f158585F.f186563x != 1) || this.f167040p.f167044b != null)) {
            z = false;
        }
        String str2 = this.f167027c;
        StringBuilder sb = new StringBuilder();
        sb.append("getOutsidePreloadSource: isRedDotPreload = ");
        sb.append(z);
        sb.append(", redDotTabType=");
        sb.append(i);
        sb.append(", redDotExt.pre_load=");
        sb.append((G5 == null || (yi13 = G5.f158585F) == null) ? null : Integer.valueOf(yi13.f186563x));
        sb.append(", cache.resp=");
        sb.append(this.f167040p.f167044b);
        sb.append(", tipsId=");
        if (G5 != null) {
            str = G5.field_tipsId;
        }
        sb.append(str);
        sb.append(", redDotObjectId=");
        sb.append(C61926c.m72691p((G5 == null || (yi12 = G5.f158585F) == null) ? 0 : yi12.f186549g));
        Log.m105924i(str2, sb.toString());
        return z ? C58344f.OutSideRedDot : mo83081g();
    }

    /* renamed from: i */
    public final FinderRedDotManager mo83092i() {
        return (FinderRedDotManager) ((C36570n) this.f167033i).getValue();
    }

    /* renamed from: j */
    public final long mo83093j(int i) {
        if (i == 1) {
            return 20;
        }
        if (i != 2) {
            return (i == 3 || i != 4) ? 0 : 40;
        }
        return 60;
    }

    /* JADX WARNING: type inference failed for: r9v2, types: [rx3.b0] */
    /* JADX WARNING: type inference failed for: r9v5, types: [rx3.b0] */
    /* JADX WARNING: type inference failed for: r10v10, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo83094k(com.tencent.p014mm.plugin.finder.storage.FinderItem r22, java.lang.String r23, java.lang.String r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            r2 = r24
            com.tencent.mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore r3 = com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore.f160325a
            boolean r4 = r3.mo78451b(r1)
            java.lang.String r5 = ", mediaId="
            if (r4 == 0) goto L_0x002d
            java.lang.String r3 = r0.f167027c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "innerPreloadPlayer: has already preload player, source="
            r4.append(r6)
            r4.append(r2)
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            return
        L_0x002d:
            wp1.g r4 = wp1.C66167g.f190173a
            r6 = 0
            cm1.f1 r4 = r4.mo90234c(r1, r6)
            int r7 = r4.mo76072m2()
            r8 = 1
            if (r7 <= 0) goto L_0x003d
            r7 = 1
            goto L_0x003e
        L_0x003d:
            r7 = 0
        L_0x003e:
            r9 = 0
            if (r7 == 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r4 = r9
        L_0x0043:
            if (r4 == 0) goto L_0x0219
            com.tencent.mm.plugin.finder.storage.FeedData$a r7 = com.tencent.p014mm.plugin.finder.storage.FeedData.Companion
            r10 = r22
            com.tencent.mm.plugin.finder.storage.FeedData r7 = r7.mo78884b(r10)
            pl1.r0 r15 = new pl1.r0
            java.util.LinkedList r11 = r7.getMediaList()
            java.lang.Object r11 = r11.getFirst()
            java.lang.String r12 = "feedData.mediaList.first"
            gy3.C87412m.m108593f(r11, r12)
            r12 = r11
            te3.rq2 r12 = (te3.C64689rq2) r12
            co1.e$a r11 = co1.C55048e.f154532L
            java.lang.String r13 = r4.field_fileFormat
            up1.y r13 = r11.mo53892a(r13)
            java.lang.String r14 = r4.field_fileFormat
            int r11 = r4.field_reqFormat
            int r4 = r4.field_dynamicRangeType
            r17 = 0
            r18 = 32
            r19 = 0
            r16 = r11
            r11 = r15
            r20 = r15
            r15 = r16
            r16 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r4 = r0.f167027c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "innerPreloadPlayer: preload success, source="
            r11.append(r12)
            r11.append(r2)
            r11.append(r5)
            r11.append(r1)
            java.lang.String r12 = ", feedId="
            r11.append(r12)
            long r12 = r22.getId()
            java.lang.String r10 = o40.C61926c.m72691p(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r10)
            r3.getClass()
            up1.f r4 = up1.C37521f.f99374d
            boolean r10 = r4.mo61166T()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "preloadThumbPlayer: switchOn="
            r11.append(r12)
            r11.append(r10)
            java.lang.String r12 = ", newMedia="
            r11.append(r12)
            er1.p0 r12 = er1.C58764p0.f168246a
            java.lang.String r13 = r7.getDescription()
            java.lang.String r13 = r12.mo83800a(r13)
            r11.append(r13)
            r13 = 46
            r11.append(r13)
            java.lang.String r14 = r20.mo11841b()
            r11.append(r14)
            java.lang.String r14 = ", oldCacheMedia="
            r11.append(r14)
            com.tencent.mm.plugin.finder.storage.FeedData r14 = com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore.f160328d
            if (r14 == 0) goto L_0x00ed
            java.lang.String r14 = r14.getDescription()
            goto L_0x00ee
        L_0x00ed:
            r14 = r9
        L_0x00ee:
            java.lang.String r12 = r12.mo83800a(r14)
            r11.append(r12)
            r11.append(r13)
            pl1.r0 r12 = com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore.f160327c
            if (r12 == 0) goto L_0x0101
            java.lang.String r12 = r12.mo11841b()
            goto L_0x0102
        L_0x0101:
            r12 = r9
        L_0x0102:
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "FinderPlayerPreloadCore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)
            if (r10 != 0) goto L_0x0112
            goto L_0x0217
        L_0x0112:
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r10 = com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore.f160326b
            if (r10 == 0) goto L_0x011c
            r10.stop()
            r10.mo78609d()
        L_0x011c:
            r10 = r20
            com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore.f160327c = r10
            com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore.f160328d = r7
            pe1.c<java.lang.Integer> r11 = up1.C37521f.f99286S7
            java.lang.Object r11 = r11.mo60266n()
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            java.lang.String r13 = "getContext()"
            if (r11 <= 0) goto L_0x013f
            gr1.a r11 = new gr1.a
            android.content.Context r14 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108593f(r14, r13)
            r11.<init>(r14)
            goto L_0x014b
        L_0x013f:
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r11 = new com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy
            android.content.Context r14 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108593f(r14, r13)
            r11.<init>(r14)
        L_0x014b:
            r11.setPreloadedView(r8)
            r11.setFullScreenEnjoy(r8)
            r11.mo78639o(r10, r6, r7)
            r3.getClass()
            boolean r4 = r4.mo61167U()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "attachSurface: switchOn="
            r7.append(r10)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r7)
            if (r4 != 0) goto L_0x0173
            goto L_0x01e7
        L_0x0173:
            java.lang.Class<om.h> r4 = p214om.C35191h.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            om.h r4 = (p214om.C35191h) r4
            androidx.appcompat.app.AppCompatActivity r4 = r4.Uh0()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "attachSurface: LauncherUI="
            r7.append(r10)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r7)
            if (r4 != 0) goto L_0x0196
            goto L_0x01e7
        L_0x0196:
            android.widget.FrameLayout r7 = com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore.f160329e
            if (r7 == 0) goto L_0x01bd
            android.content.Context r10 = r7.getContext()
            boolean r10 = gy3.C87412m.m108589b(r10, r4)
            if (r10 != 0) goto L_0x01b8
            android.view.ViewParent r10 = r7.getParent()
            boolean r12 = r10 instanceof android.view.ViewGroup
            if (r12 == 0) goto L_0x01af
            r9 = r10
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
        L_0x01af:
            if (r9 == 0) goto L_0x01b4
            r9.removeView(r7)
        L_0x01b4:
            r3.mo78452c(r4)
            goto L_0x01bb
        L_0x01b8:
            r7.removeAllViews()
        L_0x01bb:
            rx3.b0 r9 = rx3.C13598b0.f38549a
        L_0x01bd:
            if (r9 != 0) goto L_0x01c2
            r3.mo78452c(r4)
        L_0x01c2:
            android.widget.FrameLayout r3 = com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore.f160329e
            if (r3 == 0) goto L_0x01e0
            android.view.ViewParent r3 = r3.getParent()
            if (r3 != 0) goto L_0x01e0
            android.view.Window r3 = r4.getWindow()
            android.view.View r3 = r3.getDecorView()
            java.lang.String r4 = "null cannot be cast to non-null type android.view.ViewGroup"
            gy3.C87412m.m108592e(r3, r4)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.widget.FrameLayout r4 = com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore.f160329e
            r3.addView(r4, r8, r8)
        L_0x01e0:
            android.widget.FrameLayout r3 = com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore.f160329e
            if (r3 == 0) goto L_0x01e7
            r3.addView(r11)
        L_0x01e7:
            pe1.c<java.lang.Integer> r3 = up1.C37521f.f99433j5
            java.lang.Object r3 = r3.mo60266n()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.String r4 = r11.getFTPPTag()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "prepareToPlay minBufferDuration:"
            r7.append(r9)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
            r11.f161757y0 = r3
            r11.mo51228s()
            r11.f161757y0 = r6
            r11.setMute(r8)
            com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore.f160326b = r11
        L_0x0217:
            rx3.b0 r9 = rx3.C13598b0.f38549a
        L_0x0219:
            if (r9 != 0) goto L_0x0237
            java.lang.String r3 = r0.f167027c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "innerPreloadPlayer: do not have preload media, source="
            r4.append(r6)
            r4.append(r2)
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r1)
        L_0x0237:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: do1.C58341h.mo83094k(com.tencent.mm.plugin.finder.storage.FinderItem, java.lang.String, java.lang.String):void");
    }

    /* renamed from: l */
    public boolean mo83082l(C58344f fVar, C9342n1.C9346d dVar) {
        C87412m.m108594g(fVar, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(dVar, "resp");
        return true;
    }

    /* renamed from: m */
    public final boolean mo83095m() {
        return this.f167026b.mo78458g3().f185933M && this.f167034j.f185934N > 0;
    }

    /* renamed from: n */
    public boolean mo83083n(C58344f fVar, String str) {
        C87412m.m108594g(fVar, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(str, "log");
        String str2 = this.f167027c;
        Log.m105924i(str2, "[isValid] isEnableScene=" + this.f167031g + " isBackground=" + this.f167030f + " isInFinder=" + this.f167028d + " source=" + fVar + ' ' + str);
        return (fVar == C58344f.OutSideRedDot || fVar == C58344f.OutSideJumpHot || fVar == C58344f.OutSideTimeout || fVar == C58344f.EnterLoad || fVar == C58344f.ExitFinderHome || fVar == C58344f.WxForeground) ? !this.f167028d && this.f167031g.get() && !this.f167030f.get() : this.f167028d && this.f167031g.get() && !this.f167030f.get();
    }

    /* renamed from: o */
    public void mo83084o(int i, C64777vl1 vl12) {
        C87412m.m108594g(vl12, "serverConfig");
        String str = this.f167027c;
        StringBuilder sb = new StringBuilder();
        sb.append("[performServerConfigChanged] fromTabType=");
        sb.append(i);
        sb.append(" serverConfig=");
        sb.append('[' + vl12.f185936d + ", " + vl12.f185937e + ", " + vl12.f185938f + ", " + vl12.f185939g + ", " + vl12.f185940h + ", " + vl12.f185941i + ", " + vl12.f185942j + ", " + vl12.f185943n + ", " + vl12.f185944o + ", " + vl12.f185945p + ", " + vl12.f185946q + ", " + vl12.f185947r + ", " + vl12.f185948s + ", " + vl12.f185949t + ", " + vl12.f185950u + ", " + vl12.f185951v + ", " + vl12.f185952w + ", new: " + vl12.f185921A + ", " + vl12.f185922B + ", " + vl12.f185923C + ", " + vl12.f185924D + ", valid: " + vl12.f185925E + ", " + vl12.f185926F + ", " + vl12.f185927G + ", " + vl12.f185928H + ", tabPrefetch:" + vl12.f185931K + ", frontend_prefetch_switch:" + vl12.f185933M + " frontend_prefetch_interval_sec:" + vl12.f185934N + ']');
        Log.m105924i(str, sb.toString());
        this.f167034j = vl12;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x02bd A[Catch:{ all -> 0x03ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0356 A[Catch:{ all -> 0x03ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0202 A[Catch:{ all -> 0x03ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0271 A[Catch:{ all -> 0x03ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0273 A[Catch:{ all -> 0x03ca }] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo83085p(do1.C58341h.C58344f r40, android.content.Intent r41, fy3.C32226l<? super do1.C58341h.C58345g, rx3.C13598b0> r42) {
        /*
            r39 = this;
            r10 = r39
            r0 = r40
            r1 = r41
            r7 = r42
            java.lang.Class<dp1.y0> r2 = dp1.C58417y0.class
            do1.h$f r3 = do1.C58341h.C58344f.EnterLoad
            java.lang.String r4 = "source"
            gy3.C87412m.m108594g(r0, r4)
            java.lang.String r4 = "call"
            gy3.C87412m.m108594g(r7, r4)
            com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore r4 = r10.f167026b
            boolean r4 = r4.mo78461k3(r0)
            if (r4 != 0) goto L_0x003b
            java.lang.String r1 = r10.f167027c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "isEnable=false source="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
            do1.h$g r0 = do1.C58341h.C58345g.DISABLE
            r7.invoke(r0)
            return
        L_0x003b:
            java.lang.String r4 = ""
            boolean r5 = r10.mo83083n(r0, r4)
            if (r5 != 0) goto L_0x005f
            java.lang.String r1 = r10.f167027c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "isValid=false source="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
            do1.h$g r0 = do1.C58341h.C58345g.INVALID
            r7.invoke(r0)
            return
        L_0x005f:
            java.util.concurrent.locks.ReentrantLock r5 = r10.f167038n
            r5.lock()
            do1.h$e r5 = r10.f167042r     // Catch:{ all -> 0x03ca }
            boolean r6 = r5.f25557a     // Catch:{ all -> 0x03ca }
            if (r6 == 0) goto L_0x008b
            java.lang.String r1 = r10.f167027c     // Catch:{ all -> 0x03ca }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x03ca }
            r2.<init>()     // Catch:{ all -> 0x03ca }
            java.lang.String r3 = "isLoading=true source="
            r2.append(r3)     // Catch:{ all -> 0x03ca }
            r2.append(r0)     // Catch:{ all -> 0x03ca }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x03ca }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)     // Catch:{ all -> 0x03ca }
            do1.h$g r0 = do1.C58341h.C58345g.LOADING     // Catch:{ all -> 0x03ca }
            r7.invoke(r0)     // Catch:{ all -> 0x03ca }
            java.util.concurrent.locks.ReentrantLock r0 = r10.f167038n
            r0.unlock()
            return
        L_0x008b:
            r6 = 1
            r5.f25557a = r6     // Catch:{ all -> 0x03ca }
            r5.f25558b = r0     // Catch:{ all -> 0x03ca }
            int r5 = r40.ordinal()     // Catch:{ all -> 0x03ca }
            java.lang.String r8 = "FinderEntrance"
            r9 = 9
            if (r5 == r9) goto L_0x00cb
            switch(r5) {
                case 0: goto L_0x00b0;
                case 1: goto L_0x00ad;
                case 2: goto L_0x00c8;
                case 3: goto L_0x00aa;
                case 4: goto L_0x00a5;
                case 5: goto L_0x00a3;
                case 6: goto L_0x009e;
                default: goto L_0x009d;
            }
        L_0x009d:
            goto L_0x00cf
        L_0x009e:
            r5 = 17
            r9 = 17
            goto L_0x00cf
        L_0x00a3:
            r9 = 0
            goto L_0x00cf
        L_0x00a5:
            r5 = 8
            r9 = 8
            goto L_0x00cf
        L_0x00aa:
            r5 = 5
            r9 = 5
            goto L_0x00cf
        L_0x00ad:
            r5 = 7
            r9 = 7
            goto L_0x00cf
        L_0x00b0:
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r5 = r39.mo83092i()     // Catch:{ all -> 0x03ca }
            com.tencent.mm.plugin.finder.extension.reddot.s0 r5 = r5.mo77227G5(r8)     // Catch:{ all -> 0x03ca }
            if (r5 == 0) goto L_0x00c4
            long r12 = r5.field_aiScene     // Catch:{ all -> 0x03ca }
            r14 = 10000(0x2710, double:4.9407E-320)
            int r5 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r5 < 0) goto L_0x00c4
            r5 = 1
            goto L_0x00c5
        L_0x00c4:
            r5 = 0
        L_0x00c5:
            if (r5 == 0) goto L_0x00c8
            goto L_0x00cf
        L_0x00c8:
            r5 = 6
            r9 = 6
            goto L_0x00cf
        L_0x00cb:
            r5 = 20
            r9 = 20
        L_0x00cf:
            do1.h$a r5 = r10.f167040p     // Catch:{ all -> 0x03ca }
            je1.n1$d r12 = r5.f167044b     // Catch:{ all -> 0x03ca }
            if (r12 == 0) goto L_0x00d7
            r15 = 1
            goto L_0x00d8
        L_0x00d7:
            r15 = 0
        L_0x00d8:
            pe3.b r5 = r5.f167051i     // Catch:{ all -> 0x03ca }
            if (r5 != 0) goto L_0x00ff
            f40.o r5 = f40.C86709a0.m107535s()     // Catch:{ all -> 0x03ca }
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()     // Catch:{ all -> 0x03ca }
            er1.w3 r12 = er1.C58784w3.f168295a     // Catch:{ all -> 0x03ca }
            int r13 = r10.f167025a     // Catch:{ all -> 0x03ca }
            com.tencent.mm.storage.y1$a r12 = r12.mo83914a0(r13)     // Catch:{ all -> 0x03ca }
            java.lang.Object r5 = r5.mo119685f(r12, r4)     // Catch:{ all -> 0x03ca }
            java.lang.String r12 = "null cannot be cast to non-null type kotlin.String"
            gy3.C87412m.m108592e(r5, r12)     // Catch:{ all -> 0x03ca }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x03ca }
            byte[] r5 = com.tencent.p014mm.sdk.platformtools.Util.decodeHexString(r5)     // Catch:{ all -> 0x03ca }
            pe3.b r5 = pe3.C89349b.m111674a(r5)     // Catch:{ all -> 0x03ca }
        L_0x00ff:
            do1.h$a r12 = r10.f167040p     // Catch:{ all -> 0x03ca }
            je1.n1$d r12 = r12.f167044b     // Catch:{ all -> 0x03ca }
            if (r12 == 0) goto L_0x0110
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r12 = r12.f146069d     // Catch:{ all -> 0x03ca }
            if (r12 == 0) goto L_0x0110
            java.util.LinkedList r13 = new java.util.LinkedList     // Catch:{ all -> 0x03ca }
            r13.<init>(r12)     // Catch:{ all -> 0x03ca }
            r14 = r13
            goto L_0x0116
        L_0x0110:
            java.util.LinkedList r12 = new java.util.LinkedList     // Catch:{ all -> 0x03ca }
            r12.<init>()     // Catch:{ all -> 0x03ca }
            r14 = r12
        L_0x0116:
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r12 = r39.mo83092i()     // Catch:{ all -> 0x03ca }
            com.tencent.mm.plugin.finder.extension.reddot.s0 r8 = r12.mo77227G5(r8)     // Catch:{ all -> 0x03ca }
            java.lang.String r12 = "preload: tabType="
            r16 = 0
            if (r9 != 0) goto L_0x01c7
            int r13 = r10.f167025a     // Catch:{ all -> 0x03ca }
            if (r13 == r6) goto L_0x012b
            r11 = 3
            if (r13 != r11) goto L_0x01c7
        L_0x012b:
            er1.w3 r11 = er1.C58784w3.f168295a     // Catch:{ all -> 0x03ca }
            tf1.i$a r6 = tf1.C13908i.f39090e     // Catch:{ all -> 0x03ca }
            tf1.i r6 = r6.mo13382a(r13)     // Catch:{ all -> 0x03ca }
            int r6 = r6.f39109d     // Catch:{ all -> 0x03ca }
            r21 = 0
            r22 = 0
            r23 = 1
            r24 = 0
            r25 = 0
            r26 = 54
            r27 = 0
            r19 = r11
            r20 = r6
            java.util.List r6 = er1.C58784w3.m68434Z(r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x03ca }
            java.lang.Class<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r13 = com.tencent.p014mm.plugin.finder.model.BaseFinderFeed.class
            java.util.List r6 = r11.mo83922d0(r6, r13)     // Catch:{ all -> 0x03ca }
            int r13 = r10.f167025a     // Catch:{ all -> 0x03ca }
            java.util.List r6 = r11.mo83968u0(r6, r13)     // Catch:{ all -> 0x03ca }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x03ca }
            r13 = 10
            int r13 = sx3.C36907w.m41090l(r6, r13)     // Catch:{ all -> 0x03ca }
            r11.<init>(r13)     // Catch:{ all -> 0x03ca }
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ all -> 0x03ca }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x03ca }
        L_0x0168:
            boolean r13 = r6.hasNext()     // Catch:{ all -> 0x03ca }
            if (r13 == 0) goto L_0x0180
            java.lang.Object r13 = r6.next()     // Catch:{ all -> 0x03ca }
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r13 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r13     // Catch:{ all -> 0x03ca }
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r13.mo3513o()     // Catch:{ all -> 0x03ca }
            com.tencent.mm.protocal.protobuf.FinderObject r13 = r13.getFeedObject()     // Catch:{ all -> 0x03ca }
            r11.add(r13)     // Catch:{ all -> 0x03ca }
            goto L_0x0168
        L_0x0180:
            r14.addAll(r11)     // Catch:{ all -> 0x03ca }
            java.lang.String r6 = r10.f167027c     // Catch:{ all -> 0x03ca }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x03ca }
            r11.<init>()     // Catch:{ all -> 0x03ca }
            r11.append(r12)     // Catch:{ all -> 0x03ca }
            int r13 = r10.f167025a     // Catch:{ all -> 0x03ca }
            r11.append(r13)     // Catch:{ all -> 0x03ca }
            java.lang.String r13 = ", unreadList="
            r11.append(r13)     // Catch:{ all -> 0x03ca }
            int r13 = r14.size()     // Catch:{ all -> 0x03ca }
            r11.append(r13)     // Catch:{ all -> 0x03ca }
            java.lang.String r13 = " first="
            r11.append(r13)     // Catch:{ all -> 0x03ca }
            java.lang.Object r13 = sx3.C110818d0.m150925W(r14)     // Catch:{ all -> 0x03ca }
            com.tencent.mm.protocal.protobuf.FinderObject r13 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r13     // Catch:{ all -> 0x03ca }
            if (r13 == 0) goto L_0x01b2
            r19 = r4
            r21 = r5
            long r4 = r13.f164794id     // Catch:{ all -> 0x03ca }
            goto L_0x01b8
        L_0x01b2:
            r19 = r4
            r21 = r5
            r4 = r16
        L_0x01b8:
            java.lang.String r4 = o40.C61926c.m72691p(r4)     // Catch:{ all -> 0x03ca }
            r11.append(r4)     // Catch:{ all -> 0x03ca }
            java.lang.String r4 = r11.toString()     // Catch:{ all -> 0x03ca }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)     // Catch:{ all -> 0x03ca }
            goto L_0x01cb
        L_0x01c7:
            r19 = r4
            r21 = r5
        L_0x01cb:
            java.lang.String r4 = "nextPreload"
            r5 = 1
            boolean r4 = r10.mo83089e(r5, r4)     // Catch:{ all -> 0x03ca }
            if (r4 == 0) goto L_0x01ed
            if (r0 == r3) goto L_0x01ed
            do1.b r29 = do1.C58332b.f167018a     // Catch:{ all -> 0x03ca }
            r30 = 0
            r31 = 0
            r32 = 3
            r33 = 2
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 115(0x73, float:1.61E-43)
            r38 = 0
            do1.C58332b.m67542a(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)     // Catch:{ all -> 0x03ca }
        L_0x01ed:
            te3.hj1 r6 = new te3.hj1     // Catch:{ all -> 0x03ca }
            r6.<init>()     // Catch:{ all -> 0x03ca }
            di3.d r4 = di3.C86312j.m106911c(r2)     // Catch:{ all -> 0x03ca }
            dp1.y0 r4 = (dp1.C58417y0) r4     // Catch:{ all -> 0x03ca }
            int r5 = r10.f167025a     // Catch:{ all -> 0x03ca }
            int r4 = r4.mo83328dc(r5)     // Catch:{ all -> 0x03ca }
            r6.f134675i = r4     // Catch:{ all -> 0x03ca }
            if (r0 != r3) goto L_0x0253
            rs1.s8$a r4 = rs1.C13442s8.f38060Q0     // Catch:{ all -> 0x03ca }
            int r5 = r10.f167025a     // Catch:{ all -> 0x03ca }
            java.lang.String r4 = r4.mo12869a(r5)     // Catch:{ all -> 0x03ca }
            r6.f134672f = r4     // Catch:{ all -> 0x03ca }
            if (r1 == 0) goto L_0x0216
            java.lang.String r4 = "key_context_id"
            java.lang.String r4 = r1.getStringExtra(r4)     // Catch:{ all -> 0x03ca }
            if (r4 != 0) goto L_0x0220
        L_0x0216:
            di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ all -> 0x03ca }
            dp1.y0 r2 = (dp1.C58417y0) r2     // Catch:{ all -> 0x03ca }
            java.lang.String r4 = r2.mo83357yP()     // Catch:{ all -> 0x03ca }
        L_0x0220:
            r6.f134671e = r4     // Catch:{ all -> 0x03ca }
            java.lang.Class<h81.i> r2 = h81.C59774i.class
            di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ all -> 0x03ca }
            h81.i r2 = (h81.C59774i) r2     // Catch:{ all -> 0x03ca }
            java.lang.String r2 = r2.mo84751Wb()     // Catch:{ all -> 0x03ca }
            if (r2 != 0) goto L_0x0232
            r2 = r19
        L_0x0232:
            r6.f134670d = r2     // Catch:{ all -> 0x03ca }
            if (r1 == 0) goto L_0x023e
            java.lang.String r2 = "key_extra_info"
            java.lang.String r2 = r1.getStringExtra(r2)     // Catch:{ all -> 0x03ca }
            if (r2 != 0) goto L_0x0240
        L_0x023e:
            r2 = r19
        L_0x0240:
            r6.f134681r = r2     // Catch:{ all -> 0x03ca }
            if (r1 == 0) goto L_0x024f
            java.lang.String r2 = "key_enter_source_info"
            java.lang.String r1 = r1.getStringExtra(r2)     // Catch:{ all -> 0x03ca }
            if (r1 != 0) goto L_0x024d
            goto L_0x024f
        L_0x024d:
            r4 = r1
            goto L_0x0251
        L_0x024f:
            r4 = r19
        L_0x0251:
            r6.f134682s = r4     // Catch:{ all -> 0x03ca }
        L_0x0253:
            java.lang.String r1 = r10.f167027c     // Catch:{ all -> 0x03ca }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x03ca }
            r2.<init>()     // Catch:{ all -> 0x03ca }
            r2.append(r12)     // Catch:{ all -> 0x03ca }
            int r4 = r10.f167025a     // Catch:{ all -> 0x03ca }
            r2.append(r4)     // Catch:{ all -> 0x03ca }
            java.lang.String r4 = ", hasCache="
            r2.append(r4)     // Catch:{ all -> 0x03ca }
            r2.append(r15)     // Catch:{ all -> 0x03ca }
            java.lang.String r4 = ", consumeFlag="
            r2.append(r4)     // Catch:{ all -> 0x03ca }
            if (r15 == 0) goto L_0x0273
            r11 = 0
            goto L_0x0274
        L_0x0273:
            r11 = 1
        L_0x0274:
            r2.append(r11)     // Catch:{ all -> 0x03ca }
            java.lang.String r4 = ", unread list size="
            r2.append(r4)     // Catch:{ all -> 0x03ca }
            int r4 = r14.size()     // Catch:{ all -> 0x03ca }
            r2.append(r4)     // Catch:{ all -> 0x03ca }
            java.lang.String r4 = ", pullType="
            r2.append(r4)     // Catch:{ all -> 0x03ca }
            r2.append(r9)     // Catch:{ all -> 0x03ca }
            java.lang.String r4 = ", source="
            r2.append(r4)     // Catch:{ all -> 0x03ca }
            r2.append(r0)     // Catch:{ all -> 0x03ca }
            java.lang.String r4 = ", cache="
            r2.append(r4)     // Catch:{ all -> 0x03ca }
            do1.h$a r4 = r10.f167040p     // Catch:{ all -> 0x03ca }
            r2.append(r4)     // Catch:{ all -> 0x03ca }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x03ca }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x03ca }
            kj2.d r29 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x03ca }
            r30 = 1421(0x58d, double:7.02E-321)
            int r1 = r10.f167025a     // Catch:{ all -> 0x03ca }
            long r1 = r10.mo83093j(r1)     // Catch:{ all -> 0x03ca }
            r4 = 11
            long r4 = (long) r4     // Catch:{ all -> 0x03ca }
            long r32 = r1 + r4
            r34 = 1
            r36 = 0
            r29.idkeyStat(r30, r32, r34, r36)     // Catch:{ all -> 0x03ca }
            r11 = -1
            if (r0 == r3) goto L_0x0356
            bo1.v r1 = bo1.C54509v.f152802a     // Catch:{ all -> 0x03ca }
            bo1.v$a r12 = bo1.C54509v.C54510a.Preload     // Catch:{ all -> 0x03ca }
            int r2 = r10.f167025a     // Catch:{ all -> 0x03ca }
            do1.h$d r3 = new do1.h$d     // Catch:{ all -> 0x03ca }
            r3.<init>()     // Catch:{ all -> 0x03ca }
            r3.f167056b = r9     // Catch:{ all -> 0x03ca }
            if (r8 == 0) goto L_0x02d3
            te3.yi1 r4 = r8.f158585F     // Catch:{ all -> 0x03ca }
            if (r4 == 0) goto L_0x02d3
            long r4 = r4.f186549g     // Catch:{ all -> 0x03ca }
            goto L_0x02d5
        L_0x02d3:
            r4 = r16
        L_0x02d5:
            r3.f167055a = r4     // Catch:{ all -> 0x03ca }
            if (r8 == 0) goto L_0x02df
            te3.yi1 r4 = r8.f158585F     // Catch:{ all -> 0x03ca }
            if (r4 == 0) goto L_0x02df
            int r11 = r4.f186563x     // Catch:{ all -> 0x03ca }
        L_0x02df:
            r3.f167058d = r11     // Catch:{ all -> 0x03ca }
            if (r8 == 0) goto L_0x02e6
            long r4 = r8.field_aiScene     // Catch:{ all -> 0x03ca }
            goto L_0x02e8
        L_0x02e6:
            r4 = r16
        L_0x02e8:
            r3.f167057c = r4     // Catch:{ all -> 0x03ca }
            rx3.b0 r4 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x03ca }
            te3.vl1 r4 = r10.f167034j     // Catch:{ all -> 0x03ca }
            int r5 = r0.f167071e     // Catch:{ all -> 0x03ca }
            r18 = 0
            r19 = 64
            r20 = 0
            r11 = r1
            r13 = r40
            r22 = r14
            r14 = r2
            r25 = r15
            r15 = r3
            r16 = r4
            r17 = r5
            bo1.C54509v.m61229b(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x03ca }
            je1.n1 r11 = new je1.n1     // Catch:{ all -> 0x03ca }
            int r13 = r10.f167025a     // Catch:{ all -> 0x03ca }
            r18 = 1
            r19 = 0
            r20 = 0
            r1 = 0
            r2 = 0
            r23 = 960(0x3c0, float:1.345E-42)
            r24 = 0
            r12 = r11
            r14 = r9
            r15 = r21
            r16 = r6
            r17 = r22
            r21 = r1
            r22 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x03ca }
            le1.b r1 = new le1.b     // Catch:{ all -> 0x03ca }
            r1.<init>()     // Catch:{ all -> 0x03ca }
            r2 = 1
            r11.mo10081d(r1, r2)     // Catch:{ all -> 0x03ca }
            do1.h$k r12 = new do1.h$k     // Catch:{ all -> 0x03ca }
            r1 = r12
            r2 = r25
            r3 = r40
            r4 = r9
            r5 = r39
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x03ca }
            r11.f29190q = r12     // Catch:{ all -> 0x03ca }
            do1.h$l r12 = new do1.h$l     // Catch:{ all -> 0x03ca }
            r1 = r12
            r2 = r39
            r3 = r40
            r4 = r11
            r5 = r9
            r6 = r8
            r7 = r42
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x03ca }
            r11.f29189p = r12     // Catch:{ all -> 0x03ca }
            r11.mo10086i()     // Catch:{ all -> 0x03ca }
            r10.f167041q = r11     // Catch:{ all -> 0x03ca }
            goto L_0x03c4
        L_0x0356:
            r22 = r14
            r25 = r15
            a14.h0 r1 = a14.C53872d1.f151119c     // Catch:{ all -> 0x03ca }
            a14.n0 r26 = a14.C53930o0.m60554a(r1)     // Catch:{ all -> 0x03ca }
            r27 = 0
            r28 = 0
            do1.k r29 = new do1.k     // Catch:{ all -> 0x03ca }
            r12 = 0
            r1 = r29
            r2 = r42
            r3 = r39
            r4 = r40
            r5 = r21
            r7 = r22
            r13 = r8
            r8 = r25
            r14 = r9
            r9 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x03ca }
            r30 = 3
            r31 = 0
            a14.C53895h.m60466d(r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x03ca }
            bo1.v r1 = bo1.C54509v.f152802a     // Catch:{ all -> 0x03ca }
            bo1.v$a r12 = bo1.C54509v.C54510a.NormalEnter     // Catch:{ all -> 0x03ca }
            int r2 = r10.f167025a     // Catch:{ all -> 0x03ca }
            do1.h$d r15 = new do1.h$d     // Catch:{ all -> 0x03ca }
            r15.<init>()     // Catch:{ all -> 0x03ca }
            r15.f167056b = r14     // Catch:{ all -> 0x03ca }
            if (r13 == 0) goto L_0x0398
            te3.yi1 r3 = r13.f158585F     // Catch:{ all -> 0x03ca }
            if (r3 == 0) goto L_0x0398
            long r3 = r3.f186549g     // Catch:{ all -> 0x03ca }
            goto L_0x039a
        L_0x0398:
            r3 = r16
        L_0x039a:
            r15.f167055a = r3     // Catch:{ all -> 0x03ca }
            if (r13 == 0) goto L_0x03a4
            te3.yi1 r3 = r13.f158585F     // Catch:{ all -> 0x03ca }
            if (r3 == 0) goto L_0x03a4
            int r11 = r3.f186563x     // Catch:{ all -> 0x03ca }
        L_0x03a4:
            r15.f167058d = r11     // Catch:{ all -> 0x03ca }
            if (r13 == 0) goto L_0x03ab
            long r3 = r13.field_aiScene     // Catch:{ all -> 0x03ca }
            goto L_0x03ad
        L_0x03ab:
            r3 = r16
        L_0x03ad:
            r15.f167057c = r3     // Catch:{ all -> 0x03ca }
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x03ca }
            te3.vl1 r3 = r10.f167034j     // Catch:{ all -> 0x03ca }
            r17 = 0
            r18 = 0
            r19 = 96
            r20 = 0
            r11 = r1
            r13 = r40
            r14 = r2
            r16 = r3
            bo1.C54509v.m61229b(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x03ca }
        L_0x03c4:
            java.util.concurrent.locks.ReentrantLock r0 = r10.f167038n
            r0.unlock()
            return
        L_0x03ca:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r1 = r10.f167038n
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: do1.C58341h.mo83085p(do1.h$f, android.content.Intent, fy3.l):void");
    }

    /* renamed from: r */
    public final void mo83096r(C9342n1.C9346d dVar, C58344f fVar, int i, C58343d dVar2, long j) {
        C87412m.m108594g(dVar, "resp");
        C87412m.m108594g(fVar, FirebaseAnalytics.C113379b.SOURCE);
        String str = this.f167027c;
        Log.m105924i(str, "putCache: source=" + fVar + " pullType=" + i);
        this.f167038n.lock();
        try {
            C58342a aVar = this.f167040p;
            aVar.f167051i = dVar.f146070e;
            aVar.f167044b = dVar;
            aVar.f167045c = fVar;
            aVar.f167046d = dVar2;
            aVar.f167048f = j;
        } finally {
            C7408e eVar = this.f167042r;
            eVar.f25557a = false;
            eVar.f25558b = fVar;
            this.f167039o.signalAll();
            this.f167038n.unlock();
        }
    }

    /* renamed from: s */
    public final void mo83097s(List<? extends FinderObject> list) {
        LinkedList<C51822we1> linkedList;
        String str = this.f167027c;
        Log.m105924i(str, "recycleObjects: size = " + list.size());
        LinkedList linkedList2 = new LinkedList();
        for (FinderObject finderObject : list) {
            if (!C65834e.f189316a.mo89873g(this.f167025a, finderObject.f164794id)) {
                C49173do1 do12 = new C49173do1();
                do12.f132446d = finderObject.f164794id;
                do12.f132447e = finderObject.objectNonceId;
                do12.f132449g = finderObject.sessionBuffer;
                do12.f132448f = this.f167025a;
                linkedList2.add(do12);
            }
        }
        if (!linkedList2.isEmpty()) {
            C49712hj1 hj12 = new C49712hj1();
            hj12.f134675i = ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83328dc(this.f167025a);
            C46518f fVar = new C46518f(linkedList2, hj12);
            C49842ig0 ig02 = fVar.f125320t.f139764d;
            if (!(ig02 == null || (linkedList = ig02.f135319n) == null)) {
                for (FinderObject finderObject2 : list) {
                    C51822we1 we12 = new C51822we1();
                    we12.f143984d = finderObject2.f164794id;
                    we12.f143985e = finderObject2.sessionBuffer;
                    Log.m105924i("Finder.CgiCollectUnreadItem", "fillFinderBaseReqData: feedId = " + C61926c.m72691p(we12.f143984d) + ", session_buffer = " + we12.f143985e);
                    linkedList.add(we12);
                }
            }
            fVar.mo9225i();
        }
    }

    /* renamed from: u */
    public final void mo83098u(boolean z, C58344f fVar) {
        C87412m.m108594g(fVar, FirebaseAnalytics.C113379b.SOURCE);
        String str = this.f167027c;
        Log.m105924i(str, "setLoading: load=" + z);
        this.f167038n.lock();
        try {
            C7408e eVar = this.f167042r;
            eVar.f25557a = z;
            eVar.f25558b = fVar;
        } finally {
            this.f167038n.unlock();
        }
    }
}
