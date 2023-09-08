package com.tencent.p014mm.vfs;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116314o;
import java.util.Map;
import kj2.C117407d;
import zh3.C119118e;

/* renamed from: com.tencent.mm.vfs.n */
public class C106838n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Map f319829d;

    /* renamed from: e */
    public final /* synthetic */ boolean f319830e;

    /* renamed from: f */
    public final /* synthetic */ C116314o.C116315a f319831f;

    /* renamed from: com.tencent.mm.vfs.n$a */
    public class C106839a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f319832d;

        /* renamed from: e */
        public final /* synthetic */ C119118e f319833e;

        /* renamed from: f */
        public final /* synthetic */ long f319834f;

        /* renamed from: g */
        public final /* synthetic */ long f319835g;

        /* renamed from: h */
        public final /* synthetic */ long f319836h;

        public C106839a(String str, C119118e eVar, long j, long j2, long j3) {
            this.f319832d = str;
            this.f319833e = eVar;
            this.f319834f = j;
            this.f319835g = j2;
            this.f319836h = j3;
        }

        public void run() {
            long currentTimeMillis = System.currentTimeMillis();
            String str = !C106838n.this.f319830e ? "m2-before" : "m-before";
            C117407d dVar = C117407d.INSTANCE;
            dVar.mo160131h(25824, this.f319832d, this.f319833e.mo183817j(), Long.valueOf(this.f319834f), 0, Long.valueOf(this.f319835g), str, 0, Long.valueOf(this.f319836h), 0, 0, 0, 1, 0);
            boolean x = this.f319833e.mo183826x();
            Log.m105924i("VFS.DiskFileStatistics", "vacuumRet = " + x);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            long f = this.f319833e.mo183813f();
            C117407d dVar2 = dVar;
            long j = (this.f319834f - this.f319835g) / currentTimeMillis2;
            String str2 = !C106838n.this.f319830e ? "m2-" : "m-";
            dVar2.mo160131h(25824, this.f319832d, this.f319833e.mo183817j(), Long.valueOf(this.f319834f), 0, Long.valueOf(this.f319835g), str2 + x, Long.valueOf(f), Long.valueOf(this.f319836h), Long.valueOf(this.f319834f - f), Long.valueOf(currentTimeMillis2), 0, 1, Long.valueOf(j));
        }
    }

    public C106838n(C116314o.C116315a aVar, Map map, boolean z) {
        this.f319831f = aVar;
        this.f319829d = map;
        this.f319830e = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0163  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r24 = this;
            r11 = r24
            org.json.JSONArray r12 = new org.json.JSONArray
            r12.<init>()
            java.util.Map r0 = r11.f319829d
            java.util.Collection r0 = r0.values()
            java.util.Iterator r13 = r0.iterator()
        L_0x0011:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0170
            java.lang.Object r0 = r13.next()
            r4 = r0
            zh3.e r4 = (zh3.C119118e) r4
            if (r4 == 0) goto L_0x016c
            boolean r0 = r4.mo183820o()
            if (r0 != 0) goto L_0x0027
            goto L_0x0011
        L_0x0027:
            java.lang.String r0 = r4.mo183817j()
            java.lang.String r1 = r4.mo183817j()
            java.lang.String r2 = "/"
            int r1 = r1.lastIndexOf(r2)
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)
            long r14 = r4.mo183814g()
            long r5 = r4.mo183813f()
            long r9 = r5 - r14
            long r5 = r4.mo183816i()
            long r7 = r14 / r5
            long r5 = r4.mo183813f()
            java.lang.String r1 = "EnMicroMsg.db"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0069
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r3 = "daily_storage_main_db"
            r1.encode((java.lang.String) r3, (long) r5)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r3 = "daily_storage_main_db_real_data"
            r1.encode((java.lang.String) r3, (long) r9)
        L_0x0069:
            com.tencent.mm.vfs.o$a r1 = r11.f319831f
            r1.getClass()
            oa1.d r1 = oa1.C117731d.m166007c()
            r3 = 0
            r16 = r7
            java.lang.String r7 = "clicfg_vacuum_maintenance_1"
            boolean r1 = r1.mo182445g(r7, r3, r2)
            oa1.d r7 = oa1.C117731d.m166007c()
            java.lang.String r8 = "clicfg_vacuum_maintenance_2"
            boolean r7 = r7.mo182445g(r8, r3, r2)
            oa1.d r8 = oa1.C117731d.m166007c()
            r18 = r13
            java.lang.String r13 = "clicfg_vacuum_maintenance_3"
            boolean r8 = r8.mo182445g(r13, r3, r2)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r2 = "willVacuumOnMaintenance, s1 = "
            r13.append(r2)
            r13.append(r1)
            java.lang.String r2 = ", s2 = "
            r13.append(r2)
            r13.append(r7)
            java.lang.String r2 = ", s3 = "
            r13.append(r2)
            r13.append(r8)
            java.lang.String r2 = r13.toString()
            java.lang.String r13 = "VFS.DiskFileStatistics"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)
            r20 = 209715200(0xc800000, double:1.036130757E-315)
            if (r1 != 0) goto L_0x00c1
            if (r7 != 0) goto L_0x00c1
            if (r8 != 0) goto L_0x00c1
            goto L_0x00db
        L_0x00c1:
            r22 = 0
            if (r1 == 0) goto L_0x00c8
            r22 = 52428800(0x3200000, double:2.5903269E-316)
        L_0x00c8:
            if (r7 == 0) goto L_0x00cd
            r22 = 104857600(0x6400000, double:5.1806538E-316)
        L_0x00cd:
            if (r8 == 0) goto L_0x00d1
            r22 = r20
        L_0x00d1:
            int r1 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
            if (r1 >= 0) goto L_0x00db
            int r1 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r1 < 0) goto L_0x00db
            r2 = 1
            goto L_0x00dc
        L_0x00db:
            r2 = 0
        L_0x00dc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "saveDBFreeListAndVacuum, dbRealDataSize = "
            r1.append(r3)
            r1.append(r9)
            java.lang.String r3 = ", freeListStorageSize = "
            r1.append(r3)
            r1.append(r14)
            java.lang.String r3 = ", willVacuum = "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)
            if (r2 == 0) goto L_0x011f
            zt3.t r19 = zt3.C119157j.f356862d
            com.tencent.mm.vfs.n$a r7 = new com.tencent.mm.vfs.n$a
            r1 = r7
            r2 = r24
            r3 = r0
            r22 = r12
            r11 = r16
            r16 = r13
            r13 = r7
            r7 = r14
            r1.<init>(r3, r4, r5, r7, r9)
            r1 = r19
            zt3.j r1 = (zt3.C119157j) r1
            java.lang.String r2 = "VacuumOnMaintenance"
            r1.mo183885p(r13, r2)
            goto L_0x0125
        L_0x011f:
            r22 = r12
            r11 = r16
            r16 = r13
        L_0x0125:
            int r1 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r1 <= 0) goto L_0x0163
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "name"
            r1.put(r2, r0)     // Catch:{ JSONException -> 0x0145 }
            java.lang.String r0 = "freeListCount"
            r1.put(r0, r11)     // Catch:{ JSONException -> 0x0145 }
            java.lang.String r0 = "freeListStorageSize"
            r1.put(r0, r14)     // Catch:{ JSONException -> 0x0145 }
            r2 = r22
            r2.put(r1)     // Catch:{ JSONException -> 0x0143 }
            goto L_0x0165
        L_0x0143:
            r0 = move-exception
            goto L_0x0148
        L_0x0145:
            r0 = move-exception
            r2 = r22
        L_0x0148:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "saveDBFreeList jsonArray Failed, e = "
            r1.append(r3)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x0165
        L_0x0163:
            r2 = r22
        L_0x0165:
            r11 = r24
            r12 = r2
            r13 = r18
            goto L_0x0011
        L_0x016c:
            r11 = r24
            goto L_0x0011
        L_0x0170:
            r1 = r11
            r2 = r12
            boolean r0 = r1.f319830e
            if (r0 != 0) goto L_0x0179
            java.lang.String r0 = "extreme_storage_free_list_2"
            goto L_0x017b
        L_0x0179:
            java.lang.String r0 = "extreme_storage_free_list"
        L_0x017b:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r2 = r2.toString()
            r3.encode((java.lang.String) r0, (java.lang.String) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.C106838n.run():void");
    }
}
