package r70;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.tencent.p014mm.matrix.C80992k;
import com.tencent.p014mm.matrix.strategy.MatrixStrategyNotifyBroadcast;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import p1060we.C90969a;
import p1060we.C90970b;
import p269xe.C91185g;
import p269xe.C91189j;
import p723vf.C118672d;
import p995kf.C88146a;

/* renamed from: r70.c */
public class C89888c extends C90969a {

    /* renamed from: b */
    public final Context f258336b;

    /* renamed from: c */
    public Long f258337c;

    /* renamed from: d */
    public String f258338d;

    /* renamed from: e */
    public volatile boolean f258339e;

    /* renamed from: f */
    public Long f258340f;

    /* renamed from: g */
    public C91189j f258341g = new C91189j();

    /* renamed from: h */
    public final ConcurrentHashMap<C90970b, C89891c> f258342h = new ConcurrentHashMap<>();

    /* renamed from: i */
    public C89890b f258343i;

    /* renamed from: j */
    public final ConcurrentLinkedDeque<C89889a> f258344j;

    /* renamed from: r70.c$a */
    public static final class C89889a extends C91185g {
    }

    /* renamed from: r70.c$b */
    public interface C89890b {
    }

    /* renamed from: r70.c$c */
    public interface C89891c {
        /* renamed from: a */
        void mo124174a(C89889a aVar);
    }

    public C89888c(Context context, Long l, String str, Boolean bool, Long l2) {
        super(context);
        new ConcurrentLinkedQueue();
        this.f258344j = new ConcurrentLinkedDeque<>();
        this.f258336b = context;
        this.f258337c = l;
        this.f258338d = str;
        this.f258339e = bool.booleanValue();
        this.f258340f = l2;
        if (!MMApplicationContext.isMainProcess()) {
            IntentFilter intentFilter = new IntentFilter();
            MultiProcessMMKV multiProcessMMKV = C80992k.f237876a;
            intentFilter.addAction("ENABLE_FPS");
            intentFilter.addAction("MODIFY_EVIL_THRESHOLD");
            intentFilter.addAction("ENABLE_METHOD_BEAT");
            intentFilter.addAction("ENABLE_ANR");
            intentFilter.addAction("ENABLE_START_UP");
            intentFilter.addAction("ENABLE_EVIL_METHOD");
            intentFilter.addAction("ENABLE_FPS_FLOAT");
            intentFilter.addAction("ENABLE_DEV_LOG");
            MatrixStrategyNotifyBroadcast matrixStrategyNotifyBroadcast = new MatrixStrategyNotifyBroadcast();
            try {
                context.registerReceiver(matrixStrategyNotifyBroadcast, intentFilter, MatrixStrategyNotifyBroadcast.f237879a, (Handler) null);
            } catch (Throwable unused) {
                context.unregisterReceiver(matrixStrategyNotifyBroadcast);
                context.registerReceiver(matrixStrategyNotifyBroadcast, intentFilter, MatrixStrategyNotifyBroadcast.f237879a, (Handler) null);
            }
        }
    }

