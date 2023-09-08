package pc1;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import pb1.C100718j1;
import pb1.C100734q;
import pb1.C100755z;
import xb1.C102614d;

/* renamed from: pc1.e */
public class C77074e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77075f f225131d;

    public C77074e(C77075f fVar) {
        this.f225131d = fVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fav/ui/widget/FavHeaderView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.FavHeaderView", "click retry item");
        List<C100755z> TE = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142265TE();
        if (TE == null || TE.isEmpty()) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        for (C100755z next : TE) {
            if (!next.mo140174A2()) {
                Log.m105929w("MicroMsg.FavHeaderView", "item id is %d, status is not upload fail", Integer.valueOf(next.field_id));
            } else {
                C100734q.m131863n0(next, true);
            }
        }
        View view2 = this.f225131d.f225134f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view4 = this.f225131d.f225133e;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view5 = view4;
        C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
