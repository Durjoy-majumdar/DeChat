package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import java.util.Iterator;
import java.util.LinkedList;
import kg3.C76577a;
import ob0.C89132b;
import te3.C50711op;
import te3.zf4;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.h */
public class C43328h implements C87581a<Object, C89132b.C89134c<C50711op>> {

    /* renamed from: a */
    public final /* synthetic */ WalletBalanceFetchUI f117169a;

    public C43328h(WalletBalanceFetchUI walletBalanceFetchUI) {
        this.f117169a = walletBalanceFetchUI;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        int i = 0;
        Log.m105925i("MicroMsg.WalletBalanceFetchUI", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b), cVar.f256795c);
        WalletBalanceFetchUI walletBalanceFetchUI = this.f117169a;
        walletBalanceFetchUI.f207716M = null;
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            walletBalanceFetchUI.f207740t.removeAllViews();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            LinkedList<zf4> linkedList = ((C50711op) cVar.f256796d).f139296d;
            if (linkedList != null && !linkedList.isEmpty()) {
                Iterator<zf4> it = ((C50711op) cVar.f256796d).f139296d.iterator();
                while (it.hasNext()) {
                    TextView textView = new TextView(this.f117169a.getContext());
                    C43423i0.m46937h(textView, it.next(), (C43423i0.C43428e) null);
                    if (i != 0) {
                        layoutParams.topMargin = C76577a.m92157h(this.f117169a.getContext(), C0966R.dimen.f3623g);
                    }
                    this.f117169a.f207740t.addView(textView, layoutParams);
                    i++;
                }
            }
        }
        return null;
    }
}
