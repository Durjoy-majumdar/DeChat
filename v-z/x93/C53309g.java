package x93;

import android.view.View;
import com.tencent.p014mm.plugin.webview.p128ui.tools.game.menu.GameMenuView;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76875f0;

/* renamed from: x93.g */
public class C53309g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GameMenuView f148905d;

    public C53309g(GameMenuView gameMenuView) {
        this.f148905d = gameMenuView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/game/menu/GameMenuView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f148905d.f119309j != null) {
            this.f148905d.f119309j.mo68612a((C76875f0) view.getTag());
        }
        C53300b bVar = this.f148905d.f119310n;
        if (bVar != null) {
            C53306f.this.mo73932b();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/game/menu/GameMenuView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
