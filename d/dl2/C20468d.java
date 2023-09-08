package dl2;

import android.graphics.RectF;
import com.tencent.p014mm.plugin.scanner.model.C19027m0;
import dl2.C20469e;

/* renamed from: dl2.d */
public class C20468d implements C19027m0 {

    /* renamed from: d */
    public final /* synthetic */ int f57525d;

    /* renamed from: e */
    public final /* synthetic */ RectF f57526e;

    /* renamed from: f */
    public final /* synthetic */ C20469e.C20473d f57527f;

    /* renamed from: g */
    public final /* synthetic */ C20469e f57528g;

    public C20468d(C20469e eVar, int i, RectF rectF, C20469e.C20473d dVar) {
        this.f57528g = eVar;
        this.f57525d = i;
        this.f57526e = rectF;
        this.f57527f = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r14 = this;
            dl2.e r0 = r14.f57528g
            boolean r0 = r0.f57533a
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "MicroMsg.ReIdAiScanImageDecodeQueue"
            java.lang.String r1 = "decodeFullImage not inited"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            return
        L_0x000e:
            int r0 = r14.f57525d
            android.graphics.RectF r1 = r14.f57526e
            com.tencent.mm.plugin.scanner.model.i0 r2 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53455a
            java.lang.String r2 = "rect"
            gy3.C87412m.m108594g(r1, r2)
            boolean r2 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53461g
            java.lang.String r8 = "MicroMsg.ScanFastFocusEngineManager"
            r9 = 0
            r10 = 3
            r11 = 1
            if (r2 == 0) goto L_0x00ae
            long r12 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative r2 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53460f
            r2.resetStatus()
            com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative r2 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53460f
            float r4 = r1.left
            float r5 = r1.top
            float r6 = r1.width()
            float r7 = r1.height()
            r3 = r0
            com.tencent.mm.plugin.scanner.model.ScanProductInfo[] r1 = r2.getScanProductInfoListForFullImage(r3, r4, r5, r6, r7)
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 5
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4[r9] = r0
            com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative r0 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53460f
            int r0 = r0.trackInfoCount
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4[r11] = r0
            long r2 = r2 - r12
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5 = 2
            r4[r5] = r0
            int r0 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53467m
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4[r10] = r0
            r0 = 4
            int r6 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53468n
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r0] = r6
            java.lang.String r0 = "getScanProductInfoListForFullImage localTrackId: %s, result: %d, cost: %d, width: %d, height: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r0, r4)
            com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative r0 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53460f
            int r0 = r0.trackInfoCount
            if (r0 <= 0) goto L_0x00ae
            if (r1 == 0) goto L_0x00ae
            nl2.r r0 = new nl2.r
            r0.<init>()
            r0.f61382c = r5
            com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative r4 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53460f
            int r4 = r4.trackInfoCount
            r0.f61384e = r4
        L_0x0089:
            if (r9 >= r4) goto L_0x00be
            java.lang.Object r5 = sx3.C110823p.m150982H(r1, r9)
            com.tencent.mm.plugin.scanner.model.ScanProductInfo r5 = (com.tencent.p014mm.plugin.scanner.model.ScanProductInfo) r5
            if (r5 == 0) goto L_0x00ab
            java.util.ArrayList<nl2.q> r6 = r0.f61383d
            com.tencent.mm.plugin.scanner.model.ScanProductInfo r7 = new com.tencent.mm.plugin.scanner.model.ScanProductInfo
            r7.<init>()
            r7.copy(r5)
            nl2.q r5 = new nl2.q
            r5.<init>(r7)
            nl2.q$a r7 = r5.f61363f
            r7.f61370f = r2
            r5.f61359b = r11
            r6.add(r5)
        L_0x00ab:
            int r9 = r9 + 1
            goto L_0x0089
        L_0x00ae:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            boolean r1 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53461g
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0[r9] = r1
            java.lang.String r1 = "getScanProductInfoListForFullImage result null isInit: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r1, r0)
            r0 = 0
        L_0x00be:
            if (r0 == 0) goto L_0x00c8
            r0.f61380a = r10
            long r1 = java.lang.System.currentTimeMillis()
            r0.f61381b = r1
        L_0x00c8:
            dl2.e$d r1 = r14.f57527f
            if (r1 == 0) goto L_0x00cf
            r1.mo24327a(r0)
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dl2.C20468d.run():void");
    }
}
