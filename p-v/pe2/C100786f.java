package pe2;

import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C31478i2;
import eb0.C31543z5;
import f40.C86709a0;
import f62.C75700k0;
import h81.C32735h;
import i21.C98590g;
import ke2.C99129c;
import kj2.C117407d;
import ne2.C34823a;
import p158gt.C76053l;
import p158gt.C98201k;
import p740wo.C53193b;
import te2.C101750g;
import te3.C101797js;
import te3.C101826p8;
import te3.C101831q8;
import xe2.C102630a;

/* renamed from: pe2.f */
public class C100786f {
    /* renamed from: a */
    public static int m131970a(int i) {
        switch (i) {
            case 1:
            case 4:
            case 5:
            case 6:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 7:
                return 4;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    public static long m131971b(double d) {
        if (d >= 0.7d) {
            return 50;
        }
        return d < 0.3d ? 30 : 40;
    }

    /* renamed from: c */
    public static final void m131972c(int i, long j, int i2, C101831q8 q8Var) {
        C101831q8 q8Var2 = q8Var;
        Class cls = C75700k0.class;
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_mmc2c_img_auto_download_report_flag, false)) {
            String formatedNetType = NetStatusUtil.getFormatedNetType(MMApplicationContext.getContext());
            int i3 = C72996z1.m85820U5(q8Var2.f299198e) ? 1 : 2;
            int i4 = C34823a.m40473c(q8Var2.f299198e) ? 1 : 2;
            int p1 = i3 == 1 ? ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(q8Var2.f299198e) : 1;
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(q8Var2.f299198e);
            int i5 = i3 == 1 ? z1Var.mo62927s3() ? 3 : 4 : z1Var.mo62934u3() ? 1 : 2;
            int i6 = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69755a0(q8Var2.f299198e) ? 1 : 2;
            long round = Math.round(q8Var2.f299208r * 100.0d);
            C99129c cVar = (C99129c) C86312j.m106911c(C99129c.class);
            cVar.requireAccountInitialized();
            C101797js b = cVar.f290666s.mo140859b(q8Var2.f299198e);
            long j2 = 0;
            int i7 = -1;
            if (b != null) {
                j2 = Math.round(b.f298560i * 100.0d);
                i7 = b.f298561j;
            }
            String format = String.format("%d,%d,%d,%s,%d,%d,%d,%d,%d,%d,%d,%d,%s,%d,%d,%d,%d,%s,%d,%s,%s", new Object[]{Long.valueOf(q8Var2.f299197d), Integer.valueOf(i), Long.valueOf(j), formatedNetType, Integer.valueOf(q8Var2.f299202i), Integer.valueOf(i2), Long.valueOf(C31543z5.m39453c() - q8Var2.f299201h), 0, Integer.valueOf(q8Var2.f299206p), Long.valueOf(q8Var2.f299205o), Integer.valueOf(i3), Integer.valueOf(i4), q8Var2.f299198e, Integer.valueOf(p1), Integer.valueOf(i5), Integer.valueOf(i6), Long.valueOf(round), q8Var2.f299199f, Integer.valueOf(q8Var2.f299209s), Long.valueOf(j2), Integer.valueOf(i7)});
            Log.m105925i("MicroMsg.Priority.PriorityReportLogic", "report16308Img %s", format);
            C117407d.INSTANCE.kvStat(16308, format);
        }
    }

