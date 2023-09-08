package com.tencent.p014mm.plugin.card.p031ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.card.ui.s */
public class C2161s implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CardHomePageUI f12139d;

    public C2161s(CardHomePageUI cardHomePageUI) {
        this.f12139d = cardHomePageUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/card/ui/CardHomePageUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent(this.f12139d, CardIndexUI.class);
        intent.putExtra("key_card_type", 1);
        CardHomePageUI cardHomePageUI = this.f12139d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(cardHomePageUI, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CardHomePageUI$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        cardHomePageUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(cardHomePageUI, "com/tencent/mm/plugin/card/ui/CardHomePageUI$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C115669n.INSTANCE.mo160131h(11324, "GotoMemberCardUI", 0, "", "", 0, 1, "", 0, 0);
        C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardHomePageUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
