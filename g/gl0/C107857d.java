package gl0;

import ac3.C103352e1;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.xeffect.FaceTracker;
import di3.C86312j;
import gl0.C107850a;
import java.util.HashMap;
import java.util.List;
import q00.C110264g;
import q00.C62571i;

/* renamed from: gl0.d */
public class C107857d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C107850a f322975d;

    /* renamed from: e */
    public final /* synthetic */ C81925i2 f322976e;

    /* renamed from: f */
    public final /* synthetic */ int f322977f;

    /* renamed from: g */
    public final /* synthetic */ C87268e f322978g;

    public C107857d(C87268e eVar, C107850a aVar, C81925i2 i2Var, int i) {
        this.f322978g = eVar;
        this.f322975d = aVar;
        this.f322976e = i2Var;
        this.f322977f = i;
    }

    public void run() {
        C107850a.C107853c cVar;
        C107850a.C107853c cVar2 = C107850a.C107853c.ResultOK;
        C107850a.C107853c cVar3 = C107850a.C107853c.ResultInited;
        this.f322975d.getClass();
        Class cls = C62571i.class;
        C107850a aVar = C107850a.f322941d;
        if (aVar.f322942a == null) {
            ((C62571i) C86312j.m106911c(cls)).mo87567IR();
            aVar.getClass();
            ((C62571i) C86312j.m106911c(cls)).mo87569Ra();
            C107850a.f322941d.f322942a = new FaceTracker(C103352e1.m136945a(C103352e1.f304762a, (List) null, false, (C110264g.C47730a) null, 7, (Object) null));
            cVar = cVar2;
        } else {
            cVar = cVar3;
        }
        int a = this.f322975d.mo158270a(cVar);
        HashMap hashMap = new HashMap(1);
        hashMap.put("errCode", Integer.valueOf(a));
        this.f322976e.mo109647a(this.f322977f, this.f322978g.mo115112m(cVar == cVar2 ? "ok:init ok" : cVar == cVar3 ? "fail: already init" : cVar == C107850a.C107853c.ResultInitFail ? "fail:init fail" : "fail:undefine error", hashMap));
    }
}
