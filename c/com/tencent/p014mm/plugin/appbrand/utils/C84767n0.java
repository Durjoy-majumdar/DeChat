package com.tencent.p014mm.plugin.appbrand.utils;

import android.util.SparseArray;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.n0 */
public final class C84767n0 {
    /* renamed from: a */
    public static final <T> T m104424a(SparseArray<T> sparseArray, int i) {
        C87412m.m108594g(sparseArray, "<this>");
        int indexOfKey = sparseArray.indexOfKey(i);
        if (indexOfKey < 0) {
            return null;
        }
        T valueAt = sparseArray.valueAt(indexOfKey);
        sparseArray.removeAt(indexOfKey);
        return valueAt;
    }
}
