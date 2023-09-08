package o03;

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
import te3.qo4;

/* renamed from: o03.c */
public class C47319c implements C11385n {

    /* renamed from: d */
    public C47320a f126992d;

    /* renamed from: e */
    public Context f126993e;

    /* renamed from: f */
    public C89779i0 f126994f;

    /* renamed from: g */
    public boolean f126995g;

    /* renamed from: h */
    public int f126996h;

    /* renamed from: i */
    public Runnable f126997i;

    /* renamed from: j */
    public Runnable f126998j;

    /* renamed from: n */
    public AtomicBoolean f126999n = new AtomicBoolean(false);

    /* renamed from: o03.c$a */
    public interface C47320a {
    }

    public C47319c(Context context, int i, C47320a aVar) {
        this.f126993e = context;
        this.f126992d = aVar;
        this.f126994f = null;
        this.f126996h = i;
    }

    /* renamed from: a */
    public void mo72374a() {
        if (this.f126995g) {
            C47317b bVar = new C47317b(this);
            this.f126998j = bVar;
            MMHandlerThread.postToMainThreadDelayed(bVar, 200);
        }
        C47316a aVar = new C47316a(this);
        this.f126997i = aVar;
        MMHandlerThread.postToMainThreadDelayed(aVar, 60000);
        C86709a0.m107529k().f251779b.mo123455a(4071, this);
        C86709a0.m107529k().f251779b.mo123460f(new C47321e(this.f126996h));
    }

    /* renamed from: b */
    public final void mo72375b(boolean z, qo4 qo4) {
        C47320a aVar = this.f126992d;
        if (aVar != null) {
            C47323j jVar = (C47323j) aVar;
            if (qo4 == null || !z) {
                jVar.f127005b.mo67489a();
            } else {
                jVar.f127005b.mo67490b(qo4);
            }
        }
    }

    /* renamed from: c */
    public final void mo72376c() {
        if (this.f126995g) {
            Runnable runnable = this.f126998j;
            if (runnable != null) {
                MMHandlerThread.removeRunnable(runnable);
            }
            C89779i0 i0Var = this.f126994f;
            if (i0Var != null) {
                i0Var.dismiss();
                this.f126994f = null;
            }
        }
        MMHandlerThread.removeRunnable(this.f126997i);
        C86709a0.m107529k().f251779b.mo123470p(4071, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.CheckFinderManagerSwithFun", "onSceneEnd, errType = " + i + ", errCode = " + i2 + "," + str);
        if (!(yVar instanceof C47321e) || yVar.getType() != 4071) {
            Log.m105928w("MicroMsg.CheckFinderManagerSwithFun", "not expected action,  type = " + yVar.getType());
            return;
        }
        mo72376c();
        if (i == 0 && i2 == 0) {
            mo72375b(true, (qo4) ((C47321e) yVar).f127001e.f127056b.f127083a);
            return;
        }
        if (!Util.isNullOrNil(str)) {
            C76879j.m92748s(this.f126993e, str, "");
        }
        mo72375b(false, (qo4) null);
    }
}
