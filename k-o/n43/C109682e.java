package n43;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;

/* renamed from: n43.e */
public class C109682e extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f328322d;

    /* renamed from: e */
    public C47350c f328323e;

    /* JADX WARNING: Removed duplicated region for block: B:52:0x034b A[Catch:{ Exception -> 0x035f }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0374  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x03a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C109682e(long r20, long r22) {
        /*
            r19 = this;
            java.lang.Class<pu0.b> r0 = pu0.C110248b.class
            r19.<init>()
            ob0.c$b r1 = new ob0.c$b
            r1.<init>()
            te3.lu4 r2 = new te3.lu4
            r2.<init>()
            r1.f127066a = r2
            te3.mu4 r2 = new te3.mu4
            r2.<init>()
            r1.f127067b = r2
            java.lang.String r2 = "/cgi-bin/micromsg-bin/csvoipreport"
            r1.f127068c = r2
            r2 = 312(0x138, float:4.37E-43)
            r1.f127069d = r2
            r2 = 0
            r1.f127070e = r2
            r1.f127071f = r2
            ob0.c r1 = r1.mo72403a()
            r3 = r19
            r3.f328323e = r1
            ob0.c$c r1 = r1.f127055a
            pe3.a r1 = r1.f127080a
            te3.lu4 r1 = (te3.lu4) r1
            r4 = r20
            r1.f137650d = r4
            r4 = r22
            r1.f137651e = r4
            java.util.LinkedList<te3.ku4> r4 = r1.f137652f
            k43.f r5 = k43.C108886d.vx0()
            r5.getClass()
            te3.ku4 r6 = new te3.ku4
            r6.<init>()
            r7 = 1
            r6.f137051d = r7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r5 = r5.f326086c0
            r8.append(r5)
            java.lang.String r5 = ""
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            r6.f137052e = r8
            java.lang.Object[] r9 = new java.lang.Object[r7]
            r9[r2] = r8
            java.lang.String r8 = "MicroMsg.VoipCSReportHelper"
            java.lang.String r10 = "getVoipCSChannelReportData, result: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r10, r9)
            r4.add(r6)
            java.util.LinkedList<te3.ku4> r4 = r1.f137652f
            k43.f r6 = k43.C108886d.vx0()
            r6.getClass()
            te3.ku4 r9 = new te3.ku4
            r9.<init>()
            r10 = 2
            r9.f137051d = r10
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r6.f326088d0
            r11.append(r12)
            r11.append(r5)
            java.lang.String r11 = r11.toString()
            r9.f137052e = r11
            java.lang.Object[] r12 = new java.lang.Object[r7]
            r12[r2] = r11
            java.lang.String r11 = "getVoipCSEngineReportData, result: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r11, r12)
            java.lang.String r11 = r6.f326088d0
            java.lang.String r12 = ","
            java.lang.String[] r11 = r11.split(r12)
            r13 = 8
            r14 = 10
            if (r11 == 0) goto L_0x00c3
            int r15 = r11.length
            if (r15 <= 0) goto L_0x00c3
            r15 = r11[r13]     // Catch:{ Exception -> 0x00be }
            int r15 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r15, (int) r2)     // Catch:{ Exception -> 0x00be }
            r6.f326089e = r15     // Catch:{ Exception -> 0x00be }
            r11 = r11[r14]     // Catch:{ Exception -> 0x00be }
            int r11 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r11, (int) r2)     // Catch:{ Exception -> 0x00be }
            r6.f326090f = r11     // Catch:{ Exception -> 0x00be }
            goto L_0x00c3
        L_0x00be:
            java.lang.String r6 = "get videoFps and rate fail!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r6)
        L_0x00c3:
            r4.add(r9)
            java.util.LinkedList<te3.ku4> r4 = r1.f137652f
            k43.f r6 = k43.C108886d.vx0()
            r6.getClass()
            te3.ku4 r9 = new te3.ku4
            r9.<init>()
            r11 = 3
            r9.f137051d = r11
            di3.d r15 = di3.C86312j.m106911c(r0)
            java.lang.String r13 = "getService(SubCoreAudio::class.java)"
            gy3.C87412m.m108593f(r15, r13)
            pu0.b r15 = (pu0.C110248b) r15
            ou0.a r15 = r15.f329779e
            java.lang.String r16 = "music"
            if (r15 != 0) goto L_0x00fa
            ou0.c r15 = new ou0.c
            r15.<init>()
            di3.d r14 = di3.C86312j.m106911c(r0)
            gy3.C87412m.m108593f(r14, r13)
            pu0.b r14 = (pu0.C110248b) r14
            java.lang.String[] r14 = r14.f329781g
            r14[r2] = r16
        L_0x00fa:
            int r14 = r15.f329355e
            r15.f329355e = r2
            r6.f326108x = r14
            l43.a r14 = l43.C109254a.f327084b
            if (r14 != 0) goto L_0x0111
            if (r14 != 0) goto L_0x010d
            l43.a r14 = new l43.a
            r14.<init>()
            l43.C109254a.f327084b = r14
        L_0x010d:
            l43.a r14 = l43.C109254a.f327084b
            l43.C109254a.f327084b = r14
        L_0x0111:
            l43.a r14 = l43.C109254a.f327084b
            a43.i r14 = r14.f327085a
            r14.getClass()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r2 = "RingPlayer  mRingPlayerErrState:"
            r15.append(r2)
            int r2 = r14.f304602f
            r15.append(r2)
            java.lang.String r2 = r15.toString()
            java.lang.String r15 = "MicroMsg.RingPlayer"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r2)
            int r2 = r14.f304602f
            int r2 = java.lang.Math.abs(r2)
            r6.f326109y = r2
            int r2 = r6.f326084b0
            r2 = r2 & 255(0xff, float:3.57E-43)
            r6.f326069O = r2
            m43.b r2 = k43.C108886d.wx0()
            k43.a r2 = r2.f327737a
            int r2 = r2.field_audioDuration
            r6.f326066L = r2
            m43.b r2 = k43.C108886d.wx0()
            k43.a r2 = r2.f327737a
            int r2 = r2.field_videoDuration
            r6.f326067M = r2
            int r2 = r6.f326095k
            if (r2 == r7) goto L_0x015d
            int r14 = r6.f326082a0
            if (r14 == r7) goto L_0x015d
            r6.f326057C = r7
            goto L_0x016c
        L_0x015d:
            if (r2 == r7) goto L_0x0162
            r6.f326057C = r10
            goto L_0x016c
        L_0x0162:
            int r2 = r6.f326082a0
            if (r2 == r7) goto L_0x0169
            r6.f326057C = r11
            goto L_0x016c
        L_0x0169:
            r2 = 0
            r6.f326057C = r2
        L_0x016c:
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r2 = z33.C112597j.m153940e(r2)
            r6.f326105u = r2
            m43.b r2 = k43.C108886d.wx0()
            k43.a r2 = r2.f327737a
            byte[] r14 = r2.f317676t1
            int r15 = r14.length
            r2.setJNIAppCmd(r7, r14, r15)
            byte[] r2 = r2.f317676t1
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)
            java.nio.ByteOrder r14 = java.nio.ByteOrder.nativeOrder()
            r2.order(r14)
            long r14 = r2.getLong()
            r17 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 / r17
            int r2 = (int) r14
            int r14 = r6.f326077W
            if (r14 == 0) goto L_0x01a0
            if (r2 <= r14) goto L_0x01a0
            int r2 = r2 - r14
            goto L_0x01a1
        L_0x01a0:
            r2 = 0
        L_0x01a1:
            long r14 = (long) r2
            r6.f326064J = r14
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r14 = 0
            r2.append(r14)
            r2.append(r12)
            long r14 = r6.f326100p
            r2.append(r14)
            r2.append(r12)
            long r14 = r6.f326101q
            r2.append(r14)
            r2.append(r12)
            java.lang.String r14 = r6.f326102r
            r2.append(r14)
            r2.append(r12)
            int r14 = r6.f326103s
            r2.append(r14)
            r2.append(r12)
            int r14 = r6.f326104t
            r2.append(r14)
            r2.append(r12)
            int r14 = r6.f326105u
            r2.append(r14)
            r2.append(r12)
            int r14 = r6.f326106v
            r2.append(r14)
            r2.append(r12)
            r14 = 0
            r2.append(r14)
            r2.append(r12)
            int r14 = r6.f326107w
            r2.append(r14)
            r2.append(r12)
            int r14 = r6.f326108x
            r2.append(r14)
            r2.append(r12)
            int r14 = r6.f326109y
            r2.append(r14)
            r2.append(r12)
            int r14 = r6.f326110z
            r2.append(r14)
            r2.append(r12)
            int r14 = r6.f326055A
            r2.append(r14)
            r2.append(r12)
            int r14 = r6.f326056B
            r2.append(r14)
            r2.append(r12)
            int r14 = r6.f326057C
            r2.append(r14)
            r2.append(r12)
            int r14 = r6.f326058D
            r2.append(r14)
            r2.append(r12)
            int r14 = r6.f326059E
            r2.append(r14)
            r2.append(r12)
            long r14 = r6.f326060F
            r2.append(r14)
            r2.append(r12)
            int r14 = r6.f326061G
            r2.append(r14)
            r2.append(r12)
            long r14 = r6.f326062H
            r2.append(r14)
            r2.append(r12)
            long r14 = r6.f326063I
            r2.append(r14)
            r2.append(r12)
            long r14 = r6.f326064J
            r2.append(r14)
            r2.append(r12)
            long r14 = r6.f326065K
            r2.append(r14)
            r2.append(r12)
            int r14 = r6.f326066L
            r2.append(r14)
            r2.append(r12)
            int r14 = r6.f326067M
            r2.append(r14)
            r2.append(r12)
            int r14 = r6.f326068N
            r2.append(r14)
            r2.append(r12)
            int r14 = r6.f326069O
            r2.append(r14)
            r2.append(r12)
            int r14 = r6.f326070P
            r2.append(r14)
            r2.append(r12)
            int r14 = r6.f326071Q
            r2.append(r14)
            r2.append(r12)
            int r14 = r6.f326072R
            r2.append(r14)
            r2.append(r12)
            java.lang.String r14 = r6.f326073S
            r2.append(r14)
            r2.append(r12)
            java.lang.String r14 = r6.f326074T
            r2.append(r14)
            r2.append(r12)
            java.lang.String r14 = r6.f326075U
            r2.append(r14)
            r2.append(r12)
            java.lang.String r6 = r6.f326076V
            r2.append(r6)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r9.f137052e = r2
            java.lang.Object[] r6 = new java.lang.Object[r7]
            r14 = 0
            r6[r14] = r2
            java.lang.String r2 = "getVoipCSClientReportData, result: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r2, r6)
            r4.add(r9)
            java.util.LinkedList<te3.ku4> r1 = r1.f137652f
            k43.f r2 = k43.C108886d.vx0()
            r2.getClass()
            te3.ku4 r4 = new te3.ku4
            r4.<init>()
            r6 = 4
            r4.f137051d = r6
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r9 = z33.C112597j.m153940e(r9)
            r2.f326096l = r9
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r14 = "phone"
            java.lang.Object r9 = r9.getSystemService(r14)
            android.telephony.TelephonyManager r9 = (android.telephony.TelephonyManager) r9
            java.lang.String r9 = r9.getSimOperator()
            if (r9 == 0) goto L_0x0331
            java.lang.String r14 = "46000"
            boolean r14 = r9.equals(r14)
            if (r14 != 0) goto L_0x032f
            java.lang.String r14 = "46002"
            boolean r14 = r9.equals(r14)
            if (r14 != 0) goto L_0x032f
            java.lang.String r14 = "46007"
            boolean r14 = r9.equals(r14)
            if (r14 == 0) goto L_0x031b
            goto L_0x032f
        L_0x031b:
            java.lang.String r14 = "46001"
            boolean r14 = r9.equals(r14)
            if (r14 == 0) goto L_0x0325
            r9 = 3
            goto L_0x0332
        L_0x0325:
            java.lang.String r14 = "46003"
            boolean r9 = r9.equals(r14)
            if (r9 == 0) goto L_0x0331
            r9 = 2
            goto L_0x0332
        L_0x032f:
            r9 = 1
            goto L_0x0332
        L_0x0331:
            r9 = 0
        L_0x0332:
            r2.f326097m = r9
            long r14 = java.lang.System.currentTimeMillis()
            long r14 = r14 / r17
            int r9 = (int) r14
            r2.f326083b = r9
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x035f }
            java.lang.String r14 = "connectivity"
            java.lang.Object r9 = r9.getSystemService(r14)     // Catch:{ Exception -> 0x035f }
            android.net.ConnectivityManager r9 = (android.net.ConnectivityManager) r9     // Catch:{ Exception -> 0x035f }
            if (r9 == 0) goto L_0x0364
            r14 = 0
            android.net.NetworkInfo r9 = r9.getNetworkInfo(r14)     // Catch:{ Exception -> 0x035f }
            if (r9 != 0) goto L_0x0353
            goto L_0x0364
        L_0x0353:
            android.net.NetworkInfo$State r9 = r9.getState()     // Catch:{ Exception -> 0x035f }
            android.net.NetworkInfo$State r14 = android.net.NetworkInfo.State.CONNECTED     // Catch:{ Exception -> 0x035f }
            if (r9 != r14) goto L_0x035d
            r9 = 1
            goto L_0x0365
        L_0x035d:
            r9 = 2
            goto L_0x0365
        L_0x035f:
            java.lang.String r9 = "isMobileNetworkAvailable fail!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r9)
        L_0x0364:
            r9 = 0
        L_0x0365:
            r2.f326098n = r9
            di3.d r9 = di3.C86312j.m106911c(r0)
            gy3.C87412m.m108593f(r9, r13)
            pu0.b r9 = (pu0.C110248b) r9
            ou0.a r9 = r9.f329779e
            if (r9 != 0) goto L_0x0388
            ou0.c r9 = new ou0.c
            r9.<init>()
            di3.d r0 = di3.C86312j.m106911c(r0)
            gy3.C87412m.m108593f(r0, r13)
            pu0.b r0 = (pu0.C110248b) r0
            java.lang.String[] r0 = r0.f329781g
            r13 = 0
            r0[r13] = r16
            goto L_0x0389
        L_0x0388:
            r13 = 0
        L_0x0389:
            int r0 = r9.f329355e
            r9.f329355e = r13
            r2.f326108x = r0
            com.tencent.mm.plugin.voip.model.f0 r0 = com.tencent.p014mm.plugin.voip.model.C106343f0.m143231a()
            int r9 = r0.f317309j
            r13 = -1
            if (r9 == 0) goto L_0x039c
            int r0 = r0.f317308i
            int r0 = r0 / r9
            goto L_0x039d
        L_0x039c:
            r0 = -1
        L_0x039d:
            r2.f326099o = r0
            if (r0 != r13) goto L_0x03c0
            byte[] r0 = new byte[r6]
            m43.b r9 = k43.C108886d.wx0()
            k43.a r9 = r9.f327737a
            r13 = 10
            int r9 = r9.setAppCmd(r13, r0, r6)
            if (r9 >= 0) goto L_0x03ba
            r9 = 0
            r2.f326099o = r9
            java.lang.String r0 = "get netStatus failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r0)
            goto L_0x03c0
        L_0x03ba:
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.byteArrayToInt(r0)
            r2.f326099o = r0
        L_0x03c0:
            r0 = 15
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r9 = r2.f326081a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r13 = 0
            r0[r13] = r9
            int r9 = r2.f326083b
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0[r7] = r9
            int r7 = r2.f326085c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0[r10] = r7
            int r7 = r2.f326087d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0[r11] = r7
            int r7 = r2.f326089e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0[r6] = r7
            r6 = 5
            int r7 = r2.f326090f
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0[r6] = r7
            r6 = 6
            int r7 = r2.f326091g
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0[r6] = r7
            r6 = 7
            int r7 = r2.f326092h
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0[r6] = r7
            int r6 = r2.f326093i
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 8
            r0[r7] = r6
            r6 = 9
            int r7 = r2.f326094j
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0[r6] = r7
            int r6 = r2.f326095k
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 10
            r0[r7] = r6
            r6 = 11
            int r7 = r2.f326096l
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0[r6] = r7
            r6 = 12
            int r7 = r2.f326097m
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0[r6] = r7
            r6 = 13
            int r7 = r2.f326098n
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0[r6] = r7
            r6 = 14
            int r7 = r2.f326099o
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0[r6] = r7
            java.lang.String r6 = "getVoipCSThirdPartData Report dataType=%d, dataTime=%s, isClickClose=%d, clickCloseTime=%s, videoFps=%d, videoRate=%d, cameraPixelWidth=%d, cameraPixelHeight=%d, recordPixelWidth=%d, recordPixelHeight=%d, cameraState=%d, networkType=%s, mobileType=%s, mobileNetworkType=%s, networkQuality=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            int r5 = r2.f326081a
            r0.append(r5)
            r0.append(r12)
            int r5 = r2.f326083b
            r0.append(r5)
            r0.append(r12)
            int r5 = r2.f326085c
            r0.append(r5)
            r0.append(r12)
            int r5 = r2.f326087d
            r0.append(r5)
            r0.append(r12)
            int r5 = r2.f326089e
            r0.append(r5)
            r0.append(r12)
            int r5 = r2.f326090f
            r0.append(r5)
            r0.append(r12)
            int r5 = r2.f326091g
            r0.append(r5)
            r0.append(r12)
            int r5 = r2.f326092h
            r0.append(r5)
            r0.append(r12)
            int r5 = r2.f326093i
            r0.append(r5)
            r0.append(r12)
            int r5 = r2.f326094j
            r0.append(r5)
            r0.append(r12)
            int r5 = r2.f326095k
            r0.append(r5)
            r0.append(r12)
            int r5 = r2.f326096l
            r0.append(r5)
            r0.append(r12)
            int r5 = r2.f326097m
            r0.append(r5)
            r0.append(r12)
            int r5 = r2.f326098n
            r0.append(r5)
            r0.append(r12)
            int r5 = r2.f326099o
            r0.append(r5)
            r0.append(r12)
            long r5 = r2.f326100p
            r0.append(r5)
            r0.append(r12)
            long r5 = r2.f326101q
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r4.f137052e = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "getVoipCSThirdPartData, result: "
            r0.append(r2)
            java.lang.String r2 = r4.f137052e
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r0)
            r1.add(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n43.C109682e.<init>(long, long):void");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f328322d = nVar;
        return dispatch(gVar, this.f328323e, this);
    }

    public int getType() {
        return 312;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneVoipCSReport", "onGYNetEnd, errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f328322d.onSceneEnd(i2, i3, str, this);
    }
}
