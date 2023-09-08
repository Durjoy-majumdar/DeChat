package zq1;

import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftMediaProcessStage;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import te3.C64736tq2;
import up1.C37521f;
import up1.C65418l;
import wq1.C66173b;
import wq1.C66174c;
import wq1.C66177f;
import xq1.C66408e;

/* renamed from: zq1.h */
public final class C66966h extends C66177f {

    /* renamed from: h */
    public C65418l f192396h;

    /* renamed from: i */
    public final String f192397i = "LogPost.FinderDraftPrepareStage";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66966h(C65418l lVar) {
        super("draft_" + lVar.field_localId);
        C87412m.m108594g(lVar, "draftItem");
        this.f192396h = lVar;
    }

    /* renamed from: a */
    public int mo75100a() {
        return 1;
    }

    /* renamed from: d */
    public void mo75102d(C66408e eVar) {
        C87412m.m108594g(eVar, "nextStage");
    }

    /* renamed from: e */
    public void mo75103e(C66408e eVar) {
        C87412m.m108594g(eVar, "nextStage");
    }

    /* renamed from: f */
    public void mo75104f(C66408e eVar) {
        C87412m.m108594g(eVar, "nextStage");
    }

    /* renamed from: g */
    public C66408e mo75105g() {
        Class cls = FinderCommonFeatureService.class;
        String str = this.f192397i;
        Log.m105924i(str, "start localId:" + this.f192396h.field_localId);
        C65418l qq = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Cx0().mo90229qq(this.f192396h.field_localId);
        if (qq == null) {
            String str2 = this.f192397i;
            Log.m105924i(str2, "draftItem is deleted, " + this.f192396h.mo89515m2());
            return new C66961c(this.f192396h, 1);
        }
        String str3 = this.f192397i;
        Log.m105924i(str3, "refresh draftItem, " + this.f192396h.mo89515m2());
        this.f192396h = qq;
        C64736tq2 postInfo = qq.getPostInfo();
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        if (!((Boolean) C37521f.f99253P1.mo60266n()).booleanValue() || Log.getLogLevel() < 0) {
            C66174c cVar = C66174c.f190185a;
            if (cVar.mo90266a(postInfo)) {
                return new C66959a(this.f192396h, -1, -1, "try to post this feed too many times!");
            }
            boolean isLongVideo = this.f192396h.mo89514l2().isLongVideo();
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175913w(1718, 17, 1);
            if (isLongVideo) {
                if ((1718 == 1718 ? 1719 : 0) > 0) {
                    nVar.mo175913w(1718 == 1718 ? 1719 : 0, 17, 1);
                }
            }
            cVar.mo90270e(this.f192396h);
            String str4 = this.f192397i;
            Log.m105924i(str4, "try post need upload task " + this.f192396h.field_localId);
            if (this.f192396h.mo89514l2().getFinderObject().objectDesc == null) {
                return new C66965g(this.f192396h, (byte[]) null);
            }
            C66173b.f190184a.mo90263b(this.f192396h);
            if (((FinderCommonFeatureService) C86312j.m106911c(cls)).Cx0().mo90229qq(this.f192396h.field_localId) != null) {
                return new FinderDraftMediaProcessStage(this.f192396h);
            }
            Log.m105924i(this.f192397i, "post before mediaprocess cancel because feed is deleted");
            return new C66961c(this.f192396h, 1);
        }
        Log.m105924i(this.f192397i, "debug failed");
        fVar.getClass();
        C37521f.f99253P1.mo60265l();
        return new C66959a(this.f192396h, -1, -1, "failed for debug");
    }
}
