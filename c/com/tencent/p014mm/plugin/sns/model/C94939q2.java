package com.tencent.p014mm.plugin.sns.model;

/* renamed from: com.tencent.mm.plugin.sns.model.q2 */
public class C94939q2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C94928p2 f275150d;

    public C94939q2(C94928p2 p2Var) {
        this.f275150d = p2Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0a2f, code lost:
        if (r4.field_type != 3) goto L_0x0a32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0a32, code lost:
        r8.mo131201l(r4, 4, "buf url is null");
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("startPost", "com.tencent.mm.plugin.sns.model.UploadManager");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0a73, code lost:
        r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0();
        r0 = r4.localid;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0a79, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:?, code lost:
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs("addPostId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0a8d, code lost:
        if (((java.util.Vector) r1.f274777d).contains(java.lang.Integer.valueOf(r0)) == false) goto L_0x0a99;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0a8f, code lost:
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("addPostId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0a96, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0a97, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:?, code lost:
        ((java.util.Vector) r1.f274777d).add(java.lang.Integer.valueOf(r0));
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("addPostId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0aab, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0aac, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0aad, code lost:
        if (r0 != false) goto L_0x0acd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0aaf, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.UploadManager", "this snsinfo is posting, localId=%d", java.lang.Integer.valueOf(r4.localid));
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("startPost", "com.tencent.mm.plugin.sns.model.UploadManager");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0acd, code lost:
        r0 = new java.util.LinkedList();
        r1 = r33;
        r3 = r1.f298748i.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0ade, code lost:
        if (r3.hasNext() == false) goto L_0x0aec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0ae0, code lost:
        r0.add(r3.next().f298255d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0aec, code lost:
        r13 = ms2.C99969q.m130612c(r2);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.UploadManager", "timeLine contentDescScene ：  " + r2.contentDescScene + " contentDescShowType: " + r2.contentDescShowType);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0b16, code lost:
        if (r4.field_pravited != 1) goto L_0x0b34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0b18, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.UploadManager", "content private xml is null ? " + com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0b34, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.UploadManager", "upload xmlsns: %s", r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0b42, code lost:
        r3 = com.tencent.p014mm.plugin.sns.model.C94942r1.f275179a;
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs("resetData", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.SnsPostSafeStrategyDataHelper", "resetData: ");
        ((java.util.LinkedHashMap) com.tencent.p014mm.plugin.sns.model.C94942r1.f275180b).clear();
        ((java.util.LinkedHashMap) com.tencent.p014mm.plugin.sns.model.C94942r1.f275181c).clear();
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("resetData", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0b65, code lost:
        if (r13 == null) goto L_0x0bff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0b6d, code lost:
        if (r13.equals("") == false) goto L_0x0b71;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0b74, code lost:
        if (r1.f298758v != 1) goto L_0x0b79;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0b76, code lost:
        r24 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0b79, code lost:
        r24 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0b7b, code lost:
        r3 = r4.localid;
        r6 = r1.f298759w;
        r9 = r2.Location.f298659s;
        r2 = r2.ContentObj.f298425f;
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs("snsPost", "com.tencent.mm.plugin.sns.model.UploadManager");
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.UploadManager", "snsPost: ready do scene");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0b9b, code lost:
        if (com.tencent.p014mm.plugin.sns.model.C94866e1.qy0() == false) goto L_0x0ba8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0b9d, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.UploadManager", "is invalid to getSnsInfoStorage");
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("snsPost", "com.tencent.mm.plugin.sns.model.UploadManager");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0ba8, code lost:
        r12 = r1.f298735I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0baa, code lost:
        if (r12 == null) goto L_0x0bb5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0bac, code lost:
        r29 = r12.f183896d;
        r30 = r12.f183897e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0bb5, code lost:
        r30 = "";
        r29 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0bbb, code lost:
        r8.f275126b = new com.tencent.p014mm.plugin.sns.model.NetSceneSnsPost(r13, r1.f298745f, r1.f298744e, r0, r7, r3, r1.f298746g, r1.f298752p, r1.f298753q, r1.f298754r, r1, r24, r6, r1.f298760x, r9, r2, r29, r30);
        f40.C86709a0.m107528h();
        f40.C86709a0.m107529k().f251779b.mo123460f(r8.f275126b);
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("snsPost", "com.tencent.mm.plugin.sns.model.UploadManager");
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0bff, code lost:
        r4 = r4;
        r8.mo131201l(r4, 5, "content is error");
        com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0().mo130964w(r4.localid);
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("startPost", "com.tencent.mm.plugin.sns.model.UploadManager");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x020c, code lost:
        r3 = r3.ContentObj;
     */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x060f  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x067a  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0600 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r35 = this;
            r1 = r35
            java.lang.String r0 = "run"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.UploadManager$3"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r2)
            boolean r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.qy0()
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "MicroMsg.UploadManager"
            java.lang.String r2 = "is invalid to getSnsInfoStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            java.lang.String r0 = "run"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.UploadManager$3"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        L_0x0021:
            com.tencent.mm.plugin.sns.model.p2 r0 = r1.f275150d
            java.lang.String r2 = "access$100"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.model.UploadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            r0.getClass()
            java.lang.String r4 = "checkTLE"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            java.lang.String r5 = "MicroMsg.UploadManager"
            java.lang.String r6 = "checkTLE: "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            os2.e0 r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            r6.getClass()
            java.lang.String r7 = "getAllUpload"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.storage.SnsInfoStorage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "select *,rowid from SnsInfo  where "
            r9.append(r10)
            java.lang.String r10 = os2.C100400e0.f294100s
            r9.append(r10)
            java.lang.String r10 = " order by "
            r9.append(r10)
            java.lang.String r10 = "SnsInfo"
            r9.append(r10)
            java.lang.String r10 = "."
            r9.append(r10)
            java.lang.String r10 = "rowid"
            r9.append(r10)
            java.lang.String r10 = " asc "
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            os2.k0 r6 = r6.f294108d
            r10 = 0
            android.database.Cursor r6 = r6.rawQuery(r9, r10)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "getLastUpload "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            java.lang.String r11 = "MicroMsg.SnsInfoStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r9)
            int r9 = r6.getCount()
            if (r9 != 0) goto L_0x00a0
            r6.close()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            r6 = r10
            goto L_0x00a6
        L_0x00a0:
            r6.moveToFirst()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
        L_0x00a6:
            com.tencent.mm.plugin.sns.storage.SnsInfo r7 = new com.tencent.mm.plugin.sns.storage.SnsInfo
            r7.<init>()
            r8 = 6
            r9 = 2
            if (r6 != 0) goto L_0x00b4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            goto L_0x0132
        L_0x00b4:
            r6.moveToFirst()
        L_0x00b7:
            r7.convertFrom((android.database.Cursor) r6)
            te3.lv2 r11 = new te3.lv2     // Catch:{ Exception -> 0x011b }
            r11.<init>()     // Catch:{ Exception -> 0x011b }
            byte[] r12 = r7.getPostBuf()     // Catch:{ Exception -> 0x011b }
            pe3.a r11 = r11.parseFrom(r12)     // Catch:{ Exception -> 0x011b }
            te3.lv2 r11 = (te3.C101808lv2) r11     // Catch:{ Exception -> 0x011b }
            int r12 = r11.f298750n
            long r13 = r11.f298751o
            boolean r12 = r7.isTimeLimit(r12, r13)
            if (r12 == 0) goto L_0x0126
            java.lang.String r12 = "cleanUploadAndPost"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r3)
            java.util.LinkedList<te3.ar2> r11 = r11.f298747h
            java.util.Iterator r11 = r11.iterator()
        L_0x00de:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x00f4
            java.lang.Object r13 = r11.next()
            te3.ar2 r13 = (te3.C64241ar2) r13
            com.tencent.mm.plugin.sns.model.b1 r14 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()
            int r13 = r13.f182140d
            r14.mo130965x(r13)
            goto L_0x00de
        L_0x00f4:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r3)
            java.lang.String r11 = "snsinfo is tle"
            r0.mo131201l(r7, r8, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "checkTLE snsinfo localId it time limit "
            r11.append(r12)
            java.lang.String r12 = r7.getLocalid()
            r11.append(r12)
            java.lang.String r12 = " is die "
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r11)
            goto L_0x0126
        L_0x011b:
            java.lang.String r11 = "startPost parseFrom MediaPostInfo Exception"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r11)
            java.lang.String r11 = "MediaPostInfo parser error"
            r0.mo131201l(r7, r9, r11)
        L_0x0126:
            boolean r11 = r6.moveToNext()
            if (r11 != 0) goto L_0x0c7d
            r6.close()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
        L_0x0132:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            boolean r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.qy0()
            if (r0 == 0) goto L_0x014c
            java.lang.String r0 = "MicroMsg.UploadManager"
            java.lang.String r2 = "is invalid after checkTLE"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            java.lang.String r0 = "run"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.UploadManager$3"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        L_0x014c:
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            r0.getClass()
            java.lang.String r2 = "getLastUpload"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.SnsInfoStorage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = new com.tencent.mm.plugin.sns.storage.SnsInfo
            r4.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "select *,rowid from SnsInfo  where "
            r5.append(r6)
            java.lang.String r6 = os2.C100400e0.f294100s
            r5.append(r6)
            java.lang.String r6 = " order by "
            r5.append(r6)
            java.lang.String r6 = "SnsInfo"
            r5.append(r6)
            java.lang.String r6 = "."
            r5.append(r6)
            java.lang.String r6 = "rowid"
            r5.append(r6)
            java.lang.String r6 = " asc "
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            os2.k0 r0 = r0.f294108d
            android.database.Cursor r0 = r0.rawQuery(r5, r10, r9)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "getLastUpload "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "MicroMsg.SnsInfoStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r5)
            boolean r5 = r0.moveToFirst()
            if (r5 != 0) goto L_0x01b7
            r0.close()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            r4 = r10
            goto L_0x01c0
        L_0x01b7:
            r4.convertFrom((android.database.Cursor) r0)
            r0.close()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
        L_0x01c0:
            if (r4 != 0) goto L_0x01d2
            java.lang.String r0 = "MicroMsg.UploadManager"
            java.lang.String r2 = "All has post"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            java.lang.String r0 = "run"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.UploadManager$3"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        L_0x01d2:
            com.tencent.mm.plugin.sns.model.b1 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()
            int r2 = r4.localid
            boolean r0 = r0.mo130955n(r2)
            if (r0 == 0) goto L_0x01ff
            java.lang.String r0 = "MicroMsg.UploadManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "checking isPosting "
            r2.append(r3)
            int r3 = r4.localid
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            java.lang.String r0 = "run"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.UploadManager$3"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        L_0x01ff:
            java.lang.String r0 = "checkSnsInfoIsFakeVideo"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r2)
            com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r4.getTimeLine()
            if (r3 == 0) goto L_0x0213
            te3.j00 r3 = r3.ContentObj
            if (r3 == 0) goto L_0x0213
            java.util.LinkedList<te3.kv2> r3 = r3.f298427h
            goto L_0x0214
        L_0x0213:
            r3 = r10
        L_0x0214:
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x0221
            boolean r7 = r3.isEmpty()
            if (r7 == 0) goto L_0x021f
            goto L_0x0221
        L_0x021f:
            r7 = 0
            goto L_0x0222
        L_0x0221:
            r7 = 1
        L_0x0222:
            r11 = 8
            if (r7 != 0) goto L_0x0237
            java.lang.Object r3 = r3.get(r5)
            te3.kv2 r3 = (te3.C101804kv2) r3
            int r3 = r3.f298690e
            if (r3 != r11) goto L_0x0232
            r3 = 1
            goto L_0x0233
        L_0x0232:
            r3 = 0
        L_0x0233:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x023b
        L_0x0237:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            r3 = 0
        L_0x023b:
            if (r3 == 0) goto L_0x02a1
            java.lang.String r0 = "MicroMsg.UploadManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "feed is fake video "
            r2.append(r3)
            int r3 = r4.localid
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            int r0 = r4.localid
            int r2 = r4.getCreateTime()
            com.tencent.mm.plugin.sns.model.q2$$a r3 = new com.tencent.mm.plugin.sns.model.q2$$a
            r3.<init>(r1, r4)
            java.lang.String r4 = "checkFakeVideoIsError"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "checkFakeVideoIsError >> localId: "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r7 = ", createTime: "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "MicroMsg.SnsTimeLineFakeViewHandler"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            java.lang.Class<hf3.c> r6 = hf3.C98449c.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            hf3.c r6 = (hf3.C98449c) r6
            com.tencent.mm.plugin.sns.model.v1 r7 = new com.tencent.mm.plugin.sns.model.v1
            r7.<init>(r3, r0, r2)
            r6.mo136684od(r0, r2, r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            java.lang.String r0 = "run"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.UploadManager$3"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        L_0x02a1:
            java.lang.String r0 = "MicroMsg.UploadManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "checking startPost "
            r2.append(r3)
            java.lang.String r3 = r4.getLocalid()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            com.tencent.mm.plugin.sns.model.p2 r2 = r1.f275150d
            java.lang.String r0 = "access$200"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.model.UploadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            r2.getClass()
            java.lang.String r0 = "startPost"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.model.UploadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            te3.lv2 r0 = new te3.lv2     // Catch:{ Exception -> 0x0c42 }
            r0.<init>()     // Catch:{ Exception -> 0x0c42 }
            byte[] r3 = r4.getPostBuf()     // Catch:{ Exception -> 0x0c42 }
            pe3.a r0 = r0.parseFrom(r3)     // Catch:{ Exception -> 0x0c42 }
            r3 = r0
            te3.lv2 r3 = (te3.C101808lv2) r3     // Catch:{ Exception -> 0x0c42 }
            int r0 = r3.f298750n     // Catch:{ Exception -> 0x0c42 }
            int r0 = r0 + r6
            r3.f298750n = r0     // Catch:{ Exception -> 0x0c42 }
            byte[] r0 = r3.toByteArray()     // Catch:{ Exception -> 0x0c42 }
            r4.setPostBuf(r0)     // Catch:{ Exception -> 0x0c42 }
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()     // Catch:{ Exception -> 0x0c42 }
            int r7 = r4.localid     // Catch:{ Exception -> 0x0c42 }
            r0.Rv0(r7, r4)     // Catch:{ Exception -> 0x0c42 }
            java.lang.String r0 = "MicroMsg.UploadManager"
            java.lang.String r7 = "startPost: tryCount=%d, tryStartTime=%s"
            java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0c42 }
            int r13 = r3.f298750n     // Catch:{ Exception -> 0x0c42 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x0c42 }
            r12[r5] = r13     // Catch:{ Exception -> 0x0c42 }
            long r13 = r3.f298751o     // Catch:{ Exception -> 0x0c42 }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x0c42 }
            r12[r6] = r13     // Catch:{ Exception -> 0x0c42 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r7, r12)     // Catch:{ Exception -> 0x0c42 }
            int r0 = r3.f298750n
            long r12 = r3.f298751o
            boolean r0 = r4.isTimeLimit(r0, r12)
            if (r0 == 0) goto L_0x0348
            java.lang.String r0 = "this item isTimeLimit"
            r2.mo131201l(r4, r8, r0)
            java.lang.String r0 = "MicroMsg.UploadManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "snsinfo localId it time limit "
            r2.append(r3)
            java.lang.String r3 = r4.getLocalid()
            r2.append(r3)
            java.lang.String r3 = " is die "
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            java.lang.String r0 = "startPost"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.UploadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x0c6d
        L_0x0348:
            java.lang.String r0 = "MicroMsg.UploadManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r12 = "try start post "
            r7.append(r12)
            java.lang.String r12 = r4.getLocalid()
            r7.append(r12)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
            com.tencent.mm.plugin.sns.model.p2$g r0 = com.tencent.p014mm.plugin.sns.model.C94928p2.C94935g.STATE_FALSE
            com.tencent.mm.plugin.sns.model.p2$g r7 = com.tencent.p014mm.plugin.sns.model.C94928p2.C94935g.STATE_ERROR
            java.lang.String r15 = "canPost"
            java.lang.String r14 = "com.tencent.mm.plugin.sns.model.UploadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r14)
            com.tencent.mm.protocal.protobuf.TimeLineObject r13 = r4.getTimeLine()
            java.lang.Object[] r12 = new java.lang.Object[r6]
            te3.j00 r10 = r13.ContentObj
            int r10 = r10.f298424e
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r12[r5] = r10
            java.lang.String r10 = "MicroMsg.UploadManager"
            java.lang.String r8 = "canPost: ContentStyle=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r8, r12)
            te3.j00 r8 = r13.ContentObj
            int r8 = r8.f298424e
            r12 = 5
            if (r8 != r11) goto L_0x0393
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r14)
        L_0x038f:
            r5 = 15
            goto L_0x0456
        L_0x0393:
            if (r8 != r9) goto L_0x0399
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r14)
            goto L_0x038f
        L_0x0399:
            r11 = 26
            if (r8 != r11) goto L_0x03d2
            com.tencent.mm.autogen.events.FavoriteOperationEvent r8 = new com.tencent.mm.autogen.events.FavoriteOperationEvent
            r8.<init>()
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r11 = r8.f264833d
            r9 = 30
            r11.f264835a = r9
            r11.f264847m = r12
            te3.j00 r9 = r13.ContentObj
            java.lang.String r9 = r9.f298429j
            r11.f264837c = r9
            int r9 = r4.localid
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r11.f264846l = r9
            r8.publish()
            com.tencent.mm.autogen.events.FavoriteOperationEvent$b r8 = r8.f264834e
            int r8 = r8.f264855a
            if (r8 == r6) goto L_0x03d2
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r0[r5] = r7
            java.lang.String r7 = "canPost: failed, checkCanPostEvent ret=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r7, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r14)
            goto L_0x03e1
        L_0x03d2:
            te3.j00 r8 = r13.ContentObj
            java.util.LinkedList<te3.kv2> r8 = r8.f298427h
            if (r8 != 0) goto L_0x03e4
            java.lang.String r0 = "timeline or timelineObjList is null"
            r2.mo131201l(r4, r6, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r14)
        L_0x03e1:
            r5 = 15
            goto L_0x044d
        L_0x03e4:
            int r8 = r8.size()
            if (r8 != 0) goto L_0x03ee
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r14)
            goto L_0x038f
        L_0x03ee:
            te3.lv2 r8 = new te3.lv2     // Catch:{ Exception -> 0x063b }
            r8.<init>()     // Catch:{ Exception -> 0x063b }
            byte[] r9 = r4.getPostBuf()     // Catch:{ Exception -> 0x063b }
            pe3.a r8 = r8.parseFrom(r9)     // Catch:{ Exception -> 0x063b }
            te3.lv2 r8 = (te3.C101808lv2) r8     // Catch:{ Exception -> 0x063b }
            te3.j00 r9 = r13.ContentObj
            int r9 = r9.f298424e
            if (r9 != r6) goto L_0x040e
            java.util.LinkedList<te3.ar2> r9 = r8.f298747h
            int r9 = r9.size()
            if (r9 <= r6) goto L_0x040c
            goto L_0x040e
        L_0x040c:
            r9 = 0
            goto L_0x040f
        L_0x040e:
            r9 = 1
        L_0x040f:
            te3.j00 r11 = r13.ContentObj
            int r11 = r11.f298424e
            r12 = 21
            if (r11 != r12) goto L_0x0418
            r9 = 0
        L_0x0418:
            java.lang.String r12 = "upload has set it fail"
            r5 = 15
            if (r11 != r5) goto L_0x045b
            java.util.LinkedList<te3.ar2> r8 = r8.f298747h
            java.util.Iterator r8 = r8.iterator()
        L_0x0425:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x0453
            java.lang.Object r11 = r8.next()
            te3.ar2 r11 = (te3.C64241ar2) r11
            int r13 = r11.f182140d
            com.tencent.mm.plugin.sns.model.p2$g r13 = r2.mo131194e(r13, r9)
            if (r13 != r7) goto L_0x0443
            int r0 = r11.f182140d
            r7 = 2
            r2.mo131200k(r4, r0, r7, r12)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r14)
            goto L_0x044d
        L_0x0443:
            if (r13 != r0) goto L_0x0425
            java.lang.String r0 = "canPost: failed, sight retState = STATE_FALSE"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r14)
        L_0x044d:
            r1 = r2
            r28 = r3
        L_0x0450:
            r0 = 0
            goto L_0x0678
        L_0x0453:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r14)
        L_0x0456:
            r1 = r2
            r28 = r3
            goto L_0x0639
        L_0x045b:
            java.lang.Object[] r11 = new java.lang.Object[r6]
            java.util.LinkedList<te3.ar2> r5 = r8.f298747h
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r22 = 0
            r11[r22] = r5
            java.lang.String r5 = "canPost: check LocalMediaId size=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r5, r11)
            java.util.LinkedList<te3.ar2> r5 = r8.f298747h
            java.util.Iterator r5 = r5.iterator()
        L_0x0476:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0631
            java.lang.Object r8 = r5.next()
            te3.ar2 r8 = (te3.C64241ar2) r8
            os2.j0 r11 = com.tencent.p014mm.plugin.sns.model.C94866e1.ay0()
            int r6 = r8.f182140d
            r24 = r5
            long r5 = (long) r6
            os2.i0 r5 = r11.mo139867LL(r5)
            int r5 = r5.mo139853g()
            r11 = 6
            if (r5 != r11) goto L_0x04a8
            int r5 = r8.f182140d
            com.tencent.mm.plugin.sns.model.p2$g r5 = r2.mo131194e(r5, r9)
            r29 = r0
            r28 = r3
            r26 = r12
            r25 = r13
            r27 = r15
            goto L_0x056b
        L_0x04a8:
            int r5 = r8.f182140d
            te3.j00 r6 = r13.ContentObj
            int r6 = r6.f298424e
            java.lang.String r11 = "doUpload"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r14)
            r1 = -1
            if (r5 != r1) goto L_0x04cd
            java.lang.String r5 = "uploading depend localMediaId can not get the media"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r14)
            r29 = r0
            r31 = r2
            r28 = r3
            r34 = r12
            r21 = r13
            r2 = r14
            r5 = r15
            goto L_0x05fd
        L_0x04cd:
            os2.j0 r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.ay0()
            r26 = r12
            r25 = r13
            long r12 = (long) r5
            os2.i0 r1 = r1.mo139867LL(r12)
            te3.nv2 r12 = new te3.nv2     // Catch:{ Exception -> 0x05e8 }
            r12.<init>()     // Catch:{ Exception -> 0x05e8 }
            byte[] r13 = r1.mo139854h()     // Catch:{ Exception -> 0x05e8 }
            pe3.a r12 = r12.parseFrom(r13)     // Catch:{ Exception -> 0x05e8 }
            te3.nv2 r12 = (te3.C101821nv2) r12     // Catch:{ Exception -> 0x05e8 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r27 = r15
            java.lang.String r15 = "state "
            r13.append(r15)
            int r15 = r12.f298920n
            r13.append(r15)
            java.lang.String r15 = " pic isMuti: "
            r13.append(r15)
            r13.append(r9)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r13)
            int r13 = r12.f298920n
            r15 = 1
            if (r13 != r15) goto L_0x0517
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r14)
            r29 = r0
            r28 = r3
            goto L_0x0560
        L_0x0517:
            java.lang.String r13 = r1.mo139851e()
            java.lang.String r13 = vr2.C102236a0.m134733a0(r13)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r28 = r3
            java.lang.String r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            r29 = r0
            java.lang.String r0 = r1.mo139851e()
            java.lang.String r0 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r3, r0)
            r15.append(r0)
            r15.append(r13)
            java.lang.String r0 = r15.toString()
            long r30 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)
            r32 = 0
            int r3 = (r30 > r32 ? 1 : (r30 == r32 ? 0 : -1))
            if (r3 != 0) goto L_0x0562
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "path not exist  "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r14)
        L_0x0560:
            r5 = r7
            goto L_0x056b
        L_0x0562:
            int r0 = r12.f298920n
            if (r0 != 0) goto L_0x0577
            com.tencent.mm.plugin.sns.model.p2$g r5 = com.tencent.p014mm.plugin.sns.model.C94928p2.C94935g.STATE_OK
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r14)
        L_0x056b:
            r31 = r2
            r0 = r5
            r2 = r14
            r21 = r25
            r34 = r26
            r5 = r27
            goto L_0x05fe
        L_0x0577:
            com.tencent.mm.plugin.sns.model.b1 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()
            boolean r0 = r0.mo130949d(r5)
            if (r0 == 0) goto L_0x05d9
            os2.j0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.ay0()
            r0.r50(r5, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r0.append(r12)
            java.lang.String r1 = " "
            r0.append(r1)
            long r12 = java.lang.System.currentTimeMillis()
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            byte[] r0 = r0.getBytes()
            java.lang.String r15 = p823sg.C90193h.m112878f(r0)
            java.lang.String r0 = "uploadMedia"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r14)
            com.tencent.mm.sdk.platformtools.MMHandler r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.ly0()
            com.tencent.mm.plugin.sns.model.r2 r3 = new com.tencent.mm.plugin.sns.model.r2
            r13 = r26
            r12 = r3
            r34 = r13
            r21 = r25
            r13 = r2
            r31 = r2
            r2 = r14
            r14 = r5
            r5 = r27
            r16 = r9
            r17 = r6
            r12.<init>(r13, r14, r15, r16, r17)
            r1.post(r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x05e2
        L_0x05d9:
            r31 = r2
            r2 = r14
            r21 = r25
            r34 = r26
            r5 = r27
        L_0x05e2:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r2)
            r0 = r29
            goto L_0x05fe
        L_0x05e8:
            r29 = r0
            r31 = r2
            r28 = r3
            r2 = r14
            r5 = r15
            r21 = r25
            r34 = r26
            java.lang.String r0 = "parse uploadInfo error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r2)
        L_0x05fd:
            r0 = r7
        L_0x05fe:
            if (r0 != r7) goto L_0x060f
            int r0 = r8.f182140d
            r1 = r31
            r3 = r34
            r6 = 2
            r1.mo131200k(r4, r0, r6, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)
            goto L_0x0450
        L_0x060f:
            r6 = r29
            r1 = r31
            r3 = r34
            if (r0 != r6) goto L_0x0621
            java.lang.String r0 = "canPost: failed, retState = STATE_FALSE"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)
            goto L_0x0450
        L_0x0621:
            r14 = r2
            r12 = r3
            r15 = r5
            r0 = r6
            r13 = r21
            r5 = r24
            r3 = r28
            r6 = 1
            r2 = r1
            r1 = r35
            goto L_0x0476
        L_0x0631:
            r1 = r2
            r28 = r3
            r2 = r14
            r5 = r15
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)
        L_0x0639:
            r0 = 1
            goto L_0x0678
        L_0x063b:
            r0 = move-exception
            r1 = r2
            r28 = r3
            r2 = r14
            r5 = r15
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "error to parser postinfo in canPost "
            r3.append(r6)
            java.lang.String r6 = r4.getLocalid()
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "mediaPostInfo parser error "
            r3.append(r6)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r3 = 2
            r1.mo131201l(r4, r3, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)
            goto L_0x0450
        L_0x0678:
            if (r0 == 0) goto L_0x0c1e
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r4.getTimeLine()
            java.lang.String r2 = "postTimeLine"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.model.UploadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            com.tencent.mm.protocal.protobuf.TimeLineObject r5 = r4.getTimeLine()
            te3.kr2 r6 = r5.Location
            java.lang.String r7 = r5.ContentDesc
            java.lang.String r8 = r5.sourceUserName
            java.lang.String r9 = r5.sourceNickName
            te3.j00 r10 = r5.ContentObj
            java.lang.String r11 = r10.f298423d
            java.lang.String r12 = r10.f298425f
            java.lang.String r13 = r10.f298426g
            java.lang.String r14 = r10.f298429j
            te3.r5 r15 = r5.AppInfo
            r17 = r0
            te3.d05 r0 = r5.weappInfo
            r31 = r1
            te3.jo2 r1 = r5.liteappInfo
            r16 = r2
            te3.ms1 r2 = r5.gameShareCardObject
            r19 = r3
            int r3 = r10.f298424e
            int r10 = r10.f298428i
            r21 = r2
            com.tencent.mm.protocal.protobuf.TimeLineObject r2 = ad0.C91999u.m115563i()
            r24 = r1
            java.lang.String r1 = r4.getUserName()
            r2.UserName = r1
            int r1 = r4.getPravited()
            r2.Privated = r1
            r2.ContentDesc = r7
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            r2.sourceUserName = r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r9)
            r2.sourceNickName = r1
            int r1 = r5.contentDescShowType
            r2.contentDescShowType = r1
            int r1 = r5.contentDescScene
            r2.contentDescScene = r1
            int r1 = r5.contentattr
            r2.contentattr = r1
            java.lang.String r1 = r5.statisticsData
            r2.statisticsData = r1
            java.lang.String r1 = r5.canvasInfo
            r2.canvasInfo = r1
            te3.j00 r1 = r2.ContentObj
            r1.f298423d = r11
            r1.f298425f = r12
            r1.f298424e = r3
            r1.f298428i = r10
            r1.f298426g = r13
            r1.f298429j = r14
            te3.j00 r3 = r5.ContentObj
            te3.rk1 r7 = r3.f298431o
            r1.f298431o = r7
            te3.t23 r7 = r3.f298439w
            r1.f298439w = r7
            te3.tk1 r7 = r3.f298432p
            r1.f298432p = r7
            te3.tk1 r7 = r3.f298438v
            r1.f298438v = r7
            te3.nk1 r7 = r3.f298434r
            r1.f298434r = r7
            te3.fa r7 = r3.f298433q
            r1.f298433q = r7
            te3.p81 r7 = r3.f298435s
            r1.f298435s = r7
            te3.fw2 r7 = r3.f298436t
            r1.f298436t = r7
            te3.sk1 r7 = r3.f298440x
            r1.f298440x = r7
            te3.eg4 r7 = r3.f298441y
            r1.f298441y = r7
            te3.gm3 r7 = r3.f298422A
            r1.f298422A = r7
            te3.tk1 r7 = r3.f298442z
            r1.f298442z = r7
            r2.Location = r6
            te3.sc4 r1 = r5.streamvideo
            r2.streamvideo = r1
            java.lang.String r1 = r5.statExtStr
            r2.statExtStr = r1
            te3.e94 r1 = r5.videoTemplate
            r2.videoTemplate = r1
            boolean r1 = r5.isExcerpt
            r2.isExcerpt = r1
            java.lang.String r1 = r5.snsExcerptUrl
            r2.snsExcerptUrl = r1
            te3.k1 r1 = r5.actionInfo
            if (r1 == 0) goto L_0x0742
            r2.actionInfo = r1
        L_0x0742:
            if (r15 == 0) goto L_0x0746
            r2.AppInfo = r15
        L_0x0746:
            if (r0 == 0) goto L_0x074a
            r2.weappInfo = r0
        L_0x074a:
            if (r24 == 0) goto L_0x0750
            r0 = r24
            r2.liteappInfo = r0
        L_0x0750:
            if (r21 == 0) goto L_0x0756
            r0 = r21
            r2.gameShareCardObject = r0
        L_0x0756:
            java.util.LinkedList<te3.kv2> r0 = r3.f298427h
            java.util.Iterator r0 = r0.iterator()
        L_0x075c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0775
            java.lang.Object r1 = r0.next()
            te3.kv2 r1 = (te3.C101804kv2) r1
            int r3 = r1.f298702t
            r6 = 1
            if (r3 != r6) goto L_0x075c
            te3.j00 r3 = r2.ContentObj
            java.util.LinkedList<te3.kv2> r3 = r3.f298427h
            r3.add(r1)
            goto L_0x075c
        L_0x0775:
            te3.w25 r0 = r5.webSearchInfo
            if (r0 == 0) goto L_0x077b
            r2.webSearchInfo = r0
        L_0x077b:
            eb0.v0 r0 = eb0.C86493v0.m107224d()
            r1 = r28
            java.lang.String r3 = r1.f298727A
            r5 = 1
            eb0.v0$c r0 = r0.mo120947c(r3, r5)
            java.lang.String r3 = "_DATA_CENTER_ITEM_SHOW_TYPE"
            boolean r5 = r0.mo120954a(r3)
            if (r5 == 0) goto L_0x081b
            r5 = -1
            int r3 = r0.mo120958e(r3, r5)
            if (r3 == r5) goto L_0x081b
            te3.j00 r5 = r2.ContentObj
            te3.st2 r6 = new te3.st2
            r6.<init>()
            r5.f298430n = r6
            te3.j00 r5 = r2.ContentObj
            te3.st2 r5 = r5.f298430n
            r5.f299443d = r3
            java.lang.String r6 = "_DATA_CENTER_IS_PAY_SUBSCRIBE"
            r7 = 0
            int r6 = r0.mo120958e(r6, r7)
            r5.f299453q = r6
            r5 = 5
            if (r3 == r5) goto L_0x07b6
            r6 = 16
            if (r3 != r6) goto L_0x081c
        L_0x07b6:
            te3.j00 r3 = r2.ContentObj
            te3.st2 r3 = r3.f298430n
            java.lang.String r6 = "_DATA_CENTER_VID"
            java.lang.String r7 = ""
            java.lang.String r6 = r0.mo120959f(r6, r7)
            r3.f299450n = r6
            te3.j00 r3 = r2.ContentObj
            te3.st2 r3 = r3.f298430n
            java.lang.String r6 = "_DATA_CENTER_PUB_TIME"
            r8 = 0
            int r6 = r0.mo120958e(r6, r8)
            r3.f299448i = r6
            te3.j00 r3 = r2.ContentObj
            te3.st2 r3 = r3.f298430n
            java.lang.String r6 = "_DATA_CENTER__DULATION"
            int r6 = r0.mo120958e(r6, r8)
            r3.f299449j = r6
            te3.j00 r3 = r2.ContentObj
            te3.st2 r3 = r3.f298430n
            java.lang.String r6 = "_DATA_CENTER_DESC"
            java.lang.String r6 = r0.mo120959f(r6, r7)
            r3.f299445f = r6
            te3.j00 r3 = r2.ContentObj
            te3.st2 r3 = r3.f298430n
            java.lang.String r6 = "_DATA_CENTER_COVER_URL"
            java.lang.String r6 = r0.mo120959f(r6, r7)
            r3.f299452p = r6
            te3.j00 r3 = r2.ContentObj
            te3.st2 r3 = r3.f298430n
            java.lang.String r6 = "_DATA_CENTER_VIDEO_WIDTH"
            r7 = 0
            int r6 = r0.mo120958e(r6, r7)
            r3.f299446g = r6
            te3.j00 r3 = r2.ContentObj
            te3.st2 r3 = r3.f298430n
            java.lang.String r6 = "_DATA_CENTER_VIDEO_HEIGHT"
            int r6 = r0.mo120958e(r6, r7)
            r3.f299447h = r6
            te3.j00 r3 = r2.ContentObj
            te3.st2 r3 = r3.f298430n
            java.lang.String r6 = "_DATA_CENTER_FUNC_FLAG"
            int r0 = r0.mo120958e(r6, r7)
            r3.f299451o = r0
            goto L_0x081c
        L_0x081b:
            r5 = 5
        L_0x081c:
            r0 = r16
            r3 = r19
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            java.lang.String r0 = "MicroMsg.UploadManager"
            java.lang.String r3 = "startPost: canPost, postinfo LocalMediaId size=%d"
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.util.LinkedList<te3.ar2> r6 = r1.f298747h
            int r6 = r6.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8 = 0
            r7[r8] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r7)
            r0 = 0
        L_0x083c:
            java.util.LinkedList<te3.ar2> r3 = r1.f298747h
            int r3 = r3.size()
            if (r0 >= r3) goto L_0x0a6d
            java.util.LinkedList<te3.ar2> r3 = r1.f298747h
            java.lang.Object r3 = r3.get(r0)
            te3.ar2 r3 = (te3.C64241ar2) r3
            int r3 = r3.f182140d
            os2.j0 r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.ay0()
            long r7 = (long) r3
            os2.i0 r6 = r6.mo139867LL(r7)
            r7 = 3
            if (r6 != 0) goto L_0x087a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "can not get the media from db ,localMediaId: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r8 = r31
            r8.mo131201l(r4, r7, r0)
            java.lang.String r0 = "startPost"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.UploadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            goto L_0x0c6d
        L_0x087a:
            r8 = r31
            te3.nv2 r9 = new te3.nv2     // Catch:{ Exception -> 0x0a41 }
            r9.<init>()     // Catch:{ Exception -> 0x0a41 }
            byte[] r10 = r6.mo139854h()     // Catch:{ Exception -> 0x0a41 }
            pe3.a r9 = r9.parseFrom(r10)     // Catch:{ Exception -> 0x0a41 }
            te3.nv2 r9 = (te3.C101821nv2) r9     // Catch:{ Exception -> 0x0a41 }
            te3.fv2 r10 = r9.f298916g
            r11 = 4
            if (r10 == 0) goto L_0x0a0f
            java.util.LinkedList<te3.fv2> r10 = r9.f298918i
            int r10 = r10.size()
            if (r10 > 0) goto L_0x089a
            goto L_0x0a0f
        L_0x089a:
            te3.fv2 r10 = r9.f298916g
            java.lang.String r10 = r10.f183228d
            java.util.LinkedList<te3.fv2> r12 = r9.f298918i
            r13 = 0
            java.lang.Object r12 = r12.get(r13)
            te3.fv2 r12 = (te3.C64376fv2) r12
            java.lang.String r12 = r12.f183228d
            te3.fv2 r14 = r9.f298916g
            int r14 = r14.f183229e
            java.util.LinkedList<te3.fv2> r15 = r9.f298918i
            java.lang.Object r15 = r15.get(r13)
            te3.fv2 r15 = (te3.C64376fv2) r15
            int r13 = r15.f183229e
            java.lang.String r15 = r9.f298929w
            r7 = r17
            te3.j00 r5 = r7.ContentObj
            java.util.LinkedList<te3.kv2> r5 = r5.f298427h
            int r5 = r5.size()
            if (r0 >= r5) goto L_0x08d4
            te3.j00 r5 = r7.ContentObj
            java.util.LinkedList<te3.kv2> r5 = r5.f298427h
            java.lang.Object r5 = r5.get(r0)
            te3.kv2 r5 = (te3.C101804kv2) r5
            te3.mv2 r5 = r5.f298698p
            r32 = r5
            goto L_0x08d6
        L_0x08d4:
            r32 = 0
        L_0x08d6:
            te3.j00 r5 = r7.ContentObj
            r33 = r1
            int r1 = r5.f298424e
            if (r1 == r11) goto L_0x090b
            r11 = 42
            if (r1 == r11) goto L_0x090b
            r11 = 5
            if (r1 != r11) goto L_0x08e6
            goto L_0x090b
        L_0x08e6:
            java.lang.String r1 = "getStrId"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.storage.SnsMedia"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r5)
            java.lang.String r11 = r6.f294132l
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r5)
            int r25 = r6.mo139853g()
            int r1 = r9.f298915f
            java.lang.String r31 = ""
            r24 = r11
            r26 = r10
            r27 = r12
            r28 = r14
            r29 = r13
            r30 = r1
            te3.kv2 r1 = ad0.C91999u.m115561g(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x0923
        L_0x090b:
            java.util.LinkedList<te3.kv2> r1 = r5.f298427h
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x0922
            te3.j00 r1 = r7.ContentObj
            java.util.LinkedList<te3.kv2> r1 = r1.f298427h
            java.lang.Object r1 = r1.get(r0)
            te3.kv2 r1 = (te3.C101804kv2) r1
            r1.f298694i = r12
            r1.f298695j = r13
            goto L_0x0923
        L_0x0922:
            r1 = 0
        L_0x0923:
            if (r1 == 0) goto L_0x092e
            te3.j00 r5 = r2.ContentObj
            int r5 = r5.f298424e
            r6 = 1
            if (r5 != r6) goto L_0x092e
            r1.f298705w = r15
        L_0x092e:
            if (r1 == 0) goto L_0x0939
            te3.j00 r5 = r2.ContentObj
            int r5 = r5.f298424e
            r6 = 7
            if (r5 != r6) goto L_0x0939
            r1.f298705w = r15
        L_0x0939:
            if (r1 == 0) goto L_0x094c
            te3.j00 r5 = r2.ContentObj
            int r5 = r5.f298424e
            r6 = 15
            if (r5 != r6) goto L_0x094e
            java.lang.String r5 = r9.f298929w
            r1.f298705w = r5
            java.lang.String r5 = r9.f298910A
            r1.f298680M = r5
            goto L_0x094e
        L_0x094c:
            r6 = 15
        L_0x094e:
            if (r1 == 0) goto L_0x09a8
            java.util.LinkedList r5 = new java.util.LinkedList
            com.tencent.mm.plugin.sns.model.r1 r9 = com.tencent.p014mm.plugin.sns.model.C94942r1.f275179a
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.String r10 = "getEmotionSafeStrategyInfoListOnPost"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r11)
            java.lang.String r12 = "key"
            gy3.C87412m.m108594g(r9, r12)
            java.util.Map<java.lang.String, java.util.List<te3.b84>> r12 = com.tencent.p014mm.plugin.sns.model.C94942r1.f275181c
            r13 = r12
            java.util.LinkedHashMap r13 = (java.util.LinkedHashMap) r13
            java.lang.Object r14 = r13.get(r9)
            if (r14 != 0) goto L_0x0978
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r12.put(r9, r14)
        L_0x0978:
            java.lang.Object r9 = r13.get(r9)
            gy3.C87412m.m108591d(r9)
            java.util.List r9 = (java.util.List) r9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            r5.<init>(r9)
            r1.f298688V = r5
            java.lang.String r5 = "MicroMsg.UploadManager"
            java.lang.String r9 = "startPost: media id:%s, emotionSafeInfoList size:%d"
            r10 = 2
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r10 = 0
            r11[r10] = r3
            java.util.LinkedList<te3.b84> r3 = r1.f298688V
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r10 = 1
            r11[r10] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r9, r11)
        L_0x09a8:
            te3.j00 r3 = r7.ContentObj
            java.util.LinkedList<te3.kv2> r3 = r3.f298427h
            int r3 = r3.size()
            if (r0 >= r3) goto L_0x09d0
            te3.j00 r3 = r7.ContentObj
            java.util.LinkedList<te3.kv2> r3 = r3.f298427h
            java.lang.Object r3 = r3.get(r0)
            te3.kv2 r3 = (te3.C101804kv2) r3
            java.lang.String r5 = r3.f298697o
            r1.f298697o = r5
            java.lang.String r5 = r3.f298691f
            r1.f298691f = r5
            int r5 = r3.f298704v
            r1.f298704v = r5
            java.lang.String r5 = r3.f298703u
            r1.f298703u = r5
            float r3 = r3.f298684R
            r1.f298684R = r3
        L_0x09d0:
            if (r1 != 0) goto L_0x09e3
            java.lang.String r0 = "make media error"
            r3 = 3
            r8.mo131201l(r4, r3, r0)
            java.lang.String r0 = "startPost"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.UploadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            goto L_0x0c6d
        L_0x09e3:
            r3 = 3
            java.lang.String r5 = "MicroMsg.UploadManager"
            java.lang.String r9 = "startPost: add media Id=%s, Url=%s, Thumb=%s"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r10 = r1.f298689d
            r11 = 0
            r3[r11] = r10
            java.lang.String r10 = r1.f298692g
            r11 = 1
            r3[r11] = r10
            java.lang.String r10 = r1.f298694i
            r11 = 2
            r3[r11] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r9, r3)
            te3.j00 r3 = r2.ContentObj
            java.util.LinkedList<te3.kv2> r3 = r3.f298427h
            r3.add(r1)
            int r0 = r0 + 1
            r17 = r7
            r31 = r8
            r1 = r33
            r5 = 5
            goto L_0x083c
        L_0x0a0f:
            r33 = r1
            r7 = r17
            java.lang.String r0 = "MicroMsg.UploadManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "item with not url"
            r1.append(r3)
            int r3 = r4.field_type
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            int r0 = r4.field_type
            r1 = 3
            if (r0 != r1) goto L_0x0a32
            goto L_0x0a73
        L_0x0a32:
            java.lang.String r0 = "buf url is null"
            r8.mo131201l(r4, r11, r0)
            java.lang.String r0 = "startPost"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.UploadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            goto L_0x0c6d
        L_0x0a41:
            r0 = move-exception
            java.lang.String r1 = "MicroMsg.UploadManager"
            java.lang.String r2 = "MediaUploadInfo parseFrom MediaUploadInfo Exception"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "mediaUploadInfo parser error "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 2
            r8.mo131201l(r4, r1, r0)
            java.lang.String r0 = "startPost"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.UploadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            goto L_0x0c6d
        L_0x0a6d:
            r33 = r1
            r7 = r17
            r8 = r31
        L_0x0a73:
            com.tencent.mm.plugin.sns.model.b1 r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()
            int r0 = r4.localid
            monitor-enter(r1)
            java.lang.String r3 = "addPostId"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)     // Catch:{ all -> 0x0c1b }
            java.util.List<java.lang.Integer> r3 = r1.f274777d     // Catch:{ all -> 0x0c1b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0c1b }
            java.util.Vector r3 = (java.util.Vector) r3     // Catch:{ all -> 0x0c1b }
            boolean r3 = r3.contains(r5)     // Catch:{ all -> 0x0c1b }
            if (r3 == 0) goto L_0x0a99
            java.lang.String r0 = "addPostId"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)     // Catch:{ all -> 0x0c1b }
            monitor-exit(r1)
            r0 = 0
            goto L_0x0aad
        L_0x0a99:
            java.util.List<java.lang.Integer> r3 = r1.f274777d     // Catch:{ all -> 0x0c1b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0c1b }
            java.util.Vector r3 = (java.util.Vector) r3     // Catch:{ all -> 0x0c1b }
            r3.add(r0)     // Catch:{ all -> 0x0c1b }
            java.lang.String r0 = "addPostId"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)     // Catch:{ all -> 0x0c1b }
            monitor-exit(r1)
            r0 = 1
        L_0x0aad:
            if (r0 != 0) goto L_0x0acd
            java.lang.String r0 = "MicroMsg.UploadManager"
            java.lang.String r1 = "this snsinfo is posting, localId=%d"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = r4.localid
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)
            java.lang.String r0 = "startPost"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.UploadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            goto L_0x0c6d
        L_0x0acd:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1 = r33
            java.util.LinkedList<te3.f94> r3 = r1.f298748i
            java.util.Iterator r3 = r3.iterator()
        L_0x0ada:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0aec
            java.lang.Object r5 = r3.next()
            te3.f94 r5 = (te3.f94) r5
            java.lang.String r5 = r5.f298255d
            r0.add(r5)
            goto L_0x0ada
        L_0x0aec:
            java.lang.String r13 = ms2.C99969q.m130612c(r2)
            java.lang.String r3 = "MicroMsg.UploadManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "timeLine contentDescScene ：  "
            r5.append(r6)
            int r6 = r2.contentDescScene
            r5.append(r6)
            java.lang.String r6 = " contentDescShowType: "
            r5.append(r6)
            int r6 = r2.contentDescShowType
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
            int r3 = r4.field_pravited
            r5 = 1
            if (r3 != r5) goto L_0x0b34
            java.lang.String r3 = "MicroMsg.UploadManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "content private xml is null ? "
            r5.append(r6)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
            r6 = 0
            goto L_0x0b42
        L_0x0b34:
            java.lang.String r3 = "MicroMsg.UploadManager"
            java.lang.String r5 = "upload xmlsns: %s"
            r6 = 1
            java.lang.Object[] r9 = new java.lang.Object[r6]
            r6 = 0
            r9[r6] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r9)
        L_0x0b42:
            com.tencent.mm.plugin.sns.model.r1 r3 = com.tencent.p014mm.plugin.sns.model.C94942r1.f275179a
            java.lang.String r3 = "resetData"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
            java.lang.String r9 = "MicroMsg.SnsPostSafeStrategyDataHelper"
            java.lang.String r10 = "resetData: "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            java.util.Map<java.lang.String, java.util.List<com.tencent.mm.api.EmotionStrategyInfo>> r9 = com.tencent.p014mm.plugin.sns.model.C94942r1.f275180b
            java.util.LinkedHashMap r9 = (java.util.LinkedHashMap) r9
            r9.clear()
            java.util.Map<java.lang.String, java.util.List<te3.b84>> r9 = com.tencent.p014mm.plugin.sns.model.C94942r1.f275181c
            java.util.LinkedHashMap r9 = (java.util.LinkedHashMap) r9
            r9.clear()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            if (r13 == 0) goto L_0x0bff
            java.lang.String r3 = ""
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x0b71
            goto L_0x0bff
        L_0x0b71:
            int r3 = r1.f298758v
            r5 = 1
            if (r3 != r5) goto L_0x0b79
            r24 = 1
            goto L_0x0b7b
        L_0x0b79:
            r24 = 0
        L_0x0b7b:
            int r3 = r4.localid
            java.util.LinkedList<te3.rv3> r6 = r1.f298759w
            te3.kr2 r9 = r2.Location
            pe3.b r9 = r9.f298659s
            te3.j00 r2 = r2.ContentObj
            java.lang.String r2 = r2.f298425f
            java.lang.String r10 = "snsPost"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.model.UploadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r11)
            java.lang.String r12 = "MicroMsg.UploadManager"
            java.lang.String r14 = "snsPost: ready do scene"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r14)
            boolean r14 = com.tencent.p014mm.plugin.sns.model.C94866e1.qy0()
            if (r14 == 0) goto L_0x0ba8
            java.lang.String r0 = "is invalid to getSnsInfoStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            goto L_0x0c1e
        L_0x0ba8:
            te3.k83 r12 = r1.f298735I
            if (r12 == 0) goto L_0x0bb5
            int r5 = r12.f183896d
            java.lang.String r12 = r12.f183897e
            r29 = r5
            r30 = r12
            goto L_0x0bbb
        L_0x0bb5:
            java.lang.String r12 = ""
            r30 = r12
            r29 = 1
        L_0x0bbb:
            com.tencent.mm.plugin.sns.model.NetSceneSnsPost r5 = new com.tencent.mm.plugin.sns.model.NetSceneSnsPost
            r12 = r5
            int r14 = r1.f298745f
            int r15 = r1.f298744e
            r31 = r4
            java.lang.String r4 = r1.f298746g
            r19 = r4
            int r4 = r1.f298752p
            r20 = r4
            java.util.LinkedList<java.lang.Long> r4 = r1.f298753q
            r21 = r4
            int r4 = r1.f298754r
            r22 = r4
            te3.c84 r4 = r1.f298760x
            r26 = r4
            r16 = r0
            r17 = r7
            r18 = r3
            r23 = r1
            r25 = r6
            r27 = r9
            r28 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r8.f275126b = r5
            f40.C86709a0.m107528h()
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            com.tencent.mm.plugin.sns.model.NetSceneSnsPost r1 = r8.f275126b
            r0.mo123460f(r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            r4 = r31
            goto L_0x0c1e
        L_0x0bff:
            r31 = r4
            java.lang.String r0 = "content is error"
            r4 = r31
            r1 = 5
            r8.mo131201l(r4, r1, r0)
            com.tencent.mm.plugin.sns.model.b1 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()
            int r1 = r4.localid
            r0.mo130964w(r1)
            java.lang.String r0 = "startPost"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.UploadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            goto L_0x0c6d
        L_0x0c1b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0c1e:
            java.lang.String r0 = "MicroMsg.UploadManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "startPost, canPost is false, snsInfoId: "
            r1.append(r2)
            java.lang.String r2 = r4.getLocalid()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.lang.String r0 = "startPost"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.UploadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            goto L_0x0c6d
        L_0x0c42:
            r0 = move-exception
            r8 = r2
            java.lang.String r1 = "MicroMsg.UploadManager"
            java.lang.String r2 = "startPost parseFrom MediaPostInfo Exception"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "MediaPostInfo parser error:"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 2
            r8.mo131201l(r4, r1, r0)
            java.lang.String r0 = "startPost"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.UploadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
        L_0x0c6d:
            java.lang.String r0 = "access$200"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.UploadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            java.lang.String r0 = "run"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.UploadManager$3"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x0c7d:
            r1 = r35
            goto L_0x00b7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94939q2.run():void");
    }
}
