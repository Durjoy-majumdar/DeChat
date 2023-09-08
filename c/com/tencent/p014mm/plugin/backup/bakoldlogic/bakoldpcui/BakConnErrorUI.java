package com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.FileReaderHelper;
import mv0.C99980a;

/* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakConnErrorUI */
public class BakConnErrorUI extends MMWizardActivity {

    /* renamed from: f */
    public static final /* synthetic */ int f267649f = 0;

    /* renamed from: e */
    public int f267650e;

    /* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakConnErrorUI$a */
    public class C92922a implements MenuItem.OnMenuItemClickListener {
        public C92922a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BakConnErrorUI bakConnErrorUI = BakConnErrorUI.this;
            int i = BakConnErrorUI.f267649f;
            bakConnErrorUI.mo7681K7(1);
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6541hp;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.afk);
        setBackBtn(new C92922a());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!getIntent().getExtras().getBoolean("MMWizardActivity.WIZARD_ROOT_KILLSELF", false)) {
            int intExtra = getIntent().getIntExtra(FileReaderHelper.OPEN_FILE_FROM_CMD, -1);
            this.f267650e = intExtra;
            Log.m105925i("MicroMsg.BakFinishUI", "BakConnErrorUI onCreate nowCmd:%d", Integer.valueOf(intExtra));
            initView();
            C99980a.m130643h().mo139322k().f292969q = -1;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C99980a.m130643h().mo139322k().f292962g = null;
        Log.m105925i("MicroMsg.BakFinishUI", "BakConnErrorUI onDestroy nowCmd:%d", Integer.valueOf(this.f267650e));
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        mo7681K7(1);
        return true;
    }
}
