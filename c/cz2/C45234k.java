package cz2;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import qz2.C47914d;

/* renamed from: cz2.k */
public final class C45234k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C47914d f122575d;

    /* renamed from: e */
    public final /* synthetic */ C45235l f122576e;

    public C45234k(C47914d dVar, C45235l lVar) {
        this.f122575d = dVar;
        this.f122576e = lVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String str = this.f122575d.f128570e;
        if (str != null) {
            C45241s sVar = this.f122576e.f122577e;
            C87412m.m108593f(view, LocaleUtil.ITALIAN);
            sVar.mo70748a(view, str);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
