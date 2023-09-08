package com.tencent.p014mm.plugin.account.p024ui;

import a70.C112760b;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.mmdata.rpt.ThirdAppRegisterStruct;
import com.tencent.p014mm.modelsimple.C114739c0;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.p136ui.applet.SecurityImage;
import com.tencent.p014mm.plugin.account.bind.p021ui.FindMContactAlertUI;
import com.tencent.p014mm.plugin.account.bind.p021ui.FindMContactIntroUI;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.PhoneFormater;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C7624i3;
import f40.C86709a0;
import f40.C86718e;
import hg0.C59889p0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lg3.C88504k;
import nc0.C76850a;
import nj3.C76879j;
import nj3.C76901s0;
import ob0.C11385n;
import ob0.C117747y;
import p148ei.C7660a;
import p206nj.C88955f;
import p214om.C11502f;
import p823sg.C77710q;
import qe3.C118194t0;
import qe3.C89625d;
import qg0.C12215a;
import sf0.C77687b;
import sf0.C77701p0;
import wg0.C78595a;

/* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI */
public class RegSetInfoUI extends MMActivity implements C11385n {

    /* renamed from: V */
    public static final /* synthetic */ int f344969V = 0;

    /* renamed from: A */
    public ImageView f344970A;

    /* renamed from: B */
    public ProgressBar f344971B;

    /* renamed from: C */
    public String f344972C = "";

    /* renamed from: D */
    public ImageView f344973D;

    /* renamed from: E */
    public View f344974E;

    /* renamed from: F */
    public TextView f344975F;

    /* renamed from: G */
    public String f344976G = null;

    /* renamed from: H */
    public boolean f344977H = false;

    /* renamed from: I */
    public C76901s0 f344978I;

    /* renamed from: J */
    public View f344979J;

    /* renamed from: K */
    public boolean f344980K = false;

    /* renamed from: L */
    public C77687b f344981L;

    /* renamed from: M */
    public String f344982M;

    /* renamed from: N */
    public int f344983N;

    /* renamed from: P */
    public String f344984P;

    /* renamed from: Q */
    public String f344985Q;

    /* renamed from: R */
    public String f344986R;

    /* renamed from: S */
    public int f344987S;

    /* renamed from: T */
    public ThirdAppRegisterStruct f344988T = new ThirdAppRegisterStruct();

    /* renamed from: U */
    public MTimerHandler f344989U = new MTimerHandler(Looper.myLooper(), (MTimerHandler.CallBack) new C115060j(), true);

    /* renamed from: d */
    public EditText f344990d;

    /* renamed from: e */
    public EditText f344991e;

    /* renamed from: f */
    public Button f344992f;

    /* renamed from: g */
    public ProgressDialog f344993g = null;

    /* renamed from: h */
    public String f344994h;

    /* renamed from: i */
    public String f344995i;

    /* renamed from: j */
    public int f344996j;

    /* renamed from: n */
    public int f344997n = 0;

    /* renamed from: o */
    public String f344998o;

    /* renamed from: p */
    public String f344999p;

    /* renamed from: q */
    public String f345000q;

    /* renamed from: r */
    public TextView f345001r;

    /* renamed from: s */
    public View f345002s;

    /* renamed from: t */
    public SecurityImage f345003t = null;

    /* renamed from: u */
    public boolean f345004u = false;

    /* renamed from: v */
    public ImageView f345005v;

    /* renamed from: w */
    public boolean f345006w = false;

    /* renamed from: x */
    public int f345007x = 3;

    /* renamed from: y */
    public int f345008y;

    /* renamed from: z */
    public LinkedList<String> f345009z = new LinkedList<>();

