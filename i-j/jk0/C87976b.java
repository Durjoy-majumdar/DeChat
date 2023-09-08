package jk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import org.json.JSONObject;

/* renamed from: jk0.b */
public class C87976b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C82520h f254569d;

    /* renamed from: e */
    public final /* synthetic */ C40482o f254570e;

    /* renamed from: f */
    public final /* synthetic */ C87987k f254571f;

    /* renamed from: g */
    public final /* synthetic */ JSONObject f254572g;

    /* renamed from: h */
    public final /* synthetic */ C87978d f254573h;

    public C87976b(C87978d dVar, C82520h hVar, C40482o oVar, C87987k kVar, JSONObject jSONObject) {
        this.f254573h = dVar;
        this.f254569d = hVar;
        this.f254570e = oVar;
        this.f254571f = kVar;
        this.f254572g = jSONObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r22 = this;
            r1 = r22
            com.tencent.mm.plugin.appbrand.jsapi.h r0 = r1.f254569d
            jk0.d r2 = r1.f254573h
            java.lang.String r2 = r2.mo114779e()
            com.tencent.mm.plugin.appbrand.jsruntime.o r3 = r1.f254570e
            boolean r0 = r0.mo109648b(r2, r3)
            java.lang.String r2 = "MicroMsg.BaseInsertViewJsApi"
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = "fail, component is not running"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            return
        L_0x001a:
            com.tencent.mm.plugin.appbrand.jsapi.h r0 = r1.f254569d
            com.tencent.mm.plugin.appbrand.jsapi.h$a r0 = r0.getCustomViewContainer()
            java.lang.String r3 = "makeReturnJson with JSONObject, put errno, e=%s"
            java.lang.String r4 = "errno"
            java.lang.String r5 = "makeReturnJson, errno: %d, reason: %s"
            java.lang.String r6 = "MicroMsg.AppBrandJsApi"
            r7 = 2
            r8 = 4
            r9 = 1
            r10 = 0
            if (r0 != 0) goto L_0x0067
            java.lang.String r0 = "fail, component custom view container is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            jk0.k r2 = r1.f254571f
            jk0.d r11 = r1.f254573h
            java.lang.String r12 = "fail:insert view failed"
            r11.getClass()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x004d
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r0[r10] = r7
            r0[r9] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r5, r0)
        L_0x004d:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r5.put(r4, r8)     // Catch:{ Exception -> 0x0056 }
            goto L_0x005f
        L_0x0056:
            r0 = move-exception
            r4 = r0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r3, r0)
        L_0x005f:
            java.lang.String r0 = r11.mo115115p(r12, r5)
            r2.mo122438a(r0)
            return
        L_0x0067:
            jk0.d r0 = r1.f254573h     // Catch:{ JSONException -> 0x0364 }
            org.json.JSONObject r11 = r1.f254572g     // Catch:{ JSONException -> 0x0364 }
            int r11 = r0.mo22376B(r11)     // Catch:{ JSONException -> 0x0364 }
            jk0.d r0 = r1.f254573h
            com.tencent.mm.plugin.appbrand.jsapi.h r12 = r1.f254569d
            org.json.JSONObject r13 = r1.f254572g
            android.view.View r15 = r0.mo110320F(r12, r13, r11)
            if (r15 != 0) goto L_0x00b4
            java.lang.String r0 = "inflate view return null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            jk0.k r2 = r1.f254571f
            jk0.d r11 = r1.f254573h
            java.lang.String r12 = "fail:inflate view failed"
            r11.getClass()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x009a
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r0[r10] = r7
            r0[r9] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r5, r0)
        L_0x009a:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r5.put(r4, r8)     // Catch:{ Exception -> 0x00a3 }
            goto L_0x00ac
        L_0x00a3:
            r0 = move-exception
            r4 = r0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r3, r0)
        L_0x00ac:
            java.lang.String r0 = r11.mo115115p(r12, r5)
            r2.mo122438a(r0)
            return
        L_0x00b4:
            jk0.d r0 = r1.f254573h
            org.json.JSONObject r12 = r1.f254572g
            r0.getClass()
            java.lang.String r0 = "independent"
            boolean r14 = r12.optBoolean(r0, r10)
            boolean r0 = r15 instanceof com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer
            java.lang.String r13 = "data"
            if (r0 == 0) goto L_0x0110
            org.json.JSONObject r0 = r1.f254572g
            java.lang.String r12 = "draggable"
            boolean r0 = r0.has(r12)
            if (r0 == 0) goto L_0x0110
            jk0.d r0 = r1.f254573h
            org.json.JSONObject r8 = r1.f254572g
            r0.getClass()
            boolean r0 = r8.optBoolean(r12, r10)
            r8 = r15
            com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer r8 = (com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) r8
            org.json.JSONObject r12 = r1.f254572g
            java.lang.String r12 = r12.optString(r13)
            r8.f241373o = r0
            r8.f241375q = r11
            if (r0 == 0) goto L_0x00f7
            r8.f241374p = r12
            java.util.HashMap<java.lang.Integer, com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer> r0 = com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer.f241363C
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r0.put(r12, r8)
            goto L_0x0100
        L_0x00f7:
            java.util.HashMap<java.lang.Integer, com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer> r0 = com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer.f241363C
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r0.remove(r12)
        L_0x0100:
            jk0.d r0 = r1.f254573h
            org.json.JSONObject r12 = r1.f254572g
            r0.getClass()
            java.lang.String r0 = "dragConfig"
            java.lang.String r0 = r12.optString(r0)
            r8.setDragConfig(r0)
        L_0x0110:
            com.tencent.mm.plugin.appbrand.jsapi.h r0 = r1.f254569d
            com.tencent.mm.plugin.appbrand.jsapi.h$a r0 = r0.mo109649c(r14)
            com.tencent.mm.plugin.appbrand.page.p2 r0 = (com.tencent.p014mm.plugin.appbrand.page.C83873p2) r0
            com.tencent.mm.plugin.appbrand.page.p2$g r0 = r0.mo116439q(r11)
            if (r0 == 0) goto L_0x0120
            r0 = 1
            goto L_0x0121
        L_0x0120:
            r0 = 0
        L_0x0121:
            if (r0 == 0) goto L_0x0167
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            r0[r10] = r8
            java.lang.String r8 = "insert view(%d) failed, it has been inserted before."
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r8, r0)
            jk0.k r2 = r1.f254571f
            jk0.d r8 = r1.f254573h
            java.lang.String r11 = "fail:the view has already exist"
            r8.getClass()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x014c
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r7 = 4
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            r0[r10] = r12
            r0[r9] = r11
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r5, r0)
            goto L_0x014d
        L_0x014c:
            r7 = 4
        L_0x014d:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r5.put(r4, r7)     // Catch:{ Exception -> 0x0156 }
            goto L_0x015f
        L_0x0156:
            r0 = move-exception
            r4 = r0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r3, r0)
        L_0x015f:
            java.lang.String r0 = r8.mo115115p(r11, r5)
            r2.mo122438a(r0)
            return
        L_0x0167:
            jk0.d r0 = r1.f254573h
            org.json.JSONObject r8 = r1.f254572g
            r0.getClass()
            java.lang.String r0 = "parentId"
            int r8 = r8.optInt(r0, r10)
            jk0.d r0 = r1.f254573h     // Catch:{ JSONException -> 0x0200 }
            org.json.JSONObject r12 = r1.f254572g     // Catch:{ JSONException -> 0x0200 }
            float[] r0 = r0.mo122434z(r12)     // Catch:{ JSONException -> 0x0200 }
            jk0.d r12 = r1.f254573h     // Catch:{ JSONException -> 0x0200 }
            org.json.JSONObject r7 = r1.f254572g     // Catch:{ JSONException -> 0x0200 }
            r12.getClass()     // Catch:{ JSONException -> 0x0200 }
            java.lang.String r12 = "hide"
            boolean r7 = r7.getBoolean(r12)     // Catch:{ JSONException -> 0x0192 }
            if (r7 == 0) goto L_0x018f
            r17 = 4
            goto L_0x0195
        L_0x018f:
            r17 = 0
            goto L_0x0195
        L_0x0192:
            r7 = -1
            r17 = -1
        L_0x0195:
            jk0.d r7 = r1.f254573h     // Catch:{ JSONException -> 0x0200 }
            org.json.JSONObject r12 = r1.f254572g     // Catch:{ JSONException -> 0x0200 }
            r7.getClass()     // Catch:{ JSONException -> 0x0200 }
            java.lang.String r7 = "fixed"
            boolean r7 = r12.getBoolean(r7)     // Catch:{ JSONException -> 0x01a7 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ JSONException -> 0x01a7 }
            goto L_0x01a8
        L_0x01a7:
            r7 = 0
        L_0x01a8:
            jk0.d r12 = r1.f254573h     // Catch:{ JSONException -> 0x0200 }
            org.json.JSONObject r10 = r1.f254572g     // Catch:{ JSONException -> 0x0200 }
            r12.getClass()     // Catch:{ JSONException -> 0x0200 }
            java.lang.String r12 = "fullscreen"
            boolean r10 = r10.getBoolean(r12)     // Catch:{ JSONException -> 0x01ba }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ JSONException -> 0x01ba }
            goto L_0x01bb
        L_0x01ba:
            r10 = 0
        L_0x01bb:
            jk0.d r12 = r1.f254573h     // Catch:{ JSONException -> 0x0200 }
            org.json.JSONObject r9 = r1.f254572g     // Catch:{ JSONException -> 0x0200 }
            java.lang.Boolean r9 = r12.mo115317A(r9)     // Catch:{ JSONException -> 0x0200 }
            com.tencent.mm.plugin.appbrand.jsapi.h r12 = r1.f254569d     // Catch:{ JSONException -> 0x0200 }
            com.tencent.mm.plugin.appbrand.jsapi.h$a r12 = r12.mo109649c(r14)     // Catch:{ JSONException -> 0x0200 }
            if (r7 == 0) goto L_0x01d4
            boolean r7 = r7.booleanValue()     // Catch:{ JSONException -> 0x0200 }
            if (r7 == 0) goto L_0x01d4
            r18 = 1
            goto L_0x01d6
        L_0x01d4:
            r18 = 0
        L_0x01d6:
            if (r10 == 0) goto L_0x01e1
            boolean r7 = r10.booleanValue()     // Catch:{ JSONException -> 0x0200 }
            if (r7 == 0) goto L_0x01e1
            r19 = 1
            goto L_0x01e3
        L_0x01e1:
            r19 = 0
        L_0x01e3:
            if (r9 == 0) goto L_0x01ee
            boolean r7 = r9.booleanValue()     // Catch:{ JSONException -> 0x0200 }
            if (r7 == 0) goto L_0x01ee
            r20 = 1
            goto L_0x01f0
        L_0x01ee:
            r20 = 0
        L_0x01f0:
            r7 = 0
            r9 = r13
            r13 = r15
            r10 = r14
            r14 = r11
            r7 = r15
            r15 = r8
            r16 = r0
            boolean r0 = r12.mo114857c(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ JSONException -> 0x01fe }
            goto L_0x0211
        L_0x01fe:
            r0 = move-exception
            goto L_0x0204
        L_0x0200:
            r0 = move-exception
            r9 = r13
            r10 = r14
            r7 = r15
        L_0x0204:
            r12 = 1
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r12 = 0
            r13[r12] = r0
            java.lang.String r0 = "parse position error. Exception :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r13)
            r0 = 0
        L_0x0211:
            jk0.d r12 = r1.f254573h
            boolean r18 = r12.mo114664G()
            if (r0 == 0) goto L_0x0283
            jk0.d r12 = r1.f254573h
            com.tencent.mm.plugin.appbrand.jsapi.h r13 = r1.f254569d
            org.json.JSONObject r14 = r1.f254572g
            boolean r15 = r12.mo121671C()
            if (r15 != 0) goto L_0x022c
            r19 = r3
            r20 = r4
            r21 = r5
            goto L_0x0265
        L_0x022c:
            com.tencent.mm.plugin.appbrand.jsapi.h$a r15 = r13.mo109649c(r10)
            r19 = r3
            r3 = 1
            eb0.v0$c r15 = r15.mo86860a(r11, r3)
            java.lang.String r3 = "disableScroll"
            r20 = r4
            r21 = r5
            r4 = 0
            boolean r5 = r14.optBoolean(r3, r4)
            r15.mo120963j(r3, r5)
            boolean r3 = r12.mo121672D()
            java.lang.String r5 = "enableLongClick"
            r15.mo120963j(r5, r3)
            java.lang.String r3 = r14.optString(r9)
            r15.mo120964k(r9, r3)
            java.lang.String r3 = "gesture"
            boolean r3 = r14.optBoolean(r3, r4)
            if (r3 == 0) goto L_0x0265
            sn0.d r3 = new sn0.d
            r3.<init>(r13, r15)
            r7.setOnTouchListener(r3)
        L_0x0265:
            if (r18 == 0) goto L_0x0279
            jk0.d r12 = r1.f254573h
            com.tencent.mm.plugin.appbrand.jsapi.h r13 = r1.f254569d
            org.json.JSONObject r3 = r1.f254572g
            jk0.k r4 = r1.f254571f
            r14 = r11
            r15 = r7
            r16 = r3
            r17 = r4
            r12.mo114665I(r13, r14, r15, r16, r17)
            goto L_0x0289
        L_0x0279:
            jk0.d r3 = r1.f254573h
            com.tencent.mm.plugin.appbrand.jsapi.h r4 = r1.f254569d
            org.json.JSONObject r5 = r1.f254572g
            r3.mo22378H(r4, r11, r7, r5)
            goto L_0x0289
        L_0x0283:
            r19 = r3
            r20 = r4
            r21 = r5
        L_0x0289:
            jk0.d r13 = r1.f254573h
            com.tencent.mm.plugin.appbrand.jsapi.h r3 = r1.f254569d
            r13.getClass()
            com.tencent.mm.plugin.appbrand.jsapi.h$a r4 = r3.mo109649c(r10)
            r5 = 1
            eb0.v0$c r4 = r4.mo86860a(r11, r5)
            java.lang.String r5 = "baseViewDestroyListener"
            r9 = 0
            java.lang.Object r9 = r4.mo120956c(r5, r9)
            com.tencent.mm.plugin.appbrand.jsapi.i$c r9 = (com.tencent.p014mm.plugin.appbrand.jsapi.C82531i.C82534c) r9
            if (r9 != 0) goto L_0x02b6
            jk0.c r9 = new jk0.c
            r12 = r9
            r14 = r3
            r15 = r10
            r16 = r11
            r17 = r4
            r12.<init>(r13, r14, r15, r16, r17)
            r4.mo120962i(r5, r9)
            r3.mo114865m(r9)
        L_0x02b6:
            r3 = 4
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r5 = 0
            r4[r5] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r5 = 1
            r4[r5] = r3
            int r3 = r7.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 2
            r4[r5] = r3
            r3 = 3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            r4[r3] = r5
            java.lang.String r3 = "insert view(parentId : %s, viewId : %s, view : %s, r : %s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r4)
            if (r18 != 0) goto L_0x0363
            if (r0 == 0) goto L_0x0322
            jk0.k r2 = r1.f254571f
            jk0.d r3 = r1.f254573h
            r3.getClass()
            java.lang.String r4 = "ok"
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x0302
            r5 = 2
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r5 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r0[r5] = r7
            r7 = 1
            r0[r7] = r4
            r7 = r21
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r7, r0)
            goto L_0x0303
        L_0x0302:
            r5 = 0
        L_0x0303:
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            r8 = r20
            r7.put(r8, r5)     // Catch:{ Exception -> 0x030e }
            goto L_0x031a
        L_0x030e:
            r0 = move-exception
            r8 = r0
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r5] = r8
            r5 = r19
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r5, r0)
        L_0x031a:
            java.lang.String r0 = r3.mo115115p(r4, r7)
            r2.mo122438a(r0)
            goto L_0x0363
        L_0x0322:
            r5 = r19
            r8 = r20
            r7 = r21
            jk0.k r2 = r1.f254571f
            jk0.d r3 = r1.f254573h
            java.lang.String r4 = "fail:insert view fail"
            r3.getClass()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x0347
            r9 = 2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r9 = 4
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r11 = 0
            r0[r11] = r10
            r10 = 1
            r0[r10] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r7, r0)
            goto L_0x0348
        L_0x0347:
            r9 = 4
        L_0x0348:
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            r7.put(r8, r9)     // Catch:{ Exception -> 0x0351 }
            goto L_0x035c
        L_0x0351:
            r0 = move-exception
            r8 = r0
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r9 = 0
            r0[r9] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r5, r0)
        L_0x035c:
            java.lang.String r0 = r3.mo115115p(r4, r7)
            r2.mo122438a(r0)
        L_0x0363:
            return
        L_0x0364:
            r8 = r4
            r7 = r5
            r5 = r3
            jk0.k r2 = r1.f254571f
            jk0.d r3 = r1.f254573h
            java.lang.String r4 = "fail:invalid view id"
            r3.getClass()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x0387
            r9 = 2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r9 = 4
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r11 = 0
            r0[r11] = r10
            r10 = 1
            r0[r10] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r7, r0)
            goto L_0x0388
        L_0x0387:
            r9 = 4
        L_0x0388:
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            r7.put(r8, r9)     // Catch:{ Exception -> 0x0391 }
            goto L_0x039c
        L_0x0391:
            r0 = move-exception
            r8 = r0
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r9 = 0
            r0[r9] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r5, r0)
        L_0x039c:
            java.lang.String r0 = r3.mo115115p(r4, r7)
            r2.mo122438a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jk0.C87976b.run():void");
    }
}
