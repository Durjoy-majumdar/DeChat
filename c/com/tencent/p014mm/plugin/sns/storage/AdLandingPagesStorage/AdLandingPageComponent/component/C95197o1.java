package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import vr2.C102251n;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o1 */
public class C95197o1 implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C95179m1 f276253d;

    public C95197o1(C95179m1 m1Var) {
        this.f276253d = m1Var;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPagePureImageComponet$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet$4");
        StringBuilder sb = new StringBuilder();
        sb.append("onLongClick, filePath=");
        C95179m1 m1Var = this.f276253d;
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
        String str = m1Var.f276228y;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
        sb.append(str);
        Log.m105924i("AdLandingPagePureImageComponet", sb.toString());
        C95179m1 m1Var2 = this.f276253d;
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
        C102251n nVar = m1Var2.f276226w;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
        C95179m1 m1Var3 = this.f276253d;
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
        String str2 = m1Var3.f276228y;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
        C95179m1 m1Var4 = this.f276253d;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
        String str3 = m1Var4.f276227x;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
        nVar.getClass();
        SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        boolean k = nVar.mo141817k(str2, str3, (C102251n.C102257c) null);
        SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet$4");
        C117292a.m165362h(k, this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPagePureImageComponet$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return k;
    }
}
