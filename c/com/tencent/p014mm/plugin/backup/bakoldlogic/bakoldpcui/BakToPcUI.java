package com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import mv0.C99980a;
import mv0.C99990k;

/* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakToPcUI */
public class BakToPcUI extends MMWizardActivity implements C99990k.C99991a {

    /* renamed from: i */
    public static final /* synthetic */ int f267682i = 0;

    /* renamed from: e */
    public int f267683e = -1;

    /* renamed from: f */
    public Button f267684f;

    /* renamed from: g */
    public Button f267685g;

    /* renamed from: h */
    public MMHandler f267686h = new MMHandler(Looper.getMainLooper());

    /* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakToPcUI$d */
    public class C2069d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f12018d;

        public C2069d(int i) {
            this.f12018d = i;
        }

        public void run() {
            Log.m105919d("MicroMsg.BakToPcUI", "BakToPcUI onCloseSocket errType: %d", Integer.valueOf(this.f12018d));
            if (this.f12018d == -1) {
                Log.m105918d("MicroMsg.BakToPcUI", "BakToPcUI jump tips");
                Intent intent = new Intent();
                intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, BakToPcUI.this.getString(C0966R.string.ad_));
                intent.putExtra("rawUrl", BakToPcUI.this.getString(C0966R.string.ac6, new Object[]{LocaleUtil.getApplicationLanguage()}));
                intent.putExtra("showShare", false);
                intent.putExtra("neverGetA8Key", true);
                C88144b.m109791i(BakToPcUI.this, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                return;
            }
            BakToPcUI bakToPcUI = BakToPcUI.this;
            int i = BakToPcUI.f267682i;
            bakToPcUI.mo7681K7(1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakToPcUI$a */
    public class C92937a implements MenuItem.OnMenuItemClickListener {
        public C92937a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C99980a.m130643h().mo139322k().mo139332e(1);
            BakToPcUI bakToPcUI = BakToPcUI.this;
            int i = BakToPcUI.f267682i;
            bakToPcUI.mo7681K7(1);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakToPcUI$b */
    public class C92938b implements View.OnClickListener {
        public C92938b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakToPcUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (BakToPcUI.this.f267683e == 0) {
                C99980a.m130643h().mo139321j().f292934c = 1;
                C99980a.m130643h().mo139322k().mo139332e(0);
                MMWizardActivity.m7017L7(BakToPcUI.this, new Intent(BakToPcUI.this, BakWaitingUI.class));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakToPcUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakToPcUI$c */
    public class C92939c implements View.OnClickListener {
        public C92939c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakToPcUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (BakToPcUI.this.f267683e == 0) {
                C99980a.m130643h().mo139321j().f292934c = 2;
                C99980a.m130643h().mo139321j().mo139323a();
                C99980a.m130643h().mo139322k().mo139332e(1);
                BakToPcUI.this.mo7681K7(1);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakToPcUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d */
    public void mo127331d(int i) {
        this.f267686h.post(new C2069d(i));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6540ho;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.afk);
        setBackBtn(new C92937a());
        Button button = (Button) findViewById(C0966R.C0970id.a4l);
        this.f267684f = button;
        button.setOnClickListener(new C92938b());
        Button button2 = (Button) findViewById(C0966R.C0970id.a4j);
        this.f267685g = button2;
        button2.setOnClickListener(new C92939c());
        ((TextView) findViewById(C0966R.C0970id.a4q)).setText(C99980a.m130643h().mo139322k().f292967o);
        ((TextView) findViewById(C0966R.C0970id.a4r)).setText(C99980a.m130643h().mo139322k().f292968p);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!getIntent().getExtras().getBoolean("MMWizardActivity.WIZARD_ROOT_KILLSELF", false)) {
            initView();
            int i = C99980a.m130643h().mo139322k().f292966n;
            this.f267683e = i;
            Log.m105925i("MicroMsg.BakToPcUI", "BakToPcUI auth onCreate nowCmd:%d", Integer.valueOf(i));
            C99980a.m130643h().mo139322k().f292960e = this;
            if (this.f267683e == 0) {
                this.f267684f.setEnabled(true);
                this.f267685g.setEnabled(true);
                return;
            }
            this.f267684f.setEnabled(false);
            this.f267685g.setEnabled(false);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105925i("MicroMsg.BakToPcUI", "BakToPcUI auth onDestroy nowCmd:%d", Integer.valueOf(this.f267683e));
        C99980a.m130643h().mo139322k().f292960e = null;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        C99980a.m130643h().mo139321j().f292934c = 3;
        C99980a.m130643h().mo139321j().mo139323a();
        C99980a.m130643h().mo139322k().mo139332e(1);
        mo7681K7(1);
        return true;
    }
}
