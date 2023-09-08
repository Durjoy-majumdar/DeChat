package d22;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C1311n;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49627gy1;
import te3.C49770hy1;

/* renamed from: d22.d */
public class C75320d extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f221476d;

    /* renamed from: e */
    public C11385n f221477e;

    public C75320d() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49627gy1();
        bVar.f127067b = new C49770hy1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getcontactlabellist";
        bVar.f127069d = 639;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f221476d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f221477e = nVar;
        return dispatch(gVar, this.f221476d, this);
    }

    public int getType() {
        return 639;
    }

    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v5, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0312, code lost:
        if (r5 != null) goto L_0x0314;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x031d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r17, int r18, int r19, java.lang.String r20, com.tencent.p014mm.network.C114799u r21, byte[] r22) {
        /*
            r16 = this;
            r1 = r16
            r2 = r18
            r3 = r19
            r4 = r20
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r17)
            r6 = 0
            r0[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r18)
            r7 = 1
            r0[r7] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r19)
            r8 = 2
            r0[r8] = r5
            r5 = 3
            r0[r5] = r4
            java.lang.String r5 = "MicroMsg.Label.NetSceneGetContactLabelList"
            java.lang.String r9 = "cpan[onGYNetEnd] netId:%d errType:%d errCode:%d errMsg:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r9, r0)
            if (r2 != 0) goto L_0x0321
            if (r3 != 0) goto L_0x0321
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r9 = 209408(0x33200, float:2.93443E-40)
            long r10 = java.lang.System.currentTimeMillis()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r0.mo119676J(r9, r10)
            ob0.c r0 = r1.f221476d
            ob0.c$d r0 = r0.f127056b
            pe3.a r0 = r0.f127083a
            te3.hy1 r0 = (te3.C49770hy1) r0
            if (r0 == 0) goto L_0x0326
            java.util.LinkedList<te3.mm2> r0 = r0.f134957e
            if (r0 == 0) goto L_0x0326
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            int r11 = r0.size()
            r12 = 0
        L_0x0061:
            if (r12 >= r11) goto L_0x0093
            java.lang.Object r13 = r0.get(r12)
            te3.mm2 r13 = (te3.C50422mm2) r13
            com.tencent.mm.storage.b2 r14 = new com.tencent.mm.storage.b2
            r14.<init>()
            int r15 = r13.f138106e
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r9.add(r15)
            int r15 = r13.f138106e
            r14.field_labelID = r15
            java.lang.String r15 = r13.f138105d
            r14.field_labelName = r15
            java.lang.String r15 = sf0.C77691f.m93686a(r15)
            r14.field_labelPYFull = r15
            java.lang.String r13 = r13.f138105d
            java.lang.String r13 = sf0.C77691f.m93687b(r13)
            r14.field_labelPYShort = r13
            r10.add(r14)
            int r12 = r12 + 1
            goto L_0x0061
        L_0x0093:
            com.tencent.mm.storage.e2 r0 = a22.C27740g.vx0()
            r0.mo100956nP(r10)
            com.tencent.mm.storage.e2 r0 = a22.C27740g.vx0()
            java.util.ArrayList r0 = r0.mo100953kD()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r14 = r0.iterator()
        L_0x00b5:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x00e6
            java.lang.Object r15 = r14.next()
            com.tencent.mm.storage.b2 r15 = (com.tencent.p014mm.storage.C72955b2) r15
            r21 = r9
            long r8 = r15.field_createTime
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            boolean r8 = r11.contains(r8)
            if (r8 != 0) goto L_0x00d9
            long r8 = r15.field_createTime
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r11.add(r8)
            goto L_0x00e2
        L_0x00d9:
            long r8 = r15.field_createTime
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r13.add(r8)
        L_0x00e2:
            r9 = r21
            r8 = 2
            goto L_0x00b5
        L_0x00e6:
            r21 = r9
            r8 = 0
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r13.add(r8)
            java.util.Iterator r0 = r0.iterator()
        L_0x00f5:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0111
            java.lang.Object r8 = r0.next()
            com.tencent.mm.storage.b2 r8 = (com.tencent.p014mm.storage.C72955b2) r8
            long r14 = r8.field_createTime
            java.lang.Long r9 = java.lang.Long.valueOf(r14)
            boolean r9 = r13.contains(r9)
            if (r9 == 0) goto L_0x00f5
            r12.add(r8)
            goto L_0x00f5
        L_0x0111:
            r0 = 0
        L_0x0112:
            int r8 = r12.size()
            if (r0 >= r8) goto L_0x012d
            java.lang.Object r8 = r12.get(r6)
            com.tencent.mm.storage.b2 r8 = (com.tencent.p014mm.storage.C72955b2) r8
            long r13 = java.lang.System.currentTimeMillis()
            int r9 = r0 * 1000
            long r6 = (long) r9
            long r13 = r13 + r6
            r8.field_createTime = r13
            int r0 = r0 + 1
            r6 = 0
            r7 = 1
            goto L_0x0112
        L_0x012d:
            com.tencent.mm.storage.e2 r0 = a22.C27740g.vx0()
            r6 = 1
            r0.mo100959vP(r12, r6)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            com.tencent.mm.storage.e2 r8 = a22.C27740g.vx0()
            java.util.ArrayList r8 = r8.mo100953kD()
            java.util.Iterator r9 = r8.iterator()
        L_0x0150:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x016c
            java.lang.Object r12 = r9.next()
            com.tencent.mm.storage.b2 r12 = (com.tencent.p014mm.storage.C72955b2) r12
            int r13 = r12.field_labelID
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            long r14 = r12.field_createTime
            java.lang.Long r12 = java.lang.Long.valueOf(r14)
            r6.put(r13, r12)
            goto L_0x0150
        L_0x016c:
            r9 = 0
        L_0x016d:
            int r12 = r21.size()
            if (r9 >= r12) goto L_0x01ae
            int r12 = r8.size()
            if (r9 >= r12) goto L_0x01ae
            r12 = r21
            java.lang.Object r13 = r12.get(r9)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            java.lang.Object r14 = r8.get(r9)
            com.tencent.mm.storage.b2 r14 = (com.tencent.p014mm.storage.C72955b2) r14
            int r14 = r14.field_labelID
            if (r13 == r14) goto L_0x01a9
            java.lang.String r13 = "isSwapPosAdapter field_labelID no equal."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r13)
            java.lang.Object r13 = r12.get(r9)
            java.lang.Integer r13 = (java.lang.Integer) r13
            java.lang.Object r14 = r8.get(r9)
            com.tencent.mm.storage.b2 r14 = (com.tencent.p014mm.storage.C72955b2) r14
            int r14 = r14.field_labelID
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r7.put(r13, r14)
        L_0x01a9:
            int r9 = r9 + 1
            r21 = r12
            goto L_0x016d
        L_0x01ae:
            r12 = r21
            java.util.Iterator r8 = r12.iterator()
        L_0x01b4:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0237
            java.lang.Object r9 = r8.next()
            java.lang.Integer r9 = (java.lang.Integer) r9
            boolean r12 = r7.containsKey(r9)
            if (r12 != 0) goto L_0x01c7
            goto L_0x01b4
        L_0x01c7:
            java.lang.Object r12 = r7.get(r9)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            java.lang.Object r13 = r6.get(r13)
            java.lang.Long r13 = (java.lang.Long) r13
            long r13 = r13.longValue()
            com.tencent.mm.storage.e2 r15 = a22.C27740g.vx0()
            java.lang.String r11 = java.lang.String.valueOf(r9)
            com.tencent.mm.storage.b2 r11 = r15.mo100950bF(r11)
            if (r11 != 0) goto L_0x01f3
            com.tencent.mm.storage.b2 r11 = new com.tencent.mm.storage.b2
            r11.<init>()
            goto L_0x01f8
        L_0x01f3:
            boolean r15 = r11.field_isTemporary
            if (r15 == 0) goto L_0x01f8
            goto L_0x01b4
        L_0x01f8:
            long r2 = r11.field_createTime
            int r15 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r15 == 0) goto L_0x0231
            r11.field_createTime = r13
            r0.add(r11)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "newSortLabelId = "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = "oldLabelId = "
            r2.append(r3)
            r2.append(r12)
            java.lang.String r3 = "label.field_createTime = "
            r2.append(r3)
            long r11 = r11.field_createTime
            r2.append(r11)
            java.lang.String r3 = ", newCreateTime = "
            r2.append(r3)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
        L_0x0231:
            r2 = r18
            r3 = r19
            goto L_0x01b4
        L_0x0237:
            com.tencent.mm.storage.e2 r2 = a22.C27740g.vx0()
            r3 = 1
            r2.mo100959vP(r0, r3)
            r7.clear()
            r6.clear()
            com.tencent.mm.storage.e2 r2 = a22.C27740g.vx0()
            com.tencent.mm.storage.e2 r0 = a22.C27740g.vx0()
            r0.getClass()
            r3 = 0
            int r5 = r10.size()
            if (r5 > 0) goto L_0x0259
            goto L_0x0317
        L_0x0259:
            int r5 = r10.size()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "select * from ContactLabel where labelID"
            r6.append(r7)
            java.lang.String r7 = " not in ( "
            r6.append(r7)
            r7 = 0
        L_0x026d:
            if (r7 >= r5) goto L_0x029a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "'"
            r8.append(r9)
            java.lang.Object r12 = r10.get(r7)
            com.tencent.mm.storage.b2 r12 = (com.tencent.p014mm.storage.C72955b2) r12
            int r12 = r12.field_labelID
            r8.append(r12)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r6.append(r8)
            int r8 = r5 + -1
            if (r7 >= r8) goto L_0x0297
            java.lang.String r8 = ","
            r6.append(r8)
        L_0x0297:
            int r7 = r7 + 1
            goto L_0x026d
        L_0x029a:
            java.lang.String r5 = " )"
            r6.append(r5)
            java.lang.String r5 = " and "
            r6.append(r5)
            java.lang.String r5 = "isTemporary"
            r6.append(r5)
            java.lang.String r5 = "=0"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r6 = 0
            r7[r6] = r5
            java.lang.String r6 = "MicroMsg.Label.ContactLabelStorage"
            java.lang.String r8 = "cpan[getLabelIdListNoInList] SQL:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r8, r7)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f212650d     // Catch:{ Exception -> 0x0301, all -> 0x02ff }
            r7 = 2
            android.database.Cursor r5 = r0.rawQuery(r5, r3, r7)     // Catch:{ Exception -> 0x0301, all -> 0x02ff }
            boolean r0 = r5.moveToFirst()     // Catch:{ Exception -> 0x02fd }
            if (r0 == 0) goto L_0x0314
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x02fd }
            r0.<init>()     // Catch:{ Exception -> 0x02fd }
        L_0x02d1:
            com.tencent.mm.storage.b2 r7 = new com.tencent.mm.storage.b2     // Catch:{ Exception -> 0x02fd }
            r7.<init>()     // Catch:{ Exception -> 0x02fd }
            r7.convertFrom(r5)     // Catch:{ Exception -> 0x02fd }
            r0.add(r7)     // Catch:{ Exception -> 0x02fd }
            boolean r7 = r5.moveToNext()     // Catch:{ Exception -> 0x02fd }
            if (r7 != 0) goto L_0x02d1
            java.lang.String r7 = "cpan[getLabelIdListNoInList] resut size:%d"
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x02fd }
            int r8 = r0.size()     // Catch:{ Exception -> 0x02fd }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x02fd }
            r10 = 0
            r9[r10] = r8     // Catch:{ Exception -> 0x02fd }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r7, r9)     // Catch:{ Exception -> 0x02fd }
            r5.close()
            r3 = r0
            goto L_0x0317
        L_0x02fa:
            r0 = move-exception
            r3 = r5
            goto L_0x031b
        L_0x02fd:
            r0 = move-exception
            goto L_0x0303
        L_0x02ff:
            r0 = move-exception
            goto L_0x031b
        L_0x0301:
            r0 = move-exception
            r5 = r3
        L_0x0303:
            java.lang.String r7 = "cpan[getLabelIdListNoInList] exception:%s"
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x02fa }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02fa }
            r9 = 0
            r8[r9] = r0     // Catch:{ all -> 0x02fa }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r7, r8)     // Catch:{ all -> 0x02fa }
            if (r5 == 0) goto L_0x0317
        L_0x0314:
            r5.close()
        L_0x0317:
            r2.mo100949Yt(r3)
            goto L_0x0326
        L_0x031b:
            if (r3 == 0) goto L_0x0320
            r3.close()
        L_0x0320:
            throw r0
        L_0x0321:
            java.lang.String r0 = "cpan[onGYNetEnd] getcontactlabellist fail."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
        L_0x0326:
            ob0.n r0 = r1.f221477e
            r2 = r18
            r3 = r19
            r0.onSceneEnd(r2, r3, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d22.C75320d.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }
}
