package tm0;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.net.wifi.WifiManager;
import br0.C79774c;
import bt0.C79811f;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82644m7;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.utils.C84752i2;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.LocationUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.Map;
import js0.C88020k;
import p225rc.C89922k;
import p225rc.C89923l;
import p918s2.C77604h;

/* renamed from: tm0.r */
public class C90551r<C extends C81879g> extends C90549p<C> {
    public static final int CTRL_INDEX = 40;
    public static final String NAME = "getSystemInfo";

    public C90551r() {
        super(new C14018d());
    }

    /* renamed from: A */
    public static void m113379A(Map<String, Object> map, C81879g gVar, int i, int i2) {
        HashMap hashMap = new HashMap(6);
        Rect safeAreaInsets = gVar.mo114271f0().getSafeAreaInsets();
        if (safeAreaInsets != null) {
            int f = C88020k.m109555f(safeAreaInsets.left);
            int f2 = C88020k.m109555f(safeAreaInsets.top);
            int f3 = C88020k.m109555f(Math.min(safeAreaInsets.right, i));
            int f4 = C88020k.m109555f(Math.min(safeAreaInsets.bottom, i2));
            hashMap.put("left", Integer.valueOf(f));
            hashMap.put("top", Integer.valueOf(f2));
            hashMap.put("right", Integer.valueOf(f3));
            hashMap.put("bottom", Integer.valueOf(f4));
            hashMap.put("width", Integer.valueOf(f3 - f));
            hashMap.put("height", Integer.valueOf(f4 - f2));
            map.put("safeArea", hashMap);
        }
    }

    /* renamed from: y */
    public static int m113380y(C81879g gVar) {
        C79811f fVar;
        int drawnStatusBarHeight;
        C83780d1 a = C82644m7.m101430a(gVar);
        if (a != null && (fVar = a.f244553E) != null && (drawnStatusBarHeight = fVar.getDrawnStatusBarHeight()) != 0) {
            return drawnStatusBarHeight;
        }
        C79774c.C79777c statusBar = gVar.mo114271f0().getStatusBar();
        Log.m105921e("Luggage.FULL.JsApiGetSystemInfoLU", "getIntersectStatusBarHeight with component(%s %s), use windowStatusBar[%s]", gVar.getAppId(), gVar.getClass().getName(), statusBar);
        if (statusBar != null) {
            return statusBar.f233795a;
        }
        return 0;
    }

    /* renamed from: z */
    public static void m113381z(Map<String, Object> map, C81879g gVar) {
        C90537f fVar = (C90537f) gVar.mo109668l(C90537f.class);
        float rX = fVar == null ? 1.0f : fVar.mo115831rX();
        map.put("fontSizeSetting", Integer.valueOf(Math.round(16.0f * rX)));
        map.put("fontSizeScaleFactor", Float.valueOf(rX));
    }

    /* renamed from: w */
    public void mo124683w(C c, Map<String, Object> map) {
    }

    /* renamed from: x */
    public Map<String, Object> mo121609v(C c) {
        C c2 = c;
        Map<String, Object> v = super.mo121609v(c);
        int[] c3 = C84752i2.m104415c(c);
        HashMap hashMap = (HashMap) v;
        hashMap.put("windowWidth", Integer.valueOf(C88020k.m109555f(c3[0])));
        hashMap.put("windowHeight", Integer.valueOf(C88020k.m109555f(c3[1])));
        int[] a = C84752i2.m104413a(c);
        int i = a[0];
        int i2 = a[1];
        hashMap.put("screenWidth", Integer.valueOf(C88020k.m109555f(i)));
        hashMap.put("screenHeight", Integer.valueOf(C88020k.m109555f(i2)));
        hashMap.put("pixelRatio", Float.valueOf(C88020k.m109556g()));
        hashMap.put("statusBarHeight", Integer.valueOf(C88020k.m109555f(m113380y(c))));
        hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, LocaleUtil.getCurrentLanguage(c.getContext()));
        hashMap.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, ChannelUtil.formatVersion((Context) null, BuildInfo.CLIENT_VERSION_INT));
        if (!(c.getRuntime() == null || c.getRuntime().mo113051d0() == null)) {
            hashMap.put("benchmarkLevel", Integer.valueOf(((AppBrandSysConfigLU) c.getRuntime().mo113051d0()).f234887p0));
        }
        if (!(c.getRuntime() == null || c.getRuntime().mo113008F() == null || !c.getRuntime().mo113008F().mo113987f())) {
            hashMap.put("theme", C89923l.f258408a.mo117499e(c.getAppId()) ? "dark" : "light");
        }
        hashMap.put("screenTop", Integer.valueOf(C88020k.m109555f(C84752i2.m104414b(c))));
        int i3 = c.getContext().getResources().getConfiguration().orientation;
        if (2 == i3) {
            hashMap.put("deviceOrientation", "landscape");
        } else if (1 == i3) {
            hashMap.put("deviceOrientation", "portrait");
        }
        m113381z(v, c2);
        HashMap hashMap2 = new HashMap();
        Context context = c.getContext();
        if (context != null) {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            if (wifiManager != null) {
                hashMap2.put("wifiEnabled", Boolean.valueOf(wifiManager.isWifiEnabled()));
            } else {
                hashMap2.put("wifiEnabled", Boolean.FALSE);
            }
            hashMap2.put("notificationAuthorized", Boolean.valueOf(new C77604h(context).mo107781a()));
            hashMap2.put("locationEnabled", Boolean.valueOf(LocationUtil.isGpsEnable()));
            try {
                hashMap2.put("locationAuthorized", Boolean.valueOf(C89922k.m112465b(context, (C82381f) null, "android.permission.ACCESS_FINE_LOCATION")));
                hashMap2.put("cameraAuthorized", Boolean.valueOf(C89922k.m112465b(context, (C82381f) null, "android.permission.CAMERA")));
                hashMap2.put("microphoneAuthorized", Boolean.valueOf(C89922k.m112465b(context, (C82381f) null, "android.permission.RECORD_AUDIO")));
            } catch (Exception e) {
                Log.m105921e("Luggage.FULL.JsApiGetSystemInfoLU", "check permissions exception", e);
                Boolean bool = Boolean.FALSE;
                hashMap2.put("locationAuthorized", bool);
                hashMap2.put("cameraAuthorized", bool);
                hashMap2.put("microphoneAuthorized", bool);
            }
        } else {
            Boolean bool2 = Boolean.FALSE;
            hashMap2.put("wifiEnabled", bool2);
            hashMap2.put("notificationAuthorized", bool2);
            hashMap2.put("locationEnabled", bool2);
            hashMap2.put("locationAuthorized", bool2);
            hashMap2.put("cameraAuthorized", bool2);
            hashMap2.put("microphoneAuthorized", bool2);
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            hashMap2.put("bluetoothEnabled", Boolean.valueOf(defaultAdapter.isEnabled()));
        } else {
            hashMap2.put("bluetoothEnabled", Boolean.FALSE);
        }
        hashMap2.put("phoneCalendarAuthorized", Boolean.TRUE);
        Log.m105925i("Luggage.FULL.JsApiGetSystemInfoLU", "check permissions:%s", hashMap2);
        hashMap.putAll(hashMap2);
        m113379A(v, c2, i, i2);
        mo124683w(c2, v);
        return v;
    }

    public C90551r(C14018d<C> dVar) {
        super(dVar);
    }
}