    /* renamed from: d */
    public static final void m131973d(int i, long j, int i2, C101826p8 p8Var) {
        C101826p8 p8Var2 = p8Var;
        Class cls = C75700k0.class;
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_mmc2c_file_auto_download_report_flag, false)) {
            String formatedNetType = NetStatusUtil.getFormatedNetType(MMApplicationContext.getContext());
            int i3 = C72996z1.m85820U5(p8Var2.f299088e) ? 1 : 2;
            int i4 = C34823a.m40473c(p8Var2.f299088e) ? 1 : 2;
            int p1 = i3 == 1 ? ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(p8Var2.f299088e) : 1;
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(p8Var2.f299088e);
            int i5 = i3 == 1 ? z1Var.mo62927s3() ? 3 : 4 : z1Var.mo62934u3() ? 1 : 2;
            int i6 = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69755a0(p8Var2.f299088e) ? 1 : 2;
            long round = Math.round(p8Var2.f299099s * 100.0d);
            C99129c cVar = (C99129c) C86312j.m106911c(C99129c.class);
            cVar.requireAccountInitialized();
            C101797js b = cVar.f290666s.mo140859b(p8Var2.f299088e);
            long j2 = 0;
            int i7 = -1;
            if (b != null) {
                j2 = Math.round(b.f298560i * 100.0d);
                i7 = b.f298561j;
            }
            String format = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[]{Long.valueOf(p8Var2.f299095o), Integer.valueOf(i), formatedNetType, Integer.valueOf(p8Var2.f299092i), Integer.valueOf(i2), Long.valueOf(C31543z5.m39453c() - p8Var2.f299091h), Long.valueOf(p8Var2.f299096p), p8Var2.f299097q, Integer.valueOf(i3), Integer.valueOf(i4), p8Var2.f299088e, Integer.valueOf(p1), Integer.valueOf(i5), Integer.valueOf(i6), Long.valueOf(round), Integer.valueOf(p8Var2.f299100t), p8Var2.f299089f, Long.valueOf(j), Integer.valueOf(p8Var2.f299090g), p8Var2.f299087d, Long.valueOf(j2), Integer.valueOf(i7), p8Var2.f299101u});
            Log.m105925i("MicroMsg.Priority.PriorityReportLogic", "report18569File %s", format);
            C117407d.INSTANCE.kvStat(18569, format);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0099  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m131974e(com.tencent.p014mm.storage.C72963f4 r13) {
        /*
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            long r2 = r13.mo108774y2()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            r2 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = 1
            r1[r4] = r3
            java.lang.String r3 = "%s_%s"
            java.lang.String r1 = java.lang.String.format(r3, r1)
            java.lang.Class<ke2.c> r3 = ke2.C99129c.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ke2.c r3 = (ke2.C99129c) r3
            r3.requireAccountInitialized()
            xe2.b r3 = r3.f290673z
            xe2.a r1 = r3.mo142287d3(r1)
            java.lang.String r3 = r13.mo108768t()
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85820U5(r3)
            if (r3 == 0) goto L_0x0046
            int r3 = r13.mo108769t2()
            if (r3 != 0) goto L_0x0046
            java.lang.String r3 = r13.getContent()
            java.lang.String r3 = eb0.C75604z3.m90849u(r3)
            goto L_0x004a
        L_0x0046:
            java.lang.String r3 = r13.getContent()
        L_0x004a:
            r5 = 0
            com.tencent.mm.message.l$b r3 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r3, r5)
            if (r3 == 0) goto L_0x0080
            java.lang.Class<ym.s> r5 = p763ym.C53543s.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ym.s r5 = (p763ym.C53543s) r5
            ym.i r5 = r5.mo74024KZ()
            java.lang.String r3 = r3.f195606o
            com.tencent.mm.pluginsdk.model.app.e r5 = (com.tencent.p014mm.pluginsdk.model.app.C72684e) r5
            com.tencent.mm.pluginsdk.model.app.d r3 = r5.mo100154qq(r3)
            if (r3 == 0) goto L_0x0080
            com.tencent.mm.vfs.m1 r5 = new com.tencent.mm.vfs.m1
            java.lang.String r6 = r3.field_fileFullPath
            r5.<init>((java.lang.String) r6)
            boolean r6 = r5.mo119967g()
            if (r6 == 0) goto L_0x0080
            long r5 = r5.mo119980r()
            long r7 = r3.field_totalLen
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x0080
            r3 = 3
            goto L_0x0081
        L_0x0080:
            r3 = 1
        L_0x0081:
            if (r1 == 0) goto L_0x0092
            int r1 = r1.getStatus()
            int r1 = m131970a(r1)
            if (r3 != r4) goto L_0x0091
            if (r1 == r0) goto L_0x0091
            r4 = r1
            goto L_0x0093
        L_0x0091:
            r4 = r1
        L_0x0092:
            r0 = r3
        L_0x0093:
            int r1 = r13.f230742Z
            if (r1 != r2) goto L_0x0099
            r0 = 4
            goto L_0x009a
        L_0x0099:
            r2 = r4
        L_0x009a:
            java.lang.Class<i21.g> r1 = i21.C98590g.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            r3 = r1
            i21.g r3 = (i21.C98590g) r3
            long r4 = r13.mo108774y2()
            java.lang.String r6 = r13.mo101010p2()
            long r7 = (long) r2
            long r9 = (long) r0
            long r11 = r13.getCreateTime()
            r3.mo137960DO(r4, r6, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pe2.C100786f.m131974e(com.tencent.mm.storage.f4):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a0  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m131975f(com.tencent.p014mm.storage.C72963f4 r16, boolean r17) {
        /*
            java.lang.Class<ke2.c> r0 = ke2.C99129c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ke2.c r0 = (ke2.C99129c) r0
            r0.requireAccountInitialized()
            com.tencent.mm.plugin.priority.model.c2c.img.b r0 = r0.f290661n
            long r1 = r16.getMsgId()
            te3.q8 r0 = r0.mo129627c(r1)
            if (r0 == 0) goto L_0x00b9
            te2.g$b r1 = te2.C101750g.f297828a
            java.lang.String r2 = r16.mo108768t()
            r3 = 1
            int r2 = r1.mo141183c(r3, r2)
            if (r2 == 0) goto L_0x0026
            goto L_0x00b9
        L_0x0026:
            java.lang.Class<gt.k> r2 = p158gt.C98201k.class
            di3.d r4 = di3.C86312j.m106911c(r2)
            gt.k r4 = (p158gt.C98201k) r4
            gt.m r4 = r4.mo137277xi()
            java.lang.String r5 = r0.f299198e
            long r6 = r0.f299205o
            com.tencent.mm.modelimage.m r4 = (com.tencent.p014mm.modelimage.C92839m) r4
            com.tencent.mm.modelimage.k r4 = r4.mo127168NQ(r5, r6)
            int r5 = r0.f299203j
            int r5 = m131970a(r5)
            boolean r6 = r4.mo127146q()
            r7 = 3
            if (r6 == 0) goto L_0x0097
            boolean r6 = r4.mo127145p()
            if (r6 == 0) goto L_0x0096
            java.lang.Class<gt.l> r6 = p158gt.C76053l.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            gt.l r6 = (p158gt.C76053l) r6
            com.tencent.mm.modelimage.k r4 = r6.mo106261jD(r4)
            if (r4 == 0) goto L_0x0096
            long r8 = r4.f267374a
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 <= 0) goto L_0x0096
            boolean r6 = r4.mo127146q()
            if (r6 == 0) goto L_0x0096
            di3.d r2 = di3.C86312j.m106911c(r2)
            gt.k r2 = (p158gt.C98201k) r2
            gt.m r2 = r2.mo137277xi()
            java.lang.String r4 = r4.f267378e
            com.tencent.mm.modelimage.m r2 = (com.tencent.p014mm.modelimage.C92839m) r2
            java.lang.String r6 = ""
            java.lang.String r2 = r2.mo127174TY(r4, r6, r6, r3)
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            if (r2 == 0) goto L_0x0096
            r2 = 2
            java.lang.String r4 = r16.mo108768t()
            int r1 = r1.mo141183c(r2, r4)
            if (r1 == 0) goto L_0x0094
            m131976g(r16, r17)
            goto L_0x00bc
        L_0x0094:
            r12 = 1
            goto L_0x009b
        L_0x0096:
            r3 = 3
        L_0x0097:
            r1 = 0
            r7 = r3
            r3 = r5
            r12 = 0
        L_0x009b:
            int r1 = r0.f299203j
            r2 = 4
            if (r1 != r2) goto L_0x00a1
            r7 = 4
        L_0x00a1:
            java.lang.Class<i21.g> r1 = i21.C98590g.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            r4 = r1
            i21.g r4 = (i21.C98590g) r4
            long r5 = r0.f299205o
            java.lang.String r1 = r0.f299198e
            long r8 = (long) r3
            long r10 = (long) r7
            long r13 = r0.f299201h
            r7 = r1
            r15 = r17
            r4.mo137962Mq(r5, r7, r8, r10, r12, r13, r15)
            goto L_0x00bc
        L_0x00b9:
            m131976g(r16, r17)
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pe2.C100786f.m131975f(com.tencent.mm.storage.f4, boolean):void");
    }

    /* renamed from: g */
    public static void m131976g(C72963f4 f4Var, boolean z) {
        boolean z2;
        int i;
        int i2;
        int i3;
        Class cls = C98201k.class;
        Class cls2 = C99129c.class;
        C92836k NQ = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127168NQ(f4Var.mo101010p2(), f4Var.mo108774y2());
        int i4 = 2;
        boolean z3 = false;
        int i5 = 1;
        String format = String.format("%s_%s", new Object[]{Long.valueOf(f4Var.mo108774y2()), 1});
        C99129c cVar = (C99129c) C86312j.m106911c(cls2);
        cVar.requireAccountInitialized();
        cVar.f290673z.mo142288e3(format);
        int i6 = 4;
        if (NQ.mo127146q()) {
            if (NQ.mo127145p()) {
                C92836k jD = ((C76053l) C86312j.m106911c(C76053l.class)).mo106261jD(NQ);
                if (jD != null && jD.f267374a > 0 && jD.mo127146q()) {
                    if (C86013q1.m106450k(((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(jD.f267378e, "", "", true))) {
                        format = String.format("%s_%s", new Object[]{Long.valueOf(f4Var.mo108774y2()), 2});
                        z3 = true;
                    }
                }
                z2 = z3;
                i2 = 1;
                i = 3;
            } else {
                i2 = 1;
                i = 3;
                z2 = false;
            }
            C72963f4 f4Var2 = f4Var;
        } else {
            String str = NQ.f267378e;
            if (((((C31478i2) C86312j.m106911c(C31478i2.class)).mo58193Kb(f4Var) > (C31543z5.m39451a() - f4Var.getCreateTime()) ? 1 : (((C31478i2) C86312j.m106911c(C31478i2.class)).mo58193Kb(f4Var) == (C31543z5.m39451a() - f4Var.getCreateTime()) ? 0 : -1)) < 0) && (Util.isNullOrNil(str) || !C86013q1.m106450k(str))) {
                i3 = 4;
                i5 = 4;
            } else {
                i3 = 1;
            }
            z2 = false;
        }
        C99129c cVar2 = (C99129c) C86312j.m106911c(cls2);
        cVar2.requireAccountInitialized();
        C102630a d3 = cVar2.f290673z.mo142287d3(format);
        if (d3 != null) {
            C99129c cVar3 = (C99129c) C86312j.m106911c(cls2);
            cVar3.requireAccountInitialized();
            cVar3.f290673z.mo142288e3(format);
            int a = m131970a(d3.getStatus());
            if (d3.mo142481v2() == d3.mo142481v2()) {
                i4 = a;
            }
            if (i4 != 4) {
                i6 = i;
            }
            if (i6 == 3 && i4 != 3) {
                C99129c cVar4 = (C99129c) C86312j.m106911c(cls2);
                cVar4.requireAccountInitialized();
                cVar4.f290673z.mo142290g3(format, 5);
            }
            i2 = i4;
            i = i6;
        }
        ((C98590g) C86312j.m106911c(C98590g.class)).mo137962Mq(f4Var.mo108774y2(), f4Var.mo101010p2(), (long) i2, (long) i, z2, f4Var.getCreateTime(), z);
    }

    /* renamed from: h */
    public static void m131977h(C101831q8 q8Var, C72963f4 f4Var) {
        C101831q8 q8Var2 = q8Var;
        C101750g.C101753c f = C101750g.f297828a.mo141186f(f4Var.f230724G);
        ((C98590g) C86312j.m106911c(C98590g.class)).mo137961JT(1, q8Var2.f299205o, q8Var2.f299198e, m131971b(q8Var2.f299208r), (long) f.f297833b, (long) f.f297834c, f4Var.getCreateTime());
    }
}
