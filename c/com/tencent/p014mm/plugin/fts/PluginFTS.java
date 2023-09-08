package com.tencent.p014mm.plugin.fts;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.SparseArray;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ActivateEvent;
import com.tencent.p014mm.autogen.events.CheckLanguageChangeEvent;
import com.tencent.p014mm.autogen.events.UpdateLanguageEvent;
import com.tencent.p014mm.plugin.fts.C93836i;
import com.tencent.p014mm.plugin.fts.jni.FTSJNIUtils;
import com.tencent.p014mm.plugin.fts.logic.C93910b;
import com.tencent.p014mm.plugin.fts.logic.C93918e;
import com.tencent.p014mm.plugin.fts.logic.C93924g;
import com.tencent.p014mm.plugin.fts.logic.C93933j;
import com.tencent.p014mm.plugin.fts.logic.FTS5SearchContactLogic;
import com.tencent.p014mm.plugin.fts.logic.FTS5SearchFeatureLogic;
import com.tencent.p014mm.plugin.fts.logic.FTS5SearchMessageLogic;
import com.tencent.p014mm.plugin.fts.logic.FTS5SearchServiceNotifyLogic;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.wcdb.DatabaseErrorHandler;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.xweb.IXWebBroadcastListener;
import di3.C86301e;
import di3.C86312j;
import eb0.C86482a6;
import ei3.C86522b;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kj2.C117407d;
import kv1.C61172m;
import kv1.C76636p;
import kv1.C99249c;
import kv1.C99251g;
import kv1.C99252h;
import kv1.C99255j;
import kv1.C99257k;
import kv1.C99258l;
import kv1.C99259n;
import kv1.C99260q;
import lv1.C76728k;
import lv1.C99664b;
import lv1.C99681n;
import mv1.C100005b;
import mv1.C100006c;
import ob0.C11385n;
import ob0.C117747y;
import ov1.C100558d;
import ov1.C100559e;
import ov1.C100560g;
import ov1.C21891f;
import p151er.C97691o;
import p261wl.C38166b;
import p261wl.C38174i;
import p754xr.C38816d;
import pv1.C100969c;
import pv1.C100970d;
import rv1.C101466a;
import rv1.C101467b;
import rv1.C101468c;
import rv1.C101470d;
import rv1.C101471e;
import rv1.C101472f;
import rv1.C101473g;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.fts.PluginFTS */
public class PluginFTS extends C86301e implements C99260q {

    /* renamed from: A */
    public static boolean f270757A;

    /* renamed from: d */
    public final C93836i[] f270758d = {null};

    /* renamed from: e */
    public volatile C93834f f270759e;

    /* renamed from: f */
    public volatile boolean f270760f = false;

    /* renamed from: g */
    public volatile boolean f270761g = false;

    /* renamed from: h */
    public boolean f270762h = false;

    /* renamed from: i */
    public boolean f270763i = false;

    /* renamed from: j */
    public Runnable f270764j = new C93819a();

    /* renamed from: n */
    public DatabaseErrorHandler f270765n = new C93820b();

    /* renamed from: o */
    public C86482a6.C86483a f270766o = new C93821c();

    /* renamed from: p */
    public IListener f270767p;

    /* renamed from: q */
    public C11385n f270768q;

    /* renamed from: r */
    public IListener f270769r;

    /* renamed from: s */
    public BroadcastReceiver f270770s;

    /* renamed from: t */
    public ConcurrentHashMap<Integer, C99258l> f270771t;

    /* renamed from: u */
    public C68985g f270772u;

    /* renamed from: v */
    public SparseArray<C100559e> f270773v;

    /* renamed from: w */
    public final C100558d[] f270774w;

    /* renamed from: x */
    public SparseArray<C100969c> f270775x;

    /* renamed from: y */
    public final SparseArray<C99259n> f270776y;

    /* renamed from: z */
    public IListener f270777z;

