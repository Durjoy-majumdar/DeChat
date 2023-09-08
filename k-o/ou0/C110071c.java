package ou0;

/* renamed from: ou0.c */
public class C110071c extends C110066a {
    /* renamed from: b0 */
    public boolean mo107365b0(boolean z) {
        return mo161489d0(z, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d6, code lost:
        if (r10 > 0) goto L_0x00da;
     */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo161489d0(boolean r9, boolean r10) {
        /*
            r8 = this;
            android.media.AudioManager r0 = r8.f329358h
            int r0 = r0.getMode()
            pu0.b$a r1 = pu0.C110248b.f329777h
            java.lang.String r2 = "music"
            boolean r2 = r1.mo161660e(r2)
            r3 = 0
            java.lang.String r4 = "MicroMsg.BaseMusicAudioManager"
            if (r2 != 0) goto L_0x0022
            java.lang.String r2 = "openvoice"
            boolean r2 = r1.mo161660e(r2)
            if (r2 != 0) goto L_0x0022
            java.lang.String r9 = "current not running a type as MUSIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
            return r3
        L_0x0022:
            r2 = 2
            java.lang.Object[] r5 = new java.lang.Object[r2]
            boolean r6 = r1.mo161667l()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r5[r3] = r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r9)
            r7 = 1
            r5[r7] = r6
            java.lang.String r6 = "dkbt shiftSpeaker:%b -> %b  "
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r4, r6, r5)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.PhoneStatusWatcher.isCalling()
            if (r5 == 0) goto L_0x0050
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r9[r3] = r10
            java.lang.String r10 = "shiftSpeaker return when calling Mode:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r4, r10, r9)
            return r3
        L_0x0050:
            r0 = 0
            if (r10 != 0) goto L_0x0066
            boolean r10 = r1.mo161665j()
            if (r10 != 0) goto L_0x005d
            boolean r10 = r8.f329354d
            if (r10 == 0) goto L_0x0066
        L_0x005d:
            java.lang.String r9 = "dkbt shiftSpeaker isBluetoothOn"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
            ou0.C110066a.m149592a0(r8, r3, r0, r2, r0)
            return r3
        L_0x0066:
            gj.c r10 = p156gj.C107835h0.f322846c
            boolean r4 = r10.f322730a
            if (r4 == 0) goto L_0x00f1
            int r10 = r10.f322743g
            if (r10 < 0) goto L_0x0072
            r4 = 1
            goto L_0x0073
        L_0x0072:
            r4 = 0
        L_0x0073:
            if (r4 == 0) goto L_0x00f1
            java.lang.String r1 = "VoipAudioInfo"
            if (r9 == 0) goto L_0x00b5
            if (r10 < 0) goto L_0x007d
            r4 = 1
            goto L_0x007e
        L_0x007d:
            r4 = 0
        L_0x007e:
            if (r4 == 0) goto L_0x009e
            r10 = r10 & 16
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "enableSpeaker "
            r4.append(r5)
            if (r10 <= 0) goto L_0x0090
            r5 = 1
            goto L_0x0091
        L_0x0090:
            r5 = 0
        L_0x0091:
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r4)
            if (r10 <= 0) goto L_0x009e
            r3 = 1
        L_0x009e:
            if (r3 == 0) goto L_0x00a3
            super.mo18028n(r7)
        L_0x00a3:
            gj.c r10 = p156gj.C107835h0.f322846c
            int r10 = r10.mo158235i()
            if (r10 < 0) goto L_0x00f0
            gj.c r10 = p156gj.C107835h0.f322846c
            int r10 = r10.mo158235i()
            ou0.C110066a.m149592a0(r8, r10, r0, r2, r0)
            goto L_0x00f0
        L_0x00b5:
            if (r10 < 0) goto L_0x00b9
            r4 = 1
            goto L_0x00ba
        L_0x00b9:
            r4 = 0
        L_0x00ba:
            if (r4 == 0) goto L_0x00d9
            r10 = r10 & r7
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "disableSpeaker "
            r4.append(r5)
            if (r10 <= 0) goto L_0x00cb
            r5 = 1
            goto L_0x00cc
        L_0x00cb:
            r5 = 0
        L_0x00cc:
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r4)
            if (r10 <= 0) goto L_0x00d9
            goto L_0x00da
        L_0x00d9:
            r7 = 0
        L_0x00da:
            if (r7 == 0) goto L_0x00df
            super.mo18028n(r3)
        L_0x00df:
            gj.c r10 = p156gj.C107835h0.f322846c
            int r10 = r10.mo158234h()
            if (r10 < 0) goto L_0x00f0
            gj.c r10 = p156gj.C107835h0.f322846c
            int r10 = r10.mo158234h()
            ou0.C110066a.m149592a0(r8, r10, r0, r2, r0)
        L_0x00f0:
            return r9
        L_0x00f1:
            if (r9 == 0) goto L_0x00f5
            r10 = 0
            goto L_0x00f6
        L_0x00f5:
            r10 = 3
        L_0x00f6:
            ou0.a r4 = r1.mo161657b()
            boolean r4 = r4.mo157504C()
            if (r4 != 0) goto L_0x0108
            boolean r1 = r1.mo161665j()
            if (r1 == 0) goto L_0x0107
            goto L_0x0108
        L_0x0107:
            r3 = r10
        L_0x0108:
            ou0.C110066a.m149592a0(r8, r3, r0, r2, r0)
            super.mo18028n(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ou0.C110071c.mo161489d0(boolean, boolean):boolean");
    }
}
