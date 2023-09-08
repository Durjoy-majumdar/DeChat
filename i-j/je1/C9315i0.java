package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import it1.C60625c;
import o40.C61926c;
import ob0.C117747y;
import te3.C49310eo0;
import te3.C49335eu3;

/* renamed from: je1.i0 */
public final class C9315i0 extends C60625c<C49310eo0> {

    /* renamed from: s */
    public final C9316a f29106s;

    /* renamed from: t */
    public final String f29107t;

    /* renamed from: je1.i0$a */
    public interface C9316a {
        /* renamed from: a */
        void mo10069a(int i, int i2, String str, C49310eo0 eo02);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9315i0(java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6, je1.C9315i0.C9316a r7, te3.C49712hj1 r8, int r9, int r10, gy3.C8480h r11) {
        /*
            r2 = this;
            r11 = r10 & 1
            java.lang.String r0 = ""
            if (r11 == 0) goto L_0x0007
            r3 = r0
        L_0x0007:
            r11 = r10 & 2
            if (r11 == 0) goto L_0x000c
            r4 = r0
        L_0x000c:
            r11 = r10 & 4
            if (r11 == 0) goto L_0x0011
            r5 = r0
        L_0x0011:
            r11 = r10 & 8
            r0 = 0
            if (r11 == 0) goto L_0x0017
            r6 = 0
        L_0x0017:
            r11 = r10 & 16
            r1 = 0
            if (r11 == 0) goto L_0x001d
            r7 = r1
        L_0x001d:
            r11 = r10 & 32
            if (r11 == 0) goto L_0x0022
            r8 = r1
        L_0x0022:
            r10 = r10 & 64
            if (r10 == 0) goto L_0x0027
            r9 = 0
        L_0x0027:
            java.lang.String r10 = "noticeId"
            gy3.C87412m.m108594g(r3, r10)
            java.lang.String r10 = "appid"
            gy3.C87412m.m108594g(r4, r10)
            java.lang.String r10 = "anchorFinderUsername"
            gy3.C87412m.m108594g(r5, r10)
            r10 = 2
            r2.<init>(r8, r1, r10, r1)
            r2.f29106s = r7
            java.lang.String r7 = "Finder.CgiFinderGetLiveNotice"
            r2.f29107t = r7
            te3.do0 r8 = new te3.do0
            r8.<init>()
            r8.f132441d = r3
            int r10 = r4.length()
            r11 = 1
            if (r10 != 0) goto L_0x004f
            r0 = 1
        L_0x004f:
            if (r0 != 0) goto L_0x005c
            te3.j51 r10 = new te3.j51
            r10.<init>()
            r10.f135871d = r11
            r10.f135872e = r4
            r8.f132442e = r10
        L_0x005c:
            r8.f132443f = r5
            r8.f132444g = r6
            r8.f132445h = r9
            ob0.c$b r5 = new ob0.c$b
            r5.<init>()
            r5.f127066a = r8
            te3.eo0 r6 = new te3.eo0
            r6.<init>()
            te3.ja r8 = new te3.ja
            r8.<init>()
            r6.setBaseResponse(r8)
            te3.ja r8 = r6.getBaseResponse()
            te3.rv3 r10 = new te3.rv3
            r10.<init>()
            r8.f135956e = r10
            r5.f127067b = r6
            java.lang.String r6 = "/cgi-bin/micromsg-bin/findergetlivenotice"
            r5.f127068c = r6
            r6 = 5872(0x16f0, float:8.228E-42)
            r5.f127069d = r6
            ob0.c r5 = r5.mo72403a()
            r2.mo123453j(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "init noticeId:"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = " order:"
            r5.append(r3)
            r5.append(r9)
            java.lang.String r3 = " appid:"
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C9315i0.<init>(java.lang.String, java.lang.String, java.lang.String, int, je1.i0$a, te3.hj1, int, int, gy3.h):void");
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C49310eo0 eo02 = (C49310eo0) eu32;
        C87412m.m108594g(eo02, "resp");
        String str2 = this.f29107t;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
        C61926c.m72668M(new C9322j0(this, i, i2, str, eo02));
    }
}
