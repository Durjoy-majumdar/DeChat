package ye3;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.modelsimple.C1302b0;
import com.tencent.p014mm.qqlogin.LogoutEmptyUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import k20.C9556a;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: ye3.n */
public final class C15992n implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ C79087l f43038d;

    /* renamed from: ye3.n$a */
    public static final class C15993a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C79087l f43039d;

        /* renamed from: e */
        public final /* synthetic */ C117747y f43040e;

        /* renamed from: f */
        public final /* synthetic */ int f43041f;

        /* renamed from: g */
        public final /* synthetic */ int f43042g;

        public C15993a(C79087l lVar, C117747y yVar, int i, int i2) {
            this.f43039d = lVar;
            this.f43040e = yVar;
            this.f43041f = i;
            this.f43042g = i2;
        }

        public final void run() {
            C86709a0.m107524d().mo123470p(255, this.f43039d.f232232c);
            C79087l lVar = this.f43039d;
            lVar.f232232c = null;
            MTimerHandler mTimerHandler = lVar.f232233d;
            if (mTimerHandler != null) {
                if (mTimerHandler != null) {
                    mTimerHandler.stopTimer();
                }
                this.f43039d.f232233d = null;
            }
            ProgressDialog progressDialog = this.f43039d.f232235f;
            if (!(progressDialog == null || progressDialog == null)) {
                progressDialog.dismiss();
            }
            if (this.f43040e.getType() == 255) {
                C117747y yVar = this.f43040e;
                C87412m.m108592e(yVar, "null cannot be cast to non-null type com.tencent.mm.modelsimple.NetSceneQueryHasPswd");
                if (((C1302b0) yVar).f10416f != 2) {
                    return;
                }
                if (this.f43041f == -3 && this.f43042g == 4) {
                    Context context = MMApplicationContext.getContext();
                    Intent intent = new Intent(MMApplicationContext.getContext(), LogoutEmptyUI.class);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    Context context2 = context;
                    C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/qqlogin/ChangeQQLogoutHelper$queryHasPwdAndLogout$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context2, "com/tencent/mm/qqlogin/ChangeQQLogoutHelper$queryHasPwdAndLogout$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return;
                }
                C79087l.m95638a(this.f43039d);
            }
        }
    }

    public C15992n(C79087l lVar) {
        this.f43038d = lVar;
    }

    public final void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105918d("MicroMsg.ChangeQQLoginType.LogoutHelper", "onSceneEnd " + i + " errCode " + i2 + " errMsg " + str + "  " + yVar.getType());
        MMHandlerThread.postToMainThread(new C15993a(this.f43038d, yVar, i2, i));
    }
}
