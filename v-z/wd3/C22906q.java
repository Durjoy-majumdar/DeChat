package wd3;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.modelimage.C92856r0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import ic0.C21070h;
import jc0.C21210b;
import p248ug.C102027b;

/* renamed from: wd3.q */
public class C22906q implements C21070h {

    /* renamed from: a */
    public int f65858a;

    /* renamed from: b */
    public int f65859b;

    /* renamed from: c */
    public float[] f65860c;

    /* renamed from: d */
    public C22909x0 f65861d;

    /* renamed from: e */
    public int f65862e;

    /* renamed from: f */
    public int f65863f;

    /* renamed from: g */
    public long f65864g;

    /* renamed from: h */
    public long f65865h;

    /* renamed from: wd3.q$a */
    public interface C22907a extends C22909x0 {
    }

    public C22906q() {
        this(0, 0, (float[]) null, (C22909x0) null);
    }

    /* renamed from: a */
    public void mo6676a(String str, View view) {
        C22909x0 x0Var = this.f65861d;
        if (x0Var != null) {
            x0Var.onStart();
        }
        C118762j jVar = C118762j.f355306a;
        C87412m.m108594g(str, "url");
        if (C102027b.m134390e() && C102027b.m134391f(str)) {
            this.f65863f = 1;
        } else {
            if (C92856r0.m117121g() && C102027b.m134392g(str)) {
                this.f65863f = 2;
            } else {
                this.f65863f = 0;
            }
        }
        this.f65864g = System.currentTimeMillis();
        Log.m105919d("MicroMsg.ChattingBizImageDownloadListener", "alvinluo onImageLoadStart requestImageType: %d, url: %s", Integer.valueOf(this.f65863f), str);
        C115669n.INSTANCE.idkeyStat(86, 0, 1, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6677b(java.lang.String r26, android.view.View r27, jc0.C21210b r28) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r28
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r1
            java.lang.String r5 = r2.f59989e
            r6 = 1
            r3[r6] = r5
            int r5 = r0.f65862e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7 = 2
            r3[r7] = r5
            android.graphics.Bitmap r5 = r2.f59988d
            if (r5 != 0) goto L_0x0020
            r5 = 1
            goto L_0x0021
        L_0x0020:
            r5 = 0
        L_0x0021:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r8 = 3
            r3[r8] = r5
            java.lang.String r5 = "MicroMsg.ChattingBizImageDownloadListener"
            java.lang.String r9 = "onImageLoadFinish, url:%s, contentType: %s, scene: %d, bitmap == null: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r9, r3)
            android.graphics.Bitmap r3 = r2.f59988d
            if (r3 == 0) goto L_0x0054
            boolean r3 = r3.isRecycled()
            if (r3 != 0) goto L_0x0054
            wd3.p r3 = new wd3.p
            r3.<init>(r0, r2)
            android.os.Looper r9 = android.os.Looper.getMainLooper()
            java.lang.Thread r9 = r9.getThread()
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            if (r9 != r10) goto L_0x0050
            r3.run()
            goto L_0x0086
        L_0x0050:
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r3)
            goto L_0x0086
        L_0x0054:
            r3 = 0
            r0.f65861d = r3
            android.graphics.Bitmap r3 = r2.f59988d
            if (r3 == 0) goto L_0x0061
            boolean r3 = r3.isRecycled()
            if (r3 == 0) goto L_0x0086
        L_0x0061:
            long r9 = java.lang.System.currentTimeMillis()
            r0.f65865h = r9
            wd3.j r3 = wd3.C118762j.f355306a
            int r9 = r0.f65862e
            boolean r3 = r3.mo183488a(r9)
            if (r3 == 0) goto L_0x0086
            int r3 = r2.f59986b
            if (r3 != r7) goto L_0x0086
            wd3.i r3 = wd3.C22899i.f65833a
            int r9 = r0.f65863f
            long r10 = r0.f65865h
            long r12 = r0.f65864g
            long r10 = r10 - r12
            r3.mo36074d(r9, r4, r10)
            int r9 = r0.f65863f
            r3.mo36073c(r9, r4)
        L_0x0086:
            int r3 = r2.f59986b
            if (r3 == r7) goto L_0x008b
            return
        L_0x008b:
            wd3.j r3 = wd3.C118762j.f355306a
            java.lang.String r3 = r2.f59989e
            java.lang.String r9 = "url"
            gy3.C87412m.m108594g(r1, r9)
            boolean r9 = com.tencent.p014mm.modelimage.C92856r0.m117121g()
            if (r9 == 0) goto L_0x00be
            if (r3 == 0) goto L_0x00a6
            int r9 = r3.length()
            if (r9 != 0) goto L_0x00a4
            goto L_0x00a6
        L_0x00a4:
            r9 = 0
            goto L_0x00a7
        L_0x00a6:
            r9 = 1
        L_0x00a7:
            if (r9 != 0) goto L_0x00b3
            java.lang.String r9 = "image/webp"
            boolean r3 = gy3.C87412m.m108589b(r3, r9)
            if (r3 == 0) goto L_0x00b3
            r3 = 1
            goto L_0x00b4
        L_0x00b3:
            r3 = 0
        L_0x00b4:
            if (r3 == 0) goto L_0x00be
            boolean r1 = p248ug.C102027b.m134392g(r26)
            if (r1 == 0) goto L_0x00be
            r1 = 1
            goto L_0x00bf
        L_0x00be:
            r1 = 0
        L_0x00bf:
            int r2 = r2.f59985a
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            r3[r4] = r7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r3[r6] = r4
            java.lang.String r4 = "onImageLoadFinish, isDownloadWebp: %b, status: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r4, r3)
            if (r2 == 0) goto L_0x010c
            if (r2 == r6) goto L_0x00eb
            if (r2 == r8) goto L_0x00db
            goto L_0x011b
        L_0x00db:
            if (r1 == 0) goto L_0x011b
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 86
            r12 = 14
            r14 = 1
            r16 = 0
            r9.idkeyStat(r10, r12, r14, r16)
            goto L_0x011b
        L_0x00eb:
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r18 = 86
            r20 = 2
            r22 = 1
            r24 = 0
            r17 = r2
            r17.idkeyStat(r18, r20, r22, r24)
            if (r1 == 0) goto L_0x011b
            r3 = 86
            r5 = 15
            r7 = 1
            r9 = 0
            r1 = r2
            r2 = r3
            r4 = r5
            r6 = r7
            r8 = r9
            r1.idkeyStat(r2, r4, r6, r8)
            goto L_0x011b
        L_0x010c:
            if (r1 == 0) goto L_0x011b
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 86
            r13 = 13
            r15 = 1
            r17 = 0
            r10.idkeyStat(r11, r13, r15, r17)
        L_0x011b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wd3.C22906q.mo6677b(java.lang.String, android.view.View, jc0.b):void");
    }

