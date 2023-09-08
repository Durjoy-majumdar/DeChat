package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import java.util.Iterator;
import java.util.LinkedList;
import qo3.C101218e0;
import te3.C64514l50;
import te3.C78016y53;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$s */
public class WalletLqtSaveFetchUI$$s implements C7092q.C7093a {

    /* renamed from: a */
    public final /* synthetic */ C78016y53 f208283a;

    /* renamed from: b */
    public final /* synthetic */ WalletLqtSaveFetchUI f208284b;

    public WalletLqtSaveFetchUI$$s(WalletLqtSaveFetchUI walletLqtSaveFetchUI, C78016y53 y532) {
        this.f208284b = walletLqtSaveFetchUI;
        this.f208283a = y532;
    }

    public void onClick(View view) {
        LinkedList<C64514l50> linkedList;
        String str;
        WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f208284b;
        C78016y53 y532 = this.f208283a;
        int i = WalletLqtSaveFetchUI.f208151m1;
        walletLqtSaveFetchUI.getClass();
        if (y532 != null && (linkedList = y532.f228556i) != null && !linkedList.isEmpty()) {
            Iterator<C64514l50> it = y532.f228556i.iterator();
            String str2 = "";
            String str3 = str2;
            while (it.hasNext()) {
                C64514l50 next = it.next();
                if (!(next == null || (str = next.f184038d) == null)) {
                    str3 = next.f184039e;
                    str2 = str;
                }
            }
            C101218e0 e0Var = new C101218e0(walletLqtSaveFetchUI.getContext(), 2, 3);
            e0Var.mo140677w(walletLqtSaveFetchUI.getResources().getString(C0966R.string.f8028zq));
            e0Var.mo140676v(1);
            e0Var.f296375F = new C71797f2(walletLqtSaveFetchUI, e0Var);
            View inflate = View.inflate(walletLqtSaveFetchUI.getContext(), C0966R.C0971layout.b8r, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.et6);
            if (!Util.isNullOrNil(str2)) {
                textView.setText(str2);
            }
            textView.getPaint().setFakeBoldText(true);
            e0Var.mo140672r(inflate);
            View inflate2 = View.inflate(walletLqtSaveFetchUI.getContext(), C0966R.C0971layout.b8q, (ViewGroup) null);
            TextView textView2 = (TextView) inflate2.findViewById(C0966R.C0970id.f358384et2);
            if (!Util.isNullOrNil(str3)) {
                textView2.setText(str3);
            }
            e0Var.mo140663j(inflate2);
            e0Var.mo140655A();
        }
    }
}
