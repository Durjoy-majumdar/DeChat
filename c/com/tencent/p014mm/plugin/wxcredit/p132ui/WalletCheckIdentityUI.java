package com.tencent.p014mm.plugin.wxcredit.p132ui;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import gr3.C76024a;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletCheckIdentityUI */
public class WalletCheckIdentityUI extends WalletBaseUI {

    /* renamed from: d */
    public WalletFormView f211370d;

    /* renamed from: e */
    public WalletFormView f211371e;

    /* renamed from: f */
    public String f211372f;

    /* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletCheckIdentityUI$a */
    public class C72649a implements View.OnClickListener {
        public C72649a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0070  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r8) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/wxcredit/ui/WalletCheckIdentityUI$1"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                com.tencent.mm.plugin.wxcredit.ui.WalletCheckIdentityUI r8 = com.tencent.p014mm.plugin.wxcredit.p132ui.WalletCheckIdentityUI.this
                com.tencent.mm.wallet_core.ui.formview.WalletFormView r8 = r8.f211370d
                java.lang.String r8 = r8.getText()
                com.tencent.mm.plugin.wxcredit.ui.WalletCheckIdentityUI r0 = com.tencent.p014mm.plugin.wxcredit.p132ui.WalletCheckIdentityUI.this
                com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r0.f211371e
                java.lang.String r0 = r0.getText()
                com.tencent.mm.plugin.wxcredit.ui.WalletCheckIdentityUI r1 = com.tencent.p014mm.plugin.wxcredit.p132ui.WalletCheckIdentityUI.this
                r1.getClass()
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0043
                r2 = 2131839007(0x7f11481f, float:1.9311253E38)
                android.widget.Toast r1 = nj3.C76912y0.makeText((android.content.Context) r1, (int) r2, (int) r4)
                r1.show()
                goto L_0x006d
            L_0x0043:
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r2 != 0) goto L_0x0063
                int r2 = r0.length()
                r5 = 4
                if (r2 < r5) goto L_0x0063
                java.lang.String r2 = r1.f211372f
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 == 0) goto L_0x0061
                com.tencent.mm.wallet_core.ui.formview.WalletFormView r2 = r1.f211371e
                boolean r2 = r2.mo105094l()
                if (r2 != 0) goto L_0x0061
                goto L_0x0063
            L_0x0061:
                r1 = 1
                goto L_0x006e
            L_0x0063:
                r2 = 2131838948(0x7f1147e4, float:1.9311134E38)
                android.widget.Toast r1 = nj3.C76912y0.makeText((android.content.Context) r1, (int) r2, (int) r4)
                r1.show()
            L_0x006d:
                r1 = 0
            L_0x006e:
                if (r1 == 0) goto L_0x0080
                com.tencent.mm.plugin.wxcredit.ui.WalletCheckIdentityUI r1 = com.tencent.p014mm.plugin.wxcredit.p132ui.WalletCheckIdentityUI.this
                cr3.g r1 = r1.getNetController()
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r4] = r8
                r2[r3] = r0
                r1.mo91271d(r2)
            L_0x0080:
                java.lang.String r8 = "com/tencent/mm/plugin/wxcredit/ui/WalletCheckIdentityUI$1"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r7, r8, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wxcredit.p132ui.WalletCheckIdentityUI.C72649a.onClick(android.view.View):void");
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cgv;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.kqs);
        WalletFormView walletFormView = (WalletFormView) findViewById(C0966R.C0970id.h_9);
        this.f211370d = walletFormView;
        C76024a.m91327h(this, walletFormView);
        WalletFormView walletFormView2 = (WalletFormView) findViewById(C0966R.C0970id.f358436f34);
        this.f211371e = walletFormView2;
        if (walletFormView2 == null) {
            Log.m105920e("MicroMsg.CommonHintViewConfig", "hy: param error");
        } else {
            walletFormView2.setLogicDelegate(new C76024a.C76033i(1, walletFormView2));
        }
        setEditFocusListener(this.f211371e, 1, false);
        String string = getInput().getString("key_pre_name");
        this.f211372f = getInput().getString("key_pre_indentity");
        if (!Util.isNullOrNil(string)) {
            this.f211370d.getPrefilledTv().setText(string);
            this.f211370d.setHint(getString(C0966R.string.kqh));
        }
        if (!Util.isNullOrNil(this.f211372f)) {
            this.f211371e.setMaxInputLength(4);
            this.f211371e.getPrefilledTv().setText(this.f211372f);
            this.f211371e.setHint(getString(C0966R.string.kp8));
        }
        findViewById(C0966R.C0970id.hfe).setOnClickListener(new C72649a());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
