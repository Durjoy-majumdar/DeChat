package com.tencent.p014mm.storage;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import p261wl.C38166b;

/* renamed from: com.tencent.mm.storage.d */
public class C30728d extends MAutoStorage<C96980c> {

    /* renamed from: e */
    public static final String[] f82645e = {MAutoStorage.getCreateSQLs(C96980c.f284120E, "ABTestItem")};

    /* renamed from: d */
    public final ISQLiteDatabase f82646d;

    public C30728d(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C96980c.f284120E, "ABTestItem", (String[]) null);
        this.f82646d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public C96980c mo57622Lo(String str) {
        C96980c cVar = new C96980c();
        cVar.field_layerId = str;
        boolean z = super.get(cVar, new String[0]);
        if (z && cVar.field_endTime == 0) {
            cVar.field_endTime = MAlarmHandler.NEXT_FIRE_INTERVAL;
        }
        Log.m105925i("MicroMsg.ABTestStorage", "getByLayerId, id: %s, return: %b", str, Boolean.valueOf(z));
        return cVar;
    }

    public void extraStepsAfterNotifying(MStorageEventData mStorageEventData) {
        C38166b.m41755b(d$$b.class, new d$$a(mStorageEventData));
    }

    /* renamed from: jo */
    public String mo57624jo() {
        Cursor all = getAll();
        if (all == null) {
            return "null cursor!!";
        }
        if (!all.moveToFirst()) {
            all.close();
            return "cursor empty!!";
        }
        StringBuilder sb = new StringBuilder();
        C96980c cVar = new C96980c();
        do {
            sb.append("============\n");
            cVar.convertFrom(all);
            sb.append("layerId = ");
            sb.append(cVar.field_layerId);
            sb.append("\n");
            sb.append("sequence = ");
            sb.append(cVar.field_sequence);
            sb.append("\n");
            sb.append("priorityLV = ");
            sb.append(cVar.field_prioritylevel);
            sb.append("\n");
            sb.append("expId = ");
            sb.append(cVar.field_expId);
            sb.append("\n");
        } while (all.moveToNext());
        all.close();
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x003f A[SYNTHETIC] */
    /* renamed from: qq */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo57625qq(java.util.List<com.tencent.p014mm.storage.C96980c> r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r0.f82646d
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
            java.lang.String r6 = "ABTestItem"
            r3.delete(r6, r1, r4)
            if (r19 != 0) goto L_0x003a
            com.tencent.mm.storage.c r1 = new com.tencent.mm.storage.c
            r1.<init>()
            r1.field_prioritylevel = r9
            java.lang.String r3 = "prioritylevel"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            r0.delete(r1, (boolean) r8, (java.lang.String[]) r3)
        L_0x003a:
            java.util.Iterator r1 = r18.iterator()
            r3 = 0
        L_0x003f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0106
            java.lang.Object r4 = r1.next()
            com.tencent.mm.storage.c r4 = (com.tencent.p014mm.storage.C96980c) r4
            java.lang.String r6 = "MicroMsg.ABTestStorage"
            if (r4 == 0) goto L_0x00fb
            java.lang.String r7 = r4.field_layerId
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 == 0) goto L_0x0059
            goto L_0x00fb
        L_0x0059:
            com.tencent.mm.storage.c r7 = new com.tencent.mm.storage.c
            r7.<init>()
            java.lang.String r10 = r4.field_layerId
            r7.field_layerId = r10
            java.lang.String[] r10 = new java.lang.String[r8]
            boolean r10 = super.get(r7, (java.lang.String[]) r10)
            if (r10 != 0) goto L_0x0081
            boolean r7 = super.insertNotify(r4, r8)
            java.lang.Object[] r10 = new java.lang.Object[r2]
            java.lang.String r4 = r4.field_layerId
            r10[r8] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r7)
            r10[r9] = r4
            java.lang.String r4 = "Inserted: %s, Result: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r10)
            goto L_0x0101
        L_0x0081:
            long r10 = r4.field_sequence
            long r12 = r7.field_sequence
            r14 = 5
            r15 = 4
            int r16 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r16 <= 0) goto L_0x0091
            int r10 = r4.field_prioritylevel
            int r11 = r7.field_prioritylevel
            if (r10 == r11) goto L_0x0097
        L_0x0091:
            int r10 = r4.field_prioritylevel
            int r11 = r7.field_prioritylevel
            if (r10 <= r11) goto L_0x00d1
        L_0x0097:
            java.lang.String[] r10 = new java.lang.String[r8]
            boolean r10 = super.updateNotify(r4, r8, r10)
            r11 = 6
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.String r12 = r4.field_layerId
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
            goto L_0x0101
        L_0x00d1:
            java.lang.Object[] r10 = new java.lang.Object[r14]
            java.lang.String r11 = r4.field_layerId
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
            goto L_0x0100
        L_0x00fb:
            java.lang.String r4 = "saveIfNecessary, Invalid item"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)
        L_0x0100:
            r7 = 0
        L_0x0101:
            if (r7 == 0) goto L_0x003f
            r3 = 1
            goto L_0x003f
        L_0x0106:
            if (r3 == 0) goto L_0x010d
            java.lang.String r1 = "event_updated"
            r0.doNotify(r1)
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C30728d.mo57625qq(java.util.List, int):void");
    }
}
