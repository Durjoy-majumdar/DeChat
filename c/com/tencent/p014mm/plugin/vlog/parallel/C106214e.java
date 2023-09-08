package com.tencent.p014mm.plugin.vlog.parallel;

import java.util.Comparator;
import ux3.C65486b;

/* renamed from: com.tencent.mm.plugin.vlog.parallel.e */
public final class C106214e<T> implements Comparator {
    public final int compare(T t, T t2) {
        return C65486b.m77169a(Integer.valueOf(((C106212c) t).getIndex()), Integer.valueOf(((C106212c) t2).getIndex()));
    }
}
