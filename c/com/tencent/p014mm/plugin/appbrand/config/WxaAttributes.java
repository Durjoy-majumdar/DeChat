package com.tencent.p014mm.plugin.appbrand.config;

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import or3.C89286a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p749xh.C91206ia;
import te3.p65;
import u24.C90595a;
import wi0.C15407h0;

/* renamed from: com.tencent.mm.plugin.appbrand.config.WxaAttributes */
public final class WxaAttributes extends C91206ia {

    /* renamed from: W0 */
    public static final IAutoDBItem.MAutoDBInfo f239430W0 = C91206ia.initAutoDBInfo(C91206ia.class);

    /* renamed from: R0 */
    public C81628a f239431R0;

    /* renamed from: S0 */
    public C81629c f239432S0;

    /* renamed from: T0 */
    public WxaVersionInfo f239433T0;

    /* renamed from: U0 */
    public List<WxaEntryInfo> f239434U0 = null;

    /* renamed from: V0 */
    public C68591b f239435V0;

    /* renamed from: com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo */
    public static final class WxaEntryInfo implements Parcelable {
        public static final Parcelable.Creator<WxaEntryInfo> CREATOR = new C40436a();

        /* renamed from: d */
        public String f108666d;

        /* renamed from: e */
        public String f108667e;

        /* renamed from: f */
        public String f108668f;

        /* renamed from: g */
        public String f108669g;

        /* renamed from: com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo$a */
        public class C40436a implements Parcelable.Creator<WxaEntryInfo> {
            public Object createFromParcel(Parcel parcel) {
                return new WxaEntryInfo(parcel);
            }

            public Object[] newArray(int i) {
                return new WxaEntryInfo[i];
            }
        }

