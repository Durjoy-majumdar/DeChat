package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.messenger.foundation.PluginMessengerFoundation;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import hp3.C87581a;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import lg3.C76697h;
import nj3.C76879j;
import nj3.C76912y0;
import nr3.C89060f;
import p158gt.C8451i;
import t83.C13851h1;
import wd3.C65953v0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.e3 */
public class C6230e3 implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ String f22979a;

    /* renamed from: b */
    public final /* synthetic */ C13851h1 f22980b;

    /* renamed from: c */
    public final /* synthetic */ String f22981c;

    /* renamed from: d */
    public final /* synthetic */ String f22982d;

    /* renamed from: e */
    public final /* synthetic */ String f22983e;

    /* renamed from: f */
    public final /* synthetic */ MsgHandler f22984f;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.e3$a */
    public class C6231a implements Runnable {

        /* renamed from: d */
        public final WeakReference<Context> f22985d;

        public C6231a() {
            this.f22985d = new WeakReference<>(C6230e3.this.f22984f.f22697d);
        }

        public void run() {
            Context context = this.f22985d.get();
            if (context != null && C6230e3.this.f22984f.f22701h && (context instanceof Activity) && !((Activity) context).isFinishing()) {
                C6230e3.this.f22984f.f22700g = C76879j.m92723Q(context, (String) null, context.getString(C0966R.string.gwa), true, false, (DialogInterface.OnCancelListener) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.e3$b */
    public class C6232b implements C87581a<Void, Void> {

        /* renamed from: a */
        public final /* synthetic */ String f22987a;

        public C6232b(String str) {
            this.f22987a = str;
        }

        public Object call(Object obj) {
            Void voidR = (Void) obj;
            ProgressDialog progressDialog = C6230e3.this.f22984f.f22700g;
            if (progressDialog != null) {
                progressDialog.dismiss();
                C6230e3.this.f22984f.f22701h = false;
            }
            Context context = C6230e3.this.f22984f.f22697d;
            if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                ((C8451i) C86312j.m106911c(C8451i.class)).mo9372SO(C6230e3.this.f22979a);
                String str = (String) C6230e3.this.f22980b.f38983a.get("appid");
                C6230e3 e3Var = C6230e3.this;
                MsgHandler msgHandler = e3Var.f22984f;
                if (str == null) {
                    str = "";
                }
                msgHandler.mo7178T5((C44561j) null, str, e3Var.f22981c, e3Var.f22979a, e3Var.f22982d, e3Var.f22983e, this.f22987a, (String) null);
                Context context2 = C6230e3.this.f22984f.f22697d;
                if (context2 instanceof Activity) {
                    C76912y0.m92768g(context2, C76697h.m92348a(context2).getString(C0966R.string.f360099a34));
                }
                C6230e3 e3Var2 = C6230e3.this;
                e3Var2.f22984f.mo7210k5(e3Var2.f22980b, "send_app_msg:ok", (Map<String, Object>) null);
                ((PluginMessengerFoundation) C86312j.m106911c(PluginMessengerFoundation.class)).mo96076P7().mo90704g(C6230e3.this.f22981c);
                Log.m105924i("MicroMsg.MsgHandler", "recent forward send success");
            } else {
                Log.m105924i("MicroMsg.MsgHandler", "recent forward context is Finishing");
            }
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.e3$c */
    public class C6233c implements C87581a<Void, Void> {

        /* renamed from: a */
        public final /* synthetic */ Runnable f22989a;

        public C6233c(Runnable runnable) {
            this.f22989a = runnable;
        }

        public Object call(Object obj) {
            Void voidR = (Void) obj;
            ((C119157j) C119157j.f356862d).mo183869C(this.f22989a, 500);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ((C8451i) C86312j.m106911c(C8451i.class)).bb0(C6230e3.this.f22979a, false, new C6238f3(this, countDownLatch));
            try {
                countDownLatch.await(2000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                Log.printErrStackTrace("MicroMsg.MsgHandler", e, "", new Object[0]);
            } catch (Throwable unused) {
            }
            Log.m105924i("MicroMsg.MsgHandler", "count down end");
            return null;
        }
    }

    public C6230e3(MsgHandler msgHandler, String str, C13851h1 h1Var, String str2, String str3, String str4) {
        this.f22984f = msgHandler;
        this.f22979a = str;
        this.f22980b = h1Var;
        this.f22981c = str2;
        this.f22982d = str3;
        this.f22983e = str4;
    }

    /* renamed from: a */
    public void mo23a(boolean z, String str, int i) {
        if (!z) {
            this.f22984f.mo7210k5(this.f22980b, "send_app_msg:cancel", (Map<String, Object>) null);
        } else if (!Util.isNullOrNil(this.f22979a)) {
            C89060f.m111322a().mo123064p(new C6233c(new C6231a())).mo123062e(new C6232b(str));
        } else {
            this.f22984f.mo7178T5((C44561j) null, "", this.f22981c, this.f22979a, this.f22982d, this.f22983e, str, (String) null);
            Context context = this.f22984f.f22697d;
            if (context instanceof Activity) {
                C76912y0.m92768g(context, C76697h.m92348a(context).getString(C0966R.string.f360099a34));
                ((Activity) this.f22984f.f22697d).finish();
                MsgHandler msgHandler = this.f22984f;
                msgHandler.f22715x = msgHandler.f22717y;
            }
            ((PluginMessengerFoundation) C86312j.m106911c(PluginMessengerFoundation.class)).mo96076P7().mo90704g(this.f22981c);
        }
    }
}
