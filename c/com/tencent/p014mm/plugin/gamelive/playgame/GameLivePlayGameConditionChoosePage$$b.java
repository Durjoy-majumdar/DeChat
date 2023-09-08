package com.tencent.p014mm.plugin.gamelive.playgame;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import jq3.C60898l;
import jq3.C60905o;
import qo3.C12925w;

/* renamed from: com.tencent.mm.plugin.gamelive.playgame.GameLivePlayGameConditionChoosePage$$b */
public class GameLivePlayGameConditionChoosePage$$b implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ GameLivePlayGameConditionChoosePage f19368d;

    public GameLivePlayGameConditionChoosePage$$b(GameLivePlayGameConditionChoosePage gameLivePlayGameConditionChoosePage) {
        this.f19368d = gameLivePlayGameConditionChoosePage;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        View view2;
        GameLivePlayGameConditionChoosePage$$d gameLivePlayGameConditionChoosePage$$d = (GameLivePlayGameConditionChoosePage$$d) ((C60905o) zVar).f173503E;
        GameLivePlayGameConditionChoosePage$$c gameLivePlayGameConditionChoosePage$$c = this.f19368d.f19364c;
        String str = gameLivePlayGameConditionChoosePage$$d.f19369d;
        int i2 = gameLivePlayGameConditionChoosePage$$d.f19370e;
        C85232a aVar = (C85232a) gameLivePlayGameConditionChoosePage$$c;
        C12925w wVar = aVar.f248300a;
        if (wVar == null || (view2 = wVar.f36927f) == null) {
            Log.m105920e("GameLivePlayGameAnchorInviteWidget", "null");
        } else {
            aVar.f248312m = i2;
            aVar.f248311l.f248287d = i2;
            ((TextView) view2.findViewById(C0966R.C0970id.hso)).setText(str);
        }
        this.f19368d.mo12476d();
    }
}
