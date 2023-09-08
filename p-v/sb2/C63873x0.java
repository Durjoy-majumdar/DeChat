package sb2;

import android.view.View;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import di3.C86312j;
import hb2.C59822f;
import j20.C117292a;
import java.util.ArrayList;
import p599lr.C61381b;
import wp1.C15585f;

/* renamed from: sb2.x0 */
public final class C63873x0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C59822f f181062d;

    public C63873x0(C59822f fVar) {
        this.f181062d = fVar;
    }

    public final void onClick(View view) {
        FinderItem d;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC$initLocalPostStats$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Long l = this.f181062d.f170753a;
        if (!(l == null || (d = C15585f.f42211a.mo14341d(l.longValue())) == null)) {
            ((C61381b) C86312j.m106911c(C61381b.class)).mo78545UQ().mo12413f(d);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC$initLocalPostStats$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
