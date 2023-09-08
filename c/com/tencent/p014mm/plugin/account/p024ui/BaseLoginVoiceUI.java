package com.tencent.p014mm.plugin.account.p024ui;

import al3.C0086a;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.IBinder;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import bc0.C67216a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.LoginDisasterEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.FoldingPhoneLoginTypeStruct;
import com.tencent.p014mm.modelsimple.C114735a0;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.applet.SecurityImage;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.account.p024ui.C115203z0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.PhoneFormater;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import di3.C86312j;
import eb0.C75576f4;
import eb0.C75593t5;
import eb0.C7624i3;
import f40.C86709a0;
import f40.C86718e;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import nc0.C76850a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76875f0;
import nj3.C76879j;
import nj3.C88989a;
import nj3.C88990b;
import ob0.C11385n;
import ob0.C117747y;
import p148ei.C7660a;
import p196ln.C76708i;
import p206nj.C76861g;
import p214om.C11502f;
import p629ny.C76979h;
import p983ik.C87743a;
import qo3.C77389a;
import qo3.C77398g;
import qo3.C77407n;
import sf0.C118276e;
import sf0.C13665i0;
import sf0.C77687b;
import sf0.C77701p0;
import vg0.C14858a;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI */
public abstract class BaseLoginVoiceUI extends MMActivity implements C11385n {

    /* renamed from: L */
    public static final /* synthetic */ int f344403L = 0;

    /* renamed from: A */
    public SharedPreferences f344404A;

    /* renamed from: B */
    public C77687b f344405B;

    /* renamed from: C */
    public Button f344406C;

    /* renamed from: D */
    public String f344407D = "";

    /* renamed from: E */
    public boolean f344408E;

    /* renamed from: F */
    public int f344409F;

    /* renamed from: G */
    public int f344410G;

    /* renamed from: H */
    public int f344411H;

    /* renamed from: I */
    public int[] f344412I = new int[5];

