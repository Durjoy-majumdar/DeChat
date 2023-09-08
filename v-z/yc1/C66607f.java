package yc1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import ad1.C54028b;
import ad1.C54029c;
import android.os.SystemClock;
import bd1.C39759i;
import bd1.C54446b;
import cm1.C28617v1;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2469j;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import di3.C86312j;
import eb0.C75604z3;
import eb0.z3$$g;
import f40.C86709a0;
import f62.C75700k0;
import fe1.C58959b;
import fe1.C58961d;
import fy3.C32227p;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import lu3.C34379c;
import p749xh.C38697x3;
import p823sg.C101614i;
import q40.C12040d;
import rx3.C13598b0;
import te3.C49335eu3;
import te3.C51430tq0;
import tf0.C64916p1;
import ue1.C37429f0;
import ue1.C52528f;
import ue1.C65326e;
import up1.C52593j;
import up1.C52599l0;
import up1.C65416i;
import vp1.C14937o;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yn1.C16055a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112550d0;
import z04.C112551y;
import zc1.C66785b;
import zh3.C91753f;
import zt3.C119157j;

/* renamed from: yc1.f */
public final class C66607f implements C54028b, C114668z, C54029c {

    /* renamed from: d */
    public long f191527d;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.account.FinderAccountLogicHandler$doFinderInit$1", mo125469f = "FinderAccountLogicHandler.kt", mo125470l = {113}, mo125471m = "invokeSuspend")
    /* renamed from: yc1.f$a */
    public static final class C66608a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f191528d;

        /* renamed from: e */
        public /* synthetic */ Object f191529e;

        /* renamed from: f */
        public final /* synthetic */ String f191530f;

        /* renamed from: g */
        public final /* synthetic */ C66607f f191531g;

        /* renamed from: yc1.f$a$a */
        public static final class C66609a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C66607f f191532d;

            /* renamed from: e */
            public final /* synthetic */ int f191533e;

            public C66609a(C66607f fVar, int i) {
                this.f191532d = fVar;
                this.f191533e = i;
            }

