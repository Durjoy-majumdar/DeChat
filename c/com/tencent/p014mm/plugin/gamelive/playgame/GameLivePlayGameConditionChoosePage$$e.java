package com.tencent.p014mm.plugin.gamelive.playgame;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.gamelive.playgame.GameLivePlayGameConditionChoosePage$$e */
public class GameLivePlayGameConditionChoosePage$$e extends C60896i<GameLivePlayGameConditionChoosePage$$d> {

    /* renamed from: e */
    public final /* synthetic */ GameLivePlayGameConditionChoosePage f19371e;

    public GameLivePlayGameConditionChoosePage$$e(GameLivePlayGameConditionChoosePage gameLivePlayGameConditionChoosePage) {
        this.f19371e = gameLivePlayGameConditionChoosePage;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f6412e4;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C60905o oVar2 = oVar;
        GameLivePlayGameConditionChoosePage$$d gameLivePlayGameConditionChoosePage$$d = (GameLivePlayGameConditionChoosePage$$d) cVar;
        ((TextView) oVar2.mo85812D(C0966R.C0970id.hsm)).setText(gameLivePlayGameConditionChoosePage$$d.f19369d);
        if (gameLivePlayGameConditionChoosePage$$d.f19370e == this.f19371e.f19366e) {
            View D = oVar2.mo85812D(C0966R.C0970id.hsl);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = D;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameConditionChoosePage$PlayGameConditionConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameConditionChoosePage$PlayGameCondition;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameConditionChoosePage$PlayGameConditionConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameConditionChoosePage$PlayGameCondition;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View D2 = oVar2.mo85812D(C0966R.C0970id.hsl);
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(4);
        View view2 = D2;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameConditionChoosePage$PlayGameConditionConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameConditionChoosePage$PlayGameCondition;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameConditionChoosePage$PlayGameConditionConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameConditionChoosePage$PlayGameCondition;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
    }
}
