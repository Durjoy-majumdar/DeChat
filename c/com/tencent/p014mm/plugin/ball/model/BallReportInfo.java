package com.tencent.p014mm.plugin.ball.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.ball.model.BallReportInfo */
public class BallReportInfo implements Parcelable {
    public static final Parcelable.Creator<BallReportInfo> CREATOR = new C104950a();

    /* renamed from: d */
    public int f311715d;

    /* renamed from: e */
    public int f311716e;

    /* renamed from: f */
    public int f311717f;

    /* renamed from: g */
    public String f311718g;

    /* renamed from: h */
    public String f311719h;

    /* renamed from: i */
    public String f311720i;

    /* renamed from: j */
    public int f311721j;

    /* renamed from: n */
    public int f311722n;

    /* renamed from: o */
    public String f311723o;

    /* renamed from: p */
    public String f311724p;

    /* renamed from: q */
    public int f311725q;

    /* renamed from: com.tencent.mm.plugin.ball.model.BallReportInfo$a */
    public class C104950a implements Parcelable.Creator<BallReportInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new BallReportInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new BallReportInfo[i];
        }
    }

    public BallReportInfo() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "BallReportInfo{generateType=" + this.f311715d + ", generateScene=" + this.f311716e + ", bizScene=" + this.f311717f + ", bizId='" + this.f311718g + '\'' + ", bizSubId='" + this.f311719h + '\'' + ", bizName='" + this.f311720i + '\'' + ", opType=" + this.f311721j + ", internal_sessionId='" + this.f311723o + '\'' + ", internal_aggregationSessionId='" + this.f311724p + '\'' + ", internal_taskOrder=" + this.f311725q + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f311715d);
        parcel.writeInt(this.f311716e);
        parcel.writeInt(this.f311717f);
        parcel.writeString(this.f311718g);
        parcel.writeString(this.f311719h);
        parcel.writeString(this.f311720i);
        parcel.writeInt(this.f311721j);
        parcel.writeString(this.f311723o);
        parcel.writeString(this.f311724p);
        parcel.writeInt(this.f311725q);
        parcel.writeInt(this.f311722n);
    }

    public BallReportInfo(Parcel parcel) {
        this.f311715d = parcel.readInt();
        this.f311716e = parcel.readInt();
        this.f311717f = parcel.readInt();
        this.f311718g = parcel.readString();
        this.f311719h = parcel.readString();
        this.f311720i = parcel.readString();
        this.f311721j = parcel.readInt();
        this.f311723o = parcel.readString();
        this.f311724p = parcel.readString();
        this.f311725q = parcel.readInt();
        this.f311722n = parcel.readInt();
    }

    public BallReportInfo(JSONObject jSONObject) {
        this.f311723o = jSONObject.optString("r_internal_sessionId", (String) null);
        this.f311724p = jSONObject.optString("r_internal_aggregationSessionId", (String) null);
        this.f311725q = jSONObject.optInt("r_internal_taskOrder", 1);
    }
}
