package pc1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteIndexUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import pb1.C100734q;
import pc1.C77075f;

/* renamed from: pc1.d */
public class C77073d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77075f f225130d;

    public C77073d(C77075f fVar) {
        this.f225130d = fVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fav/ui/widget/FavHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i = this.f225130d.f225138j;
        if (i == 1 || i == 3) {
            Log.m105924i("MicroMsg.FavHeaderView", "click clear fav item");
            C77075f.C77076a aVar = this.f225130d.f225135g;
            if (aVar != null) {
                FavoriteIndexUI favoriteIndexUI = (FavoriteIndexUI) aVar;
                favoriteIndexUI.getClass();
                Intent intent = new Intent();
                intent.putExtra("key_enter_fav_cleanui_from", 0);
                C100734q.m131875t0(favoriteIndexUI.getContext(), ".ui.FavCleanUI", intent, (Bundle) null);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
