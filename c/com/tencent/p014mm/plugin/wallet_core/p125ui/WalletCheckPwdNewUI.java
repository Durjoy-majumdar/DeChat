package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.offline.p085ui.C57154g1;
import com.tencent.p014mm.plugin.wallet_core.utils.C5811n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.EditHintPasswdView;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gr3.C76024a;
import j20.C117292a;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import nj3.C88989a;
import ob0.C117747y;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdNewUI */
public class WalletCheckPwdNewUI extends WalletBaseUI {

    /* renamed from: h */
    public static final /* synthetic */ int f210010h = 0;

    /* renamed from: d */
    public C72258c f210011d;

    /* renamed from: e */
    public TextView f210012e;

    /* renamed from: f */
    public TextView f210013f;

    /* renamed from: g */
    public EditHintPasswdView f210014g;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdNewUI$a */
    public class C72256a implements MenuItem.OnMenuItemClickListener {
        public C72256a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WalletCheckPwdNewUI walletCheckPwdNewUI = WalletCheckPwdNewUI.this;
            int i = WalletCheckPwdNewUI.f210010h;
            walletCheckPwdNewUI.getClass();
            Log.m105924i("MicroMsg.WalletCheckPwdNewUI", "close btn");
            if (walletCheckPwdNewUI.f210011d.mo80734a()) {
                return false;
            }
            walletCheckPwdNewUI.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdNewUI$b */
    public class C72257b implements EditHintPasswdView.C75206c {
        public C72257b() {
        }

        public void onInputValidChange(boolean z) {
            Log.m105925i("MicroMsg.WalletCheckPwdNewUI", "input isValid: %s", Boolean.valueOf(z));
            if (z) {
                WalletCheckPwdNewUI walletCheckPwdNewUI = WalletCheckPwdNewUI.this;
                walletCheckPwdNewUI.f210011d.mo80735b(walletCheckPwdNewUI.f210014g.getText());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdNewUI$c */
    public interface C72258c {
        /* renamed from: a */
        boolean mo80734a();

        /* renamed from: b */
        void mo80735b(String str);

        void onCreate();

        void onDestroy();

        boolean onSceneEnd(int i, int i2, String str, C117747y yVar);
    }

    public void cleanUiData(int i) {
        this.f210014g.mo105043a();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2492eg, C0966R.C0968anim.f2493eh);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cec;
    }

    public void initView() {
        this.f210012e = (TextView) findViewById(C0966R.C0970id.lja);
        this.f210013f = (TextView) findViewById(C0966R.C0970id.lj6);
        this.f210014g = (EditHintPasswdView) findViewById(C0966R.C0970id.f7k);
        C75228t.m90240d(this.f210012e);
        hideKeyboardPushDownBtn();
        C76024a.m91321b(this.f210014g);
        this.f210014g.setOnInputValidListener(new C72257b());
        setEditFocusListener(this.f210014g, 0, false);
        showTenpayKB();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1);
        Log.m105925i("MicroMsg.WalletCheckPwdNewUI", "scene: %s", Integer.valueOf(intExtra));
        if (intExtra == 3) {
            this.f210011d = new C72413p(this);
        } else if (intExtra == 4) {
            this.f210011d = new C57154g1.C57160a(this);
        } else {
            this.f210011d = new C72392k(this);
        }
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        setMMTitle("");
        overridePendingTransition(C0966R.C0968anim.f2492eg, C0966R.C0968anim.f2493eh);
        initView();
        this.f210011d.onCreate();
        setBackBtn(new C72256a());
        if (C75228t.m90212E()) {
            getWindow().addFlags(8192);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f210011d.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean onSceneEnd = this.f210011d.onSceneEnd(i, i2, str, yVar);
        Log.m105925i("MicroMsg.WalletCheckPwdNewUI", "controller ret: %s", Boolean.valueOf(onSceneEnd));
        return onSceneEnd;
    }

    public void setContentViewVisibility(int i) {
        View contentView = getContentView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view = contentView;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletCheckPwdNewUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/wallet_core/ui/WalletCheckPwdNewUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C5811n.class);
    }
}
