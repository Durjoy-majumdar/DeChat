package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import b63.C67203r0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.wallet.WalletIconImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75102b0;
import com.tencent.p014mm.wallet_core.model.C75140t0;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75217h;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import com.tenpay.C7112R;
import di3.C86312j;
import gr3.C76024a;
import hr3.C76241b;
import j20.C117292a;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import p281yz.C79173v;
import p910lj.C76701a;
import zt3.C119157j;
import zt3.C119179t;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletIdCardCheckUI */
public class WalletIdCardCheckUI extends WalletBaseUI implements WalletFormView.C75209c, TextView.OnEditorActionListener {

    /* renamed from: j */
    public static final /* synthetic */ int f208842j = 0;

    /* renamed from: d */
    public WalletFormView f208843d;

    /* renamed from: e */
    public TextView f208844e;

    /* renamed from: f */
    public TextView f208845f;

    /* renamed from: g */
    public Button f208846g;

    /* renamed from: h */
    public RelativeLayout f208847h;

    /* renamed from: i */
    public int f208848i = 1;

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletIdCardCheckUI$a */
    public class C71995a implements MenuItem.OnMenuItemClickListener {
        public C71995a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Log.m105924i("Micromsg.WalletIdCardCheckUI", "onbackbtn click");
            WalletIdCardCheckUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletIdCardCheckUI$b */
    public class C71996b extends C7089c0 {
        public C71996b() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            boolean z;
            WalletIdCardCheckUI walletIdCardCheckUI = WalletIdCardCheckUI.this;
            if (!walletIdCardCheckUI.f208843d.mo105070b(walletIdCardCheckUI.f208844e)) {
                walletIdCardCheckUI.f208844e.setText(C0966R.string.kp5);
                walletIdCardCheckUI.f208844e.setTextColor(walletIdCardCheckUI.getResources().getColor(C0966R.color.a_0));
                z = false;
            } else {
                z = true;
            }
            if (z) {
                walletIdCardCheckUI.f208844e.setVisibility(4);
            } else {
                C76879j.m92754y(walletIdCardCheckUI.getContext(), walletIdCardCheckUI.getContext().getString(C0966R.string.kp5), "", walletIdCardCheckUI.getContext().getString(C0966R.string.ktq), new C72042k(walletIdCardCheckUI));
            }
            walletIdCardCheckUI.f208844e.setVisibility(4);
            if (z) {
                WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct = new WCPaySaftyClickReportStruct();
                wCPaySaftyClickReportStruct.f194681d = 1;
                wCPaySaftyClickReportStruct.f194682e = 1;
                wCPaySaftyClickReportStruct.mo86054n();
                C115669n.INSTANCE.mo160131h(13731, 2);
                WalletIdCardCheckUI.this.doSceneProgress(new C75102b0(WalletIdCardCheckUI.this.f208843d.getText(), WalletIdCardCheckUI.this.f208848i, ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91335q(), C75140t0.m90124c().f221094f));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletIdCardCheckUI$c */
    public class C71997c implements C75217h {
        public C71997c() {
        }

        public void onVisibleStateChange(boolean z) {
            WalletIdCardCheckUI walletIdCardCheckUI = WalletIdCardCheckUI.this;
            int i = WalletIdCardCheckUI.f208842j;
            walletIdCardCheckUI.mKeyboard.post(new C72043l(walletIdCardCheckUI, z));
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletIdCardCheckUI$d */
    public class C71998d implements WalletFormView.C75211e {
        public C71998d() {
        }

        /* renamed from: a */
        public void mo93874a(CharSequence charSequence) {
            if (charSequence.length() > 0) {
                WalletIdCardCheckUI.this.f208846g.setEnabled(true);
            } else {
                WalletIdCardCheckUI.this.f208846g.setEnabled(false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletIdCardCheckUI$e */
    public class C71999e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Toast f208853d;

        public C71999e(Toast toast) {
            this.f208853d = toast;
        }

        public void run() {
            this.f208853d.cancel();
            WalletIdCardCheckUI.this.setResult(-1);
            WalletIdCardCheckUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletIdCardCheckUI$f */
    public static class C72000f extends MMBaseAccessibilityConfig {
        public C72000f(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
        }

        public void initConfig() {
            MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.ceb);
            root.disable(C0966R.C0970id.iwf);
            root.disable(C0966R.C0970id.f357557ah1);
            root.disable(C0966R.C0970id.f357556ah0);
            root.disable(C0966R.C0970id.f358436f34);
            root.disable(C0966R.C0970id.f359549lh0);
            root.disable(C0966R.C0970id.lj4);
            root.focusFirst(C0966R.C0970id.lg9);
            root.focusOrder().next(C0966R.C0970id.f7w).next(C0966R.C0970id.ljn).next(C0966R.C0970id.lg_).next(C0966R.C0970id.f359550lh1).next(C0966R.C0970id.f87).next(C0966R.C0970id.kh4).next(C7112R.C7115id.tenpay_keyboard_1).next(C7112R.C7115id.tenpay_keyboard_2).next(C7112R.C7115id.tenpay_keyboard_3).next(C7112R.C7115id.tenpay_keyboard_4).next(C7112R.C7115id.tenpay_keyboard_5).next(C7112R.C7115id.tenpay_keyboard_6).next(C7112R.C7115id.tenpay_keyboard_7).next(C7112R.C7115id.tenpay_keyboard_8).next(C7112R.C7115id.tenpay_keyboard_9).next(C7112R.C7115id.tenpay_keyboard_x).next(C7112R.C7115id.tenpay_keyboard_0).next(C7112R.C7115id.tenpay_keyboard_d).next(C0966R.C0970id.f5470g0);
            int b = C76577a.m92151b(getContext(), 24);
            root.view(C0966R.C0970id.f359550lh1).expand(b, b, b, b);
        }

        public void onResume() {
            super.onResume();
        }
    }

    public void forceCancel() {
        Log.m105918d("Micromsg.WalletIdCardCheckUI", "check pwd ");
        cleanScenes();
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ceb;
    }

    public void initView() {
        Class cls = C79173v.class;
        this.f208843d = (WalletFormView) findViewById(C0966R.C0970id.f358436f34);
        this.f208844e = (TextView) findViewById(C0966R.C0970id.f359546lg1);
        TextView textView = (TextView) findViewById(C0966R.C0970id.f359547lg2);
        this.f208847h = (RelativeLayout) findViewById(C0966R.C0970id.iwf);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.lg9);
        this.f208845f = textView2;
        C85875k4.m106189j0(textView2.getPaint(), 0.8f);
        this.f208843d.setOnInputValidChangeListener(this);
        this.f208843d.setOnEditorActionListener(this);
        int b = C76577a.m92151b(getContext(), 19);
        int b2 = C76577a.m92151b(getContext(), 8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(b, b);
        layoutParams.gravity = 17;
        layoutParams.rightMargin = b2;
        layoutParams.leftMargin = b2;
        this.f208843d.getInfoIv().setLayoutParams(layoutParams);
        this.f208843d.getInfoIv().setScaleType(ImageView.ScaleType.FIT_CENTER);
        WalletIconImageView infoIv = this.f208843d.getInfoIv();
        int color = getResources().getColor(C0966R.color.FG_2);
        infoIv.f212566u = C0966R.raw.icons_filled_close2;
        infoIv.f212567v = color;
        this.f208844e.setVisibility(4);
        this.f208846g = (Button) findViewById(C0966R.C0970id.f87);
        C76024a.m91324e(this.f208843d);
        setEditFocusListener(this.f208843d, 1, false, false, true);
        boolean z = false;
        this.f208843d.getContentEt().setSingleLine(false);
        EditText contentEt = this.f208843d.getContentEt();
        this.f208843d.getContentEt().setPadding(contentEt.getPaddingLeft(), contentEt.getPaddingTop(), contentEt.getPaddingLeft(), getBodyView().getPaddingBottom());
        View findViewById = findViewById(C0966R.C0970id.f359359kh1);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/pwd/ui/WalletIdCardCheckUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/wallet/pwd/ui/WalletIdCardCheckUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f208846g.setOnClickListener(new C71996b());
        this.f208848i = ((C79173v) C86312j.m106911c(cls)).Ex0().mo91333o();
        C67203r0 r0Var = ((C79173v) C86312j.m106911c(cls)).Ex0().f192953f;
        String str = r0Var != null ? r0Var.field_cre_name : "";
        Log.m105925i("Micromsg.WalletIdCardCheckUI", "mIdentityType %d %s", Integer.valueOf(this.f208848i), str);
        if (Util.isNullOrNil(str)) {
            str = ((C79173v) C86312j.m106911c(cls)).f232472d.mo91346b(this, this.f208848i);
        }
        WalletFormView walletFormView = this.f208843d;
        int i = this.f208848i;
        C76241b logicDelegate = walletFormView.getLogicDelegate();
        if (logicDelegate instanceof C76024a.C76033i) {
            ((C76024a.C76033i) logicDelegate).mo106242f(i);
        }
        this.f208843d.setTitleText(str);
        ViewGroup.LayoutParams layoutParams2 = this.f208843d.getTitleTv().getLayoutParams();
        layoutParams2.width = -2;
        this.f208843d.getTitleTv().setLayoutParams(layoutParams2);
        if (Util.isNullOrNil(this.f208843d.getText())) {
            this.f208846g.setEnabled(false);
        }
        this.f208843d.mo105071c();
        if (this.f208848i == 1) {
            setEditFocusListener(this.f208843d, 1, false, false, true);
        } else {
            setEditFocusListener(this.f208843d, 1, true);
        }
        this.f208843d.setHint(getString(C0966R.string.f361591l23, new Object[]{C75228t.m90229V(((C79173v) C86312j.m106911c(cls)).Ex0().mo91335q())}));
        setTenpayKBStateListener(new C71997c());
        if (this.mKeyboard.getVisibility() == 0) {
            z = true;
        }
        this.mKeyboard.post(new C72043l(this, z));
        this.f208843d.setmWalletFormViewListener(new C71998d());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        addSceneEndListener(1580);
        initView();
        setBackBtn(new C71995a());
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1580);
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return false;
    }

    public void onInputValidChange(boolean z) {
        this.f208844e.setVisibility(4);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        View view = this.mKBLayout;
        if (view == null || !view.isShown()) {
            return super.onKeyUp(i, keyEvent);
        }
        View view2 = this.mKBLayout;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/pwd/ui/WalletIdCardCheckUI", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/wallet/pwd/ui/WalletIdCardCheckUI", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }

    public void onPause() {
        super.onPause();
    }

    public boolean onPreSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105918d("Micromsg.WalletIdCardCheckUI", " errCode: " + i2 + " errMsg :" + str);
        if (i != 0 || i2 != 0 || !(yVar instanceof C75102b0)) {
            return true;
        }
        WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct = new WCPaySaftyClickReportStruct();
        wCPaySaftyClickReportStruct.f194681d = 1;
        wCPaySaftyClickReportStruct.f194682e = 2;
        wCPaySaftyClickReportStruct.mo86054n();
        Toast makeText = C76701a.makeText((Context) getContext(), (CharSequence) "", 0);
        View inflate = View.inflate(getContext(), C0966R.C0971layout.f6796os, (ViewGroup) null);
        ((WeImageView) inflate.findViewById(C0966R.C0970id.kpx)).setImageResource(C0966R.raw.icons_filled_done);
        ((TextView) inflate.findViewById(C0966R.C0970id.kpy)).setText(getString(C0966R.string.l26));
        makeText.setGravity(17, 0, 0);
        makeText.setView(inflate);
        makeText.show();
        C119179t tVar = C119157j.f356862d;
        C71999e eVar = new C71999e(makeText);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(eVar, 750, false);
        return true;
    }

    public void onResume() {
        super.onResume();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C72000f.class);
    }
}
