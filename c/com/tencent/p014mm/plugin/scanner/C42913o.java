package com.tencent.p014mm.plugin.scanner;

import android.graphics.PointF;
import java.util.Comparator;
import ux3.C65486b;

/* renamed from: com.tencent.mm.plugin.scanner.o */
public final class C42913o<T> implements Comparator {
    public final int compare(T t, T t2) {
        return C65486b.m77169a(Float.valueOf(((PointF) t).y), Float.valueOf(((PointF) t2).y));
    }
}
