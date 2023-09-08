package com.tencent.p014mm.plugin.card.p031ui;

import android.view.View;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import te3.C48885bo;
import te3.C51997xn;
import wz0.C53246b;

/* renamed from: com.tencent.mm.plugin.card.ui.v */
public class C40872v implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C48885bo f109912d;

    /* renamed from: e */
    public final /* synthetic */ CardIndexUI f109913e;

    public C40872v(CardIndexUI cardIndexUI, C48885bo boVar) {
        this.f109913e = cardIndexUI;
        this.f109912d = boVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/card/ui/CardIndexUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105925i("MicroMsg.CardIndexUI", "click header view: %s", Integer.valueOf(this.f109912d.f131231g));
        C48885bo boVar = this.f109912d;
        int i = boVar.f131231g;
        if (i == 1) {
            C53246b.m59678j(this.f109913e, boVar.f131232h, 0);
        } else if (i == 2) {
            StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
            StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
            C51997xn xnVar = this.f109912d.f131233i;
            aVar.f9526a = xnVar.f144755d;
            aVar.f9527b = Util.nullAs(xnVar.f144756e, "");
            startAppBrandUIFromOuterEvent.f9522d.f9529d = 1028;
            startAppBrandUIFromOuterEvent.publish();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardIndexUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
