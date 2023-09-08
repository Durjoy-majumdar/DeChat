package com.tencent.p014mm.p136ui.tools;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.plugin.exdevice.ChattingUIExDeviceLogic;
import com.tencent.p014mm.autogen.events.ExDeviceUnBindHardDeviceEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.plugin.profile.p088ui.DialogContactInfoUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75604z3;
import eb0.C97625j3;
import ex0.C45696d;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.lang.ref.WeakReference;
import k20.C9556a;
import ke3.C88144b;
import md3.C47001b;
import nj3.C76879j;
import p154fy.C87121j;
import p227rn.C22240c0;
import p248ug.C52558c;
import p248ug.C52570c0;
import qo3.C89779i0;
import rb0.C47961a;
import rb0.C47984k;
import rb0.C48009v0;
import te3.C52085y83;

/* renamed from: com.tencent.mm.ui.tools.p */
public class C45074p {

    /* renamed from: a */
    public static boolean f122265a;

    /* renamed from: b */
    public static WeakReference<C89779i0> f122266b;

    /* renamed from: com.tencent.mm.ui.tools.p$a */
    public class C45075a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C52558c f122267d;

        /* renamed from: e */
        public final /* synthetic */ Activity f122268e;

        /* renamed from: f */
        public final /* synthetic */ C72996z1 f122269f;

        /* renamed from: g */
        public final /* synthetic */ boolean f122270g;

        /* renamed from: h */
        public final /* synthetic */ int f122271h;

        /* renamed from: i */
        public final /* synthetic */ Runnable f122272i;

