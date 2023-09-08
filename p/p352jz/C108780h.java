package p352jz;

import com.tencent.p014mm.autogen.events.FinderTeenModeChangeEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: jz.h */
public class C108780h extends IStaticListener<FinderTeenModeChangeEvent> {
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        r5 = (r5 = r5.getRunningTasks(1)).get(0).baseActivity;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r5) {
        /*
            r4 = this;
            com.tencent.mm.autogen.events.FinderTeenModeChangeEvent r5 = (com.tencent.p014mm.autogen.events.FinderTeenModeChangeEvent) r5
            com.tencent.mm.autogen.events.FinderTeenModeChangeEvent$a r5 = r5.f9255d
            r0 = 1
            r1 = 0
            if (r5 != 0) goto L_0x000a
            r0 = 0
            goto L_0x0061
        L_0x000a:
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = "activity"
            java.lang.Object r5 = r5.getSystemService(r2)
            android.app.ActivityManager r5 = (android.app.ActivityManager) r5
            if (r5 == 0) goto L_0x0040
            java.util.List r5 = r5.getRunningTasks(r0)
            if (r5 == 0) goto L_0x0040
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L_0x0040
            java.lang.Object r5 = r5.get(r1)
            android.app.ActivityManager$RunningTaskInfo r5 = (android.app.ActivityManager.RunningTaskInfo) r5
            android.content.ComponentName r5 = r5.baseActivity
            if (r5 == 0) goto L_0x0040
            java.lang.Class<com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeAffinityUI> r2 = com.tencent.p014mm.plugin.topstory.p113ui.home.TopStoryHomeAffinityUI.class
            java.lang.String r2 = r2.getName()
            java.lang.String r5 = r5.getClassName()
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x0040
            r5 = 1
            goto L_0x0041
        L_0x0040:
            r5 = 0
        L_0x0041:
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            r2[r1] = r3
            java.lang.String r1 = "MicroMsg.TopStoryTeenModeEvent"
            java.lang.String r3 = "FinderTeenModeChangeEvent: teen mode change， isTopStoryTaskForeground: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r2)
            if (r5 != 0) goto L_0x0061
            hc0.c r5 = t03.C22426h.f63540a
            com.tencent.mm.autogen.events.TopStoryEvent r5 = new com.tencent.mm.autogen.events.TopStoryEvent
            r5.<init>()
            com.tencent.mm.autogen.events.TopStoryEvent$a r1 = r5.f310012d
            r2 = 4
            r1.f310014a = r2
            r5.publish()
        L_0x0061:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p352jz.C108780h.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
