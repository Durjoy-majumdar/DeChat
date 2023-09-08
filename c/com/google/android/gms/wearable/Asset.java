package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

public class Asset extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Asset> CREATOR = new zze();
    private byte[] data;
    private Uri uri;
    private String zze;
    private ParcelFileDescriptor zzf;

    public Asset(byte[] bArr, String str, ParcelFileDescriptor parcelFileDescriptor, Uri uri2) {
        this.data = bArr;
        this.zze = str;
        this.zzf = parcelFileDescriptor;
        this.uri = uri2;
    }

    public static Asset createFromBytes(byte[] bArr) {
        Asserts.checkNotNull(bArr);
        return new Asset(bArr, (String) null, (ParcelFileDescriptor) null, (Uri) null);
    }

    public static Asset createFromFd(ParcelFileDescriptor parcelFileDescriptor) {
        Asserts.checkNotNull(parcelFileDescriptor);
        return new Asset((byte[]) null, (String) null, parcelFileDescriptor, (Uri) null);
    }

    public static Asset createFromRef(String str) {
        Asserts.checkNotNull(str);
        return new Asset((byte[]) null, str, (ParcelFileDescriptor) null, (Uri) null);
    }

    public static Asset createFromUri(Uri uri2) {
        Asserts.checkNotNull(uri2);
        return new Asset((byte[]) null, (String) null, (ParcelFileDescriptor) null, uri2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) obj;
        return Arrays.equals(this.data, asset.data) && Objects.equal(this.zze, asset.zze) && Objects.equal(this.zzf, asset.zzf) && Objects.equal(this.uri, asset.uri);
    }

    public final byte[] getData() {
        return this.data;
    }

    public String getDigest() {
        return this.zze;
    }

    public ParcelFileDescriptor getFd() {
        return this.zzf;
    }

    public Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.data, this.zze, this.zzf, this.uri});
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Asset[@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.zze == null) {
            str = ", nodigest";
        } else {
            sb.append(", ");
            str = this.zze;
        }
        sb.append(str);
        if (this.data != null) {
            sb.append(", size=");
            sb.append(this.data.length);
        }
        if (this.zzf != null) {
            sb.append(", fd=");
            sb.append(this.zzf);
        }
        if (this.uri != null) {
            sb.append(", uri=");
            sb.append(this.uri);
        }
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Asserts.checkNotNull(parcel);
        int i2 = i | 1;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, this.data, false);
        SafeParcelWriter.writeString(parcel, 3, getDigest(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzf, i2, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.uri, i2, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
