package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread;

import com.tencent.p014mm.pluginsdk.model.C19428d;
import gy3.C87412m;
import java.util.Comparator;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.c */
public final class C18454c<T> implements Comparator {

    /* renamed from: d */
    public final /* synthetic */ boolean f51227d;

    public C18454c(boolean z) {
        this.f51227d = z;
    }

    public int compare(Object obj, Object obj2) {
        C18468r rVar = (C18468r) obj;
        C18468r rVar2 = (C18468r) obj2;
        if (!this.f51227d || !C87412m.m108589b(C19428d.f54877v, rVar.f354229d)) {
            if (this.f51227d && C87412m.m108589b(C19428d.f54877v, rVar2.f354229d)) {
                return 1;
            }
            C19428d dVar = C19428d.f54856a;
            rVar.f51257u = dVar.mo25184s(rVar.f354229d, rVar.f354232g);
            boolean s = dVar.mo25184s(rVar2.f354229d, rVar2.f354232g);
            rVar2.f51257u = s;
            boolean z = rVar.f51257u;
            if (z == s) {
                return 0;
            }
            if (z) {
                return 1;
            }
        }
        return -1;
    }
}
