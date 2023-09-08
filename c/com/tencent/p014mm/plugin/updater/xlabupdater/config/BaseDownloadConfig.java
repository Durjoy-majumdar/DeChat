package com.tencent.p014mm.plugin.updater.xlabupdater.config;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/updater/xlabupdater/config/BaseDownloadConfig;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-updater_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.updater.xlabupdater.config.BaseDownloadConfig */
public class BaseDownloadConfig implements Parcelable {
    public static final C85505a CREATOR = new C85505a((C8480h) null);

    /* renamed from: d */
    public String f249167d;

    /* renamed from: e */
    public String f249168e;

    /* renamed from: com.tencent.mm.plugin.updater.xlabupdater.config.BaseDownloadConfig$a */
    public static final class C85505a implements Parcelable.Creator<BaseDownloadConfig> {
        public C85505a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new BaseDownloadConfig(parcel);
        }

        public Object[] newArray(int i) {
            return new BaseDownloadConfig[i];
        }
    }

    public BaseDownloadConfig() {
        this.f249167d = "";
        this.f249168e = "";
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeString(this.f249167d);
        parcel.writeString(this.f249168e);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BaseDownloadConfig(Parcel parcel) {
        this();
        C87412m.m108594g(parcel, "parcel");
        String readString = parcel.readString();
        String str = "";
        this.f249167d = readString == null ? str : readString;
        String readString2 = parcel.readString();
        this.f249168e = readString2 != null ? readString2 : str;
    }
}
