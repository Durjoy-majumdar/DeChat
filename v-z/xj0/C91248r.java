package xj0;

import com.tencent.magicbrush.p941ui.MagicBrushView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import xj0.C91237o;

/* renamed from: xj0.r */
public class C91248r implements C32226l<Boolean, Void> {

    /* renamed from: d */
    public final /* synthetic */ C91216b0 f261831d;

    /* renamed from: e */
    public final /* synthetic */ C91214a0 f261832e;

    /* renamed from: f */
    public final /* synthetic */ C91237o.C91240c f261833f;

    /* renamed from: g */
    public final /* synthetic */ MagicBrushView f261834g;

    /* renamed from: h */
    public final /* synthetic */ C91237o f261835h;

    public C91248r(C91237o oVar, C91216b0 b0Var, C91214a0 a0Var, C91237o.C91240c cVar, MagicBrushView magicBrushView) {
        this.f261835h = oVar;
        this.f261831d = b0Var;
        this.f261832e = a0Var;
        this.f261833f = cVar;
        this.f261834g = magicBrushView;
    }

    public Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            this.f261835h.f261806a.postToWorker(new C91245p(this));
        } else {
            Log.m105928w("MicroMsg.GameRecorderMgr", "hy: switch failed!");
            this.f261831d.mo123718a(1, -1, "view switch failed", null);
            this.f261834g.mo111630b(true, 0, new C91247q(this));
        }
        return null;
    }
}