            public final void run() {
                C66607f fVar = this.f191532d;
                fVar.mo90653e("computeDelaySecond=" + this.f191533e);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66608a(String str, C66607f fVar, C15601d<? super C66608a> dVar) {
            super(2, dVar);
            this.f191530f = str;
            this.f191531g = fVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C66608a aVar = new C66608a(this.f191530f, this.f191531g, dVar);
            aVar.f191529e = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C66608a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f191528d;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C66785b bVar = C66785b.f191882e;
                String str = this.f191530f;
                this.f191529e = (C0000n0) this.f191529e;
                this.f191528d = 1;
                obj2 = bVar.mo90666W0(str, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C0000n0 n0Var = (C0000n0) this.f191529e;
                ResultKt.throwOnFailure(obj);
                obj2 = ((Result) obj).m168123unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = this.f191530f;
            C66607f fVar = this.f191531g;
            Throwable r102 = Result.m168117exceptionOrNullimpl(obj2);
            if (r102 != null) {
                Log.m105920e("Finder.AccountLogicHandler", "[doFinderInit.onFailure] " + r102.getMessage() + " source=" + str2);
                if (r102 instanceof C12040d) {
                    C49335eu3 eu32 = ((C12040d) r102).f35060h;
                    C87412m.m108592e(eu32, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderInitResponse");
                    Integer num = new Integer(((C51430tq0) eu32).f142352v);
                    if (num.intValue() <= 0) {
                        z = false;
                    }
                    C34379c<?> cVar = null;
                    if (!z) {
                        num = null;
                    }
                    if (num != null) {
                        int intValue = num.intValue();
                        C119157j jVar = (C119157j) C119157j.f356862d;
                        jVar.getClass();
                        cVar = jVar.mo183886q(new C66609a(fVar, intValue), ((long) intValue) * 1000, (String) null);
                    }
                    if (cVar == null) {
                        Log.m105924i("Finder.AccountLogicHandler", "delay to next app foreground. ");
                        fVar.f191527d = 0;
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: yc1.f$b */
    public static final class C66610b implements z3$$g {

        /* renamed from: d */
        public final /* synthetic */ String f191534d;

        /* renamed from: e */
        public final /* synthetic */ C52528f f191535e;

        public C66610b(String str, C52528f fVar) {
            this.f191534d = str;
            this.f191535e = fVar;
        }

        /* renamed from: b */
        public boolean mo24603b() {
            return false;
        }

        /* renamed from: c */
        public void mo24604c() {
            Log.m105924i("Finder.AccountLogicHandler", "[deleteMyLocalAccountData] finderUsername=" + this.f191534d + " delete msg end... " + this.f191535e.f146722a1 + ' ' + this.f191535e.field_sessionId);
        }
    }

    /* renamed from: a */
    public void mo74690a(C54446b bVar, String str) {
        C87412m.m108594g(bVar, "account");
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
    }

    /* renamed from: b */
    public void mo2445b(String str, String str2) {
        C87412m.m108594g(str, "newDefaultUsername");
        C87412m.m108594g(str2, "rawDefaultUsername");
        C2469j jVar = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().f158526c;
        jVar.getClass();
        jVar.f12931c.removeMessages(4);
        jVar.f12931c.obtainMessage(4, str).sendToTarget();
    }

    /* renamed from: c */
    public void mo74691c(C54446b bVar, String str) {
        LinkedList<C37429f0> linkedList;
        C54446b N1;
        C54446b bVar2 = bVar;
        String str2 = str;
        Class cls = FinderCommonFeatureService.class;
        C87412m.m108594g(bVar2, "account");
        C87412m.m108594g(str2, FirebaseAnalytics.C113379b.SOURCE);
        C39759i iVar = C39759i.UPGRADE;
        if (C87412m.m108589b("FINDER_RE_INIT", str2)) {
            Log.m105924i("Finder.AccountLogicHandler", "[onDeleted] Source from reInit return");
            return;
        }
        String str3 = bVar2.field_username;
        C101614i<String, FinderProfileHeaderUIC.C3463b> iVar2 = FinderProfileHeaderUIC.f16192h1;
        FinderProfileHeaderUIC.f16192h1.remove(str3);
        C58961d.C58963b bVar3 = C58961d.f168673a;
        C87412m.m108593f(str3, "finderUsername");
        bVar3.getClass();
        String str4 = C58961d.f168674b;
        Log.m105919d(str4, "delete contact %s", str3);
        if (!Util.isNullOrNil(str3)) {
            C58959b a = bVar3.mo84154a();
            a.getClass();
            a.f168671a.remove(str3);
            ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69653F1(str3);
            String str5 = "DELETE FROM FinderContact WHERE username = " + C91753f.m115264e(str3);
            C65416i gW = ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76697gW();
            boolean execSQL = gW != null ? gW.execSQL("FinderContact", str5) : false;
            Log.m105919d(str4, "delete success %s", Boolean.valueOf(execSQL));
            if (execSQL && gW != null) {
                gW.doNotify("FinderContact", 5, gW);
            }
        }
        C14937o.C14938a aVar = C14937o.f40972a;
        C14937o.f40976e.mo13997a(1).f40955c.f144718d.clear();
        C28617v1 v1Var = new C28617v1();
        v1Var.field_username = str3;
        v1Var.field_type = 1;
        if (!((FinderCommonFeatureService) C86312j.m106911c(cls)).Gx0().insert(v1Var)) {
            Log.m105920e("Finder.AccountLogicHandler", "insert DeletingInfo failure. finderUsername=" + str3 + " source=" + str2);
            return;
        }
        C52599l0 Ox0 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).mo76736Au();
        C52593j Bx0 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).mo76776L4();
        if (!(str3.length() == 0) && (N1 = C66785b.f191882e.mo90661N1(str3, true)) != null) {
            linkedList = new LinkedList<>();
            long uptimeMillis = SystemClock.uptimeMillis();
            SingleTable singleTable = C38697x3.f104222r;
            LinkedList linkedList2 = new LinkedList();
            LinkedList linkedList3 = new LinkedList();
            LinkedList linkedList4 = new LinkedList();
            Column column = C38697x3.f104223s;
            String str6 = N1.field_finder_version_username_history;
            C87412m.m108593f(str6, "account.field_finder_version_username_history");
            SelectSql build = C38697x3.f104222r.select((List<? extends ISqlColumn>) linkedList2).where(column.inString(C112550d0.m153785U(str6, new String[]{";"}, false, 0, 6, (Object) null))).orderBy((List<? extends ISqlOrder>) linkedList3).groupBy((List<? extends Column>) linkedList4).build();
            C87412m.m108593f(build, "select()\n            .wh…\")))\n            .build()");
            List<C37429f0> multiQuery = build.multiQuery(Ox0.f146902d, C37429f0.class);
            if (true ^ multiQuery.isEmpty()) {
                linkedList.addAll(multiQuery);
            }
            String name = Thread.currentThread().getName();
            C87412m.m108593f(name, "currentThread().name");
            String sqlObj = build.toString();
            C87412m.m108594g(sqlObj, "sql");
            new C65326e("FinderSessionInfoStorage.getSessionInfoBySenderUserName", C112551y.m153815o(sqlObj, ',', ';', false, 4, (Object) null), SystemClock.uptimeMillis() - uptimeMillis, name, 0).mo89421a();
        } else {
            linkedList = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[deleteMyLocalAccountData] finderUsername=");
        sb.append(str3);
        sb.append(" sessionInfoList.size:");
        sb.append(linkedList != null ? Integer.valueOf(linkedList.size()) : null);
        Log.m105924i("Finder.AccountLogicHandler", sb.toString());
        if (linkedList != null) {
            for (C37429f0 f0Var : linkedList) {
                String str7 = f0Var.field_sessionId;
                C87412m.m108593f(str7, "finderSessionInfo.field_sessionId");
                C52528f fVar = Bx0.get(str7);
                boolean deleteNotify = Bx0.deleteNotify(fVar.systemRowid, false);
                Log.m105924i("Finder.AccountLogicHandler", "[deleteMyLocalAccountData] finderUsername=" + str3 + " delete conv begin[" + deleteNotify + "]... " + fVar.f146722a1 + ' ' + fVar.field_sessionId);
                if (deleteNotify) {
                    C75604z3.m90836h(fVar.field_sessionId, new C66610b(str3, fVar));
                }
                String str8 = fVar.field_sessionId;
                C87412m.m108593f(str8, "conv.field_sessionId");
                Ox0.mo73559jo(str8, false);
                Ox0.doNotify(fVar.field_sessionId, 6, fVar);
                Log.m105924i("Finder.AccountLogicHandler", "[deleteMyLocalAccountData] finderUsername=" + str3 + " delete conv end... " + fVar.f146722a1 + ' ' + fVar.field_sessionId);
            }
        }
        ((FinderCommonFeatureService) C86312j.m106911c(cls)).Gx0().delete(v1Var, "username");
    }

    /* renamed from: d */
    public void mo74692d(C54446b bVar, String str) {
        C87412m.m108594g(bVar, "account");
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
    }

    /* renamed from: e */
    public final void mo90653e(String str) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        Log.m105924i("Finder.AccountLogicHandler", "[doFinderInit] source=" + str + " lastFinderInitTime=" + this.f191527d);
        this.f191527d = System.currentTimeMillis();
        C53895h.m60466d(((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).f157785L, (C66212f) null, (C53934p0) null, new C66608a(str, this, (C15601d<? super C66608a>) null), 3, (Object) null);
    }

    public void onAppBackground(String str) {
    }

    public void onAppForeground(String str) {
        if (C16055a.f43185a.mo14671a() && System.currentTimeMillis() - this.f191527d >= 86400000) {
            mo90653e("onAppForeground");
        }
    }
}
