package aa2;

import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.p136ui.conversation.ConversationListView;
import com.tencent.p014mm.p136ui.conversation.MainUI;
import com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import iy3.C60641c;
import o92.C110004g;
import r92.C110555b;

/* renamed from: aa2.l */
public final class C112781l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MultiTaskUIC f337696d;

    public C112781l(MultiTaskUIC multiTaskUIC) {
        this.f337696d = multiTaskUIC;
    }

    public final void run() {
        MainUI mainUI;
        ConversationListView conversationListView;
        MultiTaskUIC multiTaskUIC = this.f337696d;
        multiTaskUIC.getClass();
        Log.m105924i("MicroMsg.MultiTaskTipsHelper", "setMultiTaskFirstAdd, flag: false");
        boolean z = false;
        MultiProcessMMKV.getMMKV("multitask_tips_config").putBoolean("multitask_first_add_flag", false);
        if (multiTaskUIC.f346706o != null) {
            LauncherUI instance = LauncherUI.getInstance();
            if (instance != null ? instance.mo101378R7() : false) {
                Log.m105924i("MicroMsg.MultiTask.MultiTaskUIC", "[enterTips]chatting is foreground, skip!, step 2");
                return;
            }
            LauncherUI instance2 = LauncherUI.getInstance();
            if ((instance2 == null || instance2.mo101375O7() == null || (mainUI = (MainUI) instance2.mo101375O7().f214445o.get(0)) == null || (conversationListView = mainUI.f219476o) == null) ? false : conversationListView.mo103725k()) {
                Log.m105924i("MicroMsg.MultiTask.MultiTaskUIC", "[enterTips]header is open, skip!, step 2");
                return;
            } else if (LauncherUI.getCurrentTabIndex() != 0) {
                Log.m105924i("MicroMsg.MultiTask.MultiTaskUIC", "[enterTips]tab is not mainUI, skip!, step 2");
                return;
            }
        }
        if (multiTaskUIC.mo90994b0()) {
            Log.m105924i("MicroMsg.MultiTask.MultiTaskUIC", "[enterTips]inMultiTaskPanel, skip!, step 2");
            return;
        }
        C110555b bVar = multiTaskUIC.f346698d;
        if (bVar != null && !bVar.mo162013g()) {
            z = true;
        }
        if (z) {
            Log.m105924i("MicroMsg.MultiTask.MultiTaskUIC", "[enterTips]is not collapsed, skip!, step 2");
        } else if (multiTaskUIC.mo57273B4()) {
            Log.m105924i("MicroMsg.MultiTask.MultiTaskUIC", "[enterTips]data is empty, skip!, step 2");
        } else {
            Log.m105924i("MicroMsg.MultiTask.MultiTaskUIC", "[enterTips] show!");
            if (multiTaskUIC.f346711t != null) {
                MultiTaskUIC.f346692x0 = C60641c.m70921b(((float) MultiTaskUIC.f346670H) * MultiTaskUIC.f346693y0);
                multiTaskUIC.f346713v = true;
                multiTaskUIC.f346714w = true;
                C110555b bVar2 = multiTaskUIC.f346698d;
                if (bVar2 != null) {
                    bVar2.setAnchorPoint(MultiTaskUIC.f346693y0);
                }
                C110555b bVar3 = multiTaskUIC.f346698d;
                if (bVar3 != null) {
                    bVar3.mo162023k(C110555b.C110557b.ANCHORED, 300, true);
                }
                Log.m105924i("MicroMsg.MultiTaskTipsHelper", "setMultiTaskPanelEnterDragFlag, flag: true");
                MultiProcessMMKV.getMMKV("multitask_tips_config").putBoolean("multitask_panel_enter_drag_flag", true);
                C110004g.f329190b = 1;
                multiTaskUIC.mo175710f3(1);
            }
        }
    }
}
