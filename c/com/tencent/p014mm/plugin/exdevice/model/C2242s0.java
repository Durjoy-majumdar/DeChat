package com.tencent.p014mm.plugin.exdevice.model;

import android.util.SparseArray;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.exdevice.model.s0 */
public final class C2242s0 {

    /* renamed from: b */
    public static C2242s0 f12311b;

    /* renamed from: a */
    public SparseArray<List<C2243a>> f12312a = new SparseArray<>();

    /* renamed from: com.tencent.mm.plugin.exdevice.model.s0$a */
    public interface C2243a {
        /* renamed from: a */
        void mo2128a(int i, Object... objArr);
    }

    /* renamed from: a */
    public static C2242s0 m2051a() {
        if (f12311b == null) {
            f12311b = new C2242s0();
        }
        return f12311b;
    }

    /* renamed from: b */
    public void mo2131b(int i, Object... objArr) {
        List list = this.f12312a.get(i);
        if (list != null && list.size() != 0) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C2243a) list.get(i2)).mo2128a(i, objArr);
            }
        }
    }

    /* renamed from: c */
    public boolean mo2132c(int i, C2243a aVar) {
        if (aVar == null) {
            return false;
        }
        List list = this.f12312a.get(i);
        if (list == null) {
            list = new LinkedList();
            this.f12312a.put(i, list);
        } else if (list.contains(aVar)) {
            return false;
        }
        return list.add(aVar);
    }

    /* renamed from: d */
    public boolean mo2133d(int i, C2243a aVar) {
        List list = this.f12312a.get(i);
        if (list == null) {
            return false;
        }
        list.remove(aVar);
        if (list.size() != 0) {
            return false;
        }
        this.f12312a.remove(i);
        return false;
    }
}
