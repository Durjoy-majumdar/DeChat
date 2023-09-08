package com.tencent.p014mm.app;

import al3.C0086a;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.notification.C67845k;
import com.tencent.p014mm.p136ui.C6986o1;
import com.tencent.p014mm.p136ui.C6987p1;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.p136ui.contact.C74584x;
import com.tencent.p014mm.p136ui.contact.ContactRemarkInfoModUI;
import com.tencent.p014mm.p136ui.contact.ModRemarkNameUI;
import com.tencent.p014mm.p136ui.tools.C7013o;
import com.tencent.p014mm.p136ui.tools.CountryCodeUI;
import com.tencent.p014mm.p136ui.tools.ShowImageUI;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindQQUI;
import com.tencent.p014mm.plugin.account.p024ui.LoginIndepPass;
import com.tencent.p014mm.plugin.account.p024ui.LoginPasswordUI;
import com.tencent.p014mm.plugin.account.p024ui.LoginUI;
import com.tencent.p014mm.plugin.account.p024ui.MobileInputUI;
import com.tencent.p014mm.plugin.account.p024ui.RegByMobileVoiceVerifyUI;
import com.tencent.p014mm.plugin.account.p024ui.SimpleLoginUI;
import com.tencent.p014mm.plugin.gallery.picker.view.ImageCropUI;
import com.tencent.p014mm.process.KillProcessHelperActivity;
import com.tencent.p014mm.sdk.platformtools.LocationUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import f12.C7970a;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import p789bi.C67244b;
import p918s2.C77604h;
import qo3.C77389a;
import qo3.C77398g;
import qo3.C89779i0;
import wc3.C15141z;

/* renamed from: com.tencent.mm.app.r1 */
public class C67654r1 implements C15141z {
    /* renamed from: a */
    public void mo93168a(String str) {
        C67845k.C67847b.f194757a.f194756a.getClass();
        if (str != null) {
            C67244b bVar = C67244b.C67246b.f193087a;
            int i = bVar.mo91395i(str);
            Log.m105919d("MicroMsg.Notification.Handle", "cancel : %s", str);
            bVar.getClass();
            bVar.mo91393f(new C77604h(MMApplicationContext.getContext()), i);
        }
    }

    /* renamed from: b */
    public Intent mo93169b(Context context) {
        return new Intent(context, LauncherUI.class).addFlags(67108864);
    }

