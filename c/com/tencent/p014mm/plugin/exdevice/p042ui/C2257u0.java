package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.u0 */
public class C2257u0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f12341d;

    /* renamed from: e */
    public final /* synthetic */ ExdeviceRankChampionInfoView f12342e;

    public C2257u0(ExdeviceRankChampionInfoView exdeviceRankChampionInfoView, Context context) {
        this.f12342e = exdeviceRankChampionInfoView;
        this.f12341d = context;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceRankChampionInfoView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (Util.isNullOrNil(this.f12342e.f12332f)) {
            Log.m105928w("MicroMsg.ExdeviceRankChampionInfoView", "username is null.");
            C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankChampionInfoView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        Intent intent = new Intent(this.f12341d, ExdeviceProfileUI.class);
        intent.putExtra("username", this.f12342e.f12332f);
        Context context = this.f12341d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankChampionInfoView$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankChampionInfoView$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankChampionInfoView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
