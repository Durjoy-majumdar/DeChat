package com.tencent.p014mm.p136ui.tools;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.LoginDisasterEvent;
import com.tencent.p014mm.modelsimple.C114735a0;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.p136ui.MMBaseActivity;
import com.tencent.p014mm.p136ui.applet.SecurityImage;
import com.tencent.p014mm.plugin.account.p024ui.C1468a;
import com.tencent.p014mm.plugin.account.p024ui.DisasterUI;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import eb0.C97625j3;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p206nj.C76861g;
import qo3.C77398g;

/* renamed from: com.tencent.mm.ui.tools.NewTaskUI */
public class NewTaskUI extends MMBaseActivity implements C11385n {

    /* renamed from: i */
    public static NewTaskUI f348576i;

    /* renamed from: e */
    public SecurityImage f348577e = null;

    /* renamed from: f */
    public C116158v0 f348578f = new C116158v0();

    /* renamed from: g */
    public ProgressDialog f348579g = null;

    /* renamed from: h */
    public IListener f348580h = new IListener<LoginDisasterEvent>(this, C40008f.f107254d) {
        {
            this.__eventId = -1399051904;
        }

        public boolean callback(IEvent iEvent) {
            LoginDisasterEvent.C114679a aVar;
            LoginDisasterEvent loginDisasterEvent = (LoginDisasterEvent) iEvent;
            if (loginDisasterEvent == null || (aVar = loginDisasterEvent.f343570d) == null) {
                return false;
            }
            Log.m105925i("MicroMsg.NewTaskUI", "summerdiz loginDisasterListener callback content[%s], url[%s]", aVar.f343571a, aVar.f343572b);
            Intent intent = new Intent();
            intent.putExtra("key_disaster_content", loginDisasterEvent.f343570d.f343571a);
            intent.putExtra("key_disaster_url", loginDisasterEvent.f343570d.f343572b);
            intent.setClass(MMApplicationContext.getContext(), DisasterUI.class).addFlags(268435456);
            Context context = MMApplicationContext.getContext();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/ui/tools/NewTaskUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/ui/tools/NewTaskUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };

    /* renamed from: com.tencent.mm.ui.tools.NewTaskUI$a */
    public class C116139a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C114735a0 f348581d;

        public C116139a(NewTaskUI newTaskUI, C114735a0 a0Var) {
            this.f348581d = a0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C97625j3.m125815e().mo123458d(this.f348581d);
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.NewTaskUI$b */
    public class C116140b implements DialogInterface.OnClickListener {

        /* renamed from: com.tencent.mm.ui.tools.NewTaskUI$b$a */
        public class C116141a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C114735a0 f348583d;

            public C116141a(C116140b bVar, C114735a0 a0Var) {
                this.f348583d = a0Var;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C97625j3.m125815e().mo123458d(this.f348583d);
            }
        }

        public C116140b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.NewTaskUI", "dkwt dlg imgSid:" + NewTaskUI.this.f348578f.f348610b + " img len" + NewTaskUI.this.f348578f.f348612d.length + " " + C76861g.m92660c());
            NewTaskUI newTaskUI = NewTaskUI.this;
            SecurityImage securityImage = newTaskUI.f348577e;
            if (securityImage == null) {
                Log.m105918d("MicroMsg.NewTaskUI", "[arthurdan.SecurityImageCrash] fatal error!!! secimg is null!");
                return;
            }
            C114735a0 a0Var = new C114735a0(newTaskUI.f348578f.f348613e, securityImage.getSecImgCode(), NewTaskUI.this.f348577e.getSecImgSid(), NewTaskUI.this.f348577e.getSecImgEncryptKey());
            C97625j3.m125815e().mo123460f(a0Var);
            NewTaskUI newTaskUI2 = NewTaskUI.this;
            newTaskUI2.f348579g = C76879j.m92723Q(newTaskUI2, newTaskUI2.getString(C0966R.string.a3h), NewTaskUI.this.getString(C0966R.string.gda), true, true, new C116141a(this, a0Var));
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.NewTaskUI$c */
    public class C116142c implements DialogInterface.OnCancelListener {
        public C116142c() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            if (NewTaskUI.f348576i != null) {
                NewTaskUI.f348576i = null;
                NewTaskUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.NewTaskUI$d */
    public class C116143d implements DialogInterface.OnDismissListener {
        public C116143d() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            NewTaskUI.this.f348577e = null;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105925i("MicroMsg.NewTaskUI", "onCreate :%d", Integer.valueOf(hashCode()));
        setContentView(C0966R.C0971layout.f6534hh);
        C97625j3.m125815e().mo123455a(701, this);
        C97625j3.m125815e().mo123455a(252, this);
        f348576i = this;
        C114735a0 a0Var = new C114735a0(0, "", "", "");
        C97625j3.m125815e().mo123460f(a0Var);
        this.f348579g = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.gda), true, true, new C116139a(this, a0Var));
    }

    public void onDestroy() {
        C77398g gVar;
        Log.m105925i("MicroMsg.NewTaskUI", "onDestroy :%d", Integer.valueOf(hashCode()));
        if (equals(f348576i)) {
            f348576i = null;
        }
        ProgressDialog progressDialog = this.f348579g;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f348579g.dismiss();
        }
        SecurityImage securityImage = this.f348577e;
        if (!(securityImage == null || (gVar = securityImage.f348170n) == null)) {
            gVar.dismiss();
            securityImage.f348170n = null;
        }
        C97625j3.m125815e().mo123470p(701, this);
        C97625j3.m125815e().mo123470p(252, this);
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        this.f348580h.dead();
    }

    public void onResume() {
        this.f348580h.alive();
        super.onResume();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i;
        int i4 = i2;
        C117747y yVar2 = yVar;
        Log.m105925i("MicroMsg.NewTaskUI", "onSceneEnd :%d  [%d,%d,%s]", Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(i2), str);
        ProgressDialog progressDialog = this.f348579g;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f348579g.dismiss();
        }
        if (i3 == 4 && i4 == -3) {
            Log.m105925i("MicroMsg.NewTaskUI", "summerauth MM_ERR_PASSWORD need kick out acc ready[%b]", Boolean.valueOf(C97625j3.m125811a()));
            if (C1468a.m1500a(f348576i, i, i2, new Intent().setClass(f348576i, LauncherUI.class).putExtra("Intro_Switch", true).putExtra("animation_pop_in", true).addFlags(67108864), str)) {
                return;
            }
        }
        if (i3 == 4 && (i4 == -6 || i4 == -311 || i4 == -310)) {
            if (yVar2 instanceof C114735a0) {
                C114735a0 a0Var = (C114735a0) yVar2;
                this.f348578f.f348613e = a0Var.mo174360p1();
                this.f348578f.f348612d = a0Var.mo174357m1();
                this.f348578f.f348610b = a0Var.mo174359o1();
                this.f348578f.f348611c = a0Var.mo174358n1();
                Log.m105924i("MicroMsg.NewTaskUI", "onSceneEnd dkwt imgSid:" + this.f348578f.f348610b + " img len" + this.f348578f.f348612d.length + " " + C76861g.m92660c());
            }
            if (this.f348577e == null) {
                C116158v0 v0Var = this.f348578f;
                this.f348577e = SecurityImage.C116047a.m163296a(this, C0966R.string.hyo, v0Var.f348613e, v0Var.f348612d, v0Var.f348610b, v0Var.f348611c, new C116140b(), new C116142c(), new C116143d(), v0Var);
                return;
            }
            Log.m105918d("MicroMsg.NewTaskUI", "imgSid:" + this.f348578f.f348610b + " img len" + this.f348578f.f348612d.length + " " + C76861g.m92660c());
            SecurityImage securityImage = this.f348577e;
            C116158v0 v0Var2 = this.f348578f;
            securityImage.mo177230b(v0Var2.f348613e, v0Var2.f348612d, v0Var2.f348610b, v0Var2.f348611c);
            return;
        }
        f348576i = null;
        finish();
    }
}
