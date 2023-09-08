package com.tencent.p014mm.plugin.appbrand.jsapi.camera;

import android.app.Activity;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import jk0.C87978d;
import jk0.C87987k;
import org.json.JSONObject;
import p225rc.C89922k;
import p918s2.C90111a;
import vk0.C90809a;
import vk0.C90812b;
import vk0.C90815g;
import vk0.C90817j;
import wq0.C91085v;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.camera.d */
public class C82274d extends C87978d {
    private static final int CTRL_INDEX = 329;
    public static final String NAME = "insertCamera";

    /* renamed from: h */
    public static C82278d f241186h;

    /* renamed from: g */
    public boolean f241187g;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.camera.d$a */
    public class C82275a extends C83231l.C83234d {

        /* renamed from: d */
        public final /* synthetic */ WeakReference f241188d;

        /* renamed from: e */
        public final /* synthetic */ WeakReference f241189e;

        public C82275a(C82274d dVar, WeakReference weakReference, WeakReference weakReference2) {
            this.f241188d = weakReference;
            this.f241189e = weakReference2;
        }

        /* renamed from: c */
        public void mo109497c() {
            C90815g gVar = (C90815g) this.f241188d.get();
            C82520h hVar = (C82520h) this.f241189e.get();
            if (gVar != null && hVar != null) {
                hVar.mo114866q(gVar);
                hVar.mo114863i(gVar);
                hVar.mo114867r(gVar);
                C90809a.C90811b.f260763a.mo124932b(gVar.getCameraId(), true);
                C83231l.m102144e(hVar.getAppId(), this);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.camera.d$b */
    public class C82276b implements C90812b {
        public C82276b(C82274d dVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.camera.d$c */
    public class C82277c implements C90111a.C90113b {

        /* renamed from: d */
        public final /* synthetic */ WeakReference f241190d;

        /* renamed from: e */
        public final /* synthetic */ WeakReference f241191e;

        /* renamed from: f */
        public final /* synthetic */ C87987k f241192f;

        public C82277c(WeakReference weakReference, WeakReference weakReference2, C87987k kVar) {
            this.f241190d = weakReference;
            this.f241191e = weakReference2;
            this.f241192f = kVar;
        }

        public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            C90815g gVar = (C90815g) this.f241190d.get();
            C82381f fVar = (C82381f) this.f241191e.get();
            if (i != 16) {
                return;
            }
            if (iArr == null || iArr.length <= 0 || iArr[0] != 0 || gVar == null || fVar == null) {
                HashMap hashMap = new HashMap();
                if (gVar != null) {
                    hashMap.put("cameraId", Integer.valueOf(gVar.getCameraId()));
                } else {
                    Log.m105928w("MicroMsg.JsApiInsertCamera", "onRequestPermissionsResult weak camera is null, get Camera id fail");
                }
                if (fVar != null) {
                    String jSONObject = new JSONObject(hashMap).toString();
                    C90817j jVar = new C90817j();
                    jVar.mo115161k(fVar);
                    jVar.mo115163m(jSONObject);
                    jVar.mo115158h();
                } else {
                    Log.m105928w("MicroMsg.JsApiInsertCamera", "onRequestPermissionsResult weak camera is null, dispatch data fail");
                }
                C90809a.C90811b.f260763a.f260759a = false;
                return;
            }
            C90809a.C90811b.f260763a.f260759a = true;
            C82274d.this.mo114666J(fVar, gVar, this.f241192f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.camera.d$d */
    public interface C82278d {
    }

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.optInt("cameraId");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01b5  */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo22377E(com.tencent.p014mm.plugin.appbrand.jsapi.C82520h r19, org.json.JSONObject r20) {
        /*
            r18 = this;
            r0 = r19
            r1 = r20
            r2 = 0
            r3 = r18
            r3.f241187g = r2
            android.content.Context r4 = r19.getContext()
            com.tencent.mm.plugin.appbrand.jsapi.camera.d$d r5 = f241186h
            com.tencent.mm.plugin.appbrand.jsapi.camera.a r5 = (com.tencent.p014mm.plugin.appbrand.jsapi.camera.C82273a) r5
            r5.getClass()
            com.tencent.p014mm.plugin.appbrand.app.C81192y0.m99475a()
            com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView r5 = new com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView
            r5.<init>(r4)
            java.lang.String r6 = "cameraId"
            int r6 = r1.optInt(r6)
            java.lang.String r7 = "mode"
            java.lang.String r8 = "normal"
            java.lang.String r7 = r1.optString(r7, r8)
            java.lang.String r9 = "devicePosition"
            java.lang.String r10 = "back"
            java.lang.String r9 = r1.optString(r9, r10)
            java.lang.String r10 = "flash"
            java.lang.String r11 = "auto"
            java.lang.String r10 = r1.optString(r10, r11)
            java.lang.String r11 = "size"
            java.lang.String r11 = r1.optString(r11)
            r11.getClass()
            int r12 = r11.hashCode()
            r14 = -1078030475(0xffffffffbfbe8f75, float:-1.488753)
            java.lang.String r15 = "medium"
            r13 = 1
            if (r12 == r14) goto L_0x0072
            r14 = 102742843(0x61fbb3b, float:3.0042132E-35)
            if (r12 == r14) goto L_0x0067
            r14 = 109548807(0x6879507, float:5.100033E-35)
            if (r12 == r14) goto L_0x005b
            goto L_0x0078
        L_0x005b:
            java.lang.String r12 = "small"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0065
            goto L_0x0078
        L_0x0065:
            r11 = 2
            goto L_0x007b
        L_0x0067:
            java.lang.String r12 = "large"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0070
            goto L_0x0078
        L_0x0070:
            r11 = 1
            goto L_0x007b
        L_0x0072:
            boolean r11 = r11.equals(r15)
            if (r11 != 0) goto L_0x007a
        L_0x0078:
            r11 = -1
            goto L_0x007b
        L_0x007a:
            r11 = 0
        L_0x007b:
            r12 = 288(0x120, float:4.04E-43)
            if (r11 == 0) goto L_0x0085
            if (r11 == r13) goto L_0x0082
            goto L_0x0087
        L_0x0082:
            r12 = 720(0x2d0, float:1.009E-42)
            goto L_0x0087
        L_0x0085:
            r12 = 480(0x1e0, float:6.73E-43)
        L_0x0087:
            java.lang.String r11 = "needOutput"
            boolean r11 = r1.optBoolean(r11, r2)
            java.lang.String r14 = "resolution"
            java.lang.String r14 = r1.optString(r14, r15)
            java.lang.String r15 = r19.getAppId()
            r5.setAppId(r15)
            r5.setPage(r0)
            r5.setCameraId(r6)
            r5.setMode(r7)
            r5.mo22099m(r9, r13)
            r5.setFlash(r10)
            r5.setFrameLimitSize(r12)
            r5.setNeedOutput(r11)
            r5.setResolution(r14)
            boolean r11 = r19.mo109677x()
            r5.setPageOrientation(r11)
            java.lang.String r11 = "position"
            org.json.JSONObject r11 = r1.optJSONObject(r11)
            java.lang.String r12 = "width"
            int r12 = js0.C88020k.m109560k(r11, r12, r2)
            java.lang.String r14 = "height"
            int r11 = js0.C88020k.m109560k(r11, r14, r2)
            if (r12 == 0) goto L_0x00d5
            if (r11 == 0) goto L_0x00d5
            r5.mo22125x(r12, r11, r13)
        L_0x00d5:
            java.lang.Class<vk0.f> r14 = vk0.C90814f.class
            ra.b r14 = r0.mo109668l(r14)
            vk0.f r14 = (vk0.C90814f) r14
            java.lang.String r15 = "MicroMsg.JsApiInsertCamera"
            if (r14 == 0) goto L_0x0119
            int[] r0 = r14.mo120814gq(r0)
            if (r0 == 0) goto L_0x0119
            int r14 = r0.length
            r13 = 2
            if (r14 != r13) goto L_0x0119
            r14 = r0[r2]
            if (r14 <= 0) goto L_0x0119
            r14 = 1
            r16 = r0[r14]
            if (r16 <= 0) goto L_0x0119
            android.util.Size r13 = new android.util.Size
            r3 = r0[r2]
            r2 = r0[r14]
            r13.<init>(r3, r2)
            r5.setDisplayScreenSize(r13)
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r2 = 0
            r13 = r0[r2]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r3[r2] = r13
            r0 = r0[r14]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r14] = r0
            java.lang.String r0 = "onInsertView screen width: %d, screen height: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r0, r3)
        L_0x0119:
            java.lang.String r0 = "scanArea"
            org.json.JSONArray r0 = r1.optJSONArray(r0)
            r3 = 4
            if (r0 == 0) goto L_0x0167
            int r13 = r0.length()
            if (r13 != r3) goto L_0x0167
            r13 = 2
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r3 = 0
            r14[r3] = r0
            int r17 = r0.length()
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)
            r2 = 1
            r14[r2] = r17
            java.lang.String r13 = "scanAreaArray:%s, scanAreaArray.length:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r13, r14)
            int r13 = r0.optInt(r3)
            int r3 = js0.C88020k.m109553d(r13)
            int r13 = r0.optInt(r2)
            int r2 = js0.C88020k.m109553d(r13)
            r13 = 2
            int r14 = r0.optInt(r13)
            int r13 = js0.C88020k.m109553d(r14)
            r14 = 3
            int r0 = r0.optInt(r14)
            int r0 = js0.C88020k.m109553d(r0)
            r5.mo22097j(r3, r2, r13, r0)
            r0 = 0
            goto L_0x016b
        L_0x0167:
            r0 = 0
            r5.mo22097j(r0, r0, r12, r11)
        L_0x016b:
            java.lang.String r2 = "scanFreq"
            int r2 = r1.optInt(r2)
            r5.setScanFreq(r2)
            java.lang.String r2 = "centerCrop"
            boolean r1 = r1.optBoolean(r2)
            r5.setPreviewCenterCrop(r1)
            r2 = 6
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r2[r0] = r3
            r0 = 1
            r2[r0] = r9
            r0 = 2
            r2[r0] = r10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r3 = 3
            r2[r3] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r3 = 4
            r2[r3] = r0
            r0 = 5
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2[r0] = r1
            java.lang.String r0 = "inflateView cameraId: %d,devicePosition: %s,flash: %s,width: %d,height: %d, centerCrop: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r0, r2)
            android.view.View r0 = r5.getView()
            boolean r1 = r8.equals(r7)
            if (r1 == 0) goto L_0x01b5
            r1 = 2131820951(0x7f110197, float:1.9274631E38)
            goto L_0x01b8
        L_0x01b5:
            r1 = 2131820952(0x7f110198, float:1.9274633E38)
        L_0x01b8:
            java.lang.String r1 = r4.getString(r1)
            r0.setContentDescription(r1)
            com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer r0 = new com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer
            r0.<init>((android.content.Context) r4, (android.view.View) r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.camera.C82274d.mo22377E(com.tencent.mm.plugin.appbrand.jsapi.h, org.json.JSONObject):android.view.View");
    }

    /* renamed from: G */
    public boolean mo114664G() {
        return true;
    }

    /* renamed from: I */
    public void mo114665I(C82520h hVar, int i, View view, JSONObject jSONObject, C87987k kVar) {
        Log.m105925i("MicroMsg.JsApiInsertCamera", "onInsertView cameraId=%d", Integer.valueOf(i));
        C90815g gVar = (C90815g) ((CoverViewContainer) view).mo114736d(View.class);
        if (gVar == null) {
            Log.m105921e("MicroMsg.JsApiInsertCamera", "onInsertView(viewId : %d) failed, cameraView is null", Integer.valueOf(i));
            kVar.mo122438a(mo115109j("fail:internal error"));
            return;
        }
        WeakReference weakReference = new WeakReference(gVar);
        WeakReference weakReference2 = new WeakReference(hVar);
        mo114666J(hVar, gVar, kVar);
        C90809a aVar = C90809a.C90811b.f260763a;
        aVar.f260762d.put(gVar.getCameraId(), new WeakReference(gVar));
        hVar.mo114868y(gVar);
        hVar.mo114864j(gVar);
        hVar.mo114865m(gVar);
        C83231l.m102140a(hVar.getAppId(), new C82275a(this, weakReference, weakReference2));
        gVar.setOutPutCallBack(new C82276b(this));
    }

    /* renamed from: J */
    public final boolean mo114666J(C82381f fVar, C90815g gVar, C87987k kVar) {
        C91085v.m114266a(String.valueOf(fVar.getAppId()), new C82277c(new WeakReference(gVar), new WeakReference(fVar), kVar));
        Activity activity = (Activity) fVar.getContext();
        if (activity == null) {
            return false;
        }
        boolean b = C89922k.m112465b(activity, fVar, "android.permission.WRITE_EXTERNAL_STORAGE");
        C90809a.C90811b.f260763a.getClass();
        Log.m105925i("MicroMsg.AppBrandCameraMrg", "has external storage permission: %b", Boolean.valueOf(b));
        boolean a = C89922k.m112464a(activity, fVar, "android.permission.CAMERA", 16, "", "");
        C90809a.C90811b.f260763a.f260759a = a;
        if (!a) {
            return false;
        }
        C91085v.m114268c(fVar.getAppId());
        if (!this.f241187g) {
            kVar.mo122438a(mo115109j("ok"));
            gVar.mo22088a();
            this.f241187g = true;
        }
        return true;
    }
}
