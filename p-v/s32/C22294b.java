package s32;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.luckymoney.f2f.p072ui.LuckyMoneyF2FQRCodeUI;
import qo3.C77407n;

/* renamed from: s32.b */
public class C22294b implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyF2FQRCodeUI f63203d;

    public C22294b(LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI) {
        this.f63203d = luckyMoneyF2FQRCodeUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI = this.f63203d;
        luckyMoneyF2FQRCodeUI.f53005B = new C77407n((Context) luckyMoneyF2FQRCodeUI, 1, false);
        LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI2 = this.f63203d;
        C77407n nVar = luckyMoneyF2FQRCodeUI2.f53005B;
        nVar.f225771i = luckyMoneyF2FQRCodeUI2.f53033X;
        nVar.f225782p = luckyMoneyF2FQRCodeUI2.f53035Y;
        nVar.mo107573q();
        return true;
    }
}
