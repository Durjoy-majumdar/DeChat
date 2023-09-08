package com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.xweb.FileReaderHelper;
import mv0.C99980a;
import mv0.C99990k;

/* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakFinishUI */
public class BakFinishUI extends MMWizardActivity implements C99990k.C99995e {

    /* renamed from: g */
    public static final /* synthetic */ int f267652g = 0;

    /* renamed from: e */
    public int f267653e;

    /* renamed from: f */
    public MMHandler f267654f = new MMHandler(Looper.getMainLooper());

    /* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakFinishUI$a */
    public class C92923a implements MenuItem.OnMenuItemClickListener {
        public C92923a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C99980a.m130643h().mo139322k().f292969q = -1;
            BakFinishUI bakFinishUI = BakFinishUI.this;
            int i = BakFinishUI.f267652g;
            bakFinishUI.mo7681K7(1);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakFinishUI$b */
    public class C92924b implements Runnable {
        public C92924b() {
        }

        public void run() {
            Log.m105918d("MicroMsg.BakFinishUI", "BakFinishUI onCloseSocket");
            MMWizardActivity.m7017L7(BakFinishUI.this, new Intent(BakFinishUI.this, BakConnErrorUI.class));
        }
    }

    /* renamed from: d */
    public void mo127331d(int i) {
        this.f267654f.post(new C92924b());
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6542hq;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.afk);
        TextView textView = (TextView) findViewById(C0966R.C0970id.a4k);
        int i = this.f267653e;
        if (6 == i) {
            textView.setText(getString(C0966R.string.afg));
        } else if (1 == i) {
            textView.setText(getString(C0966R.string.af8));
        }
        setBackBtn(new C92923a());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!getIntent().getExtras().getBoolean("MMWizardActivity.WIZARD_ROOT_KILLSELF", false)) {
            int intExtra = getIntent().getIntExtra(FileReaderHelper.OPEN_FILE_FROM_CMD, -1);
            this.f267653e = intExtra;
            Log.m105925i("MicroMsg.BakFinishUI", "BakFinishUI onCreate nowCmd:%d", Integer.valueOf(intExtra));
            initView();
            C99980a.m130643h().mo139322k().f292962g = this;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C99980a.m130643h().mo139322k().f292962g = null;
        Log.m105925i("MicroMsg.BakFinishUI", "BakFinishUI onDestroy nowCmd:%d", Integer.valueOf(this.f267653e));
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        C99980a.m130643h().mo139322k().f292969q = -1;
        mo7681K7(1);
        return true;
    }
}
