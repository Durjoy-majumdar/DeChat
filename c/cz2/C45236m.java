package cz2;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import qz2.C47914d;

/* renamed from: cz2.m */
public final class C45236m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C47914d f122578d;

    /* renamed from: e */
    public final /* synthetic */ C45237n f122579e;

    public C45236m(C47914d dVar, C45237n nVar) {
        this.f122578d = dVar;
        this.f122579e = nVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatItemConvertV2$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String str = this.f122578d.f128570e;
        if (str != null) {
            C45241s sVar = this.f122579e.f122580e;
            C87412m.m108593f(view, LocaleUtil.ITALIAN);
            sVar.mo70748a(view, str);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatItemConvertV2$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
