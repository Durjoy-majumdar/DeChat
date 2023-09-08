package com.tencent.p014mm.plugin.ball.model;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.view.View;
import com.google.android.gms.stats.CodePackage;
import com.google.android.gms.stats.netstats.NetstatsParserPatterns;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.ball.model.BallInfo */
public class BallInfo implements Parcelable {
    public static final Parcelable.Creator<BallInfo> CREATOR = new C104948a();

    /* renamed from: A */
    public long f311676A = 0;

    /* renamed from: B */
    public boolean f311677B = false;

    /* renamed from: C */
    public Bundle f311678C = new Bundle();

    /* renamed from: D */
    public int f311679D = 0;

    /* renamed from: E */
    public boolean f311680E = false;

    /* renamed from: F */
    public boolean f311681F = false;

    /* renamed from: G */
    public boolean f311682G = false;

    /* renamed from: H */
    public BallReportInfo f311683H;

    /* renamed from: I */
    public C104949b f311684I = null;

    /* renamed from: J */
    public boolean f311685J = false;

    /* renamed from: d */
    public int f311686d;

    /* renamed from: e */
    public int f311687e;

    /* renamed from: f */
    public String f311688f;

    /* renamed from: g */
    public View f311689g;

    /* renamed from: h */
    public Point f311690h = null;

    /* renamed from: i */
    public View f311691i;

    /* renamed from: j */
    public int f311692j;

    /* renamed from: n */
    public BallButtonInfo f311693n = new BallButtonInfo();

    /* renamed from: o */
    public C55569c f311694o = new C55569c();

    /* renamed from: p */
    public String f311695p;

    /* renamed from: q */
    public boolean f311696q = true;

    /* renamed from: r */
    public boolean f311697r = true;

    /* renamed from: s */
    public int f311698s = -1;

    /* renamed from: t */
    public String f311699t;

    /* renamed from: u */
    public String f311700u;

    /* renamed from: v */
    public String f311701v;

    /* renamed from: w */
    public long f311702w = -2147483648L;

    /* renamed from: x */
    public long f311703x = 0;

    /* renamed from: y */
    public long f311704y = 0;

    /* renamed from: z */
    public long f311705z = 0;

    /* renamed from: com.tencent.mm.plugin.ball.model.BallInfo$d */
    public static final class C2072d extends JSONObject {
        public C2072d(Object obj) {
            if (obj instanceof String) {
                put("type", 1);
                put(TPReportParams.JSON_KEY_VAL, obj);
            } else if (obj instanceof Integer) {
                put("type", 2);
                put(TPReportParams.JSON_KEY_VAL, obj);
            } else if (obj instanceof Long) {
                put("type", 3);
                put(TPReportParams.JSON_KEY_VAL, obj);
            } else if (obj instanceof Double) {
                put("type", 4);
                put(TPReportParams.JSON_KEY_VAL, obj);
            } else if (obj instanceof Boolean) {
                put("type", 5);
                put(TPReportParams.JSON_KEY_VAL, obj);
            } else if (obj instanceof byte[]) {
                put("type", 6);
                put(TPReportParams.JSON_KEY_VAL, Base64.encodeToString((byte[]) obj, 2));
            } else {
                Log.m105929w("MicroMsg.BallInfo", "not support type, class:%s", obj.getClass());
                put("type", 0);
            }
        }

