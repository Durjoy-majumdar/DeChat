package lc1;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import pb1.C100734q;
import pb1.C100755z;

public class c$$c implements View.OnClickListener {
    public c$$c(C99373c cVar) {
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105918d("MicroMsg.FavBaseListItem", "manual restart upload");
        if (view.getTag() instanceof C100755z) {
            C100734q.m131863n0((C100755z) view.getTag(), true);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
