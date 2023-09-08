package com.tencent.p014mm.mj_template.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/mj_template/api/MaasAlbumTemplateRequestParams;", "Landroid/os/Parcelable;", "plugin-mj-template.api_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.mj_template.api.MaasAlbumTemplateRequestParams */
public final class MaasAlbumTemplateRequestParams implements Parcelable {
    public static final Parcelable.Creator<MaasAlbumTemplateRequestParams> CREATOR = new C55284a();

    /* renamed from: d */
    public final List<GalleryItem$MediaItem> f157474d;

    /* renamed from: e */
    public final MJTemplateSession f157475e;

    /* renamed from: com.tencent.mm.mj_template.api.MaasAlbumTemplateRequestParams$a */
    public static final class C55284a implements Parcelable.Creator<MaasAlbumTemplateRequestParams> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readParcelable(MaasAlbumTemplateRequestParams.class.getClassLoader()));
            }
            return new MaasAlbumTemplateRequestParams(arrayList, MJTemplateSession.CREATOR.createFromParcel(parcel));
        }

        public Object[] newArray(int i) {
            return new MaasAlbumTemplateRequestParams[i];
        }
    }

    public MaasAlbumTemplateRequestParams(List<? extends GalleryItem$MediaItem> list, MJTemplateSession mJTemplateSession) {
        C87412m.m108594g(list, "mediaList");
        C87412m.m108594g(mJTemplateSession, "mjTemplateSession");
        this.f157474d = list;
        this.f157475e = mJTemplateSession;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaasAlbumTemplateRequestParams)) {
            return false;
        }
        MaasAlbumTemplateRequestParams maasAlbumTemplateRequestParams = (MaasAlbumTemplateRequestParams) obj;
        return C87412m.m108589b(this.f157474d, maasAlbumTemplateRequestParams.f157474d) && C87412m.m108589b(this.f157475e, maasAlbumTemplateRequestParams.f157475e);
    }

    public int hashCode() {
        return (this.f157474d.hashCode() * 31) + this.f157475e.hashCode();
    }

    public String toString() {
        return "MaasAlbumTemplateRequestParams(mediaList=" + this.f157474d + ", mjTemplateSession=" + this.f157475e + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        List<GalleryItem$MediaItem> list = this.f157474d;
        parcel.writeInt(list.size());
        for (GalleryItem$MediaItem writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        this.f157475e.writeToParcel(parcel, i);
    }
}
