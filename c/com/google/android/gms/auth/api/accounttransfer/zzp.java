package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcelable;

public final class zzp implements Parcelable.Creator<zzo> {
    /* JADX WARNING: type inference failed for: r1v7, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r10) {
        /*
            r9 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r10)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1 = 0
            r3 = 0
            r4 = r1
            r6 = r4
            r5 = 0
        L_0x000e:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L_0x004e
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r10)
            int r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r8 = 1
            if (r7 == r8) goto L_0x0042
            r8 = 2
            if (r7 == r8) goto L_0x003b
            r8 = 3
            if (r7 == r8) goto L_0x0036
            r8 = 4
            if (r7 == r8) goto L_0x002c
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r10, r1)
            goto L_0x000e
        L_0x002c:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.accounttransfer.zzr> r6 = com.google.android.gms.auth.api.accounttransfer.zzr.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r10, r1, r6)
            r6 = r1
            com.google.android.gms.auth.api.accounttransfer.zzr r6 = (com.google.android.gms.auth.api.accounttransfer.zzr) r6
            goto L_0x0046
        L_0x0036:
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r10, r1)
            goto L_0x0046
        L_0x003b:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.accounttransfer.zzu> r4 = com.google.android.gms.auth.api.accounttransfer.zzu.CREATOR
            java.util.ArrayList r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(r10, r1, r4)
            goto L_0x0046
        L_0x0042:
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r10, r1)
        L_0x0046:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r2.add(r1)
            goto L_0x000e
        L_0x004e:
            int r1 = r10.dataPosition()
            if (r1 != r0) goto L_0x005b
            com.google.android.gms.auth.api.accounttransfer.zzo r10 = new com.google.android.gms.auth.api.accounttransfer.zzo
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return r10
        L_0x005b:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException r1 = new com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException
            r2 = 37
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Overread allowed size end="
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0, r10)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.accounttransfer.zzp.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
