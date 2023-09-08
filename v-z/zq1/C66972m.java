package zq1;

import android.text.TextUtils;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.MvDraftMediaProcessStage;
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

/* renamed from: zq1.m */
public final class C66972m extends C87413o implements C32226l<C96553q, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C8478d0 f192413d;

    /* renamed from: e */
    public final /* synthetic */ MvDraftMediaProcessStage f192414e;

    /* renamed from: f */
    public final /* synthetic */ long f192415f;

    /* renamed from: g */
    public final /* synthetic */ FinderMediaReportObject f192416g;

    /* renamed from: h */
    public final /* synthetic */ String f192417h;

    /* renamed from: i */
    public final /* synthetic */ C101758az f192418i;

    /* renamed from: j */
    public final /* synthetic */ VideoTransPara f192419j;

    /* renamed from: n */
    public final /* synthetic */ C64899zy f192420n;

    /* renamed from: o */
    public final /* synthetic */ Object f192421o;

    /* renamed from: p */
    public final /* synthetic */ C8477a0 f192422p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66972m(C8478d0 d0Var, MvDraftMediaProcessStage mvDraftMediaProcessStage, long j, FinderMediaReportObject finderMediaReportObject, String str, C101758az azVar, VideoTransPara videoTransPara, C64899zy zyVar, Object obj, C8477a0 a0Var) {
        super(1);
        this.f192413d = d0Var;
        this.f192414e = mvDraftMediaProcessStage;
        this.f192415f = j;
        this.f192416g = finderMediaReportObject;
        this.f192417h = str;
        this.f192418i = azVar;
        this.f192419j = videoTransPara;
        this.f192420n = zyVar;
        this.f192421o = obj;
        this.f192422p = a0Var;
    }

    public Object invoke(Object obj) {
        C96553q qVar = (C96553q) obj;
        C87412m.m108594g(qVar, "result");
        C8478d0 d0Var = this.f192413d;
        int i = -1;
        if (!qVar.f282582a) {
            String str = this.f192414e.f161513i;
            Log.m105924i(str, "remuxer failed localId:" + this.f192414e.f161512h.field_localId + ", cost:" + Util.ticksToNow(this.f192415f));
            C115669n.INSTANCE.mo175913w(1718, 2, 1);
            this.f192416g.remuxTime = (int) Util.ticksToNow(this.f192415f);
            this.f192416g.remuxRetCode = -1;
        } else {
            this.f192416g.remuxTime = (int) Util.ticksToNow(this.f192415f);
            this.f192416g.remuxRetCode = 0;
            C115669n.INSTANCE.mo175913w(1718, 1, Util.ticksToNow(this.f192415f));
            String str2 = this.f192414e.f161513i;
            Log.m105924i(str2, "remuxer succ, cost: " + Util.ticksToNow(this.f192415f) + ", path:" + this.f192417h + " localId:" + this.f192414e.f161512h.field_localId);
            long l = C86013q1.m106451l(this.f192417h);
            long currentTicks = Util.currentTicks();
            FinderMediaProcessStage.C24279a aVar = FinderMediaProcessStage.f161539p;
            String str3 = this.f192417h;
            C101758az azVar = this.f192418i;
            i = aVar.mo41037a(str3, azVar.f297901i, azVar.f297902j, this.f192419j, this.f192414e.f161512h.field_localId, false);
            C37521f fVar = C37521f.f99374d;
            if (l > fVar.mo61164R() && fVar.mo61181g() != 1) {
                this.f192416g.zipTime = (int) Util.ticksToNow(currentTicks);
                if (i == 0) {
                    this.f192416g.zipRetCode = 1;
                } else {
                    this.f192416g.zipRetCode = 2;
                }
            }
            if (!TextUtils.isEmpty(this.f192420n.f186903h) || this.f192420n.f186899d.size() > 1 || this.f192420n.f186906n.f186611e.size() > 0 || this.f192420n.f186906n.f186612f) {
                ((C65000f) C86312j.m106911c(C65000f.class)).uw0(this.f192417h);
            }
        }
        d0Var.f27483d = i;
        Object obj2 = this.f192421o;
        C8477a0 a0Var = this.f192422p;
        synchronized (obj2) {
            a0Var.f27482d = true;
            obj2.notify();
        }
        return C13598b0.f38549a;
    }
}
