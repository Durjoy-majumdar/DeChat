package no0;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.SyncTask;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.HashMap;
import java.util.Locale;
import js0.C88020k;
import k20.C60958c;
import k20.C9556a;
import ol0.C117844w;
import oo0.C117868b;
import oo0.C117869c;
import oo0.C117870d;
import oo0.C117871e;
import oo0.C117872f;
import oo0.C117873g;
import oo0.C117874h;
import oo0.C117875i;
import oo0.C89248j;
import org.json.JSONObject;
import p224ra.C89909e;
import p830xc.C91165a;
import p980id.C87695a;
import pl0.C118080q;
import pl0.C118114r;
import pl0.C118116u;
import pl0.C118117v;

/* renamed from: no0.b */
public class C89045b extends C87695a {

    /* renamed from: g */
    public MMHandler f256686g = new MMHandler(String.format(Locale.ENGLISH, "MapThread_%d", new Object[]{Integer.valueOf(this.f253971d)}));

    /* renamed from: h */
    public MMHandler f256687h = new MMHandler(Looper.getMainLooper());

    /* renamed from: i */
    public volatile Surface f256688i;

    /* renamed from: j */
    public volatile C118080q f256689j;

    /* renamed from: no0.b$a */
    public class C89046a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C82870p f256690d;

        /* renamed from: e */
        public final /* synthetic */ C82381f f256691e;

        /* renamed from: f */
        public final /* synthetic */ JSONObject f256692f;

        /* renamed from: g */
        public final /* synthetic */ int f256693g;

        /* renamed from: no0.b$a$a */
        public class C89047a extends SyncTask<Boolean> {
            public C89047a() {
            }

