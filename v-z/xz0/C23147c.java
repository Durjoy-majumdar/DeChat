package xz0;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ht1.C60200t1;
import ht1.C60216z4;
import j20.C117292a;
import java.util.ArrayList;
import te3.C22498fy;
import wz0.C22945n;
import wz0.C53246b;

/* renamed from: xz0.c */
public class C23147c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C22498fy f66480d;

    /* renamed from: e */
    public final /* synthetic */ C23148d f66481e;

    public C23147c(C23148d dVar, C22498fy fyVar) {
        this.f66481e = dVar;
        this.f66480d = fyVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/card/widget/CardWidgetCommon$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!Util.isNullOrNil(this.f66480d.f63900w) && !Util.isNullOrNil(this.f66480d.f63901x)) {
            C60216z4 l7 = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7();
            Context context = this.f66481e.f66473b;
            C22498fy fyVar = this.f66480d;
            l7.mo83794l6(context, fyVar.f63900w, fyVar.f63901x, false, 16, C22945n.m27007g(3));
        } else if (!Util.isNullOrNil(this.f66480d.f63893p)) {
            String cardId = this.f66481e.f66472a.getCardId();
            C22498fy fyVar2 = this.f66480d;
            C53246b.m59672d(cardId, fyVar2.f63893p, fyVar2.f63894q, 1028, 0);
        } else if (!Util.isNullOrNil(this.f66480d.f63887g)) {
            C53246b.m59678j((MMActivity) this.f66481e.f66473b, this.f66480d.f63887g, 0);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/card/widget/CardWidgetCommon$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
