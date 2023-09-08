package com.tencent.p014mm.plugin.webview.modeltools;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1;
import com.tencent.p014mm.pluginsdk.model.C19446g1;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.lang.ref.WeakReference;
import k20.C60958c;
import k20.C9556a;
import m93.C46969f;
import p206nj.C11171e;
import p262wm.C22921c;
import p262wm.C53187e;
import qo3.C47883u;
import qo3.C77426q;

/* renamed from: com.tencent.mm.plugin.webview.modeltools.b */
public final class C43741b {

    /* renamed from: a */
    public WeakReference<C43977g1> f118211a = null;

    /* renamed from: com.tencent.mm.plugin.webview.modeltools.b$a */
    public class C43742a implements PendingIntent.OnFinished {
        public C43742a(C43741b bVar) {
        }

        public void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
            Log.m105925i("MicroMsg.BrowserChooserHelper", "onSendFinished resultCode: %d, , resultData: %s", Integer.valueOf(i), str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.modeltools.b$b */
    public class C43743b implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ C47883u f118212a;

        public C43743b(C47883u uVar) {
            this.f118212a = uVar;
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            C47883u uVar = this.f118212a;
            if (uVar != null) {
                uVar.mo353a(z, str);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.modeltools.b$c */
    public class C43744c implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ C47883u f118213a;

        /* renamed from: b */
        public final /* synthetic */ Context f118214b;

        /* renamed from: c */
        public final /* synthetic */ String f118215c;

        public C43744c(C47883u uVar, Context context, String str) {
            this.f118213a = uVar;
            this.f118214b = context;
            this.f118215c = str;
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            C47883u uVar = this.f118213a;
            if (uVar != null) {
                uVar.mo353a(z, str);
            }
            Context context = this.f118214b;
            String str2 = this.f118215c;
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
            intent.addFlags(268435456);
            try {
                if (!Util.isOverseasUser(context)) {
                    if (!ChannelUtil.isGPVersion()) {
                        Intent a = C46969f.m52276a(context, intent, str2, false);
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(a);
                        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/modeltools/BrowserChooserHelper", "openBrowser", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(context, "com/tencent/mm/plugin/webview/modeltools/BrowserChooserHelper", "openBrowser", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return;
                    }
                }
                if (C11171e.m11046c(29)) {
                    PendingIntent.getActivity(context, 0, intent, 134217728).send(context, 1, (Intent) null, new C43747c(), (Handler) null);
                    return;
                }
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent);
                C117292a.m165358d(context, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/modeltools/BrowserChooserHelper", "openBrowser", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/webview/modeltools/BrowserChooserHelper", "openBrowser", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (Exception e) {
                Log.m105921e("MicroMsg.BrowserChooserHelper", "open in browser failed : %s", e.getMessage());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.modeltools.b$d */
    public class C43745d implements PendingIntent.OnFinished {
        public C43745d(C43741b bVar) {
        }

        public void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
            Log.m105925i("MicroMsg.BrowserChooserHelper", "onSendFinished resultCode: %d, , resultData: %s", Integer.valueOf(i), str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.modeltools.b$e */
    public class C43746e implements PendingIntent.OnFinished {
        public C43746e(C43741b bVar) {
        }

        public void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
            Log.m105925i("MicroMsg.BrowserChooserHelper", "onSendFinished resultCode: %d, , resultData: %s", Integer.valueOf(i), str);
        }
    }

    /* renamed from: b */
    public static void m47584b(Context context, String str, String str2, C47883u uVar, C47883u uVar2) {
        if ((!(context instanceof Activity) || !((Activity) context).isFinishing()) && !Util.isNullOrNil(str)) {
            if (!str.startsWith(HttpWrapperBase.PROTOCAL_HTTP) && !str.startsWith(HttpWrapperBase.PROTOCAL_HTTPS)) {
                str = HttpWrapperBase.PROTOCAL_HTTP + str;
            }
            C77426q qVar = new C77426q(context);
            qVar.mo107595g(str2);
            qVar.mo107602n(context.getString(C0966R.string.f7564js));
            qVar.mo107598j(context.getString(C0966R.string.f7926wf));
            qVar.mo107600l(new C43744c(uVar, context, str));
            qVar.mo107597i(new C43743b(uVar2));
            qVar.mo107603o();
        }
    }

    /* renamed from: a */
    public boolean mo68049a(Activity activity, int i, int i2, Intent intent) {
        WeakReference<C43977g1> weakReference;
        Activity activity2 = activity;
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        boolean z = false;
        if (202 == i3) {
            if (-1 == i4 && intent2 != null) {
                String stringExtra = intent2.getStringExtra("selectpkg");
                Bundle bundleExtra = intent2.getBundleExtra("transferback");
                boolean booleanExtra = intent2.getBooleanExtra("isalways", false);
                Log.m105925i("MicroMsg.BrowserChooserHelper", "App Chooser Browser is %s", stringExtra);
                C19446g1 Q6 = ((C22921c) C86312j.m106911c(C22921c.class)).mo35881Q6(0, (Bundle) null);
                if (Q6.mo25203i(stringExtra)) {
                    if (Q6.mo25202h(activity2)) {
                        ((C53187e) Q6).mo25195a(activity2, bundleExtra.getString("targeturl"));
                    } else {
                        Intent intent3 = new Intent((Intent) bundleExtra.getParcelable("targetintent"));
                        intent3.setPackage(stringExtra);
                        intent3.addFlags(524288);
                        if (C11171e.m11046c(29)) {
                            try {
                                PendingIntent.getActivity(activity2, 0, intent3, 134217728).send(activity, 1, (Intent) null, new C43745d(this), (Handler) null);
                            } catch (Exception e) {
                                Log.m105921e("MicroMsg.BrowserChooserHelper", "open in browser failed : %s", e.getMessage());
                            }
                        } else {
                            C9556a aVar = new C9556a();
                            aVar.mo10233c(intent3);
                            C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/webview/modeltools/BrowserChooserHelper", "onActivityResult", "(Landroid/app/Activity;IILandroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            activity2.startActivity((Intent) aVar.mo10231a(0));
                            C117292a.m165359e(activity, "com/tencent/mm/plugin/webview/modeltools/BrowserChooserHelper", "onActivityResult", "(Landroid/app/Activity;IILandroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        }
                    }
                    if (booleanExtra) {
                        C115669n.INSTANCE.mo160131h(10998, 4, 2);
                    } else {
                        C115669n.INSTANCE.mo160131h(10998, 4, 1);
                    }
                } else {
                    Intent intent4 = new Intent((Intent) bundleExtra.getParcelable("targetintent"));
                    intent4.setPackage(stringExtra);
                    intent4.addFlags(524288);
                    try {
                        if (C11171e.m11046c(29)) {
                            PendingIntent.getActivity(activity2, 0, intent4, 134217728).send(activity, 1, (Intent) null, new C43746e(this), (Handler) null);
                        } else {
                            C9556a aVar2 = new C9556a();
                            aVar2.mo10233c(intent4);
                            C117292a.m165358d(activity, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/modeltools/BrowserChooserHelper", "onActivityResult", "(Landroid/app/Activity;IILandroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            activity2.startActivity((Intent) aVar2.mo10231a(0));
                            C117292a.m165359e(activity, "com/tencent/mm/plugin/webview/modeltools/BrowserChooserHelper", "onActivityResult", "(Landroid/app/Activity;IILandroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        }
                    } catch (Exception e2) {
                        Log.m105929w("MicroMsg.BrowserChooserHelper", "onActivityResult err:%s", e2.getMessage());
                    }
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.mo160131h(10998, 5);
                    if (booleanExtra) {
                        nVar.mo160131h(10998, 5, 2);
                    } else {
                        nVar.mo160131h(10998, 5, 1);
                    }
                }
            }
            return true;
        } else if (i3 != 205) {
            return false;
        } else {
            if (i4 == -1) {
                int intExtra = intent2 != null ? intent2.getIntExtra("browser_setting_result", 0) : 0;
                Object[] objArr = new Object[3];
                objArr[0] = Integer.valueOf(i2);
                if (intent2 != null) {
                    z = true;
                }
                objArr[1] = Boolean.valueOf(z);
                objArr[2] = Integer.valueOf(intExtra);
                Log.m105925i("MicroMsg.BrowserChooserHelper", "alvinluo chooseBrowser onActivityResult resultCode: %d, data != null: %b, settingResult: %d", objArr);
                WeakReference<C43977g1> weakReference2 = this.f118211a;
                if (!(weakReference2 == null || weakReference2.get() == null || intent2 == null || intExtra != 1)) {
                    C43977g1 g1Var = this.f118211a.get();
                    C43977g1.C43997u uVar = new C43977g1.C43997u(45);
                    if (uVar.f119202c == null) {
                        uVar.f119202c = new Bundle();
                    }
                    if (intent.getExtras() != null) {
                        uVar.f119202c.putAll(intent.getExtras());
                    }
                    g1Var.f119134g.put(Integer.valueOf(uVar.f119200a), uVar);
                    g1Var.mo68575I();
                }
            } else if (i4 == 0) {
                if (intent2 != null && intent2.getBooleanExtra("show_webview_menu", false)) {
                    z = true;
                }
                if (!(!z || (weakReference = this.f118211a) == null || weakReference.get() == null)) {
                    Log.m105924i("MicroMsg.BrowserChooserHelper", "alvinluo chooseBrowser cancel and show webview menu");
                    this.f118211a.get().mo68575I();
                }
            }
            return true;
        }
    }

    /* renamed from: c */
    public void mo68050c(Activity activity, String str) {
        if (activity != null && !activity.isFinishing() && !Util.isNullOrNil(str)) {
            if (!str.startsWith(HttpWrapperBase.PROTOCAL_HTTP) && !str.startsWith(HttpWrapperBase.PROTOCAL_HTTPS)) {
                str = HttpWrapperBase.PROTOCAL_HTTP + str;
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            try {
                if (!Util.isOverseasUser(activity)) {
                    if (!ChannelUtil.isGPVersion()) {
                        Intent a = C46969f.m52276a(activity, intent, str, true);
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(205);
                        aVar.mo10233c(a);
                        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/webview/modeltools/BrowserChooserHelper", "showAndOpenInBrowser", "(Landroid/app/Activity;Ljava/lang/String;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                        return;
                    }
                }
                if (C11171e.m11046c(29)) {
                    PendingIntent.getActivity(activity, 0, intent, 134217728).send(activity, 1, (Intent) null, new C43742a(this), (Handler) null);
                    return;
                }
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent);
                C117292a.m165358d(activity, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/modeltools/BrowserChooserHelper", "showAndOpenInBrowser", "(Landroid/app/Activity;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(activity, "com/tencent/mm/plugin/webview/modeltools/BrowserChooserHelper", "showAndOpenInBrowser", "(Landroid/app/Activity;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (Exception e) {
                Log.m105921e("MicroMsg.BrowserChooserHelper", "open in browser failed : %s", e.getMessage());
            }
        }
    }
}
