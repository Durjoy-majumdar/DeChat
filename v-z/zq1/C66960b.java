package zq1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import up1.C65418l;
import xq1.C66412i;

/* renamed from: zq1.b */
public final class C66960b extends C66412i {

    /* renamed from: e */
    public final C65418l f192368e;

    /* renamed from: f */
    public final String f192369f = "Finder.FinderDraftSuccessStage";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66960b(C65418l lVar) {
        super("draft_" + lVar.field_localId);
        C87412m.m108594g(lVar, "draftItem");
        this.f192368e = lVar;
    }

    /* renamed from: a */
    public int mo75100a() {
        return 100;
    }

    /* renamed from: c */
    public void mo75101c() {
        String str = this.f192369f;
        Log.m105924i(str, "succ, localId:" + this.f192368e.field_localId);
    }
}
