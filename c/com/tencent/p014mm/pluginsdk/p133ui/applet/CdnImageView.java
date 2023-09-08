package com.tencent.p014mm.pluginsdk.p133ui.applet;

import a70.C112760b;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Message;
import android.util.AttributeSet;
import com.tencent.p014mm.p136ui.MMImageView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import lu3.C34379c;
import lu3.C88656g;
import p158gt.C8451i;
import p823sg.C90193h;
import sl3.C77727a;

/* renamed from: com.tencent.mm.pluginsdk.ui.applet.CdnImageView */
public class CdnImageView extends MMImageView implements C77727a {

    /* renamed from: d */
    public String f211649d;

    /* renamed from: e */
    public int f211650e;

    /* renamed from: f */
    public int f211651f;

    /* renamed from: g */
    public String f211652g;

    /* renamed from: h */
    public String f211653h;

    /* renamed from: i */
    public boolean f211654i;

    /* renamed from: j */
    public boolean f211655j;

    /* renamed from: n */
    public float f211656n;

    /* renamed from: o */
    public MMHandler f211657o;

    /* renamed from: p */
    public C34379c f211658p;

    /* renamed from: com.tencent.mm.pluginsdk.ui.applet.CdnImageView$b */
    public static class C44601b implements C88656g {

        /* renamed from: d */
        public String f120914d;

        /* renamed from: e */
        public MMHandler f120915e;

        public C44601b(String str, MMHandler mMHandler) {
            this.f120914d = str;
            this.f120915e = mMHandler;
        }

        public String getKey() {
            return "CdnImageView_download";
        }

