package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import ob0.C117747y;
import ok1.C62042e;
import org.json.JSONObject;
import rx3.C13598b0;
import te3.C49335eu3;
import te3.C51354t71;
import te3.C64703s71;

/* renamed from: dj1.w0 */
public final class C58291w0 extends C58286q<C51354t71> {

    /* renamed from: A */
    public C64703s71 f166907A;

    /* renamed from: t */
    public final String f166908t;

    /* renamed from: u */
    public final int f166909u;

    /* renamed from: v */
    public final int f166910v;

    /* renamed from: w */
    public final String f166911w;

    /* renamed from: x */
    public final String f166912x;

    /* renamed from: y */
    public final C58292a f166913y;

    /* renamed from: z */
    public final JSONObject f166914z = new JSONObject();

    /* renamed from: dj1.w0$a */
    public interface C58292a {
        /* renamed from: a */
        void mo75770a(int i, int i2, String str, C51354t71 t712);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0093 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C58291w0(long r17, long r19, java.lang.String r21, int r22, java.lang.String r23, int r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, te3.C49712hj1 r28, java.lang.String r29, int r30, pe3.C89349b r31, byte[] r32, java.util.List<qj1.C12666si.C12667a> r33, java.lang.String r34, java.lang.String r35, dj1.C58291w0.C58292a r36) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r27
            r11 = r30
            r12 = r31
            r13 = r34
            r14 = r35
            java.lang.String r15 = "sendGiftTargetUserName"
            gy3.C87412m.m108594g(r10, r15)
            java.lang.String r15 = "randomGiftInfo"
            r12 = r33
            gy3.C87412m.m108594g(r12, r15)
            r15 = 0
            r12 = 1
            r0.<init>(r15, r12, r15)
            r0.f166908t = r5
            r0.f166909u = r6
            r0.f166910v = r11
            r0.f166911w = r13
            r0.f166912x = r14
            r12 = r36
            r0.f166913y = r12
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            r0.f166914z = r12
            te3.s71 r12 = new te3.s71
            r12.<init>()
            r0.f166907A = r12
            int r15 = r8 * r6
            je1.h2 r8 = je1.C46523h2.f125330a
            r14 = 5891(0x1703, float:8.255E-42)
            r13 = r28
            te3.ig0 r8 = r8.mo71860b(r14, r13)
            r12.f185356d = r8
            te3.s71 r8 = r0.f166907A
            r8.f185359g = r1
            r8.f185358f = r3
            r8.f185360h = r5
            r8.f185361i = r6
            r8.f185362j = r15
            r8.f185357e = r7
            r8.f185363n = r9
            r5 = r26
            r8.f185364o = r5
            r8.f185367r = r10
            r5 = r29
            r8.f185368s = r5
            r8.f185369t = r11
            r5 = r31
            r8.f185370u = r5
            r6 = r34
            r8.f185373x = r6
            r6 = r35
            r11 = 5891(0x1703, float:8.255E-42)
            r8.f185372w = r6
            pe3.b r6 = pe3.C89349b.m111674a(r32)
            r8.f185365p = r6
            te3.s71 r6 = r0.f166907A
            java.util.LinkedList<pe3.b> r6 = r6.f185371v
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r12 = r33.iterator()
        L_0x0093:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00b5
            java.lang.Object r13 = r12.next()
            r14 = r13
            qj1.si$a r14 = (qj1.C12666si.C12667a) r14
            te3.q71 r14 = r14.f36274b
            if (r14 == 0) goto L_0x00ae
            if (r14 == 0) goto L_0x00a9
            pe3.b r14 = r14.f140169d
            goto L_0x00aa
        L_0x00a9:
            r14 = 0
        L_0x00aa:
            if (r14 == 0) goto L_0x00ae
            r14 = 1
            goto L_0x00af
        L_0x00ae:
            r14 = 0
        L_0x00af:
            if (r14 == 0) goto L_0x0093
            r8.add(r13)
            goto L_0x0093
        L_0x00b5:
            java.util.ArrayList r12 = new java.util.ArrayList
            r13 = 10
            int r13 = sx3.C36907w.m41090l(r8, r13)
            r12.<init>(r13)
            java.util.Iterator r8 = r8.iterator()
        L_0x00c4:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto L_0x00dc
            java.lang.Object r13 = r8.next()
            qj1.si$a r13 = (qj1.C12666si.C12667a) r13
            te3.q71 r13 = r13.f36274b
            if (r13 == 0) goto L_0x00d7
            pe3.b r13 = r13.f140169d
            goto L_0x00d8
        L_0x00d7:
            r13 = 0
        L_0x00d8:
            r12.add(r13)
            goto L_0x00c4
        L_0x00dc:
            r6.addAll(r12)
            org.json.JSONObject r6 = r0.f166914z
            te3.s71 r8 = r0.f166907A
            java.lang.String r8 = r8.f185360h
            java.lang.String r12 = "reward_product_id"
            r6.put(r12, r8)
            org.json.JSONObject r6 = r0.f166914z
            te3.s71 r8 = r0.f166907A
            int r8 = r8.f185361i
            java.lang.String r12 = "reward_product_count"
            r6.put(r12, r8)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "liveId:"
            r6.append(r8)
            r6.append(r1)
            java.lang.String r1 = " objectId:"
            r6.append(r1)
            r6.append(r3)
            java.lang.String r1 = " rewardProductId:"
            r6.append(r1)
            java.lang.String r1 = r0.f166908t
            r6.append(r1)
            java.lang.String r1 = " rewardProductCount:"
            r6.append(r1)
            int r1 = r0.f166909u
            r6.append(r1)
            java.lang.String r1 = " fromUser:"
            r6.append(r1)
            r6.append(r7)
            java.lang.String r1 = " toUser:"
            r6.append(r1)
            r6.append(r10)
            java.lang.String r1 = " requestId:"
            r6.append(r1)
            r6.append(r9)
            java.lang.String r1 = " wecoin:"
            r6.append(r1)
            r1 = r24
            r6.append(r1)
            java.lang.String r1 = ",amountPrice:"
            r6.append(r1)
            r6.append(r15)
            java.lang.String r1 = ", reward_type:"
            r6.append(r1)
            int r1 = r0.f166910v
            r6.append(r1)
            java.lang.String r1 = ",reward_ext_info:"
            r6.append(r1)
            if (r5 == 0) goto L_0x015e
            java.lang.String r1 = r31.mo123705h()
            goto L_0x015f
        L_0x015e:
            r1 = 0
        L_0x015f:
            r6.append(r1)
            java.lang.String r1 = ",live_identity:"
            r6.append(r1)
            te3.s71 r1 = r0.f166907A
            te3.ig0 r1 = r1.f185356d
            if (r1 == 0) goto L_0x0174
            int r1 = r1.f135318j
            java.lang.Integer r15 = java.lang.Integer.valueOf(r1)
            goto L_0x0175
        L_0x0174:
            r15 = 0
        L_0x0175:
            r6.append(r15)
            java.lang.String r1 = ", pkgBatchId:"
            r6.append(r1)
            java.lang.String r1 = r0.f166911w
            r6.append(r1)
            java.lang.String r1 = ", pkgDurationId:"
            r6.append(r1)
            java.lang.String r1 = r0.f166912x
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            java.lang.String r2 = "Finder.CgiFinderLiveReward"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            jm2.f r1 = jm2.C117361f.INSTANCE
            r2 = 540999695(0x203f000f, float:1.6178349E-19)
            r3 = 7
            r1.mo182037oK(r2, r3)
            ob0.c$b r1 = new ob0.c$b
            r1.<init>()
            te3.s71 r2 = r0.f166907A
            r1.f127066a = r2
            te3.t71 r2 = new te3.t71
            r2.<init>()
            te3.ja r3 = new te3.ja
            r3.<init>()
            r2.setBaseResponse(r3)
            te3.ja r3 = r2.getBaseResponse()
            te3.rv3 r4 = new te3.rv3
            r4.<init>()
            r3.f135956e = r4
            r1.f127067b = r2
            java.lang.String r2 = "/cgi-bin/micromsg-bin/finderlivereward"
            r1.f127068c = r2
            r1.f127069d = r11
            ob0.c r1 = r1.mo72403a()
            r0.mo123453j(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dj1.C58291w0.<init>(long, long, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, te3.hj1, java.lang.String, int, pe3.b, byte[], java.util.List, java.lang.String, java.lang.String, dj1.w0$a):void");
    }

    /* renamed from: N */
    public JSONObject mo8506N() {
        return this.f166914z;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C51354t71 t712 = (C51354t71) eu32;
        C87412m.m108594g(t712, "resp");
        Log.m105924i("Finder.CgiFinderLiveReward", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        C58292a aVar = this.f166913y;
        if (aVar != null) {
            aVar.mo75770a(i, i2, str, t712);
        }
        C62042e.f176370a.mo87015J0(i, i2, t712.f142017f, (C32224a<C13598b0>) null);
    }
}
