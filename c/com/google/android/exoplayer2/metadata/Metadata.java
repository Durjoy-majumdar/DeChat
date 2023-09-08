package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new C16947a();

    /* renamed from: d */
    public final Entry[] f45801d;

    public interface Entry extends Parcelable {
    }

    /* renamed from: com.google.android.exoplayer2.metadata.Metadata$a */
    public static class C16947a implements Parcelable.Creator<Metadata> {
        public Object createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        public Object[] newArray(int i) {
            return new Metadata[0];
        }
    }

    public Metadata(Entry... entryArr) {
        this.f45801d = entryArr == null ? new Entry[0] : entryArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f45801d, ((Metadata) obj).f45801d);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f45801d);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f45801d.length);
        for (Entry writeParcelable : this.f45801d) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public Metadata(List<? extends Entry> list) {
        if (list != null) {
            Entry[] entryArr = new Entry[list.size()];
            this.f45801d = entryArr;
            list.toArray(entryArr);
            return;
        }
        this.f45801d = new Entry[0];
    }

    public Metadata(Parcel parcel) {
        this.f45801d = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Entry[] entryArr = this.f45801d;
            if (i < entryArr.length) {
                entryArr[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }
}
