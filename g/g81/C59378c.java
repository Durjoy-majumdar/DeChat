package g81;

import android.os.Build;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.LinkedList;
import java.util.List;
import kj2.C117407d;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p156gj.C87203t;
import te3.C64242as3;
import te3.C64389ga0;
import te3.C64673r40;
import te3.C64893zr3;

/* renamed from: g81.c */
public class C59378c extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f169711d;

    /* renamed from: e */
    public long f169712e;

    /* renamed from: f */
    public long f169713f;

    /* renamed from: g */
    public C32343a f169714g;

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f169711d = nVar;
        this.f169714g = C32343a.m39684a();
        if (C86709a0.m107522a()) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_REPORT_EXPT_APP_LAST_TIME_SEC_INT, Integer.valueOf((int) Util.nowSecond()));
            long j = C32343a.m39684a().f85839a;
            this.f169712e = j;
            if (j == 0) {
                Log.m105921e("MicroMsg.ReportExptAppInfo", "acquisition did not start  [%d]", Long.valueOf(j));
                return -1;
            }
            this.f169713f = Util.nowMilliSecond();
            Log.m105925i("MicroMsg.ReportExptAppInfo", "acquisition beginTime[%d] endTime[%d]", Long.valueOf(this.f169712e), Long.valueOf(this.f169713f));
            try {
                C47350c.C47352b bVar = new C47350c.C47352b();
                bVar.f127066a = new C64893zr3();
                bVar.f127067b = new C64242as3();
                bVar.f127068c = "/cgi-bin/mmfddataappsvr/reportexptappinfo";
                bVar.f127069d = 1020;
                bVar.f127070e = 0;
                bVar.f127071f = 0;
                C47350c a = bVar.mo72403a();
                C64893zr3 zr32 = (C64893zr3) a.f127055a.f127080a;
                zr32.f186843d = this.f169712e;
                zr32.f186844e = this.f169713f;
                zr32.f186846g = mo84480j1();
                if (C59377b.f169709b == null) {
                    C59377b.f169709b = new C59377b();
                }
                List<C64389ga0> b = C59377b.f169709b.mo84479b();
                if (((LinkedList) b).size() > 0) {
                    zr32.f186845f = new LinkedList<>();
                    for (C64389ga0 next : b) {
                        C64389ga0 ga02 = new C64389ga0();
                        ga02.f183291d = next.f183291d;
                        ga02.f183292e = next.f183292e;
                        ga02.f183293f = next.f183293f;
                        ga02.f183294g = next.f183294g;
                        zr32.f186845f.add(ga02);
                    }
                    Log.m105925i("MicroMsg.ReportExptAppInfo", "req local appInfoList [%d] ", Integer.valueOf(zr32.f186845f.size()));
                }
                C117407d.INSTANCE.idkeyStat(863, 160, 1, false);
                return dispatch(gVar, a, this);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ReportExptAppInfo", e, "get appInfo error", new Object[0]);
            }
        }
        return -1;
    }

    public int getType() {
        return 1020;
    }

    /* renamed from: j1 */
    public final C64673r40 mo84480j1() {
        C64673r40 r402 = new C64673r40();
        r402.f185120d = Build.MANUFACTURER;
        r402.f185121e = C87203t.m108275k();
        r402.f185122f = Build.VERSION.SDK_INT + "";
        r402.f185123g = Build.CPU_ABI;
        return r402;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x01e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r20, int r21, int r22, java.lang.String r23, com.tencent.p014mm.network.C114799u r24, byte[] r25) {
        /*
            r19 = this;
            r1 = r19
            r0 = r21
            r2 = r22
            r3 = r23
            java.lang.String r4 = "MicroMsg.ReportExptAppInfo"
            java.lang.String r5 = "get appInfo on gy end. errType[%d] erroCode[%d] errMsg[%s]"
            r6 = 3
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r21)
            r9 = 0
            r7[r9] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r22)
            r10 = 1
            r7[r10] = r8
            r8 = 2
            r7[r8] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r7)
            if (r0 != 0) goto L_0x0204
            if (r2 != 0) goto L_0x0204
            r4 = r24
            ob0.c r4 = (ob0.C47350c) r4
            ob0.c$d r4 = r4.f127056b
            pe3.a r4 = r4.f127083a
            te3.as3 r4 = (te3.C64242as3) r4
            if (r4 != 0) goto L_0x0035
            goto L_0x0167
        L_0x0035:
            te3.ja r5 = r4.getBaseResponse()
            int r5 = r5.f135955d
            java.lang.String r7 = "MicroMsg.ReportExptAppInfo"
            if (r5 == 0) goto L_0x0069
            java.lang.Object[] r5 = new java.lang.Object[r8]
            te3.ja r6 = r4.getBaseResponse()
            int r6 = r6.f135955d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r9] = r6
            te3.ja r4 = r4.getBaseResponse()
            te3.rv3 r4 = r4.f135956e
            r5[r10] = r4
            java.lang.String r4 = "get appInfo error. resp baseResp [%d] [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r4, r5)
            kj2.d r11 = kj2.C117407d.INSTANCE
            r12 = 863(0x35f, double:4.264E-321)
            r14 = 162(0xa2, double:8.0E-322)
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)
            goto L_0x0167
        L_0x0069:
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.LinkedList<te3.fa0> r13 = r4.f182143f
            if (r13 == 0) goto L_0x009c
            int r13 = r13.size()
            if (r13 <= 0) goto L_0x009c
            java.util.LinkedList<te3.fa0> r13 = r4.f182143f
            java.util.Iterator r13 = r13.iterator()
        L_0x0082:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x009c
            java.lang.Object r14 = r13.next()
            te3.fa0 r14 = (te3.C64361fa0) r14
            oa1.a r15 = new oa1.a
            r15.<init>()
            java.lang.String r14 = r14.f183098g
            r15.mo86862a(r14)
            r5.add(r15)
            goto L_0x0082
        L_0x009c:
            ma1.a r13 = ma1.C117543a.Cx0()
            int r14 = r4.f182141d
            int r15 = r4.f182142e
            r13.getClass()
            if (r14 > 0) goto L_0x00aa
            goto L_0x0110
        L_0x00aa:
            if (r15 > 0) goto L_0x00ad
            goto L_0x0110
        L_0x00ad:
            f40.o r13 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r13 = r13.mo121142i()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_GET_EXPT_APP_INTERVAL_SEC_INT
            r16 = 86400(0x15180, float:1.21072E-40)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)
            java.lang.Object r8 = r13.mo119685f(r6, r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 != r14) goto L_0x00cb
            goto L_0x0110
        L_0x00cb:
            f40.o r8 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r8 = r8.mo121142i()
            com.tencent.mm.storage.y1$a r13 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_GET_EXPT_APP_LAST_TIME_SEC_INT
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            java.lang.Object r8 = r8.mo119685f(r13, r10)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            int r10 = (int) r9
            int r9 = r10 - r8
            if (r9 < r14) goto L_0x0101
            int r10 = r10 + r15
            int r10 = r10 - r14
            int r8 = java.lang.Math.min(r8, r10)
            f40.o r9 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r9 = r9.mo121142i()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9.mo119677K(r13, r8)
        L_0x0101:
            f40.o r8 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r8 = r8.mo121142i()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            r8.mo119677K(r6, r9)
        L_0x0110:
            ma1.a r6 = ma1.C117543a.Cx0()
            java.util.LinkedList<java.lang.Integer> r8 = r4.f182144g
            r9 = 0
            r6.Ox0(r9, r8, r5)
            r6 = 5
            java.lang.Object[] r6 = new java.lang.Object[r6]
            int r8 = r4.f182141d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6[r9] = r8
            int r8 = r4.f182142e
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9 = 1
            r6[r9] = r8
            java.util.LinkedList<java.lang.Integer> r4 = r4.f182144g
            if (r4 == 0) goto L_0x0137
            int r4 = r4.size()
            goto L_0x0138
        L_0x0137:
            r4 = 0
        L_0x0138:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8 = 2
            r6[r8] = r4
            int r4 = r5.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 3
            r6[r5] = r4
            r4 = 4
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r11)
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            r6[r4] = r5
            java.lang.String r4 = "updateExpt intervalSecond[%d] pullSecond [%d] del size [%d] replace [%d] cost[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r4, r6)
            kj2.d r8 = kj2.C117407d.INSTANCE
            r9 = 863(0x35f, double:4.264E-321)
            r11 = 161(0xa1, double:7.95E-322)
            r13 = 1
            r15 = 0
            r8.idkeyStat(r9, r11, r13, r15)
        L_0x0167:
            g81.b r4 = g81.C59377b.f169709b
            if (r4 != 0) goto L_0x0172
            g81.b r4 = new g81.b
            r4.<init>()
            g81.C59377b.f169709b = r4
        L_0x0172:
            g81.b r4 = g81.C59377b.f169709b
            monitor-enter(r4)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = r4.mo84478a()     // Catch:{ all -> 0x0201 }
            if (r5 != 0) goto L_0x017d
            monitor-exit(r4)
            goto L_0x0185
        L_0x017d:
            android.content.SharedPreferences$Editor r5 = r5.clear()     // Catch:{ all -> 0x0201 }
            r5.commit()     // Catch:{ all -> 0x0201 }
            monitor-exit(r4)
        L_0x0185:
            g81.a r4 = r1.f169714g
            long r5 = r1.f169713f
            r4.getClass()
            java.lang.String r7 = "MicroMsg.ExptIdCount"
            r8 = 0
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 > 0) goto L_0x01a4
            r10 = 1
            java.lang.Object[] r4 = new java.lang.Object[r10]
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "acquisition time is less than 0  [%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r5, r4)
            goto L_0x01e1
        L_0x01a4:
            boolean r10 = f40.C86709a0.m107522a()
            if (r10 == 0) goto L_0x01e1
            r10 = 2
            java.lang.Object[] r11 = new java.lang.Object[r10]
            f40.o r10 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r10 = r10.mo121142i()
            com.tencent.mm.storage.y1$a r12 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_GET_EXPTID_BEGIN_TIME_LONG
            long r8 = r10.mo119673G(r12, r8)
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r9 = 0
            r11[r9] = r8
            java.lang.Long r8 = java.lang.Long.valueOf(r5)
            r9 = 1
            r11[r9] = r8
            java.lang.String r8 = "last begin time and last end time [%d], [%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r11)
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            java.lang.Long r8 = java.lang.Long.valueOf(r5)
            r7.mo119677K(r12, r8)
            r4.f85839a = r5
            r9 = 1
            goto L_0x01e2
        L_0x01e1:
            r9 = 0
        L_0x01e2:
            if (r9 != 0) goto L_0x0218
            java.lang.String r4 = "MicroMsg.ReportExptAppInfo"
            java.lang.String r5 = "change Begin Time err [%d] [%d]"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            long r7 = r1.f169712e
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = 0
            r6[r8] = r7
            long r7 = r1.f169713f
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = 1
            r6[r8] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r5, r6)
            goto L_0x0218
        L_0x0201:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0204:
            java.lang.String r4 = "MicroMsg.ReportExptAppInfo"
            java.lang.String r5 = "report change begin time  ok!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            kj2.d r6 = kj2.C117407d.INSTANCE
            r7 = 863(0x35f, double:4.264E-321)
            r9 = 162(0xa2, double:8.0E-322)
            r11 = 1
            r13 = 0
            r6.idkeyStat(r7, r9, r11, r13)
        L_0x0218:
            ob0.n r4 = r1.f169711d
            r4.onSceneEnd(r0, r2, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g81.C59378c.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }
}