    /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$a */
    public class C92896a implements View.OnKeyListener {
        public C92896a() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(keyEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/RegSetInfoUI$10", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
            if (66 == i && keyEvent.getAction() == 0) {
                RegSetInfoUI.m161906H7(RegSetInfoUI.this);
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/account/ui/RegSetInfoUI$10", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return true;
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/account/ui/RegSetInfoUI$10", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$a0 */
    public class C92897a0 implements View.OnClickListener {
        public C92897a0() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/RegSetInfoUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RegSetInfoUI.m161906H7(RegSetInfoUI.this);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/RegSetInfoUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$b */
    public class C92898b implements TextView.OnEditorActionListener {
        public C92898b() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6 && i != 5) {
                return false;
            }
            RegSetInfoUI.m161906H7(RegSetInfoUI.this);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$c */
    public class C92899c implements View.OnKeyListener {
        public C92899c() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(keyEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/RegSetInfoUI$12", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
            if (66 == i && keyEvent.getAction() == 0) {
                RegSetInfoUI.m161906H7(RegSetInfoUI.this);
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/account/ui/RegSetInfoUI$12", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return true;
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/account/ui/RegSetInfoUI$12", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$d */
    public class C92900d implements View.OnClickListener {
        public C92900d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/RegSetInfoUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RegSetInfoUI regSetInfoUI = RegSetInfoUI.this;
            int i = RegSetInfoUI.f344969V;
            regSetInfoUI.getClass();
            ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93149TE(regSetInfoUI);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/RegSetInfoUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$e0 */
    public class C92901e0 implements TextView.OnEditorActionListener {
        public C92901e0() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6 && i != 5) {
                return false;
            }
            RegSetInfoUI.m161906H7(RegSetInfoUI.this);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$y */
    public class C92902y implements MMHandlerThread.IWaitWorkThread {
        public C92902y() {
        }

        public boolean doInBackground() {
            return true;
        }

        public boolean onPostExecute() {
            if (!Util.isNullOrNil((String) null)) {
                if (Util.isNullOrNil(("" + RegSetInfoUI.this.f344990d.getText()).trim())) {
                    RegSetInfoUI.this.f344990d.setText((CharSequence) null);
                }
            }
            if (C88955f.m111058b()) {
                return true;
            }
            Log.m105920e("MiroMsg.RegSetInfoUI", "SDcard is not available");
            return false;
        }

        public String toString() {
            return super.toString() + "|initView";
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$b0 */
    public class C115050b0 implements View.OnFocusChangeListener {
        public C115050b0() {
        }

        public void onFocusChange(View view, boolean z) {
            if (z) {
                RegSetInfoUI regSetInfoUI = RegSetInfoUI.this;
                regSetInfoUI.f344980K = true;
                regSetInfoUI.f344989U.startTimer(200);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$c0 */
    public class C115051c0 implements TextWatcher {

        /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$c0$a */
        public class C115052a implements Runnable {
            public C115052a() {
            }

            public void run() {
                RegSetInfoUI.this.f344991e.clearFocus();
                RegSetInfoUI.this.f344991e.requestFocus();
            }
        }

        public C115051c0() {
        }

        public void afterTextChanged(Editable editable) {
            if (!RegSetInfoUI.this.f344989U.stopped()) {
                RegSetInfoUI.this.f344989U.stopTimer();
            }
            String trim = RegSetInfoUI.this.f344991e.getText().toString().trim();
            if (Util.isNullOrNil(trim)) {
                RegSetInfoUI regSetInfoUI = RegSetInfoUI.this;
                regSetInfoUI.f345001r.setText(regSetInfoUI.getString(C0966R.string.hz6));
                RegSetInfoUI.this.mo174816P7(false, false);
                C76901s0 s0Var = RegSetInfoUI.this.f344978I;
                if (s0Var != null) {
                    s0Var.dismiss();
                    RegSetInfoUI.this.f344978I = null;
                }
                RegSetInfoUI.this.f344991e.postDelayed(new C115052a(), 50);
            }
            if (!Util.isNullOrNil(trim) && (RegSetInfoUI.this.mo174813M7() || !trim.equals(RegSetInfoUI.this.f344972C))) {
                RegSetInfoUI.this.mo174816P7(false, false);
                RegSetInfoUI.this.f344989U.startTimer(500);
            }
            RegSetInfoUI.this.f344972C = trim;
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$d0 */
    public class C115053d0 implements MenuItem.OnMenuItemClickListener {
        public C115053d0() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            RegSetInfoUI regSetInfoUI = RegSetInfoUI.this;
            int i = RegSetInfoUI.f344969V;
            regSetInfoUI.mo174812L7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$e */
    public class C115054e implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C114739c0 f345014d;

        public C115054e(C114739c0 c0Var) {
            this.f345014d = c0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f345014d);
            C86709a0.m107524d().mo123470p(126, RegSetInfoUI.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$f */
    public class C115055f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C117747y f345016d;

        /* renamed from: e */
        public final /* synthetic */ String f345017e;

        /* renamed from: f */
        public final /* synthetic */ String f345018f;

        /* renamed from: g */
        public final /* synthetic */ boolean f345019g;

        /* renamed from: h */
        public final /* synthetic */ String f345020h;

        /* renamed from: i */
        public final /* synthetic */ String f345021i;

        /* renamed from: j */
        public final /* synthetic */ int f345022j;

        public C115055f(C117747y yVar, String str, String str2, boolean z, String str3, String str4, int i) {
            this.f345016d = yVar;
            this.f345017e = str;
            this.f345018f = str2;
            this.f345019g = z;
            this.f345020h = str3;
            this.f345021i = str4;
            this.f345022j = i;
        }

        public void run() {
            Intent intent;
            Class cls = C11502f.class;
            RegSetInfoUI.this.f344998o = ((C114739c0) this.f345016d).mo174376o1();
            C7624i3.f25910c.mo8756d("login_user_name", this.f345017e);
            C86013q1.m106447h(C112760b.m154235i() + "temp.avatar");
            String str = this.f345018f;
            if (str == null || !str.contains("0")) {
                Intent b = ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93169b(RegSetInfoUI.this);
                b.addFlags(67108864);
                RegSetInfoUI regSetInfoUI = RegSetInfoUI.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(b);
                RegSetInfoUI regSetInfoUI2 = regSetInfoUI;
                C117292a.m165358d(regSetInfoUI2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/RegSetInfoUI$16", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                regSetInfoUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(regSetInfoUI2, "com/tencent/mm/plugin/account/ui/RegSetInfoUI$16", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                StringBuilder sb = new StringBuilder();
                C86709a0.m107523b();
                sb.append(C86718e.m107547e());
                sb.append(",");
                sb.append(RegSetInfoUI.this.getClass().getName());
                sb.append(",");
                sb.append("R200_900_phone");
                sb.append(",");
                C86709a0.m107523b();
                sb.append(C86718e.m107548f("R200_900_phone"));
                sb.append(",");
                sb.append(4);
                C78595a.m94982b(10645, sb.toString());
                RegSetInfoUI.this.finish();
                return;
            }
            C78595a.m94985e("R300_100_phone");
            if (!this.f345019g) {
                intent = new Intent(RegSetInfoUI.this, FindMContactIntroUI.class);
            } else {
                intent = new Intent(RegSetInfoUI.this, FindMContactAlertUI.class);
                intent.putExtra("alert_title", this.f345020h);
                intent.putExtra("alert_message", this.f345021i);
            }
            intent.addFlags(67108864);
            intent.putExtra("regsetinfo_ticket", RegSetInfoUI.this.f344998o);
            intent.putExtra("regsetinfo_NextStep", this.f345018f);
            intent.putExtra("regsetinfo_NextStyle", this.f345022j);
            Intent b2 = ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93169b(RegSetInfoUI.this);
            b2.addFlags(67108864);
            MMWizardActivity.m7018M7(RegSetInfoUI.this, intent, b2);
            RegSetInfoUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$g */
    public class C115056g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C117747y f345024d;

        /* renamed from: e */
        public final /* synthetic */ String f345025e;

        /* renamed from: f */
        public final /* synthetic */ String f345026f;

        /* renamed from: g */
        public final /* synthetic */ boolean f345027g;

        /* renamed from: h */
        public final /* synthetic */ String f345028h;

        /* renamed from: i */
        public final /* synthetic */ String f345029i;

        /* renamed from: j */
        public final /* synthetic */ int f345030j;

        public C115056g(C117747y yVar, String str, String str2, boolean z, String str3, String str4, int i) {
            this.f345024d = yVar;
            this.f345025e = str;
            this.f345026f = str2;
            this.f345027g = z;
            this.f345028h = str3;
            this.f345029i = str4;
            this.f345030j = i;
        }

        public void run() {
            Intent intent;
            Class cls = C11502f.class;
            RegSetInfoUI.this.f344998o = ((C114739c0) this.f345024d).mo174376o1();
            C7624i3.f25910c.mo8756d("login_user_name", this.f345025e);
            String str = this.f345026f;
            if (str == null || !str.contains("0")) {
                Intent b = ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93169b(RegSetInfoUI.this);
                b.addFlags(67108864);
                RegSetInfoUI regSetInfoUI = RegSetInfoUI.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(b);
                RegSetInfoUI regSetInfoUI2 = regSetInfoUI;
                C117292a.m165358d(regSetInfoUI2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/RegSetInfoUI$17", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                regSetInfoUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(regSetInfoUI2, "com/tencent/mm/plugin/account/ui/RegSetInfoUI$17", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                StringBuilder sb = new StringBuilder();
                C86709a0.m107523b();
                sb.append(C86718e.m107547e());
                sb.append(",");
                sb.append(RegSetInfoUI.this.getClass().getName());
                sb.append(",");
                sb.append("R200_900_phone");
                sb.append(",");
                C86709a0.m107523b();
                sb.append(C86718e.m107548f("R200_900_phone"));
                sb.append(",");
                sb.append(4);
                C78595a.m94982b(10645, sb.toString());
                RegSetInfoUI.this.finish();
                return;
            }
            C78595a.m94985e("R300_100_phone");
            if (!this.f345027g) {
                intent = new Intent(RegSetInfoUI.this, FindMContactIntroUI.class);
            } else {
                intent = new Intent(RegSetInfoUI.this, FindMContactAlertUI.class);
                intent.putExtra("alert_title", this.f345028h);
                intent.putExtra("alert_message", this.f345029i);
            }
            intent.addFlags(67108864);
            intent.putExtra("regsetinfo_ticket", RegSetInfoUI.this.f344998o);
            intent.putExtra("regsetinfo_NextStep", this.f345026f);
            intent.putExtra("regsetinfo_NextStyle", this.f345030j);
            Intent b2 = ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93169b(RegSetInfoUI.this);
            b2.addFlags(67108864);
            MMWizardActivity.m7018M7(RegSetInfoUI.this, intent, b2);
            RegSetInfoUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$h */
    public class C115057h implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C117747y f345032d;

        /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$h$a */
        public class C115058a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C114739c0 f345034d;

            public C115058a(C114739c0 c0Var) {
                this.f345034d = c0Var;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C86709a0.m107524d().mo123458d(this.f345034d);
                C86709a0.m107524d().mo123470p(126, RegSetInfoUI.this);
            }
        }

        public C115057h(C117747y yVar) {
            this.f345032d = yVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String trim = RegSetInfoUI.this.f344991e.getText().toString().trim();
            String trim2 = RegSetInfoUI.this.f344990d.getText().toString().trim();
            if (trim2 == null || trim2.length() <= 0) {
                C76879j.m92738i(RegSetInfoUI.this, C0966R.string.k9q, C0966R.string.hxn);
                return;
            }
            int K7 = RegSetInfoUI.this.mo174811K7();
            C86709a0.m107524d().mo123455a(126, RegSetInfoUI.this);
            RegSetInfoUI regSetInfoUI = RegSetInfoUI.this;
            String str = regSetInfoUI.f344999p;
            int i2 = regSetInfoUI.f344996j;
            String str2 = regSetInfoUI.f344995i;
            String str3 = regSetInfoUI.f344994h;
            String str4 = regSetInfoUI.f344998o;
            String k1 = ((C114739c0) this.f345032d).mo174372k1();
            String secImgCode = RegSetInfoUI.this.f345003t.getSecImgCode();
            RegSetInfoUI regSetInfoUI2 = RegSetInfoUI.this;
            boolean z = regSetInfoUI2.f345004u;
            boolean z2 = z;
            C114739c0 c0Var = new C114739c0("", str, trim2, i2, str2, str3, "", "", str4, K7, trim, k1, secImgCode, z2, regSetInfoUI2.f345006w);
            c0Var.mo174378q1(RegSetInfoUI.this.f344982M);
            c0Var.mo174379r1(RegSetInfoUI.this.f344986R);
            c0Var.mo174377p1(RegSetInfoUI.this.f345008y);
            C86709a0.m107524d().mo123460f(c0Var);
            RegSetInfoUI regSetInfoUI3 = RegSetInfoUI.this;
            regSetInfoUI3.f344993g = C76879j.m92723Q(regSetInfoUI3, regSetInfoUI3.getString(C0966R.string.a3h), RegSetInfoUI.this.getString(C0966R.string.hym), true, true, new C115058a(c0Var));
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$i */
    public class C115059i implements DialogInterface.OnDismissListener {
        public C115059i() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            RegSetInfoUI.this.f345003t = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$j */
    public class C115060j implements MTimerHandler.CallBack {
        public C115060j() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTimerExpired() {
            /*
                r12 = this;
                com.tencent.mm.plugin.account.ui.RegSetInfoUI r0 = com.tencent.p014mm.plugin.account.p024ui.RegSetInfoUI.this
                android.widget.EditText r0 = r0.f344991e
                android.text.Editable r0 = r0.getText()
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r0.trim()
                com.tencent.mm.plugin.account.ui.RegSetInfoUI r1 = com.tencent.p014mm.plugin.account.p024ui.RegSetInfoUI.this
                android.widget.EditText r1 = r1.f344990d
                android.text.Editable r1 = r1.getText()
                java.lang.String r1 = r1.toString()
                java.lang.String r1 = r1.trim()
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                r3 = 0
                if (r2 == 0) goto L_0x003b
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r2 != 0) goto L_0x003b
                int r0 = r1.length()
                r2 = 5
                if (r0 <= r2) goto L_0x0039
                java.lang.String r0 = r1.substring(r3, r2)
                goto L_0x003b
            L_0x0039:
                r9 = r1
                goto L_0x003c
            L_0x003b:
                r9 = r0
            L_0x003c:
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                if (r0 != 0) goto L_0x004a
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r0 == 0) goto L_0x004a
                r8 = r9
                goto L_0x004b
            L_0x004a:
                r8 = r1
            L_0x004b:
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                if (r0 != 0) goto L_0x0094
                com.tencent.mm.plugin.account.ui.RegSetInfoUI r0 = com.tencent.p014mm.plugin.account.p024ui.RegSetInfoUI.this
                boolean r0 = r0.mo174813M7()
                if (r0 == 0) goto L_0x0094
                com.tencent.mm.plugin.account.ui.RegSetInfoUI r0 = com.tencent.p014mm.plugin.account.p024ui.RegSetInfoUI.this
                boolean r0 = r0.mo174815O7()
                if (r0 == 0) goto L_0x0094
                com.tencent.mm.plugin.account.ui.RegSetInfoUI r0 = com.tencent.p014mm.plugin.account.p024ui.RegSetInfoUI.this
                int r7 = r0.mo174811K7()
                com.tencent.mm.plugin.account.ui.RegSetInfoUI r0 = com.tencent.p014mm.plugin.account.p024ui.RegSetInfoUI.this
                java.lang.String r5 = r0.mo174810J7()
                ob0.b0 r0 = f40.C86709a0.m107524d()
                r1 = 429(0x1ad, float:6.01E-43)
                com.tencent.mm.plugin.account.ui.RegSetInfoUI r2 = com.tencent.p014mm.plugin.account.p024ui.RegSetInfoUI.this
                r0.mo123455a(r1, r2)
                hg0.p0 r0 = new hg0.p0
                com.tencent.mm.plugin.account.ui.RegSetInfoUI r1 = com.tencent.p014mm.plugin.account.p024ui.RegSetInfoUI.this
                java.lang.String r6 = r1.f344998o
                java.lang.String r10 = ""
                java.lang.String r11 = ""
                r4 = r0
                r4.<init>(r5, r6, r7, r8, r9, r10, r11)
                ob0.b0 r1 = f40.C86709a0.m107524d()
                r1.mo123460f(r0)
                com.tencent.mm.plugin.account.ui.RegSetInfoUI r0 = com.tencent.p014mm.plugin.account.p024ui.RegSetInfoUI.this
                android.widget.ProgressBar r0 = r0.f344971B
                r0.setVisibility(r3)
            L_0x0094:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.account.p024ui.RegSetInfoUI.C115060j.onTimerExpired():boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$k */
    public class C115061k extends SecurityImage.C116049b {

        /* renamed from: b */
        public final /* synthetic */ C117747y f345038b;

        public C115061k(C117747y yVar) {
            this.f345038b = yVar;
        }

        /* renamed from: a */
        public void mo93941a() {
            RegSetInfoUI.this.hideVKB();
            String trim = RegSetInfoUI.this.f344991e.getText().toString().trim();
            String trim2 = RegSetInfoUI.this.f344990d.getText().toString().trim();
            int K7 = RegSetInfoUI.this.mo174811K7();
            C86709a0.m107524d().mo123455a(126, RegSetInfoUI.this);
            RegSetInfoUI regSetInfoUI = RegSetInfoUI.this;
            String str = regSetInfoUI.f344999p;
            int i = regSetInfoUI.f344996j;
            String str2 = regSetInfoUI.f344995i;
            String str3 = regSetInfoUI.f344994h;
            String str4 = regSetInfoUI.f344998o;
            String k1 = ((C114739c0) this.f345038b).mo174372k1();
            RegSetInfoUI regSetInfoUI2 = RegSetInfoUI.this;
            boolean z = regSetInfoUI2.f345004u;
            boolean z2 = z;
            C114739c0 c0Var = new C114739c0("", str, trim2, i, str2, str3, "", "", str4, K7, trim, k1, "", z2, regSetInfoUI2.f345006w);
            c0Var.mo174378q1(RegSetInfoUI.this.f344982M);
            c0Var.mo174379r1(RegSetInfoUI.this.f344986R);
            c0Var.mo174377p1(RegSetInfoUI.this.f345008y);
            C86709a0.m107524d().mo123460f(c0Var);
        }

        /* renamed from: b */
        public void mo93942b() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$l */
    public class C115062l implements Runnable {
        public C115062l() {
        }

        public void run() {
            RegSetInfoUI.this.f344991e.clearFocus();
            RegSetInfoUI.this.f344991e.requestFocus();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$m */
    public class C115063m implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C117747y f345041d;

        /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$m$a */
        public class C115064a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C59889p0 f345043d;

            public C115064a(C59889p0 p0Var) {
                this.f345043d = p0Var;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C86709a0.m107524d().mo123458d(this.f345043d);
                C86709a0.m107524d().mo123470p(429, RegSetInfoUI.this);
            }
        }

        public C115063m(C117747y yVar) {
            this.f345041d = yVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String trim = RegSetInfoUI.this.f344990d.getText().toString().trim();
            String trim2 = RegSetInfoUI.this.f344991e.getText().toString().trim();
            if (trim == null || trim.length() <= 0) {
                C76879j.m92738i(RegSetInfoUI.this, C0966R.string.k9q, C0966R.string.hxn);
                return;
            }
            RegSetInfoUI.this.hideVKB();
            int K7 = RegSetInfoUI.this.mo174811K7();
            String J7 = RegSetInfoUI.this.mo174810J7();
            C86709a0.m107524d().mo123455a(429, RegSetInfoUI.this);
            RegSetInfoUI regSetInfoUI = RegSetInfoUI.this;
            C59889p0 p0Var = new C59889p0(J7, regSetInfoUI.f344998o, K7, trim, trim2, ((C59889p0.C59892b) ((C59889p0) this.f345041d).f170963d).f170969b.f124176a.f137917f, regSetInfoUI.f345003t.getSecImgCode());
            C86709a0.m107524d().mo123460f(p0Var);
            RegSetInfoUI regSetInfoUI2 = RegSetInfoUI.this;
            regSetInfoUI2.f344993g = C76879j.m92723Q(regSetInfoUI2, regSetInfoUI2.getString(C0966R.string.a3h), RegSetInfoUI.this.getString(C0966R.string.hym), true, true, new C115064a(p0Var));
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$n */
    public class C115065n implements DialogInterface.OnDismissListener {
        public C115065n() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            RegSetInfoUI.this.f345003t = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$o */
    public class C115066o extends SecurityImage.C116049b {

        /* renamed from: b */
        public final /* synthetic */ C117747y f345046b;

        public C115066o(C117747y yVar) {
            this.f345046b = yVar;
        }

        /* renamed from: a */
        public void mo93941a() {
            RegSetInfoUI.this.hideVKB();
            RegSetInfoUI regSetInfoUI = RegSetInfoUI.this;
            int i = RegSetInfoUI.f344969V;
            int K7 = regSetInfoUI.mo174811K7();
            String J7 = RegSetInfoUI.this.mo174810J7();
            C86709a0.m107524d().mo123455a(429, RegSetInfoUI.this);
            C86709a0.m107524d().mo123460f(new C59889p0(J7, RegSetInfoUI.this.f344998o, K7, "", "", ((C59889p0.C59892b) ((C59889p0) this.f345046b).f170963d).f170969b.f124176a.f137917f, ""));
        }

        /* renamed from: b */
        public void mo93942b() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$p */
    public class C115067p implements DialogInterface.OnClickListener {
        public C115067p(RegSetInfoUI regSetInfoUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$q */
    public class C115068q implements DialogInterface.OnCancelListener {
        public C115068q(RegSetInfoUI regSetInfoUI) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$r */
    public class C115069r implements DialogInterface.OnClickListener {
        public C115069r() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent;
            if (RegSetInfoUI.this.f344983N == 2) {
                intent = new Intent(RegSetInfoUI.this, MobileInputUI.class);
                intent.putExtra("mobile_input_purpose", 2);
            } else {
                intent = new Intent(RegSetInfoUI.this, RegByMobileRegAIOUI.class);
            }
            intent.addFlags(67108864);
            RegSetInfoUI regSetInfoUI = RegSetInfoUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            RegSetInfoUI regSetInfoUI2 = regSetInfoUI;
            C117292a.m165358d(regSetInfoUI2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/RegSetInfoUI$28", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            regSetInfoUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(regSetInfoUI2, "com/tencent/mm/plugin/account/ui/RegSetInfoUI$28", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            RegSetInfoUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$s */
    public class C115070s implements DialogInterface.OnClickListener {
        public C115070s(RegSetInfoUI regSetInfoUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$t */
    public class C115071t implements Runnable {
        public C115071t() {
        }

        public void run() {
            RegSetInfoUI.this.f345005v.requestFocus();
            RegSetInfoUI.this.f344990d.clearFocus();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$u */
    public class C115072u implements DialogInterface.OnClickListener {
        public C115072u() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C78595a.m94985e("R400_100_signup");
            Intent intent = new Intent(RegSetInfoUI.this, LoginUI.class);
            intent.addFlags(67108864);
            RegSetInfoUI regSetInfoUI = RegSetInfoUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            RegSetInfoUI regSetInfoUI2 = regSetInfoUI;
            C117292a.m165358d(regSetInfoUI2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/RegSetInfoUI$30", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            regSetInfoUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(regSetInfoUI2, "com/tencent/mm/plugin/account/ui/RegSetInfoUI$30", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            RegSetInfoUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$v */
    public class C115073v implements DialogInterface.OnClickListener {
        public C115073v(RegSetInfoUI regSetInfoUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$w */
    public class C115074w implements DialogInterface.OnClickListener {
        public C115074w() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C78595a.m94985e("R500_100");
            Intent intent = new Intent(RegSetInfoUI.this, RegByEmailUI.class);
            intent.addFlags(67108864);
            RegSetInfoUI regSetInfoUI = RegSetInfoUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            RegSetInfoUI regSetInfoUI2 = regSetInfoUI;
            C117292a.m165358d(regSetInfoUI2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/RegSetInfoUI$32", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            regSetInfoUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(regSetInfoUI2, "com/tencent/mm/plugin/account/ui/RegSetInfoUI$32", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            RegSetInfoUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$x */
    public class C115075x implements DialogInterface.OnClickListener {
        public C115075x(RegSetInfoUI regSetInfoUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegSetInfoUI$z */
    public class C115076z implements TextWatcher {
        public C115076z() {
        }

        public void afterTextChanged(Editable editable) {
            String trim = RegSetInfoUI.this.f344990d.getText().toString().trim();
            if (trim == null || trim.length() <= 16) {
                if (!RegSetInfoUI.this.f344989U.stopped()) {
                    RegSetInfoUI.this.f344989U.stopTimer();
                }
                RegSetInfoUI regSetInfoUI = RegSetInfoUI.this;
                regSetInfoUI.f344992f.setEnabled(!Util.isNullOrNil(regSetInfoUI.f344990d.getText().toString().trim()));
                RegSetInfoUI regSetInfoUI2 = RegSetInfoUI.this;
                if (!regSetInfoUI2.f344980K) {
                    regSetInfoUI2.f344991e.setText(trim);
                    return;
                }
                return;
            }
            RegSetInfoUI.this.f344990d.setText(trim.substring(0, 16));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: H7 */
    public static void m161906H7(RegSetInfoUI regSetInfoUI) {
        regSetInfoUI.f344984P = regSetInfoUI.f344990d.getText().toString().trim();
        regSetInfoUI.f344985Q = regSetInfoUI.f344991e.getText().toString().trim();
        if (Util.isNullOrNil(regSetInfoUI.f344984P)) {
            C76879j.m92738i(regSetInfoUI, C0966R.string.k9q, C0966R.string.hxn);
        } else if (regSetInfoUI.f344971B.getVisibility() == 0) {
            regSetInfoUI.f344993g = C76879j.m92723Q(regSetInfoUI, regSetInfoUI.getString(C0966R.string.a3h), regSetInfoUI.getString(C0966R.string.hym), true, true, new C115086a3(regSetInfoUI));
        } else if (!regSetInfoUI.mo174813M7() || !regSetInfoUI.mo174815O7() || Util.isNullOrNil(regSetInfoUI.f344985Q)) {
            regSetInfoUI.hideVKB();
            String extractCountryCode = PhoneFormater.extractCountryCode(regSetInfoUI.f344994h);
            Log.m105925i("MiroMsg.RegSetInfoUI", "countryCode %s", extractCountryCode);
            if (!Util.isNullOrNil(extractCountryCode) && C76850a.m92638j(extractCountryCode)) {
                if (!Util.isNullOrNil(regSetInfoUI.f344994h, regSetInfoUI.f344982M)) {
                    C12215a.m11778c(regSetInfoUI, regSetInfoUI.getString(C0966R.string.fdq, new Object[]{regSetInfoUI.f344994h, regSetInfoUI.f344982M, LocaleUtil.getApplicationLanguage()}), 300, false);
                    return;
                }
                Intent intent = new Intent(regSetInfoUI, MobileInputUI.class);
                intent.putExtra("mobile_input_purpose", 2);
                intent.addFlags(67108864);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(regSetInfoUI, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/RegSetInfoUI", "doNext", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                regSetInfoUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(regSetInfoUI, "com/tencent/mm/plugin/account/ui/RegSetInfoUI", "doNext", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                regSetInfoUI.finish();
                return;
            }
            regSetInfoUI.mo174809I7();
        } else {
            String charSequence = regSetInfoUI.f345001r.getText().toString();
            if (Util.isNullOrNil(charSequence) || charSequence.equals(regSetInfoUI.getString(C0966R.string.hz6))) {
                charSequence = Util.isNullOrNil(regSetInfoUI.f344976G) ? regSetInfoUI.getString(C0966R.string.hz9) : regSetInfoUI.f344976G;
            }
            C76879j.m92748s(regSetInfoUI, charSequence, "");
        }
    }

    /* renamed from: I7 */
    public final void mo174809I7() {
        C114739c0 c0Var;
        int K7 = mo174811K7();
        C86709a0.m107524d().mo123455a(126, this);
        if (mo174815O7()) {
            LinkedList<String> linkedList = this.f345009z;
            int i = (linkedList == null || linkedList.size() == 0) ? 0 : this.f345009z.contains(this.f344985Q) ? 1 : 2;
            c0Var = new C114739c0("", this.f344999p, this.f344984P, this.f344996j, this.f344995i, this.f344994h, "", "", this.f344998o, K7, this.f344985Q, "", "", this.f345004u, this.f345006w);
            ((C118194t0) c0Var.f343995e.getReqObj()).f353322a.f354372z = i;
        } else {
            c0Var = new C114739c0("", this.f344999p, this.f344984P, this.f344996j, this.f344995i, this.f344994h, "", "", this.f344998o, K7, "", "", "", this.f345004u, this.f345006w);
        }
        c0Var.mo174378q1(this.f344982M);
        c0Var.mo174379r1(this.f344986R);
        c0Var.mo174377p1(this.f345008y);
        C86709a0.m107524d().mo123460f(c0Var);
        this.f344993g = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.hym), true, true, new C115054e(c0Var));
    }

    /* renamed from: J7 */
    public final String mo174810J7() {
        int i = this.f344997n;
        boolean z = false;
        if (!(i == 1)) {
            if (!(i == 4)) {
                if (i == 3) {
                    z = true;
                }
                return z ? this.f344995i : this.f345000q;
            }
        }
        return this.f344994h;
    }

    /* renamed from: K7 */
    public final int mo174811K7() {
        int i = this.f344997n;
        boolean z = false;
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 6;
        }
        if (i == 4) {
            z = true;
        }
        return z ? 1 : 2;
    }

    /* renamed from: L7 */
    public final void mo174812L7() {
        hideVKB();
        int i = this.f344997n;
        boolean z = true;
        if (i == 1) {
            C76879j.m92750u(this, getString(C0966R.string.hyz), "", new C115069r(), new C115070s(this));
            return;
        }
        if (!(i == 2)) {
            if (i == 0) {
                C76879j.m92750u(this, getString(C0966R.string.hyy), "", new C115072u(), new C115073v(this));
                return;
            }
            if (i != 3) {
                z = false;
            }
            if (z) {
                C76879j.m92750u(this, getString(C0966R.string.hyy), "", new C115074w(), new C115075x(this));
                return;
            }
            C78595a.m94985e("R200_100");
            Intent intent = new Intent(this, MobileInputUI.class);
            intent.putExtra("mobile_input_purpose", 2);
            intent.addFlags(67108864);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/RegSetInfoUI", "goback", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/RegSetInfoUI", "goback", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finish();
        }
    }

    /* renamed from: M7 */
    public final boolean mo174813M7() {
        return this.f344970A.getVisibility() == 8 || this.f344977H;
    }

    /* renamed from: N7 */
    public boolean mo174814N7(int i, int i2, String str) {
        String str2;
        if (this.f344981L.mo107842c(this, new C77701p0(i, i2, str)) || ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93163uP(getContext(), i, i2, str)) {
            return true;
        }
        if (i2 == -2023 || i2 == -100) {
            C86718e.m107550n();
            AppCompatActivity context = getContext();
            C86709a0.m107523b();
            if (TextUtils.isEmpty(C86718e.f251747w)) {
                str2 = C76577a.m92166q(getContext(), C0966R.string.gmc);
            } else {
                C86709a0.m107523b();
                str2 = C86718e.f251747w;
            }
            C76879j.m92719M(context, str2, getContext().getString(C0966R.string.a3h), new C115067p(this), new C115068q(this));
            return true;
        } else if (i2 == -75) {
            C76879j.m92738i(this, C0966R.string.f7561jo, C0966R.string.hvq);
            return true;
        } else if (i2 == -48) {
            C7660a a = C7660a.m7782a(str);
            if (a != null) {
                a.mo8792b(this, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
            } else {
                C76879j.m92748s(this, getString(C0966R.string.hz5), "");
            }
            return true;
        } else if (i2 != -10 && i2 != -7) {
            return false;
        } else {
            C76879j.m92738i(this, C0966R.string.hvp, C0966R.string.hvq);
            return true;
        }
    }

    /* renamed from: O7 */
    public final boolean mo174815O7() {
        return (this.f345007x & 2) > 0;
    }

    /* renamed from: P7 */
    public final void mo174816P7(boolean z, boolean z2) {
        boolean z3 = false;
        if (Util.isNullOrNil(this.f344991e.getText().toString().trim())) {
            z = false;
        }
        this.f344970A.setImageResource(z2 ? C0966R.C0969drawable.blx : C0966R.C0969drawable.blu);
        this.f344970A.setVisibility(z ? 0 : 8);
        if (z && z2) {
            z3 = true;
        }
        this.f344977H = z3;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.br_;
    }

    public void initView() {
        this.f344979J = findViewById(C0966R.C0970id.hz7);
        this.f344974E = findViewById(C0966R.C0970id.jcy);
        this.f345005v = (ImageView) findViewById(C0966R.C0970id.jcx);
        this.f344990d = (EditText) findViewById(C0966R.C0970id.f359047ik0);
        this.f344975F = (TextView) findViewById(C0966R.C0970id.f359167jd0);
        this.f344991e = (EditText) findViewById(C0966R.C0970id.ik7);
        this.f345001r = (TextView) findViewById(C0966R.C0970id.f5784oj);
        this.f345002s = findViewById(C0966R.C0970id.ikm);
        this.f344970A = (ImageView) findViewById(C0966R.C0970id.lnm);
        this.f344971B = (ProgressBar) findViewById(C0966R.C0970id.i7k);
        this.f344973D = (ImageView) findViewById(C0966R.C0970id.jcz);
        this.f344992f = (Button) findViewById(C0966R.C0970id.hfe);
        int i = 8;
        this.f344970A.setVisibility(8);
        this.f344971B.setVisibility(8);
        this.f344973D.setVisibility(8);
        boolean z = false;
        this.f345006w = false;
        this.f344977H = false;
        View view = this.f344974E;
        int i2 = (this.f345007x & 1) > 0 ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i2));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/RegSetInfoUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/account/ui/RegSetInfoUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f345002s;
        int i3 = mo174815O7() ? 0 : 8;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(Integer.valueOf(i3));
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/RegSetInfoUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/account/ui/RegSetInfoUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        TextView textView = this.f345001r;
        if (mo174815O7()) {
            i = 0;
        }
        textView.setVisibility(i);
        if (!((this.f345007x & 1) > 0) || !mo174815O7()) {
            if (!((this.f345007x & 1) > 0) || mo174815O7()) {
                if (((this.f345007x & 1) > 0) || !mo174815O7()) {
                    this.f344975F.setText(getString(C0966R.string.f361185hz1));
                } else {
                    this.f344975F.setText(getString(C0966R.string.f361187hz3));
                }
            } else {
                this.f344975F.setText(getString(C0966R.string.f361186hz2));
            }
        } else {
            this.f344975F.setText(getString(C0966R.string.hz4));
        }
        C86709a0.m107525e().postAtFrontOfWorker(new C92902y());
        this.f344990d.addTextChangedListener(new C115076z());
        this.f344992f.setOnClickListener(new C92897a0());
        this.f344991e.setOnFocusChangeListener(new C115050b0());
        this.f344991e.addTextChangedListener(new C115051c0());
        setBackBtn(new C115053d0());
        this.f344990d.setOnEditorActionListener(new C92901e0());
        this.f344990d.setOnKeyListener(new C92896a());
        this.f344991e.setOnEditorActionListener(new C92898b());
        this.f344991e.setOnKeyListener(new C92899c());
        this.f345005v.setOnClickListener(new C92900d());
        Uri n = C116299g2.m163858n(C112760b.m154235i());
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0 f0Var = C116281f0.C116289i.f348994a;
        C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
        if (l.mo177810a()) {
            z = l.f348991a.mo119948x(l.f348992b);
        }
        if (!z) {
            C116281f0.C116288h l2 = f0Var.mo177799l(n, l);
            if (l2.mo177810a()) {
                l2.f348991a.mo119937g(l2.f348992b);
            }
        }
        this.f344992f.setEnabled(!Util.isNullOrNil(this.f344990d.getText().toString().trim()));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105925i("MiroMsg.RegSetInfoUI", "onAcvityResult requestCode:%d, resultCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (intent == null || i != 300) {
            Bitmap R5 = ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93147R5(this, i, i2, intent);
            if (R5 != null) {
                this.f345005v.setImageBitmap(R5);
                this.f345006w = true;
                this.f344973D.setVisibility(0);
                return;
            }
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("result_data");
        if (bundleExtra != null && bundleExtra.getString("go_next", "").equals("birthdayComfirmOK")) {
            mo174809I7();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String string = getString(C0966R.string.hz7);
        if (C89625d.f257845k || BuildInfo.IS_FLAVOR_BLUE) {
            string = getString(C0966R.string.a0u) + C88504k.m110376b(this);
        }
        setMMTitle(string);
        ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93150TO();
        this.f344994h = getIntent().getStringExtra("regsetinfo_user");
        this.f344995i = getIntent().getStringExtra("regsetinfo_bind_email");
        this.f344998o = getIntent().getStringExtra("regsetinfo_ticket");
        this.f344999p = getIntent().getStringExtra("regsetinfo_pwd");
        this.f345000q = getIntent().getStringExtra("regsetinfo_binduin");
        this.f345008y = getIntent().getIntExtra("mobile_check_type", 0);
        if (!Util.isNullOrNil(this.f345000q)) {
            this.f344996j = C77710q.m93739b(this.f345000q);
        }
        this.f344997n = getIntent().getExtras().getInt("regsetinfo_ismobile", 0);
        this.f345004u = getIntent().getExtras().getBoolean("regsetinfo_isForce", false);
        this.f345007x = getIntent().getIntExtra("regsetinfo_NextControl", 3);
        this.f344982M = getIntent().getStringExtra("regsession_id");
        this.f344986R = getIntent().getStringExtra("reg_3d_app_ticket");
        this.f344987S = getIntent().getIntExtra("reg_3d_app_type", 0);
        this.f344983N = getIntent().getIntExtra("key_reg_style", 1);
        initView();
        int i = this.f344997n;
        if (i == 1) {
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(getClass().getName());
            sb.append(",");
            sb.append("R200_900_phone");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("R200_900_phone"));
            sb.append(",");
            sb.append(1);
            C78595a.m94983c(10645, true, sb.toString());
            C78595a.m94984d("R200_900_phone");
        } else if (i == 2) {
            StringBuilder sb4 = new StringBuilder();
            C86709a0.m107523b();
            sb4.append(C86718e.m107547e());
            sb4.append(",");
            sb4.append(getClass().getName());
            sb4.append(",");
            sb4.append("R4_QQ");
            sb4.append(",");
            C86709a0.m107523b();
            sb4.append(C86718e.m107548f("R4_QQ"));
            sb4.append(",");
            sb4.append(1);
            C78595a.m94983c(10645, true, sb4.toString());
            C78595a.m94984d("R4_QQ");
        } else if (i == 3) {
            StringBuilder sb5 = new StringBuilder();
            C86709a0.m107523b();
            sb5.append(C86718e.m107547e());
            sb5.append(",");
            sb5.append(getClass().getName());
            sb5.append(",");
            sb5.append("R200_900_email");
            sb5.append(",");
            C86709a0.m107523b();
            sb5.append(C86718e.m107548f("R200_900_email"));
            sb5.append(",");
            sb5.append(1);
            C78595a.m94983c(10645, true, sb5.toString());
            C78595a.m94984d("R200_900_email");
        }
        this.f344980K = false;
        this.f344981L = new C77687b();
    }

    public void onDestroy() {
        super.onDestroy();
        int i = this.f344997n;
        if (i == 1) {
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(getClass().getName());
            sb.append(",");
            sb.append("R200_900_phone");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("R200_900_phone"));
            sb.append(",");
            sb.append(2);
            C78595a.m94983c(10645, false, sb.toString());
        } else if (i == 2) {
            StringBuilder sb4 = new StringBuilder();
            C86709a0.m107523b();
            sb4.append(C86718e.m107547e());
            sb4.append(",");
            sb4.append(getClass().getName());
            sb4.append(",");
            sb4.append("R4_QQ");
            sb4.append(",");
            C86709a0.m107523b();
            sb4.append(C86718e.m107548f("R4_QQ"));
            sb4.append(",");
            sb4.append(2);
            C78595a.m94983c(10645, false, sb4.toString());
        } else if (i == 3) {
            StringBuilder sb5 = new StringBuilder();
            C86709a0.m107523b();
            sb5.append(C86718e.m107547e());
            sb5.append(",");
            sb5.append(getClass().getName());
            sb5.append(",");
            sb5.append("R200_900_email");
            sb5.append(",");
            C86709a0.m107523b();
            sb5.append(C86718e.m107548f("R200_900_email"));
            sb5.append(",");
            sb5.append(2);
            C78595a.m94983c(10645, false, sb5.toString());
        }
        C77687b bVar = this.f344981L;
        if (bVar != null) {
            bVar.mo107840a();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        mo174812L7();
        return true;
    }

    public void onResume() {
        super.onResume();
        this.f344990d.postDelayed(new C115071t(), 500);
    }

    /* JADX WARNING: type inference failed for: r14v2 */
    /* JADX WARNING: type inference failed for: r2v54 */
    /* JADX WARNING: type inference failed for: r2v57 */
    /* JADX WARNING: type inference failed for: r14v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x008d, code lost:
        r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r3);
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r14v1, types: [boolean, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r2v40, types: [boolean, int] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x018e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r31, int r32, java.lang.String r33, ob0.C117747y r34) {
        /*
            r30 = this;
            r9 = r30
            r10 = r31
            r11 = r32
            r12 = r34
            java.lang.Class<om.f> r0 = p214om.C11502f.class
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onSceneEnd: errType = "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = " errCode = "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = " errMsg = "
            r1.append(r2)
            r13 = r33
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            java.lang.String r14 = "MiroMsg.RegSetInfoUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r1)
            int r1 = r34.getType()
            r4 = 1
            r3 = 0
            java.lang.String r15 = ""
            r7 = 126(0x7e, float:1.77E-43)
            if (r1 != r7) goto L_0x0313
            ob0.b0 r1 = f40.C86709a0.m107524d()
            r1.mo123470p(r7, r9)
            android.app.ProgressDialog r1 = r9.f344993g
            if (r1 == 0) goto L_0x004e
            r1.dismiss()
            r9.f344993g = r3
        L_0x004e:
            if (r10 != 0) goto L_0x02aa
            if (r11 != 0) goto L_0x02aa
            com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct r1 = r9.f344988T
            int r7 = r9.f344987S
            long r6 = (long) r7
            r1.f343856d = r6
            r6 = 6
            r1.f343857e = r6
            r1.mo86054n()
            r9.f344976G = r3
            java.lang.String r7 = r30.mo174810J7()
            r1 = r12
            com.tencent.mm.modelsimple.c0 r1 = (com.tencent.p014mm.modelsimple.C114739c0) r1
            java.lang.String r6 = r1.mo174373l1()
            int r5 = r1.mo174374m1()
            java.lang.String r8 = r1.mo174375n1()
            java.lang.String r2 = "wording"
            java.util.Map r2 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r8, r2, r3)
            if (r2 == 0) goto L_0x00c7
            java.lang.String r3 = ".wording.switch"
            java.lang.Object r3 = r2.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r20 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r20 == 0) goto L_0x008d
            goto L_0x0096
        L_0x008d:
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r3)
            if (r3 != 0) goto L_0x0094
            goto L_0x0098
        L_0x0094:
            if (r3 != r4) goto L_0x0098
        L_0x0096:
            r3 = 1
            goto L_0x0099
        L_0x0098:
            r3 = 0
        L_0x0099:
            if (r3 == 0) goto L_0x00c4
            java.lang.String r4 = ".wording.title"
            java.lang.Object r4 = r2.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r21 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r21 != 0) goto L_0x00ac
            r21 = r3
            goto L_0x00af
        L_0x00ac:
            r21 = r3
            r4 = 0
        L_0x00af:
            java.lang.String r3 = ".wording.desc"
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x00c1
            r22 = r2
            r2 = 1
            goto L_0x00ce
        L_0x00c1:
            r3 = r21
            goto L_0x00c9
        L_0x00c4:
            r21 = r3
            goto L_0x00c8
        L_0x00c7:
            r3 = 0
        L_0x00c8:
            r4 = 0
        L_0x00c9:
            r21 = r3
            r2 = 1
            r22 = 0
        L_0x00ce:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r18 = 0
            r3[r18] = r8
            java.lang.String r8 = "mShowStyleContactUploadWordings , %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r14, r8, r3)
            f40.C86718e.m107546E()
            f40.C86718e.f251744t = r2
            r8 = 8
            com.tencent.p014mm.plugin.report.service.C5139t.m5183e(r2, r8)
            r3 = 3
            com.tencent.p014mm.plugin.report.service.C5139t.m5183e(r2, r3)
            com.tencent.p014mm.plugin.report.service.C5139t.m5183e(r2, r2)
            boolean r2 = r9.f345006w
            if (r2 == 0) goto L_0x018e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = a70.C112760b.m154235i()
            r0.append(r1)
            java.lang.String r1 = "temp.avatar"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = a70.C112760b.m154235i()
            r2.append(r3)
            java.lang.String r3 = "temp.avatar.hd"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.vfs.C86013q1.m106463x(r0, r2)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
            r24 = 156(0x9c, float:2.19E-43)
            r25 = 156(0x9c, float:2.19E-43)
            android.graphics.Bitmap$CompressFormat r26 = android.graphics.Bitmap.CompressFormat.JPEG
            r27 = 90
            r29 = 1
            r23 = r2
            r28 = r0
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.createThumbNail((java.lang.String) r23, (int) r24, (int) r25, (android.graphics.Bitmap.CompressFormat) r26, (int) r27, (java.lang.String) r28, (boolean) r29)
            java.lang.Class<ln.p> r0 = p196ln.C117475p.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ln.p r0 = (p196ln.C117475p) r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = a70.C112760b.m154235i()
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r3 = 1
            ln.o r17 = r0.mo182091fC(r9, r1, r3)
            com.tencent.mm.plugin.account.ui.RegSetInfoUI$f r2 = new com.tencent.mm.plugin.account.ui.RegSetInfoUI$f
            r0 = r2
            r1 = r30
            r13 = r2
            r2 = r34
            r20 = r22
            r16 = 3
            r19 = 1
            r22 = r14
            r14 = 0
            r3 = r7
            r23 = r4
            r14 = 1
            r4 = r6
            r24 = r5
            r5 = r21
            r16 = r6
            r6 = r23
            r25 = r7
            r7 = r20
            r8 = r24
            r0.<init>(r2, r3, r4, r5, r6, r7, r8)
            com.tencent.mm.plugin.account.ui.RegSetInfoUI$g r8 = new com.tencent.mm.plugin.account.ui.RegSetInfoUI$g
            r0 = r8
            r3 = r25
            r4 = r16
            r10 = r8
            r8 = r24
            r0.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0 = r17
            com.tencent.mm.modelavatar.s r0 = (com.tencent.p014mm.modelavatar.C1295s) r0
            r0.mo1219a(r14, r13, r10)
            goto L_0x02ad
        L_0x018e:
            r23 = r4
            r24 = r5
            r16 = r6
            r25 = r7
            r20 = r22
            r22 = r14
            r14 = 1
            java.lang.String r1 = r1.mo174376o1()
            r9.f344998o = r1
            eb0.i3 r1 = eb0.C7624i3.f25910c
            java.lang.String r2 = "login_user_name"
            r3 = r25
            r1.mo8756d(r2, r3)
            java.lang.String r1 = "LauncherUI.enter_from_reg"
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r3 = r16
            if (r3 == 0) goto L_0x0212
            java.lang.String r4 = "0"
            boolean r4 = r3.contains(r4)
            if (r4 == 0) goto L_0x0212
            java.lang.String r4 = "R300_100_phone"
            wg0.C78595a.m94985e(r4)
            if (r21 != 0) goto L_0x01c9
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.account.bind.ui.FindMContactIntroUI> r5 = com.tencent.p014mm.plugin.account.bind.p021ui.FindMContactIntroUI.class
            r4.<init>(r9, r5)
            goto L_0x01de
        L_0x01c9:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.account.bind.ui.FindMContactAlertUI> r5 = com.tencent.p014mm.plugin.account.bind.p021ui.FindMContactAlertUI.class
            r4.<init>(r9, r5)
            java.lang.String r5 = "alert_title"
            r6 = r23
            r4.putExtra(r5, r6)
            java.lang.String r5 = "alert_message"
            r6 = r20
            r4.putExtra(r5, r6)
        L_0x01de:
            r4.addFlags(r2)
            java.lang.String r5 = r9.f344998o
            java.lang.String r6 = "regsetinfo_ticket"
            r4.putExtra(r6, r5)
            java.lang.String r5 = "regsetinfo_NextStep"
            r4.putExtra(r5, r3)
            java.lang.String r3 = "regsetinfo_NextStyle"
            r5 = r24
            r4.putExtra(r3, r5)
            di3.d r0 = di3.C86312j.m106911c(r0)
            om.f r0 = (p214om.C11502f) r0
            wc3.z r0 = r0.mo11462yM()
            com.tencent.mm.app.r1 r0 = (com.tencent.p014mm.app.C67654r1) r0
            android.content.Intent r0 = r0.mo93169b(r9)
            r0.addFlags(r2)
            r0.putExtra(r1, r14)
            com.tencent.p014mm.p136ui.MMWizardActivity.m7018M7(r9, r4, r0)
            r30.finish()
            goto L_0x02ad
        L_0x0212:
            di3.d r0 = di3.C86312j.m106911c(r0)
            om.f r0 = (p214om.C11502f) r0
            wc3.z r0 = r0.mo11462yM()
            com.tencent.mm.app.r1 r0 = (com.tencent.p014mm.app.C67654r1) r0
            android.content.Intent r0 = r0.mo93169b(r9)
            r0.addFlags(r2)
            r0.putExtra(r1, r14)
            k20.a r8 = new k20.a
            r8.<init>()
            r8.mo10233c(r0)
            java.lang.Object[] r1 = r8.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/account/ui/RegSetInfoUI"
            java.lang.String r3 = "onSceneEnd"
            java.lang.String r4 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r30
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            java.lang.Object r1 = r8.mo10231a(r0)
            android.content.Intent r1 = (android.content.Intent) r1
            r9.startActivity(r1)
            java.lang.String r1 = "com/tencent/mm/plugin/account/ui/RegSetInfoUI"
            java.lang.String r2 = "onSceneEnd"
            java.lang.String r3 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r30
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            r0 = 10645(0x2995, float:1.4917E-41)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            f40.C86709a0.m107523b()
            java.lang.String r2 = f40.C86718e.m107547e()
            r1.append(r2)
            java.lang.String r2 = ","
            r1.append(r2)
            java.lang.Class r3 = r30.getClass()
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            r1.append(r2)
            java.lang.String r3 = "R200_900_phone"
            r1.append(r3)
            r1.append(r2)
            f40.C86709a0.m107523b()
            int r3 = f40.C86718e.m107548f(r3)
            r1.append(r3)
            r1.append(r2)
            r2 = 4
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            wg0.C78595a.m94982b(r0, r1)
            r30.finish()
            goto L_0x02ad
        L_0x02aa:
            r22 = r14
            r14 = 1
        L_0x02ad:
            r0 = -6
            if (r11 == r0) goto L_0x02cb
            r1 = -311(0xfffffffffffffec9, float:NaN)
            if (r11 == r1) goto L_0x02cb
            r2 = -310(0xfffffffffffffeca, float:NaN)
            if (r11 != r2) goto L_0x02b9
            goto L_0x02cb
        L_0x02b9:
            ei.a r2 = p148ei.C7660a.m7782a(r33)
            if (r2 == 0) goto L_0x02c4
            r3 = 0
            r2.mo8792b(r9, r3, r3)
            return
        L_0x02c4:
            boolean r2 = r30.mo174814N7(r31, r32, r33)
            if (r2 == 0) goto L_0x0319
            return
        L_0x02cb:
            com.tencent.mm.ui.applet.SecurityImage r0 = r9.f345003t
            if (r0 != 0) goto L_0x0303
            androidx.appcompat.app.AppCompatActivity r19 = r30.getContext()
            r20 = 2131834632(0x7f113708, float:1.930238E38)
            r21 = 0
            r0 = r12
            com.tencent.mm.modelsimple.c0 r0 = (com.tencent.p014mm.modelsimple.C114739c0) r0
            byte[] r22 = r0.mo174371j1()
            java.lang.String r23 = r0.mo174372k1()
            com.tencent.mm.plugin.account.ui.RegSetInfoUI$h r0 = new com.tencent.mm.plugin.account.ui.RegSetInfoUI$h
            r0.<init>(r12)
            r26 = 0
            com.tencent.mm.plugin.account.ui.RegSetInfoUI$i r1 = new com.tencent.mm.plugin.account.ui.RegSetInfoUI$i
            r1.<init>()
            com.tencent.mm.plugin.account.ui.RegSetInfoUI$k r2 = new com.tencent.mm.plugin.account.ui.RegSetInfoUI$k
            r2.<init>(r12)
            java.lang.String r24 = ""
            r25 = r0
            r27 = r1
            r28 = r2
            com.tencent.mm.ui.applet.SecurityImage r0 = com.tencent.p014mm.p136ui.applet.SecurityImage.C116047a.m163296a(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r9.f345003t = r0
            goto L_0x0312
        L_0x0303:
            r1 = r12
            com.tencent.mm.modelsimple.c0 r1 = (com.tencent.p014mm.modelsimple.C114739c0) r1
            byte[] r2 = r1.mo174371j1()
            java.lang.String r1 = r1.mo174372k1()
            r3 = 0
            r0.mo177230b(r3, r2, r1, r15)
        L_0x0312:
            return
        L_0x0313:
            r22 = r14
            r0 = -6
            r1 = -311(0xfffffffffffffec9, float:NaN)
            r14 = 1
        L_0x0319:
            int r2 = r34.getType()
            r3 = 429(0x1ad, float:6.01E-43)
            r4 = 2
            if (r2 != r3) goto L_0x04f0
            ob0.b0 r2 = f40.C86709a0.m107524d()
            r2.mo123470p(r3, r9)
            android.app.ProgressDialog r2 = r9.f344993g
            if (r2 == 0) goto L_0x0334
            r2.dismiss()
            r2 = 0
            r9.f344993g = r2
            goto L_0x0335
        L_0x0334:
            r2 = 0
        L_0x0335:
            android.widget.ProgressBar r3 = r9.f344971B
            r5 = 8
            r3.setVisibility(r5)
            r3 = r31
            if (r3 != 0) goto L_0x0473
            if (r11 != 0) goto L_0x0473
            r9.f344976G = r2
            r0 = r12
            hg0.p0 r0 = (hg0.C59889p0) r0
            com.tencent.mm.network.u r1 = r0.f170963d
            hg0.p0$b r1 = (hg0.C59889p0.C59892b) r1
            hg0.e0 r1 = r1.f170969b
            te3.m92 r1 = r1.f124176a
            int r1 = r1.f137919h
            java.lang.Object[] r2 = new java.lang.Object[r14]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r5 = 0
            r2[r5] = r3
            java.lang.String r3 = "UsernameRet %d"
            r5 = r22
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r3, r2)
            r2 = -14
            if (r1 == r2) goto L_0x03ad
            r2 = -10
            if (r1 == r2) goto L_0x03ad
            r2 = -7
            if (r1 != r2) goto L_0x036d
            goto L_0x03ad
        L_0x036d:
            android.widget.EditText r0 = r9.f344991e
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0386
            r0 = 0
            r9.mo174816P7(r0, r0)
            goto L_0x03ac
        L_0x0386:
            r0 = 0
            r9.mo174816P7(r14, r0)
            android.widget.TextView r0 = r9.f345001r
            r1 = 2131834650(0x7f11371a, float:1.9302416E38)
            java.lang.String r1 = r9.getString(r1)
            r0.setText(r1)
            nj3.s0 r0 = r9.f344978I
            if (r0 == 0) goto L_0x03a0
            r0.dismiss()
            r0 = 0
            r9.f344978I = r0
        L_0x03a0:
            android.widget.EditText r0 = r9.f344991e
            com.tencent.mm.plugin.account.ui.RegSetInfoUI$l r1 = new com.tencent.mm.plugin.account.ui.RegSetInfoUI$l
            r1.<init>()
            r2 = 50
            r0.postDelayed(r1, r2)
        L_0x03ac:
            return
        L_0x03ad:
            com.tencent.mm.network.u r0 = r0.f170963d
            hg0.p0$b r0 = (hg0.C59889p0.C59892b) r0
            hg0.e0 r0 = r0.f170969b
            te3.m92 r0 = r0.f124176a
            java.util.LinkedList<te3.rv3> r0 = r0.f137916e
            ei.a r1 = p148ei.C7660a.m7782a(r33)
            if (r1 == 0) goto L_0x03c4
            android.widget.TextView r2 = r9.f345001r
            java.lang.String r1 = r1.f26001b
            r2.setText(r1)
        L_0x03c4:
            java.util.LinkedList<java.lang.String> r1 = r9.f345009z
            r1.clear()
            if (r0 == 0) goto L_0x046f
            int r1 = r0.size()
            if (r1 <= 0) goto L_0x046f
            int r1 = r0.size()
            r2 = 3
            if (r1 <= r2) goto L_0x03da
            r6 = 3
            goto L_0x03de
        L_0x03da:
            int r6 = r0.size()
        L_0x03de:
            java.lang.String[] r1 = new java.lang.String[r6]
            r2 = 0
        L_0x03e1:
            if (r2 >= r6) goto L_0x03f5
            java.lang.Object r3 = r0.get(r2)
            te3.rv3 r3 = (te3.C51163rv3) r3
            java.lang.String r3 = r3.f141175d
            r1[r2] = r3
            java.util.LinkedList<java.lang.String> r5 = r9.f345009z
            r5.add(r3)
            int r2 = r2 + 1
            goto L_0x03e1
        L_0x03f5:
            boolean r0 = r9.f344980K
            if (r0 != 0) goto L_0x03fa
            goto L_0x046f
        L_0x03fa:
            nj3.s0 r0 = r9.f344978I
            if (r0 == 0) goto L_0x0405
            r0.dismiss()
            r0 = 0
            r9.f344978I = r0
            goto L_0x0406
        L_0x0405:
            r0 = 0
        L_0x0406:
            android.view.View r2 = r9.f344979J
            com.tencent.mm.plugin.account.ui.b3 r3 = new com.tencent.mm.plugin.account.ui.b3
            r3.<init>(r9, r1)
            r5 = 2131496988(0x7f0c101c, float:1.8617556E38)
            android.view.View r5 = android.view.View.inflate(r9, r5, r0)
            r0 = 2131314708(0x7f094814, float:1.8247849E38)
            android.view.View r0 = r5.findViewById(r0)
            com.tencent.mm.ui.base.HorizontalListView r0 = (com.tencent.p014mm.p136ui.base.HorizontalListView) r0
            com.tencent.mm.plugin.account.ui.b r6 = new com.tencent.mm.plugin.account.ui.b
            r6.<init>(r9, r1)
            r0.setAdapter((android.widget.ListAdapter) r6)
            r0.setOnItemClickListener(r3)
            r1 = 2131234888(0x7f081048, float:1.8085954E38)
            r0.setBackgroundResource(r1)
            nj3.s0 r1 = new nj3.s0
            r1.<init>((android.view.View) r5)
            r3 = 120(0x78, float:1.68E-43)
            int r3 = kg3.C76577a.m92151b(r9, r3)
            r1.setHeight(r3)
            r3 = 0
            r5 = 0
        L_0x043e:
            java.lang.String[] r7 = r6.f10812d
            int r7 = r7.length
            if (r3 >= r7) goto L_0x0454
            r7 = 0
            android.view.View r8 = r6.getView(r3, r7, r0)
            r10 = 0
            r8.measure(r10, r10)
            int r8 = r8.getMeasuredWidth()
            int r5 = r5 + r8
            int r3 = r3 + 1
            goto L_0x043e
        L_0x0454:
            r0 = 20
            int r3 = kg3.C76577a.m92151b(r9, r0)
            int r3 = r3 + r5
            r1.setWidth(r3)
            int r3 = r2.getWidth()
            int r0 = kg3.C76577a.m92151b(r9, r0)
            int r5 = r5 + r0
            int r3 = r3 - r5
            int r3 = r3 / r4
            r0 = 0
            r1.showAsDropDown(r2, r3, r0)
            r9.f344978I = r1
        L_0x046f:
            r9.mo174816P7(r14, r14)
            return
        L_0x0473:
            if (r11 == r0) goto L_0x0480
            if (r11 == r1) goto L_0x0480
            r0 = -310(0xfffffffffffffeca, float:NaN)
            if (r11 != r0) goto L_0x047c
            goto L_0x0480
        L_0x047c:
            r9.mo174816P7(r14, r14)
            goto L_0x04f4
        L_0x0480:
            com.tencent.mm.ui.applet.SecurityImage r0 = r9.f345003t
            if (r0 != 0) goto L_0x04cd
            androidx.appcompat.app.AppCompatActivity r19 = r30.getContext()
            r20 = 2131834632(0x7f113708, float:1.930238E38)
            r21 = 0
            r0 = r12
            hg0.p0 r0 = (hg0.C59889p0) r0
            com.tencent.mm.network.u r1 = r0.f170963d
            hg0.p0$b r1 = (hg0.C59889p0.C59892b) r1
            hg0.e0 r1 = r1.f170969b
            te3.m92 r1 = r1.f124176a
            te3.qv3 r1 = r1.f137918g
            r2 = 0
            byte[] r2 = new byte[r2]
            byte[] r22 = sf0.C48374j0.m53716e(r1, r2)
            com.tencent.mm.network.u r0 = r0.f170963d
            hg0.p0$b r0 = (hg0.C59889p0.C59892b) r0
            hg0.e0 r0 = r0.f170969b
            te3.m92 r0 = r0.f124176a
            java.lang.String r0 = r0.f137917f
            com.tencent.mm.plugin.account.ui.RegSetInfoUI$m r1 = new com.tencent.mm.plugin.account.ui.RegSetInfoUI$m
            r1.<init>(r12)
            r26 = 0
            com.tencent.mm.plugin.account.ui.RegSetInfoUI$n r2 = new com.tencent.mm.plugin.account.ui.RegSetInfoUI$n
            r2.<init>()
            com.tencent.mm.plugin.account.ui.RegSetInfoUI$o r3 = new com.tencent.mm.plugin.account.ui.RegSetInfoUI$o
            r3.<init>(r12)
            java.lang.String r24 = ""
            r23 = r0
            r25 = r1
            r27 = r2
            r28 = r3
            com.tencent.mm.ui.applet.SecurityImage r0 = com.tencent.p014mm.p136ui.applet.SecurityImage.C116047a.m163296a(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r9.f345003t = r0
            goto L_0x04ef
        L_0x04cd:
            r1 = r12
            hg0.p0 r1 = (hg0.C59889p0) r1
            com.tencent.mm.network.u r2 = r1.f170963d
            hg0.p0$b r2 = (hg0.C59889p0.C59892b) r2
            hg0.e0 r2 = r2.f170969b
            te3.m92 r2 = r2.f124176a
            te3.qv3 r2 = r2.f137918g
            r3 = 0
            byte[] r4 = new byte[r3]
            byte[] r2 = sf0.C48374j0.m53716e(r2, r4)
            com.tencent.mm.network.u r1 = r1.f170963d
            hg0.p0$b r1 = (hg0.C59889p0.C59892b) r1
            hg0.e0 r1 = r1.f170969b
            te3.m92 r1 = r1.f124176a
            java.lang.String r1 = r1.f137917f
            r6 = 0
            r0.mo177230b(r6, r2, r1, r15)
        L_0x04ef:
            return
        L_0x04f0:
            r3 = r31
            r5 = 8
        L_0x04f4:
            r6 = 0
            boolean r0 = r30.mo174814N7(r31, r32, r33)
            if (r0 == 0) goto L_0x04fc
            return
        L_0x04fc:
            if (r3 != r5) goto L_0x051d
            r0 = 2131830324(0x7f112634, float:1.9293642E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r31)
            r1[r6] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r32)
            r1[r14] = r2
            java.lang.String r0 = r9.getString(r0, r1)
            r9.f344976G = r0
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r9, (java.lang.CharSequence) r0, (int) r6)
            r0.show()
            return
        L_0x051d:
            if (r3 != 0) goto L_0x0521
            if (r11 == 0) goto L_0x053d
        L_0x0521:
            r0 = 2131830373(0x7f112665, float:1.9293742E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r31)
            r1[r6] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r32)
            r1[r14] = r2
            java.lang.String r0 = r9.getString(r0, r1)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r9, (java.lang.CharSequence) r0, (int) r6)
            r0.show()
        L_0x053d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.account.p024ui.RegSetInfoUI.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
