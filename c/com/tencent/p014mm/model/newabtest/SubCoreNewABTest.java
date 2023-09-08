package com.tencent.p014mm.model.newabtest;

import android.content.Context;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ActivateEvent;
import com.tencent.p014mm.model.newabtest.C92722a;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C30722b;
import com.tencent.p014mm.storage.C30728d;
import com.tencent.p014mm.storage.C96980c;
import di3.C86301e;
import di3.C86312j;
import eb0.C86497v5;
import ei3.C86522b;
import f40.C86709a0;
import java.util.Map;
import ob0.C35136m;
import qe3.C118184l;
import qe3.C118191s;
import qe3.C118193t;
import qe3.C118195u0;
import sf0.C48374j0;
import su0.C118308d;

@C86522b(onProcess = {C80625v0.MATCH_MM})
@Deprecated
/* renamed from: com.tencent.mm.model.newabtest.SubCoreNewABTest */
public class SubCoreNewABTest extends C86301e {

    /* renamed from: f */
    public static C86497v5.C86498c f79466f = new C28976a();

    /* renamed from: g */
    public static IListener<ActivateEvent> f79467g = new IListener<ActivateEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1435144905;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ab, code lost:
            if (r5 > 0) goto L_0x00ad;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean callback(com.tencent.p014mm.sdk.event.IEvent r13) {
            /*
                r12 = this;
                com.tencent.mm.autogen.events.ActivateEvent r13 = (com.tencent.p014mm.autogen.events.ActivateEvent) r13
                com.tencent.mm.autogen.events.ActivateEvent$a r13 = r13.f78706d
                boolean r13 = r13.f78707a
                r0 = 1
                if (r13 == 0) goto L_0x00c3
                boolean r13 = f40.C86709a0.m107522a()
                java.lang.String r1 = "MicroMsg.ABTestUpdater"
                if (r13 != 0) goto L_0x0018
                java.lang.String r13 = "Update aborted, Account not ready."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r13)
                goto L_0x00c3
            L_0x0018:
                f40.o r13 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r13 = r13.mo121142i()
                com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_ABTEST_LAST_UPDATE_TIME_LONG
                r3 = 0
                java.lang.Object r13 = r13.mo119685f(r2, r3)
                java.lang.Long r13 = (java.lang.Long) r13
                r4 = 0
                if (r13 != 0) goto L_0x002f
                r6 = r4
                goto L_0x0033
            L_0x002f:
                long r6 = r13.longValue()
            L_0x0033:
                r13 = 86400(0x15180, float:1.21072E-40)
                r2 = 0
                int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r8 != 0) goto L_0x005b
                java.util.Random r3 = new java.util.Random
                r3.<init>()
                int r13 = r3.nextInt(r13)
                com.tencent.p014mm.model.newabtest.C28980b.m38520b(r13)
                com.tencent.p014mm.model.newabtest.C28980b.m38521c()
                com.tencent.p014mm.model.newabtest.C28980b.m38519a()
                java.lang.Object[] r3 = new java.lang.Object[r0]
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r3[r2] = r13
                java.lang.String r13 = "First update ignored. Next update: %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r13, r3)
                goto L_0x00ad
            L_0x005b:
                f40.o r4 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r4 = r4.mo121142i()
                com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_ABTEST_UPDATE_TIME_INTERVAL_INT
                java.lang.Object r3 = r4.mo119685f(r5, r3)
                java.lang.Integer r3 = (java.lang.Integer) r3
                if (r3 == 0) goto L_0x0078
                int r4 = r3.intValue()
                if (r4 != 0) goto L_0x0074
                goto L_0x0078
            L_0x0074:
                int r13 = r3.intValue()
            L_0x0078:
                long r3 = (long) r13
                long r8 = java.lang.System.currentTimeMillis()
                r10 = 1000(0x3e8, double:4.94E-321)
                long r8 = r8 / r10
                r13 = 4
                java.lang.Object[] r13 = new java.lang.Object[r13]
                long r10 = r6 + r3
                int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r5 <= 0) goto L_0x008b
                r10 = 1
                goto L_0x008c
            L_0x008b:
                r10 = 0
            L_0x008c:
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
                r13[r2] = r10
                java.lang.Long r6 = java.lang.Long.valueOf(r6)
                r13[r0] = r6
                r6 = 2
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r13[r6] = r3
                r3 = 3
                java.lang.Long r4 = java.lang.Long.valueOf(r8)
                r13[r3] = r4
                java.lang.String r3 = "Need Update: %b, Last Update Time: %d, Update Interval: %d, Current Time: %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r13)
                if (r5 <= 0) goto L_0x00ae
            L_0x00ad:
                r2 = 1
            L_0x00ae:
                if (r2 != 0) goto L_0x00b6
                java.lang.String r13 = "No need to update"
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r1, r13)
                goto L_0x00c3
            L_0x00b6:
                boolean r13 = com.tencent.p014mm.model.newabtest.C28980b.f79474a
                if (r13 == 0) goto L_0x00c0
                java.lang.String r13 = "Updating"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r13)
                goto L_0x00c3
            L_0x00c0:
                com.tencent.p014mm.model.newabtest.C28980b.m38522d()
            L_0x00c3:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.model.newabtest.SubCoreNewABTest.C289752.callback(com.tencent.mm.sdk.event.IEvent):boolean");
        }
    };

    /* renamed from: h */
    public static MStorage.IOnStorageChange f79468h = new C28977b();

    /* renamed from: i */
    public static final C118308d f79469i = new C28978c();

    /* renamed from: d */
    public C30728d f79470d;

    /* renamed from: e */
    public C30722b f79471e;

    /* renamed from: com.tencent.mm.model.newabtest.SubCoreNewABTest$a */
    public class C28976a implements C86497v5.C86498c {
        /* renamed from: C1 */
        public void mo23909C1(C35136m.C35138c cVar) {
        }

        /* renamed from: Y */
        public void mo23910Y(C35136m.C35137a aVar) {
            String g = C48374j0.m53718g(aVar.f94242a.f227631h);
            Log.m105918d("MicroMsg.SubCoreNewABTest", "Message content(abtest): %s" + g);
            C92722a.C28979a c = C92722a.m116886c(g);
            if (c != null) {
                SubCoreNewABTest.wx0().mo57625qq(c.f79472a, 1);
                SubCoreNewABTest.vx0().mo57618Lo(c.f79473b, 2);
            }
        }
    }

    /* renamed from: com.tencent.mm.model.newabtest.SubCoreNewABTest$b */
    public class C28977b implements MStorage.IOnStorageChange {
        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            if (str != null && str.length() > 0 && "event_updated".equals(str)) {
                C96980c Lo = SubCoreNewABTest.wx0().mo57622Lo("100205");
                if (Lo.isValid()) {
                    Map<String, String> l2 = Lo.mo135598l2();
                    int i = Util.getInt(l2.get("main_thread_watch_enable"), 65535);
                    int i2 = Util.getInt(l2.get("main_thread_watch_timeout"), 5000);
                    int i3 = Util.getInt(l2.get("main_thread_watch_log_loop"), 0);
                    int i4 = Util.getInt(l2.get("main_thread_watch_report"), 0);
                    MMApplicationContext.getContext().getSharedPreferences("system_config_prefs", 4).edit().putInt("main_thread_watch_enable", i).putInt("main_thread_watch_timeout", i2).putInt("main_thread_watch_log_loop", i3).putInt("main_thread_watch_report", i4).commit();
                    Log.m105925i("MicroMsg.SubCoreNewABTest", "summeranr MM_MAIN_THREAD_WATCH enable[%d] timeout[%d], loop[%d] report[%d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
                }
                SubCoreNewABTest.xx0().getClass();
                C96980c Lo2 = SubCoreNewABTest.wx0().mo57622Lo("100229");
                if (Lo2.isValid()) {
                    Map<String, String> l25 = Lo2.mo135598l2();
                    int i5 = Util.getInt(l25.get("UseSvrTime"), 0);
                    int i6 = Util.getInt(l25.get("MinDiffTime"), 0);
                    MMApplicationContext.getContext().getSharedPreferences("system_config_prefs", 4).edit().putInt("client_server_diff_time_enable", i5).putInt("client_server_diff_time_interval", i6).commit();
                    Log.m105925i("MicroMsg.SubCoreNewABTest", "[oneliang] client server diff time enable[%d] diffTime[%d]", Integer.valueOf(i5), Integer.valueOf(i6));
                    return;
                }
                MMApplicationContext.getContext().getSharedPreferences("system_config_prefs", 4).edit().remove("client_server_diff_time_enable").remove("client_server_diff_time_interval").commit();
                Log.m105924i("MicroMsg.SubCoreNewABTest", "[oneliang] client server diff time abtest is not valid, then delete data");
            }
        }
    }

    /* renamed from: com.tencent.mm.model.newabtest.SubCoreNewABTest$c */
    public class C28978c implements C118308d {
        public void onAuthResponse(C118191s sVar, C118193t tVar, boolean z) {
            if (z) {
                if (sVar != null && (sVar instanceof C118184l) && sVar.getSceneStatus() == 12) {
                    C28980b.m38523e();
                }
            } else if (sVar != null && sVar.getSceneStatus() == 16) {
                C28980b.m38523e();
            }
        }

        public void onRegResponse(C118195u0 u0Var, String str, int i, String str2, String str3, int i2) {
        }
    }

    public static C30722b vx0() {
        C86709a0.m107523b().mo121108c();
        if (xx0().f79471e == null) {
            xx0().f79471e = new C30722b(C86709a0.m107535s().f251811i);
        }
        return xx0().f79471e;
    }

    public static C30728d wx0() {
        C86709a0.m107523b().mo121108c();
        if (xx0().f79470d == null) {
            xx0().f79470d = new C30728d(C86709a0.m107535s().f251811i);
        }
        return xx0().f79470d;
    }

    public static synchronized SubCoreNewABTest xx0() {
        SubCoreNewABTest subCoreNewABTest;
        Class cls = SubCoreNewABTest.class;
        synchronized (cls) {
            subCoreNewABTest = (SubCoreNewABTest) C86312j.m106911c(cls);
        }
        return subCoreNewABTest;
    }

    public void onAccountInitialized(Context context) {
    }

    public void onAccountReleased(Context context) {
    }
}
