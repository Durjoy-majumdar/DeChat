package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import bg0.C67236j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.keyboard.WcPayKeyboard;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import d62.C75339i;
import di3.C86312j;
import g63.C45890a;
import hp3.C87581a;
import j20.C117292a;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import lp3.C88633e;
import lp3.C88643g;
import ob0.C117747y;
import p196ln.C76705f;
import p629ny.C76979h;
import qo3.C77426q;
import te3.C51181s;
import yf0.C79090a;
import yf0.C79104i;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.aa.ui.AARemittanceUI */
public class AARemittanceUI extends BaseAAPresenterActivity {

    /* renamed from: K */
    public static final /* synthetic */ int f195955K = 0;

    /* renamed from: A */
    public String f195956A;

    /* renamed from: B */
    public String f195957B;

    /* renamed from: C */
    public String f195958C;

    /* renamed from: D */
    public long f195959D;

    /* renamed from: E */
    public String f195960E;

    /* renamed from: F */
    public String f195961F;

    /* renamed from: G */
    public Dialog f195962G = null;

    /* renamed from: H */
    public C67236j f195963H = ((C67236j) this.f196016e.mo136940b(this, C67236j.class));

    /* renamed from: I */
    public int f195964I = 0;

    /* renamed from: J */
    public Runnable f195965J = new C68174a();

    /* renamed from: g */
    public int f195966g;

    /* renamed from: h */
    public ScrollView f195967h;

    /* renamed from: i */
    public WcPayKeyboard f195968i;

    /* renamed from: j */
    public TextView f195969j;

    /* renamed from: n */
    public ImageView f195970n;

    /* renamed from: o */
    public WalletFormView f195971o;

    /* renamed from: p */
    public RelativeLayout f195972p;

    /* renamed from: q */
    public TextView f195973q;

    /* renamed from: r */
    public RelativeLayout f195974r;

    /* renamed from: s */
    public LinearLayout f195975s;

    /* renamed from: t */
    public TextView f195976t;

    /* renamed from: u */
    public TextView f195977u;

    /* renamed from: v */
    public TextView f195978v;

    /* renamed from: w */
    public double f195979w;

    /* renamed from: x */
    public String f195980x = "";

    /* renamed from: y */
    public String f195981y;

    /* renamed from: z */
    public String f195982z;

    /* renamed from: com.tencent.mm.plugin.aa.ui.AARemittanceUI$a */
    public class C68174a implements Runnable {
        public C68174a() {
        }

