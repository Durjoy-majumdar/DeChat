package ie1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FinderCommentErrorEvent;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import it1.C60628i;
import kj2.C117407d;
import ob0.C11385n;
import ob0.C47350c;
import ot1.C11767a;

/* renamed from: ie1.a */
public final class C60274a extends C60628i {

    /* renamed from: n */
    public static long f171835n;

    /* renamed from: g */
    public final long f171836g;

    /* renamed from: h */
    public C47350c f171837h;

    /* renamed from: i */
    public C11385n f171838i;

    /* renamed from: j */
    public long f171839j;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C60274a(long r15, java.lang.String r17, long r18, int r20, java.lang.String r21, te3.C49712hj1 r22, boolean r23, long r24) {
        /*
            r14 = this;
            r0 = r14
            r1 = r15
            r3 = r17
            r4 = r18
            r6 = r20
            r7 = r21
            r8 = r22
            java.lang.String r9 = "objectNonceId"
            gy3.C87412m.m108594g(r3, r9)
            java.lang.String r9 = "content"
            gy3.C87412m.m108594g(r7, r9)
            r14.<init>(r8)
            r0.f171836g = r1
            long r9 = eb0.C31543z5.m39453c()
            r0.f171839j = r9
            long r11 = f171835n
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x002e
            r9 = 1
            long r9 = r9 + r11
            f171835n = r9
            r0.f171839j = r11
        L_0x002e:
            long r9 = r0.f171839j
            f171835n = r9
            te3.eh1 r9 = new te3.eh1
            r9.<init>()
            je1.h2 r10 = je1.C46523h2.f125330a
            r11 = 7143(0x1be7, float:1.001E-41)
            te3.ig0 r8 = r10.mo71860b(r11, r8)
            r9.f182953d = r8
            long r12 = r0.f171839j
            java.lang.String r8 = java.lang.String.valueOf(r12)
            r9.f182960n = r8
            r9.f182954e = r1
            r9.f182961o = r3
            r9.f182957h = r7
            r9.f182955f = r4
            long r12 = (long) r6
            r9.f182958i = r12
            r3 = 2
            if (r6 != r3) goto L_0x005b
            r12 = r24
            r9.f182962p = r12
        L_0x005b:
            r6 = 1
            if (r23 != 0) goto L_0x0068
            up1.f r8 = up1.C37521f.f99374d
            int r8 = r8.mo61154H()
            if (r8 != r6) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r3 = 1
        L_0x0068:
            r9.f182959j = r3
            bl3.r r3 = bl3.C39818r.f106831a
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r8 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            bl3.r$a r3 = r3.mo62446e(r8)
            java.lang.Class<os1.u> r8 = os1.C62168u.class
            androidx.lifecycle.i0 r3 = r3.mo75002a(r8)
            os1.u r3 = (os1.C62168u) r3
            int r3 = r3.mo87220d3(r1)
            int r3 = r3 + r6
            r9.f182963q = r3
            ob0.c$b r3 = new ob0.c$b
            r3.<init>()
            java.lang.String r6 = "/cgi-bin/micromsg-bin/finderpostbulletcomment"
            r3.f127068c = r6
            r3.f127069d = r11
            r3.f127066a = r9
            te3.fh1 r6 = new te3.fh1
            r6.<init>()
            r3.f127067b = r6
            ob0.c r3 = r3.mo72403a()
            r0.f171837h = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "NetSceneFinderBulletPost videoObjectId="
            r3.append(r6)
            java.lang.String r1 = o40.C61926c.m72691p(r15)
            r3.append(r1)
            java.lang.String r1 = ", videoTimeStamp="
            r3.append(r1)
            r3.append(r4)
            java.lang.String r1 = ", content="
            r3.append(r1)
            r3.append(r7)
            java.lang.String r1 = ", feed_play_times="
            r3.append(r1)
            int r1 = r9.f182963q
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "FinderBulletPostCgi"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ie1.C60274a.<init>(long, java.lang.String, long, int, java.lang.String, te3.hj1, boolean, long):void");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f171838i = nVar;
        return dispatch(gVar, this.f171837h, this);
    }

    public int getType() {
        return 7143;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C11385n nVar = this.f171838i;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        String string = Util.isNullOrNil(str) ? MMApplicationContext.getContext().getString(C0966R.string.d3q) : str;
        if (i2 == 4 && i3 == -4010) {
            if (string != null) {
                C11767a.f34453a.mo11666h(string);
            }
            C117407d.INSTANCE.idkeyStat(1264, 4, 1, false);
        }
        if (Util.isNullOrNil(str)) {
            str = MMApplicationContext.getContext().getString(C0966R.string.d3p);
        }
        if (i2 == 4 && i3 == -4013 && str != null) {
            C11767a.f34453a.mo11666h(str);
            FinderCommentErrorEvent finderCommentErrorEvent = new FinderCommentErrorEvent();
            FinderCommentErrorEvent.C1043a aVar = finderCommentErrorEvent.f9188d;
            aVar.f9189a = i3;
            aVar.f9190b = str;
            finderCommentErrorEvent.publish();
        }
    }
}
