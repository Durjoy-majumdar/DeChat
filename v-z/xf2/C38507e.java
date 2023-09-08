package xf2;

import ag2.C27894h0;
import ag2.C27895i0;
import ag2.C27900o;
import ag2.C79540c0;
import android.content.Context;
import android.util.Base64;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86301e;
import eb0.C75604z3;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import java.io.IOException;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: xf2.e */
public class C38507e extends C86301e implements C27900o {

    /* renamed from: d */
    public C79540c0 f101539d;

    /* renamed from: e */
    public C27895i0 f101540e;

    /* renamed from: xf2.e$a */
    public class C38508a implements Runnable {
        public C38508a(C38507e eVar) {
        }

        public void run() {
            if (C86709a0.m107522a()) {
                long currentTimeMillis = System.currentTimeMillis();
                C27894h0 h0Var = new C27894h0();
                if (h0Var.f77058a.f106247d.size() > 0) {
                    for (int i = 0; i < h0Var.f77058a.f106247d.size(); i++) {
                        String str = h0Var.f77058a.f106247d.get(i).f106242d;
                        C72963f4 f4Var = new C72963f4();
                        f4Var.mo108749c3("qqmail");
                        f4Var.mo108733M2(C75604z3.m90843o("qqmail"));
                        f4Var.mo108740T2(0);
                        f4Var.mo108732L2(String.format(MMApplicationContext.getContext().getString(C0966R.string.il_), new Object[]{str}));
                        f4Var.setType(1);
                        f4Var.mo100991d(3);
                        Log.m105919d("MicroMsg.ShareMailInfoMgr", "send mail fail, publish fail message, id: %d", Long.valueOf(((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).my0(f4Var)));
                    }
                    h0Var.f77058a.f106247d.clear();
                    try {
                        String encodeToString = Base64.encodeToString(h0Var.f77058a.toByteArray(), 0);
                        Log.m105919d("MicroMsg.ShareMailInfoMgr", "save %s", encodeToString);
                        C86709a0.m107535s().mo121142i().mo119676J(282625, encodeToString);
                    } catch (IOException e) {
                        Log.printErrStackTrace("MicroMsg.ShareMailInfoMgr", e, "", new Object[0]);
                        Log.m105928w("MicroMsg.ShareMailInfoMgr", "save to config fail");
                    }
                }
                Log.m105925i("SubCoreQQMail", "summeranrt onAccountPostReset notifyAllFail take[%d]ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
        }
    }

    /* renamed from: fI */
    public C79540c0 mo55677fI() {
        C86709a0.m107523b().mo121108c();
        if (this.f101539d == null) {
            this.f101539d = new C79540c0();
        }
        return this.f101539d;
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        C86709a0.m107525e().postToWorker(new C38508a(this));
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        C79540c0 c0Var = this.f101539d;
        if (c0Var != null) {
            c0Var.mo109597f();
        }
    }

    /* renamed from: vT */
    public C27895i0 mo55678vT() {
        C86709a0.m107523b().mo121108c();
        if (this.f101540e == null) {
            this.f101540e = new C27895i0();
        }
        return this.f101540e;
    }
}
