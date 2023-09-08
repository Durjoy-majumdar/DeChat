package ue1;

import a14.C0000n0;
import a14.C53895h;
import android.app.Activity;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.service.notification.StatusBarNotification;
import android.util.Base64;
import bl3.C39818r;
import c14.C54624g;
import c14.C54625h;
import c14.C54629k;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderAppPushRouteProxyUI;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75592q0;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C33071r2;
import ht1.C60200t1;
import ht1.C60204t3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.ResultKt;
import l60.C99344b;
import m00.C10700d;
import ns3.C11266d;
import o40.C61926c;
import ob0.C35136m;
import org.json.JSONObject;
import p182kk.C61104a;
import p645pj.C77091b;
import p687sr.C64153e;
import p687sr.C64157h;
import p687sr.C64159i;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import r60.C101350i;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64175a0;
import t60.C13831b;
import t60.C64205a;
import t60.C64207e;
import up1.C27696y;
import up1.C37521f;
import up1.C37558x0;
import wx3.C15601d;
import wx3.C66212f;
import x60.C102564a;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: ue1.r */
public final class C65328r implements C33071r2 {

    /* renamed from: a */
    public final C13601g f188011a = C36568h.m40985a(new C37447l(this));

    /* renamed from: b */
    public int f188012b;

    /* renamed from: c */
    public final MultiProcessMMKV f188013c = MultiProcessMMKV.getSingleMMKV("FinderGlobalPushNewXmlConsumer");

    /* renamed from: d */
    public boolean f188014d;

    /* renamed from: e */
    public final ConcurrentLinkedQueue<C37442c> f188015e = new ConcurrentLinkedQueue<>();

    /* renamed from: f */
    public final MMHandler f188016f = new MMHandler("FinderGlobalPushNewXmlConsumerHandler");

    /* renamed from: g */
    public final C37444e f188017g = new C37444e();

    /* renamed from: h */
    public long f188018h = -1;

    /* renamed from: i */
    public boolean f188019i;

    /* renamed from: j */
    public boolean f188020j;

    /* renamed from: ue1.r$a */
    public static final class C37438a implements C114668z {

        /* renamed from: d */
        public final /* synthetic */ C65328r f98949d;

        /* renamed from: ue1.r$a$a */
        public static final class C37439a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C65328r f98950d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C37439a(C65328r rVar) {
                super(0);
                this.f98950d = rVar;
            }

