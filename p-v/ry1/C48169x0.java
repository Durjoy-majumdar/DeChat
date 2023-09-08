package ry1;

import com.tencent.p014mm.plugin.game.model.C42091s;
import com.tencent.p014mm.plugin.game.p061ui.GameRankHeadView;

/* renamed from: ry1.x0 */
public class C48169x0 implements C42091s.C42092a {

    /* renamed from: a */
    public final /* synthetic */ GameRankHeadView f129105a;

    public C48169x0(GameRankHeadView gameRankHeadView) {
        this.f129105a = gameRankHeadView;
    }

    /* renamed from: a */
    public void mo66052a(int i, String str, boolean z) {
        GameRankHeadView gameRankHeadView = this.f129105a;
        if (gameRankHeadView.f114126f != null) {
            gameRankHeadView.f114125e.mo66072a(gameRankHeadView.getContext());
            this.f129105a.f114125e.mo66073b();
            if (z) {
                this.f129105a.mo66259a();
            }
        }
    }
}
