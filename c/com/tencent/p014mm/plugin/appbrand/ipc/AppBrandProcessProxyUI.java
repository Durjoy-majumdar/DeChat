package com.tencent.p014mm.plugin.appbrand.ipc;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p427v4.p1171os.ResultReceiver;
import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85864g1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84545i3;
import com.tencent.p014mm.plugin.appbrand.utils.C2039g2;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.lang.reflect.Constructor;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import nj3.C88989a;
import p170ic.C87687a;
import p225rc.C89916g;
import p225rc.g$$h;
import p274xx.C15907f;
import qo3.C77398g;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI */
public class AppBrandProcessProxyUI extends MMActivity implements C81961h, g$$h {

    /* renamed from: o */
    public static final /* synthetic */ int f240314o = 0;

    /* renamed from: d */
    public int f240315d = 0;

    /* renamed from: e */
    public AppBrandProxyUIProcessTask f240316e;

    /* renamed from: f */
    public AppBrandProxyUIProcessTask.ProcessRequest f240317f;

    /* renamed from: g */
    public boolean f240318g = false;

    /* renamed from: h */
    public volatile boolean f240319h = false;

    /* renamed from: i */
    public volatile boolean f240320i = false;

    /* renamed from: j */
    public C77398g f240321j;

    /* renamed from: n */
    public C81939d f240322n;

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI$a */
    public class C81935a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Class f240325d;

        /* renamed from: e */
        public final /* synthetic */ Context f240326e;

        /* renamed from: f */
        public final /* synthetic */ Intent f240327f;

        /* renamed from: g */
        public final /* synthetic */ AppBrandProxyUIProcessTask.ProcessRequest f240328g;

        public C81935a(Class cls, Context context, Intent intent, AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
            this.f240325d = cls;
            this.f240326e = context;
            this.f240327f = intent;
            this.f240328g = processRequest;
        }

