package com.tencent.p014mm.plugin.setting.p102ui.setting;

import a14.C0000n0;
import fy3.C32227p;
import p200lx.C10661v;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUIC$dealNetSceneQrCode$2", mo125469f = "ColorfulSelfQRCodeUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.q */
public final class C5393q extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C10661v f21077d;

    /* renamed from: e */
    public final /* synthetic */ C5380o f21078e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5393q(C10661v vVar, C5380o oVar, C15601d<? super C5393q> dVar) {
        super(2, dVar);
        this.f21077d = vVar;
        this.f21078e = oVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C5393q(this.f21077d, this.f21078e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C5393q) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.ResultKt.throwOnFailure(r13)
            lx.v r13 = r12.f21077d
            byte[] r13 = r13.mo10930b()
            java.lang.String r0 = "null"
            java.lang.String r1 = "use file cache! style=%d, dataSize=%s"
            r2 = 2
            java.lang.String r3 = "MicroMsg.Setting.ColorfulSelfQRCodeUIC"
            r4 = 1
            r5 = 0
            if (r13 == 0) goto L_0x0021
            int r6 = r13.length
            if (r6 != 0) goto L_0x001b
            r6 = 1
            goto L_0x001c
        L_0x001b:
            r6 = 0
        L_0x001c:
            if (r6 == 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r6 = r13
            goto L_0x0050
        L_0x0021:
            hn2.i r6 = hn2.C8619i.f27728a
            lx.v r7 = r12.f21077d
            int r7 = r7.mo10928S()
            byte[] r6 = r6.mo9491c(r7)
            lx.v r7 = r12.f21077d
            java.lang.Object[] r8 = new java.lang.Object[r2]
            int r7 = r7.mo10928S()
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r7)
            r8[r5] = r9
            if (r6 == 0) goto L_0x004a
            int r7 = r6.length
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r7)
            java.lang.String r7 = r9.toString()
            if (r7 != 0) goto L_0x004b
        L_0x004a:
            r7 = r0
        L_0x004b:
            r8[r4] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r1, r8)
        L_0x0050:
            com.tencent.mm.plugin.setting.ui.setting.o r7 = r12.f21078e
            java.util.Map<java.lang.Integer, byte[]> r7 = r7.f21043q
            lx.v r8 = r12.f21077d
            int r8 = r8.mo10928S()
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r8)
            if (r6 != 0) goto L_0x0064
            byte[] r8 = new byte[r5]
            goto L_0x0065
        L_0x0064:
            r8 = r6
        L_0x0065:
            r7.put(r9, r8)
            if (r13 == 0) goto L_0x0089
            int r7 = r13.length
            if (r7 != 0) goto L_0x006f
            r7 = 1
            goto L_0x0070
        L_0x006f:
            r7 = 0
        L_0x0070:
            if (r7 != 0) goto L_0x0089
            hn2.i r7 = hn2.C8619i.f27728a
            lx.v r8 = r12.f21077d
            int r8 = r8.mo10928S()
            lx.v r9 = r12.f21077d
            java.lang.String r9 = r9.mo10932d()
            java.lang.String r10 = "scene.qrUrl"
            gy3.C87412m.m108593f(r9, r10)
            r7.mo9494f(r8, r9, r13)
        L_0x0089:
            lx.v r13 = r12.f21077d
            int r13 = r13.mo10928S()
            r7 = 997(0x3e5, float:1.397E-42)
            if (r13 != r7) goto L_0x0136
            gy3.f0 r13 = new gy3.f0
            r13.<init>()
            int[] r7 = new int[r2]
            r13.f27484d = r7
            java.util.List<com.tencent.mm.plugin.setting.ui.setting.o$c> r7 = com.tencent.p014mm.plugin.setting.p102ui.setting.C5380o.f21031C
            r8 = 3
            java.lang.Object r7 = r7.get(r8)
            com.tencent.mm.plugin.setting.ui.setting.o$c r7 = (com.tencent.p014mm.plugin.setting.p102ui.setting.C5380o.C5383c) r7
            java.util.List<java.lang.Integer> r7 = r7.f21060f
            if (r7 == 0) goto L_0x00af
            int[] r7 = sx3.C110818d0.m150952x0(r7)
            r13.f27484d = r7
        L_0x00af:
            long r7 = java.lang.System.currentTimeMillis()
            T r9 = r13.f27484d
            r10 = r9
            int[] r10 = (int[]) r10
            r10 = r10[r5]
            r11 = 995(0x3e3, float:1.394E-42)
            if (r10 == 0) goto L_0x00dd
            int[] r9 = (int[]) r9
            r9 = r9[r4]
            if (r9 != 0) goto L_0x00c5
            goto L_0x00dd
        L_0x00c5:
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeByteArray(r6)
            T r13 = r13.f27484d
            r1 = r13
            int[] r1 = (int[]) r1
            r1 = r1[r5]
            int[] r13 = (int[]) r13
            r13 = r13[r4]
            android.graphics.Bitmap r13 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createBitmapWithColor(r0, r1, r13)
            byte[] r13 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.Bitmap2PngBytes(r13)
            goto L_0x0101
        L_0x00dd:
            hn2.i r13 = hn2.C8619i.f27728a
            byte[] r13 = r13.mo9491c(r11)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r11)
            r2[r5] = r6
            if (r13 == 0) goto L_0x00fc
            int r6 = r13.length
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r6)
            java.lang.String r6 = r9.toString()
            if (r6 != 0) goto L_0x00fb
            goto L_0x00fc
        L_0x00fb:
            r0 = r6
        L_0x00fc:
            r2[r4] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r1, r2)
        L_0x0101:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "cost "
            r0.append(r1)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r7
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            com.tencent.mm.plugin.setting.ui.setting.o r0 = r12.f21078e
            java.util.Map<java.lang.Integer, byte[]> r0 = r0.f21043q
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r11)
            r0.put(r1, r13)
            if (r13 == 0) goto L_0x0136
            int r0 = r13.length
            if (r0 != 0) goto L_0x012c
            goto L_0x012d
        L_0x012c:
            r4 = 0
        L_0x012d:
            if (r4 != 0) goto L_0x0136
            hn2.i r0 = hn2.C8619i.f27728a
            java.lang.String r1 = ""
            r0.mo9494f(r11, r1, r13)
        L_0x0136:
            rx3.b0 r13 = rx3.C13598b0.f38549a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.setting.p102ui.setting.C5393q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
