package com.tencent.p014mm.plugin.account.bind.p021ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.pay.tool.APPluginConstants;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C1302b0;
import com.tencent.p014mm.p136ui.C6752a3;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import gg0.C107793h;
import gg0.C75909i;
import hg0.C46057k0;
import hg0.C76170j0;
import hg0.C76186t;
import ig0.C76343k;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import ke3.C88144b;
import lc3.C10485b;
import mg0.C76754b;
import nc0.C76850a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p148ei.C7660a;
import p214om.C11502f;
import p286zl.C79396l;
import p910lj.C76701a;
import qo3.C77407n;
import qo3.C89779i0;
import te3.C49901iv;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI */
public class BindMContactIntroUI extends MMWizardActivity implements C11385n {

    /* renamed from: w */
    public static final /* synthetic */ int f344286w = 0;

    /* renamed from: e */
    public TextView f344287e;

    /* renamed from: f */
    public TextView f344288f;

    /* renamed from: g */
    public TextView f344289g;

    /* renamed from: h */
    public TextView f344290h;

    /* renamed from: i */
    public Button f344291i;

    /* renamed from: j */
    public Button f344292j;

    /* renamed from: n */
    public C79396l f344293n;

    /* renamed from: o */
    public String f344294o;

    /* renamed from: p */
    public C89779i0 f344295p = null;

    /* renamed from: q */
    public C76343k f344296q;

    /* renamed from: r */
    public String f344297r = null;

    /* renamed from: s */
    public boolean f344298s = false;

    /* renamed from: t */
    public boolean f344299t = false;

    /* renamed from: u */
    public int f344300u;

    /* renamed from: v */
    public int f344301v = 0;

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI$s */
    public class C68360s implements Runnable {
        public C68360s() {
        }

