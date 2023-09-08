package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public final class PasswordSpecification extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<PasswordSpecification> CREATOR = new zzm();
    public static final PasswordSpecification zzdg = new zzd().zzd(12, 16).zze("abcdefghijkmnopqrstxyzABCDEFGHJKLMNPQRSTXY3456789").zzd("abcdefghijkmnopqrstxyz", 1).zzd("ABCDEFGHJKLMNPQRSTXY", 1).zzd("3456789", 1).zzj();
    private static final PasswordSpecification zzdh = new zzd().zzd(12, 16).zze("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890").zzd("abcdefghijklmnopqrstuvwxyz", 1).zzd("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 1).zzd("1234567890", 1).zzj();
    private final String zzdi;
    private final List<String> zzdj;
    private final List<Integer> zzdk;
    private final int zzdl;
    private final int zzdm;
    private final int[] zzdn;
    private final Random zzdo;

    public static class zzd {
        private final List<String> zzdj = new ArrayList();
        private final List<Integer> zzdk = new ArrayList();
        private int zzdl = 12;
        private int zzdm = 16;
        private final TreeSet<Character> zzdp = new TreeSet<>();

        private static TreeSet<Character> zzd(String str, String str2) {
            if (!TextUtils.isEmpty(str)) {
                TreeSet<Character> treeSet = new TreeSet<>();
                char[] charArray = str.toCharArray();
                int length = charArray.length;
                int i = 0;
                while (i < length) {
                    char c = charArray[i];
                    if (!PasswordSpecification.zzd(c, 32, 126)) {
                        treeSet.add(Character.valueOf(c));
                        i++;
                    } else {
                        throw new zze(String.valueOf(str2).concat(" must only contain ASCII printable characters"));
                    }
                }
                return treeSet;
            }
            throw new zze(String.valueOf(str2).concat(" cannot be null or empty"));
        }

        public final zzd zzd(int i, int i2) {
            this.zzdl = 12;
            this.zzdm = 16;
            return this;
        }

        public final zzd zzd(String str, int i) {
            this.zzdj.add(PasswordSpecification.zzd(zzd(str, "requiredChars")));
            this.zzdk.add(1);
            return this;
        }

        public final zzd zze(String str) {
            this.zzdp.addAll(zzd(str, "allowedChars"));
            return this;
        }

        public final PasswordSpecification zzj() {
            if (!this.zzdp.isEmpty()) {
                int i = 0;
                for (Integer intValue : this.zzdk) {
                    i += intValue.intValue();
                }
                if (i <= this.zzdm) {
                    boolean[] zArr = new boolean[95];
                    for (String charArray : this.zzdj) {
                        char[] charArray2 = charArray.toCharArray();
                        int length = charArray2.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                char c = charArray2[i2];
                                int i3 = c - ' ';
                                if (!zArr[i3]) {
                                    zArr[i3] = true;
                                    i2++;
                                } else {
                                    StringBuilder sb = new StringBuilder(58);
                                    sb.append("character ");
                                    sb.append(c);
                                    sb.append(" occurs in more than one required character set");
                                    throw new zze(sb.toString());
                                }
                            }
                        }
                    }
                    return new PasswordSpecification(PasswordSpecification.zzd(this.zzdp), this.zzdj, this.zzdk, this.zzdl, this.zzdm);
                }
                throw new zze("required character count cannot be greater than the max password size");
            }
            throw new zze("no allowed characters specified");
        }
    }

    public static class zze extends Error {
        public zze(String str) {
            super(str);
        }
    }

    public PasswordSpecification(String str, List<String> list, List<Integer> list2, int i, int i2) {
        this.zzdi = str;
        List<T> unmodifiableList = Collections.unmodifiableList(list);
        this.zzdj = unmodifiableList;
        this.zzdk = Collections.unmodifiableList(list2);
        this.zzdl = i;
        this.zzdm = i2;
        int[] iArr = new int[95];
        Arrays.fill(iArr, -1);
        int i3 = 0;
        for (T charArray : unmodifiableList) {
            char[] charArray2 = charArray.toCharArray();
            int length = charArray2.length;
            for (int i4 = 0; i4 < length; i4++) {
                iArr[charArray2[i4] - ' '] = i3;
            }
            i3++;
        }
        this.zzdn = iArr;
        this.zzdo = new SecureRandom();
    }

    /* access modifiers changed from: private */
    public static String zzd(Collection<Character> collection) {
        char[] cArr = new char[collection.size()];
        int i = 0;
        for (Character charValue : collection) {
            cArr[i] = charValue.charValue();
            i++;
        }
        return new String(cArr);
    }

    /* access modifiers changed from: private */
    public static boolean zzd(int i, int i2, int i3) {
        return i < 32 || i > 126;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzdi, false);
        SafeParcelWriter.writeStringList(parcel, 2, this.zzdj, false);
        SafeParcelWriter.writeIntegerList(parcel, 3, this.zzdk, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzdl);
        SafeParcelWriter.writeInt(parcel, 5, this.zzdm);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
