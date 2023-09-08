package com.tencent.p014mm.plugin.wxcredit.p132ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCardSelectUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import gr3.C76024a;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import yq3.C79143a;

/* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletBindDepositUI */
public class WalletBindDepositUI extends WalletBaseUI {

    /* renamed from: d */
    public WalletFormView f211362d;

    /* renamed from: e */
    public WalletFormView f211363e;

    /* renamed from: f */
    public WalletFormView f211364f;

    /* renamed from: g */
    public Button f211365g;

    /* renamed from: h */
    public boolean f211366h = true;

    /* renamed from: i */
    public ElementQuery f211367i = new ElementQuery();

    /* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletBindDepositUI$a */
    public class C72647a implements View.OnClickListener {
        public C72647a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wxcredit/ui/WalletBindDepositUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String text = WalletBindDepositUI.this.f211362d.getText();
            if (Util.isNullOrNil(text)) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/wxcredit/ui/WalletBindDepositUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            WalletBindDepositUI walletBindDepositUI = WalletBindDepositUI.this;
            if (walletBindDepositUI.f211366h) {
                walletBindDepositUI.getNetController().mo91281f(text);
                WalletBindDepositUI.this.f211366h = false;
            } else {
                Bundle bundle = new Bundle();
                bundle.putInt("key_support_bankcard", 1);
                bundle.putString("key_bank_type", WalletBindDepositUI.this.f211367i.f209516s);
                bundle.putInt("key_bankcard_type", 1);
                C79143a.m95768g(WalletBindDepositUI.this).mo109106E(WalletBindDepositUI.this, WalletCardSelectUI.class, bundle, 1);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wxcredit/ui/WalletBindDepositUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletBindDepositUI$b */
    public class C72648b implements View.OnClickListener {
        public C72648b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x005c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r8) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/wxcredit/ui/WalletBindDepositUI$2"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                com.tencent.mm.plugin.wxcredit.ui.WalletBindDepositUI r8 = com.tencent.p014mm.plugin.wxcredit.p132ui.WalletBindDepositUI.this
                com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f211362d
                boolean r0 = r0.mo105094l()
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x0032
                r0 = 2131838940(0x7f1147dc, float:1.9311117E38)
                android.widget.Toast r8 = nj3.C76912y0.makeText((android.content.Context) r8, (int) r0, (int) r2)
                r8.show()
                goto L_0x0057
            L_0x0032:
                com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f211364f
                boolean r0 = r0.mo105094l()
                if (r0 != 0) goto L_0x0045
                r0 = 2131838908(0x7f1147bc, float:1.9311053E38)
                android.widget.Toast r8 = nj3.C76912y0.makeText((android.content.Context) r8, (int) r0, (int) r2)
                r8.show()
                goto L_0x0057
            L_0x0045:
                com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r8.f211363e
                boolean r0 = r0.mo105094l()
                if (r0 != 0) goto L_0x0059
                r0 = 2131838960(0x7f1147f0, float:1.9311158E38)
                android.widget.Toast r8 = nj3.C76912y0.makeText((android.content.Context) r8, (int) r0, (int) r2)
                r8.show()
            L_0x0057:
                r8 = 0
                goto L_0x005a
            L_0x0059:
                r8 = 1
            L_0x005a:
                if (r8 == 0) goto L_0x0091
                com.tencent.mm.plugin.wxcredit.ui.WalletBindDepositUI r8 = com.tencent.p014mm.plugin.wxcredit.p132ui.WalletBindDepositUI.this
                cr3.g r8 = r8.getNetController()
                r0 = 5
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.tencent.mm.plugin.wxcredit.ui.WalletBindDepositUI r3 = com.tencent.p014mm.plugin.wxcredit.p132ui.WalletBindDepositUI.this
                com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r3.f211362d
                java.lang.String r3 = r3.getText()
                r0[r2] = r3
                com.tencent.mm.plugin.wxcredit.ui.WalletBindDepositUI r2 = com.tencent.p014mm.plugin.wxcredit.p132ui.WalletBindDepositUI.this
                com.tencent.mm.plugin.wallet_core.model.ElementQuery r3 = r2.f211367i
                java.lang.String r3 = r3.f209516s
                r0[r1] = r3
                r1 = 2
                com.tencent.mm.wallet_core.ui.formview.WalletFormView r2 = r2.f211363e
                java.lang.String r2 = r2.getText()
                r0[r1] = r2
                r1 = 3
                com.tencent.mm.plugin.wxcredit.ui.WalletBindDepositUI r2 = com.tencent.p014mm.plugin.wxcredit.p132ui.WalletBindDepositUI.this
                com.tencent.mm.plugin.wallet_core.model.ElementQuery r2 = r2.f211367i
                java.lang.String r2 = r2.f209519v
                r0[r1] = r2
                r1 = 4
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                r0[r1] = r2
                r8.mo91271d(r0)
            L_0x0091:
                java.lang.String r8 = "com/tencent/mm/plugin/wxcredit/ui/WalletBindDepositUI$2"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r7, r8, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wxcredit.p132ui.WalletBindDepositUI.C72648b.onClick(android.view.View):void");
        }
    }

