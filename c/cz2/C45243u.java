package cz2;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import lz2.C34452l;

/* renamed from: cz2.u */
public final class C45243u implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C45244v f122585d;

    /* renamed from: e */
    public final /* synthetic */ C34452l f122586e;

    public C45243u(C45244v vVar, C34452l lVar) {
        this.f122585d = vVar;
        this.f122586e = lVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/convert/dowhat/RecentUseStatusConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C45242t tVar = this.f122585d.f122587e;
        if (tVar != null) {
            C87412m.m108593f(view, LocaleUtil.ITALIAN);
            C34452l lVar = this.f122586e;
            String str = lVar.f92747d;
            String str2 = lVar.f92748e;
            if (str2 == null) {
                str2 = "";
            }
            tVar.mo70749a(view, str, str2);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/convert/dowhat/RecentUseStatusConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
