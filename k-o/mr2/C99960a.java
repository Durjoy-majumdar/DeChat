package mr2;

import android.os.CancellationSignal;
import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import eb0.C75592q0;
import jr2.C99019x;
import os2.C100400e0;
import p749xh.C102661q8;

/* renamed from: mr2.a */
public class C99960a {

    /* renamed from: mr2.a$a */
    public class C99961a implements CancellationSignal.OnCancelListener {

        /* renamed from: a */
        public final /* synthetic */ com.tencent.wcdb.support.CancellationSignal f292897a;

        public C99961a(com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
            this.f292897a = cancellationSignal;
        }

        public void onCancel() {
            SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.clean.SnsCleanStorageManager$1");
            Log.m105920e("MicroMsg.SnsCleanStorageManager", "cleanSnsTablesByTimeLimit calcDbExpire cancel.");
            this.f292897a.cancel();
            SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.clean.SnsCleanStorageManager$1");
        }
    }

    /* renamed from: mr2.a$b */
    public class C99962b implements CancellationSignal.OnCancelListener {

        /* renamed from: a */
        public final /* synthetic */ com.tencent.wcdb.support.CancellationSignal f292898a;

        public C99962b(com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
            this.f292898a = cancellationSignal;
        }

        public void onCancel() {
            SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.clean.SnsCleanStorageManager$2");
            Log.m105920e("MicroMsg.SnsCleanStorageManager", "cleanSnsTablesByTimeLimit calcDbExpire cancel.");
            this.f292898a.cancel();
            SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.clean.SnsCleanStorageManager$2");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0094, code lost:
        r5 = r5.f348991a.mo119945q(r5.f348992b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01d7, code lost:
        if (r0 < 0) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x02ac, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x02ad, code lost:
        r42 = r4;
        r34 = r10;
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x02b3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x02b4, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, "cleanSnsTablesByTimeLimit calcDbExpire delete failed, e:%s.", r0);
        com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE.mo175911u(150, 114);
        com.tencent.p014mm.plugin.sns.model.C94866e1.Xx0().mo139781TO();
        r11.f265955d = 3;
        r11.f265960i = android.os.SystemClock.uptimeMillis() - r16;
        r11.mo86054n();
        r12.encode("SnsMMKVCleanDbFailTime", r9 + 1);
        r12.encode(r2, r1);
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x02e8, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x04dd  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x02b3 A[ExcHandler: Exception (r0v25 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:49:0x0299] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0435  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0438  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x044e  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0451  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0467  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x046a  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0499  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x049c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m130597b(android.os.CancellationSignal r51, long r52, long r54, long r56, long r58, long r60) {
        /*
            r0 = r51
            r1 = r54
            r3 = r56
            r5 = r58
            r7 = r60
            java.lang.Class<h81.h> r9 = h81.C32735h.class
            java.lang.String r10 = "cleanSnsTablesByTimeLimit"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.clean.SnsCleanStorageManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r11)
            java.lang.String r12 = "SnsMMKV"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r12 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r12)
            java.lang.String r13 = "SnsMMKVSnsUI"
            r14 = 0
            boolean r13 = r12.getBoolean(r13, r14)
            java.lang.String r15 = "MicroMsg.SnsCleanStorageManager"
            if (r13 == 0) goto L_0x002d
            java.lang.String r0 = "cleanSnsTablesByTimeLimit in SnsUI, exit clean."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            return
        L_0x002d:
            lo2.C99522b.m129875a()
            long r16 = android.os.SystemClock.uptimeMillis()
            r13 = r15
            long r14 = java.lang.System.currentTimeMillis()
            os2.e0 r19 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            r20 = r13
            r21 = r14
            long r13 = r19.h30()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            f40.C86709a0.m107528h()
            f40.o r5 = f40.C86709a0.m107535s()
            java.lang.String r5 = r5.f251807e
            r15.append(r5)
            java.lang.String r5 = "SnsMicroMsg.db"
            r15.append(r5)
            java.lang.String r6 = r15.toString()
            android.net.Uri r6 = com.tencent.p014mm.vfs.C116299g2.m163858n(r6)
            java.lang.String r15 = r6.getPath()
            r19 = r5
            if (r15 == 0) goto L_0x0086
            r5 = 0
            java.lang.String r15 = com.tencent.p014mm.vfs.C116299g2.m163855k(r15, r5, r5)
            java.lang.String r5 = r6.getPath()
            boolean r5 = r5.equals(r15)
            if (r5 != 0) goto L_0x0086
            android.net.Uri$Builder r5 = r6.buildUpon()
            android.net.Uri$Builder r5 = r5.path(r15)
            android.net.Uri r6 = r5.build()
        L_0x0086:
            com.tencent.mm.vfs.f0 r5 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r15 = 0
            com.tencent.mm.vfs.f0$h r5 = r5.mo177799l(r6, r15)
            boolean r6 = r5.mo177810a()
            if (r6 != 0) goto L_0x0094
            goto L_0x009e
        L_0x0094:
            com.tencent.mm.vfs.FileSystem$c r6 = r5.f348991a
            java.lang.String r5 = r5.f348992b
            com.tencent.mm.vfs.b0 r5 = r6.mo119945q(r5)
            if (r5 != 0) goto L_0x00a1
        L_0x009e:
            r5 = 0
            goto L_0x00a3
        L_0x00a1:
            long r5 = r5.f250473c
        L_0x00a3:
            r15 = 2
            java.lang.Object[] r7 = new java.lang.Object[r15]
            java.lang.Long r8 = java.lang.Long.valueOf(r13)
            r18 = 0
            r7[r18] = r8
            r26 = 1024(0x400, double:5.06E-321)
            long r28 = r5 / r26
            long r30 = r28 / r26
            java.lang.Long r8 = java.lang.Long.valueOf(r30)
            r15 = 1
            r7[r15] = r8
            java.lang.String r8 = "cleanSnsTablesByTimeLimit calcDbSize. originSnsDbCount:%s, originSnsDbSize:%s MB"
            r15 = r20
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r8, r7)
            java.lang.String r7 = "SnsMMKVCleanDbCount"
            r12.encode((java.lang.String) r7, (long) r13)
            com.tencent.mm.autogen.mmdata.rpt.SnsCleanDbReportStruct r8 = new com.tencent.mm.autogen.mmdata.rpt.SnsCleanDbReportStruct
            r8.<init>()
            r8.f265956e = r13
            r8.f265958g = r5
            r8.f265969r = r3
            r20 = r7
            r7 = 1
            r8.f265966o = r7
            r8.mo86054n()
            java.lang.String r7 = "SnsMMKVCleanDbReport"
            java.lang.String r8 = ""
            java.lang.String r1 = r12.getString(r7, r8)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            r4 = 150(0x96, float:2.1E-43)
            java.lang.String r3 = "SnsMMKVCleanDbFailTime"
            if (r2 != 0) goto L_0x0129
            os2.d0 r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Xx0()
            r2.mo139781TO()
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r0 = 115(0x73, float:1.61E-43)
            r2.mo175911u(r4, r0)
            com.tencent.mm.autogen.mmdata.rpt.SnsCleanDbReportStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.SnsCleanDbReportStruct
            r0.<init>(r1)
            r1 = 5
            r0.f265955d = r1
            long r1 = r0.f265956e
            long r1 = r1 - r13
            r0.f265957f = r1
            long r1 = r0.f265958g
            long r1 = r1 - r5
            r0.f265959h = r1
            r0.mo86054n()
            r1 = 0
            int r2 = r12.getInt(r3, r1)
            r4 = 1
            int r2 = r2 + r4
            r12.encode((java.lang.String) r3, (int) r2)
            r12.encode((java.lang.String) r7, (java.lang.String) r8)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r0 = r0.mo1005p()
            r2[r1] = r0
            java.lang.String r0 = "cleanSnsTablesByTimeLimit lastTime error exit. %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r0, r2)
        L_0x0129:
            di3.d r0 = di3.C86312j.m106911c(r9)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_sns_clean_db_switch
            java.lang.String r2 = "1"
            java.lang.String r0 = r0.Y60(r1, r2)
            r1 = 1
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r1)
            if (r0 > 0) goto L_0x0147
            java.lang.String r0 = "cleanSnsTablesByTimeLimit cleanDbSwitch not enable."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            return
        L_0x0147:
            di3.d r0 = di3.C86312j.m106911c(r9)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_sns_sql_trace_clean_count_limit
            r2 = r7
            r4 = r8
            r7 = 0
            long r0 = r0.mo58777He(r1, r7)
            int r34 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r34 <= 0) goto L_0x017c
            java.lang.String r7 = "SnsMMKVCleanDbSQLREPORTTIME"
            r8 = 0
            int r7 = r12.getInt(r7, r8)
            r34 = r9
            long r8 = (long) r7
            int r35 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r35 >= 0) goto L_0x017e
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "cleanSnsTablesByTimeLimit count:%s not enable."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r1, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            return
        L_0x017c:
            r34 = r9
        L_0x017e:
            di3.d r0 = di3.C86312j.m106911c(r34)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_sns_clean_db_clean_limit_count
            java.lang.String r7 = "10000"
            java.lang.String r0 = r0.Y60(r1, r7)
            r7 = 10000(0x2710, double:4.9407E-320)
            long r38 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r0, r7)
            di3.d r0 = di3.C86312j.m106911c(r34)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_sns_clean_db_time
            r7 = -1
            long r0 = r0.mo58777He(r1, r7)
            r7 = 0
            int r9 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x01b7
            r9 = 1
            java.lang.Object[] r7 = new java.lang.Object[r9]
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            r9 = 0
            r7[r9] = r8
            java.lang.String r8 = "use clicfgTimeLimit:%d min"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r8, r7)
            goto L_0x01b9
        L_0x01b7:
            r0 = r52
        L_0x01b9:
            r7 = 10080(0x2760, double:4.98E-320)
            r24 = 0
            int r9 = (r0 > r24 ? 1 : (r0 == r24 ? 0 : -1))
            if (r9 >= 0) goto L_0x01da
            di3.d r0 = di3.C86312j.m106911c(r34)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_sns_clean_db_time_limit
            java.lang.String r9 = java.lang.Long.toString(r7)
            java.lang.String r0 = r0.Y60(r1, r9)
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r0, r7)
            int r9 = (r0 > r24 ? 1 : (r0 == r24 ? 0 : -1))
            if (r9 >= 0) goto L_0x01da
            goto L_0x01db
        L_0x01da:
            r7 = r0
        L_0x01db:
            com.tencent.wcdb.support.CancellationSignal r0 = new com.tencent.wcdb.support.CancellationSignal
            r0.<init>()
            java.lang.String r1 = "cleanSnsTablesByTimeLimit calcDbExpire cancel."
            r9 = r51
            if (r9 == 0) goto L_0x01f6
            boolean r34 = r51.isCanceled()
            if (r34 == 0) goto L_0x01f6
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r1)
            r0.cancel()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            return
        L_0x01f6:
            r34 = r10
            mr2.a$a r10 = new mr2.a$a
            r10.<init>(r0)
            r9.setOnCancelListener(r10)
            java.lang.String r10 = "cleanSnsTablesByTimeLimit start."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r10)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 111(0x6f, float:1.56E-43)
            r42 = r11
            r11 = 150(0x96, float:2.1E-43)
            r10.mo175911u(r11, r9)
            java.lang.String r9 = "SnsMMKVCleanDbIsFirstTime"
            r43 = r4
            r11 = 1
            boolean r4 = r12.getBoolean(r9, r11)
            r52 = r9
            r11 = 0
            int r9 = r12.getInt(r3, r11)
            com.tencent.mm.autogen.mmdata.rpt.SnsCleanDbReportStruct r11 = new com.tencent.mm.autogen.mmdata.rpt.SnsCleanDbReportStruct
            r11.<init>()
            r11.f265956e = r13
            r11.f265958g = r5
            r44 = r5
            r32 = 5
            r5 = r56
            r11.f265969r = r5
            r5 = r54
            r11.f265970s = r5
            r5 = r60
            r11.f265971t = r5
            r5 = r58
            r11.f265972u = r5
            r11.f265962k = r7
            r11.f265963l = r4
            r5 = r21
            r11.f265964m = r5
            r53 = r4
            r4 = 0
            r11.f265966o = r4
            r11.f265967p = r9
            java.lang.String r4 = r11.mo1005p()
            r12.encode((java.lang.String) r2, (java.lang.String) r4)
            long r21 = java.lang.System.currentTimeMillis()
            r35 = 60
            long r35 = r35 * r7
            r46 = 1000(0x3e8, double:4.94E-321)
            long r35 = r35 * r46
            long r21 = r21 - r35
            long r36 = r21 / r46
            boolean r4 = r51.isCanceled()
            if (r4 == 0) goto L_0x0293
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r1)
            r0 = 113(0x71, float:1.58E-43)
            r1 = 150(0x96, float:2.1E-43)
            r10.mo175911u(r1, r0)
            r1 = 2
            r11.f265955d = r1
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r16
            r11.f265960i = r0
            r11.mo86054n()
            r1 = 1
            int r9 = r9 + r1
            r12.encode((java.lang.String) r3, (int) r9)
            r1 = r43
            r12.encode((java.lang.String) r2, (java.lang.String) r1)
            r10 = r34
            r4 = r42
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r4)
            return
        L_0x0293:
            r10 = r34
            r4 = r42
            r1 = r43
            os2.e0 r35 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()     // Catch:{ OperationCanceledException -> 0x02e9, Exception -> 0x02b3 }
            java.lang.String r40 = eb0.C75592q0.m90789s()     // Catch:{ OperationCanceledException -> 0x02ac, Exception -> 0x02b3 }
            r41 = r0
            r35.mo139812Yt(r36, r38, r40, r41)     // Catch:{ OperationCanceledException -> 0x02ac, Exception -> 0x02b3 }
            r42 = r4
            r34 = r10
            r0 = 0
            goto L_0x030d
        L_0x02ac:
            r0 = move-exception
            r42 = r4
            r34 = r10
            r4 = 1
            goto L_0x02ef
        L_0x02b3:
            r0 = move-exception
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r5 = 0
            r6[r5] = r0
            java.lang.String r0 = "cleanSnsTablesByTimeLimit calcDbExpire delete failed, e:%s."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r0, r6)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 114(0x72, float:1.6E-43)
            r6 = 150(0x96, float:2.1E-43)
            r0.mo175911u(r6, r5)
            os2.d0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Xx0()
            r0.mo139781TO()
            r0 = 3
            r11.f265955d = r0
            long r5 = android.os.SystemClock.uptimeMillis()
            long r5 = r5 - r16
            r11.f265960i = r5
            r11.mo86054n()
            r5 = 1
            int r9 = r9 + r5
            r12.encode((java.lang.String) r3, (int) r9)
            r12.encode((java.lang.String) r2, (java.lang.String) r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r4)
            return
        L_0x02e9:
            r0 = move-exception
            r42 = r4
            r4 = 1
            r34 = r10
        L_0x02ef:
            java.lang.Object[] r10 = new java.lang.Object[r4]
            r4 = 0
            r10[r4] = r0
            java.lang.String r0 = "cleanSnsTablesByTimeLimit calcDbExpire delete cancel, e:%s."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r0, r10)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 117(0x75, float:1.64E-43)
            r10 = 150(0x96, float:2.1E-43)
            r0.mo175911u(r10, r4)
            r0 = 6
            r11.f265955d = r0
            java.lang.String r0 = r11.mo1005p()
            r12.encode((java.lang.String) r2, (java.lang.String) r0)
            r0 = 1
        L_0x030d:
            if (r0 != 0) goto L_0x032a
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 112(0x70, float:1.57E-43)
            r21 = r3
            r3 = 150(0x96, float:2.1E-43)
            r4.mo175911u(r3, r10)
            r3 = 1
            r11.f265955d = r3
            java.lang.String r3 = r11.mo1005p()
            r12.encode((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r3 = "cleanSnsTablesByTimeLimit delete db finish."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r3)
            goto L_0x032c
        L_0x032a:
            r21 = r3
        L_0x032c:
            os2.d0 r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.Xx0()
            r3.mo139781TO()
            os2.e0 r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            long r3 = r3.h30()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            f40.C86709a0.m107528h()
            r22 = r9
            f40.o r9 = f40.C86709a0.m107535s()
            java.lang.String r9 = r9.f251807e
            r10.append(r9)
            r9 = r19
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            android.net.Uri r9 = com.tencent.p014mm.vfs.C116299g2.m163858n(r9)
            java.lang.String r10 = r9.getPath()
            r43 = r1
            if (r10 == 0) goto L_0x037e
            r1 = 0
            java.lang.String r10 = com.tencent.p014mm.vfs.C116299g2.m163855k(r10, r1, r1)
            java.lang.String r1 = r9.getPath()
            boolean r1 = r1.equals(r10)
            if (r1 != 0) goto L_0x037e
            android.net.Uri$Builder r1 = r9.buildUpon()
            android.net.Uri$Builder r1 = r1.path(r10)
            android.net.Uri r9 = r1.build()
        L_0x037e:
            com.tencent.mm.vfs.f0 r1 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r10 = 0
            com.tencent.mm.vfs.f0$h r1 = r1.mo177799l(r9, r10)
            boolean r9 = r1.mo177810a()
            if (r9 != 0) goto L_0x038c
            goto L_0x0396
        L_0x038c:
            com.tencent.mm.vfs.FileSystem$c r9 = r1.f348991a
            java.lang.String r1 = r1.f348992b
            com.tencent.mm.vfs.b0 r1 = r9.mo119945q(r1)
            if (r1 != 0) goto L_0x0399
        L_0x0396:
            r9 = 0
            goto L_0x039b
        L_0x0399:
            long r9 = r1.f250473c
        L_0x039b:
            r1 = r20
            r12.encode((java.lang.String) r1, (long) r3)
            long r19 = android.os.SystemClock.uptimeMillis()
            r23 = r2
            long r1 = r19 - r16
            r16 = r11
            java.lang.String r11 = "SnsMMKVCleanDbLastCleanTime"
            r19 = r1
            r1 = 0
            long r35 = r12.getLong(r11, r1)
            int r11 = (r35 > r1 ? 1 : (r35 == r1 ? 0 : -1))
            if (r11 <= 0) goto L_0x03bb
            long r1 = r5 - r35
            goto L_0x03bd
        L_0x03bb:
            r1 = 0
        L_0x03bd:
            r11 = 11
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r17 = r0 ^ 1
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r17)
            r18 = 0
            r11[r18] = r17
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = 1
            r11[r8] = r7
            java.lang.Long r7 = java.lang.Long.valueOf(r13)
            r8 = 2
            r11[r8] = r7
            r7 = 3
            java.lang.Long r8 = java.lang.Long.valueOf(r3)
            r11[r7] = r8
            r7 = 4
            long r3 = r13 - r3
            java.lang.Long r8 = java.lang.Long.valueOf(r3)
            r11[r7] = r8
            java.lang.Long r7 = java.lang.Long.valueOf(r28)
            r11[r32] = r7
            r7 = 6
            long r32 = r9 / r26
            java.lang.Long r8 = java.lang.Long.valueOf(r32)
            r11[r7] = r8
            r7 = 7
            long r8 = r44 - r9
            long r26 = r8 / r26
            java.lang.Long r10 = java.lang.Long.valueOf(r26)
            r11[r7] = r10
            r7 = 8
            java.lang.Long r10 = java.lang.Long.valueOf(r19)
            r11[r7] = r10
            r7 = 9
            long r32 = r1 / r46
            java.lang.Long r10 = java.lang.Long.valueOf(r32)
            r11[r7] = r10
            r7 = 10
            java.lang.Long r10 = java.lang.Long.valueOf(r5)
            r11[r7] = r10
            java.lang.String r7 = "cleanSnsTablesByTimeLimit finish, isFinish:%s, limit:%s min, SnsDbCount[%s, %s, diff:%s], SnsDbSize[%s, %s, diff:%s kb], costTime:%s ms, timeSinceLastClean:%s s, startTime:%s ms"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r7, r11)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            com.tencent.mars.smc.IDKey r10 = new com.tencent.mars.smc.IDKey
            r36 = 150(0x96, double:7.4E-322)
            r38 = 121(0x79, double:6.0E-322)
            r32 = 1
            r24 = 0
            int r11 = (r13 > r24 ? 1 : (r13 == r24 ? 0 : -1))
            if (r11 > 0) goto L_0x0438
            r40 = r32
            goto L_0x043a
        L_0x0438:
            r40 = r13
        L_0x043a:
            r35 = r10
            r35.<init>((long) r36, (long) r38, (long) r40)
            r7.add(r10)
            com.tencent.mars.smc.IDKey r10 = new com.tencent.mars.smc.IDKey
            r45 = 150(0x96, double:7.4E-322)
            r47 = 122(0x7a, double:6.03E-322)
            r13 = 0
            int r11 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r11 > 0) goto L_0x0451
            r49 = r32
            goto L_0x0453
        L_0x0451:
            r49 = r3
        L_0x0453:
            r44 = r10
            r44.<init>((long) r45, (long) r47, (long) r49)
            r7.add(r10)
            com.tencent.mars.smc.IDKey r10 = new com.tencent.mars.smc.IDKey
            r36 = 150(0x96, double:7.4E-322)
            r38 = 123(0x7b, double:6.1E-322)
            r13 = 0
            int r11 = (r28 > r13 ? 1 : (r28 == r13 ? 0 : -1))
            if (r11 > 0) goto L_0x046a
            r40 = r32
            goto L_0x046c
        L_0x046a:
            r40 = r28
        L_0x046c:
            r35 = r10
            r35.<init>((long) r36, (long) r38, (long) r40)
            r7.add(r10)
            com.tencent.mars.smc.IDKey r10 = new com.tencent.mars.smc.IDKey
            r45 = 150(0x96, double:7.4E-322)
            r47 = 124(0x7c, double:6.13E-322)
            r13 = 0
            int r11 = (r26 > r13 ? 1 : (r26 == r13 ? 0 : -1))
            if (r11 > 0) goto L_0x0483
            r49 = r32
            goto L_0x0485
        L_0x0483:
            r49 = r26
        L_0x0485:
            r44 = r10
            r44.<init>((long) r45, (long) r47, (long) r49)
            r7.add(r10)
            com.tencent.mars.smc.IDKey r10 = new com.tencent.mars.smc.IDKey
            r36 = 150(0x96, double:7.4E-322)
            r38 = 126(0x7e, double:6.23E-322)
            r13 = 0
            int r11 = (r19 > r13 ? 1 : (r19 == r13 ? 0 : -1))
            if (r11 > 0) goto L_0x049c
            r40 = r32
            goto L_0x049e
        L_0x049c:
            r40 = r19
        L_0x049e:
            r35 = r10
            r35.<init>((long) r36, (long) r38, (long) r40)
            r7.add(r10)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 0
            r10.mo160124a(r7, r11)
            r7 = r16
            r7.f265957f = r3
            r7.f265959h = r8
            r3 = r19
            r7.f265960i = r3
            r3 = r54
            r8 = r56
            r7.f265969r = r8
            r7.f265970s = r3
            r3 = r58
            r8 = r60
            r7.f265971t = r8
            r7.f265972u = r3
            r7.f265965n = r1
            r7.mo86054n()
            r2 = r23
            r1 = r43
            r12.encode((java.lang.String) r2, (java.lang.String) r1)
            if (r0 == 0) goto L_0x04dd
            r1 = 1
            int r9 = r22 + 1
            r1 = r21
            r12.encode((java.lang.String) r1, (int) r9)
            goto L_0x04ea
        L_0x04dd:
            r1 = r21
            r2 = 0
            r12.encode((java.lang.String) r1, (int) r2)
            if (r53 == 0) goto L_0x04ea
            r1 = r52
            r12.encode((java.lang.String) r1, (boolean) r2)
        L_0x04ea:
            java.lang.String r0 = "SnsMMKVCleanDbLastCleanTime"
            r12.encode((java.lang.String) r0, (long) r5)
            r2 = r34
            r1 = r42
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mr2.C99960a.m130597b(android.os.CancellationSignal, long, long, long, long, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0071, code lost:
        r12 = r12.f348991a.mo119945q(r12.f348992b);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m130598c(android.os.CancellationSignal r52, long r53) {
        /*
            r0 = r52
            r1 = r53
            java.lang.String r3 = "testCleanSnsTablesByTimeLimit"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.clean.SnsCleanStorageManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            java.lang.String r5 = "SnsMMKV"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r5)
            long r6 = android.os.SystemClock.uptimeMillis()
            long r8 = java.lang.System.currentTimeMillis()
            os2.e0 r10 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            long r10 = r10.h30()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            f40.C86709a0.m107528h()
            f40.o r13 = f40.C86709a0.m107535s()
            java.lang.String r13 = r13.f251807e
            r12.append(r13)
            java.lang.String r13 = "SnsMicroMsg.db"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            android.net.Uri r12 = com.tencent.p014mm.vfs.C116299g2.m163858n(r12)
            java.lang.String r14 = r12.getPath()
            r15 = 0
            if (r14 == 0) goto L_0x0061
            java.lang.String r14 = com.tencent.p014mm.vfs.C116299g2.m163855k(r14, r15, r15)
            java.lang.String r15 = r12.getPath()
            boolean r15 = r15.equals(r14)
            if (r15 != 0) goto L_0x0061
            android.net.Uri$Builder r12 = r12.buildUpon()
            android.net.Uri$Builder r12 = r12.path(r14)
            android.net.Uri r12 = r12.build()
        L_0x0061:
            com.tencent.mm.vfs.f0 r14 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r15 = 0
            com.tencent.mm.vfs.f0$h r12 = r14.mo177799l(r12, r15)
            boolean r14 = r12.mo177810a()
            r17 = r6
            if (r14 != 0) goto L_0x0071
            goto L_0x007b
        L_0x0071:
            com.tencent.mm.vfs.FileSystem$c r14 = r12.f348991a
            java.lang.String r12 = r12.f348992b
            com.tencent.mm.vfs.b0 r12 = r14.mo119945q(r12)
            if (r12 != 0) goto L_0x007e
        L_0x007b:
            r6 = 0
            goto L_0x0080
        L_0x007e:
            long r6 = r12.f250473c
        L_0x0080:
            r12 = 2
            java.lang.Object[] r14 = new java.lang.Object[r12]
            java.lang.Long r20 = java.lang.Long.valueOf(r10)
            r16 = 0
            r14[r16] = r20
            r20 = 1024(0x400, double:5.06E-321)
            long r22 = r6 / r20
            long r24 = r22 / r20
            java.lang.Long r24 = java.lang.Long.valueOf(r24)
            r15 = 1
            r14[r15] = r24
            java.lang.String r12 = "MicroMsg.SnsCleanStorageManager"
            java.lang.String r15 = "cleanSnsTablesByTimeLimit calcDbSize. originSnsDbCount:%s, originSnsDbSize:%s MB"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r15, r14)
            java.lang.String r14 = "SnsMMKVCleanDbCount"
            r5.encode((java.lang.String) r14, (long) r10)
            com.tencent.mm.autogen.mmdata.rpt.SnsCleanDbReportStruct r15 = new com.tencent.mm.autogen.mmdata.rpt.SnsCleanDbReportStruct
            r15.<init>()
            r15.f265956e = r10
            r15.f265958g = r6
            r27 = r14
            r14 = 1
            r15.f265966o = r14
            r15.mo86054n()
            java.lang.String r14 = "SnsMMKVCleanDbReport"
            java.lang.String r15 = ""
            r28 = r13
            java.lang.String r13 = r5.getString(r14, r15)
            boolean r29 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            r30 = r8
            r9 = 150(0x96, float:2.1E-43)
            java.lang.String r8 = "SnsMMKVCleanDbFailTime"
            if (r29 != 0) goto L_0x010c
            os2.d0 r29 = com.tencent.p014mm.plugin.sns.model.C94866e1.Xx0()
            r29.mo139781TO()
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 115(0x73, float:1.61E-43)
            r1.mo175911u(r9, r2)
            com.tencent.mm.autogen.mmdata.rpt.SnsCleanDbReportStruct r1 = new com.tencent.mm.autogen.mmdata.rpt.SnsCleanDbReportStruct
            r1.<init>(r13)
            r2 = 5
            r1.f265955d = r2
            r33 = r10
            long r9 = r1.f265956e
            long r9 = r9 - r33
            r1.f265957f = r9
            long r9 = r1.f265958g
            long r9 = r9 - r6
            r1.f265959h = r9
            r1.mo86054n()
            r9 = 0
            int r10 = r5.getInt(r8, r9)
            r11 = 1
            int r10 = r10 + r11
            r5.encode((java.lang.String) r8, (int) r10)
            r5.encode((java.lang.String) r14, (java.lang.String) r15)
            java.lang.Object[] r10 = new java.lang.Object[r11]
            java.lang.String r1 = r1.mo1005p()
            r10[r9] = r1
            java.lang.String r1 = "cleanSnsTablesByTimeLimit lastTime error exit. %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r1, r10)
            goto L_0x010e
        L_0x010c:
            r33 = r10
        L_0x010e:
            java.lang.Class<h81.h> r1 = h81.C32735h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r9 = h81.C32735h.C32737c.clicfg_sns_clean_db_clean_limit_count
            java.lang.String r10 = "10000"
            java.lang.String r1 = r1.Y60(r9, r10)
            r9 = 10000(0x2710, double:4.9407E-320)
            long r38 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r1, r9)
            com.tencent.wcdb.support.CancellationSignal r1 = new com.tencent.wcdb.support.CancellationSignal
            r1.<init>()
            java.lang.String r9 = "cleanSnsTablesByTimeLimit calcDbExpire cancel."
            if (r0 == 0) goto L_0x013d
            boolean r10 = r52.isCanceled()
            if (r10 == 0) goto L_0x013d
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r9)
            r1.cancel()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return
        L_0x013d:
            mr2.a$b r10 = new mr2.a$b
            r10.<init>(r1)
            r0.setOnCancelListener(r10)
            java.lang.String r10 = "cleanSnsTablesByTimeLimit start."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r10)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 111(0x6f, float:1.56E-43)
            r2 = 150(0x96, float:2.1E-43)
            r10.mo175911u(r2, r11)
            java.lang.String r11 = "SnsMMKVCleanDbIsFirstTime"
            r13 = 1
            boolean r2 = r5.getBoolean(r11, r13)
            r41 = r11
            r13 = 0
            int r11 = r5.getInt(r8, r13)
            com.tencent.mm.autogen.mmdata.rpt.SnsCleanDbReportStruct r13 = new com.tencent.mm.autogen.mmdata.rpt.SnsCleanDbReportStruct
            r13.<init>()
            r42 = r3
            r43 = r4
            r3 = r33
            r13.f265956e = r3
            r13.f265958g = r6
            r33 = r6
            r6 = r53
            r13.f265962k = r6
            r13.f265963l = r2
            r44 = r2
            r45 = r3
            r2 = r30
            r13.f265964m = r2
            r4 = 0
            r13.f265966o = r4
            r13.f265967p = r11
            java.lang.String r4 = r13.mo1005p()
            r5.encode((java.lang.String) r14, (java.lang.String) r4)
            long r30 = java.lang.System.currentTimeMillis()
            r35 = 60
            long r35 = r35 * r6
            r47 = 1000(0x3e8, double:4.94E-321)
            long r35 = r35 * r47
            long r30 = r30 - r35
            long r36 = r30 / r47
            boolean r0 = r52.isCanceled()
            if (r0 == 0) goto L_0x01ca
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r9)
            r0 = 113(0x71, float:1.58E-43)
            r1 = 150(0x96, float:2.1E-43)
            r10.mo175911u(r1, r0)
            r1 = 2
            r13.f265955d = r1
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r17
            r13.f265960i = r0
            r13.mo86054n()
            r1 = 1
            int r11 = r11 + r1
            r5.encode((java.lang.String) r8, (int) r11)
            r5.encode((java.lang.String) r14, (java.lang.String) r15)
            r9 = r42
            r4 = r43
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r4)
            return
        L_0x01ca:
            r9 = r42
            r4 = r43
            os2.e0 r35 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()     // Catch:{ OperationCanceledException -> 0x0211, Exception -> 0x01db }
            r40 = r1
            r35.mo139829qq(r36, r38, r40)     // Catch:{ OperationCanceledException -> 0x0211, Exception -> 0x01db }
            r0 = 0
            r10 = 150(0x96, float:2.1E-43)
            goto L_0x0231
        L_0x01db:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r1 = 0
            r2[r1] = r0
            java.lang.String r0 = "cleanSnsTablesByTimeLimit calcDbExpire delete failed, e:%s."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r0, r2)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 114(0x72, float:1.6E-43)
            r2 = 150(0x96, float:2.1E-43)
            r0.mo175911u(r2, r1)
            os2.d0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Xx0()
            r0.mo139781TO()
            r1 = 3
            r13.f265955d = r1
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r17
            r13.f265960i = r0
            r13.mo86054n()
            r1 = 1
            int r11 = r11 + r1
            r5.encode((java.lang.String) r8, (int) r11)
            r5.encode((java.lang.String) r14, (java.lang.String) r15)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r4)
            return
        L_0x0211:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r1 = 0
            r10[r1] = r0
            java.lang.String r0 = "cleanSnsTablesByTimeLimit calcDbExpire delete cancel, e:%s."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r0, r10)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 117(0x75, float:1.64E-43)
            r10 = 150(0x96, float:2.1E-43)
            r0.mo175911u(r10, r1)
            r1 = 6
            r13.f265955d = r1
            java.lang.String r0 = r13.mo1005p()
            r5.encode((java.lang.String) r14, (java.lang.String) r0)
            r0 = 1
        L_0x0231:
            if (r0 != 0) goto L_0x0249
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 112(0x70, float:1.57E-43)
            r1.mo175911u(r10, r6)
            r1 = 1
            r13.f265955d = r1
            java.lang.String r1 = r13.mo1005p()
            r5.encode((java.lang.String) r14, (java.lang.String) r1)
            java.lang.String r1 = "cleanSnsTablesByTimeLimit delete db finish."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
        L_0x0249:
            os2.d0 r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Xx0()
            r1.mo139781TO()
            os2.e0 r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            long r6 = r1.h30()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            f40.C86709a0.m107528h()
            f40.o r10 = f40.C86709a0.m107535s()
            java.lang.String r10 = r10.f251807e
            r1.append(r10)
            r10 = r28
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            android.net.Uri r1 = com.tencent.p014mm.vfs.C116299g2.m163858n(r1)
            java.lang.String r10 = r1.getPath()
            r43 = r4
            if (r10 == 0) goto L_0x0299
            r4 = 0
            java.lang.String r10 = com.tencent.p014mm.vfs.C116299g2.m163855k(r10, r4, r4)
            java.lang.String r4 = r1.getPath()
            boolean r4 = r4.equals(r10)
            if (r4 != 0) goto L_0x0299
            android.net.Uri$Builder r1 = r1.buildUpon()
            android.net.Uri$Builder r1 = r1.path(r10)
            android.net.Uri r1 = r1.build()
        L_0x0299:
            com.tencent.mm.vfs.f0 r4 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r10 = 0
            com.tencent.mm.vfs.f0$h r1 = r4.mo177799l(r1, r10)
            boolean r4 = r1.mo177810a()
            if (r4 != 0) goto L_0x02a7
            goto L_0x02b1
        L_0x02a7:
            com.tencent.mm.vfs.FileSystem$c r4 = r1.f348991a
            java.lang.String r1 = r1.f348992b
            com.tencent.mm.vfs.b0 r1 = r4.mo119945q(r1)
            if (r1 != 0) goto L_0x02b6
        L_0x02b1:
            r42 = r9
            r9 = 0
            goto L_0x02ba
        L_0x02b6:
            r42 = r9
            long r9 = r1.f250473c
        L_0x02ba:
            r1 = r27
            r5.encode((java.lang.String) r1, (long) r6)
            long r27 = android.os.SystemClock.uptimeMillis()
            r1 = r14
            r4 = r15
            long r14 = r27 - r17
            r17 = r8
            java.lang.String r8 = "SnsMMKVCleanDbLastCleanTime"
            r25 = r11
            r18 = r12
            r11 = 0
            long r27 = r5.getLong(r8, r11)
            int r8 = (r27 > r11 ? 1 : (r27 == r11 ? 0 : -1))
            if (r8 <= 0) goto L_0x02dc
            long r11 = r2 - r27
            goto L_0x02de
        L_0x02dc:
            r11 = 0
        L_0x02de:
            r8 = 11
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r27 = r0 ^ 1
            java.lang.Boolean r27 = java.lang.Boolean.valueOf(r27)
            r16 = 0
            r8[r16] = r27
            java.lang.Long r27 = java.lang.Long.valueOf(r53)
            r26 = 1
            r8[r26] = r27
            java.lang.Long r27 = java.lang.Long.valueOf(r45)
            r24 = 2
            r8[r24] = r27
            java.lang.Long r24 = java.lang.Long.valueOf(r6)
            r27 = 3
            r8[r27] = r24
            r24 = 4
            long r6 = r45 - r6
            java.lang.Long r27 = java.lang.Long.valueOf(r6)
            r8[r24] = r27
            java.lang.Long r24 = java.lang.Long.valueOf(r22)
            r27 = 5
            r8[r27] = r24
            long r27 = r9 / r20
            java.lang.Long r24 = java.lang.Long.valueOf(r27)
            r27 = 6
            r8[r27] = r24
            r24 = 7
            long r9 = r33 - r9
            long r20 = r9 / r20
            java.lang.Long r27 = java.lang.Long.valueOf(r20)
            r8[r24] = r27
            r24 = 8
            java.lang.Long r27 = java.lang.Long.valueOf(r14)
            r8[r24] = r27
            r24 = 9
            long r27 = r11 / r47
            java.lang.Long r27 = java.lang.Long.valueOf(r27)
            r8[r24] = r27
            r24 = 10
            java.lang.Long r27 = java.lang.Long.valueOf(r2)
            r8[r24] = r27
            r30 = r2
            java.lang.String r2 = "cleanSnsTablesByTimeLimit finish, isFinish:%s, limit:%s min, SnsDbCount[%s, %s, diff:%s], SnsDbSize[%s, %s, diff:%s kb], costTime:%s ms, timeSinceLastClean:%s s, startTime:%s ms"
            r3 = r18
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r8)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            r33 = 150(0x96, double:7.4E-322)
            r35 = 121(0x79, double:6.0E-322)
            r27 = 1
            r18 = 0
            int r8 = (r45 > r18 ? 1 : (r45 == r18 ? 0 : -1))
            if (r8 > 0) goto L_0x0365
            r37 = r27
            goto L_0x0367
        L_0x0365:
            r37 = r45
        L_0x0367:
            r32 = r3
            r32.<init>((long) r33, (long) r35, (long) r37)
            r2.add(r3)
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            r46 = 150(0x96, double:7.4E-322)
            r48 = 122(0x7a, double:6.03E-322)
            r18 = 0
            int r8 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r8 > 0) goto L_0x037e
            r50 = r27
            goto L_0x0380
        L_0x037e:
            r50 = r6
        L_0x0380:
            r45 = r3
            r45.<init>((long) r46, (long) r48, (long) r50)
            r2.add(r3)
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            r33 = 150(0x96, double:7.4E-322)
            r35 = 123(0x7b, double:6.1E-322)
            r18 = 0
            int r8 = (r22 > r18 ? 1 : (r22 == r18 ? 0 : -1))
            if (r8 > 0) goto L_0x0397
            r37 = r27
            goto L_0x0399
        L_0x0397:
            r37 = r22
        L_0x0399:
            r32 = r3
            r32.<init>((long) r33, (long) r35, (long) r37)
            r2.add(r3)
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            r46 = 150(0x96, double:7.4E-322)
            r48 = 124(0x7c, double:6.13E-322)
            r18 = 0
            int r8 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r8 > 0) goto L_0x03b0
            r50 = r27
            goto L_0x03b2
        L_0x03b0:
            r50 = r20
        L_0x03b2:
            r45 = r3
            r45.<init>((long) r46, (long) r48, (long) r50)
            r2.add(r3)
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            r33 = 150(0x96, double:7.4E-322)
            r35 = 126(0x7e, double:6.23E-322)
            r18 = 0
            int r8 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r8 > 0) goto L_0x03c9
            r37 = r27
            goto L_0x03cb
        L_0x03c9:
            r37 = r14
        L_0x03cb:
            r32 = r3
            r32.<init>((long) r33, (long) r35, (long) r37)
            r2.add(r3)
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 0
            r3.mo160124a(r2, r8)
            r13.f265957f = r6
            r13.f265959h = r9
            r13.f265960i = r14
            r13.f265965n = r11
            r13.mo86054n()
            r5.encode((java.lang.String) r1, (java.lang.String) r4)
            if (r0 == 0) goto L_0x03f2
            r1 = 1
            int r11 = r25 + 1
            r1 = r17
            r5.encode((java.lang.String) r1, (int) r11)
            goto L_0x03ff
        L_0x03f2:
            r1 = r17
            r2 = 0
            r5.encode((java.lang.String) r1, (int) r2)
            if (r44 == 0) goto L_0x03ff
            r1 = r41
            r5.encode((java.lang.String) r1, (boolean) r2)
        L_0x03ff:
            java.lang.String r0 = "SnsMMKVCleanDbLastCleanTime"
            r1 = r30
            r5.encode((java.lang.String) r0, (long) r1)
            r2 = r42
            r1 = r43
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mr2.C99960a.m130598c(android.os.CancellationSignal, long):void");
    }

    /* renamed from: a */
    public void mo139304a() {
        SnsMethodCalculate.markStartTimeMs("cleanSnsTables", "com.tencent.mm.plugin.sns.clean.SnsCleanStorageManager");
        Log.m105924i("MicroMsg.SnsCleanStorageManager", "cleanSnsTables.");
        MultiProcessMMKV.getMMKV("SnsMMKV").encode("SnsMMKVDeleteTable", true);
        C100400e0 Yx0 = C94866e1.Yx0();
        Yx0.getClass();
        SnsMethodCalculate.markStartTimeMs("deleteTable", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        long currentTimeMillis = System.currentTimeMillis();
        long j = 0;
        try {
            j = Yx0.f294108d.mo125613a();
            Yx0.f294108d.execSQL(C102661q8.TABLE_NAME, "DROP TABLE SnsInfo");
            Yx0.f294108d.execSQL(C102661q8.TABLE_NAME, C100400e0.f294092h[0]);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.SnsInfoStorage", "drop table Error :" + e.getMessage());
        } catch (Throwable th) {
            Yx0.f294108d.endTransaction(j);
            SnsMethodCalculate.markEndTimeMs("deleteTable", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            throw th;
        }
        Yx0.f294108d.endTransaction(j);
        Log.m105925i("MicroMsg.SnsInfoStorage", "deleteTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        SnsMethodCalculate.markEndTimeMs("deleteTable", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        C94866e1.Xx0().mo139781TO();
        ((C5431p1.C5432a) C99019x.m128970b()).mo6413d(2, C75592q0.m90789s(), true, true, 0);
        SnsMethodCalculate.markEndTimeMs("cleanSnsTables", "com.tencent.mm.plugin.sns.clean.SnsCleanStorageManager");
    }
}
