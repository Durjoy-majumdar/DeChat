package com.tencent.p014mm.storage;

import android.database.Cursor;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: com.tencent.mm.storage.b */
public class C30722b extends MAutoStorage<C30719a> {

    /* renamed from: e */
    public static final String[] f82633e = {MAutoStorage.getCreateSQLs(C30719a.f82628B, "ABTestInfo")};

    /* renamed from: d */
    public ISQLiteDatabase f82634d;

    public C30722b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C30719a.f82628B, "ABTestInfo", (String[]) null);
        this.f82634d = iSQLiteDatabase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0041 A[SYNTHETIC] */
    /* renamed from: Lo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo57618Lo(java.util.List<com.tencent.p014mm.storage.C30719a> r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r0.f82634d
            java.util.Locale r4 = java.util.Locale.US
            r5 = 3
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r7 = "endTime"
            r8 = 0
            r6[r8] = r7
            r9 = 1
            r6[r9] = r7
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 2
            r6[r2] = r1
            java.lang.String r1 = "%s<>0 and %s<%d"
            java.lang.String r1 = java.lang.String.format(r4, r1, r6)
            r4 = 0
            java.lang.String r6 = "ABTestInfo"
            r3.delete(r6, r1, r4)
            r1 = r19
            if (r9 != r1) goto L_0x003c
            com.tencent.mm.storage.a r1 = new com.tencent.mm.storage.a
            r1.<init>()
            r1.field_prioritylevel = r9
            java.lang.String r3 = "prioritylevel"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            r0.delete(r1, (boolean) r8, (java.lang.String[]) r3)
        L_0x003c:
            java.util.Iterator r1 = r18.iterator()
            r3 = 0
        L_0x0041:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0108
            java.lang.Object r4 = r1.next()
            com.tencent.mm.storage.a r4 = (com.tencent.p014mm.storage.C30719a) r4
            java.lang.String r6 = "MicroMsg.ABTestInfoStorage"
            if (r4 == 0) goto L_0x00fd
            java.lang.String r7 = r4.field_abtestkey
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 == 0) goto L_0x005b
            goto L_0x00fd
        L_0x005b:
            com.tencent.mm.storage.a r7 = new com.tencent.mm.storage.a
            r7.<init>()
            java.lang.String r10 = r4.field_abtestkey
            r7.field_abtestkey = r10
            java.lang.String[] r10 = new java.lang.String[r8]
            boolean r10 = super.get(r7, (java.lang.String[]) r10)
            if (r10 != 0) goto L_0x0083
            boolean r7 = super.insertNotify(r4, r8)
            java.lang.Object[] r10 = new java.lang.Object[r2]
            java.lang.String r4 = r4.field_abtestkey
            r10[r8] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r7)
            r10[r9] = r4
            java.lang.String r4 = "Inserted: %s, Result: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r10)
            goto L_0x0103
        L_0x0083:
            long r10 = r4.field_sequence
            long r12 = r7.field_sequence
            r14 = 5
            r15 = 4
            int r16 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r16 <= 0) goto L_0x0093
            int r10 = r4.field_prioritylevel
            int r11 = r7.field_prioritylevel
            if (r10 == r11) goto L_0x0099
        L_0x0093:
            int r10 = r4.field_prioritylevel
            int r11 = r7.field_prioritylevel
            if (r10 <= r11) goto L_0x00d3
        L_0x0099:
            java.lang.String[] r10 = new java.lang.String[r8]
            boolean r10 = super.updateNotify(r4, r8, r10)
            r11 = 6
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.String r12 = r4.field_abtestkey
            r11[r8] = r12
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r10)
            r11[r9] = r12
            long r12 = r7.field_sequence
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r11[r2] = r12
            long r12 = r4.field_sequence
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r11[r5] = r12
            int r7 = r7.field_prioritylevel
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r11[r15] = r7
            int r4 = r4.field_prioritylevel
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r11[r14] = r4
            java.lang.String r4 = "Updated: %s, Result: %b, Seq: %d, %d, PriorityLV: %d, %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r11)
            r7 = r10
            goto L_0x0103
        L_0x00d3:
            java.lang.Object[] r10 = new java.lang.Object[r14]
            java.lang.String r11 = r4.field_abtestkey
            r10[r8] = r11
            java.lang.Long r11 = java.lang.Long.valueOf(r12)
            r10[r9] = r11
            long r11 = r4.field_sequence
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r10[r2] = r11
            int r7 = r7.field_prioritylevel
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10[r5] = r7
            int r4 = r4.field_prioritylevel
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r10[r15] = r4
            java.lang.String r4 = "Ignored: %s, Seq: %d, %d, PriorityLV: %d, %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r10)
            goto L_0x0102
        L_0x00fd:
            java.lang.String r4 = "saveIfNecessary, Invalid item"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)
        L_0x0102:
            r7 = 0
        L_0x0103:
            if (r7 == 0) goto L_0x0041
            r3 = 1
            goto L_0x0041
        L_0x0108:
            if (r3 == 0) goto L_0x010f
            java.lang.String r1 = "event_updated"
            r0.doNotify(r1)
        L_0x010f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C30722b.mo57618Lo(java.util.List, int):void");
    }

    /* renamed from: jo */
    public String mo57619jo() {
        Cursor all = getAll();
        if (all == null) {
            return "null cursor!!";
        }
        if (!all.moveToFirst()) {
            all.close();
            return "cursor empty!!";
        }
        StringBuilder sb = new StringBuilder();
        C30719a aVar = new C30719a();
        do {
            sb.append("============\n");
            aVar.convertFrom(all);
            sb.append("abtestkey = ");
            sb.append(aVar.field_abtestkey);
            sb.append("\n");
            sb.append("sequence = ");
            sb.append(aVar.field_sequence);
            sb.append("\n");
            sb.append("priorityLV = ");
            sb.append(aVar.field_prioritylevel);
            sb.append("\n");
            sb.append("expId = ");
            sb.append(aVar.field_expId);
            sb.append("\n");
        } while (all.moveToNext());
        all.close();
        return sb.toString();
    }
}
