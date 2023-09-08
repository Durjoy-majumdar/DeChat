package ry1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.p061ui.GameIndexSearchView;
import com.tencent.p014mm.plugin.game.p061ui.GameSearchUI;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import uy1.C52642c;

/* renamed from: ry1.h0 */
public class C48121h0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f128994d;

    /* renamed from: e */
    public final /* synthetic */ GameIndexSearchView f128995e;

    public C48121h0(GameIndexSearchView gameIndexSearchView, int i) {
        this.f128995e = gameIndexSearchView;
        this.f128994d = i;
    }

    public void onClick(View view) {
        int i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameIndexSearchView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof String)) {
            Intent intent = new Intent(this.f128995e.f113963d, GameSearchUI.class);
            intent.putExtra("game_report_from_scene", 1001);
            Context context = this.f128995e.f113963d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/GameIndexSearchView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/game/ui/GameIndexSearchView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            i = 6;
        } else {
            i = C52642c.m59002t(this.f128995e.f113963d, (String) view.getTag(), "game_center_msgcenter");
        }
        C40314g.m43485d(this.f128995e.f113963d, 14, 1401, 1, i, 0, (String) null, this.f128994d, 0, (String) null, (String) null, (String) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameIndexSearchView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
