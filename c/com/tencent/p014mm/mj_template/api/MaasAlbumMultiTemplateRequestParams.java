package com.tencent.p014mm.mj_template.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/mj_template/api/MaasAlbumMultiTemplateRequestParams;", "Landroid/os/Parcelable;", "plugin-mj-template.api_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.mj_template.api.MaasAlbumMultiTemplateRequestParams */
public final class MaasAlbumMultiTemplateRequestParams implements Parcelable {
    public static final Parcelable.Creator<MaasAlbumMultiTemplateRequestParams> CREATOR = new C55283a();

    /* renamed from: d */
    public final List<GalleryItem$MediaItem> f157469d;

    /* renamed from: e */
    public final boolean f157470e;

    /* renamed from: f */
    public final boolean f157471f;

    /* renamed from: g */
    public final boolean f157472g;

    /* renamed from: h */
    public final MaasAlbumTemplateSnsFeedInfo f157473h;

    /* renamed from: com.tencent.mm.mj_template.api.MaasAlbumMultiTemplateRequestParams$a */
    public static final class C55283a implements Parcelable.Creator<MaasAlbumMultiTemplateRequestParams> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readParcelable(MaasAlbumMultiTemplateRequestParams.class.getClassLoader()));
            }
            return new MaasAlbumMultiTemplateRequestParams(arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : MaasAlbumTemplateSnsFeedInfo.CREATOR.createFromParcel(parcel));
        }

        public Object[] newArray(int i) {
            return new MaasAlbumMultiTemplateRequestParams[i];
        }
    }

    public MaasAlbumMultiTemplateRequestParams(List<? extends GalleryItem$MediaItem> list, boolean z, boolean z2, boolean z3, MaasAlbumTemplateSnsFeedInfo maasAlbumTemplateSnsFeedInfo) {
        C87412m.m108594g(list, "mediaList");
        this.f157469d = list;
        this.f157470e = z;
        this.f157471f = z2;
        this.f157472g = z3;
        this.f157473h = maasAlbumTemplateSnsFeedInfo;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaasAlbumMultiTemplateRequestParams)) {
            return false;
        }
        MaasAlbumMultiTemplateRequestParams maasAlbumMultiTemplateRequestParams = (MaasAlbumMultiTemplateRequestParams) obj;
        return C87412m.m108589b(this.f157469d, maasAlbumMultiTemplateRequestParams.f157469d) && this.f157470e == maasAlbumMultiTemplateRequestParams.f157470e && this.f157471f == maasAlbumMultiTemplateRequestParams.f157471f && this.f157472g == maasAlbumMultiTemplateRequestParams.f157472g && C87412m.m108589b(this.f157473h, maasAlbumMultiTemplateRequestParams.f157473h);
    }

    public int hashCode() {
        int hashCode = this.f157469d.hashCode() * 31;
        boolean z = this.f157470e;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f157471f;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f157472g;
        if (!z4) {
            z2 = z4;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        MaasAlbumTemplateSnsFeedInfo maasAlbumTemplateSnsFeedInfo = this.f157473h;
        return i3 + (maasAlbumTemplateSnsFeedInfo == null ? 0 : maasAlbumTemplateSnsFeedInfo.hashCode());
    }

    public String toString() {
        return "MaasAlbumMultiTemplateRequestParams(mediaList=" + this.f157469d + ", manageSdk=" + this.f157470e + ", snsPhotoTheme=" + this.f157471f + ", directPost=" + this.f157472g + ", snsFeedInfo=" + this.f157473h + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        List<GalleryItem$MediaItem> list = this.f157469d;
        parcel.writeInt(list.size());
        for (GalleryItem$MediaItem writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        parcel.writeInt(this.f157470e ? 1 : 0);
        parcel.writeInt(this.f157471f ? 1 : 0);
        parcel.writeInt(this.f157472g ? 1 : 0);
        MaasAlbumTemplateSnsFeedInfo maasAlbumTemplateSnsFeedInfo = this.f157473h;
        if (maasAlbumTemplateSnsFeedInfo == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        maasAlbumTemplateSnsFeedInfo.writeToParcel(parcel, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MaasAlbumMultiTemplateRequestParams(List list, boolean z, boolean z2, boolean z3, MaasAlbumTemplateSnsFeedInfo maasAlbumTemplateSnsFeedInfo, int i, C8480h hVar) {
        this(list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? null : maasAlbumTemplateSnsFeedInfo);
    }
}
