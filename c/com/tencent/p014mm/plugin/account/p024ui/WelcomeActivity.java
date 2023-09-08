package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.mmdata.rpt.ThirdAppRegisterStruct;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.mmfb.sdk.C116102h;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import nc0.C76850a;
import nj3.C76875f0;
import nj3.C88989a;
import nj3.C88990b;
import p214om.C11502f;
import qo3.C77407n;
import sf0.C90186h0;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.account.ui.WelcomeActivity */
public class WelcomeActivity extends MMFragmentActivity {

    /* renamed from: h */
    public static final String[] f345072h = {"public_profile"};

    /* renamed from: d */
    public WelcomeSelectView f345073d;

    /* renamed from: e */
    public C116102h f345074e;

    /* renamed from: f */
    public ThirdAppRegisterStruct f345075f = new ThirdAppRegisterStruct();

    /* renamed from: g */
    public C90186h0 f345076g = new C90186h0();

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Object[] objArr = new Object[3];
        boolean z = false;
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        if (intent == null) {
            z = true;
        }
        objArr[2] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.WelcomeActivity", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", objArr);
    }

    public void onBackPressed() {
        Intent b = ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93169b(this);
        b.addFlags(67108864);
        b.putExtra("can_finish", true);
        C9556a aVar = new C9556a();
        aVar.mo10233c(b);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/WelcomeActivity", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/WelcomeActivity", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
        C88990b.m111200i(this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getSupportActionBar().mo91104o();
        getWindow().getDecorView().setSystemUiVisibility(1280);
        if (Build.VERSION.SDK_INT >= 26 && !MMActivityController.m163190m()) {
            getWindow().setNavigationBarColor(getResources().getColor(C0966R.color.f2954aa));
        }
        WelcomeSelectView welcomeSelectView = new WelcomeSelectView(this);
        this.f345073d = welcomeSelectView;
        setContentView((View) welcomeSelectView);
        WelcomeSelectView welcomeSelectView2 = this.f345073d;
        welcomeSelectView2.mo174851a(welcomeSelectView2.f345077d, 300);
        welcomeSelectView2.mo174851a(welcomeSelectView2.f345080g, 300);
        View view = welcomeSelectView2.f345077d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/WelcomeSelectView", "slideView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/account/ui/WelcomeSelectView", "slideView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        welcomeSelectView2.f345080g.setVisibility(0);
        MMHandlerThread.postToMainThread(new C115183s3(welcomeSelectView2));
        this.f345073d.f345080g.setOnClickListener(new C1480j3(this));
        this.f345073d.f345078e.setOnClickListener(new C1481k3(this));
        ArrayList arrayList = new ArrayList();
        C76875f0 f0Var = new C76875f0(this, 1001, 0);
        f0Var.f224723r = C0966R.string.hwj;
        arrayList.add(f0Var);
        C76875f0 f0Var2 = new C76875f0(this, 1002, 0);
        if (C76850a.m92636h()) {
            f0Var2.f224723r = C0966R.string.hwh;
            arrayList.add(f0Var2);
        }
        if (arrayList.size() > 1) {
            C77407n nVar = new C77407n((Context) this, 1, false);
            nVar.f225771i = new C68503l3(this, arrayList);
            nVar.f225782p = new C115137m3(this);
            nVar.f225761d = new C115145n3(this);
            this.f345073d.f345079f.setOnClickListener(new C115149o3(this, nVar, arrayList, f0Var2));
            return;
        }
        this.f345073d.f345079f.setOnClickListener(new C1486p3(this));
    }

    public void onDestroy() {
        super.onDestroy();
        this.f345075f.mo86054n();
        C116102h hVar = this.f345074e;
        if (hVar != null) {
            hVar.mo177420c(this);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f345076g.mo124431c(this, i, strArr, iArr);
    }

    public void onResume() {
        super.onResume();
        WelcomeSelectView welcomeSelectView = this.f345073d;
        String loadApplicationLanguageSettings = LocaleUtil.loadApplicationLanguageSettings(welcomeSelectView.f345081h.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), welcomeSelectView.f345081h);
        welcomeSelectView.f345080g.setText(LocaleUtil.getLanguageName(welcomeSelectView.f345081h, C0966R.array.f2581p, C0966R.string.f8037zz));
        if (loadApplicationLanguageSettings != null && loadApplicationLanguageSettings.equals("language_default")) {
            welcomeSelectView.f345080g.setText(welcomeSelectView.f345081h.getString(C0966R.string.f360973gd3));
        }
        welcomeSelectView.f345078e.setText(C0966R.string.frg);
        welcomeSelectView.f345079f.setText(C0966R.string.frf);
    }
}
