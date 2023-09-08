package zq1;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import dp1.C58381l;
import gy3.C87412m;
import o40.C61926c;
import up1.C65418l;
import uq1.C65437f;
import uq1.C65443g;
import wp1.C66166c;
import xq1.C66405c;

/* renamed from: zq1.a */
public final class C66959a extends C66405c {

    /* renamed from: e */
    public final C65418l f192363e;

    /* renamed from: f */
    public final int f192364f;

    /* renamed from: g */
    public final int f192365g;

    /* renamed from: h */
    public final String f192366h;

    /* renamed from: i */
    public final String f192367i = "LogPost.FinderDraftFailedStage";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66959a(C65418l lVar, int i, int i2, String str) {
        super("draft_" + lVar.field_localId);
        C87412m.m108594g(lVar, "draftItem");
        C87412m.m108594g(str, "errMsg");
        this.f192363e = lVar;
        this.f192364f = i;
        this.f192365g = i2;
        this.f192366h = str;
    }

    /* renamed from: a */
    public int mo75100a() {
        return 100;
    }

    /* renamed from: c */
    public void mo75101c() {
        String str = this.f192367i;
        Log.m105929w(str, "post failed, localId:" + this.f192363e.field_localId + ", errType %d, errCode %d, errMsg %s", Integer.valueOf(this.f192364f), Integer.valueOf(this.f192365g), this.f192366h);
        C65418l lVar = this.f192363e;
        lVar.field_localFlag = (lVar.field_localFlag | 2) & -2;
        C66166c.f190172a.mo90231b(lVar);
        C58381l.f167278a.mo83215a(this.f192363e);
        C65437f fVar = C65437f.f188296h;
        long j = this.f192363e.field_localId;
        fVar.getClass();
        C61926c.m72668M(new C65443g(fVar, j, false));
        boolean isLongVideo = this.f192363e.mo89514l2().isLongVideo();
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1718, 16, 1);
        if (isLongVideo) {
            nVar.mo175913w(1719, 16, 1);
        }
    }
}
