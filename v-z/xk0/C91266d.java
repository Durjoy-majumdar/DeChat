package xk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import org.json.JSONObject;

/* renamed from: xk0.d */
public class C91266d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C82381f f261859d;

    /* renamed from: e */
    public final /* synthetic */ int f261860e;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f261861f;

    /* renamed from: g */
    public final /* synthetic */ C91267e f261862g;

    public C91266d(C91267e eVar, C82381f fVar, int i, JSONObject jSONObject) {
        this.f261862g = eVar;
        this.f261859d = fVar;
        this.f261860e = i;
        this.f261861f = jSONObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x029a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x029b, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r25, java.lang.Integer.valueOf(r30), r0);
        r27.mo109647a(r28, r29.mo115109j(r24));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02c0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02c1, code lost:
        r1 = r24;
        r7 = r27;
        r10 = r28;
        r3 = r29;
        r6 = r30;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x029a A[ExcHandler: all (r0v38 'th' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:66:0x01a3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r34 = this;
            r1 = r34
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r1.f261859d
            boolean r0 = r0.isRunning()
            java.lang.String r2 = "MicroMsg.JsApiCanvasToTempFilePath"
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "invoke JsApi insertView failed, current page view is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r1.f261859d
            int r2 = r1.f261860e
            xk0.e r3 = r1.f261862g
            java.lang.String r4 = "fail"
            java.lang.String r3 = r3.mo115109j(r4)
            r0.mo109647a(r2, r3)
            return
        L_0x0021:
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r1.f261859d
            java.lang.Class<jk0.i> r3 = jk0.C87985i.class
            ra.b r0 = r0.mo109668l(r3)
            jk0.i r0 = (jk0.C87985i) r0
            com.tencent.mm.plugin.appbrand.jsapi.f r3 = r1.f261859d
            org.json.JSONObject r4 = r1.f261861f
            com.tencent.mm.plugin.appbrand.jsapi.h r0 = r0.mo116941pG(r3, r4)
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = "invoke JsApi canvasToTempFilePath failed, component view is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r1.f261859d
            int r2 = r1.f261860e
            xk0.e r3 = r1.f261862g
            java.lang.String r4 = "fail:page is null"
            java.lang.String r3 = r3.mo115109j(r4)
            r0.mo109647a(r2, r3)
            return
        L_0x004a:
            xk0.e r3 = r1.f261862g
            org.json.JSONObject r4 = r1.f261861f
            com.tencent.mm.plugin.appbrand.jsapi.f r5 = r1.f261859d
            int r6 = r1.f261860e
            r3.getClass()
            java.lang.String r7 = "fail:write file failed"
            java.lang.String r8 = "create bitmap failed, viewId(%s). Throwable : %s"
            java.lang.String r9 = "create bitmap failed, viewId(%s). Exception : %s"
            java.lang.String r10 = "fail:create bitmap failed"
            r11 = 1
            r12 = 0
            java.lang.String r13 = "canvasId"
            int r13 = r4.getInt(r13)     // Catch:{ JSONException -> 0x03d9 }
            java.lang.String r14 = "independent"
            boolean r14 = r4.optBoolean(r14, r12)
            com.tencent.mm.plugin.appbrand.jsapi.h$a r14 = r0.mo109649c(r14)
            com.tencent.mm.plugin.appbrand.page.p2 r14 = (com.tencent.p014mm.plugin.appbrand.page.C83873p2) r14
            android.view.View r14 = r14.mo116438p(r13)
            if (r14 != 0) goto L_0x008f
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r0[r12] = r4
            java.lang.String r4 = "get view by viewId(%s) return null."
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r4, r0)
            java.lang.String r0 = "fail:get canvas by canvasId failed"
            java.lang.String r0 = r3.mo115109j(r0)
            r5.mo109647a(r6, r0)
            goto L_0x03f1
        L_0x008f:
            boolean r15 = r14 instanceof com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer
            if (r15 != 0) goto L_0x00ac
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r0[r12] = r4
            java.lang.String r4 = "the view(%s) is not a instance of CoverViewContainer."
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r4, r0)
            java.lang.String r0 = "fail:the view is not a instance of CoverViewContainer"
            java.lang.String r0 = r3.mo115109j(r0)
            r5.mo109647a(r6, r0)
            goto L_0x03f1
        L_0x00ac:
            com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer r14 = (com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) r14
            java.lang.Class<android.view.View> r15 = android.view.View.class
            java.lang.Object r14 = r14.mo114736d(r15)
            android.view.View r14 = (android.view.View) r14
            if (r14 != 0) goto L_0x00d0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r0[r12] = r4
            java.lang.String r4 = "getTargetView return null, viewId(%s)."
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r4, r0)
            java.lang.String r0 = "fail:target view is null."
            java.lang.String r0 = r3.mo115109j(r0)
            r5.mo109647a(r6, r0)
            goto L_0x03f1
        L_0x00d0:
            int r15 = r14.getMeasuredWidth()
            int r12 = r14.getMeasuredHeight()
            android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x03ba, all -> 0x039b }
            android.graphics.Bitmap r11 = android.graphics.Bitmap.createBitmap(r15, r12, r11)     // Catch:{ Exception -> 0x03ba, all -> 0x039b }
            r1 = 0
            r23 = r9
            java.lang.String r9 = "x"
            float r9 = js0.C88020k.m109558i(r4, r9, r1)
            r24 = r10
            java.lang.String r10 = "y"
            float r1 = js0.C88020k.m109558i(r4, r10, r1)
            float r10 = (float) r15
            r25 = r8
            java.lang.String r8 = "width"
            float r8 = js0.C88020k.m109558i(r4, r8, r10)
            r26 = r7
            float r7 = (float) r12
            r27 = r5
            java.lang.String r5 = "height"
            float r5 = js0.C88020k.m109558i(r4, r5, r7)
            float r16 = r9 + r8
            int r16 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r16 <= 0) goto L_0x010e
            float r8 = r10 - r9
        L_0x010e:
            float r16 = r1 + r5
            int r16 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r16 <= 0) goto L_0x0116
            float r5 = r7 - r1
        L_0x0116:
            r28 = r6
            java.lang.String r6 = "destWidth"
            java.lang.String r6 = r4.optString(r6)
            float r6 = com.tencent.p014mm.sdk.platformtools.Util.getFloat(r6, r8)
            r29 = r3
            java.lang.String r3 = "destHeight"
            java.lang.String r3 = r4.optString(r3)
            float r3 = com.tencent.p014mm.sdk.platformtools.Util.getFloat(r3, r5)
            r30 = r13
            int r13 = (int) r9
            if (r13 < 0) goto L_0x035d
            r31 = r0
            int r0 = (int) r1
            if (r0 < 0) goto L_0x035d
            r32 = r4
            int r4 = (int) r8
            if (r4 <= 0) goto L_0x035d
            r33 = r2
            int r2 = (int) r5
            if (r2 <= 0) goto L_0x0352
            r20 = r2
            float r2 = r9 + r8
            int r2 = (int) r2
            if (r2 > r15) goto L_0x0352
            float r2 = r1 + r5
            int r2 = (int) r2
            if (r2 > r12) goto L_0x0352
            int r2 = (int) r6
            if (r2 <= 0) goto L_0x0352
            int r12 = (int) r3
            if (r12 > 0) goto L_0x0156
            goto L_0x0352
        L_0x0156:
            boolean r1 = r14 instanceof com.tencent.p014mm.plugin.appbrand.canvas.widget.C81602a
            if (r1 == 0) goto L_0x0165
            com.tencent.mm.plugin.appbrand.canvas.widget.a r14 = (com.tencent.p014mm.plugin.appbrand.canvas.widget.C81602a) r14
            pi0.f r1 = new pi0.f
            r1.<init>(r11)
            r14.mo113885e(r1)
            goto L_0x016d
        L_0x0165:
            pi0.f r1 = new pi0.f
            r1.<init>(r11)
            r14.draw(r1)
        L_0x016d:
            java.lang.String r1 = "bitmap recycle %s"
            int r9 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x017b
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0178
            goto L_0x017b
        L_0x0178:
            r4 = r33
            goto L_0x019a
        L_0x017b:
            r21 = 0
            r22 = 0
            r16 = r11
            r17 = r13
            r18 = r0
            r19 = r4
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x032a, all -> 0x0302 }
            r4 = 1
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x032a, all -> 0x0302 }
            r4 = 0
            r7[r4] = r11     // Catch:{ Exception -> 0x032a, all -> 0x0302 }
            r4 = r33
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r7)     // Catch:{ Exception -> 0x02f4, all -> 0x02e6 }
            r11.recycle()     // Catch:{ Exception -> 0x02f4, all -> 0x02e6 }
            r11 = r0
        L_0x019a:
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x01a2
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x01b3
        L_0x01a2:
            r3 = 0
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r11, r2, r12, r3)     // Catch:{ Exception -> 0x02c0, all -> 0x029a }
            r2 = 1
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x028e, all -> 0x029a }
            r5[r3] = r11     // Catch:{ Exception -> 0x028e, all -> 0x029a }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r5)     // Catch:{ Exception -> 0x028e, all -> 0x029a }
            r11.recycle()     // Catch:{ Exception -> 0x028e, all -> 0x029a }
            r11 = r0
        L_0x01b3:
            android.graphics.Bitmap$CompressFormat r0 = xk0.C91267e.m114491w(r32)
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
            if (r0 != r1) goto L_0x01be
            java.lang.String r1 = "jpg"
            goto L_0x01c1
        L_0x01be:
            java.lang.String r1 = "png"
        L_0x01c1:
            com.tencent.mm.plugin.appbrand.appstorage.h0 r2 = r31.getFileSystem()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "canvas_"
            r3.append(r5)
            r6 = r30
            r3.append(r6)
            java.lang.String r5 = "."
            r3.append(r5)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            com.tencent.mm.vfs.m1 r2 = r2.allocTempFile(r3)
            if (r2 != 0) goto L_0x01fd
            java.lang.String r0 = "toTempFilePath, alloc file failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            java.lang.String r0 = "fail alloc file failed"
            r3 = r29
            java.lang.String r0 = r3.mo115109j(r0)
            r7 = r27
            r10 = r28
            r7.mo109647a(r10, r0)
            goto L_0x03f1
        L_0x01fd:
            r7 = r27
            r10 = r28
            r3 = r29
            java.lang.String r2 = r2.mo119971i()
            r5 = 1
            java.lang.Object[] r8 = new java.lang.Object[r5]
            r9 = 0
            r8[r9] = r2
            java.lang.String r9 = "toTempFilePath, savePath = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r9, r8)
            int r8 = xk0.C91267e.m114492x(r32)     // Catch:{ IOException -> 0x026f, all -> 0x0250 }
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r11, r8, r0, r2, r5)     // Catch:{ IOException -> 0x026f, all -> 0x0250 }
            js0.m r0 = new js0.m
            r0.<init>()
            com.tencent.mm.plugin.appbrand.appstorage.h0 r6 = r31.getFileSystem()
            com.tencent.mm.vfs.m1 r8 = new com.tencent.mm.vfs.m1
            r8.<init>((java.lang.String) r2)
            r6.createTempFileFrom(r8, r1, r5, r0)
            T r0 = r0.f29691a
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r2 = 0
            r1[r2] = r0
            java.lang.String r2 = "toTempFilePath, returnPath = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r2, r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = "tempFilePath"
            r1.put(r2, r0)
            java.lang.String r0 = "ok"
            java.lang.String r0 = r3.mo115112m(r0, r1)
            r7.mo109647a(r10, r0)
            goto L_0x03f1
        L_0x0250:
            r0 = move-exception
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r5 = 0
            r1[r5] = r2
            r2 = 1
            r1[r2] = r0
            java.lang.String r0 = "save bitmap to file failed, viewId(%s). throwable : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r0, r1)
            r1 = r26
            java.lang.String r0 = r3.mo115109j(r1)
            r7.mo109647a(r10, r0)
            goto L_0x03f1
        L_0x026f:
            r0 = move-exception
            r1 = r26
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r6 = 0
            r2[r6] = r5
            r5 = 1
            r2[r5] = r0
            java.lang.String r0 = "save bitmap to file failed, viewId(%s). exception : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r0, r2)
            java.lang.String r0 = r3.mo115109j(r1)
            r7.mo109647a(r10, r0)
            goto L_0x03f1
        L_0x028e:
            r0 = move-exception
            r7 = r27
            r10 = r28
            r3 = r29
            r6 = r30
            r1 = r24
            goto L_0x02cb
        L_0x029a:
            r0 = move-exception
            r7 = r27
            r10 = r28
            r3 = r29
            r6 = r30
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r5 = 0
            r1[r5] = r2
            r2 = 1
            r1[r2] = r0
            r2 = r25
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r2, r1)
            r1 = r24
            java.lang.String r0 = r3.mo115109j(r1)
            r7.mo109647a(r10, r0)
            goto L_0x03f1
        L_0x02c0:
            r0 = move-exception
            r1 = r24
            r7 = r27
            r10 = r28
            r3 = r29
            r6 = r30
        L_0x02cb:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r6 = 0
            r2[r6] = r5
            r5 = 1
            r2[r5] = r0
            r5 = r23
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r5, r2)
            java.lang.String r0 = r3.mo115109j(r1)
            r7.mo109647a(r10, r0)
            goto L_0x03f1
        L_0x02e6:
            r0 = move-exception
            r1 = r24
            r2 = r25
            r7 = r27
            r10 = r28
            r3 = r29
            r6 = r30
            goto L_0x0311
        L_0x02f4:
            r0 = move-exception
            r5 = r23
            r1 = r24
            r7 = r27
            r10 = r28
            r3 = r29
            r6 = r30
            goto L_0x0339
        L_0x0302:
            r0 = move-exception
            r1 = r24
            r2 = r25
            r7 = r27
            r10 = r28
            r3 = r29
            r6 = r30
            r4 = r33
        L_0x0311:
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8 = 0
            r5[r8] = r6
            r6 = 1
            r5[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r2, r5)
            java.lang.String r0 = r3.mo115109j(r1)
            r7.mo109647a(r10, r0)
            goto L_0x03f1
        L_0x032a:
            r0 = move-exception
            r5 = r23
            r1 = r24
            r7 = r27
            r10 = r28
            r3 = r29
            r6 = r30
            r4 = r33
        L_0x0339:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8 = 0
            r2[r8] = r6
            r6 = 1
            r2[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r5, r2)
            java.lang.String r0 = r3.mo115109j(r1)
            r7.mo109647a(r10, r0)
            goto L_0x03f1
        L_0x0352:
            r7 = r27
            r10 = r28
            r3 = r29
            r6 = r30
            r4 = r33
            goto L_0x0366
        L_0x035d:
            r4 = r2
            r7 = r27
            r10 = r28
            r3 = r29
            r6 = r30
        L_0x0366:
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Float r2 = java.lang.Float.valueOf(r9)
            r9 = 0
            r0[r9] = r2
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r8)
            r2 = 2
            r0[r2] = r1
            r1 = 3
            java.lang.Float r2 = java.lang.Float.valueOf(r5)
            r0[r1] = r2
            r1 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r0[r1] = r2
            java.lang.String r1 = "illegal arguments(x : %s, y : %s, width : %s, height : %s) failed, viewId(%s)."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r1, r0)
            java.lang.String r0 = "fail:illegal arguments"
            java.lang.String r0 = r3.mo115109j(r0)
            r7.mo109647a(r10, r0)
            goto L_0x03f1
        L_0x039b:
            r0 = move-exception
            r4 = r2
            r7 = r5
            r2 = r8
            r1 = r10
            r10 = r6
            r6 = r13
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8 = 0
            r5[r8] = r6
            r6 = 1
            r5[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r2, r5)
            java.lang.String r0 = r3.mo115109j(r1)
            r7.mo109647a(r10, r0)
            goto L_0x03f1
        L_0x03ba:
            r0 = move-exception
            r4 = r2
            r7 = r5
            r5 = r9
            r1 = r10
            r10 = r6
            r6 = r13
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8 = 0
            r2[r8] = r6
            r6 = 1
            r2[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r5, r2)
            java.lang.String r0 = r3.mo115109j(r1)
            r7.mo109647a(r10, r0)
            goto L_0x03f1
        L_0x03d9:
            r0 = move-exception
            r4 = r2
            r7 = r5
            r10 = r6
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "canvasId do not exist. exception : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r0, r1)
            java.lang.String r0 = "fail:canvasId do not exist"
            java.lang.String r0 = r3.mo115109j(r0)
            r7.mo109647a(r10, r0)
        L_0x03f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xk0.C91266d.run():void");
    }
}
