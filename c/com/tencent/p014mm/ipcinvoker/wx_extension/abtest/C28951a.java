package com.tencent.p014mm.ipcinvoker.wx_extension.abtest;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.model.newabtest.SubCoreNewABTest;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C96980c;
import f40.C86709a0;

/* renamed from: com.tencent.mm.ipcinvoker.wx_extension.abtest.a */
class C28951a implements C80916r<IPCString, Bundle> {
    private C28951a() {
    }

    public Object invoke(Object obj) {
        IPCString iPCString = (IPCString) obj;
        if (!C86709a0.m107528h().f251724a.f251792d || !C86709a0.m107523b().f251765p) {
            Log.m105920e("MicroMsg.IPCInvokeTask_GetABTestItem", "kernel or account not ready.");
            return null;
        }
        C96980c Lo = SubCoreNewABTest.wx0().mo57622Lo(iPCString.f10315d);
        Bundle bundle = new Bundle();
        bundle.putString("layerId", Lo.field_layerId);
        bundle.putString("business", Lo.field_business);
        bundle.putString("expId", Lo.field_expId);
        bundle.putString("rawXML", Lo.field_rawXML);
        bundle.putLong("startTime", Lo.field_startTime);
        bundle.putLong("endTime", Lo.field_endTime);
        bundle.putLong("sequence", Lo.field_sequence);
        bundle.putInt("prioritylevel", Lo.field_prioritylevel);
        bundle.putBoolean("needReport", Lo.field_needReport);
        return bundle;
    }
}
