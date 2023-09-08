package com.tencent.p014mm.plugin.finder.newloader;

import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import di3.C86312j;
import kotlin.Metadata;
import on1.C11533k;
import p599lr.C61381b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0004"}, mo182094d2 = {"com/tencent/mm/plugin/finder/newloader/FinderDefaultLoaderActions$2", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onDestroy", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$2 */
public final class FinderDefaultLoaderActions$2 implements C0124r {

    /* renamed from: d */
    public final /* synthetic */ C11533k f15823d;

    public FinderDefaultLoaderActions$2(C11533k kVar) {
        this.f15823d = kVar;
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void onDestroy() {
        C11533k kVar = this.f15823d;
        kVar.getClass();
        ((C61381b) C86312j.m106911c(C61381b.class)).mo78545UQ().mo12417j(kVar);
        kVar.f33863g.dead();
        kVar.f33865i.dead();
        kVar.f33866j.dead();
        kVar.f33864h.dead();
    }
}
