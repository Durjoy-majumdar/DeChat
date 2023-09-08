package com.tencent.p014mm.plugin.ball.p1099ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85864g1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.service.C105035c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;
import nj3.C88989a;
import qo3.C77398g;
import qo3.C77407n;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.ball.ui.FloatBallProxyUI */
public class FloatBallProxyUI extends MMActivity {

    /* renamed from: d */
    public C77398g f311815d;

    /* renamed from: e */
    public C77407n f311816e;

    /* renamed from: f */
    public int f311817f = 0;

    /* renamed from: g */
    public boolean f311818g = false;

    /* renamed from: h */
    public boolean f311819h = false;

    /* renamed from: i */
    public boolean f311820i = false;

    /* renamed from: j */
    public BallInfo f311821j = null;

    /* renamed from: com.tencent.mm.plugin.ball.ui.FloatBallProxyUI$a */
    public class C105056a implements DialogInterface.OnClickListener {
        public C105056a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.FloatBallProxyUI", "click ok");
            FloatBallProxyUI floatBallProxyUI = FloatBallProxyUI.this;
            floatBallProxyUI.f311819h = true;
            FloatBallProxyUI.m140992H7(floatBallProxyUI, 1);
            FloatBallProxyUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.ui.FloatBallProxyUI$b */
    public class C105057b implements DialogInterface.OnDismissListener {
        public C105057b() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            Log.m105924i("MicroMsg.FloatBallProxyUI", "dismiss dialog");
            FloatBallProxyUI.m140992H7(FloatBallProxyUI.this, 2);
            FloatBallProxyUI.this.finish();
        }
    }

    /* renamed from: H7 */
    public static void m140992H7(FloatBallProxyUI floatBallProxyUI, int i) {
        if (floatBallProxyUI.f311818g) {
            Log.m105925i("MicroMsg.FloatBallProxyUI", "sendResult, has sent result, resultCode:%s", Integer.valueOf(i));
            return;
        }
        ResultReceiver resultReceiver = (ResultReceiver) floatBallProxyUI.getIntent().getParcelableExtra("key_result_callback");
        if (resultReceiver != null) {
            floatBallProxyUI.f311818g = true;
            Log.m105925i("MicroMsg.FloatBallProxyUI", "sendResult, resultCode:%s", Integer.valueOf(i));
            resultReceiver.send(i, (Bundle) null);
        }
    }

    /* renamed from: I7 */
    public static void m140993I7(Context context, final int i, BallInfo ballInfo, boolean z, final C105068d0 d0Var) {
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        Intent intent = new Intent(context, FloatBallProxyUI.class);
        if (ballInfo != null) {
            intent.putExtra("key_ball_info", ballInfo);
        }
        intent.putExtra("key_can_message_ball", z);
        intent.putExtra("key_proxy_mode", i);
        intent.putExtra("key_result_callback", new ResultReceiver(MMHandler.createFreeHandler(Looper.getMainLooper())) {
            public void onReceiveResult(int i, Bundle bundle) {
                C105068d0 d0Var = d0Var;
                if (d0Var != null) {
                    d0Var.mo137111a(i, i);
                }
            }
        });
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/ball/ui/FloatBallProxyUI", "showFloatBallProxyUI", "(Landroid/content/Context;ILcom/tencent/mm/plugin/ball/model/BallInfo;ZLcom/tencent/mm/plugin/ball/ui/OnFloatBallProxyUIResultCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/ball/ui/FloatBallProxyUI", "showFloatBallProxyUI", "(Landroid/content/Context;ILcom/tencent/mm/plugin/ball/model/BallInfo;ZLcom/tencent/mm/plugin/ball/ui/OnFloatBallProxyUIResultCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: J7 */
    public final void mo149202J7(int i) {
        String string = getResources().getString(i);
        String string2 = getResources().getString(C0966R.string.evd);
        this.f311819h = false;
        C77398g y = C76879j.m92754y(this, string, "", string2, new C105056a());
        this.f311815d = y;
        y.setOnDismissListener(new C105057b());
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        C85864g1.m106129d(getWindow());
        C85864g1.m106127b(getWindow(), false);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        if (getIntent() == null) {
            finish();
        }
        int intExtra = getIntent().getIntExtra("key_proxy_mode", 1);
        this.f311817f = intExtra;
        if (intExtra == 1) {
            mo149202J7(C0966R.string.evc);
        } else if (intExtra == 2) {
            this.f311816e = new C77407n((Context) this, 1, true);
            this.f311816e.mo107568m(getString(C0966R.string.evs), 17, 0);
            C77407n nVar = this.f311816e;
            nVar.f225771i = new C105073i(this);
            nVar.f225782p = new C105074j(this);
            nVar.f225761d = new C105075k(this);
            nVar.mo107573q();
        } else if (intExtra == 3) {
            mo149202J7(C0966R.string.evt);
        }
        this.f311821j = (BallInfo) getIntent().getParcelableExtra("key_ball_info");
        this.f311820i = getIntent().getBooleanExtra("key_can_message_ball", false);
    }

    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        supportRequestWindowFeature(1);
    }

    public void onDestroy() {
        super.onDestroy();
        C77398g gVar = this.f311815d;
        if (gVar != null && gVar.isShowing()) {
            this.f311815d.dismiss();
            this.f311815d = null;
        }
        C77407n nVar = this.f311816e;
        if (nVar != null && nVar.mo107563h()) {
            this.f311816e.mo107572p();
            this.f311816e = null;
        }
    }

    public void onPause() {
        super.onPause();
        Log.m105925i("MicroMsg.FloatBallProxyUI", "alvinluo onPause proxyType: %d, hasConfirmed: %b, canAddMessageBall: %b, ballInfo: %s", Integer.valueOf(this.f311817f), Boolean.valueOf(this.f311819h), Boolean.valueOf(this.f311820i), this.f311821j);
        if (this.f311817f == 1 && !this.f311819h && this.f311820i && this.f311821j != null) {
            C105035c.m140879r0().mo149147w(this.f311821j);
        }
    }
}
