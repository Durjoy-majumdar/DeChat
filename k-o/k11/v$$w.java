package k11;

import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingUI;

public final /* synthetic */ class v$$w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CleanChattingUI f290528d;

    public /* synthetic */ v$$w(CleanChattingUI cleanChattingUI) {
        this.f290528d = cleanChattingUI;
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0121 A[SYNTHETIC, Splitter:B:56:0x0121] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x017a A[SYNTHETIC, Splitter:B:78:0x017a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r26 = this;
            r1 = r26
            com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingUI r2 = r1.f290528d
            long[] r0 = com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingUI.f267888D
            long[] r0 = r2.mo127432H7()
            java.lang.String r3 = ""
            java.lang.String r4 = "MicroMsg.CleanChattingUI"
            long r5 = java.lang.System.currentTimeMillis()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r8 = 0
            j11.e r9 = j11.C98896e.wx0()     // Catch:{ Exception -> 0x0170 }
            long r9 = r9.f289910h     // Catch:{ Exception -> 0x0170 }
            r11 = 0
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x002e
            long r9 = h11.C98311d.m127052a()     // Catch:{ Exception -> 0x0170 }
            j11.e r13 = j11.C98896e.wx0()     // Catch:{ Exception -> 0x0170 }
            r13.f289910h = r9     // Catch:{ Exception -> 0x0170 }
        L_0x002e:
            java.lang.Class<f62.k0> r13 = f62.C75700k0.class
            k40.a r13 = f40.C86709a0.m107533q(r13)     // Catch:{ Exception -> 0x0170 }
            f62.k0 r13 = (f62.C75700k0) r13     // Catch:{ Exception -> 0x0170 }
            g62.l r13 = r13.mo96095LE()     // Catch:{ Exception -> 0x0170 }
            r14 = r0[r8]     // Catch:{ Exception -> 0x0170 }
            r11 = 1
            r18 = r9
            r8 = r0[r11]     // Catch:{ Exception -> 0x0170 }
            com.tencent.mm.storage.g4 r13 = (com.tencent.p014mm.storage.C72972g4) r13     // Catch:{ Exception -> 0x0170 }
            android.database.Cursor r8 = r13.mo101060CP(r14, r8)     // Catch:{ Exception -> 0x0170 }
            r9 = 0
            r13 = 0
        L_0x004a:
            boolean r14 = r8.moveToNext()     // Catch:{ all -> 0x0174 }
            if (r14 == 0) goto L_0x008b
            k11.u r14 = new k11.u     // Catch:{ all -> 0x0085 }
            r14.<init>()     // Catch:{ all -> 0x0085 }
            r12 = 0
            java.lang.String r15 = r8.getString(r12)     // Catch:{ all -> 0x0085 }
            r14.f290496a = r15     // Catch:{ all -> 0x0085 }
            int r15 = r8.getInt(r11)     // Catch:{ all -> 0x0085 }
            if (r15 <= 0) goto L_0x006d
            long[] r12 = r14.f290497b     // Catch:{ all -> 0x0085 }
            r22 = r12
            long r11 = (long) r15     // Catch:{ all -> 0x0085 }
            long r11 = r11 * r18
            r21 = 0
            r22[r21] = r11     // Catch:{ all -> 0x0085 }
        L_0x006d:
            long[] r11 = r14.f290498c     // Catch:{ all -> 0x0085 }
            r12 = 2
            long r22 = r8.getLong(r12)     // Catch:{ all -> 0x0085 }
            r12 = 0
            r11[r12] = r22     // Catch:{ all -> 0x0085 }
            java.lang.String r11 = r14.f290496a     // Catch:{ all -> 0x0085 }
            r7.put(r11, r14)     // Catch:{ all -> 0x0085 }
            long[] r11 = r14.f290497b     // Catch:{ all -> 0x0085 }
            r20 = r11[r12]     // Catch:{ all -> 0x0085 }
            long r9 = r9 + r20
            int r13 = r13 + r15
            r11 = 1
            goto L_0x004a
        L_0x0085:
            r0 = move-exception
            r1 = r0
            r24 = r2
            goto L_0x0178
        L_0x008b:
            r8.close()     // Catch:{ Exception -> 0x0170 }
            r8 = 5
            wy0.a r11 = wy0.C102506a.f301832a     // Catch:{ NullPointerException -> 0x0132 }
            yy0.b r11 = r11.mo142120e()     // Catch:{ NullPointerException -> 0x0132 }
            r12 = 0
            r14 = r0[r12]     // Catch:{ NullPointerException -> 0x0132 }
            r19 = r13
            r18 = 1
            r12 = r0[r18]     // Catch:{ NullPointerException -> 0x012e }
            android.database.Cursor r11 = r11.mo142700kD(r14, r12)     // Catch:{ NullPointerException -> 0x012e }
            r16 = 0
        L_0x00a4:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x0119 }
            if (r0 == 0) goto L_0x010d
            r12 = 0
            java.lang.String r0 = r11.getString(r12)     // Catch:{ all -> 0x0119 }
            java.lang.Object r13 = r7.get(r0)     // Catch:{ all -> 0x0119 }
            k11.u r13 = (k11.C99086u) r13     // Catch:{ all -> 0x0119 }
            if (r13 != 0) goto L_0x00c1
            k11.u r13 = new k11.u     // Catch:{ all -> 0x0119 }
            r13.<init>()     // Catch:{ all -> 0x0119 }
            r13.f290496a = r0     // Catch:{ all -> 0x0119 }
            r7.put(r0, r13)     // Catch:{ all -> 0x0119 }
        L_0x00c1:
            r0 = 0
        L_0x00c2:
            if (r0 >= r8) goto L_0x00f5
            long[] r14 = r13.f290497b     // Catch:{ all -> 0x0119 }
            r22 = r14[r0]     // Catch:{ all -> 0x0119 }
            int r15 = r0 + 1
            long r24 = r11.getLong(r15)     // Catch:{ all -> 0x0119 }
            long r22 = r22 + r24
            r14[r0] = r22     // Catch:{ all -> 0x0119 }
            long[] r14 = r13.f290498c     // Catch:{ all -> 0x0119 }
            int r12 = r0 + 6
            r22 = r9
            long r8 = r11.getLong(r12)     // Catch:{ all -> 0x00f1 }
            long[] r10 = r13.f290498c     // Catch:{ all -> 0x00f1 }
            r24 = r2
            r1 = r10[r0]     // Catch:{ all -> 0x010b }
            long r1 = java.lang.Math.max(r8, r1)     // Catch:{ all -> 0x010b }
            r14[r0] = r1     // Catch:{ all -> 0x010b }
            r1 = r26
            r0 = r15
            r9 = r22
            r2 = r24
            r8 = 5
            goto L_0x00c2
        L_0x00f1:
            r0 = move-exception
            r24 = r2
            goto L_0x011e
        L_0x00f5:
            r24 = r2
            r22 = r9
            long[] r0 = r13.f290497b     // Catch:{ all -> 0x010b }
            r1 = 1
            r8 = r0[r1]     // Catch:{ all -> 0x010b }
            long r16 = r16 + r8
            r1 = 0
            r8 = r0[r1]     // Catch:{ all -> 0x010b }
            long r9 = r22 + r8
            r1 = r26
            r2 = r24
            r8 = 5
            goto L_0x00a4
        L_0x010b:
            r0 = move-exception
            goto L_0x011e
        L_0x010d:
            r24 = r2
            r22 = r9
            r11.close()     // Catch:{ NullPointerException -> 0x0117 }
            r9 = r22
            goto L_0x013f
        L_0x0117:
            r0 = move-exception
            goto L_0x012b
        L_0x0119:
            r0 = move-exception
            r24 = r2
            r22 = r9
        L_0x011e:
            r1 = r0
            if (r11 == 0) goto L_0x012a
            r11.close()     // Catch:{ all -> 0x0125 }
            goto L_0x012a
        L_0x0125:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)     // Catch:{ NullPointerException -> 0x0117 }
        L_0x012a:
            throw r1     // Catch:{ NullPointerException -> 0x0117 }
        L_0x012b:
            r9 = r22
            goto L_0x0139
        L_0x012e:
            r0 = move-exception
            r24 = r2
            goto L_0x0137
        L_0x0132:
            r0 = move-exception
            r24 = r2
            r19 = r13
        L_0x0137:
            r16 = 0
        L_0x0139:
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0184 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r3, r2)     // Catch:{ Exception -> 0x0184 }
        L_0x013f:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0184 }
            long r0 = r0 - r5
            r2 = 4
            java.lang.Long[] r2 = new java.lang.Long[r2]     // Catch:{ Exception -> 0x0184 }
            java.lang.Long r5 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x0184 }
            r6 = 0
            r2[r6] = r5     // Catch:{ Exception -> 0x0184 }
            java.lang.Long r5 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x0184 }
            r6 = 1
            r2[r6] = r5     // Catch:{ Exception -> 0x0184 }
            r13 = r19
            long r5 = (long) r13     // Catch:{ Exception -> 0x0184 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0184 }
            r6 = 2
            r2[r6] = r5     // Catch:{ Exception -> 0x0184 }
            r5 = 3
            int r6 = r7.size()     // Catch:{ Exception -> 0x0184 }
            long r8 = (long) r6     // Catch:{ Exception -> 0x0184 }
            java.lang.Long r6 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x0184 }
            r2[r5] = r6     // Catch:{ Exception -> 0x0184 }
            r5 = 5
            wy0.C102506a.m135309i(r5, r0, r2)     // Catch:{ Exception -> 0x0184 }
            goto L_0x018b
        L_0x0170:
            r0 = move-exception
            r24 = r2
            goto L_0x0185
        L_0x0174:
            r0 = move-exception
            r24 = r2
            r1 = r0
        L_0x0178:
            if (r8 == 0) goto L_0x0183
            r8.close()     // Catch:{ all -> 0x017e }
            goto L_0x0183
        L_0x017e:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)     // Catch:{ Exception -> 0x0184 }
        L_0x0183:
            throw r1     // Catch:{ Exception -> 0x0184 }
        L_0x0184:
            r0 = move-exception
        L_0x0185:
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r3, r1)
        L_0x018b:
            r1 = r24
            r1.f267909u = r7
            r1.mo127435K7()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k11.v$$w.run():void");
    }
}
