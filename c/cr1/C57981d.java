package cr1;

import ar1.C54317a;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.upload.postlogic.mvstage.MvMediaProcessStage;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import te3.C64736tq2;
import up1.C37521f;
import wp1.C15585f;
import wq1.C66173b;
import wq1.C66174c;
import wq1.C66177f;
import xq1.C66408e;

/* renamed from: cr1.d */
public final class C57981d extends C66177f {

    /* renamed from: h */
    public final FinderItem f165917h;

    /* renamed from: i */
    public final String f165918i = "LogPost.MvPostPrepareStage";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57981d(FinderItem finderItem) {
        super(String.valueOf(finderItem.getLocalId()));
        C87412m.m108594g(finderItem, "finderObj");
        this.f165917h = finderItem;
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
        String str = this.f165918i;
        Log.m105924i(str, "start localId:" + this.f165917h.getLocalId());
        C64736tq2 postInfo = this.f165917h.getPostInfo();
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        if (!((Boolean) C37521f.f99253P1.mo60266n()).booleanValue() || Log.getLogLevel() < 0) {
            C66174c cVar = C66174c.f190185a;
            if (cVar.mo90267b(postInfo)) {
                return new C54317a(this.f165917h, Integer.MIN_VALUE, Integer.MIN_VALUE, "try to post this feed too many times!");
            }
            boolean isLongVideo = this.f165917h.isLongVideo();
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175913w(1253, 17, 1);
            if (isLongVideo) {
                if ((1253 == 1253 ? 1523 : 0) > 0) {
                    nVar.mo175913w(1253 == 1253 ? 1523 : 0, 17, 1);
                }
            }
            cVar.mo90269d(this.f165917h);
            C66173b.f190184a.mo90262a(this.f165917h);
            if (postInfo.f185647f == 1) {
                if (C15585f.f42211a.mo14344g(this.f165917h.getLocalId())) {
                    return new C57979c(this.f165917h);
                }
                Log.m105924i(this.f165918i, "post before doscene2 cancel because feed is deleted");
                return new C57985h(this.f165917h, 1);
            } else if (C15585f.f42211a.mo14344g(this.f165917h.getLocalId())) {
                return new MvMediaProcessStage(this.f165917h);
            } else {
                Log.m105924i(this.f165918i, "post before mediaprocess cancel because feed is deleted");
                return new C57985h(this.f165917h, 1);
            }
        } else {
            Log.m105924i(this.f165918i, "debug failed");
            fVar.getClass();
            C37521f.f99253P1.mo60265l();
            return new C54317a(this.f165917h, Integer.MIN_VALUE, Integer.MIN_VALUE, "failed for debug");
        }
    }
}
