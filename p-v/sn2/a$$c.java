package sn2;

import p375qh.C110390f;

public class a$$c implements C110390f.C89659b {

    /* renamed from: a */
    public final /* synthetic */ C22370a f63422a;

    public a$$c(C22370a aVar) {
        this.f63422a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x006e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35508a(byte[] r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sn2.a r2 = r0.f63422a
            sn2.m r2 = r2.f63410o
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0076
            java.lang.String r7 = "data"
            gy3.C87412m.m108594g(r1, r7)
            if (r18 == 0) goto L_0x0060
            int r7 = r18 / 2
            short[] r8 = new short[r7]
            r9 = 0
        L_0x001a:
            if (r9 >= r7) goto L_0x0030
            int r10 = r9 * 2
            byte r11 = r1[r10]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r10 = r10 + r6
            byte r10 = r1[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 8
            r10 = r10 | r11
            short r10 = (short) r10
            r8[r9] = r10
            int r9 = r9 + 1
            goto L_0x001a
        L_0x0030:
            r9 = 0
            r11 = 0
        L_0x0033:
            if (r11 >= r7) goto L_0x003e
            short r12 = r8[r11]
            int r12 = r12 * r12
            double r12 = (double) r12
            double r9 = r9 + r12
            int r11 = r11 + 1
            goto L_0x0033
        L_0x003e:
            double r7 = (double) r7
            double r9 = r9 / r7
            double r7 = java.lang.Math.sqrt(r9)
            r9 = 4632233691727265792(0x4049000000000000, double:50.0)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x004b
            goto L_0x0060
        L_0x004b:
            r9 = 4643985272004935680(0x4072c00000000000, double:300.0)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x0056
            r7 = 1
            goto L_0x0061
        L_0x0056:
            r9 = 4650248090236747776(0x4089000000000000, double:800.0)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x005e
            r7 = 2
            goto L_0x0061
        L_0x005e:
            r7 = 3
            goto L_0x0061
        L_0x0060:
            r7 = 0
        L_0x0061:
            com.tencent.mm.plugin.shake.ui.ShakeReportUI$$f r2 = (com.tencent.p014mm.plugin.shake.p103ui.ShakeReportUI$$f) r2
            com.tencent.mm.plugin.shake.ui.ShakeReportUI r2 = r2.f54197a
            java.lang.Boolean r8 = r2.f54098T
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x006e
            goto L_0x0076
        L_0x006e:
            com.tencent.mm.plugin.shake.ui.ShakeReportUI$$g r8 = new com.tencent.mm.plugin.shake.ui.ShakeReportUI$$g
            r8.<init>(r2, r7)
            js0.C88024r.m109572b(r8)
        L_0x0076:
            int r2 = r1.length
            java.lang.String r7 = "MicroMsg.MusicAndSingRecorder"
            if (r2 > 0) goto L_0x009e
            java.lang.Object[] r2 = new java.lang.Object[r6]
            int r1 = r1.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r4] = r1
            java.lang.String r1 = "pcm data is <= 0, length: %d, maxLength: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r1, r2)
            sn2.a r1 = r0.f63422a
            r1.mo35504a()
            sn2.a r1 = r0.f63422a
            r2 = 0
            r1.getClass()
            sn2.a$$b r3 = new sn2.a$$b
            r3.<init>(r1, r2)
            js0.C88024r.m109572b(r3)
            return
        L_0x009e:
            sn2.a r2 = r0.f63422a
            int r8 = r2.f63412q
            int r9 = r8 + r18
            int r2 = r2.f63403e
            if (r9 < r2) goto L_0x00cf
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r2[r4] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r18)
            r2[r6] = r3
            sn2.a r3 = r0.f63422a
            int r3 = r3.f63403e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r5] = r3
            java.lang.String r3 = "pcm data is too max, length: %d, pcm length: %d, maxLength: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r3, r2)
            sn2.a r2 = r0.f63422a
            int r3 = r2.f63403e
            int r2 = r2.f63412q
            int r2 = r3 - r2
            goto L_0x00d1
        L_0x00cf:
            r2 = r18
        L_0x00d1:
            java.lang.Object[] r3 = new java.lang.Object[r6]
            sn2.a r8 = r0.f63422a
            int r8 = r8.f63412q
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r3[r4] = r8
            java.lang.String r8 = "before copy currentPosition: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r3)
            sn2.a r3 = r0.f63422a
            int r8 = r3.f63412q
            int r8 = r8 + r2
            int r9 = r3.f63403e
            if (r8 > r9) goto L_0x00fc
            byte[] r3 = r3.f63411p
            sn2.a r8 = r0.f63422a
            int r8 = r8.f63412q
            java.lang.System.arraycopy(r1, r4, r3, r8, r2)
            sn2.a r1 = r0.f63422a
            int r3 = r1.f63412q
            int r3 = r3 + r2
            r1.f63412q = r3
            goto L_0x0101
        L_0x00fc:
            java.lang.String r1 = "data copy refuse, is too long"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
        L_0x0101:
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            sn2.a r3 = r0.f63422a
            long r8 = r3.f63405g
            long r13 = r1 - r8
            java.lang.Object[] r1 = new java.lang.Object[r5]
            int r2 = r3.f63412q
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r4] = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r13)
            r1[r6] = r2
            java.lang.String r2 = "after copy currentPosition: %d, duration: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r2, r1)
            sn2.a r1 = r0.f63422a
            int r2 = r1.f63406h
            long r2 = (long) r2
            int r8 = r1.f63402d
            long r8 = (long) r8
            long r2 = r2 * r8
            int r8 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r8 < 0) goto L_0x019a
            boolean r1 = r1.f63407i
            if (r1 != 0) goto L_0x019a
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Long r2 = java.lang.Long.valueOf(r13)
            r1[r4] = r2
            sn2.a r2 = r0.f63422a
            int r2 = r2.f63406h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r6] = r2
            java.lang.String r2 = "duration is reach，duration: %d, rangeTime: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r2, r1)
            sn2.a r1 = r0.f63422a
            int r2 = r1.f63412q
            byte[] r12 = new byte[r2]
            byte[] r1 = r1.f63411p
            sn2.a r2 = r0.f63422a
            int r2 = r2.f63412q
            java.lang.System.arraycopy(r1, r4, r12, r4, r2)
            r1 = 11000(0x2af8, double:5.4347E-320)
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0170
            sn2.a r1 = r0.f63422a
            r1.f63407i = r6
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Long r2 = java.lang.Long.valueOf(r13)
            r1[r4] = r2
            java.lang.String r2 = "record time is max, duration: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r2, r1)
        L_0x0170:
            sn2.a r11 = r0.f63422a
            int r15 = r11.f63406h
            int r1 = r15 + 1
            r11.f63406h = r1
            com.tencent.mm.sdk.platformtools.MMHandlerThread r1 = f40.C86709a0.m107525e()
            sn2.a$$a r2 = new sn2.a$$a
            r10 = r2
            r10.<init>(r11, r12, r13, r15)
            r1.postToWorker(r2)
            sn2.a r1 = r0.f63422a
            r1.f63412q = r4
            int r2 = r1.f63403e
            byte[] r2 = new byte[r2]
            r1.f63411p = r2
            sn2.a r1 = r0.f63422a
            boolean r1 = r1.f63407i
            if (r1 == 0) goto L_0x019a
            sn2.a r1 = r0.f63422a
            r1.mo35504a()
        L_0x019a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sn2.a$$c.mo35508a(byte[], int):void");
    }

    /* renamed from: b */
    public void mo35509b(int i, int i2) {
    }
}
