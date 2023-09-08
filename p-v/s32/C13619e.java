package s32;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.luckymoney.f2f.p072ui.LuckyMoneyF2FQRCodeUI;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: s32.e */
public class C13619e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyF2FQRCodeUI f38587d;

    public C13619e(LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI) {
        this.f38587d = luckyMoneyF2FQRCodeUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent(this.f38587d, LuckyMoneyPrepareUI.class);
        intent.putExtra("key_from", 2);
        LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI = this.f38587d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI2 = luckyMoneyF2FQRCodeUI;
        C117292a.m165358d(luckyMoneyF2FQRCodeUI2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyF2FQRCodeUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(luckyMoneyF2FQRCodeUI2, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