        public void run() {
            if (C76186t.m91540h()) {
                BindMContactIntroUI bindMContactIntroUI = BindMContactIntroUI.this;
                int i = BindMContactIntroUI.f344286w;
                bindMContactIntroUI.getClass();
                int q = C75592q0.m90787q();
                C76186t.m91542j(true);
                C86709a0.m107535s().mo121142i().mo119676J(7, Integer.valueOf(q & -131073));
                ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93136Bk();
                BindMContactIntroUI bindMContactIntroUI2 = BindMContactIntroUI.this;
                bindMContactIntroUI2.f344291i.setText(bindMContactIntroUI2.getString(C0966R.string.ak5));
                BindMContactIntroUI.this.f344293n = C79396l.SUCC;
                boolean nullAs = Util.nullAs((Boolean) C86709a0.m107535s().mo121142i().mo119684e(12322, Boolean.FALSE), false);
                if (BindMContactIntroUI.this.f344298s && nullAs) {
                    C115669n.INSTANCE.mo160131h(ErrorCode.ERROR_OUTOF_MEMORY, 3, 3);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI$k */
    public class C104700k implements View.OnClickListener {
        public C104700k() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/BindMContactIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BindMContactIntroUI.this.mo174516P7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/BindMContactIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI$u */
    public class C104701u implements View.OnClickListener {
        public C104701u() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/BindMContactIntroUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BindMContactIntroUI bindMContactIntroUI = BindMContactIntroUI.this;
            int ordinal = bindMContactIntroUI.f344293n.ordinal();
            if (ordinal == 1) {
                C86709a0.m107535s().mo121142i().mo119676J(4097, "");
                C86709a0.m107535s().mo121142i().mo119676J(6, "");
                bindMContactIntroUI.initView();
            } else if (ordinal == 2) {
                bindMContactIntroUI.mo174514N7(true);
            } else if (ordinal == 3) {
                bindMContactIntroUI.mo174514N7(true);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/BindMContactIntroUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI$x */
    public class C104702x implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f310940d;

        /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI$x$a */
        public class C104703a implements C11182m0 {
            public C104703a() {
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.setHeaderTitle((int) C0966R.string.ake);
                if ((C104702x.this.f310940d & 2) != 0) {
                    e0Var.mo107125a(0, C0966R.string.akx);
                }
                if ((C104702x.this.f310940d & 1) != 0) {
                    e0Var.mo107125a(1, C0966R.string.ajr);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI$x$b */
        public class C104704b implements C11184p0 {
            public C104704b() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                int itemId = menuItem.getItemId();
                if (itemId == 0) {
                    BindMContactIntroUI bindMContactIntroUI = BindMContactIntroUI.this;
                    int i2 = BindMContactIntroUI.f344286w;
                    C76879j.m92707A(bindMContactIntroUI.getContext(), bindMContactIntroUI.getString(C0966R.string.aku), bindMContactIntroUI.getString(C0966R.string.akv), bindMContactIntroUI.getString(C0966R.string.f7926wf), bindMContactIntroUI.getString(C0966R.string.akt), (DialogInterface.OnClickListener) null, new C107793h(bindMContactIntroUI));
                } else if (itemId == 1) {
                    Intent intent = new Intent();
                    intent.putExtra("need_matte_high_light_item", "settings_find_me_by_mobile");
                    C88144b.m109791i(BindMContactIntroUI.this, "setting", ".ui.setting.SettingsPrivacyUI", intent, (Bundle) null);
                }
            }
        }

        public C104702x(int i) {
            this.f310940d = i;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            AppCompatActivity context = BindMContactIntroUI.this.getContext();
            LayoutInflater.from(context);
            C77407n nVar = new C77407n((Context) context, 1, false);
            C76874e0 e0Var = new C76874e0(context);
            new C76874e0(context);
            C104703a aVar = new C104703a();
            C104704b bVar = new C104704b();
            e0Var.clear();
            C76874e0 e0Var2 = new C76874e0(context);
            aVar.onCreateMMMenu(e0Var2);
            if (e0Var2.mo107176v()) {
                Log.m105928w("MicroMsg.MMSubMenuHelper", "show, menu empty");
            } else {
                nVar.f225771i = aVar;
                nVar.f225782p = bVar;
                nVar.f225761d = null;
                nVar.f225725D = null;
                nVar.mo107573q();
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI$z */
    public class C104705z implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f310944d;

        /* renamed from: e */
        public final /* synthetic */ String f310945e;

        public C104705z(int i, String str) {
            this.f310944d = i;
            this.f310945e = str;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/BindMContactIntroUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BindMContactIntroUI bindMContactIntroUI = BindMContactIntroUI.this;
            bindMContactIntroUI.f344299t = !bindMContactIntroUI.f344299t;
            TextView textView = bindMContactIntroUI.f344287e;
            String string = bindMContactIntroUI.getString(this.f310944d);
            Object[] objArr = new Object[1];
            BindMContactIntroUI bindMContactIntroUI2 = BindMContactIntroUI.this;
            objArr[0] = bindMContactIntroUI2.f344299t ? bindMContactIntroUI2.f344294o : this.f310945e;
            textView.setText(String.format(string, objArr));
            BindMContactIntroUI bindMContactIntroUI3 = BindMContactIntroUI.this;
            bindMContactIntroUI3.f344290h.setText(bindMContactIntroUI3.getString(bindMContactIntroUI3.f344299t ? C0966R.string.csx : C0966R.string.csz));
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/BindMContactIntroUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI$a */
    public class C114839a implements DialogInterface.OnClickListener {
        public C114839a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            MMWizardActivity.m7017L7(BindMContactIntroUI.this, new Intent(BindMContactIntroUI.this, BindMContactStatusUI.class));
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI$b */
    public class C114840b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C76170j0 f344303d;

        public C114840b(BindMContactIntroUI bindMContactIntroUI, C76170j0 j0Var) {
            this.f344303d = j0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f344303d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI$c */
    public class C114841c implements DialogInterface.OnClickListener {
        public C114841c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent();
            if (WeChatBrands.AppInfo.current().isMainland()) {
                intent.putExtra("kintent_hint", BindMContactIntroUI.this.getString(C0966R.string.j1b));
            } else {
                intent.putExtra("kintent_hint", BindMContactIntroUI.this.getString(C0966R.string.j1c));
            }
            intent.putExtra("from_unbind", true);
            C88144b.m109795m(BindMContactIntroUI.this, "account", "com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI", intent, 1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI$d */
    public class C114842d implements DialogInterface.OnClickListener {
        public C114842d(BindMContactIntroUI bindMContactIntroUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI$e */
    public class C114843e implements DialogInterface.OnClickListener {
        public C114843e(BindMContactIntroUI bindMContactIntroUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI$f */
    public class C114844f implements DialogInterface.OnClickListener {
        public C114844f(BindMContactIntroUI bindMContactIntroUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI$g */
    public class C114845g implements DialogInterface.OnClickListener {
        public C114845g(BindMContactIntroUI bindMContactIntroUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI$h */
    public class C114846h implements DialogInterface.OnClickListener {
        public C114846h(BindMContactIntroUI bindMContactIntroUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI$i */
    public class C114847i implements DialogInterface.OnClickListener {
        public C114847i(BindMContactIntroUI bindMContactIntroUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI$j */
    public class C114848j implements DialogInterface.OnClickListener {
        public C114848j(BindMContactIntroUI bindMContactIntroUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI$l */
    public class C114849l implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C76170j0 f344305d;

        public C114849l(BindMContactIntroUI bindMContactIntroUI, C76170j0 j0Var) {
            this.f344305d = j0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f344305d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI$m */
    public class C114850m implements DialogInterface.OnClickListener {
        public C114850m() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent();
            if (WeChatBrands.AppInfo.current().isMainland()) {
                intent.putExtra("kintent_hint", BindMContactIntroUI.this.getString(C0966R.string.j1b));
            } else {
                intent.putExtra("kintent_hint", BindMContactIntroUI.this.getString(C0966R.string.j1c));
            }
            intent.putExtra("from_unbind", true);
            C88144b.m109795m(BindMContactIntroUI.this, "account", "com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI", intent, 1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI$n */
    public class C114851n implements DialogInterface.OnClickListener {
        public C114851n(BindMContactIntroUI bindMContactIntroUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI$o */
    public class C114852o implements DialogInterface.OnClickListener {
        public C114852o(BindMContactIntroUI bindMContactIntroUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI$p */
    public class C114853p implements DialogInterface.OnClickListener {
        public C114853p(BindMContactIntroUI bindMContactIntroUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI$q */
    public class C114854q implements DialogInterface.OnClickListener {
        public C114854q(BindMContactIntroUI bindMContactIntroUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI$r */
    public class C114855r implements DialogInterface.OnClickListener {
        public C114855r(BindMContactIntroUI bindMContactIntroUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI$t */
    public class C114856t implements DialogInterface.OnCancelListener {
        public C114856t(BindMContactIntroUI bindMContactIntroUI) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI$v */
    public class C114857v implements MenuItem.OnMenuItemClickListener {
        public C114857v() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BindMContactIntroUI.this.mo174515O7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI$w */
    public class C114858w implements MenuItem.OnMenuItemClickListener {
        public C114858w() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BindMContactIntroUI.this.mo174515O7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI$y */
    public class C114859y implements Runnable {
        public C114859y() {
        }

        public void run() {
            int measuredWidth = BindMContactIntroUI.this.f344291i.getMeasuredWidth();
            if (BindMContactIntroUI.this.f344292j.getMeasuredWidth() < measuredWidth) {
                BindMContactIntroUI.this.f344292j.setWidth(measuredWidth);
            }
        }
    }

    /* renamed from: N7 */
    public final void mo174514N7(boolean z) {
        C76850a.C76851a a;
        Intent intent = new Intent(this, BindMContactUI.class);
        if (z) {
            intent.putExtra("bind_scene", 3);
        } else {
            intent.putExtra("bind_scene", 0);
        }
        String simCountryIso = ((TelephonyManager) getSystemService("phone")).getSimCountryIso();
        if (!Util.isNullOrNil(simCountryIso) && (a = C76850a.m92629a(this, simCountryIso, getString(C0966R.string.bvs))) != null) {
            intent.putExtra("country_name", a.f224677c);
            intent.putExtra("couttry_code", a.f224676b);
        }
        MMWizardActivity.m7017L7(this, intent);
    }

    /* renamed from: O7 */
    public void mo174515O7() {
        hideVKB();
        if (this.f344300u == 2) {
            mo7678H7();
            finish();
            return;
        }
        mo7680J7();
    }

    /* renamed from: P7 */
    public void mo174516P7() {
        int ordinal = this.f344293n.ordinal();
        boolean z = false;
        if (ordinal == 0) {
            mo174514N7(false);
        } else if (ordinal == 1) {
            String str = this.f344294o;
            Log.m105925i("MicroMsg.BindMContactIntroUI", "bindBy sms %s", str);
            if (this.f344296q == null) {
                this.f344296q = new C76343k(C76343k.C76348e.BINDMOBILE, this, new C75909i(this, str));
            }
            C76343k kVar = this.f344296q;
            int i = this.f344300u;
            if (i == 0 || i == 3) {
                z = true;
            }
            kVar.f223602n = z;
            kVar.mo106573d(str);
        } else if (ordinal == 2) {
            Intent intent = new Intent(this, MobileFriendUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/account/bind/ui/BindMContactIntroUI", "onClickMainButton", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/account/bind/ui/BindMContactIntroUI", "onClickMainButton", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (ordinal == 3) {
            C76186t.m91542j(false);
            ((C76754b) C86312j.m106911c(C76754b.class)).mo105745dR(this, new C68360s(), true, this.f344301v);
        }
    }

    /* renamed from: Q7 */
    public final void mo174517Q7(int i) {
        TextView textView = this.f344290h;
        if (textView != null) {
            textView.setVisibility(0);
            String a = C6752a3.m7023a(this.f344294o);
            this.f344287e.setText(String.format(getString(i), new Object[]{a}));
            TextView textView2 = this.f344290h;
            if (textView2 != null) {
                textView2.setVisibility(0);
                this.f344290h.setOnClickListener(new C104705z(i, a));
            }
        }
    }

    /* renamed from: R7 */
    public void mo174518R7() {
        int ordinal = this.f344293n.ordinal();
        if (ordinal == 0) {
            showOptionMenu(1, false);
            this.f344289g.setVisibility(0);
            TextView textView = this.f344288f;
            if (textView != null) {
                textView.setVisibility(8);
            }
            TextView textView2 = this.f344290h;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            this.f344292j.setVisibility(8);
            this.f344287e.setText(getString(C0966R.string.ak_));
            this.f344289g.setText(getString(C0966R.string.ak9));
            this.f344291i.setText(C0966R.string.ajh);
        } else if (ordinal == 1) {
            showOptionMenu(1, false);
            this.f344289g.setVisibility(8);
            TextView textView3 = this.f344288f;
            if (textView3 != null) {
                textView3.setVisibility(0);
                this.f344288f.setText(C0966R.string.f360171al1);
            }
            this.f344292j.setVisibility(0);
            mo174517Q7(C0966R.string.csy);
            this.f344291i.setText(C0966R.string.al6);
            this.f344292j.setText(C0966R.string.ajs);
            this.f344292j.setTextColor(getResources().getColor(C0966R.color.f2966ao));
        } else if (ordinal == 2) {
            showOptionMenu(1, true);
            this.f344289g.setVisibility(0);
            TextView textView4 = this.f344288f;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            this.f344292j.setVisibility(0);
            mo174517Q7(C0966R.string.alb);
            this.f344289g.setText(C0966R.string.ajo);
            this.f344291i.setText(C0966R.string.ak5);
            this.f344292j.setText(C0966R.string.ajq);
            this.f344292j.post(new C114859y());
        } else if (ordinal == 3) {
            showOptionMenu(1, true);
            this.f344289g.setVisibility(0);
            TextView textView5 = this.f344288f;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
            this.f344292j.setVisibility(0);
            mo174517Q7(C0966R.string.alb);
            this.f344289g.setText(C0966R.string.f360172al2);
            this.f344291i.setText(C0966R.string.f360173al3);
            this.f344292j.setText(C0966R.string.ajq);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6573ip;
    }

    public void initView() {
        int i = 0;
        this.f344300u = getIntent().getIntExtra("bind_scene", 0);
        this.f344298s = getIntent().getBooleanExtra("KEnterFromBanner", false);
        this.f344301v = getIntent().getIntExtra("key_upload_scene", 0);
        this.f344293n = C76186t.m91534b();
        Log.m105918d("MicroMsg.BindMContactIntroUI", "state " + this.f344293n);
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null);
        this.f344294o = str;
        if (str == null || str.equals("")) {
            this.f344294o = (String) C86709a0.m107535s().mo121142i().mo119684e(4097, (Object) null);
        }
        this.f344287e = (TextView) findViewById(C0966R.C0970id.jdh);
        this.f344288f = (TextView) findViewById(C0966R.C0970id.o_w);
        this.f344289g = (TextView) findViewById(C0966R.C0970id.jdg);
        this.f344290h = (TextView) findViewById(C0966R.C0970id.o5v);
        this.f344291i = (Button) findViewById(C0966R.C0970id.jdf);
        this.f344292j = (Button) findViewById(C0966R.C0970id.jdi);
        this.f344291i.setOnClickListener(new C104700k());
        this.f344292j.setOnClickListener(new C104701u());
        if (getIntent().getBooleanExtra("skip", false)) {
            addTextOptionMenu(0, getString(C0966R.string.f8032zu), new C114857v());
        } else {
            C114858w wVar = new C114858w();
            if (this.f344301v == 9) {
                i = C0966R.raw.actionbar_icon_close_black;
            }
            setBackBtn(wVar, i);
        }
        C79396l lVar = this.f344293n;
        if (lVar == C79396l.SUCC_UNLOAD || lVar == C79396l.SUCC) {
            String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("ShowUnbindPhone");
            int i2 = 2;
            if (!Util.isNullOrNil(c)) {
                i2 = Util.safeParseInt(c);
            }
            if (i2 != 0) {
                addIconOptionMenu(1, C0966R.raw.icons_outlined_more, new C104702x(i2));
            }
        }
        mo174518R7();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105919d("MicroMsg.BindMContactIntroUI", "summerunbind onAcvityResult requestCode:%d, resultCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 1 && i2 == -1) {
            Log.m105924i("MicroMsg.BindMContactIntroUI", "summerunbind REQUEST_CODE_SET_PSW ok and start NetSceneCheckUnBind again mobile: " + this.f344294o);
            C86709a0.m107524d().mo123460f(new C46057k0(2));
            this.f344295p = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.f360085a04), true, true, new C114856t(this));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(255, this);
        C86709a0.m107524d().mo123455a(254, this);
        setActionbarColor(getContext().getResources().getColor(C0966R.color.f2929c));
        hideActionbarLine();
        setNavigationbarColor(getContext().getResources().getColor(C0966R.color.f2929c));
        setMMTitle((int) C0966R.string.akq);
    }

    public void onDestroy() {
        C86709a0.m107524d().mo123470p(255, this);
        C86709a0.m107524d().mo123470p(254, this);
        C76343k kVar = this.f344296q;
        if (kVar != null) {
            kVar.mo106571b();
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        mo174515O7();
        return true;
    }

    public void onResume() {
        super.onResume();
        initView();
        C86709a0.m107524d().mo123455a(132, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z;
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        Log.m105924i("MicroMsg.BindMContactIntroUI", "summerunbind onSceneEnd type: " + yVar.getType() + " errType = " + i3 + " errCode = " + i4 + " errMsg = " + str2);
        if (yVar.getType() == 132 && i3 == 0 && i4 == 0) {
            C89779i0 i0Var = this.f344295p;
            if (i0Var != null) {
                i0Var.dismiss();
                this.f344295p = null;
            }
            if (((C76170j0) yVar).mo106407f() == 3) {
                ((C76754b) C86312j.m106911c(C76754b.class)).mo105751xv(this);
                if (!Util.isNullOrNil(this.f344297r)) {
                    C76879j.m92754y(this, this.f344297r, "", getString(C0966R.string.f8029zr), new C114839a());
                } else {
                    MMWizardActivity.m7017L7(this, new Intent(this, BindMContactStatusUI.class));
                }
            }
        } else {
            if (!((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93163uP(this, i3, i4, str2)) {
                if (i4 == -214) {
                    C7660a a = C7660a.m7782a(str);
                    if (a != null) {
                        a.mo8792b(this, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
                    }
                } else if (i4 == -43) {
                    C76701a.makeText((Context) this, (int) C0966R.string.aju, 0).show();
                } else if (i4 != -41) {
                    switch (i4) {
                        case APPluginConstants.ERROR_IO_ObjectStreamException_NotSerializableException:
                            C76701a.makeText((Context) this, (int) C0966R.string.ajz, 0).show();
                            break;
                        case APPluginConstants.ERROR_IO_ObjectStreamException_NotActiveException:
                            C76701a.makeText((Context) this, (int) C0966R.string.ajv, 0).show();
                            break;
                        case APPluginConstants.ERROR_IO_ObjectStreamException_InvalidObjectException:
                            C76701a.makeText((Context) this, (int) C0966R.string.ajx, 0).show();
                            break;
                        default:
                            z = false;
                            break;
                    }
                } else {
                    C76701a.makeText((Context) this, (int) C0966R.string.ajw, 0).show();
                }
            }
            z = true;
            if (z) {
                C89779i0 i0Var2 = this.f344295p;
                if (i0Var2 != null) {
                    i0Var2.dismiss();
                    this.f344295p = null;
                    return;
                }
                return;
            }
            if (yVar.getType() == 254) {
                C89779i0 i0Var3 = this.f344295p;
                if (i0Var3 != null) {
                    i0Var3.dismiss();
                    this.f344295p = null;
                }
                if (i3 == 0 && i4 == 0) {
                    String str3 = ((C49901iv) ((C46057k0) yVar).f124181e.f127056b.f127083a).f135687e;
                    this.f344297r = str3;
                    if (!Util.isNullOrNil(str3)) {
                        C76170j0 j0Var = new C76170j0(this.f344294o, 3, "", 0, "", "");
                        C86709a0.m107524d().mo123460f(j0Var);
                        this.f344295p = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.f360170al0), true, true, new C114840b(this, j0Var));
                        return;
                    }
                    C86709a0.m107524d().mo123460f(new C1302b0(2));
                    return;
                } else if (i4 == -3) {
                    Log.m105918d("MicroMsg.BindMContactIntroUI", "summerunbind MMFunc_QueryHasPasswd err and set psw");
                    C76879j.m92709C(getContext(), getString(C0966R.string.j1e), (String) null, getString(C0966R.string.j1f), getString(C0966R.string.j1d), true, new C114841c(), new C114842d(this));
                } else if (i4 == -81) {
                    C76879j.m92742m(this, C0966R.string.iom, C0966R.string.a3h, new C114843e(this));
                } else if (i4 == -82) {
                    C76879j.m92742m(this, C0966R.string.ion, C0966R.string.a3h, new C114844f(this));
                } else if (i4 == -83) {
                    C76879j.m92742m(this, C0966R.string.iok, C0966R.string.a3h, new C114845g(this));
                } else if (i4 == -84) {
                    C76879j.m92742m(this, C0966R.string.iol, C0966R.string.a3h, new C114846h(this));
                } else if (i4 == -85) {
                    C76879j.m92742m(this, C0966R.string.ioh, C0966R.string.a3h, new C114847i(this));
                } else if (i4 == -86) {
                    C76879j.m92742m(this, C0966R.string.iop, C0966R.string.a3h, new C114848j(this));
                }
            }
            if (yVar.getType() == 255) {
                C89779i0 i0Var4 = this.f344295p;
                if (i0Var4 != null) {
                    i0Var4.dismiss();
                    this.f344295p = null;
                }
                if (i4 == 0) {
                    C76170j0 j0Var2 = new C76170j0(this.f344294o, 3, "", 0, "", "");
                    C86709a0.m107524d().mo123460f(j0Var2);
                    this.f344295p = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.f360170al0), true, true, new C114849l(this, j0Var2));
                } else {
                    Log.m105924i("MicroMsg.BindMContactIntroUI", "summerunbind old err_password");
                    C76879j.m92709C(getContext(), getString(C0966R.string.j1e), (String) null, getString(C0966R.string.j1f), getString(C0966R.string.j1d), true, new C114850m(), new C114851n(this));
                }
            }
            if (yVar.getType() == 132) {
                C89779i0 i0Var5 = this.f344295p;
                if (i0Var5 != null) {
                    i0Var5.dismiss();
                    this.f344295p = null;
                }
                if (((C76170j0) yVar).mo106407f() != 3) {
                    return;
                }
                if (i4 == -82) {
                    C76879j.m92742m(this, C0966R.string.ion, C0966R.string.a3h, new C114852o(this));
                } else if (i4 == -83) {
                    C76879j.m92742m(this, C0966R.string.iok, C0966R.string.a3h, new C114853p(this));
                } else if (i4 == -84) {
                    C76879j.m92742m(this, C0966R.string.iol, C0966R.string.a3h, new C114854q(this));
                } else if (i4 == -85) {
                    C76879j.m92742m(this, C0966R.string.ioh, C0966R.string.a3h, new C114855r(this));
                } else {
                    C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.akw, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
                }
            }
        }
    }

    public void onStop() {
        C86709a0.m107524d().mo123470p(132, this);
        super.onStop();
    }
}
