package sy1;

import android.view.View;
import com.tencent.p014mm.plugin.game.model.GameTabData;
import com.tencent.p014mm.plugin.game.p061ui.tab.GameTabWidget;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: sy1.b */
public class C48506b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GameTabWidget f129730d;

    public C48506b(GameTabWidget gameTabWidget) {
        this.f129730d = gameTabWidget;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/tab/GameTabWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            GameTabWidget.m46063c(this.f129730d.f114684d, (GameTabData.TabItem) view.getTag(), false, false, false);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.GameTabWidget", "selectTab err:%s", e.getMessage());
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/tab/GameTabWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
