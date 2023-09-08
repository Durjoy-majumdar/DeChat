package ry1;

import android.view.View;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.p061ui.GameMessageUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wechat.aff.ting.TingClientProto;
import j20.C117292a;
import java.util.ArrayList;
import uy1.C52642c;

/* renamed from: ry1.s0 */
public class C48156s0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GameMessageUI f129087d;

    public C48156s0(GameMessageUI gameMessageUI) {
        this.f129087d = gameMessageUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameMessageUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!Util.isNullOrNil(this.f129087d.f114079r)) {
            C40314g.m43484c(this.f129087d.getContext(), 13, TingClientProto.TingScene.TingScene_ChatMusicSearch_VALUE, 1, C52642c.m59002t(this.f129087d.getContext(), this.f129087d.f114079r, (String) null), this.f129087d.f114076o, (String) null);
        }
        this.f129087d.f114077p = true;
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameMessageUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
