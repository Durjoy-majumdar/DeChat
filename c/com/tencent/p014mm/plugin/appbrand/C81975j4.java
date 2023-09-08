package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.utils.C2032a1;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import jp3.C9486a;

/* renamed from: com.tencent.mm.plugin.appbrand.j4 */
public class C81975j4 implements C2032a1<C9486a> {

    /* renamed from: d */
    public final Set<C9486a> f240379d = new CopyOnWriteArraySet();

    /* renamed from: B7 */
    public void mo1963B7(C9486a aVar) {
        if (aVar != null) {
            ((CopyOnWriteArraySet) this.f240379d).remove(aVar);
        }
    }

    public final void keep(C9486a aVar) {
        if (aVar != null) {
            ((CopyOnWriteArraySet) this.f240379d).add(aVar);
        }
    }
}
