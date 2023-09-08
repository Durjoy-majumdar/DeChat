package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.MenuItem;
import jq3.C60905o;
import kotlin.Result;
import kotlin.ResultKt;
import nj3.C11184p0;
import pe1.C35464c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.ui.l4 */
public final class C56399l4 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C35464c<?> f161237d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f161238e;

    public C56399l4(C56394j4 j4Var, C35464c<?> cVar, C60905o oVar) {
        this.f161237d = cVar;
        this.f161238e = oVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C35464c<?> cVar = this.f161237d;
        C60905o oVar = this.f161238e;
        try {
            Result.Companion companion = Result.Companion;
            cVar.mo60264k(i);
            oVar.f173500B.notifyItemChanged(oVar.mo17363j());
            Result.m168114constructorimpl(C13598b0.f38549a);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m168114constructorimpl(ResultKt.createFailure(th));
        }
    }
}
