package vk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import org.json.JSONObject;

public class o$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JSONObject f260773d;

    /* renamed from: e */
    public final /* synthetic */ C82381f f260774e;

    /* renamed from: f */
    public final /* synthetic */ int f260775f;

    /* renamed from: g */
    public final /* synthetic */ C90820o f260776g;

    public o$$b(C90820o oVar, JSONObject jSONObject, C82381f fVar, int i) {
        this.f260776g = oVar;
        this.f260773d = jSONObject;
        this.f260774e = fVar;
        this.f260775f = i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009e, code lost:
        if (r2.equals(com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStopRecordVoice.NAME) == false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x003b, code lost:
        r1 = r6.f260762d.get(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r17 = this;
            r0 = r17
            org.json.JSONObject r1 = r0.f260773d
            java.lang.String r2 = "cameraId"
            int r1 = r1.optInt(r2)
            org.json.JSONObject r2 = r0.f260773d
            java.lang.String r3 = "type"
            java.lang.String r2 = r2.optString(r3)
            org.json.JSONObject r3 = r0.f260773d
            java.lang.String r4 = "selfieMirror"
            r5 = 1
            boolean r3 = r3.optBoolean(r4, r5)
            r4 = 2
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r8 = 0
            r6[r8] = r7
            r6[r5] = r2
            java.lang.String r7 = "MicroMsg.JsApiOperateCamera"
            java.lang.String r9 = "cameraId=%d type=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r6)
            vk0.a r6 = vk0.C90809a.C90811b.f260763a
            android.util.SparseArray<java.lang.ref.WeakReference<vk0.g>> r9 = r6.f260762d
            int r9 = r9.indexOfKey(r1)
            r10 = 0
            if (r9 < 0) goto L_0x004c
            android.util.SparseArray<java.lang.ref.WeakReference<vk0.g>> r6 = r6.f260762d
            java.lang.Object r1 = r6.get(r1)
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            if (r1 == 0) goto L_0x004c
            java.lang.Object r1 = r1.get()
            vk0.g r1 = (vk0.C90815g) r1
            goto L_0x004d
        L_0x004c:
            r1 = r10
        L_0x004d:
            if (r1 != 0) goto L_0x005f
            com.tencent.mm.plugin.appbrand.jsapi.f r1 = r0.f260774e
            int r2 = r0.f260775f
            vk0.o r3 = r0.f260776g
            java.lang.String r4 = "fail:no such camera"
            java.lang.String r3 = r3.mo115109j(r4)
            r1.mo109647a(r2, r3)
            return
        L_0x005f:
            vk0.o$$b$$b r6 = new vk0.o$$b$$b
            r6.<init>(r0)
            r1.setOperateCallBack(r6)
            r2.getClass()
            r6 = -1
            int r9 = r2.hashCode()
            switch(r9) {
                case -2144140699: goto L_0x00ad;
                case -1909077165: goto L_0x00a1;
                case -1391995149: goto L_0x0097;
                case -374265034: goto L_0x008c;
                case 1484838379: goto L_0x0080;
                case 1985172309: goto L_0x0074;
                default: goto L_0x0072;
            }
        L_0x0072:
            r4 = -1
            goto L_0x00b7
        L_0x0074:
            java.lang.String r4 = "setZoom"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x007e
            goto L_0x0072
        L_0x007e:
            r4 = 5
            goto L_0x00b7
        L_0x0080:
            java.lang.String r4 = "takePhoto"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x008a
            goto L_0x0072
        L_0x008a:
            r4 = 4
            goto L_0x00b7
        L_0x008c:
            java.lang.String r4 = "listenFrameChange"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x0095
            goto L_0x0072
        L_0x0095:
            r4 = 3
            goto L_0x00b7
        L_0x0097:
            java.lang.String r9 = "stopRecord"
            boolean r9 = r2.equals(r9)
            if (r9 != 0) goto L_0x00b7
            goto L_0x0072
        L_0x00a1:
            java.lang.String r4 = "startRecord"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x00ab
            goto L_0x0072
        L_0x00ab:
            r4 = 1
            goto L_0x00b7
        L_0x00ad:
            java.lang.String r4 = "closeFrameChange"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x00b6
            goto L_0x0072
        L_0x00b6:
            r4 = 0
        L_0x00b7:
            java.lang.String r6 = "ok"
            switch(r4) {
                case 0: goto L_0x01c1;
                case 1: goto L_0x0164;
                case 2: goto L_0x0139;
                case 3: goto L_0x0129;
                case 4: goto L_0x0116;
                case 5: goto L_0x00d6;
                default: goto L_0x00bc;
            }
        L_0x00bc:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r8] = r2
            java.lang.String r2 = "operateType not supported: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r2, r1)
            com.tencent.mm.plugin.appbrand.jsapi.f r1 = r0.f260774e
            int r2 = r0.f260775f
            vk0.o r3 = r0.f260776g
            java.lang.String r4 = "fail:operateType not supported"
            java.lang.String r3 = r3.mo115109j(r4)
            r1.mo109647a(r2, r3)
            return
        L_0x00d6:
            org.json.JSONObject r2 = r0.f260773d
            java.lang.String r3 = "zoom"
            double r7 = r2.optDouble(r3)
            float r2 = (float) r7
            float r1 = r1.setZoom(r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x00fb
            com.tencent.mm.plugin.appbrand.jsapi.f r1 = r0.f260774e
            int r2 = r0.f260775f
            vk0.o r3 = r0.f260776g
            java.lang.String r4 = "fail: zoom multiple not support"
            java.lang.String r3 = r3.mo115109j(r4)
            r1.mo109647a(r2, r3)
            goto L_0x01d1
        L_0x00fb:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r5)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2.put(r3, r1)
            com.tencent.mm.plugin.appbrand.jsapi.f r1 = r0.f260774e
            int r3 = r0.f260775f
            vk0.o r4 = r0.f260776g
            java.lang.String r2 = r4.mo115112m(r6, r2)
            r1.mo109647a(r3, r2)
            goto L_0x01d1
        L_0x0116:
            org.json.JSONObject r2 = r0.f260773d
            java.lang.String r4 = "quality"
            java.lang.String r5 = "high"
            java.lang.String r2 = r2.optString(r4, r5)
            r1.setQuality(r2)
            r1.mo22095h(r3)
            goto L_0x01d1
        L_0x0129:
            org.json.JSONObject r2 = r0.f260773d
            java.lang.String r3 = "size"
            java.lang.String r2 = r2.optString(r3)
            com.tencent.mm.plugin.appbrand.jsapi.f r3 = r0.f260774e
            r1.mo22126y(r3, r2)
            goto L_0x01d1
        L_0x0139:
            vk0.o r2 = r0.f260776g
            org.json.JSONObject r3 = r0.f260773d
            vk0.o$$b$$a r4 = new vk0.o$$b$$a
            r4.<init>(r3, r1)
            r2.f260765g = r4
            vk0.a r1 = vk0.C90809a.C90811b.f260763a
            boolean r1 = r1.f260761c
            if (r1 != 0) goto L_0x015d
            java.lang.String r1 = "stop record immediately"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            vk0.o r1 = r0.f260776g
            java.lang.Runnable r1 = r1.f260765g
            r1.run()
            vk0.o r1 = r0.f260776g
            r1.f260765g = r10
            goto L_0x01d1
        L_0x015d:
            java.lang.String r1 = "stop record, bug is requesting microphone permission"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            goto L_0x01d1
        L_0x0164:
            vk0.o r2 = r0.f260776g
            com.tencent.mm.plugin.appbrand.jsapi.f r4 = r0.f260774e
            org.json.JSONObject r6 = r0.f260773d
            int r9 = r0.f260775f
            r2.getClass()
            java.lang.String r11 = r4.getAppId()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            vk0.o$$a r12 = new vk0.o$$a
            r12.<init>(r2, r4, r6, r9)
            wq0.C91085v.m114266a(r11, r12)
            android.content.Context r2 = r4.getContext()
            r11 = r2
            android.app.Activity r11 = (android.app.Activity) r11
            r14 = 18
            java.lang.String r13 = "android.permission.RECORD_AUDIO"
            java.lang.String r15 = ""
            java.lang.String r16 = ""
            r12 = r4
            boolean r2 = p225rc.C89922k.m112464a(r11, r12, r13, r14, r15, r16)
            vk0.a r6 = vk0.C90809a.C90811b.f260763a
            r6.f260760b = r2
            if (r2 != 0) goto L_0x019d
            r6.f260761c = r5
            r5 = 0
            goto L_0x01a4
        L_0x019d:
            java.lang.String r2 = r4.getAppId()
            wq0.C91085v.m114268c(r2)
        L_0x01a4:
            if (r5 != 0) goto L_0x01a7
            return
        L_0x01a7:
            r1.mo22091g(r3)
            vk0.o r1 = r0.f260776g
            java.lang.Runnable r1 = r1.f260765g
            if (r1 == 0) goto L_0x01d1
            java.lang.String r1 = "found stop record runnable"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            vk0.o r1 = r0.f260776g
            java.lang.Runnable r1 = r1.f260765g
            r1.run()
            vk0.o r1 = r0.f260776g
            r1.f260765g = r10
            goto L_0x01d1
        L_0x01c1:
            r1.mo22124v()
            com.tencent.mm.plugin.appbrand.jsapi.f r1 = r0.f260774e
            int r2 = r0.f260775f
            vk0.o r3 = r0.f260776g
            java.lang.String r3 = r3.mo115109j(r6)
            r1.mo109647a(r2, r3)
        L_0x01d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vk0.o$$b.run():void");
    }
}
