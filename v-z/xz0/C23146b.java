package xz0;

import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import te3.C22498fy;
import wz0.C22945n;
import wz0.C53246b;

/* renamed from: xz0.b */
public class C23146b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C22498fy f66478d;

    /* renamed from: e */
    public final /* synthetic */ C23148d f66479e;

    public C23146b(C23148d dVar, C22498fy fyVar) {
        this.f66479e = dVar;
        this.f66478d = fyVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/card/widget/CardWidgetCommon$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!Util.isNullOrNil(this.f66478d.f63897t)) {
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83758E5(this.f66479e.f66473b, this.f66478d.f63897t, 16, C22945n.m27007g(3));
        } else if (!Util.isNullOrNil(this.f66478d.f63893p)) {
            String cardId = this.f66479e.f66472a.getCardId();
            C22498fy fyVar = this.f66478d;
            C53246b.m59672d(cardId, fyVar.f63893p, fyVar.f63894q, 1028, 0);
        } else if (!Util.isNullOrNil(this.f66478d.f63887g)) {
            C53246b.m59678j((MMActivity) this.f66479e.f66473b, this.f66478d.f63887g, 0);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/card/widget/CardWidgetCommon$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
