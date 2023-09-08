package p1058wb;

import com.tencent.p014mm.game.liblockstep.LockStepNative;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83187w;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: wb.e */
public class C90910e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83165i f260901d;

    /* renamed from: e */
    public final /* synthetic */ LockStepNative.ILockStepListener f260902e;

    /* renamed from: f */
    public final /* synthetic */ LockStepNative.ILockStepReportListener f260903f;

    /* renamed from: g */
    public final /* synthetic */ C90912g f260904g;

    public C90910e(C90912g gVar, C83165i iVar, LockStepNative.ILockStepListener iLockStepListener, LockStepNative.ILockStepReportListener iLockStepReportListener) {
        this.f260904g = gVar;
        this.f260901d = iVar;
        this.f260902e = iLockStepListener;
        this.f260903f = iLockStepReportListener;
    }

    public void run() {
        Log.m105924i("Luggage.LockStepNativeInstallHelper", "createLockStepBinding setCallback ");
        if (this.f260904g.f260907a != null) {
            Log.m105924i("Luggage.LockStepNativeInstallHelper", "createLockStepBinding lockStepNative != null");
            return;
        }
        C83187w wVar = (C83187w) this.f260901d.mo63321n0(C83187w.class);
        if (wVar == null) {
            Log.m105920e("Luggage.LockStepNativeInstallHelper", "createLockStepBinding v8Addon is null");
            return;
        }
        C90912g gVar = this.f260904g;
        if (gVar.f260909c) {
            gVar.f260907a = new LockStepNative(wVar.mo115417m(), wVar.mo115393J0(), wVar.mo115414j());
        } else {
            gVar.f260907a = new LockStepNative(wVar.mo115417m(), wVar.mo115393J0(), 0);
        }
        Log.m105925i("Luggage.LockStepNativeInstallHelper", "createLockStepBinding setCallback ret:%d", Integer.valueOf(this.f260904g.f260907a.setCallback(this.f260902e, this.f260903f)));
    }
}
