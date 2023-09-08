package l30;

/* renamed from: l30.d */
public class C88375d extends C88372a {

    /* renamed from: b */
    public static C88375d f255368b = new C88375d();

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v4, types: [boolean] */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r4v1, types: [boolean, int] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x02a7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo59472a() {
        /*
            r25 = this;
            oa1.d r0 = oa1.C117731d.m166007c()
            java.lang.String r1 = "clicfg_plugin_kara_label_collect_open"
            java.lang.String r2 = "1"
            r3 = 0
            r4 = 1
            java.lang.String r0 = r0.mo182444f(r1, r2, r3, r4)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)
            if (r0 != 0) goto L_0x0016
            r0 = 0
            goto L_0x0017
        L_0x0016:
            r0 = 1
        L_0x0017:
            java.lang.String r1 = "Kara.TrainDataCollector"
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "no working"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return r3
        L_0x0021:
            java.lang.String r0 = "run"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            m30.c r0 = m30.C88691b.f256042a
            if (r0 != 0) goto L_0x002e
            m30.C88691b.m110635a()
        L_0x002e:
            m30.c r0 = m30.C88691b.f256042a
            long r5 = java.lang.System.currentTimeMillis()
            r7 = 86400000(0x5265c00, double:4.2687272E-316)
            long r5 = r5 - r7
            oa1.d r7 = oa1.C117731d.m166007c()
            java.lang.String r8 = "clicfg_plugin_kara_is_save_data_local"
            java.lang.String r2 = r7.mo182444f(r8, r2, r3, r4)
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)
            if (r2 != 0) goto L_0x004a
            r2 = 0
            goto L_0x004b
        L_0x004a:
            r2 = 1
        L_0x004b:
            r0.getClass()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r8 = r0.f256045d
            java.lang.String[] r9 = new java.lang.String[r4]
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r9[r3] = r5
            java.lang.String r5 = "select * from KeyNodeInfo where is_train_data_upload_finished=false and happen_time<=?"
            android.database.Cursor r5 = r8.rawQuery(r5, r9)
        L_0x0064:
            boolean r6 = r5.moveToNext()     // Catch:{ all -> 0x0318 }
            if (r6 == 0) goto L_0x0076
            xh.n5 r6 = new xh.n5     // Catch:{ all -> 0x0318 }
            r6.<init>()     // Catch:{ all -> 0x0318 }
            r6.convertFrom(r5)     // Catch:{ all -> 0x0318 }
            r7.add(r6)     // Catch:{ all -> 0x0318 }
            goto L_0x0064
        L_0x0076:
            r5.close()
            java.util.Iterator r5 = r7.iterator()
        L_0x007d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0316
            java.lang.Object r6 = r5.next()
            xh.n5 r6 = (p749xh.C91209n5) r6
            com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner r7 = com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE
            boolean r7 = r7.isBackground()
            if (r7 == 0) goto L_0x0097
            java.lang.String r0 = "background, skip"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return r4
        L_0x0097:
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r9 = r6.field_type
            r8[r3] = r9
            java.lang.String r9 = r6.field_id
            r8[r4] = r9
            java.lang.String r9 = "begin: %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r9, r8)
            java.lang.String r8 = r6.field_type
            java.lang.String r9 = r6.field_id
            java.lang.String r10 = "MomentVideo"
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x00c4
            com.tencent.mm.autogen.events.GetSnsVideoFeatureGroupEvent r8 = new com.tencent.mm.autogen.events.GetSnsVideoFeatureGroupEvent
            r8.<init>()
            com.tencent.mm.autogen.events.GetSnsVideoFeatureGroupEvent$a r11 = r8.f236216d
            r11.f236217a = r9
            r8.publish()
            com.tencent.mm.autogen.events.GetSnsVideoFeatureGroupEvent$a r8 = r8.f236216d
            o30.b r8 = r8.f236218b
            goto L_0x00c5
        L_0x00c4:
            r8 = 0
        L_0x00c5:
            if (r8 == 0) goto L_0x02fc
            long r11 = r6.field_happen_time
            r13 = 0
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 > 0) goto L_0x00d1
            goto L_0x02fc
        L_0x00d1:
            long r11 = java.lang.System.currentTimeMillis()
            r8.build()
            long r15 = java.lang.System.currentTimeMillis()
            long r11 = r15 - r11
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r15 = "build time:"
            r9.append(r15)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r9)
            h30.c r9 = new h30.c
            java.lang.String r15 = r6.field_type
            java.lang.String r10 = r6.field_id
            r9.<init>(r15, r10)
            r9.f253327k = r11
            r9.mo121839a()
            long r9 = r6.field_recall_time
            int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x0108
            r9 = 1
            goto L_0x0109
        L_0x0108:
            r9 = 0
        L_0x0109:
            long r10 = r6.field_happen_time
            double r10 = (double) r10
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            double r10 = r10.doubleValue()
            r12 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r10 = r10 / r12
            long r14 = r6.field_recall_time
            double r14 = (double) r14
            java.lang.Double r14 = java.lang.Double.valueOf(r14)
            double r14 = r14.doubleValue()
            double r14 = r14 / r12
            java.lang.Object[] r12 = new java.lang.Object[r4]
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r12[r3] = r10
            java.lang.String r10 = "%.4f"
            java.lang.String r11 = java.lang.String.format(r10, r12)
            java.lang.Object[] r12 = new java.lang.Object[r4]
            java.lang.Double r13 = java.lang.Double.valueOf(r14)
            r12[r3] = r13
            java.lang.String r10 = java.lang.String.format(r10, r12)
            java.lang.String r12 = r6.field_type
            double r13 = java.lang.Math.random()
            oa1.d r15 = oa1.C117731d.m166007c()
            r18 = r8
            r7 = 4532020583610935537(0x3ee4f8b588e368f1, double:1.0E-5)
            java.lang.String r3 = java.lang.String.valueOf(r7)
            r20 = r5
            java.lang.String r5 = "clicfg_android_kara_label_report"
            java.lang.String r3 = r15.mo182444f(r5, r3, r4, r4)
            double r21 = com.tencent.p014mm.sdk.platformtools.Util.getDouble(r3, r7)
            java.lang.String r3 = "snsvedio"
            int r15 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r15 > 0) goto L_0x028a
            oa1.d r13 = oa1.C117731d.m166007c()
            java.lang.String r14 = java.lang.String.valueOf(r7)
            java.lang.String r5 = r13.mo182444f(r5, r14, r4, r4)
            double r7 = com.tencent.p014mm.sdk.platformtools.Util.getDouble(r5, r7)
            r13 = 0
            int r5 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r5 < 0) goto L_0x028a
            r5 = 2
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r5 = 0
            r7[r5] = r12
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r7[r4] = r5
            java.lang.String r5 = "KaraReport"
            java.lang.String r8 = "report %s %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r7)
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            r8 = r18
            r8.mo123440c(r3, r7)
            java.lang.String r7 = r7.toString()
            byte[] r13 = r7.getBytes()
            byte[] r13 = e40.C86424b.m107091b(r13)
            if (r13 != 0) goto L_0x01b9
            java.lang.Object[] r10 = new java.lang.Object[r4]
            r11 = 0
            r10[r11] = r7
            java.lang.String r7 = "zip error:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r7, r10)
            r16 = r3
            goto L_0x028e
        L_0x01b9:
            r7 = 2
            java.lang.String r13 = android.util.Base64.encodeToString(r13, r7)
            int r7 = r13.length()
            int r7 = r7 / 6144
            int r14 = r13.length()
            int r14 = r14 % 6144
            if (r14 == 0) goto L_0x01ce
            int r7 = r7 + 1
        L_0x01ce:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r15 = 0
        L_0x01d4:
            if (r15 >= r7) goto L_0x0204
            int r4 = r15 * 6144
            int r15 = r15 + 1
            r21 = r7
            int r7 = r15 * 6144
            r22 = r15
            int r15 = r13.length()
            if (r4 <= r15) goto L_0x01e8
            r4 = 0
            goto L_0x01fb
        L_0x01e8:
            int r15 = r13.length()
            if (r7 <= r15) goto L_0x01f7
            int r7 = r13.length()
            java.lang.String r4 = r13.substring(r4, r7)
            goto L_0x01fb
        L_0x01f7:
            java.lang.String r4 = r13.substring(r4, r7)
        L_0x01fb:
            r14.add(r4)
            r7 = r21
            r15 = r22
            r4 = 1
            goto L_0x01d4
        L_0x0204:
            int r4 = r14.size()
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION
            java.lang.String r15 = "0x"
            r16 = r3
            java.lang.String r3 = ""
            java.lang.String r3 = r7.replace(r15, r3)
            r7 = 16
            long r21 = java.lang.Long.parseLong(r3, r7)
            java.lang.String r3 = p823sg.C48379o.m53725b(r13)     // Catch:{ Exception -> 0x027e }
            r7 = 0
        L_0x021f:
            if (r7 >= r4) goto L_0x026b
            com.tencent.mm.plugin.report.service.n r13 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r15 = 9
            java.lang.Object[] r15 = new java.lang.Object[r15]
            r19 = 0
            r15[r19] = r12
            r18 = 1
            r15[r18] = r11
            r17 = 2
            r15[r17] = r3
            r23 = 3
            java.lang.Integer r24 = java.lang.Integer.valueOf(r4)
            r15[r23] = r24
            r23 = 4
            java.lang.Integer r24 = java.lang.Integer.valueOf(r7)
            r15[r23] = r24
            r23 = 5
            java.lang.Object r24 = r14.get(r7)
            r15[r23] = r24
            r23 = 6
            java.lang.Integer r24 = java.lang.Integer.valueOf(r9)
            r15[r23] = r24
            r23 = 7
            java.lang.Long r24 = java.lang.Long.valueOf(r21)
            r15[r23] = r24
            r23 = 8
            r15[r23] = r10
            r23 = r10
            r10 = 25582(0x63ee, float:3.5848E-41)
            r13.mo160131h(r10, r15)
            int r7 = r7 + 1
            r10 = r23
            goto L_0x021f
        L_0x026b:
            r7 = 2
            java.lang.Object[] r10 = new java.lang.Object[r7]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 0
            r10[r7] = r4
            r4 = 1
            r10[r4] = r3
            java.lang.String r3 = "fragments cnt %d, SHA1:"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r10)
            goto L_0x028f
        L_0x027e:
            r4 = 1
            r7 = 0
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r3[r7] = r13
            java.lang.String r10 = "SHA1 error:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r10, r3)
            goto L_0x028f
        L_0x028a:
            r16 = r3
            r8 = r18
        L_0x028e:
            r7 = 0
        L_0x028f:
            r6.field_is_train_data_upload_finished = r4
            r0.mo123138Lo(r6)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r5 = r6.field_type
            r3[r7] = r5
            java.lang.String r5 = r6.field_id
            r3[r4] = r5
            java.lang.String r4 = "update succ: %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r3)
            if (r2 == 0) goto L_0x02f9
            java.lang.String r3 = r6.field_type
            java.lang.String r4 = r6.field_id
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r6 = r16
            r8.mo123440c(r6, r5)
            java.lang.String r5 = r5.toString()
            m30.a r6 = m30.C88691b.f256043b
            if (r6 != 0) goto L_0x02c0
            m30.C88691b.m110635a()
        L_0x02c0:
            m30.a r6 = m30.C88691b.f256043b
            r6.getClass()
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 != 0) goto L_0x02f9
            boolean r7 = android.text.TextUtils.isEmpty(r3)
            if (r7 == 0) goto L_0x02d2
            goto L_0x02f9
        L_0x02d2:
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.ISO_8859_1
            byte[] r5 = r5.getBytes(r7)
            byte[] r5 = e40.C86424b.m107091b(r5)
            xh.v2 r7 = new xh.v2
            r7.<init>()
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.ISO_8859_1
            r8.<init>(r5, r10)
            r7.field_feature_str = r8
            r7.field_label = r9
            r7.field_sample_uid = r4
            long r4 = java.lang.System.currentTimeMillis()
            r7.field_time = r4
            r7.field_model = r3
            r6.insert(r7)
        L_0x02f9:
            r3 = 1
            r6 = 0
            goto L_0x0310
        L_0x02fc:
            r20 = r5
            r3 = 1
            r6.field_is_train_data_upload_finished = r3
            r0.mo123138Lo(r6)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = r6.field_id
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "GetSnsVideoFeatureGroupEvent %s null"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r5, r4)
        L_0x0310:
            r5 = r20
            r3 = 0
            r4 = 1
            goto L_0x007d
        L_0x0316:
            r3 = 1
            return r3
        L_0x0318:
            r0 = move-exception
            if (r5 == 0) goto L_0x031e
            r5.close()
        L_0x031e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l30.C88375d.mo59472a():boolean");
    }

    /* renamed from: b */
    public long mo59473b() {
        return 3600000;
    }

    /* renamed from: c */
    public String mo59474c() {
        return "TrainData";
    }
}