        public void run() {
            if (AppBrandProcessProxyUI.class != this.f240325d) {
                Context context = this.f240326e;
                if (context instanceof Activity) {
                    Intent intent = this.f240327f;
                    int startActivityRequestCode = this.f240328g.getStartActivityRequestCode();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(startActivityRequestCode));
                    aVar.mo10233c(intent);
                    C117292a.m165364j((Activity) context, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI$2", "run", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 29 && ProcessExplicitBackgroundOwner.INSTANCE.isBackground() && this.f240328g.usePendingIntentOnBackground()) {
                try {
                    PendingIntent.getActivity(this.f240326e, -1, this.f240327f, 201326592).send(C87687a.m109085a(this.f240328g), new AppBrandProcessProxyUI$a$$a(this.f240328g), (Handler) null);
                    return;
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandProcessProxyUI", "startLogicProxy start with pendingIntent get exception:%s for req:%s", e, this.f240328g);
                }
            }
            Context context2 = this.f240326e;
            Intent intent2 = this.f240327f;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent2);
            Context context3 = context2;
            C117292a.m165358d(context3, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI$2", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context3, "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI$2", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI$b */
    public class C81936b implements Runnable {

        /* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI$b$a */
        public class C81937a implements C15907f.C15909b {

            /* renamed from: a */
            public boolean f240330a = false;

            public C81937a() {
            }

            /* renamed from: a */
            public void mo6380a() {
                mo114360b(-2);
                AppBrandProcessProxyUI.this.mo114356H7((AppBrandProxyUIProcessTask.ProcessResult) null);
            }

            /* renamed from: b */
            public final void mo114360b(int i) {
                if (!this.f240330a) {
                    this.f240330a = true;
                    ResultReceiver resultReceiver = (ResultReceiver) AppBrandProcessProxyUI.this.getIntent().getParcelableExtra("key_result_receiver");
                    if (resultReceiver != null) {
                        resultReceiver.mo164633b(i, (Bundle) null);
                    }
                }
            }

            public void onSuccess() {
                mo114360b(-1);
                AppBrandProcessProxyUI.this.mo114356H7((AppBrandProxyUIProcessTask.ProcessResult) null);
            }
        }

        public C81936b() {
        }

        public void run() {
            ((C15907f) C86312j.m106911c(C15907f.class)).mo14558ur(AppBrandProcessProxyUI.this, 16777216, true, new C81937a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI$c */
    public class C81938c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AppBrandProxyUIProcessTask.ProcessResult f240332d;

        public C81938c(AppBrandProxyUIProcessTask.ProcessResult processResult) {
            this.f240332d = processResult;
        }

        public void run() {
            AppBrandProxyUIProcessTask appBrandProxyUIProcessTask = AppBrandProcessProxyUI.this.f240316e;
            if (appBrandProxyUIProcessTask == null || appBrandProxyUIProcessTask.onInterceptFinishActivityAction()) {
                int intExtra = IntentUtil.getIntExtra(AppBrandProcessProxyUI.this.getIntent(), "key_running_mode", 0);
                if (intExtra == 2 || intExtra == 3) {
                    AppBrandProcessProxyUI.this.finish();
                }
            } else {
                AppBrandProcessProxyUI.this.finish();
            }
            AppBrandProcessProxyUI.this.mo114357I7(this.f240332d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI$d */
    public class C81939d implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {

        /* renamed from: d */
        public boolean f240334d = false;

        public C81939d(C819331 r2) {
        }

        /* renamed from: a */
        public final void mo114362a(int i) {
            if (!this.f240334d) {
                this.f240334d = true;
                ResultReceiver resultReceiver = (ResultReceiver) AppBrandProcessProxyUI.this.getIntent().getParcelableExtra("key_result_receiver");
                if (resultReceiver != null) {
                    resultReceiver.mo164633b(i, (Bundle) null);
                }
            }
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            mo114362a(i);
        }

        public void onDismiss(DialogInterface dialogInterface) {
            mo114362a(-2);
            AppBrandProcessProxyUI.this.mo114356H7((AppBrandProxyUIProcessTask.ProcessResult) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI$e */
    public interface C81940e {
        /* renamed from: a */
        void mo114365a();

        void cancel();
    }

    /* renamed from: J7 */
    public static void m100645J7(Context context, ActivityStarterIpcDelegate activityStarterIpcDelegate, final C81940e eVar) {
        Object[] objArr = new Object[3];
        objArr[0] = context;
        boolean z = true;
        objArr[1] = Boolean.valueOf(activityStarterIpcDelegate != null);
        if (eVar == null) {
            z = false;
        }
        objArr[2] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.AppBrandProcessProxyUI", "showOverseaWechatServiceAuthorizeDialog(context:%s, activityDelegate?:%b, callback?:%b)", objArr);
        Intent putExtra = new Intent(context, AppBrandProcessProxyUI.class).putExtra("key_running_mode", 3).putExtra("key_result_receiver", ResultReceiverFixLeak.m100671a(new ResultReceiver(MMHandler.createFreeHandler(Looper.getMainLooper())) {
            /* renamed from: a */
            public void mo883a(int i, Bundle bundle) {
                C81940e eVar;
                C81940e eVar2;
                if (-1 == i && (eVar2 = eVar) != null) {
                    eVar2.mo114365a();
                }
                if (-2 == i && (eVar = eVar) != null) {
                    eVar.cancel();
                }
            }
        }, context));
        if (activityStarterIpcDelegate != null) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(putExtra);
            C117292a.m165358d(activityStarterIpcDelegate, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI", "showOverseaWechatServiceAuthorizeDialog", "(Landroid/content/Context;Lcom/tencent/luggage/sdk/launching/ActivityStarterIpcDelegate;Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI$OverseaWechatServiceAuthorizeCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityStarterIpcDelegate.mo880b((Intent) aVar.mo10231a(0));
            C117292a.m165359e(activityStarterIpcDelegate, "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI", "showOverseaWechatServiceAuthorizeDialog", "(Landroid/content/Context;Lcom/tencent/luggage/sdk/launching/ActivityStarterIpcDelegate;Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI$OverseaWechatServiceAuthorizeCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (!(context instanceof Activity)) {
            putExtra.addFlags(268435456);
        }
        try {
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(putExtra);
            C117292a.m165358d(context, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI", "showOverseaWechatServiceAuthorizeDialog", "(Landroid/content/Context;Lcom/tencent/luggage/sdk/launching/ActivityStarterIpcDelegate;Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI$OverseaWechatServiceAuthorizeCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI", "showOverseaWechatServiceAuthorizeDialog", "(Landroid/content/Context;Lcom/tencent/luggage/sdk/launching/ActivityStarterIpcDelegate;Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI$OverseaWechatServiceAuthorizeCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (BadParcelableException e) {
            Log.printErrStackTrace("MicroMsg.AppBrandProcessProxyUI", e, "showOverseaWechatServiceAuthorizeDialog get BadParcelableException", new Object[0]);
        }
    }

    /* renamed from: K7 */
    public static <_Req extends AppBrandProxyUIProcessTask.ProcessRequest, _Result extends AppBrandProxyUIProcessTask.ProcessResult> void m100646K7(Context context, Class<? extends AppBrandProcessProxyUI> cls, _Req _req, final AppBrandProxyUIProcessTask.C81943b<_Result> bVar, Intent intent) {
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        Intent putExtra = new Intent(context, cls == null ? AppBrandProcessProxyUI.class : cls).putExtra("key_model_class_name", _req.getTaskClass().getName()).putExtra("key_result_receiver", bVar == null ? null : ResultReceiverFixLeak.m100671a(new ResultReceiver(MMHandler.createFreeHandler(Looper.getMainLooper())) {
            /* renamed from: a */
            public void mo883a(int i, Bundle bundle) {
                if (bundle == null) {
                    bVar.onReceiveResult(null);
                    return;
                }
                bundle.setClassLoader(AppBrandProcessProxyUI.class.getClassLoader());
                bVar.onReceiveResult((AppBrandProxyUIProcessTask.ProcessResult) bundle.getParcelable("key_result_parcel"));
            }
        }, context)).putExtra("appbrand_report_key_target_activity", _req.getUIAlias()).putExtra("key_running_mode", 1);
        if (_req.needParams()) {
            putExtra.putExtra("key_request_parcel", _req);
        } else {
            putExtra.putExtra("key_request_need_params", false);
        }
        if (!(context instanceof Activity)) {
            putExtra.addFlags(268435456);
        } else {
            putExtra.putExtra("key_need_light_status", C84545i3.m104135l(((Activity) context).getWindow()));
        }
        if (intent != null) {
            putExtra.addFlags(intent.getFlags());
        }
        C81935a aVar = new C81935a(cls, context, putExtra, _req);
        if (!_req.preferRunOnUiThreadForStartingProcessProxyUI() || !C2039g2.m1987a()) {
            MMHandlerThread.postToMainThread(aVar);
        } else {
            aVar.run();
        }
    }

    /* renamed from: H7 */
    public void mo114356H7(AppBrandProxyUIProcessTask.ProcessResult processResult) {
        this.f240319h = true;
        runOnUiThread(new C81938c(processResult));
    }

    /* renamed from: I7 */
    public final void mo114357I7(AppBrandProxyUIProcessTask.ProcessResult processResult) {
        this.f240320i = true;
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("key_result_receiver");
        if (resultReceiver != null && processResult != null) {
            Bundle bundle = new Bundle(2);
            bundle.putParcelable("key_result_parcel", processResult);
            resultReceiver.mo164633b(0, bundle);
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
        AppBrandProxyUIProcessTask appBrandProxyUIProcessTask = this.f240316e;
        if (appBrandProxyUIProcessTask != null) {
            appBrandProxyUIProcessTask.onProcessInterrupted();
        }
    }

    public int getLayoutId() {
        return -1;
    }

    public void initActivityCloseAnimation() {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C89916g.m112446a(this).mo124233g(i, i2, intent);
        if (this.f240317f == null) {
            Log.m105920e("MicroMsg.AppBrandProcessProxyUI", "onActivityResult, NULL mRequest");
            finish();
            return;
        }
        Log.m105919d("MicroMsg.AppBrandProcessProxyUI", "onActivityResult, requestCode = %d, resultCode = %d, request = %s", Integer.valueOf(i), Integer.valueOf(i2), this.f240317f.getClass().getName());
        this.f240318g = false;
    }

    public void onCreate(Bundle bundle) {
        AppBrandProxyUIProcessTask appBrandProxyUIProcessTask;
        setTheme(C0966R.style.f8648pu);
        super.onCreate(bundle);
        boolean z = false;
        overridePendingTransition(0, 0);
        C85864g1.m106129d(getWindow());
        C85864g1.m106127b(getWindow(), getIntent().getBooleanExtra("key_need_light_status", false));
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        if (getIntent() == null) {
            finish();
            return;
        }
        int intExtra = getIntent().getIntExtra("key_running_mode", 0);
        if (intExtra == 1) {
            getIntent().setExtrasClassLoader(AppBrandProcessProxyUI.class.getClassLoader());
            String stringExtra = getIntent().getStringExtra("key_model_class_name");
            Log.m105925i("MicroMsg.AppBrandProcessProxyUI", "onCreate, modelClass = %s", stringExtra);
            if (!Util.isNullOrNil(stringExtra)) {
                try {
                    Constructor<?> declaredConstructor = Class.forName(stringExtra).getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    appBrandProxyUIProcessTask = (AppBrandProxyUIProcessTask) declaredConstructor.newInstance(new Object[0]);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrand.IpcProxyUIModelFactory", "create mode object using className(%s), exp = %s", stringExtra, Util.stackTraceToString(e));
                    appBrandProxyUIProcessTask = null;
                }
                this.f240316e = appBrandProxyUIProcessTask;
                if (appBrandProxyUIProcessTask == null) {
                    Log.m105921e("MicroMsg.AppBrandProcessProxyUI", "onCreate unknown model class = %s", stringExtra);
                } else if (getIntent().getBooleanExtra("key_request_need_params", true)) {
                    AppBrandProxyUIProcessTask.ProcessRequest processRequest = (AppBrandProxyUIProcessTask.ProcessRequest) getIntent().getParcelableExtra("key_request_parcel");
                    this.f240317f = processRequest;
                    if (processRequest == null) {
                        Log.m105921e("MicroMsg.AppBrandProcessProxyUI", "onCreate unknown request class = %s", stringExtra);
                    } else {
                        this.f240316e.attach(this);
                        this.f240316e.handleRequest(this.f240317f);
                        z = true;
                    }
                } else {
                    this.f240317f = null;
                }
            }
            if (!z) {
                finish();
            }
        } else if (intExtra == 2) {
            String stringExtra2 = getIntent().getStringExtra("key_alert_title");
            String str = "";
            String str2 = Util.isNullOrNil(stringExtra2) ? str : stringExtra2;
            String stringExtra3 = getIntent().getStringExtra("key_alert_message");
            String string = Util.isNullOrNil(stringExtra3) ? getString(C0966R.string.a3h) : stringExtra3;
            String stringExtra4 = getIntent().getStringExtra("key_alert_confirm");
            String str3 = Util.isNullOrNil(stringExtra4) ? str : stringExtra4;
            String stringExtra5 = getIntent().getStringExtra("key_alert_deny");
            if (!Util.isNullOrNil(stringExtra5)) {
                str = stringExtra5;
            }
            C81939d dVar = new C81939d((C819331) null);
            this.f240322n = dVar;
            C77398g C = C76879j.m92709C(this, string, str2, str3, str, false, dVar, dVar);
            this.f240321j = C;
            C.setOnDismissListener(this.f240322n);
            this.f240321j.setOnKeyListener(new C81960f(this, str));
        } else if (intExtra == 3) {
            MMHandlerThread.postToMainThread(new C81936b());
        } else if (intExtra != 10000) {
            finish();
        } else {
            Intent intent = (Intent) getIntent().getParcelableExtra("key_proxy_launch_target_intent");
            if (intent != null) {
                if (intent.getComponent() != null) {
                    try {
                        Class.forName(intent.getComponent().getClassName());
                    } catch (Exception e2) {
                        Log.m105921e("MicroMsg.AppBrandProcessProxyUI", "proxyLaunch, Class.forName %s, e = %s", intent.getComponent().getClassName(), e2);
                    }
                }
                try {
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (Exception e3) {
                    try {
                        Log.m105921e("MicroMsg.AppBrandProcessProxyUI", "start targetActivity, %s, e = %s", intent, e3);
                    } catch (Exception unused) {
                    }
                }
            } else {
                finish();
            }
        }
    }

    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        supportRequestWindowFeature(1);
    }

    public void onDestroy() {
        super.onDestroy();
        if (!this.f240320i) {
            Log.m105924i("MicroMsg.AppBrandProcessProxyUI", "has result not be called when destory");
            ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("key_result_receiver");
            if (resultReceiver != null) {
                resultReceiver.mo164633b(0, (Bundle) null);
            }
        }
        C89916g.m112447b(this);
        C77398g gVar = this.f240321j;
        if (gVar != null && gVar.isShowing()) {
            this.f240321j.dismiss();
            this.f240321j = null;
            this.f240322n = null;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        AppBrandProxyUIProcessTask appBrandProxyUIProcessTask = this.f240316e;
        if (appBrandProxyUIProcessTask != null) {
            appBrandProxyUIProcessTask.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void onResume() {
        super.onResume();
        int intExtra = getIntent().getIntExtra("key_running_mode", 0);
        if (intExtra == 10000) {
            int i = this.f240315d + 1;
            this.f240315d = i;
            if (i > 1) {
                try {
                    Class cls = (Class) getIntent().getSerializableExtra("key_proxy_launch_appbrand_ui_class");
                    if (cls == null) {
                        finish();
                        return;
                    }
                    Intent addFlags = new Intent(this, cls).putExtra("key_appbrand_bring_ui_to_front", true).addFlags(268435456);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(addFlags);
                    C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI", "onResume", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI", "onResume", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    finish();
                } catch (Exception unused) {
                    finish();
                }
            }
        } else if (intExtra == 2) {
            Log.m105918d("MicroMsg.AppBrandProcessProxyUI", "onResume, RUNNING_MODE_SHOW_ALERT");
        } else if (intExtra == 3) {
            Log.m105918d("MicroMsg.AppBrandProcessProxyUI", "onResume, RUNNING_MODE_OVERSEA_WECHAT_SERVICE_AUTHORIZE_DIALOG");
        } else {
            boolean z = activityHasDestroyed() || isFinishing() || this.f240319h;
            Log.m105919d("MicroMsg.AppBrandProcessProxyUI", "onResume, mFinishOnNextResume = %b, finishing = %b, request = %s", Boolean.valueOf(this.f240318g), Boolean.valueOf(z), this.f240317f.getClass().getName());
            if (this.f240318g && this.f240317f.oneShotForeground() && !z) {
                mo114356H7((AppBrandProxyUIProcessTask.ProcessResult) null);
            }
            this.f240318g = true;
        }
    }

    public void setMMOrientation() {
    }
}
