package com.tencent.p014mm.plugin.wepkg.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import lb3.C46841c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile */
public class WepkgPreloadFile implements Parcelable {
    public static final Parcelable.Creator<WepkgPreloadFile> CREATOR = new C44486a();

    /* renamed from: d */
    public String f120638d;

    /* renamed from: e */
    public String f120639e;

    /* renamed from: f */
    public String f120640f;

    /* renamed from: g */
    public String f120641g;

    /* renamed from: h */
    public String f120642h;

    /* renamed from: i */
    public String f120643i;

    /* renamed from: j */
    public String f120644j;

    /* renamed from: n */
    public String f120645n;

    /* renamed from: o */
    public int f120646o;

    /* renamed from: p */
    public int f120647p;

    /* renamed from: q */
    public boolean f120648q;

    /* renamed from: r */
    public long f120649r;

    /* renamed from: com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile$a */
    public class C44486a implements Parcelable.Creator<WepkgPreloadFile> {
        public Object createFromParcel(Parcel parcel) {
            return new WepkgPreloadFile(parcel);
        }

        public Object[] newArray(int i) {
            return new WepkgPreloadFile[i];
        }
    }

    public WepkgPreloadFile() {
    }

    /* renamed from: a */
    public JSONObject mo69262a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", this.f120638d);
            jSONObject.put("pkgId", this.f120639e);
            jSONObject.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, this.f120640f);
            jSONObject.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, this.f120641g);
            jSONObject.put("rid", this.f120642h);
            jSONObject.put("mimeType", this.f120643i);
            jSONObject.put("md5", this.f120644j);
            jSONObject.put("downloadUrl", this.f120645n);
            jSONObject.put("size", this.f120646o);
            jSONObject.put("downloadNetType", this.f120647p);
            jSONObject.put("completeDownload", this.f120648q);
            jSONObject.put("createTime", this.f120649r);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: b */
    public void mo69263b(C46841c cVar) {
        if (cVar != null) {
            this.f120638d = cVar.field_key;
            this.f120639e = cVar.field_pkgId;
            this.f120640f = cVar.field_version;
            this.f120641g = cVar.field_filePath;
            this.f120642h = cVar.field_rid;
            this.f120643i = cVar.field_mimeType;
            this.f120644j = cVar.field_md5;
            this.f120645n = cVar.field_downloadUrl;
            this.f120646o = cVar.field_size;
            this.f120647p = cVar.field_downloadNetType;
            this.f120648q = cVar.field_completeDownload;
            this.f120649r = cVar.field_createTime;
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f120638d);
        parcel.writeString(this.f120639e);
        parcel.writeString(this.f120640f);
        parcel.writeString(this.f120641g);
        parcel.writeString(this.f120642h);
        parcel.writeString(this.f120643i);
        parcel.writeString(this.f120644j);
        parcel.writeString(this.f120645n);
        parcel.writeInt(this.f120646o);
        parcel.writeInt(this.f120647p);
        parcel.writeByte(this.f120648q ? (byte) 1 : 0);
        parcel.writeLong(this.f120649r);
    }

    public WepkgPreloadFile(Parcel parcel) {
        this.f120638d = parcel.readString();
        this.f120639e = parcel.readString();
        this.f120640f = parcel.readString();
        this.f120641g = parcel.readString();
        this.f120642h = parcel.readString();
        this.f120643i = parcel.readString();
        this.f120644j = parcel.readString();
        this.f120645n = parcel.readString();
        this.f120646o = parcel.readInt();
        this.f120647p = parcel.readInt();
        this.f120648q = parcel.readByte() != 0;
        this.f120649r = parcel.readLong();
    }
}
