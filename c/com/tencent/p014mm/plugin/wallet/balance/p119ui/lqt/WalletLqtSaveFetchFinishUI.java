package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.WalletTextView;
import de3.C75355a0;
import di3.C86312j;
import ie3.C76324c;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import lg3.C76695c;
import nj3.C88989a;
import ob0.C117747y;
import p629ny.C76979h;
import r43.C12945b;
import te3.C77940he2;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishUI */
public class WalletLqtSaveFetchFinishUI extends WalletBaseUI {

    /* renamed from: d */
    public TextView f208133d;

    /* renamed from: e */
    public WalletTextView f208134e;

    /* renamed from: f */
    public Button f208135f;

    /* renamed from: g */
    public TextView f208136g;

    /* renamed from: h */
    public TextView f208137h;

    /* renamed from: i */
    public C77940he2 f208138i;

    /* renamed from: j */
    public CdnImageView f208139j;

    /* renamed from: n */
    public TextView f208140n;

    /* renamed from: o */
    public TextView f208141o;

    /* renamed from: p */
    public LinearLayout f208142p;

    /* renamed from: q */
    public ViewGroup f208143q;

    /* renamed from: r */
    public WeImageView f208144r;

    /* renamed from: s */
    public WeImageView f208145s;

    /* renamed from: t */
    public int f208146t;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishUI$a */
    public class C71760a implements View.OnClickListener {
        public C71760a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletLqtSaveFetchFinishUI walletLqtSaveFetchFinishUI = WalletLqtSaveFetchFinishUI.this;
            if (walletLqtSaveFetchFinishUI.f208146t != 8) {
                walletLqtSaveFetchFinishUI.finish();
            } else if (walletLqtSaveFetchFinishUI.getIntent().getIntExtra("is_from_kinda_balance", 0) != 0) {
                WalletLqtSaveFetchFinishUI.this.setResult(-1);
                WalletLqtSaveFetchFinishUI.this.finish();
            } else {
                Intent intent = new Intent();
                intent.addFlags(67108864);
                C88144b.m109791i(WalletLqtSaveFetchFinishUI.this.getContext(), "mall", ".ui.MallWalletUI", intent, (Bundle) null);
            }
            if (WalletLqtSaveFetchFinishUI.this.f208146t == 14) {
                ITransmitKvData create = ITransmitKvData.create();
                create.putString("notifyType", "refreshByLQT");
                ((C76324c) C86312j.m106911c(C76324c.class)).notifyAllUseCase(create);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishUI$b */
    public class C71761b implements View.OnClickListener {
        public C71761b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if ("wxpay://lqt/planindex".equals(WalletLqtSaveFetchFinishUI.this.f208138i.f227563g)) {
                Intent intent = new Intent(WalletLqtSaveFetchFinishUI.this.getContext(), WalletLqtPlanBeforeHomeUI.class);
                WalletLqtSaveFetchFinishUI walletLqtSaveFetchFinishUI = WalletLqtSaveFetchFinishUI.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                WalletLqtSaveFetchFinishUI walletLqtSaveFetchFinishUI2 = walletLqtSaveFetchFinishUI;
                C117292a.m165358d(walletLqtSaveFetchFinishUI2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                walletLqtSaveFetchFinishUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(walletLqtSaveFetchFinishUI2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if ("wxpay://lqt/preaddplan".equals(WalletLqtSaveFetchFinishUI.this.f208138i.f227563g)) {
                Intent intent2 = new Intent(WalletLqtSaveFetchFinishUI.this.getContext(), WalletLqtPlanAddUI.class);
                intent2.putExtra("key_mode", 3);
                WalletLqtSaveFetchFinishUI walletLqtSaveFetchFinishUI3 = WalletLqtSaveFetchFinishUI.this;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent2);
                WalletLqtSaveFetchFinishUI walletLqtSaveFetchFinishUI4 = walletLqtSaveFetchFinishUI3;
                C117292a.m165358d(walletLqtSaveFetchFinishUI4, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                walletLqtSaveFetchFinishUI3.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(walletLqtSaveFetchFinishUI4, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                Log.m105929w("MicroMsg.WalletLqtSaveFetchFinishUI", "unknown url: %s", WalletLqtSaveFetchFinishUI.this.f208138i.f227563g);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishUI$c */
    public class C71762c implements Runnable {
        public C71762c() {
        }

        public void run() {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) WalletLqtSaveFetchFinishUI.this.f208143q.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            }
            layoutParams.removeRule(12);
            WalletLqtSaveFetchFinishUI.this.f208143q.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishUI$d */
    public class C71763d implements Runnable {
        public C71763d() {
        }

        public void run() {
            ViewGroup viewGroup = WalletLqtSaveFetchFinishUI.this.f208143q;
            if (viewGroup != null) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                }
                layoutParams.addRule(12);
                WalletLqtSaveFetchFinishUI.this.f208143q.setLayoutParams(layoutParams);
            }
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cf9;
    }

    public void onBackPressed() {
    }

    public void onCreate(Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        hideTitleView();
        enableBackMenu(false);
        ViewGroup viewGroup = (ViewGroup) findViewById(C0966R.C0970id.gkw);
        this.f208133d = (TextView) findViewById(C0966R.C0970id.k_e);
        this.f208134e = (WalletTextView) findViewById(C0966R.C0970id.f5810pc);
        this.f208135f = (Button) findViewById(C0966R.C0970id.e9s);
        this.f208136g = (TextView) findViewById(C0966R.C0970id.i7d);
        this.f208137h = (TextView) findViewById(C0966R.C0970id.l0x);
        this.f208139j = (CdnImageView) findViewById(C0966R.C0970id.agi);
        this.f208140n = (TextView) findViewById(C0966R.C0970id.agj);
        this.f208141o = (TextView) findViewById(C0966R.C0970id.agh);
        this.f208142p = (LinearLayout) findViewById(C0966R.C0970id.agw);
        this.f208143q = (ViewGroup) findViewById(C0966R.C0970id.e9r);
        this.f208144r = (WeImageView) findViewById(C0966R.C0970id.myl);
        this.f208145s = (WeImageView) findViewById(C0966R.C0970id.mym);
        this.f208146t = getIntent().getIntExtra("entrance_type", 0);
        int intExtra = getIntent().getIntExtra("key_mode", 1);
        double doubleExtra = getIntent().getDoubleExtra("key_amount", 0.0d);
        String stringExtra = getIntent().getStringExtra("profile_date_wording");
        String stringExtra2 = getIntent().getStringExtra("profile_upgrade_wording");
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_guide_cell");
        if (byteArrayExtra != null) {
            try {
                this.f208138i = (C77940he2) new C77940he2().parseFrom(byteArrayExtra);
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.WalletLqtSaveFetchFinishUI", e, "", new Object[0]);
            }
        }
        if (intExtra == 1) {
            if (this.f208146t == 14) {
                String stringExtra3 = getIntent().getStringExtra("KEY_Purchase_Result_Wording");
                if (!Util.isNullOrNil(stringExtra3)) {
                    this.f208133d.setText(stringExtra3);
                    setMMTitle(stringExtra3);
                } else {
                    this.f208133d.setText(getString(C0966R.string.miw));
                    setMMTitle(getString(C0966R.string.miw));
                }
                String stringExtra4 = getIntent().getStringExtra("KEY_Confirm_Result_Wording");
                if (!Util.isNullOrNil(stringExtra4)) {
                    this.f208135f.setText(stringExtra4);
                } else {
                    this.f208135f.setText(getResources().getString(C0966R.string.hzr));
                }
                this.f208144r.setVisibility(8);
                this.f208145s.setVisibility(0);
                this.f208135f.setTextColor(getResources().getColor(C0966R.color.f3257l0));
                if (C76695c.m92341b()) {
                    this.f208135f.setBackground(getResources().getDrawable(C0966R.C0969drawable.f4654j7));
                } else {
                    this.f208135f.setBackground(getResources().getDrawable(C0966R.C0969drawable.f4653j6));
                }
            } else {
                this.f208133d.setText(getString(C0966R.string.kyw));
                setMMTitle(getString(C0966R.string.kyw));
                this.f208144r.setVisibility(0);
                this.f208145s.setVisibility(8);
            }
        } else if (intExtra == 2) {
            this.f208133d.setText(getString(C0966R.string.kxa));
            setMMTitle(getString(C0966R.string.kxa));
        }
        this.f208134e.setText(C75228t.m90260n(doubleExtra));
        this.f208135f.setOnClickListener(new C71760a());
        if (!Util.isNullOrNil(stringExtra)) {
            this.f208136g.setText(stringExtra);
            this.f208136g.setVisibility(0);
        }
        if (!Util.isNullOrNil(stringExtra2)) {
            this.f208137h.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107050Jo(this, stringExtra2, (int) this.f208137h.getTextSize(), 1, (Object) null));
            this.f208137h.setClickable(true);
            this.f208137h.setOnTouchListener(new C75355a0());
            this.f208137h.setVisibility(0);
        }
        C77940he2 he22 = this.f208138i;
        if (he22 != null) {
            if (!Util.isNullOrNil(he22.f227562f)) {
                this.f208139j.setUrl(this.f208138i.f227562f);
            }
            this.f208140n.setText(this.f208138i.f227560d);
            this.f208141o.setText(this.f208138i.f227561e);
            this.f208142p.setOnClickListener(new C71761b());
            this.f208142p.setVisibility(0);
            getWindow().getDecorView().post(new C71762c());
            return;
        }
        this.f208142p.setVisibility(8);
        getWindow().getDecorView().post(new C71763d());
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }

    public void setContentViewVisibility(int i) {
        View contentView = getContentView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view = contentView;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C12945b.class);
    }
}
