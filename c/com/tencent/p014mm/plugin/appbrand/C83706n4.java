package com.tencent.p014mm.plugin.appbrand;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.Comparator;

/* renamed from: com.tencent.mm.plugin.appbrand.n4 */
public final class C83706n4<E> extends ArrayList<E> {

    /* renamed from: d */
    public final Comparator<E> f244331d;

    public C83706n4(Comparator<E> comparator) {
        C87412m.m108594g(comparator, "comparator");
        this.f244331d = comparator;
    }

    public boolean add(E e) {
        int i;
        int size = super.size() - 1;
        int size2 = super.size();
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= size2) {
                i = 0;
                break;
            }
            int i4 = (i3 + size) >>> 1;
            if (this.f244331d.compare(e, get(i4)) < 0) {
                size = i4;
            } else {
                i3 = i4 + 1;
            }
            if (i3 == size) {
                if (this.f244331d.compare(e, get(i3)) >= 0) {
                    i3++;
                }
                i = i3;
                z = true;
            } else {
                i2++;
            }
        }
        if (!z) {
            i = super.size();
        }
        add(i, e);
        return true;
    }

    public final /* bridge */ E remove(int i) {
        return super.remove(i);
    }

    public final /* bridge */ int size() {
        return super.size();
    }
}
