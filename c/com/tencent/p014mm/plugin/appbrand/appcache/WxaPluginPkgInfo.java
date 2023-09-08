package com.tencent.p014mm.plugin.appbrand.appcache;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo */
public class WxaPluginPkgInfo implements Parcelable, IPkgInfo {
    public static final Parcelable.Creator<WxaPluginPkgInfo> CREATOR = new C81224a();
    public static final String PREFIX_EXTENDED = "__extended__/";
    public static final String PREFIX_NORMAL = "__plugin__/";
    public List<Integer> contexts;
    public String md5;
    public volatile String pkgPath;
    public String prefixPath;
    public String provider;
    public String stringVersion;
    public int version;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo$a */
    public class C81224a implements Parcelable.Creator<WxaPluginPkgInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new WxaPluginPkgInfo(parcel, (C81224a) null);
        }

        public Object[] newArray(int i) {
            return new WxaPluginPkgInfo[i];
        }
    }

    public /* synthetic */ WxaPluginPkgInfo(Parcel parcel, C81224a aVar) {
        this(parcel);
    }

    public void assignFrom(WxaPluginPkgInfo wxaPluginPkgInfo) {
        Parcel obtain = Parcel.obtain();
        obtain.setDataPosition(0);
        wxaPluginPkgInfo.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        readFromParcel(obtain);
        obtain.recycle();
    }

    public String checksumMd5() {
        return this.md5;
    }

    public int describeContents() {
        return 0;
    }

    public boolean isAssignable(WxaPluginPkgInfo wxaPluginPkgInfo) {
        return this.provider.equals(wxaPluginPkgInfo.provider);
    }

    public long lastModified() {
        if (C86013q1.m106450k(this.pkgPath)) {
            return C86013q1.m106452m(this.pkgPath);
        }
        return 0;
    }

    public String pkgPath() {
        return this.pkgPath;
    }

    public int pkgVersion() {
        return this.version;
    }

    public void readFromParcel(Parcel parcel) {
        this.pkgPath = parcel.readString();
        this.provider = parcel.readString();
        this.version = parcel.readInt();
        this.md5 = parcel.readString();
        this.prefixPath = parcel.readString();
        this.stringVersion = parcel.readString();
        if (this.contexts == null) {
            this.contexts = new LinkedList();
        }
        parcel.readList(this.contexts, Integer.class.getClassLoader());
    }

    public String toString() {
        return "WxaPluginPkgInfo{pkgPath='" + this.pkgPath + '\'' + ", provider='" + this.provider + '\'' + ", version=" + this.version + ", md5='" + this.md5 + '\'' + ", prefixPath='" + this.prefixPath + '\'' + ", stringVersion='" + this.stringVersion + '\'' + ", contexts=" + this.contexts + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.pkgPath);
        parcel.writeString(this.provider);
        parcel.writeInt(this.version);
        parcel.writeString(this.md5);
        parcel.writeString(this.prefixPath);
        parcel.writeString(this.stringVersion);
        parcel.writeList(this.contexts);
    }

    public WxaPluginPkgInfo() {
    }

    public WxaPluginPkgInfo clone() {
        WxaPluginPkgInfo wxaPluginPkgInfo = new WxaPluginPkgInfo();
        wxaPluginPkgInfo.assignFrom(this);
        return wxaPluginPkgInfo;
    }

    private WxaPluginPkgInfo(Parcel parcel) {
        readFromParcel(parcel);
    }
}
