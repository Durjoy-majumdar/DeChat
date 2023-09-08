package s32;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.plugin.luckymoney.f2f.p072ui.LuckyMoneyF2FQRCodeUI;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyBeforeDetailUI;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: s32.c */
public class C13618c implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyF2FQRCodeUI f38586d;

    public C13618c(LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI) {
        this.f38586d = luckyMoneyF2FQRCodeUI;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$7", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        Intent intent = new Intent(this.f38586d, LuckyMoneyBeforeDetailUI.class);
        intent.putExtra("key_sendid", this.f38586d.f53009F);
        LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI = this.f38586d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI2 = luckyMoneyF2FQRCodeUI;
        C117292a.m165358d(luckyMoneyF2FQRCodeUI2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$7", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyF2FQRCodeUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(luckyMoneyF2FQRCodeUI2, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$7", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$7", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
