package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.graphics.Bitmap;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.f6 */
public class C82386f6 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C86009m1 f241431d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f241432e;

    /* renamed from: f */
    public final /* synthetic */ Bitmap f241433f;

    /* renamed from: g */
    public final /* synthetic */ JsApiShowImageOperateSheet.BottomSheetLogicHelper f241434g;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.f6$a */
    public class C82387a implements C1256g<JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeResult> {
        public C82387a() {
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeResult iPCQRCodeRecognizeResult = (JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeResult) obj;
            if (iPCQRCodeRecognizeResult == null) {
                Log.m105928w("MicroMsg.JsApiShowImageOperateSheet", "processRecognizeQRCodeLogic data null");
            } else if (Util.isNullOrNil(iPCQRCodeRecognizeResult.f240475d)) {
                Log.m105928w("MicroMsg.JsApiShowImageOperateSheet", "processRecognizeQRCodeLogic result nil");
            } else {
                ((C119157j) C119157j.f356862d).mo183895z(new f6$a$$a(this, iPCQRCodeRecognizeResult));
            }
        }
    }

    public C82386f6(JsApiShowImageOperateSheet.BottomSheetLogicHelper bottomSheetLogicHelper, C86009m1 m1Var, Bitmap bitmap, Bitmap bitmap2) {
        this.f241434g = bottomSheetLogicHelper;
        this.f241431d = m1Var;
        this.f241432e = bitmap;
        this.f241433f = bitmap2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0078, code lost:
        if (r0.isRecycled() == false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a7, code lost:
        if (r0.isRecycled() == false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a9, code lost:
        r10.f241432e.recycle();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r10 = this;
            java.lang.String r0 = "bitmap recycle %s"
            com.tencent.mm.vfs.m1 r1 = r10.f241431d
            java.lang.String r1 = r1.mo119971i()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.tencent.mm.vfs.m1 r3 = r10.f241431d
            java.lang.String r3 = r3.mo119971i()
            r2.append(r3)
            java.lang.String r3 = "_full"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            r4[r5] = r1
            java.lang.String r6 = "MicroMsg.JsApiShowImageOperateSheet"
            java.lang.String r7 = "processRecognizeQRCodeLogic capturePath:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r4)
            com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeParam r4 = new com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeParam
            r4.<init>()
            android.graphics.Bitmap r7 = r10.f241432e     // Catch:{ Exception -> 0x0053 }
            android.graphics.Bitmap$CompressFormat r8 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0053 }
            r9 = 100
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r7, r9, r8, r2, r3)     // Catch:{ Exception -> 0x0053 }
            r4.f240459d = r2     // Catch:{ Exception -> 0x0053 }
            android.graphics.Bitmap r7 = r10.f241433f     // Catch:{ Exception -> 0x0053 }
            if (r7 == 0) goto L_0x0055
            boolean r7 = r7.isRecycled()     // Catch:{ Exception -> 0x0053 }
            if (r7 != 0) goto L_0x0055
            android.graphics.Bitmap r7 = r10.f241433f     // Catch:{ Exception -> 0x0053 }
            android.graphics.Bitmap$CompressFormat r8 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0053 }
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r7, r9, r8, r1, r3)     // Catch:{ Exception -> 0x0053 }
            r4.f240459d = r1     // Catch:{ Exception -> 0x0053 }
            r4.f240460e = r2     // Catch:{ Exception -> 0x0053 }
            goto L_0x0058
        L_0x0053:
            r1 = move-exception
            goto L_0x007d
        L_0x0055:
            r1 = 0
            r4.f240460e = r1     // Catch:{ Exception -> 0x0053 }
        L_0x0058:
            android.graphics.Bitmap r1 = r10.f241433f
            if (r1 == 0) goto L_0x0070
            boolean r1 = r1.isRecycled()
            if (r1 != 0) goto L_0x0070
            java.lang.Object[] r1 = new java.lang.Object[r3]
            android.graphics.Bitmap r2 = r10.f241433f
            r1[r5] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r1)
            android.graphics.Bitmap r0 = r10.f241433f
            r0.recycle()
        L_0x0070:
            android.graphics.Bitmap r0 = r10.f241432e
            if (r0 == 0) goto L_0x00ae
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L_0x00ae
            goto L_0x00a9
        L_0x007b:
            r1 = move-exception
            goto L_0x00bb
        L_0x007d:
            java.lang.String r2 = "save temp bitmap to file failed, . exception : %s"
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x007b }
            r7[r5] = r1     // Catch:{ all -> 0x007b }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r2, r7)     // Catch:{ all -> 0x007b }
            android.graphics.Bitmap r1 = r10.f241433f
            if (r1 == 0) goto L_0x009f
            boolean r1 = r1.isRecycled()
            if (r1 != 0) goto L_0x009f
            java.lang.Object[] r1 = new java.lang.Object[r3]
            android.graphics.Bitmap r2 = r10.f241433f
            r1[r5] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r1)
            android.graphics.Bitmap r0 = r10.f241433f
            r0.recycle()
        L_0x009f:
            android.graphics.Bitmap r0 = r10.f241432e
            if (r0 == 0) goto L_0x00ae
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L_0x00ae
        L_0x00a9:
            android.graphics.Bitmap r0 = r10.f241432e
            r0.recycle()
        L_0x00ae:
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognize> r1 = com.tencent.p014mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognize.class
            com.tencent.mm.plugin.appbrand.jsapi.f6$a r2 = new com.tencent.mm.plugin.appbrand.jsapi.f6$a
            r2.<init>()
            com.tencent.p014mm.ipcinvoker.C80907o.m98781d(r0, r4, r1, r2)
            return
        L_0x00bb:
            android.graphics.Bitmap r2 = r10.f241433f
            if (r2 == 0) goto L_0x00d3
            boolean r2 = r2.isRecycled()
            if (r2 != 0) goto L_0x00d3
            java.lang.Object[] r2 = new java.lang.Object[r3]
            android.graphics.Bitmap r3 = r10.f241433f
            r2[r5] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r2)
            android.graphics.Bitmap r0 = r10.f241433f
            r0.recycle()
        L_0x00d3:
            android.graphics.Bitmap r0 = r10.f241432e
            if (r0 == 0) goto L_0x00e2
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L_0x00e2
            android.graphics.Bitmap r0 = r10.f241432e
            r0.recycle()
        L_0x00e2:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.C82386f6.run():void");
    }
}
