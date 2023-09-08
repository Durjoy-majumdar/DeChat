package ru3;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: ru3.e */
public final class C110658e {
    /* renamed from: a */
    public static int m150642a(Object... objArr) {
        int hashCode;
        if (objArr == null || objArr.length == 0) {
            return 0;
        }
        int i = 0;
        for (boolean[] zArr : objArr) {
            if (zArr != null) {
                if (zArr instanceof Number) {
                    hashCode = zArr.hashCode();
                } else if (zArr instanceof boolean[]) {
                    hashCode = Arrays.hashCode(zArr);
                } else if (zArr instanceof byte[]) {
                    hashCode = Arrays.hashCode((byte[]) zArr);
                } else if (zArr instanceof char[]) {
                    hashCode = Arrays.hashCode((char[]) zArr);
                } else if (zArr instanceof short[]) {
                    hashCode = Arrays.hashCode((short[]) zArr);
                } else if (zArr instanceof int[]) {
                    hashCode = Arrays.hashCode((int[]) zArr);
                } else if (zArr instanceof long[]) {
                    hashCode = Arrays.hashCode((long[]) zArr);
                } else if (zArr instanceof float[]) {
                    hashCode = Arrays.hashCode((float[]) zArr);
                } else if (zArr instanceof double[]) {
                    hashCode = Arrays.hashCode((double[]) zArr);
                } else if (zArr instanceof Object[]) {
                    hashCode = Arrays.hashCode((Object[]) zArr);
                } else if (zArr.getClass().isArray()) {
                    for (int i2 = 0; i2 < Array.getLength(zArr); i2++) {
                        i += m150642a(Array.get(zArr, i2));
                    }
                } else {
                    hashCode = zArr.hashCode();
                }
                i += hashCode;
            }
        }
        return i;
    }
}
