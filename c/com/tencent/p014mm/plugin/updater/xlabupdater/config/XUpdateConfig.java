package com.tencent.p014mm.plugin.updater.xlabupdater.config;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/updater/xlabupdater/config/XUpdateConfig;", "Lcom/tencent/mm/plugin/updater/xlabupdater/config/BaseDownloadConfig;", "CREATOR", "a", "plugin-updater_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.updater.xlabupdater.config.XUpdateConfig */
public class XUpdateConfig extends BaseDownloadConfig {
    public static final C85506a CREATOR = new C85506a((C8480h) null);

    /* renamed from: f */
    public String f249169f;

    /* renamed from: g */
    public String f249170g;

    /* renamed from: com.tencent.mm.plugin.updater.xlabupdater.config.XUpdateConfig$a */
    public static final class C85506a implements Parcelable.Creator<XUpdateConfig> {
        public C85506a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new XUpdateConfig(parcel);
        }

        public Object[] newArray(int i) {
            return new XUpdateConfig[i];
        }
    }

    public XUpdateConfig() {
        this.f249169f = "";
        this.f249170g = "";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f249169f);
        parcel.writeString(this.f249170g);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XUpdateConfig(Parcel parcel) {
        super(parcel);
        C87412m.m108594g(parcel, "parcel");
        String str = "";
        this.f249169f = str;
        this.f249170g = str;
        String readString = parcel.readString();
        this.f249169f = readString == null ? str : readString;
        String readString2 = parcel.readString();
        this.f249170g = readString2 != null ? readString2 : str;
    }
}
