package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import androidx.recyclerview.widget.C54248l;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.i0 */
public abstract class C84637i0<T> extends C54248l.C54250b {

    /* renamed from: a */
    public final List<T> f246940a;

    /* renamed from: b */
    public final List<T> f246941b;

    public C84637i0(List<T> list, List<T> list2) {
        this.f246940a = list;
        this.f246941b = list2;
    }

    /* renamed from: d */
    public final int mo11468d() {
        List<T> list = this.f246941b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: e */
    public final int mo11469e() {
        List<T> list = this.f246940a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
