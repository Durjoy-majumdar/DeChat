package com.tencent.p014mm.plugin.offline;

import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import id2.C33288f;
import id2.C33290s;
import id2.C76313t;
import java.util.HashSet;
import java.util.Map;
import jd2.C33540a;
import kd2.C76559f;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.offline.g */
public class C30326g {

    /* renamed from: c */
    public static int f81861c = 30000;

    /* renamed from: d */
    public static int f81862d = 5000;

    /* renamed from: a */
    public C11385n f81863a = new C30327a();

    /* renamed from: b */
    public MTimerHandler f81864b = new MTimerHandler(new C30328b(), false);

    /* renamed from: com.tencent.mm.plugin.offline.g$a */
    public class C30327a implements C11385n {
        public C30327a() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            if ((yVar instanceof C33288f) && i == 0 && i2 == 0) {
                C33288f fVar = (C33288f) yVar;
                int i3 = fVar.f90284e;
                C30326g.f81862d = i3;
                if (i3 == 0) {
                    C30326g.f81862d = 5000;
                }
                Log.m105925i("MicroMsg.OfflineGetMsgLogic", "NetSceneOfflineGetMsg: ackkey: %s, appMsg: %s", fVar.f90285f, fVar.f90283d);
                if (Util.isNullOrNil(fVar.f90283d) || Util.isNullOrNil(fVar.f90285f)) {
                    Log.m105924i("MicroMsg.OfflineGetMsgLogic", "OfflineGetMsgLogic msg is null");
                } else if (C30326g.m39029d(fVar.f90285f, fVar.f90283d)) {
                    Log.m105924i("MicroMsg.OfflineGetMsgLogic", "from cgi");
                    if (XmlParser.parseXml(fVar.f90283d, "sysmsg", (String) null) != null) {
                        C115669n.INSTANCE.idkeyStat(135, 71, 1, true);
                        C76313t Ax0 = C69963m.wx0().Ax0();
                        String str2 = fVar.f90283d;
                        Ax0.getClass();
                        Log.m105924i("MicroMsg.WalletOfflineMsgManager", "notifyMsgFromCgi");
                        if (!TextUtils.isEmpty(str2)) {
                            Map<String, String> parseXml = XmlParser.parseXml(str2, "sysmsg", (String) null);
                            int i4 = -1;
                            if (parseXml != null) {
                                String str3 = parseXml.get(".sysmsg.paymsg.ack_key");
                                i4 = Util.getInt(parseXml.get(".sysmsg.paymsg.PayMsgType"), -1);
                            }
                            if (!(i4 == 7 || i4 == 10)) {
                                Log.m105924i("MicroMsg.WalletOfflineMsgManager", "process msg from pull");
                                Ax0.mo106553h(str2);
                                Ax0.mo106546a(str2, false);
                            }
                        }
                    } else {
                        return;
                    }
                }
                Log.m105924i("MicroMsg.OfflineGetMsgLogic", "mIntercal=" + C30326g.f81862d);
                C30326g.this.f81864b.startTimer((long) C30326g.f81862d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.offline.g$b */
    public class C30328b implements MTimerHandler.CallBack {
        public C30328b() {
        }

        public boolean onTimerExpired() {
            if (C30326g.this.f81864b != null) {
                if (!C86709a0.m107522a()) {
                    MTimerHandler mTimerHandler = C30326g.this.f81864b;
                    int i = C30326g.f81861c;
                    mTimerHandler.startTimer((long) 5000);
                    return false;
                } else if (C76559f.m92115k()) {
                    C30326g.this.getClass();
                    Log.m105924i("MicroMsg.OfflineGetMsgLogic", "doGetOfflineMsg doScene:NetSceneOfflineGetMsg");
                    C33288f fVar = new C33288f();
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123460f(fVar);
                }
            }
            return false;
        }
    }

    static {
        int intValue;
        C86709a0.m107528h();
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.BUSINESS_OFFLINE_GETMSG_INTERVAL_INT, (Object) null);
        if (f != null) {
            int intValue2 = ((Integer) f).intValue();
            f81862d = intValue2;
            if (intValue2 == 0) {
                f81862d = 5000;
            }
        }
        C86709a0.m107528h();
        Object f2 = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.BUSINESS_OFFLINE_GETMSG_MAX_POS_TIME_INT, 0);
        if (f2 != null && (intValue = ((Integer) f2).intValue()) != 0) {
            f81861c = intValue;
        }
    }

