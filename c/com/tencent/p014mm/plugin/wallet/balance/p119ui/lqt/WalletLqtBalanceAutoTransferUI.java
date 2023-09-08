package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import al3.C0086a;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C43282b;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C43284d;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C43286e;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCheckPwdNewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import j20.C117292a;
import java.text.DecimalFormat;
import k20.C60958c;
import k20.C9556a;
import ob0.C117747y;
import p910lj.C76701a;
import qo3.C77389a;
import qo3.C77398g;
import te3.C51102rf3;
import te3.kg4;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI */
public class WalletLqtBalanceAutoTransferUI extends WalletBaseUI {

    /* renamed from: t */
    public static final /* synthetic */ int f117170t = 0;

    /* renamed from: d */
    public MMSwitchBtn f117171d;

    /* renamed from: e */
    public TextView f117172e;

    /* renamed from: f */
    public TextView f117173f;

    /* renamed from: g */
    public TextView f117174g;

    /* renamed from: h */
    public TextView f117175h;

    /* renamed from: i */
    public TextView f117176i;

    /* renamed from: j */
    public LinearLayout f117177j;

    /* renamed from: n */
    public View f117178n;

    /* renamed from: o */
    public int f117179o;

    /* renamed from: p */
    public kg4 f117180p;

    /* renamed from: q */
    public C51102rf3 f117181q;

    /* renamed from: r */
    public String f117182r;

    /* renamed from: s */
    public View f117183s;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI$a */
    public class C43329a implements MMSwitchBtn.C7041b {

        /* renamed from: a */
        public long f117184a = 0;

        public C43329a() {
        }

