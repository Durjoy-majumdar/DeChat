package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameHotMsgView;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.e */
public class C42293e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f114366d;

    /* renamed from: e */
    public final /* synthetic */ List f114367e;

    /* renamed from: f */
    public final /* synthetic */ GameHotMsgView.C42253b f114368f;

    public C42293e(GameHotMsgView.C42253b bVar, int i, List list) {
        this.f114368f = bVar;
        this.f114366d = i;
        this.f114367e = list;
    }

    public void run() {
        if (this.f114366d > 0) {
            View findViewById = GameHotMsgView.this.getRootView().findViewById(C0966R.C0970id.nvs);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/chat_tab/GameHotMsgView$3$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/game/ui/chat_tab/GameHotMsgView$3$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View findViewById2 = GameHotMsgView.this.getRootView().findViewById(C0966R.C0970id.nvs);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/game/ui/chat_tab/GameHotMsgView$3$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/game/ui/chat_tab/GameHotMsgView$3$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f114367e.size() > 15) {
            GameHotMsgView.C42254c cVar = GameHotMsgView.this.f114223F1;
            List subList = this.f114367e.subList(0, 15);
            cVar.f114229d = this.f114366d;
            ((LinkedList) cVar.f114230e).clear();
            if (!Util.isNullOrNil(subList)) {
                ((LinkedList) cVar.f114230e).addAll(subList);
            }
            cVar.notifyDataSetChanged();
            return;
        }
        GameHotMsgView.C42254c cVar2 = GameHotMsgView.this.f114223F1;
        List list = this.f114367e;
        cVar2.f114229d = this.f114366d;
        ((LinkedList) cVar2.f114230e).clear();
        if (!Util.isNullOrNil(list)) {
            ((LinkedList) cVar2.f114230e).addAll(list);
        }
        cVar2.notifyDataSetChanged();
    }
}
