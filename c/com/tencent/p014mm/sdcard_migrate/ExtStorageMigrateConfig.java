package com.tencent.p014mm.sdcard_migrate;

import a70.C112760b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateConfig */
public class ExtStorageMigrateConfig implements Parcelable {
    public static final Parcelable.Creator<ExtStorageMigrateConfig> CREATOR = new C115934a();

    /* renamed from: h */
    public static final ExtStorageMigrateConfig f347831h;

    /* renamed from: d */
    public final String f347832d;

    /* renamed from: e */
    public final String f347833e;

    /* renamed from: f */
    public boolean f347834f;

    /* renamed from: g */
    public final Set<ExtraPathAction> f347835g;

    /* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateConfig$a */
    public class C115934a implements Parcelable.Creator<ExtStorageMigrateConfig> {
        public Object createFromParcel(Parcel parcel) {
            return new ExtStorageMigrateConfig(parcel, (C115934a) null);
        }

        public Object[] newArray(int i) {
            return new ExtStorageMigrateConfig[i];
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(new ExtraPathAction.Ignore("appbrand/jscache/", (C115934a) null));
        hashSet.add(new ExtraPathAction.Remap("wallet/images", "wallet_images", (C115934a) null));
        hashSet.add(new ExtraPathAction.Remap("WeChat/", C112760b.m154220a0(), (C115934a) null));
        hashSet.add(new ExtraPathAction.Remap("WeiXin/", C112760b.m154220a0(), (C115934a) null));
        hashSet.add(new ExtraPathAction.Remap("weixin/", C112760b.m154220a0(), (C115934a) null));
        hashSet.add(new ExtraPathAction.Remap("wechat/", C112760b.m154220a0(), (C115934a) null));
        f347831h = new ExtStorageMigrateConfig(C112760b.m154223c(), C112760b.m154228e0() + "/MicroMsg/", false, hashSet, (C115934a) null);
    }

    public ExtStorageMigrateConfig(String str, String str2, boolean z, Collection collection, C115934a aVar) {
        this.f347832d = str;
        this.f347833e = str2;
        this.f347834f = z;
        this.f347835g = Collections.unmodifiableSet(new HashSet(collection));
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ExtStorageMigrateConfig{" + "source: " + this.f347832d + "," + "dest: " + this.f347833e + "," + "forceCopy: " + this.f347834f + "," + "extraActions: " + this.f347835g + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f347832d);
        parcel.writeString(this.f347833e);
        parcel.writeInt(this.f347834f ? 1 : 0);
        parcel.writeInt(this.f347835g.size());
        for (ExtraPathAction writeParcelable : this.f347835g) {
            parcel.writeParcelable(writeParcelable, i);
        }
    }

    /* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateConfig$ExtraPathAction */
    public static abstract class ExtraPathAction implements Parcelable {
        public int describeContents() {
            return 0;
        }

        /* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateConfig$ExtraPathAction$Ignore */
        public static class Ignore extends ExtraPathAction {
            public static final Parcelable.Creator<Ignore> CREATOR = new C115932a();

            /* renamed from: d */
            public final String f347836d;

            /* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateConfig$ExtraPathAction$Ignore$a */
            public class C115932a implements Parcelable.Creator<Ignore> {
                public Object createFromParcel(Parcel parcel) {
                    return new Ignore(parcel, (C115934a) null);
                }

                public Object[] newArray(int i) {
                    return new Ignore[i];
                }
            }

            public Ignore(String str, C115934a aVar) {
                if (str.startsWith("/") || str.startsWith("\\")) {
                    throw new IllegalArgumentException(str + " is not a relative path.");
                }
                this.f347836d = str;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof Ignore)) {
                    return false;
                }
                return this.f347836d.equals(((Ignore) obj).f347836d);
            }

            public int hashCode() {
                return this.f347836d.hashCode();
            }

            public String toString() {
                return "Ignore{relPath: " + this.f347836d + "}";
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.f347836d);
            }

            public Ignore(Parcel parcel, C115934a aVar) {
                this.f347836d = parcel.readString();
            }
        }

        /* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateConfig$ExtraPathAction$Remap */
        public static class Remap extends ExtraPathAction {
            public static final Parcelable.Creator<Remap> CREATOR = new C115933a();

            /* renamed from: d */
            public final String f347837d;

            /* renamed from: e */
            public final String f347838e;

            /* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateConfig$ExtraPathAction$Remap$a */
            public class C115933a implements Parcelable.Creator<Remap> {
                public Object createFromParcel(Parcel parcel) {
                    return new Remap(parcel, (C115934a) null);
                }

                public Object[] newArray(int i) {
                    return new Remap[i];
                }
            }

            public Remap(String str, String str2, C115934a aVar) {
                if (str.startsWith("/") || str.startsWith("\\")) {
                    throw new IllegalArgumentException(str + " is not a relative path.");
                }
                this.f347837d = str;
                this.f347838e = str2;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof Remap)) {
                    return false;
                }
                Remap remap = (Remap) obj;
                if (!this.f347837d.equals(remap.f347837d)) {
                    return false;
                }
                return this.f347838e.equals(remap.f347838e);
            }

            public int hashCode() {
                return this.f347837d.hashCode() + this.f347838e.hashCode();
            }

            public String toString() {
                return "Remap{old: " + this.f347837d + ", new: " + this.f347838e + "}";
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.f347837d);
                parcel.writeString(this.f347838e);
            }

            public Remap(Parcel parcel, C115934a aVar) {
                this.f347837d = parcel.readString();
                this.f347838e = parcel.readString();
            }
        }
    }

    public ExtStorageMigrateConfig(Parcel parcel, C115934a aVar) {
        this.f347832d = parcel.readString();
        this.f347833e = parcel.readString();
        this.f347834f = parcel.readInt() != 0;
        HashSet hashSet = new HashSet();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            hashSet.add((ExtraPathAction) parcel.readParcelable(ExtStorageMigrateConfig.class.getClassLoader()));
        }
        this.f347835g = Collections.unmodifiableSet(hashSet);
    }
}
