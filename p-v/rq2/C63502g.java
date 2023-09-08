package rq2;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: rq2.g */
public class C63502g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f180117d;

    /* renamed from: e */
    public final /* synthetic */ int f180118e;

    /* renamed from: f */
    public final /* synthetic */ String f180119f;

    /* renamed from: g */
    public final /* synthetic */ float f180120g;

    /* renamed from: h */
    public final /* synthetic */ ImageView f180121h;

    /* renamed from: rq2.g$a */
    public class C63503a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f180122d;

        public C63503a(Bitmap bitmap) {
            this.f180122d = bitmap;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$3$1");
            try {
                C63502g.this.f180121h.setImageBitmap(this.f180122d);
            } catch (Throwable th) {
                Log.m105920e("SnsAd.AdImageLoader", "setImageBitmapAsync set bitmap, exp=" + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$3$1");
        }
    }

    public C63502g(int i, int i2, String str, float f, ImageView imageView) {
        this.f180117d = i;
        this.f180118e = i2;
        this.f180119f = str;
        this.f180120g = f;
        this.f180121h = imageView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r3 = r6.f180118e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r6 = this;
            java.lang.String r0 = "run"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$3"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            int r2 = r6.f180117d     // Catch:{ all -> 0x0042 }
            if (r2 <= 0) goto L_0x0017
            int r3 = r6.f180118e     // Catch:{ all -> 0x0042 }
            if (r3 <= 0) goto L_0x0017
            java.lang.String r4 = r6.f180119f     // Catch:{ all -> 0x0042 }
            android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFileWithSample(r4, r2, r3)     // Catch:{ all -> 0x0042 }
            goto L_0x001e
        L_0x0017:
            java.lang.String r2 = r6.f180119f     // Catch:{ all -> 0x0042 }
            r3 = 0
            android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r2, r3)     // Catch:{ all -> 0x0042 }
        L_0x001e:
            float r3 = r6.f180120g     // Catch:{ all -> 0x0042 }
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0033
            if (r2 == 0) goto L_0x0033
            r4 = 0
            int r5 = r2.getWidth()     // Catch:{ all -> 0x0042 }
            float r5 = (float) r5     // Catch:{ all -> 0x0042 }
            float r3 = r3 * r5
            android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r2, r4, r3)     // Catch:{ all -> 0x0042 }
        L_0x0033:
            if (r2 == 0) goto L_0x005e
            zt3.t r3 = zt3.C119157j.f356862d     // Catch:{ all -> 0x0042 }
            rq2.g$a r4 = new rq2.g$a     // Catch:{ all -> 0x0042 }
            r4.<init>(r2)     // Catch:{ all -> 0x0042 }
            zt3.j r3 = (zt3.C119157j) r3     // Catch:{ all -> 0x0042 }
            r3.mo183895z(r4)     // Catch:{ all -> 0x0042 }
            goto L_0x005e
        L_0x0042:
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
        L_0x005e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rq2.C63502g.run():void");
    }
}
