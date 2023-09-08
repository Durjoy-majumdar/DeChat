package jk0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import xk0.C91268g;
import xk0.C91279p;

/* renamed from: jk0.f */
public abstract class C87981f<CONTEXT extends C82520h> extends C87983g<C82381f> {

    /* renamed from: jk0.f$a */
    public class C87982a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WeakReference f254583d;

        /* renamed from: e */
        public final /* synthetic */ C40482o f254584e;

        /* renamed from: f */
        public final /* synthetic */ C82381f f254585f;

        /* renamed from: g */
        public final /* synthetic */ int f254586g;

        /* renamed from: h */
        public final /* synthetic */ JSONObject f254587h;

        public C87982a(WeakReference weakReference, C40482o oVar, C82381f fVar, int i, JSONObject jSONObject) {
            this.f254583d = weakReference;
            this.f254584e = oVar;
            this.f254585f = fVar;
            this.f254586g = i;
            this.f254587h = jSONObject;
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x0148 */
        /* JADX WARNING: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x015f  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x0162  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x01b1 A[Catch:{ JSONException -> 0x01d9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01b3 A[Catch:{ JSONException -> 0x01d9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x01e3  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x0204  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r22 = this;
                r1 = r22
                java.lang.ref.WeakReference r0 = r1.f254583d
                java.lang.Object r0 = r0.get()
                r3 = r0
                com.tencent.mm.plugin.appbrand.jsapi.h r3 = (com.tencent.p014mm.plugin.appbrand.jsapi.C82520h) r3
                r0 = 4
                java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
                r9 = 2
                r10 = 0
                r11 = 1
                java.lang.String r2 = "MicroMsg.BaseUpdateViewJsApi"
                java.lang.String r12 = "makeReturnJson with JSONObject, put errno, e=%s"
                java.lang.String r13 = "errno"
                java.lang.String r14 = "makeReturnJson, errno: %d, reason: %s"
                java.lang.String r15 = "MicroMsg.AppBrandJsApi"
                if (r3 == 0) goto L_0x02b1
                jk0.f r4 = jk0.C87981f.this
                java.lang.String r4 = r4.mo114779e()
                com.tencent.mm.plugin.appbrand.jsruntime.o r5 = r1.f254584e
                boolean r4 = r3.mo109648b(r4, r5)
                if (r4 != 0) goto L_0x002f
                goto L_0x02b1
            L_0x002f:
                com.tencent.mm.plugin.appbrand.jsapi.h$a r4 = r3.getCustomViewContainer()
                if (r4 != 0) goto L_0x006c
                java.lang.String r3 = "fail, component custom view container is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r3)
                com.tencent.mm.plugin.appbrand.jsapi.f r2 = r1.f254585f
                int r3 = r1.f254586g
                jk0.f r4 = jk0.C87981f.this
                java.lang.String r5 = "fail:update view failed"
                r4.getClass()
                boolean r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                if (r6 == 0) goto L_0x0052
                java.lang.Object[] r6 = new java.lang.Object[r9]
                r6[r10] = r8
                r6[r11] = r5
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r14, r6)
            L_0x0052:
                org.json.JSONObject r6 = new org.json.JSONObject
                r6.<init>()
                r6.put(r13, r0)     // Catch:{ Exception -> 0x005b }
                goto L_0x0064
            L_0x005b:
                r0 = move-exception
                r7 = r0
                java.lang.Object[] r0 = new java.lang.Object[r11]
                r0[r10] = r7
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r12, r0)
            L_0x0064:
                java.lang.String r0 = r4.mo115115p(r5, r6)
                r2.mo109647a(r3, r0)
                return
            L_0x006c:
                jk0.f r4 = jk0.C87981f.this     // Catch:{ JSONException -> 0x0279 }
                org.json.JSONObject r5 = r1.f254587h     // Catch:{ JSONException -> 0x0279 }
                int r4 = r4.mo22376B(r5)     // Catch:{ JSONException -> 0x0279 }
                jk0.f r5 = jk0.C87981f.this
                org.json.JSONObject r6 = r1.f254587h
                r5.getClass()
                java.lang.String r5 = "independent"
                boolean r5 = r6.optBoolean(r5, r10)
                com.tencent.mm.plugin.appbrand.jsapi.h$a r6 = r3.mo109649c(r5)
                com.tencent.mm.plugin.appbrand.page.p2 r6 = (com.tencent.p014mm.plugin.appbrand.page.C83873p2) r6
                android.view.View r6 = r6.mo116438p(r4)
                if (r6 != 0) goto L_0x00cc
                java.lang.Object[] r3 = new java.lang.Object[r11]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r3[r10] = r4
                java.lang.String r4 = "get view by viewId(%s) return null."
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r4, r3)
                com.tencent.mm.plugin.appbrand.jsapi.f r2 = r1.f254585f
                int r3 = r1.f254586g
                jk0.f r4 = jk0.C87981f.this
                java.lang.String r5 = "fail:got 'null' when get view by the given viewId"
                r4.getClass()
                boolean r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                if (r6 == 0) goto L_0x00b2
                java.lang.Object[] r6 = new java.lang.Object[r9]
                r6[r10] = r8
                r6[r11] = r5
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r14, r6)
            L_0x00b2:
                org.json.JSONObject r6 = new org.json.JSONObject
                r6.<init>()
                r6.put(r13, r0)     // Catch:{ Exception -> 0x00bb }
                goto L_0x00c4
            L_0x00bb:
                r0 = move-exception
                r7 = r0
                java.lang.Object[] r0 = new java.lang.Object[r11]
                r0[r10] = r7
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r12, r0)
            L_0x00c4:
                java.lang.String r0 = r4.mo115115p(r5, r6)
                r2.mo109647a(r3, r0)
                return
            L_0x00cc:
                boolean r7 = r6 instanceof com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer
                if (r7 == 0) goto L_0x0115
                org.json.JSONObject r7 = r1.f254587h
                java.lang.String r9 = "draggable"
                boolean r7 = r7.has(r9)
                if (r7 == 0) goto L_0x0115
                jk0.f r7 = jk0.C87981f.this
                org.json.JSONObject r11 = r1.f254587h
                r7.getClass()
                boolean r7 = r11.optBoolean(r9, r10)
                r9 = r6
                com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer r9 = (com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) r9
                java.lang.String r11 = r9.f241374p
                r9.f241373o = r7
                r9.f241375q = r4
                if (r7 == 0) goto L_0x00fc
                r9.f241374p = r11
                java.util.HashMap<java.lang.Integer, com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer> r7 = com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer.f241363C
                java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
                r7.put(r11, r9)
                goto L_0x0105
            L_0x00fc:
                java.util.HashMap<java.lang.Integer, com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer> r7 = com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer.f241363C
                java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
                r7.remove(r11)
            L_0x0105:
                jk0.f r7 = jk0.C87981f.this
                org.json.JSONObject r11 = r1.f254587h
                r7.getClass()
                java.lang.String r7 = "dragConfig"
                java.lang.String r7 = r11.optString(r7)
                r9.setDragConfig(r7)
            L_0x0115:
                jk0.f r7 = jk0.C87981f.this
                org.json.JSONObject r9 = r1.f254587h
                java.lang.String r11 = "disableScroll"
                boolean r7 = r7.mo108859C()
                if (r7 == 0) goto L_0x0148
                com.tencent.mm.plugin.appbrand.jsapi.h$a r7 = r3.mo109649c(r5)     // Catch:{ JSONException -> 0x0148 }
                eb0.v0$c r7 = r7.mo86860a(r4, r10)     // Catch:{ JSONException -> 0x0148 }
                if (r7 == 0) goto L_0x0148
                boolean r9 = r9.getBoolean(r11)     // Catch:{ JSONException -> 0x0148 }
                java.lang.String r10 = "isTouching"
                boolean r10 = r7.mo120960g(r10)     // Catch:{ JSONException -> 0x0148 }
                if (r10 == 0) goto L_0x0145
                r10 = r9 ^ 1
                boolean r10 = r7.mo120957d(r11, r10)     // Catch:{ JSONException -> 0x0148 }
                if (r10 == r9) goto L_0x0148
                java.lang.String r10 = "disableScroll-nextState"
                r7.mo120963j(r10, r9)     // Catch:{ JSONException -> 0x0148 }
                goto L_0x0148
            L_0x0145:
                r7.mo120963j(r11, r9)     // Catch:{ JSONException -> 0x0148 }
            L_0x0148:
                jk0.f r7 = jk0.C87981f.this     // Catch:{ JSONException -> 0x01d9 }
                org.json.JSONObject r9 = r1.f254587h     // Catch:{ JSONException -> 0x01d9 }
                float[] r18 = r7.mo122434z(r9)     // Catch:{ JSONException -> 0x01d9 }
                jk0.f r7 = jk0.C87981f.this     // Catch:{ JSONException -> 0x01d9 }
                org.json.JSONObject r9 = r1.f254587h     // Catch:{ JSONException -> 0x01d9 }
                r7.getClass()     // Catch:{ JSONException -> 0x01d9 }
                java.lang.String r7 = "hide"
                boolean r7 = r9.getBoolean(r7)     // Catch:{ JSONException -> 0x0165 }
                if (r7 == 0) goto L_0x0162
                r19 = 4
                goto L_0x0168
            L_0x0162:
                r19 = 0
                goto L_0x0168
            L_0x0165:
                r7 = -1
                r19 = -1
            L_0x0168:
                jk0.f r7 = jk0.C87981f.this     // Catch:{ JSONException -> 0x01d9 }
                org.json.JSONObject r9 = r1.f254587h     // Catch:{ JSONException -> 0x01d9 }
                r7.getClass()     // Catch:{ JSONException -> 0x01d9 }
                r7 = 0
                java.lang.String r10 = "fixed"
                boolean r9 = r9.getBoolean(r10)     // Catch:{ JSONException -> 0x017d }
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ JSONException -> 0x017d }
                r20 = r9
                goto L_0x017f
            L_0x017d:
                r20 = r7
            L_0x017f:
                jk0.f r9 = jk0.C87981f.this     // Catch:{ JSONException -> 0x01d9 }
                org.json.JSONObject r10 = r1.f254587h     // Catch:{ JSONException -> 0x01d9 }
                r9.getClass()     // Catch:{ JSONException -> 0x01d9 }
                java.lang.String r9 = "fullscreen"
                boolean r9 = r10.getBoolean(r9)     // Catch:{ JSONException -> 0x0190 }
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r9)     // Catch:{ JSONException -> 0x0190 }
            L_0x0190:
                r21 = r7
                com.tencent.mm.plugin.appbrand.jsapi.h$a r7 = r3.mo109649c(r5)     // Catch:{ JSONException -> 0x01d9 }
                r16 = r7
                com.tencent.mm.plugin.appbrand.page.p2 r16 = (com.tencent.p014mm.plugin.appbrand.page.C83873p2) r16     // Catch:{ JSONException -> 0x01d9 }
                r17 = r4
                boolean r7 = r16.mo116446x(r17, r18, r19, r20, r21)     // Catch:{ JSONException -> 0x01d9 }
                java.lang.String r9 = "update view(parentId : %s, viewId : %d), ret : %b"
                java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ JSONException -> 0x01d9 }
                com.tencent.mm.plugin.appbrand.jsapi.h$a r5 = r3.mo109649c(r5)     // Catch:{ JSONException -> 0x01d9 }
                com.tencent.mm.plugin.appbrand.page.p2 r5 = (com.tencent.p014mm.plugin.appbrand.page.C83873p2) r5     // Catch:{ JSONException -> 0x01d9 }
                com.tencent.mm.plugin.appbrand.page.p2$g r5 = r5.mo116439q(r4)     // Catch:{ JSONException -> 0x01d9 }
                if (r5 != 0) goto L_0x01b3
                r5 = 0
                goto L_0x01b5
            L_0x01b3:
                int r5 = r5.f244909c     // Catch:{ JSONException -> 0x01d9 }
            L_0x01b5:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x01d9 }
                r11 = 0
                r10[r11] = r5     // Catch:{ JSONException -> 0x01d9 }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ JSONException -> 0x01d9 }
                r11 = 1
                r10[r11] = r5     // Catch:{ JSONException -> 0x01d9 }
                int r5 = r6.hashCode()     // Catch:{ JSONException -> 0x01d9 }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x01d9 }
                r11 = 2
                r10[r11] = r5     // Catch:{ JSONException -> 0x01d9 }
                r5 = 3
                java.lang.Boolean r11 = java.lang.Boolean.valueOf(r7)     // Catch:{ JSONException -> 0x01d9 }
                r10[r5] = r11     // Catch:{ JSONException -> 0x01d9 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r9, r10)     // Catch:{ JSONException -> 0x01d9 }
                goto L_0x01db
            L_0x01d9:
                r7 = 1
            L_0x01db:
                jk0.f r2 = jk0.C87981f.this
                boolean r9 = r2.mo110315D()
                if (r7 == 0) goto L_0x0202
                if (r9 == 0) goto L_0x01fa
                jk0.f r2 = jk0.C87981f.this
                org.json.JSONObject r7 = r1.f254587h
                jk0.k r10 = new jk0.k
                com.tencent.mm.plugin.appbrand.jsapi.f r5 = r1.f254585f
                int r11 = r1.f254586g
                r10.<init>(r5, r11)
                r5 = r6
                r6 = r7
                r7 = r10
                boolean r7 = r2.mo110316F(r3, r4, r5, r6, r7)
                goto L_0x0202
            L_0x01fa:
                jk0.f r2 = jk0.C87981f.this
                org.json.JSONObject r5 = r1.f254587h
                boolean r7 = r2.mo22381E(r3, r4, r6, r5)
            L_0x0202:
                if (r9 != 0) goto L_0x0278
                if (r7 == 0) goto L_0x0242
                com.tencent.mm.plugin.appbrand.jsapi.f r2 = r1.f254585f
                int r3 = r1.f254586g
                jk0.f r4 = jk0.C87981f.this
                r4.getClass()
                java.lang.String r5 = "ok"
                boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                if (r0 == 0) goto L_0x0226
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r6 = 0
                java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
                r0[r6] = r7
                r7 = 1
                r0[r7] = r5
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r14, r0)
                goto L_0x0227
            L_0x0226:
                r6 = 0
            L_0x0227:
                org.json.JSONObject r7 = new org.json.JSONObject
                r7.<init>()
                r7.put(r13, r6)     // Catch:{ Exception -> 0x0230 }
                goto L_0x023a
            L_0x0230:
                r0 = move-exception
                r8 = r0
                r9 = 1
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r6] = r8
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r12, r0)
            L_0x023a:
                java.lang.String r0 = r4.mo115115p(r5, r7)
                r2.mo109647a(r3, r0)
                goto L_0x0278
            L_0x0242:
                com.tencent.mm.plugin.appbrand.jsapi.f r2 = r1.f254585f
                int r3 = r1.f254586g
                jk0.f r4 = jk0.C87981f.this
                r4.getClass()
                java.lang.String r5 = "fail:internal error"
                boolean r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                if (r6 == 0) goto L_0x025d
                r6 = 2
                java.lang.Object[] r6 = new java.lang.Object[r6]
                r7 = 0
                r6[r7] = r8
                r7 = 1
                r6[r7] = r5
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r14, r6)
            L_0x025d:
                org.json.JSONObject r6 = new org.json.JSONObject
                r6.<init>()
                r6.put(r13, r0)     // Catch:{ Exception -> 0x0266 }
                goto L_0x0271
            L_0x0266:
                r0 = move-exception
                r7 = r0
                r8 = 1
                java.lang.Object[] r0 = new java.lang.Object[r8]
                r8 = 0
                r0[r8] = r7
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r12, r0)
            L_0x0271:
                java.lang.String r0 = r4.mo115115p(r5, r6)
                r2.mo109647a(r3, r0)
            L_0x0278:
                return
            L_0x0279:
                com.tencent.mm.plugin.appbrand.jsapi.f r2 = r1.f254585f
                int r3 = r1.f254586g
                jk0.f r4 = jk0.C87981f.this
                java.lang.String r5 = "fail:view id do not exist"
                r4.getClass()
                boolean r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                if (r6 == 0) goto L_0x0295
                r6 = 2
                java.lang.Object[] r6 = new java.lang.Object[r6]
                r7 = 0
                r6[r7] = r8
                r7 = 1
                r6[r7] = r5
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r14, r6)
            L_0x0295:
                org.json.JSONObject r6 = new org.json.JSONObject
                r6.<init>()
                r6.put(r13, r0)     // Catch:{ Exception -> 0x029e }
                goto L_0x02a9
            L_0x029e:
                r0 = move-exception
                r7 = r0
                r8 = 1
                java.lang.Object[] r0 = new java.lang.Object[r8]
                r8 = 0
                r0[r8] = r7
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r12, r0)
            L_0x02a9:
                java.lang.String r0 = r4.mo115115p(r5, r6)
                r2.mo109647a(r3, r0)
                return
            L_0x02b1:
                java.lang.String r3 = "page view has been release."
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r3)
                com.tencent.mm.plugin.appbrand.jsapi.f r2 = r1.f254585f
                int r3 = r1.f254586g
                jk0.f r4 = jk0.C87981f.this
                java.lang.String r5 = "fail:page is null"
                r4.getClass()
                boolean r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                if (r6 == 0) goto L_0x02d2
                r6 = 2
                java.lang.Object[] r6 = new java.lang.Object[r6]
                r7 = 0
                r6[r7] = r8
                r7 = 1
                r6[r7] = r5
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r14, r6)
            L_0x02d2:
                org.json.JSONObject r6 = new org.json.JSONObject
                r6.<init>()
                r6.put(r13, r0)     // Catch:{ Exception -> 0x02db }
                goto L_0x02e6
            L_0x02db:
                r0 = move-exception
                r7 = r0
                r8 = 1
                java.lang.Object[] r0 = new java.lang.Object[r8]
                r8 = 0
                r0[r8] = r7
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r12, r0)
            L_0x02e6:
                java.lang.String r0 = r4.mo115115p(r5, r6)
                r2.mo109647a(r3, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: jk0.C87981f.C87982a.run():void");
        }
    }

    /* renamed from: C */
    public boolean mo108859C() {
        return this instanceof C91279p;
    }

    /* renamed from: D */
    public boolean mo110315D() {
        return this instanceof C91268g;
    }

    /* renamed from: E */
    public boolean mo22381E(CONTEXT context, int i, View view, JSONObject jSONObject) {
        return true;
    }

    /* renamed from: F */
    public boolean mo110316F(CONTEXT context, int i, View view, JSONObject jSONObject, C87987k kVar) {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        mo114531v(fVar, jSONObject, i, fVar.getJsRuntime());
    }

    /* renamed from: v */
    public void mo114531v(C82381f fVar, JSONObject jSONObject, int i, C40482o oVar) {
        C82520h y = mo122433y(fVar, jSONObject);
        if (y == null) {
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:ComponentView is null.");
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            fVar.mo109647a(i, mo115115p("fail:ComponentView is null.", jSONObject2));
            return;
        }
        fVar.mo109673t(new C87982a(new WeakReference(y), oVar, fVar, i, jSONObject));
    }
}
