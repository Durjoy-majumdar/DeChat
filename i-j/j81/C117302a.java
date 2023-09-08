package j81;

import android.content.Context;
import android.os.SystemClock;
import androidx.camera.core.FocusMeteringAction;
import c91.C113256b;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import h81.C87460f;
import java.util.HashMap;
import java.util.List;
import k81.C117390a;
import k81.C117391b;
import k81.C117392c;
import m81.C117542c;
import p81.C35414a;
import p823sg.C77710q;
import q81.C35815a;
import qe3.C89625d;
import r81.C118226a;
import sf0.C90189z;
import t81.C118401a;
import t81.C118402b;
import t81.C118412l;
import t81.C118413m;
import u24.C90599h;
import u81.C118604a;
import v81.C118667b;
import w81.C90900a;
import x81.C118864a;
import y81.C91381b;
import z81.C91623a;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND})
/* renamed from: j81.a */
public class C117302a extends C86301e implements C118413m, C87460f {

    /* renamed from: d */
    public C118412l f351171d;

    /* renamed from: e */
    public C117392c f351172e;

    /* renamed from: f */
    public C117392c f351173f;

    /* renamed from: g */
    public C113256b f351174g;

    /* renamed from: h */
    public C118864a f351175h;

    /* renamed from: i */
    public C35414a f351176i;

    /* renamed from: j */
    public C35815a f351177j;

    /* renamed from: n */
    public C118226a f351178n;

    /* renamed from: o */
    public MMHandler f351179o = new C117303a("EdgeComputingMgr#mExecuteScriptHandler");

    /* renamed from: p */
    public C114668z.C104589a f351180p = new C117304b();

