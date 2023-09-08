package rq2;

import zq2.C103063b;

/* renamed from: rq2.i */
public class C101423i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f297070d;

    /* renamed from: e */
    public final /* synthetic */ int f297071e;

    /* renamed from: f */
    public final /* synthetic */ String f297072f;

    /* renamed from: g */
    public final /* synthetic */ float f297073g;

    /* renamed from: h */
    public final /* synthetic */ C103063b f297074h;

    public C101423i(int i, int i2, String str, float f, C103063b bVar) {
        this.f297070d = i;
        this.f297071e = i2;
        this.f297072f = str;
        this.f297073g = f;
        this.f297074h = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r3 = r6.f297071e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r6 = this;
            java.lang.String r0 = "run"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$6"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            int r2 = r6.f297070d     // Catch:{ all -> 0x004a }
            if (r2 <= 0) goto L_0x0017
            int r3 = r6.f297071e     // Catch:{ all -> 0x004a }
            if (r3 <= 0) goto L_0x0017
            java.lang.String r4 = r6.f297072f     // Catch:{ all -> 0x004a }
            android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFileWithSample(r4, r2, r3)     // Catch:{ all -> 0x004a }
            goto L_0x001e
        L_0x0017:
            java.lang.String r2 = r6.f297072f     // Catch:{ all -> 0x004a }
            r3 = 0
            android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r2, r3)     // Catch:{ all -> 0x004a }
        L_0x001e:
            float r3 = r6.f297073g     // Catch:{ all -> 0x004a }
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x003c
            if (r2 == 0) goto L_0x003c
            boolean r3 = r2.isRecycled()     // Catch:{ all -> 0x004a }
            if (r3 != 0) goto L_0x003c
            int r3 = r6.f297070d     // Catch:{ all -> 0x004a }
            int r4 = r6.f297071e     // Catch:{ all -> 0x004a }
            r5 = 1
            android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getCenterCropBitmap(r2, r3, r4, r5)     // Catch:{ all -> 0x004a }
            float r3 = r6.f297073g     // Catch:{ all -> 0x004a }
            android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r2, r5, r3)     // Catch:{ all -> 0x004a }
        L_0x003c:
            if (r2 == 0) goto L_0x0066
            boolean r3 = r2.isRecycled()     // Catch:{ all -> 0x004a }
            if (r3 != 0) goto L_0x0066
            zq2.b r3 = r6.f297074h     // Catch:{ all -> 0x004a }
            r3.mo142771h(r2)     // Catch:{ all -> 0x004a }
            goto L_0x0066
        L_0x004a:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "setImageBitmapAsync decode bitmap, exp="
            r3.append(r4)
            java.lang.String r2 = r2.toString()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "SnsAd.AdImageLoader"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
        L_0x0066:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rq2.C101423i.run():void");
    }
}
