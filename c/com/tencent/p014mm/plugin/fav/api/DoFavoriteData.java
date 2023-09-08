package com.tencent.p014mm.plugin.fav.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/fav/api/DoFavoriteData;", "Landroid/os/Parcelable;", "<init>", "()V", "CREATOR", "a", "fav-api_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.fav.api.DoFavoriteData */
public final class DoFavoriteData implements Parcelable {
    public static final C41400a CREATOR = new C41400a((C8480h) null);

    /* renamed from: d */
    public String f111472d;

    /* renamed from: e */
    public String f111473e;

    /* renamed from: f */
    public String f111474f;

    /* renamed from: g */
    public String f111475g;

    /* renamed from: h */
    public String f111476h;

    /* renamed from: i */
    public String f111477i;

    /* renamed from: j */
    public String f111478j;

    /* renamed from: n */
    public String f111479n;

    /* renamed from: o */
    public String f111480o;

    /* renamed from: com.tencent.mm.plugin.fav.api.DoFavoriteData$a */
    public static final class C41400a implements Parcelable.Creator<DoFavoriteData> {
        public C41400a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            DoFavoriteData doFavoriteData = new DoFavoriteData();
            doFavoriteData.f111472d = String.valueOf(parcel.readString());
            doFavoriteData.f111473e = String.valueOf(parcel.readString());
            doFavoriteData.f111474f = String.valueOf(parcel.readString());
            doFavoriteData.f111475g = String.valueOf(parcel.readString());
            doFavoriteData.f111476h = String.valueOf(parcel.readString());
            doFavoriteData.f111477i = String.valueOf(parcel.readString());
            doFavoriteData.f111478j = String.valueOf(parcel.readString());
            doFavoriteData.f111479n = String.valueOf(parcel.readString());
            doFavoriteData.f111480o = String.valueOf(parcel.readString());
            return doFavoriteData;
        }

        public Object[] newArray(int i) {
            return new DoFavoriteData[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        String str = this.f111472d;
        if (str != null) {
            parcel.writeString(str);
            String str2 = this.f111473e;
            if (str2 != null) {
                parcel.writeString(str2);
                String str3 = this.f111474f;
                if (str3 != null) {
                    parcel.writeString(str3);
                    String str4 = this.f111475g;
                    if (str4 != null) {
                        parcel.writeString(str4);
                        String str5 = this.f111476h;
                        if (str5 != null) {
                            parcel.writeString(str5);
                            String str6 = this.f111477i;
                            if (str6 != null) {
                                parcel.writeString(str6);
                                String str7 = this.f111478j;
                                if (str7 != null) {
                                    parcel.writeString(str7);
                                    String str8 = this.f111479n;
                                    if (str8 != null) {
                                        parcel.writeString(str8);
                                        String str9 = this.f111480o;
                                        if (str9 != null) {
                                            parcel.writeString(str9);
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
                                C87412m.m108603p("displayName");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("pageKey");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("initUrl");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("cover");
                    throw null;
                }
            } else {
                C87412m.m108603p("excerptJson");
                throw null;
            }
        } else {
            C87412m.m108603p(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            throw null;
        }
    }
}
