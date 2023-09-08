package jp2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import di3.C86312j;
import h81.C32735h;
import lr2.C99590a;
import ps2.C100891r;
import q90.C101070j;
import rq2.C101432s;
import zt3.C119157j;

/* renamed from: jp2.v */
public class C98974v {

    /* renamed from: c */
    public static C98974v f290191c = new C98974v();

    /* renamed from: a */
    public C101070j<String, Bitmap> f290192a = new C101070j<>(5);

    /* renamed from: b */
    public final LruCache<String, Bitmap> f290193b = new LruCache<>(10);

    /* renamed from: jp2.v$a */
    public class C98975a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f290194d;

        /* renamed from: e */
        public final /* synthetic */ int f290195e;

        /* renamed from: f */
        public final /* synthetic */ int f290196f;

        /* renamed from: g */
        public final /* synthetic */ String f290197g;

        /* renamed from: h */
        public final /* synthetic */ ImageView f290198h;

        /* renamed from: jp2.v$a$a */
        public class C98976a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f290200d;

            public C98976a(Bitmap bitmap) {
                this.f290200d = bitmap;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr$1$1");
                try {
                    Bitmap bitmap = this.f290200d;
                    if (bitmap != null) {
                        if (!bitmap.isRecycled()) {
                            C98974v vVar = C98974v.this;
                            C98974v vVar2 = C98974v.f290191c;
                            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
                            LruCache<String, Bitmap> lruCache = vVar.f290193b;
                            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
                            lruCache.put(C98975a.this.f290197g, this.f290200d);
                            C98975a aVar = C98975a.this;
                            C98974v vVar3 = C98974v.this;
                            ImageView imageView = aVar.f290198h;
                            String str = aVar.f290197g;
                            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
                            vVar3.mo138335b(imageView, str);
                            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
                            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr$1$1");
                            return;
                        }
                    }
                    Log.m105928w("MicroMsg.SnsTimelineAdResourceMgr", "decode bitmap failed!!! Is the bitmap file valid?");
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr$1$1");
                } catch (Throwable th) {
                    Log.m105920e("MicroMsg.SnsTimelineAdResourceMgr", "setImageToImageView set bitmap, exp=" + th.toString());
                }
            }
        }

        public C98975a(int i, int i2, int i3, String str, ImageView imageView) {
            this.f290194d = i;
            this.f290195e = i2;
            this.f290196f = i3;
            this.f290197g = str;
            this.f290198h = imageView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
            r5 = r6.f290196f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                java.lang.String r0 = "MicroMsg.SnsTimelineAdResourceMgr"
                java.lang.String r1 = "run"
                java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr$1"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0054 }
                r3.<init>()     // Catch:{ all -> 0x0054 }
                java.lang.String r4 = "the imgDisplayType is "
                r3.append(r4)     // Catch:{ all -> 0x0054 }
                int r4 = r6.f290194d     // Catch:{ all -> 0x0054 }
                r3.append(r4)     // Catch:{ all -> 0x0054 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0054 }
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r3)     // Catch:{ all -> 0x0054 }
                int r3 = r6.f290194d     // Catch:{ all -> 0x0054 }
                r4 = 0
                if (r3 != 0) goto L_0x003c
                int r3 = r6.f290195e     // Catch:{ all -> 0x0054 }
                if (r3 <= 0) goto L_0x0035
                int r5 = r6.f290196f     // Catch:{ all -> 0x0054 }
                if (r5 <= 0) goto L_0x0035
                java.lang.String r4 = r6.f290197g     // Catch:{ all -> 0x0054 }
                android.graphics.Bitmap r4 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFileWithSample(r4, r3, r5)     // Catch:{ all -> 0x0054 }
                goto L_0x0047
            L_0x0035:
                java.lang.String r3 = r6.f290197g     // Catch:{ all -> 0x0054 }
                android.graphics.Bitmap r4 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r3, r4)     // Catch:{ all -> 0x0054 }
                goto L_0x0047
            L_0x003c:
                r5 = 1
                if (r3 != r5) goto L_0x0047
                jp2.v r3 = jp2.C98974v.this     // Catch:{ all -> 0x0054 }
                java.lang.String r4 = r6.f290197g     // Catch:{ all -> 0x0054 }
                android.graphics.Bitmap r4 = r3.mo138336c(r4)     // Catch:{ all -> 0x0054 }
            L_0x0047:
                zt3.t r3 = zt3.C119157j.f356862d     // Catch:{ all -> 0x0054 }
                jp2.v$a$a r5 = new jp2.v$a$a     // Catch:{ all -> 0x0054 }
                r5.<init>(r4)     // Catch:{ all -> 0x0054 }
                zt3.j r3 = (zt3.C119157j) r3     // Catch:{ all -> 0x0054 }
                r3.mo183895z(r5)     // Catch:{ all -> 0x0054 }
                goto L_0x006e
            L_0x0054:
                r3 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "setImageToImageView decode bitmap, exp="
                r4.append(r5)
                java.lang.String r3 = r3.toString()
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)
            L_0x006e:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: jp2.C98974v.C98975a.run():void");
        }
    }

    /* renamed from: a */
    public final boolean mo138334a() {
        SnsMethodCalculate.markStartTimeMs("checkCleanBitmapCache", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
        boolean z = false;
        try {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_sns_ad_timeline_bitmap_cache_clear, 0);
            Log.m105924i("MicroMsg.SnsTimelineAdResourceMgr", "checkCleanBitmapCache is " + Qe + ", newBitmapCache size is " + this.f290193b.size());
            if (Qe == 1) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("checkCleanBitmapCache", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
            return z;
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SnsTimelineAdResourceMgr", "checkCleanBitmapCache, exp is " + th);
            SnsMethodCalculate.markEndTimeMs("checkCleanBitmapCache", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo138335b(ImageView imageView, String str) {
        SnsMethodCalculate.markStartTimeMs("fillImageViewWithCache", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
        if (imageView == null || TextUtils.isEmpty(str)) {
            Log.m105920e("MicroMsg.SnsTimelineAdResourceMgr", "the imageView is null or filepath is empty");
            SnsMethodCalculate.markEndTimeMs("fillImageViewWithCache", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
            return false;
        }
        String str2 = (String) C101432s.m133122d(imageView, C0966R.C0970id.jve);
        if (TextUtils.isEmpty(str2)) {
            Log.m105920e("MicroMsg.SnsTimelineAdResourceMgr", "the imageView does not attach one url, in fillImageViewWithCache");
            SnsMethodCalculate.markEndTimeMs("fillImageViewWithCache", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
            return false;
        } else if (!str.equalsIgnoreCase(C100891r.m132217l("adId", str2))) {
            Log.m105928w("MicroMsg.SnsTimelineAdResourceMgr", "the bitmap file path is not same as the attachFilePath, in fillImageViewWithCache!");
            SnsMethodCalculate.markEndTimeMs("fillImageViewWithCache", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
            return false;
        } else {
            Bitmap bitmap = this.f290193b.get(str);
            if (bitmap == null || bitmap.isRecycled()) {
                Log.m105928w("MicroMsg.SnsTimelineAdResourceMgr", "the bitmap is null or recycled!!!");
                SnsMethodCalculate.markEndTimeMs("fillImageViewWithCache", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
                return false;
            }
            imageView.setImageBitmap(bitmap);
            SnsMethodCalculate.markEndTimeMs("fillImageViewWithCache", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
            return true;
        }
    }

    /* renamed from: c */
    public Bitmap mo138336c(String str) {
        Bitmap b;
        SnsMethodCalculate.markStartTimeMs("getBitmap", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
        if (!this.f290192a.check(str) || (b = this.f290192a.mo139556b(str)) == null) {
            Log.m105925i("MicroMsg.SnsTimelineAdResourceMgr", "not hit cache %s", str);
            Bitmap a = C99590a.m130018a(str, (BitmapFactory.Options) null, 0.1f);
            if (a != null) {
                this.f290192a.put(str, a);
            }
            SnsMethodCalculate.markEndTimeMs("getBitmap", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
            return a;
        }
        Log.m105925i("MicroMsg.SnsTimelineAdResourceMgr", "hit cache %s", str);
        SnsMethodCalculate.markEndTimeMs("getBitmap", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
        return b;
    }

    /* renamed from: d */
    public void mo138337d(ImageView imageView, String str, int i) {
        SnsMethodCalculate.markStartTimeMs("setImageToImageView", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
        try {
            if (!mo138335b(imageView, str)) {
                Log.m105924i("MicroMsg.SnsTimelineAdResourceMgr", "there is no cache bitmap, it should reload from flash!");
                mo138338e(imageView, str, i);
            }
        } catch (Throwable unused) {
            Log.m105920e("MicroMsg.SnsTimelineAdResourceMgr", "there is something wrong in setImageToImageView");
        }
        SnsMethodCalculate.markEndTimeMs("setImageToImageView", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
    }

    /* renamed from: e */
    public final void mo138338e(ImageView imageView, String str, int i) {
        SnsMethodCalculate.markStartTimeMs("setImageToImageViewInner", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
        if (imageView == null || TextUtils.isEmpty(str)) {
            Log.m105920e("MicroMsg.SnsTimelineAdResourceMgr", "the imageView is null or filepath is empty");
            SnsMethodCalculate.markEndTimeMs("setImageToImageViewInner", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
            return;
        }
        String str2 = (String) C101432s.m133122d(imageView, C0966R.C0970id.jve);
        if (TextUtils.isEmpty(str2)) {
            Log.m105920e("MicroMsg.SnsTimelineAdResourceMgr", "the imageView does not attach one url");
            SnsMethodCalculate.markEndTimeMs("setImageToImageViewInner", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
        } else if (!str.equalsIgnoreCase(C100891r.m132217l("adId", str2))) {
            Log.m105928w("MicroMsg.SnsTimelineAdResourceMgr", "the bitmap file path is not same as the attachFilePath!");
            SnsMethodCalculate.markEndTimeMs("setImageToImageViewInner", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
        } else {
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            Log.m105918d("MicroMsg.SnsTimelineAdResourceMgr", "the image view width is " + width + ", height is " + height);
            ((C119157j) C119157j.f356862d).mo183875f(new C98975a(i, width, height, str, imageView));
            SnsMethodCalculate.markEndTimeMs("setImageToImageViewInner", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
        }
    }
}
