package com.tencent.p014mm.plugin.card.p031ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.card.p031ui.CardNewMsgUI;
import com.tencent.p014mm.plugin.card.sharecard.p317ui.CardConsumeSuccessUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import hz0.C46146f;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.card.ui.e0 */
public class C40863e0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C46146f.C46147a f109871d;

    /* renamed from: e */
    public final /* synthetic */ C46146f f109872e;

    /* renamed from: f */
    public final /* synthetic */ CardNewMsgUI.C40843h f109873f;

    public C40863e0(CardNewMsgUI.C40843h hVar, C46146f.C46147a aVar, C46146f fVar) {
        this.f109873f = hVar;
        this.f109871d = aVar;
        this.f109872e = fVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        int i = this.f109871d.f124379e;
        if (i == 0) {
            intent.setClass(CardNewMsgUI.this.getContext(), CardDetailUI.class);
            intent.putExtra("key_card_id", this.f109871d.f124377c);
            intent.putExtra("key_card_ext", this.f109871d.f124378d);
            intent.putExtra("key_from_scene", 17);
            CardNewMsgUI cardNewMsgUI = CardNewMsgUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            CardNewMsgUI cardNewMsgUI2 = cardNewMsgUI;
            C117292a.m165358d(cardNewMsgUI2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            cardNewMsgUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(cardNewMsgUI2, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (i == 1) {
            intent.setClass(CardNewMsgUI.this.getContext(), CardConsumeSuccessUI.class);
            intent.putExtra("key_card_id", this.f109872e.field_card_id);
            intent.putExtra("key_from_scene", 2);
            CardNewMsgUI cardNewMsgUI3 = CardNewMsgUI.this;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            CardNewMsgUI cardNewMsgUI4 = cardNewMsgUI3;
            C117292a.m165358d(cardNewMsgUI4, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            cardNewMsgUI3.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(cardNewMsgUI4, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        C115669n nVar = C115669n.INSTANCE;
        C46146f fVar = this.f109872e;
        nVar.mo160131h(11941, 8, fVar.field_card_id, fVar.field_card_tp_id, fVar.field_msg_id, this.f109871d.f124377c);
        C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