    /* renamed from: com.tencent.mm.plugin.fts.PluginFTS$d */
    public class C30045d implements C11385n {
        public C30045d() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C86709a0.m107528h();
            if (Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(15, (Object) null)) != 0) {
                C86709a0.m107524d().mo123470p(138, PluginFTS.this.f270768q);
                PluginFTS.this.f270760f = true;
                Log.m105924i("MicroMsg.FTS.PluginFTS", "*** User has finished initializing.");
                PluginFTS.this.Cx0();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.PluginFTS$e */
    public class C30046e extends BroadcastReceiver {
        public C30046e() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null) {
                Log.m105924i("MicroMsg.FTS.PluginFTS", "*** Charging notified: " + intent.getAction());
                if (intent.getAction().equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    PluginFTS.this.f270762h = true;
                } else if (intent.getAction().equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    PluginFTS.this.f270762h = false;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.PluginFTS$a */
    public class C93819a implements Runnable {
        public C93819a() {
        }

        public void run() {
            if (PluginFTS.this.f270759e != null) {
                PluginFTS.this.f270759e.mo128799p();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.PluginFTS$b */
    public class C93820b implements DatabaseErrorHandler {
        public C93820b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0099, code lost:
            r7 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x009a, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.FTS.PluginFTS", r7, "onCorruption handle error", new java.lang.Object[0]);
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onCorruption(com.tencent.wcdb.database.SQLiteDatabase r7) {
            /*
                r6 = this;
                r7 = 18
                kv1.C99252h.m129300e(r7)
                f40.C86709a0.m107528h()
                f40.o r7 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r7 = r7.mo121142i()
                com.tencent.mm.storage.y1$a r0 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FTS_MASTER_DB_CORRUPT_REBUILD_TIME_INT_SYNC
                r1 = 5
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Object r7 = r7.mo119685f(r0, r1)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
                java.lang.String r1 = "MicroMsg.FTS.PluginFTS"
                java.lang.String r2 = "DB onCorrupt dbCorruptRebuildTimes: %d"
                r3 = 1
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
                r5 = 0
                r3[r5] = r4
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r3)
                if (r7 <= 0) goto L_0x00ac
                int r7 = r7 + -1
                f40.C86709a0.m107528h()
                f40.o r1 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r1 = r1.mo121142i()
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r1.mo119677K(r0, r7)
                com.tencent.mm.plugin.fts.PluginFTS r7 = com.tencent.p014mm.plugin.fts.PluginFTS.this     // Catch:{ Exception -> 0x0099 }
                r7.zx0()     // Catch:{ Exception -> 0x0099 }
                com.tencent.mm.plugin.fts.PluginFTS r7 = com.tencent.p014mm.plugin.fts.PluginFTS.this     // Catch:{ Exception -> 0x0099 }
                r7.Ax0()     // Catch:{ Exception -> 0x0099 }
                com.tencent.mm.plugin.fts.PluginFTS r7 = com.tencent.p014mm.plugin.fts.PluginFTS.this     // Catch:{ Exception -> 0x0099 }
                com.tencent.mm.plugin.fts.f r7 = r7.f270759e     // Catch:{ Exception -> 0x0099 }
                r0 = 0
                if (r7 == 0) goto L_0x0064
                com.tencent.mm.plugin.fts.PluginFTS r7 = com.tencent.p014mm.plugin.fts.PluginFTS.this     // Catch:{ Exception -> 0x0099 }
                com.tencent.mm.plugin.fts.f r7 = r7.f270759e     // Catch:{ Exception -> 0x0099 }
                r7.mo128787c()     // Catch:{ Exception -> 0x0099 }
                com.tencent.mm.plugin.fts.PluginFTS r7 = com.tencent.p014mm.plugin.fts.PluginFTS.this     // Catch:{ Exception -> 0x0099 }
                r7.f270759e = r0     // Catch:{ Exception -> 0x0099 }
            L_0x0064:
                com.tencent.p014mm.plugin.fts.C93834f.m118507f()     // Catch:{ Exception -> 0x0099 }
                com.tencent.mm.plugin.fts.PluginFTS r7 = com.tencent.p014mm.plugin.fts.PluginFTS.this     // Catch:{ Exception -> 0x0099 }
                kv1.p r7 = r7.mo128743Jd()     // Catch:{ Exception -> 0x0099 }
                com.tencent.mm.plugin.fts.i r7 = (com.tencent.p014mm.plugin.fts.C93836i) r7     // Catch:{ Exception -> 0x0099 }
                monitor-enter(r7)     // Catch:{ Exception -> 0x0099 }
                com.tencent.mm.plugin.fts.i$a r1 = r7.f270824a     // Catch:{ all -> 0x0096 }
                if (r1 != 0) goto L_0x0076
                monitor-exit(r7)     // Catch:{ Exception -> 0x0099 }
                goto L_0x007c
            L_0x0076:
                java.util.concurrent.PriorityBlockingQueue<lv1.b> r1 = r1.f270827f     // Catch:{ all -> 0x0096 }
                r1.clear()     // Catch:{ all -> 0x0096 }
                monitor-exit(r7)     // Catch:{ Exception -> 0x0099 }
            L_0x007c:
                r1 = -131072(0xfffffffffffe0000, float:NaN)
                com.tencent.mm.plugin.fts.PluginFTS$g r2 = new com.tencent.mm.plugin.fts.PluginFTS$g     // Catch:{ Exception -> 0x0099 }
                com.tencent.mm.plugin.fts.PluginFTS r3 = com.tencent.p014mm.plugin.fts.PluginFTS.this     // Catch:{ Exception -> 0x0099 }
                r2.<init>()     // Catch:{ Exception -> 0x0099 }
                r7.mo128803c(r1, r2)     // Catch:{ Exception -> 0x0099 }
                r1 = -131071(0xfffffffffffe0001, float:NaN)
                com.tencent.mm.plugin.fts.PluginFTS$f r2 = new com.tencent.mm.plugin.fts.PluginFTS$f     // Catch:{ Exception -> 0x0099 }
                com.tencent.mm.plugin.fts.PluginFTS r3 = com.tencent.p014mm.plugin.fts.PluginFTS.this     // Catch:{ Exception -> 0x0099 }
                r2.<init>(r0)     // Catch:{ Exception -> 0x0099 }
                r7.mo128803c(r1, r2)     // Catch:{ Exception -> 0x0099 }
                goto L_0x00a4
            L_0x0096:
                r0 = move-exception
                monitor-exit(r7)     // Catch:{ Exception -> 0x0099 }
                throw r0     // Catch:{ Exception -> 0x0099 }
            L_0x0099:
                r7 = move-exception
                java.lang.String r0 = "MicroMsg.FTS.PluginFTS"
                java.lang.String r1 = "onCorruption handle error"
                java.lang.Object[] r2 = new java.lang.Object[r5]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r7, r1, r2)
            L_0x00a4:
                com.tencent.mm.plugin.fts.h r7 = new com.tencent.mm.plugin.fts.h
                java.lang.String r0 = "Throw FTSStopTaskException From FTSDatabaseErrorHandler"
                r7.<init>(r0)
                throw r7
            L_0x00ac:
                r7 = 23
                kv1.C99252h.m129300e(r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fts.PluginFTS.C93820b.onCorruption(com.tencent.wcdb.database.SQLiteDatabase):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.PluginFTS$c */
    public class C93821c implements C86482a6.C86483a {
        public C93821c() {
        }

        /* renamed from: a */
        public boolean mo120943a() {
            Log.m105929w("MicroMsg.FTS.PluginFTS", "HERE UninitForUEH is called! stg:%s ", PluginFTS.this.f270759e);
            PluginFTS.f270757A = true;
            if (PluginFTS.this.f270759e != null) {
                PluginFTS.this.f270759e.mo128799p();
                PluginFTS.this.f270759e.mo128787c();
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.PluginFTS$f */
    public class C93822f extends C99664b {
        public C93822f(C93819a aVar) {
        }

        /* renamed from: b */
        public boolean mo57099b() {
            Uri.Builder builder;
            C86001b0 q;
            mo139040h(IXWebBroadcastListener.STAGE_START);
            char c = 0;
            try {
                for (String split : new String(C86013q1.m106433O("assets:///fts/fts_t2s.txt", 0, -1)).split("\n")) {
                    String[] split2 = split.split(",");
                    C99255j.f291048k.put(split2[0], split2[1]);
                }
            } catch (Exception e) {
                C99252h.m129300e(26);
                Log.printErrStackTrace("MicroMsg.FTS.PluginFTS", e, e.getMessage(), new Object[0]);
            }
            mo139040h("t2s");
            try {
                String[] split3 = new String(C86013q1.m106433O("assets:///fts/fts_py.txt", 0, -1)).split("\n");
                int i = 0;
                while (i < split3.length) {
                    String[] split4 = split3[i].split(",");
                    String str = split4[c];
                    int length = split4.length - 1;
                    String[] strArr = new String[length];
                    int i2 = 0;
                    while (i2 < length) {
                        int i3 = i2 + 1;
                        if (i3 < split4.length) {
                            strArr[i2] = split4[i3];
                        }
                        i2 = i3;
                    }
                    if (length > 0) {
                        for (int i4 = 0; i4 < length; i4++) {
                            String str2 = strArr[i4];
                            C100005b bVar = C99255j.f291047j;
                            if (bVar.f293001a.add(str2)) {
                                C100006c cVar = bVar.f293002b;
                                char[] charArray = str2.toLowerCase().toCharArray();
                                for (char c2 : charArray) {
                                    int i5 = c2 - 'a';
                                    C100006c[] cVarArr = cVar.f293003a;
                                    if (cVarArr[i5] == null) {
                                        cVarArr[i5] = new C100006c(c2);
                                    }
                                    cVar = cVarArr[i5];
                                }
                                cVar.f293004b = true;
                            }
                        }
                        C99255j.f291049l.put(str, strArr);
                    }
                    i++;
                    c = 0;
                }
            } catch (Exception e2) {
                C99252h.m129300e(27);
                Log.printErrStackTrace("MicroMsg.FTS.PluginFTS", e2, e2.getMessage(), new Object[0]);
            }
            mo139040h("py");
            C99252h.C99253a aVar = C99252h.f291029b;
            C86709a0.m107528h();
            String str3 = C86709a0.m107535s().f251807e;
            Uri n = str3 == null ? null : C116299g2.m163858n(str3);
            if (n == null) {
                builder = new Uri.Builder().path("FTS5IndexMicroMsg_encrypt.db");
            } else {
                builder = n.buildUpon();
                builder.appendPath("FTS5IndexMicroMsg_encrypt.db");
            }
            Uri build = builder.build();
            String path = build.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!build.getPath().equals(k)) {
                    build = builder.path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(build, (C116281f0.C116288h) null);
            aVar.f291033a = ((l.mo177810a() && (q = l.f348991a.mo119945q(l.f348992b)) != null) ? q.f250473c : 0) / 1048576;
            aVar.f291034b = PluginFTS.this.f270759e.mo128794k(-301, 0);
            aVar.f291035c = PluginFTS.this.f270759e.mo128794k(-302, 0);
            aVar.f291037e = PluginFTS.this.f270759e.mo128794k(-303, 0);
            aVar.f291036d = PluginFTS.this.f270759e.mo128794k(-304, 0);
            long k2 = PluginFTS.this.f270759e.mo128794k(-300, 0);
            long currentTimeMillis = System.currentTimeMillis();
            HashMap<String, String> hashMap = C99251g.f291026a;
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(k2);
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
            instance.set(14, 0);
            long timeInMillis = instance.getTimeInMillis();
            instance.setTimeInMillis(currentTimeMillis);
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
            instance.set(14, 0);
            if (!(timeInMillis == instance.getTimeInMillis())) {
                Log.m105925i("MicroMsg.FTS.FTSReportApiLogic", "reportIDKeyFTSData %d %d %d %d %d", Long.valueOf(aVar.f291033a), Long.valueOf(aVar.f291034b), Long.valueOf(aVar.f291035c), Long.valueOf(aVar.f291037e), Long.valueOf(aVar.f291036d));
                ArrayList arrayList = new ArrayList();
                C99252h.m129296a(arrayList, 729, 0, 1);
                if (aVar.f291033a > 1536) {
                    C99252h.m129296a(arrayList, 729, 1, 1);
                }
                if (aVar.f291034b >= 10000) {
                    C99252h.m129296a(arrayList, 729, 2, 1);
                }
                if (aVar.f291035c >= FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
                    C99252h.m129296a(arrayList, 729, 3, 1);
                }
                if (aVar.f291037e >= 10000) {
                    C99252h.m129296a(arrayList, 729, 4, 1);
                }
                if (aVar.f291036d >= TimeUtil.SECOND_TO_US) {
                    C99252h.m129296a(arrayList, 729, 5, 1);
                }
                C117407d.INSTANCE.mo160124a(arrayList, false);
                PluginFTS.this.f270759e.mo128800q(-300, currentTimeMillis);
            } else {
                Log.m105924i("MicroMsg.FTS.PluginFTS", "not need to report fts data");
            }
            mo139040h("reportData");
            Log.m105925i("MicroMsg.FTS.PluginFTS", "ftsDBSize: %s mainEnDBPath:%s", Util.getSizeMB(C86013q1.m106451l(C86709a0.m107535s().f251807e + "FTS5IndexMicroMsg_encrypt.db")), Util.getSizeMB(C86013q1.m106451l(C86709a0.m107535s().mo121140g())));
            return true;
        }

        /* renamed from: c */
        public String mo94944c() {
            return String.format("{T2S: %d PY: %d}", new Object[]{Integer.valueOf(C99255j.f291048k.size()), Integer.valueOf(C99255j.f291049l.size())});
        }

        public String getName() {
            return "InitResourceTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.PluginFTS$g */
    public class C93823g extends C99664b {
        public C93823g() {
        }

        /* renamed from: b */
        public boolean mo57099b() {
            C86709a0.m107528h();
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FTS_MASTER_DB_VERISON_INT_SYNC;
            if (2 != ((Integer) i.mo119685f(aVar, 0)).intValue()) {
                C93834f.m118507f();
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(aVar, 2);
            }
            C86709a0.m107528h();
            C86009m1 m1Var = new C86009m1(C86709a0.m107535s().f251807e, "IndexMicroMsg.db");
            if (m1Var.mo119967g()) {
                m1Var.mo119966f();
            } else {
                Log.m105925i("MicroMsg.FTS.PluginFTS", "not exist fts3DBFile %s", m1Var.mo119971i());
            }
            C86709a0.m107528h();
            C86009m1 m1Var2 = new C86009m1(C86709a0.m107535s().f251807e, "FTS5IndexMicroMsg.db");
            if (m1Var2.mo119967g()) {
                m1Var2.mo119966f();
            } else {
                Log.m105925i("MicroMsg.FTS.PluginFTS", "not exist fts5DBUnEncrypt %s", m1Var2.mo119971i());
            }
            C86709a0.m107528h();
            C86009m1 m1Var3 = new C86009m1(C86709a0.m107535s().f251807e, "FTS5IndexMicroMsg_encrypt.db");
            C86709a0.m107528h();
            C86009m1 m1Var4 = new C86009m1(C86709a0.m107535s().mo121140g());
            StringBuilder sb = new StringBuilder();
            C86709a0.m107528h();
            sb.append(C86709a0.m107535s().f251807e);
            sb.append("enFavorite.db");
            C86009m1 m1Var5 = new C86009m1(sb.toString());
            Log.m105925i("MicroMsg.FTS.PluginFTS", "ftsEncryptDB:%s mainEncryptDB:%s favEncryptDB:%s", Util.getSizeMB(m1Var3.mo119980r()), Util.getSizeMB(m1Var4.mo119980r()), Util.getSizeMB(m1Var5.mo119980r()));
            if (((double) m1Var3.mo119980r()) > 1.610612736E9d && m1Var3.mo119980r() > (m1Var4.mo119980r() + m1Var5.mo119980r()) * 2) {
                m1Var3.mo119966f();
                Log.m105924i("MicroMsg.FTS.PluginFTS", "try to delete old db and rebuild");
                C117407d.INSTANCE.idkeyStat(729, 14, 1, false);
            }
            try {
                PluginFTS pluginFTS = PluginFTS.this;
                C86709a0.m107528h();
                pluginFTS.f270759e = new C93834f(C86709a0.m107535s().f251807e);
                PluginFTS.vx0(PluginFTS.this);
                PluginFTS.wx0(PluginFTS.this);
                PluginFTS.xx0(PluginFTS.this);
                PluginFTS.yx0(PluginFTS.this);
                ((C38816d) C86312j.m106911c(C38816d.class)).mo61786hc();
                ((C97691o) C86312j.m106911c(C97691o.class)).mo136946SK();
            } catch (C93835h e) {
                throw e;
            } catch (Exception e2) {
                if (PluginFTS.f270757A) {
                    return true;
                }
                Log.printErrStackTrace("MicroMsg.FTS.PluginFTS", e2, "Index database corruption detected", new Object[0]);
                ((C93820b) PluginFTS.this.f270765n).onCorruption((SQLiteDatabase) null);
            }
            return true;
        }

        public String getName() {
            return "InitSearchTask";
        }
    }

    public PluginFTS() {
        C40008f fVar = C40008f.f107254d;
        this.f270767p = new IListener<ActivateEvent>(fVar) {
            {
                this.__eventId = -1435144905;
            }

            public boolean callback(IEvent iEvent) {
                ActivateEvent activateEvent = (ActivateEvent) iEvent;
                C93836i iVar = (C93836i) PluginFTS.this.mo128743Jd();
                boolean z = activateEvent.f78706d.f78707a;
                synchronized (iVar) {
                    C93836i.C93837a aVar = iVar.f270824a;
                    if (aVar != null) {
                        aVar.mo128805a(z);
                    }
                }
                PluginFTS.this.f270763i = !activateEvent.f78706d.f78707a;
                return false;
            }
        };
        this.f270768q = new C30045d();
        this.f270769r = new IListener<UpdateLanguageEvent>(fVar) {
            {
                this.__eventId = -1874260055;
            }

            public boolean callback(IEvent iEvent) {
                UpdateLanguageEvent updateLanguageEvent = (UpdateLanguageEvent) iEvent;
                ((C93836i) PluginFTS.this.mo128743Jd()).mo128803c(131072, new C93838j(this));
                return false;
            }
        };
        this.f270770s = new C30046e();
        this.f270771t = new ConcurrentHashMap<>();
        this.f270773v = new SparseArray<>();
        this.f270774w = new C100558d[]{null};
        this.f270775x = new SparseArray<>();
        this.f270776y = new SparseArray<>();
        this.f270777z = new IListener<CheckLanguageChangeEvent>(fVar) {
            {
                this.__eventId = -1187832230;
            }

            public boolean callback(IEvent iEvent) {
                CheckLanguageChangeEvent checkLanguageChangeEvent = (CheckLanguageChangeEvent) iEvent;
                PluginFTS pluginFTS = PluginFTS.this;
                ((C93836i) pluginFTS.mo128743Jd()).mo128803c(65536, new C93839k(pluginFTS));
                return false;
            }
        };
    }

    public static void vx0(PluginFTS pluginFTS) {
        pluginFTS.getClass();
        pluginFTS.mo128754df(new C101473g());
        pluginFTS.mo128754df(new C101467b());
        pluginFTS.mo128754df(new C101468c());
        pluginFTS.mo128754df(new C101470d());
        pluginFTS.mo128754df(new C101471e());
        pluginFTS.mo128754df(new C101466a());
        pluginFTS.mo128754df(new C101472f());
    }

    public static void wx0(PluginFTS pluginFTS) {
        pluginFTS.getClass();
        pluginFTS.zk0(1, new C93924g());
        pluginFTS.zk0(2, new FTS5SearchContactLogic());
        pluginFTS.zk0(3, new FTS5SearchMessageLogic());
        pluginFTS.zk0(4, new FTS5SearchFeatureLogic());
        pluginFTS.zk0(8, new C93918e());
        pluginFTS.zk0(11, new C93910b());
        pluginFTS.zk0(12, new FTS5SearchServiceNotifyLogic());
        pluginFTS.zk0(10000, new C93933j());
    }

    public static void xx0(PluginFTS pluginFTS) {
        Log.m105925i("MicroMsg.FTS.PluginFTS", "Create Index Storage %d", Integer.valueOf(pluginFTS.f270771t.size()));
        LinkedList linkedList = new LinkedList();
        for (C99258l add : pluginFTS.f270771t.values()) {
            linkedList.add(add);
        }
        Collections.sort(linkedList);
        for (int i = 0; i < linkedList.size(); i++) {
            ((C99258l) linkedList.get(i)).create();
        }
    }

    public static void yx0(PluginFTS pluginFTS) {
        pluginFTS.getClass();
        Log.m105924i("MicroMsg.FTS.PluginFTS", "Create Native Logic");
        for (int i = 0; i < pluginFTS.f270776y.size(); i++) {
            C99259n nVar = pluginFTS.f270776y.get(pluginFTS.f270776y.keyAt(i));
            if (nVar != null) {
                try {
                    nVar.create();
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.FTS.PluginFTS", "Create Native Logic name=%s \nexception=%s", nVar.getName(), Util.stackTraceToString(e));
                }
            }
        }
    }

    public final void Ax0() {
        Log.m105924i("MicroMsg.FTS.PluginFTS", "Destroy Index Storage");
        for (C99258l next : this.f270771t.values()) {
            if (next != null) {
                next.destroy();
            }
        }
    }

    public void Bj0(int i) {
        if (this.f270771t.containsKey(Integer.valueOf(i))) {
            C99258l lVar = this.f270771t.get(Integer.valueOf(i));
            try {
                lVar.destroy();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.FTS.PluginFTS", "Destroy Index Storage name=%s \nexception=%s", lVar.getName(), Util.stackTraceToString(e));
            }
        }
        this.f270771t.remove(Integer.valueOf(i));
    }

    public C93924g Bx0() {
        C93924g gVar;
        synchronized (this.f270776y) {
            gVar = (C93924g) this.f270776y.get(1);
        }
        return gVar;
    }

    public void Cx0() {
        C86709a0.m107528h();
        boolean z = true;
        this.f270760f = Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(15, (Object) null)) != 0;
        if (!this.f270760f) {
            C86709a0.m107524d().mo123455a(138, this.f270768q);
            Log.m105924i("MicroMsg.FTS.PluginFTS", "waitAndStartDaemon wait for account initialized");
        } else {
            Log.m105924i("MicroMsg.FTS.PluginFTS", "waitAndStartDaemon user is initialized.");
        }
        if (!this.f270761g) {
            Log.m105924i("MicroMsg.FTS.PluginFTS", "waitAndStartDaemon wait for all account post reset.");
        } else {
            Log.m105924i("MicroMsg.FTS.PluginFTS", "waitAndStartDaemon all account post reset.");
        }
        if (this.f270760f && this.f270761g) {
            C93836i iVar = (C93836i) mo128743Jd();
            synchronized (iVar) {
                C93836i.C93837a aVar = iVar.f270824a;
                if (aVar == null || !aVar.isAlive()) {
                    z = false;
                }
            }
            if (!z) {
                synchronized (iVar) {
                    iVar.f270824a.start();
                    Log.m105924i("MicroMsg.FTS.FTSTaskDaemon", "***** Search daemon started with TID: " + iVar.f270824a.getId());
                }
            }
        }
    }

    /* renamed from: JS */
    public C99257k mo128742JS() {
        return this.f270759e;
    }

    /* renamed from: Jd */
    public C76636p mo128743Jd() {
        C93836i[] iVarArr = this.f270758d;
        if (iVarArr[0] == null) {
            synchronized (iVarArr) {
                C93836i[] iVarArr2 = this.f270758d;
                if (iVarArr2[0] == null) {
                    iVarArr2[0] = new C93836i();
                    this.f270758d[0].mo128802b();
                    C93836i iVar = this.f270758d[0];
                    Runnable runnable = this.f270764j;
                    synchronized (iVar) {
                        C93836i.C93837a aVar = iVar.f270824a;
                        if (aVar != null) {
                            aVar.f270831j = runnable;
                        }
                    }
                }
            }
        }
        return this.f270758d[0];
    }

    public C21891f Ji0(int i, Context context, C21891f.C21893b bVar, int i2) {
        C100559e eVar = this.f270773v.get(i);
        if (eVar != null) {
            return eVar.mo33103xf(context, bVar, i2);
        }
        C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C100560g.class);
        C38166b.C38167a.C38169b bVar2 = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
        while (bVar2.hasNext()) {
            C38174i iVar = (C38174i) bVar2.next();
            if (iVar.hasKey(Integer.valueOf(i))) {
                return ((C100560g) iVar.get()).mo33103xf(context, bVar, i2);
            }
        }
        return null;
    }

    /* renamed from: Ry */
    public void mo128745Ry(int i) {
        try {
            this.f270773v.remove(i);
        } catch (Exception unused) {
        }
    }

    /* renamed from: Ta */
    public C100558d mo128746Ta() {
        C100558d[] dVarArr = this.f270774w;
        if (dVarArr[0] == null) {
            synchronized (dVarArr) {
                C100558d[] dVarArr2 = this.f270774w;
                if (dVarArr2[0] == null) {
                    dVarArr2[0] = new C93829e();
                }
            }
        }
        return this.f270774w[0];
    }

    /* renamed from: VM */
    public void mo128747VM(int i) {
        synchronized (this.f270776y) {
            C99259n nVar = this.f270776y.get(i);
            if (nVar != null) {
                try {
                    nVar.destroy();
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.FTS.PluginFTS", "Destroy Native Logic name=%s \nexception=%s", nVar.getName(), Util.stackTraceToString(e));
                }
                this.f270776y.remove(i);
            }
        }
    }

    public LinkedList<C21891f> Wh0(HashSet<Integer> hashSet, Context context, C21891f.C21893b bVar, int i) {
        C100559e eVar;
        LinkedList<C21891f> linkedList = new LinkedList<>();
        LinkedList linkedList2 = new LinkedList();
        Iterator<Integer> it = hashSet.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            C100559e eVar2 = this.f270773v.get(intValue);
            if (eVar2 != null) {
                linkedList2.add(eVar2);
            } else {
                C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C100560g.class);
                C38166b.C38167a.C38169b bVar2 = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
                while (bVar2.hasNext()) {
                    C38174i iVar = (C38174i) bVar2.next();
                    if (iVar.hasKey(Integer.valueOf(intValue)) && (eVar = (C100559e) iVar.get()) != null) {
                        linkedList2.add(eVar);
                    }
                }
            }
        }
        Collections.sort(linkedList2);
        Iterator it4 = linkedList2.iterator();
        while (it4.hasNext()) {
            linkedList.add(((C100559e) it4.next()).mo33103xf(context, bVar, i));
        }
        return linkedList;
    }

    public C99664b Xn0(int i, C76728k kVar) {
        if (!mo128758wd()) {
            C93825c cVar = new C93825c(-2, kVar);
            ThreadPool.post(cVar, "FTSExceptionHandler");
            return cVar;
        } else if (this.f270776y.indexOfKey(i) >= 0) {
            C99259n nVar = this.f270776y.get(i);
            if (nVar.isCreated()) {
                return nVar.mo128819l4(kVar);
            }
            C93825c cVar2 = new C93825c(-2, kVar);
            ThreadPool.post(cVar2, "FTSExceptionHandler");
            return cVar2;
        } else {
            Log.m105921e("MicroMsg.FTS.PluginFTS", "Not Found Search Logic, LogicArraySize=%d", Integer.valueOf(this.f270776y.size()));
            C93825c cVar3 = new C93825c(-2, kVar);
            ThreadPool.post(cVar3, "FTSExceptionHandler");
            return cVar3;
        }
    }

    public void Xt0(C100559e eVar) {
        try {
            this.f270773v.put(eVar.getType(), eVar);
        } catch (Exception unused) {
        }
    }

    public C100969c au0(int i) {
        C100969c cVar = this.f270775x.get(i);
        if (cVar != null) {
            return cVar;
        }
        C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C100970d.class);
        C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
        while (bVar.hasNext()) {
            C38174i iVar = (C38174i) bVar.next();
            if (iVar.hasKey(Integer.valueOf(i))) {
                return (C100969c) iVar.get();
            }
        }
        return null;
    }

    /* renamed from: cG */
    public void mo128752cG(String str, C99681n nVar, int i) {
        if (mo128758wd() && this.f270776y.indexOfKey(1) >= 0) {
            C99259n nVar2 = this.f270776y.get(1);
            HashMap<String, String> hashMap = C99251g.f291026a;
            HashMap hashMap2 = new HashMap();
            for (Map.Entry next : C99251g.f291026a.entrySet()) {
                hashMap2.put((String) next.getKey(), (String) next.getValue());
            }
            nVar2.mo128843k4(str, nVar, i, hashMap2);
        }
    }

    public C99258l db0(int i) {
        return this.f270771t.get(Integer.valueOf(i));
    }

    /* renamed from: df */
    public void mo128754df(C99258l lVar) {
        this.f270771t.put(Integer.valueOf(lVar.getType()), lVar);
    }

    /* renamed from: eu */
    public int mo128755eu(String str, String str2) {
        return FTSJNIUtils.stringCompareUtfBinary(str, str2);
    }

    /* renamed from: j4 */
    public void mo128756j4(String str, String str2) {
        if (mo128758wd() && this.f270776y.indexOfKey(8) >= 0) {
            this.f270776y.get(8).mo128838j4(str, str2);
        }
    }

    /* renamed from: ki */
    public void mo128757ki(C99664b bVar) {
        if (mo128758wd()) {
            ((C93836i) mo128743Jd()).mo128801a(bVar);
        }
    }

    public void onAccountInitialized(Context context) {
        Uri n = C116299g2.m163858n(C99249c.f291018p);
        String path = n.getPath();
        boolean z = false;
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0 f0Var = C116281f0.C116289i.f348994a;
        C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
        if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
            C116281f0.C116288h l2 = f0Var.mo177799l(n, l);
            if (l2.mo177810a()) {
                l2.f348991a.mo119937g(l2.f348992b);
            }
        }
        Intent registerReceiver = MMApplicationContext.getContext().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
            this.f270762h = z;
        } else {
            this.f270762h = false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        MMApplicationContext.getContext().registerReceiver(this.f270770s, intentFilter);
        C86482a6 f = C86709a0.m107526f();
        C86482a6.C86483a aVar = this.f270766o;
        if (f.f251307a) {
            Log.m105920e("MicroMsg.UninitForUEH", "add , is running , forbid add");
        } else {
            ((HashSet) f.f251308b).add(aVar);
        }
        this.f270767p.alive();
        this.f270769r.alive();
        this.f270777z.alive();
        C86709a0.m107524d().mo123455a(138, this.f270768q);
        C93836i iVar = (C93836i) mo128743Jd();
        iVar.mo128803c(-131072, new C93823g());
        iVar.mo128803c(-131071, new C93822f((C93819a) null));
        ((C93836i) mo128743Jd()).mo128803c(65536, new C93839k(this));
    }

    public void onAccountReleased(Context context) {
        zx0();
        this.f270773v.clear();
        this.f270775x.clear();
        Ax0();
        C93836i[] iVarArr = this.f270758d;
        if (iVarArr[0] != null) {
            synchronized (iVarArr) {
                C93836i iVar = this.f270758d[0];
                if (iVar != null) {
                    iVar.mo128804d();
                    this.f270758d[0] = null;
                }
            }
        }
        if (this.f270759e != null) {
            this.f270759e.mo128787c();
            this.f270759e = null;
        }
        synchronized (this.f270774w) {
            C100558d dVar = this.f270774w[0];
            if (dVar != null) {
                ((C93829e) dVar).mo128775c();
                this.f270774w[0] = null;
            }
        }
        try {
            MMApplicationContext.getContext().unregisterReceiver(this.f270770s);
        } catch (Exception unused) {
        }
        this.f270767p.dead();
        this.f270777z.dead();
        this.f270769r.dead();
        C86709a0.m107524d().mo123470p(138, this.f270768q);
        C86482a6 f = C86709a0.m107526f();
        C86482a6.C86483a aVar = this.f270766o;
        if (f.f251307a) {
            Log.m105920e("MicroMsg.UninitForUEH", "remove , is running , forbid remove");
        } else {
            ((HashSet) f.f251308b).remove(aVar);
        }
        this.f270760f = false;
        this.f270761g = false;
    }

    /* renamed from: wd */
    public boolean mo128758wd() {
        boolean z;
        C93836i iVar = (C93836i) mo128743Jd();
        synchronized (iVar) {
            C93836i.C93837a aVar = iVar.f270824a;
            z = aVar != null && aVar.isAlive();
        }
        return z;
    }

    /* renamed from: x2 */
    public void mo128759x2(String str) {
        if (mo128758wd() && this.f270776y.indexOfKey(8) >= 0) {
            this.f270776y.get(8).mo128839x2(str);
        }
    }

    /* renamed from: x3 */
    public void mo128760x3() {
        if (mo128758wd() && this.f270776y.indexOfKey(8) >= 0) {
            this.f270776y.get(8).mo128840x3();
        }
    }

    /* renamed from: xc */
    public C61172m mo128761xc() {
        if (this.f270772u == null) {
            this.f270772u = new C68985g();
        }
        return this.f270772u;
    }

    public void zk0(int i, C99259n nVar) {
        synchronized (this.f270776y) {
            this.f270776y.put(i, nVar);
        }
    }

    public final void zx0() {
        Log.m105924i("MicroMsg.FTS.PluginFTS", "Destroy Native Logic");
        for (int i = 0; i < this.f270776y.size(); i++) {
            C99259n nVar = this.f270776y.get(this.f270776y.keyAt(i));
            if (nVar != null) {
                try {
                    nVar.destroy();
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.FTS.PluginFTS", "Create Native Logic name=%s \nexception=%s", nVar.getName(), Util.stackTraceToString(e));
                }
            }
        }
    }
}
