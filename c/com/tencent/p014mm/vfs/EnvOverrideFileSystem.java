package com.tencent.p014mm.vfs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.FileSystem;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.tencent.mm.vfs.EnvOverrideFileSystem */
public class EnvOverrideFileSystem implements FileSystem {
    public static final Parcelable.Creator<EnvOverrideFileSystem> CREATOR = new C116210a();

    /* renamed from: d */
    public final FileSystem f348748d;

    /* renamed from: e */
    public final String f348749e;

    /* renamed from: f */
    public final Map<String, Object> f348750f;

    /* renamed from: com.tencent.mm.vfs.EnvOverrideFileSystem$a */
    public class C116210a implements Parcelable.Creator<EnvOverrideFileSystem> {
        public Object createFromParcel(Parcel parcel) {
            return new EnvOverrideFileSystem(parcel);
        }

        public Object[] newArray(int i) {
            return new EnvOverrideFileSystem[i];
        }
    }

    public EnvOverrideFileSystem(FileSystem fileSystem, Map<String, Object> map) {
        this.f348748d = fileSystem;
        this.f348749e = null;
        this.f348750f = C7071y.m7297a(map);
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00aa A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.tencent.p014mm.vfs.EnvOverrideFileSystem
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.tencent.mm.vfs.EnvOverrideFileSystem r10 = (com.tencent.p014mm.vfs.EnvOverrideFileSystem) r10
            com.tencent.mm.vfs.FileSystem r0 = r9.f348748d
            com.tencent.mm.vfs.FileSystem r2 = r10.f348748d
            boolean r0 = com.tencent.p014mm.vfs.C116299g2.m163849e(r0, r2)
            r2 = 1
            if (r0 == 0) goto L_0x00ab
            java.lang.String r0 = r9.f348749e
            java.lang.String r3 = r10.f348749e
            boolean r0 = com.tencent.p014mm.vfs.C116299g2.m163849e(r0, r3)
            if (r0 == 0) goto L_0x00ab
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.f348750f
            java.util.Map<java.lang.String, java.lang.Object> r10 = r10.f348750f
            if (r0 != r10) goto L_0x0026
        L_0x0023:
            r10 = 1
            goto L_0x00a8
        L_0x0026:
            if (r0 == 0) goto L_0x00a7
            if (r10 != 0) goto L_0x002c
            goto L_0x00a7
        L_0x002c:
            java.util.HashMap r0 = (java.util.HashMap) r0
            int r3 = r0.size()
            java.util.HashMap r10 = (java.util.HashMap) r10
            int r4 = r10.size()
            if (r3 == r4) goto L_0x003c
            goto L_0x00a7
        L_0x003c:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0044:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0023
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.Object r5 = r10.get(r4)
            if (r3 != 0) goto L_0x0067
            boolean r4 = r10.containsKey(r4)
            if (r4 != 0) goto L_0x0067
            goto L_0x00a7
        L_0x0067:
            if (r3 != r5) goto L_0x006b
            r3 = 1
            goto L_0x00a5
        L_0x006b:
            boolean r4 = r3 instanceof java.lang.String[]
            r6 = 0
            if (r4 == 0) goto L_0x007e
            r4 = r3
            java.lang.String[] r4 = (java.lang.String[]) r4
            int r7 = r4.length
            if (r7 == 0) goto L_0x007d
            if (r7 == r2) goto L_0x007a
            r4 = 1
            goto L_0x007f
        L_0x007a:
            r3 = r4[r1]
            goto L_0x007e
        L_0x007d:
            r3 = r6
        L_0x007e:
            r4 = 0
        L_0x007f:
            boolean r7 = r5 instanceof java.lang.String[]
            if (r7 == 0) goto L_0x0091
            r7 = r5
            java.lang.String[] r7 = (java.lang.String[]) r7
            int r8 = r7.length
            if (r8 == 0) goto L_0x0090
            if (r8 == r2) goto L_0x008d
            r6 = 1
            goto L_0x0092
        L_0x008d:
            r5 = r7[r1]
            goto L_0x0091
        L_0x0090:
            r5 = r6
        L_0x0091:
            r6 = 0
        L_0x0092:
            if (r4 == r6) goto L_0x0096
            r3 = 0
            goto L_0x00a5
        L_0x0096:
            if (r4 == 0) goto L_0x00a1
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.lang.String[] r5 = (java.lang.String[]) r5
            boolean r3 = java.util.Arrays.equals(r3, r5)
            goto L_0x00a5
        L_0x00a1:
            boolean r3 = com.tencent.p014mm.vfs.C116299g2.m163849e(r3, r5)
        L_0x00a5:
            if (r3 != 0) goto L_0x0044
        L_0x00a7:
            r10 = 0
        L_0x00a8:
            if (r10 == 0) goto L_0x00ab
            r1 = 1
        L_0x00ab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.EnvOverrideFileSystem.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i;
        Object[] objArr = {this.f348748d, this.f348749e};
        Pattern pattern = C116299g2.f349012a;
        int deepHashCode = Arrays.deepHashCode(objArr);
        int i2 = 0;
        for (Map.Entry next : this.f348750f.entrySet()) {
            String str = (String) next.getKey();
            int hashCode = str == null ? 0 : str.hashCode();
            Object value = next.getValue();
            if (value != null) {
                if (value instanceof String[]) {
                    Object[] objArr2 = (String[]) value;
                    if (objArr2.length != 0) {
                        if (objArr2.length == 1) {
                            value = objArr2[0];
                        } else {
                            i = Arrays.hashCode(objArr2);
                            i2 += i ^ hashCode;
                        }
                    }
                }
                i = value.hashCode();
                i2 += i ^ hashCode;
            }
            i = 0;
            i2 += i ^ hashCode;
        }
        return deepHashCode ^ i2;
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append("env");
        Map<String, Object> map = this.f348750f;
        if (map.isEmpty()) {
            str = "{}";
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append('{');
            for (Map.Entry next : map.entrySet()) {
                sb4.append((String) next.getKey());
                sb4.append(": ");
                Object value = next.getValue();
                if (value != null) {
                    if (value instanceof String[]) {
                        String[] strArr = (String[]) value;
                        int length = strArr.length;
                        if (length != 0) {
                            str3 = length != 1 ? Arrays.toString(strArr) : strArr[0];
                        }
                    } else {
                        str3 = value.toString();
                    }
                    sb4.append(str3);
                    sb4.append("; ");
                }
                str3 = "(deleted)";
                sb4.append(str3);
                sb4.append("; ");
            }
            sb4.setLength(sb4.length() - 2);
            sb4.append('}');
            str = sb4.toString();
        }
        sb.append(str);
        sb.append(" <- ");
        FileSystem fileSystem = this.f348748d;
        if (fileSystem == null) {
            str2 = FastJsonResponse.QUOTE + this.f348749e + FastJsonResponse.QUOTE;
        } else {
            str2 = fileSystem.toString();
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: v */
    public Object mo177578v(Map map) {
        FileSystem fileSystem = this.f348748d;
        if (fileSystem == null) {
            fileSystem = ((C116340x0) C116281f0.C116289i.f348994a.mo177788a()).mo177848c().get(this.f348749e);
        }
        if (fileSystem == null) {
            return NullFileSystem.m163697z();
        }
        HashMap hashMap = new HashMap(map);
        C116333v0.m163941c(hashMap, this.f348750f);
        return (FileSystem.C85995c) fileSystem.mo177578v(hashMap);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C116299g2.m163866v(parcel, EnvOverrideFileSystem.class, 1);
        parcel.writeParcelable(this.f348748d, i);
        parcel.writeString(this.f348749e);
        Map<String, Object> map = this.f348750f;
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            Object value = next.getValue();
            parcel.writeString((String) next.getKey());
            if (value instanceof String[]) {
                String[] strArr = (String[]) value;
                if (strArr.length > 0) {
                    parcel.writeStringArray(strArr);
                }
            }
            if (value instanceof String) {
                parcel.writeStringArray(new String[]{(String) value});
            } else {
                parcel.writeStringArray((String[]) null);
            }
        }
    }

    public EnvOverrideFileSystem(String str, Map<String, Object> map) {
        this.f348748d = null;
        this.f348749e = str;
        this.f348750f = C7071y.m7297a(map);
    }

    public EnvOverrideFileSystem(Parcel parcel) {
        C116299g2.m163845a(parcel, EnvOverrideFileSystem.class, 1);
        FileSystem fileSystem = (FileSystem) parcel.readParcelable(getClass().getClassLoader());
        this.f348748d = fileSystem;
        String readString = parcel.readString();
        this.f348749e = readString;
        if ((fileSystem == null) != (readString == null)) {
            HashMap hashMap = new HashMap();
            int readInt = parcel.readInt();
            while (true) {
                int i = readInt - 1;
                if (readInt > 0) {
                    String readString2 = parcel.readString();
                    String[] createStringArray = parcel.createStringArray();
                    if (createStringArray == null || createStringArray.length == 0) {
                        hashMap.put(readString2, (Object) null);
                    } else if (createStringArray.length == 1) {
                        hashMap.put(readString2, createStringArray[0]);
                    } else {
                        hashMap.put(readString2, createStringArray);
                    }
                    readInt = i;
                } else {
                    this.f348750f = hashMap;
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
