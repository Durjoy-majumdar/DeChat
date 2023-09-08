package ar1;

import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import te3.C64736tq2;
import up1.C37521f;
import wp1.C15585f;
import wq1.C66173b;
import wq1.C66174c;
import wq1.C66177f;
import xq1.C66408e;

/* renamed from: ar1.d */
public final class C54320d extends C66177f {

    /* renamed from: h */
    public final FinderItem f152454h;

    /* renamed from: i */
    public final String f152455i = "LogPost.FinderPostPrepareStage";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54320d(FinderItem finderItem) {
        super(String.valueOf(finderItem.getLocalId()));
        C87412m.m108594g(finderItem, "finderObj");
        this.f152454h = finderItem;
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
        String str = this.f152455i;
        Log.m105924i(str, "start localId:" + this.f152454h.getLocalId());
        C64736tq2 postInfo = this.f152454h.getPostInfo();
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        if (!((Boolean) C37521f.f99253P1.mo60266n()).booleanValue() || Log.getLogLevel() < 0) {
            C66174c cVar = C66174c.f190185a;
            if (cVar.mo90267b(postInfo)) {
                return new C54317a(this.f152454h, Integer.MIN_VALUE, Integer.MIN_VALUE, "try to post this feed too many times!");
            }
            boolean isLongVideo = this.f152454h.isLongVideo();
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175913w(1253, 17, 1);
            if (isLongVideo) {
                if ((1253 == 1253 ? 1523 : 0) > 0) {
                    nVar.mo175913w(1253 == 1253 ? 1523 : 0, 17, 1);
                }
            }
            cVar.mo90269d(this.f152454h);
            if (postInfo.f185647f != 1) {
                String str2 = this.f152455i;
                Log.m105924i(str2, "try post need upload task " + this.f152454h.getLocalId());
                FinderObject finderObject = this.f152454h.getFinderObject();
                if ((finderObject != null ? finderObject.objectDesc : null) == null) {
                    return new C54319c(this.f152454h, (byte[]) null, 2, (C8480h) null);
                }
                C66173b.f190184a.mo90262a(this.f152454h);
                if (C15585f.f42211a.mo14344g(this.f152454h.getLocalId())) {
                    return new FinderMediaProcessStage(this.f152454h);
                }
                Log.m105924i(this.f152455i, "post before mediaprocess cancel because feed is deleted");
                return new C54324i(this.f152454h, 1);
            } else if (C15585f.f42211a.mo14344g(this.f152454h.getLocalId())) {
                return new C54319c(this.f152454h, (byte[]) null, 2, (C8480h) null);
            } else {
                Log.m105924i(this.f152455i, "post before doscene2 cancel because feed is deleted");
                return new C54324i(this.f152454h, 1);
            }
        } else {
            Log.m105924i(this.f152455i, "debug failed");
            fVar.getClass();
            C37521f.f99253P1.mo60265l();
            return new C54317a(this.f152454h, Integer.MIN_VALUE, Integer.MIN_VALUE, "failed for debug");
        }
    }
}
