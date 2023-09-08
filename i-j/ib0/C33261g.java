package ib0;

import com.tencent.p014mm.model.newabtest.C28984e;
import com.tencent.p014mm.model.newabtest.SubCoreNewABTest;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C30728d;
import com.tencent.p014mm.storage.d$$b;
import di3.C86312j;
import gy3.C87412m;

/* renamed from: ib0.g */
public class C33261g implements d$$b {
    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        if (C87412m.m108589b("event_updated", str)) {
            C30728d wx02 = SubCoreNewABTest.wx0();
            C87412m.m108593f(wx02, "getABTestStorage()");
            ((C28984e) C86312j.m106911c(C28984e.class)).wx0(wx02);
        }
    }
}
