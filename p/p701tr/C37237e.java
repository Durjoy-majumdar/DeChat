package p701tr;

import com.tencent.p014mm.storage.C44668u3;

/* renamed from: tr.e */
public class C37237e implements C44668u3.C30780c {
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a5, code lost:
        if (r5.get(r4) == null) goto L_0x00eb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNotifyChange(int r21, com.tencent.p014mm.sdk.storage.MStorageEx r22, java.lang.Object r23) {
        /*
            r20 = this;
            r0 = r21
            r1 = r23
            boolean r2 = f40.C86709a0.m107522a()
            if (r2 != 0) goto L_0x000b
            return
        L_0x000b:
            java.lang.Class<dv1.m> r2 = dv1.C58435m.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            dv1.m r2 = (dv1.C58435m) r2
            r2.getClass()
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L_0x0119
            r3 = 5
            if (r0 == r3) goto L_0x0020
            r3 = 4
            if (r0 != r3) goto L_0x0119
        L_0x0020:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            r0.append(r3)
            java.lang.String r4 = "@wxcontact"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.Class<f62.k0> r5 = f62.C75700k0.class
            k40.a r5 = f40.C86709a0.m107533q(r5)
            f62.k0 r5 = (f62.C75700k0) r5
            com.tencent.mm.storage.u3 r5 = r5.mo96097Ni()
            java.lang.String r6 = ""
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r6)
            com.tencent.mm.storage.z1 r3 = r5.get(r3)
            if (r3 != 0) goto L_0x004e
            goto L_0x0119
        L_0x004e:
            boolean r5 = r3.mo62927s3()
            if (r5 == 0) goto L_0x005c
            boolean r5 = r3.mo62920o3()
            if (r5 != 0) goto L_0x005c
            goto L_0x0119
        L_0x005c:
            fv1.a r5 = fv1.C32183a.f85554d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r3.getUsername()
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.getClass()
            java.lang.String r5 = "forcePushId"
            gy3.C87412m.m108594g(r4, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "isHasSetForceNotify("
            r5.append(r6)
            r5.append(r4)
            r6 = 41
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "MicroMsg.ForceNotifyStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, ev1.h> r5 = fv1.C32183a.f85556f
            boolean r7 = r5.isEmpty()
            r8 = 2
            r9 = 0
            r10 = 1
            if (r7 != 0) goto L_0x00a8
            java.lang.Object r4 = r5.get(r4)
            ev1.h r4 = (ev1.C31726h) r4
            if (r4 != 0) goto L_0x00e4
            goto L_0x00eb
        L_0x00a8:
            zh3.f r11 = fv1.C32183a.f85555e
            java.lang.String r5 = "*"
            java.lang.String[] r13 = new java.lang.String[]{r5}
            java.lang.String[] r15 = new java.lang.String[r10]
            r15[r9] = r4
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 2
            java.lang.String r12 = "ForceNotifyData"
            java.lang.String r14 = "ForcePushId=?"
            android.database.Cursor r5 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)
            r7 = 0
            gy3.C87412m.m108591d(r5)     // Catch:{ all -> 0x0110 }
            boolean r11 = r5.moveToFirst()     // Catch:{ all -> 0x0110 }
            if (r11 == 0) goto L_0x00e6
            ev1.h r11 = new ev1.h     // Catch:{ all -> 0x0110 }
            r11.<init>()     // Catch:{ all -> 0x0110 }
            r11.convertFrom(r5)     // Catch:{ all -> 0x0110 }
            java.lang.String r12 = "[isHasSetForceNotify] id:%s %s"
            java.lang.Object[] r13 = new java.lang.Object[r8]     // Catch:{ all -> 0x0110 }
            r13[r9] = r4     // Catch:{ all -> 0x0110 }
            r13[r10] = r11     // Catch:{ all -> 0x0110 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r12, r13)     // Catch:{ all -> 0x0110 }
            cy3.C58003b.m67160a(r5, r7)
        L_0x00e4:
            r4 = 1
            goto L_0x00ec
        L_0x00e6:
            rx3.b0 r4 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0110 }
            cy3.C58003b.m67160a(r5, r7)
        L_0x00eb:
            r4 = 0
        L_0x00ec:
            java.lang.String r5 = r2.f167403f
            java.lang.Object[] r6 = new java.lang.Object[r8]
            r6[r9] = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r6[r10] = r1
            java.lang.String r1 = "[onNotifyChange] Delete contact[%s]  %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r6)
            if (r4 == 0) goto L_0x0119
            boolean r1 = r3.mo62920o3()
            if (r1 == 0) goto L_0x010b
            r1 = 9
            r2.mo55962W0(r0, r1)
            goto L_0x0119
        L_0x010b:
            r1 = 7
            r2.mo55962W0(r0, r1)
            goto L_0x0119
        L_0x0110:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x0113 }
        L_0x0113:
            r0 = move-exception
            r2 = r0
            cy3.C58003b.m67160a(r5, r1)
            throw r2
        L_0x0119:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p701tr.C37237e.onNotifyChange(int, com.tencent.mm.sdk.storage.MStorageEx, java.lang.Object):void");
    }
}