        public void run() {
            byte[] httpGet = Util.httpGet(this.f120914d);
            Message obtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putByteArray("k_data", httpGet);
            bundle.putString("k_url", this.f120914d);
            obtain.setData(bundle);
            this.f120915e.sendMessage(obtain);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.applet.CdnImageView$a */
    public class C72739a extends MMHandler {
        public C72739a() {
        }

        public void handleMessage(Message message) {
            CdnImageView cdnImageView;
            int i;
            int i2;
            String nullAs = Util.nullAs(message.getData().getString("k_url"), "");
            CdnImageView cdnImageView2 = CdnImageView.this;
            cdnImageView2.f211649d = Util.nullAs(cdnImageView2.f211649d, "");
            if (Util.isNullOrNil(CdnImageView.this.f211649d) && Util.isNullOrNil(nullAs)) {
                CdnImageView.this.setImageBitmap((Bitmap) null);
                CdnImageView.this.setImageBitmapCompleted((Bitmap) null);
            } else if (!CdnImageView.this.f211649d.equals(nullAs)) {
                Log.m105918d("MicroMsg.CdnImageView", "hy: url not equal. abort this msg");
            } else {
                byte[] byteArray = message.getData().getByteArray("k_data");
                if (byteArray == null || byteArray.length == 0) {
                    Log.m105920e("MicroMsg.CdnImageView", "handleMsg fail, data is null");
                    return;
                }
                Bitmap decodeByteArray = BitmapUtil.decodeByteArray(byteArray);
                ((C8451i) C86312j.m106911c(C8451i.class)).mo9376xq(CdnImageView.this.f211649d, decodeByteArray);
                CdnImageView cdnImageView3 = CdnImageView.this;
                if (cdnImageView3.f211655j) {
                    CdnImageView.m85173b(cdnImageView3, decodeByteArray);
                }
                if (decodeByteArray != null && (i = (cdnImageView = CdnImageView.this).f211650e) > 0 && (i2 = cdnImageView.f211651f) > 0) {
                    decodeByteArray = BitmapUtil.extractThumbNail(decodeByteArray, i2, i, true, false);
                }
                CdnImageView cdnImageView4 = CdnImageView.this;
                if (cdnImageView4.f211654i && decodeByteArray != null) {
                    decodeByteArray = cdnImageView4.f211656n > 0.0f ? BitmapUtil.getRoundedCornerBitmap(decodeByteArray, false, ((float) decodeByteArray.getWidth()) * CdnImageView.this.f211656n) : BitmapUtil.getRoundedCornerBitmap(decodeByteArray, false, ((float) decodeByteArray.getWidth()) * 0.5f);
                }
                if (decodeByteArray != null) {
                    CdnImageView.this.setImageBitmap(decodeByteArray);
                }
                CdnImageView.this.setImageBitmapCompleted(decodeByteArray);
            }
        }
    }

    public CdnImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    public static void m85173b(CdnImageView cdnImageView, Bitmap bitmap) {
        cdnImageView.getClass();
        if (bitmap != null) {
            try {
                String cacheFilePath = cdnImageView.getCacheFilePath();
                Log.m105919d("MicroMsg.CdnImageView", "useSdcardCache, path: %s", cacheFilePath);
                BitmapUtil.saveBitmapToImage(bitmap, 100, Bitmap.CompressFormat.PNG, cacheFilePath, false);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.CdnImageView", e, "saveBitmapToLocalCache error: %s", e.getMessage());
            }
        }
    }

    private String getAccImagesPath() {
        return C112760b.m154195C() + "wallet_images" + "/";
    }

    private String getCacheFilePath() {
        if (!Util.isNullOrNil(this.f211652g)) {
            return this.f211652g;
        }
        if (!Util.isNullOrNil(this.f211653h)) {
            return this.f211653h + C90193h.m112878f(this.f211649d.getBytes());
        }
        C86013q1.m106461v(getAccImagesPath());
        return getAccImagesPath() + C90193h.m112878f(this.f211649d.getBytes());
    }

    /* renamed from: a */
    public void mo100287a(String str, int i, int i2) {
        mo100288c(str, i, i2, -1);
    }

    /* renamed from: c */
    public void mo100288c(String str, int i, int i2, int i3) {
        mo100289d(str, i, i2, i3, (String) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo100289d(java.lang.String r6, int r7, int r8, int r9, java.lang.String r10) {
        /*
            r5 = this;
            r5.f211649d = r6
            r5.f211650e = r7
            r5.f211651f = r8
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r7 != 0) goto L_0x000e
            r5.f211652g = r10
        L_0x000e:
            java.lang.String r7 = r5.f211652g
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x0031
            java.lang.String r7 = r5.f211652g
            android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative((java.lang.String) r7)
            if (r7 == 0) goto L_0x0031
            int r8 = r7.getWidth()
            if (r8 <= 0) goto L_0x0031
            int r8 = r7.getHeight()
            if (r8 <= 0) goto L_0x0031
            r5.setImageBitmap(r7)
            r5.setImageBitmapCompleted(r7)
            return
        L_0x0031:
            r7 = 8
            if (r6 == 0) goto L_0x016d
            int r8 = r6.length()
            if (r8 != 0) goto L_0x003d
            goto L_0x016d
        L_0x003d:
            java.lang.String r8 = "http"
            boolean r8 = r6.startsWith(r8)
            r10 = 1056964608(0x3f000000, float:0.5)
            r0 = 0
            r1 = 1
            r2 = 0
            if (r8 == 0) goto L_0x0121
            java.lang.Class<gt.i> r7 = p158gt.C8451i.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            gt.i r7 = (p158gt.C8451i) r7
            android.graphics.Bitmap r7 = r7.get(r6)
            if (r7 == 0) goto L_0x0091
            int r6 = r5.f211650e
            if (r6 <= 0) goto L_0x0064
            int r8 = r5.f211651f
            if (r8 <= 0) goto L_0x0064
            android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNail(r7, r8, r6, r1, r2)
        L_0x0064:
            boolean r6 = r5.f211654i
            if (r6 == 0) goto L_0x0089
            if (r7 == 0) goto L_0x0089
            float r6 = r5.f211656n
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x007e
            int r6 = r7.getWidth()
            float r6 = (float) r6
            float r8 = r5.f211656n
            float r6 = r6 * r8
            android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r7, r2, r6)
            goto L_0x0089
        L_0x007e:
            int r6 = r7.getWidth()
            float r6 = (float) r6
            float r6 = r6 * r10
            android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r7, r2, r6)
        L_0x0089:
            r5.setImageBitmap(r7)
            r5.setImageBitmapCompleted(r7)
            goto L_0x016c
        L_0x0091:
            boolean r7 = r5.f211655j
            if (r7 == 0) goto L_0x0105
            java.lang.String r7 = "MicroMsg.CdnImageView"
            java.lang.String r8 = r5.getCacheFilePath()     // Catch:{ Exception -> 0x00f2 }
            java.lang.String r3 = "useSdcardCache, path: %s"
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x00f2 }
            r4[r2] = r8     // Catch:{ Exception -> 0x00f2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r3, r4)     // Catch:{ Exception -> 0x00f2 }
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)     // Catch:{ Exception -> 0x00f2 }
            if (r3 == 0) goto L_0x0101
            android.graphics.Bitmap r8 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative((java.lang.String) r8)     // Catch:{ Exception -> 0x00f2 }
            java.lang.String r3 = "get bitmap from cache path: %s"
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x00f2 }
            r4[r2] = r8     // Catch:{ Exception -> 0x00f2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r3, r4)     // Catch:{ Exception -> 0x00f2 }
            if (r8 == 0) goto L_0x0101
            int r3 = r5.f211650e     // Catch:{ Exception -> 0x00f2 }
            if (r3 <= 0) goto L_0x00c6
            int r4 = r5.f211651f     // Catch:{ Exception -> 0x00f2 }
            if (r4 <= 0) goto L_0x00c6
            android.graphics.Bitmap r8 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNail(r8, r4, r3, r1, r2)     // Catch:{ Exception -> 0x00f2 }
        L_0x00c6:
            boolean r3 = r5.f211654i     // Catch:{ Exception -> 0x00f2 }
            if (r3 == 0) goto L_0x00eb
            if (r8 == 0) goto L_0x00eb
            float r3 = r5.f211656n     // Catch:{ Exception -> 0x00f2 }
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e0
            int r10 = r8.getWidth()     // Catch:{ Exception -> 0x00f2 }
            float r10 = (float) r10     // Catch:{ Exception -> 0x00f2 }
            float r0 = r5.f211656n     // Catch:{ Exception -> 0x00f2 }
            float r10 = r10 * r0
            android.graphics.Bitmap r8 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r8, r2, r10)     // Catch:{ Exception -> 0x00f2 }
            goto L_0x00eb
        L_0x00e0:
            int r0 = r8.getWidth()     // Catch:{ Exception -> 0x00f2 }
            float r0 = (float) r0     // Catch:{ Exception -> 0x00f2 }
            float r0 = r0 * r10
            android.graphics.Bitmap r8 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r8, r2, r0)     // Catch:{ Exception -> 0x00f2 }
        L_0x00eb:
            r5.setImageBitmap(r8)     // Catch:{ Exception -> 0x00f2 }
            r5.setImageBitmapCompleted(r8)     // Catch:{ Exception -> 0x00f2 }
            goto L_0x0102
        L_0x00f2:
            r8 = move-exception
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r0 = r8.getMessage()
            r10[r2] = r0
            java.lang.String r0 = "setBitmapFromLocalCache error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r8, r0, r10)
        L_0x0101:
            r1 = 0
        L_0x0102:
            if (r1 == 0) goto L_0x0105
            goto L_0x016c
        L_0x0105:
            if (r9 <= 0) goto L_0x010b
            r5.setImageResource(r9)
            goto L_0x010f
        L_0x010b:
            r7 = 0
            r5.setImageBitmap(r7)
        L_0x010f:
            zt3.t r7 = zt3.C119157j.f356862d
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView$b r8 = new com.tencent.mm.pluginsdk.ui.applet.CdnImageView$b
            com.tencent.mm.sdk.platformtools.MMHandler r9 = r5.f211657o
            r8.<init>(r6, r9)
            zt3.j r7 = (zt3.C119157j) r7
            lu3.c r6 = r7.mo183884o(r8)
            r5.f211658p = r6
            goto L_0x016c
        L_0x0121:
            boolean r8 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)
            if (r8 != 0) goto L_0x012b
            r5.setVisibility(r7)
            goto L_0x016c
        L_0x012b:
            int r8 = r5.f211650e
            if (r8 <= 0) goto L_0x0139
            int r9 = r5.f211651f
            if (r9 > 0) goto L_0x0134
            goto L_0x0139
        L_0x0134:
            android.graphics.Bitmap r6 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNail(r6, r9, r8, r1)
            goto L_0x013d
        L_0x0139:
            android.graphics.Bitmap r6 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative((java.lang.String) r6)
        L_0x013d:
            if (r6 != 0) goto L_0x0143
            r5.setVisibility(r7)
            goto L_0x016c
        L_0x0143:
            boolean r7 = r5.f211654i
            if (r7 == 0) goto L_0x0166
            float r7 = r5.f211656n
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x015b
            int r7 = r6.getWidth()
            float r7 = (float) r7
            float r8 = r5.f211656n
            float r7 = r7 * r8
            android.graphics.Bitmap r6 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r6, r2, r7)
            goto L_0x0166
        L_0x015b:
            int r7 = r6.getWidth()
            float r7 = (float) r7
            float r7 = r7 * r10
            android.graphics.Bitmap r6 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r6, r2, r7)
        L_0x0166:
            r5.setImageBitmap(r6)
            r5.setImageBitmapCompleted(r6)
        L_0x016c:
            return
        L_0x016d:
            r5.setVisibility(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView.mo100289d(java.lang.String, int, int, int, java.lang.String):void");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C34379c cVar = this.f211658p;
        if (cVar != null) {
            cVar.cancel(false);
        }
    }

    public void setImageBitmapCompleted(Bitmap bitmap) {
    }

    public void setImgSavedDir(String str) {
        if (str != null && !str.endsWith("/")) {
            str = str + "/";
        }
        this.f211653h = str;
    }

    public void setImgSavedPath(String str) {
        this.f211652g = str;
    }

    public void setRoundCorner(boolean z) {
        this.f211654i = z;
    }

    public void setRoundCornerRate(float f) {
        this.f211656n = f;
    }

    public void setUrl(String str) {
        mo100288c(str, 0, 0, -1);
    }

    public void setUseSdcardCache(boolean z) {
        this.f211655j = z;
    }

    public CdnImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f211649d = null;
        this.f211655j = false;
        this.f211657o = new C72739a();
    }
}
