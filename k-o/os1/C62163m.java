package os1;

import bl3.C0327w;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import p185kq.C10383h;
import te3.C64586nn1;
import te3.C64782vp3;

/* renamed from: os1.m */
public final class C62163m extends C0327w<FinderCommonFeatureService> {

    /* renamed from: e */
    public C62170x f176737e;

    /* renamed from: f */
    public C64782vp3 f176738f;

    /* renamed from: g */
    public boolean f176739g;

    /* renamed from: c3 */
    public final C62170x mo87208c3() {
        if (this.f176737e == null) {
            C62170x xVar = new C62170x((C64782vp3) null, 1, (C8480h) null);
            xVar.f176756a.f185969e = ((C10383h) C86312j.m106911c(C10383h.class)).mo10696E();
            this.f176737e = xVar;
        }
        C62170x xVar2 = this.f176737e;
        C87412m.m108591d(xVar2);
        return xVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r2 = r0.f176756a;
     */
    /* renamed from: d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final os1.C62170x mo87209d3(int r4) {
        /*
            r3 = this;
            boolean r0 = r3.mo87214j3()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            os1.x r0 = r3.f176737e
            if (r0 == 0) goto L_0x0012
            te3.vp3 r2 = r0.f176756a
            if (r2 == 0) goto L_0x0012
            r2.f185968d = r4
        L_0x0012:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = "[consumeRedDotSession] "
            r4.append(r2)
            if (r0 == 0) goto L_0x0027
            te3.vp3 r2 = r0.f176756a
            if (r2 == 0) goto L_0x0027
            java.lang.String r2 = os1.C62164n.m73026b(r2)
            goto L_0x0028
        L_0x0027:
            r2 = r1
        L_0x0028:
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            java.lang.String r2 = "Finder.RedDotSessionVM"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            r3.f176737e = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: os1.C62163m.mo87209d3(int):os1.x");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r5 = r3.field_ctrInfo;
     */
    /* renamed from: e3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87210e3() {
        /*
            r10 = this;
            os1.x r0 = r10.mo87208c3()
            boolean r1 = r0.f176762g
            if (r1 == 0) goto L_0x005c
            te3.vp3 r1 = r0.f176756a
            java.util.LinkedList<te3.sp3> r1 = r1.f185974j
            te3.sp3 r2 = new te3.sp3
            r2.<init>()
            com.tencent.mm.plugin.finder.extension.reddot.s0 r3 = r0.f176764i
            r4 = 0
            if (r3 == 0) goto L_0x001d
            te3.xi1 r5 = r3.field_ctrInfo
            if (r5 == 0) goto L_0x001d
            pe3.b r5 = r5.f144685w
            goto L_0x001e
        L_0x001d:
            r5 = r4
        L_0x001e:
            r2.f185436f = r5
            r5 = 0
            if (r3 == 0) goto L_0x0026
            int r3 = r3.field_ctrType
            goto L_0x0027
        L_0x0026:
            r3 = 0
        L_0x0027:
            r2.f185435e = r3
            int r3 = r0.f176765j
            long r6 = (long) r3
            r2.f185437g = r6
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r0.f176763h
            long r6 = r6 - r8
            r3 = 1000(0x3e8, float:1.401E-42)
            long r8 = (long) r3
            long r6 = r6 / r8
            r2.f185434d = r6
            r1.add(r2)
            r0.f176762g = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[dismissLeft] tipsId="
            r1.append(r2)
            com.tencent.mm.plugin.finder.extension.reddot.s0 r0 = r0.f176764i
            if (r0 == 0) goto L_0x0050
            java.lang.String r4 = r0.field_tipsId
        L_0x0050:
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "Finder.RedDotSessionVM"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: os1.C62163m.mo87210e3():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r5 = r3.field_ctrInfo;
     */
    /* renamed from: f3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87211f3() {
        /*
            r10 = this;
            os1.x r0 = r10.mo87208c3()
            boolean r1 = r0.f176758c
            if (r1 == 0) goto L_0x005c
            te3.vp3 r1 = r0.f176756a
            java.util.LinkedList<te3.sp3> r1 = r1.f185975n
            te3.sp3 r2 = new te3.sp3
            r2.<init>()
            com.tencent.mm.plugin.finder.extension.reddot.s0 r3 = r0.f176760e
            r4 = 0
            if (r3 == 0) goto L_0x001d
            te3.xi1 r5 = r3.field_ctrInfo
            if (r5 == 0) goto L_0x001d
            pe3.b r5 = r5.f144685w
            goto L_0x001e
        L_0x001d:
            r5 = r4
        L_0x001e:
            r2.f185436f = r5
            r5 = 0
            if (r3 == 0) goto L_0x0026
            int r3 = r3.field_ctrType
            goto L_0x0027
        L_0x0026:
            r3 = 0
        L_0x0027:
            r2.f185435e = r3
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r0.f176759d
            long r6 = r6 - r8
            r3 = 1000(0x3e8, float:1.401E-42)
            long r8 = (long) r3
            long r6 = r6 / r8
            r2.f185434d = r6
            r1.add(r2)
            r0.f176758c = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[dismissRight] tipsId="
            r1.append(r2)
            com.tencent.mm.plugin.finder.extension.reddot.s0 r0 = r0.f176760e
            if (r0 == 0) goto L_0x004b
            java.lang.String r4 = r0.field_tipsId
        L_0x004b:
            r1.append(r4)
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "Finder.RedDotSessionVM"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: os1.C62163m.mo87211f3():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        r2 = r4.f176756a;
     */
    /* renamed from: g3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87212g3(os1.C62170x r4) {
        /*
            r3 = this;
            boolean r0 = r3.mo87214j3()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[doSync] "
            r0.append(r1)
            r1 = 0
            if (r4 == 0) goto L_0x001d
            te3.vp3 r2 = r4.f176756a
            if (r2 == 0) goto L_0x001d
            java.lang.String r2 = os1.C62164n.m73026b(r2)
            goto L_0x001e
        L_0x001d:
            r2 = r1
        L_0x001e:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Finder.RedDotSessionVM"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            if (r4 == 0) goto L_0x002e
            te3.vp3 r1 = r4.f176756a
        L_0x002e:
            r3.f176738f = r1
            if (r1 == 0) goto L_0x0046
            java.lang.Class<tf0.p1> r4 = tf0.C64916p1.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            tf0.p1 r4 = (tf0.C64916p1) r4
            fe1.j r4 = r4.mo9108z2()
            r0 = 506365(0x7b9fd, float:7.09568E-40)
            r1 = 19
            r4.mo58458b(r0, r1)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: os1.C62163m.mo87212g3(os1.x):void");
    }

    /* renamed from: i3 */
    public final void mo87213i3(String str) {
        if (mo87214j3()) {
            Log.m105924i("Finder.RedDotSessionVM", "[fallback] source=" + str);
            if (!C87412m.m108589b(str, "exitFindPage")) {
                C2479n0 n0Var = C2479n0.f12955a;
                C2479n0.C2480a value = C2479n0.f12951H.getValue();
                if (!(value == null || value.f12910c == null)) {
                    mo87215k3(value);
                }
                C2479n0.C2480a value2 = C2479n0.f12957c.getValue();
                if (!(value2 == null || value2.f12910c == null)) {
                    mo87216l3(value2);
                }
            }
            mo87211f3();
            mo87210e3();
        }
    }

    /* renamed from: j3 */
    public final boolean mo87214j3() {
        return C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_SYNC_RED_DOT_SESSION_REPORT_SWITCH_INT, 0) > 0;
    }

