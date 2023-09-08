package p279yl;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$f;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindMContactUI;
import com.tencent.p014mm.plugin.account.p024ui.MobileVerifyUI;
import com.tencent.p014mm.qqlogin.ChangeQQLoginTypeManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86301e;
import eb0.C75592q0;
import ei3.C86522b;
import f40.C86709a0;
import ke3.C88144b;
import lc3.C10485b;
import nc0.C76850a;
import nj3.C76879j;
import p286zl.C16293k;
import qg0.C12215a;
import qo3.C77389a;
import qo3.C77426q;
import xe3.C15674c;
import ye3.C15986a;

@C86522b
/* renamed from: yl.k */
public class C16036k extends C86301e implements C16293k {

    /* renamed from: yl.k$a */
    public class C16037a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Activity f43135d;

        /* renamed from: e */
        public final /* synthetic */ Intent f43136e;

        /* renamed from: f */
        public final /* synthetic */ C16293k.C16294a f43137f;

        /* renamed from: yl.k$a$a */
        public class C16038a implements MMFragmentActivity$$f {
            public C16038a() {
            }

            public void mmOnActivityResult(int i, int i2, Intent intent) {
                C16037a.this.f43137f.onActivityResult(i, i2, intent);
            }
        }

        public C16037a(C16036k kVar, Activity activity, Intent intent, C16293k.C16294a aVar) {
            this.f43135d = activity;
            this.f43136e = intent;
            this.f43137f = aVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C88144b.m109804v((MMFragmentActivity) this.f43135d, ".plugin.account.bind.ui.BindMContactUI", this.f43136e, 1, new C16038a());
        }
    }

    /* renamed from: yl.k$b */
    public class C16039b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C16293k.C16294a f43139d;

        public C16039b(C16036k kVar, C16293k.C16294a aVar) {
            this.f43139d = aVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f43139d.onCancel();
        }
    }

    /* renamed from: yl.k$c */
    public class C16040c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Activity f43140d;

        /* renamed from: e */
        public final /* synthetic */ String f43141e;

        /* renamed from: f */
        public final /* synthetic */ C16293k.C16294a f43142f;

        /* renamed from: yl.k$c$a */
        public class C16041a implements MMFragmentActivity$$f {
            public C16041a() {
            }

            public void mmOnActivityResult(int i, int i2, Intent intent) {
                C16040c.this.f43142f.onActivityResult(i, i2, intent);
            }
        }

        public C16040c(C16036k kVar, Activity activity, String str, C16293k.C16294a aVar) {
            this.f43140d = activity;
            this.f43141e = str;
            this.f43142f = aVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent(this.f43140d, MobileVerifyUI.class);
            intent.putExtra("bindmcontact_mobile", this.f43141e);
            intent.putExtra("mobile_verify_purpose", 5);
            C88144b.m109804v((MMFragmentActivity) this.f43140d, ".plugin.account.ui.MobileVerifyUI", intent, 1, new C16041a());
        }
    }

    /* renamed from: yl.k$d */
    public class C16042d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C16293k.C16294a f43144d;

        public C16042d(C16036k kVar, C16293k.C16294a aVar) {
            this.f43144d = aVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f43144d.onCancel();
        }
    }

    /* renamed from: yl.k$e */
    public class C16043e implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Activity f43145d;

        /* renamed from: e */
        public final /* synthetic */ Intent f43146e;

        /* renamed from: f */
        public final /* synthetic */ C16293k.C16294a f43147f;

        /* renamed from: yl.k$e$a */
        public class C16044a implements MMFragmentActivity$$f {
            public C16044a() {
            }

            public void mmOnActivityResult(int i, int i2, Intent intent) {
                C16043e.this.f43147f.onActivityResult(i, i2, intent);
            }
        }

        public C16043e(C16036k kVar, Activity activity, Intent intent, C16293k.C16294a aVar) {
            this.f43145d = activity;
            this.f43146e = intent;
            this.f43147f = aVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C88144b.m109804v((MMFragmentActivity) this.f43145d, ".plugin.account.bind.ui.BindMContactUI", this.f43146e, 1, new C16044a());
        }
    }

    /* renamed from: yl.k$f */
    public class C16045f implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C16293k.C16294a f43149d;

        public C16045f(C16036k kVar, C16293k.C16294a aVar) {
            this.f43149d = aVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f43149d.onCancel();
        }
    }

    /* renamed from: yl.k$g */
    public class C16046g implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Activity f43150d;

        /* renamed from: e */
        public final /* synthetic */ String f43151e;

        /* renamed from: f */
        public final /* synthetic */ C16293k.C16294a f43152f;

        /* renamed from: yl.k$g$a */
        public class C16047a implements MMFragmentActivity$$f {
            public C16047a() {
            }

            public void mmOnActivityResult(int i, int i2, Intent intent) {
                C16046g.this.f43152f.onActivityResult(i, i2, intent);
            }
        }

        public C16046g(C16036k kVar, Activity activity, String str, C16293k.C16294a aVar) {
            this.f43150d = activity;
            this.f43151e = str;
            this.f43152f = aVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent(this.f43150d, MobileVerifyUI.class);
            intent.putExtra("bindmcontact_mobile", this.f43151e);
            intent.putExtra("mobile_verify_purpose", 5);
            C88144b.m109804v((MMFragmentActivity) this.f43150d, ".plugin.account.ui.MobileVerifyUI", intent, 1, new C16047a());
        }
    }

    /* renamed from: yl.k$h */
    public class C16048h implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Activity f43154d;

        /* renamed from: e */
        public final /* synthetic */ C16293k.C16294a f43155e;

        /* renamed from: yl.k$h$a */
        public class C16049a implements MMFragmentActivity$$f {
            public C16049a() {
            }

            public void mmOnActivityResult(int i, int i2, Intent intent) {
                C16048h.this.f43155e.onActivityResult(i, i2, intent);
            }
        }

        public C16048h(C16036k kVar, Activity activity, C16293k.C16294a aVar) {
            this.f43154d = activity;
            this.f43155e = aVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent(this.f43154d, BindMContactUI.class);
            intent.putExtra("bind_scene", 3);
            String simCountryIso = ((TelephonyManager) this.f43154d.getSystemService("phone")).getSimCountryIso();
            if (!Util.isNullOrNil(simCountryIso)) {
                Activity activity = this.f43154d;
                C76850a.C76851a a = C76850a.m92629a(activity, simCountryIso, activity.getString(C0966R.string.bvs));
                if (a != null) {
                    intent.putExtra("country_name", a.f224677c);
                    intent.putExtra("couttry_code", a.f224676b);
                }
            }
            C88144b.m109804v((MMFragmentActivity) this.f43154d, ".plugin.account.bind.ui.BindMContactUI", intent, 1, new C16049a());
        }
    }

    /* renamed from: yl.k$i */
    public class C16050i implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C16293k.C16294a f43157d;

        public C16050i(C16036k kVar, C16293k.C16294a aVar) {
            this.f43157d = aVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f43157d.onCancel();
        }
    }

    /* renamed from: XV */
    public void mo14653XV(Activity activity, C16293k.C16294a aVar) {
        Class cls = C10485b.class;
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null);
        if (C75592q0.m90791u() && !Util.isNullOrNil(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("AffiliatedAcctForgetPwdUrl"))) {
            C12215a.m11778c(activity, ((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("AffiliatedAcctForgetPwdUrl"), 0, true);
        } else if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.SetPwdServiceSetPwdService", "has not bind mobile");
            Intent intent = new Intent(activity, BindMContactUI.class);
            intent.putExtra("bind_scene", 4);
            intent.putExtra("bind_scene", 4);
            C76879j.m92709C(activity, activity.getString(C0966R.string.hxu), "", activity.getString(C0966R.string.amd), activity.getString(C0966R.string.f7926wf), true, new C16037a(this, activity, intent, aVar), new C16039b(this, aVar));
        } else {
            Log.m105924i("MicroMsg.SetPwdServiceSetPwdService", "has bind mobile");
            Activity activity2 = activity;
            C76879j.m92709C(activity2, activity.getString(C0966R.string.hxs, new Object[]{str}), "", activity.getString(C0966R.string.a2s), activity.getString(C0966R.string.f7926wf), true, new C16040c(this, activity, str, aVar), new C16042d(this, aVar));
        }
    }

    /* renamed from: YI */
    public void mo14654YI() {
        ChangeQQLoginTypeManager changeQQLoginTypeManager = ChangeQQLoginTypeManager.f24095a;
        C80907o.m98781d(WeChatProcess.PROCESS_PUSH, null, C15674c.class, C15986a.f43033d);
    }

    /* renamed from: ZE */
    public void mo14655ZE(Activity activity, C16293k.C16294a aVar) {
        Class cls = C10485b.class;
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null);
        if (C75592q0.m90791u() && !Util.isNullOrNil(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("AffiliatedAcctForgetPwdUrl"))) {
            C12215a.m11778c(activity, ((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("AffiliatedAcctForgetPwdUrl"), 0, true);
        } else if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.SetPwdServiceSetPwdService", "has not bind mobile");
            Intent intent = new Intent(activity, BindMContactUI.class);
            intent.putExtra("bind_scene", 4);
            intent.putExtra("bind_scene", 4);
            C76879j.m92709C(activity, activity.getString(C0966R.string.hxu), "", activity.getString(C0966R.string.amd), activity.getString(C0966R.string.f7926wf), true, new C16043e(this, activity, intent, aVar), new C16045f(this, aVar));
        } else {
            Log.m105924i("MicroMsg.SetPwdServiceSetPwdService", "has bind mobile");
            C77426q qVar = new C77426q(activity);
            String string = activity.getString(C0966R.string.ncl);
            String string2 = activity.getString(C0966R.string.ncj, new Object[]{str});
            String string3 = activity.getString(C0966R.string.nck);
            String string4 = activity.getString(C0966R.string.nci);
            String string5 = activity.getString(C0966R.string.f7926wf);
            qVar.mo107606r(string);
            qVar.mo107595g(string2);
            C77389a aVar2 = qVar.f225837a.f225714b;
            aVar2.f225665v = string3;
            aVar2.f225666w = string4;
            aVar2.f225667x = string5;
            C16046g gVar = new C16046g(this, activity, str, aVar);
            C16048h hVar = new C16048h(this, activity, aVar);
            C16050i iVar = new C16050i(this, aVar);
            aVar2.f225624G = gVar;
            aVar2.f225625H = hVar;
            aVar2.f225626I = iVar;
            qVar.mo107603o();
            Button button = (Button) qVar.f225839c.findViewById(C0966R.C0970id.guf);
            if (button != null) {
                button.setTextColor(activity.getResources().getColor(C0966R.color.f3131gg));
            }
        }
    }

    /* renamed from: pW */
    public C16293k.C16295b mo14656pW() {
        ChangeQQLoginTypeManager changeQQLoginTypeManager = ChangeQQLoginTypeManager.f24095a;
        return ChangeQQLoginTypeManager.f24096b;
    }
}
