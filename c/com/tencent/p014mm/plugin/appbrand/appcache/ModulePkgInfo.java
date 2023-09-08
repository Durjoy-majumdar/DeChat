package com.tencent.p014mm.plugin.appbrand.appcache;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.FileNotFoundException;
import java.util.Arrays;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo */
public class ModulePkgInfo implements Parcelable, Cloneable, IPkgInfo {
    public static final Parcelable.Creator<ModulePkgInfo> CREATOR = new C81210a();
    public static final String GAME_PLUGIN_SCRIPT = "/plugin.js";
    public static final String MAIN_MODULE_NAME = "__APP__";
    public static final String MODULE_WITHOUT_MULTI_PLUGIN_CODE = "__WITHOUT_MULTI_PLUGINCODE__";
    public static final String MODULE_WITHOUT_PLUGIN_CODE = "__WITHOUT_PLUGINCODE__";
    public static final String PLUGINCODE_ORIGIN_PREFIX = "__plugin__/";
    public static final String PLUGINCODE_PREFIX = "/__plugin__/";
    public static final String PLUGIN_CODE = "__PLUGINCODE__";
    public String[] aliases;
    public boolean independent;
    public String md5;
    public String name;
    public volatile String pkgPath;
    public int pkgVersion;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo$a */
    public class C81210a implements Parcelable.Creator<ModulePkgInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new ModulePkgInfo(parcel, (C81210a) null);
        }

        public Object[] newArray(int i) {
            return new ModulePkgInfo[i];
        }
    }

    public /* synthetic */ ModulePkgInfo(Parcel parcel, C81210a aVar) {
        this(parcel);
    }

    public void assignFrom(ModulePkgInfo modulePkgInfo) {
        Parcel obtain = Parcel.obtain();
        obtain.setDataPosition(0);
        modulePkgInfo.writeToParcel(obtain, 0);
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

    public long getPkgSize() {
        if (C86013q1.m106450k(this.pkgPath)) {
            C86009m1 m1Var = new C86009m1(this.pkgPath);
            if (!m1Var.mo119978p() || !m1Var.mo119961a()) {
                return 0;
            }
            return m1Var.mo119980r();
        }
        throw new FileNotFoundException();
    }

    public boolean isAssignable(ModulePkgInfo modulePkgInfo) {
        return this.name.equals(modulePkgInfo.name);
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
        return this.pkgVersion;
    }

    public void readFromParcel(Parcel parcel) {
        this.pkgPath = parcel.readString();
        this.name = parcel.readString();
        this.md5 = parcel.readString();
        this.independent = parcel.readByte() != 0;
        this.aliases = parcel.createStringArray();
    }

    public String toString() {
        return "ModulePkgInfo{name='" + this.name + '\'' + ", md5='" + this.md5 + '\'' + ", independent=" + this.independent + ", aliases=" + Arrays.toString(this.aliases) + ", pkgVersion=" + this.pkgVersion + ", pkgPath='" + this.pkgPath + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.pkgPath);
        parcel.writeString(this.name);
        parcel.writeString(this.md5);
        parcel.writeByte(this.independent ? (byte) 1 : 0);
        parcel.writeStringArray(this.aliases);
    }

    public ModulePkgInfo() {
    }

    public ModulePkgInfo clone() {
        ModulePkgInfo modulePkgInfo = new ModulePkgInfo();
        modulePkgInfo.assignFrom(this);
        return modulePkgInfo;
    }

    private ModulePkgInfo(Parcel parcel) {
        readFromParcel(parcel);
    }
}
