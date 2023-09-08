package com.tencent.p014mm.plugin.card.p031ui;

import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.plugin.card.p031ui.CardNewMsgUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import hz0.C46146f;
import j20.C117292a;
import java.util.ArrayList;
import wz0.C53246b;

/* renamed from: com.tencent.mm.plugin.card.ui.f0 */
public class C40864f0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C46146f.C46148b f109874d;

    /* renamed from: e */
    public final /* synthetic */ CardNewMsgUI.C40843h f109875e;

    public C40864f0(CardNewMsgUI.C40843h hVar, C46146f.C46148b bVar) {
        this.f109875e = hVar;
        this.f109874d = bVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!TextUtils.isEmpty(this.f109874d.f124383d)) {
            C53246b.m59678j(CardNewMsgUI.this, this.f109874d.f124383d, 2);
        } else {
            Log.m105920e("MicroMsg.CardNewMsgUI", "card msg button url is empty");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
