package dj1;

import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import eb0.C75592q0;
import fj1.C45795b;
import gy3.C8480h;
import gy3.C87412m;
import ob0.C117747y;
import ok1.C62042e;
import org.json.JSONObject;
import p910lj.C76701a;
import te3.C49335eu3;
import te3.C50543nh1;
import te3.C64556mh1;
import te3.C64674r41;

/* renamed from: dj1.z */
public final class C58294z extends C58286q<C50543nh1> {

    /* renamed from: x */
    public static final C7351b f166917x = new C7351b((C8480h) null);

    /* renamed from: t */
    public final C64674r41 f166918t;

    /* renamed from: u */
    public final String f166919u = "Finder.CgiFinderLiveCommentPostNew";

    /* renamed from: v */
    public final JSONObject f166920v = new JSONObject();

    /* renamed from: w */
    public C64556mh1 f166921w;

    /* renamed from: dj1.z$a */
    public interface C7350a {
        /* renamed from: a */
        void mo8521a(int i, int i2, String str, C50543nh1 nh12);
    }

    /* renamed from: dj1.z$b */
    public static final class C7351b {
        public C7351b(C8480h hVar) {
        }

        /* renamed from: a */
        public final C64674r41 mo8522a(String str, int i, int i2) {
            String str2;
            C45795b bVar;
            C87412m.m108594g(str, "content");
            C64674r41 r412 = new C64674r41();
            r412.f185126f = str;
            if (FinderLiveService.f159376d == null || (bVar = FinderLiveService.f159348A) == null || (str2 = C62042e.f176370a.mo87050W(bVar).nickname) == null) {
                str2 = C75592q0.m90783m();
            }
            r412.f185124d = str2;
            r412.f185127g = i;
            r412.f185137t = i2;
            r412.f185136s = i2 > 0 ? 1 : 0;
            return r412;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C58294z(long r13, byte[] r15, long r16, java.lang.String r18, java.lang.String r19, te3.C49712hj1 r20, te3.C64674r41 r21, java.lang.String r22, java.lang.String r23, te3.C64414h71 r24) {
        /*
            r12 = this;
            r0 = r12
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            java.lang.String r6 = "nonceId"
            gy3.C87412m.m108594g(r1, r6)
            java.lang.String r6 = "finderUsername"
            gy3.C87412m.m108594g(r2, r6)
            java.lang.String r6 = "contextObj"
            gy3.C87412m.m108594g(r3, r6)
            java.lang.String r6 = "finderLiveMsg"
            gy3.C87412m.m108594g(r4, r6)
            java.lang.String r6 = "clientMsgId"
            gy3.C87412m.m108594g(r5, r6)
            r12.<init>(r3)
            r0.f166918t = r4
            java.lang.String r6 = "Finder.CgiFinderLiveCommentPostNew"
            r0.f166919u = r6
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            r0.f166920v = r7
            te3.mh1 r7 = new te3.mh1
            r7.<init>()
            r0.f166921w = r7
            je1.h2 r8 = je1.C46523h2.f125330a
            r9 = 3896(0xf38, float:5.46E-42)
            te3.ig0 r10 = r8.mo71860b(r9, r3)
            r7.f184328d = r10
            te3.mh1 r7 = r0.f166921w
            r10 = r13
            r7.f184331g = r10
            r10 = r16
            r7.f184333i = r10
            r7.f184332h = r5
            pe3.b r5 = pe3.C89349b.m111674a(r15)
            r7.f184329e = r5
            te3.mh1 r5 = r0.f166921w
            r5.f184330f = r4
            r5.f184334j = r1
            r5.f184335n = r2
            te3.lh1 r1 = new te3.lh1
            r1.<init>()
            r2 = r23
            r1.f137422d = r2
            r5.f184336o = r1
            te3.mh1 r1 = r0.f166921w
            r2 = r24
            r1.f184337p = r2
            te3.ig0 r1 = r1.f184328d
            rx3.l r2 = new rx3.l
            int r3 = r3.f134677n
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Long r4 = java.lang.Long.valueOf(r16)
            r2.<init>(r3, r4)
            java.util.List r2 = sx3.C26236u.m33719b(r2)
            r3 = 0
            r8.mo71865g(r1, r2, r3)
            jm2.f r1 = jm2.C117361f.INSTANCE
            r2 = 540999694(0x203f000e, float:1.6178347E-19)
            r4 = 6
            r1.mo182037oK(r2, r4)
            ob0.c$b r1 = new ob0.c$b
            r1.<init>()
            te3.mh1 r2 = r0.f166921w
            r1.f127066a = r2
            te3.nh1 r2 = new te3.nh1
            r2.<init>()
            te3.ja r4 = new te3.ja
            r4.<init>()
            r2.setBaseResponse(r4)
            te3.ja r4 = r2.getBaseResponse()
            te3.rv3 r5 = new te3.rv3
            r5.<init>()
            r4.f135956e = r5
            r1.f127067b = r2
            java.lang.String r2 = "/cgi-bin/micromsg-bin/finderpostlivemsg"
            r1.f127068c = r2
            r1.f127069d = r9
            ob0.c r1 = r1.mo72403a()
            r12.mo123453j(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "CgiFinderLiveCommentPost init "
            r1.append(r2)
            te3.mh1 r2 = r0.f166921w
            long r4 = r2.f184331g
            r1.append(r4)
            java.lang.String r2 = ",msgId:"
            r1.append(r2)
            te3.mh1 r2 = r0.f166921w
            java.lang.String r2 = r2.f184332h
            r1.append(r2)
            r2 = 44
            r1.append(r2)
            te3.mh1 r2 = r0.f166921w
            te3.r41 r2 = r2.f184330f
            if (r2 == 0) goto L_0x00ec
            java.lang.String r2 = r2.f185126f
            goto L_0x00ed
        L_0x00ec:
            r2 = r3
        L_0x00ed:
            r1.append(r2)
            java.lang.String r2 = ",type:"
            r1.append(r2)
            te3.mh1 r2 = r0.f166921w
            te3.r41 r2 = r2.f184330f
            if (r2 == 0) goto L_0x0102
            int r2 = r2.f185127g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0103
        L_0x0102:
            r2 = r3
        L_0x0103:
            r1.append(r2)
            java.lang.String r2 = ",float_type:"
            r1.append(r2)
            te3.mh1 r2 = r0.f166921w
            te3.r41 r2 = r2.f184330f
            if (r2 == 0) goto L_0x0118
            int r2 = r2.f185137t
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0119
        L_0x0118:
            r2 = r3
        L_0x0119:
            r1.append(r2)
            java.lang.String r2 = "(is float:"
            r1.append(r2)
            te3.mh1 r2 = r0.f166921w
            te3.r41 r2 = r2.f184330f
            if (r2 == 0) goto L_0x012d
            int r2 = r2.f185136s
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
        L_0x012d:
            r1.append(r3)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dj1.C58294z.<init>(long, byte[], long, java.lang.String, java.lang.String, te3.hj1, te3.r41, java.lang.String, java.lang.String, te3.h71):void");
    }

    /* renamed from: R0 */
    public JSONObject mo8510R0() {
        return this.f166920v;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C50543nh1) eu32, "resp");
        String str2 = this.f166919u;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        if (i2 == -200024 && (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE)) {
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "已被安全拦截", 0).show();
        }
        this.f166920v.put("liveId", this.f166921w.f184331g);
        this.f166920v.put("msg", this.f166918t.f185126f);
    }
}
