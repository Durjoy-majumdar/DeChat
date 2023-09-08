package cr1;

import android.text.TextUtils;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage;
import com.tencent.p014mm.plugin.finder.upload.postlogic.mvstage.MvMediaProcessStage;
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

/* renamed from: cr1.b */
public final class C57978b extends C87413o implements C32226l<C96553q, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C8478d0 f165899d;

    /* renamed from: e */
    public final /* synthetic */ MvMediaProcessStage f165900e;

    /* renamed from: f */
    public final /* synthetic */ long f165901f;

    /* renamed from: g */
    public final /* synthetic */ FinderMediaReportObject f165902g;

    /* renamed from: h */
    public final /* synthetic */ String f165903h;

    /* renamed from: i */
    public final /* synthetic */ C101758az f165904i;

    /* renamed from: j */
    public final /* synthetic */ VideoTransPara f165905j;

    /* renamed from: n */
    public final /* synthetic */ C64899zy f165906n;

    /* renamed from: o */
    public final /* synthetic */ Object f165907o;

    /* renamed from: p */
    public final /* synthetic */ C8477a0 f165908p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57978b(C8478d0 d0Var, MvMediaProcessStage mvMediaProcessStage, long j, FinderMediaReportObject finderMediaReportObject, String str, C101758az azVar, VideoTransPara videoTransPara, C64899zy zyVar, Object obj, C8477a0 a0Var) {
        super(1);
        this.f165899d = d0Var;
        this.f165900e = mvMediaProcessStage;
        this.f165901f = j;
        this.f165902g = finderMediaReportObject;
        this.f165903h = str;
        this.f165904i = azVar;
        this.f165905j = videoTransPara;
        this.f165906n = zyVar;
        this.f165907o = obj;
        this.f165908p = a0Var;
    }

    public Object invoke(Object obj) {
        C96553q qVar = (C96553q) obj;
        C87412m.m108594g(qVar, "result");
        C8478d0 d0Var = this.f165899d;
        int i = -1;
        if (!qVar.f282582a) {
            Log.m105924i("LogPost.MvMediaProcessStage", "remuxer failed localId:" + this.f165900e.f161615h.getLocalId() + ", cost:" + Util.ticksToNow(this.f165901f));
            C115669n.INSTANCE.mo175913w(1253, 2, 1);
            this.f165902g.remuxTime = (int) Util.ticksToNow(this.f165901f);
            this.f165902g.remuxRetCode = -1;
        } else {
            this.f165902g.remuxTime = (int) Util.ticksToNow(this.f165901f);
            this.f165902g.remuxRetCode = 0;
            C115669n.INSTANCE.mo175913w(1253, 1, Util.ticksToNow(this.f165901f));
            Log.m105924i("LogPost.MvMediaProcessStage", "remuxer succ, cost: " + Util.ticksToNow(this.f165901f) + ", path:" + this.f165903h + " localId:" + this.f165900e.f161615h.getLocalId());
            long l = C86013q1.m106451l(this.f165903h);
            long currentTicks = Util.currentTicks();
            FinderMediaProcessStage.C24279a aVar = FinderMediaProcessStage.f161539p;
            String str = this.f165903h;
            C101758az azVar = this.f165904i;
            i = aVar.mo41037a(str, azVar.f297901i, azVar.f297902j, this.f165905j, this.f165900e.f161615h.getLocalId(), false);
            C37521f fVar = C37521f.f99374d;
            if (l > fVar.mo61164R() && fVar.mo61181g() != 1) {
                this.f165902g.zipTime = (int) Util.ticksToNow(currentTicks);
                if (i == 0) {
                    this.f165902g.zipRetCode = 1;
                } else {
                    this.f165902g.zipRetCode = 2;
                }
            }
            if (!TextUtils.isEmpty(this.f165906n.f186903h) || this.f165906n.f186899d.size() > 1 || this.f165906n.f186906n.f186611e.size() > 0 || this.f165906n.f186906n.f186612f) {
                ((C65000f) C86312j.m106911c(C65000f.class)).uw0(this.f165903h);
            }
        }
        d0Var.f27483d = i;
        Object obj2 = this.f165907o;
        C8477a0 a0Var = this.f165908p;
        synchronized (obj2) {
            a0Var.f27482d = true;
            obj2.notify();
        }
        return C13598b0.f38549a;
    }
}