        public WxaEntryInfo() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f108666d);
            parcel.writeString(this.f108667e);
            parcel.writeString(this.f108668f);
            parcel.writeString(this.f108669g);
        }

        public WxaEntryInfo(Parcel parcel) {
            this.f108666d = parcel.readString();
            this.f108667e = parcel.readString();
            this.f108668f = parcel.readString();
            this.f108669g = parcel.readString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.WxaAttributes$b */
    public static final class C68591b {

        /* renamed from: a */
        public List<C68592a> f197028a;

        /* renamed from: com.tencent.mm.plugin.appbrand.config.WxaAttributes$b$a */
        public static final class C68592a {

            /* renamed from: a */
            public String f197029a;

            /* renamed from: b */
            public String f197030b;

            /* renamed from: c */
            public int f197031c;

            /* renamed from: d */
            public List<C68592a> f197032d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionCoverImageInfo */
    public static final class WxaVersionCoverImageInfo implements Parcelable {
        public static final Parcelable.Creator<WxaVersionCoverImageInfo> CREATOR = new C81624a();

        /* renamed from: d */
        public String f239446d;

        /* renamed from: e */
        public String f239447e;

        /* renamed from: com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionCoverImageInfo$a */
        public class C81624a implements Parcelable.Creator<WxaVersionCoverImageInfo> {
            public Object createFromParcel(Parcel parcel) {
                return new WxaVersionCoverImageInfo(parcel);
            }

            public Object[] newArray(int i) {
                return new WxaVersionCoverImageInfo[i];
            }
        }

        public WxaVersionCoverImageInfo() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f239446d);
            parcel.writeString(this.f239447e);
        }

        public WxaVersionCoverImageInfo(Parcel parcel) {
            this.f239446d = parcel.readString();
            this.f239447e = parcel.readString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo */
    public static class WxaVersionModuleInfo implements Parcelable {
        public static final Parcelable.Creator<WxaVersionModuleInfo> CREATOR = new C81626a();

        /* renamed from: d */
        public String f239472d;

        /* renamed from: e */
        public String f239473e;

        /* renamed from: f */
        public boolean f239474f;

        /* renamed from: g */
        public int f239475g;

        /* renamed from: h */
        public String[] f239476h;

        /* renamed from: i */
        public List<WxaPluginCodeInfo> f239477i;

        /* renamed from: j */
        public String f239478j;

        /* renamed from: n */
        public List<WxaWidgetInfo> f239479n;

        /* renamed from: o */
        public boolean f239480o;

        /* renamed from: p */
        public boolean f239481p;

        /* renamed from: com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo$a */
        public class C81626a implements Parcelable.Creator<WxaVersionModuleInfo> {
            public Object createFromParcel(Parcel parcel) {
                return new WxaVersionModuleInfo(parcel);
            }

            public Object[] newArray(int i) {
                return new WxaVersionModuleInfo[i];
            }
        }

        public WxaVersionModuleInfo() {
        }

        /* renamed from: a */
        public static List<WxaVersionModuleInfo> m100126a(String str) {
            if (Util.isNullOrNil(str)) {
                return null;
            }
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() <= 0) {
                    return null;
                }
                return m100127b(jSONArray);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.AppBrand.WxaAttributes.WxaVersionModuleInfo", "parse json array, json = %s, e = %s", str, e);
                return null;
            }
        }

        /* renamed from: b */
        public static List<WxaVersionModuleInfo> m100127b(JSONArray jSONArray) {
            String[] strArr;
            if (jSONArray == null) {
                return null;
            }
            try {
                LinkedList linkedList = new LinkedList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject != null) {
                        WxaVersionModuleInfo wxaVersionModuleInfo = new WxaVersionModuleInfo();
                        wxaVersionModuleInfo.f239472d = jSONObject.getString("name");
                        if (jSONObject.has("md5")) {
                            wxaVersionModuleInfo.f239473e = jSONObject.getString("md5");
                        } else if (jSONObject.has("checkSumMd5")) {
                            wxaVersionModuleInfo.f239473e = jSONObject.getString("checkSumMd5");
                        }
                        wxaVersionModuleInfo.f239475g = jSONObject.optInt("size", 0);
                        wxaVersionModuleInfo.f239474f = jSONObject.optBoolean("independent", false);
                        JSONArray optJSONArray = jSONObject.optJSONArray("alias");
                        if (optJSONArray != null) {
                            if (optJSONArray.length() > 0) {
                                strArr = new String[optJSONArray.length()];
                                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                    strArr[i2] = optJSONArray.optString(i2);
                                }
                                wxaVersionModuleInfo.f239476h = strArr;
                                wxaVersionModuleInfo.f239478j = jSONObject.optString("without_lib_md5");
                                List<WxaWidgetInfo> b = WxaWidgetInfo.m100129b(jSONObject.optJSONArray("widget_list"));
                                wxaVersionModuleInfo.f239479n = b;
                                wxaVersionModuleInfo.f239477i = WxaPluginCodeInfo.m100124b(b, jSONObject.opt("separated_plugin_list"), 23);
                                wxaVersionModuleInfo.f239480o = jSONObject.optBoolean("brotli", false);
                                wxaVersionModuleInfo.f239481p = jSONObject.optBoolean("parallelDownloadOnLaunchStage", false);
                                linkedList.add(wxaVersionModuleInfo);
                            }
                        }
                        strArr = new String[0];
                        wxaVersionModuleInfo.f239476h = strArr;
                        wxaVersionModuleInfo.f239478j = jSONObject.optString("without_lib_md5");
                        List<WxaWidgetInfo> b2 = WxaWidgetInfo.m100129b(jSONObject.optJSONArray("widget_list"));
                        wxaVersionModuleInfo.f239479n = b2;
                        wxaVersionModuleInfo.f239477i = WxaPluginCodeInfo.m100124b(b2, jSONObject.opt("separated_plugin_list"), 23);
                        wxaVersionModuleInfo.f239480o = jSONObject.optBoolean("brotli", false);
                        wxaVersionModuleInfo.f239481p = jSONObject.optBoolean("parallelDownloadOnLaunchStage", false);
                        linkedList.add(wxaVersionModuleInfo);
                    }
                }
                return linkedList;
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.AppBrand.WxaAttributes.WxaVersionModuleInfo", "parse json array, e = %s", e);
                return null;
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f239472d);
            parcel.writeString(this.f239473e);
            parcel.writeByte(this.f239474f ? (byte) 1 : 0);
            parcel.writeInt(this.f239475g);
            parcel.writeStringArray(this.f239476h);
            parcel.writeTypedList(this.f239477i);
            parcel.writeString(this.f239478j);
            parcel.writeTypedList(this.f239479n);
            parcel.writeByte(this.f239480o ? (byte) 1 : 0);
            parcel.writeByte(this.f239481p ? (byte) 1 : 0);
        }

        public WxaVersionModuleInfo(Parcel parcel) {
            this.f239472d = parcel.readString();
            this.f239473e = parcel.readString();
            boolean z = true;
            this.f239474f = parcel.readByte() != 0;
            this.f239475g = parcel.readInt();
            this.f239476h = parcel.createStringArray();
            this.f239477i = parcel.createTypedArrayList(WxaPluginCodeInfo.CREATOR);
            this.f239478j = parcel.readString();
            this.f239479n = parcel.createTypedArrayList(WxaWidgetInfo.CREATOR);
            this.f239480o = parcel.readByte() != 0;
            this.f239481p = parcel.readByte() == 0 ? false : z;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo */
    public static class WxaWidgetInfo implements Parcelable {
        public static final Parcelable.Creator<WxaWidgetInfo> CREATOR = new C81627a();

        /* renamed from: d */
        public int f239482d;

        /* renamed from: e */
        public String f239483e;

        /* renamed from: f */
        public List<WxaPluginCodeInfo> f239484f;

        /* renamed from: com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo$a */
        public class C81627a implements Parcelable.Creator<WxaWidgetInfo> {
            public Object createFromParcel(Parcel parcel) {
                return new WxaWidgetInfo(parcel);
            }

            public Object[] newArray(int i) {
                return new WxaWidgetInfo[i];
            }
        }

        public WxaWidgetInfo() {
        }

        /* renamed from: a */
        public static List<WxaWidgetInfo> m100128a(String str) {
            if (Util.isNullOrNil(str)) {
                return null;
            }
            try {
                return m100129b(new JSONArray(str));
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.AppBrand.WxaAttributes.WxaPluginCodeInfo", "parse json array, e = %s", e);
                return null;
            }
        }

        /* renamed from: b */
        public static List<WxaWidgetInfo> m100129b(JSONArray jSONArray) {
            if (jSONArray != null) {
                try {
                    if (jSONArray.length() > 0) {
                        LinkedList linkedList = new LinkedList();
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            if (jSONObject != null) {
                                WxaWidgetInfo wxaWidgetInfo = new WxaWidgetInfo();
                                wxaWidgetInfo.f239482d = jSONObject.optInt("package_type");
                                wxaWidgetInfo.f239483e = jSONObject.optString("wxapkg_md5");
                                if (C90595a.m113497a(C89286a.f257212a, wxaWidgetInfo.f239482d)) {
                                    wxaWidgetInfo.f239484f = WxaPluginCodeInfo.m100123a(jSONObject.opt("separated_plugin_list"));
                                    linkedList.add(wxaWidgetInfo);
                                }
                            }
                        }
                        return linkedList;
                    }
                } catch (JSONException e) {
                    Log.m105921e("MicroMsg.AppBrand.WxaAttributes.WxaPluginCodeInfo", "parse json array, e = %s", e);
                }
            }
            return null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f239482d);
            parcel.writeString(this.f239483e);
            parcel.writeTypedList(this.f239484f);
        }

        public WxaWidgetInfo(Parcel parcel) {
            this.f239482d = parcel.readInt();
            this.f239483e = parcel.readString();
            this.f239484f = parcel.createTypedArrayList(WxaPluginCodeInfo.CREATOR);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.WxaAttributes$a */
    public static final class C81628a {

        /* renamed from: a */
        public long f239485a = 0;

        /* renamed from: b */
        public long f239486b = 0;

        /* renamed from: c */
        public String f239487c;

        /* renamed from: d */
        public int f239488d;

        /* renamed from: e */
        public int f239489e;

        /* renamed from: f */
        public List<String> f239490f;

        /* renamed from: g */
        public List<String> f239491g;

        /* renamed from: h */
        public List<String> f239492h;

        /* renamed from: i */
        public List<String> f239493i;

        /* renamed from: j */
        public List<String> f239494j;

        /* renamed from: k */
        public List<String> f239495k;

        /* renamed from: l */
        public List<String> f239496l;

        /* renamed from: m */
        public String f239497m;

        /* renamed from: n */
        public int f239498n;

        /* renamed from: o */
        public String f239499o;

        /* renamed from: p */
        public int f239500p = 0;

        /* renamed from: q */
        public int f239501q = 0;

        /* renamed from: r */
        public int f239502r = 0;

        /* renamed from: s */
        public int f239503s;

        /* renamed from: t */
        public int f239504t;

        /* renamed from: u */
        public int f239505u;

        /* renamed from: v */
        public p65 f239506v;

        /* renamed from: a */
        public boolean mo113970a() {
            return this.f239488d == 4;
        }

        /* renamed from: b */
        public boolean mo113971b() {
            return this.f239489e > 0 || this.f239488d == 7;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.WxaAttributes$c */
    public static final class C81629c {

        /* renamed from: a */
        public C81630a f239507a = new C81630a();

        /* renamed from: b */
        public List<Pair<String, String>> f239508b;

        /* renamed from: com.tencent.mm.plugin.appbrand.config.WxaAttributes$c$a */
        public static final class C81630a {

            /* renamed from: A */
            public long f239509A;

            /* renamed from: B */
            public long f239510B;

            /* renamed from: C */
            public byte[] f239511C;

            /* renamed from: D */
            public long f239512D;

            /* renamed from: a */
            public int f239513a;

            /* renamed from: b */
            public int f239514b;

            /* renamed from: c */
            public int f239515c;

            /* renamed from: d */
            public int f239516d;

            /* renamed from: e */
            public int f239517e;

            /* renamed from: f */
            public int f239518f;

            /* renamed from: g */
            public int f239519g;

            /* renamed from: h */
            public int f239520h;

            /* renamed from: i */
            public int f239521i;

            /* renamed from: j */
            public boolean f239522j;

            /* renamed from: k */
            public boolean f239523k;

            /* renamed from: l */
            public int f239524l;

            /* renamed from: m */
            public int f239525m;

            /* renamed from: n */
            public int f239526n;

            /* renamed from: o */
            public int f239527o;

            /* renamed from: p */
            public int f239528p;

            /* renamed from: q */
            public int f239529q;

            /* renamed from: r */
            public boolean f239530r;

            /* renamed from: s */
            public boolean f239531s;

            /* renamed from: t */
            public boolean f239532t;

            /* renamed from: u */
            public int f239533u;

            /* renamed from: v */
            public int f239534v;

            /* renamed from: w */
            public boolean f239535w;

            /* renamed from: x */
            public boolean f239536x;

            /* renamed from: y */
            public int f239537y;

            /* renamed from: z */
            public long f239538z;
        }
    }

    /* renamed from: l2 */
    public static JSONObject m100117l2(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.AppBrand.WxaAttributes", e, "createJsonObjectOrNull", new Object[0]);
            return null;
        }
    }

    public void convertFrom(Cursor cursor) {
        super.convertFrom(cursor);
        this.f239431R0 = null;
        this.f239432S0 = null;
        this.f239433T0 = null;
        this.f239434U0 = null;
        this.f239435V0 = null;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f239430W0;
    }

    /* renamed from: m2 */
    public C81628a mo113940m2() {
        if (this.f239431R0 == null) {
            String str = this.field_appInfo;
            C81628a aVar = null;
            if (Util.isNullOrNil(str)) {
                Log.m105920e("MicroMsg.AppBrand.WxaAttributes", "getAppInfo, json is EMPTY");
            } else {
                Util.currentTicks();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    C81628a aVar2 = new C81628a();
                    JSONObject optJSONObject = jSONObject.optJSONObject("RunningFlagInfo");
                    if (optJSONObject != null) {
                        aVar2.f239485a = optJSONObject.optLong("RunningFlag");
                        optJSONObject.optString("AppOpenForbiddenUrl");
                        aVar2.f239486b = optJSONObject.optLong("CanNotStarWxaBeforeTime", 0);
                    }
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("Network");
                    if (optJSONObject2 != null) {
                        aVar2.f239490f = C15407h0.m14353a(optJSONObject2.optJSONArray("RequestDomain"));
                        aVar2.f239491g = C15407h0.m14353a(optJSONObject2.optJSONArray("WsRequestDomain"));
                        aVar2.f239492h = C15407h0.m14353a(optJSONObject2.optJSONArray("UploadDomain"));
                        aVar2.f239493i = C15407h0.m14353a(optJSONObject2.optJSONArray("DownloadDomain"));
                        aVar2.f239494j = C15407h0.m14353a(optJSONObject2.optJSONArray("UDPDomain"));
                        aVar2.f239495k = C15407h0.m14353a(optJSONObject2.optJSONArray("TCPDomain"));
                        aVar2.f239496l = C15407h0.m14353a(optJSONObject2.optJSONArray("PrefetchDNSDomain"));
                    }
                    aVar2.f239487c = jSONObject.optString("Appid");
                    aVar2.f239489e = jSONObject.optInt("WechatPluginApp", 0);
                    aVar2.f239488d = jSONObject.optInt("AppServiceType", 0);
                    aVar2.f239497m = jSONObject.optString("fromBusinessUsername");
                    aVar2.f239498n = jSONObject.optInt("OriginalFlag", 0);
                    aVar2.f239499o = jSONObject.optString("OriginalRedirectUrl");
                    aVar2.f239500p = jSONObject.optInt("ShowRelievedBuyFlag", 0);
                    aVar2.f239501q = jSONObject.optInt("ShowFlagshipFlag", 0);
                    aVar2.f239502r = jSONObject.optInt("AgeAppropriateLevel", 0);
                    aVar2.f239503s = jSONObject.optInt("SystemAuthBizScene", 0);
                    aVar2.f239504t = jSONObject.optInt("SystemAuthFrequencyLimitFlag", 0);
                    aVar2.f239505u = jSONObject.optInt("LaunchFallbackMinVersion", 0);
                    JSONObject optJSONObject3 = jSONObject.optJSONObject("MigrateInfo");
                    if (optJSONObject3 != null) {
                        p65 p65 = new p65();
                        aVar2.f239506v = p65;
                        p65.f139610d = optJSONObject3.optString("target_appid");
                    }
                    aVar = aVar2;
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrand.WxaAttributes", "getAppInfo, json(%s) parse failed ex = %s", str, e);
                }
            }
            this.f239431R0 = aVar;
        }
        return this.f239431R0;
    }

    /* renamed from: n2 */
    public C81629c mo113941n2() {
        if (this.f239432S0 == null) {
            JSONObject jSONObject = null;
            try {
                jSONObject = new JSONObject(this.field_dynamicInfo);
            } catch (Exception unused) {
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            this.f239432S0 = new C81629c();
            Util.currentTicks();
            JSONObject optJSONObject = jSONObject.optJSONObject("NewSetting");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            this.f239432S0.f239507a.f239513a = optJSONObject.optInt("Uint32MaxLocalstorageSizeInMB", 5);
            this.f239432S0.f239507a.f239514b = optJSONObject.optInt("Uint32OpendataMaxLocalstorageSizeInMB", 5);
            C81629c.C81630a aVar = this.f239432S0.f239507a;
            optJSONObject.optInt("MaxCodeSize", 5);
            aVar.getClass();
            this.f239432S0.f239507a.f239515c = optJSONObject.optInt("ExpendedMaxWebviewDepth", 5);
            this.f239432S0.f239507a.f239516d = optJSONObject.optInt("MaxBackgroundLifespan", 600);
            this.f239432S0.f239507a.f239517e = optJSONObject.optInt("MaxRequestConcurrent", 10);
            this.f239432S0.f239507a.f239518f = optJSONObject.optInt("MaxUploadConcurrent", 10);
            this.f239432S0.f239507a.f239519g = optJSONObject.optInt("MaxDownloadConcurrent", 10);
            this.f239432S0.f239507a.f239520h = optJSONObject.optInt("MaxWebsocketConnect", 5);
            boolean z = true;
            this.f239432S0.f239507a.f239521i = optJSONObject.optInt("MaxWorkerConcurrent", 1);
            this.f239432S0.f239507a.f239522j = optJSONObject.optInt("WebsocketSkipPortCheck", 0) != 0;
            this.f239432S0.f239507a.f239523k = optJSONObject.optInt("TLSSkipHostnameCheck", 0) != 0;
            this.f239432S0.f239507a.f239524l = optJSONObject.optInt("Uint32MaxFileStorageSizeInMB", 10);
            this.f239432S0.f239507a.f239525m = optJSONObject.optInt("Uint32MaxTempFileStorageSizeInMB", 300);
            this.f239432S0.f239507a.f239526n = optJSONObject.optInt("Uint32MinTempFileStorageSizeInMB", 100);
            this.f239432S0.f239507a.f239527o = optJSONObject.optInt("BackgroundNetworkInterruptedTimeout", 5);
            C81629c.C81630a aVar2 = this.f239432S0.f239507a;
            optJSONObject.optInt("CanKeepAliveByAudioPlay", 0);
            aVar2.getClass();
            this.f239432S0.f239507a.f239528p = optJSONObject.optInt("LifeSpanBeforeSuspend", 5);
            this.f239432S0.f239507a.f239529q = optJSONObject.optInt("LifeSpanAfterSuspend", 300);
            this.f239432S0.f239507a.f239530r = optJSONObject.optInt("ScanCodeEnableZZM", 0) != 0;
            this.f239432S0.f239507a.f239531s = optJSONObject.optInt("CanPreFetchData", 0) > 0;
            this.f239432S0.f239507a.f239532t = optJSONObject.optInt("CanPeriodFetchData", 0) > 0;
            this.f239432S0.f239507a.f239533u = optJSONObject.optInt("PeriodFetchData", 0);
            this.f239432S0.f239507a.f239534v = optJSONObject.optInt("PeriodFetchDataDay", 7);
            C81629c.C81630a aVar3 = this.f239432S0.f239507a;
            optJSONObject.optInt("GuaranteeFlag", 0);
            aVar3.getClass();
            this.f239432S0.f239507a.f239535w = optJSONObject.optInt("CanShowLoadingAdvert", 0) > 0;
            C81629c.C81630a aVar4 = this.f239432S0.f239507a;
            if (optJSONObject.optInt("CanShowGameLoadingAdvert", 0) <= 0) {
                z = false;
            }
            aVar4.f239536x = z;
            this.f239432S0.f239507a.f239537y = optJSONObject.optInt("BrandOfficialLabel", 0);
            this.f239432S0.f239507a.f239538z = optJSONObject.optLong("OpenWxaWaitUpdateMaxMicSec", 13000);
            this.f239432S0.f239507a.f239509A = optJSONObject.optLong("OpenWxaWaitUpdateMaxMicSecForWeakNet", 10000);
            C81629c.C81630a aVar5 = this.f239432S0.f239507a;
            optJSONObject.optLong("OpenWxaWaitUpdateMinMicSec", 0);
            aVar5.getClass();
            this.f239432S0.f239507a.f239510B = optJSONObject.optLong("NextTryOpenWxaDisMicSec", 10000);
            this.f239432S0.f239507a.f239511C = optJSONObject.optString("PreCgiCallByteBeforeLaunch", "").getBytes(StandardCharsets.UTF_8);
            this.f239432S0.f239507a.f239512D = optJSONObject.optLong("Uint32WxaLibPrivateMaxFileStorageSizeInMB", 200);
            JSONArray optJSONArray = jSONObject.optJSONArray("NewCategories");
            if (optJSONArray != null) {
                this.f239432S0.f239508b = new LinkedList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    if (optJSONObject2 != null) {
                        this.f239432S0.f239508b.add(new Pair(optJSONObject2.optString("first"), optJSONObject2.optString("second")));
                    }
                }
            }
        }
        return this.f239432S0;
    }

    /* renamed from: o2 */
    public WxaVersionInfo mo113942o2() {
        if (this.f239433T0 != null || Util.isNullOrNil(this.field_versionInfo)) {
            return this.f239433T0;
        }
        WxaVersionInfo a = WxaVersionInfo.m100125a(this.field_versionInfo);
        this.f239433T0 = a;
        return a;
    }

    /* renamed from: p2 */
    public final List<C68591b.C68592a> mo113943p2(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                C68591b.C68592a aVar = new C68591b.C68592a();
                jSONObject.optString("name", "");
                jSONObject.optInt("type");
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString("value", ""));
                aVar.f197029a = jSONObject2.optString("userName", "");
                aVar.f197030b = jSONObject2.optString("pagePath", "");
                aVar.f197031c = jSONObject2.optInt(ProviderConstants.API_COLNAME_FEATURE_VERSION);
                aVar.f197032d = mo113943p2(jSONObject.optJSONArray("sub_button_list"));
                arrayList.add(aVar);
            }
            return arrayList;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: q2 */
    public String mo113944q2() {
        HashMap hashMap = new HashMap();
        hashMap.put("NickName", this.field_nickname);
        hashMap.put("BrandIconURL", this.field_brandIconURL);
        hashMap.put("BigHeadImgUrl", this.field_bigHeadURL);
        hashMap.put("SmallHeadImgUrl", this.field_smallHeadURL);
        hashMap.put("Signature", this.field_signature);
        hashMap.put("WxAppOpt", Integer.valueOf(this.field_appOpt));
        hashMap.put("RegisterSource", m100117l2(this.field_registerSource));
        hashMap.put("WxaAppInfo", m100117l2(this.field_appInfo));
        hashMap.put("WxaAppVersionInfo", m100117l2(this.field_versionInfo));
        hashMap.put("BindWxaInfo", m100117l2(this.field_bindWxaInfo));
        hashMap.put("WxaAppDynamic", m100117l2(this.field_dynamicInfo));
        hashMap.put("MMBizMenu", m100117l2(this.field_bizMenu));
        return new JSONObject(hashMap).toString();
    }

    public String toString() {
        return "WxaAttributes{field_username='" + this.field_username + '\'' + ", field_appId='" + this.field_appId + '\'' + ", field_nickname='" + this.field_nickname + '\'' + ", field_signature='" + this.field_signature + '\'' + ", field_registerSource='" + this.field_registerSource + '\'' + ", field_appInfo='" + this.field_appInfo + '\'' + ", field_versionInfo='" + this.field_versionInfo + '\'' + ", field_bindWxaInfo='" + this.field_bindWxaInfo + '\'' + ", field_dynamicInfo='" + this.field_dynamicInfo + '\'' + ", field_bizMenu='" + this.field_bizMenu + '\'' + '}';
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo */
    public static class WxaPluginCodeInfo implements Parcelable {
        public static final Parcelable.Creator<WxaPluginCodeInfo> CREATOR = new C81623a();

        /* renamed from: d */
        public String f239437d;

        /* renamed from: e */
        public int f239438e;

        /* renamed from: f */
        public String f239439f;

        /* renamed from: g */
        public String f239440g;

        /* renamed from: h */
        public boolean f239441h;

        /* renamed from: i */
        public List<Integer> f239442i = new LinkedList();

        /* renamed from: j */
        public long f239443j;

        /* renamed from: n */
        public String f239444n;

        /* renamed from: o */
        public String f239445o;

        /* renamed from: com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo$a */
        public class C81623a implements Parcelable.Creator<WxaPluginCodeInfo> {
            public Object createFromParcel(Parcel parcel) {
                return new WxaPluginCodeInfo(parcel);
            }

            public Object[] newArray(int i) {
                return new WxaPluginCodeInfo[i];
            }
        }

        public WxaPluginCodeInfo() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x008f A[Catch:{ JSONException -> 0x00dd }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.util.List<com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaPluginCodeInfo> m100123a(java.lang.Object r13) {
            /*
                java.lang.String r0 = "auto_update"
                java.lang.String r1 = "MicroMsg.AppBrand.WxaAttributes.WxaPluginCodeInfo"
                r2 = 0
                if (r13 != 0) goto L_0x0008
                return r2
            L_0x0008:
                r3 = 1
                r4 = 0
                boolean r5 = r13 instanceof java.lang.String     // Catch:{ JSONException -> 0x00dd }
                if (r5 == 0) goto L_0x0016
                org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00dd }
                java.lang.String r13 = (java.lang.String) r13     // Catch:{ JSONException -> 0x00dd }
                r5.<init>(r13)     // Catch:{ JSONException -> 0x00dd }
                goto L_0x0030
            L_0x0016:
                boolean r5 = r13 instanceof org.json.JSONArray     // Catch:{ JSONException -> 0x00dd }
                if (r5 == 0) goto L_0x001e
                r5 = r13
                org.json.JSONArray r5 = (org.json.JSONArray) r5     // Catch:{ JSONException -> 0x00dd }
                goto L_0x0030
            L_0x001e:
                java.lang.String r5 = "WxaPluginCodeInfo.optPluginCodeInfoList() invalid pluginCodeObj:%s"
                java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ JSONException -> 0x00dd }
                java.lang.Class r13 = r13.getClass()     // Catch:{ JSONException -> 0x00dd }
                java.lang.String r13 = r13.getName()     // Catch:{ JSONException -> 0x00dd }
                r6[r4] = r13     // Catch:{ JSONException -> 0x00dd }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r5, r6)     // Catch:{ JSONException -> 0x00dd }
                r5 = r2
            L_0x0030:
                if (r5 == 0) goto L_0x00dc
                int r13 = r5.length()     // Catch:{ JSONException -> 0x00dd }
                if (r13 != 0) goto L_0x003a
                goto L_0x00dc
            L_0x003a:
                java.util.LinkedList r13 = new java.util.LinkedList     // Catch:{ JSONException -> 0x00dd }
                r13.<init>()     // Catch:{ JSONException -> 0x00dd }
                r6 = 0
            L_0x0040:
                int r7 = r5.length()     // Catch:{ JSONException -> 0x00dd }
                if (r6 >= r7) goto L_0x00db
                org.json.JSONObject r7 = r5.getJSONObject(r6)     // Catch:{ JSONException -> 0x00dd }
                if (r7 != 0) goto L_0x004e
                goto L_0x00d7
            L_0x004e:
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo r8 = new com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo     // Catch:{ JSONException -> 0x00dd }
                r8.<init>()     // Catch:{ JSONException -> 0x00dd }
                java.lang.String r9 = "plugin_id"
                java.lang.String r9 = r7.optString(r9)     // Catch:{ JSONException -> 0x00dd }
                r8.f239437d = r9     // Catch:{ JSONException -> 0x00dd }
                java.lang.String r9 = "inner_version"
                int r9 = r7.optInt(r9)     // Catch:{ JSONException -> 0x00dd }
                r8.f239438e = r9     // Catch:{ JSONException -> 0x00dd }
                java.lang.String r9 = "md5"
                java.lang.String r9 = r7.optString(r9)     // Catch:{ JSONException -> 0x00dd }
                r8.f239439f = r9     // Catch:{ JSONException -> 0x00dd }
                java.lang.String r9 = "prefix_path"
                java.lang.String r9 = r7.optString(r9)     // Catch:{ JSONException -> 0x00dd }
                r8.f239440g = r9     // Catch:{ JSONException -> 0x00dd }
                boolean r9 = r7.optBoolean(r0)     // Catch:{ JSONException -> 0x00dd }
                if (r9 != 0) goto L_0x0084
                int r9 = r7.optInt(r0, r4)     // Catch:{ JSONException -> 0x00dd }
                if (r9 <= 0) goto L_0x0082
                goto L_0x0084
            L_0x0082:
                r9 = 0
                goto L_0x0085
            L_0x0084:
                r9 = 1
            L_0x0085:
                r8.f239441h = r9     // Catch:{ JSONException -> 0x00dd }
                java.lang.String r9 = "contexts"
                org.json.JSONArray r9 = r7.optJSONArray(r9)     // Catch:{ JSONException -> 0x00dd }
                if (r9 == 0) goto L_0x00af
                int r10 = r9.length()     // Catch:{ JSONException -> 0x00dd }
                if (r10 > 0) goto L_0x0096
                goto L_0x00af
            L_0x0096:
                r10 = 0
            L_0x0097:
                int r11 = r9.length()     // Catch:{ JSONException -> 0x00dd }
                if (r10 >= r11) goto L_0x00ba
                java.util.List<java.lang.Integer> r11 = r8.f239442i     // Catch:{ JSONException -> 0x00dd }
                int r12 = r9.optInt(r10)     // Catch:{ JSONException -> 0x00dd }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ JSONException -> 0x00dd }
                java.util.LinkedList r11 = (java.util.LinkedList) r11     // Catch:{ JSONException -> 0x00dd }
                r11.add(r12)     // Catch:{ JSONException -> 0x00dd }
                int r10 = r10 + 1
                goto L_0x0097
            L_0x00af:
                java.util.List<java.lang.Integer> r9 = r8.f239442i     // Catch:{ JSONException -> 0x00dd }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r4)     // Catch:{ JSONException -> 0x00dd }
                java.util.LinkedList r9 = (java.util.LinkedList) r9     // Catch:{ JSONException -> 0x00dd }
                r9.add(r10)     // Catch:{ JSONException -> 0x00dd }
            L_0x00ba:
                java.lang.String r9 = "dev_key"
                long r9 = r7.optLong(r9)     // Catch:{ JSONException -> 0x00dd }
                r8.f239443j = r9     // Catch:{ JSONException -> 0x00dd }
                java.lang.String r9 = "version_desc"
                java.lang.String r9 = r7.optString(r9)     // Catch:{ JSONException -> 0x00dd }
                r8.f239444n = r9     // Catch:{ JSONException -> 0x00dd }
                java.lang.String r9 = "semver"
                java.lang.String r7 = r7.optString(r9)     // Catch:{ JSONException -> 0x00dd }
                r8.f239445o = r7     // Catch:{ JSONException -> 0x00dd }
                r13.add(r8)     // Catch:{ JSONException -> 0x00dd }
            L_0x00d7:
                int r6 = r6 + 1
                goto L_0x0040
            L_0x00db:
                return r13
            L_0x00dc:
                return r2
            L_0x00dd:
                r13 = move-exception
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r4] = r13
                java.lang.String r13 = "parse json array, e = %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r13, r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaPluginCodeInfo.m100123a(java.lang.Object):java.util.List");
        }

        /* renamed from: b */
        public static List<WxaPluginCodeInfo> m100124b(List<WxaWidgetInfo> list, Object obj, int i) {
            List<WxaPluginCodeInfo> list2 = null;
            if (list != null) {
                for (WxaWidgetInfo next : list) {
                    if (next.f239482d == i) {
                        list2 = next.f239484f;
                    }
                }
            }
            return list2 == null ? m100123a(obj) : list2;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f239437d);
            parcel.writeInt(this.f239438e);
            parcel.writeString(this.f239439f);
            parcel.writeString(this.f239440g);
            parcel.writeByte(this.f239441h ? (byte) 1 : 0);
            parcel.writeList(this.f239442i);
            parcel.writeLong(this.f239443j);
            parcel.writeString(this.f239444n);
            parcel.writeString(this.f239445o);
        }

        public WxaPluginCodeInfo(Parcel parcel) {
            this.f239437d = parcel.readString();
            this.f239438e = parcel.readInt();
            this.f239439f = parcel.readString();
            this.f239440g = parcel.readString();
            this.f239441h = parcel.readByte() != 1 ? false : true;
            if (this.f239442i == null) {
                this.f239442i = new LinkedList();
            }
            parcel.readList(this.f239442i, Integer.class.getClassLoader());
            this.f239443j = parcel.readLong();
            this.f239444n = parcel.readString();
            this.f239445o = parcel.readString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.WxaAttributes$HalfPage */
    public static final class HalfPage implements Parcelable {
        public static final Parcelable.Creator<HalfPage> CREATOR = new C81622a();

        /* renamed from: d */
        public String f239436d = "default";

        /* renamed from: com.tencent.mm.plugin.appbrand.config.WxaAttributes$HalfPage$a */
        public class C81622a implements Parcelable.Creator<HalfPage> {
            public Object createFromParcel(Parcel parcel) {
                return new HalfPage(parcel);
            }

            public Object[] newArray(int i) {
                return new HalfPage[i];
            }
        }

        public HalfPage(Parcel parcel) {
            this.f239436d = parcel.readString();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f239436d);
        }

        public HalfPage() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo */
    public static final class WxaVersionInfo implements Parcelable {
        public static final Parcelable.Creator<WxaVersionInfo> CREATOR = new C81625a();

        /* renamed from: A */
        public HalfPage f239448A;

        /* renamed from: B */
        public long f239449B;

        /* renamed from: C */
        public String f239450C;

        /* renamed from: D */
        public boolean f239451D;

        /* renamed from: d */
        public int f239452d;

        /* renamed from: e */
        public String f239453e;

        /* renamed from: f */
        public int f239454f;

        /* renamed from: g */
        public String f239455g;

        /* renamed from: h */
        public String f239456h;

        /* renamed from: i */
        public WxaVersionCoverImageInfo f239457i;

        /* renamed from: j */
        public List<WxaPluginCodeInfo> f239458j;

        /* renamed from: n */
        public int f239459n;

        /* renamed from: o */
        public List<WxaVersionModuleInfo> f239460o;

        /* renamed from: p */
        public boolean f239461p;

        /* renamed from: q */
        public String f239462q;

        /* renamed from: r */
        public String f239463r;

        /* renamed from: s */
        public String f239464s;

        /* renamed from: t */
        public List<WxaWidgetInfo> f239465t;

        /* renamed from: u */
        public long f239466u;

        /* renamed from: v */
        public String f239467v;

        /* renamed from: w */
        public String f239468w;

        /* renamed from: x */
        public String f239469x;

        /* renamed from: y */
        public String f239470y;

        /* renamed from: z */
        public boolean f239471z;

        /* renamed from: com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo$a */
        public class C81625a implements Parcelable.Creator<WxaVersionInfo> {
            public Object createFromParcel(Parcel parcel) {
                return new WxaVersionInfo(parcel);
            }

            public Object[] newArray(int i) {
                return new WxaVersionInfo[i];
            }
        }

        public WxaVersionInfo() {
            this.f239467v = "";
            this.f239468w = "";
            this.f239469x = "";
            this.f239470y = "";
            this.f239471z = false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            return null;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaVersionInfo m100125a(java.lang.String r9) {
            /*
                java.lang.String r0 = "isTransparentBackgroundSupport"
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                r2 = 0
                if (r1 == 0) goto L_0x000a
                return r2
            L_0x000a:
                com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r1.<init>(r9)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r9 = new com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r9.<init>()     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                java.lang.String r3 = "AppVersion"
                r4 = 0
                int r3 = r1.optInt(r3, r4)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r9.f239452d = r3     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                java.lang.String r3 = "custom_version"
                java.lang.String r3 = r1.optString(r3)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r9.f239453e = r3     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                java.lang.String r3 = "VersionState"
                r5 = -1
                int r3 = r1.optInt(r3, r5)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r9.f239454f = r3     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                java.lang.String r3 = "VersionMD5"
                java.lang.String r3 = r1.optString(r3)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r9.f239455g = r3     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                java.lang.String r3 = "device_orientation"
                java.lang.String r3 = r1.optString(r3)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r9.f239456h = r3     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                java.lang.String r3 = "client_js_ext_info"
                java.lang.String r3 = r1.optString(r3)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r9.f239463r = r3     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                java.lang.String r3 = "code_size"
                int r3 = r1.optInt(r3)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r9.f239459n = r3     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                java.lang.String r3 = "loading_image_info"
                org.json.JSONObject r3 = r1.optJSONObject(r3)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                if (r3 == 0) goto L_0x0074
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionCoverImageInfo r5 = new com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionCoverImageInfo     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r5.<init>()     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r9.f239457i = r5     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                java.lang.String r6 = "url"
                java.lang.String r6 = r3.optString(r6)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r5.f239446d = r6     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionCoverImageInfo r5 = r9.f239457i     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                java.lang.String r6 = "progressbar_color"
                java.lang.String r3 = r3.optString(r6)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r5.f239447e = r3     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
            L_0x0074:
                java.lang.String r3 = "fake_native_loading_style_info"
                org.json.JSONObject r3 = r1.optJSONObject(r3)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                if (r3 == 0) goto L_0x00c1
                java.lang.String r5 = "white_style"
                org.json.JSONObject r5 = r3.optJSONObject(r5)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                java.lang.String r6 = "black_style"
                org.json.JSONObject r3 = r3.optJSONObject(r6)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                java.lang.String r6 = "background_color"
                java.lang.String r7 = "navigation_bar_text_color"
                if (r5 == 0) goto L_0x00a7
                boolean r8 = r5.has(r7)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                if (r8 == 0) goto L_0x009b
                java.lang.String r8 = r5.optString(r7)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r9.f239467v = r8     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
            L_0x009b:
                boolean r8 = r5.has(r6)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                if (r8 == 0) goto L_0x00a7
                java.lang.String r5 = r5.optString(r6)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r9.f239468w = r5     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
            L_0x00a7:
                if (r3 == 0) goto L_0x00c1
                boolean r5 = r3.has(r7)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                if (r5 == 0) goto L_0x00b5
                java.lang.String r5 = r3.optString(r7)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r9.f239469x = r5     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
            L_0x00b5:
                boolean r5 = r3.has(r6)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                if (r5 == 0) goto L_0x00c1
                java.lang.String r3 = r3.optString(r6)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r9.f239470y = r3     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
            L_0x00c1:
                java.lang.String r3 = "module_list"
                org.json.JSONArray r3 = r1.optJSONArray(r3)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                java.util.List r3 = com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaVersionModuleInfo.m100127b(r3)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r9.f239460o = r3     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                java.lang.String r3 = "UseModule"
                boolean r3 = r1.optBoolean(r3, r4)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r9.f239461p = r3     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                java.lang.String r3 = "EntranceModule"
                java.lang.String r3 = r1.optString(r3)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r9.f239462q = r3     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                java.lang.String r3 = "without_lib_md5"
                java.lang.String r3 = r1.optString(r3)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r9.f239464s = r3     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                java.lang.String r3 = "widget_list"
                org.json.JSONArray r3 = r1.optJSONArray(r3)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                java.util.List r3 = com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaWidgetInfo.m100129b(r3)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r9.f239465t = r3     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                java.lang.String r5 = "separated_plugin_list"
                java.lang.Object r5 = r1.opt(r5)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r6 = 22
                java.util.List r3 = com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaPluginCodeInfo.m100124b(r3, r5, r6)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r9.f239458j = r3     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                java.lang.String r3 = "ForceSyncUpdateWhenLaunchLastInterval"
                r5 = -1
                long r7 = r1.optLong(r3, r5)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r9.f239466u = r7     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                java.lang.String r3 = "resizable"
                boolean r3 = r1.optBoolean(r3, r4)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r9.f239471z = r3     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                java.lang.String r3 = "halfPage"
                org.json.JSONObject r3 = r1.optJSONObject(r3)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$HalfPage r7 = new com.tencent.mm.plugin.appbrand.config.WxaAttributes$HalfPage     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r7.<init>()     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r9.f239448A = r7     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                if (r3 == 0) goto L_0x012c
                java.lang.String r8 = "firstPageNavigationStyle"
                java.lang.String r3 = r3.optString(r8)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r7.f239436d = r3     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
            L_0x012c:
                java.lang.String r3 = "template_id"
                long r5 = r1.optLong(r3, r5)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r9.f239449B = r5     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                java.lang.String r3 = "renderer"
                java.lang.String r3 = r1.optString(r3)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r9.f239450C = r3     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                boolean r3 = r1.has(r0)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                if (r3 == 0) goto L_0x0170
                java.lang.String r0 = r1.optString(r0)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                java.lang.String r0 = r0.trim()     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                java.lang.String r1 = "true"
                boolean r1 = u24.C90599h.m113510c(r1, r0)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                if (r1 == 0) goto L_0x015d
                r0 = 1
                r9.f239451D = r0     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                goto L_0x0170
            L_0x015d:
                java.lang.String r1 = "false"
                boolean r1 = u24.C90599h.m113510c(r1, r0)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                if (r1 == 0) goto L_0x0168
                r9.f239451D = r4     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                goto L_0x0170
            L_0x0168:
                java.lang.String r1 = "1"
                boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
                r9.f239451D = r0     // Catch:{ Exception -> 0x0174, all -> 0x0172 }
            L_0x0170:
                r2 = r9
                goto L_0x0174
            L_0x0172:
                r9 = move-exception
                throw r9
            L_0x0174:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaVersionInfo.m100125a(java.lang.String):com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo");
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f239452d);
            parcel.writeString(this.f239453e);
            parcel.writeInt(this.f239454f);
            parcel.writeString(this.f239455g);
            parcel.writeString(this.f239456h);
            parcel.writeParcelable(this.f239457i, i);
            parcel.writeTypedList(this.f239458j);
            parcel.writeInt(this.f239459n);
            parcel.writeTypedList(this.f239460o);
            parcel.writeByte(this.f239461p ? (byte) 1 : 0);
            parcel.writeString(this.f239462q);
            parcel.writeString(this.f239463r);
            parcel.writeString(this.f239464s);
            parcel.writeTypedList(this.f239465t);
            parcel.writeString(this.f239467v);
            parcel.writeString(this.f239468w);
            parcel.writeString(this.f239469x);
            parcel.writeString(this.f239470y);
            parcel.writeByte(this.f239471z ? (byte) 1 : 0);
            parcel.writeLong(this.f239449B);
            parcel.writeParcelable(this.f239448A, i);
            parcel.writeString(this.f239450C);
            parcel.writeByte(this.f239451D ? (byte) 1 : 0);
        }

        public WxaVersionInfo(Parcel parcel) {
            this.f239467v = "";
            this.f239468w = "";
            this.f239469x = "";
            this.f239470y = "";
            boolean z = false;
            this.f239471z = false;
            this.f239452d = parcel.readInt();
            this.f239453e = parcel.readString();
            this.f239454f = parcel.readInt();
            this.f239455g = parcel.readString();
            this.f239456h = parcel.readString();
            this.f239457i = (WxaVersionCoverImageInfo) parcel.readParcelable(WxaVersionCoverImageInfo.class.getClassLoader());
            this.f239458j = parcel.createTypedArrayList(WxaPluginCodeInfo.CREATOR);
            this.f239459n = parcel.readInt();
            this.f239460o = parcel.createTypedArrayList(WxaVersionModuleInfo.CREATOR);
            this.f239461p = parcel.readByte() != 0;
            this.f239462q = parcel.readString();
            this.f239463r = parcel.readString();
            this.f239464s = parcel.readString();
            this.f239465t = parcel.createTypedArrayList(WxaWidgetInfo.CREATOR);
            this.f239467v = parcel.readString();
            this.f239468w = parcel.readString();
            this.f239469x = parcel.readString();
            this.f239470y = parcel.readString();
            this.f239471z = parcel.readByte() > 0;
            this.f239449B = parcel.readLong();
            this.f239448A = (HalfPage) parcel.readParcelable(HalfPage.class.getClassLoader());
            this.f239450C = parcel.readString();
            this.f239451D = parcel.readByte() > 0 ? true : z;
        }
    }
}
