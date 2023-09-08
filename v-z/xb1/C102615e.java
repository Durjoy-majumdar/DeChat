package xb1;

import android.database.Cursor;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p749xh.C38666t2;
import pb1.C100701c1;
import pb1.C35428d0;

/* renamed from: xb1.e */
public class C102615e extends MAutoStorage<C38666t2> implements C100701c1 {

    /* renamed from: d */
    public ISQLiteDatabase f302176d;

    /* renamed from: e */
    public boolean f302177e;

    static {
        MAutoStorage.getCreateSQLs(C35428d0.f94809x, "FavSearchInfo");
    }

    public C102615e(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C35428d0.f94809x, "FavSearchInfo", (String[]) null);
        this.f302176d = iSQLiteDatabase;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0239, code lost:
        r13 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02b2, code lost:
        r6 = 14;
        r7 = 17;
     */
    /* renamed from: Lo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<java.lang.Long> mo142274Lo(java.util.List<java.lang.String> r25, java.util.List<java.lang.String> r26, java.util.List<java.lang.Integer> r27) {
        /*
            r24 = this;
            r0 = r24
            boolean r1 = wc3.C102429k.m135145a(r27)
            if (r1 == 0) goto L_0x0022
            java.lang.Class<pb1.z0> r1 = pb1.C100759z0.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            pb1.z0 r1 = (pb1.C100759z0) r1
            java.util.ArrayList r1 = r1.yq0()
            if (r1 == 0) goto L_0x001c
            int r3 = r1.size()
            if (r3 != 0) goto L_0x0023
        L_0x001c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            return r1
        L_0x0022:
            r1 = 0
        L_0x0023:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r4 = " 1=1 "
            if (r25 == 0) goto L_0x005c
            boolean r5 = r25.isEmpty()
            if (r5 != 0) goto L_0x005c
            java.util.Iterator r5 = r25.iterator()
        L_0x0036:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x005c
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            java.lang.String r4 = " and content like '%"
            r7.append(r4)
            r7.append(r6)
            java.lang.String r4 = "%'"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            goto L_0x0036
        L_0x005c:
            if (r26 == 0) goto L_0x008e
            boolean r5 = r26.isEmpty()
            if (r5 != 0) goto L_0x008e
            java.util.Iterator r5 = r26.iterator()
        L_0x0068:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x008e
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            java.lang.String r4 = " and tagContent like '%"
            r7.append(r4)
            r7.append(r6)
            java.lang.String r4 = "%'"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            goto L_0x0068
        L_0x008e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "select localId from FavSearchInfo"
            r5.append(r6)
            java.lang.String r6 = " where "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r27)
            r6 = 14
            r7 = 17
            r8 = 16
            r9 = 15
            r10 = 13
            r11 = 12
            r12 = 11
            r13 = 10
            r14 = 9
            r16 = 7
            r17 = 6
            r18 = 5
            r19 = 3
            r20 = 4
            r2 = 2
            if (r5 == 0) goto L_0x00cb
            r5 = 0
            goto L_0x01b9
        L_0x00cb:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r21 = r27.iterator()
        L_0x00d4:
            boolean r22 = r21.hasNext()
            if (r22 == 0) goto L_0x01b9
            java.lang.Object r22 = r21.next()
            java.lang.Integer r22 = (java.lang.Integer) r22
            int r22 = r22.intValue()
            r23 = 20
            switch(r22) {
                case 1: goto L_0x01ad;
                case 2: goto L_0x01a5;
                case 3: goto L_0x019d;
                case 4: goto L_0x0195;
                case 5: goto L_0x0182;
                case 6: goto L_0x017a;
                case 7: goto L_0x0169;
                case 8: goto L_0x015f;
                case 9: goto L_0x0156;
                case 10: goto L_0x014d;
                case 11: goto L_0x0145;
                case 12: goto L_0x013d;
                case 13: goto L_0x0135;
                case 14: goto L_0x012d;
                case 15: goto L_0x0125;
                case 16: goto L_0x011d;
                case 17: goto L_0x0115;
                case 18: goto L_0x010b;
                case 19: goto L_0x0101;
                case 20: goto L_0x00f9;
                case 21: goto L_0x00ea;
                default: goto L_0x00e9;
            }
        L_0x00e9:
            goto L_0x00d4
        L_0x00ea:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)
            r5.add(r15)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r20)
            r5.add(r15)
            goto L_0x00d4
        L_0x00f9:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r23)
            r5.add(r15)
            goto L_0x00d4
        L_0x0101:
            r15 = 19
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r5.add(r15)
            goto L_0x00d4
        L_0x010b:
            r15 = 18
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r5.add(r15)
            goto L_0x00d4
        L_0x0115:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r6)
            r5.add(r15)
            goto L_0x00d4
        L_0x011d:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r7)
            r5.add(r15)
            goto L_0x00d4
        L_0x0125:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r8)
            r5.add(r15)
            goto L_0x00d4
        L_0x012d:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r9)
            r5.add(r15)
            goto L_0x00d4
        L_0x0135:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)
            r5.add(r15)
            goto L_0x00d4
        L_0x013d:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)
            r5.add(r15)
            goto L_0x00d4
        L_0x0145:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            r5.add(r15)
            goto L_0x00d4
        L_0x014d:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r13)
            r5.add(r15)
            goto L_0x00d4
        L_0x0156:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            r5.add(r15)
            goto L_0x00d4
        L_0x015f:
            r15 = 8
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            r5.add(r14)
            goto L_0x01b5
        L_0x0169:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r16)
            r5.add(r14)
            r14 = 21
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r5.add(r14)
            goto L_0x01b5
        L_0x017a:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r17)
            r5.add(r14)
            goto L_0x01b5
        L_0x0182:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r18)
            r5.add(r14)
            boolean r14 = r0.f302177e
            if (r14 != 0) goto L_0x01b5
            java.lang.Integer r14 = java.lang.Integer.valueOf(r23)
            r5.add(r14)
            goto L_0x01b5
        L_0x0195:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r20)
            r5.add(r14)
            goto L_0x01b5
        L_0x019d:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r19)
            r5.add(r14)
            goto L_0x01b5
        L_0x01a5:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r2)
            r5.add(r14)
            goto L_0x01b5
        L_0x01ad:
            r14 = 1
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            r5.add(r15)
        L_0x01b5:
            r14 = 9
            goto L_0x00d4
        L_0x01b9:
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r27)
            if (r14 == 0) goto L_0x01c2
            r14 = 0
            goto L_0x02b8
        L_0x01c2:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r15 = r27.iterator()
        L_0x01cb:
            boolean r21 = r15.hasNext()
            if (r21 == 0) goto L_0x02b8
            java.lang.Object r21 = r15.next()
            java.lang.Integer r21 = (java.lang.Integer) r21
            int r21 = r21.intValue()
            r23 = 22
            switch(r21) {
                case 1: goto L_0x02aa;
                case 2: goto L_0x02a0;
                case 3: goto L_0x0296;
                case 4: goto L_0x028c;
                case 5: goto L_0x0277;
                case 6: goto L_0x026d;
                case 7: goto L_0x025a;
                case 8: goto L_0x0250;
                case 9: goto L_0x0246;
                case 10: goto L_0x023c;
                case 11: goto L_0x0232;
                case 12: goto L_0x022a;
                case 13: goto L_0x0222;
                case 14: goto L_0x021a;
                case 15: goto L_0x0212;
                case 16: goto L_0x020a;
                case 17: goto L_0x0202;
                case 18: goto L_0x01e0;
                case 19: goto L_0x01f8;
                case 20: goto L_0x01f0;
                case 21: goto L_0x01e1;
                default: goto L_0x01e0;
            }
        L_0x01e0:
            goto L_0x01cb
        L_0x01e1:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            r14.add(r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r20)
            r14.add(r13)
            goto L_0x0239
        L_0x01f0:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r23)
            r14.add(r13)
            goto L_0x0239
        L_0x01f8:
            r13 = 19
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14.add(r13)
            goto L_0x0239
        L_0x0202:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
            r14.add(r13)
            goto L_0x0239
        L_0x020a:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r14.add(r13)
            goto L_0x0239
        L_0x0212:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            r14.add(r13)
            goto L_0x0239
        L_0x021a:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            r14.add(r13)
            goto L_0x0239
        L_0x0222:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            r14.add(r13)
            goto L_0x0239
        L_0x022a:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            r14.add(r13)
            goto L_0x0239
        L_0x0232:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r14.add(r13)
        L_0x0239:
            r13 = 10
            goto L_0x01cb
        L_0x023c:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            r14.add(r6)
            r6 = 14
            goto L_0x01cb
        L_0x0246:
            r6 = 9
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r14.add(r7)
            goto L_0x02b2
        L_0x0250:
            r7 = 8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r14.add(r6)
            goto L_0x02b2
        L_0x025a:
            r7 = 8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r16)
            r14.add(r6)
            r6 = 29
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r14.add(r6)
            goto L_0x02b2
        L_0x026d:
            r7 = 8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r17)
            r14.add(r6)
            goto L_0x02b2
        L_0x0277:
            r7 = 8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r18)
            r14.add(r6)
            boolean r6 = r0.f302177e
            if (r6 != 0) goto L_0x02b2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r23)
            r14.add(r6)
            goto L_0x02b2
        L_0x028c:
            r7 = 8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r20)
            r14.add(r6)
            goto L_0x02b2
        L_0x0296:
            r7 = 8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r19)
            r14.add(r6)
            goto L_0x02b2
        L_0x02a0:
            r7 = 8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r14.add(r6)
            goto L_0x02b2
        L_0x02aa:
            r6 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r14.add(r7)
        L_0x02b2:
            r6 = 14
            r7 = 17
            goto L_0x01cb
        L_0x02b8:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r5)
            r7 = 0
            if (r6 == 0) goto L_0x02c5
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r14)
            if (r6 != 0) goto L_0x03a8
        L_0x02c5:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = " and ("
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r5)
            if (r6 != 0) goto L_0x031f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = "type = "
            r6.append(r4)
            java.lang.Object r4 = r5.get(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r6 = r4
            r4 = 1
        L_0x02f7:
            int r8 = r5.size()
            if (r4 >= r8) goto L_0x031e
            java.lang.Object r8 = r5.get(r4)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r6 = " or type = "
            r9.append(r6)
            r9.append(r8)
            java.lang.String r6 = r9.toString()
            int r4 = r4 + 1
            goto L_0x02f7
        L_0x031e:
            r4 = r6
        L_0x031f:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r14)
            if (r6 != 0) goto L_0x0397
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r5)
            if (r5 != 0) goto L_0x033c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = " or "
            r5.append(r4)
            java.lang.String r4 = r5.toString()
        L_0x033c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "subtype & "
            r5.append(r4)
            java.lang.Object r4 = r14.get(r7)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r6 = pb1.C35428d0.f94809x
            r6 = 1
            int r4 = r6 << r4
            r5.append(r4)
            java.lang.String r4 = " != 0"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r5 = r4
            r4 = 1
        L_0x0367:
            int r6 = r14.size()
            if (r4 >= r6) goto L_0x0396
            java.lang.Object r6 = r14.get(r4)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r5 = " or subtype & "
            r8.append(r5)
            r5 = 1
            int r6 = r5 << r6
            r8.append(r6)
            java.lang.String r5 = " != 0"
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            int r4 = r4 + 1
            goto L_0x0367
        L_0x0396:
            r4 = r5
        L_0x0397:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = ")"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
        L_0x03a8:
            if (r1 == 0) goto L_0x0458
            int r5 = r1.size()
            if (r5 <= 0) goto L_0x0458
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = " and ("
            r5.append(r6)
            r6 = 0
        L_0x03bb:
            int r8 = r1.size()
            java.lang.String r9 = "localId"
            java.lang.String r10 = "."
            java.lang.String r11 = "FavSearchInfo"
            if (r6 >= r8) goto L_0x0408
            int r8 = r1.size()
            r12 = 1
            int r8 = r8 - r12
            if (r6 == r8) goto L_0x03eb
            r5.append(r11)
            r5.append(r10)
            r5.append(r9)
            java.lang.String r8 = " = '"
            r5.append(r8)
            java.lang.Object r8 = r1.get(r6)
            r5.append(r8)
            java.lang.String r8 = "' OR "
            r5.append(r8)
            goto L_0x0405
        L_0x03eb:
            r5.append(r11)
            r5.append(r10)
            r5.append(r9)
            java.lang.String r8 = " = '"
            r5.append(r8)
            java.lang.Object r8 = r1.get(r6)
            r5.append(r8)
            java.lang.String r8 = "' "
            r5.append(r8)
        L_0x0405:
            int r6 = r6 + 1
            goto L_0x03bb
        L_0x0408:
            java.lang.String r6 = ")"
            r5.append(r6)
            java.lang.String r6 = "order by case "
            r5.append(r6)
            r5.append(r11)
            r5.append(r10)
            r5.append(r9)
            java.lang.String r6 = " "
            r5.append(r6)
            r6 = 0
        L_0x0422:
            int r8 = r1.size()
            if (r6 >= r8) goto L_0x043f
            java.lang.String r8 = " when '"
            r5.append(r8)
            java.lang.Object r8 = r1.get(r6)
            r5.append(r8)
            java.lang.String r8 = "' then "
            r5.append(r8)
            r5.append(r6)
            int r6 = r6 + 1
            goto L_0x0422
        L_0x043f:
            java.lang.String r1 = " end"
            r5.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r4 = r5.toString()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            goto L_0x0469
        L_0x0458:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r4 = " order by time desc"
            r1.append(r4)
            java.lang.String r1 = r1.toString()
        L_0x0469:
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r7] = r1
            java.lang.String r5 = "MicroMsg.FavSearchStorage"
            java.lang.String r6 = "search id sql {%s}"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r6, r4)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r4 = r0.f302176d
            r5 = 0
            android.database.Cursor r1 = r4.rawQuery(r1, r5, r2)
            if (r1 != 0) goto L_0x0480
            return r3
        L_0x0480:
            boolean r2 = r1.moveToNext()
            if (r2 == 0) goto L_0x0492
            long r4 = r1.getLong(r7)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r3.add(r2)
            goto L_0x0480
        L_0x0492:
            r1.close()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: xb1.C102615e.mo142274Lo(java.util.List, java.util.List, java.util.List):java.util.ArrayList");
    }

    /* renamed from: Yt */
    public /* bridge */ /* synthetic */ boolean mo142275Yt(C38666t2 t2Var, String[] strArr) {
        return super.update(t2Var, strArr);
    }

    /* renamed from: jo */
    public C38666t2 mo142276jo(long j) {
        C35428d0 d0Var = null;
        Cursor rawQuery = this.f302176d.rawQuery("select * from FavSearchInfo where localId = " + j, (String[]) null, 2);
        if (rawQuery == null) {
            return null;
        }
        if (rawQuery.moveToFirst()) {
            d0Var = new C35428d0();
            d0Var.convertFrom(rawQuery);
        }
        rawQuery.close();
        return d0Var;
    }

    /* renamed from: qq */
    public /* bridge */ /* synthetic */ boolean mo142277qq(C38666t2 t2Var) {
        return super.insert(t2Var);
    }
}
