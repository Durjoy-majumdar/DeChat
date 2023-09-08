package hg2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import eb0.C75584h4;
import ob0.C35136m;
import ob0.C35141t;
import p872ah.C67046a;

/* renamed from: hg2.f */
public class C76190f implements C35141t {

    /* renamed from: d */
    public long f223227d = 0;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: eb0.h4} */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.ReaderAppMsgExtension", "get " + r6 + ".$type  error");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x017f, code lost:
        r28 = r2;
        r6 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.ReaderAppMsgExtension", "get " + r6 + ".$type  error Type:" + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01a8, code lost:
        r28 = r2;
        r6 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.ReaderAppMsgExtension", "get " + r6 + ".name  error");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.ReaderAppMsgExtension", "get " + r6 + ".$count  error");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0256, code lost:
        r1 = r2;
        r11 = r7;
        r6 = r21;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x04ac A[Catch:{ Exception -> 0x04e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0551  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0553  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x057b  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x05e3 A[ADDED_TO_REGION] */
    /* renamed from: Fg */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ob0.C35136m.C35139b mo56403Fg(ob0.C35136m.C35137a r31) {
        /*
            r30 = this;
            r1 = r30
            r0 = r31
            java.lang.String r2 = ""
            te3.j3 r3 = r0.f94242a
            java.lang.Object r0 = r0.f94248g
            r4 = 1000(0x3e8, double:4.94E-321)
            r6 = 1
            r7 = 0
            java.lang.String r8 = "MicroMsg.ReaderAppMsgExtension"
            if (r0 != 0) goto L_0x0032
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = "fake#"
            r0.append(r9)
            long r9 = java.lang.System.currentTimeMillis()
            long r9 = r9 / r4
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r9 = new java.lang.Object[r6]
            r9[r7] = r0
            java.lang.String r10 = "[onPreAddMessage] fake! functionMsgId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r10, r9)
            goto L_0x0036
        L_0x0032:
            ob0.k$b r0 = (ob0.C35133k.C35134b) r0
            java.lang.String r0 = r0.f94241b
        L_0x0036:
            r9 = 0
            if (r3 != 0) goto L_0x0040
            java.lang.String r0 = "onPreAddMessage cmdAM is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            return r9
        L_0x0040:
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 13440(0x3480, float:1.8833E-41)
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            r12[r7] = r13
            r10.mo160131h(r11, r12)
            eb0.j4 r10 = hg2.C76193l.yx0()
            r10.getClass()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "delete from "
            r11.append(r12)
            r12 = 20
            java.lang.String r13 = r10.mo105933kD(r12)
            r11.append(r13)
            java.lang.String r13 = " where "
            r11.append(r13)
            java.lang.String r13 = "reserved3"
            r11.append(r13)
            java.lang.String r14 = " = "
            r11.append(r14)
            java.lang.String r14 = zh3.C91753f.m115264e(r0)
            r11.append(r14)
            java.lang.String r11 = r11.toString()
            java.lang.Object[] r14 = new java.lang.Object[r6]
            r14[r7] = r11
            java.lang.String r15 = "MicroMsg.ReaderAppInfoStorage"
            java.lang.String r9 = "deleteGroupByMsgSvrID:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r9, r14)
            zh3.f r9 = r10.f222063d
            java.lang.String r14 = r10.mo105933kD(r12)
            boolean r9 = r9.execSQL(r14, r11)
            if (r9 == 0) goto L_0x009e
            r10.doNotify()
        L_0x009e:
            te3.rv3 r9 = r3.f227631h
            java.lang.String r9 = sf0.C48374j0.m53718g(r9)
            int r10 = r3.f227635o
            long r10 = (long) r10
            long r10 = r10 * r4
            long r14 = r1.f223227d
            int r16 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r16 > 0) goto L_0x00b4
            r16 = 1
            long r14 = r14 + r16
            goto L_0x00b5
        L_0x00b4:
            r14 = r10
        L_0x00b5:
            r1.f223227d = r14
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r5[r7] = r10
            java.lang.Long r10 = java.lang.Long.valueOf(r14)
            r5[r6] = r10
            java.lang.String r10 = "parseMsg, oricreateTime: %s newcreatiome: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r10, r5)
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat
            java.lang.String r10 = "yyyyMMddHHmmssSSSS"
            r5.<init>(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.String r4 = "mmreader"
            r12 = 0
            java.util.Map r4 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r9, r4, r12)     // Catch:{ Exception -> 0x0539 }
            if (r4 != 0) goto L_0x00e4
            return r12
        L_0x00e4:
            java.lang.String r12 = "onPreAddMessage content %s"
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0539 }
            r11[r7] = r9     // Catch:{ Exception -> 0x0539 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r12, r11)     // Catch:{ Exception -> 0x0539 }
            r9 = 0
            r11 = 0
        L_0x00f0:
            if (r9 >= r6) goto L_0x052d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0521 }
            r12.<init>()     // Catch:{ Exception -> 0x0521 }
            java.lang.String r6 = ".mmreader.category"
            r12.append(r6)     // Catch:{ Exception -> 0x0521 }
            if (r9 <= 0) goto L_0x010b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0103 }
            goto L_0x010c
        L_0x0103:
            r0 = move-exception
            r28 = r2
            r6 = r10
            r20 = r13
            goto L_0x052b
        L_0x010b:
            r6 = r2
        L_0x010c:
            r12.append(r6)     // Catch:{ Exception -> 0x0521 }
            java.lang.String r6 = r12.toString()     // Catch:{ Exception -> 0x0521 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0521 }
            r12.<init>()     // Catch:{ Exception -> 0x0521 }
            r12.append(r6)     // Catch:{ Exception -> 0x0521 }
            java.lang.String r7 = ".$type"
            r12.append(r7)     // Catch:{ Exception -> 0x0521 }
            java.lang.String r7 = r12.toString()     // Catch:{ Exception -> 0x0521 }
            java.lang.Object r7 = r4.get(r7)     // Catch:{ Exception -> 0x0521 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0521 }
            r12 = 0
            int r7 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r7, (int) r12)     // Catch:{ Exception -> 0x0521 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0521 }
            r12.<init>()     // Catch:{ Exception -> 0x0521 }
            r12.append(r6)     // Catch:{ Exception -> 0x0521 }
            r19 = r11
            java.lang.String r11 = ".$sub_type"
            r12.append(r11)     // Catch:{ Exception -> 0x051c }
            java.lang.String r11 = r12.toString()     // Catch:{ Exception -> 0x051c }
            java.lang.Object r11 = r4.get(r11)     // Catch:{ Exception -> 0x051c }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x051c }
            r12 = -1
            int r11 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r11, (int) r12)     // Catch:{ Exception -> 0x051c }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x051c }
            r12.<init>()     // Catch:{ Exception -> 0x051c }
            r12.append(r6)     // Catch:{ Exception -> 0x051c }
            java.lang.String r1 = ".$groupid"
            r12.append(r1)     // Catch:{ Exception -> 0x0517 }
            java.lang.String r1 = r12.toString()     // Catch:{ Exception -> 0x0517 }
            java.lang.Object r1 = r4.get(r1)     // Catch:{ Exception -> 0x0517 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0517 }
            java.lang.String r12 = "get "
            if (r7 != 0) goto L_0x0184
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0517 }
            r0.<init>()     // Catch:{ Exception -> 0x0517 }
            r0.append(r12)     // Catch:{ Exception -> 0x0517 }
            r0.append(r6)     // Catch:{ Exception -> 0x0517 }
            java.lang.String r1 = ".$type  error"
            r0.append(r1)     // Catch:{ Exception -> 0x0517 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0517 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)     // Catch:{ Exception -> 0x0517 }
            r28 = r2
            r6 = r10
            goto L_0x0532
        L_0x0184:
            r20 = r13
            r13 = 20
            if (r7 == r13) goto L_0x01b3
            r13 = 11
            if (r7 == r13) goto L_0x01b3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ad }
            r0.<init>()     // Catch:{ Exception -> 0x01ad }
            r0.append(r12)     // Catch:{ Exception -> 0x01ad }
            r0.append(r6)     // Catch:{ Exception -> 0x01ad }
            java.lang.String r1 = ".$type  error Type:"
            r0.append(r1)     // Catch:{ Exception -> 0x01ad }
            r0.append(r7)     // Catch:{ Exception -> 0x01ad }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01ad }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)     // Catch:{ Exception -> 0x01ad }
            r28 = r2
            r6 = r10
            goto L_0x0534
        L_0x01ad:
            r0 = move-exception
            r28 = r2
            r6 = r10
            goto L_0x0529
        L_0x01b3:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0510 }
            r13.<init>()     // Catch:{ Exception -> 0x0510 }
            r13.append(r6)     // Catch:{ Exception -> 0x0510 }
            r21 = r10
            java.lang.String r10 = ".name"
            r13.append(r10)     // Catch:{ Exception -> 0x050b }
            java.lang.String r10 = r13.toString()     // Catch:{ Exception -> 0x050b }
            java.lang.Object r10 = r4.get(r10)     // Catch:{ Exception -> 0x050b }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x050b }
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)     // Catch:{ Exception -> 0x050b }
            if (r13 == 0) goto L_0x01ed
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ea }
            r0.<init>()     // Catch:{ Exception -> 0x01ea }
            r0.append(r12)     // Catch:{ Exception -> 0x01ea }
            r0.append(r6)     // Catch:{ Exception -> 0x01ea }
            java.lang.String r1 = ".name  error"
            r0.append(r1)     // Catch:{ Exception -> 0x01ea }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01ea }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)     // Catch:{ Exception -> 0x01ea }
            goto L_0x0256
        L_0x01ea:
            r0 = move-exception
            goto L_0x02b3
        L_0x01ed:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x050b }
            r13.<init>()     // Catch:{ Exception -> 0x050b }
            r13.append(r6)     // Catch:{ Exception -> 0x050b }
            r22 = r0
            java.lang.String r0 = ".topnew.cover"
            r13.append(r0)     // Catch:{ Exception -> 0x050b }
            java.lang.String r0 = r13.toString()     // Catch:{ Exception -> 0x050b }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ Exception -> 0x050b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x050b }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x050b }
            r13.<init>()     // Catch:{ Exception -> 0x050b }
            r13.append(r6)     // Catch:{ Exception -> 0x050b }
            r19 = r10
            java.lang.String r10 = ".topnew.digest"
            r13.append(r10)     // Catch:{ Exception -> 0x050b }
            java.lang.String r10 = r13.toString()     // Catch:{ Exception -> 0x050b }
            java.lang.Object r10 = r4.get(r10)     // Catch:{ Exception -> 0x050b }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x050b }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x050b }
            r13.<init>()     // Catch:{ Exception -> 0x050b }
            r13.append(r6)     // Catch:{ Exception -> 0x050b }
            r23 = r14
            java.lang.String r14 = ".$count"
            r13.append(r14)     // Catch:{ Exception -> 0x050b }
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x050b }
            java.lang.Object r13 = r4.get(r13)     // Catch:{ Exception -> 0x050b }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x050b }
            r14 = 0
            int r13 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r13, (int) r14)     // Catch:{ Exception -> 0x050b }
            if (r13 != 0) goto L_0x025c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ea }
            r0.<init>()     // Catch:{ Exception -> 0x01ea }
            r0.append(r12)     // Catch:{ Exception -> 0x01ea }
            r0.append(r6)     // Catch:{ Exception -> 0x01ea }
            java.lang.String r1 = ".$count  error"
            r0.append(r1)     // Catch:{ Exception -> 0x01ea }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01ea }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)     // Catch:{ Exception -> 0x01ea }
        L_0x0256:
            r1 = r2
            r11 = r7
            r6 = r21
            goto L_0x0549
        L_0x025c:
            java.lang.String r12 = ".item"
            r14 = 1
            if (r13 <= r14) goto L_0x0277
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ea }
            r14.<init>()     // Catch:{ Exception -> 0x01ea }
            r14.append(r6)     // Catch:{ Exception -> 0x01ea }
            r15 = 20
            if (r7 != r15) goto L_0x026f
            java.lang.String r12 = ".newitem"
        L_0x026f:
            r14.append(r12)     // Catch:{ Exception -> 0x01ea }
            java.lang.String r6 = r14.toString()     // Catch:{ Exception -> 0x01ea }
            goto L_0x0288
        L_0x0277:
            r15 = 20
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x050b }
            r14.<init>()     // Catch:{ Exception -> 0x050b }
            r14.append(r6)     // Catch:{ Exception -> 0x050b }
            r14.append(r12)     // Catch:{ Exception -> 0x050b }
            java.lang.String r6 = r14.toString()     // Catch:{ Exception -> 0x050b }
        L_0x0288:
            r12 = 1
            if (r12 != r11) goto L_0x029f
            r14 = 2
            if (r13 >= r14) goto L_0x029f
            java.lang.String r0 = "weishi msg must more than 2, count %d"
            java.lang.Object[] r1 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x01ea }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x01ea }
            r4 = 0
            r1[r4] = r3     // Catch:{ Exception -> 0x01ea }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r0, r1)     // Catch:{ Exception -> 0x01ea }
            r1 = 0
            return r1
        L_0x029f:
            r12 = 0
        L_0x02a0:
            if (r12 >= r13) goto L_0x04ef
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x050b }
            r14.<init>()     // Catch:{ Exception -> 0x050b }
            r14.append(r6)     // Catch:{ Exception -> 0x050b }
            if (r12 <= 0) goto L_0x02ba
            java.lang.Integer r18 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x01ea }
            r15 = r18
            goto L_0x02bb
        L_0x02b3:
            r28 = r2
            r11 = r7
            r6 = r21
            goto L_0x052b
        L_0x02ba:
            r15 = r2
        L_0x02bb:
            r14.append(r15)     // Catch:{ Exception -> 0x050b }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x050b }
            eb0.h4 r15 = new eb0.h4     // Catch:{ Exception -> 0x050b }
            r15.<init>()     // Catch:{ Exception -> 0x050b }
            r25 = r6
            int r6 = r3.f227627d     // Catch:{ Exception -> 0x050b }
            r26 = r7
            long r6 = (long) r6
            r15.f222051p = r6     // Catch:{ Exception -> 0x04eb }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04eb }
            r6.<init>()     // Catch:{ Exception -> 0x04eb }
            r6.append(r14)     // Catch:{ Exception -> 0x04eb }
            java.lang.String r7 = ".title"
            r6.append(r7)     // Catch:{ Exception -> 0x04eb }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x04eb }
            java.lang.Object r6 = r4.get(r6)     // Catch:{ Exception -> 0x04eb }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x04eb }
            r15.f222040e = r6     // Catch:{ Exception -> 0x04eb }
            java.lang.String r6 = ".digest"
            if (r12 != 0) goto L_0x0317
            r7 = 1
            r15.f222047l = r7     // Catch:{ Exception -> 0x0314 }
            r15.f222048m = r0     // Catch:{ Exception -> 0x0314 }
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)     // Catch:{ Exception -> 0x0314 }
            if (r7 == 0) goto L_0x030e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0314 }
            r7.<init>()     // Catch:{ Exception -> 0x0314 }
            r7.append(r14)     // Catch:{ Exception -> 0x0314 }
            r7.append(r6)     // Catch:{ Exception -> 0x0314 }
            java.lang.String r6 = r7.toString()     // Catch:{ Exception -> 0x0314 }
            java.lang.Object r6 = r4.get(r6)     // Catch:{ Exception -> 0x0314 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0314 }
            goto L_0x030f
        L_0x030e:
            r6 = r10
        L_0x030f:
            r15.f222049n = r6     // Catch:{ Exception -> 0x0314 }
            r27 = r0
            goto L_0x0349
        L_0x0314:
            r0 = move-exception
            goto L_0x03f4
        L_0x0317:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04eb }
            r7.<init>()     // Catch:{ Exception -> 0x04eb }
            r7.append(r14)     // Catch:{ Exception -> 0x04eb }
            r27 = r0
            java.lang.String r0 = ".cover"
            r7.append(r0)     // Catch:{ Exception -> 0x04eb }
            java.lang.String r0 = r7.toString()     // Catch:{ Exception -> 0x04eb }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ Exception -> 0x04eb }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x04eb }
            r15.f222048m = r0     // Catch:{ Exception -> 0x04eb }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04eb }
            r0.<init>()     // Catch:{ Exception -> 0x04eb }
            r0.append(r14)     // Catch:{ Exception -> 0x04eb }
            r0.append(r6)     // Catch:{ Exception -> 0x04eb }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x04eb }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ Exception -> 0x04eb }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x04eb }
            r15.f222049n = r0     // Catch:{ Exception -> 0x04eb }
        L_0x0349:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04eb }
            r0.<init>()     // Catch:{ Exception -> 0x04eb }
            r0.append(r14)     // Catch:{ Exception -> 0x04eb }
            java.lang.String r6 = ".vedio"
            r0.append(r6)     // Catch:{ Exception -> 0x04eb }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x04eb }
            boolean r0 = r4.containsKey(r0)     // Catch:{ Exception -> 0x04eb }
            if (r0 == 0) goto L_0x0362
            r0 = 1
            goto L_0x0363
        L_0x0362:
            r0 = 0
        L_0x0363:
            r15.f222050o = r0     // Catch:{ Exception -> 0x04eb }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04eb }
            r0.<init>()     // Catch:{ Exception -> 0x04eb }
            r0.append(r14)     // Catch:{ Exception -> 0x04eb }
            java.lang.String r6 = ".url"
            r0.append(r6)     // Catch:{ Exception -> 0x04eb }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x04eb }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ Exception -> 0x04eb }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x04eb }
            r15.f222041f = r0     // Catch:{ Exception -> 0x04eb }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04eb }
            r0.<init>()     // Catch:{ Exception -> 0x04eb }
            r0.append(r14)     // Catch:{ Exception -> 0x04eb }
            java.lang.String r6 = ".shorturl"
            r0.append(r6)     // Catch:{ Exception -> 0x04eb }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x04eb }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ Exception -> 0x04eb }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x04eb }
            r15.f222042g = r0     // Catch:{ Exception -> 0x04eb }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04eb }
            r0.<init>()     // Catch:{ Exception -> 0x04eb }
            r0.append(r14)     // Catch:{ Exception -> 0x04eb }
            java.lang.String r6 = ".longurl"
            r0.append(r6)     // Catch:{ Exception -> 0x04eb }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x04eb }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ Exception -> 0x04eb }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x04eb }
            r15.f222043h = r0     // Catch:{ Exception -> 0x04eb }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04eb }
            r0.<init>()     // Catch:{ Exception -> 0x04eb }
            r0.append(r14)     // Catch:{ Exception -> 0x04eb }
            java.lang.String r6 = ".pub_time"
            r0.append(r6)     // Catch:{ Exception -> 0x04eb }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x04eb }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ Exception -> 0x04eb }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x04eb }
            r6 = 0
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r0, r6)     // Catch:{ Exception -> 0x04eb }
            r15.f222044i = r6     // Catch:{ Exception -> 0x04eb }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04eb }
            r0.<init>()     // Catch:{ Exception -> 0x04eb }
            r0.append(r14)     // Catch:{ Exception -> 0x04eb }
            java.lang.String r6 = ".tweetid"
            r0.append(r6)     // Catch:{ Exception -> 0x04eb }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x04eb }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ Exception -> 0x04eb }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x04eb }
            if (r0 == 0) goto L_0x03fc
            boolean r6 = r2.equals(r0)     // Catch:{ Exception -> 0x0314 }
            if (r6 == 0) goto L_0x03ef
            goto L_0x03fc
        L_0x03ef:
            r28 = r2
            r29 = r3
            goto L_0x0434
        L_0x03f4:
            r28 = r2
            r6 = r21
            r11 = r26
            goto L_0x052b
        L_0x03fc:
            java.util.Date r0 = new java.util.Date     // Catch:{ Exception -> 0x04eb }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04eb }
            r28 = r2
            r29 = r3
            long r2 = (long) r12
            long r6 = r6 + r2
            r0.<init>(r6)     // Catch:{ Exception -> 0x04e5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04e5 }
            r2.<init>()     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r3 = "N"
            r2.append(r3)     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r0 = r5.format(r0)     // Catch:{ Exception -> 0x04e5 }
            r2.append(r0)     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x04e5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04e5 }
            r2.<init>()     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r3 = "create tweetID = "
            r2.append(r3)     // Catch:{ Exception -> 0x04e5 }
            r2.append(r0)     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x04e5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)     // Catch:{ Exception -> 0x04e5 }
        L_0x0434:
            r15.f222036a = r0     // Catch:{ Exception -> 0x04e5 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04e5 }
            r0.<init>()     // Catch:{ Exception -> 0x04e5 }
            r0.append(r14)     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r2 = ".sources.source.name"
            r0.append(r2)     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x04e5 }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x04e5 }
            r15.f222045j = r0     // Catch:{ Exception -> 0x04e5 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04e5 }
            r0.<init>()     // Catch:{ Exception -> 0x04e5 }
            r0.append(r14)     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r2 = ".sources.source.icon"
            r0.append(r2)     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x04e5 }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x04e5 }
            r15.f222046k = r0     // Catch:{ Exception -> 0x04e5 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04e5 }
            r0.<init>()     // Catch:{ Exception -> 0x04e5 }
            r0.append(r14)     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r2 = ".tweettype"
            r0.append(r2)     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x04e5 }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x04e5 }
            r2 = -1
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r2)     // Catch:{ Exception -> 0x04e5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04e5 }
            r2.<init>()     // Catch:{ Exception -> 0x04e5 }
            r2.append(r14)     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r3 = ".play_length"
            r2.append(r3)     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x04e5 }
            java.lang.Object r2 = r4.get(r2)     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x04e5 }
            r3 = -1
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r3)     // Catch:{ Exception -> 0x04e5 }
            r15.mo105921b(r2, r11, r1, r0)     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r0 = "create Reserved4 = %s"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x04e5 }
            java.lang.String r2 = r15.f222053r     // Catch:{ Exception -> 0x04e5 }
            if (r2 != 0) goto L_0x04ae
            r2 = r28
        L_0x04ae:
            r6 = 0
            r3[r6] = r2     // Catch:{ Exception -> 0x04e5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r0, r3)     // Catch:{ Exception -> 0x04e5 }
            long r2 = (long) r9     // Catch:{ Exception -> 0x04e5 }
            long r2 = r23 + r2
            r15.f222037b = r2     // Catch:{ Exception -> 0x04e5 }
            r2 = r26
            r15.f222038c = r2     // Catch:{ Exception -> 0x04e1 }
            r0 = r19
            r15.f222039d = r0     // Catch:{ Exception -> 0x04e1 }
            r3 = r22
            r15.f222052q = r3     // Catch:{ Exception -> 0x04e1 }
            r6 = r21
            r6.add(r15)     // Catch:{ Exception -> 0x04df }
            int r12 = r12 + 1
            r19 = r0
            r7 = r2
            r22 = r3
            r21 = r6
            r6 = r25
            r0 = r27
            r2 = r28
            r3 = r29
            r15 = 20
            goto L_0x02a0
        L_0x04df:
            r0 = move-exception
            goto L_0x0515
        L_0x04e1:
            r0 = move-exception
        L_0x04e2:
            r6 = r21
            goto L_0x0515
        L_0x04e5:
            r0 = move-exception
        L_0x04e6:
            r6 = r21
            r2 = r26
            goto L_0x0515
        L_0x04eb:
            r0 = move-exception
            r28 = r2
            goto L_0x04e6
        L_0x04ef:
            r28 = r2
            r29 = r3
            r2 = r7
            r6 = r21
            r3 = r22
            int r9 = r9 + 1
            r1 = r30
            r11 = r2
            r0 = r3
            r10 = r6
            r13 = r20
            r14 = r23
            r2 = r28
            r3 = r29
            r6 = 1
            r7 = 0
            goto L_0x00f0
        L_0x050b:
            r0 = move-exception
            r28 = r2
            r2 = r7
            goto L_0x04e2
        L_0x0510:
            r0 = move-exception
            r28 = r2
            r2 = r7
            r6 = r10
        L_0x0515:
            r11 = r2
            goto L_0x052b
        L_0x0517:
            r0 = move-exception
            r28 = r2
            r6 = r10
            goto L_0x0527
        L_0x051c:
            r0 = move-exception
            r28 = r2
            r6 = r10
            goto L_0x0527
        L_0x0521:
            r0 = move-exception
            r28 = r2
            r6 = r10
            r19 = r11
        L_0x0527:
            r20 = r13
        L_0x0529:
            r11 = r19
        L_0x052b:
            r1 = 0
            goto L_0x0542
        L_0x052d:
            r28 = r2
            r6 = r10
            r19 = r11
        L_0x0532:
            r20 = r13
        L_0x0534:
            r11 = r19
            r1 = r28
            goto L_0x0549
        L_0x0539:
            r0 = move-exception
            r28 = r2
            r6 = r10
            r20 = r13
            r1 = 0
            r9 = 0
            r11 = 0
        L_0x0542:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r1 = r28
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r1, r2)
        L_0x0549:
            int r0 = eb0.C75592q0.m90786p()
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 != 0) goto L_0x0553
            r0 = 1
            goto L_0x0554
        L_0x0553:
            r0 = 0
        L_0x0554:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "type = "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r3 = ", want to receive news? "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r0)
            java.util.Iterator r0 = r6.iterator()
        L_0x0575:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x05dc
            java.lang.Object r2 = r0.next()
            eb0.h4 r2 = (eb0.C75584h4) r2
            java.lang.String r3 = r2.mo105924f()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            java.lang.String r4 = ", type = "
            if (r3 == 0) goto L_0x05af
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "readerAppInfo.getTitle() is null, appInfo.tweetid = "
            r0.append(r3)
            java.lang.String r3 = r2.mo105925g()
            r0.append(r3)
            r0.append(r4)
            int r2 = r2.f222038c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            goto L_0x05da
        L_0x05af:
            java.lang.String r3 = r2.mo105926h()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x0575
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "readerAppInfo.getUrl() is null, appInfo.tweetid = "
            r0.append(r3)
            java.lang.String r3 = r2.mo105925g()
            r0.append(r3)
            r0.append(r4)
            int r2 = r2.f222038c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
        L_0x05da:
            r0 = 0
            goto L_0x05dd
        L_0x05dc:
            r0 = 1
        L_0x05dd:
            int r2 = r6.size()
            if (r2 <= 0) goto L_0x084d
            if (r0 == 0) goto L_0x084d
            r0 = 0
            r2 = 0
            r12 = 0
        L_0x05e8:
            int r3 = r6.size()
            if (r0 >= r3) goto L_0x076b
            eb0.j4 r3 = hg2.C76193l.yx0()
            java.lang.Object r4 = r6.get(r0)
            eb0.h4 r4 = (eb0.C75584h4) r4
            r3.getClass()
            if (r4 != 0) goto L_0x0603
            r13 = r20
            r3 = 0
            r4 = -1
            goto L_0x0755
        L_0x0603:
            r5 = -1
            r4.f222059x = r5
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            int r7 = r4.f222059x
            r10 = 1
            r7 = r7 & r10
            java.lang.String r10 = "tweetid"
            if (r7 == 0) goto L_0x061b
            java.lang.String r7 = r4.mo105925g()
            r5.put(r10, r7)
        L_0x061b:
            int r7 = r4.f222059x
            r13 = 2
            r7 = r7 & r13
            if (r7 == 0) goto L_0x062d
            long r13 = r4.f222037b
            java.lang.Long r7 = java.lang.Long.valueOf(r13)
            java.lang.String r13 = "time"
            r5.put(r13, r7)
        L_0x062d:
            int r7 = r4.f222059x
            r7 = r7 & 4
            if (r7 == 0) goto L_0x063f
            int r7 = r4.f222038c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r13 = "type"
            r5.put(r13, r7)
        L_0x063f:
            int r7 = r4.f222059x
            r7 = r7 & 8
            if (r7 == 0) goto L_0x0650
            java.lang.String r7 = r4.f222039d
            if (r7 != 0) goto L_0x064a
            r7 = r1
        L_0x064a:
            java.lang.String r13 = "name"
            r5.put(r13, r7)
        L_0x0650:
            int r7 = r4.f222059x
            r7 = r7 & 16
            if (r7 == 0) goto L_0x0660
            java.lang.String r7 = r4.mo105924f()
            java.lang.String r13 = "title"
            r5.put(r13, r7)
        L_0x0660:
            int r7 = r4.f222059x
            r7 = r7 & 32
            if (r7 == 0) goto L_0x0670
            java.lang.String r7 = r4.mo105926h()
            java.lang.String r13 = "url"
            r5.put(r13, r7)
        L_0x0670:
            int r7 = r4.f222059x
            r7 = r7 & 64
            if (r7 == 0) goto L_0x0681
            java.lang.String r7 = r4.f222042g
            if (r7 != 0) goto L_0x067b
            r7 = r1
        L_0x067b:
            java.lang.String r13 = "shorturl"
            r5.put(r13, r7)
        L_0x0681:
            int r7 = r4.f222059x
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0692
            java.lang.String r7 = r4.f222043h
            if (r7 != 0) goto L_0x068c
            r7 = r1
        L_0x068c:
            java.lang.String r13 = "longurl"
            r5.put(r13, r7)
        L_0x0692:
            int r7 = r4.f222059x
            r7 = r7 & 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L_0x06a4
            long r13 = r4.f222044i
            java.lang.Long r7 = java.lang.Long.valueOf(r13)
            java.lang.String r13 = "pubtime"
            r5.put(r13, r7)
        L_0x06a4:
            int r7 = r4.f222059x
            r7 = r7 & 512(0x200, float:7.175E-43)
            if (r7 == 0) goto L_0x06b5
            java.lang.String r7 = r4.f222045j
            if (r7 != 0) goto L_0x06af
            r7 = r1
        L_0x06af:
            java.lang.String r13 = "sourcename"
            r5.put(r13, r7)
        L_0x06b5:
            int r7 = r4.f222059x
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L_0x06c6
            java.lang.String r7 = r4.f222046k
            if (r7 != 0) goto L_0x06c0
            r7 = r1
        L_0x06c0:
            java.lang.String r13 = "sourceicon"
            r5.put(r13, r7)
        L_0x06c6:
            int r7 = r4.f222059x
            r7 = r7 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x06d7
            int r7 = r4.f222047l
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r13 = "istop"
            r5.put(r13, r7)
        L_0x06d7:
            int r7 = r4.f222059x
            r7 = r7 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x06e6
            java.lang.String r7 = r4.mo105922c()
            java.lang.String r13 = "cover"
            r5.put(r13, r7)
        L_0x06e6:
            int r7 = r4.f222059x
            r7 = r7 & 8192(0x2000, float:1.14794E-41)
            if (r7 == 0) goto L_0x06f5
            java.lang.String r7 = r4.mo105923d()
            java.lang.String r13 = "digest"
            r5.put(r13, r7)
        L_0x06f5:
            int r7 = r4.f222059x
            r7 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r7 == 0) goto L_0x0707
            int r7 = r4.f222050o
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r13 = "reserved1"
            r5.put(r13, r7)
        L_0x0707:
            int r7 = r4.f222059x
            r13 = 32768(0x8000, float:4.5918E-41)
            r7 = r7 & r13
            if (r7 == 0) goto L_0x071b
            long r13 = r4.f222051p
            java.lang.Long r7 = java.lang.Long.valueOf(r13)
            java.lang.String r13 = "reserved2"
            r5.put(r13, r7)
        L_0x071b:
            int r7 = r4.f222059x
            r13 = 65536(0x10000, float:9.18355E-41)
            r7 = r7 & r13
            if (r7 == 0) goto L_0x072d
            java.lang.String r7 = r4.f222052q
            if (r7 != 0) goto L_0x0727
            r7 = r1
        L_0x0727:
            r13 = r20
            r5.put(r13, r7)
            goto L_0x072f
        L_0x072d:
            r13 = r20
        L_0x072f:
            int r7 = r4.f222059x
            r14 = 131072(0x20000, float:1.83671E-40)
            r7 = r7 & r14
            if (r7 == 0) goto L_0x0741
            java.lang.String r7 = r4.f222053r
            if (r7 != 0) goto L_0x073b
            r7 = r1
        L_0x073b:
            java.lang.String r14 = "reserved4"
            r5.put(r14, r7)
        L_0x0741:
            zh3.f r7 = r3.f222063d
            int r4 = r4.f222038c
            java.lang.String r3 = r3.mo105933kD(r4)
            r4 = 0
            long r14 = r7.mo125627q(r3, r10, r5, r4)
            int r3 = (int) r14
            r4 = -1
            if (r3 == r4) goto L_0x0754
            r3 = 1
            goto L_0x0755
        L_0x0754:
            r3 = 0
        L_0x0755:
            if (r3 == 0) goto L_0x0765
            if (r12 != 0) goto L_0x0763
            java.lang.Object r3 = r6.get(r0)
            r12 = r3
            eb0.h4 r12 = (eb0.C75584h4) r12
            r3 = 1
            r12.f222047l = r3
        L_0x0763:
            int r2 = r2 + 1
        L_0x0765:
            int r0 = r0 + 1
            r20 = r13
            goto L_0x05e8
        L_0x076b:
            r3 = 2
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = 0
            r0[r4] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r4 = 1
            r0[r4] = r3
            java.lang.String r3 = "[onPreAddMessage] insertCount:%s catIdx:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r3, r0)
            if (r2 <= 0) goto L_0x0844
            eb0.j4 r0 = hg2.C76193l.yx0()
            r0.getClass()
            boolean r2 = eb0.C75586j4.f222062f
            if (r2 == 0) goto L_0x078f
            goto L_0x07a1
        L_0x078f:
            eb0.C75586j4.f222062f = r4
            zt3.t r2 = zt3.C119157j.f356862d
            eb0.i4 r3 = new eb0.i4
            r3.<init>(r0)
            zt3.j r2 = (zt3.C119157j) r2
            java.lang.String r0 = "ReaderAppDeleteOldDataThread"
            r4 = 1000(0x3e8, double:4.94E-321)
            r2.mo183879j(r3, r4, r0)
        L_0x07a1:
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            k40.a r2 = f40.C86709a0.m107533q(r0)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.v3 r2 = r2.mo96094Ku()
            java.lang.String r3 = eb0.C75584h4.m90717e(r11)
            com.tencent.mm.storage.i2 r2 = (com.tencent.p014mm.storage.C44660i2) r2
            com.tencent.mm.storage.h2 r2 = r2.mo69771j(r3)
            if (r2 == 0) goto L_0x07f4
            java.lang.String r3 = r2.getUsername()
            java.lang.String r4 = eb0.C75584h4.m90717e(r11)
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x07c8
            goto L_0x07f4
        L_0x07c8:
            java.lang.String r1 = r12.mo105924f()
            r2.mo108792M2(r1)
            long r3 = r12.f222037b
            r2.mo108793N2(r3)
            r1 = 0
            r2.mo108803Y2(r1)
            int r1 = r2.mo108786G2()
            int r1 = r1 + r9
            r2.mo108812g3(r1)
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.v3 r0 = r0.mo96094Ku()
            java.lang.String r1 = eb0.C75584h4.m90717e(r11)
            com.tencent.mm.storage.i2 r0 = (com.tencent.p014mm.storage.C44660i2) r0
            r0.mo69773k0(r2, r1)
            goto L_0x082c
        L_0x07f4:
            com.tencent.mm.storage.h2 r2 = new com.tencent.mm.storage.h2
            r2.<init>()
            java.lang.String r3 = eb0.C75584h4.m90717e(r11)
            r2.setUsername(r3)
            if (r12 != 0) goto L_0x0803
            goto L_0x0807
        L_0x0803:
            java.lang.String r1 = r12.mo105924f()
        L_0x0807:
            r2.mo108792M2(r1)
            if (r12 != 0) goto L_0x0811
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            goto L_0x0813
        L_0x0811:
            long r3 = r12.f222037b
        L_0x0813:
            r2.mo108793N2(r3)
            r1 = 0
            r2.mo108803Y2(r1)
            r2.mo108812g3(r9)
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.v3 r0 = r0.mo96094Ku()
            com.tencent.mm.storage.i2 r0 = (com.tencent.p014mm.storage.C44660i2) r0
            r0.mo69751W(r2)
        L_0x082c:
            eb0.j4 r0 = hg2.C76193l.yx0()
            r0.doNotify()
            ob0.m$b r0 = new ob0.m$b
            java.lang.String r1 = r12.mo105924f()
            r2 = r30
            com.tencent.mm.storage.f4 r1 = r2.mo106453d(r1, r11)
            r3 = 1
            r0.<init>(r1, r3)
            return r0
        L_0x0844:
            r2 = r30
            java.lang.String r0 = "insert error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            r1 = 0
            return r1
        L_0x084d:
            r2 = r30
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hg2.C76190f.mo56403Fg(ob0.m$a):ob0.m$b");
    }

    /* renamed from: d */
    public final C72963f4 mo106453d(String str, int i) {
        C72963f4 f4Var = new C72963f4();
        f4Var.mo108732L2(str);
        f4Var.mo108749c3(C75584h4.m90717e(i));
        f4Var.setType(1);
        f4Var.setMsgId(7377812);
        return f4Var;
    }

    /* renamed from: ld */
    public void mo56404ld(C35136m.C35138c cVar) {
        String str = (String) cVar.f94251b;
        Log.m105925i("MicroMsg.ReaderAppMsgExtension", "[onPreDelMessage] functionId:%s", str);
        try {
            C76193l.yx0().mo105928Lo(str, 20, true, true);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ReaderAppMsgExtension", "[onPreDelMessage] Exception:%s", e);
        }
    }

    /* renamed from: nA */
    public /* synthetic */ boolean mo56405nA(C67046a aVar, String str, long j, String str2, String str3, String str4, int i, String str5, String str6, String str7, int i2) {
        return false;
    }
}
