package ty0;

import com.tencent.p014mm.modelimage.C92808c;
import com.tencent.p014mm.modelimage.C92855q0;
import di3.C86312j;
import gy3.C87412m;
import ob0.C117747y;
import p158gt.C98205r;
import p158gt.C98208v;
import p682rz.C101482k;
import p682rz.C101483l;
import p682rz.C101484m;
import p682rz.C101486p;
import pc0.C100760a0;
import pc0.C100765f;
import pc0.C77065r;

/* renamed from: ty0.e */
public class C101934e implements C101935g {
    /* renamed from: B */
    public C100760a0.C100761a mo141430B(C100760a0.C100764f fVar) {
        C100760a0.C100761a aVar = new C100760a0.C100761a();
        if (fVar instanceof C92808c) {
            C92808c cVar = (C92808c) fVar;
            C98205r VD = ((C98208v) C86312j.m106911c(C98208v.class)).mo137281VD(cVar.f295195i, cVar.f267242C, cVar.f267244E, cVar.f267243D, cVar.f267247H, cVar.f267246G);
            C100760a0.C100762d dVar = VD instanceof C100760a0.C100762d ? (C100760a0.C100762d) VD : null;
            if (dVar != null) {
                dVar.mo127073d1(fVar);
            }
            C87412m.m108592e(VD, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
            aVar.f295177a = (C117747y) VD;
        }
        return aVar;
    }

    /* renamed from: D */
    public C100760a0.C100761a mo141431D(C100760a0.C100764f fVar) {
        C100760a0.C100761a aVar = new C100760a0.C100761a();
        C87412m.m108591d(fVar);
        int i = fVar.f295194h;
        if (i == 5) {
            C77065r rVar = new C77065r(fVar.f295187a, fVar.f295189c, fVar.f295190d, fVar.f295191e, fVar.f295193g);
            aVar.f295178b = rVar.f225109f;
            aVar.f295177a = rVar;
        } else if (i == 4) {
            String str = fVar.f295187a;
            String str2 = fVar.f295189c;
            int i2 = fVar.f295190d;
            int i3 = fVar.f295191e;
            C100765f fVar2 = fVar.f295206t;
            C77065r rVar2 = new C77065r(str, str2, i2, i3, fVar2 != null ? fVar2.f295214b : 0);
            aVar.f295178b = rVar2.f225109f;
            aVar.f295177a = rVar2;
        } else if (i == 2) {
            C77065r rVar3 = new C77065r(fVar.f295192f, fVar.f295191e);
            aVar.f295178b = rVar3.f225109f;
            aVar.f295177a = rVar3;
        } else {
            C77065r rVar4 = new C77065r();
            aVar.f295178b = rVar4.f225109f;
            aVar.f295177a = rVar4;
        }
        return aVar;
    }

    /* renamed from: O */
    public C100760a0.C100761a mo126118O(C100760a0.C100764f fVar) {
        return new C100760a0.C100761a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01fa  */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public pc0.C100760a0.C100761a mo141432Q(pc0.C100760a0.C100764f r23) {
        /*
            r22 = this;
            r0 = r23
            java.lang.Class<gt.v> r1 = p158gt.C98208v.class
            pc0.a0$a r2 = new pc0.a0$a
            r2.<init>()
            if (r0 == 0) goto L_0x0208
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r5 = r0.f295194h
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = r0.f295187a
            r7 = 1
            r4[r7] = r5
            java.lang.String r5 = "DefaultSendMsgInterceptors"
            java.lang.String r8 = "[createImageCgi] constructorId=%s toUser=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r4)
            int r4 = r0.f295197k
            if (r4 != r7) goto L_0x0036
            java.lang.String r4 = r0.f295196j
            boolean r4 = com.tencent.p014mm.modelimage.C92806b.m116987a(r4)
            if (r4 == 0) goto L_0x0036
            java.lang.String r4 = "[createImageCgi] send as big no compress"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            r0.f295197k = r6
        L_0x0036:
            int r4 = r0.f295194h
            if (r4 != r3) goto L_0x0053
            di3.d r1 = di3.C86312j.m106911c(r1)
            gt.v r1 = (p158gt.C98208v) r1
            int r3 = r0.f295207u
            int r4 = r0.f295197k
            gt.q r1 = r1.mo137283h9(r3, r4)
            boolean r3 = r0.f295203q
            if (r3 == 0) goto L_0x004f
            r1.mo127082r()
        L_0x004f:
            r21 = r2
            goto L_0x01d8
        L_0x0053:
            r3 = 3
            if (r4 != r3) goto L_0x006e
            di3.d r1 = di3.C86312j.m106911c(r1)
            gt.v r1 = (p158gt.C98208v) r1
            int r3 = r0.f295207u
            int r4 = r0.f295197k
            ob0.o r6 = r0.f295198l
            gt.q r1 = r1.N20(r3, r4, r6)
            boolean r3 = r0.f295203q
            if (r3 == 0) goto L_0x004f
            r1.mo127082r()
            goto L_0x004f
        L_0x006e:
            r3 = 6
            if (r4 != r3) goto L_0x0090
            di3.d r1 = di3.C86312j.m106911c(r1)
            r6 = r1
            gt.v r6 = (p158gt.C98208v) r6
            int r7 = r0.f295195i
            java.lang.String r8 = r0.f295188b
            java.lang.String r9 = r0.f295187a
            java.lang.String r10 = r0.f295196j
            int r11 = r0.f295197k
            ob0.o r12 = r0.f295198l
            gt.q r1 = r6.mo137285ou(r7, r8, r9, r10, r11, r12)
            boolean r3 = r0.f295203q
            if (r3 == 0) goto L_0x004f
            r1.mo127082r()
            goto L_0x004f
        L_0x0090:
            r3 = 9
            if (r4 != r3) goto L_0x00b9
            di3.d r1 = di3.C86312j.m106911c(r1)
            r6 = r1
            gt.v r6 = (p158gt.C98208v) r6
            int r7 = r0.f295195i
            java.lang.String r8 = r0.f295188b
            java.lang.String r9 = r0.f295187a
            java.lang.String r10 = r0.f295196j
            int r11 = r0.f295197k
            ob0.o r12 = r0.f295198l
            int r13 = r0.f295200n
            java.lang.String r14 = r0.f295204r
            java.lang.String r15 = r0.f295205s
            gt.q r1 = r6.mo137282Zm(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r3 = r0.f295203q
            if (r3 == 0) goto L_0x004f
            r1.mo127082r()
            goto L_0x004f
        L_0x00b9:
            r3 = 10
            if (r4 != r3) goto L_0x00e7
            di3.d r1 = di3.C86312j.m106911c(r1)
            r6 = r1
            gt.v r6 = (p158gt.C98208v) r6
            int r7 = r0.f295195i
            java.lang.String r8 = r0.f295188b
            java.lang.String r9 = r0.f295187a
            java.lang.String r10 = r0.f295196j
            int r11 = r0.f295197k
            ob0.o r12 = r0.f295198l
            int r13 = r0.f295200n
            ob0.v r14 = r0.f295199m
            boolean r15 = r0.f295202p
            int r1 = r0.f295201o
            r16 = r1
            gt.q r1 = r6.C80(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r3 = r0.f295203q
            if (r3 == 0) goto L_0x004f
            r1.mo127082r()
            goto L_0x004f
        L_0x00e7:
            r3 = 11
            if (r4 != r3) goto L_0x0119
            di3.d r1 = di3.C86312j.m106911c(r1)
            r6 = r1
            gt.v r6 = (p158gt.C98208v) r6
            int r7 = r0.f295195i
            java.lang.String r8 = r0.f295188b
            java.lang.String r9 = r0.f295187a
            java.lang.String r10 = r0.f295196j
            int r11 = r0.f295197k
            ob0.o r12 = r0.f295198l
            int r13 = r0.f295200n
            java.lang.String r14 = r0.f295204r
            java.lang.String r15 = r0.f295205s
            boolean r1 = r0.f295202p
            int r3 = r0.f295201o
            r16 = r1
            r17 = r3
            gt.q r1 = r6.mo137287yR(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r3 = r0.f295203q
            if (r3 == 0) goto L_0x004f
            r1.mo127082r()
            goto L_0x004f
        L_0x0119:
            r3 = 13
            if (r4 != r3) goto L_0x014f
            di3.d r1 = di3.C86312j.m106911c(r1)
            r6 = r1
            gt.v r6 = (p158gt.C98208v) r6
            int r7 = r0.f295195i
            java.lang.String r8 = r0.f295188b
            java.lang.String r9 = r0.f295187a
            java.lang.String r10 = r0.f295196j
            int r11 = r0.f295197k
            ob0.o r12 = r0.f295198l
            int r13 = r0.f295200n
            java.lang.String r14 = r0.f295204r
            java.lang.String r15 = r0.f295205s
            boolean r1 = r0.f295202p
            int r3 = r0.f295201o
            pc0.f r4 = r0.f295206t
            r16 = r1
            r17 = r3
            r18 = r4
            gt.q r1 = r6.qn0(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r3 = r0.f295203q
            if (r3 == 0) goto L_0x004f
            r1.mo127082r()
            goto L_0x004f
        L_0x014f:
            r3 = 14
            if (r4 != r3) goto L_0x0190
            di3.d r1 = di3.C86312j.m106911c(r1)
            r6 = r1
            gt.v r6 = (p158gt.C98208v) r6
            int r1 = r0.f295207u
            long r7 = (long) r1
            int r9 = r0.f295195i
            java.lang.String r10 = r0.f295188b
            java.lang.String r11 = r0.f295187a
            java.lang.String r12 = r0.f295196j
            int r13 = r0.f295197k
            ob0.o r14 = r0.f295198l
            int r15 = r0.f295200n
            java.lang.String r1 = r0.f295204r
            java.lang.String r3 = r0.f295205s
            boolean r4 = r0.f295202p
            int r5 = r0.f295201o
            r21 = r2
            boolean r2 = r0.f295208v
            r16 = r1
            r17 = r3
            r18 = r4
            r19 = r5
            r20 = r2
            gt.q r1 = r6.mo137284nH(r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r2 = r0.f295203q
            if (r2 == 0) goto L_0x01d8
            gy3.C87412m.m108591d(r1)
            r1.mo127082r()
            goto L_0x01d8
        L_0x0190:
            r21 = r2
            r2 = 19
            if (r4 != r2) goto L_0x01d7
            di3.d r1 = di3.C86312j.m106911c(r1)
            r2 = r1
            gt.v r2 = (p158gt.C98208v) r2
            int r3 = r0.f295195i
            java.lang.String r4 = r0.f295188b
            java.lang.String r5 = r0.f295187a
            java.lang.String r6 = r0.f295196j
            int r7 = r0.f295197k
            ob0.o r8 = r0.f295198l
            int r9 = r0.f295200n
            java.lang.String r10 = r0.f295204r
            java.lang.String r11 = r0.f295205s
            boolean r12 = r0.f295202p
            int r13 = r0.f295201o
            boolean r14 = r0.f295208v
            int r15 = r0.f295209w
            float r1 = r0.f295211y
            r16 = r1
            float r1 = r0.f295212z
            r17 = r1
            java.lang.String r1 = r0.f295210x
            r18 = r1
            pc0.f r1 = r0.f295206t
            r19 = r1
            java.lang.String r1 = r0.f295185A
            r20 = r1
            gt.q r1 = r2.mo137279DH(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r2 = r0.f295203q
            if (r2 == 0) goto L_0x01d8
            r1.mo127082r()
            goto L_0x01d8
        L_0x01d7:
            r1 = 0
        L_0x01d8:
            if (r1 == 0) goto L_0x01ed
            com.tencent.mm.storage.f4 r2 = r1.getMsg()
            if (r2 == 0) goto L_0x01ed
            com.tencent.mm.storage.f4 r2 = r1.getMsg()
            long r2 = r2.getMsgId()
            r4 = r21
            r4.f295178b = r2
            goto L_0x01ef
        L_0x01ed:
            r4 = r21
        L_0x01ef:
            boolean r2 = r1 instanceof pc0.C100760a0.C100762d
            if (r2 == 0) goto L_0x01f7
            r5 = r1
            pc0.a0$d r5 = (pc0.C100760a0.C100762d) r5
            goto L_0x01f8
        L_0x01f7:
            r5 = 0
        L_0x01f8:
            if (r5 == 0) goto L_0x01fd
            r5.mo127073d1(r0)
        L_0x01fd:
            java.lang.String r0 = "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase"
            gy3.C87412m.m108592e(r1, r0)
            ob0.y r1 = (ob0.C117747y) r1
            r4.f295177a = r1
            goto L_0x0209
        L_0x0208:
            r4 = r2
        L_0x0209:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ty0.C101934e.mo141432Q(pc0.a0$f):pc0.a0$a");
    }

    /* renamed from: q */
    public C100760a0.C100761a mo141434q(C100760a0.C100764f fVar) {
        Class cls = C101486p.class;
        C100760a0.C100761a aVar = new C100760a0.C100761a();
        if (fVar instanceof C92855q0) {
            C92855q0 q0Var = (C92855q0) fVar;
            int i = q0Var.f295194h;
            if (i == 1) {
                C101482k S00 = ((C101486p) C86312j.m106911c(cls)).S00(q0Var.f267460C);
                C87412m.m108592e(S00, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
                aVar.f295177a = (C117747y) S00;
            } else if (i == 4) {
                C101483l Ar0 = ((C101486p) C86312j.m106911c(cls)).Ar0(q0Var.f267460C, q0Var.f267465H, q0Var.f267461D, q0Var.f267462E, q0Var.f267464G, q0Var.f267463F);
                C87412m.m108592e(Ar0, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
                aVar.f295177a = (C117747y) Ar0;
            } else if (i == 20) {
                C101484m Vt0 = ((C101486p) C86312j.m106911c(cls)).Vt0(q0Var.f267460C, q0Var.f267461D, q0Var.f267462E, q0Var.f267463F, q0Var.f267466I);
                C87412m.m108592e(Vt0, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
                aVar.f295177a = (C117747y) Vt0;
            }
        }
        return aVar;
    }
}