    /* renamed from: k3 */
    public final void mo87215k3(C2479n0.C2480a aVar) {
        C62170x c3 = mo87208c3();
        if (!c3.f176762g) {
            c3.f176762g = true;
            c3.f176763h = System.currentTimeMillis();
            c3.f176764i = aVar.f12910c;
            C64586nn1 nn12 = aVar.f12909b;
            c3.f176765j = nn12 != null ? nn12.f184503e : 0;
            StringBuilder sb = new StringBuilder();
            sb.append("[showLeft] tipsId=");
            C55718s0 s0Var = c3.f176764i;
            sb.append(s0Var != null ? s0Var.field_tipsId : null);
            Log.m105924i("Finder.RedDotSessionVM", sb.toString());
        }
    }

    /* renamed from: l3 */
    public final void mo87216l3(C2479n0.C2480a aVar) {
        C62170x c3 = mo87208c3();
        C55718s0 s0Var = c3.f176760e;
        String str = null;
        String str2 = s0Var != null ? s0Var.field_tipsId : null;
        C55718s0 s0Var2 = aVar.f12910c;
        if (!C87412m.m108589b(str2, s0Var2 != null ? s0Var2.field_tipsId : null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("[showLeft] change ");
            C55718s0 s0Var3 = c3.f176760e;
            sb.append(s0Var3 != null ? s0Var3.field_tipsId : null);
            sb.append(" -> ");
            C55718s0 s0Var4 = aVar.f12910c;
            sb.append(s0Var4 != null ? s0Var4.field_tipsId : null);
            Log.m105924i("Finder.RedDotSessionVM", sb.toString());
            mo87211f3();
        }
        if (!c3.f176758c) {
            c3.f176758c = true;
            c3.f176759d = System.currentTimeMillis();
            c3.f176760e = aVar.f12910c;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("[showRight] tipsId=");
            C55718s0 s0Var5 = c3.f176760e;
            if (s0Var5 != null) {
                str = s0Var5.field_tipsId;
            }
            sb4.append(str);
            Log.m105924i("Finder.RedDotSessionVM", sb4.toString());
        }
    }
}
