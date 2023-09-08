package p873bx;

import com.tencent.p014mm.modelsimple.C68139d0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import f40.C86709a0;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import qo3.C89779i0;

/* renamed from: bx.b */
public final class C67325b {

    /* renamed from: a */
    public static final C67325b f193160a = new C67325b();

    /* renamed from: b */
    public static WeakReference<C89779i0> f193161b;

    /* renamed from: bx.b$a */
    public static final class C67326a implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C68139d0 f193162d;

        public C67326a(C68139d0 d0Var) {
            this.f193162d = d0Var;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C89779i0 i0Var;
            if (C87412m.m108589b(yVar, this.f193162d)) {
                C89137b0 d = C86709a0.m107524d();
                this.f193162d.getClass();
                d.mo123470p(594, this);
                WeakReference<C89779i0> weakReference = C67325b.f193161b;
                if (weakReference != null && (i0Var = weakReference.get()) != null) {
                    i0Var.dismiss();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo91457a(C72963f4 f4Var, String str, String str2) {
        Log.m105924i("MMRevoke.RevokeMsgHandler", "doRequestRevokeNetScene() called with: msgId:" + f4Var.getMsgId() + " msgSvrId:" + f4Var.mo108774y2() + " type:" + f4Var.getType() + " status:" + f4Var.getStatus() + " revokeTicket = " + str2);
        C68139d0 d0Var = new C68139d0(f4Var, str, str2);
        C86709a0.m107524d().mo123455a(594, new C67326a(d0Var));
        C86709a0.m107524d().mo123460f(d0Var);
    }
}
