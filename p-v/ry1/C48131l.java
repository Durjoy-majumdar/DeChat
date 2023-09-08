package ry1;

import android.view.View;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.p061ui.GameBlockView;
import j20.C117292a;
import java.util.ArrayList;
import uy1.C52642c;

/* renamed from: ry1.l */
public class C48131l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f129023d;

    /* renamed from: e */
    public final /* synthetic */ GameBlockView f129024e;

    public C48131l(GameBlockView gameBlockView, int i) {
        this.f129024e = gameBlockView;
        this.f129023d = i;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameBlockView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof String)) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameBlockView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C40314g.m43484c(this.f129024e.getContext(), 10, 1002, 99, C52642c.m59002t(this.f129024e.getContext(), (String) view.getTag(), "game_center_mygame_more"), this.f129023d, (String) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameBlockView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