        public void run() {
            AARemittanceUI aARemittanceUI = AARemittanceUI.this;
            if (aARemittanceUI.f195964I == 2 && aARemittanceUI.isHandleAutoShowNormalStWcKb()) {
                AARemittanceUI.this.showNormalStWcKb();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.AARemittanceUI$b */
    public class C68175b implements C87581a<Void, Void> {
        public C68175b(AARemittanceUI aARemittanceUI) {
        }

        public Object call(Object obj) {
            Void voidR = (Void) obj;
            Log.m105924i("MicroMsg.AARemittanceUI", "insert msg finish");
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.AARemittanceUI$c */
    public class C68176c implements C7092q.C7093a {
        public C68176c() {
        }

        public void onClick(View view) {
            AARemittanceUI.m80588I7(AARemittanceUI.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.AARemittanceUI$d */
    public class C68177d implements C7092q.C7093a {
        public C68177d() {
        }

        public void onClick(View view) {
            AARemittanceUI.m80588I7(AARemittanceUI.this);
        }
    }

    /* renamed from: I7 */
    public static void m80588I7(AARemittanceUI aARemittanceUI) {
        aARemittanceUI.getClass();
        C119179t tVar = C119157j.f356862d;
        C68331s sVar = new C68331s(aARemittanceUI);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(sVar, 300, false);
        AARemittanceUI aARemittanceUI2 = aARemittanceUI;
        C45890a.m51175a(aARemittanceUI2, aARemittanceUI.getString(C0966R.string.f7314ch), aARemittanceUI.f195980x, aARemittanceUI.getString(C0966R.string.hzs), true, 20, new C68334t(aARemittanceUI), new C68342u(aARemittanceUI));
    }

    /* renamed from: J7 */
    public static void m80589J7(AARemittanceUI aARemittanceUI, C51181s sVar) {
        boolean z = aARemittanceUI.getIntent().getIntExtra("enter_scene", 0) == 1;
        String str = sVar.f141238f;
        aARemittanceUI.f195956A = sVar.f141239g;
        aARemittanceUI.f195957B = sVar.f141241i;
        aARemittanceUI.f195958C = sVar.f141243n;
        C79104i.m95672q(aARemittanceUI, str, z, sVar.f141240h, aARemittanceUI.f195981y, aARemittanceUI.f195960E, 233);
    }

    /* renamed from: K7 */
    public static void m80590K7(AARemittanceUI aARemittanceUI, String str) {
        aARemittanceUI.getClass();
        Log.m105925i("MicroMsg.AARemittanceUI", "showErrorDialog,errMsg:%s", str);
        C77426q qVar = new C77426q(aARemittanceUI.getContext());
        qVar.mo107606r("");
        qVar.mo107595g(str);
        qVar.mo107589a(true);
        qVar.mo107601m(C0966R.string.g47);
        qVar.mo107600l(new C68327r(aARemittanceUI));
        qVar.mo107603o();
    }

    /* renamed from: L7 */
    public void mo93737L7(int i, Intent intent) {
        if (i == -1) {
            Log.m105925i("MicroMsg.AARemittanceUI", "pay success, payMsgId: %s", this.f195956A);
            RealnameGuideHelper realnameGuideHelper = (RealnameGuideHelper) intent.getParcelableExtra("key_realname_guide_helper");
            if (realnameGuideHelper != null) {
                Log.m105924i("MicroMsg.AARemittanceUI", "do realname guide");
                Intent intent2 = new Intent();
                intent2.putExtra("key_realname_guide_helper", realnameGuideHelper);
                C88144b.m109791i(this, "wallet_core", ".id_verify.RealnameDialogActivity", intent2, (Bundle) null);
            }
            C79104i.m95657b(this.f195960E);
            setResult(-1);
            finish();
            C67236j.C28311e eVar = this.f195963H.f193068d;
            String str = this.f195956A;
            String str2 = this.f195981y;
            String str3 = this.f195957B;
            eVar.getClass();
            ((C88633e) C88643g.m110549g(str, str2, str3)).mo123061d(eVar).mo123062e(new C68175b(this));
            C115669n.INSTANCE.idkeyStat(407, 12, 1, false);
            String stringExtra = intent.getStringExtra("key_trans_id");
            C67236j.C67239c cVar = this.f195963H.f193069e;
            long j = this.f195959D;
            String str4 = this.f195958C;
            cVar.getClass();
            ((C88633e) C88643g.m110549g(Long.valueOf(j), str4, stringExtra)).mo123061d(cVar);
            return;
        }
        hideLoading();
    }

    /* renamed from: M7 */
    public final void mo93738M7() {
        int b = C76577a.m92151b(getContext(), 16);
        int b2 = C76577a.m92151b(getContext(), 0);
        int b3 = C76577a.m92151b(getContext(), 0);
        int b4 = C76577a.m92151b(getContext(), 4);
        if (Util.isNullOrNil(this.f195980x)) {
            String string = !Util.isNullOrNil(this.f195961F) ? getString(C0966R.string.mui) : getString(C0966R.string.f7314ch);
            C75228t.m90253j0(this.f195978v, string, 0, string.length(), new C7092q((C7092q.C7093a) new C68176c(), true), getContext());
            this.f195978v.setVisibility(0);
            C85875k4.m106193l0(this.f195978v.getPaint());
            this.f195977u.setVisibility(8);
        } else {
            String string2 = getString(C0966R.string.hh6);
            String string3 = getString(C0966R.string.bgb, new Object[]{this.f195980x, string2});
            SpannableString T1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this, string3);
            C75228t.m90253j0(this.f195977u, string3, T1.length() - string2.length(), T1.length(), new C7092q((C7092q.C7093a) new C68177d(), true), getContext());
            this.f195977u.setVisibility(0);
            C85875k4.m106193l0(this.f195977u.getPaint());
            this.f195978v.setVisibility(8);
        }
        if (!Util.isNullOrNil(this.f195961F)) {
            this.f195976t.setVisibility(0);
            this.f195976t.setText(this.f195961F);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f195975s.getLayoutParams();
            layoutParams.removeRule(3);
            layoutParams.addRule(3, C0966R.C0970id.lzo);
            this.f195978v.setPadding(b2, b4, b, b);
            this.f195977u.setPadding(b2, b4, b, b);
            return;
        }
        this.f195976t.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f195975s.getLayoutParams();
        layoutParams2.removeRule(3);
        layoutParams2.addRule(3, C0966R.C0970id.lh9);
        this.f195978v.setPadding(b2, b3, b, b);
        this.f195977u.setPadding(b2, b3, b, b);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6267a5;
    }

    public void hideLoading() {
        Dialog dialog = this.f195962G;
        if (dialog != null && dialog.isShowing()) {
            this.f195962G.dismiss();
            this.f195962G = null;
        }
    }

    public void initView() {
        super.initView();
        this.f195967h = (ScrollView) findViewById(C0966R.C0970id.iwq);
        this.f195968i = (WcPayKeyboard) findViewById(C0966R.C0970id.lrk);
        this.f195969j = (TextView) findViewById(C0966R.C0970id.f5284aw);
        this.f195970n = (ImageView) findViewById(C0966R.C0970id.f5281at);
        this.f195971o = (WalletFormView) findViewById(C0966R.C0970id.f5283av);
        this.f195972p = (RelativeLayout) findViewById(C0966R.C0970id.lh8);
        this.f195973q = (TextView) findViewById(C0966R.C0970id.lha);
        this.f195974r = (RelativeLayout) findViewById(C0966R.C0970id.lh6);
        int intExtra = getIntent().getIntExtra("amount_remind_bit", 4);
        if (LocaleUtil.getApplicationLanguage().equals("zh_CN") || LocaleUtil.getApplicationLanguage().equals("zh_TW") || LocaleUtil.getApplicationLanguage().equals("zh_HK")) {
            this.f195972p.post(new C68298l(this));
            this.f195971o.setmWalletFormViewListener(new C68301m(this, intExtra));
        } else {
            this.f195974r.setVisibility(8);
        }
        this.f195968i.mo104740e();
        this.f195968i.setActionText(getString(C0966R.string.f7313cg));
        ((RelativeLayout.LayoutParams) this.f195968i.getLayoutParams()).addRule(12);
        this.f195968i.mo104738c(false);
        setWPKeyboard(this.f195971o.getContentEt(), true, false);
        this.f195971o.setmContentAbnormalMoneyCheck(true);
        this.f195971o.post(new C68295k(this));
        C75228t.m90251i0(this.f195971o.getContentEt());
        this.f195971o.getContentEt().setOnEditorActionListener(new C68350x(this, new C68348w(this)));
        this.f195971o.mo105069a(new C68352y(this));
        this.f195971o.mo105097o(7, 2);
        this.f195976t = (TextView) findViewById(C0966R.C0970id.lzo);
        this.f195975s = (LinearLayout) findViewById(C0966R.C0970id.f5279ar);
        this.f195977u = (TextView) findViewById(C0966R.C0970id.f359066im2);
        this.f195978v = (TextView) findViewById(C0966R.C0970id.f5597je);
        mo93738M7();
        setMMTitle("");
        hideActionbarLine();
        this.f195967h.setOnTouchListener(new C68345v(this));
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(this.f195970n, this.f195981y);
        String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(this.f195981y);
        String string = getString(C0966R.string.guk, new Object[]{this.f195982z});
        TextView textView = this.f195969j;
        textView.setText(displayName + string);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.lh5);
        if (C85875k4.m106211z()) {
            View findViewById = findViewById(C0966R.C0970id.lh_);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/aa/ui/AARemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/aa/ui/AARemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById2 = findViewById(C0966R.C0970id.lh7);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/aa/ui/AARemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/aa/ui/AARemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setBackgroundResource(C0966R.C0969drawable.cf7);
            return;
        }
        View findViewById3 = findViewById(C0966R.C0970id.lh_);
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(0);
        C117292a.m165358d(findViewById3, aVar3.mo10232b(), "com/tencent/mm/plugin/aa/ui/AARemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById3, "com/tencent/mm/plugin/aa/ui/AARemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById4 = findViewById(C0966R.C0970id.lh7);
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(8);
        View view3 = findViewById4;
        C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/aa/ui/AARemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/aa/ui/AARemittanceUI", "initOtherView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        imageView.setBackgroundResource(C0966R.C0969drawable.cf6);
    }

    public boolean isHandleAutoShowNormalStWcKb() {
        return this.f195968i.mo104746j();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 233) {
            mo93737L7(i2, intent);
        } else if (i == 222 && i2 == -1) {
            String stringExtra = intent.getStringExtra("Select_Conv_User");
            Log.m105925i("MicroMsg.AARemittanceUI", "select chatroom：%s", stringExtra);
            if (!Util.isNullOrNil(stringExtra)) {
                Intent intent2 = new Intent(getContext(), LaunchAAUI.class);
                intent2.putExtra("enter_scene", 3);
                intent2.putExtra("chatroom_name", stringExtra);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent2);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/aa/ui/AARemittanceUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/aa/ui/AARemittanceUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f195981y = getIntent().getStringExtra("user_name");
        this.f195982z = getIntent().getStringExtra("user_real_name");
        this.f195960E = getIntent().getStringExtra("chatroom");
        this.f195961F = getIntent().getStringExtra("user_group_solitatire_content");
        initView();
        addSceneEndListener(2878);
        this.f195964I = 1;
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(2878);
    }

    public void onDialogDismiss(Dialog dialog) {
        Log.m105924i("MicroMsg.AARemittanceUI", "onDialogDismiss()");
        MMHandlerThread.postToMainThreadDelayed(this.f195965J, 300);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        WcPayKeyboard wcPayKeyboard = this.f195968i;
        if (wcPayKeyboard == null || !wcPayKeyboard.onKeyUp(i, keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.AARemittanceUI", "onPause()");
        if (!this.f195968i.mo104747k()) {
            this.f195964I = 3;
        }
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.AARemittanceUI", "onResume()");
        if (this.f195964I == 3 && isHandleAutoShowNormalStWcKb()) {
            showNormalStWcKb();
        }
        this.f195964I = 2;
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.AARemittanceUI", "errType:" + i + " errCode:" + i2 + " errMsg:" + str + " scenetype:" + yVar.getType());
        return false;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C79090a.class);
    }
}