    /* renamed from: H7 */
    public final void mo100089H7() {
        if (Util.isNullOrNil(this.f211367i.f209505e)) {
            this.f211364f.setText("");
        } else if (2 == this.f211367i.f209515r) {
            WalletFormView walletFormView = this.f211364f;
            walletFormView.setText(this.f211367i.f209505e + " " + getString(C0966R.string.krm));
        } else {
            WalletFormView walletFormView2 = this.f211364f;
            walletFormView2.setText(this.f211367i.f209505e + " " + getString(C0966R.string.ksc));
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cda;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.kne);
        WalletFormView walletFormView = (WalletFormView) findViewById(C0966R.C0970id.lfq);
        this.f211362d = walletFormView;
        C76024a.m91320a(walletFormView);
        this.f211364f = (WalletFormView) findViewById(C0966R.C0970id.lg7);
        WalletFormView walletFormView2 = (WalletFormView) findViewById(C0966R.C0970id.gvt);
        this.f211363e = walletFormView2;
        C76024a.m91325f(this, walletFormView2);
        this.f211365g = (Button) findViewById(C0966R.C0970id.hfe);
        setEditFocusListener(this.f211362d, 0, false);
        setEditFocusListener(this.f211363e, 0, false);
        this.f211364f.setOnClickListener(new C72647a());
        this.f211365g.setOnClickListener(new C72648b());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105924i("MicroMsg.WalletBindDepositUI", "onAcvityResult requestCode:" + i);
        if (i2 == -1 && i == 1) {
            ElementQuery elementQuery = (ElementQuery) intent.getParcelableExtra("elemt_query");
            if (elementQuery.mo99416b()) {
                this.f211367i = elementQuery;
                mo100089H7();
                return;
            }
            C76879j.m92738i(this, C0966R.string.knc, C0966R.string.a3h);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        r0 = r3.f232423c.getInt("key_support_bankcard", 1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onSceneEnd(int r3, int r4, java.lang.String r5, ob0.C117747y r6) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0087
            if (r4 != 0) goto L_0x0087
            boolean r3 = r6 instanceof v53.C78358z
            if (r3 == 0) goto L_0x0087
            v53.z r6 = (v53.C78358z) r6
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r3 = r6.f229622e
            if (r3 == 0) goto L_0x0087
            boolean r3 = r3.mo99416b()
            r4 = 2131821704(0x7f110488, float:1.9276159E38)
            r5 = 1
            if (r3 != 0) goto L_0x001f
            r3 = 2131838882(0x7f1147a2, float:1.9311E38)
            nj3.C76879j.m92738i(r2, r3, r4)
            return r5
        L_0x001f:
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r3 = r6.f229622e
            r2.f211367i = r3
            r2.mo100089H7()
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r3 = r2.f211367i
            boolean r6 = r3.f209513p
            if (r6 == 0) goto L_0x0039
            boolean r3 = r3.mo99417c()
            if (r3 == 0) goto L_0x0039
            r3 = 2131838850(0x7f114782, float:1.9310935E38)
            nj3.C76879j.m92738i(r2, r3, r4)
            return r5
        L_0x0039:
            yq3.e r3 = yq3.C79143a.m95768g(r2)
            if (r3 == 0) goto L_0x0083
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r6 = r2.f211367i
            int r6 = r6.f209495I
            android.os.Bundle r0 = r3.f232423c
            java.lang.String r1 = "key_support_bankcard"
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x004e
            goto L_0x0056
        L_0x004e:
            android.os.Bundle r0 = r3.f232423c
            int r0 = r0.getInt(r1, r5)
            if (r0 != 0) goto L_0x0058
        L_0x0056:
            r6 = 1
            goto L_0x005c
        L_0x0058:
            boolean r6 = com.tencent.p014mm.plugin.wallet_core.model.Bankcard.m84545t2(r0, r6)
        L_0x005c:
            if (r6 != 0) goto L_0x0083
            boolean r3 = r3.mo109116r()
            java.lang.String r6 = "MicroMsg.WalletBindDepositUI"
            if (r3 == 0) goto L_0x0072
            java.lang.String r3 = "Overseas user try to bind domestic card!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r3)
            r3 = 2131838774(0x7f114736, float:1.931078E38)
            nj3.C76879j.m92738i(r2, r3, r4)
            goto L_0x007d
        L_0x0072:
            java.lang.String r3 = "Domestic user try to bind international card!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r3)
            r3 = 2131838773(0x7f114735, float:1.9310779E38)
            nj3.C76879j.m92738i(r2, r3, r4)
        L_0x007d:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r3 = r2.f211362d
            r3.mo105071c()
            return r5
        L_0x0083:
            r2.mo100089H7()
            return r5
        L_0x0087:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wxcredit.p132ui.WalletBindDepositUI.onSceneEnd(int, int, java.lang.String, ob0.y):boolean");
    }
}
