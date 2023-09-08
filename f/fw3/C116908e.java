package fw3;

import vv3.C118702d;
import yv3.C118997b;

/* renamed from: fw3.e */
public class C116908e extends C116904a {
    public C116908e(C118702d dVar, C118997b bVar) {
        super(dVar, bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0181  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo180868c(java.util.HashMap<java.lang.Integer, java.util.List<gw3.C117003g>> r21, java.util.List<gw3.C117005i> r22, java.util.List<gw3.C117004h> r23, kw3.C117428b r24) {
        /*
            r20 = this;
            r1 = r20
            r2 = r22
            r3 = r24
            java.lang.String r4 = ""
            java.lang.String r5 = "DeviceUtil"
            r6 = 0
            r7 = 1
            if (r21 == 0) goto L_0x001f
            boolean r0 = r21.isEmpty()
            if (r0 != 0) goto L_0x001f
            if (r2 == 0) goto L_0x001f
            boolean r0 = r22.isEmpty()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            r8 = 0
            if (r0 == 0) goto L_0x0029
            r0 = 107(0x6b, float:1.5E-43)
            r1.mo180870e(r0, r8, r3)
            return
        L_0x0029:
            gw3.c r9 = new gw3.c
            r9.<init>()
            vv3.d r0 = r1.f350323b
            android.content.Context r0 = r0.f355205a
            r10 = -1
            int r0 = rv3.C90101c.m112730c(r0)     // Catch:{ all -> 0x0039 }
            r11 = r0
            goto L_0x0047
        L_0x0039:
            r0 = move-exception
            r11 = r0
            boolean r0 = rv3.C118245h.f353423a
            if (r0 == 0) goto L_0x0046
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r6] = r11
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r4, r0)
        L_0x0046:
            r11 = -1
        L_0x0047:
            if (r11 != 0) goto L_0x004b
        L_0x0049:
            r0 = 0
            goto L_0x006a
        L_0x004b:
            vv3.d r0 = r1.f350323b
            android.content.Context r0 = r0.f355205a
            java.lang.String r12 = "keyguard"
            java.lang.Object r0 = r0.getSystemService(r12)     // Catch:{ all -> 0x005d }
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0     // Catch:{ all -> 0x005d }
            boolean r0 = r0.inKeyguardRestrictedInputMode()     // Catch:{ all -> 0x005d }
            r0 = r0 ^ r7
            goto L_0x006a
        L_0x005d:
            r0 = move-exception
            boolean r12 = rv3.C118245h.f353423a
            if (r12 == 0) goto L_0x0049
            java.lang.Object[] r12 = new java.lang.Object[r7]
            r12[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r4, r12)
            goto L_0x0049
        L_0x006a:
            r4 = 2
            if (r11 != 0) goto L_0x006f
            r5 = 2
            goto L_0x0070
        L_0x006f:
            r5 = 1
        L_0x0070:
            r9.f350618f = r5
            if (r0 != 0) goto L_0x0075
            r4 = 1
        L_0x0075:
            r9.f350619g = r4
            int r0 = r22.size()
            int r0 = r0 - r7
            java.lang.Object r0 = r2.get(r0)
            gw3.i r0 = (gw3.C117005i) r0
            long r4 = r0.f350646g
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r11 = "[method: buildDataUnit ] , endTouch : "
            r0.append(r11)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r11 = "sensor_SingleHandle"
            rv3.C118245h.m166799a(r11, r0)
            if (r21 == 0) goto L_0x0124
            boolean r0 = r21.isEmpty()
            if (r0 != 0) goto L_0x0124
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r12 = r21.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x00af:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0125
            java.lang.Object r13 = r12.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r13 = r13.getValue()
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L_0x0115
            boolean r14 = r13.isEmpty()
            if (r14 != 0) goto L_0x0115
            r14 = 0
            int r16 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r16 > 0) goto L_0x00d0
            goto L_0x0115
        L_0x00d0:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            int r15 = r13.size()
        L_0x00d9:
            int r15 = r15 + r10
            if (r15 < 0) goto L_0x00f4
            java.lang.Object r16 = r13.get(r15)
            r10 = r16
            gw3.g r10 = (gw3.C117003g) r10
            long r7 = r10.f350639h
            long r7 = r7 - r4
            r17 = 30
            int r19 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r19 <= 0) goto L_0x00f4
            r14.add(r10)
            r7 = 1
            r8 = 0
            r10 = -1
            goto L_0x00d9
        L_0x00f4:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "[method: filterSensor ] "
            r7.append(r8)
            int r8 = r14.size()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            rv3.C118245h.m166799a(r11, r7)
            boolean r7 = r14.isEmpty()
            if (r7 != 0) goto L_0x0115
            r13.removeAll(r14)
        L_0x0115:
            if (r13 == 0) goto L_0x0120
            boolean r7 = r13.isEmpty()
            if (r7 != 0) goto L_0x0120
            r0.addAll(r13)
        L_0x0120:
            r7 = 1
            r8 = 0
            r10 = -1
            goto L_0x00af
        L_0x0124:
            r0 = 0
        L_0x0125:
            if (r0 == 0) goto L_0x013f
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L_0x013f
            java.lang.Object r4 = r0.get(r6)
            gw3.g r4 = (gw3.C117003g) r4
            long r4 = r4.f350639h
            r9.f350616d = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            r9.f350617e = r4
            goto L_0x0145
        L_0x013f:
            long r4 = android.os.SystemClock.uptimeMillis()
            r9.f350616d = r4
        L_0x0145:
            r4 = r23
            gw3.a r0 = r1.mo180866a(r9, r2, r4)
            boolean r4 = r22.isEmpty()
            if (r4 == 0) goto L_0x0153
            r7 = 1
            goto L_0x0178
        L_0x0153:
            java.lang.Object r4 = r2.get(r6)
            gw3.i r4 = (gw3.C117005i) r4
            int r5 = r22.size()
            r7 = 1
            int r5 = r5 - r7
            java.lang.Object r2 = r2.get(r5)
            gw3.i r2 = (gw3.C117005i) r2
            long r8 = r2.f350646g
            long r4 = r4.f350646g
            long r8 = r8 - r4
            long r4 = java.lang.Math.abs(r8)
            uv3.f r2 = r1.f350324c
            long r8 = r2.f354957e
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 < 0) goto L_0x0177
            goto L_0x0178
        L_0x0177:
            r7 = 0
        L_0x0178:
            if (r7 == 0) goto L_0x0181
            r0 = 105(0x69, float:1.47E-43)
            r2 = 0
            r1.mo180870e(r0, r2, r3)
            return
        L_0x0181:
            r2 = 0
            r4 = 61440(0xf000, float:8.6096E-41)
            boolean r4 = r1.mo180869d(r0, r4)
            if (r4 == 0) goto L_0x0191
            r0 = 106(0x6a, float:1.49E-43)
            r1.mo180870e(r0, r2, r3)
            return
        L_0x0191:
            java.util.ArrayList<gw3.f> r2 = r0.f350596g
            if (r2 == 0) goto L_0x01bb
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x019c
            goto L_0x01bb
        L_0x019c:
            java.util.ArrayList<gw3.f> r2 = r0.f350596g
            java.lang.Object r2 = r2.get(r6)
            gw3.f r2 = (gw3.C117002f) r2
            if (r2 == 0) goto L_0x01bb
            java.util.ArrayList<gw3.i> r4 = r2.f350632g
            if (r4 == 0) goto L_0x01bb
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x01b1
            goto L_0x01bb
        L_0x01b1:
            fw3.d r4 = new fw3.d
            r4.<init>(r1)
            java.util.ArrayList<gw3.i> r2 = r2.f350632g
            java.util.Collections.sort(r2, r4)
        L_0x01bb:
            r1.mo180870e(r6, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fw3.C116908e.mo180868c(java.util.HashMap, java.util.List, java.util.List, kw3.b):void");
    }
}
