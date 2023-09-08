package com.tencent.p014mm.pluginsdk.p133ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import nj3.C88989a;
import p286zl.C39373h;

@C88989a(3)
/* renamed from: com.tencent.mm.pluginsdk.ui.AutoLoginActivity */
public abstract class AutoLoginActivity extends MMActivity {

    /* renamed from: com.tencent.mm.pluginsdk.ui.AutoLoginActivity$a */
    public enum C72717a {
        LOGIN_OK,
        LOGIN_FAIL,
        LOGIN_CANCEL
    }

    /* renamed from: H7 */
    public boolean mo100186H7() {
        return ((C39373h) C86312j.m106911c(C39373h.class)).xu0(getIntent(), this, getClass());
    }

    /* renamed from: I7 */
    public final void mo100187I7(int i) {
        if (i == -1) {
            mo94557J7(C72717a.LOGIN_OK, getIntent());
        } else if (i == 0) {
            mo100186H7();
        } else if (i != 1) {
            Log.m105920e("MicroMsg.AutoLoginActivity", "onNewIntent, should not reach here, resultCode = " + i);
            mo94557J7(C72717a.LOGIN_FAIL, getIntent());
        } else {
            mo94557J7(C72717a.LOGIN_CANCEL, getIntent());
        }
    }

    /* renamed from: J7 */
    public abstract void mo94557J7(C72717a aVar, Intent intent);

    /* renamed from: K7 */
    public abstract boolean mo94558K7(Intent intent);

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitleVisibility(8);
        Intent intent = getIntent();
        if (intent == null) {
            Log.m105920e("MicroMsg.AutoLoginActivity", "onCreate intent is null");
            finish();
            return;
        }
        Log.m105924i("MicroMsg.AutoLoginActivity", "onCreate, intent action = " + intent.getAction());
        int intExtra = IntentUtil.getIntExtra(intent, "wizard_activity_result_code", -2);
        Log.m105924i("MicroMsg.AutoLoginActivity", "onCreate, resultCode = " + intExtra);
        if (intExtra != -2) {
            mo100187I7(intExtra);
        } else if (!mo94558K7(intent)) {
            Log.m105920e("MicroMsg.AutoLoginActivity", "preLogin fail, no need to process");
            finish();
        } else if (mo100186H7()) {
            finish();
            Log.m105928w("MicroMsg.AutoLoginActivity", "not login, go to SimpleLogin");
        } else {
            mo94557J7(C72717a.LOGIN_OK, intent);
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        if (intent != null) {
            super.onNewIntent(intent);
            setIntent(intent);
            int intExtra = IntentUtil.getIntExtra(intent, "wizard_activity_result_code", 0);
            Log.m105924i("MicroMsg.AutoLoginActivity", "onNewIntent, resultCode = " + intExtra);
            mo100187I7(intExtra);
        }
    }
}
