package com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.xweb.FileReaderHelper;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import mv0.C99980a;
import mv0.C99990k;

/* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakWaitingUI */
public class BakWaitingUI extends MMWizardActivity implements C99990k.C99993c {

    /* renamed from: h */
    public static final /* synthetic */ int f267690h = 0;

    /* renamed from: e */
    public int f267691e;

    /* renamed from: f */
    public boolean f267692f;

    /* renamed from: g */
    public MMHandler f267693g = new MMHandler(Looper.getMainLooper());

    /* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakWaitingUI$b */
    public class C2070b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f12020d;

        public C2070b(int i) {
            this.f12020d = i;
        }

        public void run() {
            Log.m105919d("MicroMsg.BakWaitingUI", "BakWaitingUI onCloseSocket errType: %d", Integer.valueOf(this.f12020d));
            if (this.f12020d == -1) {
                Log.m105918d("MicroMsg.BakWaitingUI", "BakToPcUI jump tips");
                Intent intent = new Intent();
                intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, BakWaitingUI.this.getString(C0966R.string.ad_));
                intent.putExtra("rawUrl", BakWaitingUI.this.getString(C0966R.string.ac6, new Object[]{LocaleUtil.getApplicationLanguage()}));
                intent.putExtra("showShare", false);
                intent.putExtra("neverGetA8Key", true);
                C88144b.m109791i(BakWaitingUI.this, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                return;
            }
            MMWizardActivity.m7017L7(BakWaitingUI.this, new Intent(BakWaitingUI.this, BakConnErrorUI.class));
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakWaitingUI$a */
    public class C92940a implements MenuItem.OnMenuItemClickListener {
        public C92940a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BakWaitingUI bakWaitingUI = BakWaitingUI.this;
            int i = BakWaitingUI.f267690h;
            bakWaitingUI.mo7681K7(1);
            return true;
        }
    }

    /* renamed from: d */
    public void mo127331d(int i) {
        this.f267693g.post(new C2070b(i));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6544hs;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.afk);
        if (this.f267692f) {
            View findViewById = findViewById(C0966R.C0970id.a4o);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakWaitingUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakWaitingUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View findViewById2 = findViewById(C0966R.C0970id.a4o);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakWaitingUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakWaitingUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        setBackBtn(new C92940a());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!getIntent().getExtras().getBoolean("MMWizardActivity.WIZARD_ROOT_KILLSELF", false)) {
            C99980a.m130643h().mo139322k().f292959d = this;
            this.f267691e = C99980a.m130643h().mo139322k().f292966n;
            this.f267692f = getIntent().getBooleanExtra("from_back_finish", false);
            Log.m105925i("MicroMsg.BakWaitingUI", "BakWaitingUI onCreate nowCmd:%d isFromFinish:%b", Integer.valueOf(this.f267691e), Boolean.valueOf(this.f267692f));
            initView();
            int i = this.f267691e;
            if (6 == i || 1 == i) {
                Intent intent = new Intent(this, BakOperatingUI.class);
                intent.putExtra(FileReaderHelper.OPEN_FILE_FROM_CMD, this.f267691e);
                MMWizardActivity.m7017L7(this, intent);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C99980a.m130643h().mo139322k().f292959d = null;
        Log.m105925i("MicroMsg.BakWaitingUI", "BakWaitingUI onDestroy nowCmd:%d isFromFinish:%b", Integer.valueOf(this.f267691e), Boolean.valueOf(this.f267692f));
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        mo7681K7(1);
        return true;
    }
}
