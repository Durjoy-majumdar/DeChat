package com.google.android.gms.wearable;

import android.os.Parcelable;

public final class zzh implements Parcelable.Creator<PutDataRequest> {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r11) {
        /*
            r10 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r11)
            r1 = 0
            r2 = 0
            r5 = r1
            r6 = r5
            r7 = r6
            r8 = r2
        L_0x000b:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L_0x0042
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r11)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r3 = 2
            if (r2 == r3) goto L_0x0038
            r3 = 4
            if (r2 == r3) goto L_0x0033
            r3 = 5
            if (r2 == r3) goto L_0x002e
            r3 = 6
            if (r2 == r3) goto L_0x0029
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r11, r1)
            goto L_0x000b
        L_0x0029:
            long r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r11, r1)
            goto L_0x000b
        L_0x002e:
            byte[] r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r11, r1)
            goto L_0x000b
        L_0x0033:
            android.os.Bundle r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r11, r1)
            goto L_0x000b
        L_0x0038:
            android.os.Parcelable$Creator r2 = android.net.Uri.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r11, r1, r2)
            r5 = r1
            android.net.Uri r5 = (android.net.Uri) r5
            goto L_0x000b
        L_0x0042:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r11, r0)
            com.google.android.gms.wearable.PutDataRequest r11 = new com.google.android.gms.wearable.PutDataRequest
            r4 = r11
            r4.<init>(r5, r6, r7, r8)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.zzh.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PutDataRequest[i];
    }
}
