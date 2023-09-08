package com.tencent.mmkv;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.IOException;

public final class ParcelableMMKV implements Parcelable {
    public static final Parcelable.Creator<ParcelableMMKV> CREATOR = new C116347a();

    /* renamed from: d */
    public final String f349138d;

    /* renamed from: e */
    public int f349139e;

    /* renamed from: f */
    public int f349140f;

    /* renamed from: g */
    public String f349141g;

    /* renamed from: com.tencent.mmkv.ParcelableMMKV$a */
    public class C116347a implements Parcelable.Creator<ParcelableMMKV> {
        public Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            if (parcelFileDescriptor == null || parcelFileDescriptor2 == null) {
                return null;
            }
            return new ParcelableMMKV(readString, parcelFileDescriptor.detachFd(), parcelFileDescriptor2.detachFd(), readString2, (C116347a) null);
        }

        public Object[] newArray(int i) {
            return new ParcelableMMKV[i];
        }
    }

    public ParcelableMMKV(MMKV mmkv) {
        this.f349139e = -1;
        this.f349140f = -1;
        this.f349141g = null;
        this.f349138d = mmkv.mmapID();
        this.f349139e = mmkv.ashmemFD();
        this.f349140f = mmkv.ashmemMetaFD();
        this.f349141g = mmkv.cryptKey();
    }

    public int describeContents() {
        return 1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeString(this.f349138d);
            ParcelFileDescriptor fromFd = ParcelFileDescriptor.fromFd(this.f349139e);
            ParcelFileDescriptor fromFd2 = ParcelFileDescriptor.fromFd(this.f349140f);
            int i2 = i | 1;
            fromFd.writeToParcel(parcel, i2);
            fromFd2.writeToParcel(parcel, i2);
            String str = this.f349141g;
            if (str != null) {
                parcel.writeString(str);
            }
        } catch (IOException unused) {
        }
    }

    public ParcelableMMKV(String str, int i, int i2, String str2, C116347a aVar) {
        this.f349138d = str;
        this.f349139e = i;
        this.f349140f = i2;
        this.f349141g = str2;
    }
}
