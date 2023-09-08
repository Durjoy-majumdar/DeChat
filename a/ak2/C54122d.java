package ak2;

import gy3.C87412m;
import nj2.C109749c;
import nj2.C61759g;

/* renamed from: ak2.d */
public final class C54122d extends C54119a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54122d(C61759g gVar) {
        super(gVar);
        C87412m.m108594g(gVar, "helper");
        this.f151967b = C109749c.C61756a.MULTITALK;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0124, code lost:
        if (r11.equals("end") == false) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012d, code lost:
        if (r11.equals("bad_net") == false) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return mo74908a(r12.getInt("streamType"));
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e0  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo74909b(java.lang.String r11, android.os.Bundle r12) {
        /*
            r10 = this;
            java.lang.String r0 = "scene"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "bundle"
            gy3.C87412m.m108594g(r12, r0)
            int r0 = r11.hashCode()
            r1 = 0
            r2 = 1
            switch(r0) {
                case -346633629: goto L_0x0127;
                case 100571: goto L_0x011e;
                case 94756344: goto L_0x0107;
                case 106440182: goto L_0x00f7;
                case 109757538: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x013c
        L_0x0016:
            java.lang.String r0 = "start"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x0021
            goto L_0x013c
        L_0x0021:
            java.lang.String r11 = "isOutCall"
            boolean r11 = r12.getBoolean(r11)
            r12 = 29
            boolean r12 = p206nj.C11171e.m11046c(r12)
            if (r12 == 0) goto L_0x0042
            java.lang.String r12 = ""
            java.lang.String r0 = nj2.C61768p.m72480h(r12)
            boolean r0 = p645pj.C77091b.m93024f(r0)
            java.lang.String r12 = nj2.C61768p.m72480h(r12)
            boolean r12 = p645pj.C77091b.m93025g(r12)
            goto L_0x004a
        L_0x0042:
            boolean r0 = p645pj.C77091b.m93021c()
            boolean r12 = p645pj.C77091b.m93027i()
        L_0x004a:
            if (r11 == 0) goto L_0x004d
            r0 = 1
        L_0x004d:
            if (r0 != 0) goto L_0x0053
            if (r12 != 0) goto L_0x0053
            goto L_0x013d
        L_0x0053:
            nj2.g r3 = r10.f151966a
            java.lang.String r4 = eb0.C75592q0.m90789s()
            r5 = 0
            r3.Ax0(r4, r11, r5)
            if (r0 == 0) goto L_0x00e4
            pu0.b$a r0 = pu0.C110248b.f329777h
            boolean r3 = r0.mo161665j()
            if (r3 == 0) goto L_0x007b
            ou0.a r3 = r0.mo161657b()
            android.media.AudioManager r3 = r3.f329358h
            java.lang.String r4 = "audioManager"
            gy3.C87412m.m108594g(r3, r4)
            boolean r3 = r3.isBluetoothScoAvailableOffCall()
            if (r3 == 0) goto L_0x007b
            r3 = 1
            goto L_0x007c
        L_0x007b:
            r3 = 0
        L_0x007c:
            boolean r0 = r0.mo161666k()
            r4 = 2
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            r7[r1] = r8
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            r7[r2] = r8
            java.lang.String r8 = "MicroMsg.WmpfCallInRingtoneSceneSetting"
            java.lang.String r9 = "isBluetoothOn: %b, isHeadsetPlugged: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r9, r7)
            nj2.o r7 = nj2.C61767o.f175575a
            boolean r7 = r7.mo86688i()
            if (r7 == 0) goto L_0x00a5
            if (r3 != 0) goto L_0x00a7
            if (r11 != 0) goto L_0x00a7
            if (r0 == 0) goto L_0x00a9
            goto L_0x00a7
        L_0x00a5:
            if (r11 == 0) goto L_0x00a9
        L_0x00a7:
            r4 = 0
            goto L_0x00ab
        L_0x00a9:
            r1 = 2
            r4 = 1
        L_0x00ab:
            nj2.g r7 = r10.f151966a
            wj2.d r8 = wj2.C66131d.START_SOUND
            r7.xx0(r8, r1, r2)
            nj2.g r1 = r10.f151966a
            java.lang.String r7 = eb0.C75592q0.m90789s()
            r1.Ax0(r7, r11, r5)
            if (r12 == 0) goto L_0x00c8
            if (r11 != 0) goto L_0x00c8
            if (r0 != 0) goto L_0x00c8
            if (r3 != 0) goto L_0x00c8
            nj2.g r12 = r10.f151966a
            r12.yx0(r2)
        L_0x00c8:
            boolean r12 = nj2.C61767o.m72472h()
            if (r12 == 0) goto L_0x00d8
            if (r11 != 0) goto L_0x00d2
            r11 = 1
            goto L_0x00d3
        L_0x00d2:
            r11 = 3
        L_0x00d3:
            nj2.g r12 = r10.f151966a
            r12.wx0(r11)
        L_0x00d8:
            nj2.g r11 = r10.f151966a
            zj2.f r11 = r11.vx0()
            if (r11 == 0) goto L_0x013c
            r11.mo90867f(r4)
            goto L_0x013c
        L_0x00e4:
            if (r12 == 0) goto L_0x013c
            if (r11 != 0) goto L_0x013c
            nj2.g r12 = r10.f151966a
            java.lang.String r0 = eb0.C75592q0.m90789s()
            java.lang.String r1 = "getUsernameFromUserInfo()"
            gy3.C87412m.m108593f(r0, r1)
            r12.zx0(r0, r11)
            goto L_0x013c
        L_0x00f7:
            java.lang.String r12 = "pause"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0101
            goto L_0x013c
        L_0x0101:
            nj2.g r11 = r10.f151966a
            r11.mo86667W()
            goto L_0x013c
        L_0x0107:
            java.lang.String r12 = "close"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0110
            goto L_0x013c
        L_0x0110:
            nj2.g r11 = r10.f151966a
            zj2.f r11 = r11.vx0()
            if (r11 == 0) goto L_0x013c
            wj2.b r12 = wj2.C66129b.STOP_ACTION
            r11.mo90865d(r12)
            goto L_0x013c
        L_0x011e:
            java.lang.String r0 = "end"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x0130
            goto L_0x013c
        L_0x0127:
            java.lang.String r0 = "bad_net"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x0130
            goto L_0x013c
        L_0x0130:
            java.lang.String r11 = "streamType"
            int r11 = r12.getInt(r11)
            boolean r1 = r10.mo74908a(r11)
            goto L_0x013d
        L_0x013c:
            r1 = 1
        L_0x013d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ak2.C54122d.mo74909b(java.lang.String, android.os.Bundle):boolean");
    }
}