    /* renamed from: a */
    public void mo110075a(C91185g gVar) {
        C89889a aVar = new C89889a();
        aVar.f261446d = gVar.f261446d;
        aVar.f261444b = gVar.f261444b;
        C90970b bVar = gVar.f261447e;
        aVar.f261447e = bVar;
        aVar.f261445c = gVar.f261445c;
        aVar.f261443a = gVar.f261443a;
        if (bVar instanceof C88146a) {
            this.f258344j.addFirst(aVar);
            if (this.f258344j.size() >= 30) {
                this.f258344j.removeLast();
            }
        }
        try {
            C89890b bVar2 = this.f258343i;
            if (bVar2 == null || !((C89886b) bVar2).mo124178a(aVar)) {
                C89891c cVar = this.f258342h.get(aVar.f261447e);
                if (cVar != null) {
                    cVar.mo124174a(aVar);
                }
                try {
                    if (MMApplicationContext.isMainProcess()) {
                        mo124179e(aVar, (String) null);
                        return;
                    }
                    Intent intent = new Intent();
                    intent.setAction("action.matrix.deprecated-report");
                    intent.putExtra("tag", aVar.f261444b);
                    intent.putExtra("key", aVar.f261445c);
                    intent.putExtra("type", aVar.f261443a);
                    intent.putExtra("value", aVar.f261446d.toString());
                    intent.putExtra(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, (String) null);
                    C118672d.m167353c("MicroMsg.MatrixReporter", "Matrix report with broadcast tag:%s", aVar.f261444b);
                    this.f258336b.sendBroadcast(intent);
                } catch (Throwable th) {
                    C118672d.m167352b("MicroMsg.MatrixReporter", "Matrix report occur error:" + th, new Object[0]);
                }
            } else {
                Log.m105929w("MicroMsg.MatrixReporter", "[reportJson] pass this report! tag=%s", aVar.f261444b);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MatrixReporter", e, "", new Object[0]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01da, code lost:
        if (r12.equalsIgnoreCase("LAG_TOUCH") == false) goto L_0x0228;
     */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0592 A[Catch:{ Exception -> 0x05c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x05d4  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x05d9  */
    /* JADX WARNING: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo124179e(p269xe.C91185g r46, java.lang.String r47) {
        /*
            r45 = this;
            r0 = r46
            r1 = 3
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = r0.f261444b
            r4 = 0
            r2[r4] = r3
            org.json.JSONObject r3 = r0.f261446d
            r5 = 1
            r2[r5] = r3
            int r3 = qe3.C89625d.f257841g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6 = 2
            r2[r6] = r3
            java.lang.String r3 = "MicroMsg.MatrixReporter"
            java.lang.String r7 = "Matrix reportLocal tag:%s, key:%s, data:%s"
            p723vf.C118672d.m167353c(r3, r7, r2)
            r2 = r45
            xe.j r3 = r2.f258341g
            java.lang.String r7 = r0.f261444b
            org.json.JSONObject r8 = r0.f261446d
            r3.getClass()
            java.lang.String r9 = "null"
            java.lang.String r10 = "MatrixIdKeyReporter"
            java.lang.String r0 = "process"
            java.lang.String r0 = r8.getString(r0)     // Catch:{ Exception -> 0x05ca }
            java.lang.String r11 = "[report] tag:%s processName:%s"
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x05ca }
            r12[r4] = r7     // Catch:{ Exception -> 0x05ca }
            r12[r5] = r0     // Catch:{ Exception -> 0x05ca }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r12)     // Catch:{ Exception -> 0x05ca }
            boolean r11 = p761yd.C91441c.m114729c()     // Catch:{ Exception -> 0x05ca }
            if (r11 != 0) goto L_0x004d
            java.lang.String r0 = "matrix not installed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)     // Catch:{ Exception -> 0x05ca }
            goto L_0x05e3
        L_0x004d:
            r11 = 0
            if (r7 == 0) goto L_0x006b
            java.lang.String r11 = "Trace"
            boolean r11 = r7.startsWith(r11)     // Catch:{ Exception -> 0x05ca }
            if (r11 == 0) goto L_0x0063
            yd.c r11 = p761yd.C91441c.m114730d()     // Catch:{ Exception -> 0x05ca }
            java.lang.Class<kf.a> r12 = p995kf.C88146a.class
            we.b r11 = r11.mo125377a(r12)     // Catch:{ Exception -> 0x05ca }
            goto L_0x006b
        L_0x0063:
            yd.c r11 = p761yd.C91441c.m114730d()     // Catch:{ Exception -> 0x05ca }
            we.b r11 = r11.mo125378b(r7)     // Catch:{ Exception -> 0x05ca }
        L_0x006b:
            if (r11 != 0) goto L_0x0075
            java.lang.String r0 = "plugin is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)     // Catch:{ Exception -> 0x05ca }
            goto L_0x05e3
        L_0x0075:
            java.lang.String r12 = ""
            boolean r13 = r11 instanceof p995kf.C88146a     // Catch:{ Exception -> 0x05ca }
            if (r13 == 0) goto L_0x04f2
            java.lang.String r11 = "tag"
            java.lang.String r11 = r8.getString(r11)     // Catch:{ Exception -> 0x05ca }
            java.lang.String r13 = "[report] _tag:%s"
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x05ca }
            r15[r4] = r11     // Catch:{ Exception -> 0x05ca }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r13, r15)     // Catch:{ Exception -> 0x05ca }
            java.lang.String r13 = "Trace_EvilMethod"
            boolean r13 = r11.equalsIgnoreCase(r13)     // Catch:{ Exception -> 0x05ca }
            r15 = 9
            java.lang.String r14 = "scene"
            r18 = 6
            if (r13 == 0) goto L_0x0231
            java.lang.String r11 = "detail"
            java.lang.String r12 = r8.getString(r11)     // Catch:{ Exception -> 0x05ca }
            java.lang.String r11 = "ANR"
            boolean r11 = r12.equalsIgnoreCase(r11)     // Catch:{ Exception -> 0x05ca }
            java.lang.String r13 = "threadStack"
            java.lang.String r1 = "stackKey"
            java.lang.String r6 = "isProcessForeground"
            if (r11 == 0) goto L_0x016f
            boolean r6 = r8.getBoolean(r6)     // Catch:{ Exception -> 0x05ca }
            java.lang.String r1 = r8.getString(r1)     // Catch:{ Exception -> 0x05ca }
            java.lang.String r11 = r8.getString(r13)     // Catch:{ Exception -> 0x05ca }
            java.lang.String r13 = r8.getString(r14)     // Catch:{ Exception -> 0x05ca }
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x05ca }
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x05ca }
            r15[r4] = r7     // Catch:{ Exception -> 0x05ca }
            int r22 = qe3.C89625d.f257841g     // Catch:{ Exception -> 0x05ca }
            java.lang.Integer r22 = java.lang.Integer.valueOf(r22)     // Catch:{ Exception -> 0x05ca }
            r23 = 1
            r15[r23] = r22     // Catch:{ Exception -> 0x05ca }
            r21 = 2
            r15[r21] = r12     // Catch:{ Exception -> 0x05ca }
            r17 = 3
            r15[r17] = r1     // Catch:{ Exception -> 0x05ca }
            r16 = 4
            r15[r16] = r13     // Catch:{ Exception -> 0x05ca }
            r22 = 5
            r15[r22] = r11     // Catch:{ Exception -> 0x05ca }
            r15[r18] = r0     // Catch:{ Exception -> 0x05ca }
            if (r6 == 0) goto L_0x00e7
            r22 = 1
            goto L_0x00e9
        L_0x00e7:
            r22 = 0
        L_0x00e9:
            java.lang.Integer r22 = java.lang.Integer.valueOf(r22)     // Catch:{ Exception -> 0x05ca }
            r20 = 7
            r15[r20] = r22     // Catch:{ Exception -> 0x05ca }
            java.lang.String r22 = com.tencent.p014mm.sdk.platformtools.BuildInfo.REV     // Catch:{ Exception -> 0x05ca }
            r4 = 8
            r15[r4] = r22     // Catch:{ Exception -> 0x05ca }
            r4 = 17108(0x42d4, float:2.3973E-41)
            r5.mo160131h(r4, r15)     // Catch:{ Exception -> 0x05ca }
            r4 = 19999(0x4e1f, float:2.8025E-41)
            r15 = 8
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x05ca }
            int r19 = qe3.C89625d.f257841g     // Catch:{ Exception -> 0x05ca }
            java.lang.Integer r19 = java.lang.Integer.valueOf(r19)     // Catch:{ Exception -> 0x05ca }
            r22 = 0
            r15[r22] = r19     // Catch:{ Exception -> 0x05ca }
            r19 = 1
            r15[r19] = r12     // Catch:{ Exception -> 0x05ca }
            r19 = 2
            r15[r19] = r1     // Catch:{ Exception -> 0x05ca }
            r1 = 3
            r15[r1] = r13     // Catch:{ Exception -> 0x05ca }
            r1 = 4
            r15[r1] = r11     // Catch:{ Exception -> 0x05ca }
            r1 = 5
            r15[r1] = r0     // Catch:{ Exception -> 0x05ca }
            if (r6 == 0) goto L_0x0121
            r1 = 1
            goto L_0x0122
        L_0x0121:
            r1 = 0
        L_0x0122:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x05ca }
            r15[r18] = r1     // Catch:{ Exception -> 0x05ca }
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.REV     // Catch:{ Exception -> 0x05ca }
            r11 = 7
            r15[r11] = r1     // Catch:{ Exception -> 0x05ca }
            r5.mo160131h(r4, r15)     // Catch:{ Exception -> 0x05ca }
            if (r6 == 0) goto L_0x0144
            kj2.d r29 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x05ca }
            int r1 = r3.mo125249a(r0)     // Catch:{ Exception -> 0x05ca }
            long r1 = (long) r1     // Catch:{ Exception -> 0x05ca }
            r32 = 1
            r34 = 1
            r36 = 1
            r30 = r1
            r29.idkeyStat(r30, r32, r34, r36)     // Catch:{ Exception -> 0x05ca }
        L_0x0144:
            kj2.d r37 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x05ca }
            int r0 = r3.mo125249a(r0)     // Catch:{ Exception -> 0x05ca }
            long r0 = (long) r0     // Catch:{ Exception -> 0x05ca }
            r40 = 0
            r42 = 1
            r44 = 1
            r38 = r0
            r37.idkeyStat(r38, r40, r42, r44)     // Catch:{ Exception -> 0x05ca }
            gy3.C87412m.m108594g(r13, r14)     // Catch:{ Exception -> 0x05ca }
            java.lang.String r0 = "Finder"
            r1 = 0
            boolean r0 = z04.C112550d0.m153801u(r13, r0, r1)     // Catch:{ Exception -> 0x05ca }
            if (r0 != 0) goto L_0x0163
            goto L_0x01ba
        L_0x0163:
            r23 = 1343(0x53f, double:6.635E-321)
            r25 = 100
            r27 = 1
            r22 = r5
            r22.mo175913w(r23, r25, r27)     // Catch:{ Exception -> 0x05ca }
            goto L_0x01ba
        L_0x016f:
            java.lang.String r2 = "NORMAL"
            boolean r2 = r12.equalsIgnoreCase(r2)     // Catch:{ Exception -> 0x05ca }
            if (r2 == 0) goto L_0x01c4
            java.lang.String r1 = r8.getString(r1)     // Catch:{ Exception -> 0x05ca }
            java.lang.String r2 = r8.getString(r14)     // Catch:{ Exception -> 0x05ca }
            kj2.d r29 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x05ca }
            int r3 = r3.mo125249a(r0)     // Catch:{ Exception -> 0x05ca }
            long r3 = (long) r3     // Catch:{ Exception -> 0x05ca }
            r32 = 21
            r34 = 1
            r36 = 1
            r30 = r3
            r29.idkeyStat(r30, r32, r34, r36)     // Catch:{ Exception -> 0x05ca }
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x05ca }
            r4 = 7
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x05ca }
            r5 = 0
            r4[r5] = r7     // Catch:{ Exception -> 0x05ca }
            int r5 = qe3.C89625d.f257841g     // Catch:{ Exception -> 0x05ca }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x05ca }
            r6 = 1
            r4[r6] = r5     // Catch:{ Exception -> 0x05ca }
            r5 = 2
            r4[r5] = r12     // Catch:{ Exception -> 0x05ca }
            r5 = 3
            r4[r5] = r1     // Catch:{ Exception -> 0x05ca }
            r1 = 4
            r4[r1] = r2     // Catch:{ Exception -> 0x05ca }
            r1 = 5
            r4[r1] = r9     // Catch:{ Exception -> 0x05ca }
            r4[r18] = r0     // Catch:{ Exception -> 0x05ca }
            r0 = 17108(0x42d4, float:2.3973E-41)
            r3.mo160131h(r0, r4)     // Catch:{ Exception -> 0x05ca }
            xe.i r0 = p269xe.C91188i.f261450a     // Catch:{ Exception -> 0x05ca }
            r0.mo125247d(r2, r8)     // Catch:{ Exception -> 0x05ca }
        L_0x01ba:
            r23 = r7
            r20 = r9
            r22 = r12
            r0 = 1
            r12 = r10
            goto L_0x0590
        L_0x01c4:
            java.lang.String r1 = "LAG"
            boolean r1 = r12.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x05ca }
            java.lang.String r2 = "LAG_TOUCH"
            java.lang.String r3 = "LAG_IDLE_HANDLER"
            if (r1 != 0) goto L_0x01dc
            boolean r1 = r12.equalsIgnoreCase(r3)     // Catch:{ Exception -> 0x05ca }
            if (r1 != 0) goto L_0x01dc
            boolean r1 = r12.equalsIgnoreCase(r2)     // Catch:{ Exception -> 0x05ca }
            if (r1 == 0) goto L_0x0228
        L_0x01dc:
            java.lang.String r1 = r8.getString(r14)     // Catch:{ Exception -> 0x05ca }
            boolean r4 = r8.getBoolean(r6)     // Catch:{ Exception -> 0x05ca }
            if (r4 == 0) goto L_0x0228
            java.lang.String r4 = r8.getString(r13)     // Catch:{ Exception -> 0x05ca }
            boolean r2 = r12.equalsIgnoreCase(r2)     // Catch:{ Exception -> 0x05ca }
            if (r2 == 0) goto L_0x01f2
            r2 = 1
            goto L_0x01fb
        L_0x01f2:
            boolean r2 = r12.equalsIgnoreCase(r3)     // Catch:{ Exception -> 0x05ca }
            if (r2 == 0) goto L_0x01fa
            r2 = 2
            goto L_0x01fb
        L_0x01fa:
            r2 = 0
        L_0x01fb:
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x05ca }
            r5 = 20841(0x5169, float:2.9204E-41)
            r6 = 7
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x05ca }
            r11 = 0
            r6[r11] = r1     // Catch:{ Exception -> 0x05ca }
            r1 = 1
            r6[r1] = r4     // Catch:{ Exception -> 0x05ca }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x05ca }
            r1 = 2
            r6[r1] = r4     // Catch:{ Exception -> 0x05ca }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x05ca }
            r2 = 3
            r6[r2] = r1     // Catch:{ Exception -> 0x05ca }
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x05ca }
            r1 = 4
            r6[r1] = r2     // Catch:{ Exception -> 0x05ca }
            r1 = 5
            r6[r1] = r0     // Catch:{ Exception -> 0x05ca }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.REV     // Catch:{ Exception -> 0x05ca }
            r6[r18] = r0     // Catch:{ Exception -> 0x05ca }
            r3.mo160131h(r5, r6)     // Catch:{ Exception -> 0x05ca }
        L_0x0228:
            r23 = r7
            r20 = r9
            r22 = r12
            r12 = r10
            goto L_0x058f
        L_0x0231:
            r1 = 8
            r6 = 7
            java.lang.String r2 = "Trace_StartUp"
            boolean r2 = r11.equalsIgnoreCase(r2)     // Catch:{ Exception -> 0x05ca }
            r4 = 1
            if (r2 == 0) goto L_0x0326
            java.lang.String r2 = "startup_duration"
            long r13 = r8.getLong(r2)     // Catch:{ Exception -> 0x05ca }
            java.lang.String r2 = "is_warm_start_up"
            boolean r2 = r8.getBoolean(r2)     // Catch:{ Exception -> 0x05ca }
            java.lang.String r11 = "[startup] duration=%s isWarmStartUp=%s"
            r1 = 2
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x05ca }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x05ca }
            r22 = 0
            r6[r22] = r1     // Catch:{ Exception -> 0x05ca }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x05ca }
            r22 = 1
            r6[r22] = r1     // Catch:{ Exception -> 0x05ca }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r6)     // Catch:{ Exception -> 0x05ca }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x05ca }
            r1.<init>()     // Catch:{ Exception -> 0x05ca }
            com.tencent.mars.smc.IDKey r6 = new com.tencent.mars.smc.IDKey     // Catch:{ Exception -> 0x05ca }
            r6.<init>()     // Catch:{ Exception -> 0x05ca }
            int r11 = r3.mo125251c(r0)     // Catch:{ Exception -> 0x05ca }
            r6.SetID(r11)     // Catch:{ Exception -> 0x05ca }
            if (r2 == 0) goto L_0x0278
            r11 = 3
            goto L_0x0279
        L_0x0278:
            r11 = 0
        L_0x0279:
            r6.SetKey(r11)     // Catch:{ Exception -> 0x05ca }
            r6.SetValue(r4)     // Catch:{ Exception -> 0x05ca }
            r1.add(r6)     // Catch:{ Exception -> 0x05ca }
            com.tencent.mars.smc.IDKey r6 = new com.tencent.mars.smc.IDKey     // Catch:{ Exception -> 0x05ca }
            r6.<init>()     // Catch:{ Exception -> 0x05ca }
            int r11 = r3.mo125251c(r0)     // Catch:{ Exception -> 0x05ca }
            r6.SetID(r11)     // Catch:{ Exception -> 0x05ca }
            if (r2 == 0) goto L_0x0292
            r11 = 4
            goto L_0x0293
        L_0x0292:
            r11 = 1
        L_0x0293:
            r6.SetKey(r11)     // Catch:{ Exception -> 0x05ca }
            r6.SetValue(r13)     // Catch:{ Exception -> 0x05ca }
            r1.add(r6)     // Catch:{ Exception -> 0x05ca }
            com.tencent.mars.smc.IDKey r6 = new com.tencent.mars.smc.IDKey     // Catch:{ Exception -> 0x05ca }
            r6.<init>()     // Catch:{ Exception -> 0x05ca }
            int r3 = r3.mo125251c(r0)     // Catch:{ Exception -> 0x05ca }
            r6.SetID(r3)     // Catch:{ Exception -> 0x05ca }
            r6.SetValue(r4)     // Catch:{ Exception -> 0x05ca }
            r1.add(r6)     // Catch:{ Exception -> 0x05ca }
            r3 = 3000(0xbb8, double:1.482E-320)
            int r5 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x02c1
            if (r2 == 0) goto L_0x02bb
            r18 = 11
            r3 = 11
            goto L_0x02bc
        L_0x02bb:
            r3 = 6
        L_0x02bc:
            r6.SetKey(r3)     // Catch:{ Exception -> 0x05ca }
            r15 = 1
            goto L_0x02fe
        L_0x02c1:
            r3 = 6000(0x1770, double:2.9644E-320)
            int r5 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x02d2
            if (r2 == 0) goto L_0x02cc
            r3 = 12
            goto L_0x02cd
        L_0x02cc:
            r3 = 7
        L_0x02cd:
            r6.SetKey(r3)     // Catch:{ Exception -> 0x05ca }
            r15 = 2
            goto L_0x02fe
        L_0x02d2:
            r3 = 9000(0x2328, double:4.4466E-320)
            int r5 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x02e4
            if (r2 == 0) goto L_0x02dd
            r3 = 13
            goto L_0x02df
        L_0x02dd:
            r3 = 8
        L_0x02df:
            r6.SetKey(r3)     // Catch:{ Exception -> 0x05ca }
            r15 = 3
            goto L_0x02fe
        L_0x02e4:
            r3 = 12000(0x2ee0, double:5.929E-320)
            int r5 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x02f3
            if (r2 == 0) goto L_0x02ee
            r15 = 14
        L_0x02ee:
            r6.SetKey(r15)     // Catch:{ Exception -> 0x05ca }
            r15 = 4
            goto L_0x02fe
        L_0x02f3:
            if (r2 == 0) goto L_0x02f8
            r3 = 15
            goto L_0x02fa
        L_0x02f8:
            r3 = 10
        L_0x02fa:
            r6.SetKey(r3)     // Catch:{ Exception -> 0x05ca }
            r15 = 5
        L_0x02fe:
            kj2.d r3 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x05ca }
            r4 = 1
            r3.mo160124a(r1, r4)     // Catch:{ Exception -> 0x05ca }
            r1 = 21019(0x521b, float:2.9454E-41)
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x05ca }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x05ca }
            r5 = 0
            r4[r5] = r2     // Catch:{ Exception -> 0x05ca }
            java.lang.Long r2 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x05ca }
            r5 = 1
            r4[r5] = r2     // Catch:{ Exception -> 0x05ca }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x05ca }
            r5 = 2
            r4[r5] = r2     // Catch:{ Exception -> 0x05ca }
            r2 = 3
            r4[r2] = r0     // Catch:{ Exception -> 0x05ca }
            r3.mo160131h(r1, r4)     // Catch:{ Exception -> 0x05ca }
            goto L_0x0228
        L_0x0326:
            java.lang.String r1 = "Trace_FPS"
            boolean r1 = r11.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x05ca }
            if (r1 == 0) goto L_0x0228
            java.lang.String r1 = r8.getString(r14)     // Catch:{ Exception -> 0x05ca }
            xe.i r2 = p269xe.C91188i.f261450a     // Catch:{ Exception -> 0x05ca }
            r2.mo125248e(r1, r8)     // Catch:{ Exception -> 0x05ca }
            int r2 = r3.mo125250b(r1)     // Catch:{ Exception -> 0x05ca }
            if (r2 >= 0) goto L_0x033f
            goto L_0x05e3
        L_0x033f:
            java.lang.String r6 = "fps"
            double r13 = r8.getDouble(r6)     // Catch:{ Exception -> 0x05ca }
            java.lang.String r6 = "dropLevel"
            org.json.JSONObject r6 = r8.getJSONObject(r6)     // Catch:{ Exception -> 0x05ca }
            java.lang.String r11 = "DROPPED_BEST"
            int r11 = r6.getInt(r11)     // Catch:{ Exception -> 0x05ca }
            java.lang.String r15 = "DROPPED_NORMAL"
            int r15 = r6.getInt(r15)     // Catch:{ Exception -> 0x05ca }
            java.lang.String r4 = "DROPPED_MIDDLE"
            int r4 = r6.getInt(r4)     // Catch:{ Exception -> 0x05ca }
            java.lang.String r5 = "DROPPED_HIGH"
            int r5 = r6.getInt(r5)     // Catch:{ Exception -> 0x05ca }
            r20 = r9
            java.lang.String r9 = "DROPPED_FROZEN"
            int r6 = r6.getInt(r9)     // Catch:{ Exception -> 0x04ee }
            java.lang.String r9 = "[getKeyOffset] scene:%s fps:%s offset:%s"
            r23 = r7
            r22 = r12
            r12 = 3
            java.lang.Object[] r7 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x04ee }
            r12 = 0
            r7[r12] = r1     // Catch:{ Exception -> 0x04ee }
            java.lang.Double r1 = java.lang.Double.valueOf(r13)     // Catch:{ Exception -> 0x04ee }
            r12 = 1
            r7[r12] = r1     // Catch:{ Exception -> 0x04ee }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x04ee }
            r12 = 2
            r7[r12] = r1     // Catch:{ Exception -> 0x04ee }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r9, r7)     // Catch:{ Exception -> 0x04ee }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x04ee }
            r1.<init>()     // Catch:{ Exception -> 0x04ee }
            com.tencent.mars.smc.IDKey r7 = new com.tencent.mars.smc.IDKey     // Catch:{ Exception -> 0x04ee }
            r7.<init>()     // Catch:{ Exception -> 0x04ee }
            int r9 = r3.mo125249a(r0)     // Catch:{ Exception -> 0x04ee }
            r7.SetID(r9)     // Catch:{ Exception -> 0x04ee }
            int r9 = r2 + 47
            r7.SetKey(r9)     // Catch:{ Exception -> 0x04ee }
            r12 = r10
            r9 = 1
            r7.SetValue(r9)     // Catch:{ Exception -> 0x05c8 }
            r1.add(r7)     // Catch:{ Exception -> 0x05c8 }
            com.tencent.mars.smc.IDKey r7 = new com.tencent.mars.smc.IDKey     // Catch:{ Exception -> 0x05c8 }
            r7.<init>()     // Catch:{ Exception -> 0x05c8 }
            int r9 = r3.mo125249a(r0)     // Catch:{ Exception -> 0x05c8 }
            r7.SetID(r9)     // Catch:{ Exception -> 0x05c8 }
            int r9 = r2 + 48
            r7.SetKey(r9)     // Catch:{ Exception -> 0x05c8 }
            long r9 = (long) r13     // Catch:{ Exception -> 0x05c8 }
            r7.SetValue(r9)     // Catch:{ Exception -> 0x05c8 }
            long r9 = r7.GetValue()     // Catch:{ Exception -> 0x05c8 }
            r13 = 0
            int r16 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r16 <= 0) goto L_0x03c9
            r1.add(r7)     // Catch:{ Exception -> 0x05c8 }
        L_0x03c9:
            com.tencent.mars.smc.IDKey r7 = new com.tencent.mars.smc.IDKey     // Catch:{ Exception -> 0x05c8 }
            r7.<init>()     // Catch:{ Exception -> 0x05c8 }
            int r9 = r3.mo125249a(r0)     // Catch:{ Exception -> 0x05c8 }
            r7.SetID(r9)     // Catch:{ Exception -> 0x05c8 }
            int r9 = r2 + 49
            r7.SetKey(r9)     // Catch:{ Exception -> 0x05c8 }
            long r9 = (long) r11     // Catch:{ Exception -> 0x05c8 }
            r7.SetValue(r9)     // Catch:{ Exception -> 0x05c8 }
            long r9 = r7.GetValue()     // Catch:{ Exception -> 0x05c8 }
            int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x0402
            r1.add(r7)     // Catch:{ Exception -> 0x05c8 }
            com.tencent.mars.smc.IDKey r7 = new com.tencent.mars.smc.IDKey     // Catch:{ Exception -> 0x05c8 }
            r7.<init>()     // Catch:{ Exception -> 0x05c8 }
            int r9 = r3.mo125249a(r0)     // Catch:{ Exception -> 0x05c8 }
            r7.SetID(r9)     // Catch:{ Exception -> 0x05c8 }
            int r9 = r2 + 54
            r7.SetKey(r9)     // Catch:{ Exception -> 0x05c8 }
            r9 = 1
            r7.SetValue(r9)     // Catch:{ Exception -> 0x05c8 }
            r1.add(r7)     // Catch:{ Exception -> 0x05c8 }
        L_0x0402:
            com.tencent.mars.smc.IDKey r7 = new com.tencent.mars.smc.IDKey     // Catch:{ Exception -> 0x05c8 }
            r7.<init>()     // Catch:{ Exception -> 0x05c8 }
            int r9 = r3.mo125249a(r0)     // Catch:{ Exception -> 0x05c8 }
            r7.SetID(r9)     // Catch:{ Exception -> 0x05c8 }
            int r9 = r2 + 50
            r7.SetKey(r9)     // Catch:{ Exception -> 0x05c8 }
            long r9 = (long) r15     // Catch:{ Exception -> 0x05c8 }
            r7.SetValue(r9)     // Catch:{ Exception -> 0x05c8 }
            long r9 = r7.GetValue()     // Catch:{ Exception -> 0x05c8 }
            int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x043b
            r1.add(r7)     // Catch:{ Exception -> 0x05c8 }
            com.tencent.mars.smc.IDKey r7 = new com.tencent.mars.smc.IDKey     // Catch:{ Exception -> 0x05c8 }
            r7.<init>()     // Catch:{ Exception -> 0x05c8 }
            int r9 = r3.mo125249a(r0)     // Catch:{ Exception -> 0x05c8 }
            r7.SetID(r9)     // Catch:{ Exception -> 0x05c8 }
            int r9 = r2 + 55
            r7.SetKey(r9)     // Catch:{ Exception -> 0x05c8 }
            r9 = 1
            r7.SetValue(r9)     // Catch:{ Exception -> 0x05c8 }
            r1.add(r7)     // Catch:{ Exception -> 0x05c8 }
        L_0x043b:
            com.tencent.mars.smc.IDKey r7 = new com.tencent.mars.smc.IDKey     // Catch:{ Exception -> 0x05c8 }
            r7.<init>()     // Catch:{ Exception -> 0x05c8 }
            int r9 = r3.mo125249a(r0)     // Catch:{ Exception -> 0x05c8 }
            r7.SetID(r9)     // Catch:{ Exception -> 0x05c8 }
            int r9 = r2 + 51
            r7.SetKey(r9)     // Catch:{ Exception -> 0x05c8 }
            long r9 = (long) r4     // Catch:{ Exception -> 0x05c8 }
            r7.SetValue(r9)     // Catch:{ Exception -> 0x05c8 }
            long r9 = r7.GetValue()     // Catch:{ Exception -> 0x05c8 }
            int r4 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x0474
            r1.add(r7)     // Catch:{ Exception -> 0x05c8 }
            com.tencent.mars.smc.IDKey r4 = new com.tencent.mars.smc.IDKey     // Catch:{ Exception -> 0x05c8 }
            r4.<init>()     // Catch:{ Exception -> 0x05c8 }
            int r7 = r3.mo125249a(r0)     // Catch:{ Exception -> 0x05c8 }
            r4.SetID(r7)     // Catch:{ Exception -> 0x05c8 }
            int r7 = r2 + 56
            r4.SetKey(r7)     // Catch:{ Exception -> 0x05c8 }
            r9 = 1
            r4.SetValue(r9)     // Catch:{ Exception -> 0x05c8 }
            r1.add(r4)     // Catch:{ Exception -> 0x05c8 }
        L_0x0474:
            com.tencent.mars.smc.IDKey r4 = new com.tencent.mars.smc.IDKey     // Catch:{ Exception -> 0x05c8 }
            r4.<init>()     // Catch:{ Exception -> 0x05c8 }
            int r7 = r3.mo125249a(r0)     // Catch:{ Exception -> 0x05c8 }
            r4.SetID(r7)     // Catch:{ Exception -> 0x05c8 }
            int r7 = r2 + 52
            r4.SetKey(r7)     // Catch:{ Exception -> 0x05c8 }
            long r9 = (long) r5     // Catch:{ Exception -> 0x05c8 }
            r4.SetValue(r9)     // Catch:{ Exception -> 0x05c8 }
            long r9 = r4.GetValue()     // Catch:{ Exception -> 0x05c8 }
            int r5 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r5 <= 0) goto L_0x04ad
            r1.add(r4)     // Catch:{ Exception -> 0x05c8 }
            com.tencent.mars.smc.IDKey r4 = new com.tencent.mars.smc.IDKey     // Catch:{ Exception -> 0x05c8 }
            r4.<init>()     // Catch:{ Exception -> 0x05c8 }
            int r5 = r3.mo125249a(r0)     // Catch:{ Exception -> 0x05c8 }
            r4.SetID(r5)     // Catch:{ Exception -> 0x05c8 }
            int r5 = r2 + 57
            r4.SetKey(r5)     // Catch:{ Exception -> 0x05c8 }
            r9 = 1
            r4.SetValue(r9)     // Catch:{ Exception -> 0x05c8 }
            r1.add(r4)     // Catch:{ Exception -> 0x05c8 }
        L_0x04ad:
            com.tencent.mars.smc.IDKey r4 = new com.tencent.mars.smc.IDKey     // Catch:{ Exception -> 0x05c8 }
            r4.<init>()     // Catch:{ Exception -> 0x05c8 }
            int r5 = r3.mo125249a(r0)     // Catch:{ Exception -> 0x05c8 }
            r4.SetID(r5)     // Catch:{ Exception -> 0x05c8 }
            int r5 = r2 + 53
            r4.SetKey(r5)     // Catch:{ Exception -> 0x05c8 }
            long r5 = (long) r6     // Catch:{ Exception -> 0x05c8 }
            r4.SetValue(r5)     // Catch:{ Exception -> 0x05c8 }
            long r5 = r4.GetValue()     // Catch:{ Exception -> 0x05c8 }
            int r7 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r7 <= 0) goto L_0x04e6
            r1.add(r4)     // Catch:{ Exception -> 0x05c8 }
            com.tencent.mars.smc.IDKey r4 = new com.tencent.mars.smc.IDKey     // Catch:{ Exception -> 0x05c8 }
            r4.<init>()     // Catch:{ Exception -> 0x05c8 }
            int r0 = r3.mo125249a(r0)     // Catch:{ Exception -> 0x05c8 }
            r4.SetID(r0)     // Catch:{ Exception -> 0x05c8 }
            int r2 = r2 + 58
            r4.SetKey(r2)     // Catch:{ Exception -> 0x05c8 }
            r2 = 1
            r4.SetValue(r2)     // Catch:{ Exception -> 0x05c8 }
            r1.add(r4)     // Catch:{ Exception -> 0x05c8 }
        L_0x04e6:
            kj2.d r0 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x05c8 }
            r2 = 0
            r0.mo160124a(r1, r2)     // Catch:{ Exception -> 0x05c8 }
            goto L_0x058f
        L_0x04ee:
            r0 = move-exception
        L_0x04ef:
            r12 = r10
            goto L_0x05cf
        L_0x04f2:
            r23 = r7
            r20 = r9
            r22 = r12
            r12 = r10
            boolean r1 = r11 instanceof p986je.C87952a     // Catch:{ Exception -> 0x05c8 }
            if (r1 == 0) goto L_0x0557
            kj2.d r1 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x05c8 }
            int r0 = r3.mo125249a(r0)     // Catch:{ Exception -> 0x05c8 }
            long r2 = (long) r0     // Catch:{ Exception -> 0x05c8 }
            r32 = 30
            r34 = 1
            r36 = 0
            r29 = r1
            r30 = r2
            r29.idkeyStat(r30, r32, r34, r36)     // Catch:{ Exception -> 0x05c8 }
            java.lang.String r0 = "path"
            java.lang.String r0 = r8.getString(r0)     // Catch:{ Exception -> 0x05c8 }
            java.lang.String r2 = "stack"
            java.lang.String r2 = r8.getString(r2)     // Catch:{ Exception -> 0x05c8 }
            java.lang.String r3 = "cost"
            long r3 = r8.getLong(r3)     // Catch:{ Exception -> 0x05c8 }
            java.lang.String r5 = "size"
            long r5 = r8.getLong(r5)     // Catch:{ Exception -> 0x05c8 }
            java.lang.String r7 = "opType"
            int r7 = r8.getInt(r7)     // Catch:{ Exception -> 0x05c8 }
            r9 = 23047(0x5a07, float:3.2296E-41)
            r10 = 5
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x05c8 }
            r11 = 0
            r10[r11] = r0     // Catch:{ Exception -> 0x05c8 }
            r11 = 1
            r10[r11] = r2     // Catch:{ Exception -> 0x05c8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x05c8 }
            r2 = 2
            r10[r2] = r0     // Catch:{ Exception -> 0x05c8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x05c8 }
            r2 = 3
            r10[r2] = r0     // Catch:{ Exception -> 0x05c8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x05c8 }
            r2 = 4
            r10[r2] = r0     // Catch:{ Exception -> 0x05c8 }
            r1.mo160131h(r9, r10)     // Catch:{ Exception -> 0x05c8 }
            goto L_0x058f
        L_0x0557:
            boolean r1 = r11 instanceof com.tencent.matrix.resource.C80530h     // Catch:{ Exception -> 0x05c8 }
            if (r1 == 0) goto L_0x058f
            kj2.d r1 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x05c8 }
            int r2 = r3.mo125249a(r0)     // Catch:{ Exception -> 0x05c8 }
            long r4 = (long) r2     // Catch:{ Exception -> 0x05c8 }
            r32 = 33
            r34 = 1
            r36 = 0
            r29 = r1
            r30 = r4
            r29.idkeyStat(r30, r32, r34, r36)     // Catch:{ Exception -> 0x05c8 }
            java.lang.String r2 = "activity"
            java.lang.String r2 = r8.getString(r2)     // Catch:{ Exception -> 0x05c8 }
            java.lang.String r4 = "SnsTimeLineUI"
            boolean r2 = r2.endsWith(r4)     // Catch:{ Exception -> 0x05c8 }
            if (r2 == 0) goto L_0x058f
            int r0 = r3.mo125249a(r0)     // Catch:{ Exception -> 0x05c8 }
            long r2 = (long) r0     // Catch:{ Exception -> 0x05c8 }
            r32 = 34
            r34 = 1
            r36 = 1
            r29 = r1
            r30 = r2
            r29.idkeyStat(r30, r32, r34, r36)     // Catch:{ Exception -> 0x05c8 }
        L_0x058f:
            r0 = 0
        L_0x0590:
            if (r0 != 0) goto L_0x05e3
            java.lang.String r0 = "io"
            r1 = r23
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ Exception -> 0x05c8 }
            if (r0 != 0) goto L_0x05e3
            java.lang.String r0 = "sqlitelint"
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ Exception -> 0x05c8 }
            if (r0 != 0) goto L_0x05e3
            java.lang.String r0 = "battery"
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ Exception -> 0x05c8 }
            if (r0 == 0) goto L_0x05ae
            goto L_0x05e3
        L_0x05ae:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x05c8 }
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x05c8 }
            r3 = 0
            r2[r3] = r1     // Catch:{ Exception -> 0x05c8 }
            int r1 = qe3.C89625d.f257841g     // Catch:{ Exception -> 0x05c8 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x05c8 }
            r3 = 1
            r2[r3] = r1     // Catch:{ Exception -> 0x05c8 }
            r1 = 2
            r2[r1] = r22     // Catch:{ Exception -> 0x05c8 }
            r1 = 17108(0x42d4, float:2.3973E-41)
            r0.mo160131h(r1, r2)     // Catch:{ Exception -> 0x05c8 }
            goto L_0x05e3
        L_0x05c8:
            r0 = move-exception
            goto L_0x05cf
        L_0x05ca:
            r0 = move-exception
            r20 = r9
            goto L_0x04ef
        L_0x05cf:
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            if (r8 == 0) goto L_0x05d9
            java.lang.String r9 = r8.toString()
            goto L_0x05db
        L_0x05d9:
            r9 = r20
        L_0x05db:
            r2 = 0
            r1[r2] = r9
            java.lang.String r2 = "data:%s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r2, r1)
        L_0x05e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r70.C89888c.mo124179e(xe.g, java.lang.String):void");
    }

    public String toString() {
        return "clientVersion=" + this.f258337c + " revision=" + this.f258338d + " isDebug=" + this.f258339e + " publishType" + this.f258340f;
    }
}
