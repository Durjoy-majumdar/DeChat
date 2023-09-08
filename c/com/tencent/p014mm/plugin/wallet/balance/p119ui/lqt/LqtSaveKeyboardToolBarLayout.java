package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.gridlayout.widget.GridLayout;
import gy3.C87412m;
import kotlin.Metadata;
import te3.C49702hg2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0013B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/plugin/wallet/balance/ui/lqt/LqtSaveKeyboardToolBarLayout;", "Landroidx/gridlayout/widget/GridLayout;", "Lcom/tencent/mm/plugin/wallet/balance/ui/lqt/LqtSaveKeyboardToolBarLayout$a;", "H", "Lcom/tencent/mm/plugin/wallet/balance/ui/lqt/LqtSaveKeyboardToolBarLayout$a;", "getOnSelectAmount", "()Lcom/tencent/mm/plugin/wallet/balance/ui/lqt/LqtSaveKeyboardToolBarLayout$a;", "setOnSelectAmount", "(Lcom/tencent/mm/plugin/wallet/balance/ui/lqt/LqtSaveKeyboardToolBarLayout$a;)V", "onSelectAmount", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-wxpay_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.LqtSaveKeyboardToolBarLayout */
public final class LqtSaveKeyboardToolBarLayout extends GridLayout {

    /* renamed from: G */
    public C49702hg2 f207901G;

    /* renamed from: H */
    public C71714a f207902H;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.LqtSaveKeyboardToolBarLayout$a */
    public interface C71714a {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LqtSaveKeyboardToolBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 23;
        setLayoutParams(layoutParams);
        setRowCount(1);
        setColumnCount(1);
    }

    public final C71714a getOnSelectAmount() {
        return this.f207902H;
    }

    public final void setOnSelectAmount(C71714a aVar) {
        this.f207902H = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LqtSaveKeyboardToolBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 23;
        setLayoutParams(layoutParams);
        setRowCount(1);
        setColumnCount(1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LqtSaveKeyboardToolBarLayout(Context context) {
        super(context, (AttributeSet) null);
        C87412m.m108594g(context, "context");
        setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 23;
        setLayoutParams(layoutParams);
        setRowCount(1);
        setColumnCount(1);
    }
}
