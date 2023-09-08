package zq1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import up1.C65418l;
import xq1.C66414k;

/* renamed from: zq1.c */
public final class C66961c extends C66414k {

    /* renamed from: e */
    public final C65418l f192370e;

    /* renamed from: f */
    public final int f192371f;

    /* renamed from: g */
    public final String f192372g = "Finder.FinderDraftWaitStage";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66961c(C65418l lVar, int i) {
        super("draft_" + lVar.field_localId);
        C87412m.m108594g(lVar, "draftItem");
        this.f192370e = lVar;
        this.f192371f = i;
    }

    /* renamed from: a */
    public int mo75100a() {
        return 100;
    }

    /* renamed from: c */
    public void mo75101c() {
        String str = this.f192372g;
        Log.m105924i(str, "wait, reason:" + this.f192371f + ", localId:" + this.f192370e.field_localId);
    }
}
