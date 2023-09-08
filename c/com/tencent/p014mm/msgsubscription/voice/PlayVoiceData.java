package com.tencent.p014mm.msgsubscription.voice;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/msgsubscription/voice/PlayVoiceData;", "Landroid/os/Parcelable;", "CREATOR", "a", "wxbiz-msgsubscription-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.msgsubscription.voice.PlayVoiceData */
public final class PlayVoiceData implements Parcelable {
    public static final C55396a CREATOR = new C55396a((C8480h) null);

    /* renamed from: d */
    public final long f157766d;

    /* renamed from: e */
    public final String f157767e;

    /* renamed from: f */
    public final int f157768f;

    /* renamed from: com.tencent.mm.msgsubscription.voice.PlayVoiceData$a */
    public static final class C55396a implements Parcelable.Creator<PlayVoiceData> {
        public C55396a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            C87412m.m108591d(readString);
            return new PlayVoiceData(readLong, readString, parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new PlayVoiceData[i];
        }
    }

    public PlayVoiceData(long j, String str, int i) {
        C87412m.m108594g(str, "url");
        this.f157766d = j;
        this.f157767e = str;
        this.f157768f = i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayVoiceData)) {
            return false;
        }
        PlayVoiceData playVoiceData = (PlayVoiceData) obj;
        return this.f157766d == playVoiceData.f157766d && C87412m.m108589b(this.f157767e, playVoiceData.f157767e) && this.f157768f == playVoiceData.f157768f;
    }

    public int hashCode() {
        long j = this.f157766d;
        return (((((int) (j ^ (j >>> 32))) * 31) + this.f157767e.hashCode()) * 31) + this.f157768f;
    }

    public String toString() {
        return "PlayVoiceData(id=" + this.f157766d + ", url=" + this.f157767e + ", action=" + this.f157768f + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeLong(this.f157766d);
        parcel.writeString(this.f157767e);
        parcel.writeInt(this.f157768f);
    }
}
