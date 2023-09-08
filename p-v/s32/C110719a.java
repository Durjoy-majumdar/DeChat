package s32;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.luckymoney.f2f.p072ui.LuckyMoneyF2FQRCodeUI;

/* renamed from: s32.a */
public class C110719a implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyF2FQRCodeUI f331180d;

    public C110719a(LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI) {
        this.f331180d = luckyMoneyF2FQRCodeUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f331180d.finish();
        return true;
    }
}
