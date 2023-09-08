package com.tencent.p014mm.plugin.finder.extension.reddot.render;

import if0.C46238a;
import java.util.LinkedList;
import te3.C50301lr3;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.render.d */
public final class C41413d implements C41411b {

    /* renamed from: a */
    public C50301lr3 f111503a;

    /* renamed from: b */
    public LinkedList<C50301lr3> f111504b = new LinkedList<>();

    /* renamed from: a */
    public boolean mo64500a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41413d)) {
            return false;
        }
        C41413d dVar = (C41413d) obj;
        C46238a.C46239a aVar = C46238a.f124644a;
        return aVar.mo71652a(this.f111503a, dVar.f111503a) && aVar.mo71653b(this.f111504b, dVar.f111504b);
    }
}
