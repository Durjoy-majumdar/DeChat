package rk0;

import android.os.ParcelUuid;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p1042u.C111055b;

/* renamed from: rk0.m */
public class C89999m {

    /* renamed from: a */
    public final int f258573a;

    /* renamed from: b */
    public final List<ParcelUuid> f258574b;

    /* renamed from: c */
    public final LinkedHashMap<Integer, byte[]> f258575c;

    /* renamed from: d */
    public final Map<ParcelUuid, byte[]> f258576d;

    /* renamed from: e */
    public final int f258577e;

    /* renamed from: f */
    public final String f258578f;

    /* renamed from: g */
    public final byte[] f258579g;

    /* renamed from: h */
    public final LinkedHashMap<Integer, byte[]> f258580h;

    public C89999m(List<ParcelUuid> list, Map<ParcelUuid, byte[]> map, int i, int i2, String str, byte[] bArr, LinkedHashMap<Integer, byte[]> linkedHashMap) {
        this.f258574b = list;
        this.f258575c = linkedHashMap;
        this.f258576d = map;
        this.f258578f = str;
        this.f258573a = i;
        this.f258577e = i2;
        this.f258579g = bArr;
        this.f258580h = linkedHashMap;
    }

    /* renamed from: a */
    public static C89999m m112593a(byte[] bArr) {
        byte[] bArr2 = bArr;
        if (bArr2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        C111055b bVar = new C111055b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = null;
        byte b = -1;
        byte b2 = -2147483648;
        int i = 0;
        while (true) {
            try {
                if (i < bArr2.length) {
                    int i2 = i + 1;
                    byte b3 = bArr2[i] & ExifInterface.MARKER;
                    if (b3 != 0) {
                        int i3 = b3 - 1;
                        int i4 = i2 + 1;
                        byte b4 = bArr2[i2] & ExifInterface.MARKER;
                        if (b4 == 22) {
                            byte[] bArr3 = new byte[2];
                            System.arraycopy(bArr2, i4, bArr3, 0, 2);
                            ParcelUuid a = C89994f.m112585a(bArr3);
                            int i5 = i3 - 2;
                            byte[] bArr4 = new byte[i5];
                            System.arraycopy(bArr2, i4 + 2, bArr4, 0, i5);
                            bVar.put(a, bArr4);
                        } else if (b4 != 255) {
                            switch (b4) {
                                case 1:
                                    b = bArr2[i4] & ExifInterface.MARKER;
                                    break;
                                case 2:
                                case 3:
                                    m112594b(bArr2, i4, i3, 2, arrayList);
                                    break;
                                case 4:
                                case 5:
                                    m112594b(bArr2, i4, i3, 4, arrayList);
                                    break;
                                case 6:
                                case 7:
                                    m112594b(bArr2, i4, i3, 16, arrayList);
                                    break;
                                case 8:
                                case 9:
                                    byte[] bArr5 = new byte[i3];
                                    System.arraycopy(bArr2, i4, bArr5, 0, i3);
                                    str = new String(bArr5);
                                    break;
                                case 10:
                                    b2 = bArr2[i4];
                                    break;
                            }
                        } else {
                            int i6 = ((bArr2[i4 + 1] & ExifInterface.MARKER) << 8) + (255 & bArr2[i4]);
                            int i7 = i3 - 2;
                            byte[] bArr6 = new byte[i7];
                            System.arraycopy(bArr2, i4 + 2, bArr6, 0, i7);
                            byte[] bArr7 = (byte[]) linkedHashMap.get(Integer.valueOf(i6));
                            if (bArr7 != null) {
                                byte[] bArr8 = new byte[(bArr7.length + i7)];
                                System.arraycopy(bArr7, 0, bArr8, 0, bArr7.length);
                                System.arraycopy(bArr6, 0, bArr8, bArr7.length, i7);
                                linkedHashMap.put(Integer.valueOf(i6), bArr8);
                            } else {
                                linkedHashMap.put(Integer.valueOf(i6), bArr6);
                            }
                        }
                        i = i3 + i4;
                    }
                }
            } catch (Exception unused) {
                Arrays.toString(bArr);
                return new C89999m((List<ParcelUuid>) null, (Map<ParcelUuid, byte[]>) null, -1, Integer.MIN_VALUE, (String) null, bArr, linkedHashMap);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new C89999m(arrayList, bVar, b, b2, str, bArr, linkedHashMap);
    }

    /* renamed from: b */
    public static int m112594b(byte[] bArr, int i, int i2, int i3, List<ParcelUuid> list) {
        while (i2 > 0) {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i, bArr2, 0, i3);
            list.add(C89994f.m112585a(bArr2));
            i2 -= i3;
            i += i3;
        }
        return i;
    }

    /* renamed from: c */
    public static <T> String m112595c(Map<T, byte[]> map) {
        if (map == null) {
            return "null";
        }
        if (map.isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        Iterator<Map.Entry<T, byte[]>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Object key = it.next().getKey();
            sb.append(key);
            sb.append("=");
            sb.append(Arrays.toString(map.get(key)));
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public String toString() {
        return "ScanRecord [mAdvertiseFlags=" + this.f258573a + ", mServiceUuids=" + this.f258574b + ", mServiceData=" + m112595c(this.f258576d) + ", mTxPowerLevel=" + this.f258577e + ", mDeviceName=" + this.f258578f + ", mManufacturerSpecificDataFixed=" + m112595c(this.f258580h) + "]";
    }
}
