package com.tencent.p014mm.plugin.wepkg.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.ProviderConstants;
import lb3.C46843e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.wepkg.model.WepkgVersion */
public class WepkgVersion implements Parcelable {
    public static final Parcelable.Creator<WepkgVersion> CREATOR = new C44487a();

    /* renamed from: A */
    public int f120650A;

    /* renamed from: d */
    public String f120651d;

    /* renamed from: e */
    public String f120652e;

    /* renamed from: f */
    public String f120653f;

    /* renamed from: g */
    public String f120654g;

    /* renamed from: h */
    public boolean f120655h;

    /* renamed from: i */
    public long f120656i;

    /* renamed from: j */
    public long f120657j;

    /* renamed from: n */
    public int f120658n;

    /* renamed from: o */
    public String f120659o;

    /* renamed from: p */
    public String f120660p;

    /* renamed from: q */
    public String f120661q;

    /* renamed from: r */
    public int f120662r;

    /* renamed from: s */
    public int f120663s;

    /* renamed from: t */
    public long f120664t;

    /* renamed from: u */
    public long f120665u;

    /* renamed from: v */
    public String f120666v;

    /* renamed from: w */
    public boolean f120667w;

    /* renamed from: x */
    public boolean f120668x;

    /* renamed from: y */
    public boolean f120669y;

    /* renamed from: z */
    public int f120670z;

    /* renamed from: com.tencent.mm.plugin.wepkg.model.WepkgVersion$a */
    public class C44487a implements Parcelable.Creator<WepkgVersion> {
        public Object createFromParcel(Parcel parcel) {
            return new WepkgVersion(parcel);
        }

        public Object[] newArray(int i) {
            return new WepkgVersion[i];
        }
    }

    public WepkgVersion() {
    }

    /* renamed from: a */
    public JSONObject mo69268a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appId", this.f120652e);
            jSONObject.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, this.f120653f);
            jSONObject.put("pkgPath", this.f120654g);
            jSONObject.put("disableWvCache", this.f120655h);
            jSONObject.put("clearPkgTime", this.f120656i);
            jSONObject.put("checkIntervalTime", this.f120657j);
            jSONObject.put("packMethod", this.f120658n);
            jSONObject.put("domain", this.f120659o);
            jSONObject.put("md5", this.f120660p);
            jSONObject.put("downloadUrl", this.f120661q);
            jSONObject.put("pkgSize", this.f120662r);
            jSONObject.put("downloadNetType", this.f120663s);
            jSONObject.put("nextCheckTime", this.f120664t);
            jSONObject.put("charset", this.f120666v);
            jSONObject.put("bigPackageReady", this.f120667w);
            jSONObject.put("preloadFilesReady", this.f120668x);
            jSONObject.put("preloadFilesAtomic", this.f120669y);
            jSONObject.put("totalDownloadCount", this.f120670z);
            jSONObject.put("downloadTriggerType", this.f120650A);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: b */
    public void mo69269b(C46843e eVar) {
        if (eVar != null) {
            this.f120651d = eVar.field_pkgId;
            this.f120652e = eVar.field_appId;
            this.f120653f = eVar.field_version;
            this.f120654g = eVar.field_pkgPath;
            this.f120655h = eVar.field_disableWvCache;
            this.f120656i = eVar.field_clearPkgTime;
            this.f120657j = eVar.field_checkIntervalTime;
            this.f120658n = eVar.field_packMethod;
            this.f120659o = eVar.field_domain;
            this.f120660p = eVar.field_md5;
            this.f120661q = eVar.field_downloadUrl;
            this.f120662r = eVar.field_pkgSize;
            this.f120663s = eVar.field_downloadNetType;
            this.f120664t = eVar.field_nextCheckTime;
            this.f120665u = eVar.field_createTime;
            this.f120666v = eVar.field_charset;
            this.f120667w = eVar.field_bigPackageReady;
            this.f120668x = eVar.field_preloadFilesReady;
            this.f120669y = eVar.field_preloadFilesAtomic;
            this.f120670z = eVar.field_totalDownloadCount;
            this.f120650A = eVar.field_downloadTriggerType;
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f120651d);
        parcel.writeString(this.f120652e);
        parcel.writeString(this.f120653f);
        parcel.writeString(this.f120654g);
        parcel.writeByte(this.f120655h ? (byte) 1 : 0);
        parcel.writeLong(this.f120656i);
        parcel.writeLong(this.f120657j);
        parcel.writeInt(this.f120658n);
        parcel.writeString(this.f120659o);
        parcel.writeString(this.f120660p);
        parcel.writeString(this.f120661q);
        parcel.writeInt(this.f120662r);
        parcel.writeInt(this.f120663s);
        parcel.writeLong(this.f120664t);
        parcel.writeLong(this.f120665u);
        parcel.writeString(this.f120666v);
        parcel.writeByte(this.f120667w ? (byte) 1 : 0);
        parcel.writeByte(this.f120668x ? (byte) 1 : 0);
        parcel.writeByte(this.f120669y ? (byte) 1 : 0);
        parcel.writeInt(this.f120670z);
        parcel.writeInt(this.f120650A);
    }

    public WepkgVersion(Parcel parcel) {
        this.f120651d = parcel.readString();
        this.f120652e = parcel.readString();
        this.f120653f = parcel.readString();
        this.f120654g = parcel.readString();
        boolean z = false;
        this.f120655h = parcel.readByte() != 0;
        this.f120656i = parcel.readLong();
        this.f120657j = parcel.readLong();
        this.f120658n = parcel.readInt();
        this.f120659o = parcel.readString();
        this.f120660p = parcel.readString();
        this.f120661q = parcel.readString();
        this.f120662r = parcel.readInt();
        this.f120663s = parcel.readInt();
        this.f120664t = parcel.readLong();
        this.f120665u = parcel.readLong();
        this.f120666v = parcel.readString();
        this.f120667w = parcel.readByte() != 0;
        this.f120668x = parcel.readByte() != 0;
        this.f120669y = parcel.readByte() != 0 ? true : z;
        this.f120670z = parcel.readInt();
        this.f120650A = parcel.readInt();
    }
}
