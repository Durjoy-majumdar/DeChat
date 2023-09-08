package lj0;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import java.util.LinkedList;
import java.util.List;

/* renamed from: lj0.a */
public final class C34285a implements MStorage.IOnStorageChange {
    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        C81161g2.requireAccountInitializedOnDemand();
        if (C81161g2.f238473i == null) {
            Log.m105928w("MicroMsg.AppBrandSearchStorageChangeListener", "onNotifyChange by SysConfigStorage, but sLayoutStorage is null.");
            return;
        }
        int i = mStorageEventData.eventId;
        if (i == 2 || i == 3) {
            LinkedList linkedList = new LinkedList();
            if (MStorageEventData.EventType.BATCH.equals(str)) {
                Object obj = mStorageEventData.obj;
                if (obj != null && (obj instanceof List)) {
                    for (String Ow : (List) obj) {
                        C81161g2.requireAccountInitializedOnDemand();
                        linkedList.addAll(C81161g2.f238473i.mo56639Ow(Ow));
                    }
                } else {
                    return;
                }
            } else {
                C81161g2.requireAccountInitializedOnDemand();
                linkedList.addAll(C81161g2.f238473i.mo56639Ow(mStorageEventData.obj.toString()));
            }
            if (!linkedList.isEmpty()) {
                C81161g2.requireAccountInitializedOnDemand();
                C81161g2.f238473i.doNotify(MStorageEventData.EventType.BATCH, 3, linkedList);
            }
        } else if (i == 5) {
            LinkedList linkedList2 = new LinkedList();
            if (MStorageEventData.EventType.BATCH.equals(str)) {
                Object obj2 = mStorageEventData.obj;
                if (obj2 != null && (obj2 instanceof List)) {
                    for (String Ow2 : (List) obj2) {
                        C81161g2.requireAccountInitializedOnDemand();
                        linkedList2.addAll(C81161g2.f238473i.mo56639Ow(Ow2));
                    }
                } else {
                    return;
                }
            } else {
                C81161g2.requireAccountInitializedOnDemand();
                linkedList2.addAll(C81161g2.f238473i.mo56639Ow(mStorageEventData.obj.toString()));
            }
            if (!linkedList2.isEmpty()) {
                C81161g2.requireAccountInitializedOnDemand();
                C81161g2.f238473i.doNotify(MStorageEventData.EventType.BATCH, 5, linkedList2);
            }
        }
    }
}