    /* renamed from: j81.a$a */
    public class C117303a extends MMHandler {
        public C117303a(String str) {
            super(str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:103:0x0235, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x0244, code lost:
            if (r12.isClosed() == false) goto L_0x026f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x026d, code lost:
            if (r12.isClosed() == false) goto L_0x026f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x026f, code lost:
            r12.close();
         */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x0235 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:89:0x0210] */
        /* JADX WARNING: Removed duplicated region for block: B:118:0x0269  */
        /* JADX WARNING: Removed duplicated region for block: B:132:0x029b  */
        /* JADX WARNING: Removed duplicated region for block: B:133:0x029e  */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x02a9  */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x02b4  */
        /* JADX WARNING: Removed duplicated region for block: B:166:0x0377  */
        /* JADX WARNING: Removed duplicated region for block: B:173:0x03cb  */
        /* JADX WARNING: Removed duplicated region for block: B:174:0x03dc  */
        /* JADX WARNING: Removed duplicated region for block: B:177:0x0400  */
        /* JADX WARNING: Removed duplicated region for block: B:182:0x0422  */
        /* JADX WARNING: Removed duplicated region for block: B:216:0x0508  */
        /* JADX WARNING: Removed duplicated region for block: B:245:0x02da A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:248:0x0229 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x015c  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x01a4 A[SYNTHETIC, Splitter:B:64:0x01a4] */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x0223 A[Catch:{ Exception -> 0x0227, all -> 0x0235 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r42) {
            /*
                r41 = this;
                r1 = r41
                r0 = r42
                int r0 = r0.what
                r2 = 0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                r4 = 1
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                r10 = 0
                java.lang.String r14 = ""
                java.lang.String r15 = "EdgeComputingMgr"
                switch(r0) {
                    case 1001: goto L_0x060c;
                    case 1002: goto L_0x0605;
                    case 1003: goto L_0x02f2;
                    case 1004: goto L_0x001b;
                    default: goto L_0x0019;
                }
            L_0x0019:
                goto L_0x0612
            L_0x001b:
                j81.a r5 = j81.C117302a.this
                r5.getClass()
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = j81.C87906e.m109412f()
                if (r0 != 0) goto L_0x0028
                goto L_0x0612
            L_0x0028:
                r16 = r14
                long r13 = java.lang.System.currentTimeMillis()
                java.lang.String r6 = "mmkv_key_period_work_lasttime"
                long r17 = r0.getLong(r6, r10)
                long r17 = r13 - r17
                r19 = 86400000(0x5265c00, double:4.2687272E-316)
                int r21 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
                if (r21 >= 0) goto L_0x003f
                goto L_0x0612
            L_0x003f:
                r0.putLong(r6, r13)
                java.lang.String r0 = "[EdgeComputingMgr] handlePeriodTask!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
                k81.c r0 = r5.f351172e
                k81.a r0 = (k81.C117390a) r0
                m81.c r0 = r0.f351437a
                if (r0 != 0) goto L_0x0050
                goto L_0x0053
            L_0x0050:
                r0.mo86406a()
            L_0x0053:
                k81.c r0 = r5.f351173f
                k81.a r0 = (k81.C117390a) r0
                m81.c r0 = r0.f351437a
                if (r0 != 0) goto L_0x005c
                goto L_0x005f
            L_0x005c:
                r0.mo86406a()
            L_0x005f:
                k81.c r0 = r5.f351173f
                long r13 = java.lang.System.currentTimeMillis()
                r17 = 604800000(0x240c8400, double:2.988109026E-315)
                long r13 = r13 - r17
                k81.a r0 = (k81.C117390a) r0
                m81.c r0 = r0.f351437a
                if (r0 != 0) goto L_0x0071
                goto L_0x0074
            L_0x0071:
                r0.mo86408c(r13)
            L_0x0074:
                k81.c r0 = r5.f351172e
                long r13 = java.lang.System.currentTimeMillis()
                long r13 = r13 - r17
                k81.a r0 = (k81.C117390a) r0
                m81.c r0 = r0.f351437a
                if (r0 != 0) goto L_0x0083
                goto L_0x0086
            L_0x0083:
                r0.mo86408c(r13)
            L_0x0086:
                o81.c r0 = o81.C117715c.wx0()
                java.util.List r0 = r0.xx0()
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                int r6 = r0.size()
                if (r6 <= 0) goto L_0x02e2
                java.util.Iterator r6 = r0.iterator()
            L_0x009a:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L_0x02e2
                java.lang.Object r0 = r6.next()
                r13 = r0
                v81.b r13 = (v81.C118667b) r13
                c91.b r0 = r5.f351174g
                sf0.z$a r14 = r0.f338868a
                if (r14 == 0) goto L_0x02d8
                if (r13 != 0) goto L_0x00b1
                goto L_0x02d8
            L_0x00b1:
                long r14 = java.lang.System.currentTimeMillis()
                int r8 = r13.f355088i
                long r7 = (long) r8
                long r7 = r7 * r19
                long r14 = r14 - r7
                c91.a r7 = new c91.a
                sf0.z$a r0 = r0.f338868a
                java.lang.String r8 = r13.f355080a
                java.util.List<v81.a> r10 = r13.f355084e
                r7.<init>(r0, r8, r10)
                java.lang.String r10 = "EdgeComputingDataDao"
                if (r0 == 0) goto L_0x015e
                boolean r0 = u24.C90599h.m113511d(r8)
                if (r0 == 0) goto L_0x00d2
                goto L_0x015e
            L_0x00d2:
                java.lang.String r0 = r7.f338866b
                java.lang.String r0 = r7.mo165801c(r0)
                boolean r8 = u24.C90599h.m113511d(r0)
                if (r8 == 0) goto L_0x00e0
                goto L_0x015e
            L_0x00e0:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r11 = "[EdgeComputingDataDao] deleteExpire tableName : "
                r8.append(r11)
                r8.append(r0)
                java.lang.String r11 = ", expireTimestamp : "
                r8.append(r11)
                r8.append(r14)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r8)
                com.tencent.mm.sdk.storage.ISQLiteDatabase r8 = r7.f338865a
                boolean r11 = r8 instanceof zh3.C91753f
                if (r11 == 0) goto L_0x0105
                zh3.f r8 = (zh3.C91753f) r8
                goto L_0x0106
            L_0x0105:
                r8 = 0
            L_0x0106:
                r22 = r13
                if (r8 == 0) goto L_0x0159
                long r12 = r8.mo125613a()
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0138 }
                r11.<init>()     // Catch:{ Exception -> 0x0138 }
                java.lang.String r9 = "report_time_ec"
                java.lang.String r9 = r7.mo165800b(r9)     // Catch:{ Exception -> 0x0138 }
                r11.append(r9)     // Catch:{ Exception -> 0x0138 }
                java.lang.String r9 = " < ?"
                r11.append(r9)     // Catch:{ Exception -> 0x0138 }
                java.lang.String r9 = r11.toString()     // Catch:{ Exception -> 0x0138 }
                java.lang.String[] r11 = new java.lang.String[r4]     // Catch:{ Exception -> 0x0138 }
                java.lang.String r24 = java.lang.String.valueOf(r14)     // Catch:{ Exception -> 0x0138 }
                r11[r2] = r24     // Catch:{ Exception -> 0x0138 }
                int r0 = r8.delete(r0, r9, r11)     // Catch:{ Exception -> 0x0138 }
                r8.endTransaction(r12)
                goto L_0x015a
            L_0x0136:
                r0 = move-exception
                goto L_0x0155
            L_0x0138:
                r0 = move-exception
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0136 }
                r9.<init>()     // Catch:{ all -> 0x0136 }
                java.lang.String r11 = "[EdgeComputingDataDao] deleteExpire throw Exception : "
                r9.append(r11)     // Catch:{ all -> 0x0136 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0136 }
                r9.append(r0)     // Catch:{ all -> 0x0136 }
                java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x0136 }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)     // Catch:{ all -> 0x0136 }
                r8.endTransaction(r12)
                goto L_0x0159
            L_0x0155:
                r8.endTransaction(r12)
                throw r0
            L_0x0159:
                r0 = 0
            L_0x015a:
                if (r0 <= 0) goto L_0x0160
                r0 = 1
                goto L_0x0161
            L_0x015e:
                r22 = r13
            L_0x0160:
                r0 = 0
            L_0x0161:
                r8 = 3
                java.lang.Object[] r9 = new java.lang.Object[r8]
                java.lang.Long r8 = java.lang.Long.valueOf(r14)
                r9[r2] = r8
                r8 = r22
                java.lang.String r11 = r8.f355080a
                r9[r4] = r11
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r11 = 2
                r9[r11] = r0
                java.lang.String r0 = "EdgeComputingDataStorage"
                java.lang.String r12 = "[EdgeComputingDataStorage] clearExpireData expireTimestamp : %d, configID : %s, result : %b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r12, r9)
                com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r7.f338865a
                if (r0 == 0) goto L_0x0296
                java.lang.String r0 = r7.f338866b
                boolean r0 = u24.C90599h.m113511d(r0)
                if (r0 != 0) goto L_0x0296
                java.util.List<v81.a> r0 = r7.f338867c
                if (r0 == 0) goto L_0x0296
                int r0 = r0.size()
                if (r0 > 0) goto L_0x0196
                goto L_0x0296
            L_0x0196:
                java.lang.String r0 = r7.f338866b
                java.lang.String r9 = r7.mo165801c(r0)
                boolean r0 = u24.C90599h.m113511d(r9)
                if (r0 == 0) goto L_0x01a4
                goto L_0x0296
            L_0x01a4:
                com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r7.f338865a     // Catch:{ Exception -> 0x024a, all -> 0x0247 }
                r26 = 0
                r27 = 0
                r28 = 0
                r29 = 0
                r30 = 0
                r31 = 0
                r24 = r0
                r25 = r9
                android.database.Cursor r12 = r24.query(r25, r26, r27, r28, r29, r30, r31)     // Catch:{ Exception -> 0x024a, all -> 0x0247 }
                if (r12 == 0) goto L_0x023b
                java.util.LinkedList r13 = new java.util.LinkedList     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
                r13.<init>()     // Catch:{ Exception -> 0x0237, all -> 0x0235 }
            L_0x01c1:
                boolean r0 = r12.moveToNext()     // Catch:{ Exception -> 0x0231, all -> 0x0235 }
                if (r0 == 0) goto L_0x022e
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x0231, all -> 0x0235 }
                r0.<init>()     // Catch:{ Exception -> 0x0231, all -> 0x0235 }
                java.util.List<v81.a> r14 = r7.f338867c     // Catch:{ Exception -> 0x0231, all -> 0x0235 }
                java.util.Iterator r14 = r14.iterator()     // Catch:{ Exception -> 0x0231, all -> 0x0235 }
            L_0x01d2:
                boolean r15 = r14.hasNext()     // Catch:{ Exception -> 0x0231, all -> 0x0235 }
                if (r15 == 0) goto L_0x021e
                java.lang.Object r15 = r14.next()     // Catch:{ Exception -> 0x0231, all -> 0x0235 }
                v81.a r15 = (v81.C118666a) r15     // Catch:{ Exception -> 0x0231, all -> 0x0235 }
                u81.b r11 = new u81.b     // Catch:{ Exception -> 0x0231, all -> 0x0235 }
                r11.<init>()     // Catch:{ Exception -> 0x0231, all -> 0x0235 }
                java.lang.String r2 = r15.f355079c     // Catch:{ Exception -> 0x0231, all -> 0x0235 }
                r11.f354925c = r2     // Catch:{ Exception -> 0x0231, all -> 0x0235 }
                int r2 = r15.f355077a     // Catch:{ Exception -> 0x0231, all -> 0x0235 }
                r11.f354923a = r2     // Catch:{ Exception -> 0x0231, all -> 0x0235 }
                int r15 = r15.f355078b     // Catch:{ Exception -> 0x0231, all -> 0x0235 }
                r11.f354924b = r15     // Catch:{ Exception -> 0x0231, all -> 0x0235 }
                if (r15 != 0) goto L_0x01fc
                java.lang.String r2 = r12.getString(r2)     // Catch:{ Exception -> 0x01fa, all -> 0x0235 }
                r11.f354928f = r2     // Catch:{ Exception -> 0x01fa, all -> 0x0235 }
            L_0x01f7:
                r23 = r5
                goto L_0x0210
            L_0x01fa:
                goto L_0x021a
            L_0x01fc:
                if (r15 != r4) goto L_0x0205
                int r2 = r12.getInt(r2)     // Catch:{ Exception -> 0x01fa, all -> 0x0235 }
                r11.f354926d = r2     // Catch:{ Exception -> 0x01fa, all -> 0x0235 }
                goto L_0x01f7
            L_0x0205:
                r4 = 2
                if (r15 != r4) goto L_0x021a
                r23 = r5
                long r4 = r12.getLong(r2)     // Catch:{ Exception -> 0x0218, all -> 0x0235 }
                r11.f354927e = r4     // Catch:{ Exception -> 0x0218, all -> 0x0235 }
            L_0x0210:
                r0.add(r11)     // Catch:{ Exception -> 0x0227, all -> 0x0235 }
                r5 = r23
                r2 = 0
                r4 = 1
                goto L_0x01d2
            L_0x0218:
                goto L_0x021c
            L_0x021a:
                r23 = r5
            L_0x021c:
                r2 = 1
                goto L_0x0221
            L_0x021e:
                r23 = r5
                r2 = 0
            L_0x0221:
                if (r2 != 0) goto L_0x0229
                r13.add(r0)     // Catch:{ Exception -> 0x0227, all -> 0x0235 }
                goto L_0x0229
            L_0x0227:
                r0 = move-exception
                goto L_0x024f
            L_0x0229:
                r5 = r23
                r2 = 0
                r4 = 1
                goto L_0x01c1
            L_0x022e:
                r23 = r5
                goto L_0x023e
            L_0x0231:
                r0 = move-exception
                r23 = r5
                goto L_0x024f
            L_0x0235:
                r0 = move-exception
                goto L_0x028a
            L_0x0237:
                r0 = move-exception
                r23 = r5
                goto L_0x024e
            L_0x023b:
                r23 = r5
                r13 = 0
            L_0x023e:
                if (r12 == 0) goto L_0x0272
                boolean r0 = r12.isClosed()
                if (r0 != 0) goto L_0x0272
                goto L_0x026f
            L_0x0247:
                r0 = move-exception
                r13 = 0
                goto L_0x0289
            L_0x024a:
                r0 = move-exception
                r23 = r5
                r12 = 0
            L_0x024e:
                r13 = 0
            L_0x024f:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0287 }
                r2.<init>()     // Catch:{ all -> 0x0287 }
                java.lang.String r4 = "[EdgeComputingDataDao] queryAll throw Exception : "
                r2.append(r4)     // Catch:{ all -> 0x0287 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0287 }
                r2.append(r0)     // Catch:{ all -> 0x0287 }
                java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0287 }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)     // Catch:{ all -> 0x0287 }
                if (r12 == 0) goto L_0x0272
                boolean r0 = r12.isClosed()
                if (r0 != 0) goto L_0x0272
            L_0x026f:
                r12.close()
            L_0x0272:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "[EdgeComputingDataDao] queryAll tableName : "
                r0.append(r2)
                r0.append(r9)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
                goto L_0x0299
            L_0x0287:
                r0 = move-exception
                r13 = r12
            L_0x0289:
                r12 = r13
            L_0x028a:
                if (r12 == 0) goto L_0x0295
                boolean r2 = r12.isClosed()
                if (r2 != 0) goto L_0x0295
                r12.close()
            L_0x0295:
                throw r0
            L_0x0296:
                r23 = r5
                r13 = 0
            L_0x0299:
                if (r13 != 0) goto L_0x029e
                r4 = 0
                goto L_0x02a3
            L_0x029e:
                int r0 = r13.size()
                long r4 = (long) r0
            L_0x02a3:
                r9 = 0
                int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r0 > 0) goto L_0x02ac
                r7.mo165799a()
            L_0x02ac:
                java.lang.String r0 = r8.f355080a
                boolean r2 = w81.C90900a.m114028a()
                if (r2 == 0) goto L_0x02da
                com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r7 = 5
                java.lang.Object[] r8 = new java.lang.Object[r7]
                r7 = 0
                r8[r7] = r0
                r0 = 10
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r7 = 1
                r8[r7] = r0
                r7 = 2
                r8[r7] = r3
                java.lang.Long r0 = java.lang.Long.valueOf(r4)
                r4 = 3
                r8[r4] = r0
                r4 = 4
                r8[r4] = r16
                r4 = 20176(0x4ed0, float:2.8273E-41)
                r2.mo160131h(r4, r8)
                goto L_0x02da
            L_0x02d8:
                r23 = r5
            L_0x02da:
                r5 = r23
                r2 = 0
                r4 = 1
                r10 = 0
                goto L_0x009a
            L_0x02e2:
                o81.c r0 = o81.C117715c.wx0()
                com.tencent.mm.sdk.platformtools.MMHandler r2 = r0.f352043g
                o81.b r3 = new o81.b
                r3.<init>(r0)
                r2.post(r3)
                goto L_0x0612
            L_0x02f2:
                r16 = r14
                j81.a r0 = j81.C117302a.this
                r0.getClass()
                o81.c r2 = o81.C117715c.wx0()
                java.util.List r2 = r2.xx0()
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                int r4 = r2.size()
                if (r4 > 0) goto L_0x030b
                goto L_0x0612
            L_0x030b:
                java.lang.String r4 = "[EdgeComputingMgr] executeInstantTask!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r4)
                long r6 = java.lang.System.currentTimeMillis()
                long r8 = android.os.SystemClock.uptimeMillis()
                java.util.Iterator r2 = r2.iterator()
                r4 = 0
            L_0x031d:
                boolean r10 = r2.hasNext()
                if (r10 == 0) goto L_0x053b
                java.lang.Object r10 = r2.next()
                v81.b r10 = (v81.C118667b) r10
                long r13 = android.os.SystemClock.uptimeMillis()
                java.lang.String r11 = r10.f355090k
                boolean r11 = u24.C90599h.m113511d(r11)
                if (r11 == 0) goto L_0x033f
            L_0x0335:
                r33 = r2
                r25 = r6
                r34 = r8
                r6 = 0
                goto L_0x0533
            L_0x033f:
                int r11 = r10.f355085f
                r12 = 1
                if (r11 == r12) goto L_0x0345
                goto L_0x0335
            L_0x0345:
                k81.c r11 = r0.f351173f
                java.lang.String r12 = r10.f355080a
                k81.a r11 = (k81.C117390a) r11
                boolean r20 = u24.C90599h.m113511d(r12)
                if (r20 != 0) goto L_0x035b
                m81.c r11 = r11.f351437a
                if (r11 != 0) goto L_0x0356
                goto L_0x035e
            L_0x0356:
                java.util.List r11 = r11.mo86413m(r12)
                goto L_0x035f
            L_0x035b:
                r11.getClass()
            L_0x035e:
                r11 = 0
            L_0x035f:
                if (r11 == 0) goto L_0x0335
                int r12 = r11.size()
                if (r12 > 0) goto L_0x0368
                goto L_0x0335
            L_0x0368:
                java.util.HashMap r12 = new java.util.HashMap
                r12.<init>()
                java.util.Iterator r11 = r11.iterator()
            L_0x0371:
                boolean r20 = r11.hasNext()
                if (r20 == 0) goto L_0x03b0
                java.lang.Object r20 = r11.next()
                r33 = r2
                r2 = r20
                u81.a r2 = (u81.C118604a) r2
                r34 = r8
                long r8 = r2.f354921s
                java.lang.Long r8 = java.lang.Long.valueOf(r8)
                java.lang.Object r8 = r12.get(r8)
                java.util.List r8 = (java.util.List) r8
                if (r8 != 0) goto L_0x03a2
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                r36 = r13
                long r13 = r2.f354921s
                java.lang.Long r9 = java.lang.Long.valueOf(r13)
                r12.put(r9, r8)
                goto L_0x03a4
            L_0x03a2:
                r36 = r13
            L_0x03a4:
                java.lang.String r2 = r2.f354922t
                r8.add(r2)
                r2 = r33
                r8 = r34
                r13 = r36
                goto L_0x0371
            L_0x03b0:
                r33 = r2
                r34 = r8
                r36 = r13
                int r2 = r10.f355087h
                long r8 = (long) r2
                r13 = 3600000(0x36ee80, double:1.7786363E-317)
                long r8 = r8 * r13
                java.util.TimeZone r2 = java.util.TimeZone.getDefault()
                int r2 = r2.getRawOffset()
                long r13 = (long) r2
                int r2 = r10.f355087h
                if (r2 <= 0) goto L_0x03dc
                long r25 = r6 / r8
                long r25 = r25 * r8
                long r25 = r25 - r13
                long r8 = r25 - r8
                r13 = 1
                long r25 = r25 - r13
                r29 = r8
                r31 = r25
                goto L_0x03e0
            L_0x03dc:
                r29 = r6
                r31 = r29
            L_0x03e0:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r8 = "[EdgeComputingMgr] executeInstantTask configID : "
                r2.append(r8)
                java.lang.String r8 = r10.f355080a
                r2.append(r8)
                java.lang.String r8 = ", now : "
                r2.append(r8)
                r2.append(r6)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r2)
                if (r4 != 0) goto L_0x0406
                y81.b r2 = new y81.b
                r2.<init>()
                r4 = r2
            L_0x0406:
                r25 = r0
                r26 = r4
                r27 = r10
                r28 = r12
                java.util.Map r2 = r25.wx0(r26, r27, r28, r29, r31)
                java.lang.String r8 = r10.f355080a
                r9 = 4
                r11 = 0
                w81.C90900a.m114029b(r8, r9, r11)
                if (r2 == 0) goto L_0x0508
                int r8 = r2.size()
                if (r8 <= 0) goto L_0x0508
                int r8 = r10.f355088i
                if (r8 <= 0) goto L_0x049a
                long r8 = android.os.SystemClock.uptimeMillis()
                java.util.Set r11 = r2.keySet()
                java.util.Iterator r11 = r11.iterator()
                r12 = 0
            L_0x0433:
                boolean r13 = r11.hasNext()
                if (r13 == 0) goto L_0x0483
                java.lang.Object r13 = r11.next()
                java.lang.Long r13 = (java.lang.Long) r13
                long r13 = r13.longValue()
                java.lang.Long r13 = java.lang.Long.valueOf(r13)
                java.lang.Object r13 = r2.get(r13)
                java.util.List r13 = (java.util.List) r13
                if (r13 == 0) goto L_0x047a
                int r14 = r13.size()
                if (r14 > 0) goto L_0x0456
                goto L_0x047a
            L_0x0456:
                c91.b r14 = r0.f351174g
                boolean r14 = r14.mo165802a(r13, r10)
                r20 = r4
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r25 = r6
                java.lang.String r6 = "[EdgeComputingMgr] executeInstantTask saveResult ret : "
                r4.append(r6)
                r4.append(r14)
                java.lang.String r4 = r4.toString()
                j81.C87906e.m109407a(r15, r4)
                int r4 = r13.size()
                int r12 = r12 + r4
                goto L_0x047e
            L_0x047a:
                r20 = r4
                r25 = r6
            L_0x047e:
                r4 = r20
                r6 = r25
                goto L_0x0433
            L_0x0483:
                r20 = r4
                r25 = r6
                java.lang.String r4 = r10.f355080a
                long r6 = android.os.SystemClock.uptimeMillis()
                long r6 = r6 - r8
                w81.C90900a.m114037j(r4, r6, r12)
                java.lang.String r4 = r10.f355080a
                r6 = 6
                r7 = 0
                w81.C90900a.m114029b(r4, r6, r7)
                goto L_0x049e
            L_0x049a:
                r20 = r4
                r25 = r6
            L_0x049e:
                int r4 = r10.f355083d
                if (r4 <= 0) goto L_0x050c
                java.util.Set r4 = r2.keySet()
                java.util.Iterator r4 = r4.iterator()
            L_0x04aa:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L_0x04ff
                java.lang.Object r6 = r4.next()
                java.lang.Long r6 = (java.lang.Long) r6
                long r6 = r6.longValue()
                java.lang.Long r6 = java.lang.Long.valueOf(r6)
                java.lang.Object r6 = r2.get(r6)
                java.util.List r6 = (java.util.List) r6
                if (r6 == 0) goto L_0x04aa
                int r7 = r6.size()
                if (r7 > 0) goto L_0x04cd
                goto L_0x04aa
            L_0x04cd:
                java.util.Iterator r6 = r6.iterator()
            L_0x04d1:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L_0x04aa
                java.lang.Object r7 = r6.next()
                java.util.List r7 = (java.util.List) r7
                int r8 = r10.f355089j
                r9 = 1
                if (r8 != r9) goto L_0x04ec
                x81.a r8 = r0.f351175h
                java.lang.String r9 = r10.f355080a
                int r11 = r10.f355083d
                r8.mo183570b(r9, r11, r7)
                goto L_0x04d1
            L_0x04ec:
                r9 = 2
                if (r8 != r9) goto L_0x04f7
                x81.a r8 = r0.f351175h
                int r9 = r10.f355083d
                r8.mo183572e(r9, r7)
                goto L_0x04d1
            L_0x04f7:
                x81.a r8 = r0.f351175h
                int r9 = r10.f355083d
                r8.mo183571c(r9, r7)
                goto L_0x04d1
            L_0x04ff:
                java.lang.String r2 = r10.f355080a
                r4 = 7
                r6 = 0
                w81.C90900a.m114029b(r2, r4, r6)
                goto L_0x050e
            L_0x0508:
                r20 = r4
                r25 = r6
            L_0x050c:
                r6 = 0
            L_0x050e:
                k81.c r2 = r0.f351173f
                java.lang.String r4 = r10.f355080a
                k81.a r2 = (k81.C117390a) r2
                r2.mo182072a(r4)
                r2 = 2
                java.lang.Object[] r4 = new java.lang.Object[r2]
                java.lang.String r2 = r10.f355080a
                r8 = 0
                r4[r8] = r2
                long r8 = android.os.SystemClock.uptimeMillis()
                long r8 = r8 - r36
                java.lang.Long r2 = java.lang.Long.valueOf(r8)
                r8 = 1
                r4[r8] = r2
                java.lang.String r2 = "[EdgeComputingMgr] executeInstantTask configID : %s, costTime : %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r2, r4)
                r4 = r20
            L_0x0533:
                r6 = r25
                r2 = r33
                r8 = r34
                goto L_0x031d
            L_0x053b:
                r34 = r8
                x81.a r0 = r0.f351175h
                r0.mo183569a()
                if (r4 == 0) goto L_0x0547
                r4.mo125349b()
            L_0x0547:
                long r6 = android.os.SystemClock.uptimeMillis()
                long r6 = r6 - r34
                r8 = 1000(0x3e8, double:4.94E-321)
                r12 = 10
                int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
                if (r0 > 0) goto L_0x0563
                com.tencent.mm.plugin.report.service.n r25 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r26 = 1409(0x581, double:6.96E-321)
                r28 = 39
                r30 = 1
                r32 = 0
                r25.idkeyStat(r26, r28, r30, r32)
                goto L_0x0596
            L_0x0563:
                r12 = 100
                int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
                if (r0 > 0) goto L_0x0577
                com.tencent.mm.plugin.report.service.n r25 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r26 = 1409(0x581, double:6.96E-321)
                r28 = 40
                r30 = 1
                r32 = 0
                r25.idkeyStat(r26, r28, r30, r32)
                goto L_0x0596
            L_0x0577:
                int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r0 > 0) goto L_0x0589
                com.tencent.mm.plugin.report.service.n r25 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r26 = 1409(0x581, double:6.96E-321)
                r28 = 41
                r30 = 1
                r32 = 0
                r25.idkeyStat(r26, r28, r30, r32)
                goto L_0x0596
            L_0x0589:
                com.tencent.mm.plugin.report.service.n r33 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r34 = 1409(0x581, double:6.96E-321)
                r36 = 42
                r38 = 1
                r40 = 0
                r33.idkeyStat(r34, r36, r38, r40)
            L_0x0596:
                int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r0 > 0) goto L_0x05b7
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r8 = 1409(0x581, double:6.96E-321)
                r28 = 51
                r2 = 0
                r26 = 1409(0x581, double:6.96E-321)
                r32 = 0
                r25 = r0
                r30 = r6
                r25.idkeyStat(r26, r28, r30, r32)
                r28 = 52
                r30 = 1
                r26 = r8
                r32 = r2
                r25.idkeyStat(r26, r28, r30, r32)
            L_0x05b7:
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r33 = 1409(0x581, double:6.96E-321)
                r35 = 97
                r37 = 1
                r39 = 0
                r32 = r0
                r32.idkeyStat(r33, r35, r37, r39)
                boolean r2 = w81.C90900a.m114028a()
                if (r2 == 0) goto L_0x05ed
                r2 = 5
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r4 = 0
                r2[r4] = r3
                r8 = 6
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r9 = 1
                r2[r9] = r8
                java.lang.Long r8 = java.lang.Long.valueOf(r6)
                r10 = 2
                r2[r10] = r8
                r8 = 3
                r2[r8] = r5
                r11 = 4
                r2[r11] = r16
                r11 = 20176(0x4ed0, float:2.8273E-41)
                r0.mo160131h(r11, r2)
                goto L_0x05f1
            L_0x05ed:
                r4 = 0
                r8 = 3
                r9 = 1
                r10 = 2
            L_0x05f1:
                java.lang.Object[] r0 = new java.lang.Object[r8]
                r0[r4] = r3
                java.lang.Long r2 = java.lang.Long.valueOf(r6)
                r0[r9] = r2
                r0[r10] = r5
                java.lang.String r2 = "EdgeComputingMonitor"
                java.lang.String r3 = "[EdgeComputingMonitor] statInstantTaskTime configID : %s, costTime : %d, dataSzie : %d"
                j81.C87906e.m109408b(r2, r3, r0)
                goto L_0x0612
            L_0x0605:
                r4 = 0
                j81.a r0 = j81.C117302a.this
                j81.C117302a.vx0(r0, r4)
                goto L_0x0612
            L_0x060c:
                r9 = 1
                j81.a r0 = j81.C117302a.this
                j81.C117302a.vx0(r0, r9)
            L_0x0612:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j81.C117302a.C117303a.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: j81.a$b */
    public class C117304b extends C114668z.C104589a {
        public C117304b() {
        }

        public void onAppBackground(String str) {
            if (C87906e.m109416j()) {
                Log.m105920e("EdgeComputingMgr", "[onAppBackground]");
                C117302a.this.f351179o.removeMessages(1004);
                C117302a.this.f351179o.sendEmptyMessageDelayed(1004, 1000);
                C117302a.this.f351179o.removeMessages(1001);
                C117302a.this.f351179o.sendEmptyMessageDelayed(1001, 1000);
            }
        }

        public void onAppForeground(String str) {
            if (C87906e.m109416j()) {
                Log.m105920e("EdgeComputingMgr", "[onAppForeground]");
                C117302a.this.f351179o.removeMessages(1004);
                C117302a.this.f351179o.removeMessages(1001);
            }
        }
    }

    /* renamed from: j81.a$c */
    public class C117305c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C118667b f351183d;

        /* renamed from: e */
        public final /* synthetic */ C118604a f351184e;

        public C117305c(C118667b bVar, C118604a aVar) {
            this.f351183d = bVar;
            this.f351184e = aVar;
        }

        public void run() {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (this.f351183d.f355085f == 1) {
                C117392c cVar = C117302a.this.f351173f;
                C118604a aVar = this.f351184e;
                C117390a aVar2 = (C117390a) cVar;
                if (aVar != null) {
                    C117542c cVar2 = aVar2.f351437a;
                    if (cVar2 != null) {
                        cVar2.mo86407b(aVar);
                    }
                } else {
                    aVar2.getClass();
                }
                C117302a.this.f351179o.removeMessages(1003);
                C117302a aVar3 = C117302a.this;
                MMHandler mMHandler = aVar3.f351179o;
                aVar3.f351178n.getClass();
                mMHandler.sendEmptyMessageDelayed(1003, C118226a.f353384f);
            } else {
                C117392c cVar3 = C117302a.this.f351172e;
                C118604a aVar4 = this.f351184e;
                C117390a aVar5 = (C117390a) cVar3;
                if (aVar4 != null) {
                    C117542c cVar4 = aVar5.f351437a;
                    if (cVar4 != null) {
                        cVar4.mo86407b(aVar4);
                    }
                } else {
                    aVar5.getClass();
                }
            }
            String str = this.f351183d.f355080a;
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            if (uptimeMillis2 <= 10) {
                C115669n.INSTANCE.idkeyStat(1409, 4, 1, false);
            } else if (uptimeMillis2 <= 100) {
                C115669n.INSTANCE.idkeyStat(1409, 5, 1, false);
            } else if (uptimeMillis2 <= 1000) {
                C115669n.INSTANCE.idkeyStat(1409, 6, 1, false);
            } else {
                C115669n.INSTANCE.idkeyStat(1409, 7, 1, false);
            }
            if (uptimeMillis2 <= 1000) {
                C115669n nVar = C115669n.INSTANCE;
                nVar.idkeyStat(1409, 43, uptimeMillis2, false);
                nVar.idkeyStat(1409, 44, 1, false);
            }
            C115669n nVar2 = C115669n.INSTANCE;
            nVar2.idkeyStat(1409, 90, 1, false);
            if (C90900a.m114028a()) {
                nVar2.mo160131h(20176, str, 1, Long.valueOf(uptimeMillis2), 1, "");
            }
            C87906e.m109408b("EdgeComputingMonitor", "[EdgeComputingMonitor] statCacheCostTime configID : %s, costTime : %d, dataSzie : %d", str, Long.valueOf(uptimeMillis2), 1);
            C90900a.m114029b(this.f351183d.f355080a, 5, this.f351184e.f354921s);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x04ff  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void vx0(j81.C117302a r60, boolean r61) {
        /*
            r0 = r60
            r60.getClass()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = j81.C87906e.m109412f()
            if (r1 != 0) goto L_0x000d
            goto L_0x0a55
        L_0x000d:
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = "mmkv_key_edge_computing_timestamp"
            r9 = 0
            long r4 = r1.getLong(r4, r9)
            r11 = 3600000(0x36ee80, double:1.7786363E-317)
            r14 = 1
            if (r61 == 0) goto L_0x0026
            long r6 = r2 - r4
            int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r8 >= 0) goto L_0x0026
            goto L_0x0031
        L_0x0026:
            if (r61 != 0) goto L_0x0033
            long r4 = r2 - r4
            r6 = 14400000(0xdbba00, double:7.1145453E-317)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0033
        L_0x0031:
            r4 = 0
            goto L_0x0034
        L_0x0033:
            r4 = 1
        L_0x0034:
            if (r61 == 0) goto L_0x0053
            if (r4 != 0) goto L_0x0053
            k81.c r5 = r0.f351172e
            k81.a r5 = (k81.C117390a) r5
            m81.c r5 = r5.f351437a
            if (r5 != 0) goto L_0x0042
            r5 = r9
            goto L_0x0046
        L_0x0042:
            long r5 = r5.count()
        L_0x0046:
            r81.a r7 = r0.f351178n
            r7.getClass()
            int r7 = r81.C118226a.f353381c
            long r7 = (long) r7
            int r15 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r15 < 0) goto L_0x0053
            r4 = 1
        L_0x0053:
            if (r4 != 0) goto L_0x0057
            goto L_0x0a55
        L_0x0057:
            java.lang.String r4 = "mmkv_key_edge_computing_timestamp"
            r1.putLong(r4, r2)
            java.lang.String r1 = "EdgeComputingMgr"
            java.lang.String r2 = "[EdgeComputingMgr] handleRegularTask!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            long r15 = android.os.SystemClock.uptimeMillis()
            o81.c r1 = o81.C117715c.wx0()
            java.util.List r1 = r1.xx0()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            r17 = 100
            r19 = 10
            r21 = 1000(0x3e8, double:4.94E-321)
            r23 = 0
            if (r2 > 0) goto L_0x0088
            r34 = r15
            r4 = 7
            r7 = 3
            r8 = 20176(0x4ed0, float:2.8273E-41)
            r9 = 5
            goto L_0x0528
        L_0x0088:
            java.lang.String r2 = "EdgeComputingMgr"
            java.lang.String r3 = "[EdgeComputingMgr] executeUnInstantTask!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            long r2 = java.lang.System.currentTimeMillis()
            java.util.Iterator r24 = r1.iterator()
            r1 = r0
            r25 = r23
        L_0x009a:
            boolean r26 = r24.hasNext()
            if (r26 == 0) goto L_0x0516
            java.lang.Object r26 = r24.next()
            r13 = r26
            v81.b r13 = (v81.C118667b) r13
            long r27 = android.os.SystemClock.uptimeMillis()
            java.lang.String r4 = r13.f355090k
            boolean r4 = u24.C90599h.m113511d(r4)
            if (r4 == 0) goto L_0x00b5
            goto L_0x00f9
        L_0x00b5:
            int r4 = r13.f355085f
            if (r4 != r14) goto L_0x00ba
            goto L_0x00f9
        L_0x00ba:
            q81.a r4 = r1.f351177j
            java.lang.String r5 = r13.f355080a
            boolean r29 = u24.C90599h.m113511d(r5)
            if (r29 == 0) goto L_0x00c8
            r4.getClass()
            goto L_0x00de
        L_0x00c8:
            java.util.Map<java.lang.String, java.lang.Long> r6 = r4.f95626a
            monitor-enter(r6)
            java.util.Map<java.lang.String, java.lang.Long> r4 = r4.f95626a     // Catch:{ all -> 0x0513 }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ all -> 0x0513 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x0513 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x0513 }
            if (r4 == 0) goto L_0x00dd
            long r4 = r4.longValue()     // Catch:{ all -> 0x0513 }
            monitor-exit(r6)     // Catch:{ all -> 0x0513 }
            goto L_0x00df
        L_0x00dd:
            monitor-exit(r6)     // Catch:{ all -> 0x0513 }
        L_0x00de:
            r4 = r9
        L_0x00df:
            long r30 = r2 - r4
            int r6 = r13.f355087h
            long r7 = (long) r6
            long r7 = r7 * r11
            int r6 = (r30 > r7 ? 1 : (r30 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x00eb
            goto L_0x00f9
        L_0x00eb:
            int r6 = r13.f355081b
            r30 = 1
            if (r6 != 0) goto L_0x0245
            int r6 = r13.f355086g
            if (r6 != 0) goto L_0x0104
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x0104
        L_0x00f9:
            r12 = r1
            r34 = r15
            r4 = 7
            r7 = 3
            r8 = 20176(0x4ed0, float:2.8273E-41)
            r9 = 5
            r14 = r2
            goto L_0x0507
        L_0x0104:
            int r1 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x010a
            r4 = r2
            goto L_0x0115
        L_0x010a:
            long r4 = r4 + r7
            r6 = 259200000(0xf731400, double:1.280618154E-315)
            long r6 = r2 - r6
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x0115
            r4 = r6
        L_0x0115:
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x023d
            int r1 = r13.f355087h
            long r6 = (long) r1
            long r6 = r6 * r11
            java.util.TimeZone r1 = java.util.TimeZone.getDefault()
            int r1 = r1.getRawOffset()
            r34 = r15
            long r14 = (long) r1
            int r1 = r13.f355087h
            if (r1 <= 0) goto L_0x0138
            long r36 = r4 / r6
            long r36 = r36 * r6
            long r36 = r36 - r14
            long r6 = r36 - r6
            long r36 = r36 - r30
            goto L_0x013b
        L_0x0138:
            r6 = r4
            r36 = r6
        L_0x013b:
            long r14 = (long) r1
            long r14 = r14 * r11
            long r14 = r14 + r4
            java.lang.String r1 = "EdgeComputingMgr"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[EdgeComputingMgr] executeUnInstantTask configID : "
            r4.append(r5)
            java.lang.String r5 = r13.f355080a
            r4.append(r5)
            java.lang.String r5 = ", runtime : "
            r4.append(r5)
            r4.append(r14)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            if (r25 != 0) goto L_0x0168
            y81.b r1 = new y81.b
            r1.<init>()
            r25 = r1
        L_0x0168:
            java.lang.String r1 = "none"
            boolean r4 = u24.C90599h.m113511d(r1)
            if (r4 == 0) goto L_0x0175
            r38 = r2
            r11 = 4
            r12 = 2
            goto L_0x01af
        L_0x0175:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r5.add(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            r4.put(r1, r5)
            r1 = r60
            r38 = r2
            r2 = r25
            r8 = 3
            r3 = r13
            r5 = 2
            r11 = 4
            r12 = 2
            r5 = r6
            r7 = r36
            java.util.Map r1 = r1.wx0(r2, r3, r4, r5, r7)
            if (r1 == 0) goto L_0x01af
            int r2 = r1.size()
            if (r2 > 0) goto L_0x01a4
            goto L_0x01af
        L_0x01a4:
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            java.lang.Object r1 = r1.get(r2)
            java.util.List r1 = (java.util.List) r1
            goto L_0x01b1
        L_0x01af:
            r1 = r23
        L_0x01b1:
            java.lang.String r2 = r13.f355080a
            w81.C90900a.m114029b(r2, r11, r9)
            if (r1 == 0) goto L_0x0232
            int r2 = r1.size()
            if (r2 <= 0) goto L_0x0232
            int r2 = r13.f355088i
            if (r2 <= 0) goto L_0x01f6
            long r2 = android.os.SystemClock.uptimeMillis()
            c91.b r4 = r0.f351174g
            boolean r4 = r4.mo165802a(r1, r13)
            java.lang.String r5 = "EdgeComputingMgr"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "[EdgeComputingMgr] executeUnInstantTask saveResult1 ret : "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            j81.C87906e.m109407a(r5, r4)
            java.lang.String r4 = r13.f355080a
            long r5 = android.os.SystemClock.uptimeMillis()
            long r5 = r5 - r2
            int r2 = r1.size()
            w81.C90900a.m114037j(r4, r5, r2)
            java.lang.String r2 = r13.f355080a
            r3 = 6
            w81.C90900a.m114029b(r2, r3, r9)
        L_0x01f6:
            int r2 = r13.f355083d
            if (r2 <= 0) goto L_0x0232
            java.util.Iterator r1 = r1.iterator()
        L_0x01fe:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x022b
            java.lang.Object r2 = r1.next()
            java.util.List r2 = (java.util.List) r2
            int r3 = r13.f355089j
            r4 = 1
            if (r3 != r4) goto L_0x0219
            x81.a r3 = r0.f351175h
            java.lang.String r4 = r13.f355080a
            int r5 = r13.f355083d
            r3.mo183570b(r4, r5, r2)
            goto L_0x01fe
        L_0x0219:
            if (r3 != r12) goto L_0x0223
            x81.a r3 = r0.f351175h
            int r4 = r13.f355083d
            r3.mo183572e(r4, r2)
            goto L_0x01fe
        L_0x0223:
            x81.a r3 = r0.f351175h
            int r4 = r13.f355083d
            r3.mo183571c(r4, r2)
            goto L_0x01fe
        L_0x022b:
            java.lang.String r1 = r13.f355080a
            r7 = 7
            w81.C90900a.m114029b(r1, r7, r9)
            goto L_0x0233
        L_0x0232:
            r7 = 7
        L_0x0233:
            r4 = r14
            r15 = r34
            r2 = r38
            r11 = 3600000(0x36ee80, double:1.7786363E-317)
            goto L_0x0115
        L_0x023d:
            r34 = r15
            r11 = 4
            r1 = r0
            r14 = r2
            r4 = 7
            goto L_0x03f1
        L_0x0245:
            r38 = r2
            r34 = r15
            r7 = 7
            r11 = 4
            r12 = 2
            k81.c r2 = r1.f351172e
            java.lang.String r3 = r13.f355080a
            k81.a r2 = (k81.C117390a) r2
            boolean r4 = u24.C90599h.m113511d(r3)
            if (r4 != 0) goto L_0x0262
            m81.c r2 = r2.f351437a
            if (r2 != 0) goto L_0x025d
            goto L_0x0265
        L_0x025d:
            java.util.List r2 = r2.mo86413m(r3)
            goto L_0x0267
        L_0x0262:
            r2.getClass()
        L_0x0265:
            r2 = r23
        L_0x0267:
            if (r2 == 0) goto L_0x04ff
            int r3 = r2.size()
            if (r3 > 0) goto L_0x0271
            goto L_0x04ff
        L_0x0271:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x027a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x02a8
            java.lang.Object r3 = r2.next()
            u81.a r3 = (u81.C118604a) r3
            long r5 = r3.f354921s
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r5 = r4.get(r5)
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L_0x02a2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            long r14 = r3.f354921s
            java.lang.Long r6 = java.lang.Long.valueOf(r14)
            r4.put(r6, r5)
        L_0x02a2:
            java.lang.String r3 = r3.f354922t
            r5.add(r3)
            goto L_0x027a
        L_0x02a8:
            int r2 = r13.f355087h
            long r2 = (long) r2
            r14 = 3600000(0x36ee80, double:1.7786363E-317)
            long r2 = r2 * r14
            java.util.TimeZone r5 = java.util.TimeZone.getDefault()
            int r5 = r5.getRawOffset()
            long r5 = (long) r5
            int r8 = r13.f355087h
            if (r8 <= 0) goto L_0x02cb
            r14 = r38
            long r32 = r14 / r2
            long r32 = r32 * r2
            long r32 = r32 - r5
            long r2 = r32 - r2
            long r32 = r32 - r30
            r5 = r2
            goto L_0x02d0
        L_0x02cb:
            r14 = r38
            r5 = r14
            r32 = r5
        L_0x02d0:
            java.lang.String r2 = "EdgeComputingMgr"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "[EdgeComputingMgr] executeUnInstantTask configID : "
            r3.append(r8)
            java.lang.String r8 = r13.f355080a
            r3.append(r8)
            java.lang.String r8 = ", now : "
            r3.append(r8)
            r3.append(r14)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            if (r25 != 0) goto L_0x02f7
            y81.b r25 = new y81.b
            r25.<init>()
        L_0x02f7:
            r8 = r1
            r1 = r60
            r2 = r25
            r3 = r13
            r12 = r8
            r7 = r32
            java.util.Map r1 = r1.wx0(r2, r3, r4, r5, r7)
            java.lang.String r2 = r13.f355080a
            w81.C90900a.m114029b(r2, r11, r9)
            if (r1 == 0) goto L_0x03e6
            int r2 = r1.size()
            if (r2 <= 0) goto L_0x03e6
            int r2 = r13.f355088i
            if (r2 <= 0) goto L_0x037c
            long r2 = android.os.SystemClock.uptimeMillis()
            java.util.Set r4 = r1.keySet()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
        L_0x0322:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x036a
            java.lang.Object r6 = r4.next()
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.Object r6 = r1.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x0366
            int r7 = r6.size()
            if (r7 > 0) goto L_0x0345
            goto L_0x0366
        L_0x0345:
            c91.b r7 = r12.f351174g
            boolean r7 = r7.mo165802a(r6, r13)
            java.lang.String r8 = "EdgeComputingMgr"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r9 = "[EdgeComputingMgr] executeUnInstantTask saveResult2 ret : "
            r11.append(r9)
            r11.append(r7)
            java.lang.String r7 = r11.toString()
            j81.C87906e.m109407a(r8, r7)
            int r6 = r6.size()
            int r5 = r5 + r6
        L_0x0366:
            r9 = 0
            r11 = 4
            goto L_0x0322
        L_0x036a:
            java.lang.String r4 = r13.f355080a
            long r6 = android.os.SystemClock.uptimeMillis()
            long r6 = r6 - r2
            w81.C90900a.m114037j(r4, r6, r5)
            java.lang.String r2 = r13.f355080a
            r3 = 0
            r5 = 6
            w81.C90900a.m114029b(r2, r5, r3)
        L_0x037c:
            int r2 = r13.f355083d
            if (r2 <= 0) goto L_0x03e6
            java.util.Set r2 = r1.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0388:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03dd
            java.lang.Object r3 = r2.next()
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r3 = r1.get(r3)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x0388
            int r4 = r3.size()
            if (r4 > 0) goto L_0x03ab
            goto L_0x0388
        L_0x03ab:
            java.util.Iterator r3 = r3.iterator()
        L_0x03af:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0388
            java.lang.Object r4 = r3.next()
            java.util.List r4 = (java.util.List) r4
            int r5 = r13.f355089j
            r6 = 1
            if (r5 != r6) goto L_0x03ca
            x81.a r5 = r12.f351175h
            java.lang.String r6 = r13.f355080a
            int r7 = r13.f355083d
            r5.mo183570b(r6, r7, r4)
            goto L_0x03af
        L_0x03ca:
            r6 = 2
            if (r5 != r6) goto L_0x03d5
            x81.a r5 = r12.f351175h
            int r6 = r13.f355083d
            r5.mo183572e(r6, r4)
            goto L_0x03af
        L_0x03d5:
            x81.a r5 = r12.f351175h
            int r6 = r13.f355083d
            r5.mo183571c(r6, r4)
            goto L_0x03af
        L_0x03dd:
            java.lang.String r1 = r13.f355080a
            r2 = 0
            r4 = 7
            w81.C90900a.m114029b(r1, r4, r2)
            goto L_0x03e7
        L_0x03e6:
            r4 = 7
        L_0x03e7:
            k81.c r1 = r12.f351172e
            java.lang.String r2 = r13.f355080a
            k81.a r1 = (k81.C117390a) r1
            r1.mo182072a(r2)
            r1 = r12
        L_0x03f1:
            q81.a r2 = r1.f351177j
            java.lang.String r3 = r13.f355080a
            r2.getClass()
            boolean r5 = u24.C90599h.m113511d(r3)
            r7 = 0
            if (r5 != 0) goto L_0x041b
            int r5 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r5 > 0) goto L_0x0405
            goto L_0x041b
        L_0x0405:
            java.util.Map<java.lang.String, java.lang.Long> r5 = r2.f95626a
            monitor-enter(r5)
            java.util.Map<java.lang.String, java.lang.Long> r6 = r2.f95626a     // Catch:{ all -> 0x0418 }
            java.lang.Long r9 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0418 }
            java.util.HashMap r6 = (java.util.HashMap) r6     // Catch:{ all -> 0x0418 }
            r6.put(r3, r9)     // Catch:{ all -> 0x0418 }
            r2.mo60427a()     // Catch:{ all -> 0x0418 }
            monitor-exit(r5)     // Catch:{ all -> 0x0418 }
            goto L_0x041b
        L_0x0418:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0418 }
            throw r0
        L_0x041b:
            java.lang.String r2 = r13.f355080a
            long r5 = android.os.SystemClock.uptimeMillis()
            long r5 = r5 - r27
            int r3 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r3 > 0) goto L_0x0435
            com.tencent.mm.plugin.report.service.n r44 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r45 = 1409(0x581, double:6.96E-321)
            r47 = 68
            r49 = 1
            r51 = 0
            r44.idkeyStat(r45, r47, r49, r51)
            goto L_0x0466
        L_0x0435:
            int r3 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r3 > 0) goto L_0x0447
            com.tencent.mm.plugin.report.service.n r44 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r45 = 1409(0x581, double:6.96E-321)
            r47 = 69
            r49 = 1
            r51 = 0
            r44.idkeyStat(r45, r47, r49, r51)
            goto L_0x0466
        L_0x0447:
            int r3 = (r5 > r21 ? 1 : (r5 == r21 ? 0 : -1))
            if (r3 > 0) goto L_0x0459
            com.tencent.mm.plugin.report.service.n r44 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r45 = 1409(0x581, double:6.96E-321)
            r47 = 70
            r49 = 1
            r51 = 0
            r44.idkeyStat(r45, r47, r49, r51)
            goto L_0x0466
        L_0x0459:
            com.tencent.mm.plugin.report.service.n r52 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r53 = 1409(0x581, double:6.96E-321)
            r55 = 71
            r57 = 1
            r59 = 0
            r52.idkeyStat(r53, r55, r57, r59)
        L_0x0466:
            int r3 = (r5 > r21 ? 1 : (r5 == r21 ? 0 : -1))
            if (r3 > 0) goto L_0x0487
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 1409(0x581, double:6.96E-321)
            r47 = 72
            r11 = 0
            r45 = 1409(0x581, double:6.96E-321)
            r51 = 0
            r44 = r3
            r49 = r5
            r44.idkeyStat(r45, r47, r49, r51)
            r47 = 73
            r49 = 1
            r45 = r9
            r51 = r11
            r44.idkeyStat(r45, r47, r49, r51)
        L_0x0487:
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r52 = 1409(0x581, double:6.96E-321)
            r54 = 96
            r56 = 1
            r58 = 0
            r51 = r3
            r51.idkeyStat(r52, r54, r56, r58)
            boolean r9 = w81.C90900a.m114028a()
            if (r9 == 0) goto L_0x04c5
            r9 = 5
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r11 = 0
            r10[r11] = r2
            r11 = 9
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12 = 1
            r10[r12] = r11
            java.lang.Long r11 = java.lang.Long.valueOf(r5)
            r16 = 2
            r10[r16] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r7 = 3
            r10[r7] = r11
            java.lang.String r8 = ""
            r11 = 4
            r10[r11] = r8
            r8 = 20176(0x4ed0, float:2.8273E-41)
            r3.mo160131h(r8, r10)
            goto L_0x04ca
        L_0x04c5:
            r7 = 3
            r8 = 20176(0x4ed0, float:2.8273E-41)
            r9 = 5
            r12 = 1
        L_0x04ca:
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r10 = 0
            r3[r10] = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r3[r12] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r5 = 2
            r3[r5] = r2
            java.lang.String r2 = "EdgeComputingMonitor"
            java.lang.String r6 = "[EdgeComputingMonitor] statSingleScriptWorkTime configID : %s, costTime : %d, dataSzie : %d"
            j81.C87906e.m109408b(r2, r6, r3)
            java.lang.String r2 = "EdgeComputingMgr"
            java.lang.String r3 = "[EdgeComputingMgr] executeUnInstantTask configID : %s, costTime : %d"
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r5 = r13.f355080a
            r10 = 0
            r6[r10] = r5
            long r10 = android.os.SystemClock.uptimeMillis()
            long r10 = r10 - r27
            java.lang.Long r5 = java.lang.Long.valueOf(r10)
            r10 = 1
            r6[r10] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r6)
            goto L_0x0508
        L_0x04ff:
            r12 = r1
            r14 = r38
            r4 = 7
            r7 = 3
            r8 = 20176(0x4ed0, float:2.8273E-41)
            r9 = 5
        L_0x0507:
            r1 = r12
        L_0x0508:
            r2 = r14
            r15 = r34
            r9 = 0
            r11 = 3600000(0x36ee80, double:1.7786363E-317)
            r14 = 1
            goto L_0x009a
        L_0x0513:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0513 }
            throw r0
        L_0x0516:
            r12 = r1
            r34 = r15
            r4 = 7
            r7 = 3
            r8 = 20176(0x4ed0, float:2.8273E-41)
            r9 = 5
            x81.a r1 = r12.f351175h
            r1.mo183569a()
            if (r25 == 0) goto L_0x0528
            r25.mo125349b()
        L_0x0528:
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r34
            int r3 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r3 > 0) goto L_0x0540
            com.tencent.mm.plugin.report.service.n r36 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r37 = 1409(0x581, double:6.96E-321)
            r39 = 56
            r41 = 1
            r43 = 0
            r36.idkeyStat(r37, r39, r41, r43)
            goto L_0x0571
        L_0x0540:
            int r3 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r3 > 0) goto L_0x0552
            com.tencent.mm.plugin.report.service.n r36 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r37 = 1409(0x581, double:6.96E-321)
            r39 = 57
            r41 = 1
            r43 = 0
            r36.idkeyStat(r37, r39, r41, r43)
            goto L_0x0571
        L_0x0552:
            int r3 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            if (r3 > 0) goto L_0x0564
            com.tencent.mm.plugin.report.service.n r36 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r37 = 1409(0x581, double:6.96E-321)
            r39 = 58
            r41 = 1
            r43 = 0
            r36.idkeyStat(r37, r39, r41, r43)
            goto L_0x0571
        L_0x0564:
            com.tencent.mm.plugin.report.service.n r44 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r45 = 1409(0x581, double:6.96E-321)
            r47 = 59
            r49 = 1
            r51 = 0
            r44.idkeyStat(r45, r47, r49, r51)
        L_0x0571:
            int r3 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            if (r3 > 0) goto L_0x0592
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 1409(0x581, double:6.96E-321)
            r39 = 60
            r10 = 0
            r37 = 1409(0x581, double:6.96E-321)
            r43 = 0
            r36 = r3
            r41 = r1
            r36.idkeyStat(r37, r39, r41, r43)
            r39 = 61
            r41 = 1
            r37 = r5
            r43 = r10
            r36.idkeyStat(r37, r39, r41, r43)
        L_0x0592:
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r44 = 1409(0x581, double:6.96E-321)
            r46 = 94
            r48 = 1
            r50 = 0
            r43 = r3
            r43.idkeyStat(r44, r46, r48, r50)
            boolean r5 = w81.C90900a.m114028a()
            if (r5 == 0) goto L_0x05cd
            java.lang.Object[] r5 = new java.lang.Object[r9]
            r6 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            r5[r6] = r10
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 1
            r5[r6] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            r10 = 2
            r5[r10] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r5[r7] = r4
            java.lang.String r4 = ""
            r10 = 4
            r5[r10] = r4
            r3.mo160131h(r8, r5)
            goto L_0x05ce
        L_0x05cd:
            r6 = 1
        L_0x05ce:
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r3[r4] = r5
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3[r6] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r2 = 2
            r3[r2] = r1
            java.lang.String r1 = "EdgeComputingMonitor"
            java.lang.String r2 = "[EdgeComputingMonitor] statUnInstantTaskTime configID : %s, costTime : %d, dataSzie : %d"
            j81.C87906e.m109408b(r1, r2, r3)
            long r1 = android.os.SystemClock.uptimeMillis()
            o81.c r3 = o81.C117715c.wx0()
            r3.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Map<java.lang.String, v81.c> r5 = r3.f352041e
            monitor-enter(r5)
            java.util.Map<java.lang.String, v81.c> r6 = r3.f352041e     // Catch:{ all -> 0x0a56 }
            java.util.HashMap r6 = (java.util.HashMap) r6     // Catch:{ all -> 0x0a56 }
            java.util.Collection r6 = r6.values()     // Catch:{ all -> 0x0a56 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0a56 }
        L_0x060a:
            boolean r10 = r6.hasNext()     // Catch:{ all -> 0x0a56 }
            if (r10 == 0) goto L_0x061a
            java.lang.Object r10 = r6.next()     // Catch:{ all -> 0x0a56 }
            v81.c r10 = (v81.C118668c) r10     // Catch:{ all -> 0x0a56 }
            r4.add(r10)     // Catch:{ all -> 0x0a56 }
            goto L_0x060a
        L_0x061a:
            monitor-exit(r5)     // Catch:{ all -> 0x0a56 }
            o81.d r5 = new o81.d
            r5.<init>(r3)
            java.util.Collections.sort(r4, r5)
            int r3 = r4.size()
            if (r3 > 0) goto L_0x062b
            goto L_0x08d0
        L_0x062b:
            java.lang.String r3 = "EdgeComputingMgr"
            java.lang.String r5 = "[EdgeComputingMgr] executeSqlTask!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
            java.util.Iterator r3 = r4.iterator()
        L_0x0636:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x08c6
            java.lang.Object r4 = r3.next()
            v81.c r4 = (v81.C118668c) r4
            java.lang.String r5 = r4.f355096c
            boolean r5 = u24.C90599h.m113511d(r5)
            if (r5 == 0) goto L_0x064b
            goto L_0x0636
        L_0x064b:
            java.lang.String r5 = r4.f355096c
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r5)
            java.lang.String r6 = r4.f355101h
            boolean r5 = u24.C90599h.m113509b(r5, r6)
            if (r5 != 0) goto L_0x065a
            goto L_0x0636
        L_0x065a:
            p81.a r5 = r0.f351176i
            java.lang.String r6 = r4.f355094a
            boolean r10 = u24.C90599h.m113511d(r6)
            if (r10 == 0) goto L_0x0668
            r5.getClass()
            goto L_0x067a
        L_0x0668:
            java.util.Map<java.lang.String, java.lang.Long> r10 = r5.f94776d
            long r11 = java.lang.System.currentTimeMillis()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            java.util.HashMap r10 = (java.util.HashMap) r10
            r10.put(r6, r11)
            r5.mo60248a()
        L_0x067a:
            long r5 = android.os.SystemClock.uptimeMillis()
            if (r23 != 0) goto L_0x0686
            s81.a r10 = new s81.a
            r10.<init>()
            goto L_0x0688
        L_0x0686:
            r10 = r23
        L_0x0688:
            java.lang.String r11 = "Edge.db"
            java.lang.String r12 = r4.f355096c
            java.util.List r11 = r10.mo124408b(r11, r12)
            java.lang.String r12 = r4.f355094a
            long r13 = android.os.SystemClock.uptimeMillis()
            long r13 = r13 - r5
            if (r11 == 0) goto L_0x06a1
            r5 = r11
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            goto L_0x06a2
        L_0x06a1:
            r5 = 0
        L_0x06a2:
            int r6 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r6 > 0) goto L_0x06b4
            com.tencent.mm.plugin.report.service.n r36 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r37 = 1409(0x581, double:6.96E-321)
            r39 = 12
            r41 = 1
            r43 = 0
            r36.idkeyStat(r37, r39, r41, r43)
            goto L_0x06e5
        L_0x06b4:
            int r6 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r6 > 0) goto L_0x06c6
            com.tencent.mm.plugin.report.service.n r36 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r37 = 1409(0x581, double:6.96E-321)
            r39 = 13
            r41 = 1
            r43 = 0
            r36.idkeyStat(r37, r39, r41, r43)
            goto L_0x06e5
        L_0x06c6:
            int r6 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r6 > 0) goto L_0x06d8
            com.tencent.mm.plugin.report.service.n r36 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r37 = 1409(0x581, double:6.96E-321)
            r39 = 14
            r41 = 1
            r43 = 0
            r36.idkeyStat(r37, r39, r41, r43)
            goto L_0x06e5
        L_0x06d8:
            com.tencent.mm.plugin.report.service.n r44 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r45 = 1409(0x581, double:6.96E-321)
            r47 = 15
            r49 = 1
            r51 = 0
            r44.idkeyStat(r45, r47, r49, r51)
        L_0x06e5:
            int r6 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r6 > 0) goto L_0x0707
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r15 = 1409(0x581, double:6.96E-321)
            r39 = 47
            r23 = 0
            r37 = 1409(0x581, double:6.96E-321)
            r43 = 0
            r36 = r6
            r41 = r13
            r36.idkeyStat(r37, r39, r41, r43)
            r39 = 48
            r41 = 1
            r37 = r15
            r43 = r23
            r36.idkeyStat(r37, r39, r41, r43)
        L_0x0707:
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r44 = 1409(0x581, double:6.96E-321)
            r46 = 92
            r48 = 1
            r50 = 0
            r43 = r6
            r43.idkeyStat(r44, r46, r48, r50)
            boolean r15 = w81.C90900a.m114028a()
            if (r15 == 0) goto L_0x0741
            java.lang.Object[] r15 = new java.lang.Object[r9]
            r16 = 0
            r15[r16] = r12
            java.lang.Integer r16 = java.lang.Integer.valueOf(r7)
            r23 = 1
            r15[r23] = r16
            java.lang.Long r16 = java.lang.Long.valueOf(r13)
            r23 = 2
            r15[r23] = r16
            java.lang.Integer r16 = java.lang.Integer.valueOf(r5)
            r15[r7] = r16
            java.lang.String r16 = ""
            r23 = 4
            r15[r23] = r16
            r6.mo160131h(r8, r15)
        L_0x0741:
            java.lang.Object[] r6 = new java.lang.Object[r7]
            r15 = 0
            r6[r15] = r12
            java.lang.Long r12 = java.lang.Long.valueOf(r13)
            r13 = 1
            r6[r13] = r12
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r12 = 2
            r6[r12] = r5
            java.lang.String r5 = "EdgeComputingMonitor"
            java.lang.String r12 = "[EdgeComputingMonitor] statSQLQueryCostTime configID : %s, costTime : %d, dataSzie : %d"
            j81.C87906e.m109408b(r5, r12, r6)
            p81.a r5 = r0.f351176i
            java.lang.String r6 = r4.f355094a
            boolean r12 = u24.C90599h.m113511d(r6)
            if (r12 == 0) goto L_0x0769
            r5.getClass()
            goto L_0x0773
        L_0x0769:
            java.util.Map<java.lang.String, java.lang.Long> r12 = r5.f94776d
            java.util.HashMap r12 = (java.util.HashMap) r12
            r12.remove(r6)
            r5.mo60248a()
        L_0x0773:
            if (r11 == 0) goto L_0x08be
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            int r5 = r11.size()
            if (r5 > 0) goto L_0x077f
            goto L_0x08be
        L_0x077f:
            int r5 = r4.f355095b
            if (r5 <= 0) goto L_0x0886
            java.util.Iterator r5 = r11.iterator()
        L_0x0787:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0886
            java.lang.Object r6 = r5.next()
            java.util.List r6 = (java.util.List) r6
            int r11 = r4.f355099f
            r12 = 1
            if (r11 != r12) goto L_0x07eb
            x81.a r11 = r0.f351175h
            java.lang.String r12 = r4.f355094a
            int r13 = r4.f355095b
            r11.getClass()
            boolean r14 = u24.C90599h.m113511d(r12)
            if (r14 != 0) goto L_0x0880
            if (r13 <= 0) goto L_0x0880
            if (r6 == 0) goto L_0x0880
            int r14 = r6.size()
            if (r14 > 0) goto L_0x07b3
            goto L_0x0880
        L_0x07b3:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r15 = r6.iterator()
        L_0x07bc:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x07e0
            java.lang.Object r16 = r15.next()
            r8 = r16
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r7 = ","
            boolean r16 = r8.contains(r7)
            if (r16 == 0) goto L_0x07d8
            java.lang.String r9 = "\\$"
            java.lang.String r8 = r8.replace(r7, r9)
        L_0x07d8:
            r14.add(r8)
            r7 = 3
            r8 = 20176(0x4ed0, float:2.8273E-41)
            r9 = 5
            goto L_0x07bc
        L_0x07e0:
            x81.b r7 = r11.f355574a
            java.lang.String r6 = x81.C118864a.m167589f(r6)
            r7.mo73929a(r12, r13, r6)
            goto L_0x0880
        L_0x07eb:
            r7 = 2
            if (r11 != r7) goto L_0x0824
            x81.a r7 = r0.f351175h
            int r8 = r4.f355095b
            r7.getClass()
            if (r8 <= 0) goto L_0x0880
            if (r6 == 0) goto L_0x0880
            int r7 = r6.size()
            if (r7 > 0) goto L_0x0801
            goto L_0x0880
        L_0x0801:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "[EdgeComputingReporter] rtKVReportStrData logID : "
            r7.append(r9)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r9 = "EdgeComputingReporter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r7)
            java.lang.String r7 = x81.C118864a.m167589f(r6)
            x81.a$$a r9 = new x81.a$$a
            r9.<init>(r8, r6)
            x81.C118864a.m167588d(r8, r7, r9)
            goto L_0x0880
        L_0x0824:
            x81.a r7 = r0.f351175h
            int r12 = r4.f355095b
            r7.getClass()
            if (r6 == 0) goto L_0x0880
            int r7 = r6.size()
            if (r7 <= 0) goto L_0x0880
            if (r12 > 0) goto L_0x0836
            goto L_0x0880
        L_0x0836:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "[EdgeComputingReporter] kvReportStrData logID : "
            r7.append(r8)
            r7.append(r12)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "EdgeComputingReporter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x0855:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0873
            java.lang.Object r8 = r6.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = ","
            boolean r11 = r8.contains(r9)
            if (r11 == 0) goto L_0x086f
            java.lang.String r11 = "\\$"
            java.lang.String r8 = r8.replace(r9, r11)
        L_0x086f:
            r7.add(r8)
            goto L_0x0855
        L_0x0873:
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.String r13 = x81.C118864a.m167589f(r7)
            r14 = 0
            r15 = 0
            r16 = 1
            r11.mo160134j(r12, r13, r14, r15, r16)
        L_0x0880:
            r7 = 3
            r8 = 20176(0x4ed0, float:2.8273E-41)
            r9 = 5
            goto L_0x0787
        L_0x0886:
            o81.c r5 = o81.C117715c.wx0()
            java.lang.String r4 = r4.f355094a
            r5.getClass()
            boolean r6 = u24.C90599h.m113511d(r4)
            if (r6 == 0) goto L_0x0896
            goto L_0x08be
        L_0x0896:
            java.lang.String r6 = "EdgeComputingConfigService"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "[EdgeComputingConfigService] removeSqlConfigModel, configID : "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            java.util.Map<java.lang.String, v81.c> r6 = r5.f352041e
            monitor-enter(r6)
            java.util.Map<java.lang.String, v81.c> r7 = r5.f352041e     // Catch:{ all -> 0x08bb }
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch:{ all -> 0x08bb }
            r7.remove(r4)     // Catch:{ all -> 0x08bb }
            r5.Ax0()     // Catch:{ all -> 0x08bb }
            monitor-exit(r6)     // Catch:{ all -> 0x08bb }
            goto L_0x08be
        L_0x08bb:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x08bb }
            throw r0
        L_0x08be:
            r23 = r10
            r7 = 3
            r8 = 20176(0x4ed0, float:2.8273E-41)
            r9 = 5
            goto L_0x0636
        L_0x08c6:
            if (r23 == 0) goto L_0x08cb
            r23.mo124409c()
        L_0x08cb:
            x81.a r0 = r0.f351175h
            r0.mo183569a()
        L_0x08d0:
            long r3 = android.os.SystemClock.uptimeMillis()
            long r3 = r3 - r1
            int r0 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r0 > 0) goto L_0x08e6
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 1409(0x581, double:6.96E-321)
            r8 = 62
            r10 = 1
            r12 = 0
            r5.idkeyStat(r6, r8, r10, r12)
            goto L_0x0915
        L_0x08e6:
            int r0 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r0 > 0) goto L_0x08f7
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 1409(0x581, double:6.96E-321)
            r8 = 63
            r10 = 1
            r12 = 0
            r5.idkeyStat(r6, r8, r10, r12)
            goto L_0x0915
        L_0x08f7:
            int r0 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1))
            if (r0 > 0) goto L_0x0908
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 1409(0x581, double:6.96E-321)
            r8 = 64
            r10 = 1
            r12 = 0
            r5.idkeyStat(r6, r8, r10, r12)
            goto L_0x0915
        L_0x0908:
            com.tencent.mm.plugin.report.service.n r43 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r44 = 1409(0x581, double:6.96E-321)
            r46 = 65
            r48 = 1
            r50 = 0
            r43.idkeyStat(r44, r46, r48, r50)
        L_0x0915:
            int r0 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1))
            if (r0 > 0) goto L_0x0931
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 1409(0x581, double:6.96E-321)
            r8 = 66
            r13 = 0
            r6 = 1409(0x581, double:6.96E-321)
            r12 = 0
            r5 = r0
            r10 = r3
            r5.idkeyStat(r6, r8, r10, r12)
            r8 = 67
            r10 = 1
            r6 = r1
            r12 = r13
            r5.idkeyStat(r6, r8, r10, r12)
        L_0x0931:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r44 = 1409(0x581, double:6.96E-321)
            r46 = 95
            r48 = 1
            r50 = 0
            r43 = r0
            r43.idkeyStat(r44, r46, r48, r50)
            boolean r1 = w81.C90900a.m114028a()
            if (r1 == 0) goto L_0x0972
            r1 = 5
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r1 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r2[r1] = r5
            r1 = 8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5 = 1
            r2[r5] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r6 = 2
            r2[r6] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r6 = 3
            r2[r6] = r1
            java.lang.String r1 = ""
            r7 = 4
            r2[r7] = r1
            r1 = 20176(0x4ed0, float:2.8273E-41)
            r0.mo160131h(r1, r2)
            goto L_0x0974
        L_0x0972:
            r5 = 1
            r6 = 3
        L_0x0974:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r2 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r1[r2] = r6
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            r1[r5] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r3 = 2
            r1[r3] = r2
            java.lang.String r2 = "EdgeComputingMonitor"
            java.lang.String r3 = "[EdgeComputingMonitor] statSqlTaskTime configID : %s, costTime : %d, dataSzie : %d"
            j81.C87906e.m109408b(r2, r3, r1)
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r34
            int r3 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r3 > 0) goto L_0x09a9
            r44 = 1409(0x581, double:6.96E-321)
            r46 = 16
            r48 = 1
            r50 = 0
            r43 = r0
            r43.idkeyStat(r44, r46, r48, r50)
            goto L_0x09da
        L_0x09a9:
            int r3 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r3 > 0) goto L_0x09bb
            r44 = 1409(0x581, double:6.96E-321)
            r46 = 17
            r48 = 1
            r50 = 0
            r43 = r0
            r43.idkeyStat(r44, r46, r48, r50)
            goto L_0x09da
        L_0x09bb:
            int r3 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            if (r3 > 0) goto L_0x09cd
            r44 = 1409(0x581, double:6.96E-321)
            r46 = 18
            r48 = 1
            r50 = 0
            r43 = r0
            r43.idkeyStat(r44, r46, r48, r50)
            goto L_0x09da
        L_0x09cd:
            r44 = 1409(0x581, double:6.96E-321)
            r46 = 19
            r48 = 1
            r50 = 0
            r43 = r0
            r43.idkeyStat(r44, r46, r48, r50)
        L_0x09da:
            int r3 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            if (r3 > 0) goto L_0x09f9
            r3 = 1409(0x581, double:6.96E-321)
            r46 = 49
            r5 = 0
            r44 = 1409(0x581, double:6.96E-321)
            r50 = 0
            r43 = r0
            r48 = r1
            r43.idkeyStat(r44, r46, r48, r50)
            r46 = 50
            r48 = 1
            r44 = r3
            r50 = r5
            r43.idkeyStat(r44, r46, r48, r50)
        L_0x09f9:
            r44 = 1409(0x581, double:6.96E-321)
            r46 = 93
            r48 = 1
            r50 = 0
            r43 = r0
            r43.idkeyStat(r44, r46, r48, r50)
            boolean r3 = w81.C90900a.m114028a()
            if (r3 == 0) goto L_0x0a36
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r3[r4] = r5
            r4 = 4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = 1
            r3[r6] = r5
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            r7 = 2
            r3[r7] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r7 = 3
            r3[r7] = r5
            java.lang.String r5 = ""
            r3[r4] = r5
            r4 = 20176(0x4ed0, float:2.8273E-41)
            r0.mo160131h(r4, r3)
            goto L_0x0a38
        L_0x0a36:
            r6 = 1
            r7 = 3
        L_0x0a38:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r0[r3] = r4
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0[r6] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = "EdgeComputingMonitor"
            java.lang.String r2 = "[EdgeComputingMonitor] statRegularTaskTime configID : %s, costTime : %d, dataSzie : %d"
            j81.C87906e.m109408b(r1, r2, r0)
        L_0x0a55:
            return
        L_0x0a56:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0a56 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j81.C117302a.vx0(j81.a, boolean):void");
    }

    public static C117302a xx0() {
        return (C117302a) C86312j.m106911c(C117302a.class);
    }

    public List<String> H30(String str, String str2) {
        List<String> list = null;
        if (!C90599h.m113511d(str) && !C90599h.m113511d(str2)) {
            C91381b bVar = new C91381b();
            if (!C90599h.m113511d(str2) && !C90599h.m113511d(str)) {
                Log.m105924i("EdgeComputingScriptService", "[EdgeComputingScriptService] executePureScript");
                if (!((C91623a) bVar.f262076a).mo125488b(str)) {
                    Log.m105920e("EdgeComputingScriptService", "[EdgeComputingScriptService] executePureScript loadScript fail!");
                } else {
                    C91623a aVar = (C91623a) bVar.f262076a;
                    list = aVar.mo125487a("__main__", str2, bVar.mo125348a(C77710q.m93738a(C86709a0.m107523b().mo121110g()), C89625d.f257841g, 0, 0));
                }
            }
            bVar.mo125349b();
        }
        return list;
    }

    /* renamed from: Nq */
    public void mo121918Nq(String str) {
        if (!C90599h.m113511d(str)) {
            C118412l lVar = this.f351171d;
            lVar.getClass();
            if (C87906e.m109416j()) {
                if (C90599h.m113511d(str)) {
                    Log.m105920e("EdgeComputingDataSourceService", "[EdgeComputingDataSourceService] sendDataReportSDKUBAData data isEmpty!");
                    return;
                }
                C87906e.m109407a("EdgeComputingDataSourceService", "[EdgeComputingDataSourceService] sendDataReportSDKUBAData data : " + str);
                lVar.f353895b.post(new C118401a(lVar, System.currentTimeMillis(), str));
            }
        }
    }

    public void a80(String str) {
        if (!C90599h.m113511d(str)) {
            C118412l lVar = this.f351171d;
            lVar.getClass();
            if (C87906e.m109416j()) {
                if (C90599h.m113511d(str)) {
                    Log.m105920e("EdgeComputingDataSourceService", "[EdgeComputingDataSourceService] sendDataReportSDKData data isEmpty!");
                    return;
                }
                C87906e.m109407a("EdgeComputingDataSourceService", "[EdgeComputingDataSourceService] sendDataReportSDKData data : " + str);
                lVar.f353895b.post(new C118402b(lVar, System.currentTimeMillis(), str));
            }
        }
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        C113256b bVar = this.f351174g;
        C90189z.C90190a aVar = bVar.f338868a;
        if (aVar != null) {
            aVar.mo124435t(bVar.hashCode());
        }
        C90189z.C90190a aVar2 = null;
        bVar.f338868a = null;
        try {
            aVar2 = C90189z.m112866a(bVar.hashCode(), C86709a0.m107535s().f251807e + "Edge.db", new HashMap(), true);
        } catch (Exception e) {
            Log.m105920e("EdgeComputingDataStorage", "[EdgeComputingDataStorage] resetDB createDBInstance throw Exception : " + e.getMessage());
        }
        if (aVar2 != null) {
            bVar.f338868a = aVar2;
        }
        ((C117390a) this.f351172e).mo182073b();
        ((C117390a) this.f351173f).mo182073b();
        if (C87906e.m109416j()) {
            this.f351179o.removeMessages(1003);
            this.f351179o.sendEmptyMessageDelayed(1003, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        }
        this.f351180p.alive();
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        C113256b bVar = this.f351174g;
        C90189z.C90190a aVar = bVar.f338868a;
        if (aVar != null) {
            aVar.mo124435t(bVar.hashCode());
        }
        bVar.f338868a = null;
        C117390a aVar2 = (C117390a) this.f351172e;
        C117542c cVar = aVar2.f351437a;
        if (cVar != null) {
            cVar.close();
        }
        aVar2.f351437a = null;
        C117390a aVar3 = (C117390a) this.f351173f;
        C117542c cVar2 = aVar3.f351437a;
        if (cVar2 != null) {
            cVar2.close();
        }
        aVar3.f351437a = null;
        this.f351180p.dead();
    }

    public void onCreate(Context context) {
        super.onCreate(context);
        this.f351171d = new C118412l(this);
        this.f351172e = C117391b.m165531a(1);
        this.f351173f = C117391b.m165531a(2);
        this.f351175h = new C118864a();
        this.f351176i = new C35414a();
        this.f351177j = new C35815a();
        this.f351178n = new C118226a();
        this.f351174g = new C113256b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Long, java.util.List<java.util.List<u81.C118605b>>> wx0(y81.C91381b r38, v81.C118667b r39, java.util.Map<java.lang.Long, java.util.List<java.lang.String>> r40, long r41, long r43) {
        /*
            r37 = this;
            r0 = r37
            r8 = r38
            r9 = r39
            r10 = r40
            r1 = 0
            if (r8 == 0) goto L_0x039b
            if (r9 == 0) goto L_0x039b
            if (r10 == 0) goto L_0x039b
            int r2 = r40.size()
            if (r2 <= 0) goto L_0x039b
            p81.a r2 = r0.f351176i
            java.lang.String r3 = r9.f355080a
            r2.getClass()
            boolean r4 = u24.C90599h.m113511d(r3)
            if (r4 == 0) goto L_0x0024
        L_0x0022:
            r2 = 1
            goto L_0x004c
        L_0x0024:
            boolean r4 = j81.C87906e.m109415i()
            if (r4 != 0) goto L_0x004b
            java.util.Map<java.lang.String, java.lang.Long> r2 = r2.f94773a
            java.util.HashMap r2 = (java.util.HashMap) r2
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L_0x004b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "[EdgeComputingConfigBreaker] isErrorScriptConfig configID : "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "EdgeComputingConfigBreaker"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            goto L_0x0022
        L_0x004b:
            r2 = 0
        L_0x004c:
            if (r2 == 0) goto L_0x0050
            goto L_0x039b
        L_0x0050:
            java.util.Collection r2 = r40.values()
            java.util.Iterator r2 = r2.iterator()
            r13 = 0
        L_0x0059:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x006b
            java.lang.Object r3 = r2.next()
            java.util.List r3 = (java.util.List) r3
            int r3 = r3.size()
            int r13 = r13 + r3
            goto L_0x0059
        L_0x006b:
            long r14 = android.os.SystemClock.uptimeMillis()
            java.lang.String r2 = r9.f355080a
            boolean r3 = u24.C90599h.m113511d(r2)
            if (r3 == 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            w81.C90900a.f260888b = r2
        L_0x007a:
            p81.a r2 = r0.f351176i
            java.lang.String r3 = r9.f355080a
            boolean r4 = u24.C90599h.m113511d(r3)
            if (r4 == 0) goto L_0x0088
            r2.getClass()
            goto L_0x009a
        L_0x0088:
            java.util.Map<java.lang.String, java.lang.Long> r4 = r2.f94775c
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.util.HashMap r4 = (java.util.HashMap) r4
            r4.put(r3, r5)
            r2.mo60248a()
        L_0x009a:
            int r2 = r40.size()
            java.lang.String r6 = ""
            r7 = 2
            if (r2 > 0) goto L_0x00a5
            goto L_0x029b
        L_0x00a5:
            java.lang.String r2 = r9.f355090k
            boolean r2 = u24.C90599h.m113511d(r2)
            if (r2 != 0) goto L_0x029b
            java.lang.String r2 = r9.f355093n
            boolean r2 = u24.C90599h.m113511d(r2)
            if (r2 == 0) goto L_0x00b7
            goto L_0x029b
        L_0x00b7:
            java.lang.String r2 = r9.f355090k
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r2)
            java.lang.String r3 = r9.f355093n
            boolean r2 = u24.C90599h.m113509b(r2, r3)
            if (r2 != 0) goto L_0x00c7
            goto L_0x029b
        L_0x00c7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[EdgeComputingScriptService] executeScript configID : "
            r2.append(r3)
            java.lang.String r3 = r9.f355080a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "EdgeComputingScriptService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            z81.b r2 = r8.f262076a
            java.lang.String r4 = r9.f355090k
            z81.a r2 = (z81.C91623a) r2
            boolean r2 = r2.mo125488b(r4)
            if (r2 != 0) goto L_0x00f2
            java.lang.String r2 = "[EdgeComputingScriptService] executeScript loadScript fail!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
            goto L_0x029b
        L_0x00f2:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Set r1 = r40.keySet()
            java.util.Iterator r16 = r1.iterator()
        L_0x00ff:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x0294
            java.lang.Object r1 = r16.next()
            java.lang.Long r1 = (java.lang.Long) r1
            long r2 = r1.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.Object r1 = r10.get(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0290
            int r5 = r1.size()
            if (r5 > 0) goto L_0x0122
            goto L_0x00ff
        L_0x0122:
            java.util.Iterator r17 = r1.iterator()
        L_0x0126:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x0290
            java.lang.Object r1 = r17.next()
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            boolean r1 = u24.C90599h.m113511d(r5)
            if (r1 == 0) goto L_0x013a
            goto L_0x0126
        L_0x013a:
            z81.b r1 = r8.f262076a
            f40.e r18 = f40.C86709a0.m107523b()
            int r18 = r18.mo121110g()
            java.lang.String r18 = p823sg.C77710q.m93738a(r18)
            int r19 = qe3.C89625d.f257841g
            r20 = r1
            r1 = r38
            r21 = r13
            r12 = r2
            r2 = r18
            r3 = r19
            r22 = r4
            r11 = r5
            r4 = r41
            r10 = r6
            r23 = r14
            r14 = 2
            r6 = r43
            java.lang.String r1 = r1.mo125348a(r2, r3, r4, r6)
            r2 = r20
            z81.a r2 = (z81.C91623a) r2
            java.lang.String r3 = "__main__"
            java.util.List r1 = r2.mo125487a(r3, r11, r1)
            if (r1 == 0) goto L_0x0283
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            if (r2 > 0) goto L_0x017a
            goto L_0x0283
        L_0x017a:
            java.util.Iterator r1 = r1.iterator()
        L_0x017e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0283
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = u24.C90599h.m113511d(r2)
            if (r3 == 0) goto L_0x0191
            goto L_0x017e
        L_0x0191:
            java.lang.String r3 = ","
            java.lang.String[] r2 = r2.split(r3)
            if (r2 == 0) goto L_0x017e
            int r3 = r2.length
            if (r3 > 0) goto L_0x019d
            goto L_0x017e
        L_0x019d:
            java.util.List<v81.a> r3 = r9.f355084e
            if (r3 == 0) goto L_0x017e
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r3 = r3.size()
            if (r3 > 0) goto L_0x01aa
            goto L_0x017e
        L_0x01aa:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            u81.b r4 = new u81.b
            r4.<init>()
            r5 = 0
            r4.f354923a = r5
            r4.f354924b = r14
            java.lang.String r5 = "report_time_ec"
            r4.f354925c = r5
            r4.f354927e = r12
            r3.add(r4)
            java.util.List<v81.a> r4 = r9.f355084e
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x01cb:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0253
            java.lang.Object r5 = r4.next()
            v81.a r5 = (v81.C118666a) r5
            int r6 = r5.f355077a
            r7 = 1
            if (r6 < r7) goto L_0x0250
            int r7 = r2.length
            int r6 = r6 + -1
            if (r7 > r6) goto L_0x01e3
            goto L_0x0250
        L_0x01e3:
            u81.b r6 = new u81.b
            r6.<init>()
            int r7 = r5.f355077a
            r6.f354923a = r7
            int r11 = r5.f355078b
            r6.f354924b = r11
            java.lang.String r15 = r5.f355079c
            r6.f354925c = r15
            r15 = 1
            if (r11 != r15) goto L_0x0213
            int r7 = r7 + -1
            r7 = r2[r7]     // Catch:{ Exception -> 0x0231 }
            boolean r7 = u24.C90599h.m113511d(r7)     // Catch:{ Exception -> 0x0231 }
            if (r7 == 0) goto L_0x0205
            r7 = 0
            r6.f354926d = r7     // Catch:{ Exception -> 0x0231 }
            goto L_0x024a
        L_0x0205:
            int r5 = r5.f355077a     // Catch:{ Exception -> 0x0231 }
            r7 = 1
            int r5 = r5 - r7
            r5 = r2[r5]     // Catch:{ Exception -> 0x0231 }
            r7 = 0
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r7)     // Catch:{ Exception -> 0x0231 }
            r6.f354926d = r5     // Catch:{ Exception -> 0x0231 }
            goto L_0x024a
        L_0x0213:
            if (r11 != r14) goto L_0x0233
            int r7 = r7 + -1
            r7 = r2[r7]     // Catch:{ Exception -> 0x0231 }
            boolean r7 = u24.C90599h.m113511d(r7)     // Catch:{ Exception -> 0x0231 }
            r14 = 0
            if (r7 == 0) goto L_0x0224
            r6.f354927e = r14     // Catch:{ Exception -> 0x0231 }
            goto L_0x024a
        L_0x0224:
            int r5 = r5.f355077a     // Catch:{ Exception -> 0x0231 }
            r7 = 1
            int r5 = r5 - r7
            r5 = r2[r5]     // Catch:{ Exception -> 0x0231 }
            long r14 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r5, r14)     // Catch:{ Exception -> 0x0231 }
            r6.f354927e = r14     // Catch:{ Exception -> 0x0231 }
            goto L_0x024a
        L_0x0231:
            goto L_0x024e
        L_0x0233:
            if (r11 != 0) goto L_0x024e
            int r7 = r7 + -1
            r7 = r2[r7]     // Catch:{ Exception -> 0x0231 }
            boolean r7 = u24.C90599h.m113511d(r7)     // Catch:{ Exception -> 0x0231 }
            if (r7 == 0) goto L_0x0242
            r6.f354928f = r10     // Catch:{ Exception -> 0x0231 }
            goto L_0x024a
        L_0x0242:
            int r5 = r5.f355077a     // Catch:{ Exception -> 0x0231 }
            r7 = 1
            int r5 = r5 - r7
            r5 = r2[r5]     // Catch:{ Exception -> 0x0231 }
            r6.f354928f = r5     // Catch:{ Exception -> 0x0231 }
        L_0x024a:
            r3.add(r6)
            goto L_0x0250
        L_0x024e:
            r2 = 1
            goto L_0x0254
        L_0x0250:
            r14 = 2
            goto L_0x01cb
        L_0x0253:
            r2 = 0
        L_0x0254:
            y81.a r4 = new y81.a
            r4.<init>(r8)
            java.util.Collections.sort(r3, r4)
            if (r2 != 0) goto L_0x027c
            java.lang.Long r2 = java.lang.Long.valueOf(r12)
            r4 = r22
            java.lang.Object r2 = r4.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L_0x0278
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.Long r5 = java.lang.Long.valueOf(r12)
            r4.put(r5, r2)
        L_0x0278:
            r2.add(r3)
            goto L_0x027e
        L_0x027c:
            r4 = r22
        L_0x027e:
            r22 = r4
            r14 = 2
            goto L_0x017e
        L_0x0283:
            r6 = r10
            r2 = r12
            r13 = r21
            r4 = r22
            r14 = r23
            r7 = 2
            r10 = r40
            goto L_0x0126
        L_0x0290:
            r10 = r40
            goto L_0x00ff
        L_0x0294:
            r10 = r6
            r21 = r13
            r23 = r14
            r1 = r4
            goto L_0x02a0
        L_0x029b:
            r10 = r6
            r21 = r13
            r23 = r14
        L_0x02a0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[EdgeComputingMgr] edgeComputing configID : "
            r2.append(r3)
            java.lang.String r3 = r9.f355080a
            r2.append(r3)
            java.lang.String r3 = ", dataSize : "
            r2.append(r3)
            r11 = r21
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "EdgeComputingMgr"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            p81.a r2 = r0.f351176i
            java.lang.String r3 = r9.f355080a
            boolean r4 = u24.C90599h.m113511d(r3)
            if (r4 == 0) goto L_0x02d0
            r2.getClass()
            goto L_0x02da
        L_0x02d0:
            java.util.Map<java.lang.String, java.lang.Long> r4 = r2.f94775c
            java.util.HashMap r4 = (java.util.HashMap) r4
            r4.remove(r3)
            r2.mo60248a()
        L_0x02da:
            java.lang.String r2 = r9.f355080a
            long r3 = android.os.SystemClock.uptimeMillis()
            long r3 = r3 - r23
            r5 = 1000(0x3e8, double:4.94E-321)
            r7 = 10
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x02f8
            com.tencent.mm.plugin.report.service.n r21 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r22 = 1409(0x581, double:6.96E-321)
            r24 = 0
            r26 = 1
            r28 = 0
            r21.idkeyStat(r22, r24, r26, r28)
            goto L_0x032b
        L_0x02f8:
            r7 = 100
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x030c
            com.tencent.mm.plugin.report.service.n r21 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r22 = 1409(0x581, double:6.96E-321)
            r24 = 1
            r26 = 1
            r28 = 0
            r21.idkeyStat(r22, r24, r26, r28)
            goto L_0x032b
        L_0x030c:
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x031e
            com.tencent.mm.plugin.report.service.n r21 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r22 = 1409(0x581, double:6.96E-321)
            r24 = 2
            r26 = 1
            r28 = 0
            r21.idkeyStat(r22, r24, r26, r28)
            goto L_0x032b
        L_0x031e:
            com.tencent.mm.plugin.report.service.n r29 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r30 = 1409(0x581, double:6.96E-321)
            r32 = 3
            r34 = 1
            r36 = 0
            r29.idkeyStat(r30, r32, r34, r36)
        L_0x032b:
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0349
            com.tencent.mm.plugin.report.service.n r21 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r26 = 1409(0x581, double:6.96E-321)
            r28 = 34
            r32 = 0
            r25 = r21
            r30 = r3
            r25.idkeyStat(r26, r28, r30, r32)
            r22 = 1409(0x581, double:6.96E-321)
            r24 = 35
            r26 = 1
            r28 = 0
            r21.idkeyStat(r22, r24, r26, r28)
        L_0x0349:
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r30 = 1409(0x581, double:6.96E-321)
            r32 = 89
            r34 = 1
            r36 = 0
            r29 = r5
            r29.idkeyStat(r30, r32, r34, r36)
            boolean r6 = w81.C90900a.m114028a()
            r7 = 3
            if (r6 == 0) goto L_0x0381
            r6 = 20176(0x4ed0, float:2.8273E-41)
            r8 = 5
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r9 = 0
            r8[r9] = r2
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            r9 = 1
            r8[r9] = r12
            java.lang.Long r9 = java.lang.Long.valueOf(r3)
            r12 = 2
            r8[r12] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
            r8[r7] = r9
            r9 = 4
            r8[r9] = r10
            r5.mo160131h(r6, r8)
        L_0x0381:
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r6 = 0
            r5[r6] = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            r3 = 1
            r5[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r3 = 2
            r5[r3] = r2
            java.lang.String r2 = "EdgeComputingMonitor"
            java.lang.String r3 = "[EdgeComputingMonitor] statComputingCostTime configID : %s, costTime : %d, dataSzie : %d"
            j81.C87906e.m109408b(r2, r3, r5)
        L_0x039b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j81.C117302a.wx0(y81.b, v81.b, java.util.Map, long, long):java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004d, code lost:
        if (r0 > r81.C118226a.f353380b) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void yx0(long r11, v81.C118667b r13, java.lang.String r14) {
        /*
            r10 = this;
            if (r13 == 0) goto L_0x00b9
            boolean r0 = u24.C90599h.m113511d(r14)
            if (r0 == 0) goto L_0x000a
            goto L_0x00b9
        L_0x000a:
            r81.a r0 = r10.f351178n
            java.lang.String r1 = r13.f355080a
            r0.getClass()
            boolean r2 = u24.C90599h.m113511d(r1)
            r3 = 0
            if (r2 == 0) goto L_0x0019
            goto L_0x0051
        L_0x0019:
            long r4 = java.lang.System.currentTimeMillis()
            java.util.Map<java.lang.String, r81.a$a> r2 = r0.f353385a
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r2 = r2.get(r1)
            r81.a$a r2 = (r81.C118226a.C118227a) r2
            if (r2 != 0) goto L_0x0035
            r81.a$a r2 = new r81.a$a
            r2.<init>(r0, r4, r3)
            java.util.Map<java.lang.String, r81.a$a> r0 = r0.f353385a
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r1, r2)
        L_0x0035:
            long r0 = r2.f353386a
            long r0 = r4 - r0
            r6 = 60000(0xea60, double:2.9644E-319)
            r8 = 1
            int r9 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x0046
            r2.f353386a = r4
            r2.f353387b = r8
            goto L_0x0050
        L_0x0046:
            int r0 = r2.f353387b
            int r0 = r0 + r8
            r2.f353387b = r0
            int r1 = r81.C118226a.f353380b
            if (r0 <= r1) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r3 = 1
        L_0x0051:
            java.lang.String r0 = "EdgeComputingMgr"
            if (r3 != 0) goto L_0x006c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "[EdgeComputingMgr] onDataReceive reject handle for frequency configID : "
            r11.append(r12)
            java.lang.String r12 = r13.f355080a
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r11)
            return
        L_0x006c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[EdgeComputingMgr] onDataReceive configID : "
            r1.append(r2)
            java.lang.String r2 = r13.f355080a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            j81.C87906e.m109407a(r0, r1)
            java.lang.String r0 = r13.f355080a
            r1 = 3
            w81.C90900a.m114029b(r0, r1, r11)
            u81.a r0 = new u81.a
            r0.<init>()
            r0.f354922t = r14
            java.lang.String r14 = r13.f355080a
            r0.f354920r = r14
            r0.f354921s = r11
            com.tencent.mm.sdk.platformtools.MMHandler r11 = r10.f351179o
            j81.a$c r12 = new j81.a$c
            r12.<init>(r13, r0)
            r11.post(r12)
            com.tencent.mm.sdk.platformtools.MMHandler r11 = r10.f351179o
            r12 = 1004(0x3ec, float:1.407E-42)
            r11.removeMessages(r12)
            com.tencent.mm.sdk.platformtools.MMHandler r11 = r10.f351179o
            r13 = 3000(0xbb8, double:1.482E-320)
            r11.sendEmptyMessageDelayed(r12, r13)
            com.tencent.mm.sdk.platformtools.MMHandler r11 = r10.f351179o
            r12 = 1002(0x3ea, float:1.404E-42)
            r11.removeMessages(r12)
            com.tencent.mm.sdk.platformtools.MMHandler r11 = r10.f351179o
            r11.sendEmptyMessageDelayed(r12, r13)
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j81.C117302a.yx0(long, v81.b, java.lang.String):void");
    }
}
