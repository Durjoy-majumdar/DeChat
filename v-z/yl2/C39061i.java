package yl2;

import androidx.camera.camera2.internal.Camera2CameraImpl;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: yl2.i */
public final class C39061i {

    /* renamed from: a */
    public final String f105163a;

    /* renamed from: b */
    public final MultiProcessMMKV f105164b;

    /* renamed from: c */
    public final int f105165c = Camera2CameraImpl.StateCallback.CameraReopenMonitor.ACTIVE_REOPEN_LIMIT_MS;

    /* renamed from: d */
    public ArrayList<C39060h> f105166d = new ArrayList<>();

    /* renamed from: e */
    public final int f105167e = 3600000;

    /* renamed from: f */
    public final int f105168f = 28800000;

    /* renamed from: g */
    public final int f105169g = 17;

    public C39061i(String str, MultiProcessMMKV multiProcessMMKV) {
        C87412m.m108594g(str, "uin");
        C87412m.m108594g(multiProcessMMKV, "mmkv");
        this.f105163a = str;
        this.f105164b = multiProcessMMKV;
    }

    /* renamed from: a */
    public final long mo61909a() {
        long c = C31543z5.m39453c();
        return c - ((((long) TimeZone.getDefault().getRawOffset()) + c) % 86400000);
    }

    /* renamed from: b */
    public final String mo61910b() {
        JSONArray jSONArray = new JSONArray();
        for (C39060h hVar : this.f105166d) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("disable", hVar.f105161a);
            jSONObject.put("time", hVar.f105162b);
            jSONArray.put(jSONObject);
        }
        String jSONArray2 = jSONArray.toString();
        C87412m.m108593f(jSONArray2, "jsonArray.toString()");
        return jSONArray2;
    }
}
