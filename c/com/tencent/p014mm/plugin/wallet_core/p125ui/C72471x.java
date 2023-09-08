package com.tencent.p014mm.plugin.wallet_core.p125ui;

import com.tencent.p014mm.plugin.wallet_core.model.ElementQuery;
import java.util.Comparator;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.x */
public class C72471x implements Comparator<ElementQuery> {
    public C72471x(WalletCardSelectUI walletCardSelectUI) {
    }

    public int compare(Object obj, Object obj2) {
        return ((ElementQuery) obj2).f209495I - ((ElementQuery) obj).f209495I;
    }
}
