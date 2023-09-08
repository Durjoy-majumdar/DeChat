package com.tencent.liteapp.report;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.actions.SearchIntents;
import org.json.JSONObject;

public class WxaLiteAppStartReport implements Parcelable {
    public static final Parcelable.Creator<WxaLiteAppStartReport> CREATOR = new C113398a();

    /* renamed from: A */
    public long f339254A;

    /* renamed from: B */
    public long f339255B;

    /* renamed from: C */
    public int f339256C;

    /* renamed from: D */
    public long f339257D;

    /* renamed from: E */
    public long f339258E;

    /* renamed from: F */
    public long f339259F;

    /* renamed from: G */
    public long f339260G;

    /* renamed from: d */
    public String f339261d;

    /* renamed from: e */
    public String f339262e;

    /* renamed from: f */
    public String f339263f;

    /* renamed from: g */
    public boolean f339264g;

    /* renamed from: h */
    public boolean f339265h;

    /* renamed from: i */
    public long f339266i;

    /* renamed from: j */
    public boolean f339267j;

    /* renamed from: n */
    public long f339268n;

    /* renamed from: o */
    public long f339269o;

    /* renamed from: p */
    public boolean f339270p;

    /* renamed from: q */
    public boolean f339271q;

    /* renamed from: r */
    public long f339272r;

    /* renamed from: s */
    public long f339273s;

    /* renamed from: t */
    public boolean f339274t;

    /* renamed from: u */
    public long f339275u;

    /* renamed from: v */
    public long f339276v;

    /* renamed from: w */
    public boolean f339277w;

    /* renamed from: x */
    public long f339278x;

    /* renamed from: y */
    public long f339279y;

    /* renamed from: z */
    public boolean f339280z;

    /* renamed from: com.tencent.liteapp.report.WxaLiteAppStartReport$a */
    public class C113398a implements Parcelable.Creator<WxaLiteAppStartReport> {
        public Object createFromParcel(Parcel parcel) {
            return new WxaLiteAppStartReport(parcel);
        }

        public Object[] newArray(int i) {
            return new WxaLiteAppStartReport[i];
        }
    }

    public WxaLiteAppStartReport() {
        this.f339261d = "";
        this.f339262e = "";
        this.f339263f = "";
        this.f339264g = false;
        this.f339265h = false;
        this.f339266i = 0;
        this.f339267j = false;
        this.f339268n = 0;
        this.f339269o = 0;
        this.f339270p = false;
        this.f339271q = false;
        this.f339272r = 0;
        this.f339273s = 0;
        this.f339274t = false;
        this.f339275u = 0;
        this.f339276v = 0;
        this.f339277w = false;
        this.f339278x = 0;
        this.f339279y = 0;
        this.f339280z = false;
        this.f339254A = 0;
        this.f339255B = 0;
        this.f339256C = 0;
        this.f339257D = 0;
        this.f339258E = 0;
        this.f339259F = 0;
        this.f339260G = 0;
    }

    /* renamed from: a */
    public String mo169793a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appId", this.f339261d);
        jSONObject.put("page", this.f339263f);
        jSONObject.put(SearchIntents.EXTRA_QUERY, this.f339262e);
        jSONObject.put("preloadEngineCost", this.f339276v);
        jSONObject.put("preloadBaseLibCost", this.f339279y);
        jSONObject.put("checkCost", this.f339269o);
        jSONObject.put("showPageCost", this.f339258E);
        jSONObject.put("appCost", this.f339259F);
        jSONObject.put("renderPageCost", this.f339260G);
        jSONObject.put("showPageResult", this.f339256C);
        return jSONObject.toString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f339261d);
        parcel.writeString(this.f339262e);
        parcel.writeString(this.f339263f);
        parcel.writeByte(this.f339264g ? (byte) 1 : 0);
        parcel.writeByte(this.f339265h ? (byte) 1 : 0);
        parcel.writeLong(this.f339266i);
        parcel.writeByte(this.f339267j ? (byte) 1 : 0);
        parcel.writeLong(this.f339268n);
        parcel.writeLong(this.f339269o);
        parcel.writeByte(this.f339270p ? (byte) 1 : 0);
        parcel.writeByte(this.f339271q ? (byte) 1 : 0);
        parcel.writeLong(this.f339272r);
        parcel.writeLong(this.f339273s);
        parcel.writeByte(this.f339274t ? (byte) 1 : 0);
        parcel.writeLong(this.f339275u);
        parcel.writeLong(this.f339276v);
        parcel.writeByte(this.f339277w ? (byte) 1 : 0);
        parcel.writeLong(this.f339278x);
        parcel.writeLong(this.f339279y);
        parcel.writeByte(this.f339280z ? (byte) 1 : 0);
        parcel.writeLong(this.f339254A);
        parcel.writeLong(this.f339255B);
        parcel.writeInt(this.f339256C);
        parcel.writeLong(this.f339257D);
        parcel.writeLong(this.f339258E);
        parcel.writeLong(this.f339259F);
        parcel.writeLong(this.f339260G);
    }

    public WxaLiteAppStartReport(Parcel parcel) {
        this.f339261d = "";
        this.f339262e = "";
        this.f339263f = "";
        boolean z = false;
        this.f339264g = false;
        this.f339265h = false;
        this.f339266i = 0;
        this.f339267j = false;
        this.f339268n = 0;
        this.f339269o = 0;
        this.f339270p = false;
        this.f339271q = false;
        this.f339272r = 0;
        this.f339273s = 0;
        this.f339274t = false;
        this.f339275u = 0;
        this.f339276v = 0;
        this.f339277w = false;
        this.f339278x = 0;
        this.f339279y = 0;
        this.f339280z = false;
        this.f339254A = 0;
        this.f339255B = 0;
        this.f339256C = 0;
        this.f339257D = 0;
        this.f339258E = 0;
        this.f339259F = 0;
        this.f339260G = 0;
        this.f339261d = parcel.readString();
        this.f339262e = parcel.readString();
        this.f339263f = parcel.readString();
        this.f339264g = parcel.readByte() != 0;
        this.f339265h = parcel.readByte() != 0;
        this.f339266i = parcel.readLong();
        this.f339267j = parcel.readByte() != 0;
        this.f339268n = parcel.readLong();
        this.f339269o = parcel.readLong();
        this.f339270p = parcel.readByte() != 0;
        this.f339271q = parcel.readByte() != 0;
        this.f339272r = parcel.readLong();
        this.f339273s = parcel.readLong();
        this.f339274t = parcel.readByte() != 0;
        this.f339275u = parcel.readLong();
        this.f339276v = parcel.readLong();
        this.f339277w = parcel.readByte() != 0;
        this.f339278x = parcel.readLong();
        this.f339279y = parcel.readLong();
        this.f339280z = parcel.readByte() != 0 ? true : z;
        this.f339254A = parcel.readLong();
        this.f339255B = parcel.readLong();
        this.f339256C = parcel.readInt();
        this.f339257D = parcel.readLong();
        this.f339258E = parcel.readLong();
        this.f339259F = parcel.readLong();
        this.f339260G = parcel.readLong();
    }
}
