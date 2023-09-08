package com.tencent.p014mm.plugin.account.p024ui;

import a70.C112760b;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bc0.C67216a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.LoginDisasterEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.ThirdAppRegisterStruct;
import com.tencent.p014mm.modelsimple.C114735a0;
import com.tencent.p014mm.modelsimple.C114739c0;
import com.tencent.p014mm.modelsimple.C1302b0;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.applet.SecurityImage;
import com.tencent.p014mm.plugin.account.p024ui.C115203z0;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.PhoneFormater;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75593t5;
import eb0.C7624i3;
import f40.C86709a0;
import f40.C86718e;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p196ln.C76705f;
import p206nj.C76861g;
import p214om.C11502f;
import sf0.C77687b;
import wg0.C78595a;

/* renamed from: com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg */
public class MobileLoginOrForceReg extends MMActivity implements C11385n {

    /* renamed from: Q */
    public static final /* synthetic */ int f344725Q = 0;

    /* renamed from: A */
    public MMHandler f344726A = new C114984g();

    /* renamed from: B */
    public boolean f344727B;

    /* renamed from: C */
    public String f344728C;

    /* renamed from: D */
    public String f344729D;

    /* renamed from: E */
    public SecurityImage f344730E = null;

    /* renamed from: F */
    public C77687b f344731F;

    /* renamed from: G */
    public String f344732G;

    /* renamed from: H */
    public int f344733H;

    /* renamed from: I */
    public String f344734I;

    /* renamed from: J */
    public String f344735J;

    /* renamed from: K */
    public int f344736K;

    /* renamed from: L */
    public int f344737L;

    /* renamed from: M */
    public ThirdAppRegisterStruct f344738M = new ThirdAppRegisterStruct();

