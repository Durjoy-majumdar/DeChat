package j00;

import com.tencent.p014mm.plugin.wepkg.model.C44502l;
import di3.C86301e;
import ei3.C86522b;
import k00.C46630b;
import k00.C9550c;
import kb3.C46669f;
import kb3.C46677m;

@C86522b
/* renamed from: j00.h */
public class C46394h extends C86301e implements C46630b {

    /* renamed from: j00.h$a */
    public class C46395a implements C46669f {

        /* renamed from: a */
        public final /* synthetic */ C46630b.C46631a f124987a;

        public C46395a(C46394h hVar, C46630b.C46631a aVar) {
            this.f124987a = aVar;
        }

        /* renamed from: a */
        public void mo71802a(String str) {
            this.f124987a.mo71899a(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        if (r0 == null) goto L_0x0038;
     */
    /* renamed from: FW */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo71799FW(java.lang.String r10, java.lang.String r11, long r12, boolean r14, k00.C46630b.C46631a r15) {
        /*
            r9 = this;
            j00.h$a r3 = new j00.h$a
            r3.<init>(r9, r15)
            r15 = 1
            r0 = 0
            if (r10 == 0) goto L_0x0012
            int r1 = r10.length()
            if (r1 != 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r1 = 0
            goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            if (r1 != 0) goto L_0x0073
            if (r11 == 0) goto L_0x001f
            int r1 = r11.length()
            if (r1 != 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r15 = 0
        L_0x001f:
            if (r15 == 0) goto L_0x0022
            goto L_0x0073
        L_0x0022:
            com.tencent.mm.plugin.wepkg.model.WepkgVersion r5 = com.tencent.p014mm.plugin.wepkg.model.C44509m.m48883d(r10)
            te3.vw r15 = new te3.vw
            r15.<init>()
            r15.f143738d = r10
            if (r14 == 0) goto L_0x0030
            goto L_0x0038
        L_0x0030:
            if (r5 == 0) goto L_0x0035
            java.lang.String r0 = r5.f120653f
            goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            if (r0 != 0) goto L_0x003a
        L_0x0038:
            java.lang.String r0 = ""
        L_0x003a:
            r15.f143739e = r0
            ob0.c$b r0 = new ob0.c$b
            r0.<init>()
            te3.pv r1 = new te3.pv
            r1.<init>()
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r2.add(r15)
            r1.f139995d = r2
            r0.f127066a = r1
            te3.qv r15 = new te3.qv
            r15.<init>()
            r0.f127067b = r15
            java.lang.String r15 = "/cgi-bin/mmgame-bin/checkwepkgversion"
            r0.f127068c = r15
            r15 = 1313(0x521, float:1.84E-42)
            r0.f127069d = r15
            ob0.c r15 = r0.mo72403a()
            kb3.p r8 = new kb3.p
            r0 = r8
            r1 = r10
            r2 = r11
            r4 = r14
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.tencent.p014mm.plugin.wepkg.utils.WepkgRunCgi.m48903c(r15, r8)
            goto L_0x0096
        L_0x0073:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "gamelog.webpkg, fetchLastLitePkg , pkgId = "
            r12.append(r13)
            r12.append(r10)
            java.lang.String r10 = " appId = "
            r12.append(r10)
            r12.append(r11)
            java.lang.String r10 = r12.toString()
            java.lang.String r11 = "MicroMsg.WePkgUpdateManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r10)
            java.lang.String r10 = "pkgId or appId isNullOrEmpty"
            r3.mo71802a(r10)
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j00.C46394h.mo71799FW(java.lang.String, java.lang.String, long, boolean, k00.b$a):void");
    }

    public C9550c Pl0() {
        return new C46677m();
    }

    public void Ps0(C46630b.C46632b bVar) {
        C44502l.m48872b(bVar);
    }
}
