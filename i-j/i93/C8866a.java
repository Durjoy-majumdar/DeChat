package i93;

import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C1715u;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseImage;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82980n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: i93.a */
public class C8866a {

    /* renamed from: a */
    public static final Map<Integer, Integer> f28129a;

    /* renamed from: b */
    public static final Map<Integer, Integer> f28130b;

    /* renamed from: c */
    public static final Map<Integer, Integer> f28131c;

    /* renamed from: d */
    public static final Map<String, Integer> f28132d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(-1, 5);
        hashMap.put(-2, 6);
        hashMap.put(-3, 7);
        hashMap.put(-4, 8);
        hashMap.put(-5, 9);
        hashMap.put(-6, 10);
        hashMap.put(-7, 11);
        hashMap.put(-8, 12);
        hashMap.put(-9, 13);
        hashMap.put(-10, 14);
        hashMap.put(-11, 15);
        hashMap.put(-12, 16);
        hashMap.put(-13, 17);
        hashMap.put(-14, 18);
        hashMap.put(-15, 19);
        f28129a = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(-1, 4);
        hashMap2.put(-2, 5);
        hashMap2.put(-3, 6);
        hashMap2.put(-4, 7);
        hashMap2.put(-5, 8);
        hashMap2.put(-6, 9);
        f28130b = Collections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(0, 0);
        hashMap3.put(1, 1);
        hashMap3.put(2, 2);
        f28131c = Collections.unmodifiableMap(hashMap3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put("imagePreview", 2);
        hashMap4.put(Scopes.PROFILE, 3);
        hashMap4.put("addContact", 4);
        hashMap4.put(C82980n.NAME, 7);
        hashMap4.put("scanQRCode", 8);
        hashMap4.put("hideOptionMenu", 10);
        hashMap4.put("getBrandWCPayRequest", 11);
        hashMap4.put("editAddress", 12);
        hashMap4.put("getLatestAddress", 13);
        hashMap4.put("jumpWCMall", 14);
        hashMap4.put("geoLocation", 15);
        hashMap4.put("openProductView", 16);
        hashMap4.put("openProductViewWithPid", 16);
        hashMap4.put(C1715u.NAME, 17);
        hashMap4.put("hideMenuItems", 19);
        hashMap4.put(JsApiStartRecordVoice.NAME, 21);
        hashMap4.put(JsApiChooseImage.NAME, 22);
        hashMap4.put("scanCover", 23);
        hashMap4.put("openGameWebView", 28);
        f28132d = Collections.unmodifiableMap(hashMap4);
    }

    /* renamed from: a */
    public static int m8684a(int i) {
        Map<Integer, Integer> map = f28129a;
        Integer num = map.get(Integer.valueOf(i));
        if (num == null) {
            num = map.get(-1);
        }
        return num.intValue();
    }

    /* renamed from: b */
    public static int m8685b(long j) {
        if (j < 0) {
            return -1;
        }
        if (j <= 2000) {
            return 1;
        }
        if (j <= 6000) {
            return 2;
        }
        if (j <= 12000) {
            return 3;
        }
        return j <= 60000 ? 4 : 5;
    }

    /* renamed from: c */
    public static void m8686c(int i) {
        C115669n.INSTANCE.idkeyStat(1061, (long) i, 1, false);
    }
}
