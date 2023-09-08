package com.tencent.p014mm.plugin.remittance.bankcard.p096ui;

import android.content.Context;
import android.os.Bundle;
import android.widget.AdapterView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import ob0.C117747y;
import p910lj.C76701a;
import qj3.C47864f;
import si2.C48387g;
import te3.C50881pv1;
import te3.C51360t9;
import ti2.C52344b;
import ti2.C78028a;

/* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectBankUI */
public class BankRemitSelectBankUI extends BankRemitBaseUI {

    /* renamed from: e */
    public BankRemitSortView f115942e;

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectBankUI$a */
    public class C42814a implements AdapterView.OnItemClickListener {
        public C42814a() {
        }

        /* JADX WARNING: type inference failed for: r8v0, types: [android.widget.AdapterView<?>, java.lang.Object, android.widget.AdapterView] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onItemClick(android.widget.AdapterView<?> r8, android.view.View r9, int r10, long r11) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                r0.add(r9)
                java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
                r0.add(r9)
                java.lang.Long r9 = java.lang.Long.valueOf(r11)
                r0.add(r9)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitSelectBankUI$1"
                java.lang.String r2 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r3 = "onItemClick"
                java.lang.String r4 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                android.widget.Adapter r8 = r8.getAdapter()
                java.lang.Object r8 = r8.getItem(r10)
                qj3.f r8 = (qj3.C47864f) r8
                java.lang.Object r8 = r8.f128466b
                te3.t9 r8 = (te3.C51360t9) r8
                if (r8 == 0) goto L_0x0058
                com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel r9 = new com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel
                r9.<init>((te3.C51360t9) r8)
                android.content.Intent r8 = new android.content.Intent
                r8.<init>()
                java.lang.String r10 = "key_bank_card_elem_parcel"
                r8.putExtra(r10, r9)
                com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectBankUI r9 = com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitSelectBankUI.this
                r10 = -1
                r9.setResult(r10, r8)
                com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectBankUI r8 = com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitSelectBankUI.this
                r8.finish()
                goto L_0x0069
            L_0x0058:
                r8 = 1
                java.lang.Object[] r8 = new java.lang.Object[r8]
                r9 = 0
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r8[r9] = r10
                java.lang.String r9 = "MicroMsg.BankRemitSelectBankUI"
                java.lang.String r10 = "bankcardelem is null, : %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r9, r10, r8)
            L_0x0069:
                java.lang.String r8 = "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitSelectBankUI$1"
                java.lang.String r9 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r10 = "onItemClick"
                java.lang.String r11 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                j20.C117292a.m165361g(r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitSelectBankUI.C42814a.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectBankUI$b */
    public class C42815b implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C48387g f115944a;

        public C42815b(C48387g gVar) {
            this.f115944a = gVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            Log.m105921e("MicroMsg.BankRemitSelectBankUI", "response error: %s, %s", Integer.valueOf(this.f115944a.f129522s.f139998d), this.f115944a.f129522s.f139999e);
            if (!Util.isNullOrNil(this.f115944a.f129522s.f139999e)) {
                C76701a.makeText((Context) BankRemitSelectBankUI.this, (CharSequence) this.f115944a.f129522s.f139999e, 1).show();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectBankUI$c */
    public class C42816c implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C48387g f115946a;

        public C42816c(C48387g gVar) {
            this.f115946a = gVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            String str2;
            ArrayList arrayList = new ArrayList();
            C50881pv1 pv12 = this.f115946a.f129522s;
            LinkedList<C51360t9> linkedList = pv12.f140001g;
            LinkedList<C51360t9> linkedList2 = pv12.f140000f;
            C52344b bVar = new C52344b();
            if (linkedList != null && !linkedList.isEmpty()) {
                Log.m105925i("MicroMsg.BankRemitSelectBankUI", "freq card count: %s", Integer.valueOf(linkedList2.size()));
                for (C51360t9 t9Var : linkedList) {
                    C47864f fVar = new C47864f();
                    fVar.f128465a = "☆";
                    fVar.f128466b = t9Var;
                    arrayList.add(fVar);
                }
            }
            if (linkedList2 != null && !linkedList2.isEmpty()) {
                Log.m105925i("MicroMsg.BankRemitSelectBankUI", "card count: %s", Integer.valueOf(linkedList2.size()));
                Collections.sort(linkedList2, bVar);
                for (C51360t9 next : linkedList2) {
                    if (!Util.isNullOrNil(next.f142040e)) {
                        if (!Util.isNullOrNil(next.f142048p)) {
                            Log.m105925i("MicroMsg.BankRemitSelectBankUI", "use sort pingyin: %s", next.f142048p);
                            str2 = "" + next.f142048p.toUpperCase().charAt(0);
                        } else {
                            str2 = "" + C78028a.m94174b(next.f142040e, '#', true);
                        }
                        C47864f fVar2 = new C47864f();
                        fVar2.f128465a = str2;
                        fVar2.f128466b = next;
                        arrayList.add(fVar2);
                    }
                }
            }
            BankRemitSelectBankUI.this.f115942e.mo69938e(arrayList);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6558i_;
    }

    public void initView() {
        BankRemitSortView bankRemitSortView = (BankRemitSortView) findViewById(C0966R.C0970id.akr);
        this.f115942e = bankRemitSortView;
        bankRemitSortView.setOnItemClickListener(new C42814a());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.ai5);
        addSceneEndListener(1399);
        initView();
        Log.m105924i("MicroMsg.BankRemitSelectBankUI", "do fetch data");
        C48387g gVar = new C48387g();
        gVar.mo104821m1(this);
        doSceneProgress(gVar);
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1399);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C48387g) {
            C48387g gVar = (C48387g) yVar;
            gVar.mo104823q1(new C42816c(gVar));
            gVar.mo104820l1(new C42815b(gVar));
            if (gVar.f221039i) {
                Log.m105921e("MicroMsg.BankRemitSelectBankUI", "net error: %s", gVar);
            }
        }
        return false;
    }
}
