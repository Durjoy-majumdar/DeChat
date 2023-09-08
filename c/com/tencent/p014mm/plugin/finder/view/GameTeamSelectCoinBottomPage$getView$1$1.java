package com.tencent.p014mm.plugin.finder.view;

import com.tencent.p014mm.plugin.finder.view.GameTeamSelectCoinBottomPage;
import fy3.C32226l;
import gy3.C87413o;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, mo182094d2 = {"com/tencent/mm/plugin/finder/view/GameTeamSelectCoinBottomPage$getView$1$1", "Ljq3/j;", "", "type", "Ljq3/i;", "Lcom/tencent/mm/plugin/finder/view/GameTeamSelectCoinBottomPage$b;", "getItemConvert", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.GameTeamSelectCoinBottomPage$getView$1$1 */
public final class GameTeamSelectCoinBottomPage$getView$1$1 implements C9500j {
    public final /* synthetic */ GameTeamSelectCoinBottomPage this$0;

    /* renamed from: com.tencent.mm.plugin.finder.view.GameTeamSelectCoinBottomPage$getView$1$1$a */
    public static final class C3993a extends C87413o implements C32226l<Integer, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ GameTeamSelectCoinBottomPage f17999d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3993a(GameTeamSelectCoinBottomPage gameTeamSelectCoinBottomPage) {
            super(1);
            this.f17999d = gameTeamSelectCoinBottomPage;
        }

        public Object invoke(Object obj) {
            boolean z = true;
            if (this.f17999d.f17991d.size() - 1 != ((Number) obj).intValue()) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public GameTeamSelectCoinBottomPage$getView$1$1(GameTeamSelectCoinBottomPage gameTeamSelectCoinBottomPage) {
        this.this$0 = gameTeamSelectCoinBottomPage;
    }

    public C60896i<GameTeamSelectCoinBottomPage.C3988b> getItemConvert(int i) {
        GameTeamSelectCoinBottomPage gameTeamSelectCoinBottomPage = this.this$0;
        return new GameTeamSelectCoinBottomPage.C3989c(gameTeamSelectCoinBottomPage, new C3993a(gameTeamSelectCoinBottomPage));
    }
}
