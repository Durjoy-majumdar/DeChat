package com.tencent.p014mm.plugin.fav.api;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/fav/api/DelFavoriteData;", "Landroid/os/Parcelable;", "<init>", "()V", "CREATOR", "a", "fav-api_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.fav.api.DelFavoriteData */
public final class DelFavoriteData implements Parcelable {
    public static final C41399a CREATOR = new C41399a((C8480h) null);

    /* renamed from: d */
    public String f111465d;

    /* renamed from: e */
    public String f111466e;

    /* renamed from: f */
    public String f111467f;

    /* renamed from: g */
    public String f111468g;

    /* renamed from: h */
    public String f111469h;

    /* renamed from: i */
    public String f111470i;

    /* renamed from: j */
    public String f111471j;

    /* renamed from: com.tencent.mm.plugin.fav.api.DelFavoriteData$a */
    public static final class C41399a implements Parcelable.Creator<DelFavoriteData> {
        public C41399a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            DelFavoriteData delFavoriteData = new DelFavoriteData();
            delFavoriteData.f111465d = String.valueOf(parcel.readString());
            delFavoriteData.f111466e = String.valueOf(parcel.readString());
            delFavoriteData.f111467f = String.valueOf(parcel.readString());
            delFavoriteData.f111468g = String.valueOf(parcel.readString());
            delFavoriteData.f111469h = String.valueOf(parcel.readString());
            delFavoriteData.f111470i = String.valueOf(parcel.readString());
            delFavoriteData.f111471j = String.valueOf(parcel.readString());
            return delFavoriteData;
        }

        public Object[] newArray(int i) {
            return new DelFavoriteData[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        String str = this.f111465d;
        if (str != null) {
            parcel.writeString(str);
            String str2 = this.f111466e;
            if (str2 != null) {
                parcel.writeString(str2);
                String str3 = this.f111467f;
                if (str3 != null) {
                    parcel.writeString(str3);
                    String str4 = this.f111468g;
                    if (str4 != null) {
                        parcel.writeString(str4);
                        String str5 = this.f111469h;
                        if (str5 != null) {
                            parcel.writeString(str5);
                            String str6 = this.f111470i;
                            if (str6 != null) {
                                parcel.writeString(str6);
                                String str7 = this.f111471j;
                                if (str7 != null) {
                                    parcel.writeString(str7);
                                } else {
                                    C87412m.m108603p("jsUserName");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("srcUserName");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("itemShowTypeStr");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("srcDisplayName");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("initUrl");
                    throw null;
                }
            } else {
                C87412m.m108603p("pageKey");
                throw null;
            }
        } else {
            C87412m.m108603p("excerptKeys");
            throw null;
        }
    }
}
