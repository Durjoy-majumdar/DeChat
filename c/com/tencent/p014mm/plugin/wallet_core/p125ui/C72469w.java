package com.tencent.p014mm.plugin.wallet_core.p125ui;

import com.tencent.p014mm.plugin.wallet_core.model.ElementQuery;
import java.util.Comparator;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.w */
public class C72469w implements Comparator<ElementQuery> {
    public C72469w(WalletCardSelectUI walletCardSelectUI) {
    }

    public int compare(Object obj, Object obj2) {
        return ((ElementQuery) obj).f209495I - ((ElementQuery) obj2).f209495I;
    }
}
