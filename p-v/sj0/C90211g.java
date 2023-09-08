package sj0;

import android.content.Intent;
import br0.C79778e;
import com.tencent.p014mm.plugin.appbrand.p026ui.record.WAGameRecordShareUI;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kr0.C88267e;
import org.json.JSONArray;
import org.json.JSONObject;
import p225rc.g$$f;
import rx3.C13598b0;

/* renamed from: sj0.g */
public final class C90211g extends C90207d {
    public static final int CTRL_INDEX = 1169;
    public static final String NAME = "shareGameRecorderVideo";

    /* renamed from: sj0.g$a */
    public /* synthetic */ class C90212a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f259012a;

        static {
            int[] iArr = new int[C79778e.C79780b.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            f259012a = iArr;
        }
    }

    /* renamed from: sj0.g$b */
    public static final class C90213b implements g$$f {

        /* renamed from: a */
        public final /* synthetic */ int f259013a;

        /* renamed from: b */
        public final /* synthetic */ C88267e f259014b;

        /* renamed from: c */
        public final /* synthetic */ int f259015c;

        /* renamed from: d */
        public final /* synthetic */ C90211g f259016d;

        public C90213b(int i, C88267e eVar, int i2, C90211g gVar) {
            this.f259013a = i;
            this.f259014b = eVar;
            this.f259015c = i2;
            this.f259016d = gVar;
        }