            public Object run() {
                C89045b bVar;
                C118080q qVar;
                C89046a aVar = C89046a.this;
                C89045b bVar2 = C89045b.this;
                C89248j jVar = (C89248j) aVar.f256690d;
                C82381f fVar = aVar.f256691e;
                JSONObject jSONObject = aVar.f256692f;
                Surface surface = bVar2.f256688i;
                jVar.getClass();
                Log.m105925i("MicroMsg.JsApiInsertXWebMap", "insertXwebMap:%s", jSONObject);
                double d = Util.getDouble(jSONObject.optString("centerLatitude"), 0.0d);
                double d2 = Util.getDouble(jSONObject.optString("centerLongitude"), 0.0d);
                float optDouble = (float) jSONObject.optDouble("scale", 16.0d);
                int optInt = jSONObject.optInt(FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, 0);
                int optInt2 = jSONObject.optInt("skew", 0);
                int i = (int) Util.getFloat(jSONObject.optString("maxScale"), 20.0f);
                int i2 = (int) Util.getFloat(jSONObject.optString("minScale"), 3.0f);
                if (Math.abs(d) > 90.0d || Math.abs(d2) > 180.0d) {
                    bVar = bVar2;
                    Log.m105918d("MicroMsg.JsApiInsertXWebMap", "centerLatitude or centerLongitude value is error!");
                } else {
                    String appId = fVar.getAppId();
                    bVar = bVar2;
                    C89248j jVar2 = jVar;
                    String optString = jSONObject.optString("theme", "");
                    float f = optDouble;
                    double d3 = d2;
                    String optString2 = jSONObject.optString("subKey", "");
                    String appId2 = fVar.getAppId();
                    double d4 = d;
                    String optString3 = jSONObject.optString("pluginId", "");
                    if (TextUtils.isEmpty(optString3)) {
                        optString3 = appId2;
                    }
                    int optInt3 = jSONObject.optInt("styleId", 0);
                    int i3 = optInt2;
                    boolean optBoolean = jSONObject.optBoolean("enableDarkMode", false);
                    int i4 = optInt;
                    boolean optBoolean2 = jSONObject.optBoolean("enableMSAA", false);
                    JSONObject optJSONObject = jSONObject.optJSONObject("position");
                    if (optJSONObject == null) {
                        Log.m105920e("MicroMsg.JsApiInsertXWebMap", "positionObj is null, err, return");
                    } else {
                        int i5 = i2;
                        int i6 = i;
                        int k = C88020k.m109560k(optJSONObject, "width", 0);
                        String str = appId;
                        int k2 = C88020k.m109560k(optJSONObject, "height", 0);
                        String b = C118116u.m166637b(fVar, jSONObject);
                        JSONObject jSONObject2 = jSONObject;
                        String str2 = "MicroMsg.JsApiInsertXWebMap";
                        HashMap hashMap = new HashMap(5);
                        hashMap.put("theme", optString);
                        hashMap.put("subKey", optString2);
                        hashMap.put("subId", optString3);
                        hashMap.put("styleId", Integer.valueOf(optInt3));
                        hashMap.put("surface", surface);
                        hashMap.put("width", Integer.valueOf(k));
                        hashMap.put("height", Integer.valueOf(k2));
                        hashMap.put("mapType", 2);
                        hashMap.put("enableDarkMode", Integer.valueOf(optBoolean ? 1 : 0));
                        hashMap.put("enableMSAA", Boolean.valueOf(optBoolean2));
                        qVar = ((C118114r) C89909e.m112436a(C118114r.class)).mo182359ao(fVar.getContext(), b, hashMap);
                        if (qVar == null) {
                            Log.m105920e(str2, "mapView is null, return");
                        } else {
                            JSONObject jSONObject3 = jSONObject2;
                            String str3 = str2;
                            if (!C118117v.m166645d(str, C118116u.m166637b(fVar, jSONObject3), qVar)) {
                                Log.m105920e(str3, "initMapView is false, return");
                            } else {
                                qVar.mo182826W(jSONObject3.optBoolean("enableZoom", true));
                                qVar.mo182830a(jSONObject3.optBoolean("enableScroll", true));
                                qVar.mo182822S(jSONObject3.optBoolean("enableRotate", false));
                                qVar.mo182834c0(jSONObject3.optBoolean("showCompass", false));
                                qVar.setBuilding3dEffectEnable(jSONObject3.optBoolean("enable3D", false));
                                qVar.mo182809K(jSONObject3.optBoolean("enableOverlooking", false));
                                qVar.enableAutoMaxOverlooking(jSONObject3.optBoolean("enableAutoMaxOverlooking", false));
                                qVar.mo182858l0(jSONObject3.optBoolean("enableSatellite", false));
                                qVar.mo182856k0(jSONObject3.optBoolean("enableIndoor", true));
                                qVar.enableIndoorLevelPick(jSONObject3.optBoolean("enableIndoorLevelPick", false));
                                qVar.mo182868p0(jSONObject3.optBoolean("showScale", true));
                                if (jSONObject3.has("enablePoi")) {
                                    qVar.setPoisEnabled(jSONObject3.optBoolean("enablePoi", true));
                                }
                                if (jSONObject3.has("enableBuilding")) {
                                    qVar.mo182887x(jSONObject3.optBoolean("enableBuilding", true));
                                }
                                qVar.setMaxZoomLevel(i6);
                                qVar.setMinZoomLevel(i5);
                                qVar.mo182795C(d4, d3, f, (float) i4, (float) i3);
                                View view = qVar.getView();
                                C9556a aVar2 = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar2.mo10233c(0);
                                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/jsapi/xwebplugin/map/jsapi/JsApiInsertXWebMap", C117844w.NAME, "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponent;Lorg/json/JSONObject;Landroid/view/Surface;)Lcom/tencent/mm/plugin/appbrand/jsapi/map/mapsdk/IMapView;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/jsapi/xwebplugin/map/jsapi/JsApiInsertXWebMap", C117844w.NAME, "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponent;Lorg/json/JSONObject;Landroid/view/Surface;)Lcom/tencent/mm/plugin/appbrand/jsapi/map/mapsdk/IMapView;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                int c = C118116u.m166638c(jSONObject3);
                                C89248j jVar3 = jVar2;
                                qVar.mo182832b0(new C117868b(jVar3, c, fVar));
                                qVar.mo182837e0(new C117869c(jVar3, c, fVar));
                                qVar.mo182889y(new C117870d(jVar3, c, fVar));
                                qVar.mo182870q0(new C117871e(jVar3, c, fVar));
                                qVar.mo182853j(new C117872f(jVar3, c, fVar));
                                qVar.mo182882t0(jSONObject3.optBoolean("showLocation"));
                                qVar.mo182820Q(new C117873g(jVar3, c, fVar, qVar));
                                qVar.mo182840f(new C117874h(jVar3, c, fVar));
                                qVar.mo182863o(new C117875i(jVar3, c, fVar));
                                bVar.f256689j = qVar;
                                return Boolean.FALSE;
                            }
                        }
                    }
                }
                qVar = null;
                bVar.f256689j = qVar;
                return Boolean.FALSE;
            }
        }

        public C89046a(C82870p pVar, C82381f fVar, JSONObject jSONObject, int i) {
            this.f256690d = pVar;
            this.f256691e = fVar;
            this.f256692f = jSONObject;
            this.f256693g = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:121:0x0323  */
        /* JADX WARNING: Removed duplicated region for block: B:122:0x0335  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r27 = this;
                r1 = r27
                com.tencent.mm.plugin.appbrand.jsapi.p r0 = r1.f256690d
                boolean r2 = r0 instanceof oo0.C89248j
                java.lang.String r3 = "ok"
                java.lang.String r4 = "MicroMsg.AppBrand.SameLayer.AppBrandMapPluginHandler"
                if (r2 == 0) goto L_0x0064
                no0.b r0 = no0.C89045b.this
                pl0.q r0 = r0.f256689j
                if (r0 == 0) goto L_0x0018
                java.lang.String r0 = "insert map view fail."
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
                return
            L_0x0018:
                r0 = 9
                pl0.C89367t.m111696a(r0)
                no0.b$a$a r0 = new no0.b$a$a
                r0.<init>()
                no0.b r2 = no0.C89045b.this
                com.tencent.mm.sdk.platformtools.MMHandler r2 = r2.f256687h
                r0.exec(r2)
                no0.b r0 = no0.C89045b.this
                com.tencent.mm.plugin.appbrand.jsapi.f r2 = r1.f256691e
                org.json.JSONObject r4 = r1.f256692f
                com.tencent.mm.plugin.appbrand.jsapi.p r5 = r1.f256690d
                int r6 = r1.f256693g
                r0.getClass()
                java.lang.String r3 = r5.mo115109j(r3)
                r2.mo109647a(r6, r3)
                r3 = 10
                pl0.C89367t.m111696a(r3)
                boolean r3 = r2 instanceof com.tencent.p014mm.plugin.appbrand.jsapi.C82520h
                if (r3 == 0) goto L_0x0061
                r3 = r2
                com.tencent.mm.plugin.appbrand.jsapi.h r3 = (com.tencent.p014mm.plugin.appbrand.jsapi.C82520h) r3
                no0.c r5 = new no0.c
                r5.<init>(r0)
                r3.mo114864j(r5)
                no0.d r5 = new no0.d
                r5.<init>(r0)
                r3.mo114868y(r5)
                no0.e r5 = new no0.e
                r5.<init>(r0, r3, r2, r4)
                r3.mo114865m(r5)
            L_0x0061:
                r2 = r1
                goto L_0x03c1
            L_0x0064:
                boolean r2 = r0 instanceof oo0.C89250l
                java.lang.String r5 = "data is null"
                java.lang.String r6 = "fail:internal error"
                r7 = 1
                r8 = 0
                if (r2 == 0) goto L_0x0355
                java.lang.String r0 = "Tummy update"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                r0 = 12
                pl0.C89367t.m111696a(r0)
                no0.b r0 = no0.C89045b.this
                com.tencent.mm.plugin.appbrand.jsapi.f r2 = r1.f256691e
                org.json.JSONObject r9 = r1.f256692f
                com.tencent.mm.plugin.appbrand.jsapi.p r10 = r1.f256690d
                int r11 = r1.f256693g
                java.lang.String r12 = "covers"
                pl0.q r0 = r0.f256689j
                if (r0 == 0) goto L_0x0338
                r0 = r10
                oo0.l r0 = (oo0.C89250l) r0
                r0.getClass()
                java.lang.String r13 = "MicroMsg.JsApiUpdateXWebMap"
                if (r9 != 0) goto L_0x0096
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r5)
                goto L_0x00b2
            L_0x0096:
                java.lang.String r0 = r2.getAppId()
                java.lang.Object[] r5 = new java.lang.Object[r7]
                r5[r8] = r9
                java.lang.String r14 = "data:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r14, r5)
                java.lang.String r5 = pl0.C118116u.m166637b(r2, r9)
                pl0.q r0 = pl0.C118117v.m166643b(r0, r5)
                if (r0 != 0) goto L_0x00be
                java.lang.String r0 = "mapView is null, return"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            L_0x00b2:
                r25 = r3
                r24 = r4
                r23 = r6
                r8 = r10
                r26 = r11
            L_0x00bb:
                r7 = 0
                goto L_0x0321
            L_0x00be:
                java.lang.String r5 = "position"
                boolean r14 = r9.has(r5)
                if (r14 == 0) goto L_0x00e8
                org.json.JSONObject r5 = r9.optJSONObject(r5)
                if (r5 == 0) goto L_0x00e8
                java.lang.String r14 = "width"
                boolean r15 = r5.has(r14)
                if (r15 == 0) goto L_0x00e8
                java.lang.String r15 = "height"
                boolean r16 = r5.has(r15)
                if (r16 == 0) goto L_0x00e8
                int r14 = js0.C88020k.m109560k(r5, r14, r8)
                int r5 = js0.C88020k.m109560k(r5, r15, r8)
                r0.mo182356b(r14, r5)
            L_0x00e8:
                java.lang.String r5 = "enableZoom"
                boolean r14 = r9.has(r5)
                if (r14 == 0) goto L_0x00f7
                boolean r5 = r9.optBoolean(r5, r7)
                r0.mo182826W(r5)
            L_0x00f7:
                java.lang.String r5 = "enableScroll"
                boolean r14 = r9.has(r5)
                if (r14 == 0) goto L_0x0106
                boolean r5 = r9.optBoolean(r5, r7)
                r0.mo182830a(r5)
            L_0x0106:
                java.lang.String r5 = "enableRotate"
                boolean r14 = r9.has(r5)
                if (r14 == 0) goto L_0x0115
                boolean r5 = r9.optBoolean(r5, r7)
                r0.mo182822S(r5)
            L_0x0115:
                java.lang.String r5 = "showCompass"
                boolean r14 = r9.has(r5)
                if (r14 == 0) goto L_0x0125
                boolean r5 = r9.optBoolean(r5, r8)
                r0.mo182834c0(r5)
            L_0x0125:
                java.lang.String r5 = "enable3D"
                boolean r14 = r9.has(r5)
                if (r14 == 0) goto L_0x0134
                boolean r5 = r9.optBoolean(r5, r8)
                r0.setBuilding3dEffectEnable(r5)
            L_0x0134:
                java.lang.String r5 = "enableOverlooking"
                boolean r14 = r9.has(r5)
                if (r14 == 0) goto L_0x0143
                boolean r5 = r9.optBoolean(r5, r8)
                r0.mo182809K(r5)
            L_0x0143:
                java.lang.String r5 = "enableAutoMaxOverlooking"
                boolean r14 = r9.has(r5)
                if (r14 == 0) goto L_0x0152
                boolean r5 = r9.optBoolean(r5, r8)
                r0.enableAutoMaxOverlooking(r5)
            L_0x0152:
                java.lang.String r5 = "enableSatellite"
                boolean r14 = r9.has(r5)
                if (r14 == 0) goto L_0x0161
                boolean r5 = r9.optBoolean(r5, r8)
                r0.mo182858l0(r5)
            L_0x0161:
                java.lang.String r5 = "enableTraffic"
                boolean r14 = r9.has(r5)
                if (r14 == 0) goto L_0x0170
                boolean r5 = r9.optBoolean(r5, r8)
                r0.mo182803H(r5)
            L_0x0170:
                java.lang.String r5 = "enableIndoor"
                boolean r14 = r9.has(r5)
                if (r14 == 0) goto L_0x017f
                boolean r5 = r9.optBoolean(r5, r8)
                r0.mo182856k0(r5)
            L_0x017f:
                java.lang.String r5 = "enableIndoorLevelPick"
                boolean r14 = r9.has(r5)
                if (r14 == 0) goto L_0x018e
                boolean r5 = r9.optBoolean(r5, r8)
                r0.enableIndoorLevelPick(r5)
            L_0x018e:
                java.lang.String r5 = "showLocation"
                boolean r14 = r9.has(r5)
                if (r14 == 0) goto L_0x019e
                boolean r5 = r9.optBoolean(r5, r8)
                r0.mo182882t0(r5)
            L_0x019e:
                java.lang.String r5 = "showScale"
                boolean r14 = r9.has(r5)
                if (r14 == 0) goto L_0x01ae
                boolean r5 = r9.optBoolean(r5, r7)
                r0.mo182868p0(r5)
            L_0x01ae:
                java.lang.String r5 = "styleId"
                boolean r14 = r9.has(r5)
                if (r14 == 0) goto L_0x01be
                int r5 = r9.optInt(r5, r8)
                r0.setMapStyle(r5)
            L_0x01be:
                java.lang.String r5 = "maxScale"
                boolean r14 = r9.has(r5)
                if (r14 == 0) goto L_0x01d4
                java.lang.String r5 = r9.optString(r5)
                r14 = 1101004800(0x41a00000, float:20.0)
                float r5 = com.tencent.p014mm.sdk.platformtools.Util.getFloat(r5, r14)
                int r5 = (int) r5
                r0.setMaxZoomLevel(r5)
            L_0x01d4:
                java.lang.String r5 = "minScale"
                boolean r14 = r9.has(r5)
                if (r14 == 0) goto L_0x01ea
                java.lang.String r5 = r9.optString(r5)
                r14 = 1077936128(0x40400000, float:3.0)
                float r5 = com.tencent.p014mm.sdk.platformtools.Util.getFloat(r5, r14)
                int r5 = (int) r5
                r0.setMinZoomLevel(r5)
            L_0x01ea:
                java.lang.String r5 = "enablePoi"
                boolean r14 = r9.has(r5)
                if (r14 == 0) goto L_0x01f9
                boolean r5 = r9.optBoolean(r5, r7)
                r0.setPoisEnabled(r5)
            L_0x01f9:
                java.lang.String r5 = "enableBuilding"
                boolean r14 = r9.has(r5)
                if (r14 == 0) goto L_0x0208
                boolean r5 = r9.optBoolean(r5, r7)
                r0.mo182887x(r5)
            L_0x0208:
                boolean r5 = r9.has(r12)     // Catch:{ Exception -> 0x030c }
                java.lang.String r14 = "rotate"
                if (r5 == 0) goto L_0x029c
                r0.mo182799F()     // Catch:{ Exception -> 0x030c }
                org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ Exception -> 0x030c }
                java.lang.String r12 = r9.optString(r12)     // Catch:{ Exception -> 0x030c }
                r5.<init>(r12)     // Catch:{ Exception -> 0x030c }
                r12 = 0
            L_0x021d:
                int r15 = r5.length()     // Catch:{ Exception -> 0x030c }
                if (r12 >= r15) goto L_0x029c
                java.lang.Object r15 = r5.get(r12)     // Catch:{ Exception -> 0x030c }
                org.json.JSONObject r15 = (org.json.JSONObject) r15     // Catch:{ Exception -> 0x030c }
                java.lang.String r8 = "latitude"
                java.lang.String r8 = r15.optString(r8)     // Catch:{ Exception -> 0x030c }
                r7 = 0
                float r8 = com.tencent.p014mm.sdk.platformtools.Util.getFloat(r8, r7)     // Catch:{ Exception -> 0x030c }
                java.lang.String r7 = "longitude"
                java.lang.String r7 = r15.optString(r7)     // Catch:{ Exception -> 0x030c }
                r18 = r5
                r5 = 0
                float r5 = com.tencent.p014mm.sdk.platformtools.Util.getFloat(r7, r5)     // Catch:{ Exception -> 0x030c }
                java.lang.Class<zi0.b> r7 = zi0.C91759b.class
                ra.b r7 = r2.mo109668l(r7)     // Catch:{ Exception -> 0x030c }
                zi0.b r7 = (zi0.C91759b) r7     // Catch:{ Exception -> 0x030c }
                java.lang.String r1 = "iconPath"
                java.lang.String r1 = r15.optString(r1)     // Catch:{ Exception -> 0x030c }
                java.lang.String r1 = r7.mo115838nO(r2, r1)     // Catch:{ Exception -> 0x030c }
                r23 = r6
                r6 = 0
                double r6 = r15.optDouble(r14, r6)     // Catch:{ Exception -> 0x0292 }
                float r6 = (float) r6     // Catch:{ Exception -> 0x0292 }
                pl0.q$d r7 = new pl0.q$d     // Catch:{ Exception -> 0x0292 }
                r7.<init>()     // Catch:{ Exception -> 0x0292 }
                r25 = r3
                r24 = r4
                double r3 = (double) r8
                r8 = r10
                r26 = r11
                double r10 = (double) r5
                r7.f353001a = r3     // Catch:{ Exception -> 0x028f }
                r7.f353002b = r10     // Catch:{ Exception -> 0x028f }
                r7.f353003c = r1     // Catch:{ Exception -> 0x028f }
                r7.f353004d = r6     // Catch:{ Exception -> 0x028f }
                java.lang.Class<zi0.a> r1 = zi0.C91755a.class
                ra.b r1 = r2.mo109668l(r1)     // Catch:{ Exception -> 0x028f }
                zi0.a r1 = (zi0.C91755a) r1     // Catch:{ Exception -> 0x028f }
                r0.mo182854j0(r7, r1)     // Catch:{ Exception -> 0x028f }
                int r12 = r12 + 1
                r1 = r27
                r10 = r8
                r5 = r18
                r6 = r23
                r4 = r24
                r3 = r25
                r11 = r26
                r7 = 1
                r8 = 0
                goto L_0x021d
            L_0x028f:
                r0 = move-exception
                goto L_0x0314
            L_0x0292:
                r0 = move-exception
                r25 = r3
                r24 = r4
            L_0x0297:
                r8 = r10
                r26 = r11
                goto L_0x0314
            L_0x029c:
                r25 = r3
                r24 = r4
                r23 = r6
                r8 = r10
                r26 = r11
                java.lang.String r1 = "scale"
                boolean r3 = r9.has(r1)
                java.lang.String r4 = "centerLongitude"
                java.lang.String r5 = "centerLatitude"
                java.lang.String r6 = "skew"
                if (r3 != 0) goto L_0x02cc
                boolean r3 = r9.has(r14)
                if (r3 != 0) goto L_0x02cc
                boolean r3 = r9.has(r6)
                if (r3 != 0) goto L_0x02cc
                boolean r3 = r9.has(r5)
                if (r3 != 0) goto L_0x02cc
                boolean r3 = r9.has(r4)
                if (r3 == 0) goto L_0x030a
            L_0x02cc:
                r10 = -4616189618054758400(0xbff0000000000000, double:-1.0)
                double r12 = r9.optDouble(r1, r10)
                float r1 = (float) r12
                double r12 = r9.optDouble(r14, r10)
                float r3 = (float) r12
                double r6 = r9.optDouble(r6, r10)
                float r6 = (float) r6
                java.lang.String r7 = "-1"
                java.lang.String r5 = r9.optString(r5, r7)
                double r15 = com.tencent.p014mm.sdk.platformtools.Util.getDouble(r5, r10)
                java.lang.String r4 = r9.optString(r4, r7)
                double r17 = com.tencent.p014mm.sdk.platformtools.Util.getDouble(r4, r10)
                r19 = -1082130432(0xffffffffbf800000, float:-1.0)
                r20 = -1082130432(0xffffffffbf800000, float:-1.0)
                r21 = -1082130432(0xffffffffbf800000, float:-1.0)
                r22 = 0
                r14 = r0
                r14.mo182796D(r15, r17, r19, r20, r21, r22)
                r15 = -4616189618054758400(0xbff0000000000000, double:-1.0)
                r17 = -4616189618054758400(0xbff0000000000000, double:-1.0)
                r22 = 1
                r19 = r1
                r20 = r3
                r21 = r6
                r14.mo182796D(r15, r17, r19, r20, r21, r22)
            L_0x030a:
                r7 = 1
                goto L_0x0321
            L_0x030c:
                r0 = move-exception
                r25 = r3
                r24 = r4
                r23 = r6
                goto L_0x0297
            L_0x0314:
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r3 = 0
                r1[r3] = r0
                java.lang.String r0 = "parse covers error, exception : %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r0, r1)
                goto L_0x00bb
            L_0x0321:
                if (r7 == 0) goto L_0x0335
                r1 = r25
                java.lang.String r0 = r8.mo115109j(r1)
                r1 = r26
                r2.mo109647a(r1, r0)
                r0 = 13
                pl0.C89367t.m111696a(r0)
                goto L_0x03bf
            L_0x0335:
                r1 = r26
                goto L_0x033e
            L_0x0338:
                r24 = r4
                r23 = r6
                r8 = r10
                r1 = r11
            L_0x033e:
                java.lang.String r0 = "update fail"
                r3 = r24
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
                r0 = 14
                pl0.C89367t.m111696a(r0)
                r4 = r23
                java.lang.String r0 = r8.mo115109j(r4)
                r2.mo109647a(r1, r0)
                goto L_0x03bf
            L_0x0355:
                r1 = r3
                r3 = r4
                r4 = r6
                boolean r0 = r0 instanceof oo0.C89249k
                if (r0 == 0) goto L_0x03bf
                r0 = 15
                pl0.C89367t.m111696a(r0)
                r2 = r27
                no0.b r0 = no0.C89045b.this
                com.tencent.mm.plugin.appbrand.jsapi.f r6 = r2.f256691e
                org.json.JSONObject r7 = r2.f256692f
                com.tencent.mm.plugin.appbrand.jsapi.p r8 = r2.f256690d
                int r9 = r2.f256693g
                r0.getClass()
                r10 = r8
                oo0.k r10 = (oo0.C89249k) r10
                r10.getClass()
                java.lang.String r10 = "MicroMsg.JsApiRemoveXWebMap"
                if (r7 != 0) goto L_0x037f
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r5)
                r7 = 0
                goto L_0x0396
            L_0x037f:
                r5 = 1
                java.lang.Object[] r11 = new java.lang.Object[r5]
                r12 = 0
                r11[r12] = r7
                java.lang.String r12 = "removeXWebMap:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r12, r11)
                java.lang.String r10 = r6.getAppId()
                java.lang.String r7 = pl0.C118116u.m166637b(r6, r7)
                pl0.C118117v.m166642a(r10, r7)
                r7 = 1
            L_0x0396:
                if (r7 == 0) goto L_0x03a8
                java.lang.String r1 = r8.mo115109j(r1)
                r6.mo109647a(r9, r1)
                r1 = 0
                r0.f256689j = r1
                r1 = 16
                pl0.C89367t.m111696a(r1)
                goto L_0x03b9
            L_0x03a8:
                java.lang.String r1 = "remove fail"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)
                r1 = 17
                pl0.C89367t.m111696a(r1)
                java.lang.String r1 = r8.mo115109j(r4)
                r6.mo109647a(r9, r1)
            L_0x03b9:
                com.tencent.mm.sdk.platformtools.MMHandler r0 = r0.f256686g
                r0.quitSafely()
                goto L_0x03c1
            L_0x03bf:
                r2 = r27
            L_0x03c1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: no0.C89045b.C89046a.run():void");
        }
    }

    /* renamed from: f */
    public void mo110220f(MotionEvent motionEvent) {
        if (this.f256689j != null) {
            this.f256689j.onTouchEvent(motionEvent);
        }
    }

    /* renamed from: h */
    public void mo17968h(Surface surface) {
        Log.m105925i("MicroMsg.AppBrand.SameLayer.AppBrandMapPluginHandler", "handlePluginReady %d", Integer.valueOf(this.f253971d));
        this.f256688i = surface;
        this.f256686g.post(new C89044a(this));
    }

    /* renamed from: i */
    public String mo17969i(C91165a aVar) {
        if (!(aVar instanceof C81823b)) {
            return null;
        }
        C81823b bVar = (C81823b) aVar;
        C82381f g = bVar.mo62544g();
        C82870p pVar = bVar.f240072c;
        JSONObject jSONObject = bVar.f240071b;
        int i = bVar.f240070a;
        Log.m105925i("MicroMsg.AppBrand.SameLayer.AppBrandMapPluginHandler", "*** handler(%s) handleJsApi(%s), data:%s", mo122122p(), pVar.mo114779e(), jSONObject.toString());
        C89046a aVar2 = new C89046a(pVar, g, jSONObject, i);
        if (this.f256686g.getLooper() == Looper.myLooper()) {
            aVar2.run();
            return null;
        }
        this.f256686g.post(aVar2);
        return null;
    }

    /* renamed from: j */
    public void mo17970j(SurfaceTexture surfaceTexture) {
        mo17968h(new Surface(surfaceTexture));
    }

    /* renamed from: m */
    public void mo17971m() {
        Log.m105925i("MicroMsg.AppBrand.SameLayer.AppBrandMapPluginHandler", "handlePluginDestroy %d", Integer.valueOf(this.f253971d));
        if (this.f256688i != null) {
            this.f256688i.release();
            this.f256688i = null;
        }
    }

    /* renamed from: n */
    public boolean mo17972n(C91165a aVar) {
        return true;
    }
}
