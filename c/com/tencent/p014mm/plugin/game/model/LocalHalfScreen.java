package com.tencent.p014mm.plugin.game.model;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/game/model/LocalHalfScreen;", "Landroid/os/Parcelable;", "plugin-game_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.game.model.LocalHalfScreen */
public final class LocalHalfScreen implements Parcelable {
    public static final Parcelable.Creator<LocalHalfScreen> CREATOR = new C42024a();

    /* renamed from: d */
    public final int f113207d;

    /* renamed from: e */
    public final int f113208e;

    /* renamed from: f */
    public final float f113209f;

    /* renamed from: com.tencent.mm.plugin.game.model.LocalHalfScreen$a */
    public static final class C42024a implements Parcelable.Creator<LocalHalfScreen> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new LocalHalfScreen(parcel.readInt(), parcel.readInt(), parcel.readFloat());
        }

        public Object[] newArray(int i) {
            return new LocalHalfScreen[i];
        }
    }

    public LocalHalfScreen(int i, int i2, float f) {
        this.f113207d = i;
        this.f113208e = i2;
        this.f113209f = f;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalHalfScreen)) {
            return false;
        }
        LocalHalfScreen localHalfScreen = (LocalHalfScreen) obj;
        return this.f113207d == localHalfScreen.f113207d && this.f113208e == localHalfScreen.f113208e && C87412m.m108589b(Float.valueOf(this.f113209f), Float.valueOf(localHalfScreen.f113209f));
    }

    public int hashCode() {
        return (((this.f113207d * 31) + this.f113208e) * 31) + Float.floatToIntBits(this.f113209f);
    }

    public String toString() {
        return "LocalHalfScreen(type=" + this.f113207d + ", screenHeightDp=" + this.f113208e + ", screenHeightPercent=" + this.f113209f + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeInt(this.f113207d);
        parcel.writeInt(this.f113208e);
        parcel.writeFloat(this.f113209f);
    }

    public LocalHalfScreen() {
        this(0, 0, 0.0f);
    }
}
