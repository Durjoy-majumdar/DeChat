package xm2;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.concurrent.atomic.AtomicBoolean;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import qo3.C89779i0;
import te3.C52238za0;

/* renamed from: xm2.c */
public class C23108c implements C11385n {

    /* renamed from: d */
    public C23109g f66392d;

    /* renamed from: e */
    public Context f66393e;

    /* renamed from: f */
    public C89779i0 f66394f;

    /* renamed from: g */
    public boolean f66395g;

    /* renamed from: h */
    public int f66396h;

    /* renamed from: i */
    public Runnable f66397i;

    /* renamed from: j */
    public Runnable f66398j;

    /* renamed from: n */
    public AtomicBoolean f66399n;

    /* renamed from: o */
    public int f66400o;

    /* renamed from: p */
    public long f66401p;

    /* renamed from: q */
    public long f66402q;

    /* renamed from: r */
    public long f66403r;

    /* renamed from: s */
    public long f66404s;

    /* renamed from: t */
    public boolean f66405t;

    public C23108c(Context context, int i, int i2, long j, long j2, C23109g gVar) {
        this.f66399n = new AtomicBoolean(false);
        this.f66405t = false;
        this.f66393e = context;
        this.f66392d = gVar;
        this.f66394f = null;
        this.f66396h = i;
        this.f66400o = i2;
        this.f66402q = j;
        this.f66401p = j2;
    }

    /* renamed from: a */
    public final void mo36514a() {
        if (this.f66395g) {
            Runnable runnable = this.f66398j;
            if (runnable != null) {
                MMHandlerThread.removeRunnable(runnable);
            }
            C89779i0 i0Var = this.f66394f;
            if (i0Var != null) {
                i0Var.dismiss();
                this.f66394f = null;
            }
        }
        MMHandlerThread.removeRunnable(this.f66397i);
        C86709a0.m107529k().f251779b.mo123470p(4071, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.CheckFinderManagerSwithFun", "onSceneEnd, errType = " + i + ", errCode = " + i2 + "," + str);
        if (!(yVar instanceof C53381j) || yVar.getType() != 4071) {
            Log.m105928w("MicroMsg.CheckFinderManagerSwithFun", "not expected scene,  type = " + yVar.getType());
            return;
        }
        mo36514a();
        if (i == 0 && i2 == 0) {
            C52238za0 za02 = (C52238za0) ((C53381j) yVar).f150204e.f127056b.f127083a;
            C23109g gVar = this.f66392d;
            if (gVar != null) {
                gVar.mo24594a(this.f66393e, true, za02);
                return;
            }
            return;
        }
        if (!Util.isNullOrNil(str)) {
            C76879j.m92748s(this.f66393e, str, "");
        }
        C23109g gVar2 = this.f66392d;
        if (gVar2 != null) {
            gVar2.mo24594a(this.f66393e, false, (C52238za0) null);
        }
    }

    public C23108c(Context context, int i, int i2, long j, long j2, C23109g gVar, boolean z) {
        this.f66399n = new AtomicBoolean(false);
        this.f66393e = context;
        this.f66392d = gVar;
        this.f66394f = null;
        this.f66396h = i;
        this.f66400o = i2;
        this.f66404s = j;
        this.f66403r = j2;
        this.f66405t = z;
    }
}
