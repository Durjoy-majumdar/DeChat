package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.kinda.gen.TraitsType;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71642m1;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71647n0;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71654w;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import cr3.C75283h;
import hp3.C87581a;
import j20.C117292a;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C9556a;
import kg3.C76577a;
import lp3.C88631d;
import lp3.C88633e;
import lp3.C88643g;
import nj3.C76879j;
import ob0.C117747y;
import qo3.C101218e0;
import te3.C64514l50;
import te3.C64705s9;
import te3.C77940he2;
import te3.C77969n9;
import te3.C78005vk3;
import te3.C78014xp3;
import te3.C78016y53;
import te3.w54;
import yq3.C79145c;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$m */
public class WalletLqtSaveFetchUI$$m extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ WalletLqtSaveFetchUI f208261g;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$m$a */
    public class C71772a implements C88631d.C76721a {

        /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$m$a$a */
        public class C71773a implements DialogInterface.OnClickListener {
            public C71773a(C71772a aVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "SAVE MMAlert Interrupt click");
            }
        }

        public C71772a() {
        }

        /* renamed from: a */
        public void mo1720a(Object obj) {
            Log.m105925i("MicroMsg.WalletLqtSaveFetchUI", "save failed: %s", obj);
            WalletLqtSaveFetchUI$$m.this.f208261g.getClass();
            if (obj != null) {
                C76879j.m92749t(WalletLqtSaveFetchUI$$m.this.f208261g, obj instanceof String ? obj.toString() : WalletLqtSaveFetchUI$$m.this.f208261g.getString(C0966R.string.kxh), "", new C71773a(this));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$m$b */
    public class C71774b implements C87581a<Void, C78005vk3> {

        /* renamed from: a */
        public final /* synthetic */ int f208263a;

        public C71774b(int i) {
            this.f208263a = i;
        }

        public Object call(Object obj) {
            C78005vk3 vk32 = (C78005vk3) obj;
            if (vk32 == null) {
                Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "save failed, qryPurchaseResultRes is null");
                return null;
            }
            Log.m105925i("MicroMsg.WalletLqtSaveFetchUI", "save finish: %s", Integer.valueOf(vk32.f228319f));
            WalletLqtSaveFetchUI$$m.this.f208261g.mo98981T7();
            Intent intent = new Intent(WalletLqtSaveFetchUI$$m.this.f208261g, WalletLqtSaveFetchFinishUI.class);
            intent.putExtra("key_amount", C75228t.m90250i("" + this.f208263a, "100", 2, RoundingMode.HALF_UP));
            intent.putExtra("key_mode", 1);
            intent.putExtra("profile_date_wording", vk32.f228321h);
            intent.putExtra("profile_upgrade_wording", vk32.f228320g);
            C77940he2 he22 = vk32.f228322i;
            if (he22 != null) {
                try {
                    intent.putExtra("key_guide_cell", he22.toByteArray());
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.WalletLqtSaveFetchUI", e, "", new Object[0]);
                }
            }
            if (!Util.isNullOrNil(vk32.f228323j)) {
                intent.putExtra("KEY_Purchase_Result_Wording", vk32.f228323j);
            }
            if (!Util.isNullOrNil(vk32.f228324n)) {
                intent.putExtra("KEY_Confirm_Result_Wording", vk32.f228324n);
            }
            intent.putExtra("entrance_type", WalletLqtSaveFetchUI$$m.this.f208261g.getIntent().getIntExtra("entrance_type", 0));
            if (WalletLqtSaveFetchUI$$m.this.f208261g.getIntent().getIntExtra("is_from_kinda_balance", 0) == 1) {
                intent.putExtra("is_from_kinda_balance", 1);
                WalletLqtSaveFetchUI$$m.this.f208261g.startActivityForResult(intent, 4097);
                return null;
            }
            WalletLqtSaveFetchUI walletLqtSaveFetchUI = WalletLqtSaveFetchUI$$m.this.f208261g;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            WalletLqtSaveFetchUI walletLqtSaveFetchUI2 = walletLqtSaveFetchUI;
            C117292a.m165358d(walletLqtSaveFetchUI2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI$31$2", "call", "(Lcom/tencent/mm/protocal/protobuf/QryPurchaseResultRes;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            walletLqtSaveFetchUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(walletLqtSaveFetchUI2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI$31$2", "call", "(Lcom/tencent/mm/protocal/protobuf/QryPurchaseResultRes;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            WalletLqtSaveFetchUI$$m.this.f208261g.finish();
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$m$c */
    public class C71775c implements C88631d.C76721a {

        /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$m$c$a */
        public class C71776a implements DialogInterface.OnClickListener {
            public C71776a(C71775c cVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "fetch MMAlert Interrupt click");
            }
        }

        public C71775c() {
        }

        /* renamed from: a */
        public void mo1720a(Object obj) {
            WalletLqtSaveFetchUI walletLqtSaveFetchUI = WalletLqtSaveFetchUI$$m.this.f208261g;
            boolean z = false;
            walletLqtSaveFetchUI.f208172S0 = false;
            walletLqtSaveFetchUI.getClass();
            if (obj != null) {
                boolean z2 = obj instanceof C78014xp3;
                if (z2) {
                    C78014xp3 xp32 = (C78014xp3) obj;
                    z = C75283h.m90311a(WalletLqtSaveFetchUI$$m.this.f208261g, (C117747y) null, 1000, xp32.f228521d, xp32.f228522e);
                }
                if (!z) {
                    C76879j.m92749t(WalletLqtSaveFetchUI$$m.this.f208261g, obj instanceof String ? obj.toString() : z2 ? ((C78014xp3) obj).f228522e : WalletLqtSaveFetchUI$$m.this.f208261g.getString(C0966R.string.kxh), "", new C71776a(this));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$m$d */
    public class C71777d implements C87581a<Void, C78014xp3> {

        /* renamed from: a */
        public final /* synthetic */ int f208266a;

        public C71777d(int i) {
            this.f208266a = i;
        }

        public Object call(Object obj) {
            C78014xp3 xp32 = (C78014xp3) obj;
            Log.m105925i("MicroMsg.WalletLqtSaveFetchUI", "redeem succ: %s, is_realtime_arrivial: %s, is_redeem_into_pocket: %s", xp32, Boolean.valueOf(xp32.f228523f), Boolean.valueOf(xp32.f228524g));
            WalletLqtSaveFetchUI$$m.this.f208261g.mo98981T7();
            if (!xp32.f228523f || !xp32.f228524g) {
                Intent intent = new Intent(WalletLqtSaveFetchUI$$m.this.f208261g, WalletLqtSaveFetchFinishProgressNewUI.class);
                try {
                    intent.putExtra("key_redeem_res", xp32.toByteArray());
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.WalletLqtSaveFetchUI", e, "pass redeemFundRes error: %s", e.getMessage());
                }
                WalletLqtSaveFetchUI walletLqtSaveFetchUI = WalletLqtSaveFetchUI$$m.this.f208261g;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                WalletLqtSaveFetchUI walletLqtSaveFetchUI2 = walletLqtSaveFetchUI;
                C117292a.m165358d(walletLqtSaveFetchUI2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI$31$4", "call", "(Lcom/tencent/mm/protocal/protobuf/RedeemFundRes;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                walletLqtSaveFetchUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(walletLqtSaveFetchUI2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI$31$4", "call", "(Lcom/tencent/mm/protocal/protobuf/RedeemFundRes;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                Intent intent2 = new Intent(WalletLqtSaveFetchUI$$m.this.f208261g, WalletLqtSaveFetchFinishUI.class);
                intent2.putExtra("key_amount", C75228t.m90250i("" + this.f208266a, "100", 2, RoundingMode.HALF_UP));
                intent2.putExtra("key_mode", 2);
                WalletLqtSaveFetchUI walletLqtSaveFetchUI3 = WalletLqtSaveFetchUI$$m.this.f208261g;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent2);
                WalletLqtSaveFetchUI walletLqtSaveFetchUI4 = walletLqtSaveFetchUI3;
                C117292a.m165358d(walletLqtSaveFetchUI4, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI$31$4", "call", "(Lcom/tencent/mm/protocal/protobuf/RedeemFundRes;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                walletLqtSaveFetchUI3.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(walletLqtSaveFetchUI4, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI$31$4", "call", "(Lcom/tencent/mm/protocal/protobuf/RedeemFundRes;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            WalletLqtSaveFetchUI$$m.this.f208261g.finish();
            return null;
        }
    }

    public WalletLqtSaveFetchUI$$m(WalletLqtSaveFetchUI walletLqtSaveFetchUI) {
        this.f208261g = walletLqtSaveFetchUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        C77969n9 n9Var;
        int i;
        LinkedList<C64705s9> linkedList;
        int i2;
        if (Util.ticksToNow(this.f208261g.f208175U) < 800) {
            Log.m105918d("MicroMsg.WalletLqtSaveFetchUI", "saveButton click too soon");
            return;
        }
        this.f208261g.f208175U = Util.currentTicks();
        WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f208261g;
        int S7 = walletLqtSaveFetchUI.mo98980S7(walletLqtSaveFetchUI.f208199i.getText(), "100");
        if (S7 > 0) {
            this.f208261g.hideWcKb();
            int i3 = this.f208261g.f208173T;
            int i4 = 1;
            if (i3 == 1) {
                Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "click save lqt");
                if (!this.f208261g.mo98988a8(C71654w.f207659q.f207673l)) {
                    WalletLqtSaveFetchUI walletLqtSaveFetchUI2 = this.f208261g;
                    C71642m1.C71644c cVar = walletLqtSaveFetchUI2.f208195g.f207643b;
                    int i5 = walletLqtSaveFetchUI2.f208208p0;
                    Bankcard bankcard = walletLqtSaveFetchUI2.f208177V;
                    cVar.getClass();
                    ((C88633e) C88643g.m110549g(Integer.valueOf(S7), Integer.valueOf(i5), bankcard)).mo123061d(cVar).mo123062e(new C71774b(S7)).mo123065b(new C71772a());
                }
            } else if (i3 == 2) {
                Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "click fetch lqt");
                if (!this.f208261g.mo98988a8(C71654w.f207659q.f207674m)) {
                    Bankcard bankcard2 = this.f208261g.f208177V;
                    ViewGroup viewGroup = null;
                    if (bankcard2 == null || bankcard2.mo99388n2()) {
                        n9Var = null;
                    } else {
                        n9Var = new C77969n9();
                        Bankcard bankcard3 = this.f208261g.f208177V;
                        n9Var.f227883f = bankcard3.field_bankName;
                        n9Var.f227882e = bankcard3.field_bankcardType;
                        n9Var.f227881d = bankcard3.field_bindSerial;
                        n9Var.f227884g = bankcard3.field_bankcardTail;
                    }
                    boolean z = false;
                    int i6 = this.f208261g.f208159H.getSelectRedeemType() != null ? this.f208261g.f208159H.getSelectRedeemType().f186579d : 0;
                    Bankcard bankcard4 = this.f208261g.f208177V;
                    if (bankcard4 != null && !bankcard4.mo99388n2()) {
                        Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "choose bankcard");
                        int X = C75228t.m90231X(this.f208261g.f208199i.getText(), "100");
                        int i7 = C71647n0.m84120b().mo98815a().f228564t;
                        if (i7 >= 0 && X > i7) {
                            Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "choose slow redeem");
                            WalletLqtSaveFetchUI walletLqtSaveFetchUI3 = this.f208261g;
                            walletLqtSaveFetchUI3.getClass();
                            Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "showHalfBottomDialogForSlowRedeem");
                            C78016y53 a = C71647n0.m84120b().mo98815a();
                            if (a == null || (linkedList = a.f228559o) == null) {
                                Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "showHalfBottomDialogForSlowRedeem res == null ||  res.redeem_displayed_info == null");
                                return;
                            }
                            Iterator<C64705s9> it = linkedList.iterator();
                            while (it.hasNext()) {
                                C64705s9 next = it.next();
                                if (next.f185386d.equals(walletLqtSaveFetchUI3.f208177V.field_bindSerial)) {
                                    Log.m105918d("MicroMsg.WalletLqtSaveFetchUI", "show bankcard arrive time");
                                    walletLqtSaveFetchUI3.f208159H.mo98907a(next.f185387e, z);
                                    w54 w54 = next.f185388f;
                                    walletLqtSaveFetchUI3.hideTenpayKB();
                                    walletLqtSaveFetchUI3.hideWcKb();
                                    C101218e0 e0Var = new C101218e0(walletLqtSaveFetchUI3.getContext(), i4, 3);
                                    e0Var.mo140667n(walletLqtSaveFetchUI3.getString(C0966R.string.kwv), walletLqtSaveFetchUI3.getString(C0966R.string.kxb));
                                    C43346j2 j2Var = new C43346j2(walletLqtSaveFetchUI3, e0Var);
                                    C71805k2 k2Var = new C71805k2(walletLqtSaveFetchUI3, e0Var);
                                    e0Var.f296373D = j2Var;
                                    e0Var.f296374E = k2Var;
                                    View inflate = View.inflate(walletLqtSaveFetchUI3.getContext(), C0966R.C0971layout.b8u, viewGroup);
                                    ((TextView) inflate.findViewById(C0966R.C0970id.et6)).setText(w54.f186060d);
                                    e0Var.mo140672r(inflate);
                                    LinearLayout linearLayout = new LinearLayout(walletLqtSaveFetchUI3);
                                    linearLayout.setOrientation(i4);
                                    LinkedList<C64514l50> linkedList2 = w54.f186062f;
                                    int i8 = C0966R.C0971layout.b8s;
                                    int i9 = C0966R.C0970id.f358384et2;
                                    if (linkedList2 == null || linkedList2.size() <= 0) {
                                        Iterator<C64514l50> it4 = w54.f186061e.iterator();
                                        while (it4.hasNext()) {
                                            C64514l50 next2 = it4.next();
                                            if (!(next2 == null || next2.f184038d == null)) {
                                                C71811m2 m2Var = new C71811m2(walletLqtSaveFetchUI3, next2);
                                                LinearLayout linearLayout2 = (LinearLayout) View.inflate(walletLqtSaveFetchUI3, C0966R.C0971layout.b8s, (ViewGroup) null);
                                                walletLqtSaveFetchUI3.mo98983V7(next2.f184038d, next2.f184039e, next2.f184040f, (TextView) linearLayout2.findViewById(C0966R.C0970id.f358384et2), m2Var);
                                                linearLayout.addView(linearLayout2);
                                            }
                                        }
                                        viewGroup = null;
                                    } else {
                                        int i15 = 0;
                                        while (i15 < w54.f186062f.size()) {
                                            C64514l50 l502 = w54.f186062f.get(i15);
                                            if (l502 == null) {
                                                i2 = i15;
                                            } else {
                                                C71809l2 l2Var = new C71809l2(walletLqtSaveFetchUI3, l502, e0Var);
                                                if (i15 < w54.f186062f.size() - i4) {
                                                    LinearLayout linearLayout3 = (LinearLayout) View.inflate(walletLqtSaveFetchUI3, i8, viewGroup);
                                                    ((TextView) linearLayout3.findViewById(C0966R.C0970id.f358385et3)).setVisibility(8);
                                                    i2 = i15;
                                                    walletLqtSaveFetchUI3.mo98983V7(l502.f184038d, l502.f184039e, l502.f184040f, (TextView) linearLayout3.findViewById(i9), l2Var);
                                                    linearLayout.addView(linearLayout3);
                                                } else {
                                                    i2 = i15;
                                                    LinearLayout linearLayout4 = (LinearLayout) View.inflate(walletLqtSaveFetchUI3, C0966R.C0971layout.b8t, viewGroup);
                                                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                                    layoutParams.topMargin = C76577a.m92151b(walletLqtSaveFetchUI3, 24);
                                                    ((TextView) linearLayout4.findViewById(C0966R.C0970id.et5)).setText(l502.f184038d);
                                                    TextView textView = (TextView) linearLayout4.findViewById(C0966R.C0970id.et4);
                                                    walletLqtSaveFetchUI3.mo98983V7("", l502.f184039e, l502.f184040f, textView, l2Var);
                                                    textView.setAccessibilityDelegate(new C79145c(TraitsType.BUTTON));
                                                    linearLayout.addView(linearLayout4, layoutParams);
                                                }
                                            }
                                            i15 = i2 + 1;
                                            i4 = 1;
                                            viewGroup = null;
                                            i9 = C0966R.C0970id.f358384et2;
                                            i8 = C0966R.C0971layout.b8s;
                                        }
                                    }
                                    e0Var.mo140663j(linearLayout);
                                    e0Var.mo140655A();
                                    walletLqtSaveFetchUI3.f208159H.setVisibility(4);
                                    C115669n.INSTANCE.mo160131h(20287, 4);
                                }
                                i4 = 1;
                                z = false;
                            }
                            return;
                        } else if (i7 >= 0 && X < i7) {
                            Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "choose fast redeem");
                            i = 0;
                            WalletLqtSaveFetchUI walletLqtSaveFetchUI4 = this.f208261g;
                            C71642m1.C71643a aVar = walletLqtSaveFetchUI4.f208195g.f207644c;
                            int i16 = walletLqtSaveFetchUI4.f208208p0;
                            aVar.getClass();
                            ((C88633e) C88643g.m110550h(Integer.valueOf(S7), Integer.valueOf(i16), Integer.valueOf(i), n9Var)).mo123061d(aVar).mo123062e(new C71777d(S7)).mo123065b(new C71775c());
                        }
                    }
                    i = i6;
                    WalletLqtSaveFetchUI walletLqtSaveFetchUI42 = this.f208261g;
                    C71642m1.C71643a aVar2 = walletLqtSaveFetchUI42.f208195g.f207644c;
                    int i162 = walletLqtSaveFetchUI42.f208208p0;
                    aVar2.getClass();
                    ((C88633e) C88643g.m110550h(Integer.valueOf(S7), Integer.valueOf(i162), Integer.valueOf(i), n9Var)).mo123061d(aVar2).mo123062e(new C71777d(S7)).mo123065b(new C71775c());
                }
            }
        }
    }
}
