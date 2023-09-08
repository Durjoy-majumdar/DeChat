package p621nn;

import com.tencent.p014mm.autogen.events.MsgSynchronizeABTestEvent;
import com.tencent.p014mm.model.newabtest.SubCoreNewABTest;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C96980c;
import java.util.Map;
import y72.C38972b;

/* renamed from: nn.c0 */
public class C34897c0 extends IStaticListener<MsgSynchronizeABTestEvent> {
    public boolean callback(IEvent iEvent) {
        MsgSynchronizeABTestEvent msgSynchronizeABTestEvent = (MsgSynchronizeABTestEvent) iEvent;
        if (msgSynchronizeABTestEvent != null) {
            Log.m105924i("MicroMsg.BackupCore", "receive MsgSynchronizeABTestEvent.");
            C96980c Lo = SubCoreNewABTest.wx0().mo57622Lo("100224");
            if (Lo.isValid()) {
                Map<String, String> l2 = Lo.mo135598l2();
                C38972b.f104996a = Util.getInt(l2.get("SyncOpen"), 0);
                C38972b.f104997b = Util.getInt(l2.get("WindowsVersion"), 1644429312);
                C38972b.f104998c = Util.getInt(l2.get("MacVersion"), 302122240);
                C38972b.f104999d = Util.getInt(l2.get("MsgSyncSessionCount"), 50);
                C38972b.f105000e = Util.getInt(l2.get("MsgSyncMsgCount"), 20);
                C38972b.f105001f = Util.getInt(l2.get("MsgSyncSessionListCount"), 100);
                C38972b.f105002g = Util.getInt(l2.get("MsgSyncTimeLimit"), 3);
                C38972b.f105003h = Util.getInt(l2.get("MsgSyncAfterSleepSwitch"), 1);
                C38972b.f105004i = Util.getInt(l2.get("MsgSyncGetMoreSwitch"), 1);
                C38972b.f105005j = Util.getInt(l2.get("MsgSyncGetMoreMaxMsgCount"), 1000);
            }
            Log.m105925i("MicroMsg.MsgSynchronizeConstants", "initMsgSynchronizeAbtest, SYNC_CLOSE:%d, WINDOWS_VERSION:%d, MAC_VERSION:%d, SESSION_COUNT:%d, MSG_COUNT%d, MSG_LIST_COUNT:%d, TIME_LIMIT:%d, AFTER_SLEEP_SWITCH:%d, GET_MORE_SWITCH:%d, GET_MORE_MAX_MSG_COUNT:%d", Integer.valueOf(C38972b.f104996a), Integer.valueOf(C38972b.f104997b), Integer.valueOf(C38972b.f104998c), Integer.valueOf(C38972b.f104999d), Integer.valueOf(C38972b.f105000e), Integer.valueOf(C38972b.f105001f), Integer.valueOf(C38972b.f105002g), Integer.valueOf(C38972b.f105003h), Integer.valueOf(C38972b.f105004i), Integer.valueOf(C38972b.f105005j));
            MsgSynchronizeABTestEvent.C1092a aVar = msgSynchronizeABTestEvent.f9327d;
            aVar.f9328a = C38972b.f104996a;
            aVar.f9329b = C38972b.f104997b;
            aVar.f9330c = C38972b.f104998c;
        }
        return false;
    }
}