        /* renamed from: a */
        public static void m2013a(Bundle bundle, String str, JSONObject jSONObject) {
            try {
                switch (jSONObject.getInt("type")) {
                    case 1:
                        bundle.putString(str, jSONObject.getString(TPReportParams.JSON_KEY_VAL));
                        return;
                    case 2:
                        bundle.putInt(str, jSONObject.getInt(TPReportParams.JSON_KEY_VAL));
                        return;
                    case 3:
                        bundle.putLong(str, jSONObject.getLong(TPReportParams.JSON_KEY_VAL));
                        return;
                    case 4:
                        bundle.putDouble(str, jSONObject.getDouble(TPReportParams.JSON_KEY_VAL));
                        return;
                    case 5:
                        bundle.putBoolean(str, jSONObject.getBoolean(TPReportParams.JSON_KEY_VAL));
                        return;
                    case 6:
                        bundle.putByteArray(str, Base64.decode(jSONObject.getString(TPReportParams.JSON_KEY_VAL), 2));
                        return;
                    default:
                        Log.m105928w("MicroMsg.BallInfo", "restoreToBundle, not support type");
                        return;
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.BallInfo", e, "restoreToBundle fail, exception:%s", e);
            }
            Log.printErrStackTrace("MicroMsg.BallInfo", e, "restoreToBundle fail, exception:%s", e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.model.BallInfo$c */
    public static class C55569c {

        /* renamed from: a */
        public String f158210a;

        /* renamed from: b */
        public Bitmap f158211b;

        public boolean equals(Object obj) {
            if (!(obj instanceof C55569c)) {
                return false;
            }
            C55569c cVar = (C55569c) obj;
            return Objects.equals(cVar.f158210a, this.f158210a) && this.f158211b == cVar.f158211b;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.model.BallInfo$a */
    public class C104948a implements Parcelable.Creator<BallInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new BallInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new BallInfo[i];
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.model.BallInfo$b */
    public static class C104949b {

        /* renamed from: a */
        public Point f311713a;

        /* renamed from: b */
        public Point f311714b;
    }

    public BallInfo(int i, String str, JSONObject jSONObject) {
        BallReportInfo ballReportInfo;
        this.f311686d = i;
        this.f311688f = str;
        if (jSONObject != null) {
            ballReportInfo = new BallReportInfo(jSONObject);
        }
        this.f311683H = ballReportInfo;
        this.f311687e = i;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x009c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m140721a(com.tencent.p014mm.plugin.ball.model.BallInfo r5) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x00a0 }
            r0.<init>()     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r1 = "type"
            int r2 = r5.f311686d     // Catch:{ Exception -> 0x00a0 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r1 = "contentType"
            int r2 = r5.f311687e     // Catch:{ Exception -> 0x00a0 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r1 = "key"
            java.lang.String r2 = r5.f311688f     // Catch:{ Exception -> 0x00a0 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r1 = "name"
            java.lang.String r2 = r5.f311699t     // Catch:{ Exception -> 0x00a0 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r1 = "desc"
            java.lang.String r2 = r5.f311700u     // Catch:{ Exception -> 0x00a0 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r1 = "tag"
            java.lang.String r2 = r5.f311701v     // Catch:{ Exception -> 0x00a0 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r1 = "progress"
            long r2 = r5.f311702w     // Catch:{ Exception -> 0x00a0 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r1 = "icon"
            java.lang.String r2 = r5.f311695p     // Catch:{ Exception -> 0x00a0 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r1 = "iconResId"
            int r2 = r5.f311698s     // Catch:{ Exception -> 0x00a0 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r1 = "state"
            int r2 = r5.f311679D     // Catch:{ Exception -> 0x00a0 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r1 = "activeTime"
            long r2 = r5.f311703x     // Catch:{ Exception -> 0x00a0 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r1 = "createTime"
            long r2 = r5.f311704y     // Catch:{ Exception -> 0x00a0 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r1 = "passive"
            boolean r2 = r5.f311680E     // Catch:{ Exception -> 0x00a0 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r1 = "hidden"
            boolean r2 = r5.f311681F     // Catch:{ Exception -> 0x00a0 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r1 = "extra"
            android.os.Bundle r2 = r5.f311678C     // Catch:{ Exception -> 0x00a0 }
            org.json.JSONObject r2 = m140722b(r2)     // Catch:{ Exception -> 0x00a0 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r1 = "reportInfo"
            com.tencent.mm.plugin.ball.model.BallReportInfo r5 = r5.f311683H     // Catch:{ Exception -> 0x00a0 }
            r5.getClass()     // Catch:{ Exception -> 0x00a0 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x00a0 }
            r2.<init>()     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r3 = "r_internal_sessionId"
            java.lang.String r4 = r5.f311723o     // Catch:{ JSONException -> 0x009c }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x009c }
            java.lang.String r3 = "r_internal_aggregationSessionId"
            java.lang.String r4 = r5.f311724p     // Catch:{ JSONException -> 0x009c }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x009c }
            java.lang.String r3 = "r_internal_taskOrder"
            int r5 = r5.f311725q     // Catch:{ JSONException -> 0x009c }
            r2.put(r3, r5)     // Catch:{ JSONException -> 0x009c }
        L_0x009c:
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00a0 }
            return r0
        L_0x00a0:
            r5 = move-exception
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r5
            java.lang.String r1 = "MicroMsg.BallInfo"
            java.lang.String r2 = "convertBallInfoToJSONObject fail, exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r5, r2, r0)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ball.model.BallInfo.m140721a(com.tencent.mm.plugin.ball.model.BallInfo):org.json.JSONObject");
    }

    /* renamed from: b */
    public static JSONObject m140722b(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        if (bundle != null) {
            try {
                if (!bundle.isEmpty()) {
                    for (String next : bundle.keySet()) {
                        jSONObject.put(next, new C2072d(bundle.get(next)));
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.BallInfo", e, "convertBallInfoToJSONObject fail, exception:%s", e);
            }
        }
        return jSONObject;
    }

    /* renamed from: c */
    public static BallInfo m140723c(JSONObject jSONObject) {
        try {
            BallInfo ballInfo = new BallInfo(jSONObject.getInt("type"), jSONObject.getString("key"), jSONObject.optJSONObject("reportInfo"));
            ballInfo.f311687e = jSONObject.optInt(DownloadInfo.CONTENTTYPE, 0);
            ballInfo.f311681F = jSONObject.optBoolean("hidden", false);
            ballInfo.f311680E = jSONObject.optBoolean("passive", false);
            ballInfo.f311679D = jSONObject.optInt("state", 0);
            ballInfo.f311695p = jSONObject.optString("icon");
            ballInfo.f311698s = jSONObject.optInt("iconResId", -1);
            ballInfo.f311699t = jSONObject.optString("name");
            ballInfo.f311700u = jSONObject.optString("desc");
            ballInfo.f311701v = jSONObject.optString("tag");
            ballInfo.f311702w = jSONObject.optLong("progress");
            ballInfo.f311703x = jSONObject.optLong("activeTime", 0);
            ballInfo.f311704y = jSONObject.optLong("createTime", 0);
            JSONObject optJSONObject = jSONObject.optJSONObject("extra");
            Bundle bundle = new Bundle();
            if (optJSONObject != null) {
                try {
                    if (optJSONObject.length() > 0) {
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            C2072d.m2013a(bundle, next, optJSONObject.getJSONObject(next));
                        }
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.BallInfo", e, "convertJSONObjectToBundle fail, exception:%s", e);
                }
            }
            ballInfo.f311678C = bundle;
            return ballInfo;
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.BallInfo", e2, "convertJSONObjectToBallInfo fail, exception:%s", e2);
            return null;
        }
    }

    /* renamed from: d */
    public final synchronized void mo149039d() {
        if (this.f311678C == null) {
            this.f311678C = new Bundle();
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo149041e() {
        return String.format("%s#%s", new Object[]{Integer.valueOf(this.f311686d), this.f311688f});
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BallInfo)) {
            return false;
        }
        BallInfo ballInfo = (BallInfo) obj;
        return this.f311686d == ballInfo.f311686d && !Util.isNullOrNil(this.f311688f) && !Util.isNullOrNil(ballInfo.f311688f) && this.f311688f.equals(ballInfo.f311688f);
    }

    /* renamed from: f */
    public synchronized byte[] mo149043f(String str) {
        if (!mo149047j(str)) {
            return null;
        }
        return this.f311678C.getByteArray(str);
    }

    /* renamed from: g */
    public synchronized int mo149044g(String str, int i) {
        if (!mo149047j(str)) {
            return i;
        }
        return this.f311678C.getInt(str, i);
    }

    /* renamed from: h */
    public synchronized String mo149045h(String str, String str2) {
        if (!mo149047j(str)) {
            return str2;
        }
        return this.f311678C.getString(str, str2);
    }

    /* renamed from: i */
    public String mo149046i() {
        int i = this.f311686d;
        switch (i) {
            case 0:
                return NetstatsParserPatterns.TYPE_BOTH_PATTERN;
            case 1:
                return "APPBRAND";
            case 2:
                return "WEBPAGE";
            case 3:
                return "FAV";
            case 4:
                return "FILES";
            case 5:
                return "LUGGAGE";
            case 6:
                return "MUSIC";
            case 7:
                return CodePackage.LOCATION;
            case 8:
                return "TOPSTORY_VIDEO";
            case 9:
                return "VOIP";
            default:
                switch (i) {
                    case 16:
                        return "GAME_DOWNLOAD";
                    case 17:
                        return "APPBRAND_VOIP";
                    case 18:
                        return "AUDIO_OF_VIDEO_BACKGROUND_PLAY";
                    case 19:
                        return "APPBRAND_VOIP_1V1";
                    case 20:
                        return "MESSAGE";
                    case 21:
                        return "LIVE";
                    case 22:
                        return "FINDER_MEGA_VIDEO";
                    case 23:
                        return "MUSIC_PLAYER";
                    case 24:
                        return "FESTIVAL_LIVE";
                    case 25:
                        return "REPAIRER";
                    default:
                        switch (i) {
                            case 32:
                                return "FINDER_FEED";
                            case 33:
                                return "APPBRAND_BLUETOOTH";
                            case 34:
                                return "LIVE_REPLAY";
                            case 35:
                                return "LIVE_CHATTING";
                            default:
                                return "Unknown";
                        }
                }
        }
    }

    /* renamed from: j */
    public synchronized boolean mo149047j(String str) {
        if (this.f311678C == null || Util.isNullOrNil(str)) {
            return false;
        }
        return this.f311678C.containsKey(str);
    }

    /* renamed from: m */
    public synchronized void mo149048m(String str, int i) {
        if (!Util.isNullOrNil(str)) {
            mo149039d();
            this.f311678C.putInt(str, i);
        }
    }

    /* renamed from: o */
    public synchronized void mo149049o(String str, String str2) {
        if (!Util.isNullOrNil(str)) {
            mo149039d();
            this.f311678C.putString(str, str2);
        }
    }

    /* renamed from: p */
    public synchronized void mo149050p(BallInfo ballInfo) {
        if (ballInfo != null) {
            this.f311695p = ballInfo.f311695p;
            this.f311698s = ballInfo.f311698s;
            this.f311699t = ballInfo.f311699t;
            this.f311700u = ballInfo.f311700u;
            this.f311701v = ballInfo.f311701v;
            this.f311702w = ballInfo.f311702w;
            this.f311678C = ballInfo.f311678C;
            this.f311679D = ballInfo.f311679D;
            this.f311680E = ballInfo.f311680E;
            this.f311689g = ballInfo.f311689g;
            this.f311687e = ballInfo.f311687e;
            this.f311690h = ballInfo.f311690h;
            mo149051q(ballInfo.f311683H);
        }
    }

    /* renamed from: q */
    public final void mo149051q(BallReportInfo ballReportInfo) {
        BallReportInfo ballReportInfo2 = this.f311683H;
        ballReportInfo2.f311718g = ballReportInfo.f311718g;
        ballReportInfo2.f311720i = ballReportInfo.f311720i;
        ballReportInfo2.f311719h = ballReportInfo.f311719h;
        ballReportInfo2.f311717f = ballReportInfo.f311717f;
        ballReportInfo2.f311716e = ballReportInfo.f311716e;
        ballReportInfo2.f311715d = ballReportInfo.f311715d;
        ballReportInfo2.f311721j = ballReportInfo.f311721j;
    }

    public String toString() {
        return "BallInfo{type=" + this.f311686d + ", key='" + this.f311688f + '\'' + ", contentType='" + this.f311687e + '\'' + ", passive=" + this.f311680E + ", hidden=" + this.f311681F + ", icon='" + this.f311695p + '\'' + ", iconResId=" + this.f311698s + ", name='" + this.f311699t + '\'' + ", desc='" + this.f311700u + '\'' + ", tag='" + this.f311701v + '\'' + ", progress='" + this.f311702w + '\'' + ", state=" + this.f311679D + ", activeTime=" + this.f311703x + ", createTime=" + this.f311704y + ", reportInfo=" + this.f311683H.toString() + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeInt(this.f311686d);
            parcel.writeString(this.f311688f);
            parcel.writeString(this.f311695p);
            parcel.writeInt(this.f311698s);
            parcel.writeString(this.f311699t);
            parcel.writeString(this.f311700u);
            parcel.writeString(this.f311701v);
            parcel.writeLong(this.f311702w);
            Bundle bundle = this.f311678C;
            if (bundle == null) {
                bundle = new Bundle();
            }
            parcel.writeBundle(bundle);
            parcel.writeInt(this.f311679D);
            parcel.writeInt(this.f311680E ? 1 : 0);
            parcel.writeInt(this.f311681F ? 1 : 0);
            parcel.writeParcelable(this.f311683H, i);
            parcel.writeInt(this.f311687e);
            parcel.writeParcelable(this.f311693n, i);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BallInfo", e, "writeToParcel fail, exception:%s", e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.model.BallInfo$BallButtonInfo */
    public static class BallButtonInfo implements Parcelable {
        public static final Parcelable.Creator<BallButtonInfo> CREATOR = new C104947a();

        /* renamed from: d */
        public boolean f311706d = true;

        /* renamed from: e */
        public boolean f311707e = true;

        /* renamed from: f */
        public boolean f311708f = true;

        /* renamed from: g */
        public int f311709g = -1;

        /* renamed from: h */
        public boolean f311710h = true;

        /* renamed from: i */
        public boolean f311711i = true;

        /* renamed from: j */
        public int f311712j = -1;

        /* renamed from: com.tencent.mm.plugin.ball.model.BallInfo$BallButtonInfo$a */
        public class C104947a implements Parcelable.Creator<BallButtonInfo> {
            public Object createFromParcel(Parcel parcel) {
                return new BallButtonInfo(parcel);
            }

            public Object[] newArray(int i) {
                return new BallButtonInfo[i];
            }
        }

        public BallButtonInfo() {
        }

        /* renamed from: a */
        public void mo149054a(BallButtonInfo ballButtonInfo) {
            this.f311706d = ballButtonInfo.f311706d;
            this.f311707e = ballButtonInfo.f311707e;
            this.f311708f = ballButtonInfo.f311708f;
            this.f311709g = ballButtonInfo.f311709g;
            this.f311710h = ballButtonInfo.f311710h;
            this.f311711i = ballButtonInfo.f311711i;
            this.f311712j = ballButtonInfo.f311712j;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte(this.f311706d ? (byte) 1 : 0);
            parcel.writeByte(this.f311707e ? (byte) 1 : 0);
            parcel.writeByte(this.f311710h ? (byte) 1 : 0);
        }

        public BallButtonInfo(Parcel parcel) {
            boolean z = true;
            this.f311706d = parcel.readByte() != 0;
            this.f311707e = parcel.readByte() != 0;
            this.f311710h = parcel.readByte() == 0 ? false : z;
        }
    }

    public BallInfo(Parcel parcel) {
        try {
            this.f311686d = parcel.readInt();
            this.f311688f = parcel.readString();
            this.f311695p = parcel.readString();
            this.f311698s = parcel.readInt();
            this.f311699t = parcel.readString();
            this.f311700u = parcel.readString();
            this.f311701v = parcel.readString();
            this.f311702w = parcel.readLong();
            this.f311678C = parcel.readBundle(getClass().getClassLoader());
            this.f311679D = parcel.readInt();
            this.f311680E = parcel.readInt() == 1;
            this.f311681F = parcel.readInt() == 1;
            BallReportInfo ballReportInfo = (BallReportInfo) parcel.readParcelable(getClass().getClassLoader());
            if (ballReportInfo == null) {
                ballReportInfo = new BallReportInfo();
            }
            this.f311683H = ballReportInfo;
            this.f311687e = parcel.readInt();
            BallButtonInfo ballButtonInfo = (BallButtonInfo) parcel.readParcelable(getClass().getClassLoader());
            if (ballButtonInfo == null) {
                ballButtonInfo = new BallButtonInfo();
            }
            this.f311693n = ballButtonInfo;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BallInfo", e, "readFromParcel fail, exception:%s", e);
        }
    }
}
