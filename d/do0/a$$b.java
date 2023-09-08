package do0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import org.json.JSONObject;
import p830xc.C91165a;

public class a$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C82381f f251160d;

    /* renamed from: e */
    public final /* synthetic */ C82870p f251161e;

    /* renamed from: f */
    public final /* synthetic */ C91165a f251162f;

    /* renamed from: g */
    public final /* synthetic */ JSONObject f251163g;

    /* renamed from: h */
    public final /* synthetic */ int f251164h;

    /* renamed from: i */
    public final /* synthetic */ C86384a f251165i;

    public a$$b(C86384a aVar, C82381f fVar, C82870p pVar, C91165a aVar2, JSONObject jSONObject, int i) {
        this.f251165i = aVar;
        this.f251160d = fVar;
        this.f251161e = pVar;
        this.f251162f = aVar2;
        this.f251163g = jSONObject;
        this.f251164h = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0124 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x021d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r24 = this;
            r1 = r24
            boolean r0 = com.tencent.p014mm.plugin.appbrand.utils.C2039g2.m1987a()
            if (r0 != 0) goto L_0x000e
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r1.f251160d
            r0.mo109673t(r1)
            return
        L_0x000e:
            do0.a r0 = r1.f251165i
            com.tencent.mm.plugin.appbrand.jsapi.f r2 = r1.f251160d
            r0.f251156i = r2
            com.tencent.mm.plugin.appbrand.jsapi.p r0 = r1.f251161e
            boolean r2 = r0 instanceof eo0.C86625d
            r4 = 0
            if (r2 == 0) goto L_0x026c
            java.lang.String r0 = "MicroMsg.AppBrand.SameLayer.AppBrandCameraPluginHandler"
            java.lang.String r2 = "insert xweb camera"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            do0.a r0 = r1.f251165i
            com.tencent.mm.plugin.appbrand.jsapi.f r2 = r1.f251160d
            xc.a r5 = r1.f251162f
            org.json.JSONObject r6 = r1.f251163g
            com.tencent.mm.plugin.appbrand.jsapi.p r7 = r1.f251161e
            int r8 = r1.f251164h
            android.view.Surface r9 = r0.f251154g
            if (r9 != 0) goto L_0x003b
            java.lang.String r0 = "MicroMsg.AppBrand.SameLayer.AppBrandCameraPluginHandler"
            java.lang.String r2 = "insert mSurfaceTexture is null, err"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            goto L_0x0268
        L_0x003b:
            android.content.Context r9 = r2.getContext()
            do0.a$$d r10 = do0.C86384a.f251153o
            vk0.r r10 = (vk0.C90823r) r10
            r10.getClass()
            com.tencent.p014mm.plugin.appbrand.app.C81192y0.m99475a()
            com.tencent.mm.plugin.appbrand.jsapi.camera.SameLayerCameraView r10 = new com.tencent.mm.plugin.appbrand.jsapi.camera.SameLayerCameraView
            r10.<init>(r9)
            r0.f251155h = r10
            boolean r9 = r2 instanceof com.tencent.p014mm.plugin.appbrand.jsapi.C82520h
            if (r9 == 0) goto L_0x0268
            r9 = r2
            com.tencent.mm.plugin.appbrand.jsapi.h r9 = (com.tencent.p014mm.plugin.appbrand.jsapi.C82520h) r9
            r11 = r7
            eo0.d r11 = (eo0.C86625d) r11
            android.view.Surface r12 = r0.f251154g
            r11.f251590g = r4
            android.content.Context r13 = r9.getContext()
            java.lang.String r14 = "cameraId"
            int r14 = r6.optInt(r14)
            java.lang.String r15 = "normal"
            java.lang.String r4 = "mode"
            java.lang.String r4 = r6.optString(r4, r15)
            java.lang.String r3 = "devicePosition"
            java.lang.String r1 = "back"
            java.lang.String r1 = r6.optString(r3, r1)
            java.lang.String r3 = "flash"
            r17 = r5
            java.lang.String r5 = "auto"
            java.lang.String r3 = r6.optString(r3, r5)
            java.lang.String r5 = "size"
            java.lang.String r5 = r6.optString(r5)
            r5.getClass()
            r18 = r11
            int r11 = r5.hashCode()
            r19 = r2
            r2 = -1078030475(0xffffffffbfbe8f75, float:-1.488753)
            r20 = r7
            if (r11 == r2) goto L_0x00bd
            r2 = 102742843(0x61fbb3b, float:3.0042132E-35)
            if (r11 == r2) goto L_0x00b2
            r2 = 109548807(0x6879507, float:5.100033E-35)
            if (r11 == r2) goto L_0x00a6
            goto L_0x00c5
        L_0x00a6:
            java.lang.String r2 = "small"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x00b0
            goto L_0x00c5
        L_0x00b0:
            r2 = 2
            goto L_0x00c8
        L_0x00b2:
            java.lang.String r2 = "large"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x00bb
            goto L_0x00c5
        L_0x00bb:
            r2 = 1
            goto L_0x00c8
        L_0x00bd:
            java.lang.String r2 = "medium"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x00c7
        L_0x00c5:
            r2 = -1
            goto L_0x00c8
        L_0x00c7:
            r2 = 0
        L_0x00c8:
            r5 = 288(0x120, float:4.04E-43)
            if (r2 == 0) goto L_0x00d3
            r11 = 1
            if (r2 == r11) goto L_0x00d0
            goto L_0x00d5
        L_0x00d0:
            r5 = 720(0x2d0, float:1.009E-42)
            goto L_0x00d5
        L_0x00d3:
            r5 = 480(0x1e0, float:6.73E-43)
        L_0x00d5:
            java.lang.String r2 = "needOutput"
            r11 = 0
            boolean r2 = r6.optBoolean(r2, r11)
            java.lang.String r11 = "resolution"
            java.lang.String r11 = r6.optString(r11)
            java.lang.String r7 = r9.getAppId()
            r10.setAppId(r7)
            r10.setPage(r9)
            r10.setCameraId(r14)
            r10.setMode(r4)
            r7 = 1
            r10.mo22099m(r1, r7)
            r10.setFlash(r3)
            r10.setFrameLimitSize(r5)
            r10.setNeedOutput(r2)
            r10.setResolution(r11)
            r10.setCustomSurface(r12)
            boolean r2 = r9.mo109677x()
            r10.setPageOrientation(r2)
            java.lang.String r2 = "position"
            org.json.JSONObject r2 = r6.optJSONObject(r2)
            java.lang.String r5 = "width"
            r7 = 0
            int r5 = js0.C88020k.m109560k(r2, r5, r7)
            java.lang.String r11 = "height"
            int r2 = js0.C88020k.m109560k(r2, r11, r7)
            if (r5 == 0) goto L_0x012b
            if (r2 == 0) goto L_0x012b
            r7 = 1
            r10.mo22125x(r5, r2, r7)
            goto L_0x012c
        L_0x012b:
            r7 = 1
        L_0x012c:
            boolean r11 = r9 instanceof com.tencent.p014mm.plugin.appbrand.page.C83780d1
            if (r11 == 0) goto L_0x0148
            r11 = r9
            com.tencent.mm.plugin.appbrand.page.d1 r11 = (com.tencent.p014mm.plugin.appbrand.page.C83780d1) r11
            int[] r11 = com.tencent.p014mm.plugin.appbrand.utils.C84752i2.m104413a(r11)
            android.util.Size r12 = new android.util.Size
            r21 = r9
            r16 = 0
            r9 = r11[r16]
            r11 = r11[r7]
            r12.<init>(r9, r11)
            r10.setDisplayScreenSize(r12)
            goto L_0x014a
        L_0x0148:
            r21 = r9
        L_0x014a:
            java.lang.String r7 = "scanArea"
            org.json.JSONArray r7 = r6.optJSONArray(r7)
            java.lang.String r9 = "MicroMsg.JsApiInsertXWebCamera"
            r12 = 4
            if (r7 == 0) goto L_0x01a0
            int r11 = r7.length()
            if (r11 != r12) goto L_0x01a0
            r11 = 2
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r11 = 0
            r12[r11] = r7
            int r16 = r7.length()
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)
            r11 = 1
            r12[r11] = r16
            java.lang.String r11 = "scanAreaArray:%s, scanAreaArray.length:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r11, r12)
            r11 = 0
            int r12 = r7.optInt(r11)
            int r11 = js0.C88020k.m109553d(r12)
            r12 = 1
            int r22 = r7.optInt(r12)
            int r12 = js0.C88020k.m109553d(r22)
            r22 = r8
            r8 = 2
            int r23 = r7.optInt(r8)
            int r8 = js0.C88020k.m109553d(r23)
            r23 = r0
            r0 = 3
            int r7 = r7.optInt(r0)
            int r0 = js0.C88020k.m109553d(r7)
            r10.mo22097j(r11, r12, r8, r0)
            r7 = 0
            goto L_0x01a8
        L_0x01a0:
            r23 = r0
            r22 = r8
            r7 = 0
            r10.mo22097j(r7, r7, r5, r2)
        L_0x01a8:
            java.lang.String r0 = "scanFreq"
            int r0 = r6.optInt(r0)
            r10.setScanFreq(r0)
            java.lang.String r0 = "centerCrop"
            boolean r0 = r6.optBoolean(r0)
            r10.setPreviewCenterCrop(r0)
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)
            r0[r7] = r6
            r6 = 1
            r0[r6] = r1
            r1 = 2
            r0[r1] = r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r3 = 3
            r0[r3] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r2 = 4
            r0[r2] = r1
            java.lang.String r1 = "inflateView cameraId: %d,devicePosition: %s,flash: %s,width: %d,height: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r1, r0)
            android.view.View r0 = r10.getView()
            boolean r1 = r15.equals(r4)
            if (r1 == 0) goto L_0x01eb
            r1 = 2131820951(0x7f110197, float:1.9274631E38)
            goto L_0x01ee
        L_0x01eb:
            r1 = 2131820952(0x7f110198, float:1.9274633E38)
        L_0x01ee:
            java.lang.String r1 = r13.getString(r1)
            r0.setContentDescription(r1)
            r0 = r23
            android.view.Surface r1 = r0.f251154g
            if (r1 == 0) goto L_0x0201
            int r1 = r1.hashCode()
            r0.f251158n = r1
        L_0x0201:
            vk0.h r1 = r0.f251155h
            do0.b r2 = new do0.b
            r3 = r19
            r4 = r20
            r5 = r22
            r2.<init>(r0, r3, r5, r4)
            java.lang.String r4 = "onInsertViewWithAsyncCallback"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r4)
            if (r1 != 0) goto L_0x021d
            java.lang.String r1 = "onInsertView failed, cameraView is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r1)
            r4 = r21
            goto L_0x0256
        L_0x021d:
            r7 = r18
            r4 = r21
            r7.mo121050z(r4, r1, r2)
            vk0.a r2 = vk0.C90809a.C90811b.f260763a
            int r5 = r1.getCameraId()
            android.util.SparseArray<java.lang.ref.WeakReference<vk0.g>> r2 = r2.f260762d
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            r6.<init>(r1)
            r2.put(r5, r6)
            r4.mo114868y(r1)
            r4.mo114864j(r1)
            r4.mo114865m(r1)
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            java.lang.String r5 = r4.getAppId()
            eo0.b r6 = new eo0.b
            r6.<init>(r7, r2, r4)
            com.tencent.p014mm.plugin.appbrand.C83231l.m102140a(r5, r6)
            eo0.c r2 = new eo0.c
            r2.<init>(r7)
            r1.setOutPutCallBack(r2)
        L_0x0256:
            do0.c r1 = new do0.c
            r1.<init>(r0, r4)
            r3.mo109673t(r1)
            do0.d r1 = new do0.d
            r2 = r17
            r1.<init>(r0, r4, r3, r2)
            r2.mo62538a(r1)
        L_0x0268:
            r1 = r24
            goto L_0x032c
        L_0x026c:
            r6 = 1
            r7 = 0
            boolean r1 = r0 instanceof eo0.C86629f
            if (r1 == 0) goto L_0x02c9
            java.lang.String r0 = "MicroMsg.AppBrand.SameLayer.AppBrandCameraPluginHandler"
            java.lang.String r1 = "update xweb camera"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r1 = r24
            do0.a r2 = r1.f251165i
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r1.f251160d
            org.json.JSONObject r3 = r1.f251163g
            com.tencent.mm.plugin.appbrand.jsapi.p r4 = r1.f251161e
            int r5 = r1.f251164h
            monitor-enter(r2)
            r6 = 0
            android.view.Surface r7 = r2.f251154g     // Catch:{ all -> 0x02c6 }
            if (r7 == 0) goto L_0x029e
            int r7 = r7.hashCode()     // Catch:{ all -> 0x02c6 }
            int r8 = r2.f251158n     // Catch:{ all -> 0x02c6 }
            if (r7 == r8) goto L_0x029e
            if (r8 == 0) goto L_0x029e
            android.view.Surface r6 = r2.f251154g     // Catch:{ all -> 0x02c6 }
            int r7 = r6.hashCode()     // Catch:{ all -> 0x02c6 }
            r2.f251158n = r7     // Catch:{ all -> 0x02c6 }
        L_0x029e:
            r7 = r4
            eo0.f r7 = (eo0.C86629f) r7     // Catch:{ all -> 0x02c6 }
            vk0.h r8 = r2.f251155h     // Catch:{ all -> 0x02c6 }
            boolean r3 = r7.mo121051z(r0, r6, r8, r3)     // Catch:{ all -> 0x02c6 }
            if (r3 == 0) goto L_0x02b3
            java.lang.String r3 = "ok"
            java.lang.String r3 = r4.mo115109j(r3)     // Catch:{ all -> 0x02c6 }
            r0.mo109647a(r5, r3)     // Catch:{ all -> 0x02c6 }
            goto L_0x02c4
        L_0x02b3:
            java.lang.String r3 = "MicroMsg.AppBrand.SameLayer.AppBrandCameraPluginHandler"
            java.lang.String r6 = "update fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r6)     // Catch:{ all -> 0x02c6 }
            java.lang.String r3 = "fail:internal error"
            java.lang.String r3 = r4.mo115109j(r3)     // Catch:{ all -> 0x02c6 }
            r0.mo109647a(r5, r3)     // Catch:{ all -> 0x02c6 }
        L_0x02c4:
            monitor-exit(r2)
            goto L_0x032c
        L_0x02c6:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x02c9:
            r1 = r24
            boolean r0 = r0 instanceof eo0.C86628e
            if (r0 == 0) goto L_0x032c
            java.lang.String r0 = "MicroMsg.AppBrand.SameLayer.AppBrandCameraPluginHandler"
            java.lang.String r2 = "remove xweb camera"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            do0.a r0 = r1.f251165i
            com.tencent.mm.plugin.appbrand.jsapi.f r2 = r1.f251160d
            com.tencent.mm.plugin.appbrand.jsapi.p r3 = r1.f251161e
            int r4 = r1.f251164h
            r0.getClass()
            r5 = r3
            eo0.e r5 = (eo0.C86628e) r5
            vk0.h r0 = r0.f251155h
            r5.getClass()
            java.lang.String r5 = "MicroMsg.JsApiRemoveXWebCamera"
            java.lang.String r8 = "remove xweb camera view"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r8)
            if (r0 != 0) goto L_0x02fc
            java.lang.String r0 = "the camera view is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            r6 = 0
            goto L_0x030f
        L_0x02fc:
            boolean r5 = r2 instanceof com.tencent.p014mm.plugin.appbrand.jsapi.C82520h
            if (r5 == 0) goto L_0x030c
            r5 = r2
            com.tencent.mm.plugin.appbrand.jsapi.h r5 = (com.tencent.p014mm.plugin.appbrand.jsapi.C82520h) r5
            r5.mo114866q(r0)
            r5.mo114863i(r0)
            r5.mo114867r(r0)
        L_0x030c:
            r0.release()
        L_0x030f:
            if (r6 == 0) goto L_0x031b
            java.lang.String r0 = "ok"
            java.lang.String r0 = r3.mo115109j(r0)
            r2.mo109647a(r4, r0)
            goto L_0x032c
        L_0x031b:
            java.lang.String r0 = "MicroMsg.AppBrand.SameLayer.AppBrandCameraPluginHandler"
            java.lang.String r5 = "remove fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r5)
            java.lang.String r0 = "fail:internal error"
            java.lang.String r0 = r3.mo115109j(r0)
            r2.mo109647a(r4, r0)
        L_0x032c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: do0.a$$b.run():void");
    }
}
