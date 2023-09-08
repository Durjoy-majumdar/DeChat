package zs2;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.TextureView;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95198o2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tavkit.component.TAVExporter;
import ps2.C100880k;
import ps2.C100891r;

/* renamed from: zs2.a */
public class C103069a {

    /* renamed from: a */
    public C103074e f304112a;

    /* renamed from: b */
    public int f304113b = TAVExporter.VIDEO_EXPORT_WIDTH;

    /* renamed from: c */
    public int f304114c = 1280;

    /* renamed from: zs2.a$c */
    public static class C53822c extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        public Bitmap f151038a;

        /* renamed from: b */
        public String f151039b;

        /* renamed from: c */
        public String f151040c;

        public C53822c(Bitmap bitmap, String str, String str2) {
            this.f151038a = bitmap;
            this.f151039b = str;
            this.f151040c = str2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x013a A[SYNTHETIC, Splitter:B:37:0x013a] */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0190 A[SYNTHETIC, Splitter:B:54:0x0190] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:42:0x0146=Splitter:B:42:0x0146, B:34:0x011a=Splitter:B:34:0x011a} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object doInBackground(java.lang.Object[] r19) {
            /*
                r18 = this;
                r1 = r18
                java.lang.String r2 = "doInBackground"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$ImageSaveTask"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
                r0 = r19
                java.lang.Void[] r0 = (java.lang.Void[]) r0
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
                android.graphics.Bitmap r0 = r1.f151038a
                java.lang.String r4 = r1.f151039b
                java.lang.String r5 = r1.f151040c
                java.lang.String r6 = "doSaveSphereImageViewFrameShot, fout.close exp:"
                java.lang.String r7 = ", scene="
                java.lang.String r8 = "doSaveSphereImageViewFrameShot"
                java.lang.String r9 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
                boolean r10 = android.text.TextUtils.isEmpty(r4)
                java.lang.String r11 = "SphereImageView.SphereImageLoader"
                if (r10 == 0) goto L_0x0042
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = "doSaveSphereImageViewFrameShot, imageUrl is empty, scene="
                r0.append(r4)
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
                goto L_0x01cd
            L_0x0042:
                if (r0 == 0) goto L_0x01b6
                int r10 = r0.getHeight()
                if (r10 <= 0) goto L_0x01b6
                int r10 = r0.getWidth()
                if (r10 > 0) goto L_0x0052
                goto L_0x01b6
            L_0x0052:
                long r13 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0112, OutOfMemoryError -> 0x0110, all -> 0x0114 }
                boolean r10 = zs2.C103069a.m136316d(r0)     // Catch:{ Exception -> 0x0112, OutOfMemoryError -> 0x0110, all -> 0x0114 }
                if (r10 == 0) goto L_0x0109
                java.lang.String r4 = zs2.C103069a.m136313a(r5, r4)     // Catch:{ Exception -> 0x0112, OutOfMemoryError -> 0x0110, all -> 0x0114 }
                android.net.Uri r10 = com.tencent.p014mm.vfs.C116299g2.m163858n(r4)     // Catch:{ Exception -> 0x0112, OutOfMemoryError -> 0x0110, all -> 0x0114 }
                java.lang.String r15 = r10.getPath()     // Catch:{ Exception -> 0x0112, OutOfMemoryError -> 0x0110, all -> 0x0114 }
                r12 = 0
                if (r15 == 0) goto L_0x0085
                java.lang.String r15 = com.tencent.p014mm.vfs.C116299g2.m163855k(r15, r12, r12)     // Catch:{ Exception -> 0x0112, OutOfMemoryError -> 0x0110, all -> 0x0114 }
                java.lang.String r12 = r10.getPath()     // Catch:{ Exception -> 0x0112, OutOfMemoryError -> 0x0110, all -> 0x0114 }
                boolean r12 = r12.equals(r15)     // Catch:{ Exception -> 0x0112, OutOfMemoryError -> 0x0110, all -> 0x0114 }
                if (r12 != 0) goto L_0x0085
                android.net.Uri$Builder r10 = r10.buildUpon()     // Catch:{ Exception -> 0x0112, OutOfMemoryError -> 0x0110, all -> 0x0114 }
                android.net.Uri$Builder r10 = r10.path(r15)     // Catch:{ Exception -> 0x0112, OutOfMemoryError -> 0x0110, all -> 0x0114 }
                android.net.Uri r10 = r10.build()     // Catch:{ Exception -> 0x0112, OutOfMemoryError -> 0x0110, all -> 0x0114 }
            L_0x0085:
                com.tencent.mm.vfs.f0 r12 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x0112, OutOfMemoryError -> 0x0110, all -> 0x0114 }
                r15 = 0
                com.tencent.mm.vfs.f0$h r12 = r12.mo177799l(r10, r15)     // Catch:{ Exception -> 0x0112, OutOfMemoryError -> 0x0110, all -> 0x0114 }
                r15 = 0
                java.io.OutputStream r15 = com.tencent.p014mm.vfs.C86013q1.m106425G(r10, r12, r15)     // Catch:{ Exception -> 0x0112, OutOfMemoryError -> 0x0110, all -> 0x0114 }
                android.graphics.Bitmap$CompressFormat r10 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0107, OutOfMemoryError -> 0x0105 }
                r12 = 90
                r0.compress(r10, r12, r15)     // Catch:{ Exception -> 0x0107, OutOfMemoryError -> 0x0105 }
                r15.flush()     // Catch:{ Exception -> 0x0107, OutOfMemoryError -> 0x0105 }
                long r16 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0107, OutOfMemoryError -> 0x0105 }
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0107, OutOfMemoryError -> 0x0105 }
                r10.<init>()     // Catch:{ Exception -> 0x0107, OutOfMemoryError -> 0x0105 }
                java.lang.String r12 = "doSaveSphereImageViewFrameShot, timeCost="
                r10.append(r12)     // Catch:{ Exception -> 0x0107, OutOfMemoryError -> 0x0105 }
                long r12 = r16 - r13
                r10.append(r12)     // Catch:{ Exception -> 0x0107, OutOfMemoryError -> 0x0105 }
                java.lang.String r12 = ", bmp.w="
                r10.append(r12)     // Catch:{ Exception -> 0x0107, OutOfMemoryError -> 0x0105 }
                int r12 = r0.getWidth()     // Catch:{ Exception -> 0x0107, OutOfMemoryError -> 0x0105 }
                r10.append(r12)     // Catch:{ Exception -> 0x0107, OutOfMemoryError -> 0x0105 }
                java.lang.String r12 = ", h="
                r10.append(r12)     // Catch:{ Exception -> 0x0107, OutOfMemoryError -> 0x0105 }
                int r0 = r0.getHeight()     // Catch:{ Exception -> 0x0107, OutOfMemoryError -> 0x0105 }
                r10.append(r0)     // Catch:{ Exception -> 0x0107, OutOfMemoryError -> 0x0105 }
                java.lang.String r0 = ", path="
                r10.append(r0)     // Catch:{ Exception -> 0x0107, OutOfMemoryError -> 0x0105 }
                r10.append(r4)     // Catch:{ Exception -> 0x0107, OutOfMemoryError -> 0x0105 }
                java.lang.String r0 = ", isValid="
                r10.append(r0)     // Catch:{ Exception -> 0x0107, OutOfMemoryError -> 0x0105 }
                r0 = 1
                r10.append(r0)     // Catch:{ Exception -> 0x0107, OutOfMemoryError -> 0x0105 }
                java.lang.String r0 = r10.toString()     // Catch:{ Exception -> 0x0107, OutOfMemoryError -> 0x0105 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)     // Catch:{ Exception -> 0x0107, OutOfMemoryError -> 0x0105 }
                r15.close()     // Catch:{ Exception -> 0x00e2 }
                goto L_0x0100
            L_0x00e2:
                r0 = move-exception
                r4 = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r6)
                java.lang.String r4 = r4.toString()
                r0.append(r4)
                r0.append(r7)
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            L_0x0100:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
                goto L_0x01cd
            L_0x0105:
                r0 = move-exception
                goto L_0x011a
            L_0x0107:
                r0 = move-exception
                goto L_0x0146
            L_0x0109:
                java.lang.String r0 = "doSaveSphereImageViewFrameShot, isValid=false"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)     // Catch:{ Exception -> 0x0112, OutOfMemoryError -> 0x0110, all -> 0x0114 }
                goto L_0x0187
            L_0x0110:
                r0 = move-exception
                goto L_0x0119
            L_0x0112:
                r0 = move-exception
                goto L_0x0145
            L_0x0114:
                r0 = move-exception
                r2 = r0
                r12 = 0
                goto L_0x018e
            L_0x0119:
                r15 = 0
            L_0x011a:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x018b }
                r4.<init>()     // Catch:{ all -> 0x018b }
                java.lang.String r10 = "doSaveSphereImageViewFrameShot OOM:"
                r4.append(r10)     // Catch:{ all -> 0x018b }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x018b }
                r4.append(r0)     // Catch:{ all -> 0x018b }
                r4.append(r7)     // Catch:{ all -> 0x018b }
                r4.append(r5)     // Catch:{ all -> 0x018b }
                java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x018b }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)     // Catch:{ all -> 0x018b }
                if (r15 == 0) goto L_0x0187
                r15.close()     // Catch:{ Exception -> 0x013e }
                goto L_0x0187
            L_0x013e:
                r0 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                goto L_0x0170
            L_0x0145:
                r15 = 0
            L_0x0146:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x018b }
                r4.<init>()     // Catch:{ all -> 0x018b }
                java.lang.String r10 = "doSaveSphereImageViewFrameShot exp:"
                r4.append(r10)     // Catch:{ all -> 0x018b }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x018b }
                r4.append(r0)     // Catch:{ all -> 0x018b }
                r4.append(r7)     // Catch:{ all -> 0x018b }
                r4.append(r5)     // Catch:{ all -> 0x018b }
                java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x018b }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)     // Catch:{ all -> 0x018b }
                if (r15 == 0) goto L_0x0187
                r15.close()     // Catch:{ Exception -> 0x016a }
                goto L_0x0187
            L_0x016a:
                r0 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
            L_0x0170:
                r4.append(r6)
                java.lang.String r0 = r0.toString()
                r4.append(r0)
                r4.append(r7)
                r4.append(r5)
                java.lang.String r0 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            L_0x0187:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
                goto L_0x01cd
            L_0x018b:
                r0 = move-exception
                r12 = r15
                r2 = r0
            L_0x018e:
                if (r12 == 0) goto L_0x01b2
                r12.close()     // Catch:{ Exception -> 0x0194 }
                goto L_0x01b2
            L_0x0194:
                r0 = move-exception
                r3 = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r6)
                java.lang.String r3 = r3.toString()
                r0.append(r3)
                r0.append(r7)
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            L_0x01b2:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
                throw r2
            L_0x01b6:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = "doSaveSphereImageViewFrameShot, bitmap==null or size<=0, scene="
                r0.append(r4)
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            L_0x01cd:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: zs2.C103069a.C53822c.doInBackground(java.lang.Object[]):java.lang.Object");
        }
    }

    /* renamed from: zs2.a$a */
    public class C103070a implements C100880k.C100881a {

        /* renamed from: a */
        public final /* synthetic */ String f304115a;

        /* renamed from: b */
        public final /* synthetic */ int f304116b;

        /* renamed from: c */
        public final /* synthetic */ int f304117c;

        /* renamed from: d */
        public final /* synthetic */ String f304118d;

        /* renamed from: zs2.a$a$a */
        public class C103071a implements Runnable {
            public C103071a() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$1$1");
                C103070a aVar = C103070a.this;
                C103074e eVar = C103069a.this.f304112a;
                if (eVar != null) {
                    eVar.mo131835a(false, "onDownloadError", (Bitmap) null, aVar.f304115a);
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$1$1");
            }
        }

        public C103070a(String str, int i, int i2, String str2) {
            this.f304115a = str;
            this.f304116b = i;
            this.f304117c = i2;
            this.f304118d = str2;
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$1");
            Log.m105920e("SphereImageView.SphereImageLoader", "onDownloadError");
            MMHandlerThread.postToMainThread(new C103071a());
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$1");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$1");
            Log.m105924i("SphereImageView.SphereImageLoader", "onStartDownload");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$1");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$1");
            Log.m105924i("SphereImageView.SphereImageLoader", "loadImage onDownloaded, path=" + str);
            new C103072b(this.f304115a, this.f304116b, this.f304117c, this.f304118d).execute(new String[]{str});
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$1");
        }
    }

    /* renamed from: zs2.a$b */
    public class C103072b extends AsyncTask<String, Void, Bitmap> {

        /* renamed from: a */
        public String f304121a;

        /* renamed from: b */
        public String f304122b = "";

        /* renamed from: c */
        public int f304123c;

        /* renamed from: d */
        public int f304124d;

        /* renamed from: e */
        public String f304125e;

        public C103072b(String str, int i, int i2, String str2) {
            this.f304121a = str;
            this.f304123c = i;
            this.f304124d = i2;
            this.f304125e = str2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
            if (r1.f304126f.f304113b < 1080) goto L_0x0068;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c2, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0116, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0117, code lost:
            r1.f304122b = r0.toString();
            com.tencent.p014mm.sdk.platformtools.Log.m105920e("SphereImageView.SphereImageLoader", "ImageDecodeTask, exp:" + r1.f304122b);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0116 A[ExcHandler: Exception (r0v6 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:7:0x002b] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x014d  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x014f  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x015c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object doInBackground(java.lang.Object[] r17) {
            /*
                r16 = this;
                r1 = r16
                java.lang.String r2 = "doInBackground"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$ImageDecodeTask"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
                r0 = r17
                java.lang.String[] r0 = (java.lang.String[]) r0
                java.lang.String r4 = ", bmp.h="
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
                java.lang.String r5 = "SphereImageView.SphereImageLoader"
                if (r0 == 0) goto L_0x0176
                int r7 = r0.length
                if (r7 == 0) goto L_0x0176
                r7 = 0
                r8 = r0[r7]
                boolean r8 = android.text.TextUtils.isEmpty(r8)
                if (r8 == 0) goto L_0x0024
                goto L_0x0176
            L_0x0024:
                long r8 = java.lang.System.currentTimeMillis()
                r10 = r0[r7]
                r11 = 1
                android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c4 }
                r0.<init>()     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c4 }
                r0.inJustDecodeBounds = r11     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c4 }
                com.tencent.p014mm.graphics.MMBitmapFactory.m98735d(r10, r0)     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c4 }
                int r12 = r0.outWidth     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c4 }
                int r13 = r0.outHeight     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c4 }
                java.lang.String r14 = "scene_ad_landing"
                java.lang.String r15 = r1.f304125e     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c4 }
                r6 = 4000(0xfa0, float:5.605E-42)
                r11 = 1080(0x438, float:1.513E-42)
                if (r14 != r15) goto L_0x004d
                if (r12 < r6) goto L_0x006a
                zs2.a r6 = zs2.C103069a.this     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c4 }
                int r6 = r6.f304113b     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c4 }
                if (r6 < r11) goto L_0x0068
                goto L_0x006a
            L_0x004d:
                java.lang.String r14 = "scene_timeline"
                if (r14 != r15) goto L_0x006a
                if (r12 < r6) goto L_0x005d
                zs2.a r6 = zs2.C103069a.this     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c4 }
                int r6 = r6.f304113b     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c4 }
                if (r6 < r11) goto L_0x005b
                goto L_0x0068
            L_0x005b:
                r6 = 4
                goto L_0x006b
            L_0x005d:
                r6 = 2000(0x7d0, float:2.803E-42)
                if (r12 < r6) goto L_0x006a
                zs2.a r6 = zs2.C103069a.this     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c4 }
                int r6 = r6.f304113b     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c4 }
                if (r6 < r11) goto L_0x0068
                goto L_0x006a
            L_0x0068:
                r6 = 2
                goto L_0x006b
            L_0x006a:
                r6 = 1
            L_0x006b:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c2 }
                r11.<init>()     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c2 }
                java.lang.String r14 = "decode, bmp.w="
                r11.append(r14)     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c2 }
                r11.append(r12)     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c2 }
                r11.append(r4)     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c2 }
                r11.append(r13)     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c2 }
                java.lang.String r12 = ", screen.w="
                r11.append(r12)     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c2 }
                zs2.a r12 = zs2.C103069a.this     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c2 }
                int r12 = r12.f304113b     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c2 }
                r11.append(r12)     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c2 }
                java.lang.String r12 = ", screen.h="
                r11.append(r12)     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c2 }
                zs2.a r12 = zs2.C103069a.this     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c2 }
                int r12 = r12.f304114c     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c2 }
                r11.append(r12)     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c2 }
                java.lang.String r12 = ", view.w="
                r11.append(r12)     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c2 }
                int r12 = r1.f304123c     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c2 }
                r11.append(r12)     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c2 }
                java.lang.String r12 = ", view.h="
                r11.append(r12)     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c2 }
                int r12 = r1.f304124d     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c2 }
                r11.append(r12)     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c2 }
                java.lang.String r12 = ", inSampleSize="
                r11.append(r12)     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c2 }
                r11.append(r6)     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c2 }
                java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c2 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r11)     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c2 }
                r0.inJustDecodeBounds = r7     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c2 }
                r0.inSampleSize = r6     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c2 }
                android.graphics.Bitmap r0 = com.tencent.p014mm.graphics.MMBitmapFactory.m98735d(r10, r0)     // Catch:{ Exception -> 0x0116, OutOfMemoryError -> 0x00c2 }
                goto L_0x00f7
            L_0x00c2:
                r0 = move-exception
                goto L_0x00c6
            L_0x00c4:
                r0 = move-exception
                r6 = 1
            L_0x00c6:
                java.lang.String r11 = r0.toString()
                r1.f304122b = r11
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "ImageDecodeTask, oom:"
                r11.append(r12)
                java.lang.String r12 = r1.f304122b
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r11)
                java.lang.String r11 = "ImageDecodeTask, try again after oom"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r11)     // Catch:{ all -> 0x00f9 }
                java.lang.System.gc()     // Catch:{ all -> 0x00f9 }
                android.graphics.BitmapFactory$Options r11 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x00f9 }
                r11.<init>()     // Catch:{ all -> 0x00f9 }
                r12 = 1
                int r6 = r6 + r12
                r11.inSampleSize = r6     // Catch:{ all -> 0x00f9 }
                android.graphics.Bitmap r0 = com.tencent.p014mm.graphics.MMBitmapFactory.m98735d(r10, r11)     // Catch:{ all -> 0x00f9 }
            L_0x00f7:
                r6 = r0
                goto L_0x0134
            L_0x00f9:
                java.lang.String r0 = r0.toString()
                r1.f304122b = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r6 = "ImageDecodeTask, try again exp:"
                r0.append(r6)
                java.lang.String r6 = r1.f304122b
                r0.append(r6)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
                goto L_0x0133
            L_0x0116:
                r0 = move-exception
                java.lang.String r0 = r0.toString()
                r1.f304122b = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r6 = "ImageDecodeTask, exp:"
                r0.append(r6)
                java.lang.String r6 = r1.f304122b
                r0.append(r6)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            L_0x0133:
                r6 = 0
            L_0x0134:
                long r11 = java.lang.System.currentTimeMillis()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r13 = "ImageDecodeTask end, totalTime="
                r0.append(r13)
                long r11 = r11 - r8
                r0.append(r11)
                java.lang.String r8 = ", bmp.w="
                r0.append(r8)
                if (r6 != 0) goto L_0x014f
                r8 = 0
                goto L_0x0153
            L_0x014f:
                int r8 = r6.getWidth()
            L_0x0153:
                r0.append(r8)
                r0.append(r4)
                if (r6 != 0) goto L_0x015c
                goto L_0x0160
            L_0x015c:
                int r7 = r6.getHeight()
            L_0x0160:
                r0.append(r7)
                java.lang.String r4 = ", path="
                r0.append(r4)
                r0.append(r10)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                goto L_0x0184
            L_0x0176:
                java.lang.String r0 = "ImageDecodeTask run, path is empty"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
                java.lang.String r0 = "path is empty"
                r1.f304122b = r0
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                r6 = 0
            L_0x0184:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: zs2.C103069a.C103072b.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        public void onPostExecute(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$ImageDecodeTask");
            Bitmap bitmap = (Bitmap) obj;
            SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$ImageDecodeTask");
            C103074e eVar = C103069a.this.f304112a;
            if (eVar != null) {
                eVar.mo131835a(bitmap != null, this.f304122b, bitmap, this.f304121a);
            }
            SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$ImageDecodeTask");
            SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$ImageDecodeTask");
        }
    }

    /* renamed from: zs2.a$d */
    public static class C103073d extends AsyncTask<Void, Void, Bitmap> {

        /* renamed from: a */
        public String f304127a;

        /* renamed from: b */
        public String f304128b;

        /* renamed from: c */
        public String f304129c;

        /* renamed from: d */
        public C103074e f304130d;

        public C103073d(String str, String str2, String str3, C103074e eVar) {
            this.f304128b = str;
            this.f304129c = str2;
            this.f304127a = str3;
            this.f304130d = eVar;
        }

        public Object doInBackground(Object[] objArr) {
            SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$MaskImageDecodeTask");
            Void[] voidArr = (Void[]) objArr;
            SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$MaskImageDecodeTask");
            Bitmap b = C103069a.m136314b(this.f304128b, this.f304127a);
            if (b != null) {
                Log.m105924i("SphereImageView.SphereImageLoader", "has shot");
            } else {
                try {
                    if (!TextUtils.isEmpty(this.f304129c)) {
                        b = C100891r.m132213h(this.f304129c);
                        if (b != null) {
                            Log.m105924i("SphereImageView.SphereImageLoader", "has cache thumb");
                        }
                    } else {
                        Log.m105920e("SphereImageView.SphereImageLoader", "thumbUrl is empty");
                    }
                } catch (Throwable th) {
                    Log.m105920e("SphereImageView.SphereImageLoader", "getCachedImg exp:" + th.toString());
                }
            }
            SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$MaskImageDecodeTask");
            SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$MaskImageDecodeTask");
            return b;
        }

        public void onPostExecute(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$MaskImageDecodeTask");
            Bitmap bitmap = (Bitmap) obj;
            SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$MaskImageDecodeTask");
            C103074e eVar = this.f304130d;
            if (eVar != null) {
                eVar.mo131835a(true, "", bitmap, this.f304128b);
            }
            SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$MaskImageDecodeTask");
            SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$MaskImageDecodeTask");
        }
    }

    /* renamed from: zs2.a$e */
    public interface C103074e {
        /* renamed from: a */
        void mo131835a(boolean z, String str, Bitmap bitmap, String str2);

        /* renamed from: b */
        void mo131836b(String str);
    }

    public C103069a() {
        int i;
        try {
            int[] b = C95198o2.m121130b(MMApplicationContext.getContext());
            int i2 = b[0];
            if (i2 > 0 && (i = b[1]) > 0) {
                this.f304113b = Math.min(i2, i);
                this.f304114c = Math.max(b[0], b[1]);
                Log.m105924i("SphereImageView.SphereImageLoader", "screen.w=" + this.f304113b + ", screen.h=" + this.f304114c);
            }
        } catch (Exception e) {
            Log.m105920e("SphereImageView.SphereImageLoader", "init exp=" + e.toString());
        }
    }

    /* renamed from: a */
    public static String m136313a(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("getShotImgPath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        String l = C100891r.m132217l("sphere_shot_" + str, str2);
        SnsMethodCalculate.markEndTimeMs("getShotImgPath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        return l;
    }

    /* renamed from: b */
    public static Bitmap m136314b(String str, String str2) {
        String str3 = str2;
        SnsMethodCalculate.markStartTimeMs("getSphereImageViewFrameShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("SphereImageView.SphereImageLoader", "getSphereImageViewFrameShot, imageUrl is empty, scene=" + str3);
            SnsMethodCalculate.markEndTimeMs("getSphereImageViewFrameShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            return null;
        }
        try {
            String a = m136313a(str3, str);
            if (!TextUtils.isEmpty(a)) {
                if (C86013q1.m106450k(a)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Bitmap c = MMBitmapFactory.m98734c(a);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    int width = c == null ? 0 : c.getWidth();
                    int height = c == null ? 0 : c.getHeight();
                    StringBuilder sb = new StringBuilder();
                    sb.append("getSphereImageViewFrameShot, timeCost=");
                    sb.append(currentTimeMillis2 - currentTimeMillis);
                    sb.append(", bmp==null?");
                    sb.append(c == null);
                    sb.append(", w=");
                    sb.append(width);
                    sb.append(", h=");
                    sb.append(height);
                    sb.append(", path=");
                    sb.append(a);
                    Log.m105924i("SphereImageView.SphereImageLoader", sb.toString());
                    SnsMethodCalculate.markEndTimeMs("getSphereImageViewFrameShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
                    return c;
                }
            }
            Log.m105920e("SphereImageView.SphereImageLoader", "getSphereImageViewFrameShot, file not exists, scene=" + str3 + ", path=" + a);
        } catch (Exception e) {
            Log.m105920e("SphereImageView.SphereImageLoader", "getSphereImageViewFrameShot, exp:" + e.toString() + ", scene=" + str3);
        } catch (OutOfMemoryError e2) {
            Log.m105920e("SphereImageView.SphereImageLoader", "getSphereImageViewFrameShot, OOM:" + e2.toString() + ", scene=" + str3);
        }
        SnsMethodCalculate.markEndTimeMs("getSphereImageViewFrameShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        return null;
    }

    /* renamed from: c */
    public static boolean m136315c(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("hasSphereImageViewFrameShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("SphereImageView.SphereImageLoader", "hasSphereImageViewFrameShot, imageUrl is empty, scene=" + str2);
            SnsMethodCalculate.markEndTimeMs("hasSphereImageViewFrameShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            return false;
        }
        try {
            String a = m136313a(str2, str);
            boolean z = !TextUtils.isEmpty(a) && C86013q1.m106450k(a);
            Log.m105924i("SphereImageView.SphereImageLoader", "hasSphereImageViewFrameShot, ret=" + z + ", scene=" + str2);
            SnsMethodCalculate.markEndTimeMs("hasSphereImageViewFrameShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            return z;
        } catch (Exception e) {
            Log.m105920e("SphereImageView.SphereImageLoader", "hasSphereImageViewFrameShot, exp:" + e.toString() + ", scene=" + str2);
            SnsMethodCalculate.markEndTimeMs("hasSphereImageViewFrameShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m136316d(Bitmap bitmap) {
        SnsMethodCalculate.markStartTimeMs("isValidSphereImageViewShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        if (bitmap == null || bitmap.getWidth() < 20 || bitmap.getHeight() < 20) {
            SnsMethodCalculate.markEndTimeMs("isValidSphereImageViewShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            return false;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                i += bitmap.getPixel(i2, i3) & 16777215;
            }
        }
        if (i != 0) {
            SnsMethodCalculate.markEndTimeMs("isValidSphereImageViewShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            return true;
        }
        int i4 = width - 10;
        for (int i5 = i4; i5 < width; i5++) {
            for (int i6 = 0; i6 < 10; i6++) {
                i += bitmap.getPixel(i5, i6) & 16777215;
            }
        }
        if (i != 0) {
            SnsMethodCalculate.markEndTimeMs("isValidSphereImageViewShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            return true;
        }
        for (int i7 = 0; i7 < 10; i7++) {
            for (int i8 = height - 10; i8 < height; i8++) {
                i += bitmap.getPixel(i7, i8) & 16777215;
            }
        }
        if (i != 0) {
            SnsMethodCalculate.markEndTimeMs("isValidSphereImageViewShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            return true;
        }
        while (i4 < width) {
            for (int i9 = height - 10; i9 < height; i9++) {
                i += bitmap.getPixel(i4, i9) & 16777215;
            }
            i4++;
        }
        if (i != 0) {
            SnsMethodCalculate.markEndTimeMs("isValidSphereImageViewShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            return true;
        }
        int i15 = width / 2;
        int i16 = height / 2;
        for (int i17 = i15 - 5; i17 < i15 + 5; i17++) {
            for (int i18 = i16 - 5; i18 < i16 + 5; i18++) {
                i += bitmap.getPixel(i17, i18) & 16777215;
            }
        }
        if (i != 0) {
            SnsMethodCalculate.markEndTimeMs("isValidSphereImageViewShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("isValidSphereImageViewShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        return false;
    }

    /* renamed from: f */
    public static void m136317f(TextureView textureView, String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("saveSphereImageViewShootAsyn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Bitmap bitmap = textureView.getBitmap();
            if (bitmap != null && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                if (!TextUtils.isEmpty(str)) {
                    new C53822c(bitmap, str, str2).execute(new Void[0]);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    Log.m105924i("SphereImageView.SphereImageLoader", "saveSphereImageViewShootAsyn, timeCost=" + (currentTimeMillis2 - currentTimeMillis));
                    SnsMethodCalculate.markEndTimeMs("saveSphereImageViewShootAsyn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
                    return;
                }
            }
            Log.m105920e("SphereImageView.SphereImageLoader", "saveSphereImageViewShootAsyn, params err");
            SnsMethodCalculate.markEndTimeMs("saveSphereImageViewShootAsyn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        } catch (Throwable th) {
            Log.m105920e("SphereImageView.SphereImageLoader", "saveSphereImageViewShootAsyn, exp=" + th.toString());
        }
    }

    /* renamed from: e */
    public void mo142780e(String str, int i, int i2, String str2) {
        String str3;
        String str4 = str;
        int i3 = i;
        int i4 = i2;
        SnsMethodCalculate.markStartTimeMs("loadImage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        Log.m105924i("SphereImageView.SphereImageLoader", "loadImage, view.w=" + i + ", view.h=" + i4 + ", scene=" + str2);
        if (i3 == 0 || i4 == 0) {
            SnsMethodCalculate.markEndTimeMs("loadImage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            return;
        }
        C103074e eVar = this.f304112a;
        if (eVar != null) {
            eVar.mo131836b(str);
        }
        SnsMethodCalculate.markStartTimeMs("getImgCacheFilePath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        if (TextUtils.isEmpty(str)) {
            str3 = null;
            SnsMethodCalculate.markEndTimeMs("getImgCacheFilePath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        } else {
            try {
                str3 = C100891r.m132217l("adId", str);
                if (!TextUtils.isEmpty(str3) && C86013q1.m106450k(str3)) {
                    SnsMethodCalculate.markEndTimeMs("getImgCacheFilePath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
                }
            } catch (Exception e) {
                Log.m105920e("SphereImageView.SphereImageLoader", "getImgCacheFilePath, exp:" + e.toString());
            }
            SnsMethodCalculate.markEndTimeMs("getImgCacheFilePath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            str3 = "";
        }
        if (!TextUtils.isEmpty(str3)) {
            Log.m105924i("SphereImageView.SphereImageLoader", "hit disk cache, path=" + str3);
            new C103072b(str, i, i2, str2).execute(new String[]{str3});
        } else {
            Log.m105924i("SphereImageView.SphereImageLoader", "no cache, download");
            C100891r.m132208c(str, false, 133, 0, new C103070a(str, i, i2, str2));
        }
        SnsMethodCalculate.markEndTimeMs("loadImage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
    }
}
