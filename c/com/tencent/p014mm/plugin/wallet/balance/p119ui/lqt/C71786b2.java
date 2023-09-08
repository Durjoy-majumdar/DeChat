package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71647n0;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71652v;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71654w;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import java.util.LinkedList;
import qo3.C101218e0;
import te3.C51892wy;
import te3.C64557mj3;
import te3.C77977pf3;
import te3.C78016y53;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.b2 */
public class C71786b2 implements TextView.OnEditorActionListener {

    /* renamed from: d */
    public final /* synthetic */ WalletLqtSaveFetchUI f208316d;

    public C71786b2(WalletLqtSaveFetchUI walletLqtSaveFetchUI) {
        this.f208316d = walletLqtSaveFetchUI;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        C64557mj3 mj32;
        int i2;
        C77977pf3 pf32;
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66) {
            Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "click enter");
            WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f208316d;
            if (walletLqtSaveFetchUI.f208173T == 2) {
                long Y = C75228t.m90232Y(walletLqtSaveFetchUI.f208199i.getText() + "", "100");
                Bankcard bankcard = walletLqtSaveFetchUI.f208177V;
                boolean z = bankcard != null && bankcard.mo99388n2();
                C78016y53 a = C71647n0.m84120b().mo98815a();
                if (Y > 0 && z && walletLqtSaveFetchUI.f208173T == 2 && a != null && a.f228566v != null) {
                    int intExtra = walletLqtSaveFetchUI.getIntent().getIntExtra("lqt_balance", 0);
                    int i3 = a.f228555h;
                    Log.m105925i("MicroMsg.WalletLqtSaveFetchUI", "showFetchToBalanceTips, lqtBalance: %s, bankBalance: %s", Integer.valueOf(intExtra), Integer.valueOf(i3));
                    long j = (long) (intExtra - i3);
                    if (Y > j) {
                        C77977pf3 pf33 = a.f228566v;
                        C51892wy wyVar = pf33.f228013g;
                        if (wyVar == null || TextUtils.isEmpty(wyVar.f144345d)) {
                            pf32 = pf33;
                        } else {
                            String str = wyVar.f144345d;
                            long j2 = Y - j;
                            C77977pf3 pf34 = pf33;
                            double max = Math.max(((double) j2) / 1000.0d, 10.0d);
                            String n = C75228t.m90260n(walletLqtSaveFetchUI.mo98975N7(j2 + "", "100", 2));
                            walletLqtSaveFetchUI.f208180W0 = n;
                            try {
                                str = String.format(str, new Object[]{n, C75228t.m90260n(walletLqtSaveFetchUI.mo98975N7(max + "", "100", 2))});
                            } catch (Exception unused) {
                            }
                            C51892wy wyVar2 = new C51892wy();
                            wyVar2.f144349h = wyVar.f144349h;
                            wyVar2.f144348g = wyVar.f144348g;
                            wyVar2.f144346e = wyVar.f144346e;
                            wyVar2.f144347f = wyVar.f144347f;
                            wyVar2.f144345d = str;
                            pf32 = new C77977pf3();
                            C77977pf3 pf35 = pf34;
                            pf32.f228014h = pf35.f228014h;
                            pf32.f228015i = pf35.f228015i;
                            pf32.f228010d = pf35.f228010d;
                            pf32.f228011e = pf35.f228011e;
                            pf32.f228012f = pf35.f228012f;
                            pf32.f228013g = wyVar2;
                        }
                        walletLqtSaveFetchUI.hideWcKb();
                        C115669n.INSTANCE.mo160131h(20287, 11);
                        C71652v.C71653a aVar = new C71652v.C71653a();
                        aVar.f207657a = pf32;
                        aVar.f207658b = 12;
                        C71652v vVar = new C71652v(aVar);
                        C71652v.C71653a aVar2 = new C71652v.C71653a();
                        aVar2.f207657a = a.f228567w;
                        C101218e0 Y7 = walletLqtSaveFetchUI.mo98986Y7((C71652v) null, vVar, new C71652v(aVar2));
                        walletLqtSaveFetchUI.mo98974M7(Y7, vVar);
                        Y7.mo140655A();
                        C115669n.INSTANCE.mo160131h(20287, 2);
                        return true;
                    }
                }
                View.OnClickListener onClickListener = walletLqtSaveFetchUI.f208196g1;
                if (onClickListener != null) {
                    onClickListener.onClick((View) null);
                }
                C115669n.INSTANCE.mo160131h(20287, 2);
                return true;
            }
            long Y2 = C75228t.m90232Y(walletLqtSaveFetchUI.f208199i.getText() + "", "100");
            if (Y2 == 0) {
                View.OnClickListener onClickListener2 = walletLqtSaveFetchUI.f208196g1;
                if (onClickListener2 == null) {
                    return true;
                }
                onClickListener2.onClick((View) null);
                return true;
            } else if (walletLqtSaveFetchUI.f208173T != 1) {
                View.OnClickListener onClickListener3 = walletLqtSaveFetchUI.f208196g1;
                if (onClickListener3 == null) {
                    return true;
                }
                onClickListener3.onClick((View) null);
                return true;
            } else if (C71654w.f207659q.f207676o == null) {
                View.OnClickListener onClickListener4 = walletLqtSaveFetchUI.f208196g1;
                if (onClickListener4 == null) {
                    return true;
                }
                onClickListener4.onClick((View) null);
                return true;
            } else {
                int i4 = 0;
                while (true) {
                    C71654w wVar = C71654w.f207659q;
                    if (i4 >= wVar.f207676o.size()) {
                        mj32 = null;
                        break;
                    }
                    mj32 = wVar.f207676o.get(i4);
                    if (Y2 >= mj32.f184338d && Y2 < mj32.f184339e) {
                        LinkedList<String> linkedList = mj32.f184341g;
                        if (linkedList == null || linkedList.size() <= 0) {
                            break;
                        }
                        Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "has tmpDialog.bind_serial_list");
                        if (mj32.f184341g.contains(walletLqtSaveFetchUI.f208177V.field_bindSerial)) {
                            Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "contain tmpDialog.bind_serial_list");
                            i2 = 100;
                            C115669n.INSTANCE.mo160131h(17084, 30, Long.valueOf(Y2));
                            walletLqtSaveFetchUI.f208172S0 = true;
                            break;
                        }
                    }
                    i4++;
                }
                i2 = 0;
                if (mj32 == null) {
                    View.OnClickListener onClickListener5 = walletLqtSaveFetchUI.f208196g1;
                    if (onClickListener5 == null) {
                        return true;
                    }
                    onClickListener5.onClick((View) null);
                    return true;
                }
                Log.m105925i("MicroMsg.WalletLqtSaveFetchUI", "should show dialog with amount from %d to %d, with wording : %s", Long.valueOf(mj32.f184338d), Long.valueOf(mj32.f184339e), mj32.f184340f.f228013g.f144345d);
                walletLqtSaveFetchUI.hideWcKb();
                C71652v.C71653a aVar3 = new C71652v.C71653a();
                aVar3.f207657a = mj32.f184340f;
                aVar3.f207658b = i2;
                C71652v vVar2 = new C71652v(aVar3);
                C101218e0 Y72 = walletLqtSaveFetchUI.mo98986Y7((C71652v) null, vVar2, (C71652v) null);
                walletLqtSaveFetchUI.mo98974M7(Y72, vVar2);
                Y72.mo140655A();
                return true;
            }
        } else {
            return true;
        }
    }
}
