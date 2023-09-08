package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85864g1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import nc0.C76850a;
import nj3.C88989a;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandRedirectUI */
public class AppBrandRedirectUI extends MMActivity {

    /* renamed from: d */
    public int f11891d = 0;

    /* renamed from: e */
    public boolean f11892e = false;

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        C76850a.C76851a a;
        super.onCreate(bundle);
        C85864g1.m106129d(getWindow());
        Log.m105924i("AppBrandRedirectUI", "onCreate");
        setResult(0);
        if (getIntent().getIntExtra("key_from_scene", -1) == 0) {
            Log.m105924i("AppBrandRedirectUI", "start to bind phone number");
            Intent intent = new Intent();
            intent.setClassName(this, "com.tencent.mm.plugin.account.bind.ui.BindMContactUI");
            intent.putExtra("WizardRootClass", getClass().getName());
            intent.putExtra("bind_scene", 5);
            String simCountryIso = ((TelephonyManager) getContext().getSystemService("phone")).getSimCountryIso();
            if (!Util.isNullOrNil(simCountryIso) && (a = C76850a.m92629a(this, simCountryIso, getContext().getString(C0966R.string.bvs))) != null) {
                intent.putExtra("country_name", a.f224677c);
                intent.putExtra("couttry_code", a.f224676b);
            }
            MMWizardActivity.m7017L7(this, intent);
            return;
        }
        Log.m105920e("AppBrandRedirectUI", "from scene is illegal, finish activity");
        finish();
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            Log.m105920e("AppBrandRedirectUI", "onKeyDown KEYCODE_BACK, result cancel, finishUI");
            setResult(0);
            finish();
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void onNewIntent(Intent intent) {
        Log.m105924i("AppBrandRedirectUI", "onNewIntent");
        super.onNewIntent(intent);
        if (intent != null) {
            int intExtra = intent.getIntExtra("wizard_activity_result_code", 0);
            this.f11891d = intExtra;
            setResult(intExtra);
            Log.m105925i("AppBrandRedirectUI", "result:%d, finish activity", Integer.valueOf(this.f11891d));
        } else {
            Log.m105924i("AppBrandRedirectUI", "intent is null");
            setResult(0);
        }
        finish();
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("AppBrandRedirectUI", "onResume");
        if (!this.f11892e) {
            this.f11892e = true;
            return;
        }
        Log.m105924i("AppBrandRedirectUI", "onResume, RESULT_CANCELED  finish activity");
        setResult(0);
        finish();
    }
}
