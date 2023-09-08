package p784zw;

import ag3.C27902a;
import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import com.tencent.p014mm.autogen.events.RepairerActionEvent;
import com.tencent.p014mm.p136ui.MMAppMgr;
import com.tencent.p014mm.pluginsdk.platformtools.C85623c;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import gy3.C87412m;
import zo3.C16376b;

/* renamed from: zw.b */
public final class C39459b extends IStaticListener<RepairerActionEvent> {
    public boolean callback(IEvent iEvent) {
        RepairerActionEvent repairerActionEvent = (RepairerActionEvent) iEvent;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_LOCAL_UITOOL_ENABLE_INT_SYNC;
        C87412m.m108594g(repairerActionEvent, "event");
        if (C86709a0.m107522a()) {
            if (C87412m.m108589b(repairerActionEvent.f78918d.f78920b, "RepairerConfig_Global_DispatchPostSyncTaskEvent_Int")) {
                new PostSyncTaskEvent().publish();
            } else if (C87412m.m108589b(repairerActionEvent.f78918d.f78920b, "RepairerConfig_Global_KillMainProcess_Int")) {
                if (C85623c.f249568a != null) {
                    MMAppMgr.m85985e(MMApplicationContext.getContext(), true);
                }
            } else if (C87412m.m108589b(repairerActionEvent.f78918d.f78920b, new C27902a().mo86004j())) {
                String str = repairerActionEvent.f78918d.f78921c;
                try {
                    Class<?> cls = Class.forName("com.tencent.mm.uitool.UITool");
                    Object obj = cls.getDeclaredField("INSTANCE").get(cls);
                    if (C87412m.m108589b(str, "1")) {
                        cls.getDeclaredMethod("setEnabled", new Class[0]).invoke(obj, new Object[0]);
                        Log.printInfoStack("MicroMsg.UIToolCommon", "enable UIToolCommon", new Object[0]);
                        C16376b.f43775a = true;
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, 1);
                    } else {
                        cls.getDeclaredMethod("setDisabled", new Class[0]).invoke(obj, new Object[0]);
                        C16376b.f43775a = false;
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, 0);
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.Repairer.RepairerOldDataLogic", e, "fail to enable uitool", new Object[0]);
                }
            }
        }
        return false;
    }
}