        /* renamed from: b */
        public final boolean mo1596b(int i, int i2, Intent intent) {
            C13598b0 b0Var;
            int i3;
            int i4 = i2;
            if (i != this.f259013a) {
                return false;
            }
            Log.m105925i("MicroMsg.WAGameJsApiScreenRecorderShare", "on result callback, result code: %d", Integer.valueOf(i2));
            if (i4 == -1) {
                Serializable serializableExtra = intent.getSerializableExtra("k_ext_data");
                if (serializableExtra != null) {
                    C88267e eVar = this.f259014b;
                    int i5 = this.f259015c;
                    C90211g gVar = this.f259016d;
                    HashMap hashMap = (HashMap) serializableExtra;
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry entry : ((Map) serializableExtra).entrySet()) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("optionKey", ((Number) entry.getKey()).intValue());
                        jSONObject2.put("errCode", ((WAGameRecordShareUI.ShareResult) entry.getValue()).f247024d);
                        jSONObject2.put("errMsg", ((WAGameRecordShareUI.ShareResult) entry.getValue()).f247025e);
                        jSONArray.put(jSONObject2);
                    }
                    jSONObject.put("shareResult", jSONArray);
                    gVar.getClass();
                    if (BuildInfo.DEBUG) {
                        i3 = 0;
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                    } else {
                        i3 = 0;
                    }
                    try {
                        jSONObject.put("errno", i3);
                    } catch (Exception e) {
                        Exception exc = e;
                        Object[] objArr = new Object[1];
                        objArr[i3] = exc;
                        Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", objArr);
                    }
                    eVar.mo109647a(i5, gVar.mo115115p("ok", jSONObject));
                    b0Var = C13598b0.f38549a;
                } else {
                    b0Var = null;
                }
                if (b0Var == null) {
                    C90211g gVar2 = this.f259016d;
                    C88267e eVar2 = this.f259014b;
                    int i6 = this.f259015c;
                    gVar2.getClass();
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        jSONObject3.put("errno", 4);
                    } catch (Exception e2) {
                        Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
                    }
                    eVar2.mo109647a(i6, gVar2.mo115115p("fail:internal error", jSONObject3));
                    return true;
                }
            } else if (i4 != 0) {
                this.f259016d.mo124448z(this.f259014b, this.f259015c, 1, 804, "share video failed!");
            } else {
                Log.m105924i("MicroMsg.WAGameJsApiScreenRecorderShare", "user cancelled share!");
                HashMap hashMap2 = new HashMap(1);
                hashMap2.put("errCode", 803);
                this.f259014b.mo109647a(this.f259015c, this.f259016d.mo115112m("fail: user cancelled", hashMap2));
            }
            return true;
        }
    }

    /* renamed from: sj0.g$c */
    public static final class C90214c extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ArrayList<Integer> f259017d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C90214c(ArrayList<Integer> arrayList) {
            super(1);
            this.f259017d = arrayList;
        }

        public Object invoke(Object obj) {
            this.f259017d.add(Integer.valueOf(((Number) obj).intValue()));
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0064, code lost:
        r11 = (r11 = r11.f244577X).getOrientationHandler();
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo124447A(kr0.C88267e r21, int r22, sj0.C90203b.C90205b r23, java.lang.String r24, org.json.JSONArray r25, xj0.C91237o.C91242e r26, org.json.JSONObject r27) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            r3 = r22
            r0 = r23
            r4 = r25
            r5 = r27
            java.lang.String r6 = ""
            java.lang.String r7 = "env"
            gy3.C87412m.m108594g(r2, r7)
            java.lang.String r7 = "editSrc"
            gy3.C87412m.m108594g(r0, r7)
            java.lang.String r7 = "title"
            r8 = r24
            gy3.C87412m.m108594g(r8, r7)
            java.lang.String r8 = "shareOptions"
            gy3.C87412m.m108594g(r4, r8)
            java.lang.String r8 = "data"
            r9 = r26
            gy3.C87412m.m108594g(r9, r8)
            java.lang.String r8 = "jsonObject"
            gy3.C87412m.m108594g(r5, r8)
            java.lang.String r8 = "MicroMsg.WAGameJsApiScreenRecorderShare"
            java.lang.String r9 = "startEdit"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            int r9 = p170ic.C87687a.m109085a(r20)
            android.app.Activity r10 = r21.mo114344o0()
            if (r10 != 0) goto L_0x004e
            java.lang.String r0 = "fail:internal error invalid android context"
            java.lang.String r0 = r1.mo115109j(r0)
            r2.mo109647a(r3, r0)
            return
        L_0x004e:
            rc.g r11 = p225rc.C89916g.m112446a(r10)
            sj0.g$b r12 = new sj0.g$b
            r12.<init>(r9, r2, r3, r1)
            r11.mo124232f(r12)
            com.tencent.mm.plugin.appbrand.page.t1 r11 = r21.mo114341l0()
            if (r11 == 0) goto L_0x006f
            br0.c r11 = r11.f244577X
            if (r11 == 0) goto L_0x006f
            br0.e r11 = r11.getOrientationHandler()
            if (r11 == 0) goto L_0x006f
            br0.e$b r11 = r11.mo109917a()
            goto L_0x0070
        L_0x006f:
            r11 = 0
        L_0x0070:
            r13 = -1
            if (r11 != 0) goto L_0x0075
            r11 = -1
            goto L_0x007d
        L_0x0075:
            int[] r14 = sj0.C90211g.C90212a.f259012a
            int r11 = r11.ordinal()
            r11 = r14[r11]
        L_0x007d:
            r15 = 2
            r14 = 1
            if (r11 == r13) goto L_0x008b
            if (r11 == r14) goto L_0x0088
            if (r11 == r15) goto L_0x0088
            java.lang.Class<com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareLandscapeUI> r11 = com.tencent.p014mm.plugin.appbrand.p026ui.record.WAGameRecordShareLandscapeUI.class
            goto L_0x008c
        L_0x0088:
            java.lang.Class<com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI> r11 = com.tencent.p014mm.plugin.appbrand.p026ui.record.WAGameRecordShareUI.class
            goto L_0x008c
        L_0x008b:
            r11 = 0
        L_0x008c:
            java.lang.String r13 = "makeReturnJson with JSONObject, put errno, e=%s"
            java.lang.String r14 = "errno"
            java.lang.String r15 = "makeReturnJson, errno: %d, reason: %s"
            java.lang.String r12 = "MicroMsg.AppBrandJsApi"
            r17 = r9
            java.lang.String r9 = "fail:internal error"
            r18 = r7
            if (r11 == 0) goto L_0x01b0
            android.content.Intent r7 = new android.content.Intent
            r7.<init>(r10, r11)
            java.lang.String r0 = r0.f258967a
            java.lang.String r11 = "k_ext_absFilePath"
            r7.putExtra(r11, r0)
            java.lang.String r0 = r21.getAppId()
            java.lang.String r11 = "k_ext_appid"
            r7.putExtra(r11, r0)
            java.lang.String r0 = "configJson"
            java.lang.String r0 = r5.optString(r0)
            java.lang.String r11 = "k_ext_configJson"
            r7.putExtra(r11, r0)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            sj0.g$c r0 = new sj0.g$c     // Catch:{ JSONException -> 0x00cd }
            r0.<init>(r11)     // Catch:{ JSONException -> 0x00cd }
            p170ic.C87689c.m109089b(r4, r0)     // Catch:{ JSONException -> 0x00cd }
            r19 = r10
            r4 = 1
            goto L_0x010b
        L_0x00cd:
            r0 = move-exception
            r19 = r10
            r4 = 0
            java.lang.Object[] r10 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r6, r10)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            r4 = 2
            if (r0 == 0) goto L_0x00ed
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r8 = 4
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r16 = 0
            r0[r16] = r10
            r10 = 1
            r0[r10] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r15, r0)
            goto L_0x00ee
        L_0x00ed:
            r8 = 4
        L_0x00ee:
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            r10.put(r14, r8)     // Catch:{ Exception -> 0x00f8 }
            r4 = 1
            goto L_0x0104
        L_0x00f8:
            r0 = move-exception
            r8 = r0
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r16 = 0
            r0[r16] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r13, r0)
        L_0x0104:
            java.lang.String r0 = r1.mo115115p(r9, r10)
            r2.mo109647a(r3, r0)
        L_0x010b:
            java.lang.String r0 = "k_ext_share_options"
            r7.putIntegerArrayListExtra(r0, r11)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r21.getRuntime()
            if (r0 == 0) goto L_0x012a
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r21.getRuntime()
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r0 = r0.mo113213o1()
            if (r0 == 0) goto L_0x012a
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r21.getRuntime()
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r0 = r0.mo113213o1()
            java.lang.String r6 = r0.f261061d
        L_0x012a:
            java.lang.String r0 = "k_ext_appName"
            r7.putExtra(r0, r6)
            r6 = r18
            java.lang.String r0 = r5.optString(r6)
            java.lang.String r6 = "k_ext_share_title"
            r7.putExtra(r6, r0)
            java.lang.String r0 = "desc"
            java.lang.String r0 = r5.optString(r0)
            java.lang.String r6 = "k_ext_share_desc"
            r7.putExtra(r6, r0)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r21.getRuntime()
            if (r0 == 0) goto L_0x0154
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r0.mo113210l1()
            if (r0 == 0) goto L_0x0154
            int r0 = r0.f234802F
            goto L_0x0155
        L_0x0154:
            r0 = 0
        L_0x0155:
            java.lang.String r6 = "k_ext_app_version"
            r7.putExtra(r6, r0)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r21.getRuntime()
            if (r0 == 0) goto L_0x0169
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r0.mo113210l1()
            if (r0 == 0) goto L_0x0169
            int r0 = r0.f239365g
            goto L_0x016a
        L_0x0169:
            r0 = 0
        L_0x016a:
            java.lang.String r6 = "k_ext_app_version_type"
            r7.putExtra(r6, r0)
            java.lang.String r0 = "isDevRequestEdit"
            r6 = 0
            int r0 = r5.optInt(r0, r6)
            java.lang.String r5 = "k_ext_is_dev_edited"
            r7.putExtra(r5, r0)
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r17)
            r0.mo10233c(r5)
            r0.mo10233c(r7)
            java.lang.Object[] r11 = r0.mo10232b()
            java.lang.String r0 = "com/tencent/mm/plugin/appbrand/game/jsapi/screenrecorder/WAGameJsApiScreenRecorderShare"
            java.lang.String r5 = "startEdit"
            java.lang.String r6 = "(Lcom/tencent/mm/plugin/appbrand/service/AppBrandServiceWC;ILcom/tencent/mm/plugin/appbrand/game/jsapi/screenrecorder/WAGameJsApiScreenRecorderBase$WxaFile;Ljava/lang/String;Lorg/json/JSONArray;Lcom/tencent/mm/plugin/appbrand/game/screenrecorder/GameRecorderMgr$RemuxResult;Lorg/json/JSONObject;)V"
            java.lang.String r7 = "android/app/Activity"
            java.lang.String r16 = "startActivityForResult"
            java.lang.String r17 = "(Landroid/content/Intent;I)V"
            r10 = r19
            r8 = r12
            r12 = r0
            r4 = r13
            r13 = r5
            r5 = r14
            r2 = 1
            r14 = r6
            r6 = r15
            r2 = 2
            r15 = r7
            j20.C117292a.m165364j(r10, r11, r12, r13, r14, r15, r16, r17)
            rx3.b0 r12 = rx3.C13598b0.f38549a
            goto L_0x01b6
        L_0x01b0:
            r8 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r2 = 2
            r12 = 0
        L_0x01b6:
            if (r12 != 0) goto L_0x01eb
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x01cd
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r2 = 4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r10 = 0
            r0[r10] = r7
            r7 = 1
            r0[r7] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r6, r0)
            goto L_0x01ce
        L_0x01cd:
            r2 = 4
        L_0x01ce:
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            r6.put(r5, r2)     // Catch:{ Exception -> 0x01d7 }
            goto L_0x01e2
        L_0x01d7:
            r0 = move-exception
            r2 = r0
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r5 = 0
            r0[r5] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r4, r0)
        L_0x01e2:
            java.lang.String r0 = r1.mo115115p(r9, r6)
            r2 = r21
            r2.mo109647a(r3, r0)
        L_0x01eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sj0.C90211g.mo124447A(kr0.e, int, sj0.b$b, java.lang.String, org.json.JSONArray, xj0.o$e, org.json.JSONObject):void");
    }
}
