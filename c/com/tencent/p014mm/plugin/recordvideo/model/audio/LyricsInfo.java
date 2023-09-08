package com.tencent.p014mm.plugin.recordvideo.model.audio;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import te3.C49044cs2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/model/audio/LyricsInfo;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.model.audio.LyricsInfo */
public final class LyricsInfo implements Parcelable {
    public static final C105941a CREATOR = new C105941a((C8480h) null);

    /* renamed from: d */
    public ArrayList<byte[]> f315278d;

    /* renamed from: com.tencent.mm.plugin.recordvideo.model.audio.LyricsInfo$a */
    public static final class C105941a implements Parcelable.Creator<LyricsInfo> {
        public C105941a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            LyricsInfo lyricsInfo = new LyricsInfo((List) null, 1, (C8480h) null);
            int readInt = parcel.readInt();
            for (int i = 0; i < readInt; i++) {
                byte[] bArr = new byte[parcel.readInt()];
                parcel.readByteArray(bArr);
                lyricsInfo.f315278d.add(bArr);
            }
            return lyricsInfo;
        }

        public Object[] newArray(int i) {
            return new LyricsInfo[i];
        }
    }

    public LyricsInfo() {
        this((List) null, 1, (C8480h) null);
    }

    public LyricsInfo(List<? extends C49044cs2> list) {
        C87412m.m108594g(list, "lyricDatas");
        this.f315278d = new ArrayList<>();
        for (C49044cs2 byteArray : list) {
            this.f315278d.add(byteArray.toByteArray());
        }
    }

    /* renamed from: a */
    public final ArrayList<byte[]> mo151175a() {
        return this.f315278d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeInt(this.f315278d.size());
        for (byte[] bArr : this.f315278d) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LyricsInfo(List list, int i, C8480h hVar) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
