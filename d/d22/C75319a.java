package d22;

import cm0.C28613b;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48800b3;
import te3.C48946c3;
import te3.C50422mm2;

/* renamed from: d22.a */
public class C75319a extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f221473d;

    /* renamed from: e */
    public C11385n f221474e;

    /* renamed from: f */
    public LinkedList<C50422mm2> f221475f = new LinkedList<>();

    public C75319a(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48800b3();
        bVar.f127067b = new C48946c3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/addcontactlabel";
        bVar.f127069d = C28613b.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f221473d = bVar.mo72403a();
        if (!Util.isNullOrNil(str)) {
            C50422mm2 mm22 = new C50422mm2();
            mm22.f138105d = str;
            this.f221475f.add(mm22);
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105918d("MicroMsg.Label.NetSceneAddContactLabel", "cpan[doScene].");
        this.f221474e = nVar;
        C48800b3 b3Var = (C48800b3) this.f221473d.f127055a.f127080a;
        LinkedList<C50422mm2> linkedList = this.f221475f;
        if (linkedList == null || linkedList.size() <= 0) {
            Log.m105920e("MicroMsg.Label.NetSceneAddContactLabel", "cpan[doScene] label list is null.");
            nVar.onSceneEnd(3, -1, "[doScene]empty contact list.", this);
            return 0;
        }
        LinkedList<C50422mm2> linkedList2 = this.f221475f;
        b3Var.f130920e = linkedList2;
        b3Var.f130919d = linkedList2.size();
        return dispatch(gVar, this.f221473d, this);
    }

    public int getType() {
        return C28613b.CTRL_INDEX;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0141, code lost:
        if (r6 == null) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x015a, code lost:
        if (r6 == null) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x015c, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x015f, code lost:
        r0 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r19, int r20, int r21, java.lang.String r22, com.tencent.p014mm.network.C114799u r23, byte[] r24) {
        /*
            r18 = this;
            r1 = r18
            r2 = r22
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
            r4 = 0
            r0[r4] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            r5 = 1
            r0[r5] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
            r6 = 2
            r0[r6] = r3
            r3 = 3
            r0[r3] = r2
            java.lang.String r3 = "MicroMsg.Label.NetSceneAddContactLabel"
            java.lang.String r7 = "cpan[onGYNetEnd] netId:%d errType:%d errCode:%d errMsg:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r7, r0)
            ob0.c r0 = r1.f221473d
            ob0.c$d r0 = r0.f127056b
            pe3.a r0 = r0.f127083a
            te3.c3 r0 = (te3.C48946c3) r0
            if (r0 == 0) goto L_0x01d1
            java.util.LinkedList<te3.mm2> r0 = r0.f131475e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r7 = r0.size()
            r8 = 0
        L_0x003c:
            if (r8 >= r7) goto L_0x0067
            java.lang.Object r9 = r0.get(r8)
            te3.mm2 r9 = (te3.C50422mm2) r9
            com.tencent.mm.storage.b2 r10 = new com.tencent.mm.storage.b2
            r10.<init>()
            int r11 = r9.f138106e
            r10.field_labelID = r11
            java.lang.String r11 = r9.f138105d
            r10.field_labelName = r11
            java.lang.String r11 = sf0.C77691f.m93686a(r11)
            r10.field_labelPYFull = r11
            java.lang.String r9 = r9.f138105d
            java.lang.String r9 = sf0.C77691f.m93687b(r9)
            r10.field_labelPYShort = r9
            r10.field_isTemporary = r4
            r3.add(r10)
            int r8 = r8 + 1
            goto L_0x003c
        L_0x0067:
            com.tencent.mm.storage.e2 r7 = a22.C27740g.vx0()
            r7.getClass()
            java.lang.String r8 = "MicroMsg.Label.ContactLabelStorage"
            int r0 = r3.size()
            if (r0 > 0) goto L_0x007d
            java.lang.String r0 = "cpan[insertAddLabel] list is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            goto L_0x01ca
        L_0x007d:
            r9 = -1
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r7.f212650d
            boolean r11 = r0 instanceof zh3.C91753f
            if (r11 == 0) goto L_0x00a3
            zh3.f r0 = (zh3.C91753f) r0
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            long r9 = r9.getId()
            long r9 = r0.beginTransaction(r9)
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.Long r13 = java.lang.Long.valueOf(r9)
            r11[r4] = r13
            java.lang.String r13 = "begin deleteLocalLabel in a transaction, ticket = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r13, r11)
            r10 = r9
            r9 = r0
            goto L_0x00a5
        L_0x00a3:
            r10 = r9
            r9 = 0
        L_0x00a5:
            int r13 = r3.size()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r14 = 0
        L_0x00af:
            if (r14 >= r13) goto L_0x01bd
            java.lang.Object r0 = r3.get(r14)
            com.tencent.mm.storage.b2 r0 = (com.tencent.p014mm.storage.C72955b2) r0
            java.lang.String r15 = "select * from ContactLabel where labelName=? and isTemporary =?"
            java.lang.String[] r12 = new java.lang.String[r6]
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = r0.field_labelName
            r6.append(r5)
            java.lang.String r5 = ""
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            r12[r4] = r6
            java.lang.String r6 = "1"
            r16 = 1
            r12[r16] = r6
            com.tencent.mm.sdk.storage.ISQLiteDatabase r6 = r7.f212650d     // Catch:{ Exception -> 0x0147, all -> 0x0144 }
            r4 = 2
            android.database.Cursor r6 = r6.rawQuery(r15, r12, r4)     // Catch:{ Exception -> 0x0147, all -> 0x0144 }
            if (r6 == 0) goto L_0x013f
            boolean r4 = r6.moveToFirst()     // Catch:{ Exception -> 0x013b }
            if (r4 == 0) goto L_0x013f
            java.lang.String r4 = "labelName"
            int r4 = r6.getColumnIndex(r4)     // Catch:{ Exception -> 0x013b }
            java.lang.String r4 = r6.getString(r4)     // Catch:{ Exception -> 0x013b }
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r4, (java.lang.String) r5)     // Catch:{ Exception -> 0x013b }
            java.lang.String r12 = r0.field_labelName     // Catch:{ Exception -> 0x013b }
            boolean r12 = r12.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x013b }
            java.lang.String r15 = "cpan[checkEqualsName] itemname:%s dbname:%s"
            r17 = r13
            r13 = 2
            java.lang.Object[] r2 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x0139 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0139 }
            r13.<init>()     // Catch:{ Exception -> 0x0139 }
            java.lang.String r0 = r0.field_labelName     // Catch:{ Exception -> 0x0139 }
            r13.append(r0)     // Catch:{ Exception -> 0x0139 }
            r13.append(r5)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r0 = r13.toString()     // Catch:{ Exception -> 0x0139 }
            r13 = 0
            r2[r13] = r0     // Catch:{ Exception -> 0x0139 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0139 }
            r0.<init>()     // Catch:{ Exception -> 0x0139 }
            r0.append(r4)     // Catch:{ Exception -> 0x0139 }
            r0.append(r5)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0139 }
            r4 = 1
            r2[r4] = r0     // Catch:{ Exception -> 0x0139 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r15, r2)     // Catch:{ Exception -> 0x0139 }
            if (r12 == 0) goto L_0x0141
            java.lang.String r0 = "labelID"
            int r0 = r6.getColumnIndex(r0)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r0 = r6.getString(r0)     // Catch:{ Exception -> 0x0139 }
            r6.close()
            goto L_0x0160
        L_0x0139:
            r0 = move-exception
            goto L_0x014b
        L_0x013b:
            r0 = move-exception
            r17 = r13
            goto L_0x014b
        L_0x013f:
            r17 = r13
        L_0x0141:
            if (r6 == 0) goto L_0x015f
            goto L_0x015c
        L_0x0144:
            r0 = move-exception
            r12 = 0
            goto L_0x01b7
        L_0x0147:
            r0 = move-exception
            r17 = r13
            r6 = 0
        L_0x014b:
            java.lang.String r2 = "cpan[checkEqualsName] exception %s"
            r4 = 1
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ all -> 0x01b5 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01b5 }
            r4 = 0
            r12[r4] = r0     // Catch:{ all -> 0x01b5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r2, r12)     // Catch:{ all -> 0x01b5 }
            if (r6 == 0) goto L_0x015f
        L_0x015c:
            r6.close()
        L_0x015f:
            r0 = 0
        L_0x0160:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x01a8
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "cpan[delete] labelID:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r5, r4)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r5 = "labelID =? "
            r4[r6] = r5
            java.lang.String r12 = "cpan[query] SQL:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r12, r4)
            java.lang.String[] r4 = new java.lang.String[r2]
            r4[r6] = r0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r7.f212650d     // Catch:{ Exception -> 0x0197 }
            java.lang.String r2 = "ContactLabel"
            r0.delete(r2, r5, r4)     // Catch:{ Exception -> 0x0197 }
            goto L_0x01a8
        L_0x0197:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r0 = r0.toString()
            r5 = 0
            r4[r5] = r0
            java.lang.String r0 = "cpan[delete] exception %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r0, r4)
            goto L_0x01aa
        L_0x01a8:
            r2 = 1
            r5 = 0
        L_0x01aa:
            int r14 = r14 + 1
            r2 = r22
            r13 = r17
            r4 = 0
            r5 = 1
            r6 = 2
            goto L_0x00af
        L_0x01b5:
            r0 = move-exception
            r12 = r6
        L_0x01b7:
            if (r12 == 0) goto L_0x01bc
            r12.close()
        L_0x01bc:
            throw r0
        L_0x01bd:
            if (r9 == 0) goto L_0x01c7
            r9.endTransaction(r10)
            java.lang.String r0 = "end deleteLocalLabel transaction"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
        L_0x01c7:
            r7.mo100945Lo()
        L_0x01ca:
            com.tencent.mm.storage.e2 r0 = a22.C27740g.vx0()
            r0.mo100956nP(r3)
        L_0x01d1:
            ob0.n r0 = r1.f221474e
            r2 = r20
            r3 = r21
            r4 = r22
            r0.onSceneEnd(r2, r3, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d22.C75319a.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }

    public C75319a(List<String> list) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48800b3();
        bVar.f127067b = new C48946c3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/addcontactlabel";
        bVar.f127069d = C28613b.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f221473d = bVar.mo72403a();
        if (list != null && list.size() > 0) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C50422mm2 mm22 = new C50422mm2();
                mm22.f138105d = list.get(i);
                this.f221475f.add(mm22);
            }
        }
    }
}