        public C45075a(C52558c cVar, Activity activity, C72996z1 z1Var, boolean z, int i, Runnable runnable) {
            this.f122267d = cVar;
            this.f122268e = activity;
            this.f122269f = z1Var;
            this.f122270g = z;
            this.f122271h = i;
            this.f122272i = runnable;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C45074p.m49919a(this.f122267d, this.f122268e, this.f122269f, this.f122270g, this.f122271h);
            ((C52570c0) C86709a0.m107533q(C52570c0.class)).mo58179IC(this.f122267d);
            Runnable runnable = this.f122272i;
            if (runnable != null) {
                runnable.run();
            }
            if (C85875k4.m106208w() && this.f122271h != 4) {
                C88144b.m109801s(this.f122268e, ".ui.EmptyActivity", new Intent(), (Bundle) null);
                Log.m105924i("MicroMsg.BizContactDeleteUtil", "start empty activity");
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.p$b */
    public class C45076b implements DialogInterface.OnCancelListener {
        public void onCancel(DialogInterface dialogInterface) {
            C45074p.f122265a = true;
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.p$c */
    public class C45077c implements C47001b.C47002a {

        /* renamed from: d */
        public final /* synthetic */ C72996z1 f122273d;

        /* renamed from: e */
        public final /* synthetic */ C52558c f122274e;

        /* renamed from: f */
        public final /* synthetic */ WeakReference f122275f;

        /* renamed from: g */
        public final /* synthetic */ boolean f122276g;

        public C45077c(C72996z1 z1Var, C52558c cVar, WeakReference weakReference, boolean z) {
            this.f122273d = z1Var;
            this.f122274e = cVar;
            this.f122275f = weakReference;
            this.f122276g = z;
        }

        /* renamed from: v2 */
        public void mo10385v2(String str, int i, C52085y83 y832) {
            String str2 = str;
            C52085y83 y833 = y832;
            boolean z = false;
            if (!str2.equals(this.f122273d.getUsername())) {
                Log.m105929w("MicroMsg.BizContactDeleteUtil", "not current contact %s,%s", this.f122273d.getUsername(), str2);
                return;
            }
            Log.m105925i("MicroMsg.BizContactDeleteUtil", "dealDelContactEvent callBack %s, ret=%d", str2, Integer.valueOf(i));
            ((C47001b) C86709a0.m107533q(C47001b.class)).mo71279fN(this);
            WeakReference<C89779i0> weakReference = C45074p.f122266b;
            if (!(weakReference == null || weakReference.get() == null)) {
                C45074p.f122266b.get().dismiss();
            }
            if (i == 0) {
                C52558c cVar = this.f122274e;
                Activity activity = (Activity) this.f122275f.get();
                C72996z1 z1Var = this.f122273d;
                boolean z2 = this.f122276g;
                Class cls = C45696d.class;
                Class cls2 = C52570c0.class;
                Class cls3 = C75700k0.class;
                if (cVar == null || z1Var == null) {
                    Object[] objArr = new Object[2];
                    objArr[0] = Boolean.valueOf(cVar == null);
                    if (z1Var == null) {
                        z = true;
                    }
                    objArr[1] = Boolean.valueOf(z);
                    Log.m105921e("MicroMsg.BizContactDeleteUtil", "error args, %b, %b", objArr);
                    return;
                }
                String username = z1Var.getUsername();
                if (C45628s0.m50743H(username)) {
                    ((C75700k0) C86709a0.m107533q(cls3)).mo96097Ni().mo69688c(username);
                    ((C44662n1) C97625j3.m125812b().mo105902q()).mo69807jo(username);
                } else {
                    C45080q qVar = new C45080q(cVar, username);
                    C48009v0.wx0().getClass();
                    C47961a.f128666a = username;
                    C47961a.f128667b = System.currentTimeMillis();
                    ((C75700k0) C86709a0.m107533q(cls3)).mo96097Ni().mo69719p3(username, z1Var);
                    if (cVar.mo72811g1()) {
                        C47984k.m53327a(cVar.field_username);
                        ((C75700k0) C86709a0.m107533q(cls3)).mo96097Ni().mo69688c(username);
                    } else {
                        C75604z3.m90836h(username, qVar);
                        ((C87121j) C86312j.m106911c(C87121j.class)).mo71213Ot(username, 15);
                        ((C44660i2) C97625j3.m125812b().mo105908w()).mo69763f(username);
                    }
                    if (activity != null && z2) {
                        activity.setResult(-1, activity.getIntent().putExtra("_delete_ok_", true));
                    }
                }
                if (ChattingUIExDeviceLogic.m43121a(cVar)) {
                    ExDeviceUnBindHardDeviceEvent exDeviceUnBindHardDeviceEvent = new ExDeviceUnBindHardDeviceEvent();
                    exDeviceUnBindHardDeviceEvent.f107512d.f107513a = username;
                    exDeviceUnBindHardDeviceEvent.publish();
                }
                C48009v0.Hx0().mo72783jo(username);
                C48009v0.Jx0().mo25795Yt(username);
                C48009v0.Kx0().mo25743qq(username);
                ((C22240c0) C86312j.m106911c(C22240c0.class)).gf0(username);
                if (!(C86709a0.m107533q(cls2) == null || C86709a0.m107533q(cls) == null || !((C52570c0) C86709a0.m107533q(cls2)).mo58182e())) {
                    ((C45696d) C86709a0.m107533q(cls)).mo70958Eh();
                }
                if (z2 && activity != null) {
                    int intExtra = activity.getIntent().getIntExtra("Kdel_from", -1);
                    if (intExtra == 0) {
                        Intent intent = new Intent(activity, LauncherUI.class);
                        intent.addFlags(335544320);
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        Activity activity2 = activity;
                        C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/mm/ui/tools/BizContactDeleteUtil", "dealDelContact", "(Lcom/tencent/mm/api/BizInfo;Landroid/app/Activity;Lcom/tencent/mm/storage/Contact;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activity.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(activity2, "com/tencent/mm/ui/tools/BizContactDeleteUtil", "dealDelContact", "(Lcom/tencent/mm/api/BizInfo;Landroid/app/Activity;Lcom/tencent/mm/storage/Contact;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activity.finish();
                    } else if (intExtra == 2) {
                        Intent intent2 = new Intent();
                        intent2.addFlags(67108864);
                        C88144b.m109791i(activity, "brandservice", ".ui.BrandServiceIndexUI", intent2, (Bundle) null);
                        activity.finish();
                    } else if (activity instanceof DialogContactInfoUI) {
                        Log.m105924i("MicroMsg.BizContactDeleteUtil", "del from DialogContactInfoUI, do nothing");
                    } else {
                        activity.finish();
                    }
                }
            } else if (!Util.isNullOrNil(y833.f145175d)) {
                C76879j.m92748s((Context) this.f122275f.get(), y833.f145175d, y833.f145176e);
            } else {
                C76879j.m92748s((Context) this.f122275f.get(), MMApplicationContext.getContext().getString(C0966R.string.f7945x2), "");
            }
        }
    }

    /* renamed from: a */
    public static void m49919a(C52558c cVar, Activity activity, C72996z1 z1Var, boolean z, int i) {
        Class cls = C47001b.class;
        boolean z2 = false;
        if (cVar == null || activity == null || z1Var == null) {
            Object[] objArr = new Object[3];
            objArr[0] = Boolean.valueOf(cVar == null);
            objArr[1] = Boolean.valueOf(activity == null);
            if (z1Var == null) {
                z2 = true;
            }
            objArr[2] = Boolean.valueOf(z2);
            Log.m105921e("MicroMsg.BizContactDeleteUtil", "error args, %b, %b, %b", objArr);
            return;
        }
        f122265a = false;
        f122266b = new WeakReference<>(C76879j.m92723Q(activity, activity.getString(C0966R.string.a3h), activity.getString(C0966R.string.a4d), true, true, new C45076b()));
        WeakReference weakReference = new WeakReference(activity);
        String username = z1Var.getUsername();
        z1Var.mo62935u4();
        ((C47001b) C86709a0.m107533q(cls)).mo71280gh(username);
        ((C47001b) C86709a0.m107533q(cls)).mo71281st(new C45077c(z1Var, cVar, weakReference, z));
    }

    /* renamed from: b */
    public static void m49920b(C52558c cVar, Activity activity, C72996z1 z1Var, boolean z, Runnable runnable, int i) {
        Activity activity2 = activity;
        boolean z2 = true;
        if (cVar == null || activity2 == null || z1Var == null) {
            Object[] objArr = new Object[3];
            objArr[0] = Boolean.valueOf(cVar == null);
            objArr[1] = Boolean.valueOf(activity2 == null);
            if (z1Var != null) {
                z2 = false;
            }
            objArr[2] = Boolean.valueOf(z2);
            Log.m105921e("MicroMsg.BizContactDeleteUtil", "bizInfo null : %s, context null : %s, ct null : %s", objArr);
            return;
        }
        C76879j.m92708B(activity, cVar.mo73502t2() ? activity.getString(C0966R.string.ath) : activity.getString(C0966R.string.ati, new Object[]{z1Var.mo62898f()}), "", activity.getString(C0966R.string.bq_), activity.getString(C0966R.string.bq9), new C45075a(cVar, activity, z1Var, z, i, runnable), (DialogInterface.OnClickListener) null, C0966R.color.a_0);
    }
}