    /* renamed from: N */
    public IListener f344739N = new IListener<LoginDisasterEvent>(this, C40008f.f107254d) {
        {
            this.__eventId = -1399051904;
        }

        public boolean callback(IEvent iEvent) {
            LoginDisasterEvent.C114679a aVar;
            LoginDisasterEvent loginDisasterEvent = (LoginDisasterEvent) iEvent;
            if (loginDisasterEvent == null || (aVar = loginDisasterEvent.f343570d) == null) {
                return false;
            }
            Log.m105925i("MicroMsg.MobileLoginOrForceReg", "summerdiz loginDisasterListener callback content[%s], url[%s]", aVar.f343571a, aVar.f343572b);
            Intent intent = new Intent();
            intent.putExtra("key_disaster_content", loginDisasterEvent.f343570d.f343571a);
            intent.putExtra("key_disaster_url", loginDisasterEvent.f343570d.f343572b);
            intent.setClass(MMApplicationContext.getContext(), DisasterUI.class).addFlags(268435456);
            Context context = MMApplicationContext.getContext();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg$2", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg$2", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };

    /* renamed from: P */
    public C115135m0 f344740P = null;

    /* renamed from: d */
    public Button f344741d;

    /* renamed from: e */
    public Button f344742e;

    /* renamed from: f */
    public LinearLayout f344743f;

    /* renamed from: g */
    public LinearLayout f344744g;

    /* renamed from: h */
    public ImageView f344745h;

    /* renamed from: i */
    public TextView f344746i;

    /* renamed from: j */
    public TextView f344747j;

    /* renamed from: n */
    public ProgressDialog f344748n = null;

    /* renamed from: o */
    public String f344749o;

    /* renamed from: p */
    public String f344750p;

    /* renamed from: q */
    public int f344751q;

    /* renamed from: r */
    public String f344752r;

    /* renamed from: s */
    public String f344753s;

    /* renamed from: t */
    public String f344754t;

    /* renamed from: u */
    public String f344755u;

    /* renamed from: v */
    public int f344756v;

    /* renamed from: w */
    public C115203z0 f344757w = null;

    /* renamed from: x */
    public int f344758x;

    /* renamed from: y */
    public String f344759y;

    /* renamed from: z */
    public boolean f344760z = true;

    /* renamed from: com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$a */
    public class C114977a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C1302b0 f344761d;

        public C114977a(MobileLoginOrForceReg mobileLoginOrForceReg, C1302b0 b0Var) {
            this.f344761d = b0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f344761d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$b */
    public class C114978b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f344762d;

        /* renamed from: e */
        public final /* synthetic */ String f344763e;

        /* renamed from: f */
        public final /* synthetic */ C117747y f344764f;

        /* renamed from: g */
        public final /* synthetic */ Boolean f344765g;

        /* renamed from: com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$b$a */
        public class C114979a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C114739c0 f344767d;

            public C114979a(C114978b bVar, C114739c0 c0Var) {
                this.f344767d = c0Var;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C86709a0.m107524d().mo123458d(this.f344767d);
            }
        }

        public C114978b(String str, String str2, C117747y yVar, Boolean bool) {
            this.f344762d = str;
            this.f344763e = str2;
            this.f344764f = yVar;
            this.f344765g = bool;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String str = this.f344762d;
            String str2 = this.f344763e;
            MobileLoginOrForceReg mobileLoginOrForceReg = MobileLoginOrForceReg.this;
            C114739c0 c0Var = r1;
            C114739c0 c0Var2 = new C114739c0("", str, str2, 0, "", mobileLoginOrForceReg.f344750p, "", "", mobileLoginOrForceReg.f344749o, mobileLoginOrForceReg.f344758x, "", ((C114739c0) this.f344764f).mo174372k1(), MobileLoginOrForceReg.this.f344730E.getSecImgCode(), true, this.f344765g.booleanValue());
            C114739c0 c0Var3 = c0Var;
            c0Var3.mo174378q1(MobileLoginOrForceReg.this.f344734I);
            c0Var3.mo174379r1(MobileLoginOrForceReg.this.f344735J);
            c0Var3.mo174377p1(MobileLoginOrForceReg.this.f344756v);
            C86709a0.m107524d().mo123460f(c0Var3);
            MobileLoginOrForceReg mobileLoginOrForceReg2 = MobileLoginOrForceReg.this;
            mobileLoginOrForceReg2.f344748n = C76879j.m92723Q(mobileLoginOrForceReg2.getContext(), MobileLoginOrForceReg.this.getString(C0966R.string.a3h), MobileLoginOrForceReg.this.getString(C0966R.string.hym), true, true, new C114979a(this, c0Var3));
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$c */
    public class C114980c implements DialogInterface.OnDismissListener {
        public C114980c() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            MobileLoginOrForceReg.this.f344730E = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$d */
    public class C114981d extends SecurityImage.C116049b {

        /* renamed from: b */
        public final /* synthetic */ String f344769b;

        /* renamed from: c */
        public final /* synthetic */ String f344770c;

        /* renamed from: d */
        public final /* synthetic */ C117747y f344771d;

        /* renamed from: e */
        public final /* synthetic */ Boolean f344772e;

        public C114981d(String str, String str2, C117747y yVar, Boolean bool) {
            this.f344769b = str;
            this.f344770c = str2;
            this.f344771d = yVar;
            this.f344772e = bool;
        }

        /* renamed from: a */
        public void mo93941a() {
            MobileLoginOrForceReg.this.hideVKB();
            String str = this.f344769b;
            String str2 = this.f344770c;
            MobileLoginOrForceReg mobileLoginOrForceReg = MobileLoginOrForceReg.this;
            C114739c0 c0Var = new C114739c0("", str, str2, 0, "", mobileLoginOrForceReg.f344750p, "", "", mobileLoginOrForceReg.f344749o, mobileLoginOrForceReg.f344758x, "", ((C114739c0) this.f344771d).mo174372k1(), "", true, this.f344772e.booleanValue());
            c0Var.mo174378q1(MobileLoginOrForceReg.this.f344734I);
            c0Var.mo174379r1(MobileLoginOrForceReg.this.f344735J);
            c0Var.mo174377p1(MobileLoginOrForceReg.this.f344756v);
            C86709a0.m107524d().mo123460f(c0Var);
        }

        /* renamed from: b */
        public void mo93942b() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$e */
    public class C114982e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C117747y f344774d;

        /* renamed from: e */
        public final /* synthetic */ String f344775e;

        public C114982e(C117747y yVar, String str) {
            this.f344774d = yVar;
            this.f344775e = str;
        }

        public void run() {
            MobileLoginOrForceReg.this.f344749o = ((C114739c0) this.f344774d).mo174376o1();
            C7624i3.f25910c.mo8756d("login_user_name", this.f344775e);
            C86013q1.m106447h(C112760b.m154235i() + "temp.avatar");
            Intent b = ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93169b(MobileLoginOrForceReg.this);
            b.addFlags(67108864);
            MobileLoginOrForceReg mobileLoginOrForceReg = MobileLoginOrForceReg.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(b);
            MobileLoginOrForceReg mobileLoginOrForceReg2 = mobileLoginOrForceReg;
            C117292a.m165358d(mobileLoginOrForceReg2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg$14", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mobileLoginOrForceReg.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(mobileLoginOrForceReg2, "com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg$14", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(C114982e.class.getName());
            sb.append(",");
            sb.append("R200_600");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("R200_600"));
            sb.append(",");
            sb.append(4);
            C78595a.m94982b(10645, sb.toString());
            MobileLoginOrForceReg.this.mo174719H7();
            MobileLoginOrForceReg.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$f */
    public class C114983f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C117747y f344777d;

        /* renamed from: e */
        public final /* synthetic */ String f344778e;

        public C114983f(C117747y yVar, String str) {
            this.f344777d = yVar;
            this.f344778e = str;
        }

        public void run() {
            MobileLoginOrForceReg.this.f344749o = ((C114739c0) this.f344777d).mo174376o1();
            C7624i3.f25910c.mo8756d("login_user_name", this.f344778e);
            Intent b = ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93169b(MobileLoginOrForceReg.this);
            b.addFlags(67108864);
            MobileLoginOrForceReg mobileLoginOrForceReg = MobileLoginOrForceReg.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(b);
            MobileLoginOrForceReg mobileLoginOrForceReg2 = mobileLoginOrForceReg;
            C117292a.m165358d(mobileLoginOrForceReg2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg$15", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mobileLoginOrForceReg.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(mobileLoginOrForceReg2, "com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg$15", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(C114983f.class.getName());
            sb.append(",");
            sb.append("R200_600");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("R200_600"));
            sb.append(",");
            sb.append(4);
            C78595a.m94982b(10645, sb.toString());
            MobileLoginOrForceReg.this.mo174719H7();
            MobileLoginOrForceReg.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$g */
    public class C114984g extends MMHandler {
        public C114984g() {
        }

        public void handleMessage(Message message) {
            Object obj = message.obj;
            if (obj != null) {
                MobileLoginOrForceReg.this.f344745h.setImageBitmap((Bitmap) obj);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$h */
    public class C114985h implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$h$a */
        public class C114986a implements C115203z0.C115206d {
            public C114986a() {
            }

            /* renamed from: a */
            public void mo174591a(ProgressDialog progressDialog) {
                MobileLoginOrForceReg.this.f344748n = progressDialog;
            }
        }

        public C114985h() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MobileLoginOrForceReg mobileLoginOrForceReg = MobileLoginOrForceReg.this;
            C115203z0 z0Var = new C115203z0(new C114986a(), mobileLoginOrForceReg.f344752r, mobileLoginOrForceReg.f344753s, mobileLoginOrForceReg.f344750p);
            mobileLoginOrForceReg.f344757w = z0Var;
            z0Var.mo174958b(mobileLoginOrForceReg);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$i */
    public class C114987i implements View.OnClickListener {
        public C114987i() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MobileLoginOrForceReg mobileLoginOrForceReg = MobileLoginOrForceReg.this;
            int i = MobileLoginOrForceReg.f344725Q;
            mobileLoginOrForceReg.mo174721J7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$j */
    public class C114988j implements MenuItem.OnMenuItemClickListener {
        public C114988j() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            MobileLoginOrForceReg mobileLoginOrForceReg = MobileLoginOrForceReg.this;
            int i = MobileLoginOrForceReg.f344725Q;
            mobileLoginOrForceReg.mo174720I7();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$k */
    public class C114989k implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C67216a f344785d;

        public C114989k(MobileLoginOrForceReg mobileLoginOrForceReg, C67216a aVar) {
            this.f344785d = aVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f344785d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$l */
    public class C114990l implements DialogInterface.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$l$a */
        public class C114991a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C114735a0 f344787d;

            public C114991a(C114990l lVar, C114735a0 a0Var) {
                this.f344787d = a0Var;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C86709a0.m107524d().mo123458d(this.f344787d);
            }
        }

        public C114990l() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105918d("MicroMsg.MobileLoginOrForceReg", "imgSid:" + MobileLoginOrForceReg.this.f344740P.f345165e + " img len" + MobileLoginOrForceReg.this.f344740P.f345167g.length + " " + C76861g.m92660c());
            MobileLoginOrForceReg mobileLoginOrForceReg = MobileLoginOrForceReg.this;
            C115135m0 m0Var = mobileLoginOrForceReg.f344740P;
            C114735a0 a0Var = new C114735a0(m0Var.f345162b, m0Var.f345164d, m0Var.f345168h, mobileLoginOrForceReg.f344730E.getSecImgCode(), MobileLoginOrForceReg.this.f344730E.getSecImgSid(), MobileLoginOrForceReg.this.f344730E.getSecImgEncryptKey(), 1, "", false, true);
            C86709a0.m107524d().mo123460f(a0Var);
            MobileLoginOrForceReg mobileLoginOrForceReg2 = MobileLoginOrForceReg.this;
            C76879j.m92723Q(mobileLoginOrForceReg2, mobileLoginOrForceReg2.getString(C0966R.string.a3h), MobileLoginOrForceReg.this.getString(C0966R.string.gda), true, true, new C114991a(this, a0Var));
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$m */
    public class C114992m implements DialogInterface.OnDismissListener {
        public C114992m() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            MobileLoginOrForceReg.this.f344730E = null;
        }
    }

    /* renamed from: H7 */
    public final void mo174719H7() {
        if (C75593t5.f222076d) {
            C75593t5.f222075c.mo105938a(C75592q0.m90789s());
            C75593t5.f222075c.mo105945h(C75592q0.m90789s(), C75592q0.m90788r());
            C75593t5.f222076d = false;
        }
    }

    /* renamed from: I7 */
    public final void mo174720I7() {
        C78595a.m94985e("R200_100");
        Intent intent = this.f344733H == 1 ? new Intent(this, RegByMobileRegAIOUI.class) : new Intent(this, MobileInputUI.class);
        intent.putExtra("mobile_input_purpose", 2);
        intent.addFlags(67108864);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C78595a.m94984d(this.f344759y);
        StringBuilder sb = new StringBuilder();
        C86709a0.m107523b();
        sb.append(C86718e.m107547e());
        sb.append(",");
        sb.append(getClass().getName());
        sb.append(",");
        sb.append("R200_600");
        sb.append(",");
        C86709a0.m107523b();
        sb.append(C86718e.m107548f("R200_600"));
        sb.append(",");
        sb.append(2);
        C78595a.m94983c(10645, false, sb.toString());
        finish();
    }

    /* renamed from: J7 */
    public final void mo174721J7() {
        Log.m105925i("MicroMsg.MobileLoginOrForceReg", "handleForceRegBt %s", Integer.valueOf(this.f344737L));
        if (this.f344737L == 1) {
            C67216a aVar = new C67216a(this.f344750p, 26, "", 0, "");
            aVar.mo91367W(this.f344734I);
            C86709a0.m107524d().mo123460f(aVar);
            this.f344748n = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.hym), true, true, new C114989k(this, aVar));
        } else if (Util.isNullOrNil(this.f344728C)) {
            Intent intent = new Intent();
            C78595a.m94985e("R200_900_phone");
            intent.putExtra("regsetinfo_ticket", this.f344749o);
            intent.putExtra("regsetinfo_user", this.f344750p);
            intent.putExtra("regsetinfo_pwd", this.f344753s);
            intent.putExtra("regsetinfo_ismobile", 4);
            intent.putExtra("regsetinfo_isForce", true);
            intent.putExtra("regsession_id", this.f344734I);
            intent.putExtra("reg_3d_app_ticket", this.f344735J);
            intent.putExtra("reg_3d_app_type", this.f344736K);
            intent.putExtra("regsetinfo_NextControl", this.f344751q);
            intent.putExtra("mobile_check_type", this.f344756v);
            intent.putExtra("key_reg_style", this.f344733H);
            intent.setClass(this, RegSetInfoUI.class);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg", "handleForceRegBt", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg", "handleForceRegBt", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            C114739c0 c0Var = new C114739c0("", this.f344729D, this.f344728C, 0, "", this.f344750p, "", "", this.f344749o, this.f344758x, "", "", "", true, this.f344727B);
            c0Var.mo174378q1(this.f344734I);
            c0Var.mo174379r1(this.f344735J);
            c0Var.mo174377p1(this.f344756v);
            C86709a0.m107524d().mo123460f(c0Var);
            this.f344748n = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.hym), true, true, new C115198x1(this, c0Var));
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bg4;
    }

    public void initView() {
        String str;
        this.f344741d = (Button) findViewById(C0966R.C0970id.bsr);
        this.f344742e = (Button) findViewById(C0966R.C0970id.edz);
        this.f344743f = (LinearLayout) findViewById(C0966R.C0970id.etg);
        this.f344744g = (LinearLayout) findViewById(C0966R.C0970id.hg8);
        this.f344745h = (ImageView) findViewById(C0966R.C0970id.a27);
        this.f344746i = (TextView) findViewById(C0966R.C0970id.hg4);
        this.f344747j = (TextView) findViewById(C0966R.C0970id.a9v);
        PhoneFormater phoneFormater = new PhoneFormater();
        if (this.f344750p.startsWith("+")) {
            String extractCountryCode = PhoneFormater.extractCountryCode(this.f344750p);
            if (!Util.isNullOrNil(extractCountryCode)) {
                String substring = this.f344750p.substring(extractCountryCode.length() + 1);
                str = "+" + extractCountryCode + " " + phoneFormater.formatNumber(extractCountryCode, substring);
            } else {
                str = this.f344750p;
            }
        } else {
            str = "+86 " + phoneFormater.formatNumber("86", this.f344750p);
        }
        this.f344747j.setText(str);
        if (!Util.isNullOrNil(this.f344754t) || !Util.isNullOrNil(this.f344755u)) {
            this.f344744g.setVisibility(8);
            this.f344743f.setVisibility(0);
            if (Util.isNullOrNil(this.f344754t)) {
                this.f344746i.setVisibility(8);
            } else {
                this.f344746i.setText(this.f344754t);
            }
            Bitmap qq = ((C76705f) C86312j.m106911c(C76705f.class)).mo106829VT().mo10728qq();
            if (qq != null) {
                this.f344745h.setImageBitmap(qq);
            }
            if (!Util.isNullOrNil(this.f344755u)) {
                C86709a0.m107525e().postToWorker(new C40425y1(this, this.f344755u));
            }
        } else {
            this.f344744g.setVisibility(0);
            this.f344743f.setVisibility(8);
        }
        this.f344741d.setOnClickListener(new C114985h());
        this.f344742e.setOnClickListener(new C114987i());
        setMMTitle((int) C0966R.string.gtn);
        setBackBtn(new C114988j());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 30845) {
            mo174721J7();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f344759y = C78595a.m94981a();
        C86709a0.m107524d().mo123455a(701, this);
        C86709a0.m107524d().mo123455a(252, this);
        C86709a0.m107524d().mo123455a(126, this);
        C86709a0.m107524d().mo123455a(255, this);
        C86709a0.m107524d().mo123455a(145, this);
        this.f344733H = getIntent().getIntExtra("key_reg_style", 1);
        this.f344749o = getIntent().getStringExtra("ticket");
        this.f344750p = getIntent().getStringExtra("moble");
        this.f344751q = getIntent().getIntExtra("next_controll", 0);
        this.f344752r = getIntent().getStringExtra("username");
        this.f344753s = getIntent().getStringExtra("password");
        this.f344754t = getIntent().getStringExtra("nickname");
        this.f344755u = getIntent().getStringExtra("avatar_url");
        this.f344734I = getIntent().getStringExtra("regsession_id");
        this.f344735J = getIntent().getStringExtra("reg_3d_app_ticket");
        this.f344736K = getIntent().getIntExtra("reg_3d_app_type", 0);
        this.f344756v = getIntent().getIntExtra("mobile_check_type", 0);
        this.f344727B = getIntent().getBooleanExtra("kintent_hasavatar", false);
        this.f344728C = getIntent().getStringExtra("kintent_nickname");
        this.f344729D = getIntent().getStringExtra("kintent_password");
        this.f344737L = getIntent().getIntExtra("need_do_post_check", 0);
        String str = this.f344729D;
        if (str == null || str.length() < 8) {
            this.f344758x = 4;
        } else {
            this.f344758x = 1;
        }
        initView();
        this.f344731F = new C77687b();
    }

    public void onDestroy() {
        C86709a0.m107524d().mo123470p(701, this);
        C86709a0.m107524d().mo123470p(252, this);
        C86709a0.m107524d().mo123470p(126, this);
        C86709a0.m107524d().mo123470p(255, this);
        C86709a0.m107524d().mo123470p(145, this);
        C77687b bVar = this.f344731F;
        if (bVar != null) {
            bVar.mo107840a();
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        mo174720I7();
        return true;
    }

    public void onPause() {
        super.onPause();
        this.f344739N.dead();
    }

    public void onResume() {
        this.f344739N.alive();
        super.onResume();
        StringBuilder sb = new StringBuilder();
        C86709a0.m107523b();
        sb.append(C86718e.m107547e());
        sb.append(",");
        sb.append(getClass().getName());
        sb.append(",");
        sb.append("R200_600");
        sb.append(",");
        C86709a0.m107523b();
        sb.append(C86718e.m107548f("R200_600"));
        sb.append(",");
        sb.append(1);
        C78595a.m94982b(10645, sb.toString());
        C78595a.m94984d("R200_600");
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x02dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r26, int r27, java.lang.String r28, ob0.C117747y r29) {
        /*
            r25 = this;
            r10 = r25
            r8 = r26
            r9 = r27
            r11 = r28
            r12 = r29
            r13 = 4
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r26)
            r14 = 0
            r0[r14] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r27)
            r15 = 1
            r0[r15] = r1
            r7 = 2
            r0[r7] = r11
            int r1 = r29.getType()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            java.lang.String r1 = "MicroMsg.MobileLoginOrForceReg"
            java.lang.String r3 = "errType:%s errCode:%s errMsg:%s sceneType:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r0)
            android.app.ProgressDialog r0 = r10.f344748n
            r6 = 0
            if (r0 == 0) goto L_0x003a
            r0.dismiss()
            r10.f344748n = r6
        L_0x003a:
            com.tencent.mm.plugin.account.ui.m0 r0 = r10.f344740P
            if (r0 != 0) goto L_0x0045
            com.tencent.mm.plugin.account.ui.m0 r0 = new com.tencent.mm.plugin.account.ui.m0
            r0.<init>()
            r10.f344740P = r0
        L_0x0045:
            int r0 = r29.getType()
            r1 = 255(0xff, float:3.57E-43)
            if (r0 != r1) goto L_0x0070
            r0 = -3
            if (r9 != r0) goto L_0x006f
            if (r8 != r13) goto L_0x006f
            boolean r0 = r10.f344760z
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI> r2 = com.tencent.p014mm.plugin.account.p024ui.RegByMobileSetPwdUI.class
            r1.<init>(r10, r2)
            r2 = 2131836107(0x7f113ccb, float:1.9305371E38)
            java.lang.String r2 = r10.getString(r2)
            java.lang.String r3 = "kintent_hint"
            r1.putExtra(r3, r2)
            java.lang.String r2 = "kintent_cancelable"
            r1.putExtra(r2, r0)
            r10.startActivityForResult((android.content.Intent) r1, (int) r14)
        L_0x006f:
            return
        L_0x0070:
            int r0 = r29.getType()
            r1 = -310(0xfffffffffffffeca, float:NaN)
            r3 = -311(0xfffffffffffffec9, float:NaN)
            r5 = 2131821704(0x7f110488, float:1.9276159E38)
            r4 = -6
            r13 = 701(0x2bd, float:9.82E-43)
            r14 = 252(0xfc, float:3.53E-43)
            if (r0 == r14) goto L_0x0088
            int r0 = r29.getType()
            if (r0 != r13) goto L_0x015c
        L_0x0088:
            com.tencent.mm.plugin.account.ui.z0 r0 = r10.f344757w
            if (r0 == 0) goto L_0x015c
            if (r9 == r4) goto L_0x00fe
            if (r9 == r3) goto L_0x00fe
            if (r9 != r1) goto L_0x0093
            goto L_0x00fe
        L_0x0093:
            r6 = r12
            com.tencent.mm.modelsimple.a0 r6 = (com.tencent.p014mm.modelsimple.C114735a0) r6
            java.lang.String r0 = r6.mo174354j1()
            r10.f344732G = r0
            com.tencent.mm.plugin.account.ui.z0 r0 = r10.f344757w
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r7 = 2131821704(0x7f110488, float:1.9276159E38)
            r5 = r29
            r0.mo174957a(r1, r2, r3, r4, r5)
            boolean r0 = r12 instanceof com.tencent.p014mm.modelsimple.C114735a0
            if (r0 == 0) goto L_0x00b8
            boolean r0 = r6.mo174368x1()
            r10.f344760z = r0
        L_0x00b8:
            if (r8 != 0) goto L_0x00fd
            if (r9 != 0) goto L_0x00fd
            com.tencent.mm.modelsimple.b0 r0 = new com.tencent.mm.modelsimple.b0
            r0.<init>(r15)
            ob0.b0 r1 = f40.C86709a0.m107524d()
            r1.mo123460f(r0)
            java.lang.String r1 = r10.getString(r7)
            r2 = 2131821571(0x7f110403, float:1.9275889E38)
            java.lang.String r2 = r10.getString(r2)
            r3 = 1
            r4 = 1
            com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$a r5 = new com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$a
            r5.<init>(r10, r0)
            r0 = r25
            qo3.i0 r0 = nj3.C76879j.m92723Q(r0, r1, r2, r3, r4, r5)
            r10.f344748n = r0
            java.lang.String r0 = r10.f344735J
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x00fd
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_LOGIN_SHOW_BIND_THIRD_ADD_TYPE_INT
            int r2 = r10.f344736K
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.mo119677K(r1, r2)
        L_0x00fd:
            return
        L_0x00fe:
            com.tencent.mm.plugin.account.ui.m0 r0 = r10.f344740P
            java.lang.String r1 = r10.f344752r
            r0.f345162b = r1
            java.lang.String r1 = r10.f344729D
            r0.f345164d = r1
            r1 = r12
            com.tencent.mm.modelsimple.a0 r1 = (com.tencent.p014mm.modelsimple.C114735a0) r1
            java.lang.String r2 = r1.mo174359o1()
            r0.f345165e = r2
            com.tencent.mm.plugin.account.ui.m0 r0 = r10.f344740P
            byte[] r2 = r1.mo174357m1()
            r0.f345167g = r2
            com.tencent.mm.plugin.account.ui.m0 r0 = r10.f344740P
            java.lang.String r2 = r1.mo174358n1()
            r0.f345166f = r2
            com.tencent.mm.plugin.account.ui.m0 r0 = r10.f344740P
            int r1 = r1.mo174360p1()
            r0.f345168h = r1
            com.tencent.mm.ui.applet.SecurityImage r0 = r10.f344730E
            if (r0 != 0) goto L_0x014e
            r1 = 2131834632(0x7f113708, float:1.930238E38)
            com.tencent.mm.plugin.account.ui.m0 r9 = r10.f344740P
            int r2 = r9.f345168h
            byte[] r3 = r9.f345167g
            java.lang.String r4 = r9.f345165e
            java.lang.String r5 = r9.f345166f
            com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$l r6 = new com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$l
            r6.<init>()
            r7 = 0
            com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$m r8 = new com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$m
            r8.<init>()
            r0 = r25
            com.tencent.mm.ui.applet.SecurityImage r0 = com.tencent.p014mm.p136ui.applet.SecurityImage.C116047a.m163296a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f344730E = r0
            goto L_0x015b
        L_0x014e:
            com.tencent.mm.plugin.account.ui.m0 r1 = r10.f344740P
            int r2 = r1.f345168h
            byte[] r3 = r1.f345167g
            java.lang.String r4 = r1.f345165e
            java.lang.String r1 = r1.f345166f
            r0.mo177230b(r2, r3, r4, r1)
        L_0x015b:
            return
        L_0x015c:
            int r0 = r29.getType()
            r5 = 126(0x7e, float:1.77E-43)
            java.lang.String r13 = ""
            if (r0 != r5) goto L_0x033f
            if (r9 == r4) goto L_0x02e1
            if (r9 == r3) goto L_0x02e1
            if (r9 != r1) goto L_0x016e
            goto L_0x02e1
        L_0x016e:
            if (r8 != 0) goto L_0x02d6
            if (r9 != 0) goto L_0x02d6
            java.lang.String r0 = r10.f344750p
            boolean r1 = r10.f344727B
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct r3 = r10.f344738M
            int r4 = r10.f344736K
            long r4 = (long) r4
            r3.f343856d = r4
            r4 = 6
            r3.f343857e = r4
            r3.mo86054n()
            f40.C86709a0.m107523b()
            f40.C86718e.m107546E()
            f40.C86718e.f251744t = r15
            r3 = 8
            com.tencent.p014mm.plugin.report.service.C5139t.m5183e(r15, r3)
            com.tencent.p014mm.plugin.report.service.C5139t.m5183e(r15, r2)
            com.tencent.p014mm.plugin.report.service.C5139t.m5183e(r15, r15)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0214
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = a70.C112760b.m154235i()
            r1.append(r2)
            java.lang.String r2 = "temp.avatar"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = a70.C112760b.m154235i()
            r3.append(r4)
            java.lang.String r4 = "temp.avatar.hd"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.vfs.C86013q1.m106463x(r1, r3)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r1)
            r19 = 156(0x9c, float:2.19E-43)
            r20 = 156(0x9c, float:2.19E-43)
            android.graphics.Bitmap$CompressFormat r21 = android.graphics.Bitmap.CompressFormat.JPEG
            r22 = 90
            r24 = 1
            r18 = r3
            r23 = r1
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.createThumbNail((java.lang.String) r18, (int) r19, (int) r20, (android.graphics.Bitmap.CompressFormat) r21, (int) r22, (java.lang.String) r23, (boolean) r24)
            java.lang.Class<ln.p> r1 = p196ln.C117475p.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ln.p r1 = (p196ln.C117475p) r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = a70.C112760b.m154235i()
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            ln.o r1 = r1.mo182091fC(r10, r2, r15)
            com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$e r2 = new com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$e
            r2.<init>(r12, r0)
            com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$f r3 = new com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$f
            r3.<init>(r12, r0)
            com.tencent.mm.modelavatar.s r1 = (com.tencent.p014mm.modelavatar.C1295s) r1
            r1.mo1219a(r15, r2, r3)
            goto L_0x02d6
        L_0x0214:
            r1 = r12
            com.tencent.mm.modelsimple.c0 r1 = (com.tencent.p014mm.modelsimple.C114739c0) r1
            java.lang.String r1 = r1.mo174376o1()
            r10.f344749o = r1
            eb0.i3 r1 = eb0.C7624i3.f25910c
            java.lang.String r2 = "login_user_name"
            r1.mo8756d(r2, r0)
            java.lang.Class<om.f> r0 = p214om.C11502f.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            om.f r0 = (p214om.C11502f) r0
            wc3.z r0 = r0.mo11462yM()
            com.tencent.mm.app.r1 r0 = (com.tencent.p014mm.app.C67654r1) r0
            android.content.Intent r0 = r0.mo93169b(r10)
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r1)
            java.lang.String r1 = "LauncherUI.enter_from_reg"
            r0.putExtra(r1, r15)
            k20.a r5 = new k20.a
            r5.<init>()
            r5.mo10233c(r0)
            java.lang.Object[] r1 = r5.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg"
            java.lang.String r3 = "onSceneEnd"
            java.lang.String r4 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r18 = "Undefined"
            java.lang.String r19 = "startActivity"
            java.lang.String r20 = "(Landroid/content/Intent;)V"
            r0 = r25
            r15 = r5
            r14 = 2131821704(0x7f110488, float:1.9276159E38)
            r5 = r18
            r14 = r6
            r6 = r19
            r7 = r20
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            java.lang.Object r1 = r15.mo10231a(r0)
            android.content.Intent r1 = (android.content.Intent) r1
            r10.startActivity(r1)
            java.lang.String r1 = "com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg"
            java.lang.String r2 = "onSceneEnd"
            java.lang.String r3 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r25
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            r25.mo174719H7()
            r25.finish()
            java.lang.String r0 = "RE900_100"
            wg0.C78595a.m94985e(r0)
            r0 = 10645(0x2995, float:1.4917E-41)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            f40.C86709a0.m107523b()
            java.lang.String r2 = f40.C86718e.m107547e()
            r1.append(r2)
            java.lang.String r2 = ","
            r1.append(r2)
            java.lang.Class r3 = r25.getClass()
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            r1.append(r2)
            java.lang.String r3 = "R200_600"
            r1.append(r3)
            r1.append(r2)
            f40.C86709a0.m107523b()
            int r3 = f40.C86718e.m107548f(r3)
            r1.append(r3)
            r1.append(r2)
            r2 = 4
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            wg0.C78595a.m94983c(r0, r2, r1)
            goto L_0x02d7
        L_0x02d6:
            r14 = r6
        L_0x02d7:
            ei.a r0 = p148ei.C7660a.m7782a(r28)
            if (r0 == 0) goto L_0x0340
            r0.mo8792b(r10, r14, r14)
            return
        L_0x02e1:
            boolean r0 = r10.f344727B
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            java.lang.String r7 = r10.f344729D
            java.lang.String r8 = r10.f344728C
            com.tencent.mm.ui.applet.SecurityImage r0 = r10.f344730E
            if (r0 != 0) goto L_0x032f
            r9 = 2131834632(0x7f113708, float:1.930238E38)
            r11 = 0
            r0 = r12
            com.tencent.mm.modelsimple.c0 r0 = (com.tencent.p014mm.modelsimple.C114739c0) r0
            byte[] r13 = r0.mo174371j1()
            java.lang.String r14 = r0.mo174372k1()
            com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$b r15 = new com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$b
            r0 = r15
            r1 = r25
            r2 = r7
            r3 = r8
            r4 = r29
            r5 = r6
            r0.<init>(r2, r3, r4, r5)
            r16 = 0
            com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$c r5 = new com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$c
            r5.<init>()
            com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$d r17 = new com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg$d
            r0 = r17
            r8 = r5
            r5 = r6
            r0.<init>(r2, r3, r4, r5)
            java.lang.String r5 = ""
            r0 = r25
            r1 = r9
            r2 = r11
            r3 = r13
            r4 = r14
            r6 = r15
            r7 = r16
            r9 = r17
            com.tencent.mm.ui.applet.SecurityImage r0 = com.tencent.p014mm.p136ui.applet.SecurityImage.C116047a.m163296a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f344730E = r0
            goto L_0x033e
        L_0x032f:
            r1 = r12
            com.tencent.mm.modelsimple.c0 r1 = (com.tencent.p014mm.modelsimple.C114739c0) r1
            byte[] r2 = r1.mo174371j1()
            java.lang.String r1 = r1.mo174372k1()
            r3 = 0
            r0.mo177230b(r3, r2, r1, r13)
        L_0x033e:
            return
        L_0x033f:
            r14 = r6
        L_0x0340:
            sf0.p0 r0 = new sf0.p0
            r0.<init>(r8, r9, r11)
            sf0.b r1 = r10.f344731F
            boolean r0 = r1.mo107842c(r10, r0)
            if (r0 == 0) goto L_0x034f
            goto L_0x041e
        L_0x034f:
            r0 = -2023(0xfffffffffffff819, float:NaN)
            if (r9 == r0) goto L_0x03e0
            r0 = -140(0xffffffffffffff74, float:NaN)
            if (r9 == r0) goto L_0x03ce
            r0 = -100
            if (r9 == r0) goto L_0x03e0
            r0 = -75
            if (r9 == r0) goto L_0x03c4
            r0 = -43
            if (r9 == r0) goto L_0x03b8
            r0 = -41
            if (r9 == r0) goto L_0x03ac
            r0 = -36
            if (r9 == r0) goto L_0x039f
            switch(r9) {
                case -34: goto L_0x0392;
                case -33: goto L_0x0382;
                case -32: goto L_0x0371;
                default: goto L_0x036e;
            }
        L_0x036e:
            r1 = 0
            goto L_0x041f
        L_0x0371:
            r0 = 2131822536(0x7f1107c8, float:1.9277846E38)
            java.lang.String r0 = r10.getString(r0)
            com.tencent.mm.plugin.account.ui.t1 r1 = new com.tencent.mm.plugin.account.ui.t1
            r1.<init>(r10)
            nj3.C76879j.m92749t(r10, r0, r13, r1)
            goto L_0x041e
        L_0x0382:
            r0 = 2131822534(0x7f1107c6, float:1.9277842E38)
            r1 = 2131822540(0x7f1107cc, float:1.9277854E38)
            com.tencent.mm.plugin.account.ui.u1 r2 = new com.tencent.mm.plugin.account.ui.u1
            r2.<init>(r10)
            nj3.C76879j.m92742m(r10, r0, r1, r2)
            goto L_0x041e
        L_0x0392:
            r0 = 2131822482(0x7f110792, float:1.9277737E38)
            r1 = 0
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r10, (int) r0, (int) r1)
            r0.show()
            goto L_0x041e
        L_0x039f:
            r1 = 0
            r0 = 2131822484(0x7f110794, float:1.927774E38)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r10, (int) r0, (int) r1)
            r0.show()
            goto L_0x041e
        L_0x03ac:
            r1 = 0
            r0 = 2131822481(0x7f110791, float:1.9277735E38)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r10, (int) r0, (int) r1)
            r0.show()
            goto L_0x041e
        L_0x03b8:
            r1 = 0
            r0 = 2131822479(0x7f11078f, float:1.927773E38)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r10, (int) r0, (int) r1)
            r0.show()
            goto L_0x041e
        L_0x03c4:
            r0 = 2131820929(0x7f110181, float:1.9274587E38)
            r1 = 2131834523(0x7f11369b, float:1.9302159E38)
            nj3.C76879j.m92738i(r10, r0, r1)
            goto L_0x041e
        L_0x03ce:
            java.lang.String r0 = r10.f344732G
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x041e
            androidx.appcompat.app.AppCompatActivity r0 = r25.getContext()
            java.lang.String r1 = r10.f344732G
            sf0.C13665i0.m12972e(r0, r11, r1)
            goto L_0x041e
        L_0x03e0:
            f40.C86709a0.m107523b()
            f40.C86718e.m107550n()
            androidx.appcompat.app.AppCompatActivity r0 = r25.getContext()
            f40.C86709a0.m107523b()
            java.lang.String r1 = f40.C86718e.f251747w
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0401
            androidx.appcompat.app.AppCompatActivity r1 = r25.getContext()
            r2 = 2131832656(0x7f112f50, float:1.9298372E38)
            java.lang.String r1 = kg3.C76577a.m92166q(r1, r2)
            goto L_0x0406
        L_0x0401:
            f40.C86709a0.m107523b()
            java.lang.String r1 = f40.C86718e.f251747w
        L_0x0406:
            androidx.appcompat.app.AppCompatActivity r2 = r25.getContext()
            r3 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r2 = r2.getString(r3)
            com.tencent.mm.plugin.account.ui.v1 r3 = new com.tencent.mm.plugin.account.ui.v1
            r3.<init>(r10)
            com.tencent.mm.plugin.account.ui.w1 r4 = new com.tencent.mm.plugin.account.ui.w1
            r4.<init>(r10)
            nj3.C76879j.m92719M(r0, r1, r2, r3, r4)
        L_0x041e:
            r1 = 1
        L_0x041f:
            if (r1 == 0) goto L_0x0422
            return
        L_0x0422:
            int r0 = r29.getType()
            r1 = 252(0xfc, float:3.53E-43)
            if (r0 == r1) goto L_0x0432
            int r0 = r29.getType()
            r1 = 701(0x2bd, float:9.82E-43)
            if (r0 != r1) goto L_0x0443
        L_0x0432:
            ei.a r0 = p148ei.C7660a.m7782a(r28)
            if (r0 == 0) goto L_0x0443
            androidx.appcompat.app.AppCompatActivity r1 = r25.getContext()
            boolean r0 = r0.mo8792b(r1, r14, r14)
            if (r0 == 0) goto L_0x0443
            return
        L_0x0443:
            int r0 = r29.getType()
            r1 = 145(0x91, float:2.03E-43)
            if (r0 != r1) goto L_0x045b
            r0 = 4
            if (r8 != r0) goto L_0x0454
            r0 = 30845(0x787d, float:4.3223E-41)
            sf0.C13665i0.m12970c(r10, r11, r0)
            goto L_0x045a
        L_0x0454:
            r0 = 0
            r10.f344737L = r0
            r25.mo174721J7()
        L_0x045a:
            return
        L_0x045b:
            if (r8 != 0) goto L_0x045f
            if (r9 == 0) goto L_0x0482
        L_0x045f:
            androidx.appcompat.app.AppCompatActivity r0 = r25.getContext()
            r1 = 2131822533(0x7f1107c5, float:1.927784E38)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r26)
            r4 = 0
            r2[r4] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r27)
            r5 = 1
            r2[r5] = r3
            java.lang.String r1 = r10.getString(r1, r2)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r4)
            r0.show()
        L_0x0482:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.account.p024ui.MobileLoginOrForceReg.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
