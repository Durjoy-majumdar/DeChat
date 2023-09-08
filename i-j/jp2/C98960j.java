package jp2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C101786i2;
import te3.C50068k2;
import te3.C64509l2;

/* renamed from: jp2.j */
public class C98960j extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f290113d;

    /* renamed from: e */
    public C11385n f290114e;

    /* renamed from: f */
    public int f290115f;

    public C98960j(String str, int i, int i2, int i3, C101786i2 i2Var, C64509l2 l2Var, int i4, String str2, int i5, int i6, int i7, int i8, int i9, C89349b bVar, C89349b bVar2, String str3) {
        this(str, i, i2, i3, i2Var, l2Var, i4, str2, i5, i6, i7, i8, i9, bVar, bVar2, str3, (C98953b) null);
    }

    public final int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdExposure");
        this.f290114e = nVar;
        int dispatch = dispatch(gVar, this.f290113d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdExposure");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdExposure");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdExposure");
        return 1231;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdExposure");
        Log.m105924i("MicroMsg.NetSceneAdExposure", "netId : " + i + " errType :" + i2 + " errCode: " + i3 + " errMsg :" + str + ", reportExposureType=" + this.f290115f);
        if (!(i2 == 0 && i3 == 0)) {
            if (this.f290115f == 1) {
                C115669n.INSTANCE.mo175911u(1612, 93);
            } else {
                C115669n.INSTANCE.mo175911u(1612, 95);
            }
        }
        C50068k2 k2Var = (C50068k2) this.f290113d.f127056b.f127083a;
        Log.m105924i("MicroMsg.NetSceneAdExposure", "resp=" + k2Var.f136513d + ", msg=" + k2Var.f136514e);
        this.f290114e.onSceneEnd(i2, i3, str, this);
        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdExposure");
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x026e A[Catch:{ all -> 0x041c }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0276 A[Catch:{ all -> 0x041c }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x02f2 A[Catch:{ all -> 0x041c }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x02f4 A[Catch:{ all -> 0x041c }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0301 A[Catch:{ all -> 0x041c }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0303 A[Catch:{ all -> 0x041c }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x038e A[Catch:{ all -> 0x041c }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0390 A[Catch:{ all -> 0x041c }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x03a8 A[Catch:{ all -> 0x041c }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x03aa A[Catch:{ all -> 0x041c }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0401 A[Catch:{ all -> 0x041a }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0403 A[Catch:{ all -> 0x041a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C98960j(java.lang.String r19, int r20, int r21, int r22, te3.C101786i2 r23, te3.C64509l2 r24, int r25, java.lang.String r26, int r27, int r28, int r29, int r30, int r31, pe3.C89349b r32, pe3.C89349b r33, java.lang.String r34, jp2.C98953b r35) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r0 = r23
            r6 = r24
            r7 = r25
            r8 = r26
            r9 = r27
            r10 = r29
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r35
            r18.<init>()
            ob0.c$b r15 = new ob0.c$b
            r15.<init>()
            te3.j2 r14 = new te3.j2
            r14.<init>()
            r15.f127066a = r14
            te3.k2 r14 = new te3.k2
            r14.<init>()
            r15.f127067b = r14
            r14 = 2
            r12 = r28
            if (r12 == r14) goto L_0x0042
            java.lang.String r12 = "/cgi-bin/mmoc-bin/ad/exposure"
            r15.f127068c = r12
            r12 = 1231(0x4cf, float:1.725E-42)
            r15.f127069d = r12
            goto L_0x004a
        L_0x0042:
            java.lang.String r12 = "/cgi-bin/mmux-bin/adexposure"
            r15.f127068c = r12
            r12 = 1875(0x753, float:2.627E-42)
            r15.f127069d = r12
        L_0x004a:
            r12 = 0
            r15.f127070e = r12
            r15.f127071f = r12
            ob0.c r15 = r15.mo72403a()
            r1.f290113d = r15
            r14 = 1
            java.lang.Object[] r12 = new java.lang.Object[r14]
            java.lang.String r15 = r15.f127057c
            r16 = 0
            r12[r16] = r15
            java.lang.String r15 = "MicroMsg.NetSceneAdExposure"
            java.lang.String r14 = "uri %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r14, r12)
            r1.f290115f = r4
            ob0.c r12 = r1.f290113d
            ob0.c$c r12 = r12.f127055a
            pe3.a r12 = r12.f127080a
            te3.j2 r12 = (te3.C101791j2) r12
            r12.f298472g = r5
            r12.f298471f = r4
            r12.f298470e = r3
            r12.f298469d = r2
            r12.f298482t = r9
            long r4 = (long) r10
            r12.f298483u = r4
            r4 = r30
            long r4 = (long) r4
            r12.f298484v = r4
            r12.f298485w = r11
            java.lang.String r4 = do2.C97503a.m125622c()
            r12.f298488z = r4
            java.lang.String r4 = do2.C97503a.m125621b()
            r12.f298461L = r4
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r34)
            r12.f298451B = r4
            java.lang.String r5 = kv2.C34071b.m40230d(r4)
            r12.f298450A = r5
            java.lang.String r5 = ""
            if (r0 == 0) goto L_0x0123
            r12.f298476n = r0
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r2 = "exposure="
            r14.append(r2)
            r30 = r4
            r34 = r5
            long r4 = r0.f298377j
            long r9 = r0.f298376i
            long r4 = r4 - r9
            r14.append(r4)
            java.lang.String r2 = ", halfExposure="
            r14.append(r2)
            long r4 = r0.f298379o
            long r9 = r0.f298378n
            long r4 = r4 - r9
            r14.append(r4)
            java.lang.String r2 = ", allExposure="
            r14.append(r2)
            long r4 = r0.f298381q
            long r9 = r0.f298380p
            long r4 = r4 - r9
            r14.append(r4)
            java.lang.String r2 = ", isHeightValid="
            r14.append(r2)
            float r2 = r0.f298373f
            float r4 = r0.f298374g
            float r5 = r0.f298375h
            float r4 = r4 + r5
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x00e4
            r2 = 1
            goto L_0x00e5
        L_0x00e4:
            r2 = 0
        L_0x00e5:
            r14.append(r2)
            java.lang.String r2 = ", readH="
            r14.append(r2)
            float r2 = r0.f298373f
            r14.append(r2)
            java.lang.String r2 = ", unReadTH="
            r14.append(r2)
            float r2 = r0.f298374g
            r14.append(r2)
            java.lang.String r2 = ", unReadBH="
            r14.append(r2)
            float r0 = r0.f298375h
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "old exposureInfo: "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "MicroMsg.SnsAdStatistic"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r2)
            r2 = r0
            goto L_0x0129
        L_0x0123:
            r30 = r4
            r34 = r5
            r2 = r34
        L_0x0129:
            if (r6 == 0) goto L_0x014e
            r12.f298477o = r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "socialInfo, commentCount="
            r0.append(r4)
            int r4 = r6.f184022e
            r0.append(r4)
            java.lang.String r4 = ", likeCount="
            r0.append(r4)
            int r4 = r6.f184021d
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
        L_0x014e:
            long r4 = java.lang.System.currentTimeMillis()
            r12.f298475j = r4
            r12.f298478p = r7
            if (r8 == 0) goto L_0x015a
            r12.f298479q = r8
        L_0x015a:
            if (r13 == 0) goto L_0x015e
            r12.f298487y = r13
        L_0x015e:
            r4 = r32
            if (r4 == 0) goto L_0x0164
            r12.f298486x = r4
        L_0x0164:
            r5 = r35
            if (r5 == 0) goto L_0x0249
            java.lang.String r6 = "getScreenWidth"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ad.model.AdExposureParams"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r9)
            int r0 = jp2.C98953b.f290064h
            java.lang.String r10 = "AdExposureParams"
            if (r0 != 0) goto L_0x01a4
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0188 }
            int[] r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95198o2.m121130b(r0)     // Catch:{ all -> 0x0188 }
            r14 = 0
            r17 = r0[r14]     // Catch:{ all -> 0x0188 }
            jp2.C98953b.f290064h = r17     // Catch:{ all -> 0x0188 }
            r14 = 1
            r0 = r0[r14]     // Catch:{ all -> 0x0188 }
            jp2.C98953b.f290063g = r0     // Catch:{ all -> 0x0188 }
            goto L_0x01a4
        L_0x0188:
            r0 = move-exception
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r17 = r15
            java.lang.String r15 = "getScreenWidth exp="
            r14.append(r15)
            java.lang.String r0 = r0.toString()
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            goto L_0x01a6
        L_0x01a4:
            r17 = r15
        L_0x01a6:
            int r0 = jp2.C98953b.f290064h
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r9)
            float r0 = (float) r0
            r12.f298452C = r0
            java.lang.String r6 = "getScreenHeight"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r9)
            int r0 = jp2.C98953b.f290063g
            if (r0 != 0) goto L_0x01e6
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x01cc }
            int[] r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95198o2.m121130b(r0)     // Catch:{ all -> 0x01cc }
            r14 = 0
            r15 = r0[r14]     // Catch:{ all -> 0x01ca }
            jp2.C98953b.f290064h = r15     // Catch:{ all -> 0x01ca }
            r15 = 1
            r0 = r0[r15]     // Catch:{ all -> 0x01ca }
            jp2.C98953b.f290063g = r0     // Catch:{ all -> 0x01ca }
            goto L_0x01e6
        L_0x01ca:
            r0 = move-exception
            goto L_0x01ce
        L_0x01cc:
            r0 = move-exception
            r14 = 0
        L_0x01ce:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r14 = "getScreenHeight exp="
            r15.append(r14)
            java.lang.String r0 = r0.toString()
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
        L_0x01e6:
            int r0 = jp2.C98953b.f290063g
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r9)
            float r0 = (float) r0
            r12.f298453D = r0
            int r0 = r5.f290067c
            float r0 = (float) r0
            r12.f298454E = r0
            java.lang.String r6 = "getDarkModeStatus"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r9)
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106211z()     // Catch:{ all -> 0x01fd }
            goto L_0x0218
        L_0x01fd:
            r0 = move-exception
            r14 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r15 = "getDarkModeStatus exp="
            r0.append(r15)
            java.lang.String r14 = r14.toString()
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            r0 = 0
        L_0x0218:
            if (r0 == 0) goto L_0x021c
            r14 = 2
            goto L_0x021d
        L_0x021c:
            r14 = 1
        L_0x021d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r9)
            r12.f298455F = r14
            long r9 = r5.f290068d
            r12.f298456G = r9
            long r9 = r5.f290069e
            r12.f298457H = r9
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r5.f290066b
            int r0 = vr2.C102260r.m134879s(r0)
            r12.f298458I = r0
            boolean r0 = vr2.C102260r.m134845N()
            if (r0 == 0) goto L_0x0240
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r5.f290066b
            int r0 = vr2.C102260r.m134875o(r0)
            r12.f298459J = r0
        L_0x0240:
            int r0 = r5.f290065a
            r12.f298460K = r0
            int r0 = r5.f290070f
            r12.f298468T = r0
            goto L_0x024b
        L_0x0249:
            r17 = r15
        L_0x024b:
            java.lang.String r0 = do2.C97503a.m125620a()
            r12.f298465Q = r0
            java.lang.String r0 = do2.C97503a.m125623d()
            r12.f298464P = r0
            boolean r0 = lg3.C76695c.m92341b()
            r12.f298466R = r0
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r0 = kg3.C76577a.m92163n(r0)
            r12.f298467S = r0
            int r0 = r1.f290115f     // Catch:{ all -> 0x041c }
            r5 = 1612(0x64c, float:2.259E-42)
            r6 = 1
            if (r0 != r6) goto L_0x0276
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x041c }
            r6 = 92
            r0.mo175911u(r5, r6)     // Catch:{ all -> 0x041c }
            goto L_0x027d
        L_0x0276:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x041c }
            r6 = 94
            r0.mo175911u(r5, r6)     // Catch:{ all -> 0x041c }
        L_0x027d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x041c }
            r0.<init>()     // Catch:{ all -> 0x041c }
            java.lang.String r5 = "##scene:"
            r0.append(r5)     // Catch:{ all -> 0x041c }
            r0.append(r3)     // Catch:{ all -> 0x041c }
            java.lang.String r3 = ", exposureScene:"
            r0.append(r3)     // Catch:{ all -> 0x041c }
            r3 = r21
            r0.append(r3)     // Catch:{ all -> 0x041c }
            java.lang.String r3 = ", duration:"
            r0.append(r3)     // Catch:{ all -> 0x041c }
            r3 = r22
            r0.append(r3)     // Catch:{ all -> 0x041c }
            java.lang.String r3 = ", feed_duration:"
            r0.append(r3)     // Catch:{ all -> 0x041c }
            r3 = r29
            r0.append(r3)     // Catch:{ all -> 0x041c }
            java.lang.String r3 = ", halfDuration="
            r0.append(r3)     // Catch:{ all -> 0x041c }
            long r5 = r12.f298456G     // Catch:{ all -> 0x041c }
            r0.append(r5)     // Catch:{ all -> 0x041c }
            java.lang.String r3 = ", fullDuration="
            r0.append(r3)     // Catch:{ all -> 0x041c }
            long r5 = r12.f298457H     // Catch:{ all -> 0x041c }
            r0.append(r5)     // Catch:{ all -> 0x041c }
            java.lang.String r3 = ", sixPointExposure=["
            r0.append(r3)     // Catch:{ all -> 0x041c }
            r0.append(r2)     // Catch:{ all -> 0x041c }
            java.lang.String r2 = "]"
            r0.append(r2)     // Catch:{ all -> 0x041c }
            java.lang.String r2 = ", ad_type:"
            r0.append(r2)     // Catch:{ all -> 0x041c }
            r0.append(r7)     // Catch:{ all -> 0x041c }
            java.lang.String r2 = ", exposureCount:"
            r0.append(r2)     // Catch:{ all -> 0x041c }
            r2 = r27
            r0.append(r2)     // Catch:{ all -> 0x041c }
            java.lang.String r2 = ", descXml:"
            r0.append(r2)     // Catch:{ all -> 0x041c }
            r0.append(r8)     // Catch:{ all -> 0x041c }
            java.lang.String r2 = ", flip_status:"
            r0.append(r2)     // Catch:{ all -> 0x041c }
            r0.append(r11)     // Catch:{ all -> 0x041c }
            java.lang.String r2 = ", self_info.length:"
            r0.append(r2)     // Catch:{ all -> 0x041c }
            if (r13 != 0) goto L_0x02f4
            r2 = 0
            goto L_0x02f7
        L_0x02f4:
            byte[] r2 = r13.f257327a     // Catch:{ all -> 0x041c }
            int r2 = r2.length     // Catch:{ all -> 0x041c }
        L_0x02f7:
            r0.append(r2)     // Catch:{ all -> 0x041c }
            java.lang.String r2 = ", source_info.length:"
            r0.append(r2)     // Catch:{ all -> 0x041c }
            if (r4 != 0) goto L_0x0303
            r2 = 0
            goto L_0x0306
        L_0x0303:
            byte[] r2 = r4.f257327a     // Catch:{ all -> 0x041c }
            int r2 = r2.length     // Catch:{ all -> 0x041c }
        L_0x0306:
            r0.append(r2)     // Catch:{ all -> 0x041c }
            java.lang.String r2 = ", screen.w="
            r0.append(r2)     // Catch:{ all -> 0x041c }
            float r2 = r12.f298452C     // Catch:{ all -> 0x041c }
            r0.append(r2)     // Catch:{ all -> 0x041c }
            java.lang.String r2 = ", screen.h="
            r0.append(r2)     // Catch:{ all -> 0x041c }
            float r2 = r12.f298453D     // Catch:{ all -> 0x041c }
            r0.append(r2)     // Catch:{ all -> 0x041c }
            java.lang.String r2 = ", adView.h="
            r0.append(r2)     // Catch:{ all -> 0x041c }
            float r2 = r12.f298454E     // Catch:{ all -> 0x041c }
            r0.append(r2)     // Catch:{ all -> 0x041c }
            java.lang.String r2 = ", darkMode="
            r0.append(r2)     // Catch:{ all -> 0x041c }
            int r2 = r12.f298455F     // Catch:{ all -> 0x041c }
            r0.append(r2)     // Catch:{ all -> 0x041c }
            java.lang.String r2 = ", followStatus="
            r0.append(r2)     // Catch:{ all -> 0x041c }
            int r2 = r12.f298458I     // Catch:{ all -> 0x041c }
            r0.append(r2)     // Catch:{ all -> 0x041c }
            java.lang.String r2 = ", installStatus="
            r0.append(r2)     // Catch:{ all -> 0x041c }
            int r2 = r12.f298459J     // Catch:{ all -> 0x041c }
            r0.append(r2)     // Catch:{ all -> 0x041c }
            java.lang.String r2 = ", timelineIdx="
            r0.append(r2)     // Catch:{ all -> 0x041c }
            int r2 = r12.f298460K     // Catch:{ all -> 0x041c }
            r0.append(r2)     // Catch:{ all -> 0x041c }
            java.lang.String r2 = ", oaid="
            r0.append(r2)     // Catch:{ all -> 0x041c }
            java.lang.String r2 = r12.f298488z     // Catch:{ all -> 0x041c }
            r0.append(r2)     // Catch:{ all -> 0x041c }
            java.lang.String r2 = ", imei="
            r0.append(r2)     // Catch:{ all -> 0x041c }
            java.lang.String r2 = r12.f298461L     // Catch:{ all -> 0x041c }
            r0.append(r2)     // Catch:{ all -> 0x041c }
            java.lang.String r2 = ", waidPkg="
            r0.append(r2)     // Catch:{ all -> 0x041c }
            r2 = r30
            r0.append(r2)     // Catch:{ all -> 0x041c }
            java.lang.String r2 = ", waid="
            r0.append(r2)     // Catch:{ all -> 0x041c }
            java.lang.String r2 = r12.f298450A     // Catch:{ all -> 0x041c }
            r0.append(r2)     // Catch:{ all -> 0x041c }
            java.lang.String r2 = ", relieved_buy_show="
            r0.append(r2)     // Catch:{ all -> 0x041c }
            int r2 = r12.f298468T     // Catch:{ all -> 0x041c }
            r0.append(r2)     // Catch:{ all -> 0x041c }
            java.lang.String r2 = ", req.ua.length="
            r0.append(r2)     // Catch:{ all -> 0x041c }
            java.lang.String r2 = r12.f298464P     // Catch:{ all -> 0x041c }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ all -> 0x041c }
            if (r2 == 0) goto L_0x0390
            r2 = 0
            goto L_0x0398
        L_0x0390:
            java.lang.String r2 = r12.f298464P     // Catch:{ all -> 0x041c }
            int r16 = r2.length()     // Catch:{ all -> 0x041c }
            r2 = r16
        L_0x0398:
            r0.append(r2)     // Catch:{ all -> 0x041c }
            java.lang.String r2 = ", req.common_device_id.length="
            r0.append(r2)     // Catch:{ all -> 0x041c }
            java.lang.String r2 = r12.f298465Q     // Catch:{ all -> 0x041c }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ all -> 0x041c }
            if (r2 == 0) goto L_0x03aa
            r2 = 0
            goto L_0x03b2
        L_0x03aa:
            java.lang.String r2 = r12.f298465Q     // Catch:{ all -> 0x041c }
            int r16 = r2.length()     // Catch:{ all -> 0x041c }
            r2 = r16
        L_0x03b2:
            r0.append(r2)     // Catch:{ all -> 0x041c }
            java.lang.String r2 = ", elder_mode:"
            r0.append(r2)     // Catch:{ all -> 0x041c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x041c }
            r2.<init>()     // Catch:{ all -> 0x041c }
            r3 = r34
            r2.append(r3)     // Catch:{ all -> 0x041c }
            int r4 = r12.f298466R     // Catch:{ all -> 0x041c }
            r2.append(r4)     // Catch:{ all -> 0x041c }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x041c }
            r0.append(r2)     // Catch:{ all -> 0x041c }
            java.lang.String r2 = ", font_level:"
            r0.append(r2)     // Catch:{ all -> 0x041c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x041c }
            r2.<init>()     // Catch:{ all -> 0x041c }
            r2.append(r3)     // Catch:{ all -> 0x041c }
            int r3 = r12.f298467S     // Catch:{ all -> 0x041c }
            r2.append(r3)     // Catch:{ all -> 0x041c }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x041c }
            r0.append(r2)     // Catch:{ all -> 0x041c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x041c }
            r2 = r17
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ all -> 0x041a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x041a }
            r0.<init>()     // Catch:{ all -> 0x041a }
            java.lang.String r3 = "viewId.length="
            r0.append(r3)     // Catch:{ all -> 0x041a }
            r3 = r19
            if (r3 != 0) goto L_0x0403
            r12 = 0
            goto L_0x0407
        L_0x0403:
            int r12 = r19.length()     // Catch:{ all -> 0x041a }
        L_0x0407:
            r0.append(r12)     // Catch:{ all -> 0x041a }
            java.lang.String r4 = ", viewId="
            r0.append(r4)     // Catch:{ all -> 0x041a }
            r0.append(r3)     // Catch:{ all -> 0x041a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x041a }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ all -> 0x041a }
            goto L_0x0426
        L_0x041a:
            r0 = move-exception
            goto L_0x041f
        L_0x041c:
            r0 = move-exception
            r2 = r17
        L_0x041f:
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x0426:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jp2.C98960j.<init>(java.lang.String, int, int, int, te3.i2, te3.l2, int, java.lang.String, int, int, int, int, int, pe3.b, pe3.b, java.lang.String, jp2.b):void");
    }
}
