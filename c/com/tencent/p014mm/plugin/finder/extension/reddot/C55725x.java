package com.tencent.p014mm.plugin.finder.extension.reddot;

import java.util.Comparator;
import ux3.C65486b;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.x */
public final class C55725x<T> implements Comparator {
    public final int compare(T t, T t2) {
        return C65486b.m77169a(Long.valueOf(((C55718s0) t).field_time), Long.valueOf(((C55718s0) t2).field_time));
    }
}
