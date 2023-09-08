package com.tencent.p014mm.plugin.multitask.p079ui.panel;

import aa2.C112781l;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MulitTaskEvent;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import gy3.C8479f0;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;
import o92.C110004g;
import p92.C117994a;
import p92.C117997g;
import z92.C16127a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/multitask/ui/panel/MinusScreenPanel$multiTaskEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/MulitTaskEvent;", "ui-multitask_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.multitask.ui.panel.MinusScreenPanel$multiTaskEventListener$1 */
public final class MinusScreenPanel$multiTaskEventListener$1 extends IListener<MulitTaskEvent> {

    /* renamed from: d */
    public final /* synthetic */ MinusScreenPanel f346665d;

    /* renamed from: e */
    public final /* synthetic */ AppCompatActivity f346666e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MinusScreenPanel$multiTaskEventListener$1(MinusScreenPanel minusScreenPanel, AppCompatActivity appCompatActivity, C40008f fVar) {
        super(fVar);
        this.f346665d = minusScreenPanel;
        this.f346666e = appCompatActivity;
    }

    public boolean callback(IEvent iEvent) {
        boolean z;
        View rootView;
        MulitTaskEvent mulitTaskEvent = (MulitTaskEvent) iEvent;
        Class cls = MultiTaskUIC.class;
        C87412m.m108594g(mulitTaskEvent, "event");
        MulitTaskEvent.C67733a aVar = mulitTaskEvent.f193741d;
        if (aVar != null) {
            MinusScreenPanel minusScreenPanel = this.f346665d;
            AppCompatActivity appCompatActivity = this.f346666e;
            int i = aVar.f193744c;
            boolean z2 = true;
            if (i == 0) {
                C117997g gVar = minusScreenPanel.f356644i;
                if ((gVar != null ? gVar.mo36002z() : null) != C117994a.C117996b.MODE_NONE && !C87412m.m108589b(aVar.f193742a, "MultiTaskForSnapshotMinusScreen")) {
                    MultiTaskUIC multiTaskUIC = (MultiTaskUIC) C39818r.f106831a.mo62444c(appCompatActivity).mo75002a(cls);
                    if (multiTaskUIC.mo90994b0()) {
                        multiTaskUIC.mo175717o3();
                    }
                }
                MultiTaskInfo multiTaskInfo = new MultiTaskInfo();
                multiTaskInfo.field_type = aVar.f193743b;
                String str = aVar.f193742a;
                multiTaskInfo.field_id = str;
                if (minusScreenPanel.f356646n.containsKey(str)) {
                    C8479f0 f0Var = new C8479f0();
                    T t = minusScreenPanel.f356646n.get(multiTaskInfo.field_id);
                    f0Var.f27484d = t;
                    C117997g gVar2 = (C117997g) t;
                    if (C87412m.m108589b((gVar2 == null || (rootView = gVar2.getRootView()) == null) ? null : rootView.getParent(), minusScreenPanel.f356642g)) {
                        C61926c.m72668M(new C16127a(f0Var));
                    }
                    if (!C87412m.m108589b(f0Var.f27484d, minusScreenPanel.f356644i) || minusScreenPanel.f356644i == null) {
                        C117997g gVar3 = (C117997g) f0Var.f27484d;
                        if (gVar3 != null) {
                            gVar3.mo62145g3();
                        }
                    } else {
                        minusScreenPanel.mo183765h();
                        minusScreenPanel.f356644i = null;
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Log.m105925i("MicroMsg.MultiTask.MinusScreenPanel", "HideMultiTaskEvent, hideUIComponent, id:%s", multiTaskInfo.field_id);
                }
            } else if (i == 1) {
                C39622i0 a = C39818r.f106831a.mo62444c(appCompatActivity).mo75002a(cls);
                C87412m.m108593f(a, "UICProvider.of(activity)…MultiTaskUIC::class.java)");
                MultiTaskUIC.m162482m3((MultiTaskUIC) a, false, false, true, true, false, false, false, false, 240, (Object) null);
                Log.m105924i("MicroMsg.MultiTask.MinusScreenPanel", "showHome");
            } else if (i == 2) {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_MULTITASK_LAST_SHOW_ID_AND_TIME_STRING_SYNC, "");
                Log.m105924i("MicroMsg.MultiTask.MinusScreenPanel", "reset show id");
            } else if (i == 3) {
                MultiTaskUIC multiTaskUIC2 = (MultiTaskUIC) C39818r.f106831a.mo62444c(appCompatActivity).mo75002a(cls);
                multiTaskUIC2.getClass();
                C110004g gVar4 = C110004g.f329189a;
                if (C110004g.f329190b == -1) {
                    C110004g.f329190b = MultiProcessMMKV.getMMKV("multitask_tips_config").getLong("multitask_panel_enter_drag_flag", 0);
                    Log.m105924i("MicroMsg.MultiTaskTipsHelper", "isMultiTaskPanelEnterDrag, flag: " + C110004g.f329190b);
                }
                if (C110004g.f329190b != 1) {
                    z2 = false;
                }
                if (z2) {
                    Log.m105924i("MicroMsg.MultiTask.MultiTaskUIC", "[enterTips]is already show, skip!, step 1");
                } else {
                    if (multiTaskUIC2.f346706o != null) {
                        LauncherUI instance = LauncherUI.getInstance();
                        if (instance != null ? instance.mo101378R7() : false) {
                            Log.m105924i("MicroMsg.MultiTask.MultiTaskUIC", "[enterTips]chatting is foreground, skip!, step 1");
                        }
                    }
                    if (2 == multiTaskUIC2.f346707p) {
                        Log.m105924i("MicroMsg.MultiTask.MultiTaskUIC", "[enterTips]is landscape mode, skip!, step 1");
                    }
                    long j = MultiProcessMMKV.getMMKV("multitask_tips_config").getLong("multitask_first_add_time", System.currentTimeMillis());
                    Log.m105924i("MicroMsg.MultiTaskTipsHelper", "setMultiTaskFirstAddTime, time: " + j);
                    if (!gVar4.mo161346a() || Math.abs(System.currentTimeMillis() - j) > 1800000) {
                        Log.m105924i("MicroMsg.MultiTask.MultiTaskUIC", "[enterTips] not show, skip!, step 1");
                        gVar4.mo161347b(false);
                    } else {
                        Runnable runnable = multiTaskUIC2.f346712u;
                        if (runnable != null) {
                            multiTaskUIC2.f346717z.removeCallbacks(runnable);
                            multiTaskUIC2.f346712u = null;
                        }
                        C112781l lVar = new C112781l(multiTaskUIC2);
                        multiTaskUIC2.f346712u = lVar;
                        multiTaskUIC2.f346717z.postDelayed(lVar, 500);
                    }
                }
            }
        }
        return false;
    }
}