    /* renamed from: c */
    public Bitmap mo6678c(String str, View view, C21210b bVar) {
        Bitmap bitmap;
        if (this.f65860c == null) {
            return null;
        }
        if (bVar == null || (bitmap = bVar.f59988d) == null || bitmap.isRecycled()) {
            Log.m105928w("MicroMsg.ChattingBizImageDownloadListener", "onProcessBitmap bitmap is null");
            return null;
        } else if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.ChattingBizImageDownloadListener", "onProcessBitmap url is null");
            return null;
        } else {
            try {
                boolean z = view instanceof ImageView;
                Bitmap centerCropBitmap = BitmapUtil.getCenterCropBitmap(bVar.f59988d, this.f65858a, this.f65859b, true);
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(centerCropBitmap, this.f65858a, this.f65859b, true);
                if (!(createScaledBitmap == centerCropBitmap || centerCropBitmap == null)) {
                    if (!centerCropBitmap.isRecycled()) {
                        Log.m105925i("MicroMsg.ChattingBizImageDownloadListener", "bitmap recycle %s", centerCropBitmap.toString());
                        centerCropBitmap.recycle();
                    }
                }
                Bitmap roundedCornerBitmap = BitmapUtil.getRoundedCornerBitmap(createScaledBitmap, true, this.f65860c, true);
                if (createScaledBitmap != null && !createScaledBitmap.isRecycled()) {
                    Log.m105925i("MicroMsg.ChattingBizImageDownloadListener", "bitmap recycle %s", createScaledBitmap.toString());
                    createScaledBitmap.recycle();
                }
                C22909x0 x0Var = this.f65861d;
                if (x0Var instanceof C22910y0) {
                    ((C22910y0) x0Var).mo23026a(roundedCornerBitmap);
                }
                return roundedCornerBitmap;
            } catch (OutOfMemoryError e) {
                Log.m105929w("MicroMsg.ChattingBizImageDownloadListener", "onProcessBitmap OutOfMemoryError %s", e.getMessage());
                return null;
            }
        }
    }

    public C22906q(int i, int i2, float[] fArr, C22909x0 x0Var) {
        this.f65863f = 0;
        this.f65864g = 0;
        this.f65865h = 0;
        this.f65862e = 0;
        this.f65858a = i;
        this.f65859b = i2;
        this.f65861d = x0Var;
        this.f65860c = fArr;
    }

    public C22906q(int i, int i2, int i3, float[] fArr, C22909x0 x0Var) {
        this.f65863f = 0;
        this.f65864g = 0;
        this.f65865h = 0;
        this.f65862e = i;
        this.f65858a = i2;
        this.f65859b = i3;
        this.f65861d = x0Var;
        this.f65860c = fArr;
    }

    public C22906q(int i, int i2, int i3, boolean z, boolean z2, float f, C22909x0 x0Var) {
        this.f65863f = 0;
        this.f65864g = 0;
        this.f65865h = 0;
        this.f65862e = i;
        this.f65858a = i2;
        this.f65859b = i3;
        this.f65861d = x0Var;
        if (z || z2) {
            if (this.f65860c == null) {
                this.f65860c = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
            }
            if (z) {
                float[] fArr = this.f65860c;
                fArr[1] = f;
                fArr[0] = f;
            }
            if (z2) {
                float[] fArr2 = this.f65860c;
                fArr2[3] = f;
                fArr2[2] = f;
                return;
            }
            return;
        }
        this.f65860c = null;
    }
}
