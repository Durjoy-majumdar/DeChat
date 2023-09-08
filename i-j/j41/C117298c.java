package j41;

/* renamed from: j41.c */
public class C117298c {

    /* renamed from: d */
    public static volatile C117298c f351165d;

    /* renamed from: a */
    public int f351166a = 7118;

    /* renamed from: b */
    public C117297b f351167b;

    /* renamed from: c */
    public Boolean f351168c = null;

    /* renamed from: a */
    public static C117298c m165377a() {
        if (f351165d == null) {
            synchronized (C117298c.class) {
                if (f351165d == null) {
                    f351165d = new C117298c();
                }
            }
        }
        return f351165d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:142:0x033f, code lost:
        if (r2 != null) goto L_0x035f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x035d, code lost:
        if (r2 == null) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x035f, code lost:
        r2.endTransaction(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x016c, code lost:
        if (r15 != null) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ef, code lost:
        if (r5 != null) goto L_0x0212;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0210, code lost:
        if (r5 != null) goto L_0x0212;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0212, code lost:
        r5.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo181967b(long r30, java.lang.String r32, java.lang.Object r33, java.util.Map<java.lang.String, java.lang.Object> r34) {
        /*
            r29 = this;
            r1 = r29
            r2 = r30
            r4 = r32
            r5 = r33
            r0 = r34
            java.lang.String r6 = ";"
            java.lang.String r7 = ","
            boolean r8 = u24.C90599h.m113511d(r32)
            if (r8 != 0) goto L_0x0411
            j41.b r8 = r1.f351167b
            if (r8 == 0) goto L_0x0411
            java.lang.Boolean r8 = r1.f351168c
            java.lang.String r9 = "Amoeba.NewUserBehaviourReporter"
            r10 = 1
            if (r8 != 0) goto L_0x0049
            java.lang.Class<h81.h> r8 = h81.C32735h.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            h81.h r8 = (h81.C32735h) r8
            h81.h$c r11 = h81.C32735h.C32737c.clicfg_data_report_open_new_uba_switch
            boolean r8 = r8.mo58784wf(r11, r10)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r1.f351168c = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "[isOpenNewUBA] mOpenNewUBASwitch : "
            r8.append(r11)
            java.lang.Boolean r11 = r1.f351168c
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
        L_0x0049:
            java.lang.Boolean r8 = r1.f351168c
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x0053
            goto L_0x0411
        L_0x0053:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            int r11 = m41.C117534a.m165781d()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r12 = "mode_flag"
            r8.put(r12, r11)
            k31.a r11 = k31.C117373a.xx0()
            r11.vx0(r4, r8)
            if (r0 == 0) goto L_0x0077
            int r11 = r34.size()
            if (r11 <= 0) goto L_0x0077
            r8.putAll(r0)
        L_0x0077:
            r31.a r0 = r31.C118219b.m166774a(r32, r33)
            if (r0 == 0) goto L_0x009c
            java.lang.String r11 = r0.f353362a
            boolean r12 = u24.C90599h.m113511d(r11)
            if (r12 != 0) goto L_0x008b
            java.lang.String r12 = "page_id"
            r8.put(r12, r11)
        L_0x008b:
            java.util.Map<java.lang.String, java.lang.Object> r11 = r0.f353363b
            if (r11 == 0) goto L_0x009c
            java.util.HashMap r11 = (java.util.HashMap) r11
            int r11 = r11.size()
            if (r11 <= 0) goto L_0x009c
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.f353363b
            r8.putAll(r0)
        L_0x009c:
            java.lang.String r11 = ""
            java.lang.Object r0 = m41.C34464d.m40358a(r8)     // Catch:{ Exception -> 0x00b0 }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00b0 }
            if (r0 == 0) goto L_0x00c9
            java.lang.String r0 = r0.replace(r7, r6)     // Catch:{ Exception -> 0x00b0 }
            r11 = r0
            goto L_0x00c9
        L_0x00b0:
            r0 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r12 = "[reportData] throw Exception e : "
            r8.append(r12)
            java.lang.String r0 = r0.getMessage()
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
        L_0x00c9:
            java.lang.String r8 = "app_out"
            boolean r0 = u24.C90599h.m113509b(r4, r8)
            java.lang.String r9 = "biz_out"
            java.lang.String r12 = "session_out"
            if (r0 != 0) goto L_0x00e2
            boolean r0 = u24.C90599h.m113509b(r4, r9)
            if (r0 != 0) goto L_0x00e2
            boolean r0 = u24.C90599h.m113509b(r4, r12)
            if (r0 == 0) goto L_0x0377
        L_0x00e2:
            boolean r0 = u24.C90599h.m113511d(r32)
            if (r0 != 0) goto L_0x0377
            boolean r0 = u24.C90599h.m113511d(r11)
            if (r0 == 0) goto L_0x00f0
            goto L_0x0377
        L_0x00f0:
            boolean r0 = u24.C90599h.m113509b(r4, r12)
            if (r0 == 0) goto L_0x0105
            if (r5 == 0) goto L_0x0105
            boolean r0 = r5 instanceof a41.C112756b
            if (r0 == 0) goto L_0x0105
            r0 = r5
            a41.b r0 = (a41.C112756b) r0
            int r0 = r0.f337641i
            if (r0 <= r10) goto L_0x0105
            goto L_0x0377
        L_0x0105:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r7)
            r5.append(r2)
            r5.append(r7)
            r5.append(r11)
            j41.b r0 = r1.f351167b
            j41.a r10 = new j41.a
            java.lang.String r13 = r5.toString()
            r10.<init>(r2, r13)
            j41.b$$b r0 = r0.f351162b
            java.lang.String r13 = "NewUserBehaviourCacheDao"
            if (r0 != 0) goto L_0x012f
            r14 = r8
            r16 = r9
            r2 = 0
            goto L_0x0193
        L_0x012f:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r15 = r0.f351163d
            boolean r14 = r15 instanceof zh3.C91753f
            if (r14 == 0) goto L_0x0143
            zh3.f r15 = (zh3.C91753f) r15
            long r16 = r15.mo125613a()
            r14 = r8
            r27 = r16
            r16 = r9
            r8 = r27
            goto L_0x0149
        L_0x0143:
            r14 = r8
            r16 = r9
            r8 = -1
            r15 = 0
        L_0x0149:
            long r2 = r10.f90728p     // Catch:{ Exception -> 0x0174 }
            r10.field_cacheTime = r2     // Catch:{ Exception -> 0x0174 }
            java.lang.String r2 = r10.f90729q     // Catch:{ Exception -> 0x0174 }
            r10.field_reportStr = r2     // Catch:{ Exception -> 0x0174 }
            r2 = 0
            boolean r0 = r0.insertNotify(r10, r2)     // Catch:{ Exception -> 0x016f }
            if (r0 != 0) goto L_0x016c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x016f }
            r0.<init>()     // Catch:{ Exception -> 0x016f }
            java.lang.String r3 = "[save] fail, cache : "
            r0.append(r3)     // Catch:{ Exception -> 0x016f }
            r0.append(r10)     // Catch:{ Exception -> 0x016f }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x016f }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)     // Catch:{ Exception -> 0x016f }
        L_0x016c:
            if (r15 == 0) goto L_0x0193
            goto L_0x0190
        L_0x016f:
            r0 = move-exception
            goto L_0x0176
        L_0x0171:
            r0 = move-exception
            goto L_0x0371
        L_0x0174:
            r0 = move-exception
            r2 = 0
        L_0x0176:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0171 }
            r3.<init>()     // Catch:{ all -> 0x0171 }
            java.lang.String r10 = "[save] throw Exception : "
            r3.append(r10)     // Catch:{ all -> 0x0171 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0171 }
            r3.append(r0)     // Catch:{ all -> 0x0171 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0171 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)     // Catch:{ all -> 0x0171 }
            if (r15 == 0) goto L_0x0193
        L_0x0190:
            r15.endTransaction(r8)
        L_0x0193:
            java.lang.Class<h81.f> r0 = h81.C87460f.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.f r0 = (h81.C87460f) r0
            java.lang.String r3 = r5.toString()
            r0.mo121918Nq(r3)
            j41.b r0 = r1.f351167b
            j41.b$$b r0 = r0.f351162b
            if (r0 != 0) goto L_0x01aa
            r3 = 0
            goto L_0x0215
        L_0x01aa:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r5 = r0.f351163d     // Catch:{ Exception -> 0x01f6, all -> 0x01f2 }
            java.lang.String r0 = r0.f351164e     // Catch:{ Exception -> 0x01f6, all -> 0x01f2 }
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r8 = j41.C33509a.f90727r     // Catch:{ Exception -> 0x01f6, all -> 0x01f2 }
            java.lang.String[] r8 = r8.columns     // Catch:{ Exception -> 0x01f6, all -> 0x01f2 }
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r17 = r5
            r18 = r0
            r19 = r8
            android.database.Cursor r5 = r17.query(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x01f6, all -> 0x01f2 }
            if (r5 == 0) goto L_0x01ef
            boolean r0 = r5.moveToFirst()     // Catch:{ Exception -> 0x01ed }
            if (r0 == 0) goto L_0x01ef
        L_0x01d3:
            j41.a r0 = new j41.a     // Catch:{ Exception -> 0x01ed }
            r0.<init>()     // Catch:{ Exception -> 0x01ed }
            r0.convertFrom(r5)     // Catch:{ Exception -> 0x01ed }
            long r8 = r0.field_cacheTime     // Catch:{ Exception -> 0x01ed }
            r0.f90728p = r8     // Catch:{ Exception -> 0x01ed }
            java.lang.String r8 = r0.field_reportStr     // Catch:{ Exception -> 0x01ed }
            r0.f90729q = r8     // Catch:{ Exception -> 0x01ed }
            r3.add(r0)     // Catch:{ Exception -> 0x01ed }
            boolean r0 = r5.moveToNext()     // Catch:{ Exception -> 0x01ed }
            if (r0 != 0) goto L_0x01d3
            goto L_0x01ef
        L_0x01ed:
            r0 = move-exception
            goto L_0x01f8
        L_0x01ef:
            if (r5 == 0) goto L_0x0215
            goto L_0x0212
        L_0x01f2:
            r0 = move-exception
            r15 = 0
            goto L_0x036b
        L_0x01f6:
            r0 = move-exception
            r5 = 0
        L_0x01f8:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0369 }
            r8.<init>()     // Catch:{ all -> 0x0369 }
            java.lang.String r9 = "[query] throw Exception : "
            r8.append(r9)     // Catch:{ all -> 0x0369 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0369 }
            r8.append(r0)     // Catch:{ all -> 0x0369 }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x0369 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)     // Catch:{ all -> 0x0369 }
            if (r5 == 0) goto L_0x0215
        L_0x0212:
            r5.close()
        L_0x0215:
            if (r3 == 0) goto L_0x021e
            int r0 = r3.size()
            r5 = r3
            long r2 = (long) r0
            goto L_0x0221
        L_0x021e:
            r5 = r3
            r2 = 0
        L_0x0221:
            long r8 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "mmkv_key_data_report_new_uba_config"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
            java.lang.String r10 = "mmkv_key_data_report_new_uba_last_report_time"
            r19 = r14
            r14 = 0
            if (r0 == 0) goto L_0x0237
            long r14 = r0.getLong(r10, r14)
        L_0x0237:
            long r14 = r8 - r14
            r17 = 300000(0x493e0, double:1.482197E-318)
            int r20 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r20 >= 0) goto L_0x0253
            r14 = 100
            int r17 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r17 >= 0) goto L_0x0253
            boolean r2 = m41.C117534a.m165786i()
            if (r2 == 0) goto L_0x024d
            goto L_0x0253
        L_0x024d:
            r20 = r11
            r18 = r12
            goto L_0x037d
        L_0x0253:
            if (r5 == 0) goto L_0x0301
            int r2 = r5.size()
            if (r2 > 0) goto L_0x025d
            goto L_0x0301
        L_0x025d:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x026b:
            r14 = 0
        L_0x026c:
            boolean r15 = r5.hasNext()
            if (r15 == 0) goto L_0x02ca
            java.lang.Object r15 = r5.next()
            j41.a r15 = (j41.C33509a) r15
            r17 = r5
            if (r15 == 0) goto L_0x02bd
            java.lang.String r5 = r15.f90729q
            boolean r5 = u24.C90599h.m113511d(r5)
            if (r5 == 0) goto L_0x0285
            goto L_0x02bd
        L_0x0285:
            java.lang.String r5 = r15.f90729q
            java.lang.String r15 = "#"
            r18 = r12
            java.lang.String r12 = "/"
            java.lang.String r5 = r5.replace(r15, r12)
            java.nio.charset.Charset r12 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r12 = r5.getBytes(r12)
            int r4 = r12.length
            int r4 = r4 + r14
            r20 = r11
            int r11 = r1.f351166a
            if (r4 > r11) goto L_0x02a8
            r3.append(r5)
            r3.append(r15)
            int r4 = r12.length
            int r14 = r14 + r4
            goto L_0x02c1
        L_0x02a8:
            java.lang.String r3 = r3.toString()
            r2.add(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = r32
            r5 = r17
            r12 = r18
            r11 = r20
            goto L_0x026b
        L_0x02bd:
            r20 = r11
            r18 = r12
        L_0x02c1:
            r4 = r32
            r5 = r17
            r12 = r18
            r11 = r20
            goto L_0x026c
        L_0x02ca:
            r20 = r11
            r18 = r12
            java.lang.String r4 = r3.toString()
            boolean r4 = u24.C90599h.m113511d(r4)
            if (r4 != 0) goto L_0x02df
            java.lang.String r3 = r3.toString()
            r2.add(r3)
        L_0x02df:
            java.util.Iterator r2 = r2.iterator()
        L_0x02e3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0305
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.tencent.mm.plugin.report.service.n r21 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r22 = 26251(0x668b, float:3.6785E-41)
            java.lang.String r23 = r3.replace(r7, r6)
            r24 = 0
            r25 = 0
            r26 = 1
            r21.mo160134j(r22, r23, r24, r25, r26)
            goto L_0x02e3
        L_0x0301:
            r20 = r11
            r18 = r12
        L_0x0305:
            if (r0 == 0) goto L_0x030a
            r0.putLong(r10, r8)
        L_0x030a:
            j41.b r0 = r1.f351167b
            j41.b$$b r0 = r0.f351162b
            if (r0 != 0) goto L_0x0312
            goto L_0x037d
        L_0x0312:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r0.f351163d
            boolean r3 = r2 instanceof zh3.C91753f
            if (r3 == 0) goto L_0x031f
            zh3.f r2 = (zh3.C91753f) r2
            long r14 = r2.mo125613a()
            goto L_0x0322
        L_0x031f:
            r2 = 0
            r14 = -1
        L_0x0322:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r0.f351163d     // Catch:{ Exception -> 0x0344 }
            java.lang.String r0 = r0.f351164e     // Catch:{ Exception -> 0x0344 }
            r4 = 0
            int r0 = r3.delete(r0, r4, r4)     // Catch:{ Exception -> 0x0344 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0344 }
            r3.<init>()     // Catch:{ Exception -> 0x0344 }
            java.lang.String r4 = "[clear] ret : "
            r3.append(r4)     // Catch:{ Exception -> 0x0344 }
            r3.append(r0)     // Catch:{ Exception -> 0x0344 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0344 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)     // Catch:{ Exception -> 0x0344 }
            if (r2 == 0) goto L_0x037d
            goto L_0x035f
        L_0x0342:
            r0 = move-exception
            goto L_0x0363
        L_0x0344:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0342 }
            r3.<init>()     // Catch:{ all -> 0x0342 }
            java.lang.String r4 = "[clear] throw Exception : "
            r3.append(r4)     // Catch:{ all -> 0x0342 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0342 }
            r3.append(r0)     // Catch:{ all -> 0x0342 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0342 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)     // Catch:{ all -> 0x0342 }
            if (r2 == 0) goto L_0x037d
        L_0x035f:
            r2.endTransaction(r14)
            goto L_0x037d
        L_0x0363:
            if (r2 == 0) goto L_0x0368
            r2.endTransaction(r14)
        L_0x0368:
            throw r0
        L_0x0369:
            r0 = move-exception
            r15 = r5
        L_0x036b:
            if (r15 == 0) goto L_0x0370
            r15.close()
        L_0x0370:
            throw r0
        L_0x0371:
            if (r15 == 0) goto L_0x0376
            r15.endTransaction(r8)
        L_0x0376:
            throw r0
        L_0x0377:
            r19 = r8
            r16 = r9
            goto L_0x024d
        L_0x037d:
            boolean r0 = u24.C90599h.m113511d(r32)
            if (r0 != 0) goto L_0x0411
            boolean r0 = u24.C90599h.m113511d(r20)
            if (r0 == 0) goto L_0x038b
            goto L_0x0411
        L_0x038b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = r32
            r0.append(r2)
            r0.append(r7)
            r3 = r30
            r0.append(r3)
            r0.append(r7)
            r11 = r20
            r0.append(r11)
            java.lang.String r3 = "app_in"
            boolean r3 = u24.C90599h.m113509b(r2, r3)
            if (r3 != 0) goto L_0x0403
            r3 = r19
            boolean r3 = u24.C90599h.m113509b(r2, r3)
            if (r3 != 0) goto L_0x0403
            java.lang.String r3 = "biz_in"
            boolean r3 = u24.C90599h.m113509b(r2, r3)
            if (r3 != 0) goto L_0x0403
            r3 = r16
            boolean r3 = u24.C90599h.m113509b(r2, r3)
            if (r3 != 0) goto L_0x0403
            java.lang.String r3 = "session_in"
            boolean r3 = u24.C90599h.m113509b(r2, r3)
            if (r3 != 0) goto L_0x0403
            r3 = r18
            boolean r3 = u24.C90599h.m113509b(r2, r3)
            if (r3 != 0) goto L_0x0403
            java.lang.String r3 = "page_in"
            boolean r3 = u24.C90599h.m113509b(r2, r3)
            if (r3 != 0) goto L_0x0403
            java.lang.String r3 = "page_out"
            boolean r3 = u24.C90599h.m113509b(r2, r3)
            if (r3 != 0) goto L_0x0403
            java.lang.String r3 = "view_clk"
            boolean r3 = u24.C90599h.m113509b(r2, r3)
            if (r3 != 0) goto L_0x0403
            java.lang.String r3 = "view_exp"
            boolean r3 = u24.C90599h.m113509b(r2, r3)
            if (r3 != 0) goto L_0x0403
            java.lang.String r3 = "view_unexp"
            boolean r2 = u24.C90599h.m113509b(r2, r3)
            if (r2 == 0) goto L_0x0411
        L_0x0403:
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 28356(0x6ec4, float:3.9735E-41)
            java.lang.String r5 = r0.toString()
            r6 = 0
            r7 = 0
            r8 = 1
            r3.mo160134j(r4, r5, r6, r7, r8)
        L_0x0411:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j41.C117298c.mo181967b(long, java.lang.String, java.lang.Object, java.util.Map):void");
    }
}