        public void onStatusChange(boolean z) {
            Log.m105925i("MicroMsg.WalletLqtBalanceAutoTransferUI", "click switch: %s", Boolean.valueOf(z));
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.f117184a < 1000) {
                Log.m105924i("MicroMsg.WalletLqtBalanceAutoTransferUI", "skip");
                WalletLqtBalanceAutoTransferUI.this.f117171d.setCheck(!z);
                this.f117184a = elapsedRealtime;
                return;
            }
            this.f117184a = elapsedRealtime;
            if (z) {
                WalletLqtBalanceAutoTransferUI walletLqtBalanceAutoTransferUI = WalletLqtBalanceAutoTransferUI.this;
                int i = WalletLqtBalanceAutoTransferUI.f117170t;
                walletLqtBalanceAutoTransferUI.getClass();
                Log.m105924i("MicroMsg.WalletLqtBalanceAutoTransferUI", "go to pwd");
                Intent intent = new Intent(walletLqtBalanceAutoTransferUI, WalletCheckPwdNewUI.class);
                intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 3);
                walletLqtBalanceAutoTransferUI.startActivityForResult(intent, 16);
                return;
            }
            WalletLqtBalanceAutoTransferUI walletLqtBalanceAutoTransferUI2 = WalletLqtBalanceAutoTransferUI.this;
            int i2 = WalletLqtBalanceAutoTransferUI.f117170t;
            walletLqtBalanceAutoTransferUI2.getClass();
            Log.m105924i("MicroMsg.WalletLqtBalanceAutoTransferUI", "show close alert");
            if (Util.isNullOrNil(walletLqtBalanceAutoTransferUI2.f117182r)) {
                walletLqtBalanceAutoTransferUI2.f117182r = walletLqtBalanceAutoTransferUI2.getString(C0966R.string.kw5);
            }
            AppCompatActivity context = walletLqtBalanceAutoTransferUI2.getContext();
            C77389a aVar = new C77389a();
            aVar.f225668y = false;
            aVar.f225644a = "";
            aVar.f225660q = walletLqtBalanceAutoTransferUI2.f117182r;
            aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.kw6);
            aVar.f225664u = C0086a.m38a(context).getString(C0966R.string.f7926wf);
            aVar.f225638U = walletLqtBalanceAutoTransferUI2.getResources().getColor(C0966R.color.Red_100);
            aVar.f225620C = new C43344i(walletLqtBalanceAutoTransferUI2);
            aVar.f225641X = true;
            aVar.f225621D = new C43345j(walletLqtBalanceAutoTransferUI2);
            C77398g gVar = new C77398g(context, C0966R.style.a66);
            gVar.mo107525e(aVar);
            gVar.show();
            walletLqtBalanceAutoTransferUI2.addDialog(gVar);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI$b */
    public class C43330b extends C7089c0 {
        public C43330b() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            Log.m105918d("MicroMsg.WalletLqtBalanceAutoTransferUI", "click time layout");
            WalletLqtBalanceAutoTransferUI walletLqtBalanceAutoTransferUI = WalletLqtBalanceAutoTransferUI.this;
            int i = WalletLqtBalanceAutoTransferUI.f117170t;
            walletLqtBalanceAutoTransferUI.getClass();
            Log.m105924i("MicroMsg.WalletLqtBalanceAutoTransferUI", "show time panel");
            C51102rf3 rf32 = walletLqtBalanceAutoTransferUI.f117181q;
            if (rf32 != null) {
                int size = rf32.f140885f.size();
                String[] strArr = new String[size];
                for (int i2 = 0; i2 < size; i2++) {
                    strArr[i2] = walletLqtBalanceAutoTransferUI.mo67538I7(walletLqtBalanceAutoTransferUI.f117181q.f140885f.get(i2), C0966R.string.kw8);
                }
                C7045j jVar = new C7045j((Context) walletLqtBalanceAutoTransferUI.getContext(), strArr);
                jVar.mo8106i(walletLqtBalanceAutoTransferUI.f117179o);
                jVar.f24869t = new C43347k(walletLqtBalanceAutoTransferUI, jVar);
                jVar.mo8109l();
            }
        }
    }

    /* renamed from: H7 */
    public final void mo67537H7() {
        this.f117177j.setVisibility(8);
        View view = this.f117178n;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBalanceAutoTransferUI", "hideTimeLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBalanceAutoTransferUI", "hideTimeLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: I7 */
    public final String mo67538I7(kg4 kg4, int i) {
        DecimalFormat decimalFormat = new DecimalFormat("00");
        return getString(i, new Object[]{decimalFormat.format((long) (kg4.f136782d / 60)), decimalFormat.format((long) (kg4.f136783e / 60))});
    }

    /* renamed from: J7 */
    public final void mo67539J7() {
        this.f117171d.setCheck(true);
        View view = this.f117183s;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBalanceAutoTransferUI", "setAccountChecked", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBalanceAutoTransferUI", "setAccountChecked", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo67541L7();
    }

    /* renamed from: K7 */
    public final void mo67540K7() {
        this.f117171d.setCheck(false);
        View view = this.f117183s;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBalanceAutoTransferUI", "setAccountUnChecked", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBalanceAutoTransferUI", "setAccountUnChecked", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo67537H7();
    }

    /* renamed from: L7 */
    public final void mo67541L7() {
        this.f117177j.setVisibility(0);
        View view = this.f117178n;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBalanceAutoTransferUI", "showTimeLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBalanceAutoTransferUI", "showTimeLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b8n;
    }

    public void initView() {
        this.f117171d = (MMSwitchBtn) findViewById(C0966R.C0970id.flm);
        this.f117175h = (TextView) findViewById(C0966R.C0970id.flv);
        this.f117176i = (TextView) findViewById(C0966R.C0970id.flq);
        this.f117174g = (TextView) findViewById(C0966R.C0970id.fls);
        this.f117177j = (LinearLayout) findViewById(C0966R.C0970id.flt);
        this.f117178n = findViewById(C0966R.C0970id.flp);
        this.f117172e = (TextView) findViewById(C0966R.C0970id.flo);
        this.f117173f = (TextView) findViewById(C0966R.C0970id.flu);
        FrameLayout frameLayout = (FrameLayout) findViewById(C0966R.C0970id.fln);
        this.f117183s = findViewById(C0966R.C0970id.flr);
        this.f117171d.setSwitchListener(new C43329a());
        this.f117177j.setOnClickListener(new C43330b());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105925i("MicroMsg.WalletLqtBalanceAutoTransferUI", "on activity result: %s, %s", Integer.valueOf(i), Integer.valueOf(i2));
        String stringExtra = intent != null ? intent.getStringExtra("encrypt_pwd") : "";
        if (i == 16) {
            if (i2 == -1) {
                Log.m105924i("MicroMsg.WalletLqtBalanceAutoTransferUI", "do open");
                new C43284d(stringExtra).mo9225i().mo123062e(new C43350m(this, C75197d0.m90163d(getContext(), false, false, (DialogInterface.OnCancelListener) null)));
                return;
            }
            mo67540K7();
        } else if (i != 32) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            Log.m105924i("MicroMsg.WalletLqtBalanceAutoTransferUI", "do close");
            new C43282b(stringExtra).mo9225i().mo123062e(new C43352n(this, C75197d0.m90163d(getContext(), false, false, (DialogInterface.OnCancelListener) null)));
        } else {
            mo67539J7();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        initView();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        hideActionbarLine();
        if (getIntent().getIntExtra("show_open_toast", 0) == 1) {
            C76701a.makeText((Context) this, (int) C0966R.string.kw7, 0).show();
        }
        Log.m105924i("MicroMsg.WalletLqtBalanceAutoTransferUI", "do qry setting");
        new C43286e().mo9225i().mo123062e(new C43348l(this));
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