    public C30326g() {
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(385, this.f81863a);
    }

    /* renamed from: a */
    public static void m39026a(String str, int i) {
        if (!Util.isNullOrNil(str)) {
            C33290s qq = C69963m.wx0().yx0().mo59197qq(str);
            if (qq != null) {
                m39027b(qq, i);
                return;
            }
            C33290s sVar = new C33290s();
            sVar.field_reqkey = str;
            sVar.field_status = i;
            C69963m.wx0().yx0().mo59195bD(sVar);
        }
    }

    /* renamed from: b */
    public static boolean m39027b(C33290s sVar, int i) {
        if (i == 4) {
            i = 20000;
        }
        boolean c = m39028c(sVar.field_status, i);
        Log.m105925i("MicroMsg.OfflineGetMsgLogic", "in changeStatus: isallow=%b; old status = %d; new status = %d", Boolean.valueOf(c), Integer.valueOf(sVar.field_status), Integer.valueOf(i));
        if (c) {
            sVar.field_status = i;
            C69963m.wx0().yx0().mo59195bD(sVar);
        }
        return c;
    }

    /* renamed from: c */
    public static boolean m39028c(int i, int i2) {
        Log.m105924i("MicroMsg.OfflineGetMsgLogic", "checkStatus from=" + i + ";to=" + i2);
        if (i == i2) {
            return false;
        }
        if (i == 0) {
            return true;
        }
        if (i == 24) {
            return i2 != 24;
        }
        if (i == 6) {
            return i2 == 20000;
        }
        if (i == 5) {
            return i2 == 20000;
        }
        if (i == 4) {
            return i2 == 20000;
        }
        if (i == 20) {
            return i2 == 20000;
        }
        if (i == 8 || i == 23) {
            return i2 == 6 || i2 == 20000;
        }
        if (i == 10001) {
            return i2 == 6 || i2 == 20000;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x02d6  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m39029d(java.lang.String r32, java.lang.String r33) {
        /*
            r0 = r33
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r33)
            r3 = 4
            r4 = -1
            java.lang.String r5 = ".sysmsg.paymsg.PayMsgType"
            java.lang.String r6 = ".sysmsg.paymsg.req_key"
            java.lang.String r7 = "sysmsg"
            r8 = 0
            r9 = 1
            java.lang.String r10 = "MicroMsg.OfflineGetMsgLogic"
            r11 = 0
            if (r1 == 0) goto L_0x001f
            java.lang.String r1 = "shouldDeal appmsg is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
        L_0x001c:
            r1 = 0
            goto L_0x023a
        L_0x001f:
            java.util.Map r1 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r7, r8)
            java.lang.Object r12 = r1.get(r6)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r4)
            com.tencent.mm.plugin.offline.m r13 = com.tencent.p014mm.plugin.offline.C69963m.wx0()
            jd2.a r13 = r13.yx0()
            id2.s r13 = r13.mo59197qq(r12)
            com.tencent.mm.plugin.offline.m r14 = com.tencent.p014mm.plugin.offline.C69963m.wx0()
            jd2.a r14 = r14.yx0()
            id2.s r14 = r14.mo59196jo()
            boolean r15 = m39031f(r14)
            if (r13 == 0) goto L_0x005f
            com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 135(0x87, double:6.67E-322)
            r19 = 63
            r21 = 1
            r23 = 1
            r16.idkeyStat(r17, r19, r21, r23)
            goto L_0x006c
        L_0x005f:
            com.tencent.mm.plugin.report.service.n r24 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r25 = 135(0x87, double:6.67E-322)
            r27 = 64
            r29 = 1
            r31 = 1
            r24.idkeyStat(r25, r27, r29, r31)
        L_0x006c:
            r4 = 3
            r8 = 2
            if (r14 == 0) goto L_0x008b
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r4 = r14.field_reqkey
            r2[r11] = r4
            int r4 = r14.field_status
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r9] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r15)
            r2[r8] = r4
            java.lang.String r4 = "latestStatus: reqKey: %s, status:%d, isLatestClose: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r4, r2)
            goto L_0x00a4
        L_0x008b:
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r15)
            r2[r11] = r4
            if (r13 != 0) goto L_0x0097
            r4 = 1
            goto L_0x0098
        L_0x0097:
            r4 = 0
        L_0x0098:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2[r9] = r4
            java.lang.String r4 = "latestStatus is null. isLatestClose: %b, localStatus is null ?: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r4, r2)
        L_0x00a4:
            if (r13 != 0) goto L_0x00f7
            if (r14 != 0) goto L_0x00ba
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r2[r11] = r12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r9] = r1
            java.lang.String r1 = "== current reqKey: %s not in local storage, payMsgType:%d; cannot get latest order in local storage. return true"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r2)
        L_0x00b7:
            r1 = 1
            goto L_0x023a
        L_0x00ba:
            if (r15 == 0) goto L_0x00d9
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r11] = r12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r9] = r1
            java.lang.String r1 = r14.field_reqkey
            r2[r8] = r1
            int r1 = r14.field_status
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 3
            r2[r4] = r1
            java.lang.String r1 = "== current reqKey: %s not in local storage, payMsgType:%d. the latest order in local storage is closed, reqKey:%s, status:%d. return true"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r2)
            goto L_0x00b7
        L_0x00d9:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r11] = r12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r9] = r1
            java.lang.String r1 = r14.field_reqkey
            r2[r8] = r1
            int r1 = r14.field_status
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 3
            r2[r4] = r1
            java.lang.String r1 = "== current reqKey: %s not in local storage, payMsgType:%d. the latest order in local storage is not closed, reqKey:%s, status:%d. return false"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r2)
            goto L_0x001c
        L_0x00f7:
            r4 = 3
            boolean r2 = m39031f(r13)
            if (r2 == 0) goto L_0x0119
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r4 = r13.field_reqkey
            r2[r11] = r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r9] = r1
            int r1 = r13.field_status
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r8] = r1
            java.lang.String r1 = "== current reqKey: %s  is in local storage, payMsgType: %d, local status is %d, it is final status. return false."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r2)
            goto L_0x001c
        L_0x0119:
            if (r14 != 0) goto L_0x0140
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r11] = r12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r9] = r1
            int r1 = r13.field_status
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r8] = r1
            java.lang.String r1 = "== unbelievable! current reqKey: %s  is in local storage, payMsgType: %d, local status is %d; cannot get latest order in local storage , or all local orders is in give-up. return false."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r2)
            com.tencent.mm.plugin.offline.m r1 = com.tencent.p014mm.plugin.offline.C69963m.wx0()
            jd2.a r1 = r1.yx0()
            r1.mo59193Ow(r12)
            goto L_0x001c
        L_0x0140:
            r2 = 5
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r11] = r12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r4[r9] = r2
            int r2 = r13.field_status
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r8] = r2
            java.lang.String r2 = r14.field_reqkey
            r19 = 3
            r4[r19] = r2
            int r2 = r14.field_status
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r3] = r2
            java.lang.String r2 = "== current reqKey: %s  is in local storage, payMsgType: %d, local status is %d; the latest order is in local storage, reqKey: %s, status: %s "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r2, r4)
            java.lang.String r2 = r13.field_reqkey
            java.lang.String r4 = r14.field_reqkey
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x01df
            int r2 = r14.field_status
            boolean r2 = m39028c(r2, r1)
            if (r2 == 0) goto L_0x019f
            r2 = 5
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r11] = r12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r9] = r1
            int r1 = r13.field_status
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r8] = r1
            java.lang.String r1 = r14.field_reqkey
            r2 = 3
            r4[r2] = r1
            int r1 = r14.field_status
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r3] = r1
            java.lang.String r1 = "== current reqKey: %s  is in local storage, payMsgType: %d, local status is %d; the latest order is in local storage, reqKey: %s, status: %s. the two reqKeys are equal. return true"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r4)
            goto L_0x00b7
        L_0x019f:
            r2 = 5
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r11] = r12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r4[r9] = r2
            int r2 = r13.field_status
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r8] = r2
            java.lang.String r2 = r14.field_reqkey
            r8 = 3
            r4[r8] = r2
            int r2 = r14.field_status
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r3] = r2
            java.lang.String r2 = "== current reqKey: %s  is in local storage, payMsgType: %d, local status is %d; the latest order is in local storage, reqKey: %s, status: %s. the two reqKeys are equal. return false."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r2, r4)
            int r2 = r14.field_status
            if (r2 == r1) goto L_0x001c
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r11] = r12
            java.lang.String r2 = "mark reqKey: %s as give up"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r2, r1)
            com.tencent.mm.plugin.offline.m r1 = com.tencent.p014mm.plugin.offline.C69963m.wx0()
            jd2.a r1 = r1.yx0()
            r1.mo59193Ow(r12)
            goto L_0x001c
        L_0x01df:
            if (r15 == 0) goto L_0x0208
            r2 = 5
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r11] = r12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r9] = r1
            int r1 = r13.field_status
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r8] = r1
            java.lang.String r1 = r14.field_reqkey
            r2 = 3
            r4[r2] = r1
            int r1 = r14.field_status
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r3] = r1
            java.lang.String r1 = "== current reqKey: %s  is in local storage, payMsgType: %d, local status is %d; the latest order is in local storage, reqKey: %s, status: %s. the two reqKeys are not equal. the latest order is closed. return true."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r4)
            goto L_0x00b7
        L_0x0208:
            r2 = 5
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r11] = r12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r9] = r1
            int r1 = r13.field_status
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r8] = r1
            java.lang.String r1 = r14.field_reqkey
            r2 = 3
            r4[r2] = r1
            int r1 = r14.field_status
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r3] = r1
            java.lang.String r1 = "== current reqKey: %s  is in local storage, payMsgType: %d, local status is %d; the latest order is in local storage, reqKey: %s, status: %s. the two reqKeys are not equal. the latest order is not closed. return false."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r4)
            com.tencent.mm.plugin.offline.m r1 = com.tencent.p014mm.plugin.offline.C69963m.wx0()
            jd2.a r1 = r1.yx0()
            r1.mo59193Ow(r12)
            goto L_0x001c
        L_0x023a:
            if (r1 == 0) goto L_0x02d6
            com.tencent.mm.plugin.offline.m r1 = com.tencent.p014mm.plugin.offline.C69963m.wx0()
            jd2.a r1 = r1.yx0()
            id2.s r1 = r1.mo59196jo()
            r2 = 0
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r7, r2)
            java.lang.Object r2 = r0.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            r4 = -1
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)
            java.lang.Object r0 = r0.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            r4 = 24
            if (r2 != r4) goto L_0x0270
            com.tencent.mm.plugin.report.service.n r19 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r20 = 135(0x87, double:6.67E-322)
            r22 = 58
            r24 = 1
            r26 = 1
            r19.idkeyStat(r20, r22, r24, r26)
            goto L_0x02aa
        L_0x0270:
            r4 = 6
            if (r2 != r4) goto L_0x0281
            com.tencent.mm.plugin.report.service.n r19 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r20 = 135(0x87, double:6.67E-322)
            r22 = 59
            r24 = 1
            r26 = 1
            r19.idkeyStat(r20, r22, r24, r26)
            goto L_0x02aa
        L_0x0281:
            if (r2 == r3) goto L_0x029d
            r3 = 5
            if (r2 == r3) goto L_0x029d
            r3 = 20
            if (r2 != r3) goto L_0x028b
            goto L_0x029d
        L_0x028b:
            r3 = 23
            if (r2 != r3) goto L_0x02aa
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 135(0x87, double:6.67E-322)
            r15 = 66
            r17 = 1
            r19 = 1
            r12.idkeyStat(r13, r15, r17, r19)
            goto L_0x02aa
        L_0x029d:
            com.tencent.mm.plugin.report.service.n r20 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r21 = 135(0x87, double:6.67E-322)
            r23 = 60
            r25 = 1
            r27 = 1
            r20.idkeyStat(r21, r23, r25, r27)
        L_0x02aa:
            if (r1 == 0) goto L_0x02ba
            java.lang.String r3 = r1.field_reqkey
            if (r3 == 0) goto L_0x02ba
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x02ba
            m39027b(r1, r2)
            goto L_0x02d0
        L_0x02ba:
            id2.s r1 = new id2.s
            r1.<init>()
            r1.field_reqkey = r0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r32)
            if (r0 != 0) goto L_0x02cb
            r0 = r32
            r1.field_ack_key = r0
        L_0x02cb:
            r1.field_status = r11
            m39027b(r1, r2)
        L_0x02d0:
            java.lang.String r0 = "dealMsg true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            return r9
        L_0x02d6:
            java.lang.String r0 = "dealMsg false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.offline.C30326g.m39029d(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: e */
    public static void m39030e() {
        long j;
        Log.m105924i("MicroMsg.OfflineGetMsgLogic", "endAllOldOrder");
        C33540a yx02 = C69963m.wx0().yx0();
        Log.m105925i("MicroMsg.OfflineOrderStatusStorage", "end all orders to final status. orders count: %d, latest 3 orders: %s", Integer.valueOf(yx02.mo59194Yt()), yx02.mo59192Lo(3));
        Cursor rawQuery = yx02.f90804d.rawQuery(String.format("SELECT %s FROM %s ORDER BY %s DESC LIMIT 1;", new Object[]{"rowid", "OfflineOrderStatus", "rowid"}), (String[]) null, 2);
        if (rawQuery == null) {
            Log.m105920e("MicroMsg.OfflineOrderStatusStorage", "removeOlderOrders: error. cursor is null \n");
            j = 0;
        } else {
            rawQuery.moveToFirst();
            j = (rawQuery.isAfterLast() || rawQuery.getColumnCount() <= 0) ? 0 : rawQuery.getLong(0);
            rawQuery.close();
        }
        long j2 = j - 10;
        if (j2 > 0) {
            String format = String.format("DELETE FROM %s WHERE %s < %d;", new Object[]{"OfflineOrderStatus", "rowid", Long.valueOf(j2)});
            Log.m105925i("MicroMsg.OfflineOrderStatusStorage", "removeOlderOrders. latestRowId is %d. sql: %s", Long.valueOf(j), format);
            yx02.f90804d.execSQL("OfflineOrderStatus", format);
        } else {
            Log.m105925i("MicroMsg.OfflineOrderStatusStorage", "removeOlderOrders. latestRowId is %d. do nothing", Long.valueOf(j));
        }
        yx02.f90804d.execSQL("OfflineOrderStatus", "UPDATE OfflineOrderStatus SET status=20000 where status!=20000");
    }

    /* renamed from: f */
    public static boolean m39031f(C33290s sVar) {
        if (sVar != null) {
            Log.m105924i("MicroMsg.OfflineGetMsgLogic", "isOrderClosed lastest status req_key=" + sVar.field_reqkey);
        }
        HashSet hashSet = new HashSet();
        hashSet.add(20000);
        hashSet.add(6);
        hashSet.add(5);
        hashSet.add(4);
        hashSet.add(-1);
        boolean z = false;
        if (sVar == null || hashSet.contains(Integer.valueOf(sVar.field_status))) {
            StringBuilder sb = new StringBuilder();
            sb.append("isOrderClosed true;status==null?");
            if (sVar == null) {
                z = true;
            }
            sb.append(z);
            Log.m105924i("MicroMsg.OfflineGetMsgLogic", sb.toString());
            if (sVar != null) {
                Log.m105924i("MicroMsg.OfflineGetMsgLogic", "isOrderClosed status.field_status=" + sVar.field_status);
            }
            return true;
        }
        Log.m105924i("MicroMsg.OfflineGetMsgLogic", "isOrderClosed false");
        Log.m105924i("MicroMsg.OfflineGetMsgLogic", "status=" + sVar.field_status + ";req_key=" + sVar.field_reqkey);
        return false;
    }

    /* renamed from: g */
    public void mo57282g() {
        Log.m105924i("MicroMsg.OfflineGetMsgLogic", "OFFLINEGETMSGLOGIN STOP; IS stopped=" + this.f81864b.stopped());
        if (!this.f81864b.stopped()) {
            C115669n.INSTANCE.idkeyStat(135, 62, 1, true);
            this.f81864b.stopTimer();
        }
    }
}
