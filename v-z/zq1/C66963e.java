package zq1;

import android.text.TextUtils;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftMediaProcessStage;
import com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.vlog.model.C96553q;
import com.tencent.p014mm.protocal.protobuf.FinderMediaReportObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import fy3.C32226l;
import gy3.C8477a0;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import p707tz.C65000f;
import rx3.C13598b0;
import te3.C101758az;
import te3.C64899zy;
import up1.C37521f;

/* renamed from: zq1.e */
public final class C66963e extends C87413o implements C32226l<C96553q, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderDraftMediaProcessStage f192377d;

    /* renamed from: e */
    public final /* synthetic */ C8478d0 f192378e;

    /* renamed from: f */
    public final /* synthetic */ int f192379f;

    /* renamed from: g */
    public final /* synthetic */ FinderMediaReportObject f192380g;

    /* renamed from: h */
    public final /* synthetic */ long f192381h;

    /* renamed from: i */
    public final /* synthetic */ String f192382i;

    /* renamed from: j */
    public final /* synthetic */ C101758az f192383j;

    /* renamed from: n */
    public final /* synthetic */ VideoTransPara f192384n;

    /* renamed from: o */
    public final /* synthetic */ C64899zy f192385o;

    /* renamed from: p */
    public final /* synthetic */ Object f192386p;

    /* renamed from: q */
    public final /* synthetic */ C8477a0 f192387q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66963e(FinderDraftMediaProcessStage finderDraftMediaProcessStage, C8478d0 d0Var, int i, FinderMediaReportObject finderMediaReportObject, long j, String str, C101758az azVar, VideoTransPara videoTransPara, C64899zy zyVar, Object obj, C8477a0 a0Var) {
        super(1);
        this.f192377d = finderDraftMediaProcessStage;
        this.f192378e = d0Var;
        this.f192379f = i;
        this.f192380g = finderMediaReportObject;
        this.f192381h = j;
        this.f192382i = str;
        this.f192383j = azVar;
        this.f192384n = videoTransPara;
        this.f192385o = zyVar;
        this.f192386p = obj;
        this.f192387q = a0Var;
    }

    public Object invoke(Object obj) {
        C96553q qVar = (C96553q) obj;
        C87412m.m108594g(qVar, "result");
        FinderDraftMediaProcessStage finderDraftMediaProcessStage = this.f192377d;
        finderDraftMediaProcessStage.f161474n = null;
        C8478d0 d0Var = this.f192378e;
        int i = -1;
        if (!qVar.f282582a) {
            String str = finderDraftMediaProcessStage.f161472i;
            Log.m105924i(str, "remuxer failed " + this.f192379f + " localId:" + this.f192377d.f161471h.field_localId);
            C115669n.INSTANCE.mo175913w(1718, 2, 1);
            this.f192380g.remuxTime = (int) Util.ticksToNow(this.f192381h);
            this.f192380g.remuxRetCode = -1;
        } else {
            this.f192380g.remuxTime = (int) Util.ticksToNow(this.f192381h);
            this.f192380g.remuxRetCode = 0;
            C115669n.INSTANCE.mo175913w(1718, 1, Util.ticksToNow(this.f192381h));
            String str2 = this.f192377d.f161472i;
            Log.m105924i(str2, "remuxer succ " + this.f192379f + ", cost: " + Util.ticksToNow(this.f192381h) + ", path:" + this.f192382i + " localId:" + this.f192377d.f161471h.field_localId);
            long l = C86013q1.m106451l(this.f192382i);
            long currentTicks = Util.currentTicks();
            FinderMediaProcessStage.C24279a aVar = FinderMediaProcessStage.f161539p;
            String str3 = this.f192382i;
            C101758az azVar = this.f192383j;
            i = aVar.mo41037a(str3, azVar.f297901i, azVar.f297902j, this.f192384n, this.f192377d.f161471h.field_localId, false);
            C37521f fVar = C37521f.f99374d;
            if (l > fVar.mo61164R() && fVar.mo61181g() != 1) {
                this.f192380g.zipTime = (int) Util.ticksToNow(currentTicks);
                if (i == 0) {
                    this.f192380g.zipRetCode = 1;
                } else {
                    this.f192380g.zipRetCode = 2;
                }
            }
            if (!TextUtils.isEmpty(this.f192385o.f186903h) || this.f192385o.f186899d.size() > 1 || this.f192385o.f186906n.f186611e.size() > 0 || this.f192385o.f186906n.f186612f) {
                ((C65000f) C86312j.m106911c(C65000f.class)).uw0(this.f192382i);
            }
        }
        d0Var.f27483d = i;
        Object obj2 = this.f192386p;
        C8477a0 a0Var = this.f192387q;
        synchronized (obj2) {
            a0Var.f27482d = true;
            obj2.notify();
        }
        return C13598b0.f38549a;
    }
}