    /* renamed from: J */
    public IListener f344413J = new IListener<LoginDisasterEvent>(this, C40008f.f107254d) {
        {
            this.__eventId = -1399051904;
        }

        public boolean callback(IEvent iEvent) {
            LoginDisasterEvent.C114679a aVar;
            LoginDisasterEvent loginDisasterEvent = (LoginDisasterEvent) iEvent;
            if (loginDisasterEvent == null || (aVar = loginDisasterEvent.f343570d) == null) {
                return false;
            }
            Log.m105925i("MicroMsg.LoginHistoryUI", "summerdiz loginDisasterListener callback content[%s], url[%s]", aVar.f343571a, aVar.f343572b);
            Intent intent = new Intent();
            intent.putExtra("key_disaster_content", loginDisasterEvent.f343570d.f343571a);
            intent.putExtra("key_disaster_url", loginDisasterEvent.f343570d.f343572b);
            intent.setClass(MMApplicationContext.getContext(), DisasterUI.class).addFlags(268435456);
            Context context = MMApplicationContext.getContext();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };

    /* renamed from: K */
    public int f344414K = 0;

    /* renamed from: d */
    public TextView f344415d;

    /* renamed from: e */
    public Button f344416e;

    /* renamed from: f */
    public View f344417f;

    /* renamed from: g */
    public Button f344418g;

    /* renamed from: h */
    public Button f344419h;

    /* renamed from: i */
    public View f344420i;

    /* renamed from: j */
    public Button f344421j;

    /* renamed from: n */
    public ProgressDialog f344422n = null;

    /* renamed from: o */
    public SecurityImage f344423o = null;

    /* renamed from: p */
    public C115135m0 f344424p = new C115135m0();

    /* renamed from: q */
    public String f344425q = "";

    /* renamed from: r */
    public String f344426r;

    /* renamed from: s */
    public String f344427s;

    /* renamed from: t */
    public String f344428t;

    /* renamed from: u */
    public String f344429u;

    /* renamed from: v */
    public String f344430v;

    /* renamed from: w */
    public ImageView f344431w;

    /* renamed from: x */
    public String f344432x;

    /* renamed from: y */
    public String f344433y;

    /* renamed from: z */
    public String f344434z;

    /* renamed from: com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI$a */
    public class C1397a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77407n f10625d;

        public C1397a(C77407n nVar) {
            this.f10625d = nVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BaseLoginVoiceUI.this.hideVKB();
            this.f10625d.mo107573q();
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI$b */
    public class C1398b implements View.OnClickListener {
        public C1398b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BaseLoginVoiceUI baseLoginVoiceUI = BaseLoginVoiceUI.this;
            BaseLoginVoiceUI.m161814Q7(baseLoginVoiceUI, BaseLoginVoiceUI.this.getString(C0966R.string.liq) + LocaleUtil.getApplicationLanguage());
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI$c */
    public class C1399c implements View.OnClickListener {
        public C1399c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BaseLoginVoiceUI.m161812I7(BaseLoginVoiceUI.this);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI$d */
    public class C1400d implements View.OnClickListener {
        public C1400d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C88144b.m109789g(BaseLoginVoiceUI.this, "login_exdevice", ".ui.LoginAsExDeviceUI");
            BaseLoginVoiceUI.this.overridePendingTransition(C0966R.C0968anim.f2468ds, C0966R.C0968anim.f2333y);
            C115669n.INSTANCE.mo175904A(1570, 4);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI$s */
    public class C1401s implements MenuItem.OnMenuItemClickListener {
        public C1401s() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BaseLoginVoiceUI baseLoginVoiceUI = BaseLoginVoiceUI.this;
            int i = BaseLoginVoiceUI.f344403L;
            baseLoginVoiceUI.mo174583L7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI$t */
    public class C1402t implements View.OnClickListener {
        public C1402t() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BaseLoginVoiceUI.m161814Q7(BaseLoginVoiceUI.this, BaseLoginVoiceUI.this.getString(C0966R.string.gcz) + LocaleUtil.getApplicationLanguage());
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI$u */
    public class C1403u implements View.OnClickListener {
        public C1403u() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BaseLoginVoiceUI.m161814Q7(BaseLoginVoiceUI.this, BaseLoginVoiceUI.this.getString(C0966R.string.f26, new Object[]{LocaleUtil.getApplicationLanguage()}));
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI$v */
    public class C1404v implements C11182m0 {
        public C1404v(BaseLoginVoiceUI baseLoginVoiceUI) {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            if (e0Var.size() == 0) {
                e0Var.mo107125a(7002, C0966R.string.gch);
                e0Var.mo107125a(7003, C0966R.string.frf);
                e0Var.mo107125a(7004, C0966R.string.lis);
                if (!LocaleUtil.isSimplifiedChineseAppLang()) {
                    e0Var.mo107125a(7009, C0966R.string.lip);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI$w */
    public class C1405w implements C11184p0 {
        public C1405w() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int itemId = menuItem.getItemId();
            if (itemId != 7009) {
                switch (itemId) {
                    case 7002:
                        BaseLoginVoiceUI baseLoginVoiceUI = BaseLoginVoiceUI.this;
                        baseLoginVoiceUI.f344412I[4] = 1;
                        Intent intent = new Intent(baseLoginVoiceUI, MobileInputUI.class);
                        intent.putExtra("mobile_input_purpose", 1);
                        int[] iArr = new int[5];
                        iArr[4] = 1;
                        intent.putExtra("kv_report_login_method_data", iArr);
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        BaseLoginVoiceUI baseLoginVoiceUI2 = baseLoginVoiceUI;
                        C117292a.m165358d(baseLoginVoiceUI2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "switchUser", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        baseLoginVoiceUI.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(baseLoginVoiceUI2, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "switchUser", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return;
                    case 7003:
                        BaseLoginVoiceUI baseLoginVoiceUI3 = BaseLoginVoiceUI.this;
                        int i2 = BaseLoginVoiceUI.f344403L;
                        baseLoginVoiceUI3.getClass();
                        Intent intent2 = new Intent(baseLoginVoiceUI3, RegByMobileRegAIOUI.class);
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(intent2);
                        C117292a.m165358d(baseLoginVoiceUI3, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "register", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        baseLoginVoiceUI3.startActivity((Intent) aVar2.mo10231a(0));
                        C117292a.m165359e(baseLoginVoiceUI3, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "register", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return;
                    case 7004:
                        BaseLoginVoiceUI.m161812I7(BaseLoginVoiceUI.this);
                        return;
                    default:
                        return;
                }
            } else {
                BaseLoginVoiceUI baseLoginVoiceUI4 = BaseLoginVoiceUI.this;
                BaseLoginVoiceUI.m161814Q7(baseLoginVoiceUI4, BaseLoginVoiceUI.this.getString(C0966R.string.liq) + LocaleUtil.getApplicationLanguage());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI$x */
    public class C1406x implements C77407n.C47880p {
        public C1406x(BaseLoginVoiceUI baseLoginVoiceUI) {
        }

        public void onDismiss() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI$e */
    public class C114899e implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C67216a f344435d;

        public C114899e(BaseLoginVoiceUI baseLoginVoiceUI, C67216a aVar) {
            this.f344435d = aVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f344435d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI$f */
    public class C114900f implements DialogInterface.OnClickListener {
        public C114900f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            BaseLoginVoiceUI.m161813J7(BaseLoginVoiceUI.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI$g */
    public class C114901g implements DialogInterface.OnClickListener {
        public C114901g() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            BaseLoginVoiceUI.m161813J7(BaseLoginVoiceUI.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI$h */
    public class C114902h implements DialogInterface.OnClickListener {
        public C114902h() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            BaseLoginVoiceUI baseLoginVoiceUI = BaseLoginVoiceUI.this;
            baseLoginVoiceUI.mo174585N7(baseLoginVoiceUI.f344428t);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI$i */
    public class C114903i implements C115203z0.C115206d {
        public C114903i() {
        }

        /* renamed from: a */
        public void mo174591a(ProgressDialog progressDialog) {
            BaseLoginVoiceUI.this.f344422n = progressDialog;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI$j */
    public class C114904j implements C75576f4.C75578b {
        public C114904j(BaseLoginVoiceUI baseLoginVoiceUI) {
        }

        /* renamed from: a */
        public void mo57753a(C114770g gVar) {
            if (gVar != null) {
                gVar.mo55443A3().mo55422X0(new byte[0], new byte[0], new byte[0], C86709a0.m107523b().mo121110g());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI$k */
    public class C114905k implements DialogInterface.OnClickListener {
        public C114905k() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            int i2;
            BaseLoginVoiceUI baseLoginVoiceUI = BaseLoginVoiceUI.this;
            int i3 = baseLoginVoiceUI.f344410G;
            if (i3 == 0) {
                i2 = !C76850a.m92642n() ? 7 : 6;
            } else {
                int i4 = ((i3 & 2) == 0 && (i3 & 4) == 0) ? 0 : 2;
                if ((i3 & 4) != 0) {
                    i4 |= 4;
                }
                i2 = (i3 & 1) != 0 ? i4 | 1 : i4;
            }
            C68507q.m80767b(baseLoginVoiceUI, i2 | 8);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI$l */
    public class C114906l implements DialogInterface.OnClickListener {
        public C114906l() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            BaseLoginVoiceUI.this.f344414K++;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI$m */
    public class C114907m implements DialogInterface.OnClickListener {
        public C114907m(BaseLoginVoiceUI baseLoginVoiceUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI$n */
    public class C114908n implements DialogInterface.OnClickListener {
        public C114908n(BaseLoginVoiceUI baseLoginVoiceUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI$o */
    public class C114909o implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f344442d;

        /* renamed from: com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI$o$a */
        public class C114910a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C114735a0 f344444d;

            public C114910a(C114735a0 a0Var) {
                this.f344444d = a0Var;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C86709a0.m107524d().mo123458d(this.f344444d);
                C86709a0.m107524d().mo123470p(701, BaseLoginVoiceUI.this);
                C86709a0.m107524d().mo123470p(252, BaseLoginVoiceUI.this);
            }
        }

        public C114909o(int i) {
            this.f344442d = i;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105918d("MicroMsg.LoginHistoryUI", "imgSid:" + BaseLoginVoiceUI.this.f344424p.f345165e + " img len" + BaseLoginVoiceUI.this.f344424p.f345167g.length + " " + C76861g.m92660c());
            Object[] objArr = new Object[5];
            objArr[0] = Integer.valueOf(this.f344442d);
            String str = BaseLoginVoiceUI.this.f344407D;
            int i2 = -1;
            objArr[1] = Integer.valueOf(str == null ? -1 : str.length());
            objArr[2] = Util.secPrint(BaseLoginVoiceUI.this.f344407D);
            String str2 = BaseLoginVoiceUI.this.f344424p.f345163c;
            if (str2 != null) {
                i2 = str2.length();
            }
            objArr[3] = Integer.valueOf(i2);
            objArr[4] = Util.secPrint(BaseLoginVoiceUI.this.f344424p.f345163c);
            Log.m105919d("MicroMsg.LoginHistoryUI", "summervoice errType:%d, mAuthPwd len:%d content[%s] logindata.rawPsw len:%d content[%s]", objArr);
            BaseLoginVoiceUI baseLoginVoiceUI = BaseLoginVoiceUI.this;
            C115135m0 m0Var = baseLoginVoiceUI.f344424p;
            C114735a0 a0Var = new C114735a0(m0Var.f345162b, m0Var.f345163c, m0Var.f345168h, baseLoginVoiceUI.f344423o.getSecImgCode(), BaseLoginVoiceUI.this.f344423o.getSecImgSid(), BaseLoginVoiceUI.this.f344423o.getSecImgEncryptKey(), 0, "", false, false);
            if (Util.isNullOrNil(BaseLoginVoiceUI.this.f344424p.f345163c) && !Util.isNullOrNil(BaseLoginVoiceUI.this.f344407D)) {
                Log.m105925i("MicroMsg.LoginHistoryUI", "summervoice resetMd5BeforeDoSceneByVoice mAuthPwd:", Util.secPrint(BaseLoginVoiceUI.this.f344407D));
                a0Var.mo174366v1(BaseLoginVoiceUI.this.f344407D);
            }
            C86709a0.m107524d().mo123460f(a0Var);
            BaseLoginVoiceUI baseLoginVoiceUI2 = BaseLoginVoiceUI.this;
            baseLoginVoiceUI2.f344422n = C76879j.m92723Q(baseLoginVoiceUI2, baseLoginVoiceUI2.getString(C0966R.string.a3h), BaseLoginVoiceUI.this.getString(C0966R.string.gda), true, true, new C114910a(a0Var));
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI$p */
    public class C114911p implements DialogInterface.OnDismissListener {
        public C114911p() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            BaseLoginVoiceUI.this.f344423o = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI$q */
    public class C114912q implements DialogInterface.OnClickListener {
        public C114912q(BaseLoginVoiceUI baseLoginVoiceUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI$r */
    public class C114913r implements DialogInterface.OnCancelListener {
        public C114913r(BaseLoginVoiceUI baseLoginVoiceUI) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: H7 */
    public static void m161811H7(BaseLoginVoiceUI baseLoginVoiceUI, int i) {
        Intent intent;
        baseLoginVoiceUI.f344412I[3] = 1;
        if (i != 7001) {
            switch (i) {
                case 7006:
                    intent = new Intent(baseLoginVoiceUI, LoginFaceUI.class);
                    break;
                case 7007:
                    intent = new Intent(baseLoginVoiceUI, LoginPasswordUI.class);
                    break;
                case 7008:
                    intent = new Intent(baseLoginVoiceUI, LoginSmsUI.class);
                    break;
                default:
                    intent = null;
                    break;
            }
        } else {
            intent = new Intent(baseLoginVoiceUI, LoginVoiceUI.class);
        }
        if (intent != null) {
            intent.putExtra("switch_login_wx_id", baseLoginVoiceUI.f344430v);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(baseLoginVoiceUI, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "jumpToOtherLogin", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            baseLoginVoiceUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(baseLoginVoiceUI, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "jumpToOtherLogin", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            MMHandlerThread.postToMainThreadDelayed(new C1482l(baseLoginVoiceUI), 300);
            C88990b.m111197f(baseLoginVoiceUI);
        }
    }

    /* renamed from: I7 */
    public static void m161812I7(BaseLoginVoiceUI baseLoginVoiceUI) {
        String string = baseLoginVoiceUI.getString(C0966R.string.lit);
        m161814Q7(baseLoginVoiceUI.getContext(), string + LocaleUtil.getApplicationLanguage());
    }

    /* renamed from: J7 */
    public static void m161813J7(BaseLoginVoiceUI baseLoginVoiceUI) {
        baseLoginVoiceUI.getClass();
        Intent intent = new Intent(baseLoginVoiceUI, LoginByMobileSendSmsUI.class);
        intent.putExtra("from_mobile", baseLoginVoiceUI.f344428t);
        intent.putExtra("switch_login_wx_id", baseLoginVoiceUI.f344430v);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(baseLoginVoiceUI, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "jumpToLoginSmsUp", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        baseLoginVoiceUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(baseLoginVoiceUI, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "jumpToLoginSmsUp", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: Q7 */
    public static void m161814Q7(Context context, String str) {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
        intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
        C88144b.m109791i(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: K7 */
    public void mo1423K7() {
        this.f344424p.f345162b = this.f344432x.trim();
    }

    /* renamed from: L7 */
    public final void mo174583L7() {
        Intent b = ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93169b(this);
        b.addFlags(67108864);
        if (Util.isNullOrNil(this.f344430v)) {
            b.putExtra("can_finish", true);
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(b);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
        C88990b.m111200i(this);
    }

    /* renamed from: M7 */
    public boolean mo174584M7(int i, int i2, String str) {
        C77398g gVar;
        String str2;
        Class cls = C11502f.class;
        if (i == 4) {
            if (i2 != -2023) {
                if (i2 == -205) {
                    Log.m105925i("MicroMsg.LoginHistoryUI", "summerphone MM_ERR_QQ_OK_NEED_MOBILE authTicket[%s], closeShowStyle[%s]", Util.secPrint(this.f344426r), this.f344429u);
                    C115135m0.f345161i = this.f344424p;
                    Intent intent = new Intent();
                    intent.putExtra("auth_ticket", this.f344426r);
                    intent.putExtra("binded_mobile", this.f344428t);
                    intent.putExtra("close_safe_device_style", this.f344429u);
                    intent.putExtra("from_source", 2);
                    ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93189v(this, intent);
                    return true;
                } else if (i2 == -140) {
                    if (!Util.isNullOrNil(this.f344425q)) {
                        C13665i0.m12972e(this, str, this.f344425q);
                    }
                    return true;
                } else if (i2 != -100) {
                    if (i2 == -75) {
                        C13665i0.m12971d(this);
                        return true;
                    } else if (i2 != -72) {
                        if (i2 != -9) {
                            if (i2 != -6) {
                                if (i2 == -3) {
                                    if (this.f344414K < 1) {
                                        C76879j.m92738i(this, C0966R.string.cbm, C0966R.string.gcw);
                                        this.f344414K++;
                                    } else {
                                        C76879j.m92707A(this, getString(C0966R.string.cbn), getString(C0966R.string.gcw), getString(C0966R.string.cbo), getString(C0966R.string.f7926wf), new C114905k(), new C114906l());
                                    }
                                    return true;
                                } else if (i2 != -1) {
                                    if (!(i2 == -311 || i2 == -310)) {
                                        if (i2 == -33) {
                                            C76879j.m92742m(this, C0966R.string.al9, C0966R.string.ale, new C114908n(this));
                                            return true;
                                        } else if (i2 == -32) {
                                            C76879j.m92749t(this, getString(C0966R.string.ala), "", new C114907m(this));
                                            return true;
                                        }
                                    }
                                } else if (C86709a0.m107524d().mo123467m() == 5) {
                                    C76879j.m92738i(this, C0966R.string.h7_, C0966R.string.h79);
                                    return true;
                                }
                            }
                            C86709a0.m107524d().mo123455a(701, this);
                            C86709a0.m107524d().mo123455a(252, this);
                            if (this.f344423o == null) {
                                C115135m0 m0Var = this.f344424p;
                                this.f344423o = SecurityImage.C116047a.m163296a(this, C0966R.string.hyo, m0Var.f345168h, m0Var.f345167g, m0Var.f345165e, m0Var.f345166f, new C114909o(i), (DialogInterface.OnCancelListener) null, new C114911p(), m0Var);
                            } else {
                                Log.m105918d("MicroMsg.LoginHistoryUI", "imgSid:" + this.f344424p.f345165e + " img len" + this.f344424p.f345167g.length + " " + C76861g.m92660c());
                                SecurityImage securityImage = this.f344423o;
                                C115135m0 m0Var2 = this.f344424p;
                                securityImage.mo177230b(m0Var2.f345168h, m0Var2.f345167g, m0Var2.f345165e, m0Var2.f345166f);
                            }
                            return true;
                        }
                        C76879j.m92738i(this, C0966R.string.gcv, C0966R.string.gcw);
                        return true;
                    } else {
                        C76879j.m92738i(this, C0966R.string.hyb, C0966R.string.a3h);
                        return true;
                    }
                }
            }
            C86718e.m107550n();
            C86709a0.m107523b();
            if (TextUtils.isEmpty(C86718e.f251747w)) {
                str2 = C76577a.m92166q(this, C0966R.string.gmc);
            } else {
                C86709a0.m107523b();
                str2 = C86718e.f251747w;
            }
            C76879j.m92719M(this, str2, getString(C0966R.string.a3h), new C114912q(this), new C114913r(this));
            return true;
        }
        if (((C11502f) C86312j.m106911c(cls)).mo11461Sr().mo93163uP(this, i, i2, str)) {
            SecurityImage securityImage2 = this.f344423o;
            if (!(securityImage2 == null || (gVar = securityImage2.f348170n) == null)) {
                gVar.dismiss();
                securityImage2.f348170n = null;
            }
            return true;
        }
        return this.f344405B.mo107842c(this, new C77701p0(i, i2, str));
    }

    /* renamed from: N7 */
    public final void mo174585N7(String str) {
        Log.m105925i("MicroMsg.LoginHistoryUI", "requestSms %s", str);
        if (!Util.isNullOrNil(str)) {
            C67216a aVar = new C67216a(str, 16, "", 0, "");
            C86709a0.m107524d().mo123460f(aVar);
            this.f344422n = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, new C114899e(this, aVar));
        }
    }

    /* renamed from: O7 */
    public boolean mo1424O7() {
        return !WeChatBrands.Business.Entries.MeSetSecurityVoicePrint.banned();
    }

    /* renamed from: P7 */
    public final void mo174586P7(C114735a0 a0Var) {
        Log.m105925i("MicroMsg.LoginHistoryUI", "checktask LoginHistoryUI startLauncher 0x%x, stack: %s", Integer.valueOf(hashCode()), Util.getStack());
        Intent b = ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93169b(this);
        b.addFlags(67108864);
        if (a0Var != null) {
            b.putExtra("kstyle_show_bind_mobile_afterauth", a0Var.mo174361q1());
            b.putExtra("kstyle_bind_recommend_show", a0Var.mo174362r1());
            b.putExtra("kstyle_bind_wording", a0Var.mo174363s1());
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(b);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "startLauncher", "(Lcom/tencent/mm/modelsimple/NetSceneManualAuth;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "startLauncher", "(Lcom/tencent/mm/modelsimple/NetSceneManualAuth;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    public void hideVKB() {
        View currentFocus;
        IBinder windowToken;
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        if (inputMethodManager != null && (currentFocus = getCurrentFocus()) != null && (windowToken = currentFocus.getWindowToken()) != null) {
            inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        }
    }

    public void initView() {
        String str;
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.laz);
        String stringExtra = getIntent().getStringExtra("switch_login_wx_id");
        this.f344430v = stringExtra;
        if (!Util.isNullOrNil(stringExtra)) {
            this.f344432x = C75593t5.f222075c.mo105941d(this.f344430v, "login_user_name");
            this.f344434z = C75593t5.f222075c.mo105941d(this.f344430v, "last_avatar_path");
            int safeParseInt = Util.safeParseInt(C75593t5.f222075c.mo105941d(this.f344430v, "last_bind_info"));
            this.f344410G = safeParseInt;
            if ((safeParseInt & 1) != 0) {
                this.f344427s = C75593t5.f222075c.mo105941d(this.f344430v, "last_login_bind_qq");
            }
            if ((this.f344410G & 4) != 0) {
                this.f344428t = C75593t5.f222075c.mo105941d(this.f344430v, "last_login_bind_mobile");
            }
            this.f344409F = Util.safeParseInt(C75593t5.f222075c.mo105941d(this.f344430v, "last_login_use_voice"));
            setBackBtn(new C1401s(), C0966R.raw.actionbar_icon_close_black);
        } else {
            this.f344432x = C7624i3.f25910c.mo19a("login_user_name", "");
            this.f344433y = C7624i3.f25910c.mo19a("last_login_nick_name", "");
            this.f344434z = C7624i3.f25910c.mo19a("last_avatar_path", "");
            int safeParseInt2 = Util.safeParseInt(C7624i3.f25910c.mo19a("last_bind_info", ""));
            this.f344410G = safeParseInt2;
            if ((safeParseInt2 & 1) != 0) {
                this.f344427s = C7624i3.f25910c.mo19a("last_login_bind_qq", "");
            }
            if ((this.f344410G & 4) != 0) {
                this.f344428t = C7624i3.f25910c.mo19a("last_login_bind_mobile", "");
            }
            this.f344409F = Util.safeParseInt(C7624i3.f25910c.mo19a("last_login_use_voice", ""));
        }
        String stringExtra2 = getIntent().getStringExtra("email_address");
        if (!Util.isNullOrNil(stringExtra2) && !stringExtra2.equalsIgnoreCase(this.f344432x)) {
            this.f344432x = stringExtra2;
        }
        this.f344431w = (ImageView) findViewById(C0966R.C0970id.fhr);
        if (!Util.isNullOrNil(this.f344434z)) {
            try {
                Bitmap Wd0 = ((C76708i) C86312j.m106911c(C76708i.class)).Wd0(this.f344434z, (String) null);
                if (Wd0 != null && Wd0.getWidth() > 10) {
                    this.f344431w.setImageBitmap(Bitmap.createBitmap(Wd0, 5, 5, Wd0.getWidth() - 10, Wd0.getHeight() - 10, (Matrix) null, false));
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.LoginHistoryUI", e, "get avatar error", new Object[0]);
            }
        }
        this.f344415d = (TextView) findViewById(C0966R.C0970id.g5g);
        this.f344417f = findViewById(C0966R.C0970id.g6i);
        this.f344416e = (Button) findViewById(C0966R.C0970id.g5z);
        this.f344406C = (Button) findViewById(C0966R.C0970id.g5j);
        this.f344418g = (Button) findViewById(C0966R.C0970id.g65);
        this.f344419h = (Button) findViewById(C0966R.C0970id.g66);
        this.f344420i = findViewById(C0966R.C0970id.eex);
        this.f344421j = (Button) findViewById(C0966R.C0970id.g6a);
        this.f344418g.setOnClickListener(new C1402t());
        this.f344419h.setOnClickListener(new C1403u());
        if (!LocaleUtil.isSimplifiedChineseAppLang()) {
            View view = this.f344420i;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view3 = this.f344417f;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f344416e.setVisibility(8);
        if (!Util.isPhoneNumber(this.f344432x).booleanValue() || this.f344432x.equals(this.f344427s)) {
            this.f344412I[2] = 2;
            if (!Util.isNullOrNil(this.f344433y)) {
                this.f344415d.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(getContext(), this.f344433y));
            } else {
                this.f344415d.setText(this.f344432x);
            }
        } else {
            this.f344412I[2] = 1;
            TextView textView = this.f344415d;
            String str2 = this.f344432x;
            PhoneFormater phoneFormater = new PhoneFormater();
            if (this.f344432x.startsWith("+")) {
                str2 = str2.replace("+", "");
                str = PhoneFormater.extractCountryCode(str2);
                if (str != null) {
                    str2 = str2.substring(str.length());
                }
            } else {
                str = "86";
            }
            textView.setText(phoneFormater.formatNumber(str, str2));
        }
        C77407n nVar = new C77407n((Context) this, 1, false);
        nVar.f225771i = new C1404v(this);
        nVar.f225782p = new C1405w();
        nVar.f225761d = new C1406x(this);
        if (Util.isNullOrNil(this.f344430v)) {
            this.f344421j.setOnClickListener(new C1397a(nVar));
        } else if (!LocaleUtil.isSimplifiedChineseAppLang()) {
            this.f344421j.setText(C0966R.string.lip);
            this.f344421j.setOnClickListener(new C1398b());
        } else {
            this.f344421j.setText(C0966R.string.lis);
            this.f344421j.setOnClickListener(new C1399c());
        }
        setMMTitle("");
        setActionbarColor(getResources().getColor(C0966R.color.a7_));
        hideActionbarLine();
        setBackBtnVisible(false);
        if (ChannelUtil.shouldShowGprsAlert) {
            ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93143Kn(this);
        }
        if (BuildInfo.EX_DEVICE_LOGIN || C85875k4.m106210y() || C85875k4.m106157N()) {
            this.f344406C.setVisibility(0);
            if (C85875k4.m106210y() && !C85875k4.m106157N()) {
                this.f344406C.setText(getResources().getString(C0966R.string.f360971gd1));
            } else if (C85875k4.m106157N()) {
                this.f344406C.setText(getResources().getString(C0966R.string.f0x));
            } else {
                this.f344406C.setText(getResources().getString(C0966R.string.gby));
            }
            this.f344406C.setOnClickListener(new C1400d());
        }
        if (WeChatBrands.Business.Entries.LoginPasswordReset.banned()) {
            this.f344418g.setVisibility(8);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Bundle bundleExtra;
        super.onActivityResult(i, i2, intent);
        Object[] objArr = new Object[3];
        int i3 = 0;
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Boolean.valueOf(intent == null);
        Log.m105919d("MicroMsg.LoginHistoryUI", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", objArr);
        if (i != 1024 || intent == null) {
            if (i != 1025 || intent == null) {
                if (i == 31685 && intent != null && i2 == -1 && (bundleExtra = intent.getBundleExtra("result_data")) != null && bundleExtra.getString("go_next", "").equals("auth_again")) {
                    mo1423K7();
                }
            } else if (i2 == 2) {
                String stringExtra = intent.getStringExtra("KFaceLoginAuthPwd");
                Object[] objArr2 = new Object[2];
                objArr2[0] = Boolean.valueOf(Util.isNullOrNil(stringExtra));
                if (!Util.isNullOrNil(stringExtra)) {
                    i3 = stringExtra.length();
                }
                objArr2[1] = Integer.valueOf(i3);
                Log.m105925i("MicroMsg.LoginHistoryUI", "hy: onActivityResult, do faceprint auth, authPwd is null:%b, authPwd.len:%d", objArr2);
                this.f344407D = stringExtra;
                mo1423K7();
            }
        } else if (i2 == -1) {
            String stringExtra2 = intent.getStringExtra("VoiceLoginAuthPwd");
            int intExtra = intent.getIntExtra("KVoiceHelpCode", 0);
            Object[] objArr3 = new Object[3];
            objArr3[0] = Boolean.valueOf(Util.isNullOrNil(stringExtra2));
            if (!Util.isNullOrNil(stringExtra2)) {
                i3 = stringExtra2.length();
            }
            objArr3[1] = Integer.valueOf(i3);
            objArr3[2] = Integer.valueOf(intExtra);
            Log.m105919d("MicroMsg.LoginHistoryUI", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d, lastErrCode:%d", objArr3);
            this.f344407D = stringExtra2;
            mo1423K7();
        }
    }

    public void onCreate(Bundle bundle) {
        Class cls = C11502f.class;
        super.onCreate(bundle);
        Log.m105925i("MicroMsg.LoginHistoryUI", "AccountSyncApplication.modelCallback %s", ((C11502f) C86312j.m106911c(cls)).mo11461Sr());
        ((C11502f) C86312j.m106911c(cls)).mo11461Sr().mo93150TO();
        this.f344404A = MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0);
        initView();
        this.f344405B = new C77687b();
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.LoginHistoryUI", "onDestroy");
        C86709a0.m107524d().mo123470p(701, this);
        C86709a0.m107524d().mo123470p(252, this);
        C77687b bVar = this.f344405B;
        if (bVar != null) {
            bVar.mo107840a();
        }
        C115669n.INSTANCE.mo160131h(14262, Integer.valueOf(this.f344412I[0]), Integer.valueOf(this.f344412I[1]), Integer.valueOf(this.f344412I[2]), Integer.valueOf(this.f344412I[3]), Integer.valueOf(this.f344412I[4]));
        ProgressDialog progressDialog = this.f344422n;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f344422n = null;
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            mo174583L7();
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onPause() {
        super.onPause();
        this.f344413J.dead();
    }

    public void onResume() {
        super.onResume();
        ArrayList arrayList = new ArrayList();
        if (!(!mo1424O7() || this.f344411H == 1 || (this.f344409F & 131072) == 0)) {
            C76875f0 f0Var = new C76875f0(this, 7001, 0);
            f0Var.f224723r = C0966R.string.gd9;
            arrayList.add(f0Var);
        }
        if (!(this.f344411H == 5 || (this.f344409F & 262144) == 0)) {
            C76875f0 f0Var2 = new C76875f0(this, 7005, 0);
            f0Var2.f224723r = C0966R.string.gd6;
            arrayList.add(f0Var2);
        }
        if (!Util.isNullOrNil(this.f344432x)) {
            if (this.f344411H != 2) {
                C76875f0 f0Var3 = new C76875f0(this, 7007, 0);
                f0Var3.f224717i = getString(C0966R.string.gd7);
                arrayList.add(f0Var3);
            }
            if (!Util.isNullOrNil(this.f344428t) && this.f344411H != 3) {
                C76875f0 f0Var4 = new C76875f0(this, 7008, 0);
                f0Var4.f224717i = getString(C0966R.string.gd8);
                arrayList.add(f0Var4);
            }
        }
        if (arrayList.size() > 1) {
            C77407n nVar = new C77407n((Context) this, 1, false);
            nVar.f225771i = new C40422g(this, arrayList);
            nVar.f225782p = new C40423h(this);
            nVar.f225761d = new C115127i(this);
            this.f344416e.setVisibility(0);
            this.f344416e.setText(C0966R.string.gcg);
            this.f344416e.setOnClickListener(new C1479j(this, nVar));
        } else if (arrayList.size() > 0) {
            this.f344416e.setVisibility(0);
            this.f344416e.setText(((C76875f0) arrayList.get(0)).getTitle());
            this.f344416e.setOnClickListener(new C40424k(this, arrayList));
        } else {
            this.f344416e.setVisibility(8);
        }
        this.f344413J.alive();
        C86709a0.m107523b();
        C86718e.m107553z();
        if (C86709a0.m107522a() && C86709a0.m107523b().f251765p && !this.f344432x.equals("")) {
            ProgressDialog progressDialog = this.f344422n;
            if (progressDialog == null || !progressDialog.isShowing()) {
                mo174586P7((C114735a0) null);
            }
        } else if (C87743a.m109162a() == 2) {
            C77389a aVar = new C77389a();
            aVar.f225644a = C0086a.m38a(this).getString(C0966R.string.bcy);
            aVar.f225660q = getString(C0966R.string.bcx);
            aVar.f225668y = false;
            aVar.f225663t = C0086a.m38a(this).getString(C0966R.string.bcv);
            aVar.f225620C = new C68504m(this);
            C77398g gVar = new C77398g(this, C0966R.style.a66);
            gVar.mo107525e(aVar);
            gVar.show();
            PreferenceManager.getDefaultSharedPreferences(this).edit().putLong("db_check_tip_time", System.currentTimeMillis()).commit();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z;
        Log.m105924i("MicroMsg.LoginHistoryUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
        StringBuilder sb = new StringBuilder();
        sb.append("Scene Type ");
        sb.append(yVar.getType());
        Log.m105924i("MicroMsg.LoginHistoryUI", sb.toString());
        if (yVar.getType() == 145) {
            ProgressDialog progressDialog = this.f344422n;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f344422n.dismiss();
                this.f344422n = null;
            }
            C67216a aVar = (C67216a) yVar;
            int f = aVar.mo91368f();
            if (f == 13) {
                if (i2 == -36) {
                    C7660a a = C7660a.m7782a(str);
                    if (aVar.mo91372j1() == 1) {
                        Log.m105924i("MicroMsg.LoginHistoryUI", "login check state, sms up");
                        if (a != null) {
                            a.mo8792b(this, new C114900f(), (DialogInterface.OnClickListener) null);
                            return;
                        }
                        C76879j.m92750u(this, getString(C0966R.string.gcl), "", new C114901g(), (DialogInterface.OnClickListener) null);
                    } else if (a != null) {
                        a.mo8792b(this, new C114902h(), (DialogInterface.OnClickListener) null);
                        return;
                    } else {
                        mo174585N7(this.f344428t);
                    }
                }
            } else if (f == 16) {
                if (i2 == -41) {
                    C76879j.m92738i(this, C0966R.string.hx6, C0966R.string.hx7);
                    return;
                } else if (i2 == -75) {
                    C76879j.m92748s(this, getString(C0966R.string.f7560jn), "");
                    return;
                } else if (i2 == -106) {
                    C13665i0.m12970c(this, str, 32045);
                    return;
                }
            } else if (f == 17) {
                if (i == 0 && i2 == 0) {
                    new C115203z0(new C114903i(), aVar.getUsername(), aVar.mo91380q1(), this.f344428t).mo174958b(this);
                    return;
                } else if (!mo174584M7(i, i2, str)) {
                    C7660a a2 = C7660a.m7782a(str);
                    if (a2 != null) {
                        a2.mo8792b(this, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
                    }
                } else {
                    return;
                }
            }
        } else if (yVar.getType() == 252 || yVar.getType() == 701) {
            C114735a0 a0Var = (C114735a0) yVar;
            this.f344425q = a0Var.mo174354j1();
            Log.m105920e("MicroMsg.LoginHistoryUI", "url " + this.f344425q);
            C86709a0.m107524d().mo123470p(701, this);
            C86709a0.m107524d().mo123470p(252, this);
            this.f344424p.f345168h = a0Var.mo174360p1();
            this.f344424p.f345165e = a0Var.mo174359o1();
            this.f344424p.f345167g = a0Var.mo174357m1();
            this.f344424p.f345166f = a0Var.mo174358n1();
            if (i2 == -205) {
                this.f344426r = a0Var.mo174355k1();
                this.f344428t = a0Var.mo174364t1();
                this.f344429u = a0Var.mo174356l1();
            }
            if (i == 4 && (i2 == -16 || i2 == -17)) {
                C86709a0.m107524d().mo123460f(new C75576f4(new C114904j(this), (String) null));
                z = true;
            } else {
                z = false;
            }
            if (z || (i == 0 && i2 == 0)) {
                C86718e.m107546E();
                C13665i0.m12968a(this, this.f344424p.f345162b);
                ProgressDialog progressDialog2 = this.f344422n;
                if (progressDialog2 != null && progressDialog2.isShowing()) {
                    this.f344422n.setMessage(getString(C0966R.string.f360085a04));
                }
                mo174586P7(a0Var);
                if (C85875k4.m106157N() || C85875k4.m106210y()) {
                    FoldingPhoneLoginTypeStruct foldingPhoneLoginTypeStruct = new FoldingPhoneLoginTypeStruct();
                    foldingPhoneLoginTypeStruct.f107894d = 2;
                    foldingPhoneLoginTypeStruct.mo86054n();
                }
                if (this.f344411H == 3) {
                    this.f344408E = a0Var.mo174368x1();
                    if (a0Var.mo174365u1()) {
                        boolean z2 = this.f344408E;
                        Intent intent = new Intent(this, RegByMobileSetPwdUI.class);
                        intent.putExtra("kintent_hint", getString(C0966R.string.iul));
                        intent.putExtra("kintent_cancelable", z2);
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(intent);
                        C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "goToSetIndepPwd", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((Intent) aVar2.mo10231a(0));
                        C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "goToSetIndepPwd", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return;
                    }
                    return;
                }
                return;
            }
            ProgressDialog progressDialog3 = this.f344422n;
            if (progressDialog3 != null && progressDialog3.isShowing()) {
                this.f344422n.dismiss();
                this.f344422n = null;
            }
            if (i2 == -106) {
                C13665i0.m12970c(this, str, 31685);
                return;
            } else if (i2 == -217) {
                C13665i0.m12973f(this, C118276e.m166845a(a0Var), i2);
                return;
            } else if (!mo174584M7(i, i2, str)) {
                C7660a a3 = C7660a.m7782a(str);
                if (a3 == null || !a3.mo8792b(this, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null)) {
                    Toast.makeText(this, getString(C0966R.string.ey_, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        mo174584M7(i, i2, str);
    }

    public void setRequestedOrientation(int i) {
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C14858a.class);
    }
}