            public Object invoke() {
                Class cls = C60200t1.class;
                Class cls2 = FinderCommonFeatureService.class;
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                boolean hD = ((C64153e) C86312j.m106911c(C64153e.class)).mo88361hD(context);
                Log.m105925i("Finder.GlobalPushNewXmlConsumer", "[onAppForeground] %s %s %s %s", Boolean.valueOf(C77091b.m93036r()), Boolean.valueOf(C77091b.m93034p()), Boolean.valueOf(this.f98950d.mo89438p()), Boolean.valueOf(hD));
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_APP_PUSH_REPORT_ENABLE_TIME_LONG, Long.valueOf(C31543z5.m39453c()));
                boolean H5 = ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Nt0().mo77229H5();
                boolean G5 = ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83760G5();
                boolean z = !C65328r.m76915b(this.f98950d, 70368744177664L);
                boolean z2 = !C65328r.m76915b(this.f98950d, 9007199254740992L);
                boolean S5 = ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83772S5();
                boolean K5 = ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Nt0().mo77235K5();
                boolean z3 = H5;
                boolean z4 = !C65328r.m76915b(this.f98950d, 34359738368L);
                boolean sF = ((C60200t1) C86312j.m106911c(cls)).mo76873sF();
                boolean Y5 = ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Nt0().mo77253Y5();
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[8];
                objArr[0] = Long.valueOf(System.currentTimeMillis());
                objArr[1] = Integer.valueOf(C77091b.m93036r() ^ true ? 1 : 0);
                objArr[2] = Integer.valueOf(C77091b.m93034p() ^ true ? 1 : 0);
                objArr[3] = Integer.valueOf(this.f98950d.mo89438p() ^ true ? 1 : 0);
                objArr[4] = Integer.valueOf((!z4 || !sF || !Y5) ? 1 : 0);
                int i = "";
                objArr[5] = (!z2 || !S5 || !K5) ? z2 ? 1 : i : 0;
                if (!S5 && z3 && G5 && z) {
                    i = 0;
                } else if (!S5 && G5) {
                    i = 1;
                }
                objArr[6] = i;
                objArr[7] = Integer.valueOf(hD ^ true ? 1 : 0);
                nVar.mo160131h(23497, objArr);
                return C13598b0.f38549a;
            }
        }

        public C37438a(C65328r rVar) {
            this.f98949d = rVar;
        }

        public void onAppBackground(String str) {
            C65328r rVar = this.f98949d;
            rVar.f188016f.removeCallbacks(rVar.f188017g);
        }

        public void onAppForeground(String str) {
            if (!this.f98949d.f188015e.isEmpty()) {
                C65328r rVar = this.f98949d;
                C37521f.f99374d.getClass();
                rVar.mo89428e((long) C37521f.f99302U5.mo60266n().intValue(), C37445f.FG);
            }
            if (C31543z5.m39453c() - C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_FINDER_APP_PUSH_REPORT_ENABLE_TIME_LONG, 0) >= 86400000) {
                C61926c.m72656A((String) null, new C37439a(this.f98949d));
            }
        }
    }

    /* renamed from: ue1.r$b */
    public static final class C37440b implements Application.ActivityLifecycleCallbacks {

        /* renamed from: d */
        public final /* synthetic */ C65328r f98951d;

        /* renamed from: ue1.r$b$a */
        public static final class C37441a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C65328r f98952d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C37441a(C65328r rVar) {
                super(0);
                this.f98952d = rVar;
            }

            public Object invoke() {
                this.f98952d.mo89426c();
                return C13598b0.f38549a;
            }
        }

        public C37440b(C65328r rVar) {
            this.f98951d = rVar;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (activity instanceof MMFinderUI) {
                this.f98951d.f188012b++;
            }
        }

        public void onActivityDestroyed(Activity activity) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (activity instanceof MMFinderUI) {
                C65328r rVar = this.f98951d;
                rVar.f188012b--;
            }
            this.f98951d.mo89428e(500, C37445f.EXIT);
        }

        public void onActivityPaused(Activity activity) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            this.f98951d.f188014d = ((C10700d) C86312j.m106911c(C10700d.class)).mo10954FJ(activity);
        }

        public void onActivityResumed(Activity activity) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            this.f98951d.f188014d = ((C10700d) C86312j.m106911c(C10700d.class)).mo10954FJ(activity);
            if (activity instanceof MMFinderUI) {
                C61926c.m72656A((String) null, new C37441a(this.f98951d));
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108594g(bundle, "outState");
        }

        public void onActivityStarted(Activity activity) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        }

        public void onActivityStopped(Activity activity) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        }
    }

    /* renamed from: ue1.r$c */
    public static final class C37442c {

        /* renamed from: a */
        public final String f98953a;

        /* renamed from: b */
        public final Map<String, String> f98954b;

        /* renamed from: c */
        public final C35136m.C35137a f98955c;

        /* renamed from: d */
        public final int f98956d;

        public C37442c(String str, Map<String, String> map, C35136m.C35137a aVar, int i) {
            C87412m.m108594g(map, "values");
            this.f98953a = str;
            this.f98954b = map;
            this.f98955c = aVar;
            this.f98956d = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37442c)) {
                return false;
            }
            C37442c cVar = (C37442c) obj;
            return C87412m.m108589b(this.f98953a, cVar.f98953a) && C87412m.m108589b(this.f98954b, cVar.f98954b) && C87412m.m108589b(this.f98955c, cVar.f98955c) && this.f98956d == cVar.f98956d;
        }

        public int hashCode() {
            String str = this.f98953a;
            int i = 0;
            int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f98954b.hashCode()) * 31;
            C35136m.C35137a aVar = this.f98955c;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return ((hashCode + i) * 31) + this.f98956d;
        }

        public String toString() {
            return "ConsumeNewXmlData(subType=" + this.f98953a + ", values=" + this.f98954b + ", addMsgInfo=" + this.f98955c + ", pendingReason=" + this.f98956d + ')';
        }
    }

    /* renamed from: ue1.r$d */
    public static final class C37443d {

        /* renamed from: a */
        public final int f98957a;

        /* renamed from: b */
        public boolean f98958b = true;

        public C37443d(int i) {
            this.f98957a = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37443d) && this.f98957a == ((C37443d) obj).f98957a;
        }

        public int hashCode() {
            return this.f98957a;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f98957a);
            sb.append('@');
            sb.append(this.f98958b);
            return sb.toString();
        }
    }

    /* renamed from: ue1.r$e */
    public final class C37444e implements Runnable {

        /* renamed from: d */
        public C37445f f98959d = C37445f.DEF;

        public C37444e() {
        }

        public void run() {
            String str;
            C65328r.this.f188020j = false;
            Log.m105924i("Finder.GlobalPushNewXmlConsumer", "[pendingTask] dispatch delay task. size=" + C65328r.this.f188015e.size());
            LinkedList<C37442c> linkedList = new LinkedList<>(C65328r.this.f188015e);
            C65328r.this.f188015e.clear();
            C37424b0.f98925a.mo61082a(1);
            C65328r.this.getClass();
            ArrayList<C37442c> arrayList = new ArrayList<>();
            for (C37442c cVar : linkedList) {
                String str2 = cVar.f98954b.get(".sysmsg.content.task_id");
                if (str2 == null) {
                    str2 = "";
                }
                int safeParseInt = Util.safeParseInt(cVar.f98954b.get(".sysmsg.content.action_type"));
                if (safeParseInt == 3) {
                    C64175a0.m75512t(arrayList, new C37450x(str2));
                    arrayList.add(cVar);
                } else if (safeParseInt == 2) {
                    boolean t = C64175a0.m75512t(arrayList, new C37451y(str2));
                    C37442c cVar2 = new C37442c(cVar.f98953a, new HashMap(cVar.f98954b), cVar.f98955c, cVar.f98956d);
                    if (t) {
                        cVar2.f98954b.put(".sysmsg.content.action_type", String.valueOf(1));
                        arrayList.add(cVar2);
                    }
                    arrayList.add(cVar);
                } else if (safeParseInt == 1) {
                    arrayList.add(cVar);
                }
            }
            C65328r rVar = C65328r.this;
            for (C37442c cVar3 : arrayList) {
                C37445f fVar = this.f98959d;
                if (fVar == C37445f.FG && cVar3.f98956d == 1) {
                    str = "1";
                } else {
                    C37445f fVar2 = C37445f.EXIT;
                    str = (fVar == fVar2 && cVar3.f98956d == 1) ? "2" : (fVar == C37445f.TAB && cVar3.f98956d == 1) ? "3" : (fVar == fVar2 && cVar3.f98956d == 2) ? WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY : "0";
                }
                rVar.mo89435m(cVar3.f98953a, cVar3.f98954b, cVar3.f98955c, str);
            }
        }
    }

    /* renamed from: ue1.r$f */
    public enum C37445f {
        TAB,
        FG,
        EXIT,
        DEF,
        LAUNCH
    }

    /* renamed from: ue1.r$k */
    public static final class C37446k extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ String f98967d;

        /* renamed from: e */
        public final /* synthetic */ Throwable f98968e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37446k(String str, Throwable th) {
            super(0);
            this.f98967d = str;
            this.f98968e = th;
        }

        public Object invoke() {
            return this.f98967d + ' ' + this.f98968e;
        }
    }

    /* renamed from: ue1.r$l */
    public static final class C37447l extends C87413o implements C32224a<ConcurrentHashMap<String, C37443d>> {

        /* renamed from: d */
        public final /* synthetic */ C65328r f98969d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37447l(C65328r rVar) {
            super(0);
            this.f98969d = rVar;
        }

        public Object invoke() {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            this.f98969d.mo89433j(concurrentHashMap);
            return concurrentHashMap;
        }
    }

    /* renamed from: ue1.r$g */
    public static final class C65329g<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ C54625h<Bitmap> f188021a;

        public C65329g(C54625h<Bitmap> hVar) {
            this.f188021a = hVar;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            C61926c.m72668M(new C65335u(this.f188021a, (Bitmap) obj));
        }
    }

    /* renamed from: ue1.r$h */
    public static final class C65330h implements C64205a {

        /* renamed from: a */
        public final /* synthetic */ C54625h<Bitmap> f188022a;

        /* renamed from: ue1.r$h$a */
        public static final class C65331a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C54625h<Bitmap> f188023d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65331a(C54625h<Bitmap> hVar) {
                super(0);
                this.f188023d = hVar;
            }

            public Object invoke() {
                C53895h.m60468f((C66212f) null, new C65336v(this.f188023d, (C15601d<? super C65336v>) null), 1, (Object) null);
                return C13598b0.f38549a;
            }
        }

        public C65330h(C54625h<Bitmap> hVar) {
            this.f188022a = hVar;
        }

        /* renamed from: a */
        public final void mo729a(boolean z, Object[] objArr) {
            Log.m105924i("Finder.GlobalPushNewXmlConsumer", "loadLinkIcon success :" + z);
            if (!z) {
                C61926c.m72668M(new C65331a(this.f188022a));
            }
        }
    }

    /* renamed from: ue1.r$i */
    public static final class C65332i implements C13831b {

        /* renamed from: a */
        public final /* synthetic */ C54625h<Bitmap> f188024a;

        public C65332i(C54625h<Bitmap> hVar) {
            this.f188024a = hVar;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.conv.FinderGlobalPushNewXmlConsumer$dispatchNotify$4", mo125469f = "FinderGlobalPushNewXmlConsumer.kt", mo125470l = {949}, mo125471m = "invokeSuspend")
    /* renamed from: ue1.r$j */
    public static final class C65333j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: A */
        public final /* synthetic */ String f188025A;

        /* renamed from: B */
        public final /* synthetic */ int f188026B;

        /* renamed from: C */
        public final /* synthetic */ int f188027C;

        /* renamed from: D */
        public final /* synthetic */ boolean f188028D;

        /* renamed from: E */
        public final /* synthetic */ String f188029E;

        /* renamed from: F */
        public final /* synthetic */ String f188030F;

        /* renamed from: G */
        public final /* synthetic */ FinderJumpInfo f188031G;

        /* renamed from: H */
        public final /* synthetic */ int f188032H;

        /* renamed from: d */
        public int f188033d;

        /* renamed from: e */
        public final /* synthetic */ C54625h<Bitmap> f188034e;

        /* renamed from: f */
        public final /* synthetic */ C65328r f188035f;

        /* renamed from: g */
        public final /* synthetic */ String f188036g;

        /* renamed from: h */
        public final /* synthetic */ String f188037h;

        /* renamed from: i */
        public final /* synthetic */ long f188038i;

        /* renamed from: j */
        public final /* synthetic */ C8478d0 f188039j;

        /* renamed from: n */
        public final /* synthetic */ String f188040n;

        /* renamed from: o */
        public final /* synthetic */ int f188041o;

        /* renamed from: p */
        public final /* synthetic */ String f188042p;

        /* renamed from: q */
        public final /* synthetic */ String f188043q;

        /* renamed from: r */
        public final /* synthetic */ String f188044r;

        /* renamed from: s */
        public final /* synthetic */ String f188045s;

        /* renamed from: t */
        public final /* synthetic */ boolean f188046t;

        /* renamed from: u */
        public final /* synthetic */ boolean f188047u;

        /* renamed from: v */
        public final /* synthetic */ long f188048v;

        /* renamed from: w */
        public final /* synthetic */ long f188049w;

        /* renamed from: x */
        public final /* synthetic */ int f188050x;

        /* renamed from: y */
        public final /* synthetic */ int f188051y;

        /* renamed from: z */
        public final /* synthetic */ int f188052z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65333j(C54625h<Bitmap> hVar, C65328r rVar, String str, String str2, long j, C8478d0 d0Var, String str3, int i, String str4, String str5, String str6, String str7, boolean z, boolean z2, long j2, long j3, int i2, int i3, int i4, String str8, int i5, int i6, boolean z3, String str9, String str10, FinderJumpInfo finderJumpInfo, int i7, C15601d<? super C65333j> dVar) {
            super(2, dVar);
            this.f188034e = hVar;
            this.f188035f = rVar;
            this.f188036g = str;
            this.f188037h = str2;
            this.f188038i = j;
            this.f188039j = d0Var;
            this.f188040n = str3;
            this.f188041o = i;
            this.f188042p = str4;
            this.f188043q = str5;
            this.f188044r = str6;
            this.f188045s = str7;
            this.f188046t = z;
            this.f188047u = z2;
            this.f188048v = j2;
            this.f188049w = j3;
            this.f188050x = i2;
            this.f188051y = i3;
            this.f188052z = i4;
            this.f188025A = str8;
            this.f188026B = i5;
            this.f188027C = i6;
            this.f188028D = z3;
            this.f188029E = str9;
            this.f188030F = str10;
            this.f188031G = finderJumpInfo;
            this.f188032H = i7;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C15601d<?> dVar2 = dVar;
            return new C65333j(this.f188034e, this.f188035f, this.f188036g, this.f188037h, this.f188038i, this.f188039j, this.f188040n, this.f188041o, this.f188042p, this.f188043q, this.f188044r, this.f188045s, this.f188046t, this.f188047u, this.f188048v, this.f188049w, this.f188050x, this.f188051y, this.f188052z, this.f188025A, this.f188026B, this.f188027C, this.f188028D, this.f188029E, this.f188030F, this.f188031G, this.f188032H, dVar2);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C65333j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Bitmap bitmap;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f188033d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C54625h<Bitmap> hVar = this.f188034e;
                this.f188033d = 1;
                obj2 = hVar.mo75514g(this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Bitmap bitmap2 = (Bitmap) obj2;
            if (bitmap2 != null) {
                C65328r rVar = this.f188035f;
                String str = this.f188036g;
                String str2 = this.f188037h;
                long j = this.f188038i;
                int i2 = this.f188039j.f27483d;
                String str3 = this.f188040n;
                int i3 = this.f188041o;
                String str4 = this.f188042p;
                String str5 = this.f188043q;
                String str6 = this.f188044r;
                String str7 = this.f188045s;
                boolean z = this.f188046t;
                boolean z2 = this.f188047u;
                bitmap = bitmap2;
                Bitmap bitmap3 = bitmap;
                boolean z3 = z2;
                rVar.mo89436n(str, str2, j, i2, str3, i3, str4, str5, str6, str7, bitmap3, z, z3, this.f188048v, this.f188049w, this.f188050x, this.f188051y, this.f188052z, this.f188025A, this.f188026B, this.f188027C, this.f188028D, this.f188029E, this.f188030F, this.f188031G);
            } else {
                bitmap = bitmap2;
                C115669n.INSTANCE.mo160131h(23669, this.f188042p, "return", new Long(System.currentTimeMillis()), "13", new Integer(this.f188032H), new Integer(this.f188039j.f27483d));
            }
            Log.m105924i("Finder.GlobalPushNewXmlConsumer", "loadLinkIcon resource :" + bitmap);
            return C13598b0.f38549a;
        }
    }

    public C65328r() {
        AppForegroundDelegate.INSTANCE.mo174208a(new C37438a(this));
        Context applicationContext = MMApplicationContext.getContext().getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new C37440b(this));
        }
    }

    /* renamed from: b */
    public static final boolean m76915b(C65328r rVar, long j) {
        rVar.getClass();
        return (j & C75592q0.m90781k()) != 0;
    }

    /* renamed from: k */
    public static /* synthetic */ void m76916k(C65328r rVar, ConcurrentHashMap<String, C37443d> concurrentHashMap, int i, Object obj) {
        if ((i & 1) != 0) {
            concurrentHashMap = rVar.mo89434l();
        }
        rVar.mo89433j(concurrentHashMap);
    }

    /* renamed from: a */
    public void mo58972a(boolean z) {
        this.f188019i = !z;
        if (z) {
            mo89428e(500, C37445f.EXIT);
        }
    }

    /* renamed from: c */
    public final void mo89426c() {
        StatusBarNotification[] activeNotifications;
        Log.m105924i("Finder.GlobalPushNewXmlConsumer", "[cancelAll] " + mo89434l());
        NotificationManager notificationManager = (NotificationManager) MMApplicationContext.getContext().getSystemService("notification");
        for (Map.Entry next : mo89434l().entrySet()) {
            int i = ((C37443d) next.getValue()).f98957a;
            if (((C37443d) next.getValue()).f98958b) {
                ((C64159i) C86312j.m106911c(C64159i.class)).sq0().mo84686b("notification-" + i);
            } else if (notificationManager != null) {
                notificationManager.cancel(i);
            }
        }
        mo89434l().clear();
        mo89445w();
        if (Build.VERSION.SDK_INT >= 23 && notificationManager != null && (activeNotifications = notificationManager.getActiveNotifications()) != null) {
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                if (statusBarNotification.getNotification().extras.getBoolean("Finder.GlobalPushNewXmlConsumer", false)) {
                    notificationManager.cancel(statusBarNotification.getId());
                    Log.m105928w("Finder.GlobalPushNewXmlConsumer", "fallback cancel(" + statusBarNotification.getId() + ')');
                }
            }
        }
    }

    /* renamed from: d */
    public final boolean mo89427d() {
        boolean z = false;
        boolean l = C61104a.m71656l(MMApplicationContext.getContext(), false);
        boolean z2 = this.f188012b > 0 || l;
        if (!z2 || l || !C37521f.f99374d.mo61188n()) {
            return z2;
        }
        C60204t3 t3Var = (C60204t3) C86312j.m106911c(C60204t3.class);
        C11266d dVar = (C11266d) C86312j.m106911c(C11266d.class);
        boolean z3 = dVar.mo9197kQ() || dVar.mo9194go();
        boolean N = t3Var.mo78746N();
        boolean Gs0 = t3Var.Gs0();
        if (z3 || N || Gs0) {
            z = true;
        }
        Log.m105924i("Finder.GlobalPushNewXmlConsumer", "[checkInFinder] isInNearby=" + z3 + ", isFinderForeground=" + N + ", isHomeFromFinderTask=" + Gs0 + ", finderSceneCount=" + this.f188012b);
        return z;
    }

    /* renamed from: e */
    public final void mo89428e(long j, C37445f fVar) {
        C87412m.m108594g(fVar, FirebaseAnalytics.C113379b.SOURCE);
        boolean z = true;
        if (!(!this.f188020j || fVar == C37445f.LAUNCH || fVar == C37445f.TAB)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (this.f188018h == -1) {
                this.f188018h = uptimeMillis;
            }
            C37521f.f99374d.getClass();
            if (uptimeMillis - this.f188018h > ((long) 2) * ((long) C37521f.f99302U5.mo60266n().intValue())) {
                this.f188020j = false;
            } else {
                return;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!C61104a.m71642B(MMApplicationContext.getContext(), false) && !C61104a.m71644D() && !this.f188019i && !this.f188014d) {
            z = false;
        }
        if (!z) {
            this.f188016f.removeCallbacks(this.f188017g);
            C37444e eVar = this.f188017g;
            eVar.getClass();
            eVar.f98959d = fVar;
            if (j > 0) {
                this.f188016f.postDelayed(this.f188017g, j);
            } else {
                this.f188016f.post(this.f188017g);
            }
        }
        Log.m105924i("Finder.GlobalPushNewXmlConsumer", "[checkPendTaskToRun] Cost=" + (System.currentTimeMillis() - currentTimeMillis) + "ms source=" + fVar + " delayMs=" + j + " isCurrentSensitiveScene=" + z + '[' + this.f188019i + ']');
    }

    /* renamed from: f */
    public final Intent mo89429f(String str, String str2, String str3, long j, String str4, long j2, int i, long j3, String str5, int i2, int i3) {
        String str6 = str3;
        Intent intent = new Intent();
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        intent.putExtra("Finder.GlobalPushNewXmlConsumer", true);
        String str7 = str;
        intent.putExtra("KEY_SESSION_ID", str);
        String str8 = str2;
        intent.putExtra("KEY_REPORT_EXT_INFO", str2);
        long j4 = j2;
        intent.putExtra("KEY_PUSH_CTRL_FLAG", j2);
        intent.putExtra("KEY_PUSH_DEMOTION_FLAG", j3);
        intent.putExtra("KEY_TASK_ID", str3);
        long j5 = j;
        intent.putExtra("KEY_OBJECT_ID", j);
        String str9 = str4;
        intent.putExtra("KEY_OBJECT_NONCE_ID", str4);
        int i4 = i;
        intent.putExtra("KEY_PUSH_RETURN_TO", i);
        intent.putExtra("KEY_UDF_KV", str5);
        intent.putExtra("KEY_JUMP_TYPE_CODE", i2);
        intent.putExtra("KEY_PUSH_LEVEL", i3);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("taskId", str3);
        intent.putExtra("key_extra_info", jSONObject.toString());
        intent.setClass(MMApplicationContext.getContext(), FinderAppPushRouteProxyUI.class);
        return intent;
    }

    /* renamed from: g */
    public final Intent mo89430g(String str, String str2, String str3, long j, String str4, String str5, int i, long j2, long j3, int i2, String str6, int i3, int i4) {
        Intent f = mo89429f(str, str2, str3, j, str4, j2, i2, j3, str6, i3, i4);
        f.putExtra("KEY_ROUTE_TYPE", 0);
        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76842e7(29, 2, 20, f);
        f.putExtra("KEY_BY_PASS_INFO_TYPE", i);
        f.putExtra("KEY_BY_PASS_INFO", str5);
        f.putExtra("KEY_OBJECT_ID", j);
        f.putExtra("KEY_OBJECT_NONCE_ID", str4);
        f.putExtra("KEY_TARGET_TAB_TYPE", 4);
        f.putExtra("KEY_SOURCE_TYPE", 2);
        f.putExtra("KEY_FINDER_POST_FINISH_JUMP_HOT_TAB", true);
        f.putExtra("KEY_FINDER_IS_NEED_REFRESH_TAB", true);
        f.putExtra("FROM_SCENE_KEY", 5);
        return f;
    }

    /* renamed from: h */
    public final void mo89431h(String str, Map<String, String> map, int i, boolean z, String str2, String str3, String str4) {
        FinderJumpInfo finderJumpInfo;
        Map<String, String> map2 = map;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        String str5 = map2.get(".sysmsg.content.object_id");
        String str6 = str5;
        boolean z2 = false;
        if (!(!(str6 == null || str6.length() == 0))) {
            str5 = null;
        }
        String str7 = str5;
        String str8 = "";
        String str9 = str7 == null ? str8 : str7;
        long P = C61926c.m72671P(str9);
        String str10 = map2.get(".sysmsg.content.nonce_id");
        String str11 = str10 == null ? str8 : str10;
        String str12 = map2.get(".sysmsg.content.title");
        if (str12 == null) {
            str12 = str8;
        }
        String str13 = map2.get(".sysmsg.content.body");
        String str14 = str13 == null ? str8 : str13;
        String str15 = map2.get(".sysmsg.content.image_url");
        C8478d0 d0Var = new C8478d0();
        d0Var.f27483d = Util.safeParseInt(map2.get(".sysmsg.content.jump_to"));
        int safeParseInt = Util.safeParseInt(map2.get(".sysmsg.content.fail_return_to"));
        String str16 = map2.get(".sysmsg.content.bypass_info");
        String str17 = str16 == null ? str8 : str16;
        int safeParseInt2 = Util.safeParseInt(map2.get(".sysmsg.content.action_type"));
        long safeParseLong = Util.safeParseLong(map2.get(".sysmsg.content.demotion_flag"));
        long safeParseLong2 = Util.safeParseLong(map2.get(".sysmsg.content.ctrl_flag"));
        int safeParseInt3 = Util.safeParseInt(map2.get(".sysmsg.content.bypass_type"));
        String str18 = map2.get(".sysmsg.content.push_type");
        int safeParseInt4 = Util.safeParseInt(map2.get(".sysmsg.content.auth_icon_type"));
        int safeParseInt5 = Util.safeParseInt(map2.get(".sysmsg.content.alert_display_time"));
        int i2 = d0Var.f27483d != 2 ? 1 : 2;
        String str19 = map2.get(".sysmsg.content.jump_info");
        if (str19 != null) {
            str8 = str19;
        }
        byte[] decode = Base64.decode(str8, 0);
        if (!(!(decode == null || decode.length == 0))) {
            decode = null;
        }
        if (decode != null) {
            d0Var.f27483d = 10000;
            FinderJumpInfo finderJumpInfo2 = new FinderJumpInfo();
            finderJumpInfo2.parseFrom(decode);
            finderJumpInfo = finderJumpInfo2;
        } else {
            finderJumpInfo = null;
        }
        if (str12.length() == 0) {
            Log.m105920e("Finder.GlobalPushNewXmlConsumer", "title is null.");
            C115669n.INSTANCE.mo160131h(23669, str, "return", Long.valueOf(System.currentTimeMillis()), "12", Integer.valueOf(safeParseInt2), Integer.valueOf(d0Var.f27483d));
            return;
        }
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.esc);
        C87412m.m108593f(string, "getContext().resources.g…dk.R.string.finder_title)");
        boolean z3 = (safeParseLong2 & 1) != 0;
        boolean z4 = (safeParseLong2 & 128) != 0;
        if (str15 == null || str15.length() == 0) {
            z2 = true;
        }
        if (z2) {
            mo89436n(str11, str9, P, d0Var.f27483d, str17, safeParseInt3, str, string, str12, str14, (Bitmap) null, z3, z4, safeParseLong, safeParseLong2, safeParseInt, safeParseInt4, safeParseInt5, str2, i2, i, z, str3, str4, finderJumpInfo);
            return;
        }
        C54625h a = C54629k.m61479a(Integer.MAX_VALUE, (C54624g) null, (C32226l) null, 6, (Object) null);
        C99344b<C100810g0, Bitmap> b = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(new C11984n0(str15, C27696y.RAW_IMAGE), ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.MSG_THUMB));
        C65329g gVar = new C65329g(a);
        b.getClass();
        b.f291320d = gVar;
        b.f291324h = new C65330h(a);
        b.f291323g = new C65332i(a);
        b.mo85953c();
        C53895h.m60468f((C66212f) null, new C65333j(a, this, str11, str9, P, d0Var, str17, safeParseInt3, str, string, str12, str14, z3, z4, safeParseLong, safeParseLong2, safeParseInt, safeParseInt4, safeParseInt5, str2, i2, i, z, str3, str4, finderJumpInfo, safeParseInt2, (C15601d<? super C65333j>) null), 1, (Object) null);
    }

    /* renamed from: i */
    public final boolean mo89432i(String str) {
        NotificationManager notificationManager = (NotificationManager) MMApplicationContext.getContext().getSystemService("notification");
        C37443d dVar = mo89434l().get(str);
        int i = dVar != null ? dVar.f98957a : 0;
        boolean z = dVar != null ? dVar.f98958b : false;
        Log.m105924i("Finder.GlobalPushNewXmlConsumer", "[cancel] taskId=" + str + " notificationId=" + i + " isInnerPush=" + z);
        if (z) {
            C64157h sq02 = ((C64159i) C86312j.m106911c(C64159i.class)).sq0();
            sq02.mo84686b("notification-" + i);
        } else if (notificationManager != null) {
            notificationManager.cancel(i);
        }
        mo89445w();
        return mo89434l().remove(str) != null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89433j(java.util.concurrent.ConcurrentHashMap<java.lang.String, ue1.C65328r.C37443d> r21) {
        /*
            r20 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "[fillHistoryNotificationList] "
            java.lang.String r2 = "Finder.GlobalPushNewXmlConsumer"
            kotlin.Result$Companion r3 = kotlin.Result.Companion     // Catch:{ all -> 0x00bf }
            r3 = r20
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = r3.f188013c     // Catch:{ all -> 0x00bd }
            java.lang.String r5 = "HITORY_NOTIFICATION_RECORD"
            java.lang.String r4 = r4.getString(r5, r0)     // Catch:{ all -> 0x00bd }
            if (r4 != 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r0 = r4
        L_0x0016:
            java.lang.String r4 = ";"
            java.lang.String[] r6 = new java.lang.String[]{r4}     // Catch:{ all -> 0x00bd }
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r5 = r0
            java.util.List r4 = z04.C112550d0.m153785U(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00bd }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00bd }
        L_0x0029:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x00bd }
            if (r5 == 0) goto L_0x00a4
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x00bd }
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x00bd }
            int r5 = r6.length()     // Catch:{ all -> 0x00bd }
            r12 = 0
            r13 = 1
            if (r5 <= 0) goto L_0x0040
            r5 = 1
            goto L_0x0041
        L_0x0040:
            r5 = 0
        L_0x0041:
            if (r5 == 0) goto L_0x00a1
            java.lang.String r5 = "="
            java.lang.String[] r7 = new java.lang.String[]{r5}     // Catch:{ all -> 0x00bd }
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            java.util.List r5 = z04.C112550d0.m153785U(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00bd }
            int r6 = r5.size()     // Catch:{ all -> 0x00bd }
            r7 = 2
            if (r6 != r7) goto L_0x00a1
            java.lang.Object r6 = r5.get(r12)     // Catch:{ all -> 0x00bd }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x00bd }
            java.lang.Object r5 = r5.get(r13)     // Catch:{ all -> 0x00bd }
            r14 = r5
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14     // Catch:{ all -> 0x00bd }
            java.lang.String r5 = "@"
            java.lang.String[] r15 = new java.lang.String[]{r5}     // Catch:{ all -> 0x00bd }
            r16 = 0
            r17 = 0
            r18 = 6
            r19 = 0
            java.util.List r5 = z04.C112550d0.m153785U(r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x00bd }
            int r8 = r5.size()     // Catch:{ all -> 0x00bd }
            if (r8 != r7) goto L_0x00a1
            java.lang.Object r7 = r5.get(r12)     // Catch:{ all -> 0x00bd }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x00bd }
            int r7 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r7)     // Catch:{ all -> 0x00bd }
            java.lang.Object r5 = r5.get(r13)     // Catch:{ all -> 0x00bd }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00bd }
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)     // Catch:{ all -> 0x00bd }
            if (r5 != r13) goto L_0x0094
            r12 = 1
        L_0x0094:
            ue1.r$d r5 = new ue1.r$d     // Catch:{ all -> 0x00bd }
            r5.<init>(r7)     // Catch:{ all -> 0x00bd }
            r5.f98958b = r12     // Catch:{ all -> 0x00bd }
            r7 = r21
            r7.put(r6, r5)     // Catch:{ all -> 0x00bd }
            goto L_0x0029
        L_0x00a1:
            r7 = r21
            goto L_0x0029
        L_0x00a4:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            r4.<init>()     // Catch:{ all -> 0x00bd }
            r4.append(r1)     // Catch:{ all -> 0x00bd }
            r4.append(r0)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x00bd }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ all -> 0x00bd }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00bd }
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)     // Catch:{ all -> 0x00bd }
            goto L_0x00cc
        L_0x00bd:
            r0 = move-exception
            goto L_0x00c2
        L_0x00bf:
            r0 = move-exception
            r3 = r20
        L_0x00c2:
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
        L_0x00cc:
            java.lang.Throwable r0 = kotlin.Result.m168117exceptionOrNullimpl(r0)
            if (r0 == 0) goto L_0x00e4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ue1.C65328r.mo89433j(java.util.concurrent.ConcurrentHashMap):void");
    }

    /* renamed from: l */
    public final ConcurrentHashMap<String, C37443d> mo89434l() {
        return (ConcurrentHashMap) ((C36570n) this.f188011a).getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v15, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r14v3, types: [boolean] */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x024a, code lost:
        if (r8 != 1) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0281, code lost:
        if (mo89434l().containsKey(r15) == false) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0cc7, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0cc8, code lost:
        r10 = r50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0e3b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0e3c, code lost:
        r13 = r52;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a2, code lost:
        if (mo89440r() != false) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01be, code lost:
        if (mo89441s() == false) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c0, code lost:
        r3 = true;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0215 A[SYNTHETIC, Splitter:B:106:0x0215] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0c6f  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0cbb A[Catch:{ all -> 0x0cc7, all -> 0x0e3b }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0ce9  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0ceb  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0cf6 A[Catch:{ all -> 0x0e38 }] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0d97 A[Catch:{ all -> 0x0e38 }] */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0e61  */
    /* JADX WARNING: Removed duplicated region for block: B:281:? A[RETURN, SYNTHETIC] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ob0.C35136m.C35139b mo89435m(java.lang.String r51, java.util.Map<java.lang.String, java.lang.String> r52, ob0.C35136m.C35137a r53, java.lang.String r54) {
        /*
            r50 = this;
            r9 = r50
            r10 = r52
            r6 = r54
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_APP_PUSH_SHOW_COUNT_INT
            java.lang.String r2 = "4"
            java.lang.Class<ht1.t1> r3 = ht1.C60200t1.class
            java.lang.String r11 = ".sysmsg.content.task_id"
            java.lang.String r12 = ""
            r13 = 0
            kotlin.Result$Companion r4 = kotlin.Result.Companion     // Catch:{ all -> 0x0e4c }
            java.util.concurrent.ConcurrentHashMap r4 = r50.mo89434l()     // Catch:{ all -> 0x0e4c }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0e4c }
            r14 = 1
            if (r4 == 0) goto L_0x002c
            m76916k(r9, r13, r14, r13)     // Catch:{ all -> 0x0022 }
            goto L_0x002c
        L_0x0022:
            r0 = move-exception
            r1 = r0
            r13 = r10
            r17 = r11
            r18 = r12
            r10 = r9
            goto L_0x0e51
        L_0x002c:
            java.lang.Object r4 = r10.get(r11)     // Catch:{ all -> 0x0e4c }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0e4c }
            if (r4 != 0) goto L_0x0036
            r15 = r12
            goto L_0x0037
        L_0x0036:
            r15 = r4
        L_0x0037:
            java.lang.String r4 = ".sysmsg.content.action_type"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ all -> 0x0e4c }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0e4c }
            int r8 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r4)     // Catch:{ all -> 0x0e4c }
            java.lang.String r4 = ".sysmsg.content.ctrl_flag"
            java.lang.Object r4 = r10.get(r4)     // Catch:{ all -> 0x0e4c }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0e4c }
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r4)     // Catch:{ all -> 0x0e4c }
            java.lang.String r7 = ".sysmsg.content.freq_limit"
            java.lang.Object r7 = r10.get(r7)     // Catch:{ all -> 0x0e4c }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0e4c }
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r7)     // Catch:{ all -> 0x0e4c }
            java.lang.String r7 = ".sysmsg.content.jump_to"
            java.lang.Object r7 = r10.get(r7)     // Catch:{ all -> 0x0e4c }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0e4c }
            int r7 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r7)     // Catch:{ all -> 0x0e4c }
            r17 = r11
            java.lang.String r11 = ".sysmsg.content.report_ext_info"
            java.lang.Object r11 = r10.get(r11)     // Catch:{ all -> 0x0e46 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0e46 }
            if (r11 != 0) goto L_0x0074
            r11 = r12
        L_0x0074:
            com.tencent.mm.app.AppForegroundDelegate r18 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE     // Catch:{ all -> 0x0e46 }
            r19 = r13
            boolean r13 = r18.mo174214j()     // Catch:{ all -> 0x0e46 }
            di3.d r14 = di3.C86312j.m106911c(r3)     // Catch:{ all -> 0x0e46 }
            ht1.t1 r14 = (ht1.C60200t1) r14     // Catch:{ all -> 0x0e46 }
            boolean r14 = r14.mo76873sF()     // Catch:{ all -> 0x0e46 }
            r18 = r14
            boolean r14 = r50.mo89438p()     // Catch:{ all -> 0x0e46 }
            java.lang.Class<ky2.i> r21 = ky2.C10432i.class
            di3.d r21 = di3.C86312j.m106911c(r21)     // Catch:{ all -> 0x0e46 }
            ky2.i r21 = (ky2.C10432i) r21     // Catch:{ all -> 0x0e46 }
            r22 = r14
            boolean r14 = r21.mo10750e()     // Catch:{ all -> 0x0e46 }
            r23 = 4
            long r23 = r4 & r23
            r21 = r13
            r25 = r14
            r13 = 0
            int r26 = (r23 > r13 ? 1 : (r23 == r13 ? 0 : -1))
            if (r26 == 0) goto L_0x00aa
            r10 = 1
            goto L_0x00ab
        L_0x00aa:
            r10 = 0
        L_0x00ab:
            r26 = 64
            long r26 = r4 & r26
            int r24 = (r26 > r13 ? 1 : (r26 == r13 ? 0 : -1))
            if (r24 == 0) goto L_0x00b6
            r28 = 1
            goto L_0x00b8
        L_0x00b6:
            r28 = 0
        L_0x00b8:
            r26 = 2
            long r4 = r4 & r26
            int r24 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r24 == 0) goto L_0x00c2
            r4 = 1
            goto L_0x00c3
        L_0x00c2:
            r4 = 0
        L_0x00c3:
            boolean r5 = r50.mo89427d()     // Catch:{ all -> 0x0e3f }
            boolean r13 = r50.mo89439q()     // Catch:{ all -> 0x0e3f }
            r14 = 2
            if (r7 == r14) goto L_0x00d1
            r24 = 1
            goto L_0x00d3
        L_0x00d1:
            r24 = 2
        L_0x00d3:
            r14 = r28
            if (r10 == 0) goto L_0x00dc
            if (r14 == 0) goto L_0x00dc
            r28 = 3
            goto L_0x00ec
        L_0x00dc:
            if (r10 == 0) goto L_0x00e3
            if (r14 != 0) goto L_0x00e3
            r28 = 2
            goto L_0x00ec
        L_0x00e3:
            if (r10 != 0) goto L_0x00ea
            if (r14 == 0) goto L_0x00ea
            r28 = 1
            goto L_0x00ec
        L_0x00ea:
            r28 = 0
        L_0x00ec:
            java.lang.Class<h81.i> r31 = h81.C59774i.class
            di3.d r31 = di3.C86312j.m106911c(r31)     // Catch:{ all -> 0x0e3f }
            h81.i r31 = (h81.C59774i) r31     // Catch:{ all -> 0x0e3f }
            java.lang.String r31 = r31.mo84751Wb()     // Catch:{ all -> 0x0e3f }
            r32 = r4
            if (r31 != 0) goto L_0x00fe
            r4 = r12
            goto L_0x0100
        L_0x00fe:
            r4 = r31
        L_0x0100:
            boolean r31 = gy3.C87412m.m108589b(r6, r2)     // Catch:{ all -> 0x0e3f }
            r33 = r2
            if (r31 == 0) goto L_0x017b
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0177 }
            r37 = r13
            r13 = 8
            java.lang.Object[] r6 = new java.lang.Object[r13]     // Catch:{ all -> 0x0177 }
            r13 = 0
            r6[r13] = r15     // Catch:{ all -> 0x0177 }
            r13 = 3
            java.lang.Integer r30 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0177 }
            r16 = 1
            r6[r16] = r30     // Catch:{ all -> 0x0177 }
            long r38 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0177 }
            java.lang.Long r30 = java.lang.Long.valueOf(r38)     // Catch:{ all -> 0x0177 }
            r29 = 2
            r6[r29] = r30     // Catch:{ all -> 0x0177 }
            r6[r13] = r12     // Catch:{ all -> 0x0177 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r24)     // Catch:{ all -> 0x0177 }
            r31 = 4
            r6[r31] = r13     // Catch:{ all -> 0x0177 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r28)     // Catch:{ all -> 0x0177 }
            r36 = 5
            r6[r36] = r13     // Catch:{ all -> 0x0177 }
            r13 = 6
            r6[r13] = r4     // Catch:{ all -> 0x0177 }
            r34 = 7
            r6[r34] = r11     // Catch:{ all -> 0x0177 }
            r13 = 23498(0x5bca, float:3.2928E-41)
            r2.mo160131h(r13, r6)     // Catch:{ all -> 0x0177 }
            r6 = 6
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x0177 }
            r6 = 0
            r13[r6] = r15     // Catch:{ all -> 0x0177 }
            java.lang.String r6 = "handleNewXml"
            r16 = 1
            r13[r16] = r6     // Catch:{ all -> 0x0177 }
            long r38 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0177 }
            java.lang.Long r6 = java.lang.Long.valueOf(r38)     // Catch:{ all -> 0x0177 }
            r29 = 2
            r13[r29] = r6     // Catch:{ all -> 0x0177 }
            r6 = 3
            r13[r6] = r12     // Catch:{ all -> 0x0177 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0177 }
            r31 = 4
            r13[r31] = r6     // Catch:{ all -> 0x0177 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0177 }
            r36 = 5
            r13[r36] = r6     // Catch:{ all -> 0x0177 }
            r6 = 23669(0x5c75, float:3.3167E-41)
            r2.mo160131h(r6, r13)     // Catch:{ all -> 0x0177 }
            goto L_0x017d
        L_0x0177:
            r0 = move-exception
            r1 = r0
            goto L_0x02cf
        L_0x017b:
            r37 = r13
        L_0x017d:
            boolean r2 = r50.mo89442t()     // Catch:{ all -> 0x0e3f }
            if (r2 != 0) goto L_0x0196
            r6 = 1
            if (r8 != r6) goto L_0x0196
            f40.o r2 = f40.C86709a0.m107535s()     // Catch:{ all -> 0x0177 }
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()     // Catch:{ all -> 0x0177 }
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_APP_PUSH_SETTING_SHOW_BOOLEAN     // Catch:{ all -> 0x0177 }
            java.lang.Boolean r13 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0177 }
            r2.mo119677K(r6, r13)     // Catch:{ all -> 0x0177 }
            r2 = 1
        L_0x0196:
            vc1.b r6 = vc1.C37715b.f99914a     // Catch:{ all -> 0x0e3f }
            boolean r13 = r6.mo61298a()     // Catch:{ all -> 0x0e3f }
            if (r13 == 0) goto L_0x01a4
            boolean r13 = r50.mo89440r()     // Catch:{ all -> 0x0177 }
            if (r13 == 0) goto L_0x01c0
        L_0x01a4:
            boolean r6 = r6.mo61298a()     // Catch:{ all -> 0x0e3f }
            if (r6 != 0) goto L_0x01c2
            di3.d r3 = di3.C86312j.m106911c(r3)     // Catch:{ all -> 0x0177 }
            ht1.t1 r3 = (ht1.C60200t1) r3     // Catch:{ all -> 0x0177 }
            ht1.z4 r3 = r3.mo76861l7()     // Catch:{ all -> 0x0177 }
            boolean r3 = r3.mo83760G5()     // Catch:{ all -> 0x0177 }
            if (r3 == 0) goto L_0x01c2
            boolean r3 = r50.mo89441s()     // Catch:{ all -> 0x0177 }
            if (r3 != 0) goto L_0x01c2
        L_0x01c0:
            r3 = 1
            goto L_0x01c3
        L_0x01c2:
            r3 = 0
        L_0x01c3:
            java.lang.Class<sr.e> r6 = p687sr.C64153e.class
            di3.d r6 = di3.C86312j.m106911c(r6)     // Catch:{ all -> 0x0e3f }
            sr.e r6 = (p687sr.C64153e) r6     // Catch:{ all -> 0x0e3f }
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0e3f }
            r38 = r3
            java.lang.String r3 = "getContext()"
            gy3.C87412m.m108593f(r13, r3)     // Catch:{ all -> 0x0e3f }
            boolean r3 = r6.mo88361hD(r13)     // Catch:{ all -> 0x0e3f }
            boolean r6 = p645pj.C77095h.m93062e()     // Catch:{ all -> 0x0e3f }
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0e3f }
            r39 = r6
            r6 = 0
            boolean r13 = p182kk.C61104a.m71642B(r13, r6)     // Catch:{ all -> 0x0e3f }
            if (r13 != 0) goto L_0x0203
            boolean r6 = p182kk.C61104a.m71644D()     // Catch:{ all -> 0x01fc }
            if (r6 != 0) goto L_0x0203
            boolean r6 = r9.f188019i     // Catch:{ all -> 0x01fc }
            if (r6 != 0) goto L_0x0203
            boolean r6 = r9.f188014d     // Catch:{ all -> 0x01fc }
            if (r6 == 0) goto L_0x01fa
            goto L_0x0203
        L_0x01fa:
            r6 = 0
            goto L_0x0204
        L_0x01fc:
            r0 = move-exception
            r1 = r0
            r13 = r52
            r10 = r9
            goto L_0x02d3
        L_0x0203:
            r6 = 1
        L_0x0204:
            java.util.concurrent.ConcurrentHashMap r13 = r50.mo89434l()     // Catch:{ all -> 0x0e3f }
            boolean r13 = r13.containsKey(r15)     // Catch:{ all -> 0x0e3f }
            r40 = r4
            java.lang.String r4 = "Finder.GlobalPushNewXmlConsumer"
            if (r13 == 0) goto L_0x0233
            r13 = 1
            if (r8 != r13) goto L_0x0233
            java.util.concurrent.ConcurrentHashMap r13 = r50.mo89434l()     // Catch:{ all -> 0x0177 }
            r13.remove(r15)     // Catch:{ all -> 0x0177 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0177 }
            r13.<init>()     // Catch:{ all -> 0x0177 }
            r41 = r11
            java.lang.String r11 = "has same taskId="
            r13.append(r11)     // Catch:{ all -> 0x0177 }
            r13.append(r15)     // Catch:{ all -> 0x0177 }
            java.lang.String r11 = r13.toString()     // Catch:{ all -> 0x0177 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r11)     // Catch:{ all -> 0x0177 }
            goto L_0x0235
        L_0x0233:
            r41 = r11
        L_0x0235:
            java.lang.String r11 = " showSource="
            java.lang.String r13 = "return"
            r42 = r13
            java.lang.String r13 = "json.toString()"
            r43 = r13
            java.lang.String r13 = "fail_reason"
            if (r21 != 0) goto L_0x0269
            if (r10 == 0) goto L_0x0269
            if (r14 != 0) goto L_0x0269
            r44 = r13
            r13 = 1
            if (r8 == r13) goto L_0x024d
            goto L_0x026b
        L_0x024d:
            r2 = r54
            r22 = r7
            r25 = r8
            r10 = r9
            r18 = r12
            r3 = r21
            r12 = r40
            r21 = r41
            r1 = r43
            r9 = r44
            r5 = 6
            r14 = 23669(0x5c75, float:3.3167E-41)
            r19 = 5
            r20 = 4
            goto L_0x0cdf
        L_0x0269:
            r44 = r13
        L_0x026b:
            java.util.concurrent.ConcurrentLinkedQueue<ue1.r$c> r13 = r9.f188015e     // Catch:{ all -> 0x0e3f }
            boolean r13 = r13.isEmpty()     // Catch:{ all -> 0x0e3f }
            r16 = 1
            r13 = r13 ^ 1
            if (r13 != 0) goto L_0x024d
            if (r6 == 0) goto L_0x0284
            java.util.concurrent.ConcurrentHashMap r13 = r50.mo89434l()     // Catch:{ all -> 0x0177 }
            boolean r13 = r13.containsKey(r15)     // Catch:{ all -> 0x0177 }
            if (r13 != 0) goto L_0x0284
            goto L_0x024d
        L_0x0284:
            f40.o r6 = f40.C86709a0.m107535s()     // Catch:{ all -> 0x0cd8 }
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()     // Catch:{ all -> 0x0cd8 }
            com.tencent.mm.storage.y1$a r13 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_APP_PUSH_SHOW_EARLY_TIME_LONG     // Catch:{ all -> 0x0cd8 }
            r45 = r2
            r46 = r3
            r2 = 0
            long r2 = r6.mo119673G(r13, r2)     // Catch:{ all -> 0x0cd8 }
            r26 = 86400000(0x5265c00, double:4.2687272E-316)
            long r26 = r2 + r26
            long r47 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cd8 }
            int r6 = (r26 > r47 ? 1 : (r26 == r47 ? 0 : -1))
            if (r6 > 0) goto L_0x02d7
            f40.o r6 = f40.C86709a0.m107535s()     // Catch:{ all -> 0x0177 }
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()     // Catch:{ all -> 0x0177 }
            r23 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r23)     // Catch:{ all -> 0x0177 }
            r6.mo119677K(r1, r9)     // Catch:{ all -> 0x0177 }
            f40.o r6 = f40.C86709a0.m107535s()     // Catch:{ all -> 0x0177 }
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()     // Catch:{ all -> 0x0177 }
            long r26 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0177 }
            java.lang.Long r9 = java.lang.Long.valueOf(r26)     // Catch:{ all -> 0x0177 }
            r6.mo119677K(r13, r9)     // Catch:{ all -> 0x0177 }
            java.lang.String r6 = "over one day, reset show count."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)     // Catch:{ all -> 0x0177 }
            goto L_0x02d7
        L_0x02cf:
            r10 = r50
            r13 = r52
        L_0x02d3:
            r18 = r12
            goto L_0x0e51
        L_0x02d7:
            f40.o r6 = f40.C86709a0.m107535s()     // Catch:{ all -> 0x0cd1 }
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()     // Catch:{ all -> 0x0cd1 }
            r9 = 0
            int r1 = r6.mo119689j(r1, r9)     // Catch:{ all -> 0x0cd1 }
            java.lang.String r6 = ".sysmsg.content.last_deliver_time"
            r9 = r52
            r13 = 0
            java.lang.Object r6 = r9.get(r6)     // Catch:{ all -> 0x0cd1 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0cd1 }
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r6)     // Catch:{ all -> 0x0cd1 }
            com.tencent.mm.plugin.report.service.n r13 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0cd1 }
            r51 = r1
            r26 = r2
            r1 = 6
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0cd1 }
            r1 = 0
            r2[r1] = r15     // Catch:{ all -> 0x0cd1 }
            java.lang.String r1 = "receive"
            r3 = 1
            r2[r3] = r1     // Catch:{ all -> 0x0cd1 }
            long r47 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cd1 }
            java.lang.Long r1 = java.lang.Long.valueOf(r47)     // Catch:{ all -> 0x0cd1 }
            r3 = 2
            r2[r3] = r1     // Catch:{ all -> 0x0cd1 }
            r1 = 3
            r2[r1] = r12     // Catch:{ all -> 0x0cd1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0cd1 }
            r3 = 4
            r2[r3] = r1     // Catch:{ all -> 0x0cd1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0cd1 }
            r3 = 5
            r2[r3] = r1     // Catch:{ all -> 0x0cd1 }
            r1 = 23669(0x5c75, float:3.3167E-41)
            r13.mo160131h(r1, r2)     // Catch:{ all -> 0x0cd1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0cd1 }
            r1.<init>()     // Catch:{ all -> 0x0cd1 }
            java.lang.String r2 = "values="
            r1.append(r2)     // Catch:{ all -> 0x0cd1 }
            r1.append(r9)     // Catch:{ all -> 0x0cd1 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0cd1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)     // Catch:{ all -> 0x0cd1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0cd1 }
            r1.<init>()     // Catch:{ all -> 0x0cd1 }
            java.lang.String r2 = "[consumeNewXml] isInFinder="
            r1.append(r2)     // Catch:{ all -> 0x0cd1 }
            r1.append(r5)     // Catch:{ all -> 0x0cd1 }
            java.lang.String r2 = " isTeenMode="
            r1.append(r2)     // Catch:{ all -> 0x0cd1 }
            r2 = r25
            r1.append(r2)     // Catch:{ all -> 0x0cd1 }
            java.lang.String r3 = " isEnableInApp="
            r1.append(r3)     // Catch:{ all -> 0x0cd1 }
            r1.append(r10)     // Catch:{ all -> 0x0cd1 }
            java.lang.String r3 = " isEnableInOutApp="
            r1.append(r3)     // Catch:{ all -> 0x0cd1 }
            r1.append(r14)     // Catch:{ all -> 0x0cd1 }
            java.lang.String r3 = " isShowFinderEntry="
            r1.append(r3)     // Catch:{ all -> 0x0cd1 }
            r3 = r18
            r1.append(r3)     // Catch:{ all -> 0x0cd1 }
            r1.append(r11)     // Catch:{ all -> 0x0cd1 }
            r11 = r54
            r1.append(r11)     // Catch:{ all -> 0x0cd1 }
            java.lang.String r11 = " isOpenPushNotify="
            r1.append(r11)     // Catch:{ all -> 0x0cd1 }
            r11 = r22
            r1.append(r11)     // Catch:{ all -> 0x0cd1 }
            java.lang.String r9 = " isFinderClose="
            r1.append(r9)     // Catch:{ all -> 0x0ccb }
            r9 = r37
            r1.append(r9)     // Catch:{ all -> 0x0ccb }
            r18 = r12
            java.lang.String r12 = " isEnableCloseFinderToNotify="
            r1.append(r12)     // Catch:{ all -> 0x0cc7 }
            r12 = r32
            r1.append(r12)     // Catch:{ all -> 0x0cc7 }
            r22 = r11
            java.lang.String r11 = " actionType="
            r1.append(r11)     // Catch:{ all -> 0x0cc7 }
            r1.append(r8)     // Catch:{ all -> 0x0cc7 }
            java.lang.String r11 = " taskId="
            r1.append(r11)     // Catch:{ all -> 0x0cc7 }
            r1.append(r15)     // Catch:{ all -> 0x0cc7 }
            java.lang.String r11 = " isAppForeground="
            r1.append(r11)     // Catch:{ all -> 0x0cc7 }
            r11 = r21
            r1.append(r11)     // Catch:{ all -> 0x0cc7 }
            r21 = r5
            java.lang.String r5 = " isShowFinderAppPushSetting="
            r1.append(r5)     // Catch:{ all -> 0x0cc7 }
            r5 = r45
            r1.append(r5)     // Catch:{ all -> 0x0cc7 }
            r45 = r5
            java.lang.String r5 = " lastDeliverTime="
            r1.append(r5)     // Catch:{ all -> 0x0cc7 }
            r1.append(r6)     // Catch:{ all -> 0x0cc7 }
            java.lang.String r5 = " earlyShowTime="
            r1.append(r5)     // Catch:{ all -> 0x0cc7 }
            r25 = r2
            r5 = r3
            r2 = r26
            r1.append(r2)     // Catch:{ all -> 0x0cc7 }
            java.lang.String r2 = " showCount="
            r1.append(r2)     // Catch:{ all -> 0x0cc7 }
            r2 = r51
            r1.append(r2)     // Catch:{ all -> 0x0cc7 }
            java.lang.String r3 = " isPermissionGranted="
            r1.append(r3)     // Catch:{ all -> 0x0cc7 }
            r3 = r46
            r1.append(r3)     // Catch:{ all -> 0x0cc7 }
            r51 = r5
            java.lang.String r5 = "report_ext_info="
            r1.append(r5)     // Catch:{ all -> 0x0cc7 }
            r5 = r41
            r1.append(r5)     // Catch:{ all -> 0x0cc7 }
            r32 = r12
            java.lang.String r12 = " sessionId="
            r1.append(r12)     // Catch:{ all -> 0x0cc7 }
            r12 = r40
            r1.append(r12)     // Catch:{ all -> 0x0cc7 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0cc7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)     // Catch:{ all -> 0x0cc7 }
            r1 = 3
            if (r8 != r1) goto L_0x0451
            r1 = r50
            boolean r2 = r1.mo89432i(r15)     // Catch:{ all -> 0x044d }
            r3 = 6
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x044d }
            r4 = 0
            r3[r4] = r15     // Catch:{ all -> 0x044d }
            java.lang.String r4 = "cancel"
            r5 = 1
            r3[r5] = r4     // Catch:{ all -> 0x044d }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x044d }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x044d }
            r5 = 2
            r3[r5] = r4     // Catch:{ all -> 0x044d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x044d }
            r4.<init>()     // Catch:{ all -> 0x044d }
            java.lang.String r5 = "result="
            r4.append(r5)     // Catch:{ all -> 0x044d }
            r4.append(r2)     // Catch:{ all -> 0x044d }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x044d }
            r4 = 3
            r3[r4] = r2     // Catch:{ all -> 0x044d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x044d }
            r4 = 4
            r3[r4] = r2     // Catch:{ all -> 0x044d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x044d }
            r4 = 5
            r3[r4] = r2     // Catch:{ all -> 0x044d }
            r2 = 23669(0x5c75, float:3.3167E-41)
            r13.mo160131h(r2, r3)     // Catch:{ all -> 0x044d }
            r2 = 0
            return r2
        L_0x044d:
            r0 = move-exception
            r2 = r0
            goto L_0x04e3
        L_0x0451:
            r1 = r50
            if (r14 == 0) goto L_0x04e9
            if (r39 != 0) goto L_0x04e9
            java.lang.String r2 = "just return! 允许应用外弹，但系统关闭通知权限"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r2)     // Catch:{ all -> 0x044d }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x044d }
            r2.<init>()     // Catch:{ all -> 0x044d }
            r3 = 19
            r4 = r44
            r2.put(r4, r3)     // Catch:{ all -> 0x044d }
            r3 = 8
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x044d }
            r4 = 0
            r3[r4] = r15     // Catch:{ all -> 0x044d }
            r4 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x044d }
            r9 = 1
            r3[r9] = r6     // Catch:{ all -> 0x044d }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x044d }
            java.lang.Long r6 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x044d }
            r3[r4] = r6     // Catch:{ all -> 0x044d }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x044d }
            r4 = r43
            gy3.C87412m.m108593f(r2, r4)     // Catch:{ all -> 0x044d }
            java.lang.String r45 = ","
            java.lang.String r46 = ";"
            r47 = 0
            r48 = 4
            r49 = 0
            r44 = r2
            java.lang.String r2 = z04.C112551y.m153816p(r44, r45, r46, r47, r48, r49)     // Catch:{ all -> 0x044d }
            r4 = 3
            r3[r4] = r2     // Catch:{ all -> 0x044d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r24)     // Catch:{ all -> 0x044d }
            r4 = 4
            r3[r4] = r2     // Catch:{ all -> 0x044d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r28)     // Catch:{ all -> 0x044d }
            r4 = 5
            r3[r4] = r2     // Catch:{ all -> 0x044d }
            r2 = 6
            r3[r2] = r12     // Catch:{ all -> 0x044d }
            r4 = 7
            r3[r4] = r5     // Catch:{ all -> 0x044d }
            r4 = 23498(0x5bca, float:3.2928E-41)
            r13.mo160131h(r4, r3)     // Catch:{ all -> 0x044d }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x044d }
            r3 = 0
            r2[r3] = r15     // Catch:{ all -> 0x044d }
            r3 = 1
            r2[r3] = r42     // Catch:{ all -> 0x044d }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x044d }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x044d }
            r4 = 2
            r2[r4] = r3     // Catch:{ all -> 0x044d }
            java.lang.String r3 = "19"
            r4 = 3
            r2[r4] = r3     // Catch:{ all -> 0x044d }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x044d }
            r4 = 4
            r2[r4] = r3     // Catch:{ all -> 0x044d }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x044d }
            r4 = 5
            r2[r4] = r3     // Catch:{ all -> 0x044d }
            r3 = 23669(0x5c75, float:3.3167E-41)
            r13.mo160131h(r3, r2)     // Catch:{ all -> 0x044d }
            r2 = 0
            return r2
        L_0x04e3:
            r13 = r52
            r10 = r1
            r1 = r2
            goto L_0x0e51
        L_0x04e9:
            r37 = r9
            r1 = r43
            r9 = r44
            if (r10 == 0) goto L_0x057b
            if (r3 != 0) goto L_0x057b
            java.lang.String r2 = "just return! 允许应用内弹，但没有浮窗权限"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r2)     // Catch:{ all -> 0x0cc7 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0cc7 }
            r2.<init>()     // Catch:{ all -> 0x0cc7 }
            r3 = 14
            r2.put(r9, r3)     // Catch:{ all -> 0x0cc7 }
            r3 = 8
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0cc7 }
            r4 = 0
            r3[r4] = r15     // Catch:{ all -> 0x0cc7 }
            r4 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0cc7 }
            r9 = 1
            r3[r9] = r6     // Catch:{ all -> 0x0cc7 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cc7 }
            java.lang.Long r6 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0cc7 }
            r3[r4] = r6     // Catch:{ all -> 0x0cc7 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0cc7 }
            gy3.C87412m.m108593f(r2, r1)     // Catch:{ all -> 0x0cc7 }
            java.lang.String r44 = ","
            java.lang.String r45 = ";"
            r46 = 0
            r47 = 4
            r48 = 0
            r43 = r2
            java.lang.String r1 = z04.C112551y.m153816p(r43, r44, r45, r46, r47, r48)     // Catch:{ all -> 0x0cc7 }
            r2 = 3
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)     // Catch:{ all -> 0x0cc7 }
            r2 = 4
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)     // Catch:{ all -> 0x0cc7 }
            r2 = 5
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            r1 = 6
            r3[r1] = r12     // Catch:{ all -> 0x0cc7 }
            r2 = 7
            r3[r2] = r5     // Catch:{ all -> 0x0cc7 }
            r2 = 23498(0x5bca, float:3.2928E-41)
            r13.mo160131h(r2, r3)     // Catch:{ all -> 0x0cc7 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0cc7 }
            r2 = 0
            r1[r2] = r15     // Catch:{ all -> 0x0cc7 }
            r2 = 1
            r1[r2] = r42     // Catch:{ all -> 0x0cc7 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cc7 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0cc7 }
            r3 = 2
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.String r2 = "14"
            r3 = 3
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0cc7 }
            r3 = 4
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0cc7 }
            r3 = 5
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            r2 = 23669(0x5c75, float:3.3167E-41)
            r13.mo160131h(r2, r1)     // Catch:{ all -> 0x0cc7 }
            r1 = 0
            return r1
        L_0x057b:
            if (r11 != 0) goto L_0x060c
            if (r10 == 0) goto L_0x060c
            if (r14 != 0) goto L_0x060c
            r3 = 1
            if (r8 != r3) goto L_0x060c
            java.lang.String r2 = "just return! 只允许在应用内弹，但当前在应用外收到"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r2)     // Catch:{ all -> 0x0cc7 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0cc7 }
            r2.<init>()     // Catch:{ all -> 0x0cc7 }
            r3 = 16
            r2.put(r9, r3)     // Catch:{ all -> 0x0cc7 }
            r3 = 8
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0cc7 }
            r4 = 0
            r3[r4] = r15     // Catch:{ all -> 0x0cc7 }
            r4 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0cc7 }
            r9 = 1
            r3[r9] = r6     // Catch:{ all -> 0x0cc7 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cc7 }
            java.lang.Long r6 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0cc7 }
            r3[r4] = r6     // Catch:{ all -> 0x0cc7 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0cc7 }
            gy3.C87412m.m108593f(r2, r1)     // Catch:{ all -> 0x0cc7 }
            java.lang.String r44 = ","
            java.lang.String r45 = ";"
            r46 = 0
            r47 = 4
            r48 = 0
            r43 = r2
            java.lang.String r1 = z04.C112551y.m153816p(r43, r44, r45, r46, r47, r48)     // Catch:{ all -> 0x0cc7 }
            r2 = 3
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)     // Catch:{ all -> 0x0cc7 }
            r2 = 4
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)     // Catch:{ all -> 0x0cc7 }
            r2 = 5
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            r1 = 6
            r3[r1] = r12     // Catch:{ all -> 0x0cc7 }
            r2 = 7
            r3[r2] = r5     // Catch:{ all -> 0x0cc7 }
            r2 = 23498(0x5bca, float:3.2928E-41)
            r13.mo160131h(r2, r3)     // Catch:{ all -> 0x0cc7 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0cc7 }
            r2 = 0
            r1[r2] = r15     // Catch:{ all -> 0x0cc7 }
            r2 = 1
            r1[r2] = r42     // Catch:{ all -> 0x0cc7 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cc7 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0cc7 }
            r3 = 2
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.String r2 = "16"
            r3 = 3
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0cc7 }
            r3 = 4
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0cc7 }
            r3 = 5
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            r2 = 23669(0x5c75, float:3.3167E-41)
            r13.mo160131h(r2, r1)     // Catch:{ all -> 0x0cc7 }
            r1 = 0
            return r1
        L_0x060c:
            if (r11 == 0) goto L_0x069d
            if (r14 == 0) goto L_0x069d
            if (r10 != 0) goto L_0x069d
            r3 = 1
            if (r8 != r3) goto L_0x069d
            java.lang.String r2 = "just return! 只允许在应用外弹，但当前在应用内收到"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r2)     // Catch:{ all -> 0x0cc7 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0cc7 }
            r2.<init>()     // Catch:{ all -> 0x0cc7 }
            r3 = 17
            r2.put(r9, r3)     // Catch:{ all -> 0x0cc7 }
            r3 = 8
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0cc7 }
            r4 = 0
            r3[r4] = r15     // Catch:{ all -> 0x0cc7 }
            r4 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0cc7 }
            r9 = 1
            r3[r9] = r6     // Catch:{ all -> 0x0cc7 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cc7 }
            java.lang.Long r6 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0cc7 }
            r3[r4] = r6     // Catch:{ all -> 0x0cc7 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0cc7 }
            gy3.C87412m.m108593f(r2, r1)     // Catch:{ all -> 0x0cc7 }
            java.lang.String r44 = ","
            java.lang.String r45 = ";"
            r46 = 0
            r47 = 4
            r48 = 0
            r43 = r2
            java.lang.String r1 = z04.C112551y.m153816p(r43, r44, r45, r46, r47, r48)     // Catch:{ all -> 0x0cc7 }
            r2 = 3
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)     // Catch:{ all -> 0x0cc7 }
            r2 = 4
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)     // Catch:{ all -> 0x0cc7 }
            r2 = 5
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            r1 = 6
            r3[r1] = r12     // Catch:{ all -> 0x0cc7 }
            r2 = 7
            r3[r2] = r5     // Catch:{ all -> 0x0cc7 }
            r2 = 23498(0x5bca, float:3.2928E-41)
            r13.mo160131h(r2, r3)     // Catch:{ all -> 0x0cc7 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0cc7 }
            r2 = 0
            r1[r2] = r15     // Catch:{ all -> 0x0cc7 }
            r2 = 1
            r1[r2] = r42     // Catch:{ all -> 0x0cc7 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cc7 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0cc7 }
            r3 = 2
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.String r2 = "17"
            r3 = 3
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0cc7 }
            r3 = 4
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0cc7 }
            r3 = 5
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            r2 = 23669(0x5c75, float:3.3167E-41)
            r13.mo160131h(r2, r1)     // Catch:{ all -> 0x0cc7 }
            r1 = 0
            return r1
        L_0x069d:
            r10 = 1
            int r3 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r3 > 0) goto L_0x06aa
            long r10 = (long) r2     // Catch:{ all -> 0x0cc7 }
            int r3 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r3 > 0) goto L_0x06aa
            r3 = 1
            goto L_0x06ab
        L_0x06aa:
            r3 = 0
        L_0x06ab:
            if (r3 == 0) goto L_0x074c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0cc7 }
            r3.<init>()     // Catch:{ all -> 0x0cc7 }
            java.lang.String r6 = "just return! 超过一天的限制频率("
            r3.append(r6)     // Catch:{ all -> 0x0cc7 }
            r10 = r19
            r3.append(r10)     // Catch:{ all -> 0x0cc7 }
            java.lang.String r6 = ") showCount="
            r3.append(r6)     // Catch:{ all -> 0x0cc7 }
            r3.append(r2)     // Catch:{ all -> 0x0cc7 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0cc7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r2)     // Catch:{ all -> 0x0cc7 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0cc7 }
            r2.<init>()     // Catch:{ all -> 0x0cc7 }
            r3 = 2
            r2.put(r9, r3)     // Catch:{ all -> 0x0cc7 }
            r4 = 8
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0cc7 }
            r6 = 0
            r4[r6] = r15     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0cc7 }
            r9 = 1
            r4[r9] = r6     // Catch:{ all -> 0x0cc7 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cc7 }
            java.lang.Long r6 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0cc7 }
            r4[r3] = r6     // Catch:{ all -> 0x0cc7 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0cc7 }
            gy3.C87412m.m108593f(r2, r1)     // Catch:{ all -> 0x0cc7 }
            java.lang.String r44 = ","
            java.lang.String r45 = ";"
            r46 = 0
            r47 = 4
            r48 = 0
            r43 = r2
            java.lang.String r1 = z04.C112551y.m153816p(r43, r44, r45, r46, r47, r48)     // Catch:{ all -> 0x0cc7 }
            r2 = 3
            r4[r2] = r1     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)     // Catch:{ all -> 0x0cc7 }
            r2 = 4
            r4[r2] = r1     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)     // Catch:{ all -> 0x0cc7 }
            r2 = 5
            r4[r2] = r1     // Catch:{ all -> 0x0cc7 }
            r1 = 6
            r4[r1] = r12     // Catch:{ all -> 0x0cc7 }
            r2 = 7
            r4[r2] = r5     // Catch:{ all -> 0x0cc7 }
            r2 = 23498(0x5bca, float:3.2928E-41)
            r13.mo160131h(r2, r4)     // Catch:{ all -> 0x0cc7 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0cc7 }
            r2 = 0
            r1[r2] = r15     // Catch:{ all -> 0x0cc7 }
            r2 = 1
            r1[r2] = r42     // Catch:{ all -> 0x0cc7 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cc7 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0cc7 }
            r3 = 2
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.String r2 = "2"
            r3 = 3
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0cc7 }
            r3 = 4
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0cc7 }
            r3 = 5
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            r2 = 23669(0x5c75, float:3.3167E-41)
            r13.mo160131h(r2, r1)     // Catch:{ all -> 0x0cc7 }
            r1 = 0
            return r1
        L_0x074c:
            if (r6 <= 0) goto L_0x07fa
            long r2 = (long) r6     // Catch:{ all -> 0x0cc7 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cc7 }
            r14 = 1000(0x3e8, float:1.401E-42)
            r20 = r7
            r19 = r8
            long r7 = (long) r14     // Catch:{ all -> 0x0cc7 }
            long r10 = r10 / r7
            int r7 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x07fe
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0cc7 }
            r2.<init>()     // Catch:{ all -> 0x0cc7 }
            java.lang.String r3 = "just return! 超过了展示push的时间("
            r2.append(r3)     // Catch:{ all -> 0x0cc7 }
            r2.append(r6)     // Catch:{ all -> 0x0cc7 }
            java.lang.String r3 = ")."
            r2.append(r3)     // Catch:{ all -> 0x0cc7 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0cc7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r2)     // Catch:{ all -> 0x0cc7 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0cc7 }
            r2.<init>()     // Catch:{ all -> 0x0cc7 }
            r3 = 3
            r2.put(r9, r3)     // Catch:{ all -> 0x0cc7 }
            r3 = 8
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0cc7 }
            r4 = 0
            r3[r4] = r15     // Catch:{ all -> 0x0cc7 }
            r4 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0cc7 }
            r7 = 1
            r3[r7] = r6     // Catch:{ all -> 0x0cc7 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cc7 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0cc7 }
            r3[r4] = r6     // Catch:{ all -> 0x0cc7 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0cc7 }
            gy3.C87412m.m108593f(r2, r1)     // Catch:{ all -> 0x0cc7 }
            java.lang.String r44 = ","
            java.lang.String r45 = ";"
            r46 = 0
            r47 = 4
            r48 = 0
            r43 = r2
            java.lang.String r1 = z04.C112551y.m153816p(r43, r44, r45, r46, r47, r48)     // Catch:{ all -> 0x0cc7 }
            r2 = 3
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)     // Catch:{ all -> 0x0cc7 }
            r2 = 4
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)     // Catch:{ all -> 0x0cc7 }
            r2 = 5
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            r1 = 6
            r3[r1] = r12     // Catch:{ all -> 0x0cc7 }
            r2 = 7
            r3[r2] = r5     // Catch:{ all -> 0x0cc7 }
            r2 = 23498(0x5bca, float:3.2928E-41)
            r13.mo160131h(r2, r3)     // Catch:{ all -> 0x0cc7 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0cc7 }
            r2 = 0
            r1[r2] = r15     // Catch:{ all -> 0x0cc7 }
            r2 = 1
            r1[r2] = r42     // Catch:{ all -> 0x0cc7 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cc7 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0cc7 }
            r3 = 2
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.String r2 = "3"
            r3 = 3
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)     // Catch:{ all -> 0x0cc7 }
            r3 = 4
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x0cc7 }
            r3 = 5
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            r2 = 23669(0x5c75, float:3.3167E-41)
            r13.mo160131h(r2, r1)     // Catch:{ all -> 0x0cc7 }
            r1 = 0
            return r1
        L_0x07fa:
            r20 = r7
            r19 = r8
        L_0x07fe:
            if (r37 == 0) goto L_0x0887
            if (r32 != 0) goto L_0x0887
            java.lang.String r2 = "just return! 发现页入口被用户关闭，且后台没有强制 emFinderGlobalPushCtrlFlag_ForceAlert"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r2)     // Catch:{ all -> 0x0cc7 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0cc7 }
            r2.<init>()     // Catch:{ all -> 0x0cc7 }
            r3 = 4
            r2.put(r9, r3)     // Catch:{ all -> 0x0cc7 }
            r3 = 8
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0cc7 }
            r4 = 0
            r3[r4] = r15     // Catch:{ all -> 0x0cc7 }
            r4 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0cc7 }
            r7 = 1
            r3[r7] = r6     // Catch:{ all -> 0x0cc7 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cc7 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0cc7 }
            r3[r4] = r6     // Catch:{ all -> 0x0cc7 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0cc7 }
            gy3.C87412m.m108593f(r2, r1)     // Catch:{ all -> 0x0cc7 }
            java.lang.String r44 = ","
            java.lang.String r45 = ";"
            r46 = 0
            r47 = 4
            r48 = 0
            r43 = r2
            java.lang.String r1 = z04.C112551y.m153816p(r43, r44, r45, r46, r47, r48)     // Catch:{ all -> 0x0cc7 }
            r2 = 3
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)     // Catch:{ all -> 0x0cc7 }
            r2 = 4
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)     // Catch:{ all -> 0x0cc7 }
            r2 = 5
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            r1 = 6
            r3[r1] = r12     // Catch:{ all -> 0x0cc7 }
            r2 = 7
            r3[r2] = r5     // Catch:{ all -> 0x0cc7 }
            r2 = 23498(0x5bca, float:3.2928E-41)
            r13.mo160131h(r2, r3)     // Catch:{ all -> 0x0cc7 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0cc7 }
            r2 = 0
            r1[r2] = r15     // Catch:{ all -> 0x0cc7 }
            r2 = 1
            r1[r2] = r42     // Catch:{ all -> 0x0cc7 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cc7 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0cc7 }
            r3 = 2
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            r2 = 3
            r1[r2] = r33     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)     // Catch:{ all -> 0x0cc7 }
            r3 = 4
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x0cc7 }
            r3 = 5
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            r2 = 23669(0x5c75, float:3.3167E-41)
            r13.mo160131h(r2, r1)     // Catch:{ all -> 0x0cc7 }
            r1 = 0
            return r1
        L_0x0887:
            if (r51 != 0) goto L_0x0910
            java.lang.String r2 = "just return! 没有视频号入口权限"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r2)     // Catch:{ all -> 0x0cc7 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0cc7 }
            r2.<init>()     // Catch:{ all -> 0x0cc7 }
            r3 = 5
            r2.put(r9, r3)     // Catch:{ all -> 0x0cc7 }
            r3 = 8
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0cc7 }
            r4 = 0
            r3[r4] = r15     // Catch:{ all -> 0x0cc7 }
            r4 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0cc7 }
            r7 = 1
            r3[r7] = r6     // Catch:{ all -> 0x0cc7 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cc7 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0cc7 }
            r3[r4] = r6     // Catch:{ all -> 0x0cc7 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0cc7 }
            gy3.C87412m.m108593f(r2, r1)     // Catch:{ all -> 0x0cc7 }
            java.lang.String r44 = ","
            java.lang.String r45 = ";"
            r46 = 0
            r47 = 4
            r48 = 0
            r43 = r2
            java.lang.String r1 = z04.C112551y.m153816p(r43, r44, r45, r46, r47, r48)     // Catch:{ all -> 0x0cc7 }
            r2 = 3
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)     // Catch:{ all -> 0x0cc7 }
            r2 = 4
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)     // Catch:{ all -> 0x0cc7 }
            r2 = 5
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            r1 = 6
            r3[r1] = r12     // Catch:{ all -> 0x0cc7 }
            r2 = 7
            r3[r2] = r5     // Catch:{ all -> 0x0cc7 }
            r2 = 23498(0x5bca, float:3.2928E-41)
            r13.mo160131h(r2, r3)     // Catch:{ all -> 0x0cc7 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0cc7 }
            r2 = 0
            r1[r2] = r15     // Catch:{ all -> 0x0cc7 }
            r2 = 1
            r1[r2] = r42     // Catch:{ all -> 0x0cc7 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cc7 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0cc7 }
            r3 = 2
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.String r2 = "5"
            r3 = 3
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)     // Catch:{ all -> 0x0cc7 }
            r3 = 4
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x0cc7 }
            r3 = 5
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            r2 = 23669(0x5c75, float:3.3167E-41)
            r13.mo160131h(r2, r1)     // Catch:{ all -> 0x0cc7 }
            r1 = 0
            return r1
        L_0x0910:
            if (r25 == 0) goto L_0x0999
            java.lang.String r2 = "just return! 处于青少年模式中"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r2)     // Catch:{ all -> 0x0cc7 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0cc7 }
            r2.<init>()     // Catch:{ all -> 0x0cc7 }
            r3 = 6
            r2.put(r9, r3)     // Catch:{ all -> 0x0cc7 }
            r3 = 8
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0cc7 }
            r4 = 0
            r3[r4] = r15     // Catch:{ all -> 0x0cc7 }
            r4 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0cc7 }
            r7 = 1
            r3[r7] = r6     // Catch:{ all -> 0x0cc7 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cc7 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0cc7 }
            r3[r4] = r6     // Catch:{ all -> 0x0cc7 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0cc7 }
            gy3.C87412m.m108593f(r2, r1)     // Catch:{ all -> 0x0cc7 }
            java.lang.String r44 = ","
            java.lang.String r45 = ";"
            r46 = 0
            r47 = 4
            r48 = 0
            r43 = r2
            java.lang.String r1 = z04.C112551y.m153816p(r43, r44, r45, r46, r47, r48)     // Catch:{ all -> 0x0cc7 }
            r2 = 3
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)     // Catch:{ all -> 0x0cc7 }
            r2 = 4
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)     // Catch:{ all -> 0x0cc7 }
            r2 = 5
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            r1 = 6
            r3[r1] = r12     // Catch:{ all -> 0x0cc7 }
            r2 = 7
            r3[r2] = r5     // Catch:{ all -> 0x0cc7 }
            r2 = 23498(0x5bca, float:3.2928E-41)
            r13.mo160131h(r2, r3)     // Catch:{ all -> 0x0cc7 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0cc7 }
            r2 = 0
            r1[r2] = r15     // Catch:{ all -> 0x0cc7 }
            r2 = 1
            r1[r2] = r42     // Catch:{ all -> 0x0cc7 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cc7 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0cc7 }
            r3 = 2
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.String r2 = "6"
            r3 = 3
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)     // Catch:{ all -> 0x0cc7 }
            r3 = 4
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x0cc7 }
            r3 = 5
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            r2 = 23669(0x5c75, float:3.3167E-41)
            r13.mo160131h(r2, r1)     // Catch:{ all -> 0x0cc7 }
            r1 = 0
            return r1
        L_0x0999:
            if (r45 != 0) goto L_0x0a22
            java.lang.String r2 = "just return! 新消息通知设置没有展示push开关权限"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r2)     // Catch:{ all -> 0x0cc7 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0cc7 }
            r2.<init>()     // Catch:{ all -> 0x0cc7 }
            r3 = 7
            r2.put(r9, r3)     // Catch:{ all -> 0x0cc7 }
            r3 = 8
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0cc7 }
            r4 = 0
            r3[r4] = r15     // Catch:{ all -> 0x0cc7 }
            r4 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0cc7 }
            r7 = 1
            r3[r7] = r6     // Catch:{ all -> 0x0cc7 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cc7 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0cc7 }
            r3[r4] = r6     // Catch:{ all -> 0x0cc7 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0cc7 }
            gy3.C87412m.m108593f(r2, r1)     // Catch:{ all -> 0x0cc7 }
            java.lang.String r44 = ","
            java.lang.String r45 = ";"
            r46 = 0
            r47 = 4
            r48 = 0
            r43 = r2
            java.lang.String r1 = z04.C112551y.m153816p(r43, r44, r45, r46, r47, r48)     // Catch:{ all -> 0x0cc7 }
            r2 = 3
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)     // Catch:{ all -> 0x0cc7 }
            r2 = 4
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)     // Catch:{ all -> 0x0cc7 }
            r2 = 5
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            r1 = 6
            r3[r1] = r12     // Catch:{ all -> 0x0cc7 }
            r2 = 7
            r3[r2] = r5     // Catch:{ all -> 0x0cc7 }
            r2 = 23498(0x5bca, float:3.2928E-41)
            r13.mo160131h(r2, r3)     // Catch:{ all -> 0x0cc7 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0cc7 }
            r2 = 0
            r1[r2] = r15     // Catch:{ all -> 0x0cc7 }
            r2 = 1
            r1[r2] = r42     // Catch:{ all -> 0x0cc7 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cc7 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0cc7 }
            r3 = 2
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.String r2 = "7"
            r3 = 3
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)     // Catch:{ all -> 0x0cc7 }
            r3 = 4
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x0cc7 }
            r3 = 5
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            r2 = 23669(0x5c75, float:3.3167E-41)
            r13.mo160131h(r2, r1)     // Catch:{ all -> 0x0cc7 }
            r1 = 0
            return r1
        L_0x0a22:
            if (r21 == 0) goto L_0x0aaa
            java.lang.String r2 = "just return! 当前在视频号场景下，一定不弹"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r2)     // Catch:{ all -> 0x0cc7 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0cc7 }
            r2.<init>()     // Catch:{ all -> 0x0cc7 }
            r3 = 8
            r2.put(r9, r3)     // Catch:{ all -> 0x0cc7 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0cc7 }
            r4 = 0
            r3[r4] = r15     // Catch:{ all -> 0x0cc7 }
            r4 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0cc7 }
            r7 = 1
            r3[r7] = r6     // Catch:{ all -> 0x0cc7 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cc7 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0cc7 }
            r3[r4] = r6     // Catch:{ all -> 0x0cc7 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0cc7 }
            gy3.C87412m.m108593f(r2, r1)     // Catch:{ all -> 0x0cc7 }
            java.lang.String r44 = ","
            java.lang.String r45 = ";"
            r46 = 0
            r47 = 4
            r48 = 0
            r43 = r2
            java.lang.String r1 = z04.C112551y.m153816p(r43, r44, r45, r46, r47, r48)     // Catch:{ all -> 0x0cc7 }
            r2 = 3
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)     // Catch:{ all -> 0x0cc7 }
            r2 = 4
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)     // Catch:{ all -> 0x0cc7 }
            r2 = 5
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            r1 = 6
            r3[r1] = r12     // Catch:{ all -> 0x0cc7 }
            r2 = 7
            r3[r2] = r5     // Catch:{ all -> 0x0cc7 }
            r2 = 23498(0x5bca, float:3.2928E-41)
            r13.mo160131h(r2, r3)     // Catch:{ all -> 0x0cc7 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0cc7 }
            r2 = 0
            r1[r2] = r15     // Catch:{ all -> 0x0cc7 }
            r2 = 1
            r1[r2] = r42     // Catch:{ all -> 0x0cc7 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cc7 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0cc7 }
            r3 = 2
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.String r2 = "8"
            r3 = 3
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)     // Catch:{ all -> 0x0cc7 }
            r3 = 4
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x0cc7 }
            r3 = 5
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            r2 = 23669(0x5c75, float:3.3167E-41)
            r13.mo160131h(r2, r1)     // Catch:{ all -> 0x0cc7 }
            r1 = 0
            return r1
        L_0x0aaa:
            if (r22 != 0) goto L_0x0b34
            java.lang.String r2 = "just return! 用户关闭push开关，一定不弹"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r2)     // Catch:{ all -> 0x0cc7 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0cc7 }
            r2.<init>()     // Catch:{ all -> 0x0cc7 }
            r3 = 10
            r2.put(r9, r3)     // Catch:{ all -> 0x0cc7 }
            r3 = 8
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0cc7 }
            r4 = 0
            r3[r4] = r15     // Catch:{ all -> 0x0cc7 }
            r4 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0cc7 }
            r7 = 1
            r3[r7] = r6     // Catch:{ all -> 0x0cc7 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cc7 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0cc7 }
            r3[r4] = r6     // Catch:{ all -> 0x0cc7 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0cc7 }
            gy3.C87412m.m108593f(r2, r1)     // Catch:{ all -> 0x0cc7 }
            java.lang.String r44 = ","
            java.lang.String r45 = ";"
            r46 = 0
            r47 = 4
            r48 = 0
            r43 = r2
            java.lang.String r1 = z04.C112551y.m153816p(r43, r44, r45, r46, r47, r48)     // Catch:{ all -> 0x0cc7 }
            r2 = 3
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)     // Catch:{ all -> 0x0cc7 }
            r2 = 4
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)     // Catch:{ all -> 0x0cc7 }
            r2 = 5
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            r1 = 6
            r3[r1] = r12     // Catch:{ all -> 0x0cc7 }
            r2 = 7
            r3[r2] = r5     // Catch:{ all -> 0x0cc7 }
            r2 = 23498(0x5bca, float:3.2928E-41)
            r13.mo160131h(r2, r3)     // Catch:{ all -> 0x0cc7 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0cc7 }
            r2 = 0
            r1[r2] = r15     // Catch:{ all -> 0x0cc7 }
            r2 = 1
            r1[r2] = r42     // Catch:{ all -> 0x0cc7 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cc7 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0cc7 }
            r3 = 2
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.String r2 = "10"
            r3 = 3
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)     // Catch:{ all -> 0x0cc7 }
            r3 = 4
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x0cc7 }
            r3 = 5
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            r2 = 23669(0x5c75, float:3.3167E-41)
            r13.mo160131h(r2, r1)     // Catch:{ all -> 0x0cc7 }
            r1 = 0
            return r1
        L_0x0b34:
            r7 = r20
            r2 = 2
            if (r7 != r2) goto L_0x0bc7
            if (r38 != 0) goto L_0x0bc3
            java.lang.String r2 = "just return! 当前推送的是直播push, 没有直播入口权限"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r2)     // Catch:{ all -> 0x0cc7 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0cc7 }
            r2.<init>()     // Catch:{ all -> 0x0cc7 }
            r3 = 11
            r2.put(r9, r3)     // Catch:{ all -> 0x0cc7 }
            r3 = 8
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0cc7 }
            r4 = 0
            r3[r4] = r15     // Catch:{ all -> 0x0cc7 }
            r4 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0cc7 }
            r8 = 1
            r3[r8] = r6     // Catch:{ all -> 0x0cc7 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cc7 }
            java.lang.Long r6 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0cc7 }
            r3[r4] = r6     // Catch:{ all -> 0x0cc7 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0cc7 }
            gy3.C87412m.m108593f(r2, r1)     // Catch:{ all -> 0x0cc7 }
            java.lang.String r44 = ","
            java.lang.String r45 = ";"
            r46 = 0
            r47 = 4
            r48 = 0
            r43 = r2
            java.lang.String r1 = z04.C112551y.m153816p(r43, r44, r45, r46, r47, r48)     // Catch:{ all -> 0x0cc7 }
            r2 = 3
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)     // Catch:{ all -> 0x0cc7 }
            r2 = 4
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)     // Catch:{ all -> 0x0cc7 }
            r2 = 5
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            r1 = 6
            r3[r1] = r12     // Catch:{ all -> 0x0cc7 }
            r2 = 7
            r3[r2] = r5     // Catch:{ all -> 0x0cc7 }
            r2 = 23498(0x5bca, float:3.2928E-41)
            r13.mo160131h(r2, r3)     // Catch:{ all -> 0x0cc7 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0cc7 }
            r2 = 0
            r1[r2] = r15     // Catch:{ all -> 0x0cc7 }
            r2 = 1
            r1[r2] = r42     // Catch:{ all -> 0x0cc7 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cc7 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0cc7 }
            r3 = 2
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.String r2 = "11"
            r3 = 3
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)     // Catch:{ all -> 0x0cc7 }
            r3 = 4
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0cc7 }
            r3 = 5
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            r2 = 23669(0x5c75, float:3.3167E-41)
            r13.mo160131h(r2, r1)     // Catch:{ all -> 0x0cc7 }
            r1 = 0
            return r1
        L_0x0bc3:
            r8 = r19
            r2 = 2
            goto L_0x0bc9
        L_0x0bc7:
            r8 = r19
        L_0x0bc9:
            if (r8 != r2) goto L_0x0c5d
            java.util.concurrent.ConcurrentHashMap r2 = r50.mo89434l()     // Catch:{ all -> 0x0cc7 }
            boolean r2 = r2.containsKey(r15)     // Catch:{ all -> 0x0cc7 }
            if (r2 != 0) goto L_0x0c5d
            java.lang.String r2 = "just return! 当前推送的是修改push，但本地已经没有这个taskid"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r2)     // Catch:{ all -> 0x0cc7 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0cc7 }
            r2.<init>()     // Catch:{ all -> 0x0cc7 }
            r3 = 18
            r2.put(r9, r3)     // Catch:{ all -> 0x0cc7 }
            r3 = 8
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0cc7 }
            r4 = 0
            r3[r4] = r15     // Catch:{ all -> 0x0cc7 }
            r4 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0cc7 }
            r9 = 1
            r3[r9] = r6     // Catch:{ all -> 0x0cc7 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cc7 }
            java.lang.Long r6 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0cc7 }
            r3[r4] = r6     // Catch:{ all -> 0x0cc7 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0cc7 }
            gy3.C87412m.m108593f(r2, r1)     // Catch:{ all -> 0x0cc7 }
            java.lang.String r44 = ","
            java.lang.String r45 = ";"
            r46 = 0
            r47 = 4
            r48 = 0
            r43 = r2
            java.lang.String r1 = z04.C112551y.m153816p(r43, r44, r45, r46, r47, r48)     // Catch:{ all -> 0x0cc7 }
            r2 = 3
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)     // Catch:{ all -> 0x0cc7 }
            r2 = 4
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)     // Catch:{ all -> 0x0cc7 }
            r2 = 5
            r3[r2] = r1     // Catch:{ all -> 0x0cc7 }
            r2 = 6
            r3[r2] = r12     // Catch:{ all -> 0x0cc7 }
            r1 = 7
            r3[r1] = r5     // Catch:{ all -> 0x0cc7 }
            r1 = 23498(0x5bca, float:3.2928E-41)
            r13.mo160131h(r1, r3)     // Catch:{ all -> 0x0cc7 }
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0cc7 }
            r2 = 0
            r1[r2] = r15     // Catch:{ all -> 0x0cc7 }
            r2 = 1
            r1[r2] = r42     // Catch:{ all -> 0x0cc7 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cc7 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0cc7 }
            r3 = 2
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.String r2 = "18"
            r3 = 3
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0cc7 }
            r3 = 4
            r1[r3] = r2     // Catch:{ all -> 0x0cc7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0cc7 }
            r4 = 5
            r1[r4] = r2     // Catch:{ all -> 0x0cc7 }
            r6 = 23669(0x5c75, float:3.3167E-41)
            r13.mo160131h(r6, r1)     // Catch:{ all -> 0x0cc7 }
            r1 = 0
            return r1
        L_0x0c5d:
            r2 = 6
            r3 = 4
            r4 = 5
            r6 = 23669(0x5c75, float:3.3167E-41)
            r1 = 1
            if (r8 != r1) goto L_0x0c67
            r1 = 2
            goto L_0x0c6a
        L_0x0c67:
            r1 = 2
            if (r8 != r1) goto L_0x0c6c
        L_0x0c6a:
            r9 = 1
            goto L_0x0c6d
        L_0x0c6c:
            r9 = 0
        L_0x0c6d:
            if (r9 == 0) goto L_0x0cbb
            if (r8 != r1) goto L_0x0c73
            r9 = 1
            goto L_0x0c74
        L_0x0c73:
            r9 = 0
        L_0x0c74:
            r10 = r50
            r1 = r50
            r11 = 6
            r14 = 23669(0x5c75, float:3.3167E-41)
            r19 = 5
            r20 = 4
            r2 = r15
            r3 = r52
            r4 = r28
            r21 = r5
            r5 = r9
            r6 = r54
            r22 = r7
            r7 = r12
            r25 = r8
            r8 = r21
            r1.mo89431h(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0e3b }
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x0e3b }
            r2 = 0
            r1[r2] = r15     // Catch:{ all -> 0x0e3b }
            java.lang.String r2 = "notify"
            r3 = 1
            r1[r3] = r2     // Catch:{ all -> 0x0e3b }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0e3b }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0e3b }
            r3 = 2
            r1[r3] = r2     // Catch:{ all -> 0x0e3b }
            r2 = 3
            r1[r2] = r18     // Catch:{ all -> 0x0e3b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r25)     // Catch:{ all -> 0x0e3b }
            r1[r20] = r2     // Catch:{ all -> 0x0e3b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x0e3b }
            r1[r19] = r2     // Catch:{ all -> 0x0e3b }
            r13.mo160131h(r14, r1)     // Catch:{ all -> 0x0e3b }
            goto L_0x0cbd
        L_0x0cbb:
            r10 = r50
        L_0x0cbd:
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0e3b }
            java.lang.Object r1 = kotlin.Result.m168114constructorimpl(r1)     // Catch:{ all -> 0x0e3b }
            r13 = r52
            goto L_0x0e5b
        L_0x0cc7:
            r0 = move-exception
            r10 = r50
            goto L_0x0cd6
        L_0x0ccb:
            r0 = move-exception
            r10 = r50
            r18 = r12
            goto L_0x0cd6
        L_0x0cd1:
            r0 = move-exception
            r10 = r50
        L_0x0cd4:
            r18 = r12
        L_0x0cd6:
            r1 = r0
            goto L_0x0cdb
        L_0x0cd8:
            r0 = move-exception
            r10 = r9
            goto L_0x0cd4
        L_0x0cdb:
            r13 = r52
            goto L_0x0e51
        L_0x0cdf:
            ue1.r$c r7 = new ue1.r$c     // Catch:{ all -> 0x0e3b }
            r8 = r51
            r13 = r52
            r14 = r53
            if (r3 != 0) goto L_0x0ceb
            r3 = 1
            goto L_0x0cec
        L_0x0ceb:
            r3 = 2
        L_0x0cec:
            r7.<init>(r8, r13, r14, r3)     // Catch:{ all -> 0x0e38 }
            r10.mo89437o(r7)     // Catch:{ all -> 0x0e38 }
            r3 = 100
            if (r6 == 0) goto L_0x0d97
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0e38 }
            r6.<init>()     // Catch:{ all -> 0x0e38 }
            java.lang.String r7 = "当前在敏感场景，延迟到退出该场景时弹出 size="
            r6.append(r7)     // Catch:{ all -> 0x0e38 }
            java.util.concurrent.ConcurrentLinkedQueue<ue1.r$c> r7 = r10.f188015e     // Catch:{ all -> 0x0e38 }
            int r7 = r7.size()     // Catch:{ all -> 0x0e38 }
            r6.append(r7)     // Catch:{ all -> 0x0e38 }
            r6.append(r11)     // Catch:{ all -> 0x0e38 }
            r6.append(r2)     // Catch:{ all -> 0x0e38 }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x0e38 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r2)     // Catch:{ all -> 0x0e38 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0e38 }
            r2.<init>()     // Catch:{ all -> 0x0e38 }
            r4 = 21
            r2.put(r9, r4)     // Catch:{ all -> 0x0e38 }
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0e38 }
            r6 = 8
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0e38 }
            r7 = 0
            r6[r7] = r15     // Catch:{ all -> 0x0e38 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0e38 }
            r7 = 1
            r6[r7] = r3     // Catch:{ all -> 0x0e38 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0e38 }
            java.lang.Long r3 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0e38 }
            r7 = 2
            r6[r7] = r3     // Catch:{ all -> 0x0e38 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0e38 }
            gy3.C87412m.m108593f(r2, r1)     // Catch:{ all -> 0x0e38 }
            java.lang.String r36 = ","
            java.lang.String r37 = ";"
            r38 = 0
            r39 = 4
            r40 = 0
            r35 = r2
            java.lang.String r1 = z04.C112551y.m153816p(r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0e38 }
            r2 = 3
            r6[r2] = r1     // Catch:{ all -> 0x0e38 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)     // Catch:{ all -> 0x0e38 }
            r6[r20] = r1     // Catch:{ all -> 0x0e38 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)     // Catch:{ all -> 0x0e38 }
            r6[r19] = r1     // Catch:{ all -> 0x0e38 }
            r6[r5] = r12     // Catch:{ all -> 0x0e38 }
            r1 = 7
            r6[r1] = r21     // Catch:{ all -> 0x0e38 }
            r1 = 23498(0x5bca, float:3.2928E-41)
            r4.mo160131h(r1, r6)     // Catch:{ all -> 0x0e38 }
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ all -> 0x0e38 }
            r2 = 0
            r1[r2] = r15     // Catch:{ all -> 0x0e38 }
            r2 = 1
            r1[r2] = r42     // Catch:{ all -> 0x0e38 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0e38 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0e38 }
            r3 = 2
            r1[r3] = r2     // Catch:{ all -> 0x0e38 }
            java.lang.String r2 = "21"
            r3 = 3
            r1[r3] = r2     // Catch:{ all -> 0x0e38 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r25)     // Catch:{ all -> 0x0e38 }
            r1[r20] = r2     // Catch:{ all -> 0x0e38 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x0e38 }
            r1[r19] = r2     // Catch:{ all -> 0x0e38 }
            r2 = 23669(0x5c75, float:3.3167E-41)
            r4.mo160131h(r2, r1)     // Catch:{ all -> 0x0e38 }
            goto L_0x0e36
        L_0x0d97:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ all -> 0x0e38 }
            r6.<init>()     // Catch:{ all -> 0x0e38 }
            r7 = 20
            r6.put(r9, r7)     // Catch:{ all -> 0x0e38 }
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0e38 }
            r8 = 8
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x0e38 }
            r9 = 0
            r8[r9] = r15     // Catch:{ all -> 0x0e38 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0e38 }
            r9 = 1
            r8[r9] = r3     // Catch:{ all -> 0x0e38 }
            long r26 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0e38 }
            java.lang.Long r3 = java.lang.Long.valueOf(r26)     // Catch:{ all -> 0x0e38 }
            r9 = 2
            r8[r9] = r3     // Catch:{ all -> 0x0e38 }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x0e38 }
            gy3.C87412m.m108593f(r3, r1)     // Catch:{ all -> 0x0e38 }
            java.lang.String r36 = ","
            java.lang.String r37 = ";"
            r38 = 0
            r39 = 4
            r40 = 0
            r35 = r3
            java.lang.String r1 = z04.C112551y.m153816p(r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0e38 }
            r3 = 3
            r8[r3] = r1     // Catch:{ all -> 0x0e38 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)     // Catch:{ all -> 0x0e38 }
            r8[r20] = r1     // Catch:{ all -> 0x0e38 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)     // Catch:{ all -> 0x0e38 }
            r8[r19] = r1     // Catch:{ all -> 0x0e38 }
            r8[r5] = r12     // Catch:{ all -> 0x0e38 }
            r1 = 7
            r8[r1] = r21     // Catch:{ all -> 0x0e38 }
            r1 = 23498(0x5bca, float:3.2928E-41)
            r7.mo160131h(r1, r8)     // Catch:{ all -> 0x0e38 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0e38 }
            r1.<init>()     // Catch:{ all -> 0x0e38 }
            java.lang.String r3 = "当前在后台，延迟到前台弹出 size="
            r1.append(r3)     // Catch:{ all -> 0x0e38 }
            java.util.concurrent.ConcurrentLinkedQueue<ue1.r$c> r3 = r10.f188015e     // Catch:{ all -> 0x0e38 }
            int r3 = r3.size()     // Catch:{ all -> 0x0e38 }
            r1.append(r3)     // Catch:{ all -> 0x0e38 }
            r1.append(r11)     // Catch:{ all -> 0x0e38 }
            r1.append(r2)     // Catch:{ all -> 0x0e38 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0e38 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r1)     // Catch:{ all -> 0x0e38 }
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ all -> 0x0e38 }
            r2 = 0
            r1[r2] = r15     // Catch:{ all -> 0x0e38 }
            r2 = 1
            r1[r2] = r42     // Catch:{ all -> 0x0e38 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0e38 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0e38 }
            r3 = 2
            r1[r3] = r2     // Catch:{ all -> 0x0e38 }
            java.lang.String r2 = "20"
            r3 = 3
            r1[r3] = r2     // Catch:{ all -> 0x0e38 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r25)     // Catch:{ all -> 0x0e38 }
            r1[r20] = r2     // Catch:{ all -> 0x0e38 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x0e38 }
            r1[r19] = r2     // Catch:{ all -> 0x0e38 }
            r2 = 23669(0x5c75, float:3.3167E-41)
            r7.mo160131h(r2, r1)     // Catch:{ all -> 0x0e38 }
        L_0x0e36:
            r1 = 0
            return r1
        L_0x0e38:
            r0 = move-exception
        L_0x0e39:
            r1 = r0
            goto L_0x0e51
        L_0x0e3b:
            r0 = move-exception
            r13 = r52
            goto L_0x0e39
        L_0x0e3f:
            r0 = move-exception
            r13 = r52
            r10 = r9
            r18 = r12
            goto L_0x0e39
        L_0x0e46:
            r0 = move-exception
            r13 = r10
        L_0x0e48:
            r18 = r12
            r10 = r9
            goto L_0x0e39
        L_0x0e4c:
            r0 = move-exception
            r13 = r10
            r17 = r11
            goto L_0x0e48
        L_0x0e51:
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m168114constructorimpl(r1)
        L_0x0e5b:
            java.lang.Throwable r1 = kotlin.Result.m168117exceptionOrNullimpl(r1)
            if (r1 == 0) goto L_0x0e8b
            r2 = r17
            java.lang.Object r2 = r13.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0e6e
            r12 = r18
            goto L_0x0e6f
        L_0x0e6e:
            r12 = r2
        L_0x0e6f:
            ft1.a r16 = ft1.C59319a.f169618b
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            ue1.r$k r2 = new ue1.r$k
            r2.<init>(r12, r1)
            r23 = 28
            r24 = 0
            java.lang.String r17 = "Finder.GlobalPushNewXmlConsumer"
            r22 = r2
            o40.C11348f.C11349a.m11178b(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0e8b:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ue1.C65328r.mo89435m(java.lang.String, java.util.Map, ob0.m$a, java.lang.String):ob0.m$b");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0315  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89436n(java.lang.String r30, java.lang.String r31, long r32, int r34, java.lang.String r35, int r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, android.graphics.Bitmap r41, boolean r42, boolean r43, long r44, long r46, int r48, int r49, int r50, java.lang.String r51, int r52, int r53, boolean r54, java.lang.String r55, java.lang.String r56, com.tencent.p014mm.protocal.protobuf.FinderJumpInfo r57) {
        /*
            r29 = this;
            r10 = r34
            r9 = r37
            r0 = r38
            r3 = r39
            r4 = r40
            r5 = r41
            r6 = r42
            r1 = r54
            java.lang.Class<bd2.d> r2 = bd2.C79690d.class
            di3.d r7 = di3.C86312j.m106911c(r2)
            bd2.d r7 = (bd2.C79690d) r7
            eb0.u2 r7 = r7.mo109806kA()
            r8 = 1
            if (r7 == 0) goto L_0x0026
            bi.b r7 = p789bi.C67244b.C67246b.f193087a
            int r7 = r7.mo91397k(r9, r8)
            goto L_0x002a
        L_0x0026:
            int r7 = r37.hashCode()
        L_0x002a:
            ft1.a r11 = ft1.C59319a.f169618b
            int r12 = r37.hashCode()
            r15 = 0
            if (r7 != r12) goto L_0x0035
            r13 = 1
            goto L_0x0036
        L_0x0035:
            r13 = 0
        L_0x0036:
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 60
            r20 = 0
            java.lang.String r12 = "FinderGlobalPushNewXmlConsumer"
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            o40.C11348f.C11349a.m11178b(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r15 = 0
            r14 = 3
            r13 = 2
            if (r10 != r8) goto L_0x007a
            r11 = r29
            r12 = r55
            r8 = 2
            r13 = r56
            r14 = r37
            r15 = r32
            r17 = r30
            r18 = r35
            r19 = r36
            r20 = r46
            r22 = r44
            r24 = r48
            r25 = r51
            r26 = r52
            r27 = r53
            android.content.Intent r11 = r11.mo89430g(r12, r13, r14, r15, r17, r18, r19, r20, r22, r24, r25, r26, r27)
        L_0x0076:
            r28 = 3
            goto L_0x0116
        L_0x007a:
            r8 = 2
            java.lang.String r15 = "KEY_ROUTE_TYPE"
            if (r10 != r8) goto L_0x00d9
            r11 = r29
            r12 = r55
            r13 = r56
            r14 = r37
            r8 = r15
            r15 = r32
            r17 = r30
            r18 = r46
            r20 = r48
            r21 = r44
            r23 = r51
            r24 = r52
            r25 = r53
            android.content.Intent r15 = r11.mo89429f(r12, r13, r14, r15, r17, r18, r20, r21, r23, r24, r25)
            r11 = 1
            r15.putExtra(r8, r11)
            r11 = r29
            r8 = r15
            r15 = r32
            r18 = r35
            r19 = r36
            r20 = r46
            r22 = r44
            r24 = r48
            r25 = r51
            r26 = r52
            r27 = r53
            android.content.Intent r11 = r11.mo89430g(r12, r13, r14, r15, r17, r18, r19, r20, r22, r24, r25, r26, r27)
            java.lang.String r12 = "KEY_JUMP_HOT_INTENT"
            r8.putExtra(r12, r11)
            java.lang.String r11 = "key_enter_live_param_visitor_enter_scene"
            r15 = 3
            r8.putExtra(r11, r15)
            java.lang.String r11 = "key_enter_live_param_by_pass_type"
            r14 = r36
            r8.putExtra(r11, r14)
            java.lang.String r11 = "key_enter_live_param_by_pass_info"
            r13 = r35
            r8.putExtra(r11, r13)
            java.lang.String r11 = "KEY_ENTER_LIVE_PARAM_APP_PUSH_TASK_ID"
            r8.putExtra(r11, r9)
            r11 = r8
            goto L_0x0076
        L_0x00d9:
            r13 = r35
            r14 = r36
            r8 = r15
            r15 = 3
            r11 = 10000(0x2710, float:1.4013E-41)
            if (r10 != r11) goto L_0x03ea
            r11 = r29
            r12 = r55
            r13 = r56
            r14 = r37
            r28 = 3
            r15 = r32
            r17 = r30
            r18 = r35
            r19 = r36
            r20 = r46
            r22 = r44
            r24 = r48
            r25 = r51
            r26 = r52
            r27 = r53
            android.content.Intent r11 = r11.mo89430g(r12, r13, r14, r15, r17, r18, r19, r20, r22, r24, r25, r26, r27)
            r12 = 2
            r11.putExtra(r8, r12)
            if (r57 == 0) goto L_0x0110
            byte[] r15 = r57.toByteArray()
            goto L_0x0111
        L_0x0110:
            r15 = 0
        L_0x0111:
            java.lang.String r8 = "KEY_JUMP_INFO"
            r11.putExtra(r8, r15)
        L_0x0116:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r12 = "[notification] taskId="
            r8.append(r12)
            r8.append(r9)
            java.lang.String r12 = " feedIdStr="
            r8.append(r12)
            r12 = r31
            r8.append(r12)
            java.lang.String r12 = " jumpTo="
            r8.append(r12)
            r8.append(r10)
            java.lang.String r12 = " ticker="
            r8.append(r12)
            r8.append(r0)
            java.lang.String r12 = " title="
            r8.append(r12)
            r8.append(r3)
            java.lang.String r12 = " content="
            r8.append(r12)
            r8.append(r4)
            java.lang.String r12 = " isModify="
            r8.append(r12)
            r8.append(r1)
            java.lang.String r12 = " isNeedSound="
            r8.append(r12)
            r8.append(r6)
            java.lang.String r12 = " demotionFlag="
            r8.append(r12)
            r12 = r44
            r8.append(r12)
            java.lang.String r12 = " authIconType="
            r8.append(r12)
            r12 = r49
            r8.append(r12)
            java.lang.String r13 = " alertDisplayTime="
            r8.append(r13)
            r13 = r50
            r8.append(r13)
            java.lang.String r14 = " hasTaskId="
            r8.append(r14)
            java.util.concurrent.ConcurrentHashMap r14 = r29.mo89434l()
            boolean r14 = r14.containsKey(r9)
            r8.append(r14)
            java.lang.String r14 = "largeIcon="
            r8.append(r14)
            if (r5 == 0) goto L_0x0198
            int r14 = r41.getAllocationByteCount()
            long r14 = (long) r14
            goto L_0x019a
        L_0x0198:
            r14 = 0
        L_0x019a:
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r14)
            r8.append(r14)
            java.lang.String r8 = r8.toString()
            java.lang.String r14 = "Finder.GlobalPushNewXmlConsumer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r8)
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r15 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r8 = android.app.PendingIntent.getActivity(r8, r7, r11, r15)
            if (r6 == 0) goto L_0x01bb
            java.lang.String r15 = vc3.C78382a.m94650b()
            goto L_0x01bd
        L_0x01bb:
            java.lang.String r15 = "reminder_channel_id"
        L_0x01bd:
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            s2.e$c r10 = new s2.e$c
            r10.<init>(r6, r15)
            r10.mo124390o(r0)
            long r12 = java.lang.System.currentTimeMillis()
            android.app.Notification r0 = r10.f258814z
            r0.when = r12
            r10.mo124383h(r3)
            r0 = 16
            r6 = 1
            r10.mo124384i(r0, r6)
            r10.mo124382g(r4)
            r10.f258795g = r8
            if (r5 != 0) goto L_0x01e3
        L_0x01e1:
            r0 = r5
            goto L_0x0247
        L_0x01e3:
            int r0 = r41.getWidth()
            float r0 = (float) r0
            r6 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 * r6
            int r8 = r41.getHeight()
            float r8 = (float) r8
            float r0 = r0 / r8
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x01f8
            r15 = 1
            goto L_0x01f9
        L_0x01f8:
            r15 = 0
        L_0x01f9:
            if (r15 == 0) goto L_0x01fc
            goto L_0x01e1
        L_0x01fc:
            int r0 = r41.getWidth()
            int r6 = r41.getHeight()
            int r0 = java.lang.Math.max(r0, r6)
            int r6 = r41.getHeight()
            int r8 = r41.getWidth()
            r12 = 1073741824(0x40000000, float:2.0)
            r13 = 0
            if (r6 <= r8) goto L_0x0221
            int r6 = r41.getHeight()
            int r8 = r41.getWidth()
            int r6 = r6 - r8
            float r6 = (float) r6
            float r6 = r6 / r12
            goto L_0x0222
        L_0x0221:
            r6 = 0
        L_0x0222:
            int r8 = r41.getHeight()
            int r15 = r41.getWidth()
            if (r8 >= r15) goto L_0x0238
            int r8 = r41.getWidth()
            int r13 = r41.getHeight()
            int r8 = r8 - r13
            float r8 = (float) r8
            float r13 = r8 / r12
        L_0x0238:
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r0, r8)
            android.graphics.Canvas r8 = new android.graphics.Canvas
            r8.<init>(r0)
            r12 = 0
            r8.drawBitmap(r5, r6, r13, r12)
        L_0x0247:
            r10.mo124385j(r0)
            r8 = 2
            r12 = 0
            r10.mo124384i(r8, r12)
            r0 = 2131233736(0x7f080bc8, float:1.8083618E38)
            android.app.Notification r6 = r10.f258814z
            r6.icon = r0
            android.app.Notification r0 = r10.mo124378b()
            java.lang.String r6 = "getNotificationBuilder(M…s())\n            .build()"
            gy3.C87412m.m108593f(r0, r6)
            r15 = 4
            long r15 = r46 & r15
            r17 = 0
            int r6 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r6 == 0) goto L_0x026b
            r15 = 1
            goto L_0x026c
        L_0x026b:
            r15 = 0
        L_0x026c:
            r19 = 64
            long r19 = r46 & r19
            int r6 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r6 == 0) goto L_0x0276
            r6 = 1
            goto L_0x0277
        L_0x0276:
            r6 = 0
        L_0x0277:
            com.tencent.mm.app.AppForegroundDelegate r10 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE
            boolean r10 = r10.f343454n
            ue1.r$d r13 = new ue1.r$d
            r13.<init>(r7)
            r16 = 7
            r17 = 6
            r18 = 5
            r19 = 4
            if (r1 == 0) goto L_0x0315
            java.util.concurrent.ConcurrentHashMap r1 = r29.mo89434l()
            java.lang.Object r1 = r1.get(r9)
            ue1.r$d r1 = (ue1.C65328r.C37443d) r1
            if (r1 == 0) goto L_0x03ea
            boolean r1 = r1.f98958b
            if (r1 == 0) goto L_0x02bd
            r10 = 1
            r13.f98958b = r10
            r14 = 1
            r0 = r29
            r1 = r11
            r2 = r7
            r3 = r39
            r4 = r40
            r5 = r41
            r6 = r42
            r7 = r43
            r15 = 1
            r20 = 2
            r8 = r49
            r11 = r9
            r9 = r50
            r10 = r34
            r12 = r11
            r11 = r14
            r0.mo89443u(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = 0
            goto L_0x02d8
        L_0x02bd:
            r12 = r9
            r15 = 1
            r20 = 2
            r1 = 0
            r13.f98958b = r1
            di3.d r2 = di3.C86312j.m106911c(r2)
            bd2.d r2 = (bd2.C79690d) r2
            eb0.u2 r2 = r2.mo109806kA()
            if (r2 == 0) goto L_0x02d8
            com.tencent.mm.booter.notification.MMNotification r2 = (com.tencent.p014mm.booter.notification.MMNotification) r2
            r2.mo93213j(r0)
            r2.mo93215l(r7, r0, r1)
        L_0x02d8:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 8
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r15] = r1
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2[r20] = r1
            java.lang.String r1 = ""
            r2[r28] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r52)
            r2[r19] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r53)
            r2[r18] = r1
            r2[r17] = r55
            r2[r16] = r56
            r1 = 23498(0x5bca, float:3.2928E-41)
            r0.mo160131h(r1, r2)
            java.util.concurrent.ConcurrentHashMap r0 = r29.mo89434l()
            r0.put(r12, r13)
            r29.mo89445w()
            goto L_0x03ea
        L_0x0315:
            r12 = r9
            r9 = 1
            r20 = 2
            if (r10 == 0) goto L_0x033a
            if (r15 == 0) goto L_0x033a
            r13.f98958b = r9
            r14 = 0
            r0 = r29
            r1 = r11
            r2 = r7
            r3 = r39
            r4 = r40
            r5 = r41
            r6 = r42
            r7 = r43
            r8 = r49
            r15 = 1
            r9 = r50
            r10 = r34
            r11 = r14
            r0.mo89443u(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0373
        L_0x033a:
            r15 = 1
            if (r10 != 0) goto L_0x0357
            if (r6 == 0) goto L_0x0357
            r1 = 0
            r13.f98958b = r1
            di3.d r2 = di3.C86312j.m106911c(r2)
            bd2.d r2 = (bd2.C79690d) r2
            eb0.u2 r2 = r2.mo109806kA()
            if (r2 == 0) goto L_0x0373
            com.tencent.mm.booter.notification.MMNotification r2 = (com.tencent.p014mm.booter.notification.MMNotification) r2
            r2.mo93213j(r0)
            r2.mo93215l(r7, r0, r1)
            goto L_0x0373
        L_0x0357:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "isAppForeground="
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = " isEnableInOutApp="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
        L_0x0373:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "client_trigger_scene"
            r2 = r51
            r0.put(r1, r2)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 8
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r12
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2[r15] = r4
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2[r20] = r3
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "json.toString()"
            gy3.C87412m.m108593f(r0, r3)
            java.lang.String r3 = ","
            java.lang.String r4 = ";"
            r5 = 0
            java.lang.String r0 = z04.C112551y.m153814n(r0, r3, r4, r5)
            r2[r28] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r52)
            r2[r19] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r53)
            r2[r18] = r0
            r2[r17] = r55
            r2[r16] = r56
            r0 = 23498(0x5bca, float:3.2928E-41)
            r1.mo160131h(r0, r2)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_APP_PUSH_SHOW_COUNT_INT
            r2 = 0
            int r0 = r0.mo119689j(r1, r2)
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            int r0 = r0 + r15
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.mo119677K(r1, r0)
            java.util.concurrent.ConcurrentHashMap r0 = r29.mo89434l()
            r0.put(r12, r13)
            r29.mo89445w()
        L_0x03ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ue1.C65328r.mo89436n(java.lang.String, java.lang.String, long, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.graphics.Bitmap, boolean, boolean, long, long, int, int, int, java.lang.String, int, int, boolean, java.lang.String, java.lang.String, com.tencent.mm.protocal.protobuf.FinderJumpInfo):void");
    }

    /* renamed from: o */
    public final void mo89437o(C37442c cVar) {
        this.f188015e.add(cVar);
        Map<String, String> map = cVar.f98954b;
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : map.entrySet()) {
            try {
                jSONObject.put((String) next.getKey(), next.getValue());
            } catch (Exception unused) {
            }
        }
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "json.toString()");
        String str = cVar.f98954b.get(".sysmsg.content.task_id");
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        C37558x0 x0Var = new C37558x0();
        x0Var.field_localId = str;
        String str3 = cVar.f98953a;
        if (str3 != null) {
            str2 = str3;
        }
        x0Var.field_subType = str2;
        x0Var.field_valuesJSON = jSONObject2;
        x0Var.field_pendingReason = cVar.f98956d;
        x0Var.field_createTime = C31543z5.m39453c();
        x0Var.field_type = 1;
        boolean insert = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Lx0().insert(x0Var);
        Log.m105924i("Finder.NewXmlDataLogic", "insertNewXmlData data: " + x0Var + ", success: " + insert);
    }

    /* renamed from: p */
    public final boolean mo89438p() {
        return (C75592q0.m90781k() & 2305843009213693952L) == 0;
    }

    /* renamed from: q */
    public final boolean mo89439q() {
        return (C75592q0.m90781k() & 34359738368L) != 0;
    }

    /* renamed from: r */
    public final boolean mo89440r() {
        return (C75592q0.m90781k() & 9007199254740992L) != 0;
    }

    /* renamed from: s */
    public final boolean mo89441s() {
        return (C75592q0.m90781k() & 70368744177664L) != 0;
    }

    /* renamed from: t */
    public final boolean mo89442t() {
        return C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_FINDER_APP_PUSH_SETTING_SHOW_BOOLEAN, false);
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [ev1.a] */
    /* JADX WARNING: type inference failed for: r15v2, types: [ue1.a0] */
    /* JADX WARNING: type inference failed for: r7v4, types: [ue1.z] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89443u(android.content.Intent r27, int r28, java.lang.String r29, java.lang.String r30, android.graphics.Bitmap r31, boolean r32, boolean r33, int r34, int r35, int r36, boolean r37) {
        /*
            r26 = this;
            r0 = r28
            r1 = r35
            java.lang.Class<sr.i> r2 = p687sr.C64159i.class
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r5 = "notification-"
            r6 = 2
            r7 = r36
            if (r7 != r6) goto L_0x0036
            ue1.z r6 = new ue1.z
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r0)
            java.lang.String r8 = r7.toString()
            long r0 = (long) r1
            long r13 = r0 * r3
            r7 = r6
            r9 = r29
            r10 = r30
            r11 = r31
            r12 = r34
            r15 = r32
            r16 = r33
            r17 = r27
            r7.<init>(r8, r9, r10, r11, r12, r13, r15, r16, r17)
            goto L_0x005c
        L_0x0036:
            ue1.a0 r6 = new ue1.a0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r0)
            java.lang.String r16 = r7.toString()
            long r0 = (long) r1
            long r21 = r0 * r3
            r15 = r6
            r17 = r29
            r18 = r30
            r19 = r31
            r20 = r34
            r23 = r32
            r24 = r33
            r25 = r27
            r15.<init>(r16, r17, r18, r19, r20, r21, r23, r24, r25)
        L_0x005c:
            if (r37 == 0) goto L_0x006c
            di3.d r0 = di3.C86312j.m106911c(r2)
            sr.i r0 = (p687sr.C64159i) r0
            sr.h r0 = r0.sq0()
            r0.mo84687c(r6)
            goto L_0x0086
        L_0x006c:
            di3.d r0 = di3.C86312j.m106911c(r2)
            sr.i r0 = (p687sr.C64159i) r0
            sr.h r0 = r0.sq0()
            r0.mo84689e(r6)
            di3.d r0 = di3.C86312j.m106911c(r2)
            sr.i r0 = (p687sr.C64159i) r0
            sr.h r0 = r0.sq0()
            r0.show()
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ue1.C65328r.mo89443u(android.content.Intent, int, java.lang.String, java.lang.String, android.graphics.Bitmap, boolean, boolean, int, int, int, boolean):void");
    }

    /* renamed from: v */
    public final C37442c mo89444v(C37558x0 x0Var) {
        HashMap hashMap;
        String str = x0Var.field_subType;
        boolean z = true;
        if (str.length() == 0) {
            str = null;
        }
        String str2 = x0Var.field_valuesJSON;
        C87412m.m108593f(str2, "data.field_valuesJSON");
        if (str2.length() != 0) {
            z = false;
        }
        if (z) {
            hashMap = new LinkedHashMap();
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                C87412m.m108593f(keys, "jsonObj.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    C87412m.m108593f(next, LocaleUtil.ITALIAN);
                    hashMap.put(next, jSONObject.get(next).toString());
                }
            } catch (Exception unused) {
                hashMap = new LinkedHashMap();
            }
        }
        return new C37442c(str, hashMap, (C35136m.C35137a) null, x0Var.field_pendingReason);
    }

    /* renamed from: w */
    public final void mo89445w() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : mo89434l().entrySet()) {
            sb.append((String) next.getKey());
            sb.append("=");
            sb.append(((C37443d) next.getValue()).f98957a);
            sb.append("@");
            sb.append(((C37443d) next.getValue()).f98958b ? 1 : 0);
            sb.append(";");
        }
        this.f188013c.putString("HITORY_NOTIFICATION_RECORD", sb.toString());
        Log.m105924i("Finder.GlobalPushNewXmlConsumer", "[updateHistoryNotificationListRecord] " + sb);
    }
}