    /* renamed from: c */
    public void mo93170c(Intent intent, Context context) {
        int i = KillProcessHelperActivity.f121043d;
        C87412m.m108594g(context, "context");
        Log.m105924i("MicroMsg.KillProcessHelperActivity", "killAllProcessAndStartDstIntent() called with: context = " + context);
        Intent intent2 = new Intent(context, KillProcessHelperActivity.class);
        intent2.addFlags(268435456);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent2);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/process/KillProcessHelperActivity$Companion", "killAllProcessAndRestartLauncher", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/process/KillProcessHelperActivity$Companion", "killAllProcessAndRestartLauncher", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        Activity activity = null;
        C89779i0.m112248e(context, context.getResources().getString(C0966R.string.f360085a04), false, 3, (DialogInterface.OnCancelListener) null).show();
        if (context instanceof Activity) {
            activity = (Activity) context;
        }
        if (activity != null) {
            activity.overridePendingTransition(0, 0);
        }
    }

    /* renamed from: d */
    public C77398g mo93171d(Context context) {
        try {
            if (NetStatusUtil.isWifi(context) && LocationUtil.isGpsEnable()) {
                return null;
            }
            Boolean bool = (Boolean) C97625j3.m125812b().mo105906u().mo119684e(4105, Boolean.FALSE);
            if (bool != null && bool.booleanValue()) {
                return null;
            }
            View inflate = View.inflate(context, C0966R.C0971layout.b5w, (ViewGroup) null);
            ((CheckBox) inflate.findViewById(C0966R.C0970id.f358531fm1)).setOnCheckedChangeListener(new C6986o1());
            C6987p1 p1Var = new C6987p1(context);
            C77389a aVar = new C77389a();
            aVar.f225644a = C0086a.m38a(context).getString(C0966R.string.f361087h62);
            aVar.f225627J = inflate;
            aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.a2z);
            aVar.f225620C = p1Var;
            aVar.f225664u = C0086a.m38a(context).getString(C0966R.string.f8032zu);
            C77398g gVar = new C77398g(context, C0966R.style.a66);
            gVar.mo107525e(aVar);
            gVar.show();
            return gVar;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MMAppMgr", e, "showLbsTipsAlert error", new Object[0]);
            return null;
        }
    }

    /* renamed from: e */
    public void mo93172e(Intent intent, Context context) {
        if (context != null) {
            if (intent == null) {
                intent = new Intent();
            }
            intent.setClass(context, BindQQUI.class);
            MMWizardActivity.m7017L7(context, intent);
        }
    }

    /* renamed from: f */
    public void mo93173f(Intent intent, Context context) {
        if (context != null) {
            if (intent == null) {
                intent = new Intent();
            }
            String stringExtra = intent.getStringExtra("Contact_User");
            if (stringExtra != null) {
                C74584x.m89302e(intent, stringExtra);
            }
            Log.m105925i("MicroMsg.WorkerUICallbackImpl", "startChattingUI %s %s", stringExtra, Util.getStack().toString());
            intent.setClass(context, ChattingUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/app/WorkerUICallbackImpl", "startChattingUI", "(Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/app/WorkerUICallbackImpl", "startChattingUI", "(Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: g */
    public void mo93174g(Intent intent, Context context) {
        if (context != null) {
            if (intent == null) {
                intent = new Intent();
            }
            C88144b.m109791i(context, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        }
    }

    /* renamed from: h */
    public void mo93175h(Intent intent, Context context) {
        if (intent != null && context != null) {
            intent.setClass(context, ContactRemarkInfoModUI.class);
            if (context instanceof Activity) {
                intent.putExtra("key_label_click_source", ((Activity) context).getIntent().getIntExtra("key_label_click_source", 0));
            }
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/app/WorkerUICallbackImpl", "startContactRemarkInfoModUI", "(Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/app/WorkerUICallbackImpl", "startContactRemarkInfoModUI", "(Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: i */
    public void mo93176i(Intent intent, Context context) {
        if (intent != null && context != null) {
            Intent intent2 = new Intent();
            intent2.putExtras(intent.getExtras());
            if (intent.getFlags() != 0) {
                intent2.addFlags(intent.getFlags());
            }
            C88144b.m109791i(context, "subapp", ".ui.pluginapp.ContactSearchResultUI", intent2, (Bundle) null);
        }
    }

    /* renamed from: j */
    public void mo93177j(Intent intent, Activity activity, int i) {
        if (intent != null && activity != null) {
            intent.setClass(activity, CountryCodeUI.class);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            aVar.mo10233c(intent);
            C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/app/WorkerUICallbackImpl", "startCountryCodeUIForResult", "(Landroid/content/Intent;Landroid/app/Activity;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
    }

    /* renamed from: k */
    public void mo93178k(Activity activity, Intent intent, int i) {
        if (intent != null && activity != null) {
            int intExtra = intent.getIntExtra("CropImageMode", 0);
            if (intExtra == 4 || intExtra == 2) {
                intent.setClassName(activity, "com.tencent.mm.ui.tools.CropImageNewUI");
            } else {
                intent.setClass(activity, ImageCropUI.class);
            }
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            aVar.mo10233c(intent);
            C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/app/WorkerUICallbackImpl", "startCropImageNewUI", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
    }

    /* renamed from: l */
    public void mo93179l(Activity activity, Intent intent, Intent intent2, String str, int i, C7013o.C7017c cVar) {
        if (intent2 != null && activity != null) {
            int intExtra = intent2.getIntExtra("CropImageMode", 0);
            if (intExtra == 4 || intExtra == 2) {
                intent2.setClassName(activity, "com.tencent.mm.ui.tools.CropImageNewUI");
            } else {
                intent2.setClass(activity, ImageCropUI.class);
            }
            C7013o.m7259a(activity, intent, intent2, str, i, cVar);
        }
    }

    /* renamed from: m */
    public void mo93180m(Intent intent, int i, MMActivity mMActivity, Intent intent2) {
        if (intent != null && mMActivity != null) {
            if (intent.getIntExtra("CropImageMode", 0) == 4) {
                intent.setClassName(mMActivity, "com.tencent.mm.ui.tools.CropImageNewUI");
            } else {
                intent.setClass(mMActivity, ImageCropUI.class);
            }
            C97625j3.m125812b().getClass();
            C7013o.m7259a(mMActivity, intent2, intent, C7970a.m8127a(), i, (C7013o.C7017c) null);
        }
    }

    /* renamed from: n */
    public void mo93181n(Context context, Intent intent, Intent intent2) {
        if (context != null && intent != null) {
            int intExtra = intent.getIntExtra("from_source", 1);
            if (intExtra == 1) {
                intent.setClass(context, LoginUI.class);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/app/WorkerUICallbackImpl", "startDispathLoginUI", "(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/app/WorkerUICallbackImpl", "startDispathLoginUI", "(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (intExtra == 2) {
                intent.setClass(context, LoginPasswordUI.class);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent);
                C117292a.m165358d(context, aVar2.mo10232b(), "com/tencent/mm/app/WorkerUICallbackImpl", "startDispathLoginUI", "(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/app/WorkerUICallbackImpl", "startDispathLoginUI", "(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (intExtra == 3) {
                intent.setClass(context, SimpleLoginUI.class);
                if (intent2 != null) {
                    MMWizardActivity.m7018M7(context, intent, intent2);
                } else {
                    MMWizardActivity.m7017L7(context, intent);
                }
            } else if (intExtra == 5) {
                intent.setClass(context, LoginIndepPass.class);
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(intent);
                C117292a.m165358d(context, aVar3.mo10232b(), "com/tencent/mm/app/WorkerUICallbackImpl", "startDispathLoginUI", "(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar3.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/app/WorkerUICallbackImpl", "startDispathLoginUI", "(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (intExtra == 6) {
                intent.setClass(context, MobileInputUI.class);
                intent.putExtra("mobile_input_purpose", 1);
                intent.putExtra("mobile_auth_type", 7);
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(intent);
                C117292a.m165358d(context, aVar4.mo10232b(), "com/tencent/mm/app/WorkerUICallbackImpl", "startDispathLoginUI", "(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar4.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/app/WorkerUICallbackImpl", "startDispathLoginUI", "(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    /* renamed from: o */
    public void mo93182o(Intent intent, Context context) {
        Intent intent2 = new Intent();
        intent2.putExtras(intent.getExtras());
        if (intent.getFlags() != 0) {
            intent2.addFlags(intent.getFlags());
        }
        C88144b.m109791i(context, "subapp", ".ui.gallery.GestureGalleryUI", intent2, (Bundle) null);
    }

    /* renamed from: p */
    public void mo93183p(Intent intent, Context context) {
        if (intent != null && context != null) {
            intent.setClass(context, LauncherUI.class).addFlags(67108864);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/app/WorkerUICallbackImpl", "startLauncherUI", "(Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/app/WorkerUICallbackImpl", "startLauncherUI", "(Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: q */
    public void mo93184q(Intent intent, Context context) {
        if (intent != null && context != null) {
            if (intent.getIntExtra("Retr_Msg_Type", -1) < 0) {
                intent.putExtra("Retr_Msg_Type", 4);
            }
            intent.setClass(context, MsgRetransmitUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/app/WorkerUICallbackImpl", "startMsgRetransmitUI", "(Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/app/WorkerUICallbackImpl", "startMsgRetransmitUI", "(Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: r */
    public void mo93185r(Context context, Intent intent) {
        if (context != null && intent != null) {
            intent.setClass(context, RegByMobileVoiceVerifyUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/app/WorkerUICallbackImpl", "startRegByMobileVoiceVerifyUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/app/WorkerUICallbackImpl", "startRegByMobileVoiceVerifyUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: s */
    public void mo93186s(Intent intent, Context context) {
        if (intent != null && context != null) {
            intent.setClass(context, ModRemarkNameUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/app/WorkerUICallbackImpl", "startRemarkUI", "(Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/app/WorkerUICallbackImpl", "startRemarkUI", "(Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: t */
    public void mo93187t(Intent intent, Context context) {
        if (context != null) {
            if (intent == null) {
                intent = new Intent();
            }
            intent.setClassName(context, "com.tencent.mm.ui.contact.SayHiEditUI");
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/app/WorkerUICallbackImpl", "startSayHiEditUI", "(Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/app/WorkerUICallbackImpl", "startSayHiEditUI", "(Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: u */
    public void mo93188u(Context context, Intent intent) {
        if (intent != null && context != null) {
            intent.setClass(context, ShowImageUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/app/WorkerUICallbackImpl", "startShowImageUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/app/WorkerUICallbackImpl", "startShowImageUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: v */
    public void mo93189v(Context context, Intent intent) {
        if (context != null && intent != null) {
            C88144b.m109779A(context, "account", ".security.ui.SecurityAccountIntroUI", intent);
        }
    }

    /* renamed from: w */
    public void mo93190w(Intent intent, Context context) {
        if (context != null) {
            if (intent == null) {
                intent = new Intent();
            }
            C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }
}
