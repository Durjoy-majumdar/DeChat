package com.tencent.p014mm.search.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72837v1;
import gy3.C87412m;
import kotlin.Metadata;
import pe3.C89349b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/search/data/SimilarEmojiQueryModel;", "Landroid/os/Parcelable;", "emojisdk-api_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.search.data.SimilarEmojiQueryModel */
public final class SimilarEmojiQueryModel implements Parcelable {
    public static final Parcelable.Creator<SimilarEmojiQueryModel> CREATOR = new C72950a();

    /* renamed from: d */
    public String f283910d;

    /* renamed from: e */
    public String f283911e;

    /* renamed from: f */
    public String f283912f;

    /* renamed from: g */
    public long f283913g;

    /* renamed from: h */
    public int f283914h;

    /* renamed from: i */
    public String f283915i;

    /* renamed from: j */
    public C89349b f283916j;

    /* renamed from: n */
    public C89349b f283917n;

    /* renamed from: o */
    public boolean f283918o;

    /* renamed from: p */
    public C72837v1 f283919p;

    /* renamed from: com.tencent.mm.search.data.SimilarEmojiQueryModel$a */
    public static final class C72950a implements Parcelable.Creator<SimilarEmojiQueryModel> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
            return new SimilarEmojiQueryModel(String.valueOf(parcel.readString()), String.valueOf(parcel.readString()), String.valueOf(parcel.readString()), parcel.readLong(), parcel.readInt(), String.valueOf(parcel.readString()), (C89349b) null, (C89349b) null, true, (C72837v1) null);
        }

        public Object[] newArray(int i) {
            return new SimilarEmojiQueryModel[i];
        }
    }

    public SimilarEmojiQueryModel(String str, String str2, String str3, long j, int i, String str4, C89349b bVar, C89349b bVar2, boolean z, C72837v1 v1Var) {
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        C87412m.m108594g(str2, "emojiMD5");
        C87412m.m108594g(str3, "chatID");
        C87412m.m108594g(str4, "toUser");
        this.f283910d = str;
        this.f283911e = str2;
        this.f283912f = str3;
        this.f283913g = j;
        this.f283914h = i;
        this.f283915i = str4;
        this.f283916j = bVar;
        this.f283917n = bVar2;
        this.f283918o = z;
        this.f283919p = v1Var;
    }

    /* renamed from: a */
    public final boolean mo135501a() {
        String str = this.f283910d;
        return str == null || str.length() == 0;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimilarEmojiQueryModel)) {
            return false;
        }
        SimilarEmojiQueryModel similarEmojiQueryModel = (SimilarEmojiQueryModel) obj;
        return C87412m.m108589b(this.f283910d, similarEmojiQueryModel.f283910d) && C87412m.m108589b(this.f283911e, similarEmojiQueryModel.f283911e) && C87412m.m108589b(this.f283912f, similarEmojiQueryModel.f283912f) && this.f283913g == similarEmojiQueryModel.f283913g && this.f283914h == similarEmojiQueryModel.f283914h && C87412m.m108589b(this.f283915i, similarEmojiQueryModel.f283915i) && C87412m.m108589b(this.f283916j, similarEmojiQueryModel.f283916j) && C87412m.m108589b(this.f283917n, similarEmojiQueryModel.f283917n) && this.f283918o == similarEmojiQueryModel.f283918o && C87412m.m108589b(this.f283919p, similarEmojiQueryModel.f283919p);
    }

    public int hashCode() {
        long j = this.f283913g;
        int hashCode = ((((((((((this.f283910d.hashCode() * 31) + this.f283911e.hashCode()) * 31) + this.f283912f.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f283914h) * 31) + this.f283915i.hashCode()) * 31;
        C89349b bVar = this.f283916j;
        int i = 0;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        C89349b bVar2 = this.f283917n;
        int hashCode3 = (hashCode2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        boolean z = this.f283918o;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        C72837v1 v1Var = this.f283919p;
        if (v1Var != null) {
            i = v1Var.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "SimilarEmojiQueryModel(query=" + this.f283910d + ", emojiMD5=" + this.f283911e + ", chatID=" + this.f283912f + ", timestamp=" + this.f283913g + ", scene=" + this.f283914h + ", toUser=" + this.f283915i + ", panelEmojiCtx=" + this.f283916j + ", PageBuff=" + this.f283917n + ", enableSos=" + this.f283918o + ", panelCallbackImpl=" + this.f283919p + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "dest");
        parcel.writeString(this.f283910d);
        parcel.writeString(this.f283911e);
        parcel.writeString(this.f283912f);
        parcel.writeLong(this.f283913g);
        parcel.writeInt(this.f283914h);
        parcel.writeString(this.f283915i);
    }
}
