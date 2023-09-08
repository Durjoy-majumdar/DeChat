package com.tencent.p014mm.plugin.order.p889ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.order.model.MallTransactionObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75218i;
import com.tencent.p014mm.wallet_core.p137ui.WalletPreferenceUI;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import nd2.C76852b;
import nj3.C76879j;
import pd2.C77082f;
import pj3.C47511g;
import yq3.C79143a;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.order.ui.MallOrderTransactionInfoUI */
public class MallOrderTransactionInfoUI extends WalletPreferenceUI {

    /* renamed from: g */
    public C47511g f202250g;

    /* renamed from: h */
    public MallTransactionObject f202251h = null;

    /* renamed from: i */
    public C75218i f202252i;

    /* renamed from: com.tencent.mm.plugin.order.ui.MallOrderTransactionInfoUI$a */
    public class C70071a implements DialogInterface.OnClickListener {
        public C70071a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            MallOrderTransactionInfoUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.order.ui.MallOrderTransactionInfoUI$b */
    public class C70072b implements MenuItem.OnMenuItemClickListener {
        public C70072b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            MallOrderTransactionInfoUI.this.finish();
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: sd2.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: sd2.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: sd2.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: sd2.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: sd2.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: I7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo94696I7(int r5, int r6, java.lang.String r7, ob0.C117747y r8) {
        /*
            r4 = this;
            r7 = 0
            if (r5 != 0) goto L_0x0066
            if (r6 != 0) goto L_0x0066
            boolean r5 = r8 instanceof pd2.C77082f
            r6 = 1
            if (r5 == 0) goto L_0x0065
            pd2.f r8 = (pd2.C77082f) r8
            com.tencent.mm.plugin.order.model.MallOrderDetailObject r5 = r8.f225146d
            if (r5 == 0) goto L_0x0065
            com.tencent.mm.plugin.order.model.MallTransactionObject r5 = r5.f202072a
            r4.f202251h = r5
            pj3.g r5 = r4.f202250g
            r5.removeAll()
            androidx.appcompat.app.AppCompatActivity r5 = r4.getContext()
            pj3.g r8 = r4.f202250g
            com.tencent.mm.plugin.order.model.MallTransactionObject r0 = r4.f202251h
            java.lang.Object[] r1 = new java.lang.Object[r6]
            com.tencent.mm.wallet_core.ui.i r2 = r4.f202252i
            r1[r7] = r2
            if (r0 != 0) goto L_0x002b
            r5 = 0
            goto L_0x004a
        L_0x002b:
            int r2 = r0.f202126e
            r3 = 21
            if (r2 == r3) goto L_0x0041
            sd2.a r2 = new sd2.a
            r2.<init>()
            r1 = r1[r7]
            boolean r3 = r1 instanceof com.tencent.p014mm.wallet_core.p137ui.C75218i
            if (r3 == 0) goto L_0x0046
            com.tencent.mm.wallet_core.ui.i r1 = (com.tencent.p014mm.wallet_core.p137ui.C75218i) r1
            r2.f226363a = r1
            goto L_0x0046
        L_0x0041:
            sd2.b r2 = new sd2.b
            r2.<init>()
        L_0x0046:
            java.util.List r5 = r2.mo107389a(r5, r8, r0)
        L_0x004a:
            if (r5 == 0) goto L_0x0060
        L_0x004c:
            int r8 = r5.size()
            if (r7 >= r8) goto L_0x0060
            java.lang.Object r8 = r5.get(r7)
            com.tencent.mm.ui.base.preference.Preference r8 = (com.tencent.p014mm.p136ui.base.preference.Preference) r8
            pj3.g r0 = r4.f202250g
            r0.mo72527k(r8)
            int r7 = r7 + 1
            goto L_0x004c
        L_0x0060:
            pj3.g r5 = r4.f202250g
            r5.notifyDataSetChanged()
        L_0x0065:
            return r6
        L_0x0066:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.order.p889ui.MallOrderTransactionInfoUI.mo94696I7(int, int, java.lang.String, ob0.y):boolean");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bax;
    }

    public int getResourceId() {
        return C0966R.xml.f8915b_;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.gni);
        setBackBtn(new C70072b());
        this.f202250g = getPreferenceScreen();
        C75218i iVar = new C75218i(this, false);
        this.f202252i = iVar;
        iVar.mo105147a();
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        C79148e g = C79143a.m95768g(this);
        String str2 = null;
        if (g != null && (g instanceof C76852b)) {
            Bundle e = C79143a.m95766e(this);
            if (e == null) {
                e = new Bundle();
            }
            str2 = e.getString("key_trans_id");
            Bundle e2 = C79143a.m95766e(this);
            if (e2 == null) {
                e2 = new Bundle();
            }
            str = e2.getString("bill_id");
        } else if (getIntent().getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0) == 1 || getIntent().getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0) == 2) {
            str2 = getIntent().getStringExtra("trans_id");
            str = getIntent().getStringExtra("bill_id");
        } else {
            str = null;
        }
        if (Util.isNullOrNil(str2)) {
            Log.m105928w(MMPreference.TAG, "mOrders info is Illegal!");
            C76879j.m92742m(getContext(), C0966R.string.l0d, 0, new C70071a());
        }
        Bundle e3 = C79143a.m95766e(this);
        if (e3 == null) {
            e3 = new Bundle();
        }
        e3.getInt("key_pay_type");
        initView();
        mo105011H7().mo105625d(new C77082f(str2, str, -1), true);
    }

    public void onDestroy() {
        super.onDestroy();
        C75218i iVar = this.f202252i;
        if (iVar != null) {
            iVar.mo105148b();
        }
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        return false;
    }
}
