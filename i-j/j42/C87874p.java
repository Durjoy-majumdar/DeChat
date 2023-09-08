package j42;

import android.content.Context;
import com.tencent.magicbrush.biz.MBBizManager;
import com.tencent.p014mm.plugin.magicbrush.MBBuildConfig;
import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.rtmp.TXLiveConstants;
import gy3.C8480h;
import gy3.C87412m;
import h42.C87431b;
import h42.C87432c;
import j52.C87879c;
import j52.C87880f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import sx3.C64190k;

/* renamed from: j42.p */
public final class C87874p extends C87830a implements C87432c {

    /* renamed from: F */
    public boolean f254368F;

    /* renamed from: G */
    public final HashMap<String, C64190k<String>> f254369G = new HashMap<>();

    /* renamed from: H */
    public int f254370H;

    /* renamed from: I */
    public final C87880f f254371I;

    /* renamed from: j42.p$a */
    public static final class C87875a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C87874p f254372d;

        /* renamed from: e */
        public final /* synthetic */ String f254373e;

        public C87875a(C87874p pVar, String str) {
            this.f254372d = pVar;
            this.f254373e = str;
        }

        public final void run() {
            this.f254372d.f254277c.mo111591d(this.f254373e);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87874p(Context context, String str, MBBizManager mBBizManager, C87431b bVar) {
        super(context, str, mBBizManager, bVar);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "serviceName");
        C87412m.m108594g(mBBizManager, "bizManager");
        C87412m.m108594g(bVar, "client");
        C87880f fVar = r1;
        C87880f fVar2 = new C87880f(str, (String) null, 0, 0, 0, 0, 0, 0, 0, 0, TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED, (C8480h) null);
        this.f254371I = fVar;
    }

    /* renamed from: E */
    public boolean mo121860E() {
        return this.f254370H > 0;
    }

    /* renamed from: L */
    public void mo121868L(int i) {
        C87880f fVar = this.f254371I;
        fVar.getClass();
        fVar.f254389i = System.currentTimeMillis();
        super.mo121868L(i);
    }

    /* renamed from: N */
    public synchronized void mo121861N(String str, String str2) {
        C87412m.m108594g(str, "bizInstance");
        C87412m.m108594g(str2, "msg");
        if (this.f254368F) {
            mo122293k0().mo115419p(new C87877r(this, str, str2), false);
        } else {
            C64190k kVar = this.f254369G.get(str);
            if (kVar != null) {
                kVar.addLast(str2);
            }
        }
    }

    /* renamed from: d0 */
    public void mo122290d0(int i) {
        super.mo122290d0(i);
        C87880f fVar = this.f254371I;
        fVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        fVar.f254390j = currentTimeMillis;
        IMagicBrushMonitor.C85281a.m105256d(C87879c.f254379e, fVar.f254382b, fVar.f254381a, IMagicBrushMonitor.TimeCostScene.DESTROY, currentTimeMillis - fVar.f254389i, (String) null, 16, (Object) null);
    }

    /* renamed from: m0 */
    public void mo122297m0() {
        super.mo122297m0();
        C87880f fVar = this.f254371I;
        fVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        fVar.f254388h = currentTimeMillis;
        IMagicBrushMonitor.C85281a.m105256d(C87879c.f254379e, fVar.f254382b, fVar.f254381a, IMagicBrushMonitor.TimeCostScene.START, currentTimeMillis - fVar.f254387g, (String) null, 16, (Object) null);
        synchronized (this) {
            this.f254368F = true;
            mo122325q0();
        }
    }

    /* renamed from: o0 */
    public void mo122299o0(MBBuildConfig<?> mBBuildConfig) {
        C87412m.m108594g(mBBuildConfig, "config");
        String str = this.f254371I.f254382b;
        C87412m.m108594g(str, "<set-?>");
        mBBuildConfig.f248370f = str;
        C87880f fVar = this.f254371I;
        fVar.getClass();
        fVar.f254385e = System.currentTimeMillis();
        super.mo122299o0(mBBuildConfig);
    }

    public void onCreated() {
        super.onCreated();
        C87880f fVar = this.f254371I;
        fVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        fVar.f254386f = currentTimeMillis;
        IMagicBrushMonitor.C85281a.m105256d(C87879c.f254379e, fVar.f254382b, fVar.f254381a, IMagicBrushMonitor.TimeCostScene.SETUP, currentTimeMillis - fVar.f254385e, (String) null, 16, (Object) null);
        C87880f fVar2 = this.f254371I;
        fVar2.getClass();
        fVar2.f254387g = System.currentTimeMillis();
        mo121874X();
    }

    /* renamed from: p0 */
    public final void mo122324p0(String str) {
        String str2 = this.f254274E;
        Log.m105924i(str2, "biz connect by " + str);
        mo122293k0().mo115419p(new C87875a(this, str), false);
    }

    /* renamed from: q0 */
    public final void mo122325q0() {
        for (Map.Entry next : this.f254369G.entrySet()) {
            String str = (String) next.getKey();
            mo122324p0(str);
            Iterator it = ((C64190k) next.getValue()).iterator();
            while (it.hasNext()) {
                mo122293k0().mo115419p(new C87877r(this, str, (String) it.next()), false);
            }
        }
        this.f254369G.clear();
    }

    public void setMute(boolean z) {
    }

    /* renamed from: t */
    public synchronized void mo121862t(String str) {
        C87412m.m108594g(str, "from");
        this.f254370H++;
        if (this.f254368F) {
            mo122324p0(str);
        } else {
            this.f254369G.put(str, new C64190k());
        }
    }

    /* renamed from: y */
    public synchronized void mo121863y(String str) {
        C87412m.m108594g(str, "from");
        this.f254370H--;
        if (this.f254368F) {
            Log.m105924i(this.f254274E, "biz disconnect by " + str);
            mo122293k0().mo115419p(new C87876q(this, str), false);
        }
        this.f254369G.remove(str);
    }
}
