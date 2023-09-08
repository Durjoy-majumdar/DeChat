package g50;

import android.content.Context;
import com.tencent.rtmp.TXLivePlayer;
import f50.C58916b;

/* renamed from: g50.c */
public class C59364c extends C58916b<C107749g> {

    /* renamed from: q */
    public boolean f169678q;

    /* renamed from: r */
    public int f169679r;

    public C59364c(Context context, boolean z, int i) {
        super(context.getApplicationContext());
        this.f169678q = z;
        this.f169679r = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00df  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m69282e(boolean r21) {
        /*
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            gj.d r1 = p156gj.C107835h0.f322845b
            int r1 = r1.f322801P
            r5 = 4
            r6 = 0
            r7 = 1
            java.lang.String r8 = "CustomRender.CustomLiveTXPlayer"
            if (r1 == r7) goto L_0x00c7
            int r1 = p156gj.C107842p.m146108a()
            int r9 = r1 >> 12
            r9 = r9 & 15
            r10 = r1 & 255(0xff, float:3.57E-43)
            int r11 = android.os.Build.VERSION.SDK_INT
            w80.e$a r12 = w80.C111744e.f334654d
            int r12 = r12.mo163483f()
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            long r13 = p723vf.C90773a.m113841g(r13)
            r15 = 1024(0x400, double:5.06E-321)
            long r13 = r13 / r15
            long r13 = r13 / r15
            if (r9 < r5) goto L_0x002f
            r15 = 1
            goto L_0x0030
        L_0x002f:
            r15 = 0
        L_0x0030:
            r4 = 71
            if (r10 < r4) goto L_0x0036
            r4 = 1
            goto L_0x0037
        L_0x0036:
            r4 = 0
        L_0x0037:
            r5 = 23
            if (r11 < r5) goto L_0x003d
            r5 = 1
            goto L_0x003e
        L_0x003d:
            r5 = 0
        L_0x003e:
            r17 = 4096(0x1000, double:2.0237E-320)
            int r19 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r19 < 0) goto L_0x0047
            r17 = 1
            goto L_0x0049
        L_0x0047:
            r17 = 0
        L_0x0049:
            di3.d r18 = di3.C86312j.m106911c(r0)
            r2 = r18
            h81.h r2 = (h81.C32735h) r2
            h81.h$c r3 = h81.C32735h.C32737c.clicfg_finder_live_enable_sharpen_gpu_score
            r7 = 80
            int r2 = r2.mo58779Qe(r3, r7)
            if (r12 < r2) goto L_0x005d
            r2 = 1
            goto L_0x005e
        L_0x005d:
            r2 = 0
        L_0x005e:
            r3 = 11
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3[r6] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r7 = 1
            r3[r7] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r7 = 2
            r3[r7] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r7 = 3
            r3[r7] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r7 = 4
            r3[r7] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            r7 = 5
            r3[r7] = r1
            r1 = 6
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r15)
            r3[r1] = r7
            r1 = 7
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            r3[r1] = r7
            r1 = 8
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            r3[r1] = r7
            r1 = 9
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r17)
            r3[r1] = r7
            r1 = 10
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            r3[r1] = r7
            java.lang.String r1 = "checkLiveRendererSharpenLocalConfig, cpuFlags:%s, nCores:%s,gpuScore %s nFreq:%s, sdkInt:%s, totalMemMB:%s, coreNumCheck:%s, freqCheck:%s, sdkIntCheck:%s, totalMemMBCheck:%s gpuCheck:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r1, r3)
            if (r15 == 0) goto L_0x00c2
            if (r4 == 0) goto L_0x00c2
            if (r5 == 0) goto L_0x00c2
            if (r17 == 0) goto L_0x00c2
            if (r2 == 0) goto L_0x00c2
            r1 = 1
            goto L_0x00c3
        L_0x00c2:
            r1 = 0
        L_0x00c3:
            if (r1 == 0) goto L_0x00c7
            r7 = 1
            goto L_0x00c8
        L_0x00c7:
            r7 = 0
        L_0x00c8:
            b50.c r1 = z40.C66733d.f191764b
            if (r1 == 0) goto L_0x00df
            int r0 = r1.mo75193Gu()
            b50.c r1 = z40.C66733d.f191764b
            if (r1 == 0) goto L_0x00dd
            boolean r1 = r1.mo75209sU()
            r2 = 1
            if (r1 != r2) goto L_0x00dd
            r1 = 1
            goto L_0x0101
        L_0x00dd:
            r1 = 0
            goto L_0x0101
        L_0x00df:
            di3.d r1 = di3.C86312j.m106911c(r0)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_finder_live_enable_sharpen_xlab_android
            int r1 = r1.mo58779Qe(r2, r6)
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_finder_live_enable_sharpen_nearbyandfinder
            int r0 = r0.mo58779Qe(r2, r6)
            if (r0 == 0) goto L_0x00fb
            r0 = 1
            goto L_0x00fc
        L_0x00fb:
            r0 = 0
        L_0x00fc:
            r20 = r1
            r1 = r0
            r0 = r20
        L_0x0101:
            if (r7 == 0) goto L_0x010b
            if (r21 != 0) goto L_0x0107
            if (r1 == 0) goto L_0x010b
        L_0x0107:
            if (r0 == 0) goto L_0x010b
            r2 = r0
            goto L_0x010c
        L_0x010b:
            r2 = 0
        L_0x010c:
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r21)
            r3[r6] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r7)
            r5 = 1
            r3[r5] = r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4 = 2
            r3[r4] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r1 = 3
            r3[r1] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1 = 4
            r3[r1] = r0
            java.lang.String r0 = "getLiveCustomRenderInfo: isLiveFeed = %s, deviceCheck = %s, iEnableSharpen = %s, isEnableNearbySharpen = %s, customRenderInfo = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g50.C59364c.m69282e(boolean):int");
    }

    /* renamed from: a */
    public TXLivePlayer mo84110a(Context context) {
        return new C107749g(context, this.f169678q, this.f169679r);
    }

    public void callExperimentalAPI(String str) {
        super.callExperimentalAPI(str);
    }

    /* renamed from: d */
    public C59363a mo84474d() {
        C107747f fVar = ((C107749g) mo84112c()).f322479b;
        if (fVar != null) {
            return fVar.f322472u;
        }
        return null;
    }

    /* renamed from: m */
    public void mo84124m(String str) {
        super.mo84124m(str);
    }
}
