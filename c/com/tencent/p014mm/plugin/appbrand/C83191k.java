package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81427p;
import java.util.Comparator;

/* renamed from: com.tencent.mm.plugin.appbrand.k */
public final class C83191k<T> implements Comparator {

    /* renamed from: d */
    public static final C83191k<T> f242991d = new C83191k<>();

    public int compare(Object obj, Object obj2) {
        long j = ((C81427p) obj2).f238968d;
        long j2 = ((C81427p) obj).f238968d;
        if (j - j2 > 0) {
            return 1;
        }
        return j == j2 ? 0 : -1;
    }
}
